package rule.组织机构;

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
public class 请假单列表显示权限控制 extends RuleEngine{
	private static Logger logger = Logger.getLogger(请假单列表显示权限控制.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzqingjiad instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			Long employeeId=(Long) request.getSession().getAttribute("employeeid");
			String ids="";			
			if(employeeId!=null){
				List<Atzdepartment> deptList =dataset.getListByHql("Atzdepartment"," from Atzdepartment where managerid="+employeeId);
				for (Atzdepartment dept:deptList){
					List<Atzqingjiad> qjdList=dataset.getListByHql("Atzqingjiad","  from Atzqingjiad where lururid  in  (select id from Atzemployee where bumenid in ( select id from Atzdepartment where lujing like '"+dept.getLujing()+"%'))");
					for(Atzqingjiad qjd:qjdList){
						ids=ids+qjd.getId()+",";
						}
					}
				List<Atzqingjiad> qjdList=dataset.getListByHql("Atzqingjiad","  from Atzqingjiad where lururid ="+employeeId);
					for(Atzqingjiad qjd:qjdList){
						ids=ids+qjd.getId()+",";
						}
				}
				if(ids.length()>1){
					ids="("+ids.substring(0,ids.length()-1)+")";
			      	
					context.set("atzqingjiad.ids",ids);
					
			    }else{
			    ids="(-1)";
			     context.set("atzqingjiad.ids",ids);
			    }
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
