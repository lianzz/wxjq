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
public class 设备清单新增修改保存前置 extends RuleEngine{
	private static Logger logger = Logger.getLogger(设备清单新增修改保存前置.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Object instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * 功能：设备清单新增修改保存前置 
			 * 说明： 设备清单新增修改保存前置 
			 * 引用： 合同管理 
			 * 作者： 05 
			 * 创建： 2010-10-28 
			 * 修改： 
			 * 原因：
			 */

			List<Atzshebeiqdmx> mxList = (List) context.get("subobjs");
			logger.debug("subobjs.size()============" + mxList.size());
			if(mxList!=null&&mxList.size()>0){
				for(int i = 0; i < mxList.size(); i++) {
					Atzshebeiqdmx mx = mxList.get(i);
					mx.setWeifhsl(mx.getShuliang());
					Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(
							Atzxiaoshoubm.class, mx.getXiaoshoubmid());
					if(xiaoshoubm != null) {
						mx.setXiaoshoubm(xiaoshoubm.getBianma());
						mx.setWuliaoms(xiaoshoubm.getWuliaoms());
						mx.setGuigedw(xiaoshoubm.getGuigedw());
						mx.setDanwei(xiaoshoubm.getDanwei());
					}
				}
			}
			context.set("subobjs", mxList);
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
