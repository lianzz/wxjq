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

	private Object 重新编辑(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-合同退库-重新编辑-12
		 */
		List<Atzhetongtkmx> tkmxs = (List<Atzhetongtkmx>) context.get("subobjs");
		if (tkmxs == null || tkmxs.size() <= 0) {
			returnMsg.set("NO", "无明细，请检查");
			return returnMsg;
		}
		//回滚已申请退库数量
		Atzfahuoqingdan qdmx = null;
		Hashtable<Long, Atzhetongtkmx> oldobjs = (Hashtable<Long, Atzhetongtkmx>) context.get("subobjs_old");
		for (Iterator iterator = oldobjs.values().iterator(); iterator.hasNext();) {
			Atzhetongtkmx oldmx = (Atzhetongtkmx) iterator.next();
			qdmx = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, oldmx.getFahuoqdid());
			if (qdmx == null) {
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			qdmx.setTkshuliang(com.actiz.util.MathUtil.sub(qdmx.getTkshuliang(), oldmx.getShuliang()));
			dataset.update(qdmx);
		}
		for (int i = 0; i < tkmxs.size(); i++) {
			Atzhetongtkmx tkmx = tkmxs.get(i);
			Atzfahuoqingdan fahuoqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, tkmx.getFahuoqdid());
			if (tkmx.getSn() != null && !"".equals(tkmx.getSn())) {
				if (tkmx.getShuliang().compareTo(1D) != 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的sn不为空, 退库数量只能为1");
					return returnMsg;
				}
			} else {
				Double sysl = com.actiz.util.MathUtil.sub(fahuoqd.getShuliang(), fahuoqd.getTkshuliang());
				if (tkmx.getShuliang().compareTo(sysl) > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的数量超过可退库数量");
					return returnMsg;
				}
			}
			//维护已申请数量
			fahuoqd.setTkshuliang(com.actiz.util.MathUtil.add(fahuoqd.getTkshuliang(), tkmx.getShuliang()));
			dataset.update(fahuoqd);
		}
		a.setModifyInfo(instance, request);
		//提交流程
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			logger.error("合同退库审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO", "合同退库审核流程提交失败，请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
			// 新增流程审核记录
			Atzlcshenhejl sh = new Atzlcshenhejl();
			sh.setRenwulx("重新编辑");
			sh.setShenher(empname);
			sh.setShenherq(new Date());
			sh.setDanjuid(instance.getId());
			sh.setYewudlx("22");
			dataset.add(sh);
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object AU_合同退库(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * AU-合同退库-12
		 */
		List<Atzhetongtkmx> tkmxs = (List<Atzhetongtkmx>) context.get("subobjs");
		if (tkmxs == null || tkmxs.size() <= 0) {
			returnMsg.set("NO", "无明细，请检查");
			return returnMsg;
		}
		for (int i = 0; i < tkmxs.size(); i++) {
			Atzhetongtkmx tkmx = tkmxs.get(i);
			Atzfahuoqingdan fahuoqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, tkmx.getFahuoqdid());
			if (tkmx.getSn() != null && !"".equals(tkmx.getSn())) {
				if (tkmx.getShuliang().compareTo(1D) != 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的sn不为空, 退库数量只能为1");
					return returnMsg;
				}
			} else {
				Double sysl = com.actiz.util.MathUtil.sub(fahuoqd.getShuliang(), fahuoqd.getTkshuliang());
				if (tkmx.getShuliang().compareTo(sysl) > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的数量超过可退库数量");
					return returnMsg;
				}
			}
		}
		// instance.setDanjuzt("1");
		a.setModifyInfo(instance, request);
		returnMsg.set("OK", "修改成功");
		return returnMsg;
	}

	private Object 发货清单选择按钮(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-发货清单选择按钮-12
		 */
		String message = null; // 提示信息
		String fhqdid = context.getString("atzfahuoqingdan.id");
		if (fhqdid == null || "".equals(fhqdid.trim())) {
			message = "错误代码: 1374389539328611<br/>选择异常, 请联系系统管理员！";
			returnMsg.set("NO", message);
			return returnMsg;
		}
		Long id = Long.parseLong(fhqdid);
		Atzfahuoqingdan fhqd = null;
		try {
			fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, id);
		} catch (Exception e) {
			logger.error(e);
			message = "错误代码: 1374389539328611<br/>系统运行异常, 请联系系统管理员！";
		}
		if (fhqd == null) {
			message = "错误代码: 1374389539328611<br/>系统运行异常, 请联系系统管理员！";
			returnMsg.set("NO", message);
			return returnMsg;
		}
		// 设置发货清单id
		context.set("fahuoqingdan.id", fhqd.getId());

		Atzwuliaojcxx jcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, fhqd.getWuliaoid());
		if (jcxx == null) {
			message = "错误代码: 1374389539328611<br/>系统运行异常, 请联系系统管理员！";
		}
		if (message != null) {
			returnMsg.set("NO", message);
			return returnMsg;
		}
		String wuliaobm = jcxx.getWuliaobm();
		String popWindowId = context.getString("pop.windowid");
		String popField = context.getString("pop.field");
		if (popField != null && popField.length() != 0)
			popField += ".";
		logger.debug(wuliaobm);
		logger.debug(popWindowId);
		logger.debug(popField);
		context.setIntoWindow(request, popWindowId, popField + "selected.values", jcxx.getId());
		context.setIntoWindow(request, popWindowId, popField + "selected.labels", wuliaobm);
		return "OK";
	}

	private Object 退库修改选择发货清单(Atzhetongtk instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-退库修改选择发货清单
		 */
		String hetongtkid = (String) context.get("atzhetongtk.id");
		logger.debug(hetongtkid);
		if (hetongtkid != null) {
			Atzhetongtk tk = (Atzhetongtk) dataset.getObject(Atzhetongtk.class, Long.parseLong(hetongtkid));
			context.set("atzhetong.id", tk.getHetongid());
		}
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
					// 申请退库数量
					sbqd.setJhtksl(com.actiz.util.MathUtil.add(sbqd.getJhtksl(), atzhetongtkmx.getShuliang()));
					// 可下达发货通知单数量
					sbqd.setWeifhsl(com.actiz.util.MathUtil.add(sbqd.getWeifhsl(), atzhetongtkmx.getShuliang()));
					dataset.update(sbqd);
				}
			}
			Atzhetong atzhetong = (Atzhetong) dataset.getObject(Atzhetong.class, instance.getHetongid());
			// 合同发货状态为发货中
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
				// 根据合同归属公司, 维护出库计划项目号
				List<Atzxiangmu> xmList = dataset.getList("Atzxiangmu", "guishugs=" + atzhetong.getGuishugs());
				if (xmList != null && xmList.size() > 0) {
					Atzxiangmu xm = xmList.get(0);
					churukjhd.setXiangmuid(xm.getId());
				} else {
					churukjhd.setXiangmuid(1552L);// 默认103004项目号
				}
				churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
				churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
				churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
				//churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
				churukjhd.setHetongtkid(instance.getId());
				// churukjhd.setChuruknr(instance.getBeizhu());
				churukjhd.setChuruknr("退库编号:" + tkbh + " 合同编号: " +atzhetong.getHetongbh() + " " +atzhetong.getHetongmc());
				churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
				churukjhd.setZhidanrq(new Date()); // 制单日期
				churukjhd.setShifouwc("2"); // 是否完成: 否
				churukjhd.setShifoufsh("2");// 是否反审核：否
				dataset.add(churukjhd);

				Map<Long, Atzchurukjhdmx> jhdmxMap = new HashMap<Long, Atzchurukjhdmx>();
				List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
				List<Atzhetongtkmx> hetongtkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid=" + instance.getId());
				if (hetongtkmxs != null && hetongtkmxs.size() > 0) {
					for (Iterator iter = hetongtkmxs.iterator(); iter.hasNext();) {
						Atzhetongtkmx hetongtkmx = (Atzhetongtkmx) iter.next();
						if (jhdmxMap.containsKey(hetongtkmx.getWuliaobmid())) {
							Atzchurukjhdmx jhdmx = jhdmxMap.get(hetongtkmx.getWuliaobmid());
							jhdmx.setShuliang(
									com.actiz.util.MathUtil.add(jhdmx.getShuliang(), hetongtkmx.getShuliang()));
							jhdmx.setInitshuliang(com.actiz.util.MathUtil.add(jhdmx.getInitshuliang(), hetongtkmx.getShuliang()));
							if (hetongtkmx.getSn() != null && !"".equals(hetongtkmx.getSn())) {
								jhdmx.setBeizhu(jhdmx.getBeizhu() + "," + hetongtkmx.getSn());
							}
							dataset.update(jhdmx);
						} else {
							Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
							churukjhmx.setAtzchurukjhdid(churukjhd.getId());
							/*
							 * List<Atzwuliaojcxx> wuliaoList =
							 * dataset.getList("Atzwuliaojcxx",
							 * "wuliaosjxz ='0' and xiaoshoubmid =" +
							 * hetongtkmx.getXiaoshoubmid() +
							 * " order by banbenpx desc"); if (wuliaoList !=
							 * null && wuliaoList.size() > 0) { Atzwuliaojcxx
							 * wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
							 * churukjhmx.setWuliaoid(wuliao.getId());
							 * churukjhmx.setWuliaobm(wuliao.getWuliaobm());
							 * churukjhmx.setWuliaoms(wuliao.getWuliaoms());
							 * churukjhmx.setGuigedw(wuliao.getGuigedw());
							 * churukjhmx.setDanwei(wuliao.getDanwei()); }
							 */
							churukjhmx.setXiaoshoubmid(hetongtkmx.getXiaoshoubmid());
							Atzwuliaojcxx wuliao = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class,
									hetongtkmx.getWuliaobmid());
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
							if (hetongtkmx.getSn() != null && !"".equals(hetongtkmx.getSn())) {
								churukjhmx.setBeizhu("SN=" + hetongtkmx.getSn());
							}
							jhdmxMap.put(wuliao.getId(), churukjhmx);
							dataset.add(churukjhmx);
						}
						// churukjhdmxList.add(churukjhmx);
					}
				}
				// if (churukjhdmxList.size() > 0)
				// dataset.addAll(churukjhdmxList);
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
		// Long xiaoshoubmid = null;
		String bianhao = null;
		for (int i = 0; i < tkmxs.size(); i++) {
			Atzhetongtkmx tkmx = tkmxs.get(i);
			Atzfahuoqingdan fahuoqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, tkmx.getFahuoqdid());
			if (bianhao == null) {
				Atzfahuotzd tzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, fahuoqd.getFahuotzdid());
				bianhao = tzd.getBianhao();
				logger.error(bianhao);
			}
			if (tkmx.getSn() != null && !"".equals(tkmx.getSn())) {
				if (tkmx.getShuliang().compareTo(1D) != 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的sn不为空, 退库数量只能为1");
					return returnMsg;
				}
			} else {
				Double sysl = com.actiz.util.MathUtil.sub(fahuoqd.getShuliang(), fahuoqd.getTkshuliang());
				if (tkmx.getShuliang().compareTo(sysl) > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的数量超过可退库数量");
					return returnMsg;
				}
			}
		}
		// 生成编号
		if (bianhao != null) {
			bianhao = bianhao.substring(0, bianhao.length() - 1) + "R";
			List list = dataset.getList("Atzhetongtk", "bianhao like '" + bianhao + "%'");
			if (list != null && list.size() > 0) {
				bianhao = bianhao + (list.size() + 1);
			}
		}
		instance.setBianhao(bianhao);
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
			fahuomx.setAtzhetongtkmx_shuliang(
					com.actiz.util.MathUtil.sub(atzfahuoqingdan.getShuliang(), atzfahuoqingdan.getTkshuliang()));
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
