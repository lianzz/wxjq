package rule.生产;

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
public class CopyOfRuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(CopyOfRuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-入库单-完成-10 (1763254)
			 * 2013-04-10
			 */
			 
			String message = null; // 提示信息

			Date today = new Date();

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String shifouzx = instance.getShifouzx(); // 是否执行: 1-是  2-否
			if ("1".equals(shifouzx)) {
				message = "入库单已执行！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String rkr = instance.getChurukr(); // 入库人
			if (rkr == null || "".equals(rkr.trim())) {
				message = "入库人不能为空, 请维护！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String zhidanr = instance.getZhidanr(); // 仓管员
			if (!employeeName.equals(zhidanr)) {
				message = "只有仓管员才能执行入库单完成操作！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long rkjhdid = instance.getChurukjhdid(); // 入库计划ID
			Atzchurukjhd rkjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, rkjhdid); // 入库计划
			if (rkjhd == null) {
				message = "入库计划不存在, 请联系系统管理员！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long rkdid = instance.getId(); // 入库单ID
			Long xiangmuid = instance.getXiangmuid(); // 项目ID
			String churukyy = instance.getChurukyy(); // 入库原因

			List<Atzchurukdmx> rkdmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + rkdid + " order by wuliaobm,id ASC"); // 入库单明细List
			if (rkdmxs == null || rkdmxs.isEmpty()) {
				message = "入库单没有明细, 请检查！";				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Atzchurukdmx rkdmx = null; // 入库单明细

			Long wuliaoid = null; // 物料ID
			String wuliaobm = null; // 物料编码
			String sn = null; // SN

			Atzwuliaojcxx wljcxx = null; // 物料基础信息

			String sngl = null; // SN管理: 1-是  2-否

			Atzshebeixx sbxx = null; // 设备信息

			String snerrpos = ""; // SN错误行号

			//-----验证设备序列号有效性(非在线物料退库)-----
			if (!"25".equals(churukyy) && !"4".equals(churukyy)&& !"8".equals(churukyy)) {
				List<Atzchurukdmx> cfsnmxs = null; // 重复SN入库单明细List
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);					
					wuliaoid = rkdmx.getWuliaoid();
					wuliaobm = rkdmx.getWuliaobm();
					sn = rkdmx.getSn();					
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);					
					sngl = wljcxx.getSngl();					
					if (sngl == null) {
						message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 是否SN管理信息未设置, 无法入库！";						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					if ("1".equals(sngl)) {
						if (sn == null) {
							message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN 不能为空！";						
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						cfsnmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + rkdid + " and sn='" + sn + "'");
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
					} else {
						rkdmx.setSn(null);
						
						dataset.update(rkdmx);
					}
				}
				
				if (!"".equals(snerrpos)) {
					message = "第 " + snerrpos + " 条入库单明细物料对应的 SN 不存在 (请查看设备信息)！";
				  
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			Long jianyandid = null; // 检验单ID
			Long jianyandmxid = null; // 检验单明细ID
			Atzjianyandmx jianyandmx = null; // 检验单明细

			//-----检验入库序列号有效性验证(非采购入库)-----
			if (!"4".equals(churukyy)&&!"8".equals(churukyy)) {
				jianyandid = instance.getJianyandid();				
				if (jianyandid != null) {
					String sns = ""; // 检验单明细 SN				
					for (int i = 0; i < rkdmxs.size(); i++) {
						rkdmx = rkdmxs.get(i);						
						jianyandmxid = rkdmx.getJianyandmxid();						
						jianyandmx = (Atzjianyandmx) dataset.getObject(Atzjianyandmx.class, jianyandmxid);
						
						sn = jianyandmx.getSn();
						
						if (sn != null && !"".equals(sn.trim())) {
							if ("".equals(sns)) sns += sn;
							else sns += "," + sn;
						}
					}
					
					if (!"".equals(sns)) {
						for (int i = 0; i < rkdmxs.size(); i++) {
							rkdmx = rkdmxs.get(i);
							
							sn = rkdmx.getSn();
							
							if (sns.indexOf(sn) == -1) {
								message = "第 " + (i+1) + " 条入库单明细输入的 SN 与备注中的 SN 不一致！";
								
								returnMsg.set("NO", message);
								return returnMsg;
							}
						}
					}
				}
			}

			//-----借出SN正确性判断-----
			int crkyy = Integer.parseInt(churukyy);

			if (crkyy==56 || crkyy==34 || crkyy==36 || crkyy==38 || crkyy==40 || crkyy==42 || crkyy==54 || crkyy==16 || crkyy==52) {
				Atzchurukjhd glckjhd = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd", "from Atzchurukjhd where bianhao='" + rkjhd.getGlcrkjhdbh() + "'");

				if (glckjhd != null) {
					Long glckjhdid = glckjhd.getId();
				
					List<Atzchurukd> glckdlist = dataset.getList("Atzchurukd", "churukjhdid=" + glckjhdid + " and shifouzx='1'");
					
					if (glckdlist == null || glckdlist.isEmpty()) {
						message = "入库单没有借用时的出库信息！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					List<Atzchurukdmx> glckdmxs = null; // 关联出库单明细List
					
					String ghhql = null;
					
					//-----SN验证-----
					for (int i = 0; i < rkdmxs.size(); i++) {
						rkdmx = rkdmxs.get(i);
						
						sn = rkdmx.getSn();
						
						if (sn != null) {
							ghhql = "from Atzchurukdmx where atzchurukdid in (select id from Atzchurukd where churukjhdid=" + glckjhdid + ") and sn='" + sn + "'";
							
							glckdmxs = dataset.getListByHql("Atzchurukdmx", ghhql);
							
							if (glckdmxs == null || glckdmxs.isEmpty()) {
								message = "第 " + (i+1) + " 条入库单明细输入的 SN (" + sn + ") 不是借出时的 SN！";
								
								returnMsg.set("NO", message);
								return returnMsg;
							}
						}
					}
				}
			}

			//-----维保SN正确性判断-----
			Long weibaosqdid = rkjhd.getWeibaosqdid(); // 维保申请单ID
			if (weibaosqdid != null) {
				Atzweibaosbsqd wbd = (Atzweibaosbsqd) dataset.getObject(Atzweibaosbsqd.class, weibaosqdid);
				
				String weibaodlx = wbd.getWeibaodlx(); // 维保単类型: 5-维保设备入库申请单
				//-----维修-----
				if ("5".equals(weibaodlx) || ("2".equals(weibaodlx) && "RE".indexOf(wbd.getBianhao())>0)) {
					Atzshebeisqdmx shebeisqdmx = null; // 维保设备申请单明细
					for (int i = 0; i < rkdmxs.size(); i++) {
						rkdmx = rkdmxs.get(i);
						
						sn = rkdmx.getSn();
						
						if (sn != null) {
							shebeisqdmx = (Atzshebeisqdmx) dataset.getObjectByHql("Atzshebeisqdmx", "from Atzshebeisqdmx where weibaosbsqdi=" + weibaosqdid + " and snhao='" + sn + "'");
							
							if (shebeisqdmx == null) {
								message = "第 " + (i+1) + " 条入库单明细输入的 SN 与维保申请单中的 SN 不一致, 请检查！";
								
								returnMsg.set("NO", message);
								return returnMsg; 
							}
						}
					}
				}
			}

			String hql = null;

			String pthql = null; // 普通hql
			String zxhql = null; // 在线hql

			Atzkucun ptkucun = null; // 普通库存
			Atzkucun zxkucun = null; // 在线库存

			Double zxl = null; // 在线量
			Double ptl = null; // 实际量

			Double rksl = null; // 入库数量

			Long kuweiid = null; // 库位ID
			Double meidwsl = null; // 每单位数量

			String cunfangwz = null; // 存放位置

			//-----在线物料退库-----
			if ("25".equals(churukyy)) {
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
				
					wuliaoid = rkdmx.getWuliaoid();
					kuweiid = rkdmx.getKuweiid();
					meidwsl = rkdmx.getMeidwsl();
					
					wuliaobm = rkdmx.getWuliaobm();
					
					rksl = rkdmx.getShuliang();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
						
					zxhql = hql +  " and kucunlx='2'";
					pthql = hql +  " and kucunlx='1'";
					
					zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					if (zxkucun == null) {
						message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在线库存信息！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					zxl = zxkucun.getKucunzl();
					if (rksl.doubleValue() > zxl.doubleValue()) {
						message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 对应的在线库存量不足！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					zxkucun.setKucunzl((new BigDecimal(Double.toString(zxl)).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					dataset.update(zxkucun);
					
					ptl = ptkucun.getKucunzl();
					ptkucun.setKucunzl((new BigDecimal(Double.toString(ptl)).add(new BigDecimal(Double.toString(rksl)))).doubleValue());
					dataset.update(ptkucun);
				}
			}

			//-----非在线物料退库-----
			if (!"25".equals(churukyy)) {
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
					
					jianyandmxid = rkdmx.getJianyandmxid();
					
					wuliaoid = rkdmx.getWuliaoid();
					kuweiid = rkdmx.getKuweiid();
					meidwsl = rkdmx.getMeidwsl();
					
					wuliaobm = rkdmx.getWuliaobm();
					cunfangwz = rkdmx.getCunfangwz();
					
					rksl = rkdmx.getShuliang();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					pthql = hql +  " and kucunlx='1'";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					if (ptkucun != null) {
						ptkucun.setKeyongl((new BigDecimal(Double.toString(ptkucun.getKeyongl())).add(new BigDecimal(Double.toString(rksl)))).doubleValue());
						ptkucun.setKucunzl((new BigDecimal(Double.toString(ptkucun.getKucunzl())).add(new BigDecimal(Double.toString(rksl)))).doubleValue());
						
						if (ptkucun.getCunfangwz() == null)
							ptkucun.setCunfangwz(cunfangwz);

						dataset.update(ptkucun);
					} else {
						ptkucun = new Atzkucun();

						ptkucun.setKucunlx("1"); // 库存类型: 普通库存
						ptkucun.setXiangmuid(xiangmuid); // 项目ID
						ptkucun.setWuliaoid(wuliaoid); // 物料ID
						ptkucun.setKuweiid(kuweiid); // 库位ID
						ptkucun.setMeidwsl(meidwsl); // 每单位数量
						ptkucun.setKeyongl(rksl); // 可用量
						ptkucun.setKucunzl(rksl); // 库存量
						ptkucun.setCunfangwz(cunfangwz); // 存放位置

						dataset.add(ptkucun);
					}
					
					if (jianyandmxid != null) {
						jianyandmx = (Atzjianyandmx) dataset.getObject(Atzjianyandmx.class, jianyandmxid);
						
						jianyandmx.setYrkshuliang((new BigDecimal(Double.toString(jianyandmx.getYrkshuliang())).add(new BigDecimal(Double.toString(rksl)))).doubleValue());
						jianyandmx.setWeirksl((new BigDecimal(Double.toString(jianyandmx.getWeirksl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
						
						dataset.update(jianyandmx);
					}
				}
			}

			Long rkjhmxid = null; // 入库计划明细ID
			Atzchurukjhdmx rkjhdmx = null; // 入库计划明细

			Double weicrksl = null; // 未完成数量

			//-----更新入库计划单明细中的未完成数量-----
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);
				
				rkjhmxid = rkdmx.getCrkjhmxid();
				rksl = rkdmx.getShuliang();
				
				rkjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, rkjhmxid);
					 
				 if (rkjhdmx == null) {
					message = "第 " + (i+1) + " 条入库单明细信息不完整, 请联系系统管理员！";
					 
					returnMsg.set("NO", message);
					return returnMsg;
				 }
				 
				 weicrksl = rkjhdmx.getWeicrksl();
				 
				 if (rksl.doubleValue() > weicrksl.doubleValue()) {
					message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 已超计划数量！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				 }
				 
				 rkjhdmx.setWeicrksl((new BigDecimal(Double.toString(weicrksl)).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
				 dataset.update(rkjhdmx);
			}

			//-----采购入库时, 减少在途库存量-----
			if ("4".equals(churukyy)) {
				String zthql = null; // 在途hql
				
				Atzkucun ztkucun = null; // 在途库存
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
				
					wuliaoid = rkdmx.getWuliaoid();
					kuweiid = rkdmx.getKuweiid();
					meidwsl = rkdmx.getMeidwsl();
					
					wuliaobm = rkdmx.getWuliaobm();
					
					rksl = rkdmx.getShuliang();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					zthql = hql + " and kucunlx='3'";
					
					ztkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zthql);
					
					if (ztkucun == null) {
						message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在途库存信息！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					ztkucun.setKeyongl((new BigDecimal(Double.toString(ztkucun.getKeyongl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					ztkucun.setKucunzl((new BigDecimal(Double.toString(ztkucun.getKucunzl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					
					if (ztkucun.getKeyongl() < 0.0) {
						ztkucun.setKeyongl(0.0);
						ztkucun.setKucunzl(0.0);
					}
					
					dataset.update(ztkucun);

					
				}
			}

			//-----加工任务单入库时, 减少生产在线库存量-----
			if ("2".equals(churukyy)) {
				String sczxhql = null; // 生产在线hql
				
				Atzkucun sczxkucun = null; // 生产在线库存
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
				
					wuliaoid = rkdmx.getWuliaoid();
					kuweiid = rkdmx.getKuweiid();
					meidwsl = rkdmx.getMeidwsl();
					
					wuliaobm = rkdmx.getWuliaobm();
					
					rksl = rkdmx.getShuliang();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					sczxhql = hql + " and kucunlx='4'";
					
					sczxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", sczxhql);
					
					if (sczxkucun != null) {
						sczxkucun.setKeyongl((new BigDecimal(Double.toString(sczxkucun.getKeyongl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
						sczxkucun.setKucunzl((new BigDecimal(Double.toString(sczxkucun.getKucunzl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
						
						if (sczxkucun.getKeyongl() < 0.0) {
							sczxkucun.setKeyongl(0.0);
							sczxkucun.setKucunzl(0.0);
						}
						
						dataset.update(sczxkucun);
					}
				}
			}

			//-----测试完成入库时, 减少测试在线库存量-----
			if ("12".equals(churukyy)) {
				String cszxhql = null; // 测试在线hql
				
				Atzkucun cszxkucun = null; // 测试在线库存
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
				
					wuliaoid = rkdmx.getWuliaoid();
					kuweiid = rkdmx.getKuweiid();
					meidwsl = rkdmx.getMeidwsl();
					
					wuliaobm = rkdmx.getWuliaobm();
					
					rksl = rkdmx.getShuliang();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid;
					
					if (meidwsl != null)
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
						
					cszxhql = hql + " and kucunlx='5'";
					
					cszxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", cszxhql);
					
					if (cszxkucun == null) {
						message = "第 " + (i+1) + " 行入库单明细物料 (" + wuliaobm + ") 没有对应的测试在线库存信息！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					cszxkucun.setKeyongl((new BigDecimal(Double.toString(cszxkucun.getKeyongl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					cszxkucun.setKucunzl((new BigDecimal(Double.toString(cszxkucun.getKucunzl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
						
					if (cszxkucun.getKeyongl() < 0.0) {
						cszxkucun.setKeyongl(0.0);
						cszxkucun.setKucunzl(0.0);
					}
						
					dataset.update(cszxkucun);
				}
			}

			//-----更新设备信息中的是否在库状态-----
			if (!"25".equals(churukyy)&& !"4".equals(churukyy)&& !"8".equals(churukyy)) {
				List<Atzchurukls> snlss = null; // 出入库流水
				
				String shifouzk = null; // 单板状态: 1-仓库中  2-已发货  3-加工中  4-测试中  5-维修中  6-检验中  7-维保已申请  8-借用中
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);

					sn = rkdmx.getSn();

					if (sn != null) {
						sbxx = (Atzshebeixx) dataset.getObjectByHql("Atzshebeixx", "from Atzshebeixx where sn='" + sn + "'");
					
						shifouzk = sbxx.getShifouzk();
						
						if ("9".equals(shifouzk)) {
							message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn + ") 已报废 (请查看设备信息管理)！";
							
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						if ("10".equals(shifouzk)) {
							message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn + ") 已处理 (请查看设备信息管理)！";
							
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						snlss = dataset.getList("Atzchurukls", "sn='" + sn +"'");
						
						if (snlss != null && snlss.size() > 0) {
							if ("1".equals(shifouzk)) {
								message = "第 " + (i + 1) + " 条入库单明细物料 (" + wuliaobm + ") 的 SN (" + sn + ") 已在库 (请查看物料跟踪信息)！";
							
								returnMsg.set("NO", message);
								return returnMsg;
							}
						}
						
						sbxx.setShifouzk("1"); // 单板状态: 1-仓库中
						
						dataset.update(sbxx);
					}
				}
			}

			Atzchurukls rkls = null; // 入库流水

			Long rkdmxid = null; // 入库单明细ID

			Double bencijhsl = null; // 本次计划数量

			//-----生成入库流水-----
			for (int i=0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);
				
				rkdmxid = rkdmx.getId();
				
				wuliaoid = rkdmx.getWuliaoid();
				kuweiid = rkdmx.getKuweiid();
				meidwsl = rkdmx.getMeidwsl();
				
				sn = rkdmx.getSn();
				bencijhsl = rkdmx.getBencijhsl();
				rksl = rkdmx.getShuliang();
				cunfangwz = rkdmx.getCunfangwz();
				
				rkls = new Atzchurukls();
				
				rkls.setChurukjhdid(rkjhdid); // 入库计划单ID
				rkls.setChurukdid(rkdid); // 入库单ID
				rkls.setChurukdmxid(rkdmxid); // 入库单明细ID
				rkls.setChuruklx("2"); // 类型: 入库
				rkls.setChurukyy(churukyy); // 出库原因
				rkls.setXiangmuid(xiangmuid); // 项目ID
				rkls.setWuliaoid(wuliaoid); // 物料ID
				rkls.setKuweiid(kuweiid); // 库位ID
				rkls.setMeidwsl(meidwsl); // 每单位数量
				rkls.setSn(sn); // 序列号
				rkls.setBencijhsl(bencijhsl); // 本次计划数量
				rkls.setShuliang(rksl); // 数量
				rkls.setChurukr(rkr); // 经办人
				rkls.setRiqi(today); // 日期
				rkls.setCunfangwz(cunfangwz); // 存放位置
			  
				dataset.add(rkls);	
			}

			//-----维护入库计划是否完成字段-----
			Double wrksl = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "weicrksl", "atzchurukjhdid=" + rkjhdid));
			if (wrksl.doubleValue() <= 0)
				rkjhd.setShifouwc("1"); // 是否完成: 已完成
			else
				rkjhd.setShifouwc("2"); // 是否完成: 未完成

			dataset.update(rkjhd);

			String shifouwc = rkjhd.getShifouwc(); // 是否完成: 1-已完成  2-未完成

			//-----维护生产任务完成状态-----
			if ("1".equals(shifouwc)) {
				Long scrwid = rkjhd.getScrwdid(); // 生产任务ID
				
				if (scrwid != null) {
					Atzscrw scrw = (Atzscrw) dataset.getObject("Atzscrw", scrwid);
					if (scrw != null) {
						scrw.setShifouygb("1"); // 是否已关闭: 1-是  2-否
						
						dataset.update(scrw);
					}
				}
			}

			jianyandid = instance.getJianyandid();

			Atzjianyand jianyand = null; // 检验单

			if (jianyandid != null) {
				jianyand = (Atzjianyand) dataset.getObject(Atzjianyand.class, jianyandid);
			}

			//-----采购入库-----
			if ("4".equals(churukyy)) {
				Long caigouhtid = jianyand.getCaigouhtid(); // 采购合同ID
				Long daohuotzdid = jianyand.getDaohuotzdid(); // 到货通知单ID				
				if (caigouhtid == null || daohuotzdid == null) {
					message = "检验单信息有误, 请联系系统管理员！";					
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				Atzcaigouht cght = (Atzcaigouht) dataset.getObject(Atzcaigouht.class, caigouhtid); // 采购合同				
				Atzcaigouhtmx cghtmx = null; // 采购合同明细
				Atzcaigougz cggz = null; // 采购跟踪
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);					
					wuliaoid = rkdmx.getWuliaoid();					
					rksl = rkdmx.getShuliang(); // 入库数量
					
					//06 修改  
					//-----维护对应采购合同明细中的未入库数量-----
					//cghtmx = (Atzcaigouhtmx) dataset.getObjectByHql("Atzcaigouhtmx", "from Atzcaigouhtmx where caigouhtid=" + caigouhtid + " and wuliaoid=" + wuliaoid);		
					cghtmx = (Atzcaigouhtmx) dataset.getObjectByHql("Atzcaigouhtmx", "from Atzcaigouhtmx where id in (select caigouhtmxid from Atzjianyandmx where id="+rkdmx.getJianyandmxid()+")");
					
					
					cghtmx.setWeirksl((new BigDecimal(Double.toString(cghtmx.getWeirksl())).subtract(new BigDecimal(Double.toString(rksl)))).doubleValue());
					dataset.update(cghtmx);
					
					if (cghtmx.getWeirksl() < 0.0) {
						message = "采购入库已超出合同数量, 请联系系统管理员！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					//06 修改 
					//-----维护采购跟踪中的实际到货数量, 如果全部到货则关闭该采购跟踪-----
					//cggz = (Atzcaigougz) dataset.getObjectByHql("Atzcaigougz", "from Atzcaigougz where caigouhtid=" + caigouhtid + " and wuliaoid=" + wuliaoid);
					cggz = (Atzcaigougz) dataset.getObjectByHql("Atzcaigougz", "from Atzcaigougz where caigouhtid=" + caigouhtid + " and hetongmxid in (select caigouhtmxid from Atzjianyandmx where id="+rkdmx.getJianyandmxid()+") and wuliaoid="+ wuliaoid);
					
					if (cggz == null) {
						message = "没有对应的采购跟踪信息, 请联系系统管理员！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					if (cggz.getShijidhsl() == null)
						cggz.setShijidhsl(0.0);
					
					if (cggz.getSjcgsl() == null)
						cggz.setSjcgsl(0.0);
					
					cggz.setShijidhsl((new BigDecimal(Double.toString(cggz.getShijidhsl())).add(new BigDecimal(Double.toString(rksl)))).doubleValue()); // 实际到货数量
					cggz.setShijidhrq(today); // 实际到货日期
					
					if (cggz.getShijidhsl() >= cggz.getSjcgsl()) {
						cggz.setZhiliangwt("否"); // 是否质量问题: 否
						cggz.setDangqianzxzt("2"); // 当前执行状态: OK
					}

					dataset.update(cggz);
                  
                  //通知  采购需求申请人  06H
					//得到采购需求
					String cgxqsql="from Atzcaigoujh where danjulx='0' and " +
							" id in (select caigouxqid from Atzcaigouxqmx where " +
							"  atzcaigoujhid in (select caigoujh from Atzcaigoujhmx where " +
							"  id in(select caigoujhmxid from Atzcaigouhtmx where id="+cghtmx.getId()+")))";
										
					List<Atzcaigoujh> cgxqlist=dataset.getListByHql("Atzcaigoujh", cgxqsql);
					if(cgxqlist!=null && cgxqlist.size()>0){
						for(int j=0;j<cgxqlist.size();j++){
							Long tzrid=cgxqlist.get(i).getTianzhirid();//申请人
							String cgxqbh=cgxqlist.get(0).getBianhao();//采购需求编号
							//通过团队员工获取员工id
							Atztdyg tdyg=(Atztdyg) dataset.getObject(Atztdyg.class, tzrid);													
							String empid=""+tdyg.getYuangongid();
							String zhuti="到货通知:编号为"+cgxqbh+"的采购需求,编码为"+rkdmx.getWuliaobm()+"的物料已到货,到货数量为："+rksl;
							String neirong=zhuti;						
							logger.debug(empid+"-"+zhuti+"-"+neirong);
							//调用规则，启动提醒流程
							Map map = new HashMap();
							map.put("empid",empid);
							map.put("zhuti", zhuti);
							map.put("neirong", neirong);
							ReturnMsg re = (ReturnMsg) execAdjRule("A-提醒提交功能-接口-06H",map);
							logger.debug("提醒流程提交："+re.getKey()+"；提示信息："+re.getValue());
						}						
					}
                  
                  
				}
				
				//-----判断合同下所有明细的未入库数量, 如果总和为零, 则生成待付款信息-----
				Double htsum = Double.parseDouble(dataset.sum("Atzcaigouhtmx", "weirksl", "caigouhtid=" + caigouhtid));
				if (htsum.doubleValue() == 0.0) {
					//-生成待付款信息-
					List<Atzhetongfkjd> htfkjds = dataset.getListByHql("Atzhetongfkjd", "from Atzhetongfkjd where atzcaigouhtid=" + caigouhtid + " and fukuanlx='2'"); // 合同付款阶段List
					
					if (htfkjds != null && htfkjds.size() > 0) {
						DecimalFormat df = new DecimalFormat("###.0000");
						
						Atzhetongfkjd htfkjd = null; // 合同付款阶段
						String fukuantk = null; // 付款条款
						
						Atzdfukuanxx dfkxx = null; // 待付款信息
						
						Calendar rightNow = null;
						for (int i = 0; i < htfkjds.size(); i++) {
							htfkjd = htfkjds.get(i);
							
							fukuantk = htfkjd.getFukuantk();
							
							if (fukuantk == null) {
								message = "采购合同付款阶段中的付款条款为空, 无法入库！";
								
								returnMsg.set("NO", message);
								return returnMsg;
							}
							
							dfkxx = new Atzdfukuanxx();
							
							dfkxx.setCaigouhtid(caigouhtid); // 采购合同ID
							dfkxx.setGongyings(cght.getGongyings()); // 供应商
							dfkxx.setFukuanlx(htfkjd.getFukuanlx()); // 付款类型
							dfkxx.setFukuantk(fukuantk); // 付款条款
							dfkxx.setBizhongid(cght.getBizhongid()); // 币种ID
							
							//-根据付款条款, 计算出付款时间和付款金额-
							rightNow = Calendar.getInstance();
							
							if ("2".equals(fukuantk)) {
								rightNow.add(Calendar.DAY_OF_MONTH, 30);
							} else if ("3".equals(fukuantk)) {
								rightNow.add(Calendar.DAY_OF_MONTH, 45);
							} else if ("4".equals(fukuantk)) {
								rightNow.add(Calendar.DAY_OF_MONTH, 60);
							} else if ("5".equals(fukuantk)) {
								rightNow.add(Calendar.DAY_OF_MONTH, 80);
							} else if ("6".equals(fukuantk)) {
								rightNow.add(Calendar.DAY_OF_MONTH, 90);
							}
							
							dfkxx.setFukuansj(rightNow.getTime()); // 付款时间
							dfkxx.setFukuanje(Double.parseDouble(df.format(cght.getHetongzj()*htfkjd.getFukuanbl()).toString())); // 付款金额

							dfkxx.setShifouzx("2"); // 是否执行: 否

							dataset.add(dfkxx);
						}
					}
					
					cght.setZhixingzt("3"); // 执行状态: 执行完成
						
					dataset.update(cght);
				}
				
				Long cgjhid = rkjhd.getCaigoujhid(); // 采购计划ID
				
				Atzcaigoujh cgjh = (Atzcaigoujh) dataset.getObject(Atzcaigoujh.class, cgjhid); // 采购计划
				
				//-----若入库计划完成, 则关闭对应的采购计划单-----
				if ("1".equals(shifouwc)) {
					cgjh.setZhixingzt("3"); // 执行状态: 执行完成
					
					dataset.update(cgjh);
				}
				
				//-----当采购计划对应的采购合同都关闭时, 将采购计划的执行状态改为执行完成-----
				List<Atzcaigoujhmx> caigoujhmxs = dataset.getList("Atzcaigoujhmx", "caigoujh=" + cgjhid); // 采购计划明细List
				
				Atzcaigoujhmx caigoujhmx = null; // 采购计划明细
				
				String shifouyzx = null; // 是否已执行: 1-是  2-否
				
				boolean flag = true;
				if (caigoujhmxs != null && caigoujhmxs.size() > 0) {
					for (int i = 0; i < caigoujhmxs.size(); i++) {
						caigoujhmx = caigoujhmxs.get(i);
						
						shifouyzx = caigoujhmx.getShifouyzx();
						
						if (!"1".equals(shifouyzx)) {
							flag = false;
							break;
						}
					}
				}
				
				if ( flag ) {
					//06H 修改
					//List<Atzcaigouht> caigouhts = dataset.getList("Atzcaigouht", "caigoujhid=" + cgjhid); // 采购合同List
					String cghtsql="id in (select caigouhtid from Atzcaigouhtmx where caigoujhmxid in (select id from Atzcaigoujhmx where caigoujh="+cgjhid+"))";
					List<Atzcaigouht> caigouhts = dataset.getList("Atzcaigouht",cghtsql); // 采购合同List
					
					String zhixingzt = null; // 执行状态: 1-未执行  2-执行中  3-执行完成
					if (caigouhts != null && caigouhts.size() > 0) {
						for (int j = 0; j < caigouhts.size(); j++) {
							cght = caigouhts.get(j);							
							zhixingzt = cght.getZhixingzt();							
							if (!"3".equals(zhixingzt)) {
								flag = false;
								break;
							}
						}
					}
				}
				
				if ( flag ) {
					cgjh.setZhixingzt("3"); // 执行状态: 执行完成 
					
					dataset.update(cgjh);
					
					List<Atzchurukjhd> jhds = dataset.getList("Atzchurukjhd", "caigoujhid=" + cgjhid);
					
					Atzchurukjhd jhd = null; // 入库计划
					
					if (jhds != null && jhds.size() > 0) {
						for (int i = 0; i < jhds.size(); i++) {
							jhd = jhds.get(i);
							
							jhd.setShifouwc("1"); // 是否完成: 是
							
							dataset.update(jhd);
						}
					}
				}
			}

			//-----维护到期日期-----
			Date daoqirq = null; // 到期日期

			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);
				
				daoqirq = rkdmx.getDaoqirq();
				
				// 采购入库时, 到期日期不能为空
				/*if ("4".equals(churukyy)) {
					if (daoqirq == null) {
						message = "采购入库时, 到期日期必须维护！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}*/
				
				if (daoqirq != null) {
					wuliaoid = rkdmx.getWuliaoid();
				
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				
					wljcxx.setDaoqirq(daoqirq); // 到期日期
						
					dataset.update(wljcxx);
				}
			}

			paramMap.put("danjulx", "17"); // 设置编码规则

			String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);

			if ("流水号溢出".equals(rValue))
				message = "入库单流水号溢出！";
			else if ("Error".equals(rValue))
				message = "生成入库单编号有误, 请联系系统管理员！";

			if (message != null) {
				returnMsg.set("NO", message);
				return returnMsg;
			}

			instance.setBianhao(rValue); // 编号
			instance.setChurukrq(today); // 入库日期
			instance.setShifouzx("1"); // 是否执行: 是

			dataset.update(instance);

			//-----根据检验单入库时, 如果都已经入库, 则关闭检验单-----
			if (jianyandid != null) {
				Double zrksl = Double.parseDouble(dataset.sum("Atzchurukdmx", "shuliang", "atzchurukdid in (select id from Atzchurukd where jianyandid=" + jianyandid + " and shifouzx='1')")); // 总入库数量
				Double zshidiansl = Double.parseDouble(dataset.sum("Atzjianyandmx", "shidiansl", "atzjianyandid=" + jianyandid + " and jianyanjg!='2'")); // 总实点数量
				
				if (zrksl.doubleValue() >= zshidiansl.doubleValue()) {
					jianyand.setJianyandzt("4"); // 检验单状态: 入库完成
					
					dataset.update(jianyand);
				}
			}

			String ckr = null; // 借出领用人

			//-----借用领用信息维护-----
			if ("38".equals(churukyy) || "40".equals(churukyy) || "42".equals(churukyy) || "34".equals(churukyy) || "36".equals(churukyy) || "16".equals(churukyy) || "46".equals(churukyy) || "48".equals(churukyy) || "54".equals(churukyy) || "56".equals(churukyy)) {
				String jylyhql = null;
				
				Atzjylyqingdan jylyqingdan = null; // 借用领用清单
				
				for (int i=0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
					
					wuliaoid = rkdmx.getWuliaoid();
					meidwsl = rkdmx.getMeidwsl();
					
					sn = rkdmx.getSn();
					rksl = rkdmx.getShuliang();
					
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
							ckr = jylyqingdan.getChurukr();
							
							if (!rkr.equals(ckr)) {
								message = "第 " + (i+1) + " 条入库单明细的 SN 借出领用人是 (" + ckr + "), 请查看借用领用信息！";
								
								returnMsg.set("NO", message);
								return returnMsg;
							}
						
							jylyqingdan.setYuanyin(churukyy); // 原因
							//jylyqingdan.setRiqi(today); // 日期
							jylyqingdan.setGhzhuangt("1"); // 归还状态: 已归还
							//维护入库单计划编号
							jylyqingdan.setRkjhdh(rkjhd.getBianhao());
							dataset.update(jylyqingdan);
						} else {
							jylyqingdan = new Atzjylyqingdan();
							
							jylyqingdan.setWuliaoid(wuliaoid); // 物料ID
							jylyqingdan.setMeidwsl(meidwsl); // 每单位数量
							jylyqingdan.setSn(sn); // 序列号
							jylyqingdan.setShuliang(1.0); // 数量
							jylyqingdan.setYuanyin(churukyy); // 原因 
							jylyqingdan.setChurukr(rkr); // 经办人
							jylyqingdan.setRiqi(today); // 日期
							jylyqingdan.setGhzhuangt("1"); // 归还状态: 已归还
							//维护入库单计划编号
							jylyqingdan.setRkjhdh(rkjhd.getBianhao());
							dataset.add(jylyqingdan);
						}
					} else {
						if ("38".equals(churukyy)) {
							jylyhql += " and yuanyin='37' and churukr='" + rkr + "'";
						} else if ("40".equals(churukyy)) {
							jylyhql += " and yuanyin='39' and churukr='" + rkr + "'";
						} else if ("42".equals(churukyy)) {
							jylyhql += " and yuanyin='41' and churukr='" + rkr + "'";
						} else if ("34".equals(churukyy)) {
							jylyhql += " and yuanyin='33' and churukr='" + rkr + "'";
						} else if ("36".equals(churukyy)) {
							jylyhql += " and yuanyin='35' and churukr='" + rkr + "'";
						} else if ("52".equals(churukyy)) {
							jylyhql += " and yuanyin='51' and churukr='" + rkr + "'";
						}
				
						jylyqingdan = (Atzjylyqingdan) dataset.getObjectByHql("Atzjylyqingdan", jylyhql);
						
						if (jylyqingdan == null) {
							message = "归还人 (" + rkr + ") 无借用领用信息, 请查看借用领用清单！";
							
							returnMsg.set("NO", message);
							return returnMsg;
						}
						
						if (jylyqingdan != null) {
							jylyqingdan.setShuliang(jylyqingdan.getShuliang() - rksl); // 数量
							jylyqingdan.setRiqi(today); // 日期
							//维护入库单计划编号
							jylyqingdan.setRkjhdh(rkjhd.getBianhao());
							dataset.update(jylyqingdan);
							
							if (jylyqingdan.getShuliang().doubleValue() < 0) {
								message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 的归还人 (" + rkr + ") 归还数已超过借用领用数！";
								
								returnMsg.set("NO", message);
								return returnMsg;
							}
							
							if (jylyqingdan.getShuliang().doubleValue() == 0) {
								dataset.delete(jylyqingdan);
							}
						}
					}
				}
			}

			//-----维护研发试制实际入库日-----
			Long scjhid = rkjhd.getScjhid(); // 生产计划ID

			if (scjhid != null) {
				Atzscjhmx scjhmx = null; // 生产计划明细
				Long yfszid = null; // 研发试制ID
				Atzyanfasz yanfasz = null; // 研发试制
				for (int i = 0; i < rkdmxs.size(); i++) {
					rkdmx = rkdmxs.get(i);
					
					wuliaoid = rkdmx.getWuliaoid();
					
					scjhmx = (Atzscjhmx) dataset.getObjectByHql("Atzscjhmx", "from Atzscjhmx where atzscjhid=" + scjhid + " and wuliaoid=" + wuliaoid + " and yfszid is not null");
					
					if (scjhmx != null) {
						yfszid = scjhmx.getYfszid();
						
						yanfasz = (Atzyanfasz) dataset.getObject(Atzyanfasz.class, yfszid);
						
						if (yanfasz != null) {
							yanfasz.setShijirkr(today); // 实际入库日
							
							dataset.update(yanfasz);
						}
					}
				}
			}


//根据sn来增加库存明细，生成设备信息  06H
			String mxsql=null;
			List<Atzshebeixx> sbxxlist=null;
			for (int i = 0; i < rkdmxs.size(); i++) {
				rkdmx = rkdmxs.get(i);					
				wuliaoid = rkdmx.getWuliaoid();
				kuweiid=rkdmx.getKuweiid();
				sn = rkdmx.getSn();
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				
				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
				
				if (meidwsl != null)
					hql += " and meidwsl=" + meidwsl;	
				else
					hql += " and meidwsl is null";
					
				pthql = hql + " and kucunlx='1'";
				zxhql = hql + " and kucunlx='2'";
				
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				zxkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", zxhql);
				if(ptkucun==null){
					message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的库存信息有误！";					
					returnMsg.set("NO", message);
					return returnMsg;
				}				
				if(wljcxx!=null && "1".equals(wljcxx.getSngl())){
					if(sn!=null && !"".equals(sn)){	
						//生成设备信息
						if("4".equals(churukyy)){
							//判断sn是否已存在设备信息中
							sbxxlist = dataset.getList("Atzshebeixx", "sn='" + sn.trim() + "'"); 
							if (sbxxlist!=null && sbxxlist.size()>0) {
								message = "第 " + (i+1) + " 条入库单明细sn已存在！";				
								returnMsg.set("NO", message);
								return returnMsg;
							}
							Atzshebeixx newsbxx=new Atzshebeixx();
							newsbxx.setSn(sn.trim());
							newsbxx.setWuliaoid(wuliaoid);
							newsbxx.setLurur("admin");
							newsbxx.setLururq(new Date());
							newsbxx.setShifouzk("1");//仓库中
							newsbxx.setBeizhu("采购入库");
							dataset.add(newsbxx);
						}
						//如果是物料入在线则删除在线库存下的明细
						if ("25".equals(churukyy)){
							if (zxkucun == null) {
								message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 没有对应的在线库存信息！";								
								returnMsg.set("NO", message);
								return returnMsg;
							}
							mxsql="from Atzkucunmx where kucunid="+zxkucun.getId()+" and wuliaoid="+wuliaoid+" and sn='"+sn.trim()+"'";
							Atzkucunmx nkcmx= (Atzkucunmx) dataset.getObjectByHql("Atzkucunmx", mxsql);
							if(nkcmx!=null)dataset.delete(nkcmx);
						}
						//普通库存新增明细
						Atzkucunmx kcmx=new Atzkucunmx();
						kcmx.setKucunid(ptkucun.getId());
						kcmx.setSn(sn.trim());
						kcmx.setWuliaoid(wuliaoid);
						kcmx.setShuliang(1d);
						kcmx.setWuliaozt("1");//正常
						dataset.add(kcmx);		
					}else{
						message = "第 " + (i+1) + " 条入库单明细物料 (" + wuliaobm + ") 是sn管理,请输入sn号！";							
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}
			}

/**维保更换出库完成自动更新现场设备配置信息（前提：出入库均已完成）
*作者:06
*
*/

if("6".equals(churukyy)){
	Atzchurukjhd rkjhd06=(Atzchurukjhd)dataset.getObject(Atzchurukjhd.class,instance.getChurukjhdid());
	boolean flag06=false;
	if(rkjhd06!=null&&"1".equals(rkjhd06.getShifouwc())){
		Atzweibaosbsqd rkwbd06=(Atzweibaosbsqd)dataset.getObject(Atzweibaosbsqd.class,rkjhd06.getWeibaosqdid());
		if(rkwbd06!=null){  
          
					List<Atzchurukjhd> ckjhdList06=dataset.getListByHql("Atzchurukjhd"," from Atzchurukjhd where weibaosqdid  in (select id from Atzweibaosbsqd where bianhao='"+rkwbd06.getBianhao().substring(0,rkwbd06.getBianhao().length()-1)+"')");
					Atzchurukjhd  jhd06=null;
					if(ckjhdList06!=null&&ckjhdList06.size()>0){
							jhd06=ckjhdList06.get(0);
                      
						}
					
						if(jhd06!=null&&"1".equals(jhd06.getShifouwc())&&"5".equals(jhd06.getChurukyy())){
							flag06=true;
                          
						}else{
							flag06=false;
							}

						if(flag06){
							
							//根据出库流水和入库流水自动更新设备配置信息.以出库做为循环条件，没出的记录无需更新
							List<Atzchurukls> cklsList06=dataset.getListByHql("Atzchurukls"," from Atzchurukls where churukjhdid="+jhd06.getId());
							List<Atzchurukls> rklsList06=dataset.getListByHql("Atzchurukls"," from Atzchurukls where churukjhdid="+rkjhd06.getId());
							for(int i06=0;i06<cklsList06.size();i06++){
                              
								Atzchurukls ckls06=cklsList06.get(i06);
								if(ckls06!=null&&ckls06.getSn()!=null){
                                  
									if(rklsList06!=null&&rklsList06.size()>i06){
                                      
										Atzchurukls rkls06=rklsList06.get(i06);
										if(rkls06!=null&&rkls06.getSn()!=null){
                                          
											//执行更新
											String update06="update Atzshebeipzxx set wuliaosn    = '"+ckls06.getSn()+"',wuliaoid="+ckls06.getWuliaoid()+" where  wuliaosn='"+rkls06.getSn()+"'";
											dataset.batchUpdate("Atzshebeipzxx",update06);
											}
										
										}
									
									}
								
								}
						}
			
			
			}
		
		}
	
	}
/**维修入库完成后，自动产生测试任务单
*作者:12
*  测试任务的任务接受人？
* 开始
*/

if("58".equals(churukyy)){
	//维修完成入库，新增一条测试生产任务。

				// 首先根据单据类型生成单据编号
				paramMap.put("danjulx", "7");// 7为生产任务

				rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset,
						request, paramMap);
				logger.info("~~~A-生产任务-新增（前置）-08~~~rValue =" + rValue);
				if(rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
					returnMsg.set("NO", "请先设置编码规则");
					return returnMsg;
				} else if("Error".equals(rValue)) {
					returnMsg.set("NO", "生成编号时出错了，请联系管理员！");
					return returnMsg;
				} else {
					Atzscrw scrw = new Atzscrw(); // 新增
					scrw.setBianhao(rValue);// 编号
					scrw.setLinshibh(rValue);// 临时编号
					Object obj = request.getSession().getAttribute("employeeName");
					String str = obj == null ? "admin" : String.valueOf(obj);
					scrw.setJiagongdw("测试维修组");
					scrw.setScrwdlx("2");//任务类型：测试任务
					scrw.setShenhezt("1");//审核状态 未提交
					scrw.setDanjusc("2");//单据生成  上级单据
					scrw.setShifouygb("2");//是否已关闭 否
					scrw.setRwjsr(null);//任务接受人未定？
					scrw.setBeizhu("");
					scrw.setLurur(str);
					scrw.setLururq(today);
					
					dataset.add(scrw);
					
					List<Atzchurukdmx> mxs = dataset.getList("Atzchurukdmx","atzchurukdid="+instance.getId());
					for(int i12 = 0; i12 < mxs.size(); i12++) {
						Atzchurukdmx mx = mxs.get(i12);
						Atzscrwmx scrwmx = new Atzscrwmx();
						scrwmx.setAtzscrwid(scrw.getId());
						scrwmx.setXiangmuid(instance.getXiangmuid());
						scrwmx.setWuliaoid(mx.getWuliaoid());
						scrwmx.setMeidwsl(mx.getMeidwsl());
						scrwmx.setShuliang(mx.getShuliang());
						scrwmx.setWeisjsl(mx.getShuliang());
						scrwmx.setJihuawcrq(today);
						scrwmx.setLururq(today);
						dataset.add(scrwmx);
					}
				}
			}
//维修入库完成后，自动产生测试任务单 
//结束
			message = "【入库单】执行完成";

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
