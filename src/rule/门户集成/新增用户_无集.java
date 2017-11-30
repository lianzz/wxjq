package rule.门户集成;

import java.util.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class 新增用户_无集 extends RuleEngine {
	private static Logger logger = Logger.getLogger(新增用户_无集.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset, HttpServletRequest request,
			Map<String, Object> paramMap, Logger logger,
			// 实体名字
			Atzxiangmupzqd instance) throws Exception {
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-新增用户接口-12 门户调用新增用户接口，增加用户，返回用户登录账户名称，UserID
			 */
			String yggh = (String) paramMap.get("yggh");
			String ygxm = (String) paramMap.get("ygxm");
			String ygyx = (String) paramMap.get("ygyx");
			String ygmm = (String) paramMap.get("ygmm");
			if (yggh == null || "".equals(yggh) || ygxm == null || "".equals(ygxm) || ygyx == null || "".equals(ygyx)
					|| ygmm == null || "".equals(ygmm)) {
				return "NO##参数传递有误";
			}
			
			boolean flag = false;
			try {
				String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
				Pattern regex = Pattern.compile(check);
	            Matcher matcher = regex.matcher(ygyx);
	            flag = matcher.matches();
			} catch (Exception e) {
				flag = false;
			}
			if (!flag) {
				return "NO##邮箱格式有误";
			}
			String emailqz = ygyx.substring(0, ygyx.indexOf("@"));
			logger.debug("emailqz==="+emailqz);
			
			List ygs = dataset.getListByHql("Atzemployee", "from Atzemployee where empcode='" + yggh + "'");
			if (ygs != null && ygs.size() > 0) {
				//员工已存在
				Atzemployee yuang = (Atzemployee) ygs.get(0);
				List<Atztuandui> teamList = dataset.getListByHql("Atztuandui","from Atztuandui where status =2 and bumenid="+yuang.getBumenid());
				if(teamList == null || teamList.size()<0){
					return "NO##员工已存在，部门查找错误";
				}
				Atztdyg emp = (Atztdyg) dataset.getObjectByHql("Atztdyg", "from Atztdyg where yuangongid ="+yuang.getId());
				if(emp == null){
					//团队员工不存在，新增
					 emp = new Atztdyg();
					 emp.setGuanxi(yuang.getName() + "-" + teamList.get(0).getMingcheng());
					 emp.setTuanduiid(teamList.get(0).getId());
					 emp.setYuangongid(yuang.getId());
//					 emp.setDelflag("0");
//					 emp.setMainflag("1");
					 emp.setStatus(1);
					 emp.setTeamseq(teamList.get(0).getLujing());
					 emp.setYuangongmc(ygxm);
					dataset.add(emp);
				}
				Bc_auth_usr usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr", "from Bc_auth_usr where team_employee_id="+emp.getId());
				if(usr == null){
					//用户不存在，新增用户
					List usrList = dataset.getListByHql("Bc_auth_usr", "from Bc_auth_usr where loginid='"+emailqz+"'");
					if (usrList != null && usrList.size()>0) {
						return "NO##邮箱重复";
					}
					usr = new Bc_auth_usr();
					usr.setLoginid(yggh);
					usr.setPasswd(encode(ygmm));// 设置初始密码
					usr.setEasy(0);
					usr.setEmpid(yuang.getId());
					usr.setName(yuang.getName());
					usr.setEmail(yuang.getEmail());
					usr.setStatus("1");// 1表示存在，0表示删除
					usr.setTeam_employee_id(emp.getId());
					usr.setEmployee_name(yuang.getName());
					usr.setTeamseq(teamList.get(0).getLujing());
					usr.setActizcompanyid(0L);
					dataset.add(usr);
				}
					return "OK##"+usr.getLoginid()+"##"+usr.getId();
							
			}
			//员工不存在，新增
			
			Long usrId = null;
			String loginId = null;

			List usrList = dataset.getListByHql("Bc_auth_usr", "from Bc_auth_usr where loginid='"+emailqz+"'");
			if (usrList != null && usrList.size()>0) {
				return "NO##邮箱重复";
			}
			
			
			Atzemployee newyg = new Atzemployee();
			newyg.setEmpcode(yggh);
			newyg.setName(ygxm);
			newyg.setEmail(ygyx);
			newyg.setStatus(1);
			newyg.setShifoulz("2");// 是否离职
			Date now = new Date();
			newyg.setCreatetime(now);
			dataset.add(newyg);
			// 设置部门
			Atzdepartment bumen = (Atzdepartment) dataset.getObjectByHql("Atzdepartment", "from Atzdepartment where orgname='新入职' and statuss !=0");
			if(bumen == null){
				return "NO##系统运行出错，找不到部门信息";
			}
			newyg.setBumenid(bumen.getId());
			List<Atztuandui> tuanduiList = dataset.getList("Atztuandui",
					"status =2 and bumenid = " + newyg.getBumenid());
			if (tuanduiList != null && tuanduiList.size() > 0) {
				// 在默认团队下增加一条团队员工的记录
				Atztdyg tuanduiyg = new Atztdyg();
				tuanduiyg.setGuanxi(newyg.getName() + "-" + tuanduiList.get(0).getMingcheng());
				tuanduiyg.setTuanduiid(tuanduiList.get(0).getId());
				tuanduiyg.setYuangongid(newyg.getId());
				tuanduiyg.setStatus(1);
				tuanduiyg.setEmail(newyg.getEmail());
				tuanduiyg.setTeamseq(tuanduiList.get(0).getLujing());
				tuanduiyg.setYuangongmc(newyg.getName());
				dataset.add(tuanduiyg);
				
				// 自动生成用户数据，并初始密码
				Bc_auth_usr usr = new Bc_auth_usr();
				usr.setLoginid(emailqz);
				usr.setPasswd(ygmm);// 设置初始密码
				usr.setEasy(0);
				usr.setEmpid(newyg.getId());
				usr.setName(newyg.getName());
				usr.setEmail(newyg.getEmail());
				usr.setStatus("1");// 1表示存在，0表示删除
				usr.setTeam_employee_id(tuanduiyg.getId());
				usr.setEmployee_name(newyg.getName());
				usr.setTeamseq(tuanduiList.get(0).getLujing());
				usr.setActizcompanyid(0L);
				dataset.add(usr);
				usrId = usr.getId();
				loginId = usr.getLoginid();
			}
			newyg.setYgseq("." + newyg.getId() + ".");
			dataset.update(newyg);
			return "OK##" + loginId+"##"+usrId;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
