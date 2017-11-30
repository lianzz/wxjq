package rule.库存;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.rule.application.ReturnMsg;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 历史合同发货数据导入 extends RuleEngine {
	private static Logger logger = Logger.getLogger(历史合同发货数据导入.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset, HttpServletRequest request, Map paramMap,
			Logger logger,
			// 实体名字
			Atzshengchandr instance) throws Exception {
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * String shebeibh = instance.getShebeibh(); Atzgudingzc jlsb =
			 * (Atzgudingzc)dataset.getObjectByHql("Atzgudingzc",
			 * "from Atzgudingzc where zichanlx='2' and shebeibh='"
			 * +shebeibh+"'"); if (jlsb != null) { dataset.delete(jlsb); }
			 * instance.setShifousc("1"); dataset.update(instance);
			 * context.remove("atzgudingzc.id"); returnMsg.set("OK","删除成功");
			 * return returnMsg;
			 */

			Atzshengchandr scdr = null;
			String fahuotzdh = "";
			Atzfahuotzd fhtzd = null;
			Atzhetong hetong = null;
			Date today = new Date();

			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			// String todayS = sdf.format(today);
			//
			int count = 1;
			boolean ccfg = false;
			StringBuffer ccst = new StringBuffer();
			Atzwuliaojcxx wuliao = null;
			Atzxiaoshoubm xiaoshoubm = null;
			Atzemployee eee = null;
			Atzfahuosbqdmx fhqdmx = null;
			Atzchurukjhd churukjhd = null;
			Atzchurukjhdmx churukjhdmx = null;
			Atzchurukd churukd = null;
			Atzchurukdmx churukdmx = null;
			Atzchurukls ls = null;
			Atzshebeiwbxx sbwbxx = null;
			Atzfahuojhzj fahuozj = null;
			Atzhetongtk httk = null;
			Atzhetongtkmx tkmx = null;
			Atzweibaosbsqd wbsqd = null;
			Atzshebeisqdmx sqdmx = null;

			String rValue = "";

			String sql = "from Atzshengchandr where scdrbj='0' and fahuotzdh='F20140703F' ";
			List<Atzshengchandr> list = dataset.getListByHql("Atzshengchandr", sql);
			for (int i = 0; i < list.size(); i++) {
				scdr = list.get(i);

				// 遍历sn 查找设备信息，没有则插入 数量为正 已发货 数量为负 仓库中
				if (scdr.getSn() != null && !"".equals(scdr.getSn().trim()) && "2".equals(scdr.getSfjh())) {
					Atzshebeixx sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx",
							"from Atzshebeixx where sn='" + scdr.getSn().trim() + "'");
					if (sbxx == null) {
						// 设备信息不存在
						// 找物料id
						Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx",
								"from Atzwuliaojcxx where wuliaosjxz='0' and wuliaobm='" + scdr.getWuliaobm() + "'");
						sbxx = new Atzshebeixx();
						sbxx.setWuliaoid(wl.getId());
						sbxx.setSn(scdr.getSn());
						sbxx.setLurur("admin");
						sbxx.setLururq(new Date());
						if (scdr.getShuliang() > 0) {
							sbxx.setShifouzk("2");// 数量为正 已发货
						} else {
							sbxx.setShifouzk("1");// 数量为负 仓库中
						}
						sbxx.setBeizhu("系统补录(数据来源:发货信息上传)");
						dataset.add(sbxx);
					}
				}
				// 根据发货通知单号 区别单据类型
				// T F K D H 为合同下主发货通知单
				// P B 为合同下附配件发货通知单
				// X E W 为维保申请单
				// 以R结尾的为回单，生成合同退库单 或者 维保回单
				fahuotzdh = scdr.getFahuotzdh();
				if ((fahuotzdh.startsWith("T") && fahuotzdh.endsWith("T"))
						|| (fahuotzdh.startsWith("F") && fahuotzdh.endsWith("F"))
						|| (fahuotzdh.startsWith("K") && fahuotzdh.endsWith("K"))
						|| (fahuotzdh.startsWith("D") && fahuotzdh.endsWith("D"))
						|| (fahuotzdh.startsWith("H") && fahuotzdh.endsWith("H"))) {
					hetong = (Atzhetong) dataset.getObjectByHql("Atzhetong",
							"from Atzhetong where hetongbh='" + scdr.getHetongbh() + "'");
					if (hetong == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("合同查找出错：" + scdr.getHetongbh());
					}
					eee = (Atzemployee) dataset.getObject(Atzemployee.class, hetong.getXiaoshoujl());
					fhtzd = (Atzfahuotzd) dataset.getObjectByHql("Atzfahuotzd",
							"from Atzfahuotzd where bianhao='" + scdr.getFahuotzdh() + "'");
					if (fhtzd == null) {
						fhtzd = new Atzfahuotzd();
						fhtzd.setBianhao(scdr.getFahuotzdh());
						fhtzd.setHetongid(hetong.getId());
						fhtzd.setKehuid(hetong.getKehuid());
						fhtzd.setZhuti(hetong.getHetongmc() + "(系统补录(数据来源:发货信息上传))");
						fhtzd.setJutigznrbc("系统补录(数据来源:发货信息上传)");
						fhtzd.setZhidanr("admin");
						fhtzd.setZhidanrq(today);
						fhtzd.setDanjuzt("3");
						fhtzd.setFahuotzdlx("1");
						if (eee != null) {
							fhtzd.setKehujl(eee.getName());
						}

						dataset.add(fhtzd);
					}
					wuliao = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx",
							"from Atzwuliaojcxx where wuliaosjxz='0' and wuliaobm='" + scdr.getWuliaobm() + "'");
					if (wuliao == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("物料查找出错:" + scdr.getWuliaobm() + "");
					}
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, wuliao.getXiaoshoubmid());
					if (xiaoshoubm == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("销售编码查找出错:" + scdr.getWuliaobm() + "");
					}

					fhqdmx = (Atzfahuosbqdmx) dataset.getObjectByHql("Atzfahuosbqdmx",
							"from Atzfahuosbqdmx where fahuotzdid=" + fhtzd.getId() + " and xiaoshoubmid="
									+ xiaoshoubm.getId());
					if (fhqdmx != null) {
						fhqdmx.setShuliang(new BigDecimal(fhqdmx.getShuliang()).add(new BigDecimal(scdr.getShuliang()))
								.doubleValue());
						dataset.update(fhqdmx);
					} else {
						fhqdmx = new Atzfahuosbqdmx();
						fhqdmx.setFahuotzdid(fhtzd.getId());
						fhqdmx.setXiaoshoubmid(xiaoshoubm.getId());
						fhqdmx.setXiaoshoubm(xiaoshoubm.getBianma());
						fhqdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
						fhqdmx.setDanwei(xiaoshoubm.getDanwei());
						fhqdmx.setShuliang(scdr.getShuliang().doubleValue());
						fhqdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
						fhqdmx.setLururq(today);
						dataset.add(fhqdmx);
					}

					// 出库计划
					churukjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd",
							"from Atzchurukjhd where fahuotzdid=" + fhtzd.getId());
					if (churukjhd == null) {
						churukjhd = new Atzchurukjhd();

						paramMap.put("danjulx", "10");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库计划单流水号生成出错");
						}

						churukjhd.setBianhao(rValue);
						churukjhd.setFahuotzdid(fhtzd.getId());
						churukjhd.setDanjulx("1");
						churukjhd.setRenwuzt("11");
						churukjhd.setChurukyy("3");
						churukjhd.setXiangmuid(1552L);
						churukjhd.setDanjuzt("3");
						churukjhd.setDanjusc("2");
						churukjhd.setShifouxn("2");
						churukjhd.setChuruknr(fhtzd.getZhuti());
						churukjhd.setZhidanr("admin");
						churukjhd.setZhidanrq(today);
						churukjhd.setShifouwc("1");
						churukjhd.setShifoufsh("2");

						churukjhd.setZhixingf("1");
						churukjhd.setCrkjhtjlx("1");
						churukjhd.setBeizhu("系统补录(数据来源:发货信息上传)");

						dataset.add(churukjhd);
					}
					churukjhdmx = (Atzchurukjhdmx) dataset.getObjectByHql("Atzchurukjhdmx",
							"from Atzchurukjhdmx where atzchurukjhdid=" + churukjhd.getId() + " and wuliaoid="
									+ wuliao.getId());
					if (churukjhdmx != null) {
						churukjhdmx.setShuliang(new BigDecimal(churukjhdmx.getShuliang())
								.add(new BigDecimal(scdr.getShuliang())).doubleValue());
						churukjhdmx.setInitshuliang(new BigDecimal(churukjhdmx.getInitshuliang())
								.add(new BigDecimal(scdr.getShuliang())).doubleValue());
						dataset.update(churukjhdmx);
					} else {
						churukjhdmx = new Atzchurukjhdmx();
						churukjhdmx.setAtzchurukjhdid(churukjhd.getId());
						churukjhdmx.setWuliaoid(wuliao.getId());
						churukjhdmx.setWuliaobm(wuliao.getWuliaobm());
						churukjhdmx.setWuliaoms(wuliao.getWuliaoms());
						churukjhdmx.setDanwei(wuliao.getDanwei());
						churukjhdmx.setGuigedw(wuliao.getGuigedw());
						churukjhdmx.setKuweiid(431139L);
						churukjhdmx.setSn(scdr.getSn());
						churukjhdmx.setInitshuliang(scdr.getShuliang().doubleValue());
						churukjhdmx.setShuliang(scdr.getShuliang().doubleValue());
						churukjhdmx.setWeicrksl(0D);
						churukjhdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukjhdmx.setLururq(today);
						churukjhdmx.setZhizaowzxl(0D);

						dataset.add(churukjhdmx);
					}

					// 出库单
					churukd = (Atzchurukd) dataset.getObjectByHql("Atzchurukd",
							"from Atzchurukd where churukjhdid=" + churukjhd.getId());

					if (churukd == null) {
						churukd = new Atzchurukd();

						paramMap.put("danjulx", "16");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库单流水号生成出错");
						}

						churukd.setBianhao(rValue);
						churukd.setChurukjhdid(churukjhd.getId());
						churukd.setChuruknr(churukjhd.getChuruknr());
						churukd.setDanjulx("1");
						churukd.setXiangmuid(1552L);
						churukd.setRenwuzt("11");
						churukd.setChurukyy("3");
						churukd.setZhidanr("admin");
						churukd.setZhidanrq(today);
						churukd.setChurukr("admin");
						churukd.setChurukrq(today);
						churukd.setShifouzx("1");
						churukd.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukd.setZhixingf("1");
						dataset.add(churukd);
					}

					// 出库单明细
					churukdmx = new Atzchurukdmx();
					churukdmx.setAtzchurukdid(churukd.getId());
					churukdmx.setCrkjhmxid(churukjhdmx.getId());
					churukdmx.setKuweiid(431139L);
					churukdmx.setWuliaoid(wuliao.getId());
					churukdmx.setWuliaobm(wuliao.getWuliaobm());
					churukdmx.setSn(scdr.getSn());
					if (scdr.getSn() == null || "".equals(scdr.getSn())) {
						churukdmx.setSn("无");
					}
					churukdmx.setShuliang(scdr.getShuliang().doubleValue());
					churukdmx.setMeidwsl(churukjhdmx.getMeidwsl());
					churukdmx.setBencijhsl(scdr.getShuliang().doubleValue());
					churukdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					churukdmx.setWeizxsl(scdr.getShuliang().doubleValue());
					churukdmx.setLururq(today);
					dataset.add(churukdmx);

					// 出库流水
					ls = new Atzchurukls();
					ls.setChurukjhdid(churukjhd.getId());
					ls.setChurukdid(churukd.getId());
					ls.setChurukdmxid(churukdmx.getId());
					ls.setChuruklx("1");
					ls.setChurukyy("3");
					ls.setXiangmuid(1552L);
					ls.setWuliaoid(wuliao.getId());
					ls.setKuweiid(431139L);
					ls.setMeidwsl(churukdmx.getMeidwsl());
					ls.setSn(churukdmx.getSn());
					ls.setBencijhsl(churukdmx.getBencijhsl());
					ls.setShuliang(churukdmx.getShuliang());
					ls.setChurukr("admin");
					ls.setRiqi(today);
					ls.setZhixingf("1");

					dataset.add(ls);

					// 设备维保信息
					if (scdr.getSn() != null && !"".equals(scdr.getSn())) {
						sbwbxx = new Atzshebeiwbxx();

						sbwbxx.setKehuid(fhtzd.getKehuid()); // 客户ID
						sbwbxx.setXiaoshouhtid(fhtzd.getHetongid()); // 销售合同ID
						sbwbxx.setWeibaohtid(fhtzd.getHetongid()); // 维保合同ID
						sbwbxx.setWuliaoid(wuliao.getId()); // 物料ID
						sbwbxx.setSn(scdr.getSn()); // SN
						sbwbxx.setShifouyx("1"); // 是否超保: 是

						dataset.add(sbwbxx);
					}

					// 生成发货总结
					fahuozj = new Atzfahuojhzj(); // 发货总结

					fahuozj.setChurukdid(churukd.getId()); // 出库单ID
					fahuozj.setTongzhidxfrq(today); // 通知单下发日期
					fahuozj.setZongxiangs(0); // 总箱数
					fahuozj.setYunshugs("杭州新杰"); // 运输公司

					dataset.add(fahuozj);
				} else if ((fahuotzdh.startsWith("P") && fahuotzdh.endsWith("P"))
						|| (fahuotzdh.startsWith("B") && fahuotzdh.endsWith("B"))) {
					// 附配件发货通知单
					// 同主发货通知单，发货通知单类型为2，明细为物料编码
					hetong = (Atzhetong) dataset.getObjectByHql("Atzhetong",
							"from Atzhetong where hetongbh='" + scdr.getHetongbh() + "'");
					if (hetong == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("合同查找出错：" + scdr.getHetongbh());
					}
					eee = (Atzemployee) dataset.getObject(Atzemployee.class, hetong.getXiaoshoujl());

					fhtzd = (Atzfahuotzd) dataset.getObjectByHql("Atzfahuotzd",
							"from Atzfahuotzd where bianhao='" + scdr.getFahuotzdh() + "'");
					if (fhtzd == null) {
						fhtzd = new Atzfahuotzd();
						fhtzd.setBianhao(scdr.getFahuotzdh());
						fhtzd.setHetongid(hetong.getId());
						fhtzd.setKehuid(hetong.getKehuid());
						fhtzd.setZhuti(hetong.getHetongmc() + "(系统补录(数据来源:发货信息上传))");
						fhtzd.setJutigznrbc("系统补录(数据来源:发货信息上传)");
						fhtzd.setZhidanr("admin");
						fhtzd.setZhidanrq(today);
						fhtzd.setDanjuzt("3");
						fhtzd.setFahuotzdlx("2");//
						if (eee != null) {
							fhtzd.setXiaoshoujl(eee.getName());
						}

						dataset.add(fhtzd);
					}
					wuliao = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx",
							"from Atzwuliaojcxx where wuliaosjxz='0' and wuliaobm='" + scdr.getWuliaobm() + "'");
					if (wuliao == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("物料查找出错:" + scdr.getWuliaobm() + "");
					}
					// xiaoshoubm = (Atzxiaoshoubm)
					// dataset.getObject(Atzxiaoshoubm.class,wuliao.getXiaoshoubmid());
					// if (xiaoshoubm == null){
					// ccfg = true;
					// ccst.append("发货通知单"+scdr.getFahuotzdh());
					// ccst.append("销售编码查找出错:"+scdr.getWuliaobm()+"");
					// }

					fhqdmx = (Atzfahuosbqdmx) dataset.getObjectByHql("Atzfahuosbqdmx",
							"from Atzfahuosbqdmx where fahuotzdid=" + fhtzd.getId() + " and wuliaoid="
									+ wuliao.getId());
					if (fhqdmx != null) {
						fhqdmx.setShuliang(new BigDecimal(fhqdmx.getShuliang()).add(new BigDecimal(scdr.getShuliang()))
								.doubleValue());
						dataset.update(fhqdmx);
					} else {
						fhqdmx = new Atzfahuosbqdmx();
						fhqdmx.setFahuotzdid(fhtzd.getId());
						// fhqdmx.setXiaoshoubmid(xiaoshoubm.getId());//

						fhqdmx.setWuliaoid(wuliao.getId());
						// fhqdmx.setXiaoshoubm(wuliao.getWuliaobm());
						fhqdmx.setWuliaoms(wuliao.getWuliaoms());
						fhqdmx.setDanwei(wuliao.getDanwei());
						fhqdmx.setShuliang(scdr.getShuliang().doubleValue());
						fhqdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
						fhqdmx.setLururq(today);
						dataset.add(fhqdmx);
					}

					// 出库计划
					churukjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd",
							"from Atzchurukjhd where fahuotzdid=" + fhtzd.getId());
					if (churukjhd == null) {
						churukjhd = new Atzchurukjhd();

						paramMap.put("danjulx", "10");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库计划单流水号生成出错");
						}

						churukjhd.setBianhao(rValue);
						churukjhd.setFahuotzdid(fhtzd.getId());
						churukjhd.setDanjulx("1");
						churukjhd.setRenwuzt("11");
						churukjhd.setChurukyy("3");
						churukjhd.setXiangmuid(1552L);
						churukjhd.setDanjuzt("3");
						churukjhd.setDanjusc("2");
						churukjhd.setShifouxn("2");
						churukjhd.setChuruknr(fhtzd.getZhuti());
						churukjhd.setZhidanr("admin");
						churukjhd.setZhidanrq(today);
						churukjhd.setShifouwc("1");
						churukjhd.setShifoufsh("2");

						churukjhd.setZhixingf("1");
						churukjhd.setCrkjhtjlx("1");
						churukjhd.setBeizhu("系统补录(数据来源:发货信息上传)");

						dataset.add(churukjhd);
					}
					churukjhdmx = (Atzchurukjhdmx) dataset.getObjectByHql("Atzchurukjhdmx",
							"from Atzchurukjhdmx where atzchurukjhdid=" + churukjhd.getId() + " and wuliaoid="
									+ wuliao.getId());
					if (churukjhdmx != null) {
						churukjhdmx.setShuliang(new BigDecimal(churukjhdmx.getShuliang())
								.add(new BigDecimal(scdr.getShuliang())).doubleValue());
						churukjhdmx.setInitshuliang(new BigDecimal(churukjhdmx.getInitshuliang())
								.add(new BigDecimal(scdr.getShuliang())).doubleValue());
						dataset.update(churukjhdmx);
					} else {
						churukjhdmx = new Atzchurukjhdmx();
						churukjhdmx.setAtzchurukjhdid(churukjhd.getId());
						churukjhdmx.setWuliaoid(wuliao.getId());
						churukjhdmx.setWuliaobm(wuliao.getWuliaobm());
						churukjhdmx.setWuliaoms(wuliao.getWuliaoms());
						churukjhdmx.setDanwei(wuliao.getDanwei());
						churukjhdmx.setGuigedw(wuliao.getGuigedw());
						churukjhdmx.setKuweiid(431139L);
						churukjhdmx.setSn(scdr.getSn());
						churukjhdmx.setInitshuliang(scdr.getShuliang().doubleValue());
						churukjhdmx.setShuliang(scdr.getShuliang().doubleValue());
						churukjhdmx.setWeicrksl(0D);
						churukjhdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukjhdmx.setLururq(today);
						churukjhdmx.setZhizaowzxl(0D);

						dataset.add(churukjhdmx);
					}

					// 出库单
					churukd = (Atzchurukd) dataset.getObjectByHql("Atzchurukd",
							"from Atzchurukd where churukjhdid=" + churukjhd.getId());
					if (churukd == null) {
						churukd = new Atzchurukd();

						paramMap.put("danjulx", "16");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库单流水号生成出错");
						}

						churukd.setBianhao(rValue);
						churukd.setChurukjhdid(churukjhd.getId());
						churukd.setChuruknr(churukjhd.getChuruknr());
						churukd.setDanjulx("1");
						churukd.setXiangmuid(1552L);
						churukd.setRenwuzt("11");
						churukd.setChurukyy("3");
						churukd.setZhidanr("admin");
						churukd.setZhidanrq(today);
						churukd.setChurukr("admin");
						churukd.setChurukrq(today);
						churukd.setShifouzx("1");
						churukd.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukd.setZhixingf("1");
						dataset.add(churukd);
					}
					// 出库单明细
					churukdmx = new Atzchurukdmx();
					churukdmx.setAtzchurukdid(churukd.getId());
					churukdmx.setCrkjhmxid(churukjhdmx.getId());
					churukdmx.setKuweiid(431139L);
					churukdmx.setWuliaoid(wuliao.getId());
					churukdmx.setWuliaobm(wuliao.getWuliaobm());
					churukdmx.setSn(scdr.getSn());
					if (scdr.getSn() == null || "".equals(scdr.getSn())) {
						churukdmx.setSn("无");
					}
					churukdmx.setShuliang(scdr.getShuliang().doubleValue());
					churukdmx.setMeidwsl(churukjhdmx.getMeidwsl());
					churukdmx.setBencijhsl(scdr.getShuliang().doubleValue());
					churukdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					churukdmx.setWeizxsl(scdr.getShuliang().doubleValue());
					churukdmx.setLururq(today);
					dataset.add(churukdmx);

					// 出库流水
					ls = new Atzchurukls();
					ls.setChurukjhdid(churukjhd.getId());
					ls.setChurukdid(churukd.getId());
					ls.setChurukdmxid(churukdmx.getId());
					ls.setChuruklx("1");
					ls.setChurukyy("3");
					ls.setXiangmuid(1552L);
					ls.setWuliaoid(wuliao.getId());
					ls.setKuweiid(431139L);
					ls.setMeidwsl(churukdmx.getMeidwsl());
					ls.setSn(churukdmx.getSn());
					ls.setBencijhsl(churukdmx.getBencijhsl());
					ls.setShuliang(churukdmx.getShuliang());
					ls.setChurukr("admin");
					ls.setRiqi(today);
					ls.setZhixingf("1");

					dataset.add(ls);

					// 设备维保信息
					if (scdr.getSn() != null && !"".equals(scdr.getSn())) {
						sbwbxx = new Atzshebeiwbxx();

						sbwbxx.setKehuid(fhtzd.getKehuid()); // 客户ID
						sbwbxx.setXiaoshouhtid(fhtzd.getHetongid()); // 销售合同ID
						sbwbxx.setWeibaohtid(fhtzd.getHetongid()); // 维保合同ID
						sbwbxx.setWuliaoid(wuliao.getId()); // 物料ID
						sbwbxx.setSn(scdr.getSn()); // SN
						sbwbxx.setShifouyx("1"); // 是否超保: 是

						dataset.add(sbwbxx);
					}

					// 生成发货总结
					fahuozj = new Atzfahuojhzj(); // 发货总结

					fahuozj.setChurukdid(churukd.getId()); // 出库单ID
					fahuozj.setTongzhidxfrq(today); // 通知单下发日期
					fahuozj.setZongxiangs(0); // 总箱数
					fahuozj.setYunshugs("杭州新杰"); // 运输公司

					dataset.add(fahuozj);
				} else if ((fahuotzdh.startsWith("X") && fahuotzdh.endsWith("X"))
						|| (fahuotzdh.startsWith("E") && fahuotzdh.endsWith("E"))
						|| (fahuotzdh.startsWith("W") && fahuotzdh.endsWith("W"))) {
					// 维保申请单，x现场发货 e维修发货 w保内更换
					hetong = (Atzhetong) dataset.getObjectByHql("Atzhetong",
							"from Atzhetong where hetongbh='" + scdr.getHetongbh() + "'");
					if (hetong == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("合同查找出错：" + scdr.getHetongbh());
					}
					wbsqd = (Atzweibaosbsqd) dataset.getObjectByHql("Atzweibaosbsqd",
							"from Atzweibaosbsqd where hetong=" + hetong.getId());
					if (wbsqd == null) {
						wbsqd = new Atzweibaosbsqd();

						if (fahuotzdh.startsWith("W")) {
							wbsqd.setWeibaodlx("3");
							paramMap.put("danjulx", "13");
						} else if (fahuotzdh.startsWith("E")) {
							wbsqd.setWeibaodlx("4");
							paramMap.put("danjulx", "14");
						} else {
							wbsqd.setWeibaodlx("1");
							paramMap.put("danjulx", "11");
						}
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("维保申请单流水号生成出错");
						}

						wbsqd.setShenqingr("admin");
						wbsqd.setShenqingsj(today);
						wbsqd.setHetong(hetong.getId());
						wbsqd.setDanjuzt("3");
						wbsqd.setZhidanr("admin");
						wbsqd.setZhidanrq(today);
						wbsqd.setShifouzf("2");
						wbsqd.setKehuid(hetong.getKehuid());
						wbsqd.setShifoufsh("2");
						wbsqd.setShifouwc("1");
						wbsqd.setBeizhu("系统补录(数据来源:发货信息上传)");
						dataset.add(wbsqd);
					}
					// 维保设备明细
					wuliao = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx",
							"from Atzwuliaojcxx where wuliaosjxz='0' and wuliaobm='" + scdr.getWuliaobm() + "'");
					if (wuliao == null) {
						ccfg = true;
						ccst.append("wbsbsqd通知单" + scdr.getFahuotzdh());
						ccst.append("物料查找出错:" + scdr.getWuliaobm() + "");
					}

					sqdmx = new Atzshebeisqdmx();
					sqdmx.setWeibaosbsqdi(wbsqd.getId());
					sqdmx.setShebeilx("1");
					sqdmx.setWuliaoid(wuliao.getId());
					sqdmx.setWuliaoms(wuliao.getWuliaoms());
					sqdmx.setDanwei(wuliao.getDanwei());
					if (scdr.getSn() != null && !"".equals(scdr.getSn())) {
						sqdmx.setSnhao(scdr.getSn());
					}
					sqdmx.setShuliang(scdr.getShuliang().doubleValue());
					sqdmx.setLururq(today);
					sqdmx.setHuichangsj(today);
					sqdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					dataset.add(sqdmx);

					// 出库计划
					churukjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd",
							"from Atzchurukjhd where weibaosqdid=" + wbsqd.getId());
					if (churukjhd == null) {
						churukjhd = new Atzchurukjhd();

						paramMap.put("danjulx", "10");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库计划单流水号生成出错");
						}

						churukjhd.setBianhao(rValue);
						// churukjhd.setFahuotzdid(fhtzd.getId());

						churukjhd.setWeibaosqdid(wbsqd.getId());
						churukjhd.setDanjulx("1");
						churukjhd.setRenwuzt("7");//
						if ("3".equals(wbsqd.getWeibaodlx()))
							churukjhd.setChurukyy("5");
						if ("1".equals(wbsqd.getWeibaodlx()))
							churukjhd.setChurukyy("15");
						if ("4".equals(wbsqd.getWeibaodlx()))
							churukjhd.setChurukyy("18");
						// churukjhd.setChurukyy("3");//
						churukjhd.setXiangmuid(1552L);
						churukjhd.setDanjuzt("3");
						churukjhd.setDanjusc("2");
						churukjhd.setShifouxn("2");
						// churukjhd.setChuruknr(wbsqd.get);
						churukjhd.setZhidanr("admin");
						churukjhd.setZhidanrq(today);
						churukjhd.setShifouwc("1");
						churukjhd.setShifoufsh("2");

						churukjhd.setZhixingf("1");
						churukjhd.setCrkjhtjlx("1");
						churukjhd.setBeizhu("系统补录(数据来源:发货信息上传)");

						dataset.add(churukjhd);
					}
					churukjhdmx = new Atzchurukjhdmx();
					churukjhdmx.setAtzchurukjhdid(churukjhd.getId());
					churukjhdmx.setWuliaoid(wuliao.getId());
					churukjhdmx.setWuliaobm(wuliao.getWuliaobm());
					churukjhdmx.setWuliaoms(wuliao.getWuliaoms());
					churukjhdmx.setDanwei(wuliao.getDanwei());
					churukjhdmx.setGuigedw(wuliao.getGuigedw());
					churukjhdmx.setKuweiid(431139L);
					churukjhdmx.setSn(scdr.getSn());
					churukjhdmx.setInitshuliang(sqdmx.getShuliang());
					churukjhdmx.setShuliang(sqdmx.getShuliang());
					churukjhdmx.setWeicrksl(0D);
					churukjhdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					churukjhdmx.setLururq(today);
					churukjhdmx.setZhizaowzxl(0D);

					dataset.add(churukjhdmx);

					// 出库单
					churukd = (Atzchurukd) dataset.getObjectByHql("Atzchurukd",
							"from Atzchurukd where churukjhdid=" + churukjhd.getId());
					if (churukd == null) {
						churukd = new Atzchurukd();

						paramMap.put("danjulx", "16");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库单流水号生成出错");
						}

						churukd.setBianhao(rValue);
						churukd.setChurukjhdid(churukjhd.getId());
						churukd.setChuruknr(churukjhd.getChuruknr());
						churukd.setDanjulx("1");
						churukd.setXiangmuid(1552L);
						churukd.setRenwuzt(churukjhd.getRenwuzt());
						churukd.setChurukyy(churukjhd.getChurukyy());
						churukd.setZhidanr("admin");
						churukd.setZhidanrq(today);
						churukd.setChurukr("admin");
						churukd.setChurukrq(today);
						churukd.setShifouzx("1");
						churukd.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukd.setZhixingf("1");
						dataset.add(churukd);
					}
					// 出库单明细
					churukdmx = new Atzchurukdmx();
					churukdmx.setAtzchurukdid(churukd.getId());
					churukdmx.setCrkjhmxid(churukjhdmx.getId());
					churukdmx.setKuweiid(431139L);
					churukdmx.setWuliaoid(wuliao.getId());
					churukdmx.setWuliaobm(wuliao.getWuliaobm());
					churukdmx.setSn(scdr.getSn());
					if (scdr.getSn() == null || "".equals(scdr.getSn())) {
						churukdmx.setSn("无");
					}
					churukdmx.setShuliang(churukjhdmx.getShuliang());
					churukdmx.setMeidwsl(churukjhdmx.getMeidwsl());
					churukdmx.setBencijhsl(churukjhdmx.getShuliang());
					churukdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					churukdmx.setWeizxsl(churukjhdmx.getShuliang());
					churukdmx.setLururq(today);
					dataset.add(churukdmx);

					// 出库流水
					ls = new Atzchurukls();
					ls.setChurukjhdid(churukjhd.getId());
					ls.setChurukdid(churukd.getId());
					ls.setChurukdmxid(churukdmx.getId());
					ls.setChuruklx("1");
					ls.setChurukyy(churukd.getChurukyy());
					ls.setXiangmuid(1552L);
					ls.setWuliaoid(wuliao.getId());
					ls.setKuweiid(431139L);
					ls.setMeidwsl(churukdmx.getMeidwsl());
					ls.setSn(churukdmx.getSn());
					ls.setBencijhsl(churukdmx.getBencijhsl());
					ls.setShuliang(churukdmx.getShuliang());
					ls.setChurukr("admin");
					ls.setRiqi(today);
					ls.setZhixingf("1");

					dataset.add(ls);

					// 设备维保信息
					if (scdr.getSn() != null && !"".equals(scdr.getSn())) {
						sbwbxx = new Atzshebeiwbxx();

						sbwbxx.setKehuid(fhtzd.getKehuid()); // 客户ID
						sbwbxx.setXiaoshouhtid(fhtzd.getHetongid()); // 销售合同ID
						sbwbxx.setWeibaohtid(fhtzd.getHetongid()); // 维保合同ID
						sbwbxx.setWuliaoid(wuliao.getId()); // 物料ID
						sbwbxx.setSn(scdr.getSn()); // SN
						sbwbxx.setShifouyx("1"); // 是否超保: 是

						dataset.add(sbwbxx);
					}

					// 生成发货总结
					fahuozj = new Atzfahuojhzj(); // 发货总结

					fahuozj.setChurukdid(churukd.getId()); // 出库单ID
					fahuozj.setTongzhidxfrq(today); // 通知单下发日期
					fahuozj.setZongxiangs(0); // 总箱数
					fahuozj.setYunshugs("杭州新杰"); // 运输公司

					dataset.add(fahuozj);
				} else if (fahuotzdh.endsWith("R") && !fahuotzdh.startsWith("E")) {
					// 合同退库
					hetong = (Atzhetong) dataset.getObjectByHql("Atzhetong",
							"from Atzhetong where hetongbh='" + scdr.getHetongbh() + "'");
					if (hetong == null) {
						ccfg = true;
						ccst.append("发货通知单" + scdr.getFahuotzdh());
						ccst.append("合同查找出错：" + scdr.getHetongbh());
					}
					httk = (Atzhetongtk) dataset.getObjectByHql("Atzhetongtk",
							"from Atzhetongtk where hetongid=" + hetong.getId());
					if (httk == null) {
						httk = new Atzhetongtk();
						httk.setBianhao(fahuotzdh);
						httk.setHetongid(hetong.getId());
						httk.setBeizhu("系统补录(数据来源:发货信息上传)合同退库:" + hetong.getHetongmc());
						httk.setDanjuzt("3");
						httk.setShzt("0");
						httk.setLurur("admin");
						httk.setLururq(today);
						dataset.add(httk);
					}
					// 合同退库明细
					wuliao = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx",
							"from Atzwuliaojcxx where wuliaosjxz='0' and wuliaobm='" + scdr.getWuliaobm() + "'");
					if (wuliao == null) {
						ccfg = true;
						ccst.append("tk通知单" + scdr.getFahuotzdh());
						ccst.append("物料查找出错:" + scdr.getWuliaobm() + "");
					}
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, wuliao.getXiaoshoubmid());
					if (xiaoshoubm == null) {
						ccfg = true;
						ccst.append("tk通知单" + scdr.getFahuotzdh());
						ccst.append("销售编码查找出错:" + scdr.getWuliaobm() + "");
					}
					tkmx = (Atzhetongtkmx) dataset.getObjectByHql("Atzhetongtkmx",
							"from Atzhetongtkmx where hetongtkid=" + httk.getId() + " and xiaoshoubmid="
									+ xiaoshoubm.getId());
					if (tkmx != null) {
						tkmx.setShuliang(new BigDecimal(tkmx.getShuliang())
								.add(new BigDecimal(scdr.getShuliang()).abs()).doubleValue());
						dataset.update(tkmx);
					} else {
						tkmx = new Atzhetongtkmx();
						tkmx.setHetongtkid(httk.getId());
						tkmx.setXiaoshoubmid(xiaoshoubm.getId());
						tkmx.setShuliang(Math.abs(scdr.getShuliang().doubleValue()));
						dataset.add(tkmx);
					}

					// 入库计划
					churukjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd",
							"from Atzchurukjhd where hetongtkid=" + httk.getId());
					if (churukjhd == null) {
						churukjhd = new Atzchurukjhd();

						paramMap.put("danjulx", "9");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库计划单流水号生成出错");
						}

						churukjhd.setBianhao(rValue);
						// churukjhd.setFahuotzdid(fhtzd.getId());//
						churukjhd.setHetongtkid(httk.getId());//

						churukjhd.setDanjulx("2");
						churukjhd.setRenwuzt("11");
						churukjhd.setChurukyy("10");
						churukjhd.setXiangmuid(1552L);
						churukjhd.setDanjuzt("3");
						churukjhd.setDanjusc("2");
						churukjhd.setShifouxn("2");
						churukjhd.setChuruknr(httk.getBeizhu());//
						churukjhd.setZhidanr("admin");
						churukjhd.setZhidanrq(today);
						churukjhd.setShifouwc("1");
						churukjhd.setShifoufsh("2");

						churukjhd.setZhixingf("1");
						churukjhd.setCrkjhtjlx("1");
						churukjhd.setBeizhu("系统补录(数据来源:发货信息上传)");

						dataset.add(churukjhd);
					}
					churukjhdmx = (Atzchurukjhdmx) dataset.getObjectByHql("Atzchurukjhdmx",
							"from Atzchurukjhdmx where atzchurukjhdid=" + churukjhd.getId() + " and wuliaoid="
									+ wuliao.getId());
					if (churukjhdmx != null) {
						churukjhdmx.setShuliang(new BigDecimal(churukjhdmx.getShuliang())
								.add(new BigDecimal(scdr.getShuliang()).abs()).doubleValue());
						churukjhdmx.setInitshuliang(new BigDecimal(churukjhdmx.getInitshuliang())
								.add(new BigDecimal(scdr.getShuliang()).abs()).doubleValue());
						dataset.update(churukjhdmx);
					} else {
						churukjhdmx = new Atzchurukjhdmx();
						churukjhdmx.setAtzchurukjhdid(churukjhd.getId());
						churukjhdmx.setWuliaoid(wuliao.getId());
						churukjhdmx.setWuliaobm(wuliao.getWuliaobm());
						churukjhdmx.setWuliaoms(wuliao.getWuliaoms());
						churukjhdmx.setDanwei(wuliao.getDanwei());
						churukjhdmx.setGuigedw(wuliao.getGuigedw());
						churukjhdmx.setKuweiid(431139L);
						churukjhdmx.setSn(scdr.getSn());
						churukjhdmx.setInitshuliang(Math.abs(scdr.getShuliang().doubleValue()));//
						churukjhdmx.setShuliang(Math.abs(scdr.getShuliang().doubleValue()));//
						churukjhdmx.setWeicrksl(0D);
						churukjhdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukjhdmx.setLururq(today);
						churukjhdmx.setZhizaowzxl(0D);

						dataset.add(churukjhdmx);
					}
					// 入库单
					churukd = (Atzchurukd) dataset.getObjectByHql("Atzchurukd",
							"from Atzchurukd where churukjhdid=" + churukjhd.getId());
					if (churukd == null) {
						churukd = new Atzchurukd();

						paramMap.put("danjulx", "17");
						rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
						if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
							ccfg = true;
							ccst.append("流水号溢出");
						} else if ("Error".equals(rValue)) {
							ccfg = true;
							ccst.append("出库单流水号生成出错");
						}

						churukd.setBianhao(rValue);
						churukd.setChurukjhdid(churukjhd.getId());
						churukd.setChuruknr(churukjhd.getChuruknr());
						churukd.setDanjulx("2");//
						churukd.setXiangmuid(1552L);
						churukd.setRenwuzt("11");//
						churukd.setChurukyy("10");//
						churukd.setZhidanr("admin");
						churukd.setZhidanrq(today);
						churukd.setChurukr("admin");
						churukd.setChurukrq(today);
						churukd.setShifouzx("1");
						churukd.setBeizhu("系统补录(数据来源:发货信息上传)");
						churukd.setZhixingf("1");
						dataset.add(churukd);
					}
					// 入库单明细
					churukdmx = new Atzchurukdmx();
					churukdmx.setAtzchurukdid(churukd.getId());
					churukdmx.setCrkjhmxid(churukjhdmx.getId());
					churukdmx.setKuweiid(431139L);
					churukdmx.setWuliaoid(wuliao.getId());
					churukdmx.setWuliaobm(wuliao.getWuliaobm());
					churukdmx.setSn(scdr.getSn());
					if (scdr.getSn() == null || "".equals(scdr.getSn())) {
						churukdmx.setSn("无");
					}
					churukdmx.setShuliang(Math.abs(scdr.getShuliang().doubleValue()));
					churukdmx.setMeidwsl(churukjhdmx.getMeidwsl());
					churukdmx.setBencijhsl(Math.abs(scdr.getShuliang().doubleValue()));
					churukdmx.setBeizhu("系统补录(数据来源:发货信息上传)");
					churukdmx.setWeizxsl(Math.abs(scdr.getShuliang().doubleValue()));
					churukdmx.setLururq(today);
					dataset.add(churukdmx);

					// ru库流水
					ls = new Atzchurukls();
					ls.setChurukjhdid(churukjhd.getId());
					ls.setChurukdid(churukd.getId());
					ls.setChurukdmxid(churukdmx.getId());
					ls.setChuruklx("2");
					ls.setChurukyy("10");
					ls.setXiangmuid(1552L);
					ls.setWuliaoid(wuliao.getId());
					ls.setKuweiid(431139L);
					ls.setMeidwsl(churukdmx.getMeidwsl());
					ls.setSn(churukdmx.getSn());
					ls.setBencijhsl(churukdmx.getBencijhsl());
					ls.setShuliang(churukdmx.getShuliang());
					ls.setChurukr("admin");
					ls.setRiqi(today);
					ls.setZhixingf("1");

					dataset.add(ls);
				}
				// 导入标记
				scdr.setScdrbj("2");
				dataset.update(scdr);
				logger.error("成功导入" + (count++) + "条数据：" + scdr.getId());
				dataset.commitAndCloseSession();

			}
			if (ccfg) {
				returnMsg.set("NO", ccst.toString());
				return returnMsg;
			}
			returnMsg.set("OK", "恭喜你");
			return returnMsg;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
