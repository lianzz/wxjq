package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bc_auth_roles implements Serializable,IPojo
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
	  	 	 private String description;
	 public void setDescription(String description)
	 {
		  this.description = description;
	 }
   public String getDescription()
   { 	    
  	        
      return this.description;     	
   }
 	 	 private Integer isevolve;
	 public void setIsevolve(Integer isevolve)
	 {
		  this.isevolve = isevolve;
	 }
   public Integer getIsevolve()
   { 	    
  	        
      return this.isevolve;     	
   }
 	 	 private Integer ispublic;
	 public void setIspublic(Integer ispublic)
	 {
		  this.ispublic = ispublic;
	 }
   public Integer getIspublic()
   { 	    
  	        
      return this.ispublic;     	
   }
 	 	 private Long module_id;
	 public void setModule_id(Long module_id)
	 {
		  this.module_id = module_id;
	 }
   public Long getModule_id()
   { 	    
  	        
      return this.module_id;     	
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
 	 	 private Long parent_role_id;
	 public void setParent_role_id(Long parent_role_id)
	 {
		  this.parent_role_id = parent_role_id;
	 }
   public Long getParent_role_id()
   { 	    
  	        
      return this.parent_role_id;     	
   }
 	 	 private Long resource_id;
	 public void setResource_id(Long resource_id)
	 {
		  this.resource_id = resource_id;
	 }
   public Long getResource_id()
   { 	    
  	        
      return this.resource_id;     	
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