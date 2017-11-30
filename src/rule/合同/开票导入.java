package rule.合同;

import java.text.DateFormat;
import java.text.ParseException;
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

@SuppressWarnings("all")
public class 开票导入 extends RuleEngine{
	private static Logger logger = Logger.getLogger(开票导入.class);
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
			// 得到上传文件
			String fileName = instance.getDaoruwj();
			if(fileName == null) {
				returnMsg.set("NO", "请选择需上传的文件！");
				return returnMsg;
			}
			String fileNames[] = fileName.split("[*]");
			String realName = fileNames[1];
			// 得到导入的文件
			List<AttachmentResource> attachmentList = dataset.getList(
					"AttachmentResource", "fileName = '" + realName + "'");
			if(attachmentList == null || attachmentList.size() <= 0) {
				returnMsg.set("NO", "文件上传失败！");
				return returnMsg;
			}
			AttachmentResource attachment = attachmentList.get(0);
			File file = new File(attachment.getFilePath() + realName);
			if(!file.exists()) {
				returnMsg.set("NO", "文件上传失败！");
				return returnMsg;
			}
			if(!"xls".equals(attachment.getFileType())) {
				file.delete();
				returnMsg.set("NO", "上传的文件必须是03版的excel文件！");
				return returnMsg;
			}
			InputStream is = null;
			Workbook workbook = null;
			
			DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
			df1.setLenient(false);
			java.util.regex.Pattern pat1 = java.util.regex.Pattern
					.compile("([\\d]{1,2}/[\\d]{1,2}/[\\d]{4})");
			
			DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
			df2.setLenient(false);
			java.util.regex.Pattern pat2 = java.util.regex.Pattern
					.compile("([\\d]{1,2}\\-[\\d]{1,2}\\-[\\d]{4})");
			
			DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
			df3.setLenient(false);
			java.util.regex.Pattern pat3 = java.util.regex.Pattern
					.compile("([\\d]{4}/[\\d]{1,2}/[\\d]{1,2})");
			
			DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd");
			df4.setLenient(false);
			java.util.regex.Pattern pat4 = java.util.regex.Pattern
					.compile("([\\d]{4}\\-[\\d]{1,2}\\-[\\d]{1,2})");
			Atzhetong hetong = null;
			Atzkaipiaosqd kaipiaosqd = null;
			String kprqStr = null;
			String fphm = null;
			String kptt = null;
			String fkmc = null;
			String ggxh = null;
			String danw = null;
			String slStr = null;
			String djStr = null;
			String jeStr = null;
			String beizhu = null;
			String xssr = null;
			String sfxssr = null;
			String rqStr = null;
			Double shul = 0d;
			Double dj = 0d;
			Double je = 0d;
			Date kpdate = null;
			Date srDate = null;
			Double shuil = null;
			Double huil = null;
			String hetongh = null;
			String piaojulxStr = null;
			String shuilvStr = null;
			String waibizl = null;
			String huilvStr = null;
			String beiz = null;
			String piaojulx = null;
			Atzbizhong biz = null;
			Double zje = 0d;
			Double zwbje = 0d;
			
			Double bhsdj = 0d;
			Double bhsje = 0d;
			Double bhswbdj = 0d;
			Double bhswbje = 0d;
			Double hswbdj = 0d;
			Double hswbje = 0d;
			double tmpd = 0d;
			
