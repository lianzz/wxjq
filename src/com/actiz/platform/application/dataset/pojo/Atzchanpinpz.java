package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchanpinpz implements Serializable,IPojo
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
	  	 	 private Long chanpin;
	 public void setChanpin(Long chanpin)
	 {
		  this.chanpin = chanpin;
	 }
   public Long getChanpin()
   { 	    
  	        
      return this.chanpin;     	
   }
 	 	 private String chanpinpzlx;
	 public void setChanpinpzlx(String chanpinpzlx)
	 {
		  this.chanpinpzlx = chanpinpzlx;
	 }
   public String getChanpinpzlx()
   { 	    
  	        
      return this.chanpinpzlx;     	
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
 	 	 private String peizhimc;
	 public void setPeizhimc(String peizhimc)
	 {
		  this.peizhimc = peizhimc;
	 }
   public String getPeizhimc()
   { 	    
  	        
      return this.peizhimc;     	
   }
 	 	 private String peizhism;
	 public void setPeizhism(String peizhism)
	 {
		  this.peizhism = peizhism;
	 }
   public String getPeizhism()
   { 	    
  	        
      return this.peizhism;     	
   }
 	 	 private String shyj;
	 public void setShyj(String shyj)
	 {
		  this.shyj = shyj;
	 }
   public String getShyj()
   { 	    
  	        
      return this.shyj;     	
   }
 	 	 private String shzt;
	 public void setShzt(String shzt)
	 {
		  this.shzt = shzt;
	 }
   public String getShzt()
   { 	    
  	        
      return this.shzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef;
	 public void setChanpinRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef)
	 {
		  this.chanpinRef = chanpinRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinRef()
   {
     	return this.chanpinRef;
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
  
	private java.util.Set atzpeizhimxSet;
	public void setAtzpeizhimxSet(java.util.Set atzpeizhimxSet)
	{
		 this.atzpeizhimxSet = atzpeizhimxSet;
	}
  public java.util.Set getAtzpeizhimxSet()
  {
     return this.atzpeizhimxSet;
  }
 
	private java.util.Set atzpeizhimxbglsSet;
	public void setAtzpeizhimxbglsSet(java.util.Set atzpeizhimxbglsSet)
	{
		 this.atzpeizhimxbglsSet = atzpeizhimxbglsSet;
	}
  public java.util.Set getAtzpeizhimxbglsSet()
  {
     return this.atzpeizhimxbglsSet;
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