/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-12-06 11:29:58.473
*/
 

package com.actiz.platform.application.formdatafacility.model2;

import com.actiz.platform.application.dataset.pojo.*;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import com.actiz.platform.application.formdatafacility.api.ContextHelper;
import com.actiz.platform.application.formdatafacility.api.IFlowbutton;
import com.actiz.platform.common.formdatafacility.util.BeanUtil;
import com.actiz.platform.application.formdatafacility.api.FormDataFactory;
import com.actiz.platform.application.formdatafacility.api.ImplDataset;
import com.actiz.platform.common.datacontext.IDataContext;
import java.util.*;
import com.actiz.util.application.AtzUtil;
import com.actiz.util.application.Idataset;
import com.actiz.util.application.Iutil;
import java.sql.*;
import javax.sql.*;

import com.actiz.platform.application.dataset.DataSetImpl;
import com.actiz.platform.application.dataset.IDataSet;

import org.apache.log4j.Logger;

public class FlowbuttonImpl implements IFlowbutton {

	public Logger logger = Logger.getLogger(FlowbuttonImpl.class);
	
	private IDataSet dataset;
	private HttpServletRequest request;
	
	public IDataSet getDataSet(HttpServletRequest request) {
		dataset = new DataSetImpl(request);
		return dataset;
	}

	//修改(取消)预定按钮是否可用
	public boolean judgement_2a6eed5800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//创建时间：2010-11-8
//创建人  ：陈红雨
//功能描述：预定日期过了之后，不能再修改预定了。
try
{
java.util.Date now = new java.util.Date();
java.text.SimpleDateFormat myFormatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
String yudingrq=getField("Atzhuiyisyd_yudingrq");
java.util.Date date= myFormatter.parse(yudingrq);		
java.util.Date tempnow=myFormatter.parse(myFormatter.format(now));
if(tempnow.compareTo(date)>0)
{
return false;
}
else
{
return true;
}
}
catch (Exception e)
{
}
return true;
	}
	//审核中删除按钮不可用
	public boolean judgement_2a47492500000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//创建时间：2010-11-8
//创建人  ：陈红雨
//功能描述：审核中的删除按钮就不可用了

String shenhezt=getField("Atzqingjia_shenhezt");
if("1".equals(shenhezt))
{
return false;
}
else
{
return true;
}
	}
	//Jud-被引用的仓库不能修改及删除-06
	public boolean judgement_4949a92e00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id=getField("id");
String hql="from Atzkucun where cangkuid="+id;
List kucuns=dataset.getListByHql("Atzkucun",hql);
if(kucuns!=null&&kucuns.size()>0){
     return false;
}else{
         return true;
}
	}
	//申请单只有本人才可以操作-06
	public boolean judgement_7588a9610000000bz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String employeeName=(String)request.getSession().getAttribute("employeeName");
String lurur=getField("lurur");
if(lurur.equals(employeeName))
  return true;
return false;
	}
	//jud-单板状态修改是否可用-10
	public boolean judgement_40a459d400000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		return true;
	}
	//J-判断能否操作团队-05
	public boolean judgement_8e69da2300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Object obj = request.getSession().getAttribute("teamEmployeeId");
logger.debug("obj-------"+obj);
            	if(obj!= null && (Long)obj>0)
            		return true;
            	else
            		return false;
	}
	//判断-合同能否归档-05
	public boolean judgement_5420653300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		/*String shifougd = getField("atzhetong_shifougd");   
if("1".equals(shifougd))
     return false;
*/
String zhuxiaozt= getField("atzhetong_zhuxiaozt");   
if(!"1".equals(zhuxiaozt))
     return false;

return true;
	}
	//jud-检验按钮是否可用-10
	public boolean judgement_637cc02b00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zx = getField("atzjianyand_shifouzx"); // 是否执行: 1-是  2-否
if("1".equals(zx.trim()))
      return false;

String zt = getField("atzjianyand_jianyandzt"); // 检验单状态

if ("1".equals(zt.trim()) || "5".equals(zt.trim()) || "7".equals(zt.trim()))
     return true;
else 
     return false;
	}
	//单据关闭
	public boolean judgement_d244685600000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String str = getField("atzcalllog_shifougb");
if("1".equals(str))
return false;
else
return true;
	}
	//jud-生产任务-是否可提交-08
	public boolean judgement_10660c8200000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务-是否可提交-08~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("atzscrw_lurur");

String shzt = getField("atzscrw_shenhezt");
logger.info("~~~jud-生产任务-是否可提交-08~~~shzt ="+shzt );
if("1".equals(shzt.trim()) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//调账是否确定-06
	public boolean judgement_b6e9ba1800000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		/*
String sftj = getField("sftj");
	
if ("1".equals(sftj))
	return false;
else
	return true;
*/
//修改  现在根据是否提交来确认
String danjuzt = getField("danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废

if ("1".equals(danjuzt))
    return true;

    
return false;
	}
	//jud-物料是否可以停用-06
	public boolean judgement_9edf676100000008z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifouqy=getField("shifouqy");

if("1".equals(shifouqy)){
   return true;
}else{
   return false;
}
	}
	//jud-物料是否可以启动-06
	public boolean judgement_9eddaeaa00000007z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifouqy=getField("shifouqy");
logger.debug("shifouqy==="+shifouqy);
if("2".equals(shifouqy)){
   return true;
}else{
   return false;
}
	}
	//判断合同能否修改/删除-05
	public boolean judgement_be7eb4ed00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzhetong_pingshenzt");
if(zhuangtai != null && "1".equals(zhuangtai))
return true;
else
return false;
	}
	//采购计划撤销显示
	public boolean judgement_50f261c100000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzcaigoujh_zhixingzt");
if("1".equals(danjuzt)){
return true;
}else{
return false;
}
	}
	//入库单据打印
	public boolean judgement_a2c7c9fc0000000cz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String jianyandid = getField("atzchurukd_jianyandid");
if(jianyandid == null || "".equals(jianyandid.trim())) {
	return true;
}

return false;
	}
	//判断采购需求能否删除
	public boolean judgement_486bc07000000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoucxbj = getField("atzcaigoujh_shifoucxbj");
String sffsh=getField("atzcaigoujh_shifoufsh");
String zhuangtai = getField("atzcaigoujh_danjuzt");


if(shifoucxbj != null && "1".equals(shifoucxbj)&&"1".equals(zhuangtai)){
  return true; 
}

if(zhuangtai != null && "1".equals(zhuangtai)){
   	
 return true;
                 
}else{
return false;
}
	}
	//判断添加到货通知单是否显示
	public boolean judgement_8a348b6100000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String  hql="from Atzcaigouhtmx where  caigouhtid="+Long.valueOf(getField("atzcaigouht_id"))+"  and shifoudh!=1";
  	List<Atzcaigouhtmx> caigouhtmxList = dataset.getListByHql("Atzcaigouhtmx", hql);
  	
  	if(caigouhtmxList.size()>0){
  	return true;
  	}else{
  	
  	return false;
  	}
	}
	//jud-生产任务明细-是否已生成MAC-08
	public boolean judgement_0fc3dcd200000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务明细-是否已生成MAC-08~~in~");

String sf = getField("atzscrwmx_shifouyfh");
logger.info("~~~jud-生产任务明细-是否已生成MAC-08~~~sf ="+sf );
if("1".equals(sf)){
return true;
}else{
return false;
}
	}
	//jud-生产任务明细-是否已生成SN-08
	public boolean judgement_0fc4125d00000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务明细-是否已生成SN-08~~in~");

String sf = getField("atzscrwmx_shifouyfh");
String wlid = getField("atzscrwmx_wuliaoid");
logger.info("~~~jud-生产任务明细-是否已生成SN-08~~sf ="+sf+"~wlid="+wlid );
Atzwuliaojcxx wl=(Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,Long.parseLong(wlid));
String sfsngl=wl.getSngl();
logger.info("~~~jud-生产任务明细-是否已生成SN-08~~1可用~sfsngl="+sfsngl);
if("2".equals(sf) && "1".equals(sfsngl)){
return true;
}else{
return false;
}
	}
	//jud-生产批号-是否可生成MAC-08
	public boolean judgement_67af270f00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产批号-是否可生成MAC-08~~in~");

String scrwid_str= getField("atzscph_scrwid");
if(null==scrwid_str || "".equals(scrwid_str)){
  return true;
}else{
  return false;
}
	}
	//js-研发试制是否可删除-10
	public boolean judgement_64eb914d00000007z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String djzt = getField("atzyanfasz_yewuzt");

if ("0".equals(djzt)) {
	return true;
} else {
	return false;
}
	}
	//jud-调帐单-06H
	public boolean judgement_03327ef800000007z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废

if ("1".equals(danjuzt))
    return true;

    
return false;
	}
	//jud-检验报告修改是否可用-10
	public boolean judgement_4d9bdd4e00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoulrbg = getField("atzjianyandmx_shifoulrbg");
if("1".equals(shifoulrbg)) {
   return false;
}

return false;
	}
	//判断采购合同未审核中的注销按钮是否显示
	public boolean judgement_32f775eb00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束


String danjuzt=getField("atzcaigouht_danjuzt");

if(!"2".equals(danjuzt)){
	return false;
}else{
     	return true;
}
	}
	//jud-出/入库计划-是否已审核是否能领料-08
	public boolean judgement_c3005e3f00000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-出/入库计划-是否已审核是否能领料-08~~in~");

Object crkjhdid_obj = context.get("atzchurukjhd.id");
logger.info("~~~jud-出/入库计划-是否已审核是否能领料-08~~~crkjhdid_obj= "+crkjhdid_obj );
Atzchurukjhd crkjhd = (Atzchurukjhd)dataset.getObject(Atzchurukjhd.class,Long.valueOf(String.valueOf(crkjhdid_obj)));
String djzt = crkjhd.getDanjuzt();
String djlx = crkjhd.getDanjulx();
logger.info("~~~jud-出/入库计划-是否已审核是否能领料-08~~~crkjhd.shzt ="+djzt);
logger.info("~~~jud-出/入库计划-是否已审核是否能领料-08~~~crkjhd.crklx ="+djlx);