			List<Atzkaipiaomx> kpmxs = null;
			boolean ccflag = false;// 出错标记
			StringBuffer ccts = new StringBuffer("上传文件错误提示：<br>"); // 错误提示信息
			Object obj = request.getSession().getAttribute("employeeName");
			String str11 = obj == null ? "admin" : String.valueOf(obj);
			try {
				// 获取输入流（通过文件）
				is = new FileInputStream(file);
				// 获取工作簿
				workbook = Workbook.getWorkbook(is);
				// 获取工作表
				Sheet sheet = workbook.getSheets()[0];
				int rows = sheet.getRows();
				// 表头信息
				hetongh = sheet.getCell(1, 1) == null ? "" : sheet.getCell(1, 1)
						.getContents().trim();
				piaojulxStr = sheet.getCell(3, 1) == null ? "" : sheet.getCell(3, 1)
						.getContents().trim();
				shuilvStr = sheet.getCell(5, 1) == null ? "" : sheet.getCell(5, 1)
						.getContents().trim();
				waibizl = sheet.getCell(1, 2) == null ? "" : sheet.getCell(1, 2)
						.getContents().trim();
				huilvStr = sheet.getCell(3, 2) == null ? "" : sheet.getCell(3, 2)
						.getContents().trim();
				beiz = sheet.getCell(1, 3) == null ? "" : sheet.getCell(1, 3)
						.getContents().trim();
				if("".equals(hetongh)) {
					returnMsg.set("NO", "合同编号不能为空，请检查");
					return returnMsg;
				}
				hetong = (Atzhetong) dataset.getObjectByHql("Atzhetong",
						"from Atzhetong where hetongbh='" + hetongh + "'");
				if(hetong == null) {
					returnMsg.set("NO", "合同编号对应的合同信息不存在，请检查");
					return returnMsg;
				}
				
				if("".equals(piaojulxStr)) {
					returnMsg.set("NO", "票据类型不能为空，请检查");
					return returnMsg;
				} else {
					if("服务发票".equals(piaojulxStr)) {
						piaojulx = "3";
					} else if("增值税专用发票".equals(piaojulxStr)) {
						piaojulx = "1";
					} else if("增值税普通发票".equals(piaojulxStr)) {
						piaojulx = "2";
					} else {
						returnMsg.set("NO", "票据类型必须是“服务发票”、“增值税专用发票”、“增值税普通发票”中一种，请检查");
						return returnMsg;
					}
				}
				
				if(!"".equals(shuilvStr)) {
					try {
						shuil = Double.parseDouble(shuilvStr);
					} catch (Exception e) {
						returnMsg.set("NO", "税率必须是数值，请检查");
						return returnMsg;
					}
				}
				
				if(!"".equals(waibizl)) {
					biz = (Atzbizhong) dataset.getObjectByHql("Atzbizhong",
							"from Atzbizhong where bizhongmc='" + waibizl + "'");
					if(biz == null) {
						returnMsg.set("NO", "币种信息在系统中不存在，请检查");
						return returnMsg;
					}
				}
				
				if(!"".equals(huilvStr)) {
					try {
						huil = Double.parseDouble(huilvStr);
					} catch (Exception e) {
						returnMsg.set("NO", "汇率必须是数值，请检查");
						return returnMsg;
					}
				}
				
				kpmxs = new ArrayList<Atzkaipiaomx>();
				for(int i = 5; i < rows; i++) {
					kprqStr = sheet.getCell(0, i) == null ? "" : sheet.getCell(0, i)
							.getContents().trim(); // 开票日期
					fphm = sheet.getCell(1, i) == null ? "" : sheet.getCell(1, i)
							.getContents().trim(); // 发票号码
					kptt = sheet.getCell(2, i) == null ? "" : sheet.getCell(2, i)
							.getContents().trim(); // 开票抬头
					fkmc = sheet.getCell(3, i) == null ? "" : sheet.getCell(3, i)
							.getContents().trim(); // 付款名称
					ggxh = sheet.getCell(4, i) == null ? "" : sheet.getCell(4, i)
							.getContents().trim(); // 规格型号
					danw = sheet.getCell(5, i) == null ? "" : sheet.getCell(5, i)
							.getContents().trim(); // 单位
					slStr = sheet.getCell(6, i) == null ? "" : sheet.getCell(6, i)
							.getContents().trim(); // 数量
					djStr = sheet.getCell(7, i) == null ? "" : sheet.getCell(7, i)
							.getContents().trim(); // 单价
					jeStr = sheet.getCell(8, i) == null ? "" : sheet.getCell(8, i)
							.getContents().trim(); // 合计金额
					beizhu = sheet.getCell(9, i) == null ? "" : sheet.getCell(9, i)
							.getContents().trim(); // 备注
					xssr = sheet.getCell(10, i) == null ? "" : sheet.getCell(10, i)
							.getContents().trim(); // 销售收入
					rqStr = sheet.getCell(11, i) == null ? "" : sheet.getCell(11, i)
							.getContents().trim(); // 收入日期
					
					if("".equals(kprqStr)) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 开票日期为空;<br>");
					} else {
						try {
							if(pat1.matcher(kprqStr).find()) {
								kpdate = df1.parse(kprqStr);
							} else if(pat2.matcher(kprqStr).find()) {
								kpdate = df2.parse(kprqStr);
							} else if(pat3.matcher(kprqStr).find()) {
								kpdate = df3.parse(kprqStr);
							} else if(pat4.matcher(kprqStr).find()) {
								kpdate = df4.parse(kprqStr);
							} else {
								ccflag = true;
								ccts.append("第");
								ccts.append(i + 1);
								ccts.append("行,开票日期格式错误；");
							}
						} catch (ParseException pe) {
							ccflag = true;
							ccts.append("第");
							ccts.append(i + 1);
							ccts.append("行,开票日期格式错误；");
						}
					}
					
					if("".equals(fphm)) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 发票号码为空;<br>");
					}
					
