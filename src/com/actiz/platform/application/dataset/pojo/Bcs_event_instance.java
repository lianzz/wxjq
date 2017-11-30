package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bcs_event_instance implements Serializable,IPojo
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
	  	 	 private Timestamp create_time;
	 public void setCreate_time(Timestamp create_time)
	 {
		  this.create_time = create_time;
	 }
   public Timestamp getCreate_time()
   { 	    
  	    	  if( this.create_time != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.create_time.getTime() );
	    }	      	  	   	  	     	    
            
      return this.create_time;     	
   }
 	 	 private String description;
	 public void setDescription(String description)
	 {
		  this.description = description;
	 }
   public String getDescription()
   { 	    
  	        
      return this.description;     	
   }
 	 	 private Long event_id;
	 public void setEvent_id(Long event_id)
	 {
		  this.event_id = event_id;
	 }
   public Long getEvent_id()
   { 	    
  	        
      return this.event_id;     	
   }
 	 	 private Timestamp handle_time;
	 public void setHandle_time(Timestamp handle_time)
	 {
		  this.handle_time = handle_time;
	 }
   public Timestamp getHandle_time()
   { 	    
  	    	  if( this.handle_time != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.handle_time.getTime() );
	    }	      	  	   	  	     	    
            
      return this.handle_time;     	
   }
 	 	 private String preprocess_status;
	 public void setPreprocess_status(String preprocess_status)
	 {
		  this.preprocess_status = preprocess_status;
	 }
   public String getPreprocess_status()
   { 	    
  	        
      return this.preprocess_status;     	
   }
 	 	 private String status;
	 public void setStatus(String status)
	 {
		  this.status = status;
	 }
   public String getStatus()
   { 	    
  	        
      return this.status;     	
   }
 	 	 private String style;
	 public void setStyle(String style)
	 {
		  this.style = style;
	 }
   public String getStyle()
   { 	    
  	        
      return this.style;     	
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