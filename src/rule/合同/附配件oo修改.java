package rule.合同;

import java.util.*;
import java.util.Date;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("all")
public class 附配件oo修改 extends RuleEngine{
	private static Logger logger = Logger.getLogger(附配件oo修改.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################			
			/**
			 * A-发货通知设备新增-12
			 * 功能：数据校验
			 * 销售编码 	不能重复
			 * 销售编码 	在设备清单明细中必须存在
			 */
			//合同id
			Long hetongid = instance.getHetongid();
			if(hetongid == null){
				logger.error("合同id不存在");
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			//发货设备明细中的销售编码，数量是否有效
			Atzfahuosbqdmx fahuosbqdmx = null;
			Atzxiaoshoubm xiaoshoubm = null;
			Long xiaoshoubmid = null;
			String hql = null;
			Integer count = 0;
			Date date = new Date();
			List<Atzfahuosbqdmx> fahuosbqdmxs =  (List<Atzfahuosbqdmx>)context.get("subobjs_new");//明细
			logger.debug("fahuosbqdmxs.size()==="+fahuosbqdmxs.size());
			if(fahuosbqdmxs != null && fahuosbqdmxs.size()>0){
				for(int i=0;i<fahuosbqdmxs.size();i++){
					fahuosbqdmx = fahuosbqdmxs.get(i);
					xiaoshoubmid = fahuosbqdmx.getXiaoshoubmid();
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, fahuosbqdmx.getXiaoshoubmid());
					if(xiaoshoubm == null){
						logger.error("销售编码查询异常");
						logger.error("id=="+fahuosbqdmx.getXiaoshoubmid());
						returnMsg.set("NO", "系统异常，请联系系统管理员");
					}
					logger.debug("发货xiaoshoubmid=="+xiaoshoubmid);
					hql = "from Atzfahuosbqdmx where fahuotzdid="+instance.getId()+" and xiaoshoubmid="+xiaoshoubmid;
					List qmlist= dataset.getListByHql("Atzfahuosbqdmx",hql);
					if(qmlist!=null && qmlist.size()>0){
						//销售编码重复
						returnMsg.set("NO", "销售编码为"+xiaoshoubm.getBianma()+"的设备已存在于该发货通知单中，请检查");
						return returnMsg;
					}
					//维护冗余字段
					fahuosbqdmx.setFahuotzdid(instance.getId());
					fahuosbqdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
					fahuosbqdmx.setXiaoshoubm(xiaoshoubm.getBianma());
					fahuosbqdmx.setGuigedw(xiaoshoubm.getGuigedw());
					fahuosbqdmx.setDanwei(xiaoshoubm.getDanwei());
					fahuosbqdmx.setLururq(date);
				}
			}
			
			fahuosbqdmxs =  (List<Atzfahuosbqdmx>)context.get("subobjs");//明细
			logger.debug("fahuosbqdmxs.size()==="+fahuosbqdmxs.size());
			if(fahuosbqdmxs != null && fahuosbqdmxs.size()>0){
				for(int i=0;i<fahuosbqdmxs.size();i++){
					fahuosbqdmx = fahuosbqdmxs.get(i);
					xiaoshoubmid = fahuosbqdmx.getXiaoshoubmid();
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, fahuosbqdmx.getXiaoshoubmid());
					if(xiaoshoubm == null){
						logger.error("销售编码查询异常");
						logger.error("id=="+fahuosbqdmx.getXiaoshoubmid());
						returnMsg.set("NO", "系统异常，请联系系统管理员");
					}
					logger.debug("发货xiaoshoubmid=="+xiaoshoubmid);
					//维护冗余字段
					fahuosbqdmx.setFahuotzdid(instance.getId());
					fahuosbqdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
					fahuosbqdmx.setXiaoshoubm(xiaoshoubm.getBianma());
					fahuosbqdmx.setGuigedw(xiaoshoubm.getGuigedw());
					fahuosbqdmx.setDanwei(xiaoshoubm.getDanwei());
					fahuosbqdmx.setLururq(date);
				}
			}
			A.setModifyInfo(instance, request);
			returnMsg.set("OK", "修改成功");
			return returnMsg;
		//###############################2723564####################################################################

			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}