package rule.物料;

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
public class 销售编码删除 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售编码删除.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshoubm instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
		//A-删除销售编码-06
			//销售编码下存在物料对应信息，不能删除
			List list = dataset.getListByHql("Atzwuliaojcxx", "from Atzwuliaojcxx where wuliaosjxz='0' and shenhezt='3' and xiaoshoubmid="+instance.getId());
			if(list != null && list.size() > 0){
				returnMsg.set("NO", "该销售编码存在物料对应信息,不能删除！");
				return returnMsg;
			}else{
				instance.setShifousc("1");
				dataset.update(instance);
				//dataset.delete(instance);
				//context.remove("atzxiaoshoubm.id");
				return "OK";
			}

			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
