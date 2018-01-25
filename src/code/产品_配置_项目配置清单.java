package code;

import java.util.*;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NodeDefine;
import com.actiz.platform.application.dataset.pojo.*;

import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.basic.application.AttachmentResource;
import com.actiz.resource.workflow.application.WorkflowAppHelper;
import com.actiz.util.MathUtil;

import jxl.Sheet;
import jxl.Workbook;

@SuppressWarnings("unused")
public class 产品_配置_项目配置清单 extends RuleEngine {
	private static Logger logger = Logger.getLogger(产品_配置_项目配置清单.class);
	AProxy a = new AProxy();
	AProxy A = a;

	public Object methodName(Object instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	public Object A变更按钮(Object instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * AJ-项目配置清单-变更按钮-12
		 */
		Long objectId = (Long) paramMap.get("objectId"); // 获取按钮相关记录对象的ID
		Atzxiangmupzqd obj = (Atzxiangmupzqd) dataset.getObject(Atzxiangmupzqd.class, objectId);
		HashMap configs = new HashMap();
		/*
		 * 没有快照的历史数据不能做变更
		 */
		List list  = dataset.getList("Atzxiangmupzmx","shifouls='1' and xiangmupzqdid="+obj.getId());
		if (list == null || list.size() <= 0) {
			configs.put("active",false);
			return configs;
		}
		String djzt = obj.getDanjuzt();
		if("3".equals(djzt) || "5".equals(djzt) ){
		  configs.put("active",true);
		  return configs;
		}
		configs.put("active",false);
		return configs;
	}

	private Object 变更审核(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-项目配置清单变更审核-12
		 */
		Long hetongid = instance.getHetongid();
		if (dataset.getObject(Atzhetong.class, hetongid) == null) {
			returnMsg.set("NO", "关联合同不存在, 无法更新设备清单.");
			return returnMsg;
		}
		String shenhezt = instance.getShzt();
		String shyj = instance.getShyj();
		NodeDefine nodeDefine = getProcessNodeInfo(context);
		if (nodeDefine == null) {
			returnMsg.set("NO", "流程节点为空, 请联系系统管理员");
			return returnMsg;
		}
		String nodeName = nodeDefine.getName();
		// 不通过
		if ("1".equals(shenhezt)) {
			if (shyj == null || "".equals(shyj)) {
				returnMsg.set("NO", "审核意见不能为空!");
				return returnMsg;
			}
			boolean result = completeWorkflowTask(request, context);
			if (!result) {
				returnMsg.set("NO", "流程提交失败, 请联系系统管理员");
				return returnMsg;
			} else {
				String empname = (String) request.getSession().getAttribute("employeeName");
				// 新增流程审核记录
				Atzlcshenhejl sh = new Atzlcshenhejl();
				sh.setRenwulx(nodeName != null ? nodeName : "审核");
				sh.setShenher(empname);
				sh.setShenherq(new Date());
				sh.setShenhezt(shenhezt);
				sh.setShenheyj(shyj);
				sh.setDanjuid(instance.getId());
				sh.setYewudlx("14");
				dataset.add(sh);
			}
			// 删除历史记录
			dataset.batchUpdate("Atzpzmxbgjl", "delete Atzpzmxbgjl where danjuzt='2' and pzid=" + instance.getId());
			instance.setDanjuzt("5");
			returnMsg.set("OK", "提交成功");
			return returnMsg;
		}
		// 审核通过
		if ("产品市场总监审核".equals(nodeName)) {
			// 获取历史记录
			// 变更设备清单
			List<Atzpzmxbgjl> bgList = dataset.getList("Atzpzmxbgjl", "danjuzt='2' and pzid=" + instance.getId());
			Atzshebeiqdmx sbqd = null;
			List<Atzshebeiqdmx> add_sbqds = new ArrayList<Atzshebeiqdmx>();
			List<Atzshebeiqdmx> update_sbqds = new ArrayList<Atzshebeiqdmx>();
			Atzxiaoshoubm xiaoshoubm = null;
			for (Iterator iterator = bgList.iterator(); iterator.hasNext();) {
				Atzpzmxbgjl bgjl = (Atzpzmxbgjl) iterator.next();
				List list = dataset.getList("Atzshebeiqdmx",
						"hetongid=" + hetongid + " and xiaoshoubmid=" + bgjl.getBujianhao());
				if (list != null && list.size() > 0) {
					if (list.size() > 1) {
						returnMsg.set("NO", "合同下的设备清单重复, 请联系系统管理员");
						return returnMsg;
					}
					// 清单中已有该编码
					sbqd = (Atzshebeiqdmx) list.get(0);
					// number = 变更后 - 变更前
					// sbqd配置数量/可下达数量 = 原来数量 + number
					double number = com.actiz.util.MathUtil.sub(bgjl.getHshuliang(), bgjl.getQshuliang());
					// double qshuliang = sbqd.getShuliang();
					sbqd.setShuliang(com.actiz.util.MathUtil.add(sbqd.getShuliang(), number));
					sbqd.setWeifhsl(com.actiz.util.MathUtil.add(sbqd.getWeifhsl(), number));
					update_sbqds.add(sbqd);
				} else {
					// 清单中没有, 新增记录
					sbqd = new Atzshebeiqdmx();
					sbqd.setXiaoshoubmid(bgjl.getBujianhao());
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, bgjl.getBujianhao());
					if (xiaoshoubm != null) {
						sbqd.setXiaoshoubm(xiaoshoubm.getBianma());
						sbqd.setWuliaoms(xiaoshoubm.getWuliaoms());
					}
					sbqd.setDanwei(bgjl.getDanwei());
					sbqd.setLururq(new Date());
					sbqd.setHetongid(hetongid);
					sbqd.setShuliang(bgjl.getHshuliang());
					sbqd.setWeifhsl(bgjl.getHshuliang());
					sbqd.setSjwfhsl(0d);
					sbqd.setJhdtksl(0d);
					add_sbqds.add(sbqd);
				}
				bgjl.setDanjuzt("3");
				dataset.update(bgjl);
			}
			dataset.addAll(add_sbqds);
			dataset.updateAll(update_sbqds);

			// 删除旧的快照
			dataset.batchUpdate("Atzxiangmupzmx",
					"delete Atzxiangmupzmx where shifouls='1' and xiangmupzqdid=" + instance.getId());
			// 保存最新快照
			List<Atzxiangmupzmx> pzmxList = dataset.getList("Atzxiangmupzmx", "xiangmupzqdid=" + instance.getId());
			List<Atzxiangmupzmx> snapshots = new ArrayList<Atzxiangmupzmx>();
			for (Iterator iterator = pzmxList.iterator(); iterator.hasNext();) {
				Atzxiangmupzmx pzmx = (Atzxiangmupzmx) iterator.next();
				Atzxiangmupzmx snapshot = new Atzxiangmupzmx();
				snapshot.setXiangmupzqdid(pzmx.getXiangmupzqdid());
				snapshot.setBujianh(pzmx.getBujianh());
				snapshot.setShuliang(pzmx.getShuliang());
				snapshot.setChangjia(pzmx.getChangjia());
				snapshot.setMuluj(pzmx.getMuluj());
				snapshot.setChandi(pzmx.getChandi());
				snapshot.setDanjia(pzmx.getDanjia());
				snapshot.setDanwei(pzmx.getDanwei());
				snapshot.setZhekou(pzmx.getZhekou());
				snapshot.setHeji(pzmx.getHeji());
				snapshot.setBeizhu(pzmx.getBeizhu());
				// 快照数据
				snapshot.setShifouls("1");
				snapshots.add(snapshot);
			}
			dataset.addAll(snapshots);

			instance.setDanjuzt("3");
		}
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			returnMsg.set("NO", "流程提交失败, 请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
			// 新增流程审核记录
			Atzlcshenhejl sh = new Atzlcshenhejl();
			sh.setRenwulx(nodeName != null ? nodeName : "审核");
			sh.setShenher(empname);
			sh.setShenherq(new Date());
			sh.setShenhezt(shenhezt);
			sh.setShenheyj(shyj);
			sh.setDanjuid(instance.getId());
			sh.setYewudlx("14");
			dataset.add(sh);
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object 变更提交(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-项目配置清单-变更提交-12
		 */
		List<Atzxiangmupzmx> pzmxList = dataset.getList("Atzxiangmupzmx",
				"shifouls='2' and xiangmupzqdid=" + instance.getId());
		List<Atzxiangmupzmx> oldpzmxList = dataset.getList("Atzxiangmupzmx",
				"shifouls='1' and xiangmupzqdid=" + instance.getId());
		Atzpzmxbgjl history = null;
		List<Atzpzmxbgjl> historyList = new ArrayList<Atzpzmxbgjl>();
		boolean flag = true;
		for (Iterator iterator = oldpzmxList.iterator(); iterator.hasNext();) {
			Atzxiangmupzmx old = (Atzxiangmupzmx) iterator.next();
			flag = true;// true=记录被删除;false=记录被修改
			for (Iterator iterator2 = pzmxList.iterator(); iterator2.hasNext();) {
				Atzxiangmupzmx subobj = (Atzxiangmupzmx) iterator2.next();
				if (old.getBujianh().equals(subobj.getBujianh())) {
					flag = false;// 找到部件号相同的数据
					if (old.getShuliang().compareTo(subobj.getShuliang()) == 0) {
						break;// 部件号相同, 且数量相等
					} else {
						// 部件号相同, 且数量不等, 记录变更信息
						history = new Atzpzmxbgjl();
						history.setXiangmupzmxid(old.getId());
						history.setPzid(old.getXiangmupzqdid());
						history.setBujianhao(old.getBujianh());
						history.setQshuliang(old.getShuliang());
						history.setHshuliang(subobj.getShuliang());
						history.setChangjia(old.getChangjia());
						history.setChandi(old.getChandi());
						history.setDanwei(old.getDanwei());
						// 变更信息
						history.setDanjuzt("2");
						history.setBglx("u");
						historyList.add(history);
						break;
					}
				}
			}
			if (flag) {
				// 找不到部件号相同的数据, 则该明细被删除,记录删除信息
				history = new Atzpzmxbgjl();
				history.setXiangmupzmxid(old.getId());
				history.setPzid(old.getXiangmupzqdid());
				history.setBujianhao(old.getBujianh());
				history.setQshuliang(old.getShuliang());
				history.setHshuliang(0d);
				history.setChangjia(old.getChangjia());
				history.setChandi(old.getChandi());
				history.setDanwei(old.getDanwei());
				// 变更信息
				history.setDanjuzt("2");
				history.setBglx("d");
				historyList.add(history);
			}
		}

		// 是否有新增信息
		for (Iterator iterator = pzmxList.iterator(); iterator.hasNext();) {
			Atzxiangmupzmx obj = (Atzxiangmupzmx) iterator.next();
			flag = true;// 为新增数据
			for (Iterator iterator2 = oldpzmxList.iterator(); iterator2.hasNext();) {
				Atzxiangmupzmx old = (Atzxiangmupzmx) iterator2.next();
				if (obj.getBujianh().equals(old.getBujianh())) {
					flag = false;
					break;
				}
			}
			if (flag) {
				// 在old_subobjs中没有,则为新增
				history = new Atzpzmxbgjl();
				history.setXiangmupzmxid(obj.getId());
				history.setPzid(obj.getXiangmupzqdid());
				history.setBujianhao(obj.getBujianh());
				history.setQshuliang(0d);
				history.setHshuliang(obj.getShuliang());
				history.setChangjia(obj.getChangjia());
				history.setChandi(obj.getChandi());
				history.setDanwei(obj.getDanwei());
				// 变更信息
				history.setDanjuzt("2");
				history.setBglx("a");
				historyList.add(history);
			}
		}
		if (historyList == null || historyList.size() <= 0) {
			returnMsg.set("NO", "该配置没有变更记录, 请变更后再提交");
			return returnMsg;
		}
		dataset.addAll(historyList);

		String windowId = context.getId();
		Map dataMap = new HashMap();
		Long shenher = instance.getShenher();
		Bc_auth_usr shenher_usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
				"from Bc_auth_usr where team_employee_id=(select id from Atztdyg where yuangongid=" + shenher + ")");
		if (shenher_usr != null) {
			Long shenher_usr_id = shenher_usr.getId();
			logger.debug("shenher_usr===" + shenher_usr.getLoginid() + "----" + shenher_usr.getEmployee_name());
			dataMap.put("shenher", shenher_usr_id);
		} else {
			returnMsg.set("NO", "流程提交失败, 审核人账号出错,请联系管理员!");
			return returnMsg;
		}
		Long result = WorkflowAppHelper.newProcessInstance(4141816L, dataMap, request, windowId);
		// Long result = newWorkflowInstance(request, context);
		if (result <= 0) {
			returnMsg.set("NO", "流程提交失败，请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
			// 新增流程审核记录
			Atzlcshenhejl sh = new Atzlcshenhejl();
			sh.setRenwulx("变更提交审核");
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
	}

	private Object 变更(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * AU-项目配置清单-变更-12
		 */
		String hql = "";
		// 明细中销售编码不能重复
		List<Atzxiangmupzmx> pzmxs = (List<Atzxiangmupzmx>) context.get("subobjs");
		if (pzmxs != null && pzmxs.size() > 0) {
			for (int i = 0; i < pzmxs.size(); i++) {
				hql = "xiangmupzqdid=" + instance.getId() + " and shifouls='2' and bujianh=" + pzmxs.get(i).getBujianh()
						+ " and id !=" + pzmxs.get(i).getId();
				List list = dataset.getList("Atzxiangmupzmx", hql);
				if (list != null && list.size() > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码在该配置中已存在，请检查");
					return returnMsg;
				}
				if (pzmxs.get(i).getShuliang() <= 0d) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码数量必须大于0，请检查");
					return returnMsg;
				}
			}
		}
		a.setModifyInfo(instance, request);
		returnMsg.set("OK", "变更成功");
		return returnMsg;
	}

	private Object 修改(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * AU-项目配置清单-修改-12
		 */
		String hql = "";
		// 明细中销售编码不能重复
		List<Atzxiangmupzmx> pzmxs = (List<Atzxiangmupzmx>) context.get("subobjs");
		if (pzmxs != null && pzmxs.size() > 0) {
			for (int i = 0; i < pzmxs.size(); i++) {
				hql = "xiangmupzqdid=" + instance.getId() + " and shifouls='2' and bujianh=" + pzmxs.get(i).getBujianh()
						+ " and id !=" + pzmxs.get(i).getId();
				List list = dataset.getList("Atzxiangmupzmx", hql);
				if (list != null && list.size() > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码在该配置中已存在，请检查");
					return returnMsg;
				}
				if (pzmxs.get(i).getShuliang() <= 0d) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码数量必须大于0，请检查");
					return returnMsg;
				}
			}
		}
		a.setModifyInfo(instance, request);
		returnMsg.set("OK", "修改成功");
		return returnMsg;
	}

	private Object 项目配置清单_提交(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/**
		 * A-项目配置清单-提交-12
		 */
		// 防止重复提交
		if (!"1".equals(instance.getDanjuzt())) {
			return "OK";
		}
		if (instance.getHetongid() == null) {
			returnMsg.set("NO", "请选择合同或立项信息");
			return returnMsg;
		}
		// 检查销售编码下是否有物料
		List<Atzxiangmupzmx> pzmxlist = dataset.getListByHql("Atzxiangmupzmx",
				"from Atzxiangmupzmx where xiangmupzqdid=" + instance.getId() + "order by id asc");
		if (pzmxlist == null || pzmxlist.size() <= 0) {
			returnMsg.set("NO", "没有明细不能提交，请检查");
			return returnMsg;
		}
		Atzxiaoshoubm xiaoshoubm = null;
		boolean flag = false;
		StringBuffer ccts = new StringBuffer("提交失败！错误提示信息：<br>"); // 错误提示信息
		for (int i = 0; i < pzmxlist.size(); i++) {
			Atzxiangmupzmx pzmx = pzmxlist.get(i);
			xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, pzmx.getBujianh());
			List list = dataset.getListByHql("Atzwuliaojcxx",
					"from Atzwuliaojcxx where wuliaosjxz='0' and shifouqy='1' and shenhezt='3' and xiaoshoubmid="
							+ xiaoshoubm.getId());
			if (list == null || list.size() <= 0) {
				// 该销售编码下没有物料
				flag = true;
				ccts.append("第" + (i + 1) + "行，销售编码为： " + xiaoshoubm.getBianma() + " 没有对应的物料<br>");
			}
		}
		if (flag) {
			// 有销售编码下没有物料
			returnMsg.set("NO", ccts.toString());
			return returnMsg;
		}
		String windowId = context.getId();
		Map dataMap = new HashMap();
		Long shenher = instance.getShenher();
		Bc_auth_usr shenher_usr = (Bc_auth_usr) dataset.getObjectByHql("Bc_auth_usr",
				"from Bc_auth_usr where team_employee_id=(select id from Atztdyg where yuangongid=" + shenher + ")");
		if (shenher_usr != null) {
			Long shenher_usr_id = shenher_usr.getId();
			logger.debug("shenher_usr===" + shenher_usr.getLoginid() + "----" + shenher_usr.getEmployee_name());
			dataMap.put("shenher", shenher_usr_id);
		} else {
			returnMsg.set("NO", "流程提交失败, 审核人账号出错,请联系管理员!");
			return returnMsg;
		}
		Long result = WorkflowAppHelper.newProcessInstance(2465431L, dataMap, request, windowId);
		// Long result = newWorkflowInstance(request, context);
		if (result <= 0) {
			returnMsg.set("NO", "流程提交失败，请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
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
	}

	private Object AN_项目配置清单_新增_12(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/*
		 * AN-项目配置清单-新增-12
		 */
		String hql = "";
		// 合同Id必须存在
		// 明细中销售编码不能重复
		List<Atzxiangmupzmx> pzmxs = (List<Atzxiangmupzmx>) context.get("subobjs");
		if (pzmxs != null && pzmxs.size() > 0) {
			for (int i = 0; i < pzmxs.size(); i++) {
				// 检查部件号下物料是否全部停用
				List wuliaoList = dataset.getList("Atzwuliaojcxx",
						"wuliaosjxz ='0' and shifouqy='1' and xiaoshoubmid =" + pzmxs.get(i).getBujianh());
				if (wuliaoList == null || wuliaoList.size() <= 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码下没有已启用的物料，请检查");
				}
				hql = "xiangmupzqdid=" + instance.getId() + " and bujianh=" + pzmxs.get(i).getBujianh() + " and id !="
						+ pzmxs.get(i).getId();
				List list = dataset.getList("Atzxiangmupzmx", hql);
				if (list != null && list.size() > 0) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码在该配置中已存在，请检查");
					return returnMsg;
				}
				if (pzmxs.get(i).getShuliang() <= 0d) {
					returnMsg.set("NO", "第" + (i + 1) + "行销售编码数量必须大于0，请检查");
					return returnMsg;
				}
			}
		}
		// 生成编号
		paramMap.put("danjulx", "42");
		String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
		if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
			returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
			return returnMsg;
		} else if ("Error".equals(rValue)) {
			returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
			return returnMsg;
		}
		instance.setBianhao(rValue);

		// 配置清单审核人
		List<Bc_auth_userrole> usrRoles = dataset.getListByHql("Bc_auth_userrole",
				"from Bc_auth_userrole where role_id=(select id from Bc_auth_roles where name='WF-项目配置清单审核-产品经理')");
		if (usrRoles != null && usrRoles.size() > 0) {
			Atzemployee shenheren = (Atzemployee) dataset.getObjectByHql("Atzemployee",
					"from Atzemployee where id=(select yuangongid from Atztdyg where id=(select team_employee_id from Bc_auth_usr where id="
							+ usrRoles.get(0).getUser_id() + "))");
			if (shenheren != null) {
				instance.setShenher(shenheren.getId());
			}
		}

		a.setCreateInfo(instance, request);
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}

