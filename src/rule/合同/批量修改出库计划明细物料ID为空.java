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

@SuppressWarnings("unused")
public class 批量修改出库计划明细物料ID为空 extends RuleEngine{
	private static Logger logger = Logger.getLogger(批量修改出库计划明细物料ID为空.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			//Long fahuotzdid = instance.getId();
			String shzt = instance.getShenhezt();
	    String shyj = instance.getShenheyj();
      Atzfahuosbqdmx fahuosbqdmx = null;
      Atzwuliaojcxx wuliao = null;
      Long wuliaoid = null;
      String hql = null;
      Integer count = 0;
      Date date = new Date();
      List<Atzfahuosbqdmx> fahuosbqdmxs =  (List<Atzfahuosbqdmx>)context.get("subobjs_new");//明细
      logger.debug("fahuosbqdmxs.size()==="+fahuosbqdmxs.size());
      if(fahuosbqdmxs != null && fahuosbqdmxs.size()>0){
          for(int i=0;i<fahuosbqdmxs.size();i++){
              fahuosbqdmx = fahuosbqdmxs.get(i);
              wuliaoid = fahuosbqdmx.getWuliaoid();
              wuliao = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
              hql = "from Atzfahuosbqdmx where fahuotzdid="+instance.getId()+" and wuliaoid="+wuliaoid;
              List qmlist= dataset.getListByHql("Atzfahuosbqdmx",hql);
              if(qmlist!=null && qmlist.size()>0){
                  //销售编码重复
                  returnMsg.set("NO", "物料编码为"+wuliao.getWuliaobm()+"的设备已存在于该发货通知单中，请检查");
                  return returnMsg;
              }
              //维护冗余字段
              fahuosbqdmx.setFahuotzdid(instance.getId());
          
              fahuosbqdmx.setLururq(date);
          }
      }
      
      fahuosbqdmxs =  (List<Atzfahuosbqdmx>)context.get("subobjs");//明细
      logger.debug("fahuosbqdmxs.size()==="+fahuosbqdmxs.size());
      if(fahuosbqdmxs != null && fahuosbqdmxs.size()>0){
          for(int i=0;i<fahuosbqdmxs.size();i++){
              fahuosbqdmx = fahuosbqdmxs.get(i);
              wuliaoid = fahuosbqdmx.getWuliaoid();
          
              //维护冗余字段
              fahuosbqdmx.setFahuotzdid(instance.getId());
          
              fahuosbqdmx.setLururq(date);
          }
      }
      A.setModifyInfo(instance, request);

	    boolean result = completeWorkflowTask(request, context);
	    if(!result){
	        logger.error("附配件审核流程提交失败，请联系系统管理员");
	      returnMsg.set("NO","附配件审核流程提交失败，请联系系统管理员");
	        return returnMsg;
	    }else{
	    }
	    returnMsg.set("OK","提交成功");
	    return returnMsg;
		//###############################2723564####################################################################

			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}