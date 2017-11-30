package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyonghusq implements Serializable,IPojo
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
	  	 	 private Long bshouquanr;
	 public void setBshouquanr(Long bshouquanr)
	 {
		  this.bshouquanr = bshouquanr;
	 }
   public Long getBshouquanr()
   { 	    
  	        
      return this.bshouquanr;     	
   }
 	 	 private Date jssj;
	 public void setJssj(Date jssj)
	 {
		  this.jssj = jssj;
	 }
   public Date getJssj()
   { 	    
  	  	    if( this.jssj != null )
	    {
	        return (Date)new ActizDate( this.jssj.getTime() );
	    }
	          
      return this.jssj;     	
   }
 	 	 private Date kssj;
	 public void setKssj(Date kssj)
	 {
		  this.kssj = kssj;
	 }
   public Date getKssj()
   { 	    
  	  	    if( this.kssj != null )
	    {
	        return (Date)new ActizDate( this.kssj.getTime() );
	    }
	          
      return this.kssj;     	
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
 	 	 private String shifouyx;
	 public void setShifouyx(String shifouyx)
	 {
		  this.shifouyx = shifouyx;
	 }
   public String getShifouyx()
   { 	    
  	        
      return this.shifouyx;     	
   }
 	 	 private Long shouquanr;
	 public void setShouquanr(Long shouquanr)
	 {
		  this.shouquanr = shouquanr;
	 }
   public Long getShouquanr()
   { 	    
  	        
      return this.shouquanr;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee bshouquanrRef;
	 public void setBshouquanrRef(com.actiz.platform.application.dataset.pojo.Atzemployee bshouquanrRef)
	 {
		  this.bshouquanrRef = bshouquanrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getBshouquanrRef()
   {
     	return this.bshouquanrRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shouquanrRef;
	 public void setShouquanrRef(com.actiz.platform.application.dataset.pojo.Atzemployee shouquanrRef)
	 {
		  this.shouquanrRef = shouquanrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShouquanrRef()
   {
     	return this.shouquanrRef;
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