	private Object 最后审核(Atzxiangmupzqd instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/*
		 * A-WF-项目配置清单审核-产品市场总监审核-12
		 */
		String shzt = instance.getShzt();
		String shyj = instance.getShyj();
		boolean result = completeWorkflowTask(request, context);
		if (!result) {
			logger.error("项目配置清单审核流程提交失败，请联系系统管理员");
			returnMsg.set("NO", "项目配置清单审核流程提交失败，请联系系统管理员");
			return returnMsg;
		} else {
			String empname = (String) request.getSession().getAttribute("employeeName");
			// 新增流程审核记录
			Atzlcshenhejl sh = new Atzlcshenhejl();
			sh.setRenwulx("产品市场总监审核");
			sh.setShenher(empname);
			sh.setShenherq(new Date());
			sh.setShenhezt(shzt);
			sh.setShenheyj(shyj);

			sh.setDanjuid(instance.getId());
			sh.setYewudlx("14");
			dataset.add(sh);
		}

		if ("0".equals(shzt)) {
			/**
			 * 此段插入代码维护业务支持联系单跟踪信息
			 * 
			 * @zjl
			 */
			Long yewuzcdid = instance.getYewuzcd();
			if (yewuzcdid != null) {
				Atzyewuzc ywzc = (Atzyewuzc) dataset.getObject(Atzyewuzc.class, yewuzcdid);
				if (ywzc != null) {
					ywzc.setYwzt("3");
				}
			}
			// 审核已通过
			instance.setDanjuzt("3");
			// 生成单据编号
			paramMap.put("danjulx", "42");
			String rValue = execAdjustmentRule("A-生成正式编码规则-05", null, context, dataset, request, paramMap);
			if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
				return returnMsg;
			} else if ("Error".equals(rValue)) {
				returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
				return returnMsg;
			}
			instance.setBianhao(rValue);
			dataset.update(instance);
			// 更新项目配置清单明细到设备清单池
			Long hetongid = instance.getHetongid();
			if (dataset.getObject(Atzhetong.class, hetongid) == null) {
				returnMsg.set("NO", "关联合同不存在, 无法更新设备清单.");
				return returnMsg;
			}
			List<Atzxiangmupzmx> pzmxs = dataset.getListByHql("Atzxiangmupzmx",
					"from Atzxiangmupzmx where shifouls ='2' and xiangmupzqdid =" + instance.getId());
			if (pzmxs == null || pzmxs.size() <= 0) {
				returnMsg.set("NO", "该项目配置清单没有明细");
				return returnMsg;
			}
			List<Atzshebeiqdmx> update_sbqds = new ArrayList<Atzshebeiqdmx>();
			List<Atzshebeiqdmx> add_sbqds = new ArrayList<Atzshebeiqdmx>();
			Atzshebeiqdmx sbqd = null;
			Atzxiaoshoubm xiaoshoubm = null;
			List<Atzxiangmupzmx> snapshots = new ArrayList<Atzxiangmupzmx>();
			for (Atzxiangmupzmx pzmx : pzmxs) {
				List list = dataset.getList("Atzshebeiqdmx",
						"hetongid=" + hetongid + " and xiaoshoubmid=" + pzmx.getBujianh());
				if (list != null && list.size() > 0) {
					if (list.size() > 1) {
						returnMsg.set("NO", "合同下的设备清单重复, 请联系系统管理员");
						return returnMsg;
					}
					sbqd = (Atzshebeiqdmx) list.get(0);
					sbqd.setWeifhsl(com.actiz.util.MathUtil.add(sbqd.getWeifhsl(), pzmx.getShuliang()));
					sbqd.setShuliang(com.actiz.util.MathUtil.add(sbqd.getShuliang(), pzmx.getShuliang()));
					update_sbqds.add(sbqd);
				} else {
					sbqd = new Atzshebeiqdmx();
					sbqd.setXiaoshoubmid(pzmx.getBujianh());
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObject(Atzxiaoshoubm.class, pzmx.getBujianh());
					if (xiaoshoubm != null) {
						sbqd.setXiaoshoubm(xiaoshoubm.getBianma());
						sbqd.setWuliaoms(xiaoshoubm.getWuliaoms());
					}
					sbqd.setShuliang(pzmx.getShuliang());
					sbqd.setDanwei(pzmx.getDanwei());
					sbqd.setWeifhsl(pzmx.getShuliang());
					sbqd.setSjwfhsl(0d);
					sbqd.setJhdtksl(0d);
					sbqd.setLururq(new Date());
					sbqd.setHetongid(hetongid);
					// sbqd.setPzmxid(pzmx.getId());
					add_sbqds.add(sbqd);
				}

				// 保存快照信息
				Atzxiangmupzmx snapshot = new Atzxiangmupzmx();
				snapshot.setXiangmupzqdid(pzmx.getXiangmupzqdid());
				snapshot.setBujianh(pzmx.getBujianh());
				snapshot.setShuliang(pzmx.getShuliang());
				snapshot.setChangjia(pzmx.getChangjia());
				snapshot.setMuluj(pzmx.getMuluj());
				snapshot.setChandi(pzmx.getChandi());
				snapshot.setDanjia(pzmx.getDanjia());
				snapshot.setDanwei(pzmx.getDanwei());
				snapshot.setZhekou(pzmx.getZhekou());
				snapshot.setHeji(pzmx.getHeji());
				snapshot.setBeizhu(pzmx.getBeizhu());
				// 快照数据
				snapshot.setShifouls("1");
				snapshots.add(snapshot);
			}
			dataset.addAll(add_sbqds);
			dataset.updateAll(update_sbqds);
			dataset.addAll(snapshots);
		}
		returnMsg.set("OK", "提交成功");
		return returnMsg;
	}

	private Object A_项目配置清单按模板新增后置_12(Atzxiangmupqd instance, IDataSet dataset, IDataContext context,
			HttpServletRequest request, Map paramMap, Logger logger) throws Exception {
		/*
		 * A_项目配置清单按模板新增后置_12
		 */
		String hql = "";
		// 根据产品模板生成配置清单
		Map<Long, Double> xsbmMap = new HashMap<Long, Double>();
		Map<Long, Atzpeizhimx> pzmxMap = new HashMap<Long, Atzpeizhimx>();
		List<Atzpeizhimbqd> pzmbs = (List<Atzpeizhimbqd>) context.get("subobjs");
		if (pzmbs != null && pzmbs.size() > 0) {
			for (Iterator iterator = pzmbs.iterator(); iterator.hasNext();) {
				Atzpeizhimbqd atzpeizhimbqd = (Atzpeizhimbqd) iterator.next();
				hql = "from Atzpeizhimx where chanpinpzid=" + atzpeizhimbqd.getChanpinpzid();
				List<Atzpeizhimx> pzmxs = dataset.getListByHql("Atzpeizhimx", hql);
				if (pzmxs != null && pzmxs.size() > 0) {
					for (Iterator iterator2 = pzmxs.iterator(); iterator2.hasNext();) {
						Atzpeizhimx atzpeizhimx = (Atzpeizhimx) iterator2.next();
						// Double shuliang = atzpeizhimx.getShuliang();
						if (xsbmMap.containsKey(atzpeizhimx.getBujianh())) {
							double shuliang = xsbmMap.get(atzpeizhimx.getBujianh());
							xsbmMap.put(atzpeizhimx.getBujianh(),
									shuliang + atzpeizhimx.getShuliang() * atzpeizhimbqd.getShuliang());
						} else {
							pzmxMap.put(atzpeizhimx.getBujianh(), atzpeizhimx);
							xsbmMap.put(atzpeizhimx.getBujianh(),
									atzpeizhimx.getShuliang() * atzpeizhimbqd.getShuliang());
						}
					}
				}
			}
			for (Map.Entry<Long, Double> entry : xsbmMap.entrySet()) {
				Atzxiangmupzmx atzxiangmupzmx = new Atzxiangmupzmx();
				atzxiangmupzmx.setBujianh(entry.getKey());
				atzxiangmupzmx.setShuliang(entry.getValue());
				atzxiangmupzmx.setXiangmupzqdid(instance.getId());
				Atzpeizhimx peizhimx = pzmxMap.get(entry.getKey());
				atzxiangmupzmx.setChangjia(peizhimx.getChangjia());
				atzxiangmupzmx.setChandi(peizhimx.getChandi());
				atzxiangmupzmx.setDanwei(peizhimx.getDanwei());
				atzxiangmupzmx.setMuluj(peizhimx.getMuluj());
				atzxiangmupzmx.setZhekou(peizhimx.getZhekou());
				atzxiangmupzmx.setDanjia(peizhimx.getDanjia());
				// atzxiangmupzmx.setHeji(String.valueOf(atzxiangmupzmx.getDanjia()
				// * atzxiangmupzmx.getShuliang()));
				dataset.add(atzxiangmupzmx);
			}
		}
		// 生成编号
		paramMap.put("danjulx", "42");
		String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
		if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
			returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
			return returnMsg;
		} else if ("Error".equals(rValue)) {
			returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
			return returnMsg;
		}
		instance.setBianhao(rValue);
		a.setCreateInfo(instance, request);
		returnMsg.set("OK", "新增成功");
		return returnMsg;
	}

	private Object 配置导入(Atzwenjiandr instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * A-项目清单明细导入-05H
		 */
		// 得到上传文件
		String fileName = instance.getDaoruwj();
		String fileNames[] = fileName.split("[*]");
		String realName = fileNames[1];
		// 得到导入的文件
		List<AttachmentResource> attachmentList = dataset.getList("AttachmentResource",
				"fileName = '" + realName + "'");
		if (attachmentList == null || attachmentList.size() <= 0) {
			returnMsg.set("NO", "文件上传失败！");
			return returnMsg;
		}
		AttachmentResource attachment = attachmentList.get(0);
		File file = new File(attachment.getFilePath() + realName);
		if (!file.exists()) {
			returnMsg.set("NO", "文件上传失败！");
			return returnMsg;
		}
		if (!"xls".equals(attachment.getFileType())) {
			file.delete();
			returnMsg.set("NO", "上传的文件必须是03版的excel文件！");
			return returnMsg;
		}
		InputStream is = null;
		Workbook workbook = null;
		try {
			// 获取输入流（通过文件）
			is = new FileInputStream(file);
			// 获取工作簿
			workbook = Workbook.getWorkbook(is);
			// 获取工作表
			Sheet sheet = workbook.getSheets()[0];
			int rows = sheet.getRows();
			Object obj = request.getSession().getAttribute("employeeName");
			String str11 = obj == null ? "admin" : String.valueOf(obj);
			boolean ccflag = false;// 出错标记
			StringBuffer ccts = new StringBuffer("上传文件错误提示：<br>"); // 错误提示信息
			List<String> bujianhList = new ArrayList<String>();

			// 表头信息
			String ywzc = sheet.getCell(1, 0) == null ? "" : sheet.getCell(1, 0).getContents().trim();
			String kehumc = sheet.getCell(3, 0) == null ? "" : sheet.getCell(3, 0).getContents().trim();
			String pzmc = sheet.getCell(6, 0) == null ? "" : sheet.getCell(6, 0).getContents().trim();

			if ("".equals(ywzc)) {
				returnMsg.set("NO", "业务支持联系单不能为空，请检查");
				return returnMsg;
			}

			Atzyewuzc yewuzc = null;
			Long ywzcId = null;
			if (!"".equals(ywzc)) {
				yewuzc = (Atzyewuzc) dataset.getObjectByHql("Atzyewuzc",
						"from Atzyewuzc where bianhao='" + ywzc + "' and danjuzt='3'");
				if (yewuzc == null) {
					returnMsg.set("NO", "业务支持联系单单号输入有误或该单据未审核通过，请检查");
					return returnMsg;
				}
				ywzcId = yewuzc.getId();
			}
			/*
			 * if ("".equals(kehumc)) { returnMsg.set("NO", "客户名称不能为空，请检查");
			 * return returnMsg; } Atzkehu kehu = (Atzkehu)
			 * dataset.getObjectByHql("Atzkehu", "from Atzkehu where kehumc='" +
			 * kehumc + "'"); if (kehu == null) { returnMsg.set("NO",
			 * "客户输入有误或客户不存在，请检查"); return returnMsg; }
			 */
			if ("".equals(pzmc)) {
				returnMsg.set("NO", "配置名称不能为空，请检查");
				return returnMsg;
			}
			Atzxiangmupzqd xiangmupzqd = new Atzxiangmupzqd();
			xiangmupzqd.setYewuzcd(ywzcId);
			if (ywzcId != null) {
				if (yewuzc.getHetongid() == null) {
					returnMsg.set("NO", "业务支持联系单未维护合同号, 无法新增配置清单");
					return returnMsg;
				}
				xiangmupzqd.setHetongid(yewuzc.getHetongid());
				Atzhetong ht = (Atzhetong) dataset.getObject(Atzhetong.class, yewuzc.getHetongid());
				xiangmupzqd.setKehu(ht.getKehuid());
			}
			// xiangmupzqd.setKehu(kehu.getId());
			xiangmupzqd.setQingdanmc(pzmc);
			xiangmupzqd.setDanjuzt("1");
			a.setCreateInfo(xiangmupzqd, request);

			// 生成编号

			paramMap.put("danjulx", "42");
			String rValue = execAdjustmentRule("A-生成编码规则-05", null, context, dataset, request, paramMap);
			if (rValue.equals("请先设置编码规则") || rValue.equals("流水号溢出")) {
				returnMsg.set("NO", "流水号溢出，请联系系统管理员！");
				return returnMsg;
			} else if ("Error".equals(rValue)) {
				returnMsg.set("NO", "编号生成异常，请联系系统管理员！");
				return returnMsg;
			}
			xiangmupzqd.setBianhao(rValue);
			// 配置清单审核人
			List<Bc_auth_userrole> usrRoles = dataset.getListByHql("Bc_auth_userrole",
					"from Bc_auth_userrole where role_id=(select id from Bc_auth_roles where name='WF-项目配置清单审核-产品经理')");
			if (usrRoles != null && usrRoles.size() > 0) {
				Atzemployee shenheren = (Atzemployee) dataset.getObjectByHql("Atzemployee",
						"from Atzemployee where id=(select yuangongid from Atztdyg where id=(select team_employee_id from Bc_auth_usr where id="
								+ usrRoles.get(0).getUser_id() + "))");
				if (shenheren != null) {
					xiangmupzqd.setShenher(shenheren.getId());
				}
			}
			dataset.add(xiangmupzqd);
			// 项目配置清单编号(*) 部件号(*) 厂家编号 产地 单位 数量(*) 目录价 折扣 单价 合计 备注

			Atzxiaoshoubm xiaoshoubm = null;
			Atzwuliaojcxx wuliao = null;
			Atzshengchancj shengchancj = null;
			String bujianmc = null;
			Double shuliang = null;
			Double muluj = null;
			Double zhekou = null;
			Double danjia = null;
			List wllist = null;

			List<Atzxiangmupzmx> xiangmupzmxs = new ArrayList<Atzxiangmupzmx>();
			// 判断是否有明细,对文件中的每一行进行分析 ，如果符合要求则添加到数据库中从第3行开始
			for (int i = 2; i < rows; i++) {
				String bujianhStr = sheet.getCell(0, i) == null ? "" : sheet.getCell(0, i).getContents().trim(); // 部件号
				String bujianmcStr = sheet.getCell(1, i) == null ? "" : sheet.getCell(1, i).getContents().trim(); // 部件名称
				String chandi = sheet.getCell(5, i) == null ? "" : sheet.getCell(5, i).getContents().trim(); // 产地
				String danwei = sheet.getCell(6, i) == null ? "" : sheet.getCell(6, i).getContents().trim(); // 单位
				String shuliangStr = sheet.getCell(7, i) == null ? "" : sheet.getCell(7, i).getContents().trim(); // 数量
				String mulujStr = sheet.getCell(8, i) == null ? "" : sheet.getCell(8, i).getContents().trim(); // 目录价
				String zhekouStr = sheet.getCell(9, i) == null ? "" : sheet.getCell(9, i).getContents().trim(); // 折扣
				String danjiaStr = sheet.getCell(10, i) == null ? "" : sheet.getCell(10, i).getContents().trim(); // 单价
				String heji = sheet.getCell(11, i) == null ? "" : sheet.getCell(11, i).getContents().trim(); // 合计
				String beizhu = sheet.getCell(12, i) == null ? "" : sheet.getCell(12, i).getContents().trim(); // 备注

				if ("".equals(bujianhStr)) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 部件号为空;<br>");
				}
				if ("".equals(shuliangStr)) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 数量为空;<br>");
				}
				try {
					shuliang = Double.parseDouble(shuliangStr);
				} catch (Exception e) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 数量格式错误;<br>");
				}
				if (shuliang <= 0d) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 数量必须大于0;<br>");
				}
				if (!"".equals(mulujStr)) {
					try {
						muluj = Double.parseDouble(mulujStr);
					} catch (Exception e) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 目录价格式错误;<br>");
					}
				}
				if (!"".equals(zhekouStr)) {
					try {
						zhekou = Double.parseDouble(zhekouStr);
					} catch (Exception e) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 折扣格式错误;<br>");
					}
				}
				if (!"".equals(danjiaStr)) {
					try {
						danjia = Double.parseDouble(danjiaStr);
					} catch (Exception e) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 单价格式错误;<br>");
					}
				}
				if (bujianhList.contains(bujianhStr)) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 部件号(" + bujianhStr + ")与已上传的清单重复;<br>");
				}
				bujianhList.add(bujianhStr);
				xiaoshoubm = (Atzxiaoshoubm) dataset.getObjectByHql("Atzxiaoshoubm",
						"from Atzxiaoshoubm where shifousc='2' and bianma='" + bujianhStr + "'");
				if (xiaoshoubm == null) {
					ccflag = true;
					ccts.append("第").append(i + 1).append("行, 部件号“" + bujianhStr + "”在系统中不存在;<br>");
				}
				if (!ccflag) {
					try {
						wllist = (List<Atzwuliaojcxx>) dataset.getList("Atzwuliaojcxx",
								"wuliaosjxz ='0' and shifouqy='1' and xiaoshoubmid =" + xiaoshoubm.getId()
										+ " order by banbenpx desc");
						if (wllist == null || wllist.size() <= 0) {
							ccflag = true;
							ccts.append(ccts.append("第").append(i + 1)
									.append("行, 根据部件号“" + bujianhStr + "”查找物料信息,没有启用的物料,请检查数据;<br>"));
						}
						wuliao = (Atzwuliaojcxx) wllist.get(0);
						shengchancj = (Atzshengchancj) dataset
								.getList("Atzshengchancj", "wuliaoid=" + wuliao.getId() + " order by youxianji").get(0);
						if (shengchancj == null) {
							ccflag = true;

							ccts.append("第").append(i + 1).append("行, 根据部件号“" + bujianhStr + "”查找生产厂家出错,请联系系统管理员;<br>");
						}
					} catch (Exception e) {
						logger.error("error");
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 根据部件号“" + bujianhStr + "”查找生产厂家出错,请联系系统管理员;<br>");
					}
				}
				if (!ccflag) {
					Atzxiangmupzmx xiangmupzmx = new Atzxiangmupzmx();
					// 根据销售编码查找优先级最高的厂家

					xiangmupzmx.setXiangmupzqdid(xiangmupzqd.getId());
					xiangmupzmx.setBujianh(xiaoshoubm.getId());
					xiangmupzmx.setChangjia(shengchancj.getId());
					xiangmupzmx.setChandi(chandi);
					xiangmupzmx.setDanwei(danwei);
					xiangmupzmx.setShuliang(shuliang);
					xiangmupzmx.setMuluj(muluj);
					xiangmupzmx.setZhekou(zhekou);
					xiangmupzmx.setDanjia(danjia);
					xiangmupzmx.setHeji(heji);
					xiangmupzmx.setBeizhu(beizhu);
					xiangmupzmxs.add(xiangmupzmx);
				}
			}
			if (ccflag) {
				returnMsg.set("NO", ccts.toString());
				return returnMsg;
			}
			dataset.addAll(xiangmupzmxs);

			returnMsg.set("OK", "导入成功！");
			return returnMsg;
		} catch (Exception e) {
			logger.error("导入数据错误：", e);
			if (file.exists()) {
				file.delete();
			}
			returnMsg.set("NO", "系统错误，请与管理员联系！");
			return returnMsg;
		} finally {
			// 关闭工作薄
			if (workbook != null) {
				workbook.close();
			}
			// 关闭输入流
			if (is != null) {
				is.close();
			}
			// 删除缓存文件
			if (file.exists()) {
				file.delete();
			}
		}
	}
}
