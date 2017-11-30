package rule.产品;

import java.util.*;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;

import jxl.Sheet;
import jxl.Workbook;

import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.basic.application.AttachmentResource;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 项目配置清单提交 extends RuleEngine{
	private static Logger logger = Logger.getLogger(项目配置清单提交.class);
	AProxy a = new AProxy();
	AProxy A = a;
	
	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiangmupzqd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			// A-项目配置清单-提交-12
			// 防止重复提交
			if(!"1".equals(instance.getDanjuzt())) {
				return "OK";
			}
			//检查销售编码下是否有物料
			List<Atzxiangmupzmx> pzmxlist = dataset.getListByHql("Atzxiangmupzmx", "from Atzxiangmupzmx where xiangmupzqdid="+instance.getId()+"order by id asc");
			if(pzmxlist == null || pzmxlist.size()<=0){
				returnMsg.set("NO", "没有明细不能提交，请检查");
				return returnMsg;
			}
			Atzxiaoshoubm xiaoshoubm = null;
			boolean flag = false;
			StringBuffer ccts = new StringBuffer("提交失败！错误提示信息：<br>"); // 错误提示信息
			for(int i = 0; i < pzmxlist.size(); i++) {
				Atzxiangmupzmx pzmx = pzmxlist.get(i);
				xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, pzmx.getBujianh());
				List list = dataset.getListByHql("Atzwuliaojcxx", "from Atzwuliaojcxx where wuliaosjxz='0' and shenhezt='3' and xiaoshoubmid="+xiaoshoubm.getId());
				if(list == null || list.size()<=0){
					//该销售编码下没有物料
					flag = true;
					ccts.append("第"+(i+1)+"行，销售编码为： "+xiaoshoubm.getBianma()+" 没有对应的物料<br>");
				}
			}
			if(flag){
				//有销售编码下没有物料
				returnMsg.set("NO", ccts.toString());
				return returnMsg;
			}
			Long result = newWorkflowInstance(request, context);
			if(result <= 0) {
				returnMsg.set("NO", "流程提交失败，请联系系统管理员");
				return returnMsg;
			} else {
				String empname = (String) request.getSession().getAttribute(
						"employeeName");
				// 新增流程审核记录
				Atzlcshenhejl sh = new Atzlcshenhejl();
				sh.setRenwulx("提交");
				sh.setShenher(empname);
				sh.setShenherq(new Date());
				sh.setDanjuid(instance.getId());
				sh.setYewudlx("14");
				dataset.add(sh);
			}
			instance.setDanjuzt("2");
			dataset.update(instance);
			returnMsg.set("OK", "提交成功");
			return returnMsg;
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
