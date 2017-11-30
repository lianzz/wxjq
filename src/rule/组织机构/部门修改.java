package rule.组织机构;

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
public class 部门修改 extends RuleEngine{
	private static Logger logger = Logger.getLogger(部门修改.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzemployee instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################

			Atzdepartment curdep = (Atzdepartment) context.get("o");
			Atzdepartment olddep = (Atzdepartment) context.get("oldobj");
			String depName = curdep.getOrgname();
			String odepName = olddep.getOrgname();
			if(depName == null || "".equals(depName)) {
				returnMsg.set("NO", "部门名称不能为空");
				return returnMsg;
			}
			List<Atzdepartment> nameDepList = dataset.getList("Atzdepartment",
					"orgname = '" + curdep.getOrgname() + "' and id !=" + curdep.getId());
			if(nameDepList != null && !nameDepList.isEmpty()) {
				returnMsg.set("NO", "部门名称已存在");
				return returnMsg;
			}
			//更新团队信息
			Atztuandui tuandui = (Atztuandui) dataset.getObject(Atztuandui.class, curdep.getId());
			if(tuandui == null){
				logger.error("团队找不到，部门id="+curdep.getId());
				returnMsg.set("NO", "系统运行错误，团队不存在");
				return returnMsg;
			}
			tuandui.setMingcheng(depName);
			dataset.update(tuandui);
			//更新团队员工关系信息
			if(!depName.equals(odepName)){
				List<Atztdyg> tdygs = dataset.getListByHql("Atztdyg", "from Atztdyg where tuanduiid="+curdep.getId());
				if(tdygs != null && tdygs.size()>0){
					for(Atztdyg tdyg : tdygs){
						tdyg.setGuanxi(tdyg.getYuangongmc()+"-"+depName);
						dataset.update(tdyg);
					}
				}
			}
			/**
  		 * 上级机构有无变化，如变化更改其机构路径、层次，子机构路径、层次，改缺省团队路径、层次，缺省子团队的路径、层次
  		 *  更改其所有员工的团队路径，更改员工相关任务的userseq,
  		 * 1,获取老的部门路径，团队路径 层次
  		 * 2，获取新的父部门路径，父团队路径，父团队层次
  		 * 3，计算老的部门路径，移到新的部门路径的差值，
  		 * 5，批量替换部门，团队的层次
  		 * 4，批量替换部门，团队的路径（老路径，新路径）
  		 */
			Long fubmid = curdep.getFudepartid();
			if(fubmid == null)
				fubmid = 0L;
			Long ofubmid = olddep.getFudepartid();
			if(ofubmid == null)
				ofubmid = 0L;
			if(fubmid.compareTo(ofubmid) != 0){
				String olujing = olddep.getLujing();
				int ocengci = olddep.getCengci();
				
				String flujing = "";
				int fcengci = 0;
					
				if(fubmid > 0){
					Atzdepartment fdep = (Atzdepartment) dataset.getObject(Atzdepartment.class, fubmid);
					if(fdep != null){
						flujing = fdep.getLujing();
						fcengci = fdep.getCengci();
					}else{
						returnMsg.set("NO", "系统运行错误，父部门查找出错");
						return returnMsg;
					}
				}else{
					//父部门为空
					flujing = ".";
					fcengci = 0;
				}
				String lujing = flujing+curdep.getId()+".";
				int cengci = fcengci+1;
				int para = cengci - ocengci;
				//改子部门路径
				String hql = "update Atzdepartment set lujing = replace(lujing,'"+olujing+"','"+lujing+"'),cengci=cengci+"+para+"	where id!= "+curdep.getId()+" and lujing like '"+olujing+"%'";
				logger.debug(hql);
				dataset.batchUpdate("Atzdepartment", hql);
				//改团队路径层次
				hql = "update Atztuandui set lujing = replace(lujing,'"+olujing+"','"+lujing+"'),cengci = cengci+"+para+" where lujing like '"+olujing+"%'";
				dataset.batchUpdate("Atztuandui", hql);
				//改团队员工的团队路径
				hql = "update Atztdyg set teamseq = replace(teamseq,'"+olujing+"','"+lujing+"') where teamseq like '"+olujing+"%'";
				dataset.batchUpdate("Atztdyg", hql);
				//改团队员工的对应的用户的teamseq
				hql = "update Bc_auth_usr set teamseq = replace(teamseq,'"+olujing+"','"+lujing+"') where teamseq like '"+olujing+"%'";
				dataset.batchUpdate("Bc_auth_usr", hql);
				//改员工对应task表中的userseq
				hql = "update Atztask set userseq =replace(userseq,'"+olujing+"','"+lujing+"') where userseq like '%"+olujing+"%'";
				dataset.batchUpdate("Atztask", hql);
				tuandui.setFutuanduiid(fubmid);
				dataset.update(tuandui);
				curdep.setLujing(lujing);
				curdep.setCengci(cengci);
				context.set("o", curdep);
			}
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
