package rule.门户集成;

import java.util.*;
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
public class 禁用启用员工_无集 extends RuleEngine {
	private static Logger logger = Logger.getLogger(禁用启用员工_无集.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset, HttpServletRequest request, Map paramMap,
			Logger logger,
			// 实体名字
			Atzxiangmupzqd instance) throws Exception {
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-启用禁用用户接口-12 根据员工号，状态 启用禁用账户 1为启用，0为禁用
			 */
			String yggh = (String) paramMap.get("yggh");
			String ygzt = (String) paramMap.get("ygzt");
			logger.error(yggh);
			logger.error(ygzt);
			if (yggh == null || "".equals(yggh) || ygzt == null || "".equals(ygzt)
					|| (!"1".equals(ygzt) && !"0".equals(ygzt))) {
				return "NO##参数传递有误";
			}
			String zt = "禁用";
			Integer status = 0;// 0禁用 1启用
			String sflz = "1";// 2在职 1离职
			String statuss = "0";
			if ("1".equals(ygzt)) {
				zt = "启用";
				status = 1;// 0禁用 1启用
				sflz = "2";// 2在职 1离职
				statuss = "1";
			}
			Atzemployee emp = (Atzemployee) dataset.getObjectByHql("Atzemployee",
					"from Atzemployee where empcode='" + yggh + "'");
			if (emp != null) {
				emp.setStatus(status);
				emp.setShifoulz(sflz);
				dataset.update(emp);
				Atztdyg temp = (Atztdyg) dataset.getObjectByHql("Atztdyg",
						"from Atztdyg where yuangongid=" + emp.getId());
				if (temp != null) {
					temp.setStatus(status);
					dataset.update(temp);
					Bc_auth_usr usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
							"from Bc_auth_usr where team_employee_id=" + temp.getId());
					if (usr != null) {
						usr.setStatus(statuss);
						dataset.update(usr);
						return "OK##员工" + zt + "成功";
					}
				}
			}
			return "NO##工号" + yggh + "员工" + zt + "失败";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
