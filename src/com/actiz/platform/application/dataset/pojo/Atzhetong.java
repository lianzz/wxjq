package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetong implements Serializable,IPojo
{
   private static final long serialVersionUID = 1L; 
   
	 private Long id;
	 public void setId(Long id)
	 {
			this.id = id;
	 }
   public Long getId()
   {
     	return this.id;
   }
      private Long actizversion;

	 public Long getActizversion()
	 {
		  return actizversion == null ? 0L : actizversion;
	 }

	 public void setActizversion(Long actizversion)
	 {
		  this.actizversion = actizversion;
	 } 
	  	 	 private Long duiyingjh;
	 public void setDuiyingjh(Long duiyingjh)
	 {
		  this.duiyingjh = duiyingjh;
	 }
   public Long getDuiyingjh()
   { 	    
  	        
      return this.duiyingjh;     	
   }
 	 	 private Long bkbht;
	 public void setBkbht(Long bkbht)
	 {
		  this.bkbht = bkbht;
	 }
   public Long getBkbht()
   { 	    
  	        
      return this.bkbht;     	
   }
 	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private String shoukuanqr;
	 public void setShoukuanqr(String shoukuanqr)
	 {
		  this.shoukuanqr = shoukuanqr;
	 }
   public String getShoukuanqr()
   { 	    
  	        
      return this.shoukuanqr;     	
   }
 	 	 private String chanpinlx;
	 public void setChanpinlx(String chanpinlx)
	 {
		  this.chanpinlx = chanpinlx;
	 }
   public String getChanpinlx()
   { 	    
  	        
      return this.chanpinlx;     	
   }
 	 	 private String chanpinyysf;
	 public void setChanpinyysf(String chanpinyysf)
	 {
		  this.chanpinyysf = chanpinyysf;
	 }
   public String getChanpinyysf()
   { 	    
  	        
      return this.chanpinyysf;     	
   }
 	 	 private String chanpinzs;
	 public void setChanpinzs(String chanpinzs)
	 {
		  this.chanpinzs = chanpinzs;
	 }
   public String getChanpinzs()
   { 	    
  	        
      return this.chanpinzs;     	
   }
 	 	 private Long cbzx;
	 public void setCbzx(Long cbzx)
	 {
		  this.cbzx = cbzx;
	 }
   public Long getCbzx()
   { 	    
  	        
      return this.cbzx;     	
   }
 	 	 private Date chuyansj;
	 public void setChuyansj(Date chuyansj)
	 {
		  this.chuyansj = chuyansj;
	 }
   public Date getChuyansj()
   { 	    
  	  	    if( this.chuyansj != null )
	    {
	        return (Date)new ActizDate( this.chuyansj.getTime() );
	    }
	          
      return this.chuyansj;     	
   }
 	 	 private String chuyanzt;
	 public void setChuyanzt(String chuyanzt)
	 {
		  this.chuyanzt = chuyanzt;
	 }
   public String getChuyanzt()
   { 	    
  	        
      return this.chuyanzt;     	
   }
 	 	 private Long daqu;
	 public void setDaqu(Long daqu)
	 {
		  this.daqu = daqu;
	 }
   public Long getDaqu()
   { 	    
  	        
      return this.daqu;     	
   }
 	 	 private String daquyj;
	 public void setDaquyj(String daquyj)
	 {
		  this.daquyj = daquyj;
	 }
   public String getDaquyj()
   { 	    
  	        
      return this.daquyj;     	
   }
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private Date daohuosj;
	 public void setDaohuosj(Date daohuosj)
	 {
		  this.daohuosj = daohuosj;
	 }
   public Date getDaohuosj()
   { 	    
  	  	    if( this.daohuosj != null )
	    {
	        return (Date)new ActizDate( this.daohuosj.getTime() );
	    }
	          
      return this.daohuosj;     	
   }
 	 	 private String daohuozt;
	 public void setDaohuozt(String daohuozt)
	 {
		  this.daohuozt = daohuozt;
	 }
   public String getDaohuozt()
   { 	    
  	        
      return this.daohuozt;     	
   }
 	 	 private String disanfkh;
	 public void setDisanfkh(String disanfkh)
	 {
		  this.disanfkh = disanfkh;
	 }
   public String getDisanfkh()
   { 	    
  	        
      return this.disanfkh;     	
   }
 	 	 private Long duiyingls;
	 public void setDuiyingls(Long duiyingls)
	 {
		  this.duiyingls = duiyingls;
	 }
   public Long getDuiyingls()
   { 	    
  	        
      return this.duiyingls;     	
   }
 	 	 private String lxlx;
	 public void setLxlx(String lxlx)
	 {
		  this.lxlx = lxlx;
	 }
   public String getLxlx()
   { 	    
  	        
      return this.lxlx;     	
   }
 	 	 private String fhzt;
	 public void setFhzt(String fhzt)
	 {
		  this.fhzt = fhzt;
	 }
   public String getFhzt()
   { 	    
  	        
      return this.fhzt;     	
   }
 	 	 private String fplx;
	 public void setFplx(String fplx)
	 {
		  this.fplx = fplx;
	 }
   public String getFplx()
   { 	    
  	        
      return this.fplx;     	
   }
 	 	 private String fktk;
	 public void setFktk(String fktk)
	 {
		  this.fktk = fktk;
	 }
   public String getFktk()
   { 	    
  	        
      return this.fktk;     	
   }
 	 	 private String fukuanzt;
	 public void setFukuanzt(String fukuanzt)
	 {
		  this.fukuanzt = fukuanzt;
	 }
   public String getFukuanzt()
   { 	    
  	        
      return this.fukuanzt;     	
   }
 	 	 private String xiangmujl;
	 public void setXiangmujl(String xiangmujl)
	 {
		  this.xiangmujl = xiangmujl;
	 }
   public String getXiangmujl()
   { 	    
  	        
      return this.xiangmujl;     	
   }
 	 	 private String gcyszt;
	 public void setGcyszt(String gcyszt)
	 {
		  this.gcyszt = gcyszt;
	 }
   public String getGcyszt()
   { 	    
  	        
      return this.gcyszt;     	
   }
 	 	 private String guishugs;
	 public void setGuishugs(String guishugs)
	 {
		  this.guishugs = guishugs;
	 }
   public String getGuishugs()
   { 	    
  	        
      return this.guishugs;     	
   }
 	 	 private String hetongbh;
	 public void setHetongbh(String hetongbh)
	 {
		  this.hetongbh = hetongbh;
	 }
   public String getHetongbh()
   { 	    
  	        
      return this.hetongbh;     	
   }
 	 	 private String hetongfj;
	 public void setHetongfj(String hetongfj)
	 {
		  this.hetongfj = hetongfj;
	 }
   public String getHetongfj()
   { 	    
  	        
      return this.hetongfj;     	
   }
 	 	 private String htfjsmj;
	 public void setHtfjsmj(String htfjsmj)
	 {
		  this.htfjsmj = htfjsmj;
	 }
   public String getHtfjsmj()
   { 	    
  	        
      return this.htfjsmj;     	
   }
 	 	 private Double hetongje;
	 public void setHetongje(Double hetongje)
	 {
		  this.hetongje = hetongje;
	 }
   public Double getHetongje()
   { 	    
  	        
      return this.hetongje;     	
   }
 	 	 private String hetonglx;
	 public void setHetonglx(String hetonglx)
	 {
		  this.hetonglx = hetonglx;
	 }
   public String getHetonglx()
   { 	    
  	        
      return this.hetonglx;     	
   }
 	 	 private String hetongmc;
	 public void setHetongmc(String hetongmc)
	 {
		  this.hetongmc = hetongmc;
	 }
   public String getHetongmc()
   { 	    
  	        
      return this.hetongmc;     	
   }
 	 	 private String hetongnbps;
	 public void setHetongnbps(String hetongnbps)
	 {
		  this.hetongnbps = hetongnbps;
	 }
   public String getHetongnbps()
   { 	    
  	        
      return this.hetongnbps;     	
   }
 	 	 private Double hetongwbje;
	 public void setHetongwbje(Double hetongwbje)
	 {
		  this.hetongwbje = hetongwbje;
	 }
   public Double getHetongwbje()
   { 	    
  	        
      return this.hetongwbje;     	
   }
 	 	 private String hetongxz;
	 public void setHetongxz(String hetongxz)
	 {
		  this.hetongxz = hetongxz;
	 }
   public String getHetongxz()
   { 	    
  	        
      return this.hetongxz;     	
   }
 	 	 private String hetongyy;
	 public void setHetongyy(String hetongyy)
	 {
		  this.hetongyy = hetongyy;
	 }
   public String getHetongyy()
   { 	    
  	        
      return this.hetongyy;     	
   }
 	 	 private String hezuohb;
	 public void setHezuohb(String hezuohb)
	 {
		  this.hezuohb = hezuohb;
	 }
   public String getHezuohb()
   { 	    
  	        
      return this.hezuohb;     	
   }
 	 	 private String jihuifx;
	 public void setJihuifx(String jihuifx)
	 {
		  this.jihuifx = jihuifx;
	 }
   public String getJihuifx()
   { 	    
  	        
      return this.jihuifx;     	
   }
 	 	 private String jgspzt;
	 public void setJgspzt(String jgspzt)
	 {
		  this.jgspzt = jgspzt;
	 }
   public String getJgspzt()
   { 	    
  	        
      return this.jgspzt;     	
   }
 	 	 private String jiesulc;
	 public void setJiesulc(String jiesulc)
	 {
		  this.jiesulc = jiesulc;
	 }
   public String getJiesulc()
   { 	    
  	        
      return this.jiesulc;     	
   }
 	 	 private String kpzt;
	 public void setKpzt(String kpzt)
	 {
		  this.kpzt = kpzt;
	 }
   public String getKpzt()
   { 	    
  	        
      return this.kpzt;     	
   }
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
   }
 	 	 private Long kehujlshr;
	 public void setKehujlshr(Long kehujlshr)
	 {
		  this.kehujlshr = kehujlshr;
	 }
   public Long getKehujlshr()
   { 	    
  	        
      return this.kehujlshr;     	
   }
 	 	 private String kehulxr;
	 public void setKehulxr(String kehulxr)
	 {
		  this.kehulxr = kehulxr;
	 }
   public String getKehulxr()
   { 	    
  	        
      return this.kehulxr;     	
   }
 	 	 private Long kuangjiaht;
	 public void setKuangjiaht(Long kuangjiaht)
	 {
		  this.kuangjiaht = kuangjiaht;
	 }
   public Long getKuangjiaht()
   { 	    
  	        
      return this.kuangjiaht;     	
   }
 	 	 private String lixianglx;
	 public void setLixianglx(String lixianglx)
	 {
		  this.lixianglx = lixianglx;
	 }
   public String getLixianglx()
   { 	    
  	        
      return this.lixianglx;     	
   }
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
   }
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
   }
 	 	 private Date lururq;
	 public void setLururq(Date lururq)
	 {
		  this.lururq = lururq;
	 }
   public Date getLururq()
   { 	    
  	  	    if( this.lururq != null )
	    {
	        return (Date)new ActizDate( this.lururq.getTime() );
	    }
	          
      return this.lururq;     	
   }
 	 	 private String maifanghth;
	 public void setMaifanghth(String maifanghth)
	 {
		  this.maifanghth = maifanghth;
	 }
   public String getMaifanghth()
   { 	    
  	        
      return this.maifanghth;     	
   }
 	 	 private String oahth;
	 public void setOahth(String oahth)
	 {
		  this.oahth = oahth;
	 }
   public String getOahth()
   { 	    
  	        
      return this.oahth;     	
   }
 	 	 private Date oapstgsj;
	 public void setOapstgsj(Date oapstgsj)
	 {
		  this.oapstgsj = oapstgsj;
	 }
   public Date getOapstgsj()
   { 	    
  	  	    if( this.oapstgsj != null )
	    {
	        return (Date)new ActizDate( this.oapstgsj.getTime() );
	    }
	          
      return this.oapstgsj;     	
   }
 	 	 private Integer pingshencs;
	 public void setPingshencs(Integer pingshencs)
	 {
		  this.pingshencs = pingshencs;
	 }
   public Integer getPingshencs()
   { 	    
  	        
      return this.pingshencs;     	
   }
 	 	 private Date pswcsj;
	 public void setPswcsj(Date pswcsj)
	 {
		  this.pswcsj = pswcsj;
	 }
   public Date getPswcsj()
   { 	    
  	  	    if( this.pswcsj != null )
	    {
	        return (Date)new ActizDate( this.pswcsj.getTime() );
	    }
	          
      return this.pswcsj;     	
   }
 	 	 private String htpsxlh;
	 public void setHtpsxlh(String htpsxlh)
	 {
		  this.htpsxlh = htpsxlh;
	 }
   public String getHtpsxlh()
   { 	    
  	        
      return this.htpsxlh;     	
   }
 	 	 private String pingshenzt;
	 public void setPingshenzt(String pingshenzt)
	 {
		  this.pingshenzt = pingshenzt;
	 }
   public String getPingshenzt()
   { 	    
  	        
      return this.pingshenzt;     	
   }
 	 	 private String qiandingdd;
	 public void setQiandingdd(String qiandingdd)
	 {
		  this.qiandingdd = qiandingdd;
	 }
   public String getQiandingdd()
   { 	    
  	        
      return this.qiandingdd;     	
   }
 	 	 private Date qiandingrq;
	 public void setQiandingrq(Date qiandingrq)
	 {
		  this.qiandingrq = qiandingrq;
	 }
   public Date getQiandingrq()
   { 	    
  	  	    if( this.qiandingrq != null )
	    {
	        return (Date)new ActizDate( this.qiandingrq.getTime() );
	    }
	          
      return this.qiandingrq;     	
   }
 	 	 private String shenher;
	 public void setShenher(String shenher)
	 {
		  this.shenher = shenher;
	 }
   public String getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private String sjh;
	 public void setSjh(String sjh)
	 {
		  this.sjh = sjh;
	 }
   public String getSjh()
   { 	    
  	        
      return this.sjh;     	
   }
 	 	 private String shenhefj;
	 public void setShenhefj(String shenhefj)
	 {
		  this.shenhefj = shenhefj;
	 }
   public String getShenhefj()
   { 	    
  	        
      return this.shenhefj;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private Double shijije;
	 public void setShijije(Double shijije)
	 {
		  this.shijije = shijije;
	 }
   public Double getShijije()
   { 	    
  	        
      return this.shijije;     	
   }
 	 	 private String sfbz;
	 public void setSfbz(String sfbz)
	 {
		  this.sfbz = sfbz;
	 }
   public String getSfbz()
   { 	    
  	        
      return this.sfbz;     	
   }
 	 	 private String shifoudl;
	 public void setShifoudl(String shifoudl)
	 {
		  this.shifoudl = shifoudl;
	 }
   public String getShifoudl()
   { 	    
  	        
      return this.shifoudl;     	
   }
 	 	 private String sfgb;
	 public void setSfgb(String sfgb)
	 {
		  this.sfgb = sfgb;
	 }
   public String getSfgb()
   { 	    
  	        
      return this.sfgb;     	
   }
 	 	 private String shifougd;
	 public void setShifougd(String shifougd)
	 {
		  this.shifougd = shifougd;
	 }
   public String getShifougd()
   { 	    
  	        
      return this.shifougd;     	
   }
 	 	 private String shifouls;
	 public void setShifouls(String shifouls)
	 {
		  this.shifouls = shifouls;
	 }
   public String getShifouls()
   { 	    
  	        
      return this.shifouls;     	
   }
 	 	 private String shifousf;
	 public void setShifousf(String shifousf)
	 {
		  this.shifousf = shifousf;
	 }
   public String getShifousf()
   { 	    
  	        
      return this.shifousf;     	
   }
 	 	 private String shifouws;
	 public void setShifouws(String shifouws)
	 {
		  this.shifouws = shifouws;
	 }
   public String getShifouws()
   { 	    
  	        
      return this.shifouws;     	
   }
 	 	 private String shifoujyht;
	 public void setShifoujyht(String shifoujyht)
	 {
		  this.shifoujyht = shifoujyht;
	 }
   public String getShifoujyht()
   { 	    
  	        
      return this.shifoujyht;     	
   }
 	 	 private String shifouxynbps;
	 public void setShifouxynbps(String shifouxynbps)
	 {
		  this.shifouxynbps = shifouxynbps;
	 }
   public String getShifouxynbps()
   { 	    
  	        
      return this.shifouxynbps;     	
   }
 	 	 private String shifouxqwbht;
	 public void setShifouxqwbht(String shifouxqwbht)
	 {
		  this.shifouxqwbht = shifouxqwbht;
	 }
   public String getShifouxqwbht()
   { 	    
  	        
      return this.shifouxqwbht;     	
   }
 	 	 private String sfztb;
	 public void setSfztb(String sfztb)
	 {
		  this.sfztb = sfztb;
	 }
   public String getSfztb()
   { 	    
  	        
      return this.sfztb;     	
   }
 	 	 private String sfzzyh;
	 public void setSfzzyh(String sfzzyh)
	 {
		  this.sfzzyh = sfzzyh;
	 }
   public String getSfzzyh()
   { 	    
  	        
      return this.sfzzyh;     	
   }
 	 	 private String sybzjlyj;
	 public void setSybzjlyj(String sybzjlyj)
	 {
		  this.sybzjlyj = sybzjlyj;
	 }
   public String getSybzjlyj()
   { 	    
  	        
      return this.sybzjlyj;     	
   }
 	 	 private String skzt;
	 public void setSkzt(String skzt)
	 {
		  this.skzt = skzt;
	 }
   public String getSkzt()
   { 	    
  	        
      return this.skzt;     	
   }
 	 	 private String sjlx;
	 public void setSjlx(String sjlx)
	 {
		  this.sjlx = sjlx;
	 }
   public String getSjlx()
   { 	    
  	        
      return this.sjlx;     	
   }
 	 	 private String suoshuhy;
	 public void setSuoshuhy(String suoshuhy)
	 {
		  this.suoshuhy = suoshuhy;
	 }
   public String getSuoshuhy()
   { 	    
  	        
      return this.suoshuhy;     	
   }
 	 	 private Long toubiaodid;
	 public void setToubiaodid(Long toubiaodid)
	 {
		  this.toubiaodid = toubiaodid;
	 }
   public Long getToubiaodid()
   { 	    
  	        
      return this.toubiaodid;     	
   }
 	 	 private Long wubizl;
	 public void setWubizl(Long wubizl)
	 {
		  this.wubizl = wubizl;
	 }
   public Long getWubizl()
   { 	    
  	        
      return this.wubizl;     	
   }
 	 	 private Double weikpje;
	 public void setWeikpje(Double weikpje)
	 {
		  this.weikpje = weikpje;
	 }
   public Double getWeikpje()
   { 	    
  	        
      return this.weikpje;     	
   }
 	 	 private Double wsje;
	 public void setWsje(Double wsje)
	 {
		  this.wsje = wsje;
	 }
   public Double getWsje()
   { 	    
  	        
      return this.wsje;     	
   }
 	 	 private String jibenqk;
	 public void setJibenqk(String jibenqk)
	 {
		  this.jibenqk = jibenqk;
	 }
   public String getJibenqk()
   { 	    
  	        
      return this.jibenqk;     	
   }
 	 	 private String xiangmuzq;
	 public void setXiangmuzq(String xiangmuzq)
	 {
		  this.xiangmuzq = xiangmuzq;
	 }
   public String getXiangmuzq()
   { 	    
  	        
      return this.xiangmuzq;     	
   }
 	 	 private String xsfzyj;
	 public void setXsfzyj(String xsfzyj)
	 {
		  this.xsfzyj = xsfzyj;
	 }
   public String getXsfzyj()
   { 	    
  	        
      return this.xsfzyj;     	
   }
 	 	 private String xiaoshoujh;
	 public void setXiaoshoujh(String xiaoshoujh)
	 {
		  this.xiaoshoujh = xiaoshoujh;
	 }
   public String getXiaoshoujh()
   { 	    
  	        
      return this.xiaoshoujh;     	
   }
 	 	 private Long xiaoshoujl;
	 public void setXiaoshoujl(Long xiaoshoujl)
	 {
		  this.xiaoshoujl = xiaoshoujl;
	 }
   public Long getXiaoshoujl()
   { 	    
  	        
      return this.xiaoshoujl;     	
   }
 	 	 private String xiaoshouqy;
	 public void setXiaoshouqy(String xiaoshouqy)
	 {
		  this.xiaoshouqy = xiaoshouqy;
	 }
   public String getXiaoshouqy()
   { 	    
  	        
      return this.xiaoshouqy;     	
   }
 	 	 private String touruzy;
	 public void setTouruzy(String touruzy)
	 {
		  this.touruzy = touruzy;
	 }
   public String getTouruzy()
   { 	    
  	        
      return this.touruzy;     	
   }
 	 	 private Date yijiaosj;
	 public void setYijiaosj(Date yijiaosj)
	 {
		  this.yijiaosj = yijiaosj;
	 }
   public Date getYijiaosj()
   { 	    
  	  	    if( this.yijiaosj != null )
	    {
	        return (Date)new ActizDate( this.yijiaosj.getTime() );
	    }
	          
      return this.yijiaosj;     	
   }
 	 	 private String yijiaozt;
	 public void setYijiaozt(String yijiaozt)
	 {
		  this.yijiaozt = yijiaozt;
	 }
   public String getYijiaozt()
   { 	    
  	        
      return this.yijiaozt;     	
   }
 	 	 private Double yikpje;
	 public void setYikpje(Double yikpje)
	 {
		  this.yikpje = yikpje;
	 }
   public Double getYikpje()
   { 	    
  	        
      return this.yikpje;     	
   }
 	 	 private Double ysje;
	 public void setYsje(Double ysje)
	 {
		  this.ysje = ysje;
	 }
   public Double getYsje()
   { 	    
  	        
      return this.ysje;     	
   }
 	 	 private String yxsht;
	 public void setYxsht(String yxsht)
	 {
		  this.yxsht = yxsht;
	 }
   public String getYxsht()
   { 	    
  	        
      return this.yxsht;     	
   }
 	 	 private String yunyings;
	 public void setYunyings(String yunyings)
	 {
		  this.yunyings = yunyings;
	 }
   public String getYunyings()
   { 	    
  	        
      return this.yunyings;     	
   }
 	 	 private String zhixingdd;
	 public void setZhixingdd(String zhixingdd)
	 {
		  this.zhixingdd = zhixingdd;
	 }
   public String getZhixingdd()
   { 	    
  	        
      return this.zhixingdd;     	
   }
 	 	 private Date kaishizxrq;
	 public void setKaishizxrq(Date kaishizxrq)
	 {
		  this.kaishizxrq = kaishizxrq;
	 }
   public Date getKaishizxrq()
   { 	    
  	  	    if( this.kaishizxrq != null )
	    {
	        return (Date)new ActizDate( this.kaishizxrq.getTime() );
	    }
	          
      return this.kaishizxrq;     	
   }
 	 	 private Date zhongyansj;
	 public void setZhongyansj(Date zhongyansj)
	 {
		  this.zhongyansj = zhongyansj;
	 }
   public Date getZhongyansj()
   { 	    
  	  	    if( this.zhongyansj != null )
	    {
	        return (Date)new ActizDate( this.zhongyansj.getTime() );
	    }
	          
      return this.zhongyansj;     	
   }
 	 	 private String zhongyanzt;
	 public void setZhongyanzt(String zhongyanzt)
	 {
		  this.zhongyanzt = zhongyanzt;
	 }
   public String getZhongyanzt()
   { 	    
  	        
      return this.zhongyanzt;     	
   }
 	 	 private String zhuxiaoyy;
	 public void setZhuxiaoyy(String zhuxiaoyy)
	 {
		  this.zhuxiaoyy = zhuxiaoyy;
	 }
   public String getZhuxiaoyy()
   { 	    
  	        
      return this.zhuxiaoyy;     	
   }
 	 	 private String zhuxiaozt;
	 public void setZhuxiaozt(String zhuxiaozt)
	 {
		  this.zhuxiaozt = zhuxiaozt;
	 }
   public String getZhuxiaozt()
   { 	    
  	        
      return this.zhuxiaozt;     	
   }
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
   }
 	 	 private String zzfktk;
	 public void setZzfktk(String zzfktk)
	 {
		  this.zzfktk = zzfktk;
	 }
   public String getZzfktk()
   { 	    
  	        
      return this.zzfktk;     	
   }
 	 	 private String zuizhongyh;
	 public void setZuizhongyh(String zuizhongyh)
	 {
		  this.zuizhongyh = zuizhongyh;
	 }
   public String getZuizhongyh()
   { 	    
  	        
      return this.zuizhongyh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh duiyingjhRef;
	 public void setDuiyingjhRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh duiyingjhRef)
	 {
		  this.duiyingjhRef = duiyingjhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getDuiyingjhRef()
   {
     	return this.duiyingjhRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong bkbhtRef;
	 public void setBkbhtRef(com.actiz.platform.application.dataset.pojo.Atzhetong bkbhtRef)
	 {
		  this.bkbhtRef = bkbhtRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getBkbhtRef()
   {
     	return this.bkbhtRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu cbzxRef;
	 public void setCbzxRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu cbzxRef)
	 {
		  this.cbzxRef = cbzxRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getCbzxRef()
   {
     	return this.cbzxRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment daquRef;
	 public void setDaquRef(com.actiz.platform.application.dataset.pojo.Atzdepartment daquRef)
	 {
		  this.daquRef = daquRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getDaquRef()
   {
     	return this.daquRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong duiyinglsRef;
	 public void setDuiyinglsRef(com.actiz.platform.application.dataset.pojo.Atzhetong duiyinglsRef)
	 {
		  this.duiyinglsRef = duiyinglsRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getDuiyinglsRef()
   {
     	return this.duiyinglsRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg kehujlshrRef;
	 public void setKehujlshrRef(com.actiz.platform.application.dataset.pojo.Atztdyg kehujlshrRef)
	 {
		  this.kehujlshrRef = kehujlshrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getKehujlshrRef()
   {
     	return this.kehujlshrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong kuangjiahtRef;
	 public void setKuangjiahtRef(com.actiz.platform.application.dataset.pojo.Atzhetong kuangjiahtRef)
	 {
		  this.kuangjiahtRef = kuangjiahtRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getKuangjiahtRef()
   {
     	return this.kuangjiahtRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaodidRef;
	 public void setToubiaodidRef(com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaodidRef)
	 {
		  this.toubiaodidRef = toubiaodidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztoubiao getToubiaodidRef()
   {
     	return this.toubiaodidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef;
	 public void setWubizlRef(com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef)
	 {
		  this.wubizlRef = wubizlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getWubizlRef()
   {
     	return this.wubizlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef;
	 public void setXiaoshoujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef)
	 {
		  this.xiaoshoujlRef = xiaoshoujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXiaoshoujlRef()
   {
     	return this.xiaoshoujlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atztdyg zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzgenggaixxSet;
	public void setAtzgenggaixxSet(java.util.Set atzgenggaixxSet)
	{
		 this.atzgenggaixxSet = atzgenggaixxSet;
	}
  public java.util.Set getAtzgenggaixxSet()
  {
     return this.atzgenggaixxSet;
  }
 
	private java.util.Set atzhtbglsSet;
	public void setAtzhtbglsSet(java.util.Set atzhtbglsSet)
	{
		 this.atzhtbglsSet = atzhtbglsSet;
	}
  public java.util.Set getAtzhtbglsSet()
  {
     return this.atzhtbglsSet;
  }
 
	private java.util.Set atzhtbcxySet;
	public void setAtzhtbcxySet(java.util.Set atzhtbcxySet)
	{
		 this.atzhtbcxySet = atzhtbcxySet;
	}
  public java.util.Set getAtzhtbcxySet()
  {
     return this.atzhtbcxySet;
  }
 
	private java.util.Set atzshenhejlSet;
	public void setAtzshenhejlSet(java.util.Set atzshenhejlSet)
	{
		 this.atzshenhejlSet = atzshenhejlSet;
	}
  public java.util.Set getAtzshenhejlSet()
  {
     return this.atzshenhejlSet;
  }
  
				private Long actizcompanyid;
		public Long getActizcompanyid() 
		{
			return actizcompanyid;
		}	
		public void setActizcompanyid(Long actizcompanyid) 
		{
			this.actizcompanyid = actizcompanyid;
		}
	 
    private Date lastmodifytime;
	public Date getLastmodifytime()
	{
		return lastmodifytime;
	}
	public void setLastmodifytime(Date lastmodifytime)
	{
		this.lastmodifytime = lastmodifytime;
	} 
}