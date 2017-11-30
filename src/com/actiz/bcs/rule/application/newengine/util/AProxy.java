package com.actiz.bcs.rule.application.newengine.util;

import java.lang.reflect.InvocationTargetException;

import com.actiz.bcs.rule.application.engine.RuleEngine;
import org.apache.log4j.Logger;
import com.actiz.bcs.rule.application.engine.*;
import com.actiz.platform.application.dataset.pojo.*;
import com.actiz.platform.application.dataset.IDataSet;
import com.actiz.platform.common.datacontext.IDataContext;
import com.actiz.platform.common.beanresource.BcResourceApplication;
import com.actiz.platform.common.datacontext.DataContextFactory;
import com.actiz.resource.document.application.*;
import com.actiz.resource.integration.application.IntegrationUtil;
import com.actiz.util.application.*;
import com.actiz.util.http.HttpConnection;

import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;
import jxl.Workbook;
import java.util.Calendar;
import com.actiz.resource.rule.application.ReturnMsg;
import java.math.BigDecimal;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class AProxy {
	private static Logger logger = Logger.getLogger(AProxy.class); 
	static Class classObj = null;
	static Object a = null; 
	public AProxy(){
		classObj = RuleEngine.getA();
		a = com.actiz.util.application.BeanUtil.getSingletonInstance(classObj);
	}
	
	//-----实体拷贝
	public  void copyBeanToBean(Object obj1,Object obj2) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		 classObj.getMethod("copyBeanToBean"  ,Object.class  ,Object.class ).invoke(a ,obj1  ,obj2 );
	}
//-----BOM
	public  String digui(long fuid,double count,long xmid,long ckjhdid,List ckjhdmxList,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui"  ,long.class  ,double.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,fuid  ,count  ,xmid  ,ckjhdid  ,ckjhdmxList  ,dataset );
	}
//-----BOM1
	public  String digui1(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui1"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,scjhid  ,scjhmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,fubomfxjgid  ,list11  ,dataset );
	}
//-----递归BOM
	public boolean diguibl(Long bomid,Long yuanfubommxid,Long xinfubommxid,int cengci,String lujing,IDataSet dataset,String employeeName) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (java.lang.Boolean) classObj.getMethod("diguibl"  ,Long.class  ,Long.class  ,Long.class  ,int.class  ,String.class  ,IDataSet.class  ,String.class ).invoke(a ,bomid  ,yuanfubommxid  ,xinfubommxid  ,cengci  ,lujing  ,dataset  ,employeeName );
	}
//-----递归删除BOM明细
	public List getList(Long fubommxid,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (List) classObj.getMethod("getList"  ,Long.class  ,IDataSet.class ).invoke(a ,fubommxid  ,dataset );
	}
//-----BOM明细修改判断
	public String digui(Long fubommxid,Long wuliaoid,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui"  ,Long.class  ,Long.class  ,IDataSet.class ).invoke(a ,fubommxid  ,wuliaoid  ,dataset );
	}
//-----deleteBomfxjgByFuid
	public String deleteBomfxjgByFuid(int an,long xmid,long fuid,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("deleteBomfxjgByFuid"  ,int.class  ,long.class  ,long.class  ,IDataSet.class ).invoke(a ,an  ,xmid  ,fuid  ,dataset );
	}
//-----getBomfxjgListByFubomfxjgid
	public String getBomfxjgListByFubomfxjgid(Long fubomfxjgid,Long ckjhdid,List ckjhdmxList,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("getBomfxjgListByFubomfxjgid"  ,Long.class  ,Long.class  ,List.class  ,IDataSet.class ).invoke(a ,fubomfxjgid  ,ckjhdid  ,ckjhdmxList  ,dataset );
	}
//-----getBomfxjgListByFubomfxjgid1
	public String getBomfxjgListByFubomfxjgid1(Long fubomfxjgid,Long ckjhdid,List ckjhdmxList,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("getBomfxjgListByFubomfxjgid1"  ,Long.class  ,Long.class  ,List.class  ,IDataSet.class ).invoke(a ,fubomfxjgid  ,ckjhdid  ,ckjhdmxList  ,dataset );
	}
