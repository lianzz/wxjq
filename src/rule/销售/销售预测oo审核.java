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
public class 销售预测oo审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo审核.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			String shzt = instance.getShenhezt();
			String shyj = instance.getShenheyj();
			if("1".equals(shzt)&&(shyj ==null ||"".equals(shyj))){
				returnMsg.set("NO","请填写审核意见！");
				return returnMsg;
			}
			boolean result = completeWorkflowTask(request, context);
			if(!result) {
				logger.error("销售预测审核流程提交失败，请联系系统管理员");
				returnMsg.set("NO", "销售预测审核流程提交失败，请联系系统管理员");
				return returnMsg;
			} else {
				if("1".equals(shzt)){
					//审核不通过，流程结束，单据改为审核未通过。
					String hebingids = instance.getHebingids();
					String[] ids = hebingids.split(",");
					for(int i=0;i<ids.length;i++){
						Atzxiaoshouyc xsyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class, Long.parseLong(ids[i]));
						xsyc.setDanjuzt("5");
						dataset.update(xsyc);
					}
				}
				String empname = (String) request.getSession().getAttribute("employeeName");
				// 新增流程审核记录
				Atzlcshenhejl sh = new Atzlcshenhejl();
				sh.setRenwulx("销售预测审核");
				sh.setShenher(empname);
				sh.setShenherq(new Date());
				sh.setShenhezt(shzt);
				sh.setShenheyj(shyj);
				sh.setDanjuid(instance.getId());
				sh.setYewudlx("20");
				dataset.add(sh);
			}
			returnMsg.set("OK", "提交成功");
			return returnMsg;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
