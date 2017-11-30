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
public class 出库计划审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(出库计划审核.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukjhd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-出库计划-审核(流程)-10 (2014594)
			 * 2012-09-03
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 审核人
			Date today = new Date();

			String danjuzt = instance.getDanjuzt(); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废

			if (!"2".equals(danjuzt))
				return "OK";

			String shenhezt = instance.getShenhezt(); // 审核状态: 0-通过  1-不通过
			if (shenhezt == null) {
				message = "审核状态不能为空, 请维护！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String churukyy = instance.getChurukyy(); // 出库原因
			if (churukyy == null) {
				message = "出库计划出库原因为空, 请联系系统管理员！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			String shenheyj = instance.getShenheyj(); // 审核意见
			if (!"0".equals(shenhezt)) {
				if (shenheyj == null || "".equals(shenheyj.trim())) {
					message = "请填写审核意见！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			Long crkjhdid = instance.getId(); // 出库计划单ID

			//-----新增审核记录-----
			Atzchurukjhshjl shenhejl = new Atzchurukjhshjl();

			shenhejl.setAtzchurukjhdid(crkjhdid);
			shenhejl.setShenher(employeeName);
			shenhejl.setShenherq(today);
			shenhejl.setShenhezt(shenhezt);
			shenhejl.setShenheyj(shenheyj);

			dataset.add(shenhejl);

			String bianhao = instance.getBianhao(); // 出库计划编号
			Long xiangmuid = instance.getXiangmuid(); // 项目ID

			//-----设置关联出库计划编号-----
			Atzdiaobod diaobod = (Atzdiaobod) dataset.getObjectByHql("Atzdiaobod", "from Atzdiaobod where ckjhdbh='" + bianhao + "'");
			Atzchurukjhd rkjh = (Atzchurukjhd) dataset.getObjectByHql("Atzchurukjhd", "from Atzchurukjhd where glcrkjhdbh='" + bianhao + "' and danjulx='2'");

			//-----出库计划审核通过-----
			if ("0".equals(shenhezt)) {
				String rValue = null; // 编号

				if (bianhao != null && bianhao.startsWith("T-")) {
					paramMap.put("danjulx", "10");
					
					rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
					
					if (rValue.equals("流水号溢出"))
						message = "出库计划流水号溢出！";
					else if ("Error".equals(rValue))
						message = "生成出库计划编号出错, 请联系系统管理员！";
					
					if (message != null) {
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					instance.setBianhao(rValue); // 出库计划编号
				}
				
				if (diaobod != null) {
					diaobod.setCkjhdbh(instance.getBianhao()); // 设置关联出库计划编号
					dataset.update(diaobod);
				}
				
				if (rkjh != null) {
					rkjh.setGlcrkjhdbh(instance.getBianhao()); // 设置关联出库计划编号
					dataset.update(rkjh);
				}
				
				List<Atzchurukjhdmx> crkjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + crkjhdid); // 出库计划明细List
				
				Atzchurukjhdmx crkjhdmx = null; // 出库计划明细
				
				Double shuliang = null; // 计划数量
				
				Long wuliaoid = null; // 物料ID
				Long kuweiid = null; // 库位ID
				Double meidwsl = null; // 每单位数量
				
				String pthql = null; // 普通库存hql
				
				Atzkucun ptkucun = null; // 普通库存
				
				for (int i = 0; i < crkjhdmxs.size(); i++) {
					crkjhdmx = crkjhdmxs.get(i);
					
					shuliang = crkjhdmx.getShuliang();
					
					wuliaoid = crkjhdmx.getWuliaoid();
					kuweiid = crkjhdmx.getKuweiid();
					meidwsl = crkjhdmx.getMeidwsl();
					
					pthql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid + " and kucunlx='1'";
					
					if (meidwsl != null)
						pthql += " and meidwsl=" + meidwsl;
					else
						pthql += " and meidwsl is null";
					
					ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
					
					if (ptkucun != null) 
						crkjhdmx.setCunfangwz(ptkucun.getCunfangwz());
						
					crkjhdmx.setWeicrksl(shuliang); // 未完成数量
					if("1".equals(instance.getZhixingf())){
						crkjhdmx.setWeicrksl(0d);
						crkjhdmx.setZhizaowzxl(shuliang);
						}
						
					dataset.update(crkjhdmx);
				}
				
				//-----借用发货或外购件维修时, 生成对应的入库计划单-----
				int crkyy = Integer.parseInt(churukyy);
				if (crkyy==53 || crkyy==55 || crkyy==33 || crkyy==35 || crkyy==37 || crkyy==39 || crkyy==41 || crkyy==45 || crkyy==47  || crkyy==51) {
					Atzchurukjhd scrkjhd = new Atzchurukjhd(); // 入库计划
					
					paramMap.put("danjulx", "9");
					
					rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
					
					if (rValue.equals("流水号溢出"))
						message = "入库计划流水号溢出！";
					else if ("Error".equals(rValue))
						message = "生成入库计划编号出错, 请联系系统管理员！";
					
					if (message != null) {
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					scrkjhd.setBianhao(rValue); // 入库计划编号
					scrkjhd.setLinshibh(rValue); // 入库计划临时编号
					scrkjhd.setXiangmuid(instance.getXiangmuid()); // 项目ID
					scrkjhd.setDanjusc("2"); // 单据生成: 上级单据
					scrkjhd.setDanjulx("2"); // 单据类型: 入库
					scrkjhd.setRenwuzt(instance.getRenwuzt()); // 任务主题
					scrkjhd.setChurukyy(Integer.toString(crkyy + 1)); // 入库原因
					//20150706-lzz 生成入库计划时，带出出库计划的出库内容
					scrkjhd.setChuruknr(instance.getChuruknr()); // 入库内容
					//20150814-lzz 生成入库计划时，带出备注内容 部门名称
					scrkjhd.setBeizhu(instance.getBeizhu());
					if(instance.getBmmc() != null) {
						scrkjhd.setBmmc(instance.getBmmc());
					}
					scrkjhd.setGlcrkjhdbh(instance.getBianhao()); // 关联出库计划编号
					scrkjhd.setSfxyjianyan(null); // 是否需要检验
					scrkjhd.setShifouwc("2"); // 是否完成: 否
					scrkjhd.setLaoxtid(null); // 老系统任务编码置空
					scrkjhd.setSfwh("2"); // 是否维护新老系统关系:否
					scrkjhd.setShifouxn("2"); // 是否虚拟: 否
					scrkjhd.setZhidanr(instance.getZhidanr()); // 计划员
					scrkjhd.setZhidanrq(today); // 制单日期
					
					dataset.add(scrkjhd);
					
					Long rkjhdid = scrkjhd.getId(); // 入库计划单ID
					
					Atzchurukjhdmx rkjhdmx = null; // 入库计划明细
					for (int i = 0; i < crkjhdmxs.size(); i++) {
					  	rkjhdmx = new Atzchurukjhdmx();
						
					  	a.copyBeanToBean(crkjhdmxs.get(i), rkjhdmx);
					  	
					  	rkjhdmx.setAtzchurukjhdid(rkjhdid); // 入库计划单ID
					  	rkjhdmx.setWeicrksl(null); // 未完成数量
						rkjhdmx.setKucunck(null); // 库存信息
						rkjhdmx.setLururq(today); // 录入日期
						rkjhdmx.setBeizhu(null); // 备注
					            
					  	dataset.add(rkjhdmx);
					}
				}
				
				instance.setDanjuzt("3"); // 单据状态: 审核已通过
			} else {
				instance.setDanjuzt("4"); // 单据状态: 审核未通过
			}

			dataset.update(instance);

			boolean	result = completeWorkflowTask(request, context); // 流程处理结果

			if ( !result ) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("出库计划ID: " + crkjhdid);
				logger.error("出库计划审核失败");
				
				message = "【出库计划】审核失败, 请联系系统管理员！";

				returnMsg.set("NO", message);
				return returnMsg;
			}

			if ("0".equals(shenhezt))
				message = "【出库计划】审核成功 (审核通过)";
			else
				message = "【出库计划】审核成功 (审核未通过)";

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
