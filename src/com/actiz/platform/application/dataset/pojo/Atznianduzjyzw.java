package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atznianduzjyzw implements Serializable,IPojo
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
	  	 	 private Long atzniandukhi;
	 public void setAtzniandukhi(Long atzniandukhi)
	 {
		  this.atzniandukhi = atzniandukhi;
	 }
   public Long getAtzniandukhi()
   { 	    
  	        
      return this.atzniandukhi;     	
   }
 	 	 private String benrenjnqkzj;
	 public void setBenrenjnqkzj(String benrenjnqkzj)
	 {
		  this.benrenjnqkzj = benrenjnqkzj;
	 }
   public String getBenrenjnqkzj()
   { 	    
  	        
      return this.benrenjnqkzj;     	
   }
 	 	 private String benrenmnqkzw;
	 public void setBenrenmnqkzw(String benrenmnqkzw)
	 {
		  this.benrenmnqkzw = benrenmnqkzw;
	 }
   public String getBenrenmnqkzw()
   { 	    
  	        
      return this.benrenmnqkzw;     	
   }
 	 	 private String jinniannf;
	 public void setJinniannf(String jinniannf)
	 {
		  this.jinniannf = jinniannf;
	 }
   public String getJinniannf()
   { 	    
  	        
      return this.jinniannf;     	
   }
 	 	 private String mingniannf;
	 public void setMingniannf(String mingniannf)
	 {
		  this.mingniannf = mingniannf;
	 }
   public String getMingniannf()
   { 	    
  	        
      return this.mingniannf;     	
   }
 	 	 private String zhuguanjnpj;
	 public void setZhuguanjnpj(String zhuguanjnpj)
	 {
		  this.zhuguanjnpj = zhuguanjnpj;
	 }
   public String getZhuguanjnpj()
   { 	    
  	        
      return this.zhuguanjnpj;     	
   }
 	 	 private String zhuguanmnzw;
	 public void setZhuguanmnzw(String zhuguanmnzw)
	 {
		  this.zhuguanmnzw = zhuguanmnzw;
	 }
   public String getZhuguanmnzw()
   { 	    
  	        
      return this.zhuguanmnzw;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef;
	 public void setAtzniandukhiRef(com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef)
	 {
		  this.atzniandukhiRef = atzniandukhiRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzniandukh getAtzniandukhiRef()
   {
     	return this.atzniandukhiRef;
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