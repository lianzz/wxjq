package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqianfasbmx implements Serializable,IPojo
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
	  	 	 private Date bufarq;
	 public void setBufarq(Date bufarq)
	 {
		  this.bufarq = bufarq;
	 }
   public Date getBufarq()
   { 	    
  	  	    if( this.bufarq != null )
	    {
	        return (Date)new ActizDate( this.bufarq.getTime() );
	    }
	          
      return this.bufarq;     	
   }
 	 	 private Long fahuozjid;
	 public void setFahuozjid(Long fahuozjid)
	 {
		  this.fahuozjid = fahuozjid;
	 }
   public Long getFahuozjid()
   { 	    
  	        
      return this.fahuozjid;     	
   }
 	 	 private String shebeimc;
	 public void setShebeimc(String shebeimc)
	 {
		  this.shebeimc = shebeimc;
	 }
   public String getShebeimc()
   { 	    
  	        
      return this.shebeimc;     	
   }
 	 	 private Integer shuliang;
	 public void setShuliang(Integer shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Integer getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzfahuojhzj fahuozjidRef;
	 public void setFahuozjidRef(com.actiz.platform.application.dataset.pojo.Atzfahuojhzj fahuozjidRef)
	 {
		  this.fahuozjidRef = fahuozjidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuojhzj getFahuozjidRef()
   {
     	return this.fahuozjidRef;
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