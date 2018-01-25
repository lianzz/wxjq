package code;

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
public class RuleEngine1 extends RuleEngine {
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atztdyg instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A_账户禁用/启用_12
		 */
		/*
		 * 根据员工号，状态 启用禁用账户 1为启用，0为禁用
		 * 现在为启用,将其禁用; 如禁用,则启用账号
		 */
		int ygzt = instance.getStatus();

		String zt = "禁用";
		Integer status = 0;// 0禁用 1启用
		if ("0".equals(ygzt)) {
			zt = "启用";
			status = 1;// 0禁用 1启用
		}
		instance.setStatus(status);
		dataset.update(instance);
		
		Bc_auth_usr usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
				"from Bc_auth_usr where team_employee_id=" + instance.getId());
		if (usr != null) {
			usr.setStatus(status+"");
			dataset.update(usr);
		}
		returnMsg.set("OK",zt+"账号成功!");
		return returnMsg;
	}
}