if("3".equals(djzt) && "1".equals(djlx)){
return true;
}else{
return false;
}
	}
	//单据关闭返回false
	public boolean judgement_a44918c900000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-calllog-是否可关闭-09~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("atzcalllog_lurur");
String shifou = getField("atzcalllog_shifougb");
logger.debug("lurur==="+lurur);
if("2".equals(shifou.trim()) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//判断-已评审及无需评审合同能否修改删除
	public boolean judgement_2694825500000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzhetong_shifouxynbps");
if(zhuangtai != null && "2".equals(zhuangtai))
return true;
else
return false;
	}
	//判断采购计划重新审核是否显示
	public boolean judgement_c0b90cbd00000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhixingzt=getField("atzcaigoujh_zhixingzt");
if(!"1".equals(zhixingzt)){
	
	return false;
}
String  caigoujhid=getField("atzcaigoujh_id");
String  hql="from  Atzchurukjhd  where  caigoujhid="+caigoujhid;

// Atzchurukjhd  churukjhd =( Atzchurukjhd )dataset.getObjectByHql("Atzchurukjhd",hql);
 	List<Atzchurukjhd> churukjhdList = dataset.getListByHql("Atzchurukjhd", hql);
   		if(churukjhdList.size()>0){
      Atzchurukjhd churukjhd =null;		
	for(int i=0; i<churukjhdList.size();i++){
		 churukjhd =churukjhdList.get(i);
 
 if(churukjhd!=null){
 	if(!"1".equals(churukjhd.getDanjuzt())){
 		return false;
 	}
 	
}
}
}
return true;
	}
	//jud-派遣单是否已派发-06
	public boolean judgement_0a50cd3f00000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt=getField("atzxiangmupqd_danjuzt");
if(danjuzt!=null&&!"1".equals(danjuzt))
   return false;
else
   return true;
	}
	//特殊放行
	public boolean judgement_62605a8200000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zt = getField("atzteshufxd_danjuzt");
if("1".equals(zt)) {
	return true;
}

return false;
	}
	//入库计划详情-打印
	public boolean judgement_509afa9700000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjulx  = getField("atzchurukjhd_danjulx");
if("1".equals(danjulx.trim())) {
	return true;
}

return false;
	}
	//判断-合同管理列表上是否已经完善-05
	public boolean judgement_607a2a7a00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzhetong_shifouws");
if(zhuangtai != null && !"2".equals(zhuangtai))
return false;
else
return true;
	}
	//jud-生产任务-测试任务是否以下达-08
	public boolean judgement_0aab5a1b00000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务-测试任务是否以下达-08~~in~");

Object scrwid_obj = context.get("atzscrw.id");
logger.info("~~~jud-生产任务-测试任务是否以下达-08~~~scrwid_obj= "+scrwid_obj );
Atzscrw scrw = (Atzscrw)dataset.getObject(Atzscrw.class,Long.valueOf(String.valueOf(scrwid_obj)));

logger.info("~~~jud-生产任务-测试任务是否以下达-08~~~scrw.shifouyxd ="+scrw.getShifouyxd());
if("2".equals(scrw.getShifouyxd())){
return true;
}else{
return false;
}
	}
	//未成功派发不能写工程进度-06
	public boolean judgement_98a7a9ee0000000az(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt=getField("atzxiangmupqd_danjuzt");
if(danjuzt!=null&&"3".equals(danjuzt))
   return true;
else
   return false;
	}
	//jud-检验报告录入是否可用-10
	public boolean judgement_4d9c228700000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoulrbg = getField("atzjianyandmx_shifoulrbg");
if("1".equals(shifoulrbg)) {
   return false;
}

return false;
	}
	//jud-录入报告-10
	public boolean judgement_a43d5a5e00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zx = getField("atzjianyand_shifouzx");
String shifoufsbg = getField("atzjianyand_shifoufsbg");
if("1".equals(zx.trim())) {
	if(!"1".equals(shifoufsbg)) {
		return true;
	}
}

return false;
	}
	//jud-MAC地址-是否可编辑-08
	public boolean judgement_cd7ded600000000bz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-MAC地址-是否可编辑-08~~in~");

String danjusc = getField("atzmacdd_danjusc");
logger.info("~~~jud-MAC地址-是否可编辑-08~~~danjusc="+danjusc );
if("1".equals(danjusc)){
return true;
}else{
return false;
}
	}
	//jud-生产批号-是否可编辑-08
	public boolean judgement_cd7ce42a0000000az(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产批号-是否可编辑-08~~in~");

String danjusc = getField("atzscph_danjusc");
logger.info("~~~jud-生产批号-是否可编辑-08~~~danjusc="+danjusc );
if("1".equals(danjusc)){
return true;
}else{
return false;
}
	}
	//jud-测试记录-总测判断是否可修改、删除-08
	public boolean judgement_8cf6624200000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-测试记录-总测判断是否可修改、删除-08~~in~");

String sf= getField("atzceshijl_shifouzcwc");
if("1".equals(sf)){
  return false;
}
return true;
	}
	//jud-打印-10
	public boolean judgement_8eb9daf000000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		return false;
	}
	//采购计划取消变更是否显示
	public boolean judgement_71de60a700000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhixingzt=getField("atzcaigoujh_zhixingzt");
if(!"1".equals(zhixingzt)){
	
	return false;
}
String  caigoujhid=getField("atzcaigoujh_id");
String  hql="from  Atzchurukjhd  where  caigoujhid="+caigoujhid;

 Atzchurukjhd  churukjhd =( Atzchurukjhd )dataset.getObjectByHql("Atzchurukjhd",hql);
 
 if(churukjhd!=null){
 	if(!"1".equals(churukjhd.getDanjuzt())){
 		return false;
 	}
 	
}

String shifou = getField("atzcaigoujh_shifouqbcg");
if("1".equals(shifou)){
return false;
}
else{
return true;
}
	}
	//判断-未评审合同能否提交-05
	public boolean judgement_a6cfe8c600000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzhetong_pingshenzt");
String xuyaops =getField("atzhetong_shifouxynbps");
if(xuyaops != null && "2".equals(xuyaops))
return false;
if(zhuangtai != null && "1".equals(zhuangtai))
return true;
return false;
	}
	//jud-检验撤销-10
	public boolean judgement_a42d33d600000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zx = getField("atzjianyand_shifouzx"); // 是否执行
if("1".equals(zx.trim())) {
      return false;
}

String zt = getField("atzjianyand_jianyandzt"); // 检验单状态

if ("2".equals(zt.trim()) || "3".equals(zt.trim())) {	
	return true;
} 

return false;
	}
	//jud-出/入库单-是否已执行-15
	public boolean judgement_c2a7047000000009z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String sfzx = getField("atzchurukd_shifouzx");

if("2".equals(sfzx)){
  return true;
}else{
  return false;
}
	}
	//判断采购需求修改删除审核显示
	public boolean judgement_c2a5ccf500000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoucxbj = getField("atzcaigoujh_shifoucxbj");
String sffsh=getField("atzcaigoujh_shifoufsh");


if(shifoucxbj != null && "1".equals(shifoucxbj)&&!"1".equals(sffsh)){
  return true; 
}

String zhuangtai = getField("atzcaigoujh_danjuzt");
if(zhuangtai != null && "1".equals(zhuangtai)&&!"1".equals(sffsh)){
   	
 return true;
                 
}else{
return false;
}
	}
	//jud-生产计划明细-是否进行MRP运算-08
	public boolean judgement_456afe1d00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划明细-是否进行MRP运算-08~~in~");

Object scjhid_obj = context.get("atzscjh.id");
logger.info("~~~jud-生产计划明细-是否进行MRP运算-08~~~scjhid_obj= "+scjhid_obj );
if(scjhid_obj != null ){
Atzscjh scjh=null;
try{
  scjh = (Atzscjh)dataset.getObject(Atzscjh.class,Long.valueOf(String.valueOf(scjhid_obj)));
}catch(Exception e){
  return false;
}

String sf = getField("atzscjhmx_shifouymrpys");

logger.info("~~~jud-生产计划明细-是否进行MRP运算-08~~~scjh.shzt ="+scjh.getShenhezt()+"~sfmrp="+sf);
if( "3".equals(scjh.getShenhezt()) && "2".equals(sf.trim()) ){
return true;
}else{
return false;
}
}
return false;
	}
	//释放库存-10
	public boolean judgement_cfcaf8ec00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zyjlid = getField("id"); //占用记录ID
Atzzhanyongjl zyjl = (Atzzhanyongjl)dataset.getObject(Atzzhanyongjl.class, Long.parseLong(zyjlid));

Long crkjhid = zyjl.getCrkjhid(); //出库计划单ID
logger.info("出库计划单ID: "+crkjhid);

Atzchurukjhd churukjhd = (Atzchurukjhd)dataset.getObject(Atzchurukjhd.class, crkjhid);
String danjuzt = churukjhd.getDanjuzt(); //单据状态
if("1".equals(danjuzt) || "2".equals(danjuzt)) {
	return false;
}

Long diaobodid = zyjl.getDiaobodid();

if(diaobodid != null) {
	return false;
}

if(crkjhid != null) {
	List<Atzchurukd> churukds = dataset.getList("Atzchurukd", "churukjhdid="+crkjhid);
	if(churukds != null && churukds.size() > 0) {
		return false;
	} 
}

return false; //false
	}
	//调帐是否确定-确定按钮-06H
	public boolean judgement_0723a0cd00000008z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改  现在根据是否提交来确认
