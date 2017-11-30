package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bcs_workflow_task implements Serializable,IPojo
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
	  	 	 private String actor;
	 public void setActor(String actor)
	 {
		  this.actor = actor;
	 }
   public String getActor()
   { 	    
  	        
      return this.actor;     	
   }
 	 	 private String base_entity;
	 public void setBase_entity(String base_entity)
	 {
		  this.base_entity = base_entity;
	 }
   public String getBase_entity()
   { 	    
  	        
      return this.base_entity;     	
   }
 	 	 private String business_type;
	 public void setBusiness_type(String business_type)
	 {
		  this.business_type = business_type;
	 }
   public String getBusiness_type()
   { 	    
  	        
      return this.business_type;     	
   }
 	 	 private Date create_time;
	 public void setCreate_time(Date create_time)
	 {
		  this.create_time = create_time;
	 }
   public Date getCreate_time()
   { 	    
  	  	    if( this.create_time != null )
	    {
	        return (Date)new ActizDate( this.create_time.getTime() );
	    }
	          
      return this.create_time;     	
   }
 	 	 private String detail_page;
	 public void setDetail_page(String detail_page)
	 {
		  this.detail_page = detail_page;
	 }
   public String getDetail_page()
   { 	    
  	        
      return this.detail_page;     	
   }
 	 	 private String handle_page;
	 public void setHandle_page(String handle_page)
	 {
		  this.handle_page = handle_page;
	 }
   public String getHandle_page()
   { 	    
  	        
      return this.handle_page;     	
   }
 	 	 private String name;
	 public void setName(String name)
	 {
		  this.name = name;
	 }
   public String getName()
   { 	    
  	        
      return this.name;     	
   }
 	 	 private String relative_entity;
	 public void setRelative_entity(String relative_entity)
	 {
		  this.relative_entity = relative_entity;
	 }
   public String getRelative_entity()
   { 	    
  	        
      return this.relative_entity;     	
   }
 	 	 private String type;
	 public void setType(String type)
	 {
		  this.type = type;
	 }
   public String getType()
   { 	    
  	        
      return this.type;     	
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