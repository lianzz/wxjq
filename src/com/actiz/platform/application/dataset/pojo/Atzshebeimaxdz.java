package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeimaxdz implements Serializable,IPojo
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
	  	 	 private Long atzshebeixxid;
	 public void setAtzshebeixxid(Long atzshebeixxid)
	 {
		  this.atzshebeixxid = atzshebeixxid;
	 }
   public Long getAtzshebeixxid()
   { 	    
  	        
      return this.atzshebeixxid;     	
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
 	 	 private String maxdz;
	 public void setMaxdz(String maxdz)
	 {
		  this.maxdz = maxdz;
	 }
   public String getMaxdz()
   { 	    
  	        
      return this.maxdz;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzshebeixx atzshebeixxidRef;
	 public void setAtzshebeixxidRef(com.actiz.platform.application.dataset.pojo.Atzshebeixx atzshebeixxidRef)
	 {
		  this.atzshebeixxidRef = atzshebeixxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshebeixx getAtzshebeixxidRef()
   {
     	return this.atzshebeixxidRef;
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