//-----BOM2
	public  String digui2(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui2"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,scjhid  ,scjhmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,fubomfxjgid  ,list11  ,dataset );
	}
//-----BOM3
	public  String digui3(long bomid,long fuid,long scjhid,long scjhmxid,long fubomfxjgid,double count,long xmid,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui3"  ,long.class  ,long.class  ,long.class  ,long.class  ,long.class  ,double.class  ,long.class  ,IDataSet.class ).invoke(a ,bomid  ,fuid  ,scjhid  ,scjhmxid  ,fubomfxjgid  ,count  ,xmid  ,dataset );
	}
//-----BOM4
	public  String digui4(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui4"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,scjhid  ,scjhmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,fubomfxjgid  ,list11  ,dataset );
	}
//-----BOM5
	public  String digui5(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui5"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,scjhid  ,scjhmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,fubomfxjgid  ,list11  ,dataset );
	}
//-----ClobToString
	public static String clobToString(Object clob) throws Exception  ,  IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("clobToString"  ,Object.class ).invoke(a ,clob );
	}
//-----BOM6
	public  String digui6(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui6"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,long.class  ,List.class  ,IDataSet.class ).invoke(a ,scjhid  ,scjhmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,fubomfxjgid  ,list11  ,dataset );
	}
//-----版本发布克隆
	public boolean diguibl(Long yuanfubommxid,Long xinfubommxid,int cengci,String lujing,IDataSet dataset,String employeeName) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (java.lang.Boolean) classObj.getMethod("diguibl"  ,Long.class  ,Long.class  ,int.class  ,String.class  ,IDataSet.class  ,String.class ).invoke(a ,yuanfubommxid  ,xinfubommxid  ,cengci  ,lujing  ,dataset  ,employeeName );
	}
//-----BOM7
	public String digui7(long scrwid, long scrwmxid, long xmid, double count, double mdwsl, long bomid, long fubommxid, IDataSet dataset) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("digui7"  ,long.class  ,long.class  ,long.class  ,double.class  ,double.class  ,long.class  ,long.class  ,IDataSet.class ).invoke(a ,scrwid  ,scrwmxid  ,xmid  ,count  ,mdwsl  ,bomid  ,fubommxid  ,dataset );
	}
//-----数值型加
	public  static Double add(Double a,Double b) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (Double) classObj.getMethod("add"  ,Double.class  ,Double.class ).invoke(a ,a  ,b );
	}
//-----数值型减
	public  static Double subtract(Double a,Double b) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (Double) classObj.getMethod("subtract"  ,Double.class  ,Double.class ).invoke(a ,a  ,b );
	}
//-----精确的除法运算
	public static double div(double v1, double v2, int scale) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (java.lang.Double) classObj.getMethod("div"  ,double.class  ,double.class  ,int.class ).invoke(a ,v1  ,v2  ,scale );
	}
//-----数值型乘
	public static Double mul(Double a,Double b) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (Double) classObj.getMethod("mul"  ,Double.class  ,Double.class ).invoke(a ,a  ,b );
	}
//-----维护创建信息
	public void setCreateInfo(Object obj, HttpServletRequest request) throws Exception  ,  IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		 classObj.getMethod("setCreateInfo"  ,Object.class  ,HttpServletRequest.class ).invoke(a ,obj  ,request );
	}
//-----维护修改信息
	public void setModifyInfo(Object obj, HttpServletRequest request) throws Exception  ,  IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		 classObj.getMethod("setModifyInfo"  ,Object.class  ,HttpServletRequest.class ).invoke(a ,obj  ,request );
	}
//-----把xml字符串话
	public static String getXmlToString(Document document) throws   IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		return (String) classObj.getMethod("getXmlToString"  ,Document.class ).invoke(a ,document );
	}
	
}
