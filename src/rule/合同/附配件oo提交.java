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
public class 附配件oo提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(附配件oo提交.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则

			Long tdygId = (Long) request.getSession().getAttribute(
					"teamEmployeeId");
			logger.error("tdygId==========" + tdygId);
			if (tdygId == null || tdygId <= 0) {
				returnMsg.set("cannotsubmit", "admin帐号不能进行提交！");
				return returnMsg;
			}
			Long id = Long
					.parseLong((String) context.get("atzfahuotzd.id"));
			Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(
					Atzfahuotzd.class, id);
			logger.debug("fahuotzd.id==========" + id);
			List<Atzfahuosbqdmx> fhtzdmx = dataset.getListByHql(
					"Atzfahuosbqdmx",
					"from Atzfahuosbqdmx where fahuotzdid='"
							+ fahuotzd.getId() + "'");
			logger.error("fahuotzdid==========" + fahuotzd.getId());

			if (fhtzdmx.size() == 0 || fhtzdmx == null) {
				return "无明细";
			}
			instance.setDanjuzt("2");
			dataset.update(instance);

			String windowId229 = null;
			if (context != null) {
				windowId229 = context.getId();
			}
			Map map229 = new HashMap();
			Long result229 = WorkflowAppHelper.newProcessInstance(2604940L,
					map229, request, windowId229);
			if (result229 <= 0) {
				return "NO";
			}
			returnMsg.set("OK", "流程提交成功");
			return returnMsg;
//###################################################################################################
	
			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}