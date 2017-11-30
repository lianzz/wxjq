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
public class 发货通知单oo删除 extends RuleEngine{
	private static Logger logger = Logger.getLogger(发货通知单oo删除.class);
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
			* 功能： 删除发货通知单
			* 说明： 删除发货通知单，回写明细所对应设备清单明细的未发货数量
			* 引用： 合同管理	
			* 作者： 05
			* 创建： 2010-10-28
			* 修改：2010-11-17
			* 原因：添加回写设备清单明细未发货数量
			*/
  	   
	   	   
	   	     	List <Atzfahuosbqdmx> fahuosbmxList =dataset.getList("Atzfahuosbqdmx","fahuotzdid ="+instance.getId());
	   	     	if(fahuosbmxList !=null &&fahuosbmxList.size()>0){
		   	     	dataset.deleteAll(fahuosbmxList);
	   	     	}
	   	     	dataset.delete(instance);
	   	     	context.remove("atzfahuotzd.id");	   	     	
	   	     	returnMsg.set("OK", "删除成功");
	   	      return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
