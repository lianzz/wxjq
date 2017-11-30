package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbenzhouzjmx implements Serializable,IPojo
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
	  	 	 private Long atzzhouzjjhid;
	 public void setAtzzhouzjjhid(Long atzzhouzjjhid)
	 {
		  this.atzzhouzjjhid = atzzhouzjjhid;
	 }
   public Long getAtzzhouzjjhid()
   { 	    
  	        
      return this.atzzhouzjjhid;     	
   }
 	 	 private Long bumen;
	 public void setBumen(Long bumen)
	 {
		  this.bumen = bumen;
	 }
   public Long getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private Long huizongid;
	 public void setHuizongid(Long huizongid)
	 {
		  this.huizongid = huizongid;
	 }
   public Long getHuizongid()
   { 	    
  	        
      return this.huizongid;     	
   }
 	 	 private String shangxiazzt;
	 public void setShangxiazzt(String shangxiazzt)
	 {
		  this.shangxiazzt = shangxiazzt;
	 }
   public String getShangxiazzt()
   { 	    
  	        
      return this.shangxiazzt;     	
   }
 	 	 private String shifousy;
	 public void setShifousy(String shifousy)
	 {
		  this.shifousy = shifousy;
	 }
   public String getShifousy()
   { 	    
  	        
      return this.shifousy;     	
   }
 	 	 private String xiangmumc;
	 public void setXiangmumc(String xiangmumc)
	 {
		  this.xiangmumc = xiangmumc;
	 }
   public String getXiangmumc()
   { 	    
  	        
      return this.xiangmumc;     	
   }
 	 	 private String zongjienr;
	 public void setZongjienr(String zongjienr)
	 {
		  this.zongjienr = zongjienr;
	 }
   public String getZongjienr()
   { 	    
  	        
      return this.zongjienr;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzzhouzjjh atzzhouzjjhidRef;
	 public void setAtzzhouzjjhidRef(com.actiz.platform.application.dataset.pojo.Atzzhouzjjh atzzhouzjjhidRef)
	 {
		  this.atzzhouzjjhidRef = atzzhouzjjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzzhouzjjh getAtzzhouzjjhidRef()
   {
     	return this.atzzhouzjjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bumenRef;
	 public void setBumenRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bumenRef)
	 {
		  this.bumenRef = bumenRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBumenRef()
   {
     	return this.bumenRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzzhouzjjh huizongidRef;
	 public void setHuizongidRef(com.actiz.platform.application.dataset.pojo.Atzzhouzjjh huizongidRef)
	 {
		  this.huizongidRef = huizongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzzhouzjjh getHuizongidRef()
   {
     	return this.huizongidRef;
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