package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscphmx implements Serializable,IPojo
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
	  	 	 private Long atzscphid;
	 public void setAtzscphid(Long atzscphid)
	 {
		  this.atzscphid = atzscphid;
	 }
   public Long getAtzscphid()
   { 	    
  	        
      return this.atzscphid;     	
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
 	 	 private String xulieh;
	 public void setXulieh(String xulieh)
	 {
		  this.xulieh = xulieh;
	 }
   public String getXulieh()
   { 	    
  	        
      return this.xulieh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzscph atzscphidRef;
	 public void setAtzscphidRef(com.actiz.platform.application.dataset.pojo.Atzscph atzscphidRef)
	 {
		  this.atzscphidRef = atzscphidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscph getAtzscphidRef()
   {
     	return this.atzscphidRef;
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