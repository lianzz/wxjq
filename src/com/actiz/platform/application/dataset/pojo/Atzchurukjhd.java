package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukjhd implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long bmmc;
	 public void setBmmc(Long bmmc)
	 {
		  this.bmmc = bmmc;
	 }
   public Long getBmmc()
   { 	    
  	        
      return this.bmmc;     	
   }
 	 	 private Long caigoujhid;
	 public void setCaigoujhid(Long caigoujhid)
	 {
		  this.caigoujhid = caigoujhid;
	 }
   public Long getCaigoujhid()
   { 	    
  	        
      return this.caigoujhid;     	
   }
 	 	 private String churuknr;
	 public void setChuruknr(String churuknr)
	 {
		  this.churuknr = churuknr;
	 }
   public String getChuruknr()
   { 	    
  	        
      return this.churuknr;     	
   }
 	 	 private String churukyy;
	 public void setChurukyy(String churukyy)
	 {
		  this.churukyy = churukyy;
	 }
   public String getChurukyy()
   { 	    
  	        
      return this.churukyy;     	
   }
 	 	 private String danjulx;
	 public void setDanjulx(String danjulx)
	 {
		  this.danjulx = danjulx;
	 }
   public String getDanjulx()
   { 	    
  	        
      return this.danjulx;     	
   }
 	 	 private String danjusc;
	 public void setDanjusc(String danjusc)
	 {
		  this.danjusc = danjusc;
	 }
   public String getDanjusc()
   { 	    
  	        
      return this.danjusc;     	
   }
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Long fahuotzdid;
	 public void setFahuotzdid(Long fahuotzdid)
	 {
		  this.fahuotzdid = fahuotzdid;
	 }
   public Long getFahuotzdid()
   { 	    
  	        
      return this.fahuotzdid;     	
   }
 	 	 private String glcrkjhdbh;
	 public void setGlcrkjhdbh(String glcrkjhdbh)
	 {
		  this.glcrkjhdbh = glcrkjhdbh;
	 }
   public String getGlcrkjhdbh()
   { 	    
  	        
      return this.glcrkjhdbh;     	
   }
 	 	 private Date guihairq;
	 public void setGuihairq(Date guihairq)
	 {
		  this.guihairq = guihairq;
	 }
   public Date getGuihairq()
   { 	    
  	  	    if( this.guihairq != null )
	    {
	        return (Date)new ActizDate( this.guihairq.getTime() );
	    }
	          
      return this.guihairq;     	
   }
 	 	 private Long hetongtkid;
	 public void setHetongtkid(Long hetongtkid)
	 {
		  this.hetongtkid = hetongtkid;
	 }
   public Long getHetongtkid()
   { 	    
  	        
      return this.hetongtkid;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private String laoxtid;
	 public void setLaoxtid(String laoxtid)
	 {
		  this.laoxtid = laoxtid;
	 }
   public String getLaoxtid()
   { 	    
  	        
      return this.laoxtid;     	
   }
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
   }
 	 	 private String renwuzt;
	 public void setRenwuzt(String renwuzt)
	 {
		  this.renwuzt = renwuzt;
	 }
   public String getRenwuzt()
   { 	    
  	        
      return this.renwuzt;     	
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
 	 	 private Long scjhid;
	 public void setScjhid(Long scjhid)
	 {
		  this.scjhid = scjhid;
	 }
   public Long getScjhid()
   { 	    
  	        
      return this.scjhid;     	
   }
 	 	 private Long scrwdid;
	 public void setScrwdid(Long scrwdid)
	 {
		  this.scrwdid = scrwdid;
	 }
   public Long getScrwdid()
   { 	    
  	        
      return this.scrwdid;     	
   }
 	 	 private Long scrwmxid;
	 public void setScrwmxid(Long scrwmxid)
	 {
		  this.scrwmxid = scrwmxid;
	 }
   public Long getScrwmxid()
   { 	    
  	        
      return this.scrwmxid;     	
   }
 	 	 private String shifoufsh;
	 public void setShifoufsh(String shifoufsh)
	 {
		  this.shifoufsh = shifoufsh;
	 }
   public String getShifoufsh()
   { 	    
  	        
      return this.shifoufsh;     	
   }
 	 	 private String shifouwc;
	 public void setShifouwc(String shifouwc)
	 {
		  this.shifouwc = shifouwc;
	 }
   public String getShifouwc()
   { 	    
  	        
      return this.shifouwc;     	
   }
 	 	 private String sfwh;
	 public void setSfwh(String sfwh)
	 {
		  this.sfwh = sfwh;
	 }
   public String getSfwh()
   { 	    
  	        
      return this.sfwh;     	
   }
 	 	 private String shifouxn;
	 public void setShifouxn(String shifouxn)
	 {
		  this.shifouxn = shifouxn;
	 }
   public String getShifouxn()
   { 	    
  	        
      return this.shifouxn;     	
   }
 	 	 private String sfxyjianyan;
	 public void setSfxyjianyan(String sfxyjianyan)
	 {
		  this.sfxyjianyan = sfxyjianyan;
	 }
   public String getSfxyjianyan()
   { 	    
  	        
      return this.sfxyjianyan;     	
   }
 	 	 private String crkjhtjlx;
	 public void setCrkjhtjlx(String crkjhtjlx)
	 {
		  this.crkjhtjlx = crkjhtjlx;
	 }
   public String getCrkjhtjlx()
   { 	    
  	        
      return this.crkjhtjlx;     	
   }
 	 	 private Long weibaosqdid;
	 public void setWeibaosqdid(Long weibaosqdid)
	 {
		  this.weibaosqdid = weibaosqdid;
	 }
   public Long getWeibaosqdid()
   { 	    
  	        
      return this.weibaosqdid;     	
   }
 	 	 private Long linshiwlsqid;
	 public void setLinshiwlsqid(Long linshiwlsqid)
	 {
		  this.linshiwlsqid = linshiwlsqid;
	 }
   public Long getLinshiwlsqid()
   { 	    
  	        
      return this.linshiwlsqid;     	
   }
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
   }
 	 	 private String zhixingf;
	 public void setZhixingf(String zhixingf)
	 {
		  this.zhixingf = zhixingf;
	 }
   public String getZhixingf()
   { 	    
  	        
      return this.zhixingf;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bmmcRef;
	 public void setBmmcRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bmmcRef)
	 {
		  this.bmmcRef = bmmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBmmcRef()
   {
     	return this.bmmcRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef;
	 public void setCaigoujhidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef)
	 {
		  this.caigoujhidRef = caigoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigoujhidRef()
   {
     	return this.caigoujhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef;
	 public void setFahuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef)
	 {
		  this.fahuotzdidRef = fahuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuotzd getFahuotzdidRef()
   {
     	return this.fahuotzdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetongtk hetongtkidRef;
	 public void setHetongtkidRef(com.actiz.platform.application.dataset.pojo.Atzhetongtk hetongtkidRef)
	 {
		  this.hetongtkidRef = hetongtkidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetongtk getHetongtkidRef()
   {
     	return this.hetongtkidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef;
	 public void setScjhidRef(com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef)
	 {
		  this.scjhidRef = scjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjh getScjhidRef()
   {
     	return this.scjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrw scrwdidRef;
	 public void setScrwdidRef(com.actiz.platform.application.dataset.pojo.Atzscrw scrwdidRef)
	 {
		  this.scrwdidRef = scrwdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getScrwdidRef()
   {
     	return this.scrwdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef;
	 public void setScrwmxidRef(com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef)
	 {
		  this.scrwmxidRef = scrwmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrwmx getScrwmxidRef()
   {
     	return this.scrwmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosqdidRef;
	 public void setWeibaosqdidRef(com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosqdidRef)
	 {
		  this.weibaosqdidRef = weibaosqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd getWeibaosqdidRef()
   {
     	return this.weibaosqdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzlinshiwlsq linshiwlsqidRef;
	 public void setLinshiwlsqidRef(com.actiz.platform.application.dataset.pojo.Atzlinshiwlsq linshiwlsqidRef)
	 {
		  this.linshiwlsqidRef = linshiwlsqidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzlinshiwlsq getLinshiwlsqidRef()
   {
     	return this.linshiwlsqidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
   }
  
	private java.util.Set atzcrkjhdbgjlSet;
	public void setAtzcrkjhdbgjlSet(java.util.Set atzcrkjhdbgjlSet)
	{
		 this.atzcrkjhdbgjlSet = atzcrkjhdbgjlSet;
	}
  public java.util.Set getAtzcrkjhdbgjlSet()
  {
     return this.atzcrkjhdbgjlSet;
  }
 
	private java.util.Set atzchurukjhdmxSet;
	public void setAtzchurukjhdmxSet(java.util.Set atzchurukjhdmxSet)
	{
		 this.atzchurukjhdmxSet = atzchurukjhdmxSet;
	}
  public java.util.Set getAtzchurukjhdmxSet()
  {
     return this.atzchurukjhdmxSet;
  }
 
	private java.util.Set atzchurukjhshjlSet;
	public void setAtzchurukjhshjlSet(java.util.Set atzchurukjhshjlSet)
	{
		 this.atzchurukjhshjlSet = atzchurukjhshjlSet;
	}
  public java.util.Set getAtzchurukjhshjlSet()
  {
     return this.atzchurukjhshjlSet;
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