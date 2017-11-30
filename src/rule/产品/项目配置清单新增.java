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
public class 项目配置清单新增 extends RuleEngine{
	private static Logger logger = Logger.getLogger(项目配置清单新增.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiangmupqd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String hql = "";
			//明细中销售编码不能重复
			List<Atzxiangmupzmx> pzmxs = (List<Atzxiangmupzmx>) context.get("subobjs");
			if(pzmxs != null && pzmxs.size()>0){
				for(int i = 0; i < pzmxs.size(); i++) {
					hql = "xiangmupzqdid="+instance.getId()+" and bujianh="+pzmxs.get(i).getBujianh();
					List list = dataset.getList("Atzpeizhimx", hql);
					if(list != null && list.size()>0) {
						returnMsg.set("NO","第"+(i+1)+"行销售编码在该配置中已存在，请检查");
				  	return returnMsg;
					}
				}
			}
			//生成编号
			paramMap.put("danjulx", "42");
			String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset,
					request, paramMap);
			if(rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
				return returnMsg;
			} else if("Error".equals(rValue)) {
				returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
				return returnMsg;
			}
			instance.setBianhao(rValue);
			a.setCreateInfo(instance,request);
			returnMsg.set("OK","新增成功");
			//return returnMsg;
			

//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
