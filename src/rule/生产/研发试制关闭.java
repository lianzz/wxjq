package rule.生产;

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
import com.actiz.util.security.encode.impl.Md5Encode;

import ode.util.OdeValidator;

@SuppressWarnings("unused")
public class 研发试制关闭 extends RuleEngine{
	private static Logger logger = Logger.getLogger(研发试制关闭.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzyanfasz instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			Long yanfaszid = Long.parseLong((String)context.get("atzyanfasz.id"));
			logger.debug("yanfaszid:==="+yanfaszid);
			Atzyanfasz yanfasz = (Atzyanfasz)dataset.getObject(Atzyanfasz.class,yanfaszid);
			if(yanfasz == null){
				logger.error("研发试制查询出错，id="+yanfaszid);
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			String hql = "";
			boolean deletescjh = false;
			boolean deletescrw = false;
			Atzscjh scjh = null;
			Atzscrw scrw = null;
			String yewuzt = yanfasz.getYewuzt();
			if(yewuzt.equals("0")){
				returnMsg.set("NO", "研发试制未提交，无需关闭");
				return returnMsg;
			}
			//研发试制流程小于2,删除流程数据，状态改为未提交
			if("1".equals(yewuzt) || "2".equals(yewuzt)){
				hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
				dataset.batchUpdate("Atztask", hql);
				hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
				dataset.batchUpdate("Atzrelatedbo", hql);
				yanfasz.setYewuzt("0");
				dataset.update(yanfasz);
				returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
				return returnMsg;
			}
			hql = "from Atzscjhmx where yfszid="+yanfasz.getId();
			Atzscjhmx scjhmx = (Atzscjhmx)dataset.getObjectByHql("Atzscjhmx", hql);
			//无生产计划明细，删除研发试制流程数据，状态改为未提交 over
			if(scjhmx == null ){
				hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
				dataset.batchUpdate("Atztask", hql);
				hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
				dataset.batchUpdate("Atzrelatedbo", hql);
				yanfasz.setYewuzt("0");
				dataset.update(yanfasz);
				returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
				return returnMsg;
			}
			//有生产计划明细
			List scjhmxs = dataset.getList("Atzscjhmx","atzscjhid="+scjhmx.getAtzscjhid());
			//该生产计划存在多条明细，删除该条明细
			if(scjhmxs.size() == 1){
				//dataset.delete(scjhmx);
				//该生产计划只有这一条明细，需要删除生产计划，该条明细
				scjh = (Atzscjh)dataset.getObject(Atzscjh.class, scjhmx.getAtzscjhid());
				if(scjh == null){
					logger.error("研发试制关闭：生产计划查询出错，id="+yanfaszid);
					returnMsg.set("NO", "系统运行异常，请联系系统管理员");
					return returnMsg;
				}
				//生产计划流程未结束，删除流程数据，生产计划单据，明细，及研发试制流程数据，over
				if(!"3".equals(scjh.getShenhezt())){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					dataset.delete(scjhmx);
					dataset.delete(scjh);
					hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					yanfasz.setYewuzt("0");
					dataset.update(yanfasz);
					returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
					return returnMsg;
				}
				deletescjh = true;
			}
			Atzscrwmx scrwmx = (Atzscrwmx)dataset.getObjectByHql("Atzscrwmx", "from Atzscrwmx where scjhmxid="+scjhmx.getId());
			if(scrwmx == null){
				//未生成生产任务
				//删除生产计划及明细，流程和数据
				//删除研发试制流程数据
				if(deletescjh){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					dataset.delete(scjh);
				}
				dataset.delete(scjhmx);
				hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
				dataset.batchUpdate("Atztask", hql);
				hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
				dataset.batchUpdate("Atzrelatedbo", hql);
				yanfasz.setYewuzt("0");
				dataset.update(yanfasz);
				returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
				return returnMsg;
			}
			List scrwmxs = dataset.getList("Atzscrw","scjhmxid="+scjhmx.getId());
			if(scrwmxs.size() == 1){
			//该生产计划只有这一条明细，需要删除生产计划，该条明细
				scrw = (Atzscrw)dataset.getObject(Atzscrw.class, scjhmx.getAtzscjhid());
				if(scrw == null){
					logger.error("研发试制关闭：生产任务查询出错，研发试制id="+yanfaszid);
					returnMsg.set("NO", "系统运行异常，请联系系统管理员");
					return returnMsg;
				}
				//生产计划流程未结束，删除流程数据，生产计划单据，明细，及研发试制流程数据，over
				if(!"3".equals(scrw.getShenhezt())){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					dataset.delete(scrw);
					dataset.delete(scrwmx);
					if(deletescjh){
						hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId()+")";
						dataset.batchUpdate("Atztask", hql);
						hql = "delete Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId();
						dataset.batchUpdate("Atzrelatedbo", hql);						
						dataset.delete(scjh);
					}
					dataset.delete(scjhmx);
					hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					yanfasz.setYewuzt("0");
					dataset.update(yanfasz);
					returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
					return returnMsg;
				}
				deletescrw = true;
			}
			//出入库计划
			List jhds = dataset.getList("Atzchurukjhd","scrwid="+scrw.getId());
			if(jhds == null || jhds.size()==0){
				//删除scjhmx,scrwmx,yanfasz
				if(deletescrw){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					dataset.delete(scrw);
				}
				dataset.delete(scrwmx);
				if(deletescjh){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);						
					dataset.delete(scjh);
				}
				dataset.delete(scjhmx);
				hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
				dataset.batchUpdate("Atztask", hql);
				hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
				dataset.batchUpdate("Atzrelatedbo", hql);
				yanfasz.setYewuzt("0");
				dataset.update(yanfasz);
				returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
				return returnMsg;
			}
			//生成任务明细只有一条
			if(scrwmxs.size() == 1){
				//查询出入库是否执行，已执行，不能关闭，未执行或未生成出库单可以关闭
				hql = "from Atzchurukd where shifouzx='1' and churukjhdid in(select id from Atzchurukjhd where scrwdid="+scrw.getId()+")";
				List crkds = dataset.getListByHql("Atzchurukd", hql);
				if(crkds != null && crkds.size()>0){
					//存在已执行的出入库单，不能关闭
					returnMsg.set("NO", "研发试制关联的出入库单已执行，无法关闭");
					return returnMsg;
				}
				//删除出入库计划单，出入库单
				hql = "delete Atzchurukjhd where scrwdid="+scrw.getId();
				dataset.batchUpdate("Atzchurukjhd", hql);
				hql = "delete Atzchurukd where churukjhdid in(select id from Atzchurukjhd where scrwdid="+scrw.getId()+")";
				dataset.batchUpdate("Atzchurukd", hql);		
				//删除scjhmx,scrwmx,yanfasz
				if(deletescrw){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscrw' and boid="+scrw.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);
					dataset.delete(scrw);
				}
				dataset.delete(scrwmx);
				if(deletescjh){
					hql = "delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId()+")";
					dataset.batchUpdate("Atztask", hql);
					hql = "delete Atzrelatedbo where boname like '%atzscjh' and boid="+scjh.getId();
					dataset.batchUpdate("Atzrelatedbo", hql);						
					dataset.delete(scjh);
				}
				dataset.delete(scjhmx);
				hql="delete Atztask where id in (select atztaskid from Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId()+")";
				dataset.batchUpdate("Atztask", hql);
				hql = "delete Atzrelatedbo where boname like '%atzyanfasz' and boid="+yanfasz.getId();
				dataset.batchUpdate("Atzrelatedbo", hql);
				yanfasz.setYewuzt("0");
				dataset.update(yanfasz);
				returnMsg.set("OK", "研发试制已关闭，并删除相关单据");
				return returnMsg;
			}
			//生产任务明细有多条
			//出库计划
			Atzchurukjhd ckjhd = (Atzchurukjhd)dataset.getObjectByHql("Atzchurukjhd", "from Atzchurukjhd where danjulx='2' and scrwid="+scrw.getId());
			//查询出入库是否执行，已执行，不能关闭，未执行或未生成出库单可以关闭
			hql = "from Atzchurukd where shifouzx='1' and churukjhdid in(select id from Atzchurukjhd where scrwdid="+scrw.getId()+")";
			List crkds = dataset.getListByHql("Atzchurukd", hql);
			if(crkds != null && crkds.size()>0){
				//存在已执行的出入库单，不能关闭
				returnMsg.set("NO", "研发试制关联的出入库单已执行，无法关闭");
				return returnMsg;
			}
		//需要考虑出库计划明细的bom分析结果,将明细数量减去
			//删除出库计划明细
			//删除入库计划明细
			if(deletescjh){
				//删除生产计划
			}
			if(deletescrw){
				//删除生产任务
			}
			// ###################################################################################################
			// over
			//
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
