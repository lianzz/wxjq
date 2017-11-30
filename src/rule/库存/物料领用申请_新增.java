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
public class 物料领用申请_新增 extends RuleEngine{
	private static Logger logger = Logger.getLogger(物料领用申请_新增.class);
	AProxy a = new AProxy();
	
	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzlinshiwlsq instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-物料领用申请-新增-10 (2046502) 2012-08-31
			 */
			
			String message = null; // 提示信息
			
			String employeeName = (String) request.getSession().getAttribute(
					"employeeName"); // 操作人
			
			Long id = instance.getId(); // 物料领用申请ID
			
			List<Atzlinshiwlsqmx> linshiwlsqmxs = dataset.getList("Atzlinshiwlsqmx",
					"linshiwlsqid=" + id); // 物料领用申请明细List
			
			if(linshiwlsqmxs == null || linshiwlsqmxs.isEmpty()) {
				message = "物料领用申请明细不能为空, 请维护！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}
			
			Atzlinshiwlsqmx linshiwlsqmx = null; // 物料领用申请明细
			
			Long wuliaoid = null; // 物料ID
			
			Atzwuliaojcxx wljcxx = null; // 物料基础信息
			
			for(int i = 0; i < linshiwlsqmxs.size(); i++) {
				linshiwlsqmx = linshiwlsqmxs.get(i);
				
				wuliaoid = linshiwlsqmx.getWuliaoid();
				
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class,
						wuliaoid);
				
				if(wljcxx == null) {
					logger.error("-----(EXCEPTION-INFO)-----");
					logger.error("物料ID: " + wuliaoid);
					logger.error("物料不存在");
					
					message = "第 " + (i + 1) + " 条物料领用申请明细的物料不存在, 请联系系统管理员！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				String condition = "";
				if(linshiwlsqmx.getMeidwsl() != null)
					condition += " and meidwsl=" + linshiwlsqmx.getMeidwsl();
				else
					condition += " and meidwsl is null";
				Double sum = Double.parseDouble(dataset.sum("Atzkucun", "keyongl",
						" and wuliaoid =" + wuliaoid + condition));
				if(sum < linshiwlsqmx.getShuliang()) {
					message = "第 " + (i + 1) + " 条物料库存不足, 不能新增！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				linshiwlsqmx.setWuliaobm(wljcxx.getWuliaobm()); // 物料编码
				
				dataset.update(linshiwlsqmx);
			}
			
			instance.setDanjuzt("1"); // 单据状态: 未提交
			instance.setShengqr(employeeName); // 申请人
			// 20150817-lzz 增加维护申请人所在部门
			List<Atzemployee> yglist = dataset.getListByHql("Atzemployee",
					" from Atzemployee where name='" + employeeName + "'");
			if(yglist != null && yglist.size() > 0) {
				Atzemployee employee = yglist.get(0);
				if(employee != null) {
					
					Atzdepartment dep = (Atzdepartment) dataset.getObject(Atzdepartment.class, employee.getBumenid());
					if(dep != null) {
						instance.setShenqbm(dep.getOrgname());
					}
					
				}
			}
			instance.setShenqrq(new Date()); // 申请日期
			
			dataset.update(instance);
			
			message = "【物料领用申请】新增成功";
			
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
