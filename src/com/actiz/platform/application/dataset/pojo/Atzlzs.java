package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzlzs implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Long lshtid;
	 public void setLshtid(Long lshtid)
	 {
		  this.lshtid = lshtid;
	 }
   public Long getLshtid()
   { 	    
  	        
      return this.lshtid;     	
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
 	 	 private Long syhtid;
	 public void setSyhtid(Long syhtid)
	 {
		  this.syhtid = syhtid;
	 }
   public Long getSyhtid()
   { 	    
  	        
      return this.syhtid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong lshtidRef;
	 public void setLshtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong lshtidRef)
	 {
		  this.lshtidRef = lshtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getLshtidRef()
   {
     	return this.lshtidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong syhtidRef;
	 public void setSyhtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong syhtidRef)
	 {
		  this.syhtidRef = syhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getSyhtidRef()
   {
     	return this.syhtidRef;
   }
  
	private java.util.Set atzlzsmxSet;
	public void setAtzlzsmxSet(java.util.Set atzlzsmxSet)
	{
		 this.atzlzsmxSet = atzlzsmxSet;
	}
  public java.util.Set getAtzlzsmxSet()
  {
     return this.atzlzsmxSet;
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