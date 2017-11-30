package rule.库存;

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
public class Copy_2_of_RuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(Copy_2_of_RuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-出库单-删除-10 (2031652)
			 * 2012-09-03
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";
				
				returnMsg.set("NO", employeeName);
				return returnMsg;
			}

			String shifouzx = instance.getShifouzx(); // 是否执行: 1-是  2-否
			if ("1".equals(shifouzx)) {
				message = "已执行的出库单无法删除！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String zhidanr = instance.getZhidanr(); // 仓管员
			if (!employeeName.equals(zhidanr)) {
				message = "只有仓管员才能删除出库单！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long ckdid = instance.getId(); // 出库单ID

			List<Atzchurukdmx> ckdmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + ckdid); // 出库单明细List
			//被删除的库存明细的占用情况设置为 正常
			Atzchurukdmx ckdmx = null;
			Long wuliaoid = null;
			Long kuweiid = null;
			Double meidwsl = null;
			String sn = null;
			String hql = null;
			Atzkucun ptkucun = null;
			Atzwuliaojcxx wljcxx = null;
			String mxsql = null;
			Atzkucunmx kcmx = null;
			Long xiangmuid = instance.getXiangmuid();
			if(ckdmxs!=null){
				for(int i=0;i<ckdmxs.size();i++){
					ckdmx = ckdmxs.get(i);	
					wuliaoid = ckdmx.getWuliaoid();
					kuweiid = ckdmx.getKuweiid();
					meidwsl = ckdmx.getMeidwsl();
					sn=ckdmx.getSn();
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;				
					if (meidwsl != null) 
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";				
					hql = hql + " and kucunlx='1'";				
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql);
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);				
					if(wljcxx!=null && "1".equals(wljcxx.getSngl())){//sn管理
						if(sn!=null && !"".equals(sn)){//sn不为空
							mxsql="from Atzkucunmx where kucunid="+ptkucun.getId()+" and wuliaoid="+wuliaoid+" and sn='"+sn+"'";
							kcmx = (Atzkucunmx) dataset.getObjectByHql("Atzkucunmx", mxsql);							
							if(kcmx!=null){
								kcmx.setWuliaozt("1");
								dataset.update(kcmx);
							}					
						}
					}	
			   }
			}
			try {
				dataset.deleteAll(ckdmxs); // 删除出库单明细
				
				dataset.delete(instance); // 删除出库单
				context.remove("atzchurukd.id");
			} catch (Exception e) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("出库单ID: " + ckdid);
				logger.error("出库单删除失败");
				
				message = "【出库单】删除失败, 请联系系统管理员！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			message = "【出库单】删除成功";
				
			returnMsg.set("OK", message);
			return returnMsg;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
