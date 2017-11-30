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
public class 业务支持联系单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(业务支持联系单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzyewuzc instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}

	private Object 修改(Atzyewuzc instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-业务支持联系单修改-06H
		 */
		
		String zclx = instance.getYewuzclx();
		if ("1".equals(zclx)) {
			if (instance.getHetongid() == null) {
				returnMsg.set("NO", "类型为设备清单, 请选择合同或立项信息.");
				return returnMsg;
			}
		}
		// 判断编号不能重复
		String sql = "from Atzyewuzc where bianhao='" + instance.getBianhao() + "' and id !=" + instance.getId();

		List<Atzyewuzc> list = dataset.getListByHql("Atzyewuzc", sql);
		if (list != null && list.size() > 0) {
			returnMsg.set("NO", "新增失败,编号已存在！");
			return returnMsg;
		}
		a.setModifyInfo(instance, request);
		returnMsg.set("OK", "修改成功");
		return returnMsg;
	}

	private Object 新增(Atzyewuzc instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-业务支持联系单新增-06H
		 */
		String zclx = instance.getYewuzclx();
		if ("1".equals(zclx)) {
			if (instance.getHetongid() == null) {
				returnMsg.set("NO", "类型为设备清单, 请选择合同或立项信息.");
				return returnMsg;
			}
		}

		// 生成临时编号
		paramMap.put("danjulx", "40");
		String rValue2 = (String) execAdjRule("A-生成编码规则-05", paramMap);
		if (rValue2.equals("请先设置编码规则") || rValue2.equals("流水号溢出")) {
			returnMsg.set("NO", "新增失败," + rValue2);
			return returnMsg;
		} else if ("Error".equals(rValue2)) {
			returnMsg.set("NO", "新增失败,请联系管理员！");
			return returnMsg;
		} else {
			instance.setBianhao(rValue2);
		}

		instance.setDanjuzt("1");
		instance.setShifougb("2");
		a.setCreateInfo(instance, request);
		a.setModifyInfo(instance, request);
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}
}
