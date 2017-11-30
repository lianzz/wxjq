package rule.合同;

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
public class 合同退库oo提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(合同退库oo提交.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzhetongtk instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			if(!"1".equals(instance.getDanjuzt())) {
				return "OK";
			}
			//验证退库明细是否存在于发货通知单，数量是否超出
			List<Atzfahuotzd> tzds = dataset.getList("Atzfahuotzd", "hetongid="+instance.getHetongid());
			if(tzds == null || tzds.size()<=0){
				returnMsg.set("NO", "无发货通知单，不能提交");
				return returnMsg;
			}
			List<Atzhetongtkmx> tkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid="+instance.getId());
			if(tkmxs != null && tkmxs.size()>0){
				Double shuliang = 0d;
				for(int i = 0; i < tkmxs.size(); i++) {
					Atzhetongtkmx tkmx = tkmxs.get(i);
					Long xiaoshoubmid = tkmx.getXiaoshoubmid();
					Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, xiaoshoubmid);
					//验证数量
					for(int j = 0; j < tzds.size(); j++) {
						Atzfahuotzd tzdmx = tzds.get(j);
						if("3".equals(tzdmx.getDanjuzt())){
							List<Atzfahuosbqdmx> qdmxs = dataset.getList("Atzfahuosbqdmx","fahuotzdid="+tzdmx.getId()+" and xiaoshoubmid="+xiaoshoubmid);
							if(qdmxs != null && qdmxs.size()>0){
								shuliang = shuliang + qdmxs.get(0).getShuliang();
							}
						}
					}
					logger.debug("xiaoshoubm=="+tkmx.getXiaoshoubmid());
					logger.debug("总shuliang=="+shuliang);
					if(shuliang < tkmx.getShuliang()){
						returnMsg.set("NO", "该合同退库单中销售编码为"+xiaoshoubm.getBianma()+"的数量超过发货通知单已发货的总数量");
						return returnMsg;
					}
				}
			}else{
				returnMsg.set("NO", "无明细，不能提交");
				return returnMsg;
			}
			Long result = newWorkflowInstance(request, context);
			if(result <= 0) {
				returnMsg.set("NO", "流程提交失败，请联系系统管理员");
				return returnMsg;
			}
			instance.setDanjuzt("2");
			dataset.update(instance);
			returnMsg.set("OK", "提交成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