String sftj = getField("sftj");
String danjuzt = getField("danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
//审核已通过并且未确认的
if ("3".equals(danjuzt) && "2".equals(danjuzt))
    return true;

    
return false;
	}
	//jud-出/入库单-是否已扫号-08
	public boolean judgement_c2a3551800000008z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-出/入库单-是否已扫号-08~~in~");

String sfysh = getField("atzchurukd_shifouysh");
String djlx = getField("atzchurukd_danjulx");
logger.info("~~~jud-出/入库单-是否已扫号-08~~~sfysh="+sfysh+"~djlx= "+djlx );
if("2".equals(sfysh) && "2".equals(djlx)){
return true;
}else{
return false;
}
	}
	//jud-生产计划明细-是否已生成领料单-08
	public boolean judgement_2a9d210a00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划明细-是否已生成领料单-08~~in~");

Object scjhid_obj = context.get("atzscjh.id");
logger.info("~~~jud-生产计划明细-是否已生成领料单-08~~~scjhid_obj= "+scjhid_obj );
if(scjhid_obj != null ){
Atzscjh scjh=null;
try{
  scjh = (Atzscjh)dataset.getObject(Atzscjh.class,Long.valueOf(String.valueOf(scjhid_obj)));
}catch(Exception e){
  return false;
}
String shzt= scjh.getShenhezt();
logger.info("~~~jud-生产计划明细-是否已生成领料单-08~~~shzt ="+shzt );

String sf = getField("atzscjhmx_shifouysclld");
logger.info("~~~jud-生产计划明细-是否已生成领料单-08~~~sf ="+sf );
if("2".equals(sf.trim()) && "3".equals(shzt.trim())){
return true;
}else{
return false;
}
}else{
return false;
}
	}
	//付款申请单修改删除提交是否显示
	public boolean judgement_61e772d800000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoutj = getField("shifoutjsh");
if("1".equals(shifoutj)){
return false;
}
else{
return true;
}
	}
	//判断-合同注销能否操作-05
	public boolean judgement_5c6c8ba200000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
logger.error("***"+hetongId+"***");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   logger.error("^^^"+hetong.getZhuxiaozt()+"^^^");
   if("1".equals(hetong.getZhuxiaozt()))
     return true;
}
return false;
	}
	//判断采购付款申请单修改删除按钮是否显示
	public boolean judgement_6d57daee00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoucxbj = getField("shifoucxbj");

if(shifoucxbj != null && "1".equals(shifoucxbj)){
  return true; 
}

String shifoutj = getField("shifoutjsh");
if("1".equals(shifoutj)){
return false;
}
else{
return true;
}
	}
	//jud-生产任务-是否可编辑-08
	public boolean judgement_a17bcbce00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务-是否可编辑-08~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("atzscrw_lurur");

String danjusc = getField("atzscrw_danjusc");
String shzt = getField("atzscrw_shenhezt");

logger.info("~~~jud-生产任务-是否可编辑-08~~1.equals(danjusc) &&~danjusc="+danjusc+"~shzt="+shzt );
if("1".equals(shzt) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//jud-修改按钮是否可用-10
	public boolean judgement_628166fb00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zx = getField("atzjianyand_shifouzx");
if("1".equals(zx.trim())) {
      return false;
}

String zt = getField("atzjianyand_jianyandzt");
String jianyandId = getField("atzjianyand_id"); //检验单ID

boolean shifouscrkd = false; //是否生成入库单

List<Atzchurukd> churukds = dataset.getList("Atzchurukd", "jianyandid="+jianyandId);
if(churukds != null && churukds.size() > 0) {
	shifouscrkd = true;
}


if ("2".equals(zt.trim()) || "3".equals(zt.trim())) {
	if(shifouscrkd) {
		return false;
    } 
	
	return false;
} 

return false;
	}
	//jud-是否停用-06
	public boolean judgement_ead23e0300000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifouqy=getField("atzbom_shifouqy");
String danjuzt=getField("atzbom_danjuzt");
if("1".equals(shifouqy)&&"3".equals(danjuzt)){
   return true;
}else{
   return false;
}
	}
	//jud-线缆检验是否可用-08
	public boolean judgement_ab172bcc0000000bz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-线缆检验是否可用-08~~in~");

String jydlx= getField("atzjianyand_jianyanlx");
logger.info("~~~jud-线缆检验是否可用-08~~~jydlx="+jydlx);
if("3".equals(jydlx)){
return true;
}else{
return false;
}
	}
	//jud-半成品/成品检验是否可用-08
	public boolean judgement_ab1609b20000000az(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-半成品/成品检验是否可用-08~~in~");

String jydlx= getField("atzjianyand_jianyanlx");
logger.info("~~~jud-半成品/成品检验是否可用-08~~~jydlx="+jydlx);
if("2".equals(jydlx)){
return true;
}else{
return false;
}
	}
	//jud-原材料检验是否可用-08
	public boolean judgement_ab124f4100000009z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-原材料检验是否可用-08~~in~");

String jydlx= getField("atzjianyand_jianyanlx");
logger.info("~~~jud-原材料检验是否可用-08~~~jydlx="+jydlx);
if("1".equals(jydlx)){
return true;
}else{
return false;
}
	}
	//jud-生产任务-是否可生成送检单-08
	public boolean judgement_9b5d8ff100000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//admin不可见；审核通过后1（生产任务）、4（更换/升级）可以看到该按钮
Object obj = request.getSession().getAttribute("employeeName");
if(obj == null) {
	return false;
}
Object scrwid_obj = context.get("atzscrw.id");
if (scrwid_obj != null) {
	Atzscrw scrw = null;
	try {
		scrw = (Atzscrw) dataset.getObject(Atzscrw.class, Long.valueOf(String.valueOf(scrwid_obj)));
	} catch (Exception e) {
		return false;
	}
	if ("3".equals(scrw.getShenhezt()) && ("1".equals(scrw.getScrwdlx()) || "4".equals(scrw.getScrwdlx()))) {
		return true;
	} else {
		return false;
	}
}
return false;
	}
	//判断执行采购计划是否显示
	public boolean judgement_ba16a58a00000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Long teamEmployeeId=(Long)request.getSession().getAttribute("teamEmployeeId");
String  hql="from Atzcaigoujhmx where  caigoujh="+Long.valueOf(getField("atzcaigoujh_id"))+" and shifouyzx=2 and caigouy="+teamEmployeeId;
  	List<Atzcaigoujhmx> caigoujhmxList = dataset.getListByHql("Atzcaigoujhmx", hql);
  	
  	if(caigoujhmxList.size()>0){
  	return true;
  	}else{
  	
  	return false;
  	}
	}
	//按钮是否可用
	public boolean judgement_e1546f1e00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//创建时间：2010-10-25
//创建人  ：陈红雨
//功能描述：提交审核中，审核后的按钮就不可用了

String shenhezt=getField("Atzqingjia_shenhezt");
if("1".equals(shenhezt)||"2".equals(shenhezt))
{
return false;
}
else
{
return true;
}
	}
	//出库计划单-缺料提交是否可用-15
	public boolean judgement_8f55850400000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzchurukjhd_danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
String churukyy = getField("atzchurukjhd_churukyy"); // 出入库原因

if("1".equals(danjuzt)){
    if("1".equals(churukyy)){
        return true;
    }
}

return false;
	}
	//明细视图-10
	public boolean judgement_c2e1ed2e0000000fz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		return false;
	}
	//判断-合同是否可以开票
	public boolean judgement_a2566c1600000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if(!"1".equals(hetong.getZhuxiaozt()))
     return false;
   if(!"1".equals(hetong.getShifouws()))
     return false;
}
return true;
	}
	//判断-合同能否发货
	public boolean judgement_a2528c2c00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()) || !"1".equals(hetong.getZhuxiaozt()))
     return false;
}
return true;
	}
	//jud-检验单新增-10
	public boolean judgement_819975e400000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		return false;
	}
	//判断合同是否注销
	public boolean judgement_c22fb9aa00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("2".equals(hetong.getZhuxiaozt())||"3".equals(hetong.getZhuxiaozt()))
     return false;
}
return true;
	}
	//判断-合同简要撤消申请是否显示-05
	public boolean judgement_5c257d5300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("3".equals(hetong.getZhuxiaozt()))
     return true;
   }
return false;
	}
	//生成调拨按钮-10
	public boolean judgement_d279539600000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String churukjhdid = getField("atzchurukjhd_id");

if (churukjhdid == null || "".equals(churukjhdid))
	return false;	

Atzchurukjhd churukjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, Long.parseLong(churukjhdid));

String danjuzt = churukjhd.getDanjuzt();
if ("2".equals(danjuzt) || "3".equals(danjuzt))
	return false;	

Atzdiaobod diaobod = (Atzdiaobod) dataset.getObjectByHql("Atzdiaobod", "from Atzdiaobod where ckjhdbh='" + churukjhd.getBianhao() + "'" + " and sfzf='2'");

if (diaobod == null)
	return true;	
else
	return false;
	}
	//机会关闭返回false
	public boolean judgement_396af67900000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String str = getField("atzxiaoshoujh_shifougb");
if("1".equals(str))
return false;
else
return true;
	}
	//判断采购计划修改删除是否显示
	public boolean judgement_76d041fc00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzcaigoujh_danjuzt");
if("1".equals(danjuzt)){
return true;
}
else{
return false;
}
	}
	//jud-维修任务-判断根据出库单按钮是否可用-08
	public boolean judgement_956abe0300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-维修任务-判断根据出库单按钮是否可用-08~~in~");

Object scrwid_obj = context.get("atzscrw.id");
logger.info("~~~jud-维修任务-判断根据出库单按钮是否可用-08~~~scrwid_obj="+scrwid_obj);
if(scrwid_obj!=null){
  Atzscrw scrw=(Atzscrw)dataset.getObject(Atzscrw.class,Long.parseLong(String.valueOf(scrwid_obj)));
  String lx=scrw.getScrwdlx();
  if("3".equals(lx.trim()))
    return false;
}
return true;
	}
	//备货通知单-判断是否已经撤消
	public boolean judgement_76c1bc7800000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("shifouqx");