					if(!"".equals(slStr)) {
						try {
							shul = Double.parseDouble(slStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 数量必须是数值;<br>");
						}
					}
					
					if("".equals(djStr)) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 含税单价为空;<br>");
					} else {
						try {
							dj = Double.parseDouble(djStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 含税单价必须是数值;<br>");
						}
					}
					
					if("".equals(jeStr)) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 含税合计金额为空;<br>");
					} else {
						try {
							je = Double.parseDouble(jeStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 含税合计金额必须是数值;<br>");
						}
					}
					
					if("".equals(xssr)) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 是否确认销售收入为空;<br>");
					} else {
						if("是".equals(xssr)) {
							sfxssr = "1";
							if("".equals(rqStr)) {
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, 确认销售收入时间为空;<br>");
							} else {
								try {
									if(pat1.matcher(rqStr).find()) {
										srDate = df1.parse(rqStr);
									} else if(pat2.matcher(rqStr).find()) {
										srDate = df2.parse(rqStr);
									} else if(pat3.matcher(rqStr).find()) {
										srDate = df3.parse(rqStr);
									} else if(pat4.matcher(rqStr).find()) {
										srDate = df4.parse(rqStr);
									} else {
										ccflag = true;
										ccts.append("第");
										ccts.append(i + 1);
										ccts.append("行,确认销售收入时间格式错误；");
									}
								} catch (ParseException pe) {
									ccflag = true;
									ccts.append("第");
									ccts.append(i + 1);
									ccts.append("行,确认销售收入时间格式错误；");
								}
							}
						} else if("否".equals(xssr)) {
							sfxssr = "2";
						} else {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 是否确认销售必须是“是”或“否”;<br>");
						}
					}
					
