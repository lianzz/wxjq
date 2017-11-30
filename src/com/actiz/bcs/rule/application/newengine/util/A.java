package com.actiz.bcs.rule.application.newengine.util;
//@@@@@execute custom rule start@@@@@
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

import org.apache.log4j.Logger;
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


public class A extends RuleEngine{
    private static Logger logger = Logger.getLogger(A.class);    
//-----实体拷贝
	public  void copyBeanToBean(Object obj1,Object obj2) {
		Method[]  m=obj1.getClass().getDeclaredMethods();
       Method[] m2=obj2.getClass().getDeclaredMethods();
		for(int i=0;i<m.length;i++){
			if(m[i].getName().length()>=3&&m[i].getName().substring(0, 3).equals("get")){
			     String setname="set"+m[i].getName().substring(3,m[i].getName().length());
				for(int j=0;j<m2.length;j++){
					if(setname!=null&&setname.equals(m2[j].getName())){
						try{
					    m2[j].invoke(obj2,m[i].invoke(obj1,null));
					    }
					    catch (Exception e)
						  {
						  }

					}
			    }
			}
		}
	}
//-----BOM
	public  String digui(long fuid,double count,long xmid,long ckjhdid,List ckjhdmxList,IDataSet dataset) {
		logger.info("~~~anxh-digui-08~~in~");

try{
	String hql_h = "from Atzbommx where fubommxid="+fuid;
	List bommxList = dataset.getListByHql("Atzbommx",hql_h);

	logger.info("~~~anxh-digui-08~~~bommxList.size="+bommxList.size());
	if(bommxList.size()<1){
		return "NO";
	}
	for(int h=0;h<bommxList.size();h++){
	  Atzbommx bommx = (Atzbommx)bommxList.get(h);
		
	  //毛需求量
	  double mxql = bommx.getShuliang()*count;
	  logger.info("~~~anxh-digui-08~~~mxql="+mxql);
	  //库存
	  String hql_t = "from Atzkucun where wuliaoid = "+bommx.getWuliaoid()+" and xiangmuid = "+xmid;//不完善
	  Atzkucun kc = (Atzkucun)dataset.getObjectByHql("Atzkucun",hql_t);
	
	  double kckyl=0d;
	  if(kc != null){
	  	logger.info("~~~anxh-digui-08~~~kc.id="+kc.getId());
	  	kckyl = kc.getKeyongl();
	  }
	  logger.info("~~~anxh-digui-08~~~kckyl="+kckyl);
	
	  //净需求量
	  double jxql = mxql - kckyl;
	  logger.info("~~~anxh-digui-08~~~jxql1="+jxql);
	  if(jxql<=0){
	  	jxql=mxql;
	  }
	  logger.info("~~~anxh-digui-08~~~jxql2="+jxql);
	
	  //一个物料在BOM中多处用到的处理
	  logger.info("~~~anxh-digui-08~~~ckjhdmxList1.size ="+ckjhdmxList.size());
	  for(int t=0;t<ckjhdmxList.size();t++){
	     Atzchurukjhdmx ckjhdmx_old = (Atzchurukjhdmx)ckjhdmxList.get(t);
	     
	     if(ckjhdmx_old.getWuliaoid()==bommx.getWuliaoid()){
	       logger.info("~~~anxh-digui-08~~~ckjhdmx_old.wlid="+ckjhdmx_old.getWuliaoid());
	       ckjhdmx_old.setShuliang(ckjhdmx_old.getShuliang()+jxql);
	       break;
	     }  
	     logger.info("~~~anxh-digui-08~~~t="+t);
	  }
	  
	  logger.info("~~~anxh-digui-08~~ckjhdmx begin~h="+h);
	  Atzchurukjhdmx ckjhdmx = new Atzchurukjhdmx();
	  ckjhdmx.setAtzchurukjhdid(ckjhdid);
	  ckjhdmx.setWuliaoid(bommx.getWuliaoid());
	  Atzwuliaojcxx wl = (Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,bommx.getWuliaoid());
	  ckjhdmx.setWuliaobm(wl.getWuliaobm());
	  ckjhdmx.setWuliaoms(wl.getWuliaoms());
	  ckjhdmx.setGuigedw(wl.getGuigedw());
	  ckjhdmx.setDanwei(wl.getDanwei());
	  ckjhdmx.setWeicrksl(jxql);
	  ckjhdmx.setShuliang(jxql);
	  ckjhdmx.setLururq(new Date());
	  ckjhdmxList.add(ckjhdmx);
	  logger.info("~~~anxh-digui-08~~ckjhdmx add to list end~h="+h);
	
	  digui(bommx.getId(),jxql,xmid,ckjhdid,ckjhdmxList,dataset);
	}
	
}catch(Exception e){
  logger.error("~~~anxh-digui-08~~出错了出错了出错了出错了出错了出错了出错了出错了出错了~e="+e);
  return "ERROR";
}

logger.info("~~~anxh-digui-08~~end~");
return "OK";
	}
//-----BOM1
	public  String digui1(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) {
		/**
 * 根据BOMID和父级BOM明细ID找到对应的所有下级BOM明细，循环逐个处理
 * --根据BOM明细中的数量和生产数量计算毛需求量
 * --根据物料性质不同查找出不同的库位循环逐个处理
 * ----先查找使用有铅无铅对应表所对应的有铅物料的库存
 * ------查找在线库存，记录在线库存量、维护毛需求量和出库量
 * ------查找普通库存，记录普通库存量、维护毛需求量和出库量
 * ------查找其他项目的该库位总库存，记录需调拔数量、维护毛需求量和出库量
 * ------若有库存，则维护BOM分析结果
 * ----如果需求量未满足，则查找使用本物料对应的库存
 * ------处理数据类似有铅物料处理，当最后所有库位循环完毕，需求量未满足，则继续递归分解
 */
try {
	String hql_h = "from Atzbommx where atzbomid=" + bomid + " and fubommxid=" + fubommxid;
	List bommxList = dataset.getListByHql("Atzbommx", hql_h);//根据BOMID和父级BOM明细ID找到对应的所有下级BOM明细
	if (null != bommxList && bommxList.size() > 0) {
		if (fubommxid == 0l && bommxList.size() < 1) {//如果BOM表中没有该BOM明细信息则返回错误
			return "NO";
		}

		for (int h = 0; h < bommxList.size(); h++) {
			Atzbommx bommx = (Atzbommx) bommxList.get(h);
			//根据BOM明细中的数量和生产数量计算毛需求量
			Double bomsl = bommx.getShuliang();
			if (null == bomsl || "".equals(bomsl)) {
				bomsl = -1d;
			}
			double mxql1 = 0d;//毛需求量
			double mxql = A.mul(bomsl, count);
			if (mxql > 0) {
				mxql1 = mxql;
			} else if (mxql < 0) {
				mxql1 = -mxql;
				if (mdwsl != 0d)
					mxql1 = A.mul(mxql1, mdwsl);
			}

			//根据物料性质不同查找出不同的库位循环逐个处理
			Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObject("Atzwuliaojcxx", bommx.getWuliaoid());
			String wlxz = wl.getWuliaoxz();//物料性质:0采购，1生产
			//库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):1故障，2可用，3内部使用，4待测
			String kwCondition = "";
			if (null != wlxz && !"".equals(wlxz)) {
				if ("0".equals(wlxz))
					kwCondition = " kuweiwlzt in ('1','4') and shifougz='2' order by id desc";
				else if ("1".equals(wlxz))
					kwCondition = " kuweiwlzt in ('2','4') and shifougz in ('2','4') order by shifougz desc,id desc";
			} else {
				logger.error("物料中获取物料性质为空~~~物料ID为："+bommx.getWuliaoid());
				return "NO";
			}
			long bomfxjgid = 0l;
			List kwList = dataset.getListByHql("Atzkuwei", "from Atzkuwei where" + kwCondition);
			if (null != kwList && kwList.size() > 0) {
				int a = kwList.size() - 1;//记录库存的数量，到最后判断是否还有库存
				List yqwqdybList = dataset.getListByHql("Atzyouqianwqdyb", " from Atzyouqianwqdyb where wuqianwlid=" + bommx.getWuliaoid());

				for (int i = 0; i < kwList.size(); i++) {
					Atzkuwei kw = (Atzkuwei) kwList.get(i);
					Long kwid = kw.getId();

					//先查找使用有铅无铅对应表所对应的有铅物料的库存
					if (mxql1 > 0 && yqwqdybList != null && yqwqdybList.size() > 0) {
						for (int k = 0; k < yqwqdybList.size(); k++) {
							Atzyouqianwqdyb yqwqdyb = (Atzyouqianwqdyb) yqwqdybList.get(k);
							long yqwlid = yqwqdyb.getYouqianwlid();
							if (mxql1 > 0) {
								double cklsum0 = 0d; // 出库量
								double mxql20 = mxql1;

								//查找在线库存，记录在线库存、维护毛需求量
								double zxlsum0 = 0d;
								String hql50 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid=" + yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc50 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql50);
								if (null != kc50) {
									double zxl = kc50.getKeyongl();
									if (mxql1 > zxl) {
										mxql1 = A.subtract(mxql1, zxl);
										cklsum0 = A.add(cklsum0, zxl);
									} else {
										cklsum0 = A.add(cklsum0, mxql1);
										mxql1 = 0d;
									}
									zxlsum0 = A.add(zxlsum0, zxl);
								}
								//查找普通库存，记录在线库存、维护毛需求量
								double kylsum0 = 0d;
								String hql10 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid=" + yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc110 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql10);
								if (null != kc110) {
									double kyl = kc110.getKeyongl();

									if (mxql1 > 0) {
										if (mxql1 > kyl) {
											cklsum0 = A.add(cklsum0, kyl);
											mxql1 = A.subtract(mxql1, kyl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									kylsum0 = A.add(kylsum0, kyl);
								}
								//查找其他项目的该库位总库存，记录需调拔数量、维护毛需求量和出库量
								double xdbsl0 = 0d;// 需调拔数量
								double qtxmzl0 = 0d;
								String hql150 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid=" + yqwlid + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
								List qtxmkcList0 = dataset.getListByHql("Atzkucun", hql150);
								if (null != qtxmkcList0 && qtxmkcList0.size() > 0) {
									for (int j = 0; j < qtxmkcList0.size(); j++) {
										Atzkucun kc115 = (Atzkucun) qtxmkcList0.get(j);
										double qtkyl = kc115.getKeyongl();

										if (mxql1 > 0) {
											if (mxql1 > qtkyl) {
												xdbsl0 = A.add(xdbsl0, qtkyl);
												cklsum0 = A.add(cklsum0, qtkyl);
												mxql1 = A.subtract(mxql1, qtkyl);
											} else {
												xdbsl0 = A.add(xdbsl0, mxql1);
												cklsum0 = A.add(cklsum0, mxql1);
												mxql1 = 0d;
											}
										}
										qtxmzl0 = A.add(qtxmzl0, qtkyl);
									}
								}
								//若有库存，则维护BOM分析结果
								if (xdbsl0 > 0 || cklsum0 > 0) {
									// 判断是否有下一级
									String hql_h10 = "from Atzbommx where fubommxid=" + bommx.getId();
									List bommxList10 = dataset.getListByHql("Atzbommx", hql_h10);
									String sfyxj0 = "2";// 是否有下一级1是，2否
									if (mxql1 > 0) {
										if (null != bommxList10 && bommxList10.size() > 0) {
											sfyxj0 = "1";
										}
									}
									Atzbomfxjg bomfxjg = new Atzbomfxjg();
									bomfxjg.setFuid(fubomfxjgid);//父ID
									bomfxjg.setBommxid(bommx.getId());//BOM明细ID 
									bomfxjg.setScjhid(scjhid);//生产计划ID 
									bomfxjg.setScjhmxid(scjhmxid);//生产计划明细ID 
									bomfxjg.setXiangmuid(xmid);//项目ID 
									Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
									bomfxjg.setXmbh(xm.getXiangmubh());//项目编号
									bomfxjg.setKuweiid(kw.getId());//库位ID 
									bomfxjg.setKwbh(kw.getKuweibh());//库位编号 
									Atzwuliaojcxx wl0 = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + yqwlid);
									bomfxjg.setWuliaoid(yqwlid);//物料ID 
									bomfxjg.setWuliaoidRef(wl0);//物料实体
									bomfxjg.setWlbm(wl0.getWuliaobm());//物料编码
									bomfxjg.setWlms(wl0.getWuliaoms());//物料描述
									bomfxjg.setMaoxuql(mxql20);//毛需求量
									bomfxjg.setZxsl(zxlsum0);//在线数量
									bomfxjg.setKucunl(kylsum0);//库存量
									bomfxjg.setQtxmzl(qtxmzl0);//其他项目总量
									bomfxjg.setQuekoul(0d);//缺口量
									bomfxjg.setChukul(cklsum0);//出库量
									bomfxjg.setWeidbsl(xdbsl0);//未调拨数量
									bomfxjg.setShifouzdc(sfyxj0);//是否最底层
									bomfxjg.setBeitdwqwl(wl.getWuliaobm());//被替代无铅物料
									dataset.add(bomfxjg);
								}
							}
						}
					}

					//如果需求量未满足，则查找使用本物料对应的库存
					if (mxql1 > 0) {
						double cklsum = 0d; // 出库量
						double mxql2 = mxql1;
						// 在线库存-kucunlx:1普通库存,2原材料在线
						double zxlsum = 0d;
						String hql5 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid=" + bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc5 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql5);
						if (null != kc5) {
							double zxl = kc5.getKeyongl();

							if (mxql1 > 0) {
								if (mxql1 > zxl) {
									mxql1 = A.subtract(mxql1, zxl);
									cklsum = A.add(cklsum, zxl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}// if mxql10 end
							zxlsum = A.add(zxlsum, zxl);
						}// if kc5!=null end

						// 普通库存-kucunlx:1普通库存,2原材料在线
						double kylsum = 0d;
						String hql1 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc11 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql1);
						if (null != kc11) {
							double kyl = kc11.getKeyongl();

							if (mxql1 > 0) {
								if (mxql1 > kyl) {
									cklsum = A.add(cklsum, kyl);
									mxql1 = A.subtract(mxql1, kyl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}// if mxql1>0 end
							kylsum = A.add(kylsum, kyl);
						}// if kc11!=null end

						// 其他项目的该库位总库存-kucunlx:1普通库存,2原材料在线
						double xdbsl = 0d;// 需调拔数量
						double qtxmzl = 0d;
						String hql15 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
						List qtxmkcList = dataset.getListByHql("Atzkucun", hql15);
						if (null != qtxmkcList && qtxmkcList.size() > 0) {
							for (int j = 0; j < qtxmkcList.size(); j++) {
								Atzkucun kc115 = (Atzkucun) qtxmkcList.get(j);
								double qtkyl = kc115.getKeyongl();
								if (mxql1 > 0) {
									if (mxql1 > qtkyl) {
										xdbsl = A.add(xdbsl, qtkyl);
										cklsum = A.add(cklsum, qtkyl);
										mxql1 = A.subtract(mxql1, qtkyl);
									} else {
										xdbsl = A.add(xdbsl, mxql1);
										cklsum = A.add(cklsum, mxql1);
										mxql1 = 0d;
									}
								}// if qtxmkcList!=null end
								qtxmzl = A.add(qtxmzl, qtkyl);
							}// for j end
						}// if kc11!=null end

						// 判断是否有下一级
						String hql_h1 = "from Atzbommx where fubommxid=" + bommx.getId();
						List bommxList1 = dataset.getListByHql("Atzbommx", hql_h1);

						String sfyxj = "2";// 是否有下一级1是，2否
						double qkl = 0d;
						if (mxql1 > 0) {
							if (null != bommxList1 && bommxList1.size() > 0) {
								sfyxj = "1";
							} else {
								if (i == a) {
									mxql = mxql < 0 ? -mxql : mxql;
									cklsum = mxql2;
									qkl = mxql1;
								}// if i==a
							}
						}// if mxql1>0 end

						if ((qkl > 0 && "2".equals(sfyxj)) || xdbsl > 0 || (i == a && mxql1 > 0) || cklsum > 0) {//
							// 维护BOM分析结果
							Atzbomfxjg bomfxjg = new Atzbomfxjg();
							bomfxjg.setFuid(fubomfxjgid);
							bomfxjg.setBommxid(bommx.getId());
							bomfxjg.setScjhid(scjhid);
							bomfxjg.setScjhmxid(scjhmxid);
							bomfxjg.setXiangmuid(xmid);
							Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
							bomfxjg.setXmbh(xm.getXiangmubh());
							bomfxjg.setKuweiid(kw.getId());
							bomfxjg.setKwbh(kw.getKuweibh());
							bomfxjg.setWuliaoid(bommx.getWuliaoid());
							bomfxjg.setWuliaoidRef(wl);
							bomfxjg.setWlbm(wl.getWuliaobm());
							bomfxjg.setWlms(wl.getWuliaoms());
							bomfxjg.setMaoxuql(mxql2);
							bomfxjg.setZxsl(zxlsum);
							bomfxjg.setKucunl(kylsum);
							bomfxjg.setQtxmzl(qtxmzl);
							bomfxjg.setQuekoul(qkl);
							bomfxjg.setChukul(cklsum);
							bomfxjg.setWeidbsl(xdbsl);
							bomfxjg.setShifouzdc(sfyxj);
							dataset.add(bomfxjg);
							if (i == a)
								bomfxjgid = bomfxjg.getId();
						}

						//所有库位循环完毕，需求量未满足，则继续递归分解
						if (i == a && mxql1 > 0) {
							digui1(scjhid, scjhmxid, xmid, mxql1, mdwsl, bomid, bommx.getId(), bomfxjgid, list11, dataset);
						}
					}
				}
			}
		}
	}
} catch (Exception e) {
	logger.error(e.getMessage());
	return "ERROR";
}
return "OK";
	}
//-----递归BOM
	public boolean diguibl(Long bomid,Long yuanfubommxid,Long xinfubommxid,int cengci,String lujing,IDataSet dataset,String employeeName) {
		List bommxs=null;
		try{
			bommxs= dataset.getListByHql("Atzbommx","from Atzbommx where fubommxid="+yuanfubommxid);
      if(bommxs!=null){
		    for(int i=0;i<bommxs.size();i++){
		      Atzbommx temp=new Atzbommx();
		      Atzbommx bommx=(Atzbommx)bommxs.get(i);
		      copyBeanToBean(bommx,temp);
		      temp.setAtzbomid(bomid);
		      temp.setCengci(cengci+1);
		      temp.setFubommxid(xinfubommxid);
				  temp.setLurur(employeeName);
				  temp.setLururq(new Date());
				  temp.setZuihouxgr(employeeName);
				  temp.setZuihouxgrq(new Date());
		      dataset.add(temp);
		      logger.debug("lujing=="+lujing);
		      temp.setLujing(lujing+(temp.getId())+".");
          dataset.update(temp);
		      diguibl(bomid,bommx.getId(),temp.getId(),temp.getCengci(),temp.getLujing(),dataset,employeeName);
		    }
		    }
		  }catch(Exception e){
		  	logger.debug("BOM递归算法出现错误");
		    	}
		  return true;
	}
//-----递归删除BOM明细
	public List getList(Long fubommxid,IDataSet dataset) {
		List results=new ArrayList();
try{

	List bommxs= dataset.getListByHql("Atzbommx","from Atzbommx where fubommxid="+fubommxid+" order by wuliaoid");
	
  if(bommxs!=null&&bommxs.size()>0){
    	results.addAll(bommxs);
     for(int i=0;i<bommxs.size();i++){
     	  Atzbommx bommx=(Atzbommx)bommxs.get(i);
                 results.addAll(getList(bommx.getId(),dataset));	
     
     }
  }
  }catch(Exception e){
  	logger.debug("BOM递归算法出现错误");
    	}
  return results;
	}
//-----BOM明细修改判断
	public String digui(Long fubommxid,Long wuliaoid,IDataSet dataset) {
		try{
			List bommxs= dataset.getListByHql("Atzbommx","from Atzbommx where fubommxid="+fubommxid);
			if(bommxs!=null){
		    for(int i=0;i<bommxs.size();i++){
		      Atzbommx bommx=(Atzbommx)bommxs.get(i);
		      if(bommx.getWuliaoid().equals(wuliaoid)){
		          logger.debug("存在相同的物料信息");
		          return "修改BOM明细子明细存在该物料的信息";
		      }
		      digui(bommx.getId(),wuliaoid,dataset);
		    }
		    }
			return "OK";
		  }catch(Exception e){
		  	logger.debug("BOM递归算法出现错误");
                                        return "error";
		    }
	}
//-----deleteBomfxjgByFuid
	public String deleteBomfxjgByFuid(int an,long xmid,long fuid,IDataSet dataset) {
		try{
  an++;
	logger.info("~~~A-deleteBomfxjgByFuid-08~~in~");
	String hql="from Atzbomfxjg where fuid ="+fuid;
	List list = dataset.getListByHql("Atzbomfxjg",hql);
	if(list!=null && list.size()>0){
		logger.info("~~~A-deleteBomfxjgByFuid-08~~if~list.size="+list.size());
		for(int i=0;i<list.size();i++){
			Atzbomfxjg bomfxjg1=(Atzbomfxjg)list.get(i);
			
			//递归
			deleteBomfxjgByFuid(an,xmid,bomfxjg1.getId(),dataset);
		}
		logger.info("~~~A-deleteBomfxjgByFuid-08~~if end~");
	}else{
		logger.info("~~~A-deleteBomfxjgByFuid-08~~else~");
		Atzbomfxjg bomfxjg0 = (Atzbomfxjg)dataset.getObject(Atzbomfxjg.class,fuid);
		Atzkucun kc = (Atzkucun)dataset.getObjectByHql("Atzkucun","from Atzkucun where xiangmuid="+xmid+" and wuliaoid="+bomfxjg0.getWuliaoid());
		if(kc!=null){
			//kc.setKeyongl(kc.getKeyongl()+bomfxjg0.getChukul());
			//dataset.update(kc);
		}
		
    logger.info("~~~A-deleteBomfxjgByFuid-08~~kc upd end~an="+an);
    if(an!=1)
		   dataset.delete(bomfxjg0);
		logger.info("~~~A-deleteBomfxjgByFuid-08~~else end~");
	}
}catch(Exception e){
	logger.error("~~~A-deleteBomfxjgByFuid-08~~出错了出错了出错了出错了出错了~e="+e);	
	return "ERROR";
}
logger.info("~~~A-deleteBomfxjgByFuid-08~~end~");
return "OK";
	}
//-----getBomfxjgListByFubomfxjgid
	public String getBomfxjgListByFubomfxjgid(Long fubomfxjgid,Long ckjhdid,List ckjhdmxList,IDataSet dataset) {
		try{
		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~in~");
		
		//得到下一级
		String hql_h = "from Atzbomfxjg where fuid="+fubomfxjgid;
		List bomfxjgList = dataset.getListByHql("Atzbomfxjg",hql_h);
		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~bomfxjgList.size="+bomfxjgList.size());
		if(bomfxjgList.size()>0){
			for(int i=0;i<bomfxjgList.size();i++){
				Atzbomfxjg bomfxjg=(Atzbomfxjg)bomfxjgList.get(i);
				
				//判断是否有下一级
  			String hql_h1 = "from Atzbomfxjg where fuid="+bomfxjg.getId();
  			List bomfxjgList1 = dataset.getListByHql("Atzbomfxjg",hql_h1);
  			logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~bomfxjgList1.size="+bomfxjgList1.size());
  			if(bomfxjgList1.size()<1 && bomfxjg.getQuekoul()!=0){
  				return "NO3";//库存不足，请从其他项目中调拨或用替代物料替换
  			}
  			
  			//出库计划明细
  			int anxh=0;
        if(bomfxjg.getChukul()>0){
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmxList.size="+ckjhdmxList.size());
    			for(int k=0;k<ckjhdmxList.size();k++){
          	Atzchurukjhdmx ckjhdmx_old = (Atzchurukjhdmx)ckjhdmxList.get(k);
           
          	if(ckjhdmx_old.getWuliaoid()==bomfxjg.getWuliaoid()){
          		anxh=1;
            	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmx_old.wlid="+ckjhdmx_old.getWuliaoid());
             	ckjhdmx_old.setShuliang(ckjhdmx_old.getShuliang()+bomfxjg.getChukul());
             	bomfxjg.setShifouyxd("1");
        			dataset.update(bomfxjg);
             	break;
           	}  
           	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~k="+k);
        	}//for k end
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~i="+i+"~anxh="+anxh);
        	if(anxh==1){
        		continue;
        	}
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx begin~i="+i);
        	Atzchurukjhdmx ckjhdmx=new Atzchurukjhdmx();
        	ckjhdmx.setAtzchurukjhdid(ckjhdid);
        	ckjhdmx.setWuliaoid(bomfxjg.getWuliaoid());
          Atzwuliaojcxx wl1 = (Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,bomfxjg.getWuliaoid());
          ckjhdmx.setWuliaobm(wl1.getWuliaobm());
          ckjhdmx.setWuliaoms(wl1.getWuliaoms());
          ckjhdmx.setGuigedw(wl1.getGuigedw());
          ckjhdmx.setDanwei(wl1.getDanwei());
          ckjhdmx.setWeicrksl(bomfxjg.getChukul());
        	ckjhdmx.setShuliang(bomfxjg.getChukul());
					ckjhdmx.setLururq(new Date());
        	ckjhdmxList.add(ckjhdmx);
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx add to list end~i="+i);
        }//if chukoul>0 end
        
				bomfxjg.setShifouyxd("1");
    		dataset.update(bomfxjg);
    		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~sfyxd upd end~i="+i);
    		
    		//递归调用
    		String r =getBomfxjgListByFubomfxjgid(bomfxjg.getId(),ckjhdid,ckjhdmxList,dataset);
    		if(!"OK".equals(r))
    			return r;
			}//for i end
		}else{
			Atzbomfxjg bomfxjg=(Atzbomfxjg)dataset.getObject("Atzbomfxjg",fubomfxjgid);
			
			if(bomfxjg.getQuekoul()>0){
  			return "NO3";//库存不足，请从其他项目中调拨或用替代物料替换
  		}else{
  			//出库计划明细
  			int anxh=0;
        if(bomfxjg.getChukul()>0){
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmxList.size="+ckjhdmxList.size());
    			for(int k=0;k<ckjhdmxList.size();k++){
          	Atzchurukjhdmx ckjhdmx_old = (Atzchurukjhdmx)ckjhdmxList.get(k);
           
          	if(ckjhdmx_old.getWuliaoid()==bomfxjg.getWuliaoid()){
          		anxh=1;
            	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmx_old.wlid="+ckjhdmx_old.getWuliaoid());
             	ckjhdmx_old.setShuliang(ckjhdmx_old.getShuliang()+bomfxjg.getChukul());
             	bomfxjg.setShifouyxd("1");
        			dataset.update(bomfxjg);
             	break;
           	}  
           	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~k="+k);
        	}//for k end
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~~anxh="+anxh);
        	if(anxh==1){
        	   return "OK";
        	}
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx begin~");
        	Atzchurukjhdmx ckjhdmx=new Atzchurukjhdmx();
        	ckjhdmx.setAtzchurukjhdid(ckjhdid);
        	ckjhdmx.setWuliaoid(bomfxjg.getWuliaoid());
          Atzwuliaojcxx wl1 = (Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,bomfxjg.getWuliaoid());
          ckjhdmx.setWuliaobm(wl1.getWuliaobm());
          ckjhdmx.setWuliaoms(wl1.getWuliaoms());
          ckjhdmx.setGuigedw(wl1.getGuigedw());
          ckjhdmx.setDanwei(wl1.getDanwei());
          ckjhdmx.setWeicrksl(bomfxjg.getChukul());
        	ckjhdmx.setShuliang(bomfxjg.getChukul());
					ckjhdmx.setLururq(new Date());
        	ckjhdmxList.add(ckjhdmx);
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx add to list end~");
        }//if chukoul>0 end
        
				bomfxjg.setShifouyxd("1");
    		dataset.update(bomfxjg);
    		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~sfyxd upd end~");
  		}//判断缺口量>0 end
		}//判断是否有子信息结束
		
	}catch(Exception e){
		logger.error("~~~A-getBomfxjgListByFubomfxjgid-08~~出错了出错了出错了出错了出错了~e="+e);
		return "ERROR";
  }
  logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~end~");
  return "OK";
	}
//-----getBomfxjgListByFubomfxjgid1
	public String getBomfxjgListByFubomfxjgid1(Long fubomfxjgid,Long ckjhdid,List ckjhdmxList,IDataSet dataset) {
		try{
		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~in~");
		
		//得到下一级
		String hql_h = "from Atzbomfxjg where fuid="+fubomfxjgid;
		List bomfxjgList = dataset.getListByHql("Atzbomfxjg",hql_h);
		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~bomfxjgList.size="+bomfxjgList.size());
		if(bomfxjgList.size()>0){
			for(int i=0;i<bomfxjgList.size();i++){
				Atzbomfxjg bomfxjg=(Atzbomfxjg)bomfxjgList.get(i);
  			
  			//出库计划明细
  			int anxh=0;
        if(bomfxjg.getChukul()>0){
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmxList.size="+ckjhdmxList.size());
    			for(int k=0;k<ckjhdmxList.size();k++){
          	Atzchurukjhdmx ckjhdmx_old = (Atzchurukjhdmx)ckjhdmxList.get(k);
           
          	if(ckjhdmx_old.getWuliaoid()==bomfxjg.getWuliaoid()){
          		anxh=1;
            	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmx_old.wlid="+ckjhdmx_old.getWuliaoid());
             	ckjhdmx_old.setShuliang(ckjhdmx_old.getShuliang()+bomfxjg.getChukul());
             	bomfxjg.setShifouyxd("1");
        			dataset.update(bomfxjg);
             	break;
           	}  
           	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~k="+k);
        	}//for k end
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~i="+i+"~anxh="+anxh);
        	if(anxh==1){
        		continue;
        	}
        	
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx begin~i="+i);
        	Atzchurukjhdmx ckjhdmx=new Atzchurukjhdmx();
        	ckjhdmx.setAtzchurukjhdid(ckjhdid);
        	ckjhdmx.setWuliaoid(bomfxjg.getWuliaoid());
          Atzwuliaojcxx wl1 = (Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,bomfxjg.getWuliaoid());
          ckjhdmx.setWuliaobm(wl1.getWuliaobm());
          ckjhdmx.setWuliaoms(wl1.getWuliaoms());
          ckjhdmx.setGuigedw(wl1.getGuigedw());
          ckjhdmx.setDanwei(wl1.getDanwei());
          ckjhdmx.setWeicrksl(bomfxjg.getChukul());
        	ckjhdmx.setShuliang(bomfxjg.getChukul());
					ckjhdmx.setLururq(new Date());
        	ckjhdmxList.add(ckjhdmx);
        	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx add to list end~i="+i);
        }//if chukoul>0 end
        
				bomfxjg.setShifouyxd("1");
    		dataset.update(bomfxjg);
    		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~sfyxd upd end~i="+i);
    		
    		//递归调用
    		String r =getBomfxjgListByFubomfxjgid1(bomfxjg.getId(),ckjhdid,ckjhdmxList,dataset);
    		if(!"OK".equals(r))
    			return r;
			}//for i end
		}else{
			Atzbomfxjg bomfxjg=(Atzbomfxjg)dataset.getObject("Atzbomfxjg",fubomfxjgid);
			
			//出库计划明细
			int anxh=0;
      if(bomfxjg.getChukul()>0){
      	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmxList.size="+ckjhdmxList.size());
  			for(int k=0;k<ckjhdmxList.size();k++){
        	Atzchurukjhdmx ckjhdmx_old = (Atzchurukjhdmx)ckjhdmxList.get(k);
         
        	if(ckjhdmx_old.getWuliaoid()==bomfxjg.getWuliaoid()){
        		anxh=1;
          	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~ckjhdmx_old.wlid="+ckjhdmx_old.getWuliaoid());
           	ckjhdmx_old.setShuliang(ckjhdmx_old.getShuliang()+bomfxjg.getChukul());
           	bomfxjg.setShifouyxd("1");
      			dataset.update(bomfxjg);
           	break;
         	}  
         	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~k="+k);
      	}//for k end
      	
      	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~~~anxh="+anxh);
      	if(anxh==1){
      		return "OK";
      	}
      	
      	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx begin~");
      	Atzchurukjhdmx ckjhdmx=new Atzchurukjhdmx();
      	ckjhdmx.setAtzchurukjhdid(ckjhdid);
      	ckjhdmx.setWuliaoid(bomfxjg.getWuliaoid());
        Atzwuliaojcxx wl1 = (Atzwuliaojcxx)dataset.getObject(Atzwuliaojcxx.class,bomfxjg.getWuliaoid());
        ckjhdmx.setWuliaobm(wl1.getWuliaobm());
        ckjhdmx.setWuliaoms(wl1.getWuliaoms());
        ckjhdmx.setGuigedw(wl1.getGuigedw());
        ckjhdmx.setDanwei(wl1.getDanwei());
        ckjhdmx.setWeicrksl(bomfxjg.getChukul());
      	ckjhdmx.setShuliang(bomfxjg.getChukul());
				ckjhdmx.setLururq(new Date());
      	ckjhdmxList.add(ckjhdmx);
      	logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~ckjhdmx add to list end~");
      }//if chukoul>0 end
      
			bomfxjg.setShifouyxd("1");
  		dataset.update(bomfxjg);
  		logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~sfyxd upd end~");
		}//判断是否有子信息结束
		
	}catch(Exception e){
		logger.error("~~~A-getBomfxjgListByFubomfxjgid-08~~出错了出错了出错了出错了出错了~e="+e);
		return "ERROR";
  }
  logger.info("~~~A-getBomfxjgListByFubomfxjgid-08~~end~");
  return "OK";
	}
//-----BOM2
	public  String digui2(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) {
		/**
 * 类似digui1，差别是只分解一层，最后需求量不足不需递归分解
 */
try {
	String hql_h = "from Atzbommx where atzbomid=" + bomid + " and fubommxid=" + fubommxid;
	List bommxList = dataset.getListByHql("Atzbommx", hql_h);
	if (null != bommxList && bommxList.size() > 0) {
		if (fubommxid == 0l && bommxList.size() < 1) {
			return "NO";// 请完成BOM信息
		}

		for (int h = 0; h < bommxList.size(); h++) {
			Atzbommx bommx = (Atzbommx) bommxList.get(h);
			Double bomsl = bommx.getShuliang();
			if (null == bomsl || "".equals(bomsl)) {
				bomsl = -1d;
			}
			// 毛需求量
			double mxql1 = 0d;// 所需剩余量
			double mxql = A.mul(bomsl, count);
			if (mxql > 0) {
				mxql1 = mxql;
			} else if (mxql < 0) {
				mxql1 = -mxql;
				if (mdwsl != 0d)
					mxql1 = A.mul(mxql1, mdwsl);
			}

			// 物料-wuliaoxz:0采购，1生产;库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):2可用，4待测
			Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + bommx.getWuliaoid());
			String wlxz = wl.getWuliaoxz();

			// 库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):1故障，2可用，3内部使用，4待测
			String kwCondition = "";
			if (null != wlxz || !"".equals(wlxz)) {
				if ("0".equals(wlxz))
					kwCondition = " kuweiwlzt in ('1','4') and shifougz='2' order by id desc";
				else if ("1".equals(wlxz))
					kwCondition = " kuweiwlzt in ('2','4') and shifougz in ('2','4') order by shifougz desc,id desc";
			}

			List kwList = dataset.getListByHql("Atzkuwei", "from Atzkuwei where" + kwCondition);
			if (null != kwList && kwList.size() > 0) {
				int a = kwList.size();// 判断是否还有库存
				a = a - 1;
				List yqwqdybList = dataset.getListByHql("Atzyouqianwqdyb", " from Atzyouqianwqdyb where wuqianwlid=" + bommx.getWuliaoid());
				for (int i = 0; i < kwList.size(); i++) {
					Atzkuwei kw = (Atzkuwei) kwList.get(i);
					Long kwid = kw.getId();

					if (mxql1 > 0 && yqwqdybList != null && yqwqdybList.size() > 0) {
						for (int k = 0; k < yqwqdybList.size(); k++) {
							Atzyouqianwqdyb yqwqdyb = (Atzyouqianwqdyb) yqwqdybList.get(k);
							long yqwlid = yqwqdyb.getYouqianwlid();
							if (mxql1 > 0) {
								double cklsum0 = 0d; // 出库量
								double mxql20 = mxql1;

								// 在线库存-kucunlx:1普通库存,2原材料在线
								double zxlsum0 = 0d;
								String hql50 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc50 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql50);
								if (null != kc50) {
									double zxl = kc50.getKeyongl();

									if (mxql1 > 0) {
										if (mxql1 > zxl) {
											mxql1 = A.subtract(mxql1, zxl);
											cklsum0 = A.add(cklsum0, zxl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									zxlsum0 = A.add(zxlsum0, zxl);
								}

								// 普通库存-kucunlx:1普通库存,2原材料在线
								double kylsum0 = 0d;
								String hql10 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc110 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql10);
								if (null != kc110) {
									double kyl = kc110.getKeyongl();

									if (mxql1 > 0) {
										if (mxql1 > kyl) {
											cklsum0 = A.add(cklsum0, kyl);
											mxql1 = A.subtract(mxql1, kyl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									kylsum0 = A.add(kylsum0, kyl);
								}

								// 其他项目的该库位总库存-kucunlx:1普通库存,2原材料在线
								double xdbsl0 = 0d;// 需调拔数量
								double qtxmzl0 = 0d;
								String hql150 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
								List qtxmkcList0 = dataset.getListByHql("Atzkucun", hql150);
								if (null != qtxmkcList0 && qtxmkcList0.size() > 0) {
									for (int j = 0; j < qtxmkcList0.size(); j++) {
										Atzkucun kc115 = (Atzkucun) qtxmkcList0.get(j);
										double qtkyl = kc115.getKeyongl();

										if (mxql1 > 0) {
											if (mxql1 > qtkyl) {
												xdbsl0 = A.add(xdbsl0, qtkyl);
												cklsum0 = A.add(cklsum0, qtkyl);
												mxql1 = A.subtract(mxql1, qtkyl);
											} else {
												xdbsl0 = A.add(xdbsl0, mxql1);
												cklsum0 = A.add(cklsum0, mxql1);
												mxql1 = 0d;
											}
										}
										qtxmzl0 = A.add(qtxmzl0, qtkyl);
									}
								}

								// 判断是否有下一级
								String hql_h10 = "from Atzbommx where fubommxid=" + bommx.getId();
								List bommxList10 = dataset.getListByHql("Atzbommx", hql_h10);
								String sfyxj0 = "2";// 是否有下一级1是，2否
								if (mxql1 > 0) {
									if (null != bommxList10 && bommxList10.size() > 0) {
										sfyxj0 = "1";
									}
								}

								if (xdbsl0 > 0 || cklsum0 > 0) {
									// 维护BOM分析结果
									Atzbomfxjg bomfxjg = new Atzbomfxjg();
									bomfxjg.setFuid(fubomfxjgid);
									bomfxjg.setBommxid(bommx.getId());
									bomfxjg.setScjhid(scjhid);
									bomfxjg.setScjhmxid(scjhmxid);
									bomfxjg.setXiangmuid(xmid);
									Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
									bomfxjg.setXmbh(xm.getXiangmubh());
									bomfxjg.setKuweiid(kw.getId());
									bomfxjg.setKwbh(kw.getKuweibh());
									Atzwuliaojcxx wl0 = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + yqwlid);
									bomfxjg.setWuliaoid(yqwlid);
									bomfxjg.setWuliaoidRef(wl0);
									bomfxjg.setWlbm(wl0.getWuliaobm());
									bomfxjg.setWlms(wl0.getWuliaoms());
									bomfxjg.setMaoxuql(mxql20);
									bomfxjg.setZxsl(zxlsum0);
									bomfxjg.setKucunl(kylsum0);
									bomfxjg.setQtxmzl(qtxmzl0);
									bomfxjg.setQuekoul(0d);
									bomfxjg.setChukul(cklsum0);
									bomfxjg.setWeidbsl(xdbsl0);
									bomfxjg.setShifouzdc(sfyxj0);
									bomfxjg.setBeitdwqwl(wl.getWuliaobm());
									dataset.add(bomfxjg);
								}
							}
						}
					}

					if (mxql1 > 0) {
						double cklsum = 0d;
						double mxql2 = mxql1;

						// 在线库存-kucunlx:1普通库存,2原材料在线
						double zxlsum = 0d;
						String hql5 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc5 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql5);
						if (null != kc5) {
							double zxl = kc5.getKeyongl();

							if (mxql1 > 0) {
								if (mxql1 > zxl) {
									mxql1 = A.subtract(mxql1, zxl);
									cklsum = A.add(cklsum, zxl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							zxlsum = A.add(zxlsum, zxl);
						}

						// 普通库存-kucunlx:1普通库存,2原材料在线
						double kylsum = 0d;
						String hql1 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc11 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql1);
						if (null != kc11) {
							double kyl = kc11.getKeyongl();
							if (mxql1 > 0) {
								if (mxql1 > kyl) {
									cklsum = A.add(cklsum, kyl);
									mxql1 = A.subtract(mxql1, kyl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							kylsum = A.add(kylsum, kyl);
						}

						// 其他项目的该库位总库存-kucunlx:1普通库存,2原材料在线
						double xdbsl = 0d;// 需调拔数量
						double qtxmzl = 0d;
						String hql15 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
						List qtxmkcList = dataset.getListByHql("Atzkucun", hql15);
						if (null != qtxmkcList && qtxmkcList.size() > 0) {
							for (int j = 0; j < qtxmkcList.size(); j++) {
								Atzkucun kc115 = (Atzkucun) qtxmkcList.get(j);
								double qtkyl = kc115.getKeyongl();

								if (mxql1 > 0) {
									if (mxql1 > qtkyl) {
										xdbsl = A.add(xdbsl, qtkyl);
										cklsum = A.add(cklsum, qtkyl);
										mxql1 = A.subtract(mxql1, qtkyl);
									} else {
										xdbsl = A.add(xdbsl, mxql1);
										cklsum = A.add(cklsum, mxql1);
										mxql1 = 0d;
									}
								}
								qtxmzl = A.add(qtxmzl, qtkyl);
							}
						}

						// 判断是否有下一级
						String sfyxj = "2";// 是否有下一级1是，2否
						double qkl = 0d;
						if (mxql1 > 0) {
							if (i == a) {
								mxql = mxql < 0 ? -mxql : mxql;
								cklsum = mxql2;
								qkl = mxql1;
							}
						}

						if ((qkl > 0 && "2".equals(sfyxj)) || xdbsl > 0 || (i == a && mxql1 > 0) || cklsum > 0) {
							// 维护BOM分析结果
							Atzbomfxjg bomfxjg = new Atzbomfxjg();
							bomfxjg.setFuid(fubomfxjgid);
							bomfxjg.setBommxid(bommx.getId());
							bomfxjg.setScjhid(scjhid);
							bomfxjg.setScjhmxid(scjhmxid);
							bomfxjg.setXiangmuid(xmid);
							Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
							bomfxjg.setXmbh(xm.getXiangmubh());
							bomfxjg.setKuweiid(kw.getId());
							bomfxjg.setKwbh(kw.getKuweibh());
							bomfxjg.setWuliaoid(bommx.getWuliaoid());
							bomfxjg.setWuliaoidRef(wl);
							bomfxjg.setWlbm(wl.getWuliaobm());
							bomfxjg.setWlms(wl.getWuliaoms());
							bomfxjg.setMaoxuql(mxql2);
							bomfxjg.setZxsl(zxlsum);
							bomfxjg.setKucunl(kylsum);
							bomfxjg.setQtxmzl(qtxmzl);
							bomfxjg.setQuekoul(qkl);
							bomfxjg.setChukul(cklsum);
							bomfxjg.setWeidbsl(xdbsl);
							bomfxjg.setShifouzdc(sfyxj);
							dataset.add(bomfxjg);
						}
					}
				}
			}
		}
	}
} catch (Exception e) {
	logger.info("~~~anxh-digui2-08~~end~e=" + e);
	return "ERROR";
}
return "OK";
	}
//-----BOM3
	public  String digui3(long bomid,long fuid,long scjhid,long scjhmxid,long fubomfxjgid,double count,long xmid,IDataSet dataset) {
		logger.info("~~~anxh-digui3-08~~in~");

  try{
     String hql_h="from Atzbommx where atzbomid="+bomid+" and fubommxid="+fuid;
     List bommxList = dataset.getListByHql("Atzbommx",hql_h);
     if(null!=bommxList && bommxList.size()>0){
	     logger.info("~~~anxh-digui-08~~~bommxList.size="+bommxList.size());
	     if(fuid == 0l &&bommxList.size()<1){
	  	 		return "NO";//请完成BOM信息
	     }
	  	
	     Atzbomfxjg bomfxjg = null;
	     for(int h=0;h<bommxList.size();h++){
	      	logger.info("~~~anxh-digui-08~~~h="+h);
	      	//分析结果
	 			  bomfxjg = new Atzbomfxjg();
	 			  
	  			Atzbommx bommx = (Atzbommx)bommxList.get(h);
	  			Double bomsl=bommx.getShuliang();
	  			if(null==bomsl || "".equals(bomsl)){
	  			  bomsl=-1d;
	  			}
	  			logger.info("~~~anxh-digui-08~~~bomsl="+bomsl);
	  			
	  			//毛需求量
	  			double mxql = bomsl*count;
	  			logger.info("~~~anxh-digui-08~~~mxql="+mxql);
	  			
	  			if(mxql>0){
	    			//库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):2可用，4待测
	    			String kwCondition="";
	    			
	    			//物料-wuliaoxz:0采购，1生产
	    			Atzwuliaojcxx wl=(Atzwuliaojcxx)dataset.getObjectByHql("Atzwuliaojcxx"," from Atzwuliaojcxx where id="+bommx.getWuliaoid());
	    			String wlxz=wl.getWuliaoxz();
	    			logger.info("~~~anxh-digui-08~~0采购，1生产~wlxz="+wlxz);	
	    			if(null!=wlxz || !"".equals(wlxz)){
	    				if("0".equals(wlxz))
	    					kwCondition=" shifougz='2' and kuweiwlzt='1'";
	    				else if("1".equals(wlxz))
	    					kwCondition=" shifougz in ('2') and kuweiwlzt in ('2','3')";
	    			}
	    			
	    			//kwCondition=" shifougz in('2','4') and kuweiwlzt in ('1','2')";	    			logger.info("~~~anxh-digui-08~~~kwCondition="+kwCondition);
	    			
	    			double kylsum=0d;
	    			double zxlsum=0d;
	    			double cklsum=0d;	
	    			long kwid=1l;
	    			double mxql1=mxql;
	    			List kwList=dataset.getListByHql("Atzkuwei","from Atzkuwei where"+kwCondition);
	    			if(null!=kwList && kwList.size()>0){
	    				logger.info("~~~anxh-digui-08~~~kwList.size="+kwList.size());
	    				for(int i=0;i<kwList.size();i++){
	    					logger.info("~~~anxh-digui-08~~~i="+i);
	    					Atzkuwei kw=(Atzkuwei)kwList.get(i);
	    					
								//测试在线-kucunlx:1普通库存,5测试在线
	    					String hql5= "from Atzkucun where kucunlx='5' and keyongl>0 and wuliaoid="+bommx.getWuliaoid()+" and xiangmuid="+xmid+" and kuweiid="+kw.getId();
	    					Atzkucun kc5=(Atzkucun)dataset.getObjectByHql("Atzkucun",hql5);
	    					if(null!=kc5){
	    						logger.info("~~~anxh-digui-08~5~kc5!=null~i="+i);
	    						kwid=kw.getId();
	    						double zxl=kc5.getKeyongl();
	    						
	    						logger.info("~~~anxh-digui-08~5~mxql1="+mxql1+"~i="+i);
	    						if(mxql1>0){
	  								double kcl=0d;
	  								logger.info("~~~anxh-digui-08~5~zxlsum="+zxlsum+"~mxql1="+mxql1+"~zxl="+zxl+"~i="+i);
	  								if(mxql1>zxl){
	  									kcl=0d;
	  									mxql1=mxql1-zxl;
	  									cklsum=cklsum+zxl;
	  								}else{
	  									kcl=zxl-mxql1;
	  									mxql1=0d;
	  									cklsum=cklsum+mxql1;
	  								}
	  								logger.info("~~~anxh-digui-08~5~mxql1="+mxql1+"~kcl="+kcl+"~i="+i);
	  								
	  								//kc5.setKeyongl(kcl);
	  								//dataset.update(kc5);
	  							}//if mxql1>0 end
	  							zxlsum=zxlsum+zxl;	
	            	}//if kc5!=null end
		
								//普通库存
	    					String hql1= "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid = "+bommx.getWuliaoid()+" and xiangmuid = "+xmid+" and kuweiid="+kw.getId();
	    					Atzkucun kc11=(Atzkucun)dataset.getObjectByHql("Atzkucun",hql1);
	    					if(null!=kc11){
	    						logger.info("~~~anxh-digui-08~1~kc11!=null~i="+i);
	    						kwid=kw.getId();
	    						double zxl=kc11.getKeyongl();
	    						
	    						logger.info("~~~anxh-digui-08~1~mxql1="+mxql1+"~i="+i);
	    						if(mxql1>0){
	  								double kcl=0d;
	  								logger.info("~~~anxh-digui-08~1~zxlsum="+zxlsum+"~mxql1="+mxql1+"~zxl="+zxl+"~i="+i);
	  								if(mxql1>zxl){
	  									kcl=0d;
	  									mxql1=mxql1-zxl;
	  									cklsum=cklsum+zxl;
	  								}else{
	  									kcl=zxl-mxql1;
	  									mxql1=0d;
	  									cklsum=cklsum+mxql1;
	  								}
	  								logger.info("~~~anxh-digui-08~1~mxql1="+mxql1+"~kcl="+kcl+"~i="+i);
	  								
	  								//kc11.setKeyongl(kcl);
	  								//dataset.update(kc11);
	  							}//if mxql1>0 end
	  							kylsum=kylsum+zxl;	
	            	}//if kc11!=null end
	    					
	    				}//for i end
	    			}//if kwList null end
	    			logger.info("~~~anxh-digui-08~mxql="+mxql+"~kylsum="+kylsum+"~zxlsum="+zxlsum+"~mxql1="+mxql1+"~cklsum="+cklsum+"~kwid="+kwid+"~h="+h);
	    			
	    			//判断是否有下一级
	    			String sfzdc="2";
	 					String hql_h1 = "from Atzbommx where fubommxid="+bommx.getId();
	     	  	List bommxList1 = dataset.getListByHql("Atzbommx",hql_h1);
	     			if(null!=bommxList1 && bommxList1.size()>0){
	     				if(mxql1==0){
	     				  sfzdc="1";
	     				  cklsum=mxql;	
	     				}		
	     			}else{
	     				cklsum=mxql;
	     				sfzdc="1";
	     			}
	     			logger.info("~~~anxh-digui-08~~~bomfxjg begin");
	     			
	     			//维护BOM分析结果  	
	    			bomfxjg.setFuid(fubomfxjgid);
	          bomfxjg.setScjhid(scjhid);
	          bomfxjg.setScjhmxid(scjhmxid);
	          bomfxjg.setXiangmuid(xmid);
	    			bomfxjg.setWuliaoid(bommx.getWuliaoid());
	    			bomfxjg.setKuweiid(kwid);
	    			bomfxjg.setMaoxuql(mxql);
	    			bomfxjg.setKucunl(kylsum);
	    			bomfxjg.setZxsl(zxlsum);
	    			bomfxjg.setQuekoul(mxql1); 
	          bomfxjg.setChukul(cklsum);
	    			bomfxjg.setCengci(bommx.getCengci());
	          bomfxjg.setShifouzdc(sfzdc);
	          bomfxjg.setBommxid(bommx.getId());
	    			dataset.add(bomfxjg);
	    			logger.info("~~~anxh-digui-08~~bomfxjg add end~h="+h);
	    	    
			
	    		}else if(mxql<0){
	    			logger.info("~~~anxh-digui-08~~~mxql="+mxql);
	    			//维护BOM分析结果  	
	    			bomfxjg.setFuid(fubomfxjgid);
	          bomfxjg.setScjhid(scjhid);
	          bomfxjg.setScjhmxid(scjhmxid);
	          bomfxjg.setXiangmuid(xmid);
	    			bomfxjg.setWuliaoid(bommx.getWuliaoid());
	    			//bomfxjg.setKuweiid(kwid);
	    			bomfxjg.setMaoxuql(-count);
	    			bomfxjg.setKucunl(0d);
	    			bomfxjg.setZxsl(0d);
	    			bomfxjg.setQuekoul(0d); 
	          bomfxjg.setChukul(mxql);
	    			bomfxjg.setCengci(bommx.getCengci());
	          bomfxjg.setShifouzdc("1");
	          bomfxjg.setBommxid(bommx.getId());
	    			dataset.add(bomfxjg); 
	    		}//if mxql>0 end	   				
	     }//for h end
	   }
    
  }catch(Exception e){
    logger.info("~~~anxh-digui3-08~~end~e="+e);
    return "ERROR";
  }
  
  logger.info("~~~anxh-digui-08~~end~");
  return "OK";
	}
//-----BOM4
	public  String digui4(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) {
		/**
 * 类似digui1、digui2，差别是这里是进行预分解，只分解出数据进行展示但是不存入数据库
 */	
try {
	String hql_h = "from Atzbommx where atzbomid=" + bomid + " and fubommxid=" + fubommxid;
	List bommxList = dataset.getListByHql("Atzbommx", hql_h);//根据BOMID和父BOMID来获得该级的BOM明细列表
	if (null != bommxList && bommxList.size() > 0) {
		if (fubommxid == 0l && bommxList.size() < 1) {
			return "NO";
		}

		for (int h = 0; h < bommxList.size(); h++) {
			Atzbommx bommx = (Atzbommx) bommxList.get(h);
			Double bomsl = bommx.getShuliang();
			if (null == bomsl || "".equals(bomsl)) {
				bomsl = -1d;
			}

			double mxql1 = 0d;//毛需求量
			double mxql = A.mul(bomsl, count);
			if (mxql > 0) {
				mxql1 = mxql;
			} else if (mxql < 0) {
				mxql1 = -mxql;
				if (mdwsl != 0d)
					mxql1 = A.mul(mxql1, mdwsl);
			}

			Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + bommx.getWuliaoid());
			String wlxz = wl.getWuliaoxz();//物料性质：0来自采购、1来自生产
			String kwCondition = "";//库位物料状态：1原材料、2半成品、3成品、4备件；是否故障：1故障、2可用、3内部使用、4待测
			if (null != wlxz || !"".equals(wlxz)) {
				if ("0".equals(wlxz))
					kwCondition = " kuweiwlzt in ('1','4') and shifougz='2' order by id desc";
				else if ("1".equals(wlxz))
					kwCondition = " kuweiwlzt in ('2','4') and shifougz in ('2','4') order by shifougz desc,id desc";
			}
			
			List kwList = dataset.getListByHql("Atzkuwei", "from Atzkuwei where" + kwCondition);
			if (null != kwList && kwList.size() > 0) {
				int a = kwList.size();//记录库存个数，最后判断是否还有库存
				a = a - 1;

				List yqwqdybList = dataset.getListByHql("Atzyouqianwqdyb", " from Atzyouqianwqdyb where wuqianwlid=" + bommx.getWuliaoid());//有铅无铅对应表

				for (int i = 0; i < kwList.size(); i++) {
					Atzkuwei kw = (Atzkuwei) kwList.get(i);
					Long kwid = kw.getId();
					if (mxql1 > 0 && yqwqdybList != null && yqwqdybList.size() > 0) {
						for (int k = 0; k < yqwqdybList.size(); k++) {
							Atzyouqianwqdyb yqwqdyb = (Atzyouqianwqdyb) yqwqdybList.get(k);
							long yqwlid = yqwqdyb.getYouqianwlid();
							if (mxql1 > 0) {
								double cklsum0 = 0d; //出库量
								double mxql20 = mxql1;

								//在线库存-kucunlx:1普通库存,2原材料在线
								double zxlsum0 = 0d;
								String hql50 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc50 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql50);
								if (null != kc50) {
									double zxl = kc50.getKeyongl();
									if (mxql1 > 0) {
										if (mxql1 > zxl) {
											mxql1 = A.subtract(mxql1, zxl);
											cklsum0 = A.add(cklsum0, zxl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									zxlsum0 = A.add(zxlsum0, zxl);
								}

								// 普通库存-kucunlx:1普通库存,2原材料在线
								double kylsum0 = 0d;
								String hql10 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc110 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql10);
								if (null != kc110) {
									double kyl = kc110.getKeyongl();

									if (mxql1 > 0) {
										if (mxql1 > kyl) {
											cklsum0 = A.add(cklsum0, kyl);
											mxql1 = A.subtract(mxql1, kyl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									kylsum0 = A.add(kylsum0, kyl);
								}

								// 其他项目的该库位总库存-kucunlx:1普通库存,2原材料在线
								double xdbsl0 = 0d;// 需调拔数量
								double qtxmzl0 = 0d;
								String hql150 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
								List qtxmkcList0 = dataset.getListByHql("Atzkucun", hql150);
								if (null != qtxmkcList0 && qtxmkcList0.size() > 0) {
									for (int j = 0; j < qtxmkcList0.size(); j++) {
										Atzkucun kc115 = (Atzkucun) qtxmkcList0.get(j);
										double qtkyl = kc115.getKeyongl();

										if (mxql1 > 0) {
											if (mxql1 > qtkyl) {
												xdbsl0 = A.add(xdbsl0, qtkyl);
												cklsum0 = A.add(cklsum0, qtkyl);
												mxql1 = A.subtract(mxql1, qtkyl);
											} else {
												xdbsl0 = A.add(xdbsl0, mxql1);
												cklsum0 = A.add(cklsum0, mxql1);
												mxql1 = 0d;
											}
										}
										qtxmzl0 = A.add(qtxmzl0, qtkyl);
									}
								}
								String hql_h10 = "from Atzbommx where fubommxid=" + bommx.getId();
								List bommxList10 = dataset.getListByHql("Atzbommx", hql_h10);

								String sfyxj0 = "2";// 是否有下一级1是，2否
								if (mxql1 > 0) {
									if (null != bommxList10 && bommxList10.size() > 0) {
										sfyxj0 = "1";
									}
								}

								if (xdbsl0 > 0) {
									// 维护BOM分析结果
									Atzbomfxjg bomfxjg = new Atzbomfxjg();
									bomfxjg.setFuid(fubomfxjgid);
									bomfxjg.setBommxid(bommx.getId());
									bomfxjg.setScjhid(scjhid);
									bomfxjg.setScjhmxid(scjhmxid);
									bomfxjg.setXiangmuid(xmid);
									Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
									bomfxjg.setXmbh(xm.getXiangmubh());
									bomfxjg.setKuweiid(kw.getId());
									bomfxjg.setKwbh(kw.getKuweibh());
									Atzwuliaojcxx wl0 = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + yqwlid);
									bomfxjg.setWuliaoid(yqwlid);
									bomfxjg.setWuliaoidRef(wl0);
									bomfxjg.setWlbm(wl0.getWuliaobm());
									bomfxjg.setWlms(wl0.getWuliaoms());
									bomfxjg.setMaoxuql(mxql20);
									bomfxjg.setZxsl(zxlsum0);
									bomfxjg.setKucunl(kylsum0);
									bomfxjg.setQtxmzl(qtxmzl0);
									bomfxjg.setQuekoul(0d);
									bomfxjg.setChukul(cklsum0);
									bomfxjg.setWeidbsl(xdbsl0);
									bomfxjg.setShifouzdc(sfyxj0);
									bomfxjg.setBeitdwqwl(wl.getWuliaobm());
									list11.add(bomfxjg);
								}
							}
						}
					}

					if (mxql1 > 0) {
						double cklsum = 0d; // 出库量
						double mxql2 = mxql1;

						// 在线库存-kucunlx:1普通库存,2原材料在线
						double zxlsum = 0d;
						String hql5 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc5 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql5);
						if (null != kc5) {
							double zxl = kc5.getKeyongl();

							if (mxql1 > 0) {
								if (mxql1 > zxl) {
									mxql1 = A.subtract(mxql1, zxl);
									cklsum = A.add(cklsum, zxl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							zxlsum = A.add(zxlsum, zxl);
						}

						// 普通库存-kucunlx:1普通库存,2原材料在线
						double kylsum = 0d;
						String hql1 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc11 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql1);
						if (null != kc11) {
							double kyl = kc11.getKeyongl();

							if (mxql1 > 0) {
								if (mxql1 > kyl) {
									cklsum = A.add(cklsum, kyl);
									mxql1 = A.subtract(mxql1, kyl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							kylsum = A.add(kylsum, kyl);
						}

						// 其他项目的该库位总库存-kucunlx:1普通库存,2原材料在线
						double xdbsl = 0d;// 需调拔数量
						double qtxmzl = 0d;
						String hql15 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
						List qtxmkcList = dataset.getListByHql("Atzkucun", hql15);
						if (null != qtxmkcList && qtxmkcList.size() > 0) {
							for (int j = 0; j < qtxmkcList.size(); j++) {
								Atzkucun kc115 = (Atzkucun) qtxmkcList.get(j);
								double qtkyl = kc115.getKeyongl();

								if (mxql1 > 0) {
									if (mxql1 > qtkyl) {
										xdbsl = A.add(xdbsl, qtkyl);
										cklsum = A.add(cklsum, qtkyl);
										mxql1 = A.subtract(mxql1, qtkyl);
									} else {
										xdbsl = A.add(xdbsl, mxql1);
										cklsum = A.add(cklsum, mxql1);
										mxql1 = 0d;
									}
								}
								qtxmzl = A.add(qtxmzl, qtkyl);
							}
						}
						
						// 判断是否有下一级
						String hql_h1 = "from Atzbommx where fubommxid=" + bommx.getId();
						List bommxList1 = dataset.getListByHql("Atzbommx", hql_h1);

						String sfyxj = "2";// 是否有下一级1是，2否
						double qkl = 0d;
						if (mxql1 > 0) {
							if (null != bommxList1 && bommxList1.size() > 0) {
								sfyxj = "1";
							} else {
								if (i == a) {
									mxql = mxql < 0 ? -mxql : mxql;
									cklsum = mxql2;
									qkl = mxql1;
								}
							}
						}

						if ((qkl > 0 && "2".equals(sfyxj)) || xdbsl > 0) {
							// 维护BOM分析结果
							Atzbomfxjg bomfxjg = new Atzbomfxjg();
							bomfxjg.setFuid(fubomfxjgid);
							bomfxjg.setBommxid(bommx.getId());
							bomfxjg.setScjhid(scjhid);
							bomfxjg.setScjhmxid(scjhmxid);
							bomfxjg.setXiangmuid(xmid);
							Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
							bomfxjg.setXmbh(xm.getXiangmubh());
							bomfxjg.setKuweiid(kw.getId());
							bomfxjg.setKwbh(kw.getKuweibh());
							bomfxjg.setWuliaoid(bommx.getWuliaoid());
							bomfxjg.setWuliaoidRef(wl);
							bomfxjg.setWlbm(wl.getWuliaobm());
							bomfxjg.setWlms(wl.getWuliaoms());
							bomfxjg.setMaoxuql(mxql2);
							bomfxjg.setZxsl(zxlsum);
							bomfxjg.setKucunl(kylsum);
							bomfxjg.setQtxmzl(qtxmzl);
							bomfxjg.setQuekoul(qkl);
							bomfxjg.setChukul(cklsum);
							bomfxjg.setWeidbsl(xdbsl);
							bomfxjg.setShifouzdc(sfyxj);
							list11.add(bomfxjg);
						}

						if (i == a && mxql1 > 0) {
							digui4(scjhid, scjhmxid, xmid, mxql1, mdwsl, bomid, bommx.getId(), 0l, list11, dataset);
						}
					}
				}
			}
		}
	}
} catch (Exception e) {
	return "ERROR";
}
return "OK";
	}
//-----BOM5
	public  String digui5(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) {
		try {
	String hql_h = "from Atzbommx where atzbomid=" + bomid + " and fubommxid=" + fubommxid;
	List bommxList = dataset.getListByHql("Atzbommx", hql_h);
	if (null != bommxList && bommxList.size() > 0) {
		if (fubommxid == 0l && bommxList.size() < 1) {
			return "NO";//请完成BOM信息
		}

		for (int h = 0; h < bommxList.size(); h++) {
			Atzbommx bommx = (Atzbommx) bommxList.get(h);
			Double bomsl = bommx.getShuliang();
			if (null == bomsl || "".equals(bomsl)) {
				bomsl = -1d;
			}
			double mxql1 = 0d;//毛需求量
			double mxql = A.mul(bomsl, count);
			if (mxql > 0) {
				mxql1 = mxql;
			} else if (mxql < 0) {
				mxql1 = -mxql;
				if (mdwsl != 0d)
					mxql1 = A.mul(mxql1, mdwsl);
			}

			Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + bommx.getWuliaoid());
			String wlxz = wl.getWuliaoxz();
			String kwCondition = "";
			if (null != wlxz || !"".equals(wlxz)) {
				if ("0".equals(wlxz))
					kwCondition = " kuweiwlzt in ('1','4') and shifougz='2' order by id desc";
				else if ("1".equals(wlxz))
					kwCondition = " kuweiwlzt in ('2','4') and shifougz in ('2','4') order by shifougz desc,id desc";
			}

			List kwList = dataset.getListByHql("Atzkuwei", "from Atzkuwei where" + kwCondition);
			if (null != kwList && kwList.size() > 0) {
				int a = kwList.size();
				a = a - 1;

				List yqwqdybList = dataset.getListByHql("Atzyouqianwqdyb", "from Atzyouqianwqdyb where wuqianwlid=" + bommx.getWuliaoid());
				for (int i = 0; i < kwList.size(); i++) {
					Atzkuwei kw = (Atzkuwei) kwList.get(i);
					Long kwid = kw.getId();

					if (mxql1 > 0 && yqwqdybList != null && yqwqdybList.size() > 0) {
						for (int k = 0; k < yqwqdybList.size(); k++) {
							Atzyouqianwqdyb yqwqdyb = (Atzyouqianwqdyb) yqwqdybList.get(k);
							long yqwlid = yqwqdyb.getYouqianwlid();
							if (mxql1 > 0) {
								double cklsum0 = 0d;
								double mxql20 = mxql1;

								double zxlsum0 = 0d;
								String hql50 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc50 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql50);
								if (null != kc50) {
									double zxl = kc50.getKeyongl();
									if (mxql1 > 0) {
										if (mxql1 > zxl) {
											mxql1 = A.subtract(mxql1, zxl);
											cklsum0 = A.add(cklsum0, zxl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									zxlsum0 = A.add(zxlsum0, zxl);
								}
								double kylsum0 = 0d;
								String hql10 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
								Atzkucun kc110 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql10);
								if (null != kc110) {
									double kyl = kc110.getKeyongl();
									if (mxql1 > 0) {
										if (mxql1 > kyl) {
											cklsum0 = A.add(cklsum0, kyl);
											mxql1 = A.subtract(mxql1, kyl);
										} else {
											cklsum0 = A.add(cklsum0, mxql1);
											mxql1 = 0d;
										}
									}
									kylsum0 = A.add(kylsum0, kyl);
								}
								double xdbsl0 = 0d;
								double qtxmzl0 = 0d;
								String hql150 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
										+ yqwlid + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
								List qtxmkcList0 = dataset.getListByHql("Atzkucun", hql150);
								if (null != qtxmkcList0 && qtxmkcList0.size() > 0) {
									for (int j = 0; j < qtxmkcList0.size(); j++) {
										Atzkucun kc115 = (Atzkucun) qtxmkcList0.get(j);
										double qtkyl = kc115.getKeyongl();
										if (mxql1 > 0) {
											if (mxql1 > qtkyl) {
												xdbsl0 = A.add(xdbsl0, qtkyl);
												cklsum0 = A.add(cklsum0, qtkyl);
												mxql1 = A.subtract(mxql1, qtkyl);
											} else {
												xdbsl0 = A.add(xdbsl0, mxql1);
												cklsum0 = A.add(cklsum0, mxql1);
												mxql1 = 0d;
											}
										}
										qtxmzl0 = A.add(qtxmzl0, qtkyl);
									}
								}
								String hql_h10 = "from Atzbommx where fubommxid=" + bommx.getId();
								List bommxList10 = dataset.getListByHql("Atzbommx", hql_h10);

								String sfyxj0 = "2";
								if (mxql1 > 0) {
									if (null != bommxList10 && bommxList10.size() > 0) {
										sfyxj0 = "1";
									}
								}

								if (xdbsl0 > 0) {
									Atzbomfxjg bomfxjg = new Atzbomfxjg();
									bomfxjg.setFuid(fubomfxjgid);
									bomfxjg.setBommxid(bommx.getId());
									bomfxjg.setScjhid(scjhid);
									bomfxjg.setScjhmxid(scjhmxid);
									bomfxjg.setXiangmuid(xmid);
									Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
									bomfxjg.setXmbh(xm.getXiangmubh());
									bomfxjg.setKuweiid(kw.getId());
									bomfxjg.setKwbh(kw.getKuweibh());
									Atzwuliaojcxx wl0 = (Atzwuliaojcxx) dataset.getObjectByHql("Atzwuliaojcxx", " from Atzwuliaojcxx where id=" + yqwlid);
									bomfxjg.setWuliaoid(yqwlid);
									bomfxjg.setWuliaoidRef(wl0);
									bomfxjg.setWlbm(wl0.getWuliaobm());
									bomfxjg.setWlms(wl0.getWuliaoms());
									bomfxjg.setMaoxuql(mxql20);
									bomfxjg.setZxsl(zxlsum0);
									bomfxjg.setKucunl(kylsum0);
									bomfxjg.setQtxmzl(qtxmzl0);
									bomfxjg.setQuekoul(0d);
									bomfxjg.setChukul(cklsum0);
									bomfxjg.setWeidbsl(xdbsl0);
									bomfxjg.setShifouzdc(sfyxj0);
									bomfxjg.setBeitdwqwl(wl.getWuliaobm());
									list11.add(bomfxjg);
								}
							}
						}
					}

					if (mxql1 > 0) {
						double cklsum = 0d;
						double mxql2 = mxql1;
						double zxlsum = 0d;
						String hql5 = "from Atzkucun where kucunlx='2' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc5 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql5);
						if (null != kc5) {
							double zxl = kc5.getKeyongl();
							if (mxql1 > 0) {
								if (mxql1 > zxl) {
									mxql1 = A.subtract(mxql1, zxl);
									cklsum = A.add(cklsum, zxl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							zxlsum = A.add(zxlsum, zxl);
						}

						double kylsum = 0d;
						String hql1 = "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid=" + xmid + " and kuweiid=" + kwid;
						Atzkucun kc11 = (Atzkucun) dataset.getObjectByHql("Atzkucun", hql1);
						if (null != kc11) {
							double kyl = kc11.getKeyongl();
							if (mxql1 > 0) {
								if (mxql1 > kyl) {
									cklsum = A.add(cklsum, kyl);
									mxql1 = A.subtract(mxql1, kyl);
								} else {
									cklsum = A.add(cklsum, mxql1);
									mxql1 = 0d;
								}
							}
							kylsum = A.add(kylsum, kyl);
						}

						double xdbsl = 0d;
						double qtxmzl = 0d;
						String hql15 = "from Atzkucun where kucunlx in ('2','1') and keyongl>0 and wuliaoid="
								+ bommx.getWuliaoid() + " and xiangmuid!=" + xmid + " and kuweiid=" + kwid;
						List qtxmkcList = dataset.getListByHql("Atzkucun", hql15);
						if (null != qtxmkcList && qtxmkcList.size() > 0) {
							for (int j = 0; j < qtxmkcList.size(); j++) {
								Atzkucun kc115 = (Atzkucun) qtxmkcList.get(j);
								double qtkyl = kc115.getKeyongl();
								if (mxql1 > 0) {
									if (mxql1 > qtkyl) {
										xdbsl = A.add(xdbsl, qtkyl);
										cklsum = A.add(cklsum, qtkyl);
										mxql1 = A.subtract(mxql1, qtkyl);
									} else {
										xdbsl = A.add(xdbsl, mxql1);
										cklsum = A.add(cklsum, mxql1);
										mxql1 = 0d;
									}
								}
								qtxmzl = A.add(qtxmzl, qtkyl);
							}
						}

						String hql_h1 = "from Atzbommx where fubommxid=" + bommx.getId();
						List bommxList1 = dataset.getListByHql("Atzbommx", hql_h1);

						String sfyxj = "2";
						double qkl = 0d;
						if (mxql1 > 0) {
							if (i == a) {
								mxql = mxql < 0 ? -mxql : mxql;
								cklsum = mxql2;
								qkl = mxql1;
							}
						}

						if ((qkl > 0 && "2".equals(sfyxj)) || xdbsl > 0) {
							Atzbomfxjg bomfxjg = new Atzbomfxjg();
							bomfxjg.setFuid(fubomfxjgid);
							bomfxjg.setBommxid(bommx.getId());
							bomfxjg.setScjhid(scjhid);
							bomfxjg.setScjhmxid(scjhmxid);
							bomfxjg.setXiangmuid(xmid);
							Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
							bomfxjg.setXmbh(xm.getXiangmubh());
							bomfxjg.setKuweiid(kw.getId());
							bomfxjg.setKwbh(kw.getKuweibh());
							bomfxjg.setWuliaoid(bommx.getWuliaoid());
							bomfxjg.setWuliaoidRef(wl);
							bomfxjg.setWlbm(wl.getWuliaobm());
							bomfxjg.setWlms(wl.getWuliaoms());
							bomfxjg.setMaoxuql(mxql2);
							bomfxjg.setZxsl(zxlsum);
							bomfxjg.setKucunl(kylsum);
							bomfxjg.setQtxmzl(qtxmzl);
							bomfxjg.setQuekoul(qkl);
							bomfxjg.setChukul(cklsum);
							bomfxjg.setWeidbsl(xdbsl);
							bomfxjg.setShifouzdc(sfyxj);
							list11.add(bomfxjg);
						}
					}
				}
			}
		}
	}
} catch (Exception e) {
	return "ERROR";
}
return "OK";
	}
//-----ClobToString
	public static String clobToString(Object clob) throws Exception {
		if(clob==null)
			return "";
		Class clazz = clob.getClass();
		Reader reader = (Reader) clazz.getMethod("getCharacterStream").invoke(
				clob);
		BufferedReader r = new BufferedReader(reader);
		StringWriter sw=new StringWriter();
		int cc = -1;
		while ((cc = r.read()) != -1) {
			sw.append((char)cc);
		}
		sw.close();
		r.close();
		reader.close();
		return sw.toString();
	}
//-----BOM6
	public  String digui6(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset) {
		//参数说明：scjhid,scjhmxid,xmid,count生产数量,mdwsl每单位数量,bomid, fubommxid,fubomfxjgid,list11,dataset
//public  String digui4(long scjhid,long scjhmxid,long xmid,double count,double mdwsl,long bomid,long fubommxid,long fubomfxjgid,List list11,IDataSet dataset)
logger.info("~~~anxh-digui6-08~~in~");

try{
   String hql_h="from Atzbommx where atzbomid="+bomid+" and fubommxid="+fubommxid;
   List bommxList = dataset.getListByHql("Atzbommx",hql_h);
   if(null!=bommxList && bommxList.size()>0){
     logger.info("~~~anxh-digui6-08~~~bommxList.size="+bommxList.size());
     
     if(fubommxid==0l &&bommxList.size()<1){
  	 		return "NO";//请完成BOM信息
     }
  	
     for(int h=0;h<bommxList.size();h++){
      	logger.info("~~~anxh-digui6-08~h="+h);
 			  
  			Atzbommx bommx = (Atzbommx)bommxList.get(h);
  			Double bomsl=bommx.getShuliang();
  			if(null==bomsl || "".equals(bomsl)){
  			  bomsl=-1d;
  			}
  			logger.info("~~~anxh-digui6-08~h="+h+"~bomsl="+bomsl);
  			
  			//毛需求量
  			double mxql1=0d;//所需剩余量
  			double mxql=bomsl*count;
  			logger.info("~~~anxh-digui6-08~h="+h+"~mdwsl="+mdwsl+"~mxql="+mxql);
  			if(mxql>0){
  				mxql1=mxql;
  			}else if(mxql<0){
  				mxql1=-mxql;
  				if(mdwsl!=0d)
  					mxql1=mxql1*mdwsl;
  			}
  			logger.info("~~~anxh-digui6-08~h="+h+"~mxql1="+mxql1);
  			
  			///物料-wuliaoxz:0采购，1生产;库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):2可用，4待测
    		Atzwuliaojcxx wl=(Atzwuliaojcxx)dataset.getObjectByHql("Atzwuliaojcxx"," from Atzwuliaojcxx where id="+bommx.getWuliaoid());
  			String wlxz=wl.getWuliaoxz();
  			logger.info("~~~anxh-digui6-08~h="+h+"~0采购，1生产~wlxz="+wlxz);
  			
  			//库位条件-kuweiwlzt:1原，2半，3成品，4备件；shifougz(是否可用状态):2可用，4待测
  			String kwCondition="";  			
  			if(null!=wlxz || !"".equals(wlxz)){
  				if("0".equals(wlxz))
  					kwCondition=" shifougz='2' and kuweiwlzt='1' order by id desc";//id=35样品，1原材料
  				else if("1".equals(wlxz))
  					kwCondition=" shifougz in('2','4') and kuweiwlzt='2'";//id=2半成品-待测,7半成品-可用
  			}//if null!=wlxz end
  			logger.info("~~~anxh-digui6-08~h="+h+"~id=35样品，1原材料~id=2半成品-待测,7半成品-可用~kwCondition="+kwCondition);
  			
  			long bomfxjgid=0l;
  			List kwList=dataset.getListByHql("Atzkuwei","from Atzkuwei where"+kwCondition);
  			if(null!=kwList && kwList.size()>0){
  				logger.info("~~~anxh-digui6-08~h="+h+"~kwList.size="+kwList.size());
  				int a=kwList.size();//判断是否还有库存
  				a=a-1;
  				for(int i=0;i<kwList.size();i++){
  					logger.info("~~~anxh-digui6-08~h="+h+"~i="+i);
  					
  					double cklsum=0d;	//出库量
  					
  					double mxql2=mxql1;
  					Atzkuwei kw=(Atzkuwei)kwList.get(i);
  					Long kwid=kw.getId();
  					logger.info("~~~anxh-digui6-08~h="+h+"~i="+i+"~mxql2="+mxql2+"~kwid="+kwid);
  					
						//测试在线-kucunlx:1普通库存,5测试在线	
						double zxlsum=0d;
  					String hql5= "from Atzkucun where kucunlx='5' and keyongl>0 and wuliaoid="+bommx.getWuliaoid()+" and xiangmuid="+xmid+" and kuweiid="+kwid;
  					Atzkucun kc5=(Atzkucun)dataset.getObjectByHql("Atzkucun",hql5);
  					if(null!=kc5){
  						logger.info("~~~anxh-digui6-08~5~在线库存kc5!=null~h="+h+"~i="+i);
  						double zxl=kc5.getKeyongl();
  						
  						logger.info("~~~anxh-digui6-08~5~zxl="+zxl+"~mxql1="+mxql1+"~h="+h+"~i="+i);
  						if(mxql1>0){
								double kcl=0d;//剩余库存量
								logger.info("~~~anxh-digui6-08~5~zxlsum="+zxlsum+"~mxql1="+mxql1+"~zxl="+zxl+"~h="+h+"~i="+i);
								if(mxql1>zxl){
									mxql1=mxql1-zxl;
									cklsum=cklsum+zxl;
								}else{
									kcl=zxl-mxql1;
									mxql1=0d;
									cklsum=cklsum+mxql1;
								}
								logger.info("~~~anxh-digui6-08~5~mxql1="+mxql1+"~cklsum="+cklsum+"~kcl="+kcl+"~h="+h+"~i="+i);
								//kcl=kcl<0?0d:kcl;
								//kc5.setKeyongl(kcl);
								//dataset.update(kc5);
							}//if mxql10 end
							zxlsum=zxlsum+zxl;	
          	}//if kc5!=null end
          	logger.info("~~~anxh-digui6-08~5~在线库存end~h="+h+"~i="+i+"~zxlsum="+zxlsum);

						//普通库存
						double kylsum=0d;
  					String hql1= "from Atzkucun where kucunlx='1' and keyongl>0 and wuliaoid="+bommx.getWuliaoid()+" and xiangmuid="+xmid+" and kuweiid="+kwid;
  					Atzkucun kc11=(Atzkucun)dataset.getObjectByHql("Atzkucun",hql1);
  					if(null!=kc11){
  						logger.info("~~~anxh-digui6-08~1~普通库存kc11!=null~h="+h+"~i="+i);
  						double kyl=kc11.getKeyongl();
  						
  						logger.info("~~~anxh-digui6-08~1~kyl="+kyl+"~mxql1="+mxql1+"~h="+h+"~i="+i);
  						if(mxql1>0){
								double kcl=0d;
								logger.info("~~~anxh-digui6-08~1~mxql1="+mxql1+"~cklsum="+cklsum+"~kyl="+kyl+"~h="+h+"~i="+i);
								if(mxql1>kyl){
									cklsum=cklsum+kyl;
									mxql1=mxql1-kyl;
								}else{
									kcl=kyl-mxql1;
									cklsum=cklsum+mxql1;
									mxql1=0d;
								}
								logger.info("~~~anxh-digui6-08~1~mxql1="+mxql1+"~cklsum="+cklsum+"~kcl="+kcl+"~h="+h+"~i="+i);
								//kcl=kcl<0?0d:kcl;
								//kc11.setKeyongl(kcl);
								//dataset.update(kc11);
							}//if mxql1>0 end
							kylsum=kylsum+kyl;	
          	}//if kc11!=null end
          	logger.info("~~~anxh-digui6-08~1~普通库存end~h="+h+"~i="+i+"~kylsum="+kylsum);
          	
          	//其他项目的该库位总库存
          	double xdbsl=0d;//需调拔数量
		 				double qtxmzl=0d;
  					String hql15= "from Atzkucun where kucunlx in ('1','5') and keyongl>0 and wuliaoid="+bommx.getWuliaoid()+" and xiangmuid!="+xmid+" and kuweiid="+kwid;
  					List qtxmkcList=dataset.getListByHql("Atzkucun",hql15);
  					if(null!=qtxmkcList && qtxmkcList.size()>0){
  						logger.info("~~~anxh-digui6-08~1~h="+h+"~i="+i+"~其他项目的该库位总库存qtxmkcList.size="+qtxmkcList.size());
  						for(int j=0;j<qtxmkcList.size();j++){
	  						Atzkucun kc115=(Atzkucun)qtxmkcList.get(j);
	  						double qtkyl=kc115.getKeyongl();
	  						
	  						logger.info("~~~anxh-digui6-08~15~h="+h+"~i="+i+"~j="+j+"~qtkyl="+qtkyl+"~mxql1="+mxql1);
	  						if(mxql1>0){
									double kcl=0d;
									logger.info("~~~anxh-digui6-08~15~h="+h+"~i="+i+"~j="+j+"~mxql1="+mxql1+"~qtkyl="
									+qtkyl+"~xdbsl="+xdbsl+"~cklsum="+cklsum);
									if(mxql1>qtkyl){
										xdbsl=xdbsl+qtkyl;
										cklsum=cklsum+qtkyl;
										mxql1=mxql1-qtkyl;
									}else{
										kcl=qtkyl-mxql1;
										xdbsl=xdbsl+mxql1;
										cklsum=cklsum+mxql1;
										mxql1=0d;
									}
									//kcl=kcl<0?0d:kcl;
									//kc115.setKeyongl(kcl);
									//dataset.update(kc115);
								}//if qtxmkcList!=null end
								qtxmzl=qtxmzl+qtkyl;
								logger.info("~~~anxh-digui6-08~15~h="+h+"~i="+i+"~j="+j+"~mxql1="+mxql1+"~qtxmzl="
								+qtxmzl+"~xdbsl="+xdbsl+"~cklsum="+cklsum);
							}//for j end	
          	}//if kc11!=null end
          	logger.info("~~~anxh-digui6-08~15~其他项目的该库位总库存end~h="+h+"~i="+i+"~qtxmzl="+qtxmzl+"~xdbsl="+xdbsl);
  					
  					//判断是否有下一级
						String hql_h1="from Atzbommx where fubommxid="+bommx.getId();
						List bommxList1=dataset.getListByHql("Atzbommx",hql_h1);
						
						String sfyxj="2";//是否有下一级1是，2否
						double qkl=0d;
						if(mxql1>0){
							logger.info("~~~anxh-digui6-08~1~普通库存end~h="+h+"~i="+i+"~mxql="+mxql);
							if(null!=bommxList1 && bommxList1.size()>0){
								logger.info("~~~anxh-digui6-08~h="+h+"~i="+i+"~sfyxj=1有下级~");
								sfyxj="1";
							}else{
								logger.info("~~~anxh-digui6-08~h="+h+"~i="+i+"~a="+a+"~sfyxj=2无下级~");
								if(i==a){
									mxql=mxql<0?-mxql:mxql;
									cklsum=mxql;
									qkl=mxql1;
								}//if i==a
							}
						}//if mxql1>0 end	   			
		   			logger.info("~~~anxh-digui6-08~h="+h+"~i="+i+"~a="+a+"~qkl="+qkl+"~sfyxj="+sfyxj+"~xdbsl="+xdbsl
		   			+"~mxql1="+mxql1+"~zxlsum="+zxlsum+"~kylsum="+kylsum+"~qtxmzl="+qtxmzl+"~cklsum="+cklsum);
		   			
		        if( (qkl>0 && "2".equals(sfyxj)) || (i==a && mxql1>0) || xdbsl>0 || cklsum>0){
							//维护BOM分析结果 
							Atzbomfxjg bomfxjg = new Atzbomfxjg(); 	
							bomfxjg.setFuid(fubomfxjgid);
							bomfxjg.setBommxid(bommx.getId());
							
							bomfxjg.setScjhid(scjhid);
							bomfxjg.setScjhmxid(scjhmxid);
							
							bomfxjg.setXiangmuid(xmid);
							Atzxiangmu xm=(Atzxiangmu)dataset.getObject("Atzxiangmu",xmid);
							bomfxjg.setXmbh(xm.getXiangmubh());
							
							bomfxjg.setKuweiid(kw.getId());
							bomfxjg.setKwbh(kw.getKuweibh());
							
							bomfxjg.setWuliaoid(bommx.getWuliaoid());
							bomfxjg.setWuliaoidRef(wl);
							bomfxjg.setWlbm(wl.getWuliaobm());
							bomfxjg.setWlms(wl.getWuliaoms());
							  			
							bomfxjg.setMaoxuql(mxql2);
							bomfxjg.setZxsl(zxlsum);
							bomfxjg.setKucunl(kylsum);
							bomfxjg.setQtxmzl(qtxmzl);        
							bomfxjg.setQuekoul(qkl); 
							bomfxjg.setChukul(cklsum);
							bomfxjg.setWeidbsl(xdbsl);
							
							bomfxjg.setShifouzdc(sfyxj);
							list11.add(bomfxjg);
							//dataset.add(bomfxjg);
							logger.info("~~~anxh-digui6-08~~bomfxjg add end~h="+h);
							
							/*
							if(i==a)
								bomfxjgid=bomfxjg.getId();
							*/
						}//if
						
						if(i==a && mxql1>0){
							digui6(scjhid,scjhmxid,xmid,mxql1,mdwsl,bomid,bommx.getId(),0l,list11,dataset);
							//digui6(scjhid,scjhmxid,xmid,mxql1,mdwsl,bomid,bommx.getId(),bomfxjgid,list11,dataset);
						}
						logger.info("~~~anxh-digui6-08~h="+h+"~i="+i+"~end~");	
					}//for i end
				}//if null!=kwList
				logger.info("~~~anxh-digui6-08~h="+h+"~end~");
     }//for h end
   }
  
}catch(Exception e){
  logger.info("~~~anxh-digui6-08~~end~e="+e);
  return "ERROR";
}

logger.info("~~~anxh-digui6-08~~end~");
return "OK";
	}
//-----版本发布克隆
	public boolean diguibl(Long yuanfubommxid,Long xinfubommxid,int cengci,String lujing,IDataSet dataset,String employeeName) {
		List banbenfbs=null;
		try{
			banbenfbs= dataset.getListByHql("Atzbanbenfb","from Atzbanbenfb where fubanbenfbid="+yuanfubommxid);
            if(banbenfbs!=null){
		    for(int i=0;i<banbenfbs.size();i++){
		      Atzbanbenfb temp=new Atzbanbenfb();
		      Atzbanbenfb bommx=(Atzbanbenfb)banbenfbs.get(i);
		      copyBeanToBean(bommx,temp);
		      temp.setFubanbenfbid(xinfubommxid);
		      temp.setCengci(cengci+1);
		     // temp.setFubommxid(xinfubommxid);
			  temp.setLurur(employeeName);
			  temp.setLururq(new Date());
			  temp.setZuihouxgr(employeeName);
			  temp.setZuihouxgrq(new Date());
		      dataset.add(temp);
		      temp.setLujing(lujing+"."+(temp.getId()));
                                      dataset.update(temp);
		      diguibl(bommx.getId(),temp.getId(),temp.getCengci(),temp.getLujing(),dataset,employeeName);
		    }
		    }
		  }catch(Exception e){
		  	logger.debug("BOM递归算法出现错误");
		    	}
		  return true;
	}
//-----BOM7
	public String digui7(long scrwid, long scrwmxid, long xmid, double count, double mdwsl, long bomid, long fubommxid, IDataSet dataset) {
		/**
 * 根据BOMID和父级BOM明细ID找到对应的所有下级BOM明细，循环逐个处理
 * --计算所产生数量
 * --如果还有下一级，则继续递归，否则维护BOM分析结果
 */
try {
	String hql_h = "from Atzbommx where atzbomid=" + bomid + " and fubommxid=" + fubommxid;
	List bommxList = dataset.getListByHql("Atzbommx", hql_h);//根据BOMID和父级BOM明细ID找到对应的所有下级BOM明细
	if (null != bommxList && bommxList.size() > 0) {
		if (fubommxid == 0l && bommxList.size() < 1) {//如果BOM表中没有该BOM明细信息则返回错误
			return "NO";
		}

		for (int h = 0; h < bommxList.size(); h++) {
			Atzbommx bommx = (Atzbommx) bommxList.get(h);
			//计算所产生数量
			Double sl = (new BigDecimal(bommx.getShuliang()).multiply(new BigDecimal(count))).doubleValue();
			if(sl < 0) {
				sl = -sl;
				if(mdwsl != 0d) {
					sl = (new BigDecimal(mdwsl).multiply(new BigDecimal(sl))).doubleValue();
				}
			}
			// 如果还有下一级，则继续递归，否则维护BOM分析结果
			List bommxList1 = dataset.getListByHql("Atzbommx", "from Atzbommx where fubommxid=" + bommx.getId());
			if (null != bommxList1 && bommxList1.size() > 0) {
				 digui7(scrwid, scrwmxid, xmid, sl, mdwsl, bomid, bommx.getId(), dataset);
			} else {
				Atzbomfxjg bomfxjg = new Atzbomfxjg();
				bomfxjg.setBommxid(bommx.getId());
				bomfxjg.setScrwid(scrwid);
				bomfxjg.setScrwmxid(scrwmxid);
				bomfxjg.setXiangmuid(xmid);
				Atzxiangmu xm = (Atzxiangmu) dataset.getObject("Atzxiangmu", xmid);
				bomfxjg.setXmbh(xm.getXiangmubh());
				bomfxjg.setKuweiid(1516l);
				Atzkuwei kw = (Atzkuwei)dataset.getObject("Atzkuwei", 1516l);
				bomfxjg.setKwbh(kw.getKuweibh());
				bomfxjg.setWuliaoid(bommx.getWuliaoid());
				Atzwuliaojcxx wl = (Atzwuliaojcxx) dataset.getObject("Atzwuliaojcxx", bommx.getWuliaoid());
				bomfxjg.setWlbm(wl.getWuliaobm());
				bomfxjg.setWlms(wl.getWuliaoms());
				bomfxjg.setMaoxuql(sl);
				dataset.add(bomfxjg);
			}
		}
	} else {
		return "NO";
	}
} catch (Exception e) {
	logger.error(e.getMessage());
	return "ERROR";
}
return "OK";
	}
//-----数值型加
	public  static Double add(Double a,Double b) {
		BigDecimal b1 = new BigDecimal(Double.toString(a));
BigDecimal b2 = new BigDecimal(Double.toString(b));
return b1.add(b2).doubleValue();
	}
//-----数值型减
	public  static Double subtract(Double a,Double b) {
		Double result= new BigDecimal(Double.toString(a)).subtract(new BigDecimal(Double.toString(b))).doubleValue();
return result;
	}
//-----精确的除法运算
	public static double div(double v1, double v2, int scale) {
		/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
if (scale < 0) {
			throw new IllegalArgumentException(
					"The scale must be a positive integer or zero");
		}

		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
//-----数值型乘
	public static Double mul(Double a,Double b) {
		BigDecimal b1 = new BigDecimal(Double.toString(a));
BigDecimal b2 = new BigDecimal(Double.toString(b));
return b1.multiply(b2).doubleValue();
	}
//-----维护创建信息
	public void setCreateInfo(Object obj, HttpServletRequest request) throws Exception {
		Long teamEmployeeId = (Long) request.getSession().getAttribute("teamEmployeeId"); // 创建人ID

String empname = null;

Long yuangongid=null;
if (teamEmployeeId != null) {
	Atztdyg teamemp = (Atztdyg) dataset.getObject(Atztdyg.class, teamEmployeeId);
	if (teamemp != null) {
		empname = teamemp.getYuangongmc(); // 创建人名称
		yuangongid=teamemp.getYuangongid();
	}
}

Date time = new Date(); // 创建时间

try {
	Class cls = obj.getClass();
	Method creator = cls.getMethod("setLururid", new Class[]{Long.class});
	Method screator = cls.getMethod("setLurur", new Class[]{String.class});
	Method createdtime = cls.getMethod("setLururq", new Class[]{Date.class});
			
	creator.invoke(obj, new Object[]{yuangongid});
	screator.invoke(obj, new Object[]{empname});
	createdtime.invoke(obj, new Object[]{time});
} catch (Exception e) {
	e.printStackTrace();
}
	}
//-----维护修改信息
	public void setModifyInfo(Object obj, HttpServletRequest request) throws Exception {
		Long teamEmployeeId = (Long) request.getSession().getAttribute("teamEmployeeId"); // 修改人ID

String empname = null;

Long yuangongid=null;
if (teamEmployeeId != null) {
	Atztdyg teamemp = (Atztdyg) dataset.getObject(Atztdyg.class, teamEmployeeId);
	if (teamemp != null) {
		empname = teamemp.getYuangongmc(); // 修改人名称
		yuangongid = teamemp.getYuangongid(); // 修改人名称
	}
}

Date time = new Date(); // 修改时间

try 
{
	Class cls = obj.getClass();
	Method modifier  = cls.getMethod("setZuihouxgrid", new Class[]{Long.class});
	Method smodifier = cls.getMethod("setZuihouxgr", new Class[]{String.class});
	Method modifiedtime = cls.getMethod("setZuihouxgrq", new Class[]{Date.class});
			
	modifier.invoke(obj, new Object[]{yuangongid});
	smodifier.invoke(obj, new Object[]{empname});
	modifiedtime.invoke(obj, new Object[]{time});
	
	
} catch (Exception e) {
	e.printStackTrace();
}
	}
//-----把xml字符串话
	public static String getXmlToString(Document document) {
		StringWriter sw = new StringWriter();
		XMLWriter writer = null;
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		try {
		writer = new XMLWriter(format);
		writer.setWriter(sw);
		writer.write(document);
		writer.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
	return sw.toString();
	}
    
}
//@@@@@execute custom rule end@@@@@