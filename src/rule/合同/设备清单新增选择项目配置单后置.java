package rule.合同;

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
public class 设备清单新增选择项目配置单后置 extends RuleEngine{
	private static Logger logger = Logger.getLogger(设备清单新增选择项目配置单后置.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Object instance) throws Exception{
		try {
			// 自定义规则 
//###################################################################################################
			String xiangmupzqdid = (String) context.get("atzxiangmupzqd.id");
			if(xiangmupzqdid != null) {
				Atzxiaoshoubm xiaoshoubm = null;
				List<Atzshebeiqdmx> shebeiqdmx = new ArrayList(); 
				List<Atzxiangmupzmx> pzqdmxs = dataset.getList("Atzxiangmupzmx","xiangmupzqdid=" + Long.parseLong(xiangmupzqdid));
				if(pzqdmxs!=null&&pzqdmxs.size()>0){
					for(Atzxiangmupzmx pzqdmx:pzqdmxs){
						Atzshebeiqdmx qdmx = new Atzshebeiqdmx();
						xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, pzqdmx.getBujianh());
						qdmx.setXiaoshoubmid(xiaoshoubm.getId());
						qdmx.setXiaoshoubmidRef(xiaoshoubm);
						qdmx.setXiaoshoubm(xiaoshoubm.getBianma());
						qdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
						qdmx.setGuigedw(xiaoshoubm.getGuigedw());
						qdmx.setDanwei(xiaoshoubm.getDanwei());
						qdmx.setShuliang(pzqdmx.getShuliang());
						shebeiqdmx.add(qdmx);
					}
					context.set("instance.atzshebeiqd", new Atzshebeiqd());
					context.set("instancelist.atzshebeiqdmx", shebeiqdmx);
				}
			}
			return "OK";
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
