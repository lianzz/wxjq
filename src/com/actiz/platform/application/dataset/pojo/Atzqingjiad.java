package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqingjiad implements Serializable,IPojo
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
	  	 	 private String dailisx;
	 public void setDailisx(String dailisx)
	 {
		  this.dailisx = dailisx;
	 }
   public String getDailisx()
   { 	    
  	        
      return this.dailisx;     	
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
 	 	 private String lxdh;
	 public void setLxdh(String lxdh)
	 {
		  this.lxdh = lxdh;
	 }
   public String getLxdh()
   { 	    
  	        
      return this.lxdh;     	
   }
 	 	 private String lxr;
	 public void setLxr(String lxr)
	 {
		  this.lxr = lxr;
	 }
   public String getLxr()
   { 	    
  	        
      return this.lxr;     	
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
 	 	 private String qingjiatx;
	 public void setQingjiatx(String qingjiatx)
	 {
		  this.qingjiatx = qingjiatx;
	 }
   public String getQingjiatx()
   { 	    
  	        
      return this.qingjiatx;     	
   }
 	 	 private String qingjiayy;
	 public void setQingjiayy(String qingjiayy)
	 {
		  this.qingjiayy = qingjiayy;
	 }
   public String getQingjiayy()
   { 	    
  	        
      return this.qingjiayy;     	
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
 	 	 private Long shrid;
	 public void setShrid(Long shrid)
	 {
		  this.shrid = shrid;
	 }
   public Long getShrid()
   { 	    
  	        
      return this.shrid;     	
   }
 	 	 private String spjd;
	 public void setSpjd(String spjd)
	 {
		  this.spjd = spjd;
	 }
   public String getSpjd()
   { 	    
  	        
      return this.spjd;     	
   }
 	 	 private Double zts;
	 public void setZts(Double zts)
	 {
		  this.zts = zts;
	 }
   public Double getZts()
   { 	    
  	        
      return this.zts;     	
   }
 	 	 private Double zxs;
	 public void setZxs(Double zxs)
	 {
		  this.zxs = zxs;
	 }
   public Double getZxs()
   { 	    
  	        
      return this.zxs;     	
   }
 	 	 private Long yuangong;
	 public void setYuangong(Long yuangong)
	 {
		  this.yuangong = yuangong;
	 }
   public Long getYuangong()
   { 	    
  	        
      return this.yuangong;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shridRef;
	 public void setShridRef(com.actiz.platform.application.dataset.pojo.Atzemployee shridRef)
	 {
		  this.shridRef = shridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShridRef()
   {
     	return this.shridRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef;
	 public void setYuangongRef(com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef)
	 {
		  this.yuangongRef = yuangongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYuangongRef()
   {
     	return this.yuangongRef;
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
  
	private java.util.Set atzqingjiadmxSet;
	public void setAtzqingjiadmxSet(java.util.Set atzqingjiadmxSet)
	{
		 this.atzqingjiadmxSet = atzqingjiadmxSet;
	}
  public java.util.Set getAtzqingjiadmxSet()
  {
     return this.atzqingjiadmxSet;
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