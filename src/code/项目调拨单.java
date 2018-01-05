package code;

import java.util.*;
import java.util.Date;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzfahuosbqdmx_F608bff2700000009zSub;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzhetongdbmx_F34f0bccb00000002zSub;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 项目调拨单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(项目调拨单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	private Object AD_合同调拨_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * AD_合同调拨_12
		 */
		if(!"1".equals(instance.getDanjuzt())){
			returnMsg.set("NO", "单据已提交,不能删除");
			return returnMsg;
		}
		dataset.batchUpdate("Atzhetongdbmx", "delete Atzhetongdbmx where hetongdbid="+instance.getId());
		dataset.delete(instance);
		context.remove("atzhetongdb.id");
		returnMsg.set("OK", "删除成功");
		return returnMsg;
	}

	private Object A_合同调拨提交_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A_合同调拨提交_12
		 */
		instance.setDanjuzt("2");
		//维护调出合同可退库调出数量
		Atzhetong chuhetong = (Atzhetong) dataset.getObject(Atzhetong.class, instance.getChuhetong());
		if (chuhetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		String hql = "from Atzhetongdbmx where hetongdbid="+instance.getId();
		List<Atzhetongdbmx> list = (List<Atzhetongdbmx>)dataset.getListByHql("Atzhetongdbmx", hql);
		for (int i = 0; i < list.size(); i++) {
			Atzhetongdbmx dbmx = list.get(i);
			Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, dbmx.getFahuoqdid());
			if (fhqd == null) {
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			double sysl = com.actiz.util.MathUtil.sub(fhqd.getShuliang(), fhqd.getTkshuliang());
			if (dbmx.getShuliang().compareTo(sysl) > 0) {
				returnMsg.set("NO", "第" + (i + 1) + "行物料明细的调拨数量超过剩余可调拨数量");
				return returnMsg;
			}
			fhqd.setTkshuliang(com.actiz.util.MathUtil.add(fhqd.getTkshuliang(), dbmx.getShuliang()));
			dataset.update(fhqd);
		}
		//查找工程项目经理
		Atzhetong ruhetong = (Atzhetong) dataset.getObject(Atzhetong.class, instance.getRuhetong());
		String gcxmjl = ruhetong.getGcyszt();
		if (gcxmjl == null) {
			returnMsg.set("NO", "调入合同的工程项目经理没有维护,不能调拨");
			return returnMsg;
		}
		Bc_auth_usr gcxmjlusr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr", "from Bc_auth_usr where employee_name="+gcxmjl);
		if (gcxmjlusr == null) {
			returnMsg.set("NO", "调入合同的工程项目经理查找出错,请联系系统管理员");
			return returnMsg;
		}
		// 获取大区经理usrid
		Bc_auth_usr usr = null;
		try {
			Atzemployee xsjl = (Atzemployee) dataset.getObject(Atzemployee.class, chuhetong.getXiaoshoujl());
			Atzdepartment dep = (Atzdepartment) dataset.getObject(Atzdepartment.class, xsjl.getBumenid());
			Atzemployee fzr = (Atzemployee) dataset.getObject(Atzemployee.class, dep.getManagerid());
			usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
					"from Bc_auth_usr where team_employee_id=(select id from Atztdyg where yuangongid=" + fzr.getId()
							+ ")");
			if (usr == null) {
				throw new RuntimeException("usr is null");
			}
		} catch (Exception e) {
			logger.error(e);
			returnMsg.set("NO", "查找大区经理出错,请联系管理员");
			return returnMsg;
		}
		
		String windowId370 = null;
		if (context != null) {
			windowId370 = context.getId();
		}
		Map map107 = new HashMap();
		map107.put("daqu", usr.getId());
		map107.put("gcxmjl", gcxmjlusr.getId());
		// map107.put("kehujlUser",String.valueOf(user.getId()));
		Long result370 = WorkflowAppHelper.newProcessInstance(4095188L, map107, request, windowId370);
		if (result370 <= 0) {
			returnMsg.set("NO", "流程启动失败，请联系系统管理员！");
			return returnMsg;
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object A_合同调拨审核_12(Atzlcshenhejl instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_合同调拨审核_12 大区经理审核/销售副总审核/工程项目经理确认
		 */
		String dbid = "" + context.get("atzhetongdb.id");
		String shenhezt = instance.getShenhezt();
		String shenheyj = instance.getShenheyj();
		if ("1".equals(shenhezt) && (shenheyj == null || "".equals(shenheyj))) {
			returnMsg.set("NO", "审核意见不能为空");
			return returnMsg;
		}
		Atzhetongdb db = (Atzhetongdb) dataset.getObject(Atzhetongdb.class, Long.parseLong(dbid));
		if (db == null) {
			returnMsg.set("NO", "系统运行出错,请联系管理员!");
			return returnMsg;
		}
		NodeDefine nd = getProcessNodeInfo(context);
		String ndName = nd.getName();
		if ("工程项目经理确认".equals(ndName)) {
			if ("0".equals(shenheyj)) {
				Atzhetong chuhetong = (Atzhetong) dataset.getObject(Atzhetong.class, db.getChuhetong());
				Atzhetong ruhetong = (Atzhetong) dataset.getObject(Atzhetong.class, db.getRuhetong());
				// 完成调拨,统计数据
				List<Atzhetongdbmx> dbmxList = dataset.getListByHql("Atzhetongdbmx", "from Atzhetongdbmx where hetongdbid="+db.getId());
				for (Atzhetongdbmx dbmx : dbmxList) {
					// 维护调出合同设备清单调出数量, 可下达发货通知单数量, 发货清单数量
					String hql = "from Atzshebeiqdmx where hetongid="+db.getChuhetong()+" and xiaoshoubmid="+dbmx.getXiaoshoubmid();
					Atzshebeiqdmx qdmx = (Atzshebeiqdmx) dataset.getObject(Atzshebeiqdmx.class, hql);
					if (qdmx != null) {
						qdmx.setWeifhsl(com.actiz.util.MathUtil.add(qdmx.getWeifhsl(), dbmx.getShuliang()));
						qdmx.setYichusl(com.actiz.util.MathUtil.add(qdmx.getYichusl(), dbmx.getShuliang()));
						dataset.update(qdmx);
					}
					// 维护调入合同设备清单调入数量, 可下达发货通知单数量, 发货清单数量 , 调入来源合同号
					hql = "from Atzshebeiqdmx where hetongid="+db.getRuhetong()+" and xiaoshoubmid="+dbmx.getXiaoshoubmid();
					Atzshebeiqdmx qdmx1 = (Atzshebeiqdmx) dataset.getObject(Atzshebeiqdmx.class, hql);
					if (qdmx1 != null) {
						qdmx1.setWeifhsl(com.actiz.util.MathUtil.sub(qdmx.getWeifhsl(), dbmx.getShuliang()));
						qdmx1.setYirusl(com.actiz.util.MathUtil.add(qdmx.getYirusl(), dbmx.getShuliang()));
						dataset.update(qdmx1);
					}
					Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, dbmx.getFahuoqdid());
					//维护调出设备剩余数量
					fhqd.setShuliang(com.actiz.util.MathUtil.sub(fhqd.getShuliang(), dbmx.getShuliang()));
					fhqd.setTkshuliang(com.actiz.util.MathUtil.sub(fhqd.getTkshuliang(), dbmx.getShuliang()));
					//fhqd.setBeizhu("调出去处:" + ruhetong.getHetongbh());
					dataset.update(fhqd);
					//新增一条发货明细,维护调出去向,调拨数量,状态为调出=4;
					Atzfahuoqingdan cfhqd = new Atzfahuoqingdan();
					cfhqd.setFahuotzdid(fhqd.getFahuotzdid());;
					cfhqd.setHetongid(fhqd.getHetongid());
					cfhqd.setXiaoshoubmid(fhqd.getXiaoshoubmid());
					cfhqd.setWuliaoid(fhqd.getWuliaoid());
					cfhqd.setSjtksl(dbmx.getShuliang());
					cfhqd.setShuliang(0d);
					cfhqd.setTkshuliang(0d);
					cfhqd.setSn(fhqd.getSn());
					cfhqd.setFahuosj(fhqd.getFahuosj());
					cfhqd.setZt("4");
					//cfhqd.setBeizhu("调入来源:"+chuhetong.getHetongbh());
					cfhqd.setSjtksl(0d);
					dataset.add(cfhqd);
					// 新增一条发货明细,维护来源合同,调拨数量,状态为调入=3;
					Atzfahuoqingdan nfhqd = new Atzfahuoqingdan();
					nfhqd.setFahuotzdid(fhqd.getFahuotzdid());;
					nfhqd.setHetongid(fhqd.getHetongid());
					nfhqd.setXiaoshoubmid(fhqd.getXiaoshoubmid());
					nfhqd.setWuliaoid(fhqd.getWuliaoid());
					nfhqd.setShuliang(dbmx.getShuliang());//调拨数量
					nfhqd.setSn(fhqd.getSn());
					nfhqd.setFahuosj(fhqd.getFahuosj());
					nfhqd.setTkshuliang(0d);
					nfhqd.setZt("3");
					nfhqd.setBeizhu("调入来源:"+chuhetong.getHetongbh());
					nfhqd.setSjtksl(0d);
					dataset.add(nfhqd);
				}
				db.setDanjuzt("3");
			} else {
				db.setDanjuzt("5");
			}
			dataset.update(db);
		}else{
			//设置工程项目经理
			Atzhetong ruhetong = (Atzhetong) dataset.getObject(Atzhetong.class, db.getRuhetong());
			String gcxmjl = ruhetong.getGcyszt();
			if (gcxmjl == null) {
				returnMsg.set("NO", "调入合同的工程项目经理没有维护,不能调拨");
				return returnMsg;
			}
			Bc_auth_usr gcxmjlusr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr", "from Bc_auth_usr where employee_name="+gcxmjl);
			if (gcxmjlusr == null) {
				returnMsg.set("NO", "调入合同的工程项目经理查找出错,请联系系统管理员");
				return returnMsg;
			}
			context.set("gcxmjl", gcxmjlusr.getId());
		}
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			logger.error("合同退库审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO", "合同退库审核流程提交失败，请联系系统管理员");
			return returnMsg;
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object AN_合同调拨_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * AN_合同调拨_12
		 */
		List<Atzhetongdbmx> dbmxList = (List<Atzhetongdbmx>) context.get("subobjs");
		if (dbmxList == null || dbmxList.size() <= 0) {
			returnMsg.set("NO", "无明细，请检查");
			return returnMsg;
		}
		for (int i = 0; i < dbmxList.size(); i++) {
			Atzhetongdbmx dbmx = dbmxList.get(i);
			if (dbmx.getSn() != null && !"".equals(dbmx.getSn())) {
				if (dbmx.getShuliang().compareTo(1D) != 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的sn不为空, 调拨数量只能为1");
					return returnMsg;
				}
			} else {
				Atzfahuoqingdan fahuoqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class,
						dbmx.getFahuoqdid());
				Double sysl = com.actiz.util.MathUtil.sub(fahuoqd.getShuliang(), fahuoqd.getTkshuliang());
				if (dbmx.getShuliang().compareTo(sysl) > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行物料明细的数量超过可调拨数量");
					return returnMsg;
				}
			}
		}
		instance.setDanjuzt("1");
		a.setCreateInfo(instance, request);
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}

	private Object A_选择调拨清单后置_12(Atzhetongdb instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_选择调拨清单后置_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		String dchetongid = (String) context.get("dchetongid");
		if (hetongid == null || "".equals(hetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		if (dchetongid == null || "".equals(dchetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong ruhetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(hetongid));
		if (ruhetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong chuhetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(dchetongid));
		if (chuhetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzxiaoshoubm xiaoshoubm = null;
		Atzwuliaojcxx wuliao = null;
		List<Fi_atzhetongdbmx_F34f0bccb00000002zSub> dbmxList = new ArrayList();
		List<String> ids = context.getValueList("atzfahuoqingdan.id");
		for (String fhqdid : ids) {
			Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, Long.parseLong(fhqdid));
			Fi_atzhetongdbmx_F34f0bccb00000002zSub dbmx = new Fi_atzhetongdbmx_F34f0bccb00000002zSub();
			dbmx.setAtzhetongdbmx_fahuoqdid(fhqd.getId());
			dbmx.setAtzhetongdbmx_wuliaoid(fhqd.getWuliaoid());
			dbmx.setAtzhetongdbmx_xiaoshoubmid(fhqd.getXiaoshoubmid());
			xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, fhqd.getXiaoshoubmid());
			wuliao = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, fhqd.getWuliaoid());
			dbmx.setAtzwuliaojcxx_wuliaobm(wuliao.getWuliaobm());
			dbmx.setAtzxiaoshoubm_bianma(xiaoshoubm.getBianma());
			dbmx.setAtzwuliaojcxx_wuliaoms(wuliao.getWuliaoms());
			dbmx.setAtzhetongdbmx_shuliang(com.actiz.util.MathUtil.sub(fhqd.getShuliang(), fhqd.getTkshuliang()));
			dbmx.setAtzhetongdbmx_sn(fhqd.getSn());
			dbmxList.add(dbmx);
		}
		// 初始化单据编号、制单人、制单日期等信息
		Atzhetongdb db = new Atzhetongdb();
		db.setChuhetong(chuhetong.getId());
		db.setRuhetong(ruhetong.getId());
		db.setChujl(chuhetong.getXiaoshoujl());
		db.setRujl(ruhetong.getXiaoshoujl());
		if (chuhetong.getDaqu().compareTo(ruhetong.getDaqu()) != 0) {
			db.setDblx("2");
		} else {
			db.setDblx("1");
		}
		context.set("instance.atzhetongdb", db);
		context.set("instancelist.atzhetongdbmx", dbmxList);
		return "OK";

	}

	private Object A_调拨新增页面加载前规则_12(Atzhetongdb instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_调拨新增页面加载前规则_12
		 */
		String dchetongid = (String) context.get("atzhetong.id");
		logger.error(dchetongid);
		context.set("dchetongid", dchetongid);
		return new HashMap();
	}

	private Object A_合同调拨选择调入合同_12(Atzhetongdb instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_合同调拨选择调入合同_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		logger.error(hetongid);

		String dchetongid = (String) context.get("dchetongid");
		logger.error(dchetongid);
		// 过滤可调拨的发货清单id
		String hql = "from Atzfahuoqingdan where hetongid=" + dchetongid + " and shuliang>0";
		List<Atzfahuoqingdan> fhqdlist = dataset.getListByHql("Atzfahuoqingdan", hql);
		if (fhqdlist == null || fhqdlist.size() <= 0) {
			returnMsg.set("NO", "调出合同没有可调拨的设备,请检查");
			return returnMsg;
		}
		String fhqdids = "(";
		for (Atzfahuoqingdan fhqd : fhqdlist) {
			if (fhqd.getShuliang().compareTo(fhqd.getTkshuliang()) <= 0) {
				continue;
			}
			List list = dataset.getListByHql("Atzshebeiqdmx", "from Atzshebeiqdmx where xiaoshoubmid="
					+ fhqd.getXiaoshoubmid() + " and hetongid=" + hetongid + " and weifhsl >0");
			logger.error("from Atzshebeiqdmx where xiaoshoubmid=" + fhqd.getXiaoshoubmid() + " and hetongid=" + hetongid
					+ " and weifhsl >0");
			if (list != null && list.size() > 0) {
				//logger.error(list.size());
				fhqdids += fhqd.getId() + ",";
			}
		}
		if (fhqdids.length() < 2) {
			returnMsg.set("NO", "调入合同的配置清单中没有与可调拨设备相匹配的数据<br>调拨的设备需在调入合同的配置清单中才可以调拨");
			return returnMsg;
		}
		fhqdids = fhqdids.substring(0, fhqdids.length() - 1) + ")";
		context.set("fhqdids", fhqdids);
		logger.error("fhqdids=" + fhqdids);
		return "OK";
	}
}
