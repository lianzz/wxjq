package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyunyingtk implements Serializable,IPojo
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
 	 	 private String fenchengjszq;
	 public void setFenchengjszq(String fenchengjszq)
	 {
		  this.fenchengjszq = fenchengjszq;
	 }
   public String getFenchengjszq()
   { 	    
  	        
      return this.fenchengjszq;     	
   }
 	 	 private String fcjszqbeizhu;
	 public void setFcjszqbeizhu(String fcjszqbeizhu)
	 {
		  this.fcjszqbeizhu = fcjszqbeizhu;
	 }
   public String getFcjszqbeizhu()
   { 	    
  	        
      return this.fcjszqbeizhu;     	
   }
 	 	 private Double fenchengnx;
	 public void setFenchengnx(Double fenchengnx)
	 {
		  this.fenchengnx = fenchengnx;
	 }
   public Double getFenchengnx()
   { 	    
  	        
      return this.fenchengnx;     	
   }
 	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
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
 	 	 private Date shangxiansj;
	 public void setShangxiansj(Date shangxiansj)
	 {
		  this.shangxiansj = shangxiansj;
	 }
   public Date getShangxiansj()
   { 	    
  	  	    if( this.shangxiansj != null )
	    {
	        return (Date)new ActizDate( this.shangxiansj.getTime() );
	    }
	          
      return this.shangxiansj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
  
	private java.util.Set atzfenchengblSet;
	public void setAtzfenchengblSet(java.util.Set atzfenchengblSet)
	{
		 this.atzfenchengblSet = atzfenchengblSet;
	}
  public java.util.Set getAtzfenchengblSet()
  {
     return this.atzfenchengblSet;
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