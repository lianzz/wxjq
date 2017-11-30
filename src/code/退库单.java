package code;

import java.util.*;
import java.util.Date;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.platform.application.dataset.pojo.*;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzfahuosbqdmx_F608bff2700000009zSub;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzhetongtkmx_F07e8a69000000003zSub;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 退库单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(退库单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}

	private Object 合同退库_审核2(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-合同退库-审核2-12
		 */
		String shzt = instance.getShzt();
		String shyj = instance.getShyj();
		if (shzt.equals("1") && (shyj == null || "".equals(shyj))) {
			returnMsg.set("NO", "请填写审核意见");
			return returnMsg;
		}
		if ("0".equals(shzt)) {

			List<Atzhetongtkmx> tkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid=" + instance.getId());
			if (tkmxs == null || tkmxs.size() <= 0) {
				returnMsg.set("NO", "无退库明细");
				return returnMsg;
			}

			// 合同退库明细数量到发货通知单明细的退库数量
			for (Iterator iterator = tkmxs.iterator(); iterator.hasNext();) {
				Atzhetongtkmx atzhetongtkmx = (Atzhetongtkmx) iterator.next();
				Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class,
						atzhetongtkmx.getFahuoqdid());
				Atzshebeiqdmx sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx",
						"from Atzshebeiqdmx where hetongid=" + instance.getHetongid() + " and xiaoshoubmid="
								+ fhqd.getXiaoshoubmid());
				if (sbqd != null) {
					sbqd.setJhtksl(com.actiz.util.MathUtil.add(sbqd.getJhtksl(), atzhetongtkmx.getShuliang()));
					sbqd.setWeifhsl(com.actiz.util.MathUtil.add(sbqd.getWeifhsl(), atzhetongtkmx.getShuliang()));
					dataset.update(sbqd);
				}
			}
			Atzhetong atzhetong = (Atzhetong) dataset.getObject(Atzhetong.class, instance.getHetongid());
			atzhetong.setFhzt("1");
			dataset.update(atzhetong);

			String tkbh = instance.getBianhao();
			// 生成入库计划
			paramMap.put("danjulx", "9");
			String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
			if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "出库计划单编码规则未设置或者流水号溢出，请联系管理员！");
				return returnMsg;
			} else if ("Error".equals(rValue)) {
				returnMsg.set("NO", "出库计划单流水号溢出，请联系管理员！");
				return returnMsg;
			} else {
				// 初始化单据编号、制单人、制单日期等信息
				Atzchurukjhd churukjhd = new Atzchurukjhd();

				churukjhd.setBianhao(rValue); // 编号
				churukjhd.setLinshibh(rValue); // 临时编号
				churukjhd.setDanjulx("2"); // 出入库单的单据类型，出库

				churukjhd.setRenwuzt("17"); // 维护任务主题“合同退库”
				churukjhd.setChurukyy("10"); // 维护出入库原因为“合同退库”
				churukjhd.setXiangmuid(1552L);// 项目ID，编号为103004
				churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
				churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
				churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
				churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
				churukjhd.setHetongtkid(instance.getId());
				// churukjhd.setChuruknr(instance.getBeizhu());
				churukjhd.setChuruknr("退库编号:" + tkbh + " || " + instance.getBeizhu());
				churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
				churukjhd.setZhidanrq(new Date()); // 制单日期
				churukjhd.setShifouwc("2"); // 是否完成: 否
				churukjhd.setShifoufsh("2");// 是否反审核：否
				dataset.add(churukjhd);

				List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
				List<Atzhetongtkmx> hetongtkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid=" + instance.getId());
				if (hetongtkmxs != null && hetongtkmxs.size() > 0) {
					for (Iterator iter = hetongtkmxs.iterator(); iter.hasNext();) {
						Atzhetongtkmx hetongtkmx = (Atzhetongtkmx) iter.next();
						Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
						churukjhmx.setAtzchurukjhdid(churukjhd.getId());
						/*
						List<Atzwuliaojcxx> wuliaoList = dataset.getList("Atzwuliaojcxx",
								"wuliaosjxz ='0' and xiaoshoubmid =" + hetongtkmx.getXiaoshoubmid()
										+ " order by banbenpx desc");
						if (wuliaoList != null && wuliaoList.size() > 0) {
							Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
							churukjhmx.setWuliaoid(wuliao.getId());
							churukjhmx.setWuliaobm(wuliao.getWuliaobm());
							churukjhmx.setWuliaoms(wuliao.getWuliaoms());
							churukjhmx.setGuigedw(wuliao.getGuigedw());
							churukjhmx.setDanwei(wuliao.getDanwei());
						}
						*/
						Atzwuliaojcxx wuliao = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, hetongtkmx.getWuliaobmid());
						churukjhmx.setWuliaoid(wuliao.getId());
						churukjhmx.setWuliaobm(wuliao.getWuliaobm());
						churukjhmx.setWuliaoms(wuliao.getWuliaoms());
						churukjhmx.setGuigedw(wuliao.getGuigedw());
						churukjhmx.setDanwei(wuliao.getDanwei());
						// churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
						churukjhmx.setInitshuliang(hetongtkmx.getShuliang());
						churukjhmx.setShuliang(hetongtkmx.getShuliang());
						churukjhmx.setKuweiid(431139L);
						churukjhmx.setWeicrksl(null);
						churukjhmx.setLururq(new Date());
						// 备注为sn
						churukjhmx.setBeizhu(hetongtkmx.getSn());
						churukjhdmxList.add(churukjhmx);
					}
				}
				if (churukjhdmxList.size() > 0)
					dataset.addAll(churukjhdmxList);
			}
			instance.setDanjuzt("3");
			dataset.update(instance);
		}
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			logger.error("合同退库审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO", "合同退库审核流程提交失败，请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
			// 新增流程审核记录
			Atzlcshenhejl sh = new Atzlcshenhejl();
			sh.setRenwulx("工程中心审核");
			sh.setShenher(empname);
			sh.setShenherq(new Date());
			sh.setShenhezt(shzt);
			sh.setShenheyj(shyj);
			sh.setDanjuid(instance.getId());
			sh.setYewudlx("22");
			dataset.add(sh);
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object 提交(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-合同退库-提交-12
		 */
		if (!"1".equals(instance.getDanjuzt())) {
			return "OK";
		}
		List<Atzhetongtkmx> tkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid=" + instance.getId());
		if (tkmxs == null || tkmxs.size() <= 0) {
			returnMsg.set("NO", "无明细，不能提交");
			return returnMsg;
		}
		// 检查数量, 维护发货清单的退库数量
		Atzfahuoqingdan fhqd = null;
		for (int i = 0; i < tkmxs.size(); i++) {
			Atzhetongtkmx tkmx = tkmxs.get(i);
			fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, tkmx.getFahuoqdid());
			Double sysl = com.actiz.util.MathUtil.sub(fhqd.getShuliang(), fhqd.getTkshuliang());
			if (tkmx.getShuliang().compareTo(sysl) > 0) {
				returnMsg.set("NO", "第" + (i + 1) + "行物料明细的退库数量超过剩余发货数量");
				return returnMsg;
			}
			fhqd.setTkshuliang(com.actiz.util.MathUtil.add(fhqd.getTkshuliang(), tkmx.getShuliang()));
			dataset.update(fhqd);
		}
		// 提交流程
		Long result = newWorkflowInstance(request, context);
		if (result <= 0) {
			returnMsg.set("NO", "流程提交失败，请联系系统管理员");
			return returnMsg;
		}
		instance.setDanjuzt("2");
		dataset.update(instance);
		returnMsg.set("OK", "提交成功");
		return returnMsg;

	}

	private Object AN_合同退库_12(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * AN-合同退库-12
		 */
		List<Atzhetongtkmx> tkmxs = (List<Atzhetongtkmx>) context.get("subobjs");
		if (tkmxs == null || tkmxs.size() <= 0) {
			returnMsg.set("NO", "无明细，请检查");
			return returnMsg;
		}
		Long xiaoshoubmid = null;
		for (int i = 0; i < tkmxs.size(); i++) {
			Atzhetongtkmx tkmx = tkmxs.get(i);
			if (tkmx.getSn() != null && !"".equals(tkmx.getSn())) {
				if (tkmx.getShuliang().compareTo(1D) != 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的sn不为空, 退库数量只能为1");
					return returnMsg;
				}
			} else {
				Atzfahuoqingdan fahuoqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class,
						tkmx.getFahuoqdid());
				Double sysl = com.actiz.util.MathUtil.sub(fahuoqd.getShuliang(), fahuoqd.getTkshuliang());
				if (tkmx.getShuliang().compareTo(sysl) > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的数量超过已发货数量");
					return returnMsg;
				}
			}
		}
		instance.setDanjuzt("1");
		a.setCreateInfo(instance, request);
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}

	private Object A_合同退库_选择发货清单_12(Atzhetongtk instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_合同退库_选择发货清单_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		if (hetongid == null || "".equals(hetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(hetongid));
		if (hetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}

		Atzwuliaojcxx atzwuliaojcxx = null;
		List<Fi_atzhetongtkmx_F07e8a69000000003zSub> fahuomxList = new ArrayList();
		List<String> ids = context.getValueList("atzfahuoqingdan.id");
		for (String sbqdid : ids) {
			Atzfahuoqingdan atzfahuoqingdan = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class,
					Long.parseLong(sbqdid));
			Fi_atzhetongtkmx_F07e8a69000000003zSub fahuomx = new Fi_atzhetongtkmx_F07e8a69000000003zSub();
			atzwuliaojcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, atzfahuoqingdan.getWuliaoid());
			fahuomx.setAtzhetongtkmx_wuliaobmid(atzwuliaojcxx.getId());
			fahuomx.setAtzhetongtkmx_xiaoshoubmid(atzfahuoqingdan.getXiaoshoubmid());
			fahuomx.setAtzhetongtkmx_fahuoqdid(atzfahuoqingdan.getId());
			fahuomx.setAtzwuliaojcxx_wuliaobm(atzwuliaojcxx.getWuliaobm());
			fahuomx.setAtzwuliaojcxx_wuliaomc(atzwuliaojcxx.getWuliaomc());
			fahuomx.setAtzwuliaojcxx_wuliaoms(atzwuliaojcxx.getWuliaoms());
			fahuomx.setAtzwuliaojcxx_guigedw(atzwuliaojcxx.getGuigedw());
			fahuomx.setAtzwuliaojcxx_danwei(atzwuliaojcxx.getDanwei());
			fahuomx.setAtzhetongtkmx_shuliang(com.actiz.util.MathUtil.sub(atzfahuoqingdan.getShuliang(), atzfahuoqingdan.getTkshuliang()));
			fahuomx.setAtzhetongtkmx_sn(atzfahuoqingdan.getSn());
			fahuomxList.add(fahuomx);
		}
		Atzhetongtk tk = new Atzhetongtk();
		tk.setHetongid(hetong.getId());
		tk.setDanjuzt("1");

		context.set("instance.atzhetongtk", tk);
		context.set("instancelist.atzhetongtkmx", fahuomxList);
		return "OK";
	}
}
