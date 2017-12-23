package code;

import java.util.*;
import java.util.Date;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzfahuosbqdmx_F56e7fca200000005zSub;
import com.actiz.platform.application.formdatafacility.model2.Fi_atzfahuosbqdmx_F608bff2700000009zSub;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.rule.application.ReturnMsg;
import com.actiz.resource.workflow.application.WorkflowAppHelper;

@SuppressWarnings("unused")
public class 发货通知单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(发货通知单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object methodName(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}

	private Object 仓库反馈意见(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单审核-仓库反馈意见-12
		 */
		String fahuotzdid = "" + context.get("atzfahuotzd.id");
		logger.error(fahuotzdid);
		List ids = (List) context.get("ids");
		logger.error(ids.size());
		List<Atzfahuosbqdmx> nList = (List<Atzfahuosbqdmx>) context.get("deletefhmx");
		logger.error(nList.size());
		Atzfahuotzd fhtzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, Long.parseLong(fahuotzdid));
		String yijian = instance.getShenheyj();
		if (yijian == null || "".equals(yijian)) {
			returnMsg.set("NO", "请填写确认意见, 反馈给市场部更改配置.");
			return returnMsg;
		}
		// start
		NodeDefine nodeDefine = getProcessNodeInfo(context);
		if (nodeDefine == null) {
			returnMsg.set("NO", "流程节点找不到,请联系管理员");
			return returnMsg;
		}
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		Long xmpzqdid = fhtzd.getXmpzqdid();
		Long yewuzcdid = null;
		if (xmpzqdid != null) {
			Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
			if (qd != null) {
				yewuzcdid = qd.getYewuzcd();
			}
		}
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {
				ywzc.setYwzt("6");
			}
		}
		fhtzd.setDanjuzt("3");
		// 生成出库计划
		paramMap.put("danjulx", "10");
		String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
		if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
			returnMsg.set(rValue, "出库计划单编码规则未设置或者流水号溢出，请联系管理员！");
			return returnMsg;
		} else if ("Error".equals(rValue)) {
			returnMsg.set("ERROR", "出库计划单流水号溢出，请联系管理员！");
			return returnMsg;
		}
		// 初始化单据编号、制单人、制单日期等信息
		Atzchurukjhd churukjhd = new Atzchurukjhd();
		churukjhd.setBianhao(rValue); // 编号
		churukjhd.setLinshibh(rValue); // 临时编号
		churukjhd.setDanjulx("1"); // 出入库单的单据类型，出库

		Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, fhtzd.getHetongid());
		churukjhd.setRenwuzt("11"); // 维护任务主题“合同发货”
		churukjhd.setChurukyy("3"); // 维护出入库原因为“合同发货”
		/*
		 * Long xiangmuid = hetong.getCbzx();
		 * 
		 * if (xiangmuid != null) { churukjhd.setXiangmuid(xiangmuid);// 成本中心 }
		 * else { churukjhd.setXiangmuid(1552L);// 项目ID，编号为103004 }
		 */
		// 根据合同归属公司, 维护出库计划项目号
		List<Atzxiangmu> xmList= dataset.getList("Atzxiangmu", "guishugs=" + hetong.getGuishugs());
		if (xmList != null && xmList.size() > 0) {
			Atzxiangmu xm = xmList.get(0);
			churukjhd.setXiangmuid(xm.getId());
		} else {
			churukjhd.setXiangmuid(1552L);// 默认103004项目号
		}
		churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
		churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
		churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
		churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
		// churukjhd.setChuruknr(instance.getZhuti());
		churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
		churukjhd.setZhidanrq(new Date()); // 制单日期
		churukjhd.setShifouwc("2"); // 是否完成: 否
		churukjhd.setShifoufsh("2");// 是否反审核：否
		// 发货通知单编号(空格)合同编号(空格)合同名称
		churukjhd.setChuruknr(instance.getBianhao() + " " + hetong.getHetongbh() + " " + hetong.getHetongmc());
		dataset.add(churukjhd);
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		// Long xmpzqdid=instance.getXmpzqdid();
		// Long yewuzcdid=null;
		/*
		 * if(xmpzqdid！=null){ Atzxiangmupzqd
		 * qd=(Atzxiangmupzqd)dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
		 * if(qd!=null){ yewuzcdid=qd.getYewuzcd(); }
		 * 
		 * }
		 */
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {
				ywzc.setYwzt("7");
				Atzzhixinggcgz zxgz = new Atzzhixinggcgz();
				zxgz.setYewuzcid(yewuzcdid);
				zxgz.setDanjumc("3");
				zxgz.setChukujhdid(churukjhd.getId());
				dataset.add(zxgz);
			}
		}
		List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
		// List<Atzfahuosbqdmx> fahuomxList =
		// dataset.getList("Atzfahuosbqdmx", "fahuotzdid=" +
		// instance.getId());
		for (Iterator iter = ids.iterator(); iter.hasNext();) {
			String selectId = (String) iter.next();
			Atzfahuosbqdmx fahuomx = (Atzfahuosbqdmx) dataset.getObject(Atzfahuosbqdmx.class, Long.parseLong(selectId));
			Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
			churukjhmx.setAtzchurukjhdid(churukjhd.getId());
			// 维护出库计划中的销售编码ID
			churukjhmx.setXiaoshoubmid(fahuomx.getXiaoshoubmid());
			List<Atzwuliaojcxx> wuliaoList = dataset.getList("Atzwuliaojcxx",
					"wuliaosjxz ='0' and xiaoshoubmid =" + fahuomx.getXiaoshoubmid() + " order by banbenpx asc");
			if (wuliaoList != null && wuliaoList.size() > 0) {
				Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
				churukjhmx.setWuliaoid(wuliao.getId());
				churukjhmx.setWuliaobm(wuliao.getWuliaobm());
				churukjhmx.setWuliaoms(wuliao.getWuliaoms());
				churukjhmx.setGuigedw(wuliao.getGuigedw());
				churukjhmx.setDanwei(wuliao.getDanwei());
			}
			churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
			churukjhmx.setInitshuliang(fahuomx.getShuliang());
			churukjhmx.setShuliang(fahuomx.getShuliang());
			churukjhmx.setKuweiid(431139L);
			churukjhmx.setWeicrksl(null);
			churukjhmx.setLururq(new Date());
			churukjhdmxList.add(churukjhmx);
		}
		if (churukjhdmxList.size() > 0)
			dataset.addAll(churukjhdmxList);

		String hql = "";
		String message = "";
		Atzxiangmupzqd pzqd = null;
		if (fhtzd.getXmpzqdid() != null) {
			pzqd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, fhtzd.getXmpzqdid());
			if (pzqd != null) {
				message += "项目配置清单:" + pzqd.getBianhao() + "<br>";
			}
		}
		message += "发货通知单:" + fhtzd.getId() + "<br>";
		message += "合同编号:" + hetong.getHetongbh() + "<br>销售编码:";
		for (Atzfahuosbqdmx dfhmx : nList) {
			// 设备清单已下达, 可下达
			hql = "from Atzshebeiqdmx where xiaoshoubmid=" + dfhmx.getXiaoshoubmid() + "and hetongid="
					+ fhtzd.getHetongid();
			Atzshebeiqdmx sbqdmx = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx", hql);
			// 已下达数量
			sbqdmx.setJhfhsl(com.actiz.util.MathUtil.sub(sbqdmx.getJhfhsl(), dfhmx.getShuliang()));
			// 可下达数量
			sbqdmx.setWeifhsl(com.actiz.util.MathUtil.add(sbqdmx.getWeifhsl(), dfhmx.getShuliang()));
			sbqdmx.setSjwfhsl(com.actiz.util.MathUtil.sub(sbqdmx.getJhfhsl(), sbqdmx.getYifhsh()));
			dataset.update(sbqdmx);
			message += dfhmx.getXiaoshoubm() + ", ";
			// 删除发货通知单的明细
			dfhmx.setBeizhu("" + dfhmx.getFahuotzdid());
			dfhmx.setFahuotzdid(null);
			dataset.update(dfhmx);
		}
		message += "的物料库存不足, 请配置清单变更后重新发货。<br>工程中心反馈信息: " + fhtzd.getShenheyj();
		// 提醒流程,配置清单变更提醒角色 配置清单创建人 发货通知单提交人 合同销售经理
		logger.debug(message);
		List<Long> txrEmpIds = new ArrayList<Long>();
		// 配置清单变更提醒角色
		List<Bc_auth_userrole> usrRoles = dataset.getListByHql("Bc_auth_userrole",
				"from Bc_auth_userrole where role_id=(select id from Bc_auth_roles where name='WF-配置清单变更提醒')");
		if (usrRoles != null && usrRoles.size() > 0) {
			for (Bc_auth_userrole bc_auth_userrole : usrRoles) {
				Atzemployee qdbgjs = (Atzemployee) dataset.getObjectByHql("Atzemployee",
						"from Atzemployee where id=(select yuangongid from Atztdyg where id=(select team_employee_id from Bc_auth_usr where id="
								+ bc_auth_userrole.getUser_id() + "))");
				if (qdbgjs != null) {
					txrEmpIds.add(qdbgjs.getId());
				}
			}
		}
		// 配置清单创建人
		if (pzqd != null) {
			txrEmpIds.add(pzqd.getLururid());
		}
		// 发货通知单提交人
		if (fhtzd.getZhidanr() != null) {
			Atzemployee fhtzdZhidanr = (Atzemployee) dataset.getObjectByHql("Atzemployee",
					"from Atzemployee where name='" + fhtzd.getZhidanr()+"'");
			if (fhtzdZhidanr != null) {
				txrEmpIds.add(fhtzdZhidanr.getId());
				// 合同销售经理, 如果发货通知单创建人为销售经理, 则不重复提醒
				if (!fhtzdZhidanr.getId().equals(hetong.getXiaoshoujl())) {
					txrEmpIds.add(hetong.getXiaoshoujl());
				}
			}
		}
		String empids = "";
		for (Long txr : txrEmpIds) {
			if (txr !=null && !"".equals(txr)) {
				empids += txr+",";
			}
		}
			Map map = new HashMap<String, String>();
			map.put("zhuti", "发货通知单:" + fhtzd.getBianhao() + " 有物料库存不足");
			map.put("neirong", message);
			logger.debug(empids);
			map.put("empid", empids.substring(0,empids.length()-1));
			ReturnMsg re = (ReturnMsg) execAdjRule("A-提醒提交功能-接口-06H", map);
			if ("NO".equals(re.getKey())) {
				return re;
			}
		// end
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			logger.error("发货通知单审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO", "发货通知单审核流程提交失败，请联系系统管理员");
			return returnMsg;
		}
		returnMsg.set("OK", "操作成功!");
		return returnMsg;
	}

	private Object 审核_仓库确认(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单审核保存后置-仓库确认-12
		 */
		String fahuotzdid = "" + context.get("atzfahuotzd.id");
		Atzfahuotzd fhtzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, Long.parseLong(fahuotzdid));
		if (fhtzd == null) {
			returnMsg.set("NO", "发货通知单找不到,请联系管理员");
			return returnMsg;
		}
		List<String> ids = context.getValueList("atzfahuosbqdmx.id");
		logger.debug("ids=====" + ids.size());
		if (ids == null || ids.size() <= 0) {
			returnMsg.set("NO", "至少选择一条发货通知单明细, 请检查");
			return returnMsg;
		}
		List<Atzfahuosbqdmx> nList = new ArrayList<Atzfahuosbqdmx>();// 未选择的明细清单
		List fhtzdmxList = dataset.getList("Atzfahuosbqdmx", "fahuotzdid=" + fahuotzdid);
		logger.debug("fhtzdmxList" + fhtzdmxList.size());
		String deleteIds = "(";
		if (fhtzdmxList.size() != ids.size()) {
			// 没有全选, 找到未选择的明细
			for (Iterator iterator = fhtzdmxList.iterator(); iterator.hasNext();) {
				Atzfahuosbqdmx fhmxx = (Atzfahuosbqdmx) iterator.next();
				if (!ids.contains(fhmxx.getId().toString())) {
					logger.debug(fhmxx.getXiaoshoubm());
					nList.add(fhmxx);
					deleteIds += fhmxx.getId() + ",";
				}
			}
		}
		// 没有全选, 跳转页面填写确认意见;
		if (nList != null && nList.size() > 0) {
			context.set("ids", ids);
			context.set("deletefhmx", nList);
			context.set("atzfahuotzd.id", fhtzd.getId());
			deleteIds = deleteIds.substring(0, deleteIds.length() - 1) + ")";
			logger.debug(deleteIds);
			context.set("deleteIds", deleteIds);
			return "OK1";
		}
		NodeDefine nodeDefine = getProcessNodeInfo(context);
		if (nodeDefine == null) {
			returnMsg.set("NO", "流程节点找不到,请联系管理员");
			return returnMsg;
		}
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		Long xmpzqdid = fhtzd.getXmpzqdid();
		Long yewuzcdid = null;
		if (xmpzqdid != null) {
			Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
			if (qd != null) {
				yewuzcdid = qd.getYewuzcd();
			}
		}
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {
				ywzc.setYwzt("6");
			}
		}
		fhtzd.setDanjuzt("3");
		// 生成出库计划
		paramMap.put("danjulx", "10");
		String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
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

			Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, fhtzd.getHetongid());
			churukjhd.setRenwuzt("11"); // 维护任务主题“合同发货”
			churukjhd.setChurukyy("3"); // 维护出入库原因为“合同发货”
			/*
			 * Long xiangmuid = hetong.getCbzx();
			 * 
			 * if (xiangmuid != null) { churukjhd.setXiangmuid(xiangmuid);//
			 * 成本中心 } else { churukjhd.setXiangmuid(1552L);// 项目ID，编号为103004 }
			 */
			// 根据合同归属公司, 维护出库计划项目号
			List<Atzxiangmu> xmList= dataset.getList("Atzxiangmu", "guishugs=" + hetong.getGuishugs());
			if (xmList != null && xmList.size() > 0) {
				Atzxiangmu xm = xmList.get(0);
				churukjhd.setXiangmuid(xm.getId());
			} else {
				churukjhd.setXiangmuid(1552L);// 默认103004项目号
			}
			churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
			churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
			churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
			churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
			// churukjhd.setChuruknr(instance.getZhuti());
			churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
			churukjhd.setZhidanrq(new Date()); // 制单日期
			churukjhd.setShifouwc("2"); // 是否完成: 否
			churukjhd.setShifoufsh("2");// 是否反审核：否
			// 发货通知单编号(空格)合同编号(空格)合同名称
			churukjhd.setChuruknr(instance.getBianhao() + " " + hetong.getHetongbh() + " " + hetong.getHetongmc());
			dataset.add(churukjhd);
			/**
			 * 此段插入代码维护业务支持联系单跟踪信息
			 * 
			 * @zjl
			 */
			// Long xmpzqdid=instance.getXmpzqdid();
			// Long yewuzcdid=null;
			/*
			 * if(xmpzqdid！=null){ Atzxiangmupzqd
			 * qd=(Atzxiangmupzqd)dataset.getObject(Atzxiangmupzqd.class,
			 * xmpzqdid); if(qd!=null){ yewuzcdid=qd.getYewuzcd(); }
			 * 
			 * }
			 */
			if (yewuzcdid != null) {
				Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
				if (ywzc != null) {
					ywzc.setYwzt("7");
					Atzzhixinggcgz zxgz = new Atzzhixinggcgz();
					zxgz.setYewuzcid(yewuzcdid);
					zxgz.setDanjumc("3");
					zxgz.setChukujhdid(churukjhd.getId());
					dataset.add(zxgz);
				}
			}
			List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
			// List<Atzfahuosbqdmx> fahuomxList =
			// dataset.getList("Atzfahuosbqdmx", "fahuotzdid=" +
			// instance.getId());
			for (Iterator iter = ids.iterator(); iter.hasNext();) {
				String selectId = (String) iter.next();
				Atzfahuosbqdmx fahuomx = (Atzfahuosbqdmx) dataset.getObject(Atzfahuosbqdmx.class,
						Long.parseLong(selectId));
				Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
				churukjhmx.setAtzchurukjhdid(churukjhd.getId());
				// 维护出库计划中的销售编码ID
				churukjhmx.setXiaoshoubmid(fahuomx.getXiaoshoubmid());
				List<Atzwuliaojcxx> wuliaoList = dataset.getList("Atzwuliaojcxx",
						"wuliaosjxz ='0' and xiaoshoubmid =" + fahuomx.getXiaoshoubmid() + " order by banbenpx asc");
				if (wuliaoList != null && wuliaoList.size() > 0) {
					Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
					churukjhmx.setWuliaoid(wuliao.getId());
					churukjhmx.setWuliaobm(wuliao.getWuliaobm());
					churukjhmx.setWuliaoms(wuliao.getWuliaoms());
					churukjhmx.setGuigedw(wuliao.getGuigedw());
					churukjhmx.setDanwei(wuliao.getDanwei());
				}
				churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
				churukjhmx.setInitshuliang(fahuomx.getShuliang());
				churukjhmx.setShuliang(fahuomx.getShuliang());
				churukjhmx.setKuweiid(431139L);
				churukjhmx.setWeicrksl(null);
				churukjhmx.setLururq(new Date());
				churukjhdmxList.add(churukjhmx);
			}
			if (churukjhdmxList.size() > 0)
				dataset.addAll(churukjhdmxList);
		}
		returnMsg.set("OK", "操作完成");
		return returnMsg;
	}

	private Object 发货通知单审核保存后置(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单审核保存后置-05
		 */
		if ("1".equals(instance.getShenhezt())
				&& (instance.getShenheyj() == null || "".equals(instance.getShenheyj()))) {
			returnMsg.set("NO", "请填写审核意见！");
			return returnMsg;
		}
		NodeDefine nodeDefine = getProcessNodeInfo(context);
		if (nodeDefine == null) {
			returnMsg.set("NO", "流程节点找不到,请联系管理员");
			return returnMsg;
		}
		Atzfahuotzshjl shenhejl = new Atzfahuotzshjl();
		shenhejl.setAtzfahuotzdid(instance.getId());
		shenhejl.setShenher(nodeDefine.getName() + "-" + (String) request.getSession().getAttribute("employeeName"));
		shenhejl.setShenherq(new Date());
		shenhejl.setShenhezt(instance.getShenhezt());
		shenhejl.setShenheyj(instance.getShenheyj());
		dataset.add(shenhejl);
		returnMsg.set("OK", "操作完成");
		return returnMsg;
	}

	private Object 最终审核通过规则(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单最终审核通过规则-05 功能：审核发货通知单 说明： 审核发货通知单，生成出库计划 引用： 合同管理 作者： 05 创建：
		 * 2010-10-27 修改：2010-12-24 原因：因为借用发货的原因
		 */

		if ("1".equals(instance.getShenhezt())
				&& (instance.getShenheyj() == null || "".equals(instance.getShenheyj()))) {
			returnMsg.set("NO", "请填写审核意见！");
			return returnMsg;
		}
		NodeDefine nodeDefine = getProcessNodeInfo(context);
		if (nodeDefine == null) {
			returnMsg.set("NO", "流程节点找不到,请联系管理员");
			return returnMsg;
		}
		Atzfahuotzshjl shenhejl = new Atzfahuotzshjl();
		shenhejl.setAtzfahuotzdid(instance.getId());
		// shenhejl.setShenher((String)
		// request.getSession().getAttribute("employeeName"));
		shenhejl.setShenher(nodeDefine.getName() + "-" + (String) request.getSession().getAttribute("employeeName"));
		shenhejl.setShenherq(new Date());
		shenhejl.setShenhezt(instance.getShenhezt());
		shenhejl.setShenheyj(instance.getShenheyj());
		dataset.add(shenhejl);
		// String qz = instance.getBianhaoqz();
		if ("0".equals(instance.getShenhezt())) {
			/**
			 * 此段插入代码维护业务支持联系单跟踪信息
			 * 
			 * @zjl
			 */
			Long xmpzqdid = instance.getXmpzqdid();
			Long yewuzcdid = null;
			if (xmpzqdid != null) {
				Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
				if (qd != null) {
					yewuzcdid = qd.getYewuzcd();
				}

			}
			if (yewuzcdid != null) {
				Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
				if (ywzc != null) {
					ywzc.setYwzt("6");

				}

			}

			instance.setDanjuzt("3");

			List<Atzfahuofwmx> fwmxList = dataset.getList("Atzfahuofwmx", "fahuotzdid =" + instance.getId());
			if (fwmxList != null && fwmxList.size() > 0) {
				for (Iterator iter = fwmxList.iterator(); iter.hasNext();) {
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
					if (htgz.getGenzonglx() != null && !"".equals(htgz.getGenzonglx()))
						dataset.add(htgz);
				}
			}

			paramMap.put("danjulx", "10");
			String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
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

				Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, instance.getHetongid());
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
				/*
				 * Long xiangmuid = hetong.getCbzx();
				 * 
				 * if (xiangmuid != null) { churukjhd.setXiangmuid(xiangmuid);//
				 * 成本中心 } else { churukjhd.setXiangmuid(1552L);// 项目ID，编号为103004
				 * }
				 */
				// 根据合同归属公司, 维护出库计划项目号
				Atzxiangmu xm = (Atzxiangmu) dataset.getList("Atzxiangmu", "guishugs=" + hetong.getGuishugs()).get(0);
				if (xm != null) {
					churukjhd.setXiangmuid(xm.getId());
				}
				churukjhd.setDanjuzt("1"); // 初始化单据状态“未提交”
				churukjhd.setDanjusc("2"); // 单据的生成方式，通过上级单据生成
				churukjhd.setShifouxn("2"); // 是否虚拟出入库，维护否
				churukjhd.setFahuotzdid(instance.getId()); // 维护发货通知单ID
				churukjhd.setChuruknr(instance.getZhuti());
				churukjhd.setZhidanr("admin"); // 制单人,针对于系统自动产生的维护成admin
				churukjhd.setZhidanrq(new Date()); // 制单日期
				churukjhd.setShifouwc("2"); // 是否完成: 否
				churukjhd.setShifoufsh("2");// 是否反审核：否
				churukjhd.setChuruknr(instance.getBianhao() + " " + hetong.getHetongbh() + " " + hetong.getHetongmc());// 发货通知单编号(空格)合同编号(空格)合同名称
				dataset.add(churukjhd);
				/**
				 * 此段插入代码维护业务支持联系单跟踪信息
				 * 
				 * @zjl
				 */
				// Long xmpzqdid=instance.getXmpzqdid();
				// Long yewuzcdid=null;
				/*
				 * if(xmpzqdid！=null){ Atzxiangmupzqd
				 * qd=(Atzxiangmupzqd)dataset.getObject(Atzxiangmupzqd.class,
				 * xmpzqdid); if(qd!=null){ yewuzcdid=qd.getYewuzcd(); }
				 * 
				 * }
				 */
				if (yewuzcdid != null) {
					Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
					if (ywzc != null) {
						ywzc.setYwzt("7");
						Atzzhixinggcgz zxgz = new Atzzhixinggcgz();
						zxgz.setYewuzcid(yewuzcdid);
						zxgz.setDanjumc("3");
						zxgz.setChukujhdid(churukjhd.getId());
						dataset.add(zxgz);

					}

				}

				List<Atzchurukjhdmx> churukjhdmxList = new ArrayList();
				List<Atzfahuosbqdmx> fahuomxList = dataset.getList("Atzfahuosbqdmx", "fahuotzdid=" + instance.getId());
				if (fahuomxList != null && fahuomxList.size() > 0) {
					for (Iterator iter = fahuomxList.iterator(); iter.hasNext();) {
						Atzfahuosbqdmx fahuomx = (Atzfahuosbqdmx) iter.next();
						Atzchurukjhdmx churukjhmx = new Atzchurukjhdmx();
						churukjhmx.setAtzchurukjhdid(churukjhd.getId());
						// 维护出库计划中的销售编码ID
						churukjhmx.setXiaoshoubmid(fahuomx.getXiaoshoubmid());
						List<Atzwuliaojcxx> wuliaoList = dataset.getList("Atzwuliaojcxx",
								"wuliaosjxz ='0' and xiaoshoubmid =" + fahuomx.getXiaoshoubmid()
										+ " order by banbenpx asc");
						if (wuliaoList != null && wuliaoList.size() > 0) {
							Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
							churukjhmx.setWuliaoid(wuliao.getId());
							churukjhmx.setWuliaobm(wuliao.getWuliaobm());
							churukjhmx.setWuliaoms(wuliao.getWuliaoms());
							churukjhmx.setGuigedw(wuliao.getGuigedw());
							churukjhmx.setDanwei(wuliao.getDanwei());
						}
						churukjhmx.setMeidwsl(fahuomx.getMeidwsl());
						churukjhmx.setInitshuliang(fahuomx.getShuliang());
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
	}

	private Object delete(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * 功能： 删除发货通知单 说明： 删除发货通知单，回写明细所对应设备清单明细的未发货数量 引用： 合同管理 作者： 05 创建：
		 * 2010-10-28 修改：2010-11-17 原因：添加回写设备清单明细未发货数量
		 */

		List<Atzfahuosbqdmx> fahuosbmxList = dataset.getList("Atzfahuosbqdmx", "fahuotzdid =" + instance.getId());
		if (fahuosbmxList != null && fahuosbmxList.size() > 0) {
			// for(Iterator iter1 =fahuosbmxList.iterator();iter1.hasNext();){
			// Atzfahuosbqdmx fahuomx = (Atzfahuosbqdmx)iter1.next();
			// if(fahuomx.getShebeiqdmxid() != null
			// &&fahuomx.getShebeiqdmxid()>0)
			// {
			// Atzshebeiqdmx shebeiqdmx =
			// (Atzshebeiqdmx)dataset.getObject(Atzshebeiqdmx.class,fahuomx.getShebeiqdmxid());
			// shebeiqdmx.setWeifhsl(shebeiqdmx.getWeifhsl()+fahuomx.getShuliang());
			// dataset.update(shebeiqdmx);
			// }
			// }
			dataset.deleteAll(fahuosbmxList);
		}
		List<Atzfahuofwmx> fahuofwList = dataset.getList("Atzfahuofwmx", "fahuotzdid =" + instance.getId());
		if (fahuofwList != null && fahuofwList.size() > 0)
			dataset.deleteAll(fahuofwList);
		dataset.delete(instance);
		context.remove("atzfahuotzd.id");
		return "OK";
	}

	private Object 提交(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单-提交-12
		 */
		/*
		 * 功能： 发货通知单提交启动流程 说明： 发货通知单提交启动流程，判断能否提交，并启动流程 引用： 合同管理 作者： 05
		 * 创建：2011-10-28 修改：2010-11-17 原因：添加回写设备清单明细未发货数量
		 */
		Long tdygId = (Long) request.getSession().getAttribute("teamEmployeeId");
		logger.error("tdygId==========" + tdygId);
		if (tdygId == null || tdygId <= 0) {
			returnMsg.set("cannotsubmit", "admin帐号不能进行提交！");
			return returnMsg;
		}
		Long id = Long.parseLong((String) context.get("atzfahuotzd.id"));
		Atzfahuotzd fahuotzd = (Atzfahuotzd) dataset.getObject(Atzfahuotzd.class, id);
		logger.debug("fahuotzd.id==========" + id);
		Long hetongid = fahuotzd.getHetongid();
		if (hetongid == null || "".equals(hetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, hetongid);
		if (hetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		List<Atzfahuosbqdmx> fhtzdmx = dataset.getListByHql("Atzfahuosbqdmx",
				"from Atzfahuosbqdmx where fahuotzdid='" + fahuotzd.getId() + "'");
		logger.error("fahuotzdid==========" + fahuotzd.getId());

		if (fhtzdmx.size() == 0 || fhtzdmx == null) {
			return "无明细";
		}
		Atzshebeiqdmx atzshebeiqdmx = null;
		for (int i = 0; i < fhtzdmx.size(); i++) {
			Atzfahuosbqdmx atzfahuosbqdmx = fhtzdmx.get(i);
			atzshebeiqdmx = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx", "from Atzshebeiqdmx where hetongid="
					+ hetongid + " and xiaoshoubmid=" + atzfahuosbqdmx.getXiaoshoubmid());
			if (atzshebeiqdmx == null) {
				returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				return returnMsg;
			}
			// 判断发货数量是否超过未发货数量
			if (atzshebeiqdmx.getWeifhsl().compareTo(atzfahuosbqdmx.getShuliang()) < 0) {
				returnMsg.set("NO", "第" + (i + 1) + "行发货数量超过发货通知单可下达数量");
				return returnMsg;
			}
			// 维护设备清单已下达发货量/未发货量
			atzshebeiqdmx
					.setJhfhsl(com.actiz.util.MathUtil.add(atzshebeiqdmx.getJhfhsl(), atzfahuosbqdmx.getShuliang()));
			atzshebeiqdmx.setSjwfhsl(com.actiz.util.MathUtil.sub(atzshebeiqdmx.getJhfhsl(), atzshebeiqdmx.getYifhsh()));
			atzshebeiqdmx
					.setWeifhsl(com.actiz.util.MathUtil.sub(atzshebeiqdmx.getWeifhsl(), atzfahuosbqdmx.getShuliang()));
			dataset.update(atzshebeiqdmx);
		}
		String windowId229 = null;
		if (context != null) {
			windowId229 = context.getId();
		}
		Map map229 = new HashMap();
		// 获取大区经理usrid
		Bc_auth_usr usr = null;
		try {
			Atzemployee xsjl = (Atzemployee) dataset.getObject(Atzemployee.class, fahuotzd.getXiaoshoujlid());
			Atzdepartment dep = (Atzdepartment) dataset.getObject(Atzdepartment.class, xsjl.getBumenid());
			Atzemployee fzr = (Atzemployee) dataset.getObject(Atzemployee.class, dep.getManagerid());
			usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
					"from Bc_auth_usr where team_employee_id=(select id from Atztdyg where yuangongid=" + fzr.getId()
							+ ")");
			if (usr == null) {
				throw new RuntimeException("usr is null");
			}
		} catch (Exception e) {
			returnMsg.set("NO", "查找大区经理出错,请联系管理员");
			return returnMsg;
		}
		Long result229 = null;
		if ("3".equals(hetong.getSjlx())) {
			map229.put("daqujl", usr.getId());
			result229 = WorkflowAppHelper.newProcessInstance(4072130L, map229, request, windowId229);
		} else if ("1".equals(hetong.getSjlx()) && !"3".equals(hetong.getHetonglx())) {
			// 合同发货 且不是零售发货
			map229.put("daqujl", usr.getId());
			result229 = WorkflowAppHelper.newProcessInstance(3887048L, map229, request, windowId229);
		} else {
			if ("3".equals(hetong.getLxlx())) {
				// 研发测试--研发经理审核
				result229 = WorkflowAppHelper.newProcessInstance(3882407L, map229, request, windowId229);
			} else {
				// 大区经理审核
				map229.put("daqujl", usr.getId());
				result229 = WorkflowAppHelper.newProcessInstance(3858799L, map229, request, windowId229);
			}
		}
		if (result229 <= 0) {
			return "NO";
		}
		instance.setDanjuzt("2");
		dataset.update(instance);
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		Long xmpzqdid = instance.getXmpzqdid();
		Long yewuzcdid = null;
		if (xmpzqdid != null) {
			Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
			if (qd != null) {
				yewuzcdid = qd.getYewuzcd();
			}

		}
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {

				ywzc.setYwzt("5");

			}
		}
		return "OK";
	}

	private Object 修改(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单修改-12
		 */
		// 合同id
		Long hetongid = instance.getHetongid();
		if (hetongid == null) {
			logger.error("合同id不存在");
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		// 判断明细是否符合
		Atzshebeiqdmx atzshebeiqdmx = null;
		List<Atzfahuosbqdmx> list = (List<Atzfahuosbqdmx>) context.get("subobjs");
		for (int i = 0; i < list.size(); i++) {
			Atzfahuosbqdmx atzfahuosbqdmx = list.get(i);
			// 判断是否重复
			List qmlist = dataset.getListByHql("Atzfahuosbqdmx",
					"from Atzfahuosbqdmx where fahuotzdid=" + instance.getId() + " and xiaoshoubmid="
							+ atzfahuosbqdmx.getXiaoshoubmid() + " and id != " + atzfahuosbqdmx.getId());
			if (qmlist != null && qmlist.size() > 0) {
				returnMsg.set("NO", "第" + (i + 1) + "行的销售编码已存在于该发货通知单中，请检查");
				return returnMsg;
			}
			atzfahuosbqdmx.setFahuotzdid(instance.getId());
			// 维护冗余字段
			Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class,
					atzfahuosbqdmx.getXiaoshoubmid());
			if (xiaoshoubm == null) {
				logger.error("销售编码查询异常");
				logger.error("id==" + atzfahuosbqdmx.getXiaoshoubmid());
				returnMsg.set("NO", "系统异常，请联系系统管理员");
			}
			atzfahuosbqdmx.setXiaoshoubm(xiaoshoubm.getBianma());
			atzfahuosbqdmx.setGuigedw(xiaoshoubm.getGuigedw());
			atzfahuosbqdmx.setDanwei(xiaoshoubm.getDanwei());
			atzfahuosbqdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
			atzfahuosbqdmx.setLururq(new Date());
		}
		returnMsg.set("OK", "修改成功");
		return returnMsg;
	}

	private Object A_选择设备清单明细时_新增发货通知单_12(Atzfahuotzd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_选择设备清单明细时_新增发货通知单_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		if (hetongid == null || "".equals(hetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(hetongid));
		if (hetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}

		Atzxiaoshoubm xiaoshoubm = null;
		List<Fi_atzfahuosbqdmx_F608bff2700000009zSub> fahuomxList = new ArrayList();
		List<String> ids = context.getValueList("atzshebeiqdmx.id");
		for (String sbqdid : ids) {
			Atzshebeiqdmx atzshebeiqdmx = (Atzshebeiqdmx) dataset.getObject(Atzshebeiqdmx.class,
					Long.parseLong(sbqdid));
			Fi_atzfahuosbqdmx_F608bff2700000009zSub fahuomx = new Fi_atzfahuosbqdmx_F608bff2700000009zSub();
			xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, atzshebeiqdmx.getXiaoshoubmid());
			fahuomx.setAtzfahuosbqdmx_xiaoshoubmid(xiaoshoubm.getId());
			fahuomx.setAtzfahuosbqdmx_meidwsl(null);
			fahuomx.setAtzxiaoshoubm_wuliaoms(xiaoshoubm.getWuliaoms());
			fahuomx.setAtzxiaoshoubm_danwei(xiaoshoubm.getDanwei());
			fahuomx.setAtzxiaoshoubm_guigedw(xiaoshoubm.getGuigedw());
			fahuomx.setAtzfahuosbqdmx_shuliang(atzshebeiqdmx.getWeifhsl());
			fahuomxList.add(fahuomx);
		}
		// 初始化单据编号、制单人、制单日期等信息

		Atzfahuotzd fahuotzd = new Atzfahuotzd();
		if ("2".equals(hetong.getSjlx())) {
			fahuotzd.setFahuolxlx(hetong.getLxlx());
		} else if ("3".equals(hetong.getSjlx())) {
			fahuotzd.setFahuolxlx("11");
		} else {
			fahuotzd.setFahuolxlx("10");
		}
		// 生成编号
		paramMap.put("danjulx", "5");
		String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
		if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
			returnMsg.set(rValue, "发货通知单编码规则未设置或者流水号溢出，请联系管理员！");
			return returnMsg;
		} else if ("Error".equals(rValue)) {
			returnMsg.set("ERROR", "发货通知单流水号溢出，请联系管理员！");
			return returnMsg;
		} else {
			fahuotzd.setBianhao(rValue);
		}
		// 维护销售经理
		fahuotzd.setXiaoshoujlid(hetong.getXiaoshoujl());
		Atzemployee xiaoshoujl = (Atzemployee) dataset.getObject(Atzemployee.class, hetong.getXiaoshoujl());
		if (xiaoshoujl != null) {
			fahuotzd.setKehujl(xiaoshoujl.getName());
			fahuotzd.setXiaoshoujl(xiaoshoujl.getName());
			fahuotzd.setLianxidh(xiaoshoujl.getMobile());
			fahuotzd.setXsjllxfs(xiaoshoujl.getMobile());
		}
		// 维护工程项目经理
		String xmjl = hetong.getXiangmujl();
		fahuotzd.setGcxmjl(xmjl);
		Atzemployee xmjlemp = (Atzemployee) dataset.getObjectByHql("Atzemployee",
				"from Atzemployee where name='" + xmjl + "'");
		if (xmjlemp != null) {
			fahuotzd.setGcxmjllxfs(xmjlemp.getMobile());
		}
		// fahuotzd.setFahuotzdlx("1");
		fahuotzd.setZhidanr((String) request.getSession().getAttribute("employeeName"));
		fahuotzd.setZhidanrq(new Date());
		fahuotzd.setHetongid(hetong.getId());
		fahuotzd.setKehuid(hetong.getKehuid());

		context.set("instance.atzfahuotzd", fahuotzd);
		context.set("instancelist.atzfahuosbqdmx", fahuomxList);
		return "OK";
	}

	private Object A_选择设备清单明细_全部选择_新增发货通知单_12(Atzfahuotzd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A_选择设备清单明细_全部选择_新增发货通知单_12
		 */
		String hetongid = (String) context.get("atzhetong.id");
		if (hetongid == null || "".equals(hetongid)) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(hetongid));
		if (hetong == null) {
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		List<Atzshebeiqdmx> sbqdmxs = dataset.getListByHql("Atzshebeiqdmx",
				"from Atzshebeiqdmx where hetongid=" + hetongid + " and weifhsl>0");
		if (sbqdmxs == null || sbqdmxs.size() <= 0) {
			returnMsg.set("NO", "没有未发货明细,无法新建发货通知单");
		}
		Atzxiaoshoubm xiaoshoubm = null;
		List<Fi_atzfahuosbqdmx_F608bff2700000009zSub> fahuomxList = new ArrayList();
		for (Atzshebeiqdmx atzshebeiqdmx : sbqdmxs) {
			Fi_atzfahuosbqdmx_F608bff2700000009zSub fahuomx = new Fi_atzfahuosbqdmx_F608bff2700000009zSub();
			xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, atzshebeiqdmx.getXiaoshoubmid());
			fahuomx.setAtzfahuosbqdmx_xiaoshoubmid(xiaoshoubm.getId());
			fahuomx.setAtzfahuosbqdmx_meidwsl(null);
			fahuomx.setAtzxiaoshoubm_wuliaoms(xiaoshoubm.getWuliaoms());
			fahuomx.setAtzxiaoshoubm_danwei(xiaoshoubm.getDanwei());
			fahuomx.setAtzxiaoshoubm_guigedw(xiaoshoubm.getGuigedw());
			fahuomx.setAtzfahuosbqdmx_shuliang(atzshebeiqdmx.getWeifhsl());
			fahuomxList.add(fahuomx);
		}
		// 初始化单据编号、制单人、制单日期等信息
		Atzfahuotzd fahuotzd = new Atzfahuotzd();
		if ("2".equals(hetong.getSjlx())) {
			fahuotzd.setFahuolxlx(hetong.getLxlx());
		} else if ("3".equals(hetong.getSjlx())) {
			fahuotzd.setFahuolxlx("11");
		} else {
			fahuotzd.setFahuolxlx("10");
		}
		paramMap.put("danjulx", "5");
		String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
		if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
			returnMsg.set(rValue, "发货通知单编码规则未设置或者流水号溢出，请联系管理员！");
			return returnMsg;
		} else if ("Error".equals(rValue)) {
			returnMsg.set("ERROR", "发货通知单流水号溢出，请联系管理员！");
			return returnMsg;
		} else {
			fahuotzd.setBianhao(rValue);
		}
		// 维护销售经理
		fahuotzd.setXiaoshoujlid(hetong.getXiaoshoujl());
		Atzemployee xiaoshoujl = (Atzemployee) dataset.getObject(Atzemployee.class, hetong.getXiaoshoujl());
		if (xiaoshoujl != null) {
			fahuotzd.setKehujl(xiaoshoujl.getName());
			fahuotzd.setXiaoshoujl(xiaoshoujl.getName());
			fahuotzd.setLianxidh(xiaoshoujl.getMobile());
			fahuotzd.setXsjllxfs(xiaoshoujl.getMobile());
		}
		// 维护工程项目经理
		String xmjl = hetong.getXiangmujl();
		fahuotzd.setGcxmjl(xmjl);
		Atzemployee xmjlemp = (Atzemployee) dataset.getObjectByHql("Atzemployee",
				"from Atzemployee where name='" + xmjl + "'");
		if (xmjlemp != null) {
			fahuotzd.setGcxmjllxfs(xmjlemp.getMobile());
		}
		// fahuotzd.setFahuotzdlx("1");
		fahuotzd.setZhidanr((String) request.getSession().getAttribute("employeeName"));
		fahuotzd.setZhidanrq(new Date());
		fahuotzd.setHetongid(hetong.getId());
		fahuotzd.setKehuid(hetong.getKehuid());

		context.set("instance.atzfahuotzd", fahuotzd);
		context.set("instancelist.atzfahuosbqdmx", fahuomxList);
		return "OK";
	}

	private Object A_选择合同或立项_新增发货通知单_12(Atzfahuotzd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * 1 A_选择合同或立项_新增发货通知单_12
		 */
		String atzhetongId = (String) context.get("atzhetong.id");
		logger.error("atzhetong.id = " + atzhetongId);
		return "OK";
	}

	private Object A_发货通知单新增选择项目配置清单_12(Atzfahuotzd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知单新增选择项目配置清单-12
		 */
		/**
		 * 功能： 初始化发货通知设备明细 说明： 根据项目配置清单，初始化发货设备清单明细 引用： 合同管理 作者： 12 创建：
		 * 2012-09-26 修改： 原因：
		 */
		// List <String> shebeiqdmxIdList =
		// context.getValueList("atzshebeiqdmx.id");
		String xiangmupzid = (String) context.get("atzxiangmupzqd.id");
		List<Fi_atzfahuosbqdmx_F56e7fca200000005zSub> fahuomxList = new ArrayList();
		if (xiangmupzid != null) {
			logger.debug("xiangmupzid===========" + xiangmupzid);
			List<Atzxiangmupzmx> pzmxs = dataset.getList("Atzxiangmupzmx", "xiangmupzqdid=" + xiangmupzid);
			if (pzmxs != null && pzmxs.size() > 0) {
				Atzxiaoshoubm xiaoshoubm = null;
				for (Atzxiangmupzmx pzmx : pzmxs) {
					Fi_atzfahuosbqdmx_F56e7fca200000005zSub fahuomx = new Fi_atzfahuosbqdmx_F56e7fca200000005zSub();
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, pzmx.getBujianh());
					fahuomx.setAtzfahuosbqdmx_xiaoshoubmid(xiaoshoubm.getId());

					fahuomx.setAtzfahuosbqdmx_meidwsl(null);

					// fahuomx.setAtzfahuosbqdmx_xiaoshoubmidRef(xiaoshoubm);
					fahuomx.setAtzxiaoshoubm_wuliaoms(xiaoshoubm.getWuliaoms());
					fahuomx.setAtzxiaoshoubm_danwei(xiaoshoubm.getDanwei());
					fahuomx.setAtzxiaoshoubm_guigedw(xiaoshoubm.getGuigedw());

					fahuomx.setAtzfahuosbqdmx_shuliang(pzmx.getShuliang());
					fahuomxList.add(fahuomx);
				}
				String hetongId = (String) context.get("atzhetong.id");
				logger.error("hetongid==========" + hetongId);
				if (hetongId == null || "".equals(hetongId)) {
					returnMsg.set("NO", "系统运行异常，请联系系统管理员");
				}
				Atzhetong hetong = (Atzhetong) dataset.getObject(Atzhetong.class, Long.parseLong(hetongId));
				Long tdygId = (Long) request.getSession().getAttribute("teamEmployeeId");
				String bianmaqz = "5";
				Atztdyg tdyg = (Atztdyg) dataset.getObject("Atztdyg", tdygId);
				// 初始化单据编号、制单人、制单日期等信息
				Atzfahuotzd fahuotzd = new Atzfahuotzd();
				if ("2".equals(hetong.getSjlx())) {
					fahuotzd.setFahuolxlx(hetong.getLxlx());
				} else if ("3".equals(hetong.getSjlx())) {
					fahuotzd.setFahuolxlx("11");
				} else {
					fahuotzd.setFahuolxlx("10");
				}
				paramMap.put("danjulx", "5");
				String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
				if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
					returnMsg.set(rValue, "发货通知单编码规则未设置或者流水号溢出，请联系管理员！");
					return returnMsg;
				} else if ("Error".equals(rValue)) {
					returnMsg.set("ERROR", "发货通知单流水号溢出，请联系管理员！");
					return returnMsg;
				} else {
					fahuotzd.setBianhao(rValue);
				}
				// 维护销售经理
				fahuotzd.setXiaoshoujlid(hetong.getXiaoshoujl());
				Atzemployee xiaoshoujl = (Atzemployee) dataset.getObject(Atzemployee.class, hetong.getXiaoshoujl());
				if (xiaoshoujl != null) {
					fahuotzd.setKehujl(xiaoshoujl.getName());
					fahuotzd.setXiaoshoujl(xiaoshoujl.getName());
					fahuotzd.setLianxidh(xiaoshoujl.getMobile());
					fahuotzd.setXsjllxfs(xiaoshoujl.getMobile());
				}
				// 维护工程项目经理
				String xmjl = hetong.getXiangmujl();
				fahuotzd.setGcxmjl(xmjl);
				Atzemployee xmjlemp = (Atzemployee) dataset.getObjectByHql("Atzemployee",
						"from Atzemployee where name='" + xmjl + "'");
				if (xmjlemp != null) {
					fahuotzd.setGcxmjllxfs(xmjlemp.getMobile());
				}
				// fahuotzd.setFahuotzdlx("1");
				fahuotzd.setZhidanr((String) request.getSession().getAttribute("employeeName"));
				fahuotzd.setZhidanrq(new Date());
				fahuotzd.setHetongid(hetong.getId());
				fahuotzd.setKehuid(hetong.getKehuid());

				fahuotzd.setXmpzqdid(Long.parseLong(xiangmupzid));
				context.set("instance.atzfahuotzd", fahuotzd);
				context.set("instancelist.atzfahuosbqdmx", fahuomxList);
			}
		}
		return "OK";
	}

	private Object 发货通知设备新增后置(Atzfahuotzd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-发货通知设备新增-12 功能：数据校验 销售编码 不能重复 销售编码 在设备清单明细中必须存在
		 */
		// 合同id
		Long hetongid = instance.getHetongid();
		if (hetongid == null) {
			logger.error("合同id不存在");
			returnMsg.set("NO", "系统运行异常，请联系系统管理员");
			return returnMsg;
		}
		// 判断明细是否符合
		Atzshebeiqdmx atzshebeiqdmx = null;
		List<Atzfahuosbqdmx> list = (List<Atzfahuosbqdmx>) context.get("subobjs");
		for (int i = 0; i < list.size(); i++) {
			Atzfahuosbqdmx atzfahuosbqdmx = list.get(i);
			// 判断是否重复
			List qmlist = dataset.getListByHql("Atzfahuosbqdmx", "from Atzfahuosbqdmx where fahuotzdid="
					+ instance.getId() + " and xiaoshoubmid=" + atzfahuosbqdmx.getXiaoshoubmid());
			if (qmlist != null && qmlist.size() > 0) {
				returnMsg.set("NO", "第" + (i + 1) + "行的销售编码已存在于该发货通知单中，请检查");
				return returnMsg;
			}
			atzfahuosbqdmx.setFahuotzdid(instance.getId());
			// 维护冗余字段
			Atzxiaoshoubm xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class,
					atzfahuosbqdmx.getXiaoshoubmid());
			if (xiaoshoubm == null) {
				logger.error("销售编码查询异常");
				logger.error("id==" + atzfahuosbqdmx.getXiaoshoubmid());
				returnMsg.set("NO", "系统异常，请联系系统管理员");
			}
			List<Atzwuliaojcxx> wuliaoList = dataset.getList("Atzwuliaojcxx",
					"wuliaosjxz ='0' and xiaoshoubmid =" + atzfahuosbqdmx.getXiaoshoubmid()
							+ " order by banbenpx asc");
			if (wuliaoList != null && wuliaoList.size() > 0) {
				Atzwuliaojcxx wuliao = (Atzwuliaojcxx) wuliaoList.get(0);
				atzfahuosbqdmx.setWuliaoid(wuliao.getId());
			}			
			atzfahuosbqdmx.setXiaoshoubm(xiaoshoubm.getBianma());
			atzfahuosbqdmx.setGuigedw(xiaoshoubm.getGuigedw());
			atzfahuosbqdmx.setDanwei(xiaoshoubm.getDanwei());
			atzfahuosbqdmx.setWuliaoms(xiaoshoubm.getWuliaoms());
			atzfahuosbqdmx.setLururq(new Date());
		}
		// 根据发货类型生成编号
		/**
		 * 此段插入代码维护业务支持联系单跟踪信息
		 * 
		 * @zjl
		 */
		Long xmpzqdid = instance.getXmpzqdid();
		Long yewuzcdid = null;
		if (xmpzqdid != null) {
			Atzxiangmupzqd qd = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, xmpzqdid);
			if (qd != null) {
				yewuzcdid = qd.getYewuzcd();
			}

		}
		if (yewuzcdid != null) {
			Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
			if (ywzc != null) {
				ywzc.setYwzt("3");
				Atzzhixinggcgz zxgz = new Atzzhixinggcgz();
				zxgz.setYewuzcid(yewuzcdid);
				zxgz.setDanjumc("2");
				zxgz.setFahuotzdid(instance.getId());
				dataset.add(zxgz);
			}

		}
		instance.setFahuotzdlx("1");
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}
}
