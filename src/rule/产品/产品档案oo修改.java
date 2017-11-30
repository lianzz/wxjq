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
public class 产品档案oo修改 extends RuleEngine{
	private static Logger logger = Logger.getLogger(产品档案oo修改.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchanpinda instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String yxx = instance.getYouxiaox();
			String oyxx = ((Atzchanpinda)context.get("oldobj")).getYouxiaox();
			if(!yxx.equals(oyxx)){
				Atzgonggao gonggao = new Atzgonggao();
				gonggao.setZhuti("产品档案变更");
				gonggao.setNeirong("名称为"+instance.getDanganmc()+"的产品档案的有效性发生变更");
				a.setCreateInfo(gonggao, request);
				dataset.add(gonggao);
			}
			a.setModifyInfo(instance,request);
			returnMsg.set("OK","修改成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
