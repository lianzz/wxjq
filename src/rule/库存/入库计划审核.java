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
public class 入库计划审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(入库计划审核.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukjhd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-入库计划-审核(流程)-10 (1755182)
			 * 2012-10-23
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

			String shenheyj = instance.getShenheyj(); // 审核意见
			if (!"0".equals(shenhezt)) {
				if (shenheyj == null || "".equals(shenheyj.trim())) {
					message = "请填写审核意见！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			Long rkjhdid = instance.getId(); // 入库计划单ID
			String churukyy = instance.getChurukyy(); // 出入库原因

			//-----新增审核记录-----
			Atzchurukjhshjl shenhejl = new Atzchurukjhshjl();

			shenhejl.setAtzchurukjhdid(rkjhdid);
			shenhejl.setShenher(employeeName);
			shenhejl.setShenherq(today);
			shenhejl.setShenhezt(shenhezt);
			shenhejl.setShenheyj(shenheyj);

			dataset.add(shenhejl);

			String bianhao = instance.getBianhao(); // 入库计划编号
			Long xiangmuid = instance.getXiangmuid(); // 项目ID

			List<Atzchurukjhdmx> rkjhdmxs = dataset.getList("Atzchurukjhdmx", "atzchurukjhdid=" + rkjhdid); // 入库计划明细List

			Atzchurukjhdmx rkjhdmx = null; // 入库计划明细

			Double shuliang = null; // 计划数量

			Long wuliaoid = null; // 物料ID
			Long kuweiid = null; // 库位ID
			Double meidwsl = null; // 每单位数量

			String pthql = null; // 普通库存hql

			Atzkucun ptkucun = null; // 普通库存

			for (int i = 0; i < rkjhdmxs.size(); i++) {
				rkjhdmx = rkjhdmxs.get(i);
					
				shuliang = rkjhdmx.getShuliang();
				
				wuliaoid = rkjhdmx.getWuliaoid();
				kuweiid = rkjhdmx.getKuweiid();
				meidwsl = rkjhdmx.getMeidwsl();
				
				pthql = "from Atzkucun where xiangmuid=" + xiangmuid + " and wuliaoid=" + wuliaoid + " and kuweiid=" + kuweiid + " and kucunlx='1'";
				
				if (meidwsl != null)
					pthql += " and meidwsl=" + meidwsl;
				else
					pthql += " and meidwsl is null";
				
				ptkucun = (Atzkucun) dataset.getObjectByHql("Atzkucun", pthql);
				
				if (ptkucun != null) 
					rkjhdmx.setCunfangwz(ptkucun.getCunfangwz());
					
				rkjhdmx.setWeicrksl(shuliang); // 未完成数量
					if("1".equals(instance.getZhixingf())){
						rkjhdmx.setWeicrksl(0d);
						rkjhdmx.setZhizaowzxl(shuliang);
						}
				dataset.update(rkjhdmx);
			}

			//-----审核通过-----
			if ("0".equals(shenhezt)) {
				String rValue = null; // 编号

				if (bianhao != null && bianhao.startsWith("T-")) {
					paramMap.put("danjulx", "9");
					
					rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
					
					if (rValue.equals("流水号溢出"))
						message = "入库计划流水号溢出！";
					else if ("Error".equals(rValue))
						message = "生成入库计划编号出错, 请联系系统管理员！";
					
					if (message != null) {
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					instance.setBianhao(rValue); // 出库计划编号
				}
				
				if ("58".equals(churukyy) || "2".equals(churukyy) || "12".equals(churukyy) || "4".equals(churukyy) || "65".equals(churukyy)) {
					instance.setSfxyjianyan("1"); // 是否需要检验: 是
				} else {
					instance.setSfxyjianyan("2"); // 是否需要检验: 否
				}
				
				instance.setDanjuzt("3"); // 单据状态: 审核已通过
				
				dataset.update(instance);
			} else {
				instance.setDanjuzt("4"); // 单据状态: 审核未通过
				
				dataset.update(instance);
			}

			boolean	result = completeWorkflowTask(request, context); // 流程处理结果

			if ( !result ) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("入库计划ID: " + rkjhdid);
				logger.error("入库计划审核失败");
				
				message = "【入库计划】审核失败, 请联系系统管理员！";

				returnMsg.set("NO", message);
				return returnMsg;
			}

			if ("0".equals(shenhezt))
				message = "【入库计划】审核成功 (审核通过)";
			else
				message = "【入库计划】审核成功 (审核未通过)";

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
