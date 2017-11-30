package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdingdanwbhtb implements Serializable,IPojo
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
	  	 	 private Long dingdanhtid;
	 public void setDingdanhtid(Long dingdanhtid)
	 {
		  this.dingdanhtid = dingdanhtid;
	 }
   public Long getDingdanhtid()
   { 	    
  	        
      return this.dingdanhtid;     	
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
 	 	 private Long weibaohtid;
	 public void setWeibaohtid(Long weibaohtid)
	 {
		  this.weibaohtid = weibaohtid;
	 }
   public Long getWeibaohtid()
   { 	    
  	        
      return this.weibaohtid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong dingdanhtidRef;
	 public void setDingdanhtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong dingdanhtidRef)
	 {
		  this.dingdanhtidRef = dingdanhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getDingdanhtidRef()
   {
     	return this.dingdanhtidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong weibaohtidRef;
	 public void setWeibaohtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong weibaohtidRef)
	 {
		  this.weibaohtidRef = weibaohtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getWeibaohtidRef()
   {
     	return this.weibaohtidRef;
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