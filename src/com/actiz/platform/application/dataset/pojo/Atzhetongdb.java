package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongdb implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private String dblx;
	 public void setDblx(String dblx)
	 {
		  this.dblx = dblx;
	 }
   public String getDblx()
   { 	    
  	        
      return this.dblx;     	
   }
 	 	 private Long chuhetong;
	 public void setChuhetong(Long chuhetong)
	 {
		  this.chuhetong = chuhetong;
	 }
   public Long getChuhetong()
   { 	    
  	        
      return this.chuhetong;     	
   }
 	 	 private Long chujl;
	 public void setChujl(Long chujl)
	 {
		  this.chujl = chujl;
	 }
   public Long getChujl()
   { 	    
  	        
      return this.chujl;     	
   }
 	 	 private Long ruhetong;
	 public void setRuhetong(Long ruhetong)
	 {
		  this.ruhetong = ruhetong;
	 }
   public Long getRuhetong()
   { 	    
  	        
      return this.ruhetong;     	
   }
 	 	 private Long rujl;
	 public void setRujl(Long rujl)
	 {
		  this.rujl = rujl;
	 }
   public Long getRujl()
   { 	    
  	        
      return this.rujl;     	
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
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong chuhetongRef;
	 public void setChuhetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong chuhetongRef)
	 {
		  this.chuhetongRef = chuhetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getChuhetongRef()
   {
     	return this.chuhetongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee chujlRef;
	 public void setChujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee chujlRef)
	 {
		  this.chujlRef = chujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getChujlRef()
   {
     	return this.chujlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong ruhetongRef;
	 public void setRuhetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong ruhetongRef)
	 {
		  this.ruhetongRef = ruhetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getRuhetongRef()
   {
     	return this.ruhetongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee rujlRef;
	 public void setRujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee rujlRef)
	 {
		  this.rujlRef = rujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getRujlRef()
   {
     	return this.rujlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzhetongdbmxSet;
	public void setAtzhetongdbmxSet(java.util.Set atzhetongdbmxSet)
	{
		 this.atzhetongdbmxSet = atzhetongdbmxSet;
	}
  public java.util.Set getAtzhetongdbmxSet()
  {
     return this.atzhetongdbmxSet;
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