if(zhuangtai != null && "2".equals(zhuangtai))
return true;
else
return false;
	}
	//jud-是否启用-06
	public boolean judgement_eac7ffe600000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifouqy=getField("atzbom_shifouqy");
String danjuzt=getField("atzbom_danjuzt");
if("2".equals(shifouqy)&&"1".equals(danjuzt)){
   return true;
}else{
   return false;
}
	}
	//备货通知单-判断能否提交/修改/删除
	public boolean judgement_76c0e83200000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzbeihuotzd_danjuzt");
if(zhuangtai != null && "1".equals(zhuangtai)){
return true;
}
else
return false;
	}
	//jud-调拨单-是否已提交-15
	public boolean judgement_eac7599500000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废

if ("1".equals(danjuzt))
    return true;

    
return false;
	}
	//判断采购计划中的撤销按钮是否显示
	public boolean judgement_0b764eb200000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzcaigoujh_zhixingzt");
if("1".equals(danjuzt)){
	
	String  caigoujhid=getField("atzcaigoujh_id");
String  hql="from  Atzchurukjhd  where  caigoujhid="+caigoujhid;

 
 	List<Atzchurukjhd> churukjhdList = dataset.getListByHql("Atzchurukjhd", hql);
   		if(churukjhdList.size()>0){
      Atzchurukjhd churukjhd =null;		
	for(int i=0; i<churukjhdList.size();i++){
		 churukjhd =churukjhdList.get(i);
 
 if(churukjhd!=null){
 	if(!"1".equals(churukjhd.getDanjuzt())){
 		return false;
 	}
 	
}
}
}
	
return true;
}else{
return false;
}
	}
	//是否新增结账-06
	public boolean judgement_8d635c6000000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		List wjzList =dataset.getListByHql("Atzjiezhangjl","from Atzjiezhangjl where sfjz in ('1','2')");
if (wjzList==null||wjzList.size()<=0)
	return true;
else
	return false;
	}
	//出/入库计划单-能否修改/提交-10
	public boolean judgement_0bf7f65a00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzchurukjhd_danjuzt"); // 单据状态

if ("1".equals(danjuzt))
    return true;

return false;
	}
	//出/入库计划单-能否删除-05
	public boolean judgement_0bf50a4f00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String linshiwlsqid = getField("atzchurukjhd_linshiwlsqid");

if (linshiwlsqid != null && !"".equals(linshiwlsqid.trim()))
	return false;

String danjuzt = getField("atzchurukjhd_danjuzt");
String danjusc = getField("atzchurukjhd_danjusc");

if ("1".equals(danjuzt) && "1".equals(danjusc))
	return true;

return false;
	}
	//采购需求提交审核按钮是否显示
	public boolean judgement_e340ed9600000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzcaigoujh_danjuzt");
if(zhuangtai != null && "1".equals(zhuangtai)){
   	
 return true;
                 
}else{
return false;
}
	}
	//jud-生产任务-是否可删除-08
	public boolean judgement_cd74137500000009z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Object obj = request.getSession().getAttribute("employeeName");
String str = obj == null ? "admin" : String.valueOf(obj);
String lurur = getField("atzscrw_lurur");
String shzt = getField("atzscrw_shenhezt");
String rwlx = getField("atzscrw_scrwdlx");
if(null == rwlx) {
	logger.error("判断生产任务删除按钮是否可用时获取任务类型为空！");
	return false;
} else if("7".equals(rwlx)) {
	String scrwid = getField("atzscrw_id");
	logger.error("判断生产任务删除按钮是否可用时获取ID="+scrwid);
	List<Atzchurukjhd> crkjhList = dataset.getList("Atzchurukjhd", "scrwdid = " + scrwid);
	if(crkjhList != null && crkjhList.size() > 0) {
		for(Atzchurukjhd crkjh:crkjhList) {
			if(crkjh.getDanjuzt() != null && !"1".equals(crkjh.getDanjuzt())) {//反加工任务对应所有出入库计划如果有提交的则不能删除
				return false;
			}
		}
	}
	if((lurur.equals(str) || "admin".equals(str))) {//录入人或者admin可以删除
		return true;
	} else {
		return false;
	}
} else {
	if ("1".equals(shzt) && (lurur.equals(str) || "admin".equals(str))) {//其他任务未提交审核，录入人或者admin可以删除
		return true;
	} else {
		return false;
	}
}
	}
	//jud-生产计划-是否可提交-08
	public boolean judgement_cd712a8e00000008z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划-是否可提交-08~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("lurur");
 
String shzt = getField("shenhezt");
logger.info("~~~jud-生产计划-是否可提交-08~~~shzt ="+shzt );
if("1".equals(shzt.trim()) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//出/入库计划单-反审核按钮-15
	public boolean judgement_179b724300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		

String danjuzt = getField("atzchurukjhd_danjuzt"); // 单据状态
String crkjhdid = getField("atzchurukjhd_id"); // 出入库计划ID

String danjulx = getField("atzchurukjhd_danjulx"); // 单据类型



if ("1".equals(danjulx)) {
	String bianhao = getField("atzchurukjhd_bianhao");
	String glhql = "from Atzchurukjhd where glcrkjhdbh='" + bianhao + "' and danjulx='2'";
	
	Atzchurukjhd rukjhd = (Atzchurukjhd)dataset.getObjectByHql("Atzchurukjhd", glhql);    
	if (rukjhd != null) {
		if (!"1".equals(rukjhd.getDanjuzt())) {
			return false;
		}
	}
}

Atzchurukjhd jhd=(Atzchurukjhd)dataset.getObject(Atzchurukjhd.class,crkjhdid);
Double jhslzh = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "shuliang", "atzchurukjhdid=" + crkjhdid)); // 计划数量总和
Double wcrkslzh = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "weicrksl", "atzchurukjhdid=" + crkjhdid)); // 未出入库数量总和
Double zzwcrkslzh = Double.parseDouble(dataset.sum("Atzchurukjhdmx", "zhizaowzxl", "atzchurukjhdid=" + crkjhdid)); // 未出入库数量总和




if (jhslzh.doubleValue() != wcrkslzh.doubleValue()&&jhd!=null&&!"1".equals(jhd.getZhixingf()))
	return false;
if (jhslzh.doubleValue() != zzwcrkslzh.doubleValue()&&jhd!=null&&"1".equals(jhd.getZhixingf()))
	return false;

String hql = "select count(*) from Atzchurukd where churukjhdid=" + crkjhdid;

int count = dataset.count(hql, Atzchurukd.class);

if (count != 0 || !"3".equals(danjuzt))
	return false;
	
String tzcondition = "churukjhdid=" + crkjhdid;

List<Atzjihuatz> jihuatzs = dataset.getList("Atzjihuatz", tzcondition);

if (jihuatzs != null && jihuatzs.size() > 0)
	return false;
		
return true;
	}
	//能否添加ROHS信息-06
	public boolean judgement_73b38ff300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String wuliaoid=(String)context.get("atzwuliaojcxx.id");
Atzwuliaojcxx wuliao=(Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,Long.parseLong(wuliaoid));
if(wuliao!=null&&"2".equals(wuliao.getShifoufhrohs())){
    return false;

}
else
    return true;
	}
	//jud-能否添加物料子类别-08
	public boolean judgement_9d81e49700000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-能否添加物料子类别-08~~in~");

String fulbid = getField("fulbid");
logger.info("~~~jud-能否添加物料子类别-08~~~fulbid ="+fulbid );
if("0".equals(fulbid)){
return true;
}else{
return false;
}
	}
	//外派工程派遣单文档审核通过否按钮
	public boolean judgement_428a238400000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String lx = getField("Atzgongzuorz_rizhilx");
String id = getField("Atzgongzuorz_xmpqdid");
if ("1".equals(lx))
{
String hql = "from Atzxiangmupqd where id =" +id;
Atzxiangmupqd pqd = (Atzxiangmupqd)dataset.getObjectByHql("Atzxiangmupqd",hql);
if (pqd !=null)
  {
   if ("1".equals(pqd.getShenhedjzt()) && "3".equals(pqd.getDanjuzt()))
    {
     return true;
      }
  else
    {
   return false;
      }
   }
return false; 
}
else
{
return true;
}
	}
	//备货计划是否可修改
	public boolean judgement_98af98a800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划-是否可提交-08~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("lurur");

