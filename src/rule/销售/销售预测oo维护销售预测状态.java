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
public class 销售预测oo维护销售预测状态 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo维护销售预测状态.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			String strId = (String) getProcessAttribute("atzxiaoshouyc");
			if(strId != null && !"".equals(strId)) {
				Atzxiaoshouyc xiaoshouyc = null;
				try {
					xiaoshouyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class,
							Long.parseLong(strId));
				} catch (Exception e) {
					returnMsg.set("NO", "系统异常,请联系管理员!");
					return returnMsg;
				}
				if(xiaoshouyc != null) {
					Map pMap = new HashMap();
					String bianhao = "";
					List<Atzxiaoshouyc> xsycs = dataset.getList("Atzxiaoshouyc",
							"danjuzt!='3' and hebingids='" + strId + "'");
					if(xsycs != null && xsycs.size() > 0) {
						for(Atzxiaoshouyc xsyc : xsycs) {
							xsyc.setDanjuzt("3");
							pMap.put("danjulx", "22");
							String retuValue = execAdjustmentRule("A-生成正式编码规则-05", null,
									context, dataset, request, pMap);
							logger.debug("正式编码 ：" + retuValue);
							xsyc.setBianhao(retuValue);
							bianhao = bianhao + retuValue + ",";

							dataset.update(xsyc);
						}
					}
					bianhao = bianhao.substring(0, bianhao.length()-1);
					xiaoshouyc.setBianhao(bianhao);
				}

			}
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
