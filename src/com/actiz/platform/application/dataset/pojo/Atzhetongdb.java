package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongdb implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private String dblx;
	 public void setDblx(String dblx)
	 {
		  this.dblx = dblx;
	 }
   public String getDblx()
   { 	    
  	        
      return this.dblx;     	
   }
 	 	 private Long chuhetong;
	 public void setChuhetong(Long chuhetong)
	 {
		  this.chuhetong = chuhetong;
	 }
   public Long getChuhetong()
   { 	    
  	        
      return this.chuhetong;     	
   }
 	 	 private Long chujl;
	 public void setChujl(Long chujl)
	 {
		  this.chujl = chujl;
	 }
   public Long getChujl()
   { 	    
  	        
      return this.chujl;     	
   }
 	 	 private Long ruhetong;
	 public void setRuhetong(Long ruhetong)
	 {
		  this.ruhetong = ruhetong;
	 }
   public Long getRuhetong()
   { 	    
  	        
      return this.ruhetong;     	
   }
 	 	 private Long rujl;
	 public void setRujl(Long rujl)
	 {
		  this.rujl = rujl;
	 }
   public Long getRujl()
   { 	    
  	        
      return this.rujl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong chuhetongRef;
	 public void setChuhetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong chuhetongRef)
	 {
		  this.chuhetongRef = chuhetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getChuhetongRef()
   {
     	return this.chuhetongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee chujlRef;
	 public void setChujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee chujlRef)
	 {
		  this.chujlRef = chujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getChujlRef()
   {
     	return this.chujlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong ruhetongRef;
	 public void setRuhetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong ruhetongRef)
	 {
		  this.ruhetongRef = ruhetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getRuhetongRef()
   {
     	return this.ruhetongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee rujlRef;
	 public void setRujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee rujlRef)
	 {
		  this.rujlRef = rujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getRujlRef()
   {
     	return this.rujlRef;
   }
  
	private java.util.Set atzhetongdbmxSet;
	public void setAtzhetongdbmxSet(java.util.Set atzhetongdbmxSet)
	{
		 this.atzhetongdbmxSet = atzhetongdbmxSet;
	}
  public java.util.Set getAtzhetongdbmxSet()
  {
     return this.atzhetongdbmxSet;
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
	public void setDanjuzt(String string) {
		// TODO Auto-generated method stub
		
	} 
}