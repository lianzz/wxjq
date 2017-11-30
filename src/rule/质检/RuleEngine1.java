package rule.质检;

import java.text.DateFormat;
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
public class RuleEngine1 extends RuleEngine{
	private static Logger logger = Logger.getLogger(RuleEngine1.class);
	AProxy a = new AProxy();

	private Object getReturnValue(IDataContext context, IDataSet dataset,
			HttpServletRequest request, Map paramMap, Logger logger,
			// 实体名字
			Atzxiaoshouyc instance) throws Exception{
		try {
			// 自定义规则
			// ###################################################################################################
			String sql="from Atzweibaosbsqd where weibaodlx in ('3','4') and ( id in (select  weibaosqdid from Atzchurukjhd where id in (select atzchurukjhdid from Atzchurukjhdmx where  (weicrksl>0 or weicrksl is null)) and weibaosqdid is not null) or danjuzt!=3)";
			List<Atzweibaosbsqd> sqdList =dataset.getListByHql("Atzweibaosbsqd",sql);
			//~~~此段代码用于维护天数~~~
			for(Atzweibaosbsqd sqd:sqdList){
				Date shenqingsj=sqd.getShenqingsj();
				Date current=new Date();
				Calendar c1=Calendar.getInstance();
				Calendar c2=Calendar.getInstance();
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
				c1.setTime(df.parse(df.format(shenqingsj)));
				c2.setTime(df.parse(df.format(current)));	
				int ce=(int)((c2.getTimeInMillis()-c1.getTimeInMillis())/1000/60/60/24);
				if(ce >= 30){
					ce = 30;
				}
				sqd.setSytianshu(ce);
				}
			//~~~结束~~~
			return "OK";
			// ###################################################################################################
			// over
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "error";
	}
}