String shzt = getField("shenhezt");
String sfbg = getField("sfbg");
logger.info("~~~jud-生产计划-是否可提交-08~~~shzt ="+shzt );
if("1".equals(shzt.trim()) && (lurur.equals(str) || "admin".equals(str))&&"2".equals(sfbg)){
return true;
}else{
return false;
}
	}
	//jud-BOM分析结果是否可替代-08
	public boolean judgement_7e93f98100000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-BOM分析结果是否可替代-08~~in~");
		String wlid_str = getField("atzbomfxjg_wuliaoid");
		Long wlid = Long.parseLong(wlid_str);

		String qkl_str = getField("atzbomfxjg_quekoul");
		double qkl = Double.parseDouble(qkl_str);

		if (qkl > 0d) {
			String yqwlids = "";
			List yqwqdybList = dataset.getListByHql("Atzyouqianwqdyb",
					" from Atzyouqianwqdyb where wuqianwlid=" + wlid);
			if (yqwqdybList != null && yqwqdybList.size() > 0) {
				for (int j = 0; j < yqwqdybList.size(); j++) {
					Atzyouqianwqdyb yqwqdyb = (Atzyouqianwqdyb) yqwqdybList
							.get(j);
					long yqwlid = yqwqdyb.getYouqianwlid();

					if (j == 0)
						yqwlids = yqwlids + yqwlid;
					else
						yqwlids = yqwlids + "," + yqwlid;
				}
			}

			String hql0 = " from Atztidaiwl where wuliaoid=" + wlid;
			if (yqwlids != null && !"".equals(yqwlids)) {
				hql0 = hql0 + " and tidaiwlid not in (" + yqwlids + ")";
			}

			List tdwlList = dataset.getListByHql("Atztidaiwl", hql0);
			String tdwlids = " wuliaoid in (";
			if (tdwlList != null && tdwlList.size() > 0) {
				for (int i = 0; i < tdwlList.size(); i++) {
					Atztidaiwl tdwl = (Atztidaiwl) tdwlList.get(i);
					long tdwlid = tdwl.getTidaiwlid();

					tdwlids = tdwlids + tdwlid + ",";
				}
				tdwlids = tdwlids.substring(0, tdwlids.length() - 1) + ")";
			} else {
				tdwlids = " 1=2 ";
			}
			logger.info("~~~jud-BOM分析结果是否可替代-08~~~tdwlids= " + tdwlids);

			String tdkcids_str = getField("atzbomfxjg_tdkcids");

			String hql = "from Atzkucun where kucunlx in ('1','2') and keyongl>0 and "
					+ tdwlids;
			if (tdkcids_str != null && !"".equals(tdkcids_str)) {
				tdkcids_str = tdkcids_str
						.substring(0, tdkcids_str.length() - 1);
				hql = hql + " and id not in (" + tdkcids_str + ")";
			}

			List kcList = dataset.getListByHql("Atzkucun", hql);
			if (kcList != null && kcList.size() > 0) {
				return true;
			}
		}
		return false;
	}
	//接标应标申请单已提交返回false
	public boolean judgement_3e7d29fd00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String str = getField("shenhezt");
if("1".equals(str))
return true;
else
return false;
	}
	//jud-现场设备申请单是否已提交-06
	public boolean judgement_1a12e58e00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt=getField("danjuzt");
if(danjuzt!=null&&!"1".equals(danjuzt))
   return false;
return true;
	}
	//jud-BOM分析结果是否可调拨-08
	public boolean judgement_d0cca3cc00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-BOM分析结果是否可调拨-08~~in~");
String xmid_str= getField("atzbomfxjg_xiangmuid");
Long xmid=Long.parseLong(xmid_str);
String kwid_str= getField("atzbomfxjg_kuweiid");
Long kwid=Long.parseLong(kwid_str);
String wlid_str= getField("atzbomfxjg_wuliaoid");
Long wlid=Long.parseLong(wlid_str);

String xdbsl_str= getField("atzbomfxjg_weidbsl");
double xdbsl=Double.parseDouble(xdbsl_str);
String qkl_str= getField("atzbomfxjg_quekoul");
double qkl=Double.parseDouble(qkl_str);

String sf= getField("atzbomfxjg_shifouzdc");
logger.info("~~~jud-BOM分析结果是否可调拨-08~1有下级2没有下级~sf="+sf+"~qkl="+qkl+"~xdbsl="+xdbsl);
if( (qkl>0 && "2".equals(sf)) || xdbsl>0){
  String hql="from Atzkucun where kucunlx in ('1','2') and keyongl>0 and xiangmuid!="+xmid+" and wuliaoid = "+wlid+" and kuweiid="+kwid;
	List kcList=dataset.getListByHql("Atzkucun",hql);
	if(kcList!=null && kcList.size()>0){
		return true;
	}
}
return false;
	}
	//jud-发送检验报告是否可用-10
	public boolean judgement_ee56ccbe00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Long jianyandmxid = Long.parseLong(getField("jianyandmxid "));
Atzjianyandmx jianyandmx = (Atzjianyandmx)dataset.getObject(Atzjianyandmx.class, jianyandmxid);
String jianyanjg = jianyandmx.getJianyanjg();

String shifouyfs = getField("shifouyfs");

if("2".equals(jianyanjg) && "2".equals(shifouyfs)) {
   return true;
}

return false;
	}
	//判断采购合同中的注销按钮是否显示
	public boolean judgement_2f40fe1300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束

String  caigouhtid=getField("atzcaigouht_id");
String  hql="from  Atzdaohuotzd  where  caigouht="+caigouhtid;


 	List<Atzdaohuotzd> daohuotzdList = dataset.getListByHql("Atzdaohuotzd", hql);
   		if(daohuotzdList.size()>0){
	return false;
}else{
	 return true;
	}
	}
	//jud-流程是否已启动审核-06
	public boolean judgement_0ad5eed000000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shenhedjzt=getField("atzxiangmupqd_shenhedjzt");
String danjuzt=getField("atzxiangmupqd_danjuzt");
if(shenhedjzt!=null&&!"1".equals(shenhedjzt))
   return false;
else if(danjuzt!=null&&"3".equals(danjuzt))
   return true;
else 
   return false;
	}
	//是否报表导出
	public boolean judgement_885ffe2900000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String sfjz = getField("sfjz");	
String leixing=getField("leixing");
if ("1".equals(sfjz)&&"2".equals(leixing))
	return true;
else
	return false;
	}
	//是否反结账
	public boolean judgement_8860362a00000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String sfjz = getField("sfjz");
String leixing=getField("leixing");
String id = getField("id");
List zjl=dataset.getListByHql("Atzjiezhangjl","from Atzjiezhangjl where sjjlid="+id);	
if ("3".equals(sfjz)&&zjl.size()<=0&&"2".equals(leixing))
	return true;
else
	return false;
	}
	//jud-检验完成-10
	public boolean judgement_a2b3ba740000000bz(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zx = getField("atzjianyand_shifouzx"); // 是否执行
String zt = getField("atzjianyand_jianyandzt"); // 检验单状态
 
if("1".equals(zx.trim()) || "1".equals(zt.trim()) || "5".equals(zt.trim()) || "7".equals(zt.trim())) {
      return false;
}

return true;
	}
	//是否结账-06
	public boolean judgement_885c591700000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String sfjz = getField("sfjz");
String leixing=getField("leixing");	
if ("1".equals(sfjz)&&"2".equals(leixing))
	return true;
else
	return false;
	}
	//判断-运营条款-新增能否显示-05
	public boolean judgement_bf33aca400000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzyunyingtk> tkList = dataset.getList("Atzyunyingtk","hetongid="+hetongId);
   if(tkList != null && tkList.size()>0)
     return false;
}
return true;
	}
	//是否可以重新发送
	public boolean judgement_876358fe00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String fasongzt=getField("atzyoujianfsjl_fasongzt");
logger.debug("fasongzt===="+fasongzt);
if("失败".equals(fasongzt))
   return true;
return false;
	}
	//判断-运营条款-修改能否显示-05
	public boolean judgement_bf3421b200000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzyunyingtk> tkList = dataset.getList("Atzyunyingtk","hetongid="+hetongId);
   if(tkList != null && tkList.size()>0)
   return true;
}
return false;
	}
	//jud-生产计划-是否可编辑-08
	public boolean judgement_9e6560a000000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划-是否可编辑-08~~in~");
Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("lurur");

String shzt = getField("shenhezt");
String danjusc = getField("danjusc");

logger.info("~~~jud-生产计划-是否可编辑-08~~~shzt ="+shzt+"~danjusc="+danjusc );
if("1".equals(shzt.trim()) && "1".equals(danjusc.trim()) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//js-研发试制是否可编辑-08
	public boolean judgement_4bc85bfe00000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		return false;
	}
	//判断-维保条款-修改能否显示-05
	public boolean judgement_bf337cd600000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzweibaotk> tkList = dataset.getList("Atzweibaotk","hetongid="+hetongId);
   if(tkList != null && tkList.size()>0)
   return true;
}
return false;
	}
	//jud-生产计划-明细列表-审核是否通过-08
	public boolean judgement_be050ac300000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划-审核是否通过-08~~in~");

Object scjhid_obj = context.get("atzscjh.id");
logger.info("~~~jud-生产计划-审核是否通过-08~~~scjhid_obj= "+scjhid_obj );
if(scjhid_obj != null ){
Atzscjh scjh=null;
try{
  scjh = (Atzscjh)dataset.getObject(Atzscjh.class,Long.valueOf(String.valueOf(scjhid_obj)));
}catch(Exception e){
  return false;
}
logger.info("~~~jud-生产计划-审核是否通过-08~~~scjh.shzt ="+scjh.getShenhezt());
if("3".equals(scjh.getShenhezt())){
return true;
}else{
return false;
}
}
return false;
	}
	//jud-生产任务-明细列表-审核是否通过-08
	public boolean judgement_0fa91d8b00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产任务-明细列表-审核是否通过-08~~in~");

Object scrwid_obj = context.get("atzscrw.id");
logger.info("~~~jud-生产任务-明细列表-审核是否通过-08~~~scrwid_obj= "+scrwid_obj );
if(scrwid_obj != null ){
Atzscrw scrw=null;
try{
  scrw = (Atzscrw)dataset.getObject(Atzscrw.class,Long.valueOf(String.valueOf(scrwid_obj)));
}catch(Exception e){
  return false;
}
logger.info("~~~jud-生产任务-明细列表-审核是否通过-08~~~scjh.shzt ="+scrw.getShenhezt());
if("3".equals(scrw.getShenhezt())){
return true;
}else{
return false;
}
}
return false;
	}
	//判断-开票申请单-能否修改/提交/删除-05
	public boolean judgement_f4aed82c00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if(!"1".equals(hetong.getZhuxiaozt()))
     return false;


  }

String zhuangtai = getField("atzkaipiaosqd_danjuzt");
if(zhuangtai != null && "1".equals(zhuangtai))
return true;
else
return false;
	}
	//jud-生产计划-列表-审核是否通过-08
	public boolean judgement_0bbbaf3900000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("lurur");

