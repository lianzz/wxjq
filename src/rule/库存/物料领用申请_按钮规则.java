package rule.库存;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.rule.application.ReturnMsg;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 物料领用申请_按钮规则 extends RuleEngine{
	private static Logger logger = Logger.getLogger(物料领用申请_按钮规则.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-物料领用申请-按钮是否可用-修改-10 (2051281)
			 * 2012-08-20
			 */
			 
			Long objectId = (Long) paramMap.get("objectId"); // 获取按钮相关记录对象的ID

			Atzlinshiwlsq obj = (Atzlinshiwlsq) dataset.getObject(Atzlinshiwlsq.class, objectId);

			String danjuzt = obj.getDanjuzt(); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
			HashMap configs = new HashMap();

			//非本人不能操作bg
			//修改人 lzz 20150804
			String czr =  (String) request.getSession().getAttribute("employeeName");
			if(obj.getShengqr() != null && !obj.getShengqr().equals(czr)) {
				configs.put("active", false);
				return configs;
			}
//ed
			if ("1".equals(danjuzt) || "4".equals(danjuzt)) {
				configs.put("active", true);
				return configs;
			}
			configs.put("active", false);
			return configs;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
