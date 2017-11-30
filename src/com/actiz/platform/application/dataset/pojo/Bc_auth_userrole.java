package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bc_auth_userrole implements Serializable,IPojo
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
	  	 	 private Integer isevolve;
	 public void setIsevolve(Integer isevolve)
	 {
		  this.isevolve = isevolve;
	 }
   public Integer getIsevolve()
   { 	    
  	        
      return this.isevolve;     	
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
 	 	 private Long role_id;
	 public void setRole_id(Long role_id)
	 {
		  this.role_id = role_id;
	 }
   public Long getRole_id()
   { 	    
  	        
      return this.role_id;     	
   }
 	 	 private Long user_id;
	 public void setUser_id(Long user_id)
	 {
		  this.user_id = user_id;
	 }
   public Long getUser_id()
   { 	    
  	        
      return this.user_id;     	
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