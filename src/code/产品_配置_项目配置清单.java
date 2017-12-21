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

	private Object methodName(Object instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		return "OK";
	}
	
	private Object 变更(Object instance, IDataSet dataset, IDataContext context, HttpServletRequest request,
			Map paramMap, Logger logger) throws Exception {
		/**
		 * 
		 */
		return "OK";
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
					"from Atzwuliaojcxx where wuliaosjxz='0' and shenhezt='3' and xiaoshoubmid=" + xiaoshoubm.getId());
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
				//检查部件号下物料是否全部停用
				List wuliaoList = dataset.getList("Atzwuliaojcxx","wuliaosjxz ='0' and shifouqy='1' and xiaoshoubmid ="+pzmxs.get(i).getBujianh());
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
					"from Atzxiangmupzmx where xiangmupzqdid =" + instance.getId());
			if (pzmxs == null || pzmxs.size() <= 0) {
				returnMsg.set("NO", "该项目配置清单没有明细");
				return returnMsg;
			}
			List<Atzshebeiqdmx> sbqds = new ArrayList<Atzshebeiqdmx>();
			Atzshebeiqdmx sbqd = null;
			Atzxiaoshoubm xiaoshoubm = null;
			for (Atzxiangmupzmx pzmx : pzmxs) {
				String bglx = pzmx.getBglx();
				// bglx为空, 则初次审核的数据, 直接生成设备清单明细
				if (bglx == null) {
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
					sbqd.setYifhsh(0d);
					sbqd.setJhfhsl(0d);
					sbqd.setTuikusl(0d);
					sbqd.setJhtksl(0d);
					sbqd.setJhdtksl(0d);
					sbqd.setSjwfhsl(0d);
					sbqd.setLururq(new Date());
					sbqd.setHetongid(hetongid);
					sbqd.setPzmxid(pzmx.getId());
					sbqds.add(sbqd);
				} else if (bglx.equals("a")) {
					// 新增的配置明细
					sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx",
							"from Atzshebeiqdmx where hetongid=" + hetongid + " and xiaoshoubmid=" + pzmx.getBujianh());
					if (sbqd == null) {
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
						sbqd.setYifhsh(0d);
						sbqd.setJhfhsl(0d);
						sbqd.setTuikusl(0d);
						sbqd.setJhtksl(0d);

						sbqd.setJhdtksl(0d);
						sbqd.setSjwfhsl(0d);
						sbqd.setLururq(new Date());
						sbqd.setHetongid(hetongid);
						sbqd.setPzmxid(pzmx.getId());
						sbqds.add(sbqd);
					} else {
						sbqd.setShuliang(com.actiz.util.MathUtil.add(sbqd.getShuliang(), pzmx.getShuliang()));
						sbqd.setWeifhsl(com.actiz.util.MathUtil.sub(sbqd.getShuliang(), sbqd.getJhfhsl()));
						sbqds.add(sbqd);
					}
				} else if (bglx.equals("u")) {
					// 修改的配置明细, 只能修改数量.
					sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx",
							"from Atzshebeiqdmx where hetongid=" + hetongid + " and xiaoshoubmid=" + pzmx.getBujianh());
					if (sbqd != null) {
						sbqd.setShuliang(pzmx.getShuliang());
						sbqd.setWeifhsl(com.actiz.util.MathUtil.sub(sbqd.getShuliang(), sbqd.getJhfhsl()));
						sbqds.add(sbqd);
					}
				} else if (bglx.equals("d")) {
					// 删除的明细,已发货的不能删除.
					sbqd = (Atzshebeiqdmx) dataset.getObjectByHql("Atzshebeiqdmx",
							"from Atzshebeiqdmx where hetongid=" + hetongid + " and xiaoshoubmid=" + pzmx.getBujianh());
					dataset.delete(sbqd);
				}
				pzmx.setBglx("未变更");
				dataset.update(pzmx);
			}
			dataset.addAll(sbqds);
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
			/*
			 * if ("".equals(ywzc)) { returnMsg.set("NO","业务支持联系单不能为空，请检查");
			 * return returnMsg; }
			 */
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
			if ("".equals(kehumc)) {
				returnMsg.set("NO", "客户名称不能为空，请检查");
				return returnMsg;
			}
			Atzkehu kehu = (Atzkehu) dataset.getObjectByHql("Atzkehu", "from Atzkehu where kehumc='" + kehumc + "'");
			if (kehu == null) {
				returnMsg.set("NO", "客户输入有误或客户不存在，请检查");
				return returnMsg;
			}
			*/
			if ("".equals(pzmc)) {
				returnMsg.set("NO", "配置名称不能为空，请检查");
				return returnMsg;
			}
			Atzxiangmupzqd xiangmupzqd = new Atzxiangmupzqd();
			xiangmupzqd.setYewuzcd(ywzcId);
			if (ywzcId != null) {
				xiangmupzqd.setHetongid(yewuzc.getHetongid());
				Atzhetong ht = (Atzhetong) dataset.getObject(Atzhetong.class, yewuzc.getHetongid());
				xiangmupzqd.setKehu(ht.getKehuid());
			}
			//xiangmupzqd.setKehu(kehu.getId());
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
								"wuliaosjxz ='0' and shifouqy='1' and xiaoshoubmid =" + xiaoshoubm.getId() + " order by banbenpx desc");
						if (wllist == null || wllist.size() <= 0) {
							ccflag = true;
							ccts.append(ccts.append("第").append(i + 1).append("行, 根据部件号“" + bujianhStr + "”查找物料信息,没有启用的物料,请检查数据;<br>"));
						}
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
