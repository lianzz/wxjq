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
public class 出库计划_提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(出库计划_提交.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukjhd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-出库计划-提交-10 (2014172)
			 * 2012-11-09
			 */
			//判断执行方是否填写

			if("5".equals(instance.getChurukyy())||"6".equals(instance.getChurukyy())||"18".equals(instance.getChurukyy())||"3".equals(instance.getChurukyy())||"15".equals(instance.getChurukyy())||"16".equals(instance.getChurukyy())||"17".equals(instance.getChurukyy())||"53".equals(instance.getChurukyy())){
				if(instance.getZhixingf()==null||"".equals(instance.getZhixingf())){
					returnMsg.set("NO","针对合同发货，合同借用，维保相关单据，出入库计划执行方必须填写才能提交！");
					return returnMsg;
				}

			}else{
				instance.setZhixingf("0");
			}
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String renwuzt = instance.getRenwuzt(); // 任务主题
			if (renwuzt == null) {
				message = "出库计划任务主题不能为空, 请维护！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String churukyy = instance.getChurukyy(); // 出库原因
			if (churukyy == null) {
				message = "出库计划出库原因不能为空, 请维护！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String danjuzt = instance.getDanjuzt(); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
			if (!"1".equals(danjuzt)) {
				message = "只有未提交的出库计划才可提交！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String jihuay = instance.getZhidanr(); // 计划员
			if (jihuay == null || "admin".equals(jihuay))
				jihuay = employeeName;
				
			if (!employeeName.equals(jihuay)) {
				message = "只有计划员才能提交出库计划！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			//-----判断生产任务是否审核通过-----
			Long scrwid = instance.getScrwdid(); // 生产任务ID
			if (scrwid != null) {
				Atzscrw scrw = (Atzscrw) dataset.getObject(Atzscrw.class, scrwid);
				
				String scrwdlx = scrw.getScrwdlx(); // 生产任务单类型: 1-加工任务  2-测试任务  3-维修任务  4-更换/升级  5-复测任务
				if (!"1".equals(scrwdlx)) {
					String shenhezt = scrw.getShenhezt(); // 审核状态: 1-未提交  2-审核中  3-审核已通过
					if (!"3".equals(shenhezt)) {
						message = "出库计划对应的生产任务审核未通过, 无法提交！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}
			}

			Long crkjhdid = instance.getId(); // 出库计划单ID
			String shifoufsh = instance.getShifoufsh(); // 是否反审核

			Long xiangmuid = instance.getXiangmuid(); // 项目ID
			if (xiangmuid == null) {
				message = "出库计划项目不能为空, 请维护！";
				
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			List<Atzchurukjhdmx> crkjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + crkjhdid + " order by wuliaobm,id ASC"); // 出库计划明细List

			if (crkjhdmxs == null || crkjhdmxs.isEmpty()) {
				message = "出库计划没有明细, 请检查！";
				
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			Atzchurukjhdmx crkjhdmx = null; // 出库计划明细

			Long wuliaoid = null; // 物料ID
			Long kuweiid = null; // 库位ID
			Double meidwsl = null; // 每单位数量

			Atzwuliaojcxx wljcxx = null; // 物料基础信息

			String wuliaobm = null; // 物料编码
			String shifouqy = null; // 是否启用: 1-是  2-否

			String condition = null;

			List<Atzchurukjhdmx> xtcrkjhdmxs = null; // 相同的出库计划明细

			for (int i = 0; i < crkjhdmxs.size(); i++) {
				crkjhdmx = crkjhdmxs.get(i);
				
				wuliaoid = crkjhdmx.getWuliaoid();
				if (wuliaoid == null) {
					message = "第 " + (i+1) + " 条出库计划明细物料不能为空, 请维护！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				
				wuliaobm = wljcxx.getWuliaobm();
				shifouqy = wljcxx.getShifouqy();
				//if ("2".equals(shifouqy)) {
				//	message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 未启用, 请检查！";
					
				//	returnMsg.set("NO", message);
			    //    return returnMsg;
				//}
				
				kuweiid = crkjhdmx.getKuweiid();
				if (kuweiid == null) {
					message = "第 " + (i+1) + " 条出库计划明细库位不能为空, 请维护！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				meidwsl = crkjhdmx.getMeidwsl();
				
				condition = "atzchurukjhdid=" + crkjhdid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
				
				if (meidwsl != null)
					condition += " and meidwsl=" + meidwsl;
				else
					condition += " and meidwsl is null";
					
				xtcrkjhdmxs = dataset.getList("Atzchurukjhdmx", condition);
				
				if (xtcrkjhdmxs != null && xtcrkjhdmxs.size() > 1) {
					message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 有多条明细 (物料、库位、每单位数量相同), 需要合并才能提交！";
						
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			List<Atzchurukjhdmx> kwbtcrkjhdmxs = null; // 库位不同的出库计划明细 (物料和每单位数量相同)

			//-----老化、测试、维修时，同一物料，同一每单位数量, 只能从同一库位出-----
			if ("5".equals(renwuzt)) {
				for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					wuliaoid = crkjhdmx.getWuliaoid();
					wuliaobm = crkjhdmx.getWuliaobm();
					meidwsl = crkjhdmx.getMeidwsl();
					
					condition = "atzchurukjhdid=" + crkjhdid + " and wuliaoid=" + wuliaoid;
					
					if (meidwsl != null)
						condition += " and meidwsl=" + meidwsl;
					else
						condition += " and meidwsl is null";
					
					kwbtcrkjhdmxs = dataset.getList("Atzchurukjhdmx", condition);
					
					if (kwbtcrkjhdmxs != null && kwbtcrkjhdmxs.size() > 1) {
						message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 只能从相同库位出库！";
							
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}
			}

			//-----合同发货判断-----
			if ("3".equals(churukyy) || "53".equals(churukyy)) {
				Long xiaoshoubmid = null; // 销售编码ID

				Long fahuotzdid = instance.getFahuotzdid(); // 发货通知单ID
				
				if (fahuotzdid == null) {
					message = "发货通知单不存在, 请联系系统管理员！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				/*for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					wuliaoid = crkjhdmx.getWuliaoid();
					
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
					
					wuliaobm = wljcxx.getWuliaobm();
					xiaoshoubmid = wljcxx.getXiaoshoubmid();
					
					if (xiaoshoubmid == null) {
						message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 的销售编码不存在, 请设置！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}*/
			}

			Double initshuliang = null; // 计划数量

			//-----维护调整后计划数量-----
			for (int i = 0; i < crkjhdmxs.size(); i++) {
				crkjhdmx = crkjhdmxs.get(i);
				
				initshuliang = crkjhdmx.getInitshuliang();
				
				crkjhdmx.setShuliang(initshuliang); // 调整后计划数量
				
				dataset.update(crkjhdmx);
			}

			String hql = null;

			String pthql = null; // 普通hql
			String zxhql = null; // 在线hql

			Atzkucun ptkucun = null; // 普通库存
			Atzkucun zxkucun = null; // 在线库存

			Atzzhanyongjl zhanyongjl = null; // 占用记录

			Double shuliang = null; // 调整后计划数量

			Long crkjhdmxid = null; // 出库计划明细ID

			Double kyl = null; // 可用量
			Double ptl = null; // 普通量

			String errorsA = ""; // 库存不存在
			String errorsB = ""; // 普通库存不足
			String errorsC = ""; // 可用量不足

			//-----物料入在线-----
			if ("24".equals(churukyy)) {
				for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					shuliang = crkjhdmx.getShuliang();
					
					wuliaoid = crkjhdmx.getWuliaoid();
					kuweiid = crkjhdmx.getKuweiid();
					meidwsl = crkjhdmx.getMeidwsl();
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null) 
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					pthql = hql + " and kucunlx='1'";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					if (ptkucun == null) {
						if (errorsA.equals(""))
							errorsA += (i+1);
						else
							errorsA += ("," + (i+1));
							
						continue;
					}
					
					ptl = ptkucun.getKucunzl();
					if (shuliang.doubleValue() > ptl.doubleValue()) {
						if (errorsB.equals(""))
							errorsB += (i+1);
						else
							errorsB += ("," + (i+1));
					}
				}
				
				if (!"".equals(errorsA)) {
					message = "在所选择的项目和库位下, 第 " + errorsA + " 条出库计划明细物料库存信息不存在！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				if (!"".equals(errorsB)) {
					message = "在所选择的项目和库位下, 第 " + errorsB + " 条出库计划明细物料实际库存不足, 无法入在线！";
					
			        returnMsg.set("NO", message);
			        return returnMsg;
				}
			}

			//-----非物料入在线-----
			if (!"24".equals(churukyy)&&!"1".equals(instance.getZhixingf())) {
				for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					shuliang = crkjhdmx.getShuliang();
				
					wuliaoid = crkjhdmx.getWuliaoid();
					kuweiid = crkjhdmx.getKuweiid();
					meidwsl = crkjhdmx.getMeidwsl();		
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null) 
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					pthql = hql + " and kucunlx='1'";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					if (ptkucun == null) {
						if (errorsA.equals(""))
							errorsA += (i+1);
						else
							errorsA += ("," + (i+1));
							
						continue;
					}
					
					kyl = ptkucun.getKeyongl();
					if (shuliang.doubleValue() > kyl.doubleValue()) {
						if (errorsC.equals("")) errorsC += (i+1);
						else errorsC += ("," + (i+1));
					}
					
					//-----非生产订单领料出库-----
					if (!"1".equals(churukyy)) {
						ptl = ptkucun.getKucunzl();
						if (shuliang.doubleValue() > ptl.doubleValue()) {
							if (errorsB.equals(""))
								errorsB += (i+1);
							else
								errorsB += ("," + (i+1));
						}
					}
				}
				
				if (!"".equals(errorsA)) {
					message = "在所选择的项目和库位下, 第 " + errorsA + " 条出库计划明细物料库存信息不存在！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				if (!"".equals(errorsC)) {
					message = "在所选择的项目和库位下, 第 " + errorsC + " 条出库计划明细物料库存可用量不足, 无法提交！";
					
			        returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				if (!"".equals(errorsB)) {
					message = "在所选择的项目和库位下, 第 " + errorsB + " 条出库计划明细物料库存实际量不足, 无法提交！";
					
			        returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				//-----减少库存可用量, 生成占用记录-----
				for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					crkjhdmxid = crkjhdmx.getId();
					shuliang = crkjhdmx.getShuliang();
				
					wuliaoid = crkjhdmx.getWuliaoid();
					kuweiid = crkjhdmx.getKuweiid();
					meidwsl = crkjhdmx.getMeidwsl();		
					
					hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
					
					if (meidwsl != null) 
						hql += " and meidwsl=" + meidwsl;
					else
						hql += " and meidwsl is null";
					
					pthql = hql + " and kucunlx='1'";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					kyl = ptkucun.getKeyongl();
					
					zhanyongjl = new Atzzhanyongjl(); // 占用记录
				
					zhanyongjl.setCrkjhid(crkjhdid); // 出库计划ID 
					zhanyongjl.setCrkjhmxid(crkjhdmxid); // 出库计划明细ID
					zhanyongjl.setWuliaoid(wuliaoid); // 物料ID
					zhanyongjl.setXiangmuid(xiangmuid); // 项目ID 
					zhanyongjl.setKuweiid(kuweiid); // 库位ID
					zhanyongjl.setMeidwsl(meidwsl); // 每单位数量
					zhanyongjl.setKucunlx("1"); // 占用类型: 普通库存
					zhanyongjl.setChurukyy(churukyy); // 占用原因
					zhanyongjl.setZhanyongl(shuliang); // 占用量 
					zhanyongjl.setCaozuor(employeeName); // 占用人
					zhanyongjl.setCaozuorq(new Date()); // 占用日期

					dataset.add(zhanyongjl);
					
					ptkucun.setKeyongl((new BigDecimal(Double.toString(kyl)).subtract(new BigDecimal(Double.toString(shuliang))).doubleValue()));
					dataset.update(ptkucun);
					
					crkjhdmx.setWeicrksl(null); // 未出入库数量

					dataset.update(crkjhdmx);
				}
			}

			//-----启动流程-----
			Map map808 = new HashMap();

			Long result808 = WorkflowAppHelper.newProcessInstance(1754877L, map808, request, context.getId());

			if (result808.longValue() <= 0) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("出库计划ID: " + crkjhdid);
				logger.error("出库计划提交失败");
				
				message = "【出库计划】提交失败, 请联系系统管理员！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String bianhao = instance.getBianhao();
			String linshibh = instance.getLinshibh();

			if (linshibh == null || "".equals(linshibh.trim())) {
				instance.setLinshibh(bianhao);
			}

			instance.setCrkjhtjlx("1"); // 提交类型: 正常提交 
			instance.setDanjuzt("2"); // 单据状态: 审核中
			instance.setZhidanr(employeeName); // 计划员
			instance.setShifouwc("2"); // 是否完成: 否

			if (shifoufsh == null)
				instance.setShifoufsh("2"); // 是否反审核: 否
				
			dataset.update(instance);

			message = "【出库计划】提交成功";
				
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
