package rule.合同;

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
public class 设备清单新增修改保存后置 extends RuleEngine{
	private static Logger logger = Logger.getLogger(设备清单新增修改保存后置.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzshebeiqd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			String hetongId = (String)context.get("atzhetong.id");
			if(hetongId != null && !"".equals(hetongId)){
			  instance.setHetongid(Long.parseLong(hetongId));
			  dataset.update(instance);
			  return "OK";
			}
			return "NO";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
