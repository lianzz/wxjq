package rule.啊啊啊;

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
public class RuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object 发货通知设备明细保存前置(Object instance, IDataSet dataset,IDataContext context, HttpServletRequest request, Map paramMap, Logger logger) throws Exception{
			/**
			* 功能： 发货通知设备明细保存前置
			* 说明： 发货通知设备明细保存前置
			* 引用： 合同管理	
			* 作者： 05
			* 创建： 2010-10-28
			* 修改：
			* 原因：
			*/
    	   
    	  
    	 //针对新添加的明细，维护一下父亲ID，
    	 Long fahuotzdId= Long.parseLong((String)context.get("atzfahuotzd.id"));
    	 logger.error("fahuotzdId=========="+fahuotzdId);
    	 List insertObjs = (List)context.get("insertobjects");
    	 if(insertObjs!=null && insertObjs.size()>0)
    	 {
    	 	for(Iterator iter = insertObjs.iterator();iter.hasNext();)
    	 	{
    	 	  Atzfahuosbqdmx mx= (Atzfahuosbqdmx)iter.next();
    	 	  mx.setFahuotzdid(fahuotzdId);
    	    mx.setLururq(new Date());
    	    Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm)dataset.getObject(Atzxiaoshoubm.class,mx.getXiaoshoubmid());
	   	  	mx.setXiaoshoubm(xiaoshoubm.getBianma());
	   	  	mx.setWuliaoms(xiaoshoubm.getWuliaoms());
	   	  	mx.setGuigedw(xiaoshoubm.getGuigedw());
	   	  	mx.setDanwei(xiaoshoubm.getDanwei());
	   	  	mx.setShebeiqdmxid(0L);
                                                mx.setLururq(new Date());
    	 	}
    	 	context.set("insertobjects",insertObjs);
    	 }

    	 //对于修改了数据的明细
    	 List updateObjs = (List)context.get("updateobjects");  //修改了的部分的明细
    	 Hashtable updateObjsold =(Hashtable)context.get("updateobjectsold"); //所修改了的明细的修改前的数据
    	 if(updateObjs!=null && updateObjs.size()>0)
    	 {
    	 	for(Iterator iter = updateObjs.iterator();iter.hasNext();)
    	 	{
    	 	   Atzfahuosbqdmx mx= (Atzfahuosbqdmx)iter.next();
    	 	   Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, mx.getXiaoshoubmid());
    	 	   if(xiaoshoubm != null){
	    	 	   mx.setXiaoshoubm(xiaoshoubm.getBianma());
	    	 	   mx.setWuliaoms(xiaoshoubm.getWuliaoms());
	    	 	   dataset.update(mx);
    	 	   }
    	 	   
    	 	   Atzfahuosbqdmx mxold = (Atzfahuosbqdmx)updateObjsold.get(mx.getId());
    	 	   if(mx !=null&& mxold!=null)
    	 	   {
    	 	   	   if(mx.getShebeiqdmxid()!=null &&mx.getShebeiqdmxid()>0)
    	 	   	   {
    	 	   	    Atzshebeiqdmx shebeiqdmx = (Atzshebeiqdmx)dataset.getObject(Atzshebeiqdmx.class,mx.getShebeiqdmxid());
    	 	   	    if(shebeiqdmx != null)
    	 	   	    {
    	 	   	    	logger.error("shebeiqdmx.Weifhsl---before----"+shebeiqdmx.getWeifhsl());
	    	          shebeiqdmx.setWeifhsl(shebeiqdmx.getWeifhsl()+mxold.getShuliang()-mx.getShuliang());
	    	          logger.error("shebeiqdmx.Weifhsl---after----"+shebeiqdmx.getWeifhsl());
	    	          if(shebeiqdmx.getWeifhsl()<0D)
	    	           shebeiqdmx.setWeifhsl(0D);
	    	          dataset.update(shebeiqdmx);
    	 	   	    }    	          
    	        }
    	  	   } 	   	 
    	 	}    	 	
    	 }
    	 
    	 //对于删除了的数据的明细
    	 List deleteObjs = (List)context.get("deleteobjects");
    	  if(deleteObjs!=null && deleteObjs.size()>0)
    	 {
    	 	for(Iterator iter = deleteObjs.iterator();iter.hasNext();)
    	 	{
    	 	   Atzfahuosbqdmx mx= (Atzfahuosbqdmx)iter.next();
    	 	   if(mx !=null)
    	 	   {
    	 	   	   if(mx.getShebeiqdmxid()!=null &&mx.getShebeiqdmxid()>0)
    	 	   	   {
    	 	   	    Atzshebeiqdmx shebeiqdmx = (Atzshebeiqdmx)dataset.getObject(Atzshebeiqdmx.class,mx.getShebeiqdmxid());
    	 	   	    if(shebeiqdmx !=null)
    	 	   	    {
    	 	   	    	logger.error("shebeiqdmx.Weifhsl---before----"+shebeiqdmx.getWeifhsl());
	    	          shebeiqdmx.setWeifhsl(mx.getShuliang());
	    	          logger.error("shebeiqdmx.Weifhsl---after----"+shebeiqdmx.getWeifhsl());
	    	          dataset.update(shebeiqdmx);
    	 	   	    }    	          
    	        }
    	  	   } 	   	 
    	 	}    	 	
    	 }
                 context.set("atzfahuotzd.id",(String)context.get("atzfahuotzd.id"));
    	 return "OK";
	}
}
