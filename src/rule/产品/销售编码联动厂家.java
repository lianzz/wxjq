package rule.产品;

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
public class 销售编码联动厂家 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售编码联动厂家.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Object instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String xiaoshoubmStr = (String)context.get("contextstring");

			//List<Atzshengchancj> sccjList = new ArrayList();
			String str = ";";
			if(xiaoshoubmStr != null && !"".equals(xiaoshoubmStr)){
				Connection c= dataset.getLocalConnection();
				String sql = "select cj.id,cj.changjiamc from atzshengchancj cj left join atzwuliaojcxx wl on wl.id=cj.wuliaoid where wl.xiaoshoubmid="+xiaoshoubmStr;
				java.sql.Statement stat = c.createStatement();
				ResultSet rs = stat.executeQuery(sql);
				if(rs.next()){
					str = str+rs.getLong(0)+","+rs.getString(1)+";";
				}
				rs.close();
				stat.close();
			}
			logger.debug(str);
			str = str.substring(0,str.length()-1);
			context.set("result",str);
			return "OK";
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
