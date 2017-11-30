package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzactivitybo implements Serializable,IPojo
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
	  	 	 private Long atztaskid;
	 public void setAtztaskid(Long atztaskid)
	 {
		  this.atztaskid = atztaskid;
	 }
   public Long getAtztaskid()
   { 	    
  	        
      return this.atztaskid;     	
   }
 	 	 private Long boid;
	 public void setBoid(Long boid)
	 {
		  this.boid = boid;
	 }
   public Long getBoid()
   { 	    
  	        
      return this.boid;     	
   }
 	 	 private String boname;
	 public void setBoname(String boname)
	 {
		  this.boname = boname;
	 }
   public String getBoname()
   { 	    
  	        
      return this.boname;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztask atztaskidRef;
	 public void setAtztaskidRef(com.actiz.platform.application.dataset.pojo.Atztask atztaskidRef)
	 {
		  this.atztaskidRef = atztaskidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztask getAtztaskidRef()
   {
     	return this.atztaskidRef;
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