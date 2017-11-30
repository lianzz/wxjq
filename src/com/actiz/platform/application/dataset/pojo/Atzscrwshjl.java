package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscrwshjl implements Serializable,IPojo
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
	  	 	 private Long atzscrwid;
	 public void setAtzscrwid(Long atzscrwid)
	 {
		  this.atzscrwid = atzscrwid;
	 }
   public Long getAtzscrwid()
   { 	    
  	        
      return this.atzscrwid;     	
   }
 	 	 private String shenhejg;
	 public void setShenhejg(String shenhejg)
	 {
		  this.shenhejg = shenhejg;
	 }
   public String getShenhejg()
   { 	    
  	        
      return this.shenhejg;     	
   }
 	 	 private String shenher;
	 public void setShenher(String shenher)
	 {
		  this.shenher = shenher;
	 }
   public String getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private Date shenherq;
	 public void setShenherq(Date shenherq)
	 {
		  this.shenherq = shenherq;
	 }
   public Date getShenherq()
   { 	    
  	  	    if( this.shenherq != null )
	    {
	        return (Date)new ActizDate( this.shenherq.getTime() );
	    }
	          
      return this.shenherq;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzscrw atzscrwidRef;
	 public void setAtzscrwidRef(com.actiz.platform.application.dataset.pojo.Atzscrw atzscrwidRef)
	 {
		  this.atzscrwidRef = atzscrwidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getAtzscrwidRef()
   {
     	return this.atzscrwidRef;
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