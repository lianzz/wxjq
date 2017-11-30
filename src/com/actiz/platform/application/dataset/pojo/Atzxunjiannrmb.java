package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxunjiannrmb implements Serializable,IPojo
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
	  	 	 private String chuangjianr;
	 public void setChuangjianr(String chuangjianr)
	 {
		  this.chuangjianr = chuangjianr;
	 }
   public String getChuangjianr()
   { 	    
  	        
      return this.chuangjianr;     	
   }
 	 	 private Date chuangjianrq;
	 public void setChuangjianrq(Date chuangjianrq)
	 {
		  this.chuangjianrq = chuangjianrq;
	 }
   public Date getChuangjianrq()
   { 	    
  	  	    if( this.chuangjianrq != null )
	    {
	        return (Date)new ActizDate( this.chuangjianrq.getTime() );
	    }
	          
      return this.chuangjianrq;     	
   }
 	 	 private String mobanfj;
	 public void setMobanfj(String mobanfj)
	 {
		  this.mobanfj = mobanfj;
	 }
   public String getMobanfj()
   { 	    
  	        
      return this.mobanfj;     	
   }
 	 	 private String mobanmc;
	 public void setMobanmc(String mobanmc)
	 {
		  this.mobanmc = mobanmc;
	 }
   public String getMobanmc()
   { 	    
  	        
      return this.mobanmc;     	
   }
 	 	 private String mobansm;
	 public void setMobansm(String mobansm)
	 {
		  this.mobansm = mobansm;
	 }
   public String getMobansm()
   { 	    
  	        
      return this.mobansm;     	
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
   
	private java.util.Set atzneirongmbmxSet;
	public void setAtzneirongmbmxSet(java.util.Set atzneirongmbmxSet)
	{
		 this.atzneirongmbmxSet = atzneirongmbmxSet;
	}
  public java.util.Set getAtzneirongmbmxSet()
  {
     return this.atzneirongmbmxSet;
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