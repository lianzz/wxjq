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
public class 销售预测oo修改oo审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(销售预测oo修改oo审核.class); 
	AProxy a = new AProxy();
	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
//###################################################################################################
			/*
			 * AU-销售预测(审核时修改)-12
			 */
			Long xiaoshouycid = instance.getId();
			a.setModifyInfo(instance, request);

			//获取合并的销售预测
			String hebingxsycid = (String) context.get("hebingxsycid");
			Atzxiaoshouyc hebingyc = null;
			try{
				hebingyc = (Atzxiaoshouyc) dataset.getObject(Atzxiaoshouyc.class, Long.parseLong(hebingxsycid));
			}catch(Exception e){
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			Atzyuefenycmx ycmx = null;
			Atzyuefenycmx yfycmx = null;
			List<Atzyuefenycmx> yfmxlist = null;
			Date today = new Date();
			Double sum = 0d;
			//修改前的产品预测明细，在合并预测明细中减去数量
			Hashtable<Long,Atzyuefenycmx> subobjs_old = (Hashtable<Long, Atzyuefenycmx>) context.get("subobjs_old");
			if(subobjs_old != null && subobjs_old.size()>0){
				for(Iterator it = subobjs_old.keySet().iterator();it.hasNext();){
					ycmx = subobjs_old.get((Long)it.next());
					//减数量
					yfycmx = (Atzyuefenycmx) dataset.getObjectByHql("Atzyuefenycmx", "from Atzyuefenycmx where xiaoshouycid="+hebingyc.getId()+" and chanpin = '" + ycmx.getChanpin() + "'");
					if(yfycmx != null){
						//已存在,加数量
						sum = yfycmx.getZongsl();
						if(yfycmx.getYiyue()!=null && yfycmx.getYiyue()>0){
							if(ycmx.getYiyue()!=null && ycmx.getYiyue()>0){
								yfycmx.setYiyue(yfycmx.getYiyue()-ycmx.getYiyue());
								sum = sum - ycmx.getYiyue();
							}
						}
						if(yfycmx.getEryue()!=null && yfycmx.getEryue()>0){
							if(ycmx.getEryue()!=null && ycmx.getEryue()>0){
								yfycmx.setEryue(yfycmx.getEryue()-ycmx.getEryue());
								sum = sum - ycmx.getEryue();
							}
						}
						if(yfycmx.getSanyue()!=null && yfycmx.getSanyue()>0){
							if(ycmx.getSanyue()!=null && ycmx.getSanyue()>0){
								yfycmx.setSanyue(yfycmx.getSanyue()-ycmx.getSanyue());
								sum = sum - ycmx.getSanyue();
							}
						}
						if(yfycmx.getSiyue()!=null && yfycmx.getSiyue()>0){
							if(ycmx.getSiyue()!=null && ycmx.getSiyue()>0){
								yfycmx.setSiyue(yfycmx.getSiyue()-ycmx.getSiyue());
								sum = sum - ycmx.getSiyue();
							}
						}
						if(yfycmx.getWuyue()!=null && yfycmx.getWuyue()>0){
							if(ycmx.getWuyue()!=null && ycmx.getWuyue()>0){
								yfycmx.setWuyue(yfycmx.getWuyue()-ycmx.getWuyue());
								sum = sum - ycmx.getWuyue();
							}
						}
						if(yfycmx.getLiuyue()!=null && yfycmx.getLiuyue()>0){
							if(ycmx.getLiuyue()!=null && ycmx.getLiuyue()>0){
								yfycmx.setLiuyue(yfycmx.getLiuyue()-ycmx.getLiuyue());
								sum = sum +- ycmx.getLiuyue();
							}
						}
						if(yfycmx.getQiyue()!=null && yfycmx.getQiyue()>0){
							if(ycmx.getQiyue()!=null && ycmx.getQiyue()>0){
								yfycmx.setQiyue(yfycmx.getQiyue()-ycmx.getQiyue());
								sum = sum - ycmx.getQiyue();
							}
						}
						if(yfycmx.getBayue()!=null && yfycmx.getBayue()>0){
							if(ycmx.getBayue()!=null && ycmx.getBayue()>0){
								yfycmx.setBayue(yfycmx.getBayue()-ycmx.getBayue());
								sum = sum - ycmx.getBayue();
							}
						}
						if(yfycmx.getJiuyue()!=null && yfycmx.getJiuyue()>0){
							if(ycmx.getJiuyue()!=null && ycmx.getJiuyue()>0){
								yfycmx.setJiuyue(yfycmx.getJiuyue()-ycmx.getJiuyue());
								sum = sum - ycmx.getJiuyue();
							}
						}
						if(yfycmx.getShiyue()!=null && yfycmx.getShiyue()>0){
							if(ycmx.getShiyue()!=null && ycmx.getShiyue()>0){
								yfycmx.setShiyue(yfycmx.getShiyue()-ycmx.getShiyue());
								sum = sum - ycmx.getShiyue();
							}
						}
						if(yfycmx.getShiyiy()!=null && yfycmx.getShiyiy()>0){
							if(ycmx.getShiyiy()!=null && ycmx.getShiyiy()>0){
								yfycmx.setShiyiy(yfycmx.getShiyiy()-ycmx.getShiyiy());
								sum = sum - ycmx.getShiyiy();
							}
						}
						if(yfycmx.getShiery()!=null && yfycmx.getShiery()>0){
							if(ycmx.getShiery()!=null && ycmx.getShiery()>0){
								yfycmx.setShiery(yfycmx.getShiery()-ycmx.getShiery());
								sum = sum - ycmx.getShiery();
							}
						}
						yfycmx.setZongsl(sum);
						dataset.update(yfycmx);
					}
				}
			}			
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
					
					//更新到合并预测中
					yfycmx = (Atzyuefenycmx) dataset.getObjectByHql("Atzyuefenycmx", "from Atzyuefenycmx where xiaoshouycid="+hebingyc.getId()+" and chanpin = '" + ycmx.getChanpin() + "'");
					if(yfycmx != null){
						//已存在,加数量
						sum = yfycmx.getZongsl();
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
			context.remove("atzxiaoshouyc.id");
			returnMsg.set("OK", "修改成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
		}
		return "error";
	}
}
