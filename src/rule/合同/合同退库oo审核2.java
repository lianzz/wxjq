package rule.合同;

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
public class 合同退库oo审核2 extends RuleEngine{
	private static Logger logger = Logger.getLogger(合同退库oo审核2.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzhetongtk instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			String shzt = instance.getShzt();
			String shyj = instance.getShyj();
			if(shzt.equals("1")&&(shyj == null || "".equals(shyj))){
				returnMsg.set("NO", "请填写审核意见");
				return returnMsg;
			}
			if("0".equals(shzt)){
				//合同退库明细数量到发货通知单明细的退库数量
				List<Atzhetongtkmx> tkmxs = dataset.getList("Atzhetongtkmx", "hetongtkid="+instance.getId());
				if(tkmxs != null && tkmxs.size()>0){
					List<Atzfahuotzd> tzds = dataset.getList("Atzfahuotzd", "hetongid="+instance.getHetongid()+" and danjuzt='3'");
					if(tzds == null || tzds.size()<=0){
						returnMsg.set("NO", "无已发货的发货通知单，无法退库");
						return returnMsg;
					}
					Atzhetongtkmx tkmx = null;
					Atzfahuosbqdmx fhmx = null;
					for(int i = 0; i < tkmxs.size(); i++) {
						tkmx = tkmxs.get(i);
						Double tksl = tkmx.getShuliang();
						//tkmx.getXiaoshoubmid();
						for(int j = 0; j < tzds.size(); j++) {
							List<Atzfahuosbqdmx> fhmxs = dataset.getList("Atzfahuosbqdmx", "fahuotzdid="+tzds.get(j).getId()+" and xiaoshoubmid="+tkmx.getXiaoshoubmid());
							if(fhmxs != null && fhmxs.size()>0){
								fhmx = fhmxs.get(0);
								Double shuliang = fhmx.getShuliang();
								if(tksl <= shuliang){
									fhmx.setTkshuliang(tksl);
									break;
								}else{
									fhmx.setTkshuliang(shuliang);
									tksl = tksl - shuliang;
								}
							}
						}
					}
				}
				//生成入库计划
				paramMap.put("danjulx", "9");
				String rValue = execAdjustmentRule("A-生成编码规则-05", null,
						context, dataset, request, paramMap);
				if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
					returnMsg.set("NO", "出库计划单编码规则未设置或者流水号溢出，请联系管理员！");
					return returnMsg;
				} else if ("Error".equals(rValue)) {
					returnMsg.set("NO", "出库计划单流水号溢出，请联系管理员！");
					return returnMsg;
				} else {
					// 初始化单据编号、制单人、制单日期等信息
					Atzchurukjhd churukjhd = new Atzchurukjhd();

					churukjhd.setBianhao(rValue); // 编号
					churukjhd.setLinshibh(rValue); // 临时编号
					churukjhd.setDanjulx("2"); // 出入库单的单据类型，出库

					churukjhd.setRenwuzt("17"); // 维护任务主题“合同退库”
					churukjhd.setChurukyy("10"); // 维护出入库原因为“合同退库”
					churukjhd.setXiangmuid(1552L);//项目ID，编号为103004
					churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
					churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
					churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
					churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
					churukjhd.setChuruknr(instance.getBeizhu());
					churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
					churukjhd.setZhidanrq(new Date()); // 制单日期
					churukjhd.setShifouwc("2"); // 是否完成: 否
					churukjhd.setShifoufsh("2");// 是否反审核：否
					dataset.add(churukjhd);

					List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
					List<Atzhetongtkmx> hetongtkmxs = dataset.getList(
							"Atzhetongtkmx", "hetongtkid="
									+ instance.getId());
					if (hetongtkmxs != null && hetongtkmxs.size() > 0) {
						for (Iterator iter = hetongtkmxs.iterator(); iter
								.hasNext();) {
							Atzhetongtkmx hetongtkmx = (Atzhetongtkmx) iter
									.next();
							Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
							churukjhmx.setAtzchurukjhdid(churukjhd.getId());
							List<Atzwuliaojcxx> wuliaoList = dataset
									.getList(
											"Atzwuliaojcxx",
											"wuliaosjxz ='0' and xiaoshoubmid ="
													+ hetongtkmx
															.getXiaoshoubmid()
													+ " order by banbenpx desc");
							if (wuliaoList != null && wuliaoList.size() > 0) {
								Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList
										.get(0);
								churukjhmx.setWuliaoid(wuliao.getId());
								churukjhmx
										.setWuliaobm(wuliao.getWuliaobm());
								churukjhmx
										.setWuliaoms(wuliao.getWuliaoms());
								churukjhmx.setGuigedw(wuliao.getGuigedw());
								churukjhmx.setDanwei(wuliao.getDanwei());
							}
							//churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
							churukjhmx.setInitshuliang(hetongtkmx
									.getShuliang());
							churukjhmx.setShuliang(hetongtkmx.getShuliang());
							churukjhmx.setKuweiid(431139L);
							churukjhmx.setWeicrksl(null);
							churukjhmx.setLururq(new Date());
							churukjhdmxList.add(churukjhmx);
						}
					}
					if (churukjhdmxList.size() > 0)
						dataset.addAll(churukjhdmxList);
				}
				
				instance.setDanjuzt("3");
			}			
			boolean result = completeWorkflowTask(request, context);
			if(!result){
		  	logger.error("合同退库审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO","合同退库审核流程提交失败，请联系系统管理员");
		  	return returnMsg;
		}else{
				String empname=(String) request.getSession().getAttribute("employeeName");
				//新增流程审核记录
			 	Atzlcshenhejl sh=new Atzlcshenhejl();
				sh.setRenwulx("工程中心审核");
				sh.setShenher(empname);  
				sh.setShenherq(new Date());
				sh.setShenhezt(shzt);
				sh.setShenheyj(shyj);
				sh.setDanjuid(instance.getId());
				sh.setYewudlx("22");
				dataset.add(sh);
		}
			returnMsg.set("OK","提交成功");
			return returnMsg;
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
