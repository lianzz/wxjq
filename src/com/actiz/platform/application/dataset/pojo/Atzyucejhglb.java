package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyucejhglb implements Serializable,IPojo
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
	  	 	 private Long scjhid;
	 public void setScjhid(Long scjhid)
	 {
		  this.scjhid = scjhid;
	 }
   public Long getScjhid()
   { 	    
  	        
      return this.scjhid;     	
   }
 	 	 private Long xiaoshouycid;
	 public void setXiaoshouycid(Long xiaoshouycid)
	 {
		  this.xiaoshouycid = xiaoshouycid;
	 }
   public Long getXiaoshouycid()
   { 	    
  	        
      return this.xiaoshouycid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef;
	 public void setScjhidRef(com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef)
	 {
		  this.scjhidRef = scjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjh getScjhidRef()
   {
     	return this.scjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef;
	 public void setXiaoshouycidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef)
	 {
		  this.xiaoshouycidRef = xiaoshouycidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc getXiaoshouycidRef()
   {
     	return this.xiaoshouycidRef;
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