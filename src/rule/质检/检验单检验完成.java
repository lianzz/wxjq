package rule.质检;

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
public class 检验单检验完成 extends RuleEngine{
	private static Logger logger = Logger.getLogger(检验单检验完成.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzjianyand instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-检验单-检验完成-10 (1777222)
			 * 2013-02-21
			 */

			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人

			if (employeeName == null) {
				message = "系统管理员不能进行业务操作！";
				
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long jianyandid = instance.getId(); // 检验单ID

			List<Atzjianyandmx> jianyandmxs = dataset.getList("Atzjianyandmx", "atzjianyandid=" + jianyandid); // 检验单明细List

			if (jianyandmxs == null || jianyandmxs.isEmpty()) {
				message = "检验单明细为空, 请联系系统管理员！";
				
				returnMsg.set("NO", message);	
				return returnMsg;
			}

			String jianyanjg = null; // 检验结论: 1-合格  2-不合格  3-批合格  4-特殊放行  5-虚拟入库放行  6-待处理  7-放行

			Atzjianyandmx jianyandmx = null; // 检验单明细
			Double chouyangsl = null;
			Double laihuosl = null;
			Double hegesl = null;
			Double buhegesl = null;

			for (int i = 0; i < jianyandmxs.size(); i++) {
				jianyandmx = jianyandmxs.get(i);
				
				jianyanjg = jianyandmx.getJianyanjg();
				
				laihuosl = jianyandmx.getLaihuosl();
				chouyangsl = jianyandmx.getChouyangsl();
				hegesl = jianyandmx.getHegesl();
				buhegesl = jianyandmx.getBuhegsl();
				if(chouyangsl == null){
					chouyangsl = 0d;
				}
				if(laihuosl == null){
					laihuosl = 0d;
				}
				if(hegesl == null){
					hegesl = 0d;
				}
				if(buhegesl == null){
					buhegesl = 0d;
				}
				
				if(chouyangsl > laihuosl){
					message = "第 " + (i+1) + " 条检验单明细，抽样数量大于来货数量，请检查！";
					returnMsg.set("NO", message);
					return returnMsg;
				}
				
				if(buhegesl + hegesl > laihuosl){
					message = "第 " + (i+1) + " 条检验单明细，合格数量加不合格数量大于来货数量，请检查！";
					returnMsg.set("NO", message);
					return returnMsg;
				}

				if (jianyanjg == null || "".equals(jianyanjg.trim())) {
					message = "第 " + (i+1) + " 条检验单明细检验结论不能为空，请检查！";
					
					returnMsg.set("NO", message);
					return returnMsg;
				}
			}

			Long teshufxdid = null; // 特殊放行ID

			//-----判断是否关联特殊放行单-----
			for (int i = 0; i < jianyandmxs.size(); i++) {
				jianyandmx = jianyandmxs.get(i);
				
				jianyanjg = jianyandmx.getJianyanjg();
				
				//--特殊放行--
				if ("4".equals(jianyanjg)) {
					teshufxdid = jianyandmx.getTeshufxdid();
					
					if (teshufxdid == null) {
						message = "第 " + (i+1) + " 条检验单明细需关联特殊放行单！";
							
						returnMsg.set("NO", message);
						return returnMsg;
					}
				}
				
				//--待处理--
				if ("6".equals(jianyanjg)) {
					instance.setJianyandzt("5");  // 检验单状态: 1-未检验  2-检验完成  3-检验未通过  4-入库完成  5-待处理  6-待入库  7-仓库退回  8-检验退回
					
					dataset.update(instance);
					
					message = "【检验单】检验完成 (待处理)";

					returnMsg.set("OK", message);
					return returnMsg;
				}
			}

			//-----判断检验是否完成-----
			boolean flag = false;

			for (int i = 0; i < jianyandmxs.size(); i++) {
				jianyandmx = jianyandmxs.get(i);
				
				jianyanjg = jianyandmx.getJianyanjg();
				
				//-检验结论: 1-合格  2-不合格  3-批合格  4-特殊放行  5-虚拟入库放行  6-待处理  7-放行
				if ("1".equals(jianyanjg) || "3".equals(jianyanjg) || "4".equals(jianyanjg) || "5".equals(jianyanjg) || "7".equals(jianyanjg)) {
					flag = true;
					break;
				}
			}

			//-检验单状态: 1-未检验  2-检验完成  3-检验未通过  4-入库完成  5-待处理  6-待入库  7-仓库退回  8-检验退回
			if ( flag )
				instance.setJianyandzt("2");
			else
				instance.setJianyandzt("3");

			instance.setJianyanz(employeeName); // 检验者

			dataset.update(instance);

			message = "【检验单】检验完成";

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
