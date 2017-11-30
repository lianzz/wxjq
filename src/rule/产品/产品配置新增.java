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
public class 产品配置新增 extends RuleEngine{
	private static Logger logger = Logger.getLogger(产品配置新增.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchanpinpz instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String hql = "from Atzchanpinpz where peizhimc='"+instance.getPeizhimc()+"' and id !="+instance.getId();
			List list = dataset.getListByHql("Atzchanpinpz",hql);
			if(list!=null && list.size()>0){
				returnMsg.set("NO","该配置名称已存在，请重新输入");
			  	return returnMsg;
			}
			//明细中销售编码不能重复
			List<Atzpeizhimx> pzmxs = (List<Atzpeizhimx>) context.get("subobjs");
			if(pzmxs != null && pzmxs.size()>0){
				for(int i = 0; i < pzmxs.size(); i++) {
					hql = "chanpinpzid="+instance.getId()+" and bujianh="+pzmxs.get(i).getBujianh();
					list = dataset.getList("Atzpeizhimx", hql);
					if(list != null && list.size()>0) {
						returnMsg.set("NO","第"+(i+1)+"行销售编码在该配置中已存在，请检查");
				  	return returnMsg;
					}
				}
			}
			a.setCreateInfo(instance,request);
			returnMsg.set("OK","新增成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
