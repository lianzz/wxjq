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
public class 删除员工 extends RuleEngine{
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzemployee instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			* 功能：删除员工 
			* 说明：删除员工 
			* 引用：组织机构 
			* 作者：07 
			* 创建：20090318 
			* 修改：2009-5-26去掉旧的工作分工，并因在团队员工上设置帐号而改
			* 原因：
			*/

			  //1、0表示删除,1表示存在.
			instance.setStatus(0);
			instance.setShifoulz("1");
			a.setModifyInfo(instance,request);
			  //2、删除员工并删除相应的团队-员工记录、以及团队员工对应的用户记录
			List <Atztdyg> tdygList = dataset.getList("Atztdyg","status != 0 and yuangongid ="+instance.getId());
			if(tdygList != null && tdygList.size()>0)
			{
				for(int i=0;i<tdygList.size();i++)
				{
					Atztdyg tdyg = tdygList.get(i);
					tdyg.setStatus(0);
					List <Bc_auth_usr> userList = dataset.getList("Bc_auth_usr","team_employee_id ="+tdyg.getId());
					if(userList != null && userList.size()>0)
					{
						for(Bc_auth_usr usr:userList){
							usr.setStatus("0");
							dataset.update(usr);
						}
					}            			
				}
				dataset.updateAll(tdygList);
			}
			dataset.update(instance);
			context.remove("atzemployee.id");
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
