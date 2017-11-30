package rule.销售;

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
public class 销售预测oo月份预测明细保存 extends RuleEngine{
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Object instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			// 修改的实体集，不包括新增实体
			logger.debug(context.get("atzxiaoshouyc.id"));
			Atzyuefenycmx yuefenycmx = null;
			Double sum = 0D;
			List<Atzyuefenycmx> updateObjs = (List<Atzyuefenycmx>) context.get("updateobjects");
			if(updateObjs != null && updateObjs.size() > 0) {
				logger.debug(updateObjs.size());
				for(Iterator iter = updateObjs.iterator(); iter.hasNext();) {
					yuefenycmx = (Atzyuefenycmx) iter.next();
					sum = 0D;
					if(yuefenycmx.getYiyue() != null && yuefenycmx.getYiyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getEryue() != null && yuefenycmx.getEryue() > 0)
						sum = sum + yuefenycmx.getEryue();
					if(yuefenycmx.getSanyue() != null && yuefenycmx.getSanyue() > 0)
						sum = sum + yuefenycmx.getSanyue();
					if(yuefenycmx.getSiyue() != null && yuefenycmx.getSiyue() > 0)
						sum = sum + yuefenycmx.getSiyue();
					if(yuefenycmx.getWuyue() != null && yuefenycmx.getWuyue() > 0)
						sum = sum + yuefenycmx.getWuyue();
					if(yuefenycmx.getLiuyue() != null && yuefenycmx.getLiuyue() > 0)
						sum = sum + yuefenycmx.getLiuyue();
					if(yuefenycmx.getQiyue() != null && yuefenycmx.getQiyue() > 0)
						sum = sum + yuefenycmx.getQiyue();
					if(yuefenycmx.getBayue() != null && yuefenycmx.getBayue() > 0)
						sum = sum + yuefenycmx.getBayue();
					if(yuefenycmx.getJiuyue() != null && yuefenycmx.getJiuyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getShiyue() != null && yuefenycmx.getShiyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getShiyiy() != null && yuefenycmx.getShiyiy() > 0)
						sum = sum + yuefenycmx.getShiyiy();
					if(yuefenycmx.getShiery() != null && yuefenycmx.getShiery() > 0)
						sum = sum + yuefenycmx.getShiery();
					logger.error("sum:" + sum);
					yuefenycmx.setZongsl(sum);
				}

			}

			// 新增的实体集,但是目前没有新增的情况
			List<Atzyuefenycmx> insertObjs = (List<Atzyuefenycmx>) context.get("insertobjects");
			if(insertObjs != null && insertObjs.size() > 0) {
				logger.debug(insertObjs.size());
				for(Iterator iter = insertObjs.iterator(); iter.hasNext();) {
					yuefenycmx = (Atzyuefenycmx) iter.next();
					sum = 0D;
					if(yuefenycmx.getYiyue() != null && yuefenycmx.getYiyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getEryue() != null && yuefenycmx.getEryue() > 0)
						sum = sum + yuefenycmx.getEryue();
					if(yuefenycmx.getSanyue() != null && yuefenycmx.getSanyue() > 0)
						sum = sum + yuefenycmx.getSanyue();
					if(yuefenycmx.getSiyue() != null && yuefenycmx.getSiyue() > 0)
						sum = sum + yuefenycmx.getSiyue();
					if(yuefenycmx.getWuyue() != null && yuefenycmx.getWuyue() > 0)
						sum = sum + yuefenycmx.getWuyue();
					if(yuefenycmx.getLiuyue() != null && yuefenycmx.getLiuyue() > 0)
						sum = sum + yuefenycmx.getLiuyue();
					if(yuefenycmx.getQiyue() != null && yuefenycmx.getQiyue() > 0)
						sum = sum + yuefenycmx.getQiyue();
					if(yuefenycmx.getBayue() != null && yuefenycmx.getBayue() > 0)
						sum = sum + yuefenycmx.getBayue();
					if(yuefenycmx.getJiuyue() != null && yuefenycmx.getJiuyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getShiyue() != null && yuefenycmx.getShiyue() > 0)
						sum = sum + yuefenycmx.getYiyue();
					if(yuefenycmx.getShiyiy() != null && yuefenycmx.getShiyiy() > 0)
						sum = sum + yuefenycmx.getShiyiy();
					if(yuefenycmx.getShiery() != null && yuefenycmx.getShiery() > 0)
						sum = sum + yuefenycmx.getShiery();
					logger.error("sum:" + sum);
					yuefenycmx.setXiaoshouycid(Long.parseLong((String) context
							.get("atzxiaoshouyc.id")));
					yuefenycmx.setLururq(new Date());
					if(yuefenycmx.getChanpin() != null)
						yuefenycmx.setYuefenyclx("1");
					else
						yuefenycmx.setYuefenyclx("2");
					yuefenycmx.setZongsl(sum);
				}
			}
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