String shzt = getField("shenhezt");
logger.info("~~~jud-生产计划-列表-审核是否通过-08~~~scjh.shzt ="+shzt);
if("3".equals(shzt.trim()) && (lurur.equals(str) || "admin".equals(str))){
return true;
}else{
return false;
}
	}
	//销售预测-判断能否提交/修改/删除
	public boolean judgement_f32f2ffc00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzxiaoshouyc_danjuzt");
if(zhuangtai != null && ("1".equals(zhuangtai)||"5".equals(zhuangtai)))
return true;
else
return false;
	}
	//jud-物料编码是否已提交-06
	public boolean judgement_ae76f0ae00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hql="from Atzwuliaojcxx where id='"+getField("id")+"'";
Atzwuliaojcxx wuliaojcxx=(Atzwuliaojcxx)dataset.getObjectByHql("Atzwuliaojcxx",hql);
String shenhezt=wuliaojcxx.getShenhezt();
if(shenhezt!=null&&"1".equals(shenhezt)){
  return true;
}else{
  return false;
}
	}
	//判断是否关闭-是否可进行答复操作
	public boolean judgement_a780538600000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String str = getField("calllogid");
String hql = "from Atzcalllog where id = " + "'"+ str +"'";
Atzcalllog atzcalllog = (Atzcalllog)dataset.getObjectByHql("Atzcalllog",hql);
String shifougb = atzcalllog.getShifougb();
if("1".equals(shifougb))
return false;
else
return true;
	}
	//判断外贸订单导出是否显示
	public boolean judgement_dd38cef300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束

String bizhongid = getField("atzcaigouht_bizhongid");

String  hql="from  Atzbizhong  where  id="+Long.parseLong(bizhongid);

List<Atzbizhong>   bizhongs =dataset.getListByHql("Atzbizhong",hql);
if(bizhongs.size()>0){
	 String shifoubwb= bizhongs.get(0).getShifoubwb(); 
	if(shifoubwb !=null && shifoubwb.equals("2")){
		return true;
	}else{
		return false;
	}
}else{
	
	return false;
	}
	}
	//反审核的数据不能删除-06
	public boolean judgement_b7309ad700000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoufsh=getField("shifoufsh");
String danjuzt=getField("danjuzt");
if(danjuzt!=null&&!"1".equals(danjuzt))
   return false;
if(shifoufsh!=null&&"1".equals(shifoufsh))
   return false;
return true;
	}
	//jud-检验报告提交-10
	public boolean judgement_c2d86c550000000ez(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoulr = getField("atzjianyand_shifoulrbg");
String shifoufsbg = getField("atzjianyand_shifoufsbg");

String jianyandId = getField("atzjianyand_id"); //检验单ID
boolean flag = false;
List<Atzjianyandmx> jianyandmxs = dataset.getList("Atzjianyandmx", "atzjianyandid="+jianyandId);
if(jianyandmxs != null && jianyandmxs.size() > 0) {
	Atzjianyandmx jianyandmx = null;	
	for(int i=0; i<jianyandmxs.size(); i++) {
		jianyandmx = jianyandmxs.get(i);
		String jianyanjg = jianyandmx.getJianyanjg(); //检验结论
		if("2".equals(jianyanjg)) {
			flag = true;
			break;
		}
	}
}

if("1".equals(shifoulr.trim())) {
	if("2".equals(shifoufsbg.trim())) {
		if(flag) {
			return true;
		}	
	}
}

return false;
	}
	//判断-维保条款-新增能否显示-05
	public boolean judgement_bf320f0300000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzweibaotk> tkList = dataset.getList("Atzweibaotk","hetongid="+hetongId);
   if(tkList != null && tkList.size()>0)
     return false;
}
return true;
	}
	//jud-原材料-10
	public boolean judgement_9caa1abf00000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id = getField("atzchurukd_id");

Atzchurukd churukd = (Atzchurukd)dataset.getObject(Atzchurukd.class, Long.parseLong(id));
if(churukd != null) {
    	Long jianyandid = churukd.getJianyandid();
  	logger.info("检验单ID: " + jianyandid);
	Atzjianyand jianyand = (Atzjianyand)dataset.getObject(Atzjianyand.class, jianyandid);
	if(jianyand != null) {
		String jianyandlx = jianyand.getJianyandlx();
		if("1".equals(jianyandlx)) {
			return true;
		} 
	}
}

return false;
	}
	//出库计划单-欠发提交是否可用-15
	public boolean judgement_8c90bab700000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzchurukjhd_danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废
String churukyy = getField("atzchurukjhd_churukyy"); // 出入库原因

if("1".equals(danjuzt)){
	if("3".equals(churukyy) || "5".equals(churukyy) || "15".equals(churukyy) || "17".equals(churukyy) || "18".equals(churukyy) || "53".equals(churukyy)) {
		 return true;
	}
}

return false;
	}
	//判断-订单信息-修改能否显示-05
	public boolean judgement_bf304eb200000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzxiaoshoudd> ddList = dataset.getList("Atzxiaoshoudd","hetongid="+hetongId);
   if(ddList != null && ddList.size()>0)
     return true;
}
return false;
	}
	//判断-订单信息-新增能否显示-05
	public boolean judgement_bf2e803500000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd()))
     return false;
   List <Atzxiaoshoudd> ddList = dataset.getList("Atzxiaoshoudd","hetongid="+hetongId);
   if(ddList != null && ddList.size()>0)
     return false;
}
return true;
	}
	//判断合同修改删除显示
	public boolean judgement_57e7a05600000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束

String danjuzt =getField("atzcaigouht_danjuzt");
if(danjuzt.equals("1")){
return true;
}
else{
return false;
}
	}
	//调拨单作废按钮-10
	public boolean judgement_00c3361d00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("danjuzt"); // 单据状态: 1-未提交  2-审核中  3-审核已通过  4-审核未通过  5-已作废

if ("2".equals(danjuzt) || "4".equals(danjuzt))
	return true;
	
return false;
	}
	//jud-删除按钮是否可用-10
	public boolean judgement_628babfd00000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		/*String zt = getField("atzjianyand_jianyandzt");
String sc = getField("atzjianyand_danjusc");
if ( ("1".equals(zt.trim()) || "2".equals(zt.trim()) || "3".equals(zt.trim())) && "1".equals(sc.trim()) )
     return true;
else 
     return false;
*/

return false;
	}
	//添加到货通知单按钮是否显示
	public boolean judgement_dd5501be00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(tianxier.equals(dengrur)){
return true;
}
}
return false;
//修改结束
	}
	//判断合同能否合并或拆分
	public boolean judgement_c206566d00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
logger.error("***"+hetongId+"***");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   logger.error("***"+hetong.getShifouws()+"***"+hetong.getZhuxiaozt());
   if(!"2".equals(hetong.getShifouws()))
     return false;
   if(!"1".equals(hetong.getZhuxiaozt()))
     return false;
}
return true;
	}
	//判断-合同是否已经完善-05
	public boolean judgement_f3637f4a00000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if(!"2".equals(hetong.getShifouws()))
     return false;
   if(!"1".equals(hetong.getZhuxiaozt()))
     return false;
}
return true;
	}
	//jud-线缆-10
	public boolean judgement_9caad59d00000008z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id = getField("atzchurukd_id");

Atzchurukd churukd = (Atzchurukd)dataset.getObject(Atzchurukd.class, Long.parseLong(id));
if(churukd != null) {
    	Long jianyandid = churukd.getJianyandid();
  	logger.info("检验单ID: " + jianyandid);
	Atzjianyand jianyand = (Atzjianyand)dataset.getObject(Atzjianyand.class, jianyandid);
	if(jianyand != null) {
		String jianyandlx = jianyand.getJianyandlx();
		if("3".equals(jianyandlx)) {
			return true;
		} 
	}
}

return false;
	}
	//jud-半成品-10
	public boolean judgement_9cab4c2400000007z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id = getField("atzchurukd_id");

Atzchurukd churukd = (Atzchurukd)dataset.getObject(Atzchurukd.class, Long.parseLong(id));
if(churukd != null) {
    	Long jianyandid = churukd.getJianyandid();
  	logger.info("检验单ID: " + jianyandid);
	Atzjianyand jianyand = (Atzjianyand)dataset.getObject(Atzjianyand.class, jianyandid);
	if(jianyand != null) {
		String jianyandlx = jianyand.getJianyandlx();
		if("2".equals(jianyandlx)) {
			return true;
		} 
	}
}

return false;
	}
	//jud-成品-10
	public boolean judgement_9ca9e54900000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id = getField("atzchurukd_id");

Atzchurukd churukd = (Atzchurukd)dataset.getObject(Atzchurukd.class, Long.parseLong(id));
if(churukd != null) {
    	Long jianyandid = churukd.getJianyandid();
  	logger.info("检验单ID: " + jianyandid);
	Atzjianyand jianyand = (Atzjianyand)dataset.getObject(Atzjianyand.class, jianyandid);
	if(jianyand != null) {
		String jianyandlx = jianyand.getJianyandlx();
		if("4".equals(jianyandlx)) {
			return true;
		} 
	}
}

return false;
	}
	//jud-生产计划明细-是否已生成MAC-08
	public boolean judgement_c8f7ec0700000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划明细-是否已生成MAC-08~~in~");

String sf = getField("atzscjhmx_shifouyfh");
logger.info("~~~jud-生产计划明细-是否已生成MAC-08~~~sf ="+sf );
if("1".equals(sf)){
return true;
}else{
return false;
}
	}
	//到货通知单修改删除显示
	public boolean judgement_57e4245300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzdaohuotzd_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束

String shifou = getField("atzdaohuotzd_shifoutjzj");
if(shifou.equals("1")){
return false;
}
else{
return true;
}
	}
	//合同能否重新评审
	public boolean judgement_1b01da3800000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String sfxynbps = getField("atzhetong_shifouxynbps");
