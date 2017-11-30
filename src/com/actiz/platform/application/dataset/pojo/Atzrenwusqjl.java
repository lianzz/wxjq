package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzrenwusqjl implements Serializable,IPojo
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
	  	 	 private Long bsqr;
	 public void setBsqr(Long bsqr)
	 {
		  this.bsqr = bsqr;
	 }
   public Long getBsqr()
   { 	    
  	        
      return this.bsqr;     	
   }
 	 	 private Long taskid;
	 public void setTaskid(Long taskid)
	 {
		  this.taskid = taskid;
	 }
   public Long getTaskid()
   { 	    
  	        
      return this.taskid;     	
   }
 	 	 private Long sqr;
	 public void setSqr(Long sqr)
	 {
		  this.sqr = sqr;
	 }
   public Long getSqr()
   { 	    
  	        
      return this.sqr;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee bsqrRef;
	 public void setBsqrRef(com.actiz.platform.application.dataset.pojo.Atzemployee bsqrRef)
	 {
		  this.bsqrRef = bsqrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getBsqrRef()
   {
     	return this.bsqrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztask taskidRef;
	 public void setTaskidRef(com.actiz.platform.application.dataset.pojo.Atztask taskidRef)
	 {
		  this.taskidRef = taskidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztask getTaskidRef()
   {
     	return this.taskidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee sqrRef;
	 public void setSqrRef(com.actiz.platform.application.dataset.pojo.Atzemployee sqrRef)
	 {
		  this.sqrRef = sqrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getSqrRef()
   {
     	return this.sqrRef;
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