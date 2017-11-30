package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztdyg implements Serializable,IPojo
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
	  	 	 private String email;
	 public void setEmail(String email)
	 {
		  this.email = email;
	 }
   public String getEmail()
   { 	    
  	        
      return this.email;     	
   }
 	 	 private String guanxi;
	 public void setGuanxi(String guanxi)
	 {
		  this.guanxi = guanxi;
	 }
   public String getGuanxi()
   { 	    
  	        
      return this.guanxi;     	
   }
 	 	 private Integer status;
	 public void setStatus(Integer status)
	 {
		  this.status = status;
	 }
   public Integer getStatus()
   { 	    
  	        
      return this.status;     	
   }
 	 	 private String teamseq;
	 public void setTeamseq(String teamseq)
	 {
		  this.teamseq = teamseq;
	 }
   public String getTeamseq()
   { 	    
  	        
      return this.teamseq;     	
   }
 	 	 private Long tuanduiid;
	 public void setTuanduiid(Long tuanduiid)
	 {
		  this.tuanduiid = tuanduiid;
	 }
   public Long getTuanduiid()
   { 	    
  	        
      return this.tuanduiid;     	
   }
 	 	 private Long yuangongid;
	 public void setYuangongid(Long yuangongid)
	 {
		  this.yuangongid = yuangongid;
	 }
   public Long getYuangongid()
   { 	    
  	        
      return this.yuangongid;     	
   }
 	 	 private String yuangongmc;
	 public void setYuangongmc(String yuangongmc)
	 {
		  this.yuangongmc = yuangongmc;
	 }
   public String getYuangongmc()
   { 	    
  	        
      return this.yuangongmc;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztuandui tuanduiidRef;
	 public void setTuanduiidRef(com.actiz.platform.application.dataset.pojo.Atztuandui tuanduiidRef)
	 {
		  this.tuanduiidRef = tuanduiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztuandui getTuanduiidRef()
   {
     	return this.tuanduiidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yuangongidRef;
	 public void setYuangongidRef(com.actiz.platform.application.dataset.pojo.Atzemployee yuangongidRef)
	 {
		  this.yuangongidRef = yuangongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYuangongidRef()
   {
     	return this.yuangongidRef;
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