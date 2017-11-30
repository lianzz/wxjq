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
public class 发货通知单oo反审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(发货通知单oo反审核.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			/**
			* 功能： 反审核发货通知单
			* 说明： 反审核发货通知单，删除出库计划，修改发货通知单状态
			* 引用： 合同管理
			* 作者： 05
			* 创建： 2011-04-11
			* 修改：
			* 原因：
			*/
   	   
   	   //删除对应的自动生成的合同跟踪信息
       List <Atzhetonggz> htgzList =dataset.getList("Atzhetonggz","fahuotzdid ="+instance.getId());
       if(htgzList !=null && htgzList.size()>0)
       {
    	   dataset.deleteAll(htgzList);
       }
       //删除对应的自动生成的未提交的出库计划单
   	   Atzchurukjhd churukjhd =(Atzchurukjhd)dataset.getObjectByHql("Atzchurukjhd", "from Atzchurukjhd where fahuotzdid ="+instance.getId());
   	   if(churukjhd !=null)
   	   {
   		   if(churukjhd.getDanjuzt()!=null && "1".equals(churukjhd.getDanjuzt()))
   		   {
   			   List <Atzchurukjhdmx> jhdmxList =dataset.getList("Atzchurukjhdmx","atzchurukjhdid ="+churukjhd.getId());
   			   if(jhdmxList!=null && jhdmxList.size()>0)
   			   {
   				   dataset.deleteAll(jhdmxList);
   			   }
   			   dataset.delete(churukjhd);    			    
   		   }
   		   else
   		   {
   			   returnMsg.set("NO","该发货通知单所对应的出库计划单已经提交，因此不能反审核！");
   			   return returnMsg;
   		   }    		   
   	   }
   	   //发货通知单明细数量—维护设备清单明细 未发货数量
   	   List<Atzfahuosbqdmx> fhmxs = dataset.getList("Atzfahuosbqdmx","fahuotzdid="+instance.getId());
   	   List<Atzshebeiqd> qdlist = dataset.getList("Atzshebeiqd","hetongid="+instance.getHetongid());
   	   if(qdlist == null || qdlist.size()<=0) {
				returnMsg.set("NO", "当前合同无设备清单");
   	   }
	   	 if(fhmxs!=null && fhmxs.size()>0){
	   		 Atzfahuosbqdmx fhmx = null;
	   		 Long xiaoshoubmid = null;
	   		 for(int i = 0; i < fhmxs.size(); i++) {
					fhmx = fhmxs.get(i);
					xiaoshoubmid = fhmx.getXiaoshoubmid();
					//数量符合，维护设备清单明细中的数量
					Double fhsl = fhmx.getShuliang();
					logger.debug("发货的fhsl"+fhsl);
					for(int k = 0; k < qdlist.size(); k++) {
						Atzshebeiqd qd = qdlist.get(k);
						List<Atzshebeiqdmx> qdmxlist = dataset.getList("Atzshebeiqdmx","atzshebeiqdid="+qd.getId()+" and xiaoshoubmid="+xiaoshoubmid);
						if(qdmxlist != null && qdmxlist.size()>0){
							Double weifhsl = qdmxlist.get(0).getWeifhsl();//设备清单明细未发货数量
							Double sbsl = qdmxlist.get(0).getShuliang();//设备明细数量
							logger.debug("qdmxid"+qdmxlist.get(0).getId());
							logger.debug("weifhsl=="+weifhsl);
							logger.debug("fhsl1111=="+fhsl);
							if(fhsl + weifhsl > sbsl){
								fhsl = fhsl + weifhsl - sbsl;
								qdmxlist.get(0).setWeifhsl(sbsl);
								logger.debug("fhsl减后=="+fhsl);
							}else{
								//设备清单明细中的未发货数量大于或等于发货数量
								qdmxlist.get(0).setWeifhsl(weifhsl + fhsl);
								break;
							}
							
						}
					}
				}
	   	 }
   	   instance.setDanjuzt("1");
   	   dataset.update(instance);
   	   return "OK";
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
