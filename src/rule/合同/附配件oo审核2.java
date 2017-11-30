package rule.合同;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.*;
import org.apache.log4j.Logger;

import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;

import jxl.Sheet;
import jxl.Workbook;

import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.basic.application.AttachmentResource;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 附配件oo审核2 extends RuleEngine{
	private static Logger logger = Logger.getLogger(附配件oo审核2.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzwenjiandr instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			// 得到上传的设备清单文件
			String fileName = instance.getDaoruwj();
			if(fileName == null) {
				returnMsg.set("NO", "请先选择导入文件！");
				return returnMsg;
			}
			String employeeName = (String) request.getSession().getAttribute(
					"employeeName"); // 操作人

			String fileNames[] = fileName.split("[*]");
			String realName = fileNames[1];
			// 得到导入的文件
			List<AttachmentResource> attachmentList = dataset.getList(
					"AttachmentResource", "fileName = '" + realName + "'");
			if(attachmentList != null && attachmentList.size() > 0) {
				AttachmentResource attachment = attachmentList.get(0);
				String filePath = attachment.getFilePath() + realName; // 拼出文件所在位置
				File file = new File(filePath);
				if(!file.exists()) {
					returnMsg.set("NO", "未传入附件请检查！");
					return returnMsg;
				}
				if(!"xls".equals(attachment.getFileType())) {
					if(file.exists()) {
						file.delete();
					}
					returnMsg.set("NO", "传入的附件类型错误!");
					return returnMsg;
				}
				InputStream is = null;
				Workbook workbook = null;
				try {
					// 获取输入流（通过文件）
					is = new FileInputStream(file);
					// 获取工作簿
					workbook = Workbook.getWorkbook(is);
					// 获取工作表
					Sheet sheet = workbook.getSheets()[0];
					int rows = sheet.getRows();
					Object obj = request.getSession().getAttribute("employeeName");

					boolean ccflag = false;// 出错标记
					StringBuffer ccts = new StringBuffer("上传文件错误提示：<br>"); // 错误提示信息

					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

					if(rows > 1) {
						for(int i = 1; i < rows; i++) {
							String fahuotzdbhStr = sheet.getCell(0, i) == null ? "" : sheet
									.getCell(0, i).getContents().trim(); // 发货通知单编号
							String hetongbhStr = sheet.getCell(1, i) == null ? "" : sheet
									.getCell(1, i).getContents().trim(); // 合同编号
							String hetongmcStr = sheet.getCell(2, i) == null ? "" : sheet
									.getCell(2, i).getContents().trim(); // 合同名称
							String wuliaoStr = sheet.getCell(3, i) == null ? "" : sheet
									.getCell(3, i).getContents().trim(); // 物料号
							String wuliaomsStr = sheet.getCell(4, i) == null ? "" : sheet
									.getCell(4, i).getContents().trim(); // 物料描述
							String danweiStr = sheet.getCell(5, i) == null ? "" : sheet
									.getCell(5, i).getContents().trim(); // 单位
							String fahuoslStr = sheet.getCell(6, i) == null ? "" : sheet
									.getCell(6, i).getContents().trim(); // 发货数量
							String snStr = sheet.getCell(7, i) == null ? "" : sheet
									.getCell(7, i).getContents().trim(); // sn
							String fahuosjStr = sheet.getCell(8, i) == null ? "" : sheet
									.getCell(8, i).getContents().trim(); // 发货时间
							String beizhuStr = sheet.getCell(9, i) == null ? "" : sheet
									.getCell(9, i).getContents().trim(); // 备注
							Date d = null;

							if("".equals(fahuotzdbhStr)) {
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, 发货通知单编号为空;<br>");
							}

							if("".equals(wuliaoStr)) {
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, 物料号为空;<br>");
							}
							if("".equals(fahuoslStr)) {
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, 发货数量为空;<br>");
							}
							if("".equals(snStr)) {
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, SN号为空;<br>");

							}
							if(!"".equals(fahuoslStr)) {
								try {
									Double.parseDouble(fahuoslStr);
								} catch (Exception e) {
									ccflag = true;
									ccts.append("第").append(i + 1).append("行, 发货数量不是数值类型;<br>");
								}
							}
							if(!"".equals(fahuosjStr)) {
								try {
									d = df.parse(fahuosjStr);
								} catch (Exception e) {
									ccflag = true;
									d = null;
									ccts.append("第").append(i + 1).append("行, 发货时间格式错误;<br>");
								}
							}
							if(!"".equals(fahuotzdbhStr)) {
								// 查找出入库计划单，找不到报错，提示找不到，检查发货通知单是否正确
								List<Atzchurukjhd> jhdList1 = dataset
										.getListByHql(
												"Atzchurukjhd",
												"from Atzchurukjhd where zhixingf='1' and (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
														+ fahuotzdbhStr.trim()
														+ "') or weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
														+ fahuotzdbhStr.trim() + "')) ");
								if(jhdList1 == null || jhdList1.size() <= 0) {
									ccflag = true;
									ccts.append("第").append(i + 1)
											.append("行, 根据发货通知单或维保申请单查找入库计划失败，请检查数据;<br>");
								} else {
									Atzchurukd churukd = null;
									// 产生出库单

									List<Atzchurukd> churukdList = dataset
											.getListByHql(
													"Atzchurukd",
													" from Atzchurukd where zhixingf='1' and danjulx='2' and churukjhdid in (select id from Atzchurukjhd where zhixingf='1' and (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
															+ fahuotzdbhStr.trim()
															+ "') or weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
															+ fahuotzdbhStr.trim() + "')) )");
									if(churukdList != null && churukdList.size() > 0) {
										churukd = churukdList.get(0);
									} else {
										logger.debug("产生出库单");
										String message = null;
										churukd = new Atzchurukd();
										paramMap.put("danjulx", "16"); // 设置编码规则
										String ckdbianhao = execAdjustmentRule("A-生成正式编码规则-05",
												null, context, dataset, request, paramMap);

										List<Atzchurukjhd> jhdList = dataset
												.getListByHql(
														"Atzchurukjhd",
														" from Atzchurukjhd where zhixingf='1' and danjulx='2' and (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
																+ fahuotzdbhStr.trim()
																+ "') or weibaosqdid in(select id from Atzweibaosbsqd where bianhao='"
																+ fahuotzdbhStr.trim() + "'))");
										if(ckdbianhao.equals("流水号溢出"))
											message = "出库单流水号溢出！";
										else if("Error".equals(ckdbianhao))
											message = "生成出库单编号有误, 请联系系统管理员！";

										if(message != null) {
											returnMsg.set("NO", message);

											return returnMsg;
										}
										if(jhdList != null && jhdList.size() > 0) {
											logger.debug("找到出库计划单");
											Atzchurukjhd jhd = jhdList.get(0);
											churukd.setChurukjhdid(jhd.getId());
											churukd.setXiangmuid(jhd.getXiangmuid());
											churukd.setRenwuzt(jhd.getRenwuzt());
											churukd.setChurukyy(jhd.getChurukyy());
											churukd.setChurukr(employeeName); // 出库人
											churukd.setChurukrq(d); // 出库日期
											churukd.setZhixingf("1");

										}
										churukd.setBianhao(ckdbianhao); // 出库单编号
										churukd.setDanjulx("2"); // 出入库单类型: 出库
										churukd.setShifouzx("1"); // 是否执行: 是
										dataset.add(churukd);
									}

									String hqlqd = "from Atzchurukjhdmx where atzchurukjhdid in (select id from Atzchurukjhd where ";
									hqlqd = hqlqd + " danjulx ='2' and zhixingf='1' ";
									double fahuosl = Double.parseDouble(fahuoslStr);
									Atzwuliaojcxx wuliao = (Atzwuliaojcxx) dataset
											.getObjectByHql("Atzwuliaojcxx",
													" from Atzwuliaojcxx where  wuliaosjxz='0' and wuliaobm='"
															+ wuliaoStr.trim() + "'");
									if(wuliao == null) {
										ccflag = true;
										ccts.append("第").append(i + 1)
												.append("行, 物料号找不到对应的物料数据;<br>");
										continue;
									}
									// 发货通知单,维保单优先查看是否有相同物料
									logger
											.debug(hqlqd
													+ " and   (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
													+ fahuotzdbhStr.trim()
													+ "') or weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
													+ fahuotzdbhStr.trim()
													+ "')))"
													+ " and wuliaoid in ( select id from Atzwuliaojcxx where wuliaobm='"
													+ wuliaoStr.trim() + "')");

									List<Atzchurukjhdmx> htfhwuliaoyyList = dataset
											.getListByHql(
													"Atzchurukjhdmx",
													hqlqd
															+ " and   (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
															+ fahuotzdbhStr.trim()
															+ "') or weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
															+ fahuotzdbhStr.trim()
															+ "')))"
															+ " and wuliaoid in ( select id from Atzwuliaojcxx where wuliaobm='"
															+ wuliaoStr.trim() + "')");
									logger.debug("htfhwuliaoyyList===" + htfhwuliaoyyList.size());
									if(htfhwuliaoyyList != null && htfhwuliaoyyList.size() > 0) {
										for(Atzchurukjhdmx mx : htfhwuliaoyyList) {
											logger.debug("产生出库明细！");
											double zhizaowzxl = mx.getZhizaowzxl();
											// 出库明细
											Atzchurukdmx ckdmx = new Atzchurukdmx();// 产生的出库明细
											ckdmx.setWuliaoid(wuliao.getId()); // 物料ID
											ckdmx.setLururq(d); // 录入日期
											ckdmx.setSn(snStr);

											ckdmx.setMeidwsl(null);
											ckdmx.setAtzchurukdid(churukd.getId());
											dataset.add(ckdmx);
											// 出库流水
											Atzchurukls rkls = new Atzchurukls();

											rkls.setChurukjhdid(churukd.getChurukjhdid());
											; // 出库计划ID
											rkls.setChurukdid(churukd.getId()); // 出库单ID
											rkls.setChurukdmxid(ckdmx.getId()); // 出库单明细ID
											rkls.setChuruklx("2"); // 出入库类型: 出库
											rkls.setChurukyy(churukd.getChurukyy()); // 出入库原因:
											rkls.setXiangmuid(churukd.getXiangmuid()); // 调入项目ID
											rkls.setWuliaoid(wuliao.getId()); // 物料ID
											rkls.setZhixingf("1");
											rkls.setMeidwsl(null); // 每单位数量

											rkls.setChurukr(employeeName); // 经办人
											rkls.setRiqi(d); // 日期
											// rkls.setCunfangwz(ptdrkucun.getCunfangwz()); // 存放位置
											rkls.setSn(snStr);
											dataset.add(rkls);

											if(Double.compare(fahuosl, zhizaowzxl) > 0
													&& zhizaowzxl != 0d) {

												// 产生出库明细以及流水
												ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
												ckdmx.setBencijhsl(mx.getZhizaowzxl()); // 计划数量
												ckdmx.setShuliang(mx.getZhizaowzxl()); // 实发数量
												rkls.setKuweiid(mx.getKuweiid());// 库位ID
												rkls.setBencijhsl(mx.getZhizaowzxl()); // 计划数量
												rkls.setShuliang(mx.getZhizaowzxl()); // 数量

												mx.setZhizaowzxl(0d);
												fahuosl = new BigDecimal(fahuosl).subtract(
														new BigDecimal(zhizaowzxl)).doubleValue();

											} else if(Double.compare(fahuosl, zhizaowzxl) <= 0) {
												// 产生出库明细以及流水
												ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
												ckdmx.setBencijhsl(fahuosl); // 计划数量
												ckdmx.setShuliang(fahuosl); // 实发数量
												rkls.setKuweiid(mx.getKuweiid());// 库位ID
												rkls.setBencijhsl(fahuosl); // 计划数量
												rkls.setShuliang(fahuosl); // 数量

												mx.setZhizaowzxl(new BigDecimal(zhizaowzxl).subtract(
														new BigDecimal(fahuosl)).doubleValue());
												fahuosl = 0d;
												break;
											}

										}
									}
									// 若发货数量大于0，则查看是否存在相同的销售编码对应的数据;
									if(Double.compare(fahuosl, 0d) > 0) {
										List<Atzchurukjhdmx> htfhwuliaoxsbmList = dataset
												.getListByHql(
														"Atzchurukjhdmx",
														hqlqd
																+ " and   (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
																+ fahuotzdbhStr.trim()
																+ "') or weibaosqdid in (select id from Atzweibaosbsqd where bianhao='"
																+ fahuotzdbhStr.trim()
																+ "') ))"
																+ " and wuliaoid in ( select id from Atzwuliaojcxx where xiaoshoubmid ="
																+ wuliao.getXiaoshoubmid() + ")");
										if(htfhwuliaoxsbmList != null
												&& htfhwuliaoxsbmList.size() > 0) {
											for(Atzchurukjhdmx mx : htfhwuliaoxsbmList) {
												Double zhizaowzxl = mx.getZhizaowzxl();
												Atzchurukdmx ckdmx = new Atzchurukdmx();// 产生的出库明细
												ckdmx.setWuliaoid(wuliao.getId()); // 物料ID
												ckdmx.setLururq(d); // 录入日期
												ckdmx.setSn(snStr);
												ckdmx.setMeidwsl(null);
												ckdmx.setAtzchurukdid(churukd.getId());
												dataset.add(ckdmx);
												// 出库流水
												Atzchurukls rkls = new Atzchurukls();

												rkls.setChurukjhdid(churukd.getChurukjhdid());
												; // 出库计划ID
												rkls.setChurukdid(churukd.getId()); // 出库单ID
												rkls.setChurukdmxid(ckdmx.getId()); // 出库单明细ID
												rkls.setChuruklx("2"); // 出入库类型: 出库
												rkls.setZhixingf("1");
												rkls.setChurukyy(churukd.getChurukyy()); // 出入库原因:
												rkls.setXiangmuid(churukd.getXiangmuid()); // 调入项目ID
												rkls.setWuliaoid(wuliao.getId()); // 物料ID

												rkls.setMeidwsl(null); // 每单位数量

												rkls.setChurukr(employeeName); // 经办人
												rkls.setRiqi(d); // 日期
												// rkls.setCunfangwz(ptdrkucun.getCunfangwz()); // 存放位置
												rkls.setSn(snStr);
												dataset.add(rkls);

												if(Double.compare(fahuosl, zhizaowzxl) > 0
														&& zhizaowzxl != 0d) {
													ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
													ckdmx.setBencijhsl(mx.getZhizaowzxl()); // 计划数量
													ckdmx.setShuliang(mx.getZhizaowzxl()); // 实发数量
													rkls.setKuweiid(mx.getKuweiid());// 库位ID
													rkls.setBencijhsl(mx.getZhizaowzxl()); // 计划数量
													rkls.setShuliang(mx.getZhizaowzxl()); // 数量
													mx.setZhizaowzxl(0d);
													fahuosl = new BigDecimal(fahuosl).subtract(
															new BigDecimal(zhizaowzxl)).doubleValue();

												} else if(Double.compare(fahuosl, zhizaowzxl) <= 0) {
													// 产生出库明细以及流水
													ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
													ckdmx.setBencijhsl(fahuosl); // 计划数量
													ckdmx.setShuliang(fahuosl); // 实发数量
													rkls.setKuweiid(mx.getKuweiid());// 库位ID
													rkls.setBencijhsl(fahuosl); // 计划数量
													rkls.setShuliang(fahuosl); // 数量
													mx.setZhizaowzxl(new BigDecimal(zhizaowzxl).subtract(
															new BigDecimal(fahuosl)).doubleValue());
													fahuosl = 0d;
													break;
												}

											}
										}

									}

									// 若发货数量维护后数量还是大于0，A类物料则提示出错信息，其他类物料则先找相同物料继续扣减发货数量，其次随机找一条销售编码相同的物料进行维护
									if(Double.compare(fahuosl, 0d) > 0) {

										if("A".equals(wuliao.getAbcfl())) {
											ccflag = true;
											ccts.append("第").append(i + 1)
													.append("行, A类物料号" + wuliaoStr + "数量大于计划量;<br>");

										} else {

											List<Atzchurukjhdmx> syhtfhwuliaoyyList = dataset
													.getListByHql(
															"Atzchurukjhdmx",
															hqlqd
																	+ " and   (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
																	+ fahuotzdbhStr.trim()
																	+ "') or weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
																	+ fahuotzdbhStr.trim()
																	+ "')))"
																	+ " and wuliaoid in ( select id from Atzwuliaojcxx where wuliaobm='"
																	+ wuliaoStr.trim() + "')");
											if(syhtfhwuliaoyyList != null
													&& syhtfhwuliaoyyList.size() > 0) {
												Atzchurukjhdmx mx = syhtfhwuliaoyyList.get(0);
												Atzchurukdmx ckdmx = new Atzchurukdmx();// 产生的出库明细
												ckdmx.setWuliaoid(wuliao.getId()); // 物料ID
												ckdmx.setLururq(d); // 录入日期
												ckdmx.setSn(snStr);
												ckdmx.setMeidwsl(null);
												ckdmx.setAtzchurukdid(churukd.getId());
												ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
												ckdmx.setBencijhsl(fahuosl); // 计划数量
												ckdmx.setShuliang(fahuosl); // 实发数量
												dataset.add(ckdmx);

												// 产生出入库流水
												Atzchurukls rkls = new Atzchurukls();

												rkls.setChurukjhdid(churukd.getChurukjhdid());
												; // 出库计划ID
												rkls.setChurukdid(churukd.getId()); // 出库单ID
												rkls.setChurukdmxid(ckdmx.getId()); // 出库单明细ID
												rkls.setChuruklx("2"); // 出入库类型: 入库
												rkls.setZhixingf("1");
												rkls.setChurukyy(churukd.getChurukyy()); // 出入库原因:
												rkls.setXiangmuid(churukd.getXiangmuid()); // 调入项目ID
												rkls.setWuliaoid(wuliao.getId()); // 物料ID

												rkls.setMeidwsl(null); // 每单位数量

												rkls.setChurukr(employeeName); // 经办人
												rkls.setRiqi(d); // 日期
												// rkls.setCunfangwz(ptdrkucun.getCunfangwz()); // 存放位置
												rkls.setSn(snStr);
												rkls.setKuweiid(mx.getKuweiid());// 库位ID
												rkls.setBencijhsl(fahuosl); // 计划数量
												rkls.setShuliang(fahuosl); // 数量
												dataset.add(rkls);
												//
												mx.setZhizaowzxl(new BigDecimal(mx.getZhizaowzxl())
														.subtract(new BigDecimal(fahuosl)).doubleValue());
												fahuosl = 0d;
											}
											if(Double.compare(fahuosl, 0d) > 0) {
												List<Atzchurukjhdmx> syhtfhwuliaoxsbmList = dataset
														.getListByHql(
																"Atzchurukjhdmx",
																hqlqd
																		+ " and   (fahuotzdid in (select id from Atzfahuotzd where bianhao='"
																		+ fahuotzdbhStr.trim()
																		+ "') or weibaosqdid in (select id from Atzweibaosbsqd where bianhao='"
																		+ fahuotzdbhStr.trim()
																		+ "') ))"
																		+ " and wuliaoid in ( select id from Atzwuliaojcxx where xiaoshoubmid ="
																		+ wuliao.getXiaoshoubmid() + ")");
												if(syhtfhwuliaoxsbmList != null
														&& syhtfhwuliaoxsbmList.size() > 0) {
													Atzchurukjhdmx mx = syhtfhwuliaoxsbmList.get(0);
													Atzchurukdmx ckdmx = new Atzchurukdmx();// 产生的出库明细
													ckdmx.setWuliaoid(wuliao.getId()); // 物料ID
													ckdmx.setLururq(d); // 录入日期
													ckdmx.setSn(snStr);
													ckdmx.setMeidwsl(null);
													ckdmx.setAtzchurukdid(churukd.getId());
													ckdmx.setKuweiid(mx.getKuweiid()); // 库位ID
													ckdmx.setBencijhsl(fahuosl); // 计划数量
													ckdmx.setShuliang(fahuosl); // 实发数量
													dataset.add(ckdmx);

													// 产生出入库流水
													Atzchurukls rkls = new Atzchurukls();

													rkls.setChurukjhdid(churukd.getChurukjhdid());
													; // 出库计划ID
													rkls.setChurukdid(churukd.getId()); // 出库单ID
													rkls.setChurukdmxid(ckdmx.getId()); // 出库单明细ID
													rkls.setChuruklx("2"); // 出入库类型: 入库
													rkls.setZhixingf("1");
													rkls.setChurukyy(churukd.getChurukyy()); // 出入库原因:
													rkls.setXiangmuid(churukd.getXiangmuid()); // 调入项目ID
													rkls.setWuliaoid(wuliao.getId()); // 物料ID

													rkls.setMeidwsl(null); // 每单位数量

													rkls.setChurukr(employeeName); // 经办人
													rkls.setRiqi(d); // 日期
													// rkls.setCunfangwz(ptdrkucun.getCunfangwz()); //
													// 存放位置
													rkls.setSn(snStr);
													rkls.setKuweiid(mx.getKuweiid());// 库位ID
													rkls.setBencijhsl(fahuosl); // 计划数量
													rkls.setShuliang(fahuosl); // 数量
													dataset.add(rkls);
													mx.setZhizaowzxl(new BigDecimal(mx.getZhizaowzxl())
															.subtract(new BigDecimal(fahuosl)).doubleValue());
													fahuosl = 0d;
												}
											}

										}

									}
									if(Double.compare(fahuosl, 0d) > 0) {
										ccflag = true;
										ccts.append("第").append(i + 1)
												.append("行, 找不到对应的物料编码或者相同销售编码的物料编码;<br>");

									}
									// 若为sn不为空，在设备信息中增加一条数据，状态为:仓库中
									if(snStr != null && !"".equals(snStr)) {
										Atzshebeixx sbxx = (Atzshebeixx) dataset.getObjectByHql(
												"Atzshebeixx", "from Atzshebeixx where sn ='" + snStr
														+ "'");
										if(sbxx != null) {
											sbxx.setShifouzk("1");
											dataset.update(sbxx);
										} else {
											sbxx = new Atzshebeixx();
											sbxx.setWuliaoid(wuliao.getId());
											sbxx.setSn(snStr);
											sbxx.setLurur((String) request.getSession().getAttribute(
													"employeeName"));
											sbxx.setLururq(new Date());
											sbxx.setShifouzk("1");
											// sbxx.setBeizhu("制造导入");
											dataset.add(sbxx);
										}
									}
								}
							}

						}
						if(ccflag) {
							returnMsg.set("NO", ccts.toString());
							logger.debug(ccts.toString());
							return returnMsg;
						}
						returnMsg.set("OK", "导入成功！");
						return returnMsg;
					}

				} catch (Exception e) {
					logger.error("导入数据错误：", e);
					if(file.exists()) {
						file.delete();
					}
					returnMsg.set("NO", "系统错误，请与管理员联系！");
					return returnMsg;
				} finally {
					// 关闭工作薄
					if(workbook != null) {
						workbook.close();
					}
					// 关闭输入流
					if(is != null) {
						is.close();
					}
					// 删除缓存文件
					if(file.exists()) {
						file.delete();
					}
				}
			}

			// ###################################################################################################

			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}