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

	private Object methodName(Object instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
}