String pingshenzt = getField("atzhetong_pingshenzt");
String wanshanzt = getField("atzhetong_shifouws");
if("1".equals(sfxynbps) && "3".equals(pingshenzt) && "2".equals(wanshanzt))
return true;
else
return false;
	}
	//判断订单导出按钮是否显示
	public boolean judgement_c350fe7400000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束	

//改开始
	String bizhongid = getField("atzcaigouht_bizhongid");
	logger.debug("+++++币种ID是：：+++++++"+bizhongid);
if(bizhongid!=null && !"".equals(bizhongid)){
String  hql="from  Atzbizhong  where  id="+Long.parseLong(bizhongid);

List<Atzbizhong>   bizhongs =dataset.getListByHql("Atzbizhong",hql);
if(bizhongs.size()>0){
	
	 String shifoubwb= bizhongs.get(0).getShifoubwb(); 
	if(shifoubwb !=null && shifoubwb.equals("2")){
		return false;
	}
}
}
//改结束

String hetongbh = getField("atzcaigouht_hetongbh");
if(hetongbh !=null && hetongbh !=""){
return false;
}else{
return true;
}
	}
	//判断标准订单导出按钮是否显示
	public boolean judgement_c34dbcfe00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		//修改开始
String dengrur = (String) request.getSession().getAttribute("employeeName");
String tianxier = getField("atzcaigouht_tianxier");
if(dengrur!=null){
if(!(tianxier.equals(dengrur))){
return false;
}
}else{
return false;
}
//修改结束	

//改开始
	String bizhongid = getField("atzcaigouht_bizhongid");
	logger.debug("+++++币种ID是：：+++++++"+bizhongid);
if(bizhongid!=null && !"".equals(bizhongid)){
String  hql="from  Atzbizhong  where  id="+Long.parseLong(bizhongid);

List<Atzbizhong>   bizhongs =dataset.getListByHql("Atzbizhong",hql);
if(bizhongs.size()>0){
	
	 String shifoubwb= bizhongs.get(0).getShifoubwb(); 
	if(shifoubwb !=null && shifoubwb.equals("2")){
		return false;
	}
}
}
//改结束


String hetongbh = getField("atzcaigouht_hetongbh");
if(hetongbh !=null && hetongbh !=""){
return true;
}else{
return false;
}
	}
	//jud-生产批号-判断是否已生成MAC-08
	public boolean judgement_98ef193800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产批号-判断是否已生成MAC-08~~in~");

String scphid_str = getField("atzscph_id");
logger.info("~~~jud-生产批号-判断是否已生成MAC-08~~~scphid="+scphid_str);
if(scphid_str!=null && !"".equals(scphid_str)){
  List list=dataset.getList("Atzmacdd","scphid="+Long.parseLong(scphid_str));
  if(list!=null && list.size()>0)
    return false;
}

String sf = getField("atzscph_sfyscmac");
logger.info("~~~jud-生产批号-判断是否已生成MAC-08~~～sf="+sf);
if(!"1".equals(sf)){
return true;
}else{
return false;
}
	}
	//备货通知单变更可用-01
	public boolean judgement_9d4c72d800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shzt = getField("shenhezt");
if("3".equals(shzt)){
return true;
}else{
return false;
}
	}
	//isAssist
	public boolean judgement_82a2315400000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		try{//得到登录人的userseq
String userseq = String.valueOf(request.getSession().getAttribute("userSEQ"));
//得到是否允许代办
Boolean isassist = (Boolean)atzcontext.get("process_node_isAssist");

//得到当前任务对象
String taskid = (String)atzcontext.get("atztask.id");
Atztask task = (Atztask)dataset.getObject(Atztask.class,Long.parseLong(taskid));

//判断当前人是M,R还是C
String[] caozuorens = task.getUserseq().split(",");
String caozuor = "";

for(int i=0;i<caozuorens.length;i++){
	if(caozuorens[i].contains(userseq)){
		caozuor = caozuorens[i];
	}
}

//判断该button的名称是否在当前任务的所有回退路径上
if(isassist && caozuor.contains("M")){
  return true;
}else{
  return false;
}
}
catch (Exception e) {
			logger.error("执行规则失败",e);
return false;
		}
	}
	//jud-生产计划明细-是否已生成SN-08
	public boolean judgement_c8f74b7900000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-生产计划明细-是否已生成SN-08~~in~");

String sf = getField("atzscjhmx_shifouyfh");
logger.info("~~~jud-生产计划明细-是否已生成SN-08~~~sf ="+sf );
if("2".equals(sf)){
return true;
}else{
return false;
}
	}
	//jud-BOM分析结果-是否已用替代物料替代-08
	public boolean judgement_33ebe55900000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-BOM分析结果-是否已用替代物料替代-08~~in~");

String qkl= getField("atzbomfxjg_quekoul");
String sf1= getField("atzbomfxjg_shifouzdc");
logger.info("~~~jud-BOM分析结果是否可调拨、替代-08~qkl="+qkl+"~sf1="+sf1);
double qkl1=Double.parseDouble(qkl);

String sf = getField("atzbomfxjg_shifouytd");
logger.info("~~~jud-BOM分析结果-是否已用替代物料替代-08~~~sf="+sf );
if("".equals(sf.trim()) || "2".equals(sf.trim())){
  if(qkl1>0 && "1".equals(sf1)){
    return true;
  }
}
return false;
	}
	//客户接触信息提交后不可修改删除
	public boolean judgement_3db91ffa00000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shenhezt=getField("shenhezt");
if(shenhezt!=null&&"1".equals(shenhezt)){
  return true;
}else{
  return false;
}
	}
	//补发按钮-10
	public boolean judgement_6959b94800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String churukjhdid = getField("atzchurukjhd_id");
if (1 == 1) {
  return false;
}
if (churukjhdid == null || "".equals(churukjhdid))
	return false;	

Atzchurukjhd churukjhd = (Atzchurukjhd) dataset.getObject(Atzchurukjhd.class, Long.parseLong(churukjhdid));

String renwuzt = churukjhd.getRenwuzt(); // 任务主题
String churukyy = churukjhd.getChurukyy(); // 出入库原因

if ("11".equals(renwuzt) && "3".equals(churukyy))
	return true;
else
	return false;
	}
	//jud-币种被使用不能修改删除-06
	public boolean judgement_497e4f5d00000006z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id =getField("id");
String hql="from Atzcaigoujh where bizhong="+id;
List bizhongs=dataset.getListByHql("Atzcaigoujh",hql);
if(bizhongs!=null&&bizhongs.size()>0)
    return false;
return true;
	}
	//jud-已使用的项目不能删除-06
	public boolean judgement_49731fb400000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id=getField("id");

String hql="from Atzxiaoshoudd where chanpinid="+id;
List xiangmupqds=dataset.getListByHql("Atzxiaoshoudd",hql);
if(xiangmupqds!=null&&xiangmupqds.size()>0){
     return false;
}else{
        return true;
}
	}
	//执行状态审核完成返回ture
	public boolean judgement_4e4bb6d800000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhixingzt=getField("zhixingzt");
if(zhixingzt!=null&&"1".equals(zhixingzt)){
  return false;
}else{
  return true;
}
	}
	//jud-已使用的任务主题不能删除-06
	public boolean judgement_4966edb300000004z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id=getField("id");
String hql="from Atzxiangmupqd where renwulx="+id;
List xiangmupqds=dataset.getListByHql("Atzxiangmupqd",hql);
if(xiangmupqds!=null&&xiangmupqds.size()>0){
     return false;
}else{
         return true;
}
	}
	//isReplace
	public boolean judgement_82a0e35300000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		try{
	//得到登录人的userseq
	String userseq = String.valueOf(request.getSession().getAttribute("userSEQ"));
	//logger.debug(userseq);
	//得到是否允许代办
	Boolean isreplace = (Boolean)atzcontext.get("process_node_isReplace");
	//logger.debug(isreplace);
	//得到当前任务对象
	String taskid = (String)atzcontext.get("atztask.id");
	Atztask task = (Atztask)dataset.getObject(Atztask.class,Long.parseLong(taskid));

	//判断当前人是M,R还是C
	String[] caozuorens = task.getUserseq().split(",");
	String caozuor = "";

	for(int i=0;i<caozuorens.length;i++){
		if(caozuorens[i].contains(userseq)){
			caozuor = caozuorens[i];
		}
	}
	//logger.debug("caozuor "+caozuor);
	//判断该button的名称是否在当前任务的所有回退路径上
	if(isreplace && caozuor.contains("M")){
	  return true;
	}else{
	  return false;
	}
}
catch (Exception e) {
			logger.error("执行规则失败",e);
return false;
		}
	}
	//判断采购申样详情修改是否显示
	public boolean judgement_e24944ab00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzcaigousy_danjuzt");
if(danjuzt.equals("1")){
return true;
}
else{
return false;
}
	}
	//发货通知单能否反审核
	public boolean judgement_4386026e00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt =getField("atzfahuotzd_danjuzt");
 String fhId =getField("atzfahuotzd_id");
logger.debug("fhId:"+fhId);
 if(danjuzt !=null && "3".equals(danjuzt))
 { 
       Atzchurukjhd churukjhd =(Atzchurukjhd)dataset.getObjectByHql("Atzchurukjhd", "from Atzchurukjhd where fahuotzdid ="+fhId);
	 if(churukjhd !=null && churukjhd.getDanjuzt()!=null && "1".equals(churukjhd.getDanjuzt()))
	 {   
	     return true; 
	 }
 } 
 return false;
	}
	//jud-出/入库计划-是否已审核是否能入库-08
	public boolean judgement_c303e8b500000005z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-出/入库计划-是否已审核是否能入库-08~~in~");

