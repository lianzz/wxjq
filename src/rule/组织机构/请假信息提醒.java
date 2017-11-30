package rule.组织机构;

import java.text.SimpleDateFormat;
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
public class 请假信息提醒 extends RuleEngine{
	private static Logger logger = Logger.getLogger(请假信息提醒.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzemployee instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			String ygid = (String) context.get("contextstring");
			String deadlineString = "03-31";
			logger.debug("ygid=" + ygid);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Atzemployee emp = (Atzemployee) dataset.getObject(Atzemployee.class,
						Long.parseLong(ygid));

				String nj = "当前全薪假期信息：\n";

				// 获取年假
				// String
				// njsql="from Atznianjia where ygid="+ygid+" order by jiezhiriqi asc";
				String njsql = "from Atznianjia where ygid=" + ygid
						+ "and jiezhiriqi >= to_date('" + sdf.format(new Date())
						+ "','yyyy-mm-dd') " + "order by id asc";// 表示该年假有效
				logger.debug("sql=" + njsql);
				List<Atznianjia> njlist = dataset.getListByHql("Atznianjia", njsql);
				logger.debug("sql=" + njlist);
				if(njlist == null || njlist.size() < 1) {
					nj = nj + "还未产生年假信息      ";
				} else {
					for(int i = 0; i < njlist.size(); i++) {
						Atznianjia njia = njlist.get(i);
						String nd = njia.getNiandu();
						Double ts = njia.getTianshu();
						Double syts = njia.getSyts();
						Date jzsj = njia.getJiezhiriqi();
						nj = nj + nd + "年：可休年假 " + ts + " 天;剩余年假 " + syts + " 天。(截止"
								+ sdf.format(jzsj) + ")\n";
					}
					Calendar cal = Calendar.getInstance();
					int year = cal.get(Calendar.YEAR);
					Date deadline = sdf.parse(year + "-" + deadlineString);
					if(deadline.getTime() < new Date().getTime()) {
						deadline = sdf.parse(year + 1 + "-" + deadlineString);
					}
					// 获取可调休时间
					double dtx = emp.getTiaoxiusj() == null ? 0d : emp.getTiaoxiusj();
					nj = nj + year + "年：可休调休假  " + dtx + " 小时。(截止" + sdf.format(deadline)
							+ ");\n";
				}
				context.set("result", nj);
				return "OK";
			} catch (Exception e) {
				context.set("result", "NO"); // 在context中放置要返回的执行信息
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
