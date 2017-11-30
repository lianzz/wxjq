package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshenyangcljl implements Serializable,IPojo
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
	  	 	 private Long atzcaigousyid;
	 public void setAtzcaigousyid(Long atzcaigousyid)
	 {
		  this.atzcaigousyid = atzcaigousyid;
	 }
   public Long getAtzcaigousyid()
   { 	    
  	        
      return this.atzcaigousyid;     	
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
 	 	 private String shenheyjzt;
	 public void setShenheyjzt(String shenheyjzt)
	 {
		  this.shenheyjzt = shenheyjzt;
	 }
   public String getShenheyjzt()
   { 	    
  	        
      return this.shenheyjzt;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzcaigousy atzcaigousyidRef;
	 public void setAtzcaigousyidRef(com.actiz.platform.application.dataset.pojo.Atzcaigousy atzcaigousyidRef)
	 {
		  this.atzcaigousyidRef = atzcaigousyidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigousy getAtzcaigousyidRef()
   {
     	return this.atzcaigousyidRef;
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