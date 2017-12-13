package code;

import java.util.*;
import java.util.Date;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
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
	
	private Object AN_合同调拨_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	private Object A_选择调拨清单后置_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
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
			Atzfahuoqingdan fhqd = (Atzfahuoqingdan) dataset.getObject(Atzfahuoqingdan.class, fhqdid);
			Fi_atzhetongdbmx_F34f0bccb00000002zSub dbmx = new Fi_atzhetongdbmx_F34f0bccb00000002zSub();
			dbmx.setAtzhetongdbmx_fahuoqdid(fhqd.getId());
			dbmx.setAtzhetongdbmx_wuliaoid(fhqd.getWuliaoid());
			dbmx.setAtzhetongdbmx_xiaoshoubmid(fhqd.getXiaoshoubmid());
			xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, fhqd.getXiaoshoubmid());
			wuliao = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, fhqd.getWuliaoid());
			dbmx.setAtzwuliaojcxx_wuliaobm(wuliao.getWuliaobm());
			dbmx.setAtzxiaoshoubm_bianma(xiaoshoubm.getBianma());
			dbmx.setAtzwuliaojcxx_wuliaoms(wuliao.getWuliaoms());
			dbmx.setAtzhetongdbmx_shuliang(fhqd.getShuliang());
			dbmx.setAtzhetongdbmx_sn(fhqd.getSn());
			dbmxList.add(dbmx);
		}
		// 初始化单据编号、制单人、制单日期等信息
		Atzhetongdb db = new Atzhetongdb();
		db.setChuhetong(chuhetong.getId());
		db.setRuhetong(ruhetong.getId());
		db.setChujl(chuhetong.getXiaoshoujl());
		db.setRujl(ruhetong.getXiaoshoujl());
		if (chuhetong.getDaqu() != ruhetong.getDaqu()) {
			db.setDblx("2");
		}else{
			db.setDblx("1");
		}
		context.set("instance.atzhetongdb", db);
		context.set("instancelist.atzhetongdbmx", dbmxList);
		return "OK";
	
	}
	
	
	private Object A_调拨新增页面加载前规则_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A_调拨新增页面加载前规则_12
		 */
		String	dchetongid = (String) context.get("atzhetong.id");
		logger.error(dchetongid);
		context.set("dchetongid", dchetongid);
		return new HashMap();
	}
	
	private Object A_合同调拨选择调入合同_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A_合同调拨选择调入合同_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		logger.error(hetongid);
		
		String dchetongid = (String) context.get("dchetongid");
		logger.error(dchetongid);
		//过滤可调拨的发货清单id
		String hql = "from Atzfahuoqingdan where hetongid="+dchetongid+" and shuliang>0";
		List<Atzfahuoqingdan> fhqdlist = dataset.getListByHql("Atzfahuoqingdan", hql);
		if (fhqdlist == null || fhqdlist.size()<=0) {
			returnMsg.set("NO", "调出合同没有可调拨的设备,请检查");
			return returnMsg;
		}
		String fhqdids = "(";
		for (Atzfahuoqingdan fhqd : fhqdlist) {
			List list = dataset.getListByHql("Atzshebeiqdmx", "from Atzshebeiqdmx where xiaoshoubmid="+fhqd.getXiaoshoubmid()+" and hetongid="+hetongid+" and weifhsl >0");
			logger.error("from Atzshebeiqdmx where xiaoshoubmid="+fhqd.getXiaoshoubmid()+" and hetongid="+hetongid+" and weifhsl >0");
			if (list != null && list.size()>0) {
				logger.error(list.size());
				fhqdids += fhqd.getId()+",";
			}
		}
		if (fhqdids.length() < 2) {
			returnMsg.set("NO", "调入合同的配置清单中没有与可调拨设备相匹配的数据\n调拨的设备需在调入合同的配置清单中才可以调拨");
			return returnMsg;
		}
		fhqdids = fhqdids.substring(0, fhqdids.length()-1)+")";
		context.set("fhqdids", fhqdids);
		logger.error("fhqdids="+fhqdids);
		return "OK";
	}
}
