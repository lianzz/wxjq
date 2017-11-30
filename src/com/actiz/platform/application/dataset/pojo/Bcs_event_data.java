package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bcs_event_data implements Serializable,IPojo
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
	  	 	 private String act_entity;
	 public void setAct_entity(String act_entity)
	 {
		  this.act_entity = act_entity;
	 }
   public String getAct_entity()
   { 	    
  	        
      return this.act_entity;     	
   }
 	 	 private String act_entityid;
	 public void setAct_entityid(String act_entityid)
	 {
		  this.act_entityid = act_entityid;
	 }
   public String getAct_entityid()
   { 	    
  	        
      return this.act_entityid;     	
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
 	 	 private String rel_entity;
	 public void setRel_entity(String rel_entity)
	 {
		  this.rel_entity = rel_entity;
	 }
   public String getRel_entity()
   { 	    
  	        
      return this.rel_entity;     	
   }
 	 	 private String rel_entityid;
	 public void setRel_entityid(String rel_entityid)
	 {
		  this.rel_entityid = rel_entityid;
	 }
   public String getRel_entityid()
   { 	    
  	        
      return this.rel_entityid;     	
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