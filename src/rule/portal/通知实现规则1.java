package rule.portal;

import java.util.*;
import java.sql.*;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.bcs.rule.application.newengine.util.AProxy;
import com.actiz.bcs.workflow.application.hbm.NotifyRecords;
import com.actiz.platform.application.dataset.pojo.*;
import javax.servlet.http.HttpServletRequest;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.resource.workflow.application.WorkflowAppHelper;
import com.actiz.util.mail.PostMail;

@SuppressWarnings("unused")
public class 通知实现规则1 extends RuleEngine {
	private static Logger logger = Logger.getLogger(通知实现规则1.class);
	AProxy a = new AProxy();
	AProxy A = a;

	private Object getReturnValue(IDataContext context, IDataSet dataset, HttpServletRequest request, Map paramMap,
			Logger logger,
			// 实体名字
			Atzxiangmupzqd instance, String entityName, Long workflowNodeId) throws Exception {
		try {
			// 自定义规则
			// ###################################################################################################
			// logger.info("~~~邮件发送~~in~");
			Calendar cal = Calendar.getInstance();
			Long time = cal.getTimeInMillis();
			Timestamp t = new Timestamp(time);
			String hql = "from NotifyRecords where notifyTime<? and status=true";
			List<NotifyRecords> notifyList = dataset.getListByHql("NotifyRecords", hql, new Object[] { time });
			// ~~~对重复发送邮件表中次数少于等于10，且发送失败的记录进行重新发送~~~
			List<Atzchongfufsyj> cffsyjList = dataset.getListByHql("Atzchongfufsyj",
					" from Atzchongfufsyj where istatus='N' and repeatcount<10");
			if (cffsyjList != null && cffsyjList.size() > 0) {
				for (Atzchongfufsyj fs : cffsyjList) {
					String from = (String) getValue(instance, entityName, 5165532L, "from", workflowNodeId); // 发件地址
					String password = (String) getValue(instance, entityName, 5165532L, "password", workflowNodeId); // 发件密码
					String host = (String) getValue(instance, entityName, 5165532L, "host", workflowNodeId); // 发件服务器
					String frominfo = (String) getValue(instance, entityName, 5165532L, "frominfo", workflowNodeId); // 发件人详细信息认证
					PostMail mail = new PostMail(from, password, host, frominfo);
					Long userId = Long.parseLong(fs.getNotifyusers());
					userId = userId == null ? 0l : userId;
					Bc_auth_usr user = (Bc_auth_usr) dataset.getObject(Bc_auth_usr.class, userId);
					String userMail = null;
					if (user != null) {
						if ((userMail = user.getEmail()) != null) {
							mail.addTo(userMail); // 添加收件地址
						}
					}
					logger.info("~~~邮件发送~~~收件人地址：" + userMail);
					Atzyoujianfsjl yjfsjl = (Atzyoujianfsjl) dataset.getObjectByHql("Atzyoujianfsjl",
							" from Atzyoujianfsjl where fasongid=" + fs.getId());
					Atztask task = (Atztask) dataset.getObjectByHql("Atztask",
							"from Atztask where taskinstance=" + fs.getSrcid());
					if (task == null || user == null)
						continue;
					if (yjfsjl == null) {
						yjfsjl = new Atzyoujianfsjl();
						yjfsjl.setFasongid(fs.getId());
						yjfsjl.setTaskid(task.getId());
						yjfsjl.setShoujianren(user.getEmployee_name());
						yjfsjl.setShoujianryx(user.getEmail());
						yjfsjl.setZhuti(fs.getTitle());
						yjfsjl.setNeirong(fs.getContexts());
						yjfsjl.setFasongsj(t);
						dataset.add(yjfsjl);
					}
					mail.setSubject(fs.getTitle() + " " + task.getCreatetime()); // 添加主题
					// logger.info("~~~邮件发送~~~主题:" + title);
					mail.setBody(fs.getContexts()); // 添加内容
					// logger.info("~~~邮件发送~~~内容:" + content);
					boolean result = mailer.sendMail(mail); // 发送邮件
					// logger.info("~~~邮件发送~~~邮件发送结果：(" + result + ")");
					String fszt = "未发送";
					if (result) {
						fszt = "成功";
						fs.setIstatus("Y");
					} else {
						fszt = "失败";
						fs.setIstatus("N");
					}
					fs.setRepeatcount(fs.getRepeatcount() + 1);
					yjfsjl.setFasongzt(fszt);
					dataset.update(yjfsjl);

				}

			}
			// ~~~结束~~~
			if (notifyList != null && notifyList.size() > 0) {
				int a = notifyList.size();
				// logger.info("~~~邮件发送~~~notifyList.size=" + a);
				// 占用记录
				for (NotifyRecords nr0 : notifyList) {
					nr0.setStatus(false);
					dataset.update(nr0);
				}

				for (NotifyRecords nr : notifyList) {
					// ~~~zjl实现时间限制~~~
					if (com.actiz.bcs.workflow.common.util.WorkflowConstant.PROCESS_TASK_OVERTIME
							.equals(nr.getSrcBC())) {
						logger.debug("overtime");
						WorkflowAppHelper.fireNodeOverTimeEvent(nr.getSrcID(), nr.getNotifyType(), nr.getIntervalTime(),
								nr.getRepeatCount(), nr.getTitle(), nr.getContext());
					} else if (com.actiz.bcs.workflow.common.util.WorkflowConstant.PROCESS_TASK_ALERTTIME
							.equals(nr.getSrcBC())) {
						logger.debug("alerttime");
						WorkflowAppHelper.fireNodeAlertTimeEvent(nr.getSrcID(), nr.getNotifyType(),
								nr.getIntervalTime(), nr.getRepeatCount(), nr.getTitle(), nr.getContext());
					}
					// ~~~结束~~~

					if (nr.getNotifyUsers() != null) {

						String notifyType = nr.getNotifyType();
						if (notifyType != null && notifyType.indexOf("mail") != -1) {
							String title = nr.getTitle(); // 获取主题
							String detail = nr.getContext(); // 获取内容
							String content = detail + "\n\n\n" + "链接到东方通信信息化企业门户系统：请点击 http://urp.eastcom.com"
									+ "\n\n感谢使用公司门户系统。为了改进和完善信息系统，希望得到您的及时意见反馈和建议，请联系portal@eastcom.com";

							String from = (String) getValue(instance, entityName, 5165532L, "from", workflowNodeId); // 发件地址
							String password = (String) getValue(instance, entityName, 5165532L, "password",
									workflowNodeId); // 发件密码
							String host = (String) getValue(instance, entityName, 5165532L, "host", workflowNodeId); // 发件服务器
							String frominfo = (String) getValue(instance, entityName, 5165532L, "frominfo",
									workflowNodeId); // 发件人详细信息认证

							PostMail mail = new PostMail(from, password, host, frominfo);

							Long userId = Long.parseLong(nr.getNotifyUsers());
							userId = userId == null ? 0l : userId;
							Bc_auth_usr user = (Bc_auth_usr) dataset.getObject(Bc_auth_usr.class, userId);
							String userMail = null;
							if (user != null) {
								if ((userMail = user.getEmail()) != null) {
									mail.addTo(userMail); // 添加收件地址
								}
							}
							// logger.info("~~~邮件发送~~~收件人地址：" + userMail);
							Atzyoujianfsjl yjfsjl = new Atzyoujianfsjl();
							Atztask task = (Atztask) dataset.getObjectByHql("Atztask",
									"from Atztask where taskinstance=" + nr.getSrcID());
							if (task == null || user == null)
								continue;

							yjfsjl.setTaskid(task.getId());
							yjfsjl.setShoujianren(user.getEmployee_name());
							yjfsjl.setShoujianryx(user.getEmail());
							yjfsjl.setZhuti(title);
							yjfsjl.setNeirong(content);
							yjfsjl.setFasongsj(t);

							mail.setSubject(title + " " + task.getCreatetime()); // 添加主题
							// logger.info("~~~邮件发送~~~主题:" + title);
							mail.setBody(content); // 添加内容
							// logger.info("~~~邮件发送~~~内容:" + content);
							boolean result = mailer.sendMail(mail); // 发送邮件
							// logger.info("~~~邮件发送~~~邮件发送结果：(" + result + ")");
							// ~~~此段代码用于向重复发送邮件表克隆NotifyRecord的记录~~~
							Atzchongfufsyj chongfufsyj = new Atzchongfufsyj();
							chongfufsyj.setSrcbc(nr.getSrcBC());
							chongfufsyj.setSrcid(nr.getSrcID());
							chongfufsyj.setTitle(nr.getTitle());
							chongfufsyj.setContexts(nr.getContext());
							chongfufsyj.setNotifyusers(nr.getNotifyUsers());
							chongfufsyj.setNotifytime(nr.getNotifyTime());
							chongfufsyj.setNotifytype(nr.getNotifyType());
							// chongfufsyj.setIsrepeat(nr.getIsRepeat());
							if (nr.getIsRepeat() == false)
								chongfufsyj.setIsrepeat("N");
							else
								chongfufsyj.setIsrepeat("Y");
							chongfufsyj.setIntervaltime(nr.getIntervalTime());
							chongfufsyj.setRepeatcount(1);

							// ~~~结束~~~
							String fszt = "未发送";
							if (result) {
								fszt = "成功";
								chongfufsyj.setIstatus("Y");
							} else {
								fszt = "失败";
								chongfufsyj.setIstatus("N");
							}
							dataset.add(chongfufsyj);
							yjfsjl.setFasongid(chongfufsyj.getId());
							yjfsjl.setFasongzt(fszt);
							dataset.add(yjfsjl);
							// logger.info("~~~邮件发送~~add yjfsjl end～");
						} // notifyType != null
					}
				} // for i end
			} else {
				// logger.info("~~~邮件发送~~notifyList=null~");
			}
			// logger.info("~~~邮件发送~~end~");
			// ~~~重复发送邮件如果已成功则删除记录~~~
			List successList = dataset.getListByHql("Atzchongfufsyj", " from Atzchongfufsyj where istatus ='Y'");
			if (successList != null && successList.size() > 0)
				dataset.deleteAll(successList);
			// ~~~结束~~~
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}

}
