package rule.销售;

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
public class 销售机会信息隔绝规则 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售机会信息隔绝规则.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则 and name ='销售助理' or name ='销售部总经理' or name ='销售人员'
			// ###################################################################################################
			Long empid = (Long) request.getSession().getAttribute("employeeid");
			String ids = "";
			String hql = "";
			if(empid != null){
				hql = "from Bc_auth_roles where id in (select role_id from Bc_auth_userrole where user_id in (select id from Bc_auth_usr where team_employee_id in(select id from Atztdyg where yuangongid="+empid+"))) and (name ='销售助理' or name ='销售部总经理' or name ='销售人员' or name='海外销售')";
				logger.debug(hql);
				List<Bc_auth_roles> roles = (List<Bc_auth_roles>)dataset.getListByHql("Bc_auth_roles", hql);
				logger.debug("roles.size=="+roles.size());
				if(roles != null && roles.size()>0){
					ids = "id in (-1";
					String roleName = "";
					List<Atzxiaoshoujh> xsjhs = new ArrayList<Atzxiaoshoujh>();
					Atzdepartment bdep = (Atzdepartment) dataset.getObjectByHql("Atzdepartment", "from Atzdepartment where id in ( select bumenid from Atzemployee where id="+empid+")");
					Atzdepartment fzdep = (Atzdepartment) dataset.getObjectByHql("Atzdepartment", "from Atzdepartment where managerid ="+empid+")");
					if(bdep == null){
						returnMsg.set("NO", "查询出错，请联系系统管理员");
						return returnMsg;
					}
					for(Bc_auth_roles role : roles){
						roleName = role.getName();
						logger.debug(roleName);
						if(roleName.equals("销售人员") || roleName.equals("海外销售")){
							//客户销售经理为登陆人
							xsjhs = dataset.getListByHql("Atzxiaoshoujh","from Atzxiaoshoujh where xiaoshoujl="+empid+" or xiaoshoujl is null");
							if(xsjhs != null && xsjhs.size()>0)
								for(Atzxiaoshoujh xsjh : xsjhs)
									ids += ","+xsjh.getId();
						}
						if(roleName.equals("销售助理")){
							//本部门
							hql = "from Atzxiaoshoujh where xiaoshoujl in (select id from Atzemployee where bumenid="+bdep.getId()+") or xiaoshoujl is null";
							xsjhs = dataset.getListByHql("Atzxiaoshoujh", hql);
							if(xsjhs != null && xsjhs.size()>0)
								for(Atzxiaoshoujh xsjh : xsjhs)
									ids += ","+xsjh.getId(); 
						}
						if(roleName.equals("销售部总经理")){
							//本部门及下属部门
							if(fzdep != null ){
								hql = "from Atzxiaoshoujh where xiaoshoujl in (select id from Atzemployee where bumenid in (select id from Atzdepartment where lujing like '"+fzdep.getLujing()+"%')) or xiaoshoujl is null";
							}else{
								hql = "from Atzxiaoshoujh where xiaoshoujl in (select id from Atzemployee where bumenid in (select id from Atzdepartment where lujing like '"+bdep.getLujing()+"%')) or xiaoshoujl is null";
							}
							xsjhs = dataset.getListByHql("Atzxiaoshoujh", hql);
							if(xsjhs != null && xsjhs.size()>0)
								for(Atzxiaoshoujh xsjh : xsjhs)
									ids += ","+xsjh.getId(); 
		 				}
					}
					ids += ")";
				}else{
					ids = "(1=1)";
				}
			}else{
				ids = "(1=1)";
			}
			logger.debug("ids====" + ids);
			context.set("atzxiaoshoujh.ids", ids);
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
