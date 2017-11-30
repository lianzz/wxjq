package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchongfufsyj implements Serializable,IPojo
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
	  	 	 private String contexts;
	 public void setContexts(String contexts)
	 {
		  this.contexts = contexts;
	 }
   public String getContexts()
   { 	    
  	        
      return this.contexts;     	
   }
 	 	 private Long intervaltime;
	 public void setIntervaltime(Long intervaltime)
	 {
		  this.intervaltime = intervaltime;
	 }
   public Long getIntervaltime()
   { 	    
  	        
      return this.intervaltime;     	
   }
 	 	 private String isrepeat;
	 public void setIsrepeat(String isrepeat)
	 {
		  this.isrepeat = isrepeat;
	 }
   public String getIsrepeat()
   { 	    
  	        
      return this.isrepeat;     	
   }
 	 	 private String istatus;
	 public void setIstatus(String istatus)
	 {
		  this.istatus = istatus;
	 }
   public String getIstatus()
   { 	    
  	        
      return this.istatus;     	
   }
 	 	 private Long notifytime;
	 public void setNotifytime(Long notifytime)
	 {
		  this.notifytime = notifytime;
	 }
   public Long getNotifytime()
   { 	    
  	        
      return this.notifytime;     	
   }
 	 	 private String notifytype;
	 public void setNotifytype(String notifytype)
	 {
		  this.notifytype = notifytype;
	 }
   public String getNotifytype()
   { 	    
  	        
      return this.notifytype;     	
   }
 	 	 private String notifyusers;
	 public void setNotifyusers(String notifyusers)
	 {
		  this.notifyusers = notifyusers;
	 }
   public String getNotifyusers()
   { 	    
  	        
      return this.notifyusers;     	
   }
 	 	 private Integer repeatcount;
	 public void setRepeatcount(Integer repeatcount)
	 {
		  this.repeatcount = repeatcount;
	 }
   public Integer getRepeatcount()
   { 	    
  	        
      return this.repeatcount;     	
   }
 	 	 private String srcbc;
	 public void setSrcbc(String srcbc)
	 {
		  this.srcbc = srcbc;
	 }
   public String getSrcbc()
   { 	    
  	        
      return this.srcbc;     	
   }
 	 	 private Long srcid;
	 public void setSrcid(Long srcid)
	 {
		  this.srcid = srcid;
	 }
   public Long getSrcid()
   { 	    
  	        
      return this.srcid;     	
   }
 	 	 private String title;
	 public void setTitle(String title)
	 {
		  this.title = title;
	 }
   public String getTitle()
   { 	    
  	        
      return this.title;     	
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