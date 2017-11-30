package rule.产品;

import java.util.*;
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
public class 产品配置导入 extends RuleEngine{
	private static Logger logger = Logger.getLogger(产品配置导入.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzwenjiandr instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
		// 得到上传文件
			String fileName = instance.getDaoruwj();
			String fileNames[] = fileName.split("[*]");
			String realName = fileNames[1];
			// 得到导入的文件
			List<AttachmentResource> attachmentList = dataset.getList("AttachmentResource", "fileName = '" + realName + "'");
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

				//  部件号(*) 厂家编号 产地 单位 数量(*) 目录价 折扣 单价 合计 备注
				Atzchanpinpz chanpinpz = null;
				Atzxiaoshoubm xiaoshoubm = null;
				Atzwuliaojcxx wuliao = null;
				Atzshengchancj shengchancj = null;
				String bujianmc = null;
				Double shuliang = null;
				Double muluj = null;
				Double zhekou = null;
				Double danjia = null;
				
				String pzqdid = (String) context.get("atzchanpinpz.id");
				logger.debug("pzqdid="+pzqdid);
				chanpinpz = (Atzchanpinpz) dataset.getObject(Atzchanpinpz.class, Long.parseLong(pzqdid));
				if(chanpinpz == null){
					logger.error("出错啦");
					logger.error(pzqdid);
					returnMsg.set("NO", "系统运行异常，请联系系统管理员");
					return returnMsg;
				}
				
				List<Atzpeizhimx> pzmxs = new ArrayList<Atzpeizhimx>();
				// 判断是否有明细,对文件中的每一行进行分析 ，如果符合要求则添加到数据库中从第二行开始
				for (int i = 1; i < rows; i++) {
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
					if(!"".equals(mulujStr)) {
						try {
							muluj = Double.parseDouble(mulujStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 目录价格式错误;<br>");
						}
					}
					if(!"".equals(zhekouStr)) {
						try {
							zhekou = Double.parseDouble(zhekouStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 折扣格式错误;<br>");
						}
					}
					if(!"".equals(danjiaStr)) {
						try {
							danjia = Double.parseDouble(danjiaStr);
						} catch (Exception e) {
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 单价格式错误;<br>");
						}
					}
					xiaoshoubm = (Atzxiaoshoubm) dataset.getObjectByHql("Atzxiaoshoubm", "from Atzxiaoshoubm where bianma='" + bujianhStr + "'");
					if (xiaoshoubm == null) {
						ccflag = true;
						ccts.append("第").append(i + 1).append("行, 部件号“" + bujianhStr + "”在系统中不存在;<br>");
					}
					
					if(!ccflag) {
						//根据销售编码查找优先级最高的厂家
						try{
							wuliao = (Atzwuliaojcxx)dataset.getList("Atzwuliaojcxx","wuliaosjxz ='0' and xiaoshoubmid ="
									+ xiaoshoubm.getId()	+ " order by banbenpx desc").get(0);
							shengchancj = (Atzshengchancj) dataset.getList("Atzshengchancj", "wuliaoid="+wuliao.getId()+" order by youxianji").get(0);
							if(shengchancj == null){
								ccflag = true;
								ccts.append("第").append(i + 1).append("行, 根据部件号“" + bujianhStr + "”查找生产厂家出错,请联系系统管理员;<br>");
							}
						}catch(Exception e){
							logger.error("error");
							ccflag = true;
							ccts.append("第").append(i + 1).append("行, 根据部件号“" + bujianhStr + "”查找生产厂家出错,请联系系统管理员;<br>");
						}

						Atzpeizhimx pzmx = new Atzpeizhimx();
						pzmx.setChanpinpzid(chanpinpz.getId());
						pzmx.setBujianh(xiaoshoubm.getId());
						pzmx.setChangjia(shengchancj.getId());
						pzmx.setChandi(chandi);
						pzmx.setDanwei(danwei);
						pzmx.setShuliang(shuliang);
						pzmx.setMuluj(muluj);
						pzmx.setZhekou(zhekou);
						pzmx.setDanjia(danjia);
						pzmx.setHeji(heji);
						pzmx.setBeizhu(beizhu);
						pzmxs.add(pzmx);
					}
				}
				if (ccflag) {
					returnMsg.set("NO", ccts.toString());
					return returnMsg;
				}
				dataset.addAll(pzmxs);

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
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