					if(!ccflag) {
						zje = a.add(zje, je);
						Atzkaipiaomx kpmx = new Atzkaipiaomx();
						kpmx.setKaipiaorq(kpdate);
						kpmx.setFapiaohm(fphm);
						kpmx.setKaipiaonr(kptt);
						kpmx.setFukuanmc(fkmc);
						kpmx.setGuigexh(ggxh);
						kpmx.setDanwei(danw);
						kpmx.setShuliang(shul);
						kpmx.setHanshuidj(dj);
						kpmx.setHanshuihjje(je);
						// TODO 计算不含税，外币相关金额
						if(shuil != null && shuil > 0) {
							tmpd = 1 + shuil.doubleValue();
							bhsdj = a.div(dj, tmpd, 2);
							kpmx.setBuhsdj(bhsdj);
							bhsje = a.div(je, tmpd, 2);
							kpmx.setBuhshjje(bhsje);
						}
						if(huil != null && huil > 0) {
							hswbdj = a.div(dj, huil, 2);
							hswbje = a.div(je, huil, 2);
							zwbje = a.add(zwbje, hswbje);
							kpmx.setHanshuiwbdj(hswbdj);
							kpmx.setHanshjwbje(hswbje);
						}
						
						if(shuil != null && shuil > 0 && huil != null && huil > 0) {
							bhswbdj = a.div(bhsdj, huil, 2);
							bhswbje = a.div(bhsje, huil, 2);
							kpmx.setBuhswbdj(bhswbdj);
							kpmx.setBuhshjwbje(bhswbje);
						}
						
						kpmx.setZhubei(beiz);
						kpmx.setShifouqrxssr(sfxssr);
						kpmx.setQuerenxssrsj(srDate);
						kpmxs.add(kpmx);
					}
				}
				
			} catch (Exception e) {
				logger.error("导入数据错误：", e);
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
			
			if(!ccflag) {
				if(kpmxs.size() > 0) {
					paramMap.put("danjulx", "24");
					String rValue = execAdjustmentRule("A-生成编码规则-05", null, context,
							dataset, request, paramMap);
					if(rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
						returnMsg.set("NO", "开票信息编码规则未设置或流水号溢出，请联系系统管理员！");
						return returnMsg;
					} else if("Error".equals(rValue)) {
						return "ERROR";
					} else {
						Atzkehu kehu = null;
						try {
							kehu = (Atzkehu) dataset.getObject(Atzkehu.class,
									hetong.getKehuid());
						} catch (Exception e) {
							returnMsg.set("NO", "系统异常(客户),请联系系统管理员！");
							return returnMsg;
						}
						
						// 客户银行帐号
						Atzkhyinhangzh khyinhangzh = null;
						if(kehu != null) {
							try {
								khyinhangzh = (Atzkhyinhangzh) dataset
										.getObjectByHql(
												"Atzkhyinhangzh",
												" from Atzkhyinhangzh where   kehuid='"
														+ kehu.getId()
														+ "' and shifouyx='1' and (shixiaorq is null or sysdate<shixiaorq)");
							} catch (Exception e) {
								returnMsg.set("NO", "系统异常(客户银行帐号),请联系系统管理员！");
								return returnMsg;
							}
						}
						
						// 初始化单据编号、制单人、制单日期等信息
						kaipiaosqd = new Atzkaipiaosqd();
						kaipiaosqd.setHetongid(hetong.getId());
						kaipiaosqd.setPiaojulx(piaojulx);
						kaipiaosqd.setShuilv(shuil);
						if(biz != null) {
							kaipiaosqd.setWubizl(biz.getId());
						}
						kaipiaosqd.setDangshihl(huil);
						kaipiaosqd.setBeizhu(beizhu);
						kaipiaosqd.setBianhao(rValue);
						kaipiaosqd.setZhidanr(str11);
						kaipiaosqd.setZhidanrq(new Date());
						kaipiaosqd.setKehuid(hetong.getKehuid());
						kaipiaosqd.setKehuidRef(kehu);
						kaipiaosqd.setWofangdwmc("东方通信股份有限公司");
						kaipiaosqd.setWofangkhyh("中国工商银行杭州景江苑支行");
						kaipiaosqd.setWofangyhzh("1202023419100008038");
						kaipiaosqd.setWofangswdjh("33019514293866X");
						kaipiaosqd.setWofangdz("杭州市文三路398号");
						kaipiaosqd.setWofangdh("0571-86675040");
						kaipiaosqd.setHejije(zje);
						kaipiaosqd.setHejiwbje(zwbje);
						kaipiaosqd.setDanjuzt("1");
						kaipiaosqd.setZhixingzt("1");
						if(khyinhangzh != null) {
							kaipiaosqd.setKehuyhzh(khyinhangzh.getId());
							kaipiaosqd.setYinghangzh(khyinhangzh.getYinhangzh());
						} else {
							kaipiaosqd.setKehuyhzh(null);
							kaipiaosqd.setYinghangzh(null);
						}
						dataset.add(kaipiaosqd);
					}
					for(Atzkaipiaomx mx : kpmxs) {
						mx.setAtzkaipiaosqdid(kaipiaosqd.getId());
						mx.setDangshihl(huil);
						mx.setWubizl(kaipiaosqd.getWubizl());
						mx.setYishouje(0d);
						mx.setWeishouje(mx.getHanshuihjje());
						dataset.add(mx);
					}
					Double htjeD = hetong.getHetongje();
					double htje = 0d;
					if(htjeD != null) {
						htje = htjeD.doubleValue();
					}
					Double ykD = hetong.getYikpje();
					double yk = 0d;
					if(ykD != null) {
						yk = ykD.doubleValue();
					}
					
					double htyk = A.add(kaipiaosqd.getHejije(), yk);
					double htwk = A.subtract(htje, htyk);
					hetong.setYikpje(htyk);
					hetong.setWeikpje(htwk);
					if(("1".equals(hetong.getHetongxz())) && (htwk < 0)) {
						returnMsg.set("NO", "闭口合同已开票合计金额不能大于合同金额！");
						return returnMsg;
					}
					dataset.update(hetong);
				} else {
					returnMsg.set("NO", "无开票明细无法导入");
					return returnMsg;
				}
			} else {
				returnMsg.set("NO", ccts.toString());
				return returnMsg;
			}
			
			returnMsg.set("OK", "开票信息上传成功!");
			return returnMsg;
			// ###################################################################################################
			
			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}