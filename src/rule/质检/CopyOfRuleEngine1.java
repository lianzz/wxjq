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
public class CopyOfRuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(CopyOfRuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzdaohuotzd instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			/**
			 * 修改的调整规则是A-到货通知单提交质检（生产检验单）-01 时间：2011.3.11
			 * 修改原因：增加判断到货的数量是否大于未到货数量，如果是 返回
			 */

			// 判断到货的数量是否大于未到货数量，如果是 返回
			// 改
			String hql2 = "from Atzdaohuotzdmx where atzdaohuotzdid="+ instance.getId();
			List<Atzdaohuotzdmx> daohuotzdmxList = dataset.getListByHql("Atzdaohuotzdmx", hql2);
			logger.debug("============到货通知单明细 调试1==============="+ daohuotzdmxList.size());
			if (daohuotzdmxList.size() > 0) {
				logger.debug("============ 调试2===============");
				for (int i = 0; i < daohuotzdmxList.size(); i++) {
					logger.debug("============ 调试3===============");
					Atzdaohuotzdmx daohuotzdmx = daohuotzdmxList.get(i);
					double daohuosl = daohuotzdmx.getDaohuosl();

					// 06H 修改
					// hql2 = "from Atzcaigouhtmx where caigouhtid="+
					// instance.getCaigouht() + " and wuliaoid="+
					// daohuotzdmx.getWuliaoid();
					Atzcaigouhtmx caigouhtmx = (Atzcaigouhtmx) dataset.getObject(Atzcaigouhtmx.class, daohuotzdmx.getCaigouhtmxid());
					
					
					double weidaohsl = caigouhtmx.getWeidaohsl();

					logger.debug("+++++++++到货数量+++++++" + daohuosl);
					logger.debug("+++++++++未到货数量+++++++" + weidaohsl);
					if (daohuosl >= 0.0 && weidaohsl >= 0.0) {
						if (daohuosl > weidaohsl) {
							logger.debug("+++++++++到货数量+++++++" + daohuosl);
							logger.debug("+++++++++未到货数量+++++++" + weidaohsl);
							return "NO2";
						}
					}
				}
			}
			// 改

			// 提交质检生产质检单
			paramMap.put("danjulx", "3");
			String rValuezhengshi = execAdjustmentRule("A-生成正式编码规则-05", null,context, dataset, request, paramMap);
			logger.debug("正式编码 ：" + rValuezhengshi);
			instance.setBianhao(rValuezhengshi);
			instance.setShifoutjzj("1");
			dataset.update(instance);
			paramMap.remove("danjulx");
			// 维护采购跟踪
			String hql = "from Atzcaigougz where caigouhtid="+ instance.getCaigouht();
			List<Atzcaigougz> caigougzList = dataset.getListByHql("Atzcaigougz", hql);
			logger.debug("+++++++++查找到的采购跟踪+++++++" + caigougzList.size());
			if (caigougzList.size() > 0) {
				for (int j = 0; j < caigougzList.size(); j++) {
					Atzcaigougz caigougz = caigougzList.get(j);
					caigougz.setDaohuotzdbh("," + caigougz.getDaohuotzdbh()+ instance.getBianhao());
					dataset.update(caigougz);
					logger.debug("+++++一条采购跟踪更新完毕++++++++");
				}
			}
			// hql =
			// "from Atzdaohuotzdmx where atzdaohuotzdid="+instance.getId();
			// List<Atzdaohuotzdmx> daohuotzdmxList
			// =dataset.getListByHql("Atzdaohuotzdmx", hql);
			logger.debug("============到货通知单明细==============="+ daohuotzdmxList.size());
			if (daohuotzdmxList.size() > 0) {
				for (int i = 0; i < daohuotzdmxList.size(); i++) {
					Atzdaohuotzdmx daohuotzdmx = daohuotzdmxList.get(i);

					// 把到货通知单的备注维护到采购跟踪的到货备注
					// 修改-开始
					if (daohuotzdmx != null) {

						// 06H 修改
						// String hql9 = "from Atzcaigougz where caigouhtid="+
						// instance.getCaigouht() + " and wuliaoid="+
						// daohuotzdmx.getWuliaoid();
						String hql9 = "from Atzcaigougz where caigouhtid="
								+ instance.getCaigouht() + " and wuliaoid="
								+ daohuotzdmx.getWuliaoid()
								+ " and hetongmxid="
								+ daohuotzdmx.getCaigouhtmxid()
                                + " and jihuamxid="+daohuotzdmx.getCaigoujhmxid();
						Atzcaigougz caigougz = (Atzcaigougz) dataset.getObjectByHql("Atzcaigougz", hql9);
						logger.debug("+++++采购跟踪ID++++++++" + caigougz.getId());
						if (caigougz != null && daohuotzdmx.getBeizhu() != null) {
							if (caigougz.getDaohuobz() != null) {
								caigougz.setDaohuobz(caigougz.getDaohuobz()
										+ "；" + daohuotzdmx.getBeizhu());
							} else {
								caigougz.setDaohuobz(daohuotzdmx.getBeizhu());
							}
							dataset.update(caigougz);
						}
					}
					// 修改-结束

					paramMap.put("danjulx", "8");
					String rValue = execAdjustmentRule("A-生成编码规则-05", null,
							context, dataset, request, paramMap);
					if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
						return "NO";
					} else if ("Error".equals(rValue)) {
						return "ERROR";
					} else {					
						Atzcaigouhtmx caigouhtmx = (Atzcaigouhtmx) dataset.getObject(Atzcaigouhtmx.class, daohuotzdmx.getCaigouhtmxid());
						
						double daohuosl = daohuotzdmx.getDaohuosl();
						double weidaohsl = caigouhtmx.getWeidaohsl();
						caigouhtmx.setWeidaohsl(weidaohsl - daohuosl);
						dataset.update(caigouhtmx);
						if (caigouhtmx.getWeidaohsl() == 0) {
							caigouhtmx.setShifoudh("1");
							dataset.update(caigouhtmx);
						}
						// 改
						if (caigouhtmx.getDinggousl() != caigouhtmx.getWeidaohsl()&& caigouhtmx.getWeidaohsl() > 0) {
							caigouhtmx.setShifoudh("3");
							dataset.update(caigouhtmx);

						}
						// 改
						logger.debug("==============采购合同明细ID========"+ caigouhtmx.getId());

						Long wuliaoid = daohuotzdmx.getWuliaoid(); // 物料ID
						Atzwuliaojcxx wljcxx = (Atzwuliaojcxx) dataset.getObject(Atzwuliaojcxx.class, wuliaoid);
						Atzjianyand jianyand = new Atzjianyand();
						jianyand.setBianhao(rValue);
						jianyand.setDaohuotzdid(instance.getId());
						jianyand.setCaigouhtid(instance.getCaigouht());
						//采购计划id通过采购合同明细通过采购计划明细获取,
						Atzcaigoujhmx jhmx=(Atzcaigoujhmx) dataset.getObject(Atzcaigoujhmx.class, caigouhtmx.getCaigoujhmxid());						
						jianyand.setCaigoujhid(jhmx.getCaigoujh());
						jianyand.setJianyandlx("1");
						jianyand.setLururq(new Date());
						jianyand.setShifouzx("2");
						jianyand.setDanjusc("2");
						jianyand.setJianyandzt("1");
						jianyand.setShifoulrbg("2");
						// yangsh----start
						jianyand.setWuliaobm(wljcxx.getWuliaobm()); // 物料编码
						jianyand.setWuliaoms(wljcxx.getWuliaoms()); // 物料描述
						// end

						// Atzdaohuotzdmx daohuotzdmx1=daohuotzdmxList.get(0);
						if (daohuotzdmx != null) {
							jianyand.setSjbeizhu(daohuotzdmx.getBeizhu());
						}

						jianyand.setShifoufsbg("2");
						Atzcaigouht caigouht = (Atzcaigouht) dataset.getObject(Atzcaigouht.class, instance.getCaigouht());
						caigouht.setZhixingzt("2");
						dataset.update(caigouht);
						if (!"".equals(caigouht.getGongyings())) {
							jianyand.setGongyings(caigouht.getGongyings());
						}
						String lurur = (String) request.getSession().getAttribute("employeeName");
						if (!"".equals(lurur)) {
							jianyand.setLurur(lurur);
							jianyand.setSongjianr(lurur);
							jianyand.setSongjianrq(new Date());
						} else {
							jianyand.setLurur("admin");
							jianyand.setSongjianr("admin");
						}
						if (caigouhtmx != null) {
							if (!"".equals(caigouhtmx.getShengchancs())) {
								jianyand.setChangshang(caigouhtmx
										.getShengchancs());
							} else {
								jianyand.setChangshang("");
							}
						} else {
							jianyand.setChangshang("");
						}
						Long tdygid = (Long) request.getSession().getAttribute(
								"teamEmployeeId");
						if (tdygid != null) {
							jianyand.setSongjianrid(tdygid);
						}
                      jianyand.setCaigouddh(caigouht.getDingdanbh());
						dataset.add(jianyand);
                      context.set("instance.atzjianyand", jianyand);
						context.set("atzjianyand.id", jianyand.getId());
						Atzjianyandmx jianyandmx = new Atzjianyandmx();
						jianyandmx.setAtzjianyandid(jianyand.getId());
						jianyandmx.setShifoulrbg("2");
						jianyandmx.setWuliaoid(daohuotzdmx.getWuliaoid());
						jianyandmx.setYrkshuliang(0.0);
						// 维护检验单的备注 beizhu
						jianyandmx.setBeizhu(daohuotzdmx.getBeizhu());
						// 修改结束
						jianyandmx.setDrkshuliang(0.0);
						jianyandmx.setMeidwsl(null);

						jianyandmx.setWeirksl(0.0);

						// 06H
						jianyandmx.setCaigouhtmxid(daohuotzdmx.getCaigouhtmxid());

						if (caigouhtmx == null) {
							logger.debug("=================采购合同未找到相应明细===========");
						} else {
							jianyandmx.setDinggousl(caigouhtmx.getDinggousl());
							if (!"".equals(caigouhtmx.getShengchancs())) {

							}
						}
						if (daohuotzdmx.getDaohuosl() != null) {
							jianyandmx.setLaihuosl(daohuotzdmx.getDaohuosl());
							jianyandmx.setShidiansl(daohuotzdmx.getDaohuosl());
						} else {
							jianyandmx.setLaihuosl(daohuotzdmx.getDaohuosl());
							jianyandmx.setShidiansl(daohuotzdmx.getDaohuosl());
						}

						dataset.add(jianyandmx);
					}

				}

				// 改

				String hql1 = "from Atzcaigouhtmx where caigouhtid="+ instance.getCaigouht();
				List<Atzcaigouhtmx> caigouhtmxList1 = dataset.getListByHql("Atzcaigouhtmx", hql1);
				// 合同中已经已经到货（未到货数量为0）的合同明显的条数
				int daohuots = 0;
				logger.debug("++++++++合同明显的条数+++++++++++"+ caigouhtmxList1.size());
				for (int i = 0; i < caigouhtmxList1.size(); i++) {
					Atzcaigouhtmx caigouhtmx = caigouhtmxList1.get(i);
					logger.debug("++++++++采购合同明显的未到货值+++++++++++"+ caigouhtmx.getWeidaohsl());
					if (caigouhtmx.getWeidaohsl() == 0) {
						daohuots++;
					}
				}

				logger.debug("++++++++合同中已经已经到货（未到货数量为0）的合同明显的条数+++++++++++"
						+ daohuots);
				if (daohuots == caigouhtmxList1.size()) {
					logger.debug("++++++++该合同已全部到货+++++++++++");
					hql1 = "from Atzcaigouht where id="+ instance.getCaigouht();
					Atzcaigouht caigouht = (Atzcaigouht) dataset.getObjectByHql("Atzcaigouht", hql1);
					caigouht.setShifouqbdh("1");
					dataset.update(caigouht);
				}

				// 改

				return "OK";
			}
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
