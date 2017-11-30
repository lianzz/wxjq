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
public class 合同退库oo修改 extends RuleEngine{
	private static Logger logger = Logger.getLogger(合同退库oo修改.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzhetongtk instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			//验证明细是否存在于发货通知单中
			String hetongid = (String)context.get("atzhetong.id");
			instance.setHetongid(Long.parseLong(hetongid));
			//是否存在发货通知单
			List<Atzfahuotzd> tzds = dataset.getList("Atzfahuotzd", "hetongid="+instance.getHetongid() + "and danjuzt='3'");
			if(tzds == null || tzds.size() <= 0 ){
				returnMsg.set("NO", "无已审核通过的发货通知单，无法退库");
				return returnMsg;
			}
			List<Atzhetongtkmx> tkmxs = (List<Atzhetongtkmx>) context.get("subobjs");
			if(tkmxs == null || tkmxs.size() <= 0 ){
				returnMsg.set("NO", "无明细，请检查");
				return returnMsg;
			}
			Atzhetongtkmx tkmx = null;
			Long xiaoshoubmid = null;
			for(int i = 0; i < tkmxs.size(); i++) {
				tkmx = tkmxs.get(i);
				xiaoshoubmid = tkmx.getXiaoshoubmid();
				for(int j = 0; j < tzds.size(); j++) {
					List<Atzfahuosbqdmx> qdmxs = dataset.getList("Atzfahuosbqdmx", "fahuotzdid="+tzds.get(j).getId()+" and xiaoshoubmid="+xiaoshoubmid);
					if(qdmxs !=null && qdmxs.size()>0){
						break;
					}
					if(j==tzds.size()-1){
						returnMsg.set("NO", "第"+(i+1)+"行的销售编码在发货通知单中不存在");
						return returnMsg;
					}
				}
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