Object crkjhdid_obj = context.get("atzchurukjhd.id");
logger.info("~~~jud-出/入库计划-是否已审核是否能入库-08~~~crkjhdid_obj= "+crkjhdid_obj );
Atzchurukjhd crkjhd = (Atzchurukjhd)dataset.getObject(Atzchurukjhd.class,Long.valueOf(String.valueOf(crkjhdid_obj)));
String djzt = crkjhd.getDanjuzt();
String djlx = crkjhd.getDanjulx();
logger.info("~~~jud-出/入库计划-是否已审核是否能入库-08~~~crkjhd.shzt ="+djzt);
logger.info("~~~jud-出/入库计划-是否已审核是否能入库-08~~~crkjhd.crklx ="+djlx);

if("3".equals(djzt) && "2".equals(djlx)){
return true;
}else{
return false;
}
	}
	//备货通知单变更可用-11
	public boolean judgement_f8aa3a7000000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("lurur");


String shzt = getField("shenhezt");
String sfbg = getField("sfbg");
logger.debug("sfbg===="+sfbg);
if(("3".equals(shzt)||("1".equals(shzt)&&"1".equals(sfbg))) && (lurur.equals(str) || "admin".equals(str)) ){
	String shifouzxcg = getField("shifouzxcg");

	if(shifouzxcg!=null && "1".equals(shifouzxcg)){
	return false;
	}
	
 String sql= "select m2.id from Atzscjhmx m2 where m2.beihuojhmxid in (select  m1.id  from Atzscjhmx m1 where m1.atzscjhid="+Long.valueOf(getField("id"))+")";
List<Object[]> queryList =dataset.getQueryListBySql(sql,Atzscjhmx.class);
if(queryList.size()>0){
 return false;
}

return true;
}else{
return false;
}
	}
	//判断-合同是否已经归档或注销-05
	public boolean judgement_c8929e2c00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String hetongId = (String)context.get("atzhetong.id");
if(hetongId != null && !"".equals(hetongId)){
   Atzhetong hetong =(Atzhetong)dataset.getObject(Atzhetong.class,Long.parseLong(hetongId));
   if("1".equals(hetong.getShifougd())||!"1".equals(hetong.getZhuxiaozt())){
     return false;
   }
   
   Atzyunyingtk yunyingtk = (Atzyunyingtk)dataset.getObjectByHql("Atzyunyingtk","from Atzyunyingtk where hetongid="+hetongId);
   if(yunyingtk!=null){
   	  return true;
   	}else{
   		return false; 
   	}
}
return true;
	}
	//JUD-被使用的库位不能删除-06
	public boolean judgement_4956685a00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String id=getField("id");
String hql="from Atzkucun where kuweiid="+id;
List kucuns=dataset.getListByHql("Atzkucun",hql);
if(kucuns!=null&&kucuns.size()>0){
     return false;
}else{
          return true;
}
	}
	//jud-特殊放行单按钮是否可用-88
	public boolean judgement_0240c01400000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zt= getField("atzteshufxd_danjuzt");
if (!"1".equals(zt.trim()))
{
 return false;
}
else
{
return true;
}
	}
	//isRollback
	public boolean judgement_4b09651a00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.debug("~~atzcontext="+atzcontext);
//得到当前回退button的名称
String buttonName = (String)request.getAttribute("buttonName");
//将回退路径放入context中
context.set("rollbackpath",buttonName);
//得到所有当前任务的回退路径
String buttons = (String)atzcontext.get("process_node_rollback_buttons");
//判断该button的名称是否在当前任务的所有回退路径上
if(buttons!=null && buttons.indexOf(buttonName)!=-1){
  return true;
}else{
  return false;
}
	}
	//jud-老化记录-判断是否可修改、删除-08
	public boolean judgement_a8fafa6f00000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-老化记录-判断是否可修改、删除-08~~in~");

String csjlid_str= getField("atzlaohuajl_ceshijlid");
logger.info("~~~jud-老化记录-判断是否可修改、删除-08~~~csjlid_str="+csjlid_str);
Atzceshijl csjl=(Atzceshijl)dataset.getObjectByHql("Atzceshijl","from Atzceshijl where id="+Long.parseLong(csjlid_str));
String sf=csjl.getShifoulhwc();
if("1".equals(sf)){
  return false;
}
return true;
	}
	//jub-版本申请是否提交-09
	public boolean judgement_eaa72e1d00000007z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shenhezt=getField("shenhezt");
if(shenhezt!=null&&"1".equals(shenhezt)){
  return true;
}else{
  return false;
}
	}
	//jud-检验单按钮可以用-88
	public boolean judgement_ddc33ff700000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zt = getField("atzjianyand_jianyandzt");
if ("1".equals(zt.trim()))
     return true;
else 
     return false;
	}
	//jud-是否需要调拔或替代-08
	public String judgement_e0cbeb3200000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-BOM分析结果是否可调拨-08~~in~");

String xdbsl_str= getField("atzbomfxjg_weidbsl");
logger.info("~~~jud-BOM分析结果是否可调拨-08~xdbsl_str="+xdbsl_str);
double xdbsl=Double.parseDouble(xdbsl_str);

String qkl_str= getField("atzbomfxjg_quekoul");
logger.info("~~~jud-BOM分析结果是否可调拨-08~qkl_str="+qkl_str);
double qkl=Double.parseDouble(qkl_str);

String sf= getField("atzbomfxjg_shifouzdc");
logger.info("~~~jud-BOM分析结果是否可调拨-08~1有下级2没有下级~sf="+sf);
if( (qkl>0 && "2".equals(sf)) || xdbsl>0){
  return "#FF0000";
}else{
return "#000000";
}
	}
	//判断采购申样修改删除审核是够显示
	public boolean judgement_e244503300000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String danjuzt = getField("atzcaigousy_danjuzt");
if(danjuzt!=""&&"1".equals(danjuzt)){
return true;}
else{
return false;}
	}
	//判断到货通知单添加采购信息是否有效
	public boolean judgement_7d22ac7200000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String shifoutgz = getField("atzdaohuotzd_shifoutjcggz");
if("1".equals(shifoutgz )){
return true;
}
else{
return false;
}
	}
	//判断采购计划执行后更改和更改后重新审核按钮是否显示
	public boolean judgement_4375c1f800000002z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhixingzt=getField("atzcaigoujh_zhixingzt");
if("1".equals(zhixingzt)){
	
	return false;
}
String  caigoujhid=getField("atzcaigoujh_id");
String  hql="from  Atzchurukjhd  where  caigoujhid="+caigoujhid;
 	List<Atzchurukjhd> churukjhdList = dataset.getListByHql("Atzchurukjhd", hql);
   		if(churukjhdList.size()>0){
      Atzchurukjhd churukjhd =null;		
	for(int i=0; i<churukjhdList.size();i++){
		 churukjhd =churukjhdList.get(i);
 
 if(churukjhd!=null){
 	if(!"1".equals(churukjhd.getDanjuzt())){
 		return false;
 	}
 	
}
}
}
return true;
	}
	//开票申请能否反审核
	public boolean judgement_b9ce5cb900000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		String zhuangtai = getField("atzkaipiaosqd_danjuzt");
if("3".equals(zhuangtai))
return true;
else
return false;
	}
	//jud-测试记录-判断是否可修改、删除-08
	public boolean judgement_b9b2ef1a00000003z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		logger.info("~~~jud-测试记录-判断是否可修改、删除-08~~in~");

String sf= getField("atzceshijl_shifoucswc");
if("1".equals(sf)){
  return false;
}
return true;
	}
	//jud-生产任务-列表-反审核-08
	public boolean judgement_309be14700000001z(Object item, HttpServletRequest request) throws Exception{
		IDataSet dataset =  this.getDataSet(request);
		Object obj=request.getSession().getAttribute("employeeName");
String str=obj==null?"admin":String.valueOf(obj);
String lurur = getField("atzscrw_lurur");

String scrwdlx = getField("atzscrw_scrwdlx");
String shzt = getField("atzscrw_shenhezt");
logger.info("~~~jud-生产任务-列表-反审核-08~~~scrw.shzt ="+shzt);
if( "3".equals(shzt.trim()) && (lurur.equals(str) || "admin".equals(str))){//&& !"1".equals(scrwdlx.trim())
return true;
}else{
return false;
}
	}
	
	//////////////////////////////////////////////////////////////
	
	private Class getThisClass() {
		try {
			return FlowbuttonImpl.class;
		} catch (Exception e) {
			return null;
		}
	}

	private Object obj = null;

	private ContextHelper context = null;
	
	private IDataContext atzcontext = null;

	private Idataset atzdataset = null;

	private Iutil atzutil = null;

	public String compound(String functionname, Object item,
			HttpServletRequest request, String windowid) {
		try {
			Object value = returnValue(functionname, item, request, windowid);
			return value.toString();
		} catch (Exception e) {
			return "";
		}
	}
	
	public boolean active(String functionname, Object item,
			HttpServletRequest request, String windowid) {
		try {
			Object value = returnValue(functionname, item, request, windowid);
			return Boolean.valueOf(value.toString());
		} catch (Exception e) {
			logger.error("",e);
			return false;
		}
	}
	
	private Object returnValue(String functionname, Object item,
			HttpServletRequest request, String windowid) throws Exception {

		try {
			this.obj = item;
			this.context = new ContextHelper(request, windowid);
	
						atzdataset = new ImplDataset();
			atzdataset.setRequest(context.getRequest());
			atzdataset.setWindowid(context.getWindowid());
			atzcontext = context.getDataContext();
			atzutil = AtzUtil.newInstance(context.getRequest(), context.getWindowid());
			
			
			Class[] c = new Class[2];
			c[0] = Object.class;
			c[1] = HttpServletRequest.class;
			Method m1 = getThisClass().getMethod(functionname, c);
			Object[] o = new Object[2];
			o[0] = item;
			o[1] = request;
			Object value = m1.invoke(this, o);
			return value;
		} catch (Exception e) {
			//return null;
			throw e;
		}
	}

	private String getField(String field) {
		return BeanUtil.getFieldValue(this.obj, field);
	}
	
}