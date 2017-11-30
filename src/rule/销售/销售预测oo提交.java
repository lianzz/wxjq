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
public class 销售预测oo提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo提交.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{

		// 自定义规则
		// ###################################################################################################
		/**
		 * 通过多选获得销售预测ids,合并为一条数据 新的销售预测，该销售预测表头维护编号（同时提交单据号合并，以逗号隔开）
		 * 销售预测明细中相同的产品型号或者附配件进行合并。
		 * */
		List<String> ycidList = context.getValueList("atzxiaoshouyc.id");
		logger.debug("ycidList.size====" + ycidList.size());
		// 未选择销售预测
		if(ycidList == null || ycidList.size() == 0) {
			returnMsg.set("NO", "请选择需提交的销售预测");
			return returnMsg;
		}
		Atzxiaoshouyc hebingyc = new Atzxiaoshouyc();
		hebingyc.setShujulx("2");// 数据类型 1 普通 2 合并
		hebingyc.setYucerq(new Date());
		dataset.add(hebingyc);
		logger.debug("hebingyc.id====" + hebingyc.getId());
		Atzxiaoshouyc xsyc = null;
		Atzyuefenycmx ycmx = null;
		List<Atzyuefenycmx> ycmxlist = null;// 预测的明细
		String ycid = null;
		for(int i = 0; i < ycidList.size(); i++) {
			ycid = ycidList.get(i);
			try {
				xsyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class,Long.parseLong(ycid));
			} catch (Exception e) {
				logger.error(e);
				returnMsg.set("NO", "系统异常，请联系系统管理员");
				return returnMsg;
			}
			//审核中，审核已通过的销售预测不能重复提交
			if("2".equals(xsyc.getDanjuzt()) || "3".equals(xsyc.getDanjuzt())){
				returnMsg.set("NO", "编号为"+xsyc.getBianhao()+"的销售预测不能重复提交,请检查");
				return returnMsg;
			}
			if(hebingyc.getBianhao() == null){
				hebingyc.setBianhao(xsyc.getBianhao());
			}else{
				hebingyc.setBianhao(hebingyc.getBianhao() +","+ xsyc.getBianhao());// 编号合并
			}
			if(hebingyc.getHebingids() == null){
				hebingyc.setHebingids(xsyc.getId()+"");
			}else{
				hebingyc.setHebingids(hebingyc.getHebingids() +","+ xsyc.getId());// ID合并
			}
			xsyc.setHebingids(instance.getId()+"");
			//明细合并begin
			ycmxlist = dataset.getList("Atzyuefenycmx","xiaoshouycid='" + xsyc.getId() + "'");
			if(ycmxlist != null && ycmxlist.size() > 0) {
				Atzyuefenycmx yfycmx = null;
				for(int j = 0; j < ycmxlist.size(); j++) {
					ycmx = ycmxlist.get(j);
						yfycmx = (Atzyuefenycmx) dataset.getObjectByHql("Atzyuefenycmx", "from Atzyuefenycmx where xiaoshouycid="+hebingyc.getId()+" and chanpin = '" + ycmx.getChanpin() + "'");
						if(yfycmx != null){
							//已存在,加数量
							Double sum = yfycmx.getZongsl();
							if(yfycmx.getYiyue()!=null && yfycmx.getYiyue()>0){
								if(ycmx.getYiyue()!=null && ycmx.getYiyue()>0){
									yfycmx.setYiyue(yfycmx.getYiyue()+ycmx.getYiyue());
									sum = sum + ycmx.getYiyue();
								}
							}else{
								if(ycmx.getYiyue()!=null && ycmx.getYiyue()>0){
									yfycmx.setYiyue(ycmx.getYiyue());
									sum = sum + ycmx.getYiyue();
								}
							}
							if(yfycmx.getEryue()!=null && yfycmx.getEryue()>0){
								if(ycmx.getEryue()!=null && ycmx.getEryue()>0){
									yfycmx.setEryue(yfycmx.getEryue()+ycmx.getEryue());
									sum = sum + ycmx.getEryue();
								}
							}else{
								if(ycmx.getEryue()!=null && ycmx.getEryue()>0){
									yfycmx.setEryue(ycmx.getEryue());
									sum = sum + ycmx.getEryue();
								}
							}
							if(yfycmx.getSanyue()!=null && yfycmx.getSanyue()>0){
								if(ycmx.getSanyue()!=null && ycmx.getSanyue()>0){
									yfycmx.setSanyue(yfycmx.getSanyue()+ycmx.getSanyue());
									sum = sum + ycmx.getSanyue();
								}
							}else{
								if(ycmx.getSanyue()!=null && ycmx.getSanyue()>0){
									yfycmx.setSanyue(ycmx.getSanyue());
									sum = sum + ycmx.getSanyue();
								}
							}
							if(yfycmx.getSiyue()!=null && yfycmx.getSiyue()>0){
								if(ycmx.getSiyue()!=null && ycmx.getSiyue()>0){
									yfycmx.setSiyue(yfycmx.getSiyue()+ycmx.getSiyue());
									sum = sum + ycmx.getSiyue();
								}
							}else{
								if(ycmx.getSiyue()!=null && ycmx.getSiyue()>0){
									yfycmx.setSiyue(ycmx.getSiyue());
									sum = sum + ycmx.getSiyue();
								}
							}
							if(yfycmx.getWuyue()!=null && yfycmx.getWuyue()>0){
								if(ycmx.getWuyue()!=null && ycmx.getWuyue()>0){
									yfycmx.setWuyue(yfycmx.getWuyue()+ycmx.getWuyue());
									sum = sum + ycmx.getWuyue();
								}
							}else{
								if(ycmx.getWuyue()!=null && ycmx.getWuyue()>0){
									yfycmx.setWuyue(ycmx.getWuyue());
									sum = sum + ycmx.getWuyue();
								}
							}
							if(yfycmx.getLiuyue()!=null && yfycmx.getLiuyue()>0){
								if(ycmx.getLiuyue()!=null && ycmx.getLiuyue()>0){
									yfycmx.setLiuyue(yfycmx.getLiuyue()+ycmx.getLiuyue());
									sum = sum + ycmx.getLiuyue();
								}
							}else{
								if(ycmx.getLiuyue()!=null && ycmx.getLiuyue()>0){
									yfycmx.setLiuyue(ycmx.getLiuyue());
									sum = sum + ycmx.getLiuyue();
								}
							}
							if(yfycmx.getQiyue()!=null && yfycmx.getQiyue()>0){
								if(ycmx.getQiyue()!=null && ycmx.getQiyue()>0){
									yfycmx.setQiyue(yfycmx.getQiyue()+ycmx.getQiyue());
									sum = sum + ycmx.getQiyue();
								}
							}else{
								if(ycmx.getQiyue()!=null && ycmx.getQiyue()>0){
									yfycmx.setQiyue(ycmx.getQiyue());
									sum = sum + ycmx.getQiyue();
								}
							}
							if(yfycmx.getBayue()!=null && yfycmx.getBayue()>0){
								if(ycmx.getBayue()!=null && ycmx.getBayue()>0){
									yfycmx.setBayue(yfycmx.getBayue()+ycmx.getBayue());
									sum = sum + ycmx.getBayue();
								}
							}else{
								if(ycmx.getBayue()!=null && ycmx.getBayue()>0){
									yfycmx.setBayue(ycmx.getBayue());
									sum = sum + ycmx.getBayue();
								}
							}
							if(yfycmx.getJiuyue()!=null && yfycmx.getJiuyue()>0){
								if(ycmx.getJiuyue()!=null && ycmx.getJiuyue()>0){
									yfycmx.setJiuyue(yfycmx.getJiuyue()+ycmx.getJiuyue());
									sum = sum + ycmx.getJiuyue();
								}
							}else{
								if(ycmx.getJiuyue()!=null && ycmx.getJiuyue()>0){
									yfycmx.setJiuyue(ycmx.getJiuyue());
									sum = sum + ycmx.getJiuyue();
								}
							}
							if(yfycmx.getShiyue()!=null && yfycmx.getShiyue()>0){
								if(ycmx.getShiyue()!=null && ycmx.getShiyue()>0){
									yfycmx.setShiyue(yfycmx.getShiyue()+ycmx.getShiyue());
									sum = sum + ycmx.getShiyue();
								}
							}else{
								if(ycmx.getShiyue()!=null && ycmx.getShiyue()>0){
									yfycmx.setShiyue(ycmx.getShiyue());
									sum = sum + ycmx.getShiyue();
								}
							}
							if(yfycmx.getShiyiy()!=null && yfycmx.getShiyiy()>0){
								if(ycmx.getShiyiy()!=null && ycmx.getShiyiy()>0){
									yfycmx.setShiyiy(yfycmx.getShiyiy()+ycmx.getShiyiy());
									sum = sum + ycmx.getShiyiy();
								}
							}else{
								if(ycmx.getShiyiy()!=null && ycmx.getShiyiy()>0){
									yfycmx.setShiyiy(ycmx.getShiyiy());
									sum = sum + ycmx.getShiyiy();
								}
							}
							if(yfycmx.getShiery()!=null && yfycmx.getShiery()>0){
								if(ycmx.getShiery()!=null && ycmx.getShiery()>0){
									yfycmx.setShiery(yfycmx.getShiery()+ycmx.getShiery());
									sum = sum + ycmx.getShiery();
								}
							}else{
								if(ycmx.getShiery()!=null && ycmx.getShiery()>0){
									yfycmx.setShiery(ycmx.getShiery());
									sum = sum + ycmx.getShiery();
								}
							}
							yfycmx.setZongsl(sum);
							dataset.update(yfycmx);
						}else{
							//不存在，加明细记录
							yfycmx = new Atzyuefenycmx();
							yfycmx.setXiaoshouycid(hebingyc.getId());
							yfycmx.setChanpin(ycmx.getChanpin());
							yfycmx.setYiyue(ycmx.getYiyue());
							yfycmx.setEryue(ycmx.getEryue());
							yfycmx.setSanyue(ycmx.getSanyue());
							yfycmx.setSiyue(ycmx.getSiyue());
							yfycmx.setWuyue(ycmx.getWuyue());
							yfycmx.setLiuyue(ycmx.getLiuyue());
							yfycmx.setQiyue(ycmx.getQiyue());
							yfycmx.setBayue(ycmx.getBayue());
							yfycmx.setJiuyue(ycmx.getJiuyue());
							yfycmx.setShiyue(ycmx.getShiyue());
							yfycmx.setShiyiy(ycmx.getShiyiy());
							yfycmx.setShiery(ycmx.getShiery());
							yfycmx.setZongsl(ycmx.getZongsl());
							yfycmx.setLururq(ycmx.getLururq());
							dataset.add(yfycmx);
						}
				}
			}
			//----明细合并end
		}
		dataset.update(hebingyc);
		Map lcmap = new HashMap();
		context.set("atzxiaoshouyc.id", String.valueOf(hebingyc.getId()));
		lcmap.put("__creater.name", hebingyc.getLurur());
		String	windowId = context.getId();
		Long result213 = WorkflowAppHelper.newProcessInstance(1752334L, lcmap, request, windowId);
		if(result213 <= 0) {
			returnMsg.set("NO", "流程提交失败, 请联系系统管理员！");
			return returnMsg;
		}
		//更改销售预测的单据状态
		for(String ptycid:ycidList){
			xsyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class,Long.parseLong(ptycid));
			xsyc.setDanjuzt("2");
			xsyc.setHebingids(hebingyc.getId()+"");
			dataset.update(xsyc);
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
		// ###################################################################################################
		// over
	}
}
