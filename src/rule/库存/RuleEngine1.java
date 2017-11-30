package rule.库存;

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
public class RuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzchurukd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * A-出库单-新增-10 (2029371)
			 * 2012-09-05
			 */
			 
			String message = null; // 提示信息

			String employeeName = (String) request.getSession().getAttribute("employeeName"); // 操作人

			Long ckjhdid = instance.getChurukjhdid(); // 出库计划单ID

			Atzchurukjhd ckjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, ckjhdid); // 出库计划
			if (ckjhd == null) {
				message = "出库计划信息丢失, 请重新登录后再操作！";					
				returnMsg.set("NO", message);
				return returnMsg;
			}

			Long ckdid = instance.getId(); // 出库单ID
			String bianhao = instance.getBianhao(); // 出库单编号

			List<Atzchurukdmx> ckdmxs = dataset.getList("Atzchurukdmx", "atzchurukdid=" + ckdid); // 出库单明细List
			if (ckdmxs == null || ckdmxs.isEmpty()) {
				message = "无出库单明细, 无法新增出库单！";
				
				returnMsg.set("NO", message);
			    return returnMsg;
			}

			Atzchurukdmx ckdmx = null; // 出库单明细

			String sn = null; // SN
			String tmpsn = null;

			Long wuliaoid = null; // 物料ID

			Atzwuliaojcxx wljcxx = null; // 物料基础信息

			String sngl = null; // SN管理: 1-是  2-否
			
			Long kuweiid = null;
			
			Long xiangmuid = instance.getXiangmuid();

			//-----去除 SN 中的空格-----
			for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);
				
				tmpsn = ckdmx.getSn();
				
				sn = null;
				if (tmpsn != null || !"".equals(tmpsn.trim()))
					sn = tmpsn.trim();
					
				ckdmx.setSn(sn);
				
				wuliaoid = ckdmx.getWuliaoid();
				
				wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
				
				sngl = wljcxx.getSngl();
				
				kuweiid = ckdmx.getKuweiid();
				if ("2".equals(sngl))
					ckdmx.setSn(null);
				//---查询sn管理的物料是否在库存中
				if("1".equals(sngl)&&!"".equals(sn)){
					String hql = "from Atzkucunmx where wuliaoid="+wuliaoid+" and sn='"+ckdmx.getSn()+"' and kucunid in (select id from Atzkucun where wuliao id="+wuliaoid+" and xiangmuid="+xiangmuid+" and kuweiid="+kuweiid+")";
					Atzkucunmx kucunmx = (Atzkucunmx)dataset.getObjectByHql("Atzkucunmx", hql);
					if(kucunmx == null){
						returnMsg.set("NO", "在所选择的项目和库位下, 第 " + (i+1)+ " 条出库计划明细所在的库存下不存在该sn！");
						return returnMsg;
					}
					if("2".equals(kucunmx)){
						message="在所选择的项目和库位下, 第 " + (i+1)+ " 条出库计划明细物料 sn已经被占用！";
						returnMsg.set("NO", message);
				    return returnMsg;
					}
					kucunmx.setWuliaozt("2");
					dataset.update(kucunmx);
				}
				//---
				dataset.update(ckdmx);
			}

			Double bcjhshuliang = null; // 本次计划数量
			Double shuliang = null; // 实发数量

			Long ckjhmxid = null; // 出库计划明细

			Atzchurukjhdmx ckjhdmx = null; // 出库计划明细

			Double weicrksl = null; // 未完成数量
			String crkyy=instance.getChurukyy();//出入库原因
			
			//非 生产订单领料出库 判断数量不能大于本次计划数量，不能大于未入库数量
			if(!"1".equals(crkyy)){
				for (int i = 0; i < ckdmxs.size(); i++) {
					ckdmx = ckdmxs.get(i);
					
					ckjhmxid = ckdmx.getCrkjhmxid();
					
					shuliang = ckdmx.getShuliang();
					bcjhshuliang = ckdmx.getBencijhsl();
					if (shuliang == null || shuliang.doubleValue() <= 0) {
						message = "第 " + (i+1) + " 条出库单明细的实发数量不能为空且必须大于零！";
						
						returnMsg.set("NO", message);
				       	return returnMsg;
					}
					
					if (shuliang.doubleValue() > bcjhshuliang.doubleValue()) {
						message = "第 " + (i+1) + " 条出库单明细的实发数量不能大于本次计划数量！";
						
						returnMsg.set("NO", message);
						return returnMsg;
					}
					
					ckjhdmx = (Atzchurukjhdmx) dataset.getObject(Atzchurukjhdmx.class, ckjhmxid);
					
					weicrksl = ckjhdmx.getWeicrksl();
					
					if (shuliang.doubleValue() > weicrksl.doubleValue()) {
						message = "已超出计划数量, 请联系系统管理员！";
						
				      	returnMsg.set("NO", message);
				      	return returnMsg;
				 	}
				}	
			}
			
			if("1".equals(crkyy)){
				for (int i = 0; i < ckdmxs.size(); i++) {
				ckdmx = ckdmxs.get(i);				
				ckjhmxid = ckdmx.getCrkjhmxid();				
				shuliang = ckdmx.getShuliang();
				bcjhshuliang = ckdmx.getBencijhsl();
				if (shuliang == null || shuliang.doubleValue() <= 0) {
					message = "第 " + (i+1) + " 条出库单明细的实发数量不能为空且必须大于零！";					
					returnMsg.set("NO", message);
			       	return returnMsg;
				}
				}
			}
			

			

			instance.setLinshibh(bianhao); // 临时编号
			instance.setZhidanr(employeeName); // 仓管员
			instance.setZhidanrq(new Date()); // 制单日期
			instance.setShifouzx("2"); // 是否执行: 否

			dataset.update(instance);

			message = "【出库单】新增成功";

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
