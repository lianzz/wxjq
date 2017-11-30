package rule.销售;

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
public class 销售预测oo审核oo加载前 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo审核oo加载前.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String hebingxsycid = (String) context.get("hebingxsycid");
			if(hebingxsycid == null || "".equals(hebingxsycid)){
				hebingxsycid = (String)context.get("atzxiaoshouyc.id");
	      context.set("hebingxsycid", hebingxsycid);
			}

			String hebingids = null;
			Atzxiaoshouyc xsyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class, Long.parseLong(hebingxsycid));
			if(xsyc != null){
				hebingids = "("+xsyc.getHebingids()+")";
			}else{
				hebingids = "(-1)";
			}
			context.set("hebingids",hebingids);
			return "OK";
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
