package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjihuatzshjl implements Serializable,IPojo
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
	  	 	 private Long jihuatzid;
	 public void setJihuatzid(Long jihuatzid)
	 {
		  this.jihuatzid = jihuatzid;
	 }
   public Long getJihuatzid()
   { 	    
  	        
      return this.jihuatzid;     	
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
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzjihuatz jihuatzidRef;
	 public void setJihuatzidRef(com.actiz.platform.application.dataset.pojo.Atzjihuatz jihuatzidRef)
	 {
		  this.jihuatzidRef = jihuatzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjihuatz getJihuatzidRef()
   {
     	return this.jihuatzidRef;
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