package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjiaban implements Serializable,IPojo
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
	  	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Date jiabanrq;
	 public void setJiabanrq(Date jiabanrq)
	 {
		  this.jiabanrq = jiabanrq;
	 }
   public Date getJiabanrq()
   { 	    
  	  	    if( this.jiabanrq != null )
	    {
	        return (Date)new ActizDate( this.jiabanrq.getTime() );
	    }
	          
      return this.jiabanrq;     	
   }
 	 	 private Double jiabansc;
	 public void setJiabansc(Double jiabansc)
	 {
		  this.jiabansc = jiabansc;
	 }
   public Double getJiabansc()
   { 	    
  	        
      return this.jiabansc;     	
   }
 	 	 private String jiabansy;
	 public void setJiabansy(String jiabansy)
	 {
		  this.jiabansy = jiabansy;
	 }
   public String getJiabansy()
   { 	    
  	        
      return this.jiabansy;     	
   }
 	 	 private Timestamp jiabanjssj;
	 public void setJiabanjssj(Timestamp jiabanjssj)
	 {
		  this.jiabanjssj = jiabanjssj;
	 }
   public Timestamp getJiabanjssj()
   { 	    
  	    	  if( this.jiabanjssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.jiabanjssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.jiabanjssj;     	
   }
 	 	 private Timestamp jiabankssj;
	 public void setJiabankssj(Timestamp jiabankssj)
	 {
		  this.jiabankssj = jiabankssj;
	 }
   public Timestamp getJiabankssj()
   { 	    
  	    	  if( this.jiabankssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.jiabankssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.jiabankssj;     	
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
 	 	 private String sqlx;
	 public void setSqlx(String sqlx)
	 {
		  this.sqlx = sqlx;
	 }
   public String getSqlx()
   { 	    
  	        
      return this.sqlx;     	
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
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
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
 	 	 private Long bumenid;
	 public void setBumenid(Long bumenid)
	 {
		  this.bumenid = bumenid;
	 }
   public Long getBumenid()
   { 	    
  	        
      return this.bumenid;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef;
	 public void setBumenidRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef)
	 {
		  this.bumenidRef = bumenidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBumenidRef()
   {
     	return this.bumenidRef;
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