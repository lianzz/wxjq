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
public class 发货通知单oo提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(发货通知单oo提交.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则
			/**
			 * 功能： 发货通知单提交启动流程 
			 * 说明： 发货通知单提交启动流程，判断能否提交，并启动流程 
			 * 引用： 合同管理 
			 * 作者： 05
			 * 创建： 2011-10-28 
			 * 修改：2010-11-17 
			 * 原因：添加回写设备清单明细未发货数量
			 */

			Long tdygId = (Long) request.getSession().getAttribute(
					"teamEmployeeId");
			logger.error("tdygId==========" + tdygId);
			if (tdygId == null || tdygId <= 0) {
				returnMsg.set("cannotsubmit", "admin帐号不能进行提交！");
				return returnMsg;
			}
			Long id = Long
					.parseLong((String) context.get("atzfahuotzd.id"));
			Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(
					Atzfahuotzd.class, id);
			logger.debug("fahuotzd.id==========" + id);
			List<Atzfahuosbqdmx> fhtzdmx = dataset.getListByHql(
					"Atzfahuosbqdmx",
					"from Atzfahuosbqdmx where fahuotzdid='"
							+ fahuotzd.getId() + "'");
			logger.error("fahuotzdid==========" + fahuotzd.getId());

			if (fhtzdmx.size() == 0 || fhtzdmx == null) {
				return "无明细";
			}

			logger.error("fhmx.size()==========" + fhtzdmx.size());
			String qz = instance.getBianhaoqz();
//			if (instance.getBianhao() == null
//					|| (!instance.getBianhao().startsWith("F") && !instance
//							.getBianhao().startsWith("JF"))) {					
//				String preLabel = (String) getBusinessTypeLabel(
//						"fahuotzbmqz",qz);
//				
//				String rValue = null;// 单据编码
//				if ("1".equals(instance.getShifoujy())) {
//					if("5".equals(qz)){
//						paramMap.put("danjulx", "36");
//					}else{
//						paramMap.put("danjulx", "39");
//						}
//					
//					rValue = execAdjustmentRule("A-生成编码规则-05", null,
//							context, dataset, request, paramMap);
//					if (rValue.indexOf("-") > 0) {
//						rValue = rValue.replaceFirst("-", "");
//						rValue = rValue.replaceFirst("-", "");							
//						rValue = rValue.replaceFirst("TJF", "T-JF");
//						logger.debug("preLabel=="+preLabel);
//						//rValue = rValue.replaceFirst("F", preLabel);
//					}
//					logger.error("rValue" + rValue);
//					if (rValue.equals("请先设置编码规则")) {
//						returnMsg.set("请先设置编码规则", "请先设置发货通知单前缀为JF的编码规则！");
//						return returnMsg;
//					} else if (rValue.equals("流水号溢出")) {
//						returnMsg.set("流水号溢出", "发货通知单前缀为“" + preLabel
//								+ "”的编码流水号溢出！");
//						return returnMsg;
//					} else if ("Error".equals(rValue))
//						return "ERROR";
//					instance.setBianhao(rValue);
//					instance.setLinshibh(rValue);
//				} else {
//					paramMap.put("danjulx", qz);
//					rValue = execAdjustmentRule("A-生成编码规则-05", null,
//							context, dataset, request, paramMap);
//					logger.error("====" + rValue + "====");
//					if (rValue.equals("请先设置编码规则")) {
//						returnMsg.set("请先设置编码规则", "请先设置发货通知单前缀为“"
//								+ preLabel + "”的编码规则！");
//						return returnMsg;
//					} else if (rValue.equals("流水号溢出")) {
//						returnMsg.set("流水号溢出", "发货通知单前缀为“" + preLabel
//								+ "”的编码流水号溢出！");
//						return returnMsg;
//					} else if ("Error".equals(rValue)) {
//						return "ERROR";
//					} else {
//						if (rValue.indexOf("-") > 0) {
//							rValue = rValue.replaceFirst("-", "");
//							rValue = rValue.replaceFirst("-", "");
//							rValue = rValue.replaceFirst("TF", "T-F");
//							logger.error("rValue" + rValue);
//							instance.setBianhao(rValue);
//							instance.setLinshibh(rValue);
//						}
//						// if(rValue.indexOf("F")>=0 &&
//						// "1".equals(instance.getShifoujy()))
//						// rValue = rValue.replaceFirst("F", "JF");
//						// logger.error("rValue"+rValue);
//						// instance.setBianhao(rValue);
//						// instance.setLinshibh(rValue);
//					}
//				}
//			}
			//验证销售编码数量是否有效
			//维护设备清单明细中销售编码数量
			Long hetongid = instance.getHetongid();
			List<Atzfahuosbqdmx> fhmxs = dataset.getList("Atzfahuosbqdmx","fahuotzdid="+instance.getId());
			if(fhmxs!=null && fhmxs.size()>0){
				Atzfahuosbqdmx fhmx = null;
				Long xiaoshoubmid = null;
				Double shuliang = 0d;
				for(int i = 0; i < fhmxs.size(); i++) {
					fhmx = fhmxs.get(i);
					xiaoshoubmid = fhmx.getXiaoshoubmid();
					//设备清单明细中销售编码，的总数量
					shuliang = 0d;
					List<Atzshebeiqd> qdlist = dataset.getList("Atzshebeiqd","hetongid="+hetongid);
					for(int j = 0; j < qdlist.size(); j++) {
						Atzshebeiqd qd = qdlist.get(j);
						List<Atzshebeiqdmx> qdmxlist = dataset.getList("Atzshebeiqdmx","atzshebeiqdid="+qd.getId()+" and xiaoshoubmid="+xiaoshoubmid);
						if(qdmxlist != null && qdmxlist.size()>0){
							shuliang = shuliang + qdmxlist.get(0).getWeifhsl();
						}
					}
					logger.debug("xiaoshoubm=="+fhmx.getXiaoshoubm());
					logger.debug("总shuliang=="+shuliang);
					if(shuliang < fhmx.getShuliang()){
						returnMsg.set("NO", "该发货通知单中销售编码为"+fhmx.getXiaoshoubm()+"的数量超过设备清单明细中对应销售编码的未发货总数量");
						return returnMsg;
					}
					//数量符合，维护设备清单明细中的数量
					Double fhsl = fhmx.getShuliang();
					logger.debug("发货的fhsl"+fhsl);
					for(int k = 0; k < qdlist.size(); k++) {
						Atzshebeiqd qd = qdlist.get(k);
						List<Atzshebeiqdmx> qdmxlist = dataset.getList("Atzshebeiqdmx","atzshebeiqdid="+qd.getId()+" and xiaoshoubmid="+xiaoshoubmid);
						if(qdmxlist != null && qdmxlist.size()>0){
							Double weifhsl = qdmxlist.get(0).getWeifhsl();//设备清单明细数量
							logger.debug("qdmxid"+qdmxlist.get(0).getId());
							logger.debug("weifhsl=="+weifhsl);
							logger.debug("fhsl1111=="+fhsl);
							//设备清单明细中的数量小于发货数量
							if(fhsl > weifhsl){
								fhsl = fhsl - weifhsl;
								qdmxlist.get(0).setWeifhsl(0d);
								logger.debug("fhsl减后=="+fhsl);
							}else{
								//设备清单明细中的未发货数量大于或等于发货数量
								qdmxlist.get(0).setWeifhsl(weifhsl - fhsl);
								break;
							}
						}
					}
					
				}
			}
			instance.setDanjuzt("2");
			dataset.update(instance);

			String windowId229 = null;
			if (context != null) {
				windowId229 = context.getId();
			}
			Map map229 = new HashMap();
			Long result229 = WorkflowAppHelper.newProcessInstance(1979315L,
					map229, request, windowId229);
			if (result229 <= 0) {
				return "NO";
			}
			return "OK";
//###################################################################################################
	
			// over
		} catch (Exception e) {
			logger.debug("over");
		}
		return "error";
	}
}