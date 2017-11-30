package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscrw implements Serializable,IPojo
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
 	 	 private String danjusc;
	 public void setDanjusc(String danjusc)
	 {
		  this.danjusc = danjusc;
	 }
   public String getDanjusc()
   { 	    
  	        
      return this.danjusc;     	
   }
 	 	 private String jgrwdh;
	 public void setJgrwdh(String jgrwdh)
	 {
		  this.jgrwdh = jgrwdh;
	 }
   public String getJgrwdh()
   { 	    
  	        
      return this.jgrwdh;     	
   }
 	 	 private String jiagongdw;
	 public void setJiagongdw(String jiagongdw)
	 {
		  this.jiagongdw = jiagongdw;
	 }
   public String getJiagongdw()
   { 	    
  	        
      return this.jiagongdw;     	
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
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
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
 	 	 private Long rwjsr;
	 public void setRwjsr(Long rwjsr)
	 {
		  this.rwjsr = rwjsr;
	 }
   public Long getRwjsr()
   { 	    
  	        
      return this.rwjsr;     	
   }
 	 	 private String jgrwmc;
	 public void setJgrwmc(String jgrwmc)
	 {
		  this.jgrwmc = jgrwmc;
	 }
   public String getJgrwmc()
   { 	    
  	        
      return this.jgrwmc;     	
   }
 	 	 private String shgczt;
	 public void setShgczt(String shgczt)
	 {
		  this.shgczt = shgczt;
	 }
   public String getShgczt()
   { 	    
  	        
      return this.shgczt;     	
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
 	 	 private String scrwdlx;
	 public void setScrwdlx(String scrwdlx)
	 {
		  this.scrwdlx = scrwdlx;
	 }
   public String getScrwdlx()
   { 	    
  	        
      return this.scrwdlx;     	
   }
 	 	 private String shifouygb;
	 public void setShifouygb(String shifouygb)
	 {
		  this.shifouygb = shifouygb;
	 }
   public String getShifouygb()
   { 	    
  	        
      return this.shifouygb;     	
   }
 	 	 private String shifouyxd;
	 public void setShifouyxd(String shifouyxd)
	 {
		  this.shifouyxd = shifouyxd;
	 }
   public String getShifouyxd()
   { 	    
  	        
      return this.shifouyxd;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg rwjsrRef;
	 public void setRwjsrRef(com.actiz.platform.application.dataset.pojo.Atztdyg rwjsrRef)
	 {
		  this.rwjsrRef = rwjsrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getRwjsrRef()
   {
     	return this.rwjsrRef;
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
  
	private java.util.Set atzscrwmxSet;
	public void setAtzscrwmxSet(java.util.Set atzscrwmxSet)
	{
		 this.atzscrwmxSet = atzscrwmxSet;
	}
  public java.util.Set getAtzscrwmxSet()
  {
     return this.atzscrwmxSet;
  }
 
	private java.util.Set atzscrwshjlSet;
	public void setAtzscrwshjlSet(java.util.Set atzscrwshjlSet)
	{
		 this.atzscrwshjlSet = atzscrwshjlSet;
	}
  public java.util.Set getAtzscrwshjlSet()
  {
     return this.atzscrwshjlSet;
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