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
public class 物料领用账务审核_临时物料申请 extends RuleEngine{
	private static Logger logger = Logger.getLogger(物料领用账务审核_临时物料申请.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzlinshiwlsq instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-物料领用申请-审核(流程)-10 (2051267)
			 * 2013-04-16
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 审核人

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

			Long id = instance.getId(); // 物料领用申请ID
			Long xiangmuid = instance.getXiangmuid(); // 项目ID
			String shenqyy = instance.getShenqyy(); // 申请原因
			String shengqr = instance.getShengqr(); // 申请人

			//-----新增审核记录-----
			Atzchurukjhshjl shenhejl = new Atzchurukjhshjl(); // 物料领用申请审核记录

			shenhejl.setAtzchurukjhdid(id);
			shenhejl.setShenher(employeeName);
			shenhejl.setShenherq(new Date());
			shenhejl.setShenhezt(shenhezt);
			shenhejl.setShenheyj(shenheyj);

			dataset.add(shenhejl);

			//-----物料领用申请审核通过-----
			if ("0".equals(shenhezt)) {
			  context.set("shifoutg","0");
				List<Atzlinshiwlsqmx> linshiwlsqmxs = dataset.getList("Atzlinshiwlsqmx", "linshiwlsqid=" + id); // 物料领用申请明细List
				
				paramMap.put("danjulx", "10"); // 设置编码规则

				String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);

				if (rValue.equals("流水号溢出"))
					message = "出库计划流水号溢出！";
				else if ("Error".equals(rValue))
					message = "生成出库计划编号有误, 请联系系统管理员！";

				if (message != null) {
					returnMsg.set("NO", message);
					return returnMsg;
				}

				Atzchurukjhd ckjh = new Atzchurukjhd(); // 出库计划
				
				ckjh.setBianhao(rValue); // 编号
				ckjh.setLinshibh(rValue); // 临时编号
				ckjh.setXiangmuid(xiangmuid); // 项目ID
				ckjh.setLinshiwlsqid(id); // 物料领用申请ID
				ckjh.setDanjusc("1"); // 单据生成: 手工录入
				ckjh.setDanjulx("1"); // 单据类型: 出库
				ckjh.setDanjuzt("1"); // 单据状态: 未提交
				ckjh.setShifoufsh("2"); // 是否反审核: 否
				ckjh.setShifouwc("2"); // 是否完成: 否
				ckjh.setShifouxn("2"); // 是否虚拟: 否
				ckjh.setZhidanr("admin"); // 制单人
				ckjh.setZhidanrq(new Date()); // 制单日期
				ckjh.setRenwuzt(null); // 任务主题
				ckjh.setChurukyy(null); // 出库原因
				ckjh.setChuruknr(shenqyy); // 出库内容
				ckjh.setBeizhu("领用申请人: " + shengqr); // 备注
				List<Atzemployee> yglist=dataset.getListByHql("Atzemployee"," from Atzemployee where name='"+shengqr+"'");
				if(yglist!=null&&yglist.size()>0){
					Atzemployee employee=yglist.get(0);
					if(employee!=null){
					
							ckjh.setBmmc(employee.getBumenid());
							
				}
					
					}
				
				dataset.add(ckjh);

				Atzlinshiwlsqmx linshiwlsqmx = null; // 物料领用申请明细
				Atzchurukjhdmx ckjhmx = null; // 出库计划明细
			  
			  	// 06H
							String mrkw = "";// 默认库位编号
							String kwhql = "from Atzkuwei where kuweibh='"+mrkw+"'";
							Atzkuwei kuwei = (Atzkuwei) dataset.getObjectByHql("Atzkuwei", kwhql);
							Long kuweiid=-1L;
							if (kuwei != null) {
								kuweiid=kuwei.getId();
							} else {
								// 如果默认库位 为null的话,默认第一个新增的库存
								String mrkcsql = "from Atzkuwei order by id asc";
								List<Atzkuwei> mrlist = dataset.getListByHql("Atzkuwei", mrkcsql);
								if (mrlist != null && mrlist.size() > 0)kuweiid=mrlist.get(0).getId();
									
							}
				
				for (int i = 0; i < linshiwlsqmxs.size(); i++) {
					linshiwlsqmx = linshiwlsqmxs.get(i);
					
					ckjhmx = new Atzchurukjhdmx();
					
					ckjhmx.setAtzchurukjhdid(ckjh.getId()); // 出库计划ID
					ckjhmx.setWuliaoid(linshiwlsqmx.getWuliaoid()); // 物料ID
					ckjhmx.setWuliaobm(linshiwlsqmx.getWuliaobm()); // 物料编码
					ckjhmx.setKuweiid(kuweiid); // 库位ID (默认)
					ckjhmx.setMeidwsl(linshiwlsqmx.getMeidwsl()); // 每单位数量
					ckjhmx.setInitshuliang(linshiwlsqmx.getShuliang()); // 计划数量
					ckjhmx.setShuliang(linshiwlsqmx.getShuliang()); // 调整后计划数量
					ckjhmx.setLururq(new Date()); // 录入日期
					
					dataset.add(ckjhmx);
				}
				
				paramMap.put("danjulx", "37");
				
				rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
				
				if (rValue.equals("流水号溢出"))
					message = "物料领用申请流水号溢出！";
				else if ("Error".equals(rValue))
					message = "生成物料领用申请编号有误, 请联系系统管理员！";
				
				if (message != null) {
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				instance.setBianhao(rValue); // 编号
				instance.setDanjuzt("3"); // 单据状态: 审核已通过
				
				dataset.update(instance);
			} else {
			  context.set("shifoutg","1");
				instance.setDanjuzt("4"); // 单据状态: 审核未通过
				
				dataset.update(instance);
			}

			boolean	result = completeWorkflowTask(request, context); // 流程处理结果
			logger.debug("result="+result);
			if ( !result ) {
				logger.error("-----(EXCEPTION-INFO)-----");
				logger.error("物料领用申请ID: " + id);
				logger.error("物料领用申请审核失败");
				
				message = "【物料领用申请】审核失败, 请联系系统管理员！";

				returnMsg.set("NO", message);
				return returnMsg;
			}
			logger.debug("shenhezt="+shenhezt);
			if ("0".equals(shenhezt))
				message = "【物料领用申请】审核成功 (审核通过)";
			else
				message = "【物料领用申请】审核成功 (审核未通过)";
			logger.debug("message="+message);
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
