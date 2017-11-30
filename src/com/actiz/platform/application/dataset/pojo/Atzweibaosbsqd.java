package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzweibaosbsqd implements Serializable,IPojo
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
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
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
 	 	 private String daohuodd;
	 public void setDaohuodd(String daohuodd)
	 {
		  this.daohuodd = daohuodd;
	 }
   public String getDaohuodd()
   { 	    
  	        
      return this.daohuodd;     	
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
 	 	 private String fahuolx;
	 public void setFahuolx(String fahuolx)
	 {
		  this.fahuolx = fahuolx;
	 }
   public String getFahuolx()
   { 	    
  	        
      return this.fahuolx;     	
   }
 	 	 private Date guihuanrq;
	 public void setGuihuanrq(Date guihuanrq)
	 {
		  this.guihuanrq = guihuanrq;
	 }
   public Date getGuihuanrq()
   { 	    
  	  	    if( this.guihuanrq != null )
	    {
	        return (Date)new ActizDate( this.guihuanrq.getTime() );
	    }
	          
      return this.guihuanrq;     	
   }
 	 	 private Long hetong;
	 public void setHetong(Long hetong)
	 {
		  this.hetong = hetong;
	 }
   public Long getHetong()
   { 	    
  	        
      return this.hetong;     	
   }
 	 	 private String jieyongyy;
	 public void setJieyongyy(String jieyongyy)
	 {
		  this.jieyongyy = jieyongyy;
	 }
   public String getJieyongyy()
   { 	    
  	        
      return this.jieyongyy;     	
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
 	 	 private String laiyuansj;
	 public void setLaiyuansj(String laiyuansj)
	 {
		  this.laiyuansj = laiyuansj;
	 }
   public String getLaiyuansj()
   { 	    
  	        
      return this.laiyuansj;     	
   }
 	 	 private String lianxidh;
	 public void setLianxidh(String lianxidh)
	 {
		  this.lianxidh = lianxidh;
	 }
   public String getLianxidh()
   { 	    
  	        
      return this.lianxidh;     	
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
 	 	 private String shebeiszd;
	 public void setShebeiszd(String shebeiszd)
	 {
		  this.shebeiszd = shebeiszd;
	 }
   public String getShebeiszd()
   { 	    
  	        
      return this.shebeiszd;     	
   }
 	 	 private String shenqingr;
	 public void setShenqingr(String shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public String getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shenqingsj;
	 public void setShenqingsj(Date shenqingsj)
	 {
		  this.shenqingsj = shenqingsj;
	 }
   public Date getShenqingsj()
   { 	    
  	  	    if( this.shenqingsj != null )
	    {
	        return (Date)new ActizDate( this.shenqingsj.getTime() );
	    }
	          
      return this.shenqingsj;     	
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
 	 	 private Integer sytianshu;
	 public void setSytianshu(Integer sytianshu)
	 {
		  this.sytianshu = sytianshu;
	 }
   public Integer getSytianshu()
   { 	    
  	        
      return this.sytianshu;     	
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
 	 	 private String shifouzd;
	 public void setShifouzd(String shifouzd)
	 {
		  this.shifouzd = shifouzd;
	 }
   public String getShifouzd()
   { 	    
  	        
      return this.shifouzd;     	
   }
 	 	 private String shifouzf;
	 public void setShifouzf(String shifouzf)
	 {
		  this.shifouzf = shifouzf;
	 }
   public String getShifouzf()
   { 	    
  	        
      return this.shifouzf;     	
   }
 	 	 private String shouhuor;
	 public void setShouhuor(String shouhuor)
	 {
		  this.shouhuor = shouhuor;
	 }
   public String getShouhuor()
   { 	    
  	        
      return this.shouhuor;     	
   }
 	 	 private String weibaodlx;
	 public void setWeibaodlx(String weibaodlx)
	 {
		  this.weibaodlx = weibaodlx;
	 }
   public String getWeibaodlx()
   { 	    
  	        
      return this.weibaodlx;     	
   }
 	 	 private Long xitong;
	 public void setXitong(Long xitong)
	 {
		  this.xitong = xitong;
	 }
   public Long getXitong()
   { 	    
  	        
      return this.xitong;     	
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
 	 	 private Long zhuandanly;
	 public void setZhuandanly(Long zhuandanly)
	 {
		  this.zhuandanly = zhuandanly;
	 }
   public Long getZhuandanly()
   { 	    
  	        
      return this.zhuandanly;     	
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
 	 	 private String zuofeiyy;
	 public void setZuofeiyy(String zuofeiyy)
	 {
		  this.zuofeiyy = zuofeiyy;
	 }
   public String getZuofeiyy()
   { 	    
  	        
      return this.zuofeiyy;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpin getChanpinidRef()
   {
     	return this.chanpinidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongRef;
	 public void setHetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongRef)
	 {
		  this.hetongRef = hetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongRef()
   {
     	return this.hetongRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongRef;
	 public void setXitongRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongRef)
	 {
		  this.xitongRef = xitongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongRef()
   {
     	return this.xitongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd zhuandanlyRef;
	 public void setZhuandanlyRef(com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd zhuandanlyRef)
	 {
		  this.zhuandanlyRef = zhuandanlyRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd getZhuandanlyRef()
   {
     	return this.zhuandanlyRef;
   }
  
	private java.util.Set atzshebeisqdmxSet;
	public void setAtzshebeisqdmxSet(java.util.Set atzshebeisqdmxSet)
	{
		 this.atzshebeisqdmxSet = atzshebeisqdmxSet;
	}
  public java.util.Set getAtzshebeisqdmxSet()
  {
     return this.atzshebeisqdmxSet;
  }
 
	private java.util.Set atzweibaodshjlSet;
	public void setAtzweibaodshjlSet(java.util.Set atzweibaodshjlSet)
	{
		 this.atzweibaodshjlSet = atzweibaodshjlSet;
	}
  public java.util.Set getAtzweibaodshjlSet()
  {
     return this.atzweibaodshjlSet;
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