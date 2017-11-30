package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigoucs implements Serializable,IPojo
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
	  	 	 private String canshubm;
	 public void setCanshubm(String canshubm)
	 {
		  this.canshubm = canshubm;
	 }
   public String getCanshubm()
   { 	    
  	        
      return this.canshubm;     	
   }
 	 	 private String canshumc;
	 public void setCanshumc(String canshumc)
	 {
		  this.canshumc = canshumc;
	 }
   public String getCanshumc()
   { 	    
  	        
      return this.canshumc;     	
   }
 	 	 private String canshunr;
	 public void setCanshunr(String canshunr)
	 {
		  this.canshunr = canshunr;
	 }
   public String getCanshunr()
   { 	    
  	        
      return this.canshunr;     	
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