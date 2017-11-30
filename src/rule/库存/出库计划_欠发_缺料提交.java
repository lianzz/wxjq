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
public class 出库计划_欠发_缺料提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(出库计划_欠发_缺料提交.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukjhd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			//出库计划-欠发/缺料提交
			/**
			 * A-出库计划-欠发/缺料提交-10 (1835035)
			 * 2012-12-25
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人
			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String danjuzt = instance.getDanjuzt(); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
			if (!"1".equals(danjuzt)) {
				message = "只有未提交的出库计划才可欠发/缺料提交！";
				
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
						message = "对应的生产任务审核未通过, 无法提交！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}
			}

			Long ckjhdid = instance.getId(); // 出库计划单ID
			String shifoufsh = instance.getShifoufsh(); // 是否反审核

			Long xiangmuid = instance.getXiangmuid(); // 项目ID
			if (xiangmuid == null) {
				message = "出库计划项目不能为空, 请维护！";
				
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			List<Atzchurukjhdmx> ckjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + ckjhdid + " order by wuliaobm,id ASC"); // 出库计划明细List

			if (ckjhdmxs == null || ckjhdmxs.isEmpty()) {
				message = "出库计划没有明细, 请检查！";
				
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			Atzchurukjhdmx ckjhdmx = null; // 出库计划明细

			Long wuliaoid = null; // 物料ID
			Long kuweiid = null; // 库位ID
			Double meidwsl = null; // 每单位数量

			Atzwuliaojcxx wljcxx = null; // 物料基础信息

			String wuliaobm = null; // 物料编码
			String shifouqy = null; // 是否启用: 1-是  2-否

			String condition = null;

			List<Atzchurukjhdmx> xtckjhdmxs = null; // 相同的出库计划明细

			for (int i = 0; i < ckjhdmxs.size(); i++) {
				ckjhdmx = ckjhdmxs.get(i);
				
				wuliaoid = ckjhdmx.getWuliaoid();
				if (wuliaoid == null) {
					message = "第 " + (i+1) + " 条出库计划明细物料不能为空, 请维护！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				
				wuliaobm = wljcxx.getWuliaobm();
				shifouqy = wljcxx.getShifouqy();
				if ("2".equals(shifouqy)) {
					message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 未启用, 请检查！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				kuweiid = ckjhdmx.getKuweiid();
				if (kuweiid == null) {
					message = "第 " + (i+1) + " 条出库计划明细库位不能为空, 请维护！";
					
					returnMsg.set("NO", message);
			        return returnMsg;
				}
				
				meidwsl = ckjhdmx.getMeidwsl();
				
				condition = "atzchurukjhdid=" + ckjhdid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
				
				if (meidwsl != null)
					condition += " and meidwsl=" + meidwsl;
				else
					condition += " and meidwsl is null";
					
				xtckjhdmxs = dataset.getList("Atzchurukjhdmx", condition);
				
				if (xtckjhdmxs != null && xtckjhdmxs.size() > 1) {
					message = "第 " + (i+1) + " 条出库计划明细物料 (" + wuliaobm + ") 有多条明细 ( 物料、库位、每单位数量相同 ), 需要合并才能提交！";
						
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			String churukyy = instance.getChurukyy(); // 出库原因

			//-----合同发货判断-----
			if ("3".equals(churukyy) || "53".equals(churukyy)) {
				Long xiaoshoubmid = null; // 销售编码ID

				Long fahuotzdid = instance.getFahuotzdid(); // 发货通知单ID
				
				if (fahuotzdid == null) {
					message = "发货通知单不存在, 请联系系统管理员！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				/*for (int i = 0; i < ckjhdmxs.size(); i++) {
					ckjhdmx = ckjhdmxs.get(i);
					
					wuliaoid = ckjhdmx.getWuliaoid();
					
					wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
					
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
			for (int i = 0; i < ckjhdmxs.size(); i++) {
				ckjhdmx = ckjhdmxs.get(i);
				
				initshuliang = ckjhdmx.getInitshuliang();
				
				ckjhdmx.setShuliang(initshuliang); // 调整后计划数量
				
				dataset.update(ckjhdmx);
			}

			String hql = null;
			String pthql = null; // 普通hql

			Atzkucun ptkucun = null; // 普通库存

			Atzzhanyongjl zhanyongjl = null; // 占用记录

			Double shuliang = null; // 计划数量

			Long ckjhdmxid = null; // 出库计划明细ID

			for (int i = 0; i < ckjhdmxs.size(); i++) {
				ckjhdmx = ckjhdmxs.get(i);
				
				ckjhdmxid = ckjhdmx.getId();
				shuliang = ckjhdmx.getShuliang();

				wuliaoid = ckjhdmx.getWuliaoid();
				kuweiid = ckjhdmx.getKuweiid();
				meidwsl = ckjhdmx.getMeidwsl();		
				
				hql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid;
				
				if (meidwsl != null) 
					hql += " and meidwsl=" + meidwsl;
				else
					hql += " and meidwsl is null";
				
				pthql = hql + " and kucunlx='1'";
				
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				
				zhanyongjl = new Atzzhanyongjl(); // 占用记录
				
				zhanyongjl.setCrkjhid(ckjhdid); // 出库计划ID 
				zhanyongjl.setCrkjhmxid(ckjhdmxid); // 出库计划明细ID
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
				
				if (ptkucun != null) {
					ptkucun.setKeyongl((new BigDecimal(Double.toString(ptkucun.getKeyongl())).subtract(new BigDecimal(Double.toString(shuliang))).doubleValue()));
				} else {
					ptkucun = new Atzkucun();
					
					ptkucun.setKucunlx("1"); // 库存类型: 普通库存
					ptkucun.setXiangmuid(xiangmuid);
					ptkucun.setKuweiid(kuweiid);
					ptkucun.setWuliaoid(wuliaoid);
					ptkucun.setMeidwsl(meidwsl);
					ptkucun.setKeyongl((new BigDecimal(Double.toString(0.0)).subtract(new BigDecimal(Double.toString(shuliang))).doubleValue()));
					ptkucun.setKucunzl(0.0);
				}
				
				dataset.update(ptkucun);
			}

			//-----启动流程-----
			Map map808 = new HashMap();

			Long result808 = WorkflowAppHelper.newProcessInstance(1754877L, map808, request, context.getId());

			if (result808.longValue() <= 0) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("出库计划ID: " + ckjhdid);
				logger.error("出库计划欠发/缺料提交失败");
				
				message = "【出库计划】欠发/缺料提交, 请联系系统管理员！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			instance.setCrkjhtjlx("2"); // 提交类型: 欠发/缺料提交 
			instance.setDanjuzt("2"); // 单据状态: 审核中
			instance.setShifouwc("2"); // 是否完成: 否
			instance.setZhidanr(employeeName); // 计划员

			if (shifoufsh == null)
				instance.setShifoufsh("2"); // 是否反审核: 否
				
			dataset.update(instance);

			message = "【出库计划】欠发/缺料提交成功";
				
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
