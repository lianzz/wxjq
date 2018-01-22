package code;

import java.util.*;
import java.util.Date;
import java.math.BigDecimal;
import java.sql.*;
import java.text.DecimalFormat;

import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.platform.application.dataset.pojo.*;
import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.rule.application.ReturnMsg;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 出入库计划 extends RuleEngine {
	private static Logger logger = Logger.getLogger(出入库计划.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzchurukjhd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}

	private Object rukudxz(Atzchurukjhd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-入库单-获取未完成的入库计划-10 (1940141) 2012-09-11
		 */

		String message = null; // 提示信息

		String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人

		if (employeeName == null) {
			message = "系统管理员不能进行业务操作！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		String condition = "danjulx='2' and danjuzt='3' and shifouwc='2' and sfxyjianyan='2' and id in (select atzchurukjhdid from Atzchurukjhdmx group by atzchurukjhdid having sum(weicrksl)>0)";

		List<Atzchurukjhd> rkjhds = dataset.getList("Atzchurukjhd", condition); // 入库计划List

		StringBuffer rkjhdids = new StringBuffer("");

		Atzchurukjhd rkjhd = null; // 入库计划

		Long rkjhdid = null; // 入库计划ID

		if (rkjhds != null && rkjhds.size() > 0) {
			Double rkjhsl = null; // 计划数量
			Double rksl = null; // 出库数量
			for (int i = 0; i < rkjhds.size(); i++) {
				rkjhd = rkjhds.get(i);

				rkjhdid = rkjhd.getId();
				/*
				 * rkjhsl = Double.parseDouble(dataset.sum("Atzchurukjhdmx",
				 * "shuliang", "atzchurukjhdid=" + rkjhdid)); rksl =
				 * Double.parseDouble(dataset.sum("Atzchurukdmx", "shuliang",
				 * "atzchurukdid in (select id from Atzchurukd where danjulx='2' and churukjhdid="
				 * + rkjhdid + ")"));
				 * 
				 * if (rkjhsl > rksl)
				 */
				rkjhdids.append(rkjhdid + ",");
			}
		}

		String ids = rkjhdids.toString();

		if ("".equals(ids)) {
			message = "没有未完成的入库计划";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		context.set("atzchurukjhd.ids", ids.substring(0, ids.length() - 1));

		return "OK";
	}

	private Object 入库计划审核(Atzchurukjhd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-入库计划-审核(流程)-10 (1755182) 2012-10-23
		 */

		String message = null; // 提示信息

		String employeeName = (String) request.getSession().getAttribute("employeeName"); // 审核人
		Date today = new Date();

		String danjuzt = instance.getDanjuzt(); // 单据状态: 1-未提交 2-审核中 3-审核已通过
												// 4-审核未通过 5-已作废

		if (!"2".equals(danjuzt))
			return "OK";

		String shenhezt = instance.getShenhezt(); // 审核状态: 0-通过 1-不通过
		if (shenhezt == null) {
			message = "审核状态不能为空, 请维护！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		String shenheyj = instance.getShenheyj(); // 审核意见
		if (!"0".equals(shenhezt)) {
			if (shenheyj == null || "".equals(shenheyj.trim())) {
				message = "请填写审核意见！";

				returnMsg.set("NO", message);
				return returnMsg;
			}
		}

		Long rkjhdid = instance.getId(); // 入库计划单ID
		String churukyy = instance.getChurukyy(); // 出入库原因

		// -----新增审核记录-----
		Atzchurukjhshjl shenhejl = new Atzchurukjhshjl();

		shenhejl.setAtzchurukjhdid(rkjhdid);
		shenhejl.setShenher(employeeName);
		shenhejl.setShenherq(today);
		shenhejl.setShenhezt(shenhezt);
		shenhejl.setShenheyj(shenheyj);

		dataset.add(shenhejl);

		String bianhao = instance.getBianhao(); // 入库计划编号
		Long xiangmuid = instance.getXiangmuid(); // 项目ID

		List<Atzchurukjhdmx> rkjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + rkjhdid); // 入库计划明细List

		Atzchurukjhdmx rkjhdmx = null; // 入库计划明细

		Double shuliang = null; // 计划数量

		Long wuliaoid = null; // 物料ID
		Long kuweiid = null; // 库位ID
		Double meidwsl = null; // 每单位数量

		String pthql = null; // 普通库存hql

		Atzkucun ptkucun = null; // 普通库存

		for (int i = 0; i < rkjhdmxs.size(); i++) {
			rkjhdmx = rkjhdmxs.get(i);

			shuliang = rkjhdmx.getShuliang();

			wuliaoid = rkjhdmx.getWuliaoid();
			kuweiid = rkjhdmx.getKuweiid();
			meidwsl = rkjhdmx.getMeidwsl();

			pthql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
					+ kuweiid + " and kucunlx='1'";

			if (meidwsl != null)
				pthql += " and meidwsl=" + meidwsl;
			else
				pthql += " and meidwsl is null";

			ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);

			if (ptkucun != null)
				rkjhdmx.setCunfangwz(ptkucun.getCunfangwz());

			rkjhdmx.setWeicrksl(shuliang); // 未完成数量
			if ("1".equals(rkjhdmx.getZhixingf())) {
				rkjhdmx.setWeicrksl(0d);
				rkjhdmx.setZhizaowzxl(shuliang);
			}
			dataset.update(rkjhdmx);
		}

		// -----审核通过-----
		if ("0".equals(shenhezt)) {
			String rValue = null; // 编号

			if (bianhao != null && bianhao.startsWith("T-")) {
				paramMap.put("danjulx", "9");

				rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);

				if (rValue.equals("流水号溢出"))
					message = "入库计划流水号溢出！";
				else if ("Error".equals(rValue))
					message = "生成入库计划编号出错, 请联系系统管理员！";

				if (message != null) {
					returnMsg.set("NO", message);
					return returnMsg;
				}

				instance.setBianhao(rValue); // 出库计划编号
			}

			if ("58".equals(churukyy) || "2".equals(churukyy) || "12".equals(churukyy) || "4".equals(churukyy)
					|| "65".equals(churukyy)) {
				instance.setSfxyjianyan("1"); // 是否需要检验: 是
			} else {
				instance.setSfxyjianyan("2"); // 是否需要检验: 否
			}
			/**
			 * 入库计划原因为合同退库, 维护计划退库数量
			 */
			// start
			if ("10".equals(churukyy)) {
				for (int i = 0; i < rkjhdmxs.size(); i++) {
					rkjhdmx = (Atzchurukjhdmx) rkjhdmxs.get(i);
					Atzhetongtk tk = (Atzhetongtk) dataset.getObject(Atzhetongtk.class, instance.getHetongtkid());
					// String hql = "from Atzhetongtkmx where hetongtkid=" +
					// instance.getHetongtkid() + " and wuliaobmid="
					// + rkjhdmx.getWuliaoid();
					// if (rkjhdmx.getBeizhu() != null &&
					// !"".equals(rkjhdmx.getBeizhu())) {
					// hql = hql + " and sn='" + rkjhdmx.getBeizhu().trim() +
					// "'";
					// }
					// logger.debug(hql);
					// Atzhetongtkmx tkmx = (Atzhetongtkmx)
					// dataset.getObjectByHql("Atzhetongtkmx", hql);
					// if (tkmx == null) {
					// returnMsg.set("NO", "合同退库, 第" + (i + 1) +
					// "条明细找不到退库单信息,请检查物料或sn信息");
					// return returnMsg;
					// }
					String hql = "from Atzshebeiqdmx where hetongid=" + tk.getHetongid() + " and xiaoshoubmid="
							+ rkjhdmx.getXiaoshoubmid();
					logger.debug(hql);
					Atzshebeiqdmx sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx", hql);
					logger.debug("sbqd=====" + sbqd.getId());
					if (sbqd != null) {
						sbqd.setJhdtksl(com.actiz.util.MathUtil.add(sbqd.getJhdtksl(), rkjhdmx.getShuliang()));
						dataset.update(sbqd);
					}
				}
			}
			// end
			instance.setDanjuzt("3"); // 单据状态: 审核已通过
			dataset.update(instance);
		} else {
			instance.setDanjuzt("4"); // 单据状态: 审核未通过

			dataset.update(instance);
		}

		boolean result = completeWorkflowTask(request, context); // 流程处理结果

		if (!result) {
			logger.error("-----(EXCEPTION-INFO)-----");
			logger.error("入库计划ID: " + rkjhdid);
			logger.error("入库计划审核失败");

			message = "【入库计划】审核失败, 请联系系统管理员！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		if ("0".equals(shenhezt))
			message = "【入库计划】审核成功 (审核通过)";
		else
			message = "【入库计划】审核成功 (审核未通过)";

		returnMsg.set("OK", message);
		return returnMsg;
	}

	private Object 出库计划_修改(Atzchurukjhd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-出库计划-修改-10 (2006786) 2012-11-15
		 */

		String message = null; // 提示信息

		String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人

		String churukyy = instance.getChurukyy(); // 出库原因

		if (churukyy == null || "".equals(churukyy.trim())) {
			message = "出库原因不能为空, 请维护！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		Long ckjhid = instance.getId(); // 出库计划ID

		String crkyys = ".52.6.10.54.56.58.62.65.4.9.22.14.8.2.25.26.12.20.28.30.16.34.36.38.40.42.44.46.48.50.67.69.";

		String crkyy = "." + churukyy + ".";

		if (crkyys.indexOf(crkyy) >= 0) {
			message = "出库计划与出库原因不对应！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		List<Atzchurukjhdmx> ckjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + ckjhid); // 出库计划明细List

		Atzchurukjhdmx ckjhdmx = null; // 出库计划明细

		Double initshuliang = null; // 计划数量

		Long wuliaoid = null; // 物料ID

		Atzwuliaojcxx wljcxx = null; // 物料基础信息

		// -----出库计划明细信息维护-----
		if (ckjhdmxs != null && ckjhdmxs.size() > 0) {
			for (int i = 0; i < ckjhdmxs.size(); i++) {
				ckjhdmx = ckjhdmxs.get(i);

				initshuliang = ckjhdmx.getInitshuliang();

				wuliaoid = ckjhdmx.getWuliaoid();

				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);

				if (wljcxx != null) {
					ckjhdmx.setWuliaobm(wljcxx.getWuliaobm()); // 物料编码
					ckjhdmx.setWuliaoms(wljcxx.getWuliaoms()); // 物料描述
					ckjhdmx.setGuigedw(wljcxx.getGuigedw()); // 规格单位
					ckjhdmx.setDanwei(wljcxx.getDanwei()); // 单位
				}

				ckjhdmx.setShuliang(initshuliang); // 调整后计划数量
				ckjhdmx.setWeicrksl(null); // 未完成数量

				dataset.update(ckjhdmx);
			}
		}

		String shifoufsh = instance.getShifoufsh(); // 是否反审核

		instance.setDanjulx("1"); // 单据类型: 出库
		instance.setShifouwc("2"); // 是否完成: 否
		if (shifoufsh == null)
			instance.setShifoufsh("2"); // 是否反审核: 否
		instance.setZhidanr(employeeName); // 计划员
		instance.setZuihouxgr(employeeName); // 最后修改人
		instance.setZuihouxgrq(new Date()); // 最后修改日期

		dataset.update(instance);

		message = "【出库计划】修改成功";

		returnMsg.set("OK", message);
		return returnMsg;
	}

	private Object 入库单_完成(Atzchurukd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-入库单-完成-10 (1763254) 2013-04-10 --调拨入库的原因是8也要修改设备在库
		 */
		String message = null; // 提示信息

		Date today = new Date();

		String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
		if (employeeName == null) {
			message = "系统管理员不能进行业务操作！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		String shifouzx = instance.getShifouzx(); // 是否执行: 1-是 2-否
		if ("1".equals(shifouzx)) {
			message = "入库单已执行！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		String rkr = instance.getChurukr(); // 入库人
		if (rkr == null || "".equals(rkr.trim())) {
			message = "入库人不能为空, 请维护！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		String zhidanr = instance.getZhidanr(); // 仓管员
		if (!employeeName.equals(zhidanr)) {
			message = "只有仓管员才能执行入库单完成操作！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		Long rkjhdid = instance.getChurukjhdid(); // 入库计划ID
		Atzchurukjhd rkjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, rkjhdid); // 入库计划
		if (rkjhd == null) {
			message = "入库计划不存在, 请联系系统管理员！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		Long rkdid = instance.getId(); // 入库单ID
		Long xiangmuid = instance.getXiangmuid(); // 项目ID
		String churukyy = instance.getChurukyy(); // 入库原因

		List<Atzchurukdmx> rkdmxs = dataset.getList("Atzchurukdmx",
				"atzchurukdid=" + rkdid + " order by wuliaobm,id ASC"); // 入库单明细List
		if (rkdmxs == null || rkdmxs.isEmpty()) {
			message = "入库单没有明细, 请检查！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		Atzchurukdmx rkdmx = null; // 入库单明细

		Long wuliaoid = null; // 物料ID
		String wuliaobm = null; // 物料编码
		String sn = null; // SN

		Atzwuliaojcxx wljcxx = null; // 物料基础信息

		String sngl = null; // SN管理: 1-是 2-否

		Atzshebeixx sbxx = null; // 设备信息

		String snerrpos = ""; // SN错误行号

		// -----验证设备序列号有效性(非在线物料退库)-----
		if (!"25".equals(churukyy) && !"4".equals(churukyy) && !"8".equals(churukyy)) {
			List<Atzchurukdmx> cfsnmxs = null; // 重复SN入库单明细List
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);
				wuliaoid = rkdmx.getWuliaoid();
				wuliaobm = rkdmx.getWuliaobm();
				sn = rkdmx.getSn();
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				sngl = wljcxx.getSngl();
				if (sngl == null) {
					message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 是否SN管理信息未设置, 无法入库！";
					returnMsg.set("NO", message);
					return returnMsg;
				}

				if ("1".equals(sngl)) {
					if (sn == null) {
						message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN 不能为空！";
						returnMsg.set("NO", message);
						return returnMsg;
					}

					cfsnmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + rkdid + " and sn='" + sn + "'");
					if (cfsnmxs != null && cfsnmxs.size() > 1) {
						message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 存在重复输入的 SN (" + sn + "), 请检查！";
						returnMsg.set("NO", message);
						return returnMsg;
					}

					sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx",
							"from Atzshebeixx where wuliaoid=" + wuliaoid + " and sn='" + sn + "'");

					if (sbxx == null) {
						if ("".equals(snerrpos))
							snerrpos += (i + 1);
						else
							snerrpos += ("," + (i + 1));
					}
				} else {
					rkdmx.setSn(null);

					dataset.update(rkdmx);
				}
			}

			if (!"".equals(snerrpos)) {
				message = "第 " + snerrpos + " 条入库单明细物料对应的 SN 不存在 (请查看设备信息)！";

				returnMsg.set("NO", message);
				return returnMsg;
			}
		}

		Long jianyandid = null; // 检验单ID
		Long jianyandmxid = null; // 检验单明细ID
		Atzjianyandmx jianyandmx = null; // 检验单明细

		// -----检验入库序列号有效性验证(非采购入库)-----
		if (!"4".equals(churukyy) && !"8".equals(churukyy)) {
			jianyandid = instance.getJianyandid();
			if (jianyandid != null) {
				String sns = ""; // 检验单明细 SN
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
					jianyandmxid = rkdmx.getJianyandmxid();
					jianyandmx = (Atzjianyandmx) dataset.getObject(Atzjianyandmx.class, jianyandmxid);

					sn = jianyandmx.getSn();

					if (sn != null && !"".equals(sn.trim())) {
						if ("".equals(sns))
							sns += sn;
						else
							sns += "," + sn;
					}
				}

				if (!"".equals(sns)) {
					for (int i = 0; i < rkdmxs.size(); i++) {
						rkdmx = rkdmxs.get(i);

						sn = rkdmx.getSn();
						if (sn != null) {
							if (sns.indexOf(sn) == -1) {
								message = "第 " + (i + 1) + " 条入库单明细输入的 SN 与备注中的 SN 不一致！";

								returnMsg.set("NO", message);
								return returnMsg;
							}
						}
					}
				}
			}
		}

		// -----借出SN正确性判断-----
		int crkyy = Integer.parseInt(churukyy);

		if (crkyy == 56 || crkyy == 34 || crkyy == 36 || crkyy == 38 || crkyy == 40 || crkyy == 42 || crkyy == 54
				|| crkyy == 16 || crkyy == 52) {
			Atzchurukjhd glckjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd",
					"from Atzchurukjhd where bianhao='" + rkjhd.getGlcrkjhdbh() + "'");

			if (glckjhd != null) {
				Long glckjhdid = glckjhd.getId();

				List<Atzchurukd> glckdlist = dataset.getList("Atzchurukd",
						"churukjhdid=" + glckjhdid + " and shifouzx='1'");

				if (glckdlist == null || glckdlist.isEmpty()) {
					message = "入库单没有借用时的出库信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				List<Atzchurukdmx> glckdmxs = null; // 关联出库单明细List

				String ghhql = null;

				// -----SN验证-----
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);

					sn = rkdmx.getSn();

					if (sn != null) {
						ghhql = "from Atzchurukdmx where atzchurukdid in (select id from Atzchurukd where churukjhdid="
								+ glckjhdid + ") and sn='" + sn + "'";

						glckdmxs = dataset.getListByHql("Atzchurukdmx", ghhql);

						if (glckdmxs == null || glckdmxs.isEmpty()) {
							message = "第 " + (i + 1) + " 条入库单明细输入的 SN (" + sn + ") 不是借出时的 SN！";

							returnMsg.set("NO", message);
							return returnMsg;
						}
					}
				}
			}
		}

		// -----维保SN正确性判断-----
		Long weibaosqdid = rkjhd.getWeibaosqdid(); // 维保申请单ID
		if (weibaosqdid != null) {
			Atzweibaosbsqd wbd = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class, weibaosqdid);

			String weibaodlx = wbd.getWeibaodlx(); // 维保単类型: 5-维保设备入库申请单
			// -----维修-----
			if ("5".equals(weibaodlx) || ("2".equals(weibaodlx) && "RE".indexOf(wbd.getBianhao()) > 0)) {
				Atzshebeisqdmx shebeisqdmx = null; // 维保设备申请单明细
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);

					sn = rkdmx.getSn();

					if (sn != null) {
						shebeisqdmx = (Atzshebeisqdmx) dataset.getObjectByHql("Atzshebeisqdmx",
								"from Atzshebeisqdmx where weibaosbsqdi=" + weibaosqdid + " and snhao='" + sn + "'");

						if (shebeisqdmx == null) {
							message = "第 " + (i + 1) + " 条入库单明细输入的 SN 与维保申请单中的 SN 不一致, 请检查！";

							returnMsg.set("NO", message);
							return returnMsg;
						}
					}
				}
			}
		}

		String hql = null;

		String pthql = null; // 普通hql
		String zxhql = null; // 在线hql

		Atzkucun ptkucun = null; // 普通库存
		Atzkucun zxkucun = null; // 在线库存

		Double zxl = null; // 在线量
		Double ptl = null; // 实际量

		Double rksl = null; // 入库数量

		Long kuweiid = null; // 库位ID
		Double meidwsl = null; // 每单位数量

		String cunfangwz = null; // 存放位置

		// -----在线物料退库-----
		if ("25".equals(churukyy)) {
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();

				wuliaobm = rkdmx.getWuliaobm();

				rksl = rkdmx.getShuliang();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
						+ kuweiid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				zxhql = hql + " and kucunlx='2'";
				pthql = hql + " and kucunlx='1'";

				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);

				if (zxkucun == null) {
					message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在线库存信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				zxl = zxkucun.getKucunzl();
				if (rksl.doubleValue() > zxl.doubleValue()) {
					message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 对应的在线库存量不足！";

					returnMsg.set("NO", message);
					return returnMsg;
				}
				zxkucun.setKucunzl(
						(new BigDecimal(Double.toString(zxl)).subtract(new BigDecimal(Double.toString(rksl))))
								.doubleValue());
				dataset.update(zxkucun);

				ptl = ptkucun.getKucunzl();
				ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).add(new BigDecimal(Double.toString(rksl))))
						.doubleValue());
				dataset.update(ptkucun);
			}
		}

		// -----非在线物料退库-----
		if (!"25".equals(churukyy)) {
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				jianyandmxid = rkdmx.getJianyandmxid();

				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();

				wuliaobm = rkdmx.getWuliaobm();
				cunfangwz = rkdmx.getCunfangwz();

				rksl = rkdmx.getShuliang();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
						+ kuweiid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				pthql = hql + " and kucunlx='1'";

				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);

				if (ptkucun != null) {
					ptkucun.setKeyongl((new BigDecimal(Double.toString(ptkucun.getKeyongl()))
							.add(new BigDecimal(Double.toString(rksl)))).doubleValue());
					ptkucun.setKucunzl((new BigDecimal(Double.toString(ptkucun.getKucunzl()))
							.add(new BigDecimal(Double.toString(rksl)))).doubleValue());

					if (ptkucun.getCunfangwz() == null)
						ptkucun.setCunfangwz(cunfangwz);

					dataset.update(ptkucun);
				} else {
					ptkucun = new Atzkucun();

					ptkucun.setKucunlx("1"); // 库存类型: 普通库存
					ptkucun.setXiangmuid(xiangmuid); // 项目ID
					ptkucun.setWuliaoid(wuliaoid); // 物料ID
					ptkucun.setKuweiid(kuweiid); // 库位ID
					ptkucun.setMeidwsl(meidwsl); // 每单位数量
					ptkucun.setKeyongl(rksl); // 可用量
					ptkucun.setKucunzl(rksl); // 库存量
					ptkucun.setCunfangwz(cunfangwz); // 存放位置

					dataset.add(ptkucun);
				}

				if (jianyandmxid != null) {
					jianyandmx = (Atzjianyandmx) dataset.getObject(Atzjianyandmx.class, jianyandmxid);

					jianyandmx.setYrkshuliang((new BigDecimal(Double.toString(jianyandmx.getYrkshuliang()))
							.add(new BigDecimal(Double.toString(rksl)))).doubleValue());
					jianyandmx.setWeirksl((new BigDecimal(Double.toString(jianyandmx.getWeirksl()))
							.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());

					dataset.update(jianyandmx);
				}
			}
		}

		Long rkjhmxid = null; // 入库计划明细ID
		Atzchurukjhdmx rkjhdmx = null; // 入库计划明细

		Double weicrksl = null; // 未完成数量

		// -----更新入库计划单明细中的未完成数量-----
		for (int i = 0; i < rkdmxs.size(); i++) {
			rkdmx = rkdmxs.get(i);

			rkjhmxid = rkdmx.getCrkjhmxid();
			rksl = rkdmx.getShuliang();

			rkjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, rkjhmxid);

			if (rkjhdmx == null) {
				message = "第 " + (i + 1) + " 条入库单明细信息不完整, 请联系系统管理员！";

				returnMsg.set("NO", message);
				return returnMsg;
			}

			weicrksl = rkjhdmx.getWeicrksl();

			if (rksl.doubleValue() > weicrksl.doubleValue()) {
				message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 已超计划数量！";

				returnMsg.set("NO", message);
				return returnMsg;
			}

			rkjhdmx.setWeicrksl(
					(new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(rksl))))
							.doubleValue());
			dataset.update(rkjhdmx);
		}

		// -----采购入库时, 减少在途库存量-----
		if ("4".equals(churukyy)) {
			String zthql = null; // 在途hql

			Atzkucun ztkucun = null; // 在途库存
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();

				wuliaobm = rkdmx.getWuliaobm();

				rksl = rkdmx.getShuliang();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				zthql = hql + " and kucunlx='3'";

				ztkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zthql);

				if (ztkucun == null) {
					message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在途库存信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				ztkucun.setKeyongl((new BigDecimal(Double.toString(ztkucun.getKeyongl()))
						.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
				ztkucun.setKucunzl((new BigDecimal(Double.toString(ztkucun.getKucunzl()))
						.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());

				if (ztkucun.getKeyongl() < 0.0) {
					ztkucun.setKeyongl(0.0);
					ztkucun.setKucunzl(0.0);
				}

				dataset.update(ztkucun);

			}
		}

		// -----加工任务单入库时, 减少生产在线库存量-----
		if ("2".equals(churukyy)) {
			String sczxhql = null; // 生产在线hql

			Atzkucun sczxkucun = null; // 生产在线库存
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();

				wuliaobm = rkdmx.getWuliaobm();

				rksl = rkdmx.getShuliang();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				sczxhql = hql + " and kucunlx='4'";

				sczxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", sczxhql);

				if (sczxkucun != null) {
					sczxkucun.setKeyongl((new BigDecimal(Double.toString(sczxkucun.getKeyongl()))
							.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					sczxkucun.setKucunzl((new BigDecimal(Double.toString(sczxkucun.getKucunzl()))
							.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());

					if (sczxkucun.getKeyongl() < 0.0) {
						sczxkucun.setKeyongl(0.0);
						sczxkucun.setKucunzl(0.0);
					}

					dataset.update(sczxkucun);
				}
			}
		}

		// -----测试完成入库时, 减少测试在线库存量-----
		if ("12".equals(churukyy)) {
			String cszxhql = null; // 测试在线hql

			Atzkucun cszxkucun = null; // 测试在线库存
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();

				wuliaobm = rkdmx.getWuliaobm();

				rksl = rkdmx.getShuliang();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				cszxhql = hql + " and kucunlx='5'";

				cszxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", cszxhql);

				if (cszxkucun == null) {
					message = "第 " + (i + 1) + " 行入库单明细物料 (" + wuliaobm + ") 没有对应的测试在线库存信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				cszxkucun.setKeyongl((new BigDecimal(Double.toString(cszxkucun.getKeyongl()))
						.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
				cszxkucun.setKucunzl((new BigDecimal(Double.toString(cszxkucun.getKucunzl()))
						.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());

				if (cszxkucun.getKeyongl() < 0.0) {
					cszxkucun.setKeyongl(0.0);
					cszxkucun.setKucunzl(0.0);
				}

				dataset.update(cszxkucun);
			}
		}

		// -----更新设备信息中的是否在库状态-----
		if (!"25".equals(churukyy) && !"4".equals(churukyy)) {
			List<Atzchurukls> snlss = null; // 出入库流水

			String shifouzk = null; // 单板状态: 1-仓库中 2-已发货 3-加工中 4-测试中 5-维修中 6-检验中
									// 7-维保已申请 8-借用中
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				sn = rkdmx.getSn();

				if (sn != null) {
					sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx",
							"from Atzshebeixx where sn='" + sn + "'");

					shifouzk = sbxx.getShifouzk();

					if ("9".equals(shifouzk)) {
						message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn + ") 已报废 (请查看设备信息管理)！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					if ("10".equals(shifouzk)) {
						message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn + ") 已处理 (请查看设备信息管理)！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					snlss = dataset.getList("Atzchurukls", "sn='" + sn + "'");

					if (snlss != null && snlss.size() > 0) {
						if ("1".equals(shifouzk)) {
							message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn
									+ ") 已在库 (请查看物料跟踪信息)！";

							returnMsg.set("NO", message);
							return returnMsg;
						}
					}

					sbxx.setShifouzk("1"); // 单板状态: 1-仓库中

					dataset.update(sbxx);
				}
			}
		}

		Atzchurukls rkls = null; // 入库流水

		Long rkdmxid = null; // 入库单明细ID

		Double bencijhsl = null; // 本次计划数量

		// -----生成入库流水-----
		for (int i = 0; i < rkdmxs.size(); i++) {
			rkdmx = rkdmxs.get(i);

			rkdmxid = rkdmx.getId();

			wuliaoid = rkdmx.getWuliaoid();
			kuweiid = rkdmx.getKuweiid();
			meidwsl = rkdmx.getMeidwsl();

			sn = rkdmx.getSn();
			bencijhsl = rkdmx.getBencijhsl();
			rksl = rkdmx.getShuliang();
			cunfangwz = rkdmx.getCunfangwz();

			rkls = new Atzchurukls();

			rkls.setChurukjhdid(rkjhdid); // 入库计划单ID
			rkls.setChurukdid(rkdid); // 入库单ID
			rkls.setChurukdmxid(rkdmxid); // 入库单明细ID
			rkls.setChuruklx("2"); // 类型: 入库
			rkls.setChurukyy(churukyy); // 出库原因
			rkls.setXiangmuid(xiangmuid); // 项目ID
			rkls.setWuliaoid(wuliaoid); // 物料ID
			rkls.setKuweiid(kuweiid); // 库位ID
			rkls.setMeidwsl(meidwsl); // 每单位数量
			rkls.setSn(sn); // 序列号
			rkls.setBencijhsl(bencijhsl); // 本次计划数量
			rkls.setShuliang(rksl); // 数量
			rkls.setChurukr(rkr); // 经办人
			rkls.setRiqi(today); // 日期
			rkls.setCunfangwz(cunfangwz); // 存放位置

			dataset.add(rkls);
		}

		// -----维护入库计划是否完成字段-----
		Double wrksl = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "weicrksl", "atzchurukjhdid=" + rkjhdid));
		if (wrksl.doubleValue() <= 0)
			rkjhd.setShifouwc("1"); // 是否完成: 已完成
		else
			rkjhd.setShifouwc("2"); // 是否完成: 未完成

		dataset.update(rkjhd);

		String shifouwc = rkjhd.getShifouwc(); // 是否完成: 1-已完成 2-未完成

		// -----维护生产任务完成状态-----
		if ("1".equals(shifouwc)) {
			Long scrwid = rkjhd.getScrwdid(); // 生产任务ID

			if (scrwid != null) {
				Atzscrw scrw = (Atzscrw) dataset.getObject("Atzscrw", scrwid);
				if (scrw != null) {
					scrw.setShifouygb("1"); // 是否已关闭: 1-是 2-否

					dataset.update(scrw);
				}
			}
		}

		jianyandid = instance.getJianyandid();

		Atzjianyand jianyand = null; // 检验单

		if (jianyandid != null) {
			jianyand = (Atzjianyand) dataset.getObject(Atzjianyand.class, jianyandid);
		}

		// -----采购入库-----
		if ("4".equals(churukyy)) {
			Long caigouhtid = jianyand.getCaigouhtid(); // 采购合同ID
			Long daohuotzdid = jianyand.getDaohuotzdid(); // 到货通知单ID
			if (caigouhtid == null || daohuotzdid == null) {
				message = "检验单信息有误, 请联系系统管理员！";
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Atzcaigouht cght = (Atzcaigouht) dataset.getObject(Atzcaigouht.class, caigouhtid); // 采购合同
			Atzcaigouhtmx cghtmx = null; // 采购合同明细
			Atzcaigougz cggz = null; // 采购跟踪
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);
				wuliaoid = rkdmx.getWuliaoid();
				rksl = rkdmx.getShuliang(); // 入库数量

				// 06 修改
				// -----维护对应采购合同明细中的未入库数量-----
				// cghtmx = (Atzcaigouhtmx)
				// dataset.getObjectByHql("Atzcaigouhtmx",
				// "from Atzcaigouhtmx where caigouhtid=" + caigouhtid +
				// " and wuliaoid=" + wuliaoid);
				cghtmx = (Atzcaigouhtmx) dataset.getObjectByHql("Atzcaigouhtmx",
						"from Atzcaigouhtmx where id in (select caigouhtmxid from Atzjianyandmx where id="
								+ rkdmx.getJianyandmxid() + ")");

				cghtmx.setWeirksl((new BigDecimal(Double.toString(cghtmx.getWeirksl()))
						.subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
				dataset.update(cghtmx);

				if (cghtmx.getWeirksl() < 0.0) {
					message = "采购入库已超出合同数量, 请联系系统管理员！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				// 06 修改
				// -----维护采购跟踪中的实际到货数量, 如果全部到货则关闭该采购跟踪-----
				// cggz = (Atzcaigougz) dataset.getObjectByHql("Atzcaigougz",
				// "from Atzcaigougz where caigouhtid=" + caigouhtid +
				// " and wuliaoid=" + wuliaoid);
				cggz = (Atzcaigougz) dataset.getObjectByHql("Atzcaigougz",
						"from Atzcaigougz where caigouhtid=" + caigouhtid
								+ " and hetongmxid in (select caigouhtmxid from Atzjianyandmx where id="
								+ rkdmx.getJianyandmxid() + ") and wuliaoid=" + wuliaoid);

				if (cggz == null) {
					message = "没有对应的采购跟踪信息, 请联系系统管理员！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				if (cggz.getShijidhsl() == null)
					cggz.setShijidhsl(0.0);

				if (cggz.getSjcgsl() == null)
					cggz.setSjcgsl(0.0);

				cggz.setShijidhsl((new BigDecimal(Double.toString(cggz.getShijidhsl()))
						.add(new BigDecimal(Double.toString(rksl)))).doubleValue()); // 实际到货数量
				cggz.setShijidhrq(today); // 实际到货日期

				if (cggz.getShijidhsl() >= cggz.getSjcgsl()) {
					cggz.setZhiliangwt("否"); // 是否质量问题: 否
					cggz.setDangqianzxzt("2"); // 当前执行状态: OK
				}

				dataset.update(cggz);

				// 通知 采购需求申请人 06H
				// 得到采购需求
				String cgxqsql = "from Atzcaigoujh where danjulx='0' and "
						+ " id in (select caigouxqid from Atzcaigouxqmx where "
						+ "  atzcaigoujhid in (select caigoujh from Atzcaigoujhmx where "
						+ "  id in(select caigoujhmxid from Atzcaigouhtmx where id=" + cghtmx.getId()
						+ "))) and id in (select caigoujh from Atzcaigoujhmx" + " where wuliaoid=" + rkdmx.getWuliaoid()
						+ ")";

				List<Atzcaigoujh> cgxqlist = dataset.getListByHql("Atzcaigoujh", cgxqsql);
				if (cgxqlist != null && cgxqlist.size() > 0) {
					for (int j = 0; j < cgxqlist.size(); j++) {
						Long tzrid = cgxqlist.get(j).getTianzhirid();// 申请人
						String cgxqbh = cgxqlist.get(j).getBianhao();// 采购需求编号
						// 通过团队员工获取员工id
						Atztdyg tdyg = (Atztdyg) dataset.getObject(Atztdyg.class, tzrid);
						if (tdyg != null) {
							String empid = "" + tdyg.getYuangongid();
							String zhuti = "到货通知:编号为" + cgxqbh + "的采购需求,编码为" + rkdmx.getWuliaobm() + "的物料已到货,到货数量为："
									+ rksl;
							// rkdmx.getWuliaoid()
							String neirong = zhuti;
							logger.debug(empid + "-" + zhuti + "-" + neirong);
							// 调用规则，启动提醒流程
							Map map = new HashMap();
							map.put("empid", empid);
							map.put("zhuti", zhuti);
							map.put("neirong", neirong);
							ReturnMsg re = (ReturnMsg) execAdjRule("A-提醒提交功能-接口-06H", map);
							logger.debug("提醒流程提交：" + re.getKey() + "；提示信息：" + re.getValue());
						}
					}
				}

			}

			// -----判断合同下所有明细的未入库数量, 如果总和为零, 则生成待付款信息-----
			Double htsum = Double.parseDouble(dataset.sum("Atzcaigouhtmx", "weirksl", "caigouhtid=" + caigouhtid));
			if (htsum.doubleValue() == 0.0) {
				// -生成待付款信息-
				List<Atzhetongfkjd> htfkjds = dataset.getListByHql("Atzhetongfkjd",
						"from Atzhetongfkjd where atzcaigouhtid=" + caigouhtid + " and fukuanlx='2'"); // 合同付款阶段List

				if (htfkjds != null && htfkjds.size() > 0) {
					DecimalFormat df = new DecimalFormat("###.0000");

					Atzhetongfkjd htfkjd = null; // 合同付款阶段
					String fukuantk = null; // 付款条款

					Atzdfukuanxx dfkxx = null; // 待付款信息

					Calendar rightNow = null;
					for (int i = 0; i < htfkjds.size(); i++) {
						htfkjd = htfkjds.get(i);

						fukuantk = htfkjd.getFukuantk();

						if (fukuantk == null) {
							message = "采购合同付款阶段中的付款条款为空, 无法入库！";

							returnMsg.set("NO", message);
							return returnMsg;
						}

						dfkxx = new Atzdfukuanxx();

						dfkxx.setCaigouhtid(caigouhtid); // 采购合同ID
						dfkxx.setGongyings(cght.getGongyings()); // 供应商
						dfkxx.setFukuanlx(htfkjd.getFukuanlx()); // 付款类型
						dfkxx.setFukuantk(fukuantk); // 付款条款
						dfkxx.setBizhongid(cght.getBizhongid()); // 币种ID

						// -根据付款条款, 计算出付款时间和付款金额-
						rightNow = Calendar.getInstance();

						if ("2".equals(fukuantk)) {
							rightNow.add(Calendar.DAY_OF_MONTH, 30);
						} else if ("3".equals(fukuantk)) {
							rightNow.add(Calendar.DAY_OF_MONTH, 45);
						} else if ("4".equals(fukuantk)) {
							rightNow.add(Calendar.DAY_OF_MONTH, 60);
						} else if ("5".equals(fukuantk)) {
							rightNow.add(Calendar.DAY_OF_MONTH, 80);
						} else if ("6".equals(fukuantk)) {
							rightNow.add(Calendar.DAY_OF_MONTH, 90);
						}

						dfkxx.setFukuansj(rightNow.getTime()); // 付款时间
						dfkxx.setFukuanje(
								Double.parseDouble(df.format(cght.getHetongzj() * htfkjd.getFukuanbl()).toString())); // 付款金额

						dfkxx.setShifouzx("2"); // 是否执行: 否

						dataset.add(dfkxx);
					}
				}

				cght.setZhixingzt("3"); // 执行状态: 执行完成

				dataset.update(cght);
			}

			Long cgjhid = rkjhd.getCaigoujhid(); // 采购计划ID

			Atzcaigoujh cgjh = (Atzcaigoujh) dataset.getObject(Atzcaigoujh.class, cgjhid); // 采购计划

			// -----若入库计划完成, 则关闭对应的采购计划单-----
			/*
			 * if("1".equals(shifouwc)) { cgjh.setZhixingzt("3"); // 执行状态: 执行完成
			 * 
			 * dataset.update(cgjh); }
			 */

			// -----当采购计划对应的采购合同都关闭时, 将采购计划的执行状态改为执行完成-----
			List<Atzcaigoujhmx> caigoujhmxs = dataset.getList("Atzcaigoujhmx", "caigoujh=" + cgjhid); // 采购计划明细List

			Atzcaigoujhmx caigoujhmx = null; // 采购计划明细

			String shifouyzx = null; // 是否已执行: 1-是 2-否

			boolean flag = true;
			if (caigoujhmxs != null && caigoujhmxs.size() > 0) {
				for (int i = 0; i < caigoujhmxs.size(); i++) {
					caigoujhmx = caigoujhmxs.get(i);

					shifouyzx = caigoujhmx.getShifouyzx();

					if (!"1".equals(shifouyzx)) {
						flag = false;
						break;
					}
				}
			}

			if (flag) {
				// 06H 修改
				// List<Atzcaigouht> caigouhts = dataset.getList("Atzcaigouht",
				// "caigoujhid=" + cgjhid); // 采购合同List
				String cghtsql = "id in (select caigouhtid from Atzcaigouhtmx where caigoujhmxid in (select id from Atzcaigoujhmx where caigoujh="
						+ cgjhid + "))";
				List<Atzcaigouht> caigouhts = dataset.getList("Atzcaigouht", cghtsql); // 采购合同List

				String zhixingzt = null; // 执行状态: 1-未执行 2-执行中 3-执行完成
				if (caigouhts != null && caigouhts.size() > 0) {
					for (int j = 0; j < caigouhts.size(); j++) {
						cght = caigouhts.get(j);
						zhixingzt = cght.getZhixingzt();
						if (!"3".equals(zhixingzt)) {
							flag = false;
							break;
						}
					}
				}
			}

			if (flag) {
				cgjh.setZhixingzt("3"); // 执行状态: 执行完成

				dataset.update(cgjh);

				List<Atzchurukjhd> jhds = dataset.getList("Atzchurukjhd", "caigoujhid=" + cgjhid);

				Atzchurukjhd jhd = null; // 入库计划

				if (jhds != null && jhds.size() > 0) {
					for (int i = 0; i < jhds.size(); i++) {
						jhd = jhds.get(i);

						jhd.setShifouwc("1"); // 是否完成: 是

						dataset.update(jhd);
					}
				}
			}
		}

		// -----维护到期日期-----
		Date daoqirq = null; // 到期日期

		for (int i = 0; i < rkdmxs.size(); i++) {
			rkdmx = rkdmxs.get(i);

			daoqirq = rkdmx.getDaoqirq();

			// 采购入库时, 到期日期不能为空
			/*
			 * if ("4".equals(churukyy)) { if (daoqirq == null) { message =
			 * "采购入库时, 到期日期必须维护！"; returnMsg.set("NO", message); return
			 * returnMsg; } }
			 */

			if (daoqirq != null) {
				wuliaoid = rkdmx.getWuliaoid();

				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);

				wljcxx.setDaoqirq(daoqirq); // 到期日期

				dataset.update(wljcxx);
			}
		}

		paramMap.put("danjulx", "17"); // 设置编码规则

		String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);

		if ("流水号溢出".equals(rValue))
			message = "入库单流水号溢出！";
		else if ("Error".equals(rValue))
			message = "生成入库单编号有误, 请联系系统管理员！";

		if (message != null) {
			returnMsg.set("NO", message);
			return returnMsg;
		}

		instance.setBianhao(rValue); // 编号
		instance.setChurukrq(today); // 入库日期
		instance.setShifouzx("1"); // 是否执行: 是

		dataset.update(instance);

		// -----根据检验单入库时, 如果都已经入库, 则关闭检验单-----
		if (jianyandid != null) {
			Double zrksl = Double.parseDouble(dataset.sum("Atzchurukdmx", "shuliang",
					"atzchurukdid in (select id from Atzchurukd where jianyandid=" + jianyandid
							+ " and shifouzx='1')")); // 总入库数量
			Double zshidiansl = Double.parseDouble(
					dataset.sum("Atzjianyandmx", "shidiansl", "atzjianyandid=" + jianyandid + " and jianyanjg!='2'")); // 总实点数量

			if (zrksl.doubleValue() >= zshidiansl.doubleValue()) {
				jianyand.setJianyandzt("4"); // 检验单状态: 入库完成

				dataset.update(jianyand);
			}
		}

		String ckr = null; // 借出领用人

		// -----借用领用信息维护-----
		if ("38".equals(churukyy) || "40".equals(churukyy) || "42".equals(churukyy) || "34".equals(churukyy)
				|| "36".equals(churukyy) || "16".equals(churukyy) || "46".equals(churukyy) || "48".equals(churukyy)
				|| "54".equals(churukyy) || "56".equals(churukyy)) {
			String jylyhql = null;

			Atzjylyqingdan jylyqingdan = null; // 借用领用清单

			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();
				meidwsl = rkdmx.getMeidwsl();

				sn = rkdmx.getSn();
				rksl = rkdmx.getShuliang();

				jylyhql = "from Atzjylyqingdan where ghzhuangt = '2' and wuliaoid=" + wuliaoid;

				if (meidwsl != null)
					jylyhql += " and meidwsl=" + meidwsl;
				else
					jylyhql += " and meidwsl is null";

				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);

				sngl = wljcxx.getSngl();

				if ("1".equals(sngl)) {
					jylyhql += " and sn='" + sn + "'";

					jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);

					if (jylyqingdan != null) {
						ckr = jylyqingdan.getChurukr();

						if (!rkr.equals(ckr)) {
							message = "第 " + (i + 1) + " 条入库单明细的 SN 借出领用人是 (" + ckr + "), 请查看借用领用信息！";

							returnMsg.set("NO", message);
							return returnMsg;
						}

						jylyqingdan.setYuanyin(churukyy); // 原因
						// jylyqingdan.setRiqi(today); // 日期
						jylyqingdan.setGhzhuangt("1"); // 归还状态: 已归还
						// 维护入库单计划编号
						jylyqingdan.setRkjhdh(rkjhd.getBianhao());
						dataset.update(jylyqingdan);
					} else {
						jylyqingdan = new Atzjylyqingdan();

						jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
						jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
						jylyqingdan.setSn(sn); // 序列号
						jylyqingdan.setShuliang(1.0); // 数量
						jylyqingdan.setYuanyin(churukyy); // 原因
						jylyqingdan.setChurukr(rkr); // 经办人
						jylyqingdan.setRiqi(today); // 日期
						jylyqingdan.setGhzhuangt("1"); // 归还状态: 已归还
						// 维护入库单计划编号
						jylyqingdan.setRkjhdh(rkjhd.getBianhao());
						dataset.add(jylyqingdan);
					}
				} else {
					if ("38".equals(churukyy)) {
						jylyhql += " and yuanyin='37' and churukr='" + rkr + "'";
					} else if ("40".equals(churukyy)) {
						jylyhql += " and yuanyin='39' and churukr='" + rkr + "'";
					} else if ("42".equals(churukyy)) {
						jylyhql += " and yuanyin='41' and churukr='" + rkr + "'";
					} else if ("34".equals(churukyy)) {
						jylyhql += " and yuanyin='33' and churukr='" + rkr + "'";
					} else if ("36".equals(churukyy)) {
						jylyhql += " and yuanyin='35' and churukr='" + rkr + "'";
					} else if ("52".equals(churukyy)) {
						jylyhql += " and yuanyin='51' and churukr='" + rkr + "'";
					} else if ("16".equals(churukyy)) {
						jylyhql += " and (yuanyin='15' or yuanyin='17') and churukr='" + rkr + "'";
					} else {
						jylyhql += " and churukr='" + rkr + "'";
					}

					jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);

					if (jylyqingdan == null) {
						message = "归还人 (" + rkr + ") 无借用领用信息, 请查看借用领用清单！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					if (jylyqingdan != null) {
						jylyqingdan.setShuliang(jylyqingdan.getShuliang() - rksl); // 数量
						jylyqingdan.setRiqi(today); // 日期
						// 维护入库单计划编号
						jylyqingdan.setRkjhdh(rkjhd.getBianhao());
						dataset.update(jylyqingdan);

						if (jylyqingdan.getShuliang().doubleValue() < 0) {
							message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的归还人 (" + rkr + ") 归还数已超过借用领用数！";

							returnMsg.set("NO", message);
							return returnMsg;
						}

						if (jylyqingdan.getShuliang().doubleValue() == 0) {
							dataset.delete(jylyqingdan);
						}
					}
				}
			}
		}

		// -----维护研发试制实际入库日-----
		Long scjhid = rkjhd.getScjhid(); // 生产计划ID

		if (scjhid != null) {
			Atzscjhmx scjhmx = null; // 生产计划明细
			Long yfszid = null; // 研发试制ID
			Atzyanfasz yanfasz = null; // 研发试制
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);

				wuliaoid = rkdmx.getWuliaoid();

				scjhmx = (Atzscjhmx) dataset.getObjectByHql("Atzscjhmx", "from Atzscjhmx where atzscjhid=" + scjhid
						+ " and wuliaoid=" + wuliaoid + " and yfszid is not null");

				if (scjhmx != null) {
					yfszid = scjhmx.getYfszid();

					yanfasz = (Atzyanfasz) dataset.getObject(Atzyanfasz.class, yfszid);

					if (yanfasz != null) {
						yanfasz.setShijirkr(today); // 实际入库日

						dataset.update(yanfasz);
					}
				}
			}
		}

		// 根据sn来增加库存明细，生成设备信息 06H
		String mxsql = null;
		List<Atzshebeixx> sbxxlist = null;
		for (int i = 0; i < rkdmxs.size(); i++) {
			rkdmx = rkdmxs.get(i);
			wuliaoid = rkdmx.getWuliaoid();
			kuweiid = rkdmx.getKuweiid();
			sn = rkdmx.getSn();
			wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);

			hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
					+ kuweiid;

			if (meidwsl != null)
				hql += " and meidwsl=" + meidwsl;
			else
				hql += " and meidwsl is null";

			pthql = hql + " and kucunlx='1'";
			zxhql = hql + " and kucunlx='2'";

			ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
			zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
			if (ptkucun == null) {
				message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的库存信息有误！";
				returnMsg.set("NO", message);
				return returnMsg;
			}
			if (wljcxx != null && "1".equals(wljcxx.getSngl())) {
				if (sn != null && !"".equals(sn)) {
					// 生成设备信息
					if ("4".equals(churukyy) || "8".equals(churukyy)) {
						// 判断sn是否已存在设备信息中
						sbxxlist = dataset.getList("Atzshebeixx", "sn='" + sn.trim() + "'");
						if (sbxxlist != null && sbxxlist.size() > 0) {

						} else {
							Atzshebeixx newsbxx = new Atzshebeixx();
							newsbxx.setSn(sn.trim());
							newsbxx.setWuliaoid(wuliaoid);
							newsbxx.setLurur("admin");
							newsbxx.setLururq(new Date());
							newsbxx.setShifouzk("1");// 仓库中
							newsbxx.setBeizhu("采购入库");
							dataset.add(newsbxx);

						}

					}
					// 如果是物料入在线则删除在线库存下的明细
					if ("25".equals(churukyy)) {
						if (zxkucun == null) {
							message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在线库存信息！";
							returnMsg.set("NO", message);
							return returnMsg;
						}
						mxsql = "from Atzkucunmx where kucunid=" + zxkucun.getId() + " and wuliaoid=" + wuliaoid
								+ " and sn='" + sn.trim() + "'";
						Atzkucunmx nkcmx = (Atzkucunmx) dataset.getObjectByHql("Atzkucunmx", mxsql);
						if (nkcmx != null)
							dataset.delete(nkcmx);
					}
					// 普通库存新增明细
					Atzkucunmx kcmx = new Atzkucunmx();
					kcmx.setKucunid(ptkucun.getId());
					kcmx.setSn(sn.trim());
					kcmx.setWuliaoid(wuliaoid);
					kcmx.setShuliang(1d);
					kcmx.setWuliaozt("1");// 正常
					dataset.add(kcmx);
				} else {
					message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 是sn管理,请输入sn号！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}
		}

		/**
		 * 维保更换出库完成自动更新现场设备配置信息（前提：出入库均已完成） 作者:06
		 * 
		 */

		if ("6".equals(churukyy)) {
			Atzchurukjhd rkjhd06 = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, instance.getChurukjhdid());
			boolean flag06 = false;
			if (rkjhd06 != null && "1".equals(rkjhd06.getShifouwc())) {
				Atzweibaosbsqd rkwbd06 = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class,
						rkjhd06.getWeibaosqdid());
				if (rkwbd06 != null) {

					List<Atzchurukjhd> ckjhdList06 = dataset.getListByHql("Atzchurukjhd",
							" from Atzchurukjhd where weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
									+ rkwbd06.getBianhao().substring(0, rkwbd06.getBianhao().length() - 1) + "')");
					Atzchurukjhd jhd06 = null;
					if (ckjhdList06 != null && ckjhdList06.size() > 0) {
						jhd06 = ckjhdList06.get(0);

					}

					if (jhd06 != null && "1".equals(jhd06.getShifouwc()) && "5".equals(jhd06.getChurukyy())) {
						flag06 = true;

					} else {
						flag06 = false;
					}

					if (flag06) {

						// 根据出库流水和入库流水自动更新设备配置信息.以出库做为循环条件，没出的记录无需更新
						List<Atzchurukls> cklsList06 = dataset.getListByHql("Atzchurukls",
								" from Atzchurukls where churukjhdid=" + jhd06.getId());
						List<Atzchurukls> rklsList06 = dataset.getListByHql("Atzchurukls",
								" from Atzchurukls where churukjhdid=" + rkjhd06.getId());
						for (int i06 = 0; i06 < cklsList06.size(); i06++) {

							Atzchurukls ckls06 = cklsList06.get(i06);
							if (ckls06 != null && ckls06.getSn() != null) {

								if (rklsList06 != null && rklsList06.size() > i06) {

									Atzchurukls rkls06 = rklsList06.get(i06);
									if (rkls06 != null && rkls06.getSn() != null) {

										// 执行更新
										String update06 = "update Atzshebeipzxx set wuliaosn    = '" + ckls06.getSn()
												+ "',wuliaoid=" + ckls06.getWuliaoid() + " where  wuliaosn='"
												+ rkls06.getSn() + "'";
										dataset.batchUpdate("Atzshebeipzxx", update06);
									}

								}

							}

						}
					}

				}

			}

		}
		/**
		 * 合同退库, 维护设备清单退库已入库数量 by lzz
		 */
		if ("10".equals(churukyy)) {
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = (Atzchurukdmx) rkdmxs.get(i);
				Atzhetongtk tk = (Atzhetongtk) dataset.getObject(Atzhetongtk.class, rkjhd.getHetongtkid());
				hql = "from Atzhetongtkmx where hetongtkid=" + rkjhd.getHetongtkid() + " and wuliaobmid="
						+ rkdmx.getWuliaoid();
				if (rkdmx.getSn() != null && !"".equals(rkdmx.getSn())) {
					hql = hql + " and sn='" + rkdmx.getSn() + "'";
				}
				logger.debug(hql);
				Atzhetongtkmx tkmx = (Atzhetongtkmx) dataset.getObjectByHql("Atzhetongtkmx", hql);
				if (tkmx == null) {
					returnMsg.set("NO", "合同退库, 第" + (i + 1) + "条明细找不到退库单信息,请检查物料或sn信息");
					return returnMsg;
				}
				hql = "from Atzshebeiqdmx where hetongid=" + tk.getHetongid() + " and xiaoshoubmid="
						+ tkmx.getXiaoshoubmid();
				logger.debug(hql);
				Atzshebeiqdmx sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx", hql);
				logger.debug("sbqd=====" + sbqd.getId());
				if (sbqd == null) {
					returnMsg.set("NO", "合同退库, 第" + (i + 1) + "条明细在找不到合同设备清单信息,请检查物料或sn信息");
					return returnMsg;
				}
				sbqd.setTuikusl(com.actiz.util.MathUtil.add(sbqd.getTuikusl(), rkdmx.getShuliang()));
				dataset.update(sbqd);
				Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, tkmx.getFahuoqdid());
				if (fhqd != null && sbqd != null) {
					fhqd.setShuliang(com.actiz.util.MathUtil.sub(fhqd.getShuliang(), rkdmx.getShuliang()));
					fhqd.setTkshuliang(com.actiz.util.MathUtil.sub(fhqd.getTkshuliang(), rkdmx.getShuliang()));
					if (fhqd.getShuliang().compareTo(0d) <= 0) {
						fhqd.setBeizhu("已退库");
					} else {
						fhqd.setBeizhu("部分退库");
					}
					dataset.update(fhqd);
				}
				// 新增一条退库清单记录
				Atzfahuoqingdan nfhqd = (Atzfahuoqingdan) dataset.getObjectByHql("Atzfahuoqingdan",
						"from Atzfahuoqingdan where sn is null and zt='2' and wuliaoid=" + rkdmx.getWuliaoid()
								+ " and Hetongtkid=" + tk.getId());
				if (nfhqd == null) {
					nfhqd = new Atzfahuoqingdan();
					nfhqd.setFahuotzdid(fhqd.getFahuotzdid());
					nfhqd.setHetongid(fhqd.getHetongid());
					nfhqd.setXiaoshoubmid(fhqd.getXiaoshoubmid());
					nfhqd.setWuliaoid(fhqd.getWuliaoid());
					nfhqd.setShuliang(0D);
					nfhqd.setSn(fhqd.getSn());
					nfhqd.setFahuosj(fhqd.getFahuosj());
					nfhqd.setTkshuliang(0d);
					nfhqd.setZt("2");
					nfhqd.setSjtksl(rkdmx.getShuliang());
					nfhqd.setTuihuosj(today);
					nfhqd.setHetongtkid(tk.getId());
					dataset.add(nfhqd);
				} else {
					nfhqd.setShuliang(com.actiz.util.MathUtil.add(nfhqd.getShuliang(), rkdmx.getShuliang()));
					dataset.update(nfhqd);
				}
			}
		}

		/**
		 * 维修入库完成后，自动产生测试任务单 作者:12 测试任务的任务接受人？ 开始
		 */

		if ("58".equals(churukyy)) {
			// 维修完成入库，新增一条测试生产任务。

			// 首先根据单据类型生成单据编号
			paramMap.put("danjulx", "7");// 7为生产任务

			rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
			logger.info("~~~A-生产任务-新增（前置）-08~~~rValue =" + rValue);
			if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "请先设置编码规则");
				return returnMsg;
			} else if ("Error".equals(rValue)) {
				returnMsg.set("NO", "生成编号时出错了，请联系管理员！");
				return returnMsg;
			} else {
				Atzscrw scrw = new Atzscrw(); // 新增
				scrw.setBianhao(rValue);// 编号
				scrw.setLinshibh(rValue);// 临时编号
				Object obj = request.getSession().getAttribute("employeeName");
				String str = obj == null ? "admin" : String.valueOf(obj);
				scrw.setJiagongdw("测试维修组");
				scrw.setScrwdlx("2");// 任务类型：测试任务
				scrw.setShenhezt("1");// 审核状态 未提交
				scrw.setDanjusc("2");// 单据生成 上级单据
				scrw.setShifouygb("2");// 是否已关闭 否
				scrw.setRwjsr(null);// 任务接受人未定？
				scrw.setBeizhu("");
				scrw.setLurur(str);
				scrw.setLururq(today);
				dataset.add(scrw);

				List<Atzchurukdmx> mxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + instance.getId());
				for (int i12 = 0; i12 < mxs.size(); i12++) {
					Atzchurukdmx mx = mxs.get(i12);
					Atzscrwmx scrwmx = new Atzscrwmx();
					scrwmx.setAtzscrwid(scrw.getId());
					scrwmx.setXiangmuid(instance.getXiangmuid());
					scrwmx.setWuliaoid(mx.getWuliaoid());
					scrwmx.setMeidwsl(mx.getMeidwsl());
					scrwmx.setShuliang(mx.getShuliang());
					scrwmx.setWeisjsl(mx.getShuliang());
					scrwmx.setJihuawcrq(today);
					scrwmx.setLururq(today);
					dataset.add(scrwmx);
				}
			}
		}
		// 维修入库完成后，自动产生测试任务单
		// 结束
		message = "【入库单】执行完成";

		returnMsg.set("OK", message);
		return returnMsg;
	}

	private Object 出库单_完成(Atzchurukd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-出库单-完成-10 (1757454) 2013-05-23
		 */
		String message = null; // 提示信息
		String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
		Date today = new Date();
		if (employeeName == null) {
			message = "系统管理员不能进行业务操作！";

			returnMsg.set("NO", message);
			return returnMsg;
		}
		String shifouzx = instance.getShifouzx(); // 是否执行: 1-是 2-否
		if ("1".equals(shifouzx)) {
			message = "出库单已执行";

			returnMsg.set("NO", message);
			return returnMsg;
		}
		String zhidanr = instance.getZhidanr(); // 仓管员
		if (!employeeName.equals(zhidanr)) {
			message = "只有仓管员才能执行出库单完成操作！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		String ckr = instance.getChurukr(); // 出库人
		if (ckr == null || "".equals(ckr.trim())) {
			message = "出库人不能为空, 请维护！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		Long ckjhdid = instance.getChurukjhdid(); // 出库计划ID

		Atzchurukjhd ckjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, ckjhdid); // 出库计划

		if (ckjhd == null) {
			message = "出库计划不存在, 请联系系统管理员！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		Long ckdid = instance.getId(); // 出库单ID

		Long xiangmuid = instance.getXiangmuid(); // 项目ID

		String renwuzt = instance.getRenwuzt(); // 任务主题
		String churukyy = instance.getChurukyy(); // 出入库原因

		List<Atzchurukdmx> ckdmxs = dataset.getList("Atzchurukdmx",
				"atzchurukdid=" + ckdid + " order by wuliaobm,id ASC"); // 出库单明细List

		if (ckdmxs == null || ckdmxs.isEmpty()) {
			message = "出库单没有明细, 请检查！";

			returnMsg.set("NO", message);
			return returnMsg;
		}

		Atzchurukdmx ckdmx = null; // 出库单明细

		String wuliaobm = null; // 物料编码
		String sn = null; // SN

		Long wuliaoid = null; // 物料ID
		Long kuweiid = null; // 库位ID
		Double meidwsl = null; // 每单位数量

		Atzwuliaojcxx wljcxx = null; // 物料基础信息

		String sngl = null; // SN管理: 1-是 2-否

		Atzshebeixx sbxx = null; // 设备信息

		String snerrpos = ""; // SN错误行号

		// -----维保 SN 判断-----
		Long weibaosqdid = ckjhd.getWeibaosqdid(); // 维保申请单ID
		if (weibaosqdid != null) {
			Atzweibaosbsqd wbd = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class, weibaosqdid);

			String weibaodlx = wbd.getWeibaodlx(); // 维保単类型: 4-维修设备发货申请单

			if ("4".equals(weibaodlx)) {
				Atzshebeisqdmx sbsqdmx = null; // 设备申请单明细
				for (int i = 0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);

					sn = ckdmx.getSn();

					if (sn != null) {
						sbsqdmx = (Atzshebeisqdmx) dataset.getObjectByHql("Atzshebeisqdmx",
								"from Atzshebeisqdmx where weibaosbsqdi=" + weibaosqdid + " and snhao='" + sn + "'");

						if (sbsqdmx == null) {
							message = "第 " + (i + 1) + " 条出库单明细输入的 SN (" + sn + ") 与维保申请单中的 SN 不一致, 请检查！";

							returnMsg.set("NO", message);
							return returnMsg;
						}
					}
				}
			}
		}

		// -----验证设备序列号有效性(非物料入在线)-----
		if (!"24".equals(churukyy)) {
			List<Atzchurukdmx> cfsnmxs = null; // 重复SN出库单明细List

			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaobm = ckdmx.getWuliaobm();
				wuliaoid = ckdmx.getWuliaoid();
				sn = ckdmx.getSn();

				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);

				sngl = wljcxx.getSngl();

				if (sngl == null) {
					message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 信息有误, 请先设置物料 SN 管理信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				if ("1".equals(sngl)) {
					if (sn == null) {
						message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 的 SN 不能为空, 请检查！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					cfsnmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + ckdid + " and sn='" + sn + "'");
					if (cfsnmxs != null && cfsnmxs.size() > 1) {
						message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 存在重复输入的 SN (" + sn + "), 请检查！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx",
							"from Atzshebeixx where wuliaoid=" + wuliaoid + " and sn='" + sn + "'");

					if (sbxx == null) {
						if ("".equals(snerrpos))
							snerrpos += (i + 1);
						else
							snerrpos += ("," + (i + 1));
					}
				}
			}

			if (!"".equals(snerrpos)) {
				message = "第 " + snerrpos + " 条出库单明细物料对应的 SN 不存在 (请查看设备信息)！";

				returnMsg.set("NO", message);
				return returnMsg;
			}
		}

		String hql = null;

		String pthql = null; // 普通hql
		String zxhql = null; // 在线hql

		Atzkucun ptkucun = null; // 普通库存
		Atzkucun zxkucun = null; // 在线库存

		Double weicrksl = null; // 未出入库数量

		Double cksl = null; // 本次出库数量
		Double bcjhcksl = null;// 本次计划数量

		Double ptl = null; // 普通量
		Double zxl = null; // 在线量

		Double sysl = null; // 剩余数量

		// -----物料入在线-----
		if ("24".equals(churukyy)) {
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaobm = ckdmx.getWuliaobm();
				sn = ckdmx.getSn();
				cksl = ckdmx.getShuliang();

				wuliaoid = ckdmx.getWuliaoid();
				kuweiid = ckdmx.getKuweiid();
				meidwsl = ckdmx.getMeidwsl();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
						+ kuweiid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				pthql = hql + " and kucunlx='1'";
				zxhql = hql + " and kucunlx='2'";

				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);

				if (ptkucun == null) {
					message = "第 " + (i + 1) + " 条出库单明细没有对应的普通库存信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				ptl = ptkucun.getKucunzl();

				if (cksl.doubleValue() > ptl.doubleValue()) {
					message = "第 " + (i + 1) + " 条出库单明细普通库存量不足！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				// -----减少普通库存量-----
				ptkucun.setKucunzl(
						(new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl))))
								.doubleValue());
				dataset.update(ptkucun);

				// -----增加在线库存量-----
				if (zxkucun != null) {
					zxl = zxkucun.getKucunzl();

					zxkucun.setKucunzl((new BigDecimal(Double.toString(zxl)).add(new BigDecimal(Double.toString(cksl))))
							.doubleValue());
					dataset.update(zxkucun);
				} else {
					zxkucun = new Atzkucun();

					zxkucun.setKucunlx("2"); // 库存类型: 原材料在线
					zxkucun.setXiangmuid(xiangmuid); // 项目ID
					zxkucun.setWuliaoid(wuliaoid); // 物料ID
					zxkucun.setKuweiid(kuweiid); // 库位ID
					zxkucun.setMeidwsl(meidwsl); // 每单位数量
					zxkucun.setKeyongl(0.0); // 可用量
					zxkucun.setKucunzl(cksl); // 库存量

					dataset.add(zxkucun);
				}
			}
		}
		Double ckdysl = null;
		Double zxsl = null;
		Atzchurukls rkls = null; // 入库流水
		// -----生产订单领料出库(优先出原材料在线)-----
		if ("1".equals(churukyy)) {
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaobm = ckdmx.getWuliaobm();
				sn = ckdmx.getSn();
				cksl = ckdmx.getShuliang();
				bcjhcksl = ckdmx.getBencijhsl();
				wuliaoid = ckdmx.getWuliaoid();
				kuweiid = ckdmx.getKuweiid();
				meidwsl = ckdmx.getMeidwsl();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
						+ kuweiid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				zxhql = hql + " and kucunlx='2'";
				pthql = hql + " and kucunlx='1'";

				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);

				// -----存在原材料在线-----
				if (zxkucun != null) {
					zxl = zxkucun.getKucunzl();
					ptl = ptkucun.getKucunzl();

					if (cksl > (zxl + ptl)) {
						message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 库存不足！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					if (zxl.doubleValue() >= cksl.doubleValue()) {
						zxkucun.setKucunzl(new BigDecimal(Double.toString(zxl))
								.subtract(new BigDecimal(Double.toString(cksl))).doubleValue());

						dataset.update(zxkucun);
						dataset.update(ptkucun);
					} else {
						zxkucun.setKucunzl(0.0);
						dataset.update(zxkucun);

						sysl = (new BigDecimal(Double.toString(cksl)).subtract(new BigDecimal(Double.toString(zxl))))
								.doubleValue();

						ptkucun.setKucunzl(
								(new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(sysl))))
										.doubleValue());

						dataset.update(ptkucun);
					}
				} else {
					if (ptkucun == null) {
						message = "第 " + (i + 1) + " 条出库单明细没有对应的普通库存信息！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					ptl = ptkucun.getKucunzl();

					if (cksl.doubleValue() > ptl.doubleValue()) {
						message = "第 " + (i + 1) + " 条出库单明细普通库存量不足！";

						returnMsg.set("NO", message);
						return returnMsg;
					}

					ptkucun.setKucunzl(
							(new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl))))
									.doubleValue());
					// ptkucun.setKeyongl(new
					// BigDecimal(Double.toString(ptkucun.getKeyongl())).subtract(new
					// BigDecimal(Double.toString(cksl))).doubleValue());
					dataset.update(ptkucun);
				}
				// 判断实际数量是否大于出库数量,大于则入在线
				if (cksl > bcjhcksl) {
					ckdysl = (new BigDecimal(Double.toString(cksl)).subtract(new BigDecimal(Double.toString(bcjhcksl))))
							.doubleValue();
					if (zxkucun == null) {
						Atzkucun newzxkucun = new Atzkucun();
						newzxkucun.setXiangmuid(xiangmuid);
						newzxkucun.setWuliaoid(wuliaoid);
						newzxkucun.setKuweiid(kuweiid);
						newzxkucun.setMeidwsl(meidwsl);
						newzxkucun.setKucunzl(ckdysl);
						newzxkucun.setKucunlx("2");// 在线库存
						dataset.add(newzxkucun);
					} else {
						zxsl = (new BigDecimal(Double.toString(zxkucun.getKucunzl()))
								.add(new BigDecimal(Double.toString(ckdysl)))).doubleValue();
						zxkucun.setKucunzl(zxsl);
						dataset.update(zxkucun);
					}
					// 维护库存可用量
					// zxsl=(new
					// BigDecimal(Double.toString(ptkucun.getKeyongl())).add(new
					// BigDecimal(Double.toString(ckdysl)))).doubleValue();
					// ptkucun.setKeyongl(zxsl);

					// 生成入库流水
					rkls = new Atzchurukls();
					rkls.setChurukjhdid(instance.getChurukjhdid()); // 关联到出库计划单ID
					rkls.setChurukdid(instance.getId()); // 关联到出库单ID
					rkls.setChurukdmxid(ckdmx.getId()); // 关联到出单明细ID
					rkls.setChuruklx("2"); // 类型: 入库
					rkls.setChurukyy(churukyy); // 出库原因
					rkls.setXiangmuid(xiangmuid); // 项目ID
					rkls.setWuliaoid(wuliaoid); // 物料ID
					rkls.setKuweiid(kuweiid); // 库位ID
					rkls.setMeidwsl(meidwsl); // 每单位数量
					rkls.setSn(sn); // 序列号
					rkls.setBencijhsl(ckdysl); // 本次计划数量
					rkls.setShuliang(ckdysl); // 数量
					rkls.setChurukr(ckr); // 经办人
					rkls.setRiqi(today); // 日期
					rkls.setCunfangwz(ckdmx.getCunfangwz()); // 存放位置
					dataset.add(rkls);
				}
			}
		}

		// -----非物料入在线及生产订单领料出库-----
		if (!("24".equals(churukyy) || "1".equals(churukyy))) {
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaobm = ckdmx.getWuliaobm();
				sn = ckdmx.getSn();
				cksl = ckdmx.getShuliang();

				wuliaoid = ckdmx.getWuliaoid();
				kuweiid = ckdmx.getKuweiid();
				meidwsl = ckdmx.getMeidwsl();

				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
						+ kuweiid;

				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";

				pthql = hql + " and kucunlx='1'";

				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);

				if (ptkucun == null) {
					message = "第 " + (i + 1) + " 条出库单明细没有对应的普通库存信息！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				ptl = ptkucun.getKucunzl();

				if (cksl.doubleValue() > ptl.doubleValue()) {
					message = "第 " + (i + 1) + " 条出库单明细普通库存量不足！";

					returnMsg.set("NO", message);
					return returnMsg;
				}

				ptkucun.setKucunzl(
						(new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl))))
								.doubleValue());
				dataset.update(ptkucun);
			}
		}

		Long ckjhmxid = null; // 出库计划明细ID
		Atzchurukjhdmx ckjhdmx = null; // 出库计划明细

		// -----更新出库计划明细中的未完成数量-----
		for (int i = 0; i < ckdmxs.size(); i++) {
			ckdmx = ckdmxs.get(i);

			ckjhmxid = ckdmx.getCrkjhmxid();
			cksl = ckdmx.getShuliang();

			ckjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, ckjhmxid);

			if (ckjhdmx == null) {
				message = "第 " + (i + 1) + " 条出库单明细信息不完整, 请联系系统管理员！";

				returnMsg.set("NO", message);
				return returnMsg;
			}

			weicrksl = ckjhdmx.getWeicrksl();

			// 判断 如果出入库原因为 生产订单领料出库，可能出库数量会大于计划明细未完成数量
			if (!"1".equals(churukyy)) {
				if (cksl.doubleValue() > weicrksl.doubleValue()) {
					message = "第 " + (i + 1) + " 条出库单明细物料 (" + wuliaobm + ") 已超计划数量！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
				ckjhdmx.setWeicrksl(
						(new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(cksl))))
								.doubleValue());
				dataset.update(ckjhdmx);
			} else {
				if (cksl.doubleValue() > weicrksl.doubleValue()) {
					ckjhdmx.setWeicrksl(0d);
					dataset.update(ckjhdmx);
				} else {
					ckjhdmx.setWeicrksl(
							(new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(cksl))))
									.doubleValue());
					dataset.update(ckjhdmx);
				}
			}
		}

		String cszxhql = null; // 测试在线hql
		Atzkucun cszxkucun = null; // 测试在线库存

		// -----测试任务单出库时, 生成测试在线库存信息-----
		if ("11".equals(churukyy)) {
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				cksl = ckdmx.getShuliang();

				wuliaoid = ckdmx.getWuliaoid();
				meidwsl = ckdmx.getMeidwsl();

				cszxhql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid
						+ " and kucunlx='5'";

				if (meidwsl != null)
					cszxhql += " and meidwsl=" + meidwsl;
				else
					cszxhql += " and meidwsl is null";

				cszxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", cszxhql);

				if (cszxkucun != null) {
					cszxkucun.setKeyongl((new BigDecimal(Double.toString(cszxkucun.getKeyongl()))
							.add(new BigDecimal(Double.toString(cksl)))).doubleValue());
					cszxkucun.setKucunzl((new BigDecimal(Double.toString(cszxkucun.getKucunzl()))
							.add(new BigDecimal(Double.toString(cksl)))).doubleValue());

					dataset.update(cszxkucun);
				} else {
					cszxkucun = new Atzkucun();

					cszxkucun.setKucunlx("5"); // 库存类型: 测试在线
					cszxkucun.setXiangmuid(xiangmuid); // 项目ID
					cszxkucun.setWuliaoid(wuliaoid); // 物料ID
					cszxkucun.setMeidwsl(meidwsl); // 每单位数量
					cszxkucun.setKeyongl(cksl); // 可用量
					cszxkucun.setKucunzl(cksl); // 库存量

					dataset.add(cszxkucun);
				}
			}
		}

		String beizhu = null;

		// -----维修和复测任务单出库时, 生成维修记录-----
		if ("19".equals(churukyy) || "64".equals(churukyy)) {
			Atzweixiujl wxjl = null; // 维护记录

			List<Atzshebeisqdmx> shebeisqdmxs = null; // 设备申请单明细List

			Atzshebeisqdmx shebeisqdmx = null; // 设备申请单明细
			Atzweibaosbsqd weibaosbsqd = null; // 维保申请单

			List<Atzchurukdmx> ckdmxList = null; // 出库单明细List

			Atzchurukdmx mx = null; // 出库单明细

			Long ckid = null; // 出库单ID
			Atzchurukd ckd = null; // 出库单
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaoid = ckdmx.getWuliaoid();
				sn = ckdmx.getSn();
				beizhu = ckdmx.getBeizhu();

				wxjl = new Atzweixiujl();

				wxjl.setScrwid(ckjhd.getScrwdid()); // 生产任务ID
				wxjl.setLaiyuan("2"); // 来源: 现场
				wxjl.setWuliaoid(wuliaoid); // 物料ID
				wxjl.setSn(sn); // SN
				wxjl.setGuzhangxx(beizhu); // 故障现象

				shebeisqdmxs = dataset.getList("Atzshebeisqdmx", "snhao='" + sn + "' order by id DESC");
				if (shebeisqdmxs != null && shebeisqdmxs.size() > 0) {
					shebeisqdmx = shebeisqdmxs.get(0);

					wxjl.setGuzhangxx(shebeisqdmx.getGuzhangxx()); // 故障现象
					wxjl.setHuichangsj(shebeisqdmx.getHuichangsj()); // 回厂时间

					weibaosbsqd = (Atzweibaosbsqd) dataset.getObject("Atzweibaosbsqd", shebeisqdmx.getWeibaosbsqdi());

					wxjl.setFanghuidd(weibaosbsqd.getDaohuodd()); // 返回地点
					wxjl.setHetongid(weibaosbsqd.getHetong()); // 合同ID
					wxjl.setLianxidh(weibaosbsqd.getLianxidh()); // 联系电话
				}

				ckdmxList = dataset.getList("Atzchurukdmx", "sn='" + sn + "' order by id DESC");
				boolean flag = true;
				if (ckdmxList != null && ckdmxList.size() > 0) {
					mx = ckdmxList.get(0);
					if (mx != null) {
						ckid = mx.getAtzchurukdid();
						ckd = (Atzchurukd) dataset.getObject(Atzchurukd.class, ckid);
						if (ckd != null) {
							if (ckd.getChurukrq() != null) {
								wxjl.setHuichangsj(ckd.getChurukrq()); // 回厂时间
								flag = false;
							}
						}
					}
				}

				if (flag)
					wxjl.setHuichangsj(new Date()); // 回厂时间

				wxjl.setLururq(new Date()); // 录入日期
				wxjl.setLurur(employeeName); // 录入人

				dataset.add(wxjl);
			}
		}

		// -----合同发货时, 对有序列号的物料自动生成设备维保信息-----
		if ("3".equals(churukyy)) {
			Atzshebeiwbxx sbwbxx = null; // 设备维保信息
			Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, ckjhd.getFahuotzdid());

			if (fahuotzd == null) {
				message = "出库计划没有对应的发货通知, 无法生成设备维保信息！";

				returnMsg.set("NO", message);
				return returnMsg;
			}
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaoid = ckdmx.getWuliaoid();
				sn = ckdmx.getSn();

				if (sn != null) {
					sbwbxx = new Atzshebeiwbxx();

					sbwbxx.setKehuid(fahuotzd.getKehuid()); // 客户ID
					sbwbxx.setXiaoshouhtid(fahuotzd.getHetongid()); // 销售合同ID
					sbwbxx.setWeibaohtid(fahuotzd.getHetongid()); // 维保合同ID
					sbwbxx.setWuliaoid(wuliaoid); // 物料ID
					sbwbxx.setSn(sn); // SN
					sbwbxx.setShifouyx("1"); // 是否超保: 是

					dataset.add(sbwbxx);
				}
			}
		}

		// -----更新设备信息状态-----
		if (!"24".equals(churukyy)) {
			List<Atzchurukls> snlss = null; // 出入库流水

			String shifouzk = null; // 单板状态: 1-仓库中 2-已发货 3-加工中 4-测试中 5-维修中 6-检验中
									// 7-维保已申请 8-借用中

			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);
				logger.error("ckdmx.id===" + ckdmx.getId());
				sn = ckdmx.getSn();
				logger.error("sn===" + sn);
				if (sn != null) {
					sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx",
							"from Atzshebeixx where sn='" + sn + "'");

					snlss = dataset.getList("Atzchurukls", "sn='" + sn + "'");

					if (snlss != null && snlss.size() > 0) {
						shifouzk = sbxx.getShifouzk();

						if (!"1".equals(shifouzk)) {
							logger.error("sbsn=" + sn);
							message = "第 " + (i + 1) + " 条出库单明细物料 (" + ckdmx.getWuliaobm() + ") 对应的 SN ( " + sn
									+ " ) 不在库 (请查看物料跟踪信息)！";

							returnMsg.set("NO", message);
							return returnMsg;
						}
					}

					if ("1".equals(churukyy) || "66".equals(churukyy) || "68".equals(churukyy)) {
						sbxx.setShifouzk("3"); // 加工中
					} else if ("11".equals(churukyy)) {
						sbxx.setShifouzk("4"); // 测试中
					} else if ("19".equals(churukyy)) {
						sbxx.setShifouzk("5"); // 维修中
					} else if ("55".equals(churukyy) || "59".equals(churukyy) || "35".equals(churukyy)
							|| "37".equals(churukyy) || "39".equals(churukyy) || "41".equals(churukyy)) {
						sbxx.setShifouzk("8"); // 借用中
					} else {
						sbxx.setShifouzk("2"); // 已发货
					}

					dataset.update(sbxx);
				}
			}
		}

		// -----合同发货时, 初始化发货跟踪记录-----
		if ("3".equals(churukyy) || "18".equals(churukyy) || "5".equals(churukyy) || "15".equals(churukyy)
				|| "17".equals(churukyy) || "53".equals(churukyy)) {
			Atzfahuojhzj fahuozj = new Atzfahuojhzj(); // 发货总结

			fahuozj.setChurukdid(ckdid); // 出库单ID
			fahuozj.setTongzhidxfrq(today); // 通知单下发日期
			fahuozj.setZongxiangs(0); // 总箱数
			fahuozj.setYunshugs("杭州新杰"); // 运输公司
			Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, ckjhd.getFahuotzdid());
			fahuozj.setFahuotzdid(fahuotzd.getId());
			fahuozj.setHetongid(fahuotzd.getHetongid());
			dataset.add(fahuozj);
		}

		// -----合同发货, 生成实际发货清单------start
		// 20170620-lzz
		if ("3".equals(churukyy)) {
			Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, ckjhd.getFahuotzdid());
			List<Atzfahuoqingdan> fahuoqdList = new ArrayList<Atzfahuoqingdan>();
			Atzfahuoqingdan fahuoqd = null;
			Atzshebeiqdmx atzshebeiqdmx = null;
			Atzxiaoshoubm xiaoshoubm = null;
			for (Atzchurukdmx atzchurukdmx : ckdmxs) {
				// 设备清单明细实际已出库数量
				ckjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, atzchurukdmx.getCrkjhmxid());
				if (ckjhdmx == null) {
					message = "物料编码为 " + atzchurukdmx.getWuliaobm() + " 的出库单明细信息不完整, 请联系系统管理员！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
				xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, ckjhdmx.getXiaoshoubmid());
				atzshebeiqdmx = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx",
						"from Atzshebeiqdmx where hetongid=" + fahuotzd.getHetongid() + " and xiaoshoubmid="
								+ ckjhdmx.getXiaoshoubmid());
				if (atzshebeiqdmx == null) {
					message = "物料编码为" + atzchurukdmx.getWuliaobm() + "的出库明细信息对应的合同设备清单(销售编码" + xiaoshoubm.getBianma()
							+ ")找不到, 请联系系统管理员！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
				// 已发货数量
				atzshebeiqdmx
						.setYifhsh(com.actiz.util.MathUtil.add(atzshebeiqdmx.getYifhsh(), atzchurukdmx.getShuliang()));
				// 实际未发货数量 = 已下达 - 已发货
				atzshebeiqdmx
						.setSjwfhsl(com.actiz.util.MathUtil.sub(atzshebeiqdmx.getJhfhsl(), atzshebeiqdmx.getYifhsh()));
				dataset.update(atzshebeiqdmx);
				// 生成实际发货清单
				fahuoqd = (Atzfahuoqingdan) dataset.getObjectByHql("Atzfahuoqingdan",
						"from Atzfahuoqingdan where sn is null and zt='1' and wuliaoid=" + atzchurukdmx.getWuliaoid()
								+ " and fahuotzdid=" + fahuotzd.getId());
				if (fahuoqd == null) {
					fahuoqd = new Atzfahuoqingdan();
					fahuoqd.setFahuotzdid(fahuotzd.getId());
					fahuoqd.setHetongid(fahuotzd.getHetongid());
					fahuoqd.setWuliaoid(atzchurukdmx.getWuliaoid());
					fahuoqd.setXiaoshoubmid(xiaoshoubm.getId());
					fahuoqd.setShuliang(atzchurukdmx.getShuliang());
					fahuoqd.setSn(atzchurukdmx.getSn());
					fahuoqd.setTkshuliang(0d);
					fahuoqd.setSjtksl(0d);
					fahuoqd.setFahuosj(today);
					fahuoqd.setZt("1");
				} else {
					fahuoqd.setShuliang(com.actiz.util.MathUtil.add(fahuoqd.getShuliang(), atzchurukdmx.getShuliang()));
				}
				fahuoqdList.add(fahuoqd);
			}
			dataset.addAll(fahuoqdList);
			// 维护合同发货状态
			Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, fahuotzd.getHetongid());
			boolean htfhzt = true;
			List<Atzshebeiqdmx> list1 = dataset.getListByHql("Atzshebeiqdmx",
					"from Atzshebeiqdmx where hetongid=" + fahuotzd.getHetongid());
			for (Atzshebeiqdmx atzshebeiqdmx2 : list1) {
				if (atzshebeiqdmx2.getShuliang().compareTo(atzshebeiqdmx2.getYifhsh()) != 0) {
					htfhzt = false;
				}
			}
			hetong.setFhzt("1");
			if (htfhzt) {
				hetong.setFhzt("2");
			}
			dataset.update(hetong);
			// 发货通知单发货状态
		}
		// -----合同发货, 生成实际发货清单------end
		Long ckdmxid = null; // 出库单明细ID
		Atzchurukls ckls = null; // 出库流水
		Double bencijhsl = null; // 本次计划数量
		String cunfangwz = null; // 存放位置
		// -----生成出库流水-----
		for (int i = 0; i < ckdmxs.size(); i++) {
			ckdmx = ckdmxs.get(i);

			ckdmxid = ckdmx.getId();
			sn = ckdmx.getSn();
			bencijhsl = ckdmx.getBencijhsl();
			cksl = ckdmx.getShuliang();
			cunfangwz = ckdmx.getCunfangwz();

			wuliaoid = ckdmx.getWuliaoid();
			kuweiid = ckdmx.getKuweiid();
			meidwsl = ckdmx.getMeidwsl();

			ckls = new Atzchurukls();

			ckls.setChurukjhdid(ckjhdid); // 出库计划单ID
			ckls.setChurukdid(ckdid); // 出库单ID
			ckls.setChurukdmxid(ckdmxid); // 出库单明细ID
			ckls.setChuruklx("1"); // 类型: 出库
			ckls.setChurukyy(churukyy); // 出库原因
			ckls.setXiangmuid(xiangmuid); // 项目ID
			ckls.setWuliaoid(wuliaoid); // 物料ID
			ckls.setKuweiid(kuweiid); // 库位ID
			ckls.setMeidwsl(meidwsl); // 每单位数量
			ckls.setSn(sn); // 序列号
			ckls.setBencijhsl(bencijhsl); // 本次计划数量
			ckls.setShuliang(cksl); // 数量
			ckls.setChurukr(ckr); // 经办人
			ckls.setRiqi(today); // 日期
			ckls.setCunfangwz(cunfangwz); // 存放位置

			dataset.add(ckls);
		}

		// -----维护出库计划是否完成字段-----
		Double wcksl = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "weicrksl", "atzchurukjhdid=" + ckjhdid));

		if (wcksl.doubleValue() <= 0) {
			ckjhd.setShifouwc("1"); // 是否完成: 已完成
			// ---无线需求：研发试制生成的出库单完成时维护字段“完成物料准备日”、“计划试生产日”-05H-start-----
			if (ckjhd.getScjhid() != null) {
				List<Atzscjhmx> scjhmxs = dataset.getList("Atzscjhmx",
						"atzscjhid=" + ckjhd.getScjhid() + " and yfszid is not null");
				if (scjhmxs != null && scjhmxs.size() > 0) {
					Atzyanfasz yfsz = (Atzyanfasz) dataset.getObject("Atzyanfasz", scjhmxs.get(0).getYfszid());
					if (yfsz != null) {
						yfsz.setWcwlzbr(today);
						yfsz.setJihuasscr(today);
						dataset.update(yfsz);
					}
				}
			}
			// ---无线需求：研发试制生成的出库单完成时维护字段“完成物料准备日”、“计划试生产日”-05H-end-----
		} else {
			ckjhd.setShifouwc("2"); // 是否完成: 未完成
		}

		dataset.update(ckjhd);

		// -----更新出库单信息-----
		paramMap.put("danjulx", "16"); // 设置编码规则

		String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);

		if (rValue.equals("流水号溢出"))
			message = "出库单流水号溢出！";
		else if ("Error".equals(rValue))
			message = "生成出库单编号有误, 请联系系统管理员！";

		if (message != null) {
			returnMsg.set("NO", message);
			return returnMsg;
		}

		instance.setBianhao(rValue); // 正式编号
		instance.setShifouzx("1"); // 是否执行: 是
		instance.setChurukrq(today); // 出库日期

		dataset.update(instance);

		String errpos = "";

		// -----库存验证-----
		for (int i = 0; i < ckdmxs.size(); i++) {
			ckdmx = ckdmxs.get(i);

			wuliaoid = ckdmx.getWuliaoid();
			kuweiid = ckdmx.getKuweiid();
			meidwsl = ckdmx.getMeidwsl();

			hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
					+ kuweiid;

			if (meidwsl != null)
				hql += " and meidwsl=" + meidwsl;
			else
				hql += " and meidwsl is null";

			pthql = hql + " and kucunlx='1'";
			zxhql = hql + " and kucunlx='2'";

			ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
			zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);

			ptl = 0.0;
			zxl = 0.0;

			if (ptkucun != null)
				ptl = ptkucun.getKucunzl();
			if (zxkucun != null)
				zxl = zxkucun.getKucunzl();
			if (ptl < 0 || zxl < 0) {
				if ("".equals(errpos))
					errpos += (i + 1);
				else
					errpos += ("," + (i + 1));
			}
		}

		if (!"".equals(errpos)) {
			message = "在所选择的项目和库位下，第 " + errpos + " 条出库明细物料库存量不足！";
			returnMsg.set("NO", message);
			return returnMsg;
		}

		// -----维护出库单明细信息-----
		for (int i = 0; i < ckdmxs.size(); i++) {
			ckdmx = ckdmxs.get(i);

			cksl = ckdmx.getShuliang();

			ckdmx.setWeizxsl(cksl); // 未装箱数量
			ckdmx.setLururq(today); // 录入日期

			dataset.update(ckdmx);
		}

		// -----借用领用信息维护-----
		if ("15".equals(churukyy) || "37".equals(churukyy) || "17".equals(churukyy) || "39".equals(churukyy)
				|| "41".equals(churukyy) || "33".equals(churukyy) || "35".equals(churukyy) || "45".equals(churukyy)
				|| "47".equals(churukyy) || "53".equals(churukyy) || "55".equals(churukyy)) {
			String jylyhql = null;

			Atzjylyqingdan jylyqingdan = null; // 借用领用清单

			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);
				wuliaoid = ckdmx.getWuliaoid();
				meidwsl = ckdmx.getMeidwsl();

				sn = ckdmx.getSn();
				cksl = ckdmx.getShuliang();

				jylyhql = "from Atzjylyqingdan where wuliaoid=" + wuliaoid;

				if (meidwsl != null)
					jylyhql += " and meidwsl=" + meidwsl;
				else
					jylyhql += " and meidwsl is null";

				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				sngl = wljcxx.getSngl();
				if ("1".equals(sngl)) {
					jylyhql += " and sn='" + sn + "'";
					jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);
					if (jylyqingdan != null) {
						jylyqingdan.setYuanyin(churukyy); // 原因
						jylyqingdan.setChurukr(ckr); // 经办人
						jylyqingdan.setRiqi(today); // 日期
						jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
						// 维护出库单计划编号
						jylyqingdan.setCkjhdh(ckjhd.getBianhao());
						jylyqingdan.setBmmc(ckjhd.getBmmc());
						dataset.update(jylyqingdan);
					} else {
						jylyqingdan = new Atzjylyqingdan();
						jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
						jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
						jylyqingdan.setSn(sn); // 序列号
						jylyqingdan.setShuliang(1.0); // 数量
						jylyqingdan.setYuanyin(churukyy); // 原因
						jylyqingdan.setChurukr(ckr); // 经办人
						jylyqingdan.setRiqi(today); // 日期
						jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
						// 维护出库单计划编号
						jylyqingdan.setCkjhdh(ckjhd.getBianhao());
						jylyqingdan.setBmmc(ckjhd.getBmmc());
						dataset.add(jylyqingdan);
					}
				} else {
					jylyhql += " and yuanyin='" + churukyy + "' and churukr='" + ckr + "'";
					jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);
					if (jylyqingdan != null) {
						jylyqingdan.setShuliang(jylyqingdan.getShuliang() + cksl); // 数量
						jylyqingdan.setRiqi(today); // 日期
						// 维护出库单计划编号
						jylyqingdan.setCkjhdh(ckjhd.getBianhao());
						jylyqingdan.setBmmc(ckjhd.getBmmc());
						dataset.update(jylyqingdan);
					} else {
						jylyqingdan = new Atzjylyqingdan();
						jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
						jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
						jylyqingdan.setShuliang(cksl); // 数量
						jylyqingdan.setYuanyin(churukyy); // 原因
						jylyqingdan.setChurukr(ckr); // 经办人
						jylyqingdan.setRiqi(today); // 日期
						jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
						// 维护出库单计划编号
						jylyqingdan.setCkjhdh(ckjhd.getBianhao());
						jylyqingdan.setBmmc(ckjhd.getBmmc());
						dataset.add(jylyqingdan);
					}
				}
			}
		}
		// 删除库存明细,如果是物料入在线则新增在线库存明细
		String mxsql = null;
		Atzkucunmx kcmx = null;
		for (int i = 0; i < ckdmxs.size(); i++) {
			ckdmx = ckdmxs.get(i);
			wuliaoid = ckdmx.getWuliaoid();
			kuweiid = ckdmx.getKuweiid();
			meidwsl = ckdmx.getMeidwsl();
			sn = ckdmx.getSn();
			hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid="
					+ kuweiid;
			if (meidwsl != null)
				hql += " and meidwsl=" + meidwsl;
			else
				hql += " and meidwsl is null";

			pthql = hql + " and kucunlx='1'";
			zxhql = hql + " and kucunlx='2'";

			ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
			zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
			wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
			if (wljcxx != null && "1".equals(wljcxx.getSngl())) {// sn管理
				if (sn != null && !"".equals(sn)) {// sn不为空
					mxsql = "from Atzkucunmx where kucunid=" + ptkucun.getId() + " and wuliaoid=" + wuliaoid
							+ " and sn='" + sn + "'";
					kcmx = (Atzkucunmx) dataset.getObjectByHql("Atzkucunmx", mxsql);
					if (kcmx != null) {
						dataset.delete(kcmx);// 删除普通库存下 的库存明细
					} else {
						message = "在所选择的项目和库位下，物料序列号：" + sn + "对应的库存明细不存在！";
						returnMsg.set("OK", message);
						return returnMsg;
					}
					if ("24".equals(churukyy)) {// 是物料入在线，生成在线库存下的库存明细
						if (zxkucun != null) {
							// 在线库存新增明细
							Atzkucunmx zxkcmx = new Atzkucunmx();
							zxkcmx.setKucunid(zxkucun.getId());
							zxkcmx.setSn(sn.trim());
							zxkcmx.setWuliaoid(wuliaoid);
							zxkcmx.setShuliang(1d);
							zxkcmx.setWuliaozt("1");// 正常
							dataset.add(zxkcmx);
						}
					}
				}
			}
		}

		/**
		 * 维保更换出库完成自动更新现场设备配置信息（前提：出入库均已完成） 作者:06
		 *
		 */

		if ("5".equals(churukyy)) {
			Atzchurukjhd ckjhd06 = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, instance.getChurukjhdid());
			boolean flag06 = false;
			if (ckjhd06 != null && "1".equals(ckjhd06.getShifouwc())) {
				Atzweibaosbsqd ckwbd06 = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class,
						ckjhd06.getWeibaosqdid());
				if (ckwbd06 != null) {
					List<Atzchurukjhd> rkjhdList06 = dataset.getListByHql("Atzchurukjhd",
							" from Atzchurukjhd where weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"
									+ ckwbd06.getBianhao() + "R')");
					Atzchurukjhd jhd06 = null;
					if (rkjhdList06 != null && rkjhdList06.size() > 0) {
						jhd06 = rkjhdList06.get(0);
					}

					if (jhd06 != null && "1".equals(jhd06.getShifouwc())) {
						flag06 = true;
					} else {
						flag06 = false;
					}

					if (flag06) {
						// 根据出库流水和入库流水自动更新设备配置信息.以出库做为循环条件，没出的记录无需更新
						List<Atzchurukls> cklsList06 = dataset.getListByHql("Atzchurukls",
								" from Atzchurukls where churukjhdid=" + ckjhd06.getId());
						List<Atzchurukls> rklsList06 = dataset.getListByHql("Atzchurukls",
								" from Atzchurukls where churukjhdid=" + jhd06.getId());
						for (int i06 = 0; i06 < cklsList06.size(); i06++) {
							Atzchurukls ckls06 = cklsList06.get(i06);
							if (ckls06 != null && ckls06.getSn() != null) {
								if (rklsList06 != null && rklsList06.size() > i06) {
									Atzchurukls rkls06 = rklsList06.get(i06);
									if (rkls06 != null && rkls06.getSn() != null) {
										// 执行更新
										String update06 = "update Atzshebeipzxx set wuliaosn    = '" + ckls06.getSn()
												+ "'" + ",wuliaoid=" + ckls06.getWuliaoid() + "  where   wuliaosn='"
												+ rkls06.getSn() + "'";
										dataset.batchUpdate("Atzshebeipzxx", update06);
									}
								}
							}
						}
					}
				}
			}
		}
		message = "【出库单】执行完成";
		returnMsg.set("OK", message);
		/**
		 *
		 * 此段代码用于保内更换设备，出库完成时，根据对应维保单的SN数据，去查找发货清单的信息，若查到，则更新
		 * 
		 * @zjl
		 */
		if ("5".equals(churukyy)) {
			Atzchurukjhd wbckjh_06 = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, instance.getChurukjhdid());
			if (wbckjh_06 != null) {
				Atzweibaosbsqd wbd_06 = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class,
						wbckjh_06.getWeibaosqdid());
				if (wbd_06 != null) {
					boolean wb_flag = false;
					List<Atzchurukdmx> wbckmxList_06 = dataset.getListByHql("Atzchurukdmx",
							"from Atzchurukdmx where sn is not null and atzchurukdid=" + instance.getId());
					for (Atzchurukdmx wbckmx_06 : wbckmxList_06) {
						// 根据SN查找对应的维保明细
						List<Atzshebeisqdmx> wbmxList_06 = dataset.getListByHql("Atzshebeisqdmx",
								"from Atzshebeisqdmx where  weibaosbsqdi =" + wbd_06.getId() + " and snhao='"
										+ wbckmx_06.getSn() + "'");
						for (Atzshebeisqdmx wbmx_06 : wbmxList_06) {
							// 查找维保明细对应的发货清单
							Long wb_dy_hetongid = wbd_06.getHetong();
							if (wb_dy_hetongid != null) {
								List<Atzfahuoqingdan> wb_htfhqdList = dataset.getListByHql("Atzfahuoqingdan",
										" from Atzfahuoqingdan where hetongid =" + wb_dy_hetongid + " and sn='"
												+ wbmx_06.getSnhao() + "'");
								if (wb_htfhqdList != null && wb_htfhqdList.size() > 0) {
									Atzfahuoqingdan wb_htfhqd_06 = wb_htfhqdList.get(0);
									if (wbckmx_06.getWuliaoid() != wb_htfhqd_06.getWuliaoid()) {
										// 如果出库明细和维保对应合同发货清单物料不同，则需查看销售编码是否一致
										// 如果销售编码不一致，则需要报错
										Atzwuliaojcxx wb_wl1 = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class,
												wbckmx_06.getWuliaoid());
										Atzwuliaojcxx wb_wl2 = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class,
												wb_htfhqd_06.getWuliaoid());
										if (wb_wl1.getXiaoshoubmid() != wb_wl2.getXiaoshoubmid()) {
											// 考虑到历史数据问题，暂时不报错
										} else {
											wb_htfhqd_06.setSn(wbckmx_06.getSn());
											wb_htfhqd_06.setWuliaoid(wbckmx_06.getWuliaoid());
										}
									} else {
										wb_htfhqd_06.setSn(wbckmx_06.getSn());
										wb_htfhqd_06.setWuliaoid(wbckmx_06.getWuliaoid());
									}
									dataset.update(wb_htfhqd_06);

								}
							}
						}
					}
				}

			}
		}
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		Long churukjhdid = instance.getChurukjhdid();
		Long fahuotzdid = null;
		Long xmpzqdid = null;
		Long yewuzcdid = null;
		if (churukjhdid != null) {
			Atzchurukjhd jhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, churukjhdid);
			if (jhd != null) {
				fahuotzdid = jhd.getFahuotzdid();
			}
		}
		if (fahuotzdid != null) {
			Atzfahuotzd tzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, fahuotzdid);
			if (tzd != null) {
				xmpzqdid = tzd.getXmpzqdid();
			}
		}

		if (xmpzqdid != null) {
			Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
			if (qd != null) {
				yewuzcdid = qd.getYewuzcd();
			}

		}
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {

				ywzc.setYwzt("11");

			}

		}
		return returnMsg;
	}
}
