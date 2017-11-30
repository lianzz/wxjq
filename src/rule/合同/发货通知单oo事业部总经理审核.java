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
public class 发货通知单oo事业部总经理审核 extends RuleEngine{
	private static Logger logger = Logger.getLogger(发货通知单oo事业部总经理审核.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzfahuotzd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			/**
			 * A-发货通知单最终审核通过规则-05 
			 * 功能：审核发货通知单 
			 * 说明： 审核发货通知单，生成出库计划 
			 * 引用： 合同管理 
			 * 作者：05 
			 * 创建： 2010-10-27 
			 * 修改：2010-12-24 
			 * 原因：因为借用发货的原因
			 */

			if ("1".equals(instance.getShenhezt())
					&& (instance.getShenheyj() == null || ""
							.equals(instance.getShenheyj()))) {
				returnMsg.set("NO", "请填写审核意见！");
				return returnMsg;
			}
			Atzfahuotzshjl shenhejl = new Atzfahuotzshjl();
			shenhejl.setAtzfahuotzdid(instance.getId());
			shenhejl.setShenher((String) request.getSession().getAttribute(
					"employeeName"));
			shenhejl.setShenherq(new Date());
			shenhejl.setShenhezt(instance.getShenhezt());
			shenhejl.setShenheyj(instance.getShenheyj());
			dataset.add(shenhejl);
			String qz = instance.getBianhaoqz();
			if ("0".equals(instance.getShenhezt())) {
				instance.setDanjuzt("3");
				if (instance.getBianhao() != null
						&& instance.getBianhao().startsWith("T-")) {
					String rValueFahuo = null;
					String preLabel = (String) getBusinessTypeLabel(
							"fahuotzbmqz",qz);
					
					if ("1".equals(instance.getShifoujy())) {
						if("5".equals(qz)){
							paramMap.put("danjulx", "36");
						}else{
							paramMap.put("danjulx", "39");
						}
						rValueFahuo = execAdjustmentRule("A-生成正式编码规则-05",
								null, context, dataset, request, paramMap);
						rValueFahuo = rValueFahuo.replaceFirst("-", "");
					//	rValueFahuo = rValueFahuo.replaceFirst("F", preLabel);
						
						
					} else {
						paramMap.put("danjulx", qz);
						rValueFahuo = execAdjustmentRule("A-生成正式编码规则-05",
								null, context, dataset, request, paramMap);
						logger.error("正式编码 ：" + rValueFahuo);
						if (rValueFahuo.indexOf("-") > 0
								&& "34".equals(qz)) {
							rValueFahuo = rValueFahuo.replaceFirst("-", "");								
						}
					}
					// if(rValueFahuo.indexOf("F")>=0 &&
					// "1".equals(instance.getShifoujy())){
					// rValueFahuo = rValueFahuo.replaceFirst("F", "JF");
					if (rValueFahuo.equals("请先设置编码规则")
							|| rValueFahuo.equals("流水号溢出")) {
						// return rValueFahuo;
						returnMsg.set(rValueFahuo,
								"发货通知单编码规则未设置或者流水号溢出，请联系管理员！");
						return returnMsg;
					} else if ("Error".equals(rValueFahuo)) {
						// return "ERROR";
						returnMsg.set("ERROR", "发货通知单流水号溢出，请联系管理员！");
						return returnMsg;

					}
					logger.error("rValue" + rValueFahuo);
					instance.setBianhao(rValueFahuo);
					dataset.update(instance);
				}
				List<Atzfahuofwmx> fwmxList = dataset.getList(
						"Atzfahuofwmx", "fahuotzdid =" + instance.getId());
				if (fwmxList != null && fwmxList.size() > 0) {
					for (Iterator iter = fwmxList.iterator(); iter
							.hasNext();) {
						Atzfahuofwmx fwmx = (Atzfahuofwmx) iter.next();
						Atzhetonggz htgz = new Atzhetonggz();
						htgz.setFahuotzdid(instance.getId());
						htgz.setHetongid(instance.getHetongid());
						htgz.setJihuasj(fwmx.getJihuawcrq());
						if ("1".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("1"); // 到货
						if ("2".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("5"); // 工程督导
						if ("3".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("6"); // 开通
						if ("4".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("2"); // 初验
						if ("5".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("4"); // 到货
						if ("6".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("7"); // 保修
						if ("7".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("8"); // 终验
						if ("8".equals(fwmx.getGongchengjd()))
							htgz.setGenzonglx("9");
						if (htgz.getGenzonglx() != null
								&& !"".equals(htgz.getGenzonglx()))
							dataset.add(htgz);
					}
				}

				paramMap.put("danjulx", "10");
				String rValue = execAdjustmentRule("A-生成编码规则-05", null,
						context, dataset, request, paramMap);
				if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
					returnMsg.set(rValue, "出库计划单编码规则未设置或者流水号溢出，请联系管理员！");
					return returnMsg;
				} else if ("Error".equals(rValue)) {
					returnMsg.set("ERROR", "出库计划单流水号溢出，请联系管理员！");
					return returnMsg;
				} else {
					// 初始化单据编号、制单人、制单日期等信息
					Atzchurukjhd churukjhd = new Atzchurukjhd();

					churukjhd.setBianhao(rValue); // 编号
					churukjhd.setLinshibh(rValue); // 临时编号
					churukjhd.setDanjulx("1"); // 出入库单的单据类型，出库

					Atzhetong hetong = (Atzhetong) dataset.getObject(
							Atzhetong.class, instance.getHetongid());
					if (hetong != null) {
						if ("1".equals(hetong.getShifoujyht())) {
							churukjhd.setRenwuzt("12"); // 维护任务主题“合同借用”
							churukjhd.setChurukyy("53"); // 维护出入库原因为“合同借用发货”
						} else {
							churukjhd.setRenwuzt("11"); // 维护任务主题“合同发货”
							churukjhd.setChurukyy("3"); // 维护出入库原因为“合同发货”
						}
					} else {
						churukjhd.setRenwuzt("11"); // 维护任务主题“合同发货”
						churukjhd.setChurukyy("3"); // 维护出入库原因为“合同发货”
					}
					churukjhd.setXiangmuid(1552L);//项目ID，编号为103004
					churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
					churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
					churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
					churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
					churukjhd.setChuruknr(instance.getZhuti());
					churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
					churukjhd.setZhidanrq(new Date()); // 制单日期
					churukjhd.setShifouwc("2"); // 是否完成: 否
					churukjhd.setShifoufsh("2");// 是否反审核：否
					dataset.add(churukjhd);

					List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
					List<Atzfahuosbqdmx> fahuomxList = dataset.getList(
							"Atzfahuosbqdmx", "fahuotzdid="
									+ instance.getId());
					if (fahuomxList != null && fahuomxList.size() > 0) {
						for (Iterator iter = fahuomxList.iterator(); iter
								.hasNext();) {
							Atzfahuosbqdmx fahuomx = (Atzfahuosbqdmx) iter
									.next();
							Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
							churukjhmx.setAtzchurukjhdid(churukjhd.getId());
							List<Atzwuliaojcxx> wuliaoList = dataset
									.getList(
											"Atzwuliaojcxx",
											"wuliaosjxz ='0' and xiaoshoubmid ="
													+ fahuomx
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
							churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
							churukjhmx.setInitshuliang(fahuomx
									.getShuliang());
							churukjhmx.setShuliang(fahuomx.getShuliang());
							churukjhmx.setKuweiid(431139L);
							churukjhmx.setWeicrksl(null);
							churukjhmx.setLururq(new Date());
							churukjhdmxList.add(churukjhmx);
						}
					}
					if (churukjhdmxList.size() > 0)
						dataset.addAll(churukjhdmxList);
				}
			}
			return "OK";
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
