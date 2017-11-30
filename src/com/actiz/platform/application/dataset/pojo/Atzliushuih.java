package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzliushuih implements Serializable,IPojo
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
	  	 	 private Long atzbianmagzid;
	 public void setAtzbianmagzid(Long atzbianmagzid)
	 {
		  this.atzbianmagzid = atzbianmagzid;
	 }
   public Long getAtzbianmagzid()
   { 	    
  	        
      return this.atzbianmagzid;     	
   }
 	 	 private Integer liushui;
	 public void setLiushui(Integer liushui)
	 {
		  this.liushui = liushui;
	 }
   public Integer getLiushui()
   { 	    
  	        
      return this.liushui;     	
   }
 	 	 private Date shengchengrq;
	 public void setShengchengrq(Date shengchengrq)
	 {
		  this.shengchengrq = shengchengrq;
	 }
   public Date getShengchengrq()
   { 	    
  	  	    if( this.shengchengrq != null )
	    {
	        return (Date)new ActizDate( this.shengchengrq.getTime() );
	    }
	          
      return this.shengchengrq;     	
   }
 	 	 private Integer zhengshils;
	 public void setZhengshils(Integer zhengshils)
	 {
		  this.zhengshils = zhengshils;
	 }
   public Integer getZhengshils()
   { 	    
  	        
      return this.zhengshils;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbianmagz atzbianmagzidRef;
	 public void setAtzbianmagzidRef(com.actiz.platform.application.dataset.pojo.Atzbianmagz atzbianmagzidRef)
	 {
		  this.atzbianmagzidRef = atzbianmagzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbianmagz getAtzbianmagzidRef()
   {
     	return this.atzbianmagzidRef;
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