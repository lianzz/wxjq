package rule.库存;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.rule.application.ReturnMsg;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 出库单完成 extends RuleEngine{
	private static Logger logger = Logger.getLogger(出库单完成.class);
	AProxy a = new AProxy();
	
	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-出库单-完成-10 (1757454)
			 * 2013-05-23
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
			Date today = new Date();

			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String shifouzx = instance.getShifouzx(); // 是否执行: 1-是  2-否
			if ("1".equals(shifouzx)) {
				message = "出库单已执行";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String zhidanr = instance.getZhidanr(); // 仓管员
			if (!employeeName.equals(zhidanr)) {
				message = "只有仓管员才能执行出库单完成操作！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String ckr = instance.getChurukr(); // 出库人
			if (ckr == null || "".equals(ckr.trim())) {
				message = "出库人不能为空, 请维护！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long ckjhdid = instance.getChurukjhdid(); // 出库计划ID

			Atzchurukjhd ckjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, ckjhdid); // 出库计划

			if (ckjhd == null) {
				message = "出库计划不存在, 请联系系统管理员！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long ckdid = instance.getId(); // 出库单ID

			Long xiangmuid = instance.getXiangmuid(); // 项目ID

			String renwuzt = instance.getRenwuzt(); // 任务主题
			String churukyy = instance.getChurukyy(); // 出入库原因

			List<Atzchurukdmx> ckdmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + ckdid + " order by wuliaobm,id ASC"); // 出库单明细List

			if (ckdmxs == null || ckdmxs.isEmpty()) {
				message = "出库单没有明细, 请检查！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Atzchurukdmx ckdmx = null; // 出库单明细

			String wuliaobm = null; // 物料编码
			String sn = null; // SN

			Long wuliaoid = null; // 物料ID
			Long kuweiid = null; // 库位ID
			Double meidwsl = null; // 每单位数量

			Atzwuliaojcxx wljcxx = null; // 物料基础信息

			String sngl = null; // SN管理: 1-是  2-否

			Atzshebeixx sbxx = null; // 设备信息

			String snerrpos = ""; // SN错误行号

			//-----维保 SN 判断-----
			Long weibaosqdid = ckjhd.getWeibaosqdid(); // 维保申请单ID
			if (weibaosqdid != null) {
				Atzweibaosbsqd wbd = (Atzweibaosbsqd)dataset.getObject(Atzweibaosbsqd.class, weibaosqdid);
				
				String weibaodlx = wbd.getWeibaodlx(); // 维保単类型: 4-维修设备发货申请单
				
				if ("4".equals(weibaodlx)) {
					Atzshebeisqdmx sbsqdmx = null; // 设备申请单明细
					for (int i = 0; i < ckdmxs.size(); i++) {
						ckdmx = ckdmxs.get(i);
						
						sn = ckdmx.getSn();
						
						if (sn != null) {
							sbsqdmx = (Atzshebeisqdmx) dataset.getObjectByHql("Atzshebeisqdmx", "from Atzshebeisqdmx where weibaosbsqdi=" + weibaosqdid + " and snhao='" + sn + "'");
							
							if (sbsqdmx == null) {
								message = "第 " + (i+1) + " 条出库单明细输入的 SN (" + sn + ") 与维保申请单中的 SN 不一致, 请检查！";
								
								returnMsg.set("NO", message);
								return returnMsg; 
							}
						}
					}
				}
			}

			//-----验证设备序列号有效性(非物料入在线)-----
			if (!"24".equals(churukyy)) {
				List<Atzchurukdmx> cfsnmxs = null; // 重复SN出库单明细List
				
				for (int i = 0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaobm = ckdmx.getWuliaobm();
					wuliaoid = ckdmx.getWuliaoid();
					sn = ckdmx.getSn();
					
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
					
					sngl = wljcxx.getSngl();
					
					if (sngl == null) {
						message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 信息有误, 请先设置物料 SN 管理信息！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					if ("1".equals(sngl)) {
						if (sn == null) {
							message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 的 SN 不能为空, 请检查！";
						
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						cfsnmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + ckdid + " and sn='" + sn + "'");
						if (cfsnmxs != null && cfsnmxs.size() > 1) {
							message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 存在重复输入的 SN (" + sn + "), 请检查！";
			    		
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx", "from Atzshebeixx where wuliaoid=" + wuliaoid + " and sn='" + sn + "'");
						
						if (sbxx == null) {
							if ("".equals(snerrpos)) snerrpos += (i+1);
							else snerrpos += ("," + (i+1));
						}
					}
				}
				
				if (!"".equals(snerrpos)) {
					message = "第 " + snerrpos + " 条出库单明细物料对应的 SN 不存在 (请查看设备信息)！";
				  
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			String hql = null;

			String pthql = null; // 普通hql
			String zxhql = null; // 在线hql

			Atzkucun ptkucun = null; // 普通库存
			Atzkucun zxkucun = null; // 在线库存

			Double weicrksl = null; // 未出入库数量

			Double cksl = null; // 本次出库数量
			Double bcjhcksl=null;//本次计划数量

			Double ptl = null; // 普通量
			Double zxl = null; // 在线量

			Double sysl = null; // 剩余数量

			//-----物料入在线-----
			if ("24".equals(churukyy)) {
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaobm = ckdmx.getWuliaobm();
					sn = ckdmx.getSn();
					cksl = ckdmx.getShuliang();
				
					wuliaoid = ckdmx.getWuliaoid();
					kuweiid = ckdmx.getKuweiid();
					meidwsl = ckdmx.getMeidwsl();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;	
					else
						hql += " and meidwsl is null";
						
					pthql = hql + " and kucunlx='1'";
					zxhql = hql + " and kucunlx='2'";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);

					if (ptkucun == null) {
						message = "第 " + (i+1) + " 条出库单明细没有对应的普通库存信息！";
						 
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					ptl = ptkucun.getKucunzl();
					
					if (cksl.doubleValue() > ptl.doubleValue()) {
						message = "第 " + (i+1) + " 条出库单明细普通库存量不足！";
						 
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					//-----减少普通库存量-----
					ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl)))).doubleValue());
					dataset.update(ptkucun);
					
					//-----增加在线库存量-----
					if (zxkucun != null) {
						zxl = zxkucun.getKucunzl();
						
						zxkucun.setKucunzl((new BigDecimal(Double.toString(zxl)).add(new BigDecimal(Double.toString(cksl)))).doubleValue()); 
						dataset.update(zxkucun);
					} else {
						zxkucun = new Atzkucun();
						  
						zxkucun.setKucunlx("2"); // 库存类型: 原材料在线
						zxkucun.setXiangmuid(xiangmuid); // 项目ID
						zxkucun.setWuliaoid(wuliaoid); // 物料ID
						zxkucun.setKuweiid(kuweiid); // 库位ID
						zxkucun.setMeidwsl(meidwsl); // 每单位数量
						zxkucun.setKeyongl(0.0); // 可用量
						zxkucun.setKucunzl(cksl); // 库存量
					  
						dataset.add(zxkucun);
					}
				}
			}
			Double ckdysl=null;
						Double zxsl=null;
			Atzchurukls rkls = null; // 入库流水
			//-----生产订单领料出库(优先出原材料在线)-----
			if ("1".equals(churukyy)) {
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaobm = ckdmx.getWuliaobm();
					sn = ckdmx.getSn();
					cksl = ckdmx.getShuliang();
				bcjhcksl=ckdmx.getBencijhsl();
					wuliaoid = ckdmx.getWuliaoid();
					kuweiid = ckdmx.getKuweiid();
					meidwsl = ckdmx.getMeidwsl();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;	
					else
						hql += " and meidwsl is null";
					
					zxhql = hql + " and kucunlx='2'";
					pthql = hql + " and kucunlx='1'";
					
					zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					//-----存在原材料在线-----
					if (zxkucun != null) {
						zxl = zxkucun.getKucunzl();
						ptl = ptkucun.getKucunzl();
						
						if (cksl > (zxl+ptl)) {
							message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 库存不足！";
						
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						 if (zxl.doubleValue() >= cksl.doubleValue()) {
							zxkucun.setKucunzl(new BigDecimal(Double.toString(zxl)).subtract(new BigDecimal(Double.toString(cksl))).doubleValue());
						
							dataset.update(zxkucun);
							dataset.update(ptkucun);
						 } else {
							zxkucun.setKucunzl(0.0);
							dataset.update(zxkucun);
							
							sysl = (new BigDecimal(Double.toString(cksl)).subtract(new BigDecimal(Double.toString(zxl)))).doubleValue();
							
							ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(sysl)))).doubleValue());
							
							dataset.update(ptkucun);
						 }
					} else {
						if (ptkucun == null) {
							message = "第 " + (i+1) + " 条出库单明细没有对应的普通库存信息！";
						 
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						ptl = ptkucun.getKucunzl();
						
						if (cksl.doubleValue() > ptl.doubleValue()) {
							message = "第 " + (i+1) + " 条出库单明细普通库存量不足！";
						 
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl)))).doubleValue());
						//ptkucun.setKeyongl(new BigDecimal(Double.toString(ptkucun.getKeyongl())).subtract(new BigDecimal(Double.toString(cksl))).doubleValue());
						dataset.update(ptkucun);
					}
			      //判断实际数量是否大于出库数量,大于则入在线
								if(cksl>bcjhcksl){
									ckdysl=(new BigDecimal(Double.toString(cksl)).subtract(new BigDecimal(Double.toString(bcjhcksl)))).doubleValue();
								    if(zxkucun==null){
								    	Atzkucun newzxkucun=new Atzkucun();
								    	newzxkucun.setXiangmuid(xiangmuid);
								    	newzxkucun.setWuliaoid(wuliaoid);
								    	newzxkucun.setKuweiid(kuweiid);
								    	newzxkucun.setMeidwsl(meidwsl);
								    	newzxkucun.setKucunzl(ckdysl);
								    	newzxkucun.setKucunlx("2");//在线库存
								    	dataset.add(newzxkucun);	
								    }else{
								    	zxsl=(new BigDecimal(Double.toString(zxkucun.getKucunzl())).add(new BigDecimal(Double.toString(ckdysl)))).doubleValue();
								    	zxkucun.setKucunzl(zxsl);
								    	dataset.update(zxkucun);
								    }
								    //维护库存可用量
								   // zxsl=(new BigDecimal(Double.toString(ptkucun.getKeyongl())).add(new BigDecimal(Double.toString(ckdysl)))).doubleValue();
								    //ptkucun.setKeyongl(zxsl);
			                      
			                      
			                         //生成入库流水
								    rkls = new Atzchurukls();						
									rkls.setChurukjhdid(instance.getChurukjhdid()); // 关联到出库计划单ID
									rkls.setChurukdid(instance.getId()); // 关联到出库单ID
									rkls.setChurukdmxid(ckdmx.getId()); // 关联到出单明细ID
									rkls.setChuruklx("2"); // 类型: 入库
									rkls.setChurukyy(churukyy); // 出库原因
									rkls.setXiangmuid(xiangmuid); // 项目ID
									rkls.setWuliaoid(wuliaoid); // 物料ID
									rkls.setKuweiid(kuweiid); // 库位ID
									rkls.setMeidwsl(meidwsl); // 每单位数量
									rkls.setSn(sn); // 序列号
									rkls.setBencijhsl(ckdysl); // 本次计划数量
									rkls.setShuliang(ckdysl); // 数量
									rkls.setChurukr(ckr); // 经办人
									rkls.setRiqi(today); // 日期
									rkls.setCunfangwz(ckdmx.getCunfangwz()); // 存放位置					  
									dataset.add(rkls);
								}
				}
			}

			//-----非物料入在线及生产订单领料出库-----
			if (!("24".equals(churukyy) || "1".equals(churukyy))) {
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaobm = ckdmx.getWuliaobm();
					sn = ckdmx.getSn();
					cksl = ckdmx.getShuliang();
				
					wuliaoid = ckdmx.getWuliaoid();
					kuweiid = ckdmx.getKuweiid();
					meidwsl = ckdmx.getMeidwsl();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;	
					else
						hql += " and meidwsl is null";
					
					pthql = hql + " and kucunlx='1'";

					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					if (ptkucun == null) {
						message = "第 " + (i+1) + " 条出库单明细没有对应的普通库存信息！";
					 
						returnMsg.set("NO", message);
						return returnMsg;
					}
						
					ptl = ptkucun.getKucunzl();
					
					if (cksl.doubleValue() > ptl.doubleValue()) {
						message = "第 " + (i+1) + " 条出库单明细普通库存量不足！";
					 
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).subtract(new BigDecimal(Double.toString(cksl)))).doubleValue());
					dataset.update(ptkucun);
				}
			}

			Long ckjhmxid = null; // 出库计划明细ID
			Atzchurukjhdmx ckjhdmx = null; // 出库计划明细

			//-----更新出库计划明细中的未完成数量-----
			for (int i=0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				ckjhmxid = ckdmx.getCrkjhmxid();
				cksl = ckdmx.getShuliang(); 
				
				ckjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, ckjhmxid);
					 
				 if (ckjhdmx == null) {
					message = "第 " + (i+1) + " 条出库单明细信息不完整, 请联系系统管理员！";
					 
					returnMsg.set("NO", message);
					return returnMsg;
				 }
				 
				 weicrksl = ckjhdmx.getWeicrksl();
				 
				 //判断 如果出入库原因为 生产订单领料出库，可能出库数量会大于计划明细未完成数量
							 if(!"1".equals(churukyy)){
								 if (cksl.doubleValue() > weicrksl.doubleValue()) {
										message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 已超计划数量！";					
										returnMsg.set("NO", message);
										return returnMsg;
									 }						 
									 ckjhdmx.setWeicrksl((new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(cksl)))).doubleValue());
									 dataset.update(ckjhdmx);
							 }else{
								 if (cksl.doubleValue() > weicrksl.doubleValue()) {
									 ckjhdmx.setWeicrksl(0d);
									 dataset.update(ckjhdmx);
								  }else{
									  ckjhdmx.setWeicrksl((new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(cksl)))).doubleValue());
									  dataset.update(ckjhdmx);
								  }						  
							 }
			}

			String cszxhql = null; // 测试在线hql
			Atzkucun cszxkucun = null; // 测试在线库存

			//-----测试任务单出库时, 生成测试在线库存信息-----
			if ("11".equals(churukyy)) {
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);

					cksl = ckdmx.getShuliang();
				
					wuliaoid = ckdmx.getWuliaoid();
					meidwsl = ckdmx.getMeidwsl();
					
					cszxhql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kucunlx='5'";
					 
					if (meidwsl != null)
						cszxhql += " and meidwsl=" + meidwsl;
					else
						cszxhql += " and meidwsl is null";
						 
					cszxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", cszxhql);
					
					if (cszxkucun != null) {
						cszxkucun.setKeyongl((new BigDecimal(Double.toString(cszxkucun.getKeyongl())).add(new BigDecimal(Double.toString(cksl)))).doubleValue());
						cszxkucun.setKucunzl((new BigDecimal(Double.toString(cszxkucun.getKucunzl())).add(new BigDecimal(Double.toString(cksl)))).doubleValue());
				          
						dataset.update(cszxkucun);
					} else {
						cszxkucun = new Atzkucun();
						  
						cszxkucun.setKucunlx("5"); // 库存类型: 测试在线
						cszxkucun.setXiangmuid(xiangmuid); // 项目ID
						cszxkucun.setWuliaoid(wuliaoid); // 物料ID
						cszxkucun.setMeidwsl(meidwsl); // 每单位数量
						cszxkucun.setKeyongl(cksl); // 可用量
						cszxkucun.setKucunzl(cksl); // 库存量
					  
						dataset.add(cszxkucun);
					}
				}
			}

			String beizhu = null;

			//-----维修和复测任务单出库时, 生成维修记录-----
			if ("19".equals(churukyy) || "64".equals(churukyy)) {
				Atzweixiujl wxjl = null; // 维护记录
				
				List<Atzshebeisqdmx> shebeisqdmxs = null; // 设备申请单明细List
				
				Atzshebeisqdmx shebeisqdmx = null; // 设备申请单明细
				Atzweibaosbsqd weibaosbsqd = null; // 维保申请单
				
				List<Atzchurukdmx> ckdmxList = null; // 出库单明细List
				
				Atzchurukdmx mx = null; // 出库单明细
				
				Long ckid = null; // 出库单ID
				Atzchurukd ckd = null; // 出库单
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaoid = ckdmx.getWuliaoid();
					sn = ckdmx.getSn();
					beizhu = ckdmx.getBeizhu();
				
					wxjl = new Atzweixiujl();
					
					wxjl.setScrwid(ckjhd.getScrwdid()); // 生产任务ID
					wxjl.setLaiyuan("2"); // 来源: 现场
					wxjl.setWuliaoid(wuliaoid); // 物料ID
					wxjl.setSn(sn); // SN
					wxjl.setGuzhangxx(beizhu); // 故障现象
					
					shebeisqdmxs = dataset.getList("Atzshebeisqdmx", "snhao='" + sn + "' order by id DESC");
					if (shebeisqdmxs!=null && shebeisqdmxs.size() > 0) {
						shebeisqdmx = shebeisqdmxs.get(0);
						
						wxjl.setGuzhangxx(shebeisqdmx.getGuzhangxx()); // 故障现象
						wxjl.setHuichangsj(shebeisqdmx.getHuichangsj()); // 回厂时间
						
						weibaosbsqd =(Atzweibaosbsqd) dataset.getObject("Atzweibaosbsqd", shebeisqdmx.getWeibaosbsqdi());
						
						wxjl.setFanghuidd(weibaosbsqd.getDaohuodd()); // 返回地点
						wxjl.setHetongid(weibaosbsqd.getHetong()); // 合同ID
						wxjl.setLianxidh(weibaosbsqd.getLianxidh()); // 联系电话
					}
					
					ckdmxList = dataset.getList("Atzchurukdmx", "sn='" + sn + "' order by id DESC");
					boolean flag = true;
					if (ckdmxList != null && ckdmxList.size() > 0) {
						mx = ckdmxList.get(0);
						if (mx != null) {
							ckid = mx.getAtzchurukdid(); 
							ckd = (Atzchurukd) dataset.getObject(Atzchurukd.class, ckid);
							if (ckd != null) {
								if (ckd.getChurukrq() != null) {
									wxjl.setHuichangsj(ckd.getChurukrq()); // 回厂时间
									flag = false;
								}
							} 
						} 
					}
					
					if ( flag )
				    	  wxjl.setHuichangsj(new Date()); // 回厂时间
				      
					wxjl.setLururq(new Date()); // 录入日期
					wxjl.setLurur(employeeName); // 录入人
					  
					dataset.add(wxjl);
				}
			}

			//-----合同发货时, 对有序列号的物料自动生成设备维保信息-----
			if ("3".equals(churukyy)) {
				Atzshebeiwbxx sbwbxx = null; // 设备维保信息
				Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, ckjhd.getFahuotzdid());
				
				if (fahuotzd == null) {
					message = "出库计划没有对应的发货通知, 无法生成设备维保信息！";
				    	  
					returnMsg.set("NO", message);
					return returnMsg;
				}
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					wuliaoid = ckdmx.getWuliaoid();
					sn = ckdmx.getSn();
					
					if (sn != null) {
						sbwbxx = new Atzshebeiwbxx();
						
						sbwbxx.setKehuid(fahuotzd.getKehuid()); // 客户ID
						sbwbxx.setXiaoshouhtid(fahuotzd.getHetongid()); // 销售合同ID
						sbwbxx.setWeibaohtid(fahuotzd.getHetongid()); // 维保合同ID
						sbwbxx.setWuliaoid(wuliaoid); // 物料ID
						sbwbxx.setSn(sn); // SN
						sbwbxx.setShifouyx("1"); // 是否超保: 是
				      
						dataset.add(sbwbxx);
					}
				}
			}

			//-----更新设备信息状态-----
			if (!"24".equals(churukyy)) {
				List<Atzchurukls> snlss = null; // 出入库流水
				
				String shifouzk = null; // 单板状态: 1-仓库中  2-已发货  3-加工中  4-测试中  5-维修中  6-检验中  7-维保已申请  8-借用中
				
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					sn = ckdmx.getSn();
					
					if (sn != null) {
						sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx", "from Atzshebeixx where sn='" + sn + "'");
						
						snlss = dataset.getList("Atzchurukls", "sn='" + sn +"'");
						
						if (snlss != null && snlss.size() > 0) {
							shifouzk = sbxx.getShifouzk();
				      
							if (!"1".equals(shifouzk)) {
								message = "第 " + (i+1) + " 条出库单明细物料 (" + wuliaobm + ") 对应的 SN ( " + sn + " ) 不在库 (请查看物料跟踪信息)！";
				    	  
								returnMsg.set("NO", message);
								return returnMsg;
							}
						}
						
						if ("1".equals(churukyy) || "66".equals(churukyy) || "68".equals(churukyy)) {
							sbxx.setShifouzk("3"); // 加工中
						} else if ("11".equals(churukyy)){
							sbxx.setShifouzk("4"); // 测试中
						} else if ("19".equals(churukyy)) {
							sbxx.setShifouzk("5"); // 维修中
						} else if ("55".equals(churukyy) || "59".equals(churukyy) || "35".equals(churukyy) || "37".equals(churukyy) || "39".equals(churukyy) || "41".equals(churukyy)) {
							sbxx.setShifouzk("8"); // 借用中
						} else {
							sbxx.setShifouzk("2"); // 已发货
						}
				   		
						dataset.update(sbxx);
					}
				}
			}

			//-----合同发货时, 初始化发货跟踪记录-----
			if ("3".equals(churukyy) || "18".equals(churukyy) || "5".equals(churukyy) || "15".equals(churukyy) || "17".equals(churukyy) || "53".equals(churukyy)) {
				Atzfahuojhzj fahuozj = new Atzfahuojhzj(); // 发货总结
				  
				fahuozj.setChurukdid(ckdid); // 出库单ID
				fahuozj.setTongzhidxfrq(today); // 通知单下发日期
				fahuozj.setZongxiangs(0); // 总箱数
				fahuozj.setYunshugs("杭州新杰"); // 运输公司
			  
				dataset.add(fahuozj);
			}

			Long ckdmxid = null; // 出库单明细ID

			Atzchurukls ckls = null; // 出库流水

			Double bencijhsl = null; // 本次计划数量
			String cunfangwz = null; // 存放位置

			//-----生成出库流水-----
			for (int i=0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);
				
				ckdmxid = ckdmx.getId();
				sn = ckdmx.getSn();
				bencijhsl = ckdmx.getBencijhsl();
				cksl = ckdmx.getShuliang();
				cunfangwz = ckdmx.getCunfangwz();

				wuliaoid = ckdmx.getWuliaoid();
				kuweiid = ckdmx.getKuweiid();
				meidwsl = ckdmx.getMeidwsl();
				
				ckls = new Atzchurukls();
				
				ckls.setChurukjhdid(ckjhdid); // 出库计划单ID
				ckls.setChurukdid(ckdid); // 出库单ID
				ckls.setChurukdmxid(ckdmxid); // 出库单明细ID
				ckls.setChuruklx("1"); // 类型: 出库
				ckls.setChurukyy(churukyy); // 出库原因
				ckls.setXiangmuid(xiangmuid); // 项目ID
				ckls.setWuliaoid(wuliaoid); // 物料ID
				ckls.setKuweiid(kuweiid); // 库位ID
				ckls.setMeidwsl(meidwsl); // 每单位数量
				ckls.setSn(sn); // 序列号
				ckls.setBencijhsl(bencijhsl); // 本次计划数量
				ckls.setShuliang(cksl); // 数量
				ckls.setChurukr(ckr); // 经办人
				ckls.setRiqi(today); // 日期
				ckls.setCunfangwz(cunfangwz); // 存放位置
			  
				dataset.add(ckls);		
			}

			//-----维护出库计划是否完成字段-----
			Double wcksl = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "weicrksl", "atzchurukjhdid=" + ckjhdid));

			if (wcksl.doubleValue() <= 0) {
				ckjhd.setShifouwc("1"); // 是否完成: 已完成
				// ---无线需求：研发试制生成的出库单完成时维护字段“完成物料准备日”、“计划试生产日”-05H-start-----
				if(ckjhd.getScjhid() != null) {
					List<Atzscjhmx> scjhmxs = dataset.getList("Atzscjhmx", "atzscjhid=" + ckjhd.getScjhid() + " and yfszid is not null");
					if(scjhmxs!=null && scjhmxs.size()>0) {
						Atzyanfasz yfsz = (Atzyanfasz)dataset.getObject("Atzyanfasz", scjhmxs.get(0).getYfszid());
						if(yfsz != null) {
							yfsz.setWcwlzbr(today);
							yfsz.setJihuasscr(today);
							dataset.update(yfsz);
						}
					}
				}
				// ---无线需求：研发试制生成的出库单完成时维护字段“完成物料准备日”、“计划试生产日”-05H-end-----
			} else {
				ckjhd.setShifouwc("2"); // 是否完成: 未完成
			}

			dataset.update(ckjhd);

			//-----更新出库单信息-----
			paramMap.put("danjulx", "16"); // 设置编码规则

			String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);

			if (rValue.equals("流水号溢出"))
				message = "出库单流水号溢出！";
			else if ("Error".equals(rValue))
				message = "生成出库单编号有误, 请联系系统管理员！";

			if (message != null) {
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			instance.setBianhao(rValue); // 正式编号
			instance.setShifouzx("1"); // 是否执行: 是
			instance.setChurukrq(today); // 出库日期

			dataset.update(instance);

			String errpos = "";

			//-----库存验证-----
			for (int i=0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				wuliaoid = ckdmx.getWuliaoid();
				kuweiid = ckdmx.getKuweiid();
				meidwsl = ckdmx.getMeidwsl();
				
				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
				
				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;	
				else
					hql += " and meidwsl is null";
					
				pthql = hql + " and kucunlx='1'";
				zxhql = hql + " and kucunlx='2'";
				
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
				
				ptl = 0.0;
				zxl = 0.0;
				
				if (ptkucun != null)
					ptl = ptkucun.getKucunzl();					
				if (zxkucun != null)
					zxl = zxkucun.getKucunzl();						
				if (ptl < 0 || zxl < 0) {
					if ("".equals(errpos)) errpos += (i+1);
					else errpos += ("," + (i+1));
				}
			}

			if (!"".equals(errpos)) {
				  message = "在所选择的项目和库位下，第 " + errpos + " 条出库明细物料库存量不足！";					  
				  returnMsg.set("NO", message);
				  return returnMsg;
			}

			//-----维护出库单明细信息-----
			for (int i=0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);

				cksl = ckdmx.getShuliang();
				
				ckdmx.setWeizxsl(cksl); // 未装箱数量
				ckdmx.setLururq(today); // 录入日期
				
				dataset.update(ckdmx);
			}

			//-----借用领用信息维护-----
			if ("15".equals(churukyy) || "37".equals(churukyy) || "17".equals(churukyy) || "39".equals(churukyy) || "41".equals(churukyy) || "33".equals(churukyy) || "35".equals(churukyy) 
			   || "45".equals(churukyy) || "47".equals(churukyy) || "53".equals(churukyy) || "55".equals(churukyy)) {
				String jylyhql = null;
				
				Atzjylyqingdan jylyqingdan = null; // 借用领用清单
				
				for (int i=0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);							
					wuliaoid = ckdmx.getWuliaoid();
					meidwsl = ckdmx.getMeidwsl();
					
					sn = ckdmx.getSn();
					cksl = ckdmx.getShuliang();
					
					jylyhql = "from Atzjylyqingdan where wuliaoid=" + wuliaoid;
					
					if (meidwsl != null)
						jylyhql += " and meidwsl=" + meidwsl;	
					else
						jylyhql += " and meidwsl is null";
					
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);						
					sngl = wljcxx.getSngl();						
					if ("1".equals(sngl)) {
						jylyhql += " and sn='" + sn + "'";							
						jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);							
						if (jylyqingdan != null) {
							jylyqingdan.setYuanyin(churukyy); // 原因 
							jylyqingdan.setChurukr(ckr); // 经办人
							jylyqingdan.setRiqi(today); // 日期
							jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
							//维护出库单计划编号
							jylyqingdan.setCkjhdh(ckjhd.getBianhao());
							jylyqingdan.setBmmc(ckjhd.getBmmc());
							dataset.update(jylyqingdan);
						} else {
							jylyqingdan = new Atzjylyqingdan();								
							jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
							jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
							jylyqingdan.setSn(sn); // 序列号
							jylyqingdan.setShuliang(1.0); // 数量
							jylyqingdan.setYuanyin(churukyy); // 原因 
							jylyqingdan.setChurukr(ckr); // 经办人
							jylyqingdan.setRiqi(today); // 日期
							jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
							//维护出库单计划编号
							jylyqingdan.setCkjhdh(ckjhd.getBianhao());
							jylyqingdan.setBmmc(ckjhd.getBmmc());
							dataset.add(jylyqingdan);
						}
					} else {
						jylyhql += " and yuanyin='" + churukyy + "' and churukr='" + ckr + "'";							
						jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);							
						if (jylyqingdan != null) {
							jylyqingdan.setShuliang(jylyqingdan.getShuliang() + cksl); // 数量
							jylyqingdan.setRiqi(today); // 日期
							//维护出库单计划编号
							jylyqingdan.setCkjhdh(ckjhd.getBianhao());
							jylyqingdan.setBmmc(ckjhd.getBmmc());
							dataset.update(jylyqingdan);
						} else {
							jylyqingdan = new Atzjylyqingdan();								
							jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
							jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
							jylyqingdan.setShuliang(cksl); // 数量
							jylyqingdan.setYuanyin(churukyy); // 原因 
							jylyqingdan.setChurukr(ckr); // 经办人
							jylyqingdan.setRiqi(today); // 日期
							jylyqingdan.setGhzhuangt("2"); // 归还状态: 未归还
							//维护出库单计划编号
							jylyqingdan.setCkjhdh(ckjhd.getBianhao());
							jylyqingdan.setBmmc(ckjhd.getBmmc());
							dataset.add(jylyqingdan);
						}
					}
				}
			}
			//删除库存明细,如果是物料入在线则新增在线库存明细
			String mxsql=null;
			Atzkucunmx kcmx=null;
			for (int i = 0; i < ckdmxs.size(); i++) {
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
				
				pthql = hql + " and kucunlx='1'";
				zxhql=  hql + " and kucunlx='2'";
				
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);				
				if(wljcxx!=null && "1".equals(wljcxx.getSngl())){//sn管理
					if(sn!=null && !"".equals(sn)){//sn不为空
						mxsql="from Atzkucunmx where kucunid="+ptkucun.getId()+" and wuliaoid="+wuliaoid+" and sn='"+sn+"'";
						kcmx = (Atzkucunmx) dataset.getObjectByHql("Atzkucunmx", mxsql);
						if(kcmx!=null){
							dataset.delete(kcmx);//删除普通库存下 的库存明细
						}else{
							message ="在所选择的项目和库位下，物料序列号："+sn+"对应的库存明细不存在！";
							returnMsg.set("OK", message);
							return returnMsg;
						}
						if("24".equals(churukyy)){//是物料入在线，生成在线库存下的库存明细
							if(zxkucun!=null){
							  //在线库存新增明细
							  Atzkucunmx zxkcmx=new Atzkucunmx();
							  zxkcmx.setKucunid(zxkucun.getId());
							  zxkcmx.setSn(sn.trim());
							  zxkcmx.setWuliaoid(wuliaoid);
							  zxkcmx.setShuliang(1d);
							  zxkcmx.setWuliaozt("1");//正常
							  dataset.add(zxkcmx);
							}
						}
					}
				}	
			}

			/**维保更换出库完成自动更新现场设备配置信息（前提：出入库均已完成）
			*作者:06
			*
			*/

			if("5".equals(churukyy)){
				Atzchurukjhd ckjhd06=(Atzchurukjhd)dataset.getObject(Atzchurukjhd.class,instance.getChurukjhdid());
				boolean flag06=false;
				if(ckjhd06!=null&&"1".equals(ckjhd06.getShifouwc())){
					Atzweibaosbsqd ckwbd06=(Atzweibaosbsqd)dataset.getObject(Atzweibaosbsqd.class,ckjhd06.getWeibaosqdid());
					if(ckwbd06!=null){
							List<Atzchurukjhd> rkjhdList06=dataset.getListByHql("Atzchurukjhd"," from Atzchurukjhd where weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"+ckwbd06.getBianhao()+"R')");
							Atzchurukjhd  jhd06=null;
							if(rkjhdList06!=null&&rkjhdList06.size()>0){
									jhd06=rkjhdList06.get(0);
							}
							
							if(jhd06!=null&&"1".equals(jhd06.getShifouwc())){
								flag06=true;
							}else{
								flag06=false;
							}

							if(flag06){
								//根据出库流水和入库流水自动更新设备配置信息.以出库做为循环条件，没出的记录无需更新
								List<Atzchurukls> cklsList06=dataset.getListByHql("Atzchurukls"," from Atzchurukls where churukjhdid="+ckjhd06.getId());
								List<Atzchurukls> rklsList06=dataset.getListByHql("Atzchurukls"," from Atzchurukls where churukjhdid="+jhd06.getId());
								for(int i06=0;i06<cklsList06.size();i06++){
									Atzchurukls ckls06=cklsList06.get(i06);
									if(ckls06!=null&&ckls06.getSn()!=null){
										if(rklsList06!=null&&rklsList06.size()>i06){
											Atzchurukls rkls06=rklsList06.get(i06);
											if(rkls06!=null&&rkls06.getSn()!=null){
												//执行更新
												String update06="update Atzshebeipzxx set wuliaosn    = '"+ckls06.getSn()+"'"+",wuliaoid="+ckls06.getWuliaoid()+"  where   wuliaosn='"+rkls06.getSn()+"'";
												dataset.batchUpdate("Atzshebeipzxx",update06);
											}
											
										}
										
									}
									
								}
							}
						}						
					}					
				}
			message = "【出库单】执行完成";
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
