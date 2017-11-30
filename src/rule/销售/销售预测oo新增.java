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
public class 销售预测oo新增 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo新增.class);
	AProxy a = new AProxy();
	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			/**
			* 功能： 销售预测新增保存后置
			* 说明： 销售预测新增保存后置
			* 引用： 销售管理	
			* 作者： 12
			* 创建： 2013-12-5
			* 修改：
			* 原因：
			*/
			Long xiaoshouycid = instance.getId();
			instance.setDanjuzt("1");
			instance.setShujulx("1");//数据类型 1 普通 2 合并
			// 生成单据编号
			paramMap.put("danjulx", "22");
			String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset,
					request, paramMap);
			if(rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
				return returnMsg;
			} else if("Error".equals(rValue)) {
				returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
				return returnMsg;
			}
			instance.setBianhao(rValue);//编号
			a.setCreateInfo(instance, request);

			Atzyuefenycmx ycmx = null;
			List<Atzyuefenycmx> yfmxlist = null;
			Date today = new Date();
			Double sum = 0d;
			//获取产品预测明细
			List<Atzyuefenycmx> cpycmx = (List<Atzyuefenycmx>) context.get("subobjs");
			if(cpycmx != null && cpycmx.size()>0){
				logger.debug("cpycmx.size=="+cpycmx.size());
				for(int i = 0;i<cpycmx.size();i++){
					ycmx = cpycmx.get(i);
					yfmxlist = dataset.getList("Atzyuefenycmx", "xiaoshouycid="+xiaoshouycid+" and chanpin="+ycmx.getChanpin()+" and id!="+ycmx.getId());
					if(yfmxlist != null && yfmxlist.size()>0){
						returnMsg.set("NO", "第"+(i+1)+"条产品月份预测产品重复，请检查");
						return returnMsg;
					}
					//ycmx.setYuefenyclx("1");
					ycmx.setXiaoshouycid(xiaoshouycid);
					//计算总数量
					 sum=0D;
					 if(ycmx.getYiyue()!=null && ycmx.getYiyue()>0)
					  sum=sum+ycmx.getYiyue();
					 if(ycmx.getEryue()!=null && ycmx.getEryue()>0)
					  sum=sum+ycmx.getEryue();
					 if(ycmx.getSanyue()!=null && ycmx.getSanyue()>0)
					  sum=sum+ycmx.getSanyue();
					 if(ycmx.getSiyue()!=null && ycmx.getSiyue()>0)
					  sum=sum+ycmx.getSiyue();
					 if(ycmx.getWuyue()!=null && ycmx.getWuyue()>0)
					  sum=sum+ycmx.getWuyue();
					 if(ycmx.getLiuyue()!=null && ycmx.getLiuyue()>0)
					  sum=sum+ycmx.getLiuyue();
					 if(ycmx.getQiyue()!=null && ycmx.getQiyue()>0)
					  sum=sum+ycmx.getQiyue();
					 if(ycmx.getBayue()!=null && ycmx.getBayue()>0)
					  sum=sum+ycmx.getBayue();
					 if(ycmx.getJiuyue()!=null && ycmx.getJiuyue()>0)
					  sum=sum+ycmx.getYiyue();
					 if(ycmx.getShiyue()!=null && ycmx.getShiyue()>0)
					  sum=sum+ycmx.getYiyue();
					 if(ycmx.getShiyiy()!=null && ycmx.getShiyiy()>0)
					  sum=sum+ycmx.getShiyiy();
					 if(ycmx.getShiery()!=null && ycmx.getShiery()>0)
					  sum=sum+ycmx.getShiery();
					 logger.debug("sum:"+sum);
					 ycmx.setZongsl(sum);
					 ycmx.setLururq(today);
					dataset.update(ycmx);
				}
			}
			Calendar cal = Calendar.getInstance();
			instance.setDangqiany(cal.get(Calendar.MONTH) + 1);
			instance.setDangqiann(cal.get(Calendar.YEAR));
			logger.error("当前年:" + instance.getDangqiann() + "< 当前月 " + instance.getDangqiany());
			String zhuti = instance.getDangqiann()+"年"+instance.getDangqiany()+"月销售预测";
			instance.setZhuti(zhuti);
			returnMsg.set("OK", "新增成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
		}
		return "error";
	}
}
