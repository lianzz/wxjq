package rule.portal;

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
import com.actiz.util.mail.PostMail;

@SuppressWarnings("unused")
public class 邮件发送接口 extends RuleEngine{
	private static Logger logger = Logger.getLogger(邮件发送接口.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiangmupzqd instance) throws Exception{
		try {
			// 自定义规则
//###################################################################################################
			/**
			 * 邮件发送接口
			 */
			String from = "qyes";
			String password = "qyes";
			String host = "10.0.0.2";
			String frominfo = "qyes@eastcom.com";
			//String userEmail = (String) paramMap.get("userEmail");
			String userEmail = "portal@eastcom.com";
			if (userEmail == null) {
				return "OK";
			}
			String empnum = (String) paramMap.get("empnum");
			String empname = (String) paramMap.get("empname");
			//String user = (String) paramMap.get("user");
			
			String body ="员工工号: "+empnum+",员工姓名: "+empname+", 需要设置邮箱"
					+ "\n\n\n"
					+ "链接到东方通信信息化企业门户系统：请点击 http://urp.eastcom.com"
					+ "\n\n感谢使用公司门户系统。为了改进和完善信息系统，希望得到您的及时意见反馈和建议，请联系portal@eastcom.com";
			
			Timestamp now = new Timestamp(System.currentTimeMillis());
			PostMail mail = new PostMail(from, password, host,frominfo);
			
			Atzyoujianfsjl fsjl = new Atzyoujianfsjl();
			fsjl.setZhuti("员工邮箱设置提醒,工号:"+empnum);
			fsjl.setNeirong(body);
			fsjl.setShoujianren("邮箱管理员");
			fsjl.setShoujianryx(userEmail);
			fsjl.setFasongsj(now);
			
			mail.addTo(userEmail);
			mail.setBody(body);
			mail.setSubject("员工邮箱设置提醒");
			boolean result = mailer.sendMail(mail);
			if (result) {
				fsjl.setFasongzt("成功");
			}else{
				fsjl.setFasongzt("失败");
			}
			dataset.add(fsjl);
			
			return "OK";
			
//###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
