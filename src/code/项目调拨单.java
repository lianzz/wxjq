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
public class 项目调拨单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(项目调拨单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	private Object A_选择调拨清单后置_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	private Object A_合同调拨选择调入合同_12(Atzhetongdb instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
}
