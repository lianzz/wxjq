package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzmacddmx implements Serializable,IPojo
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
	  	 	 private Long atzmacddid;
	 public void setAtzmacddid(Long atzmacddid)
	 {
		  this.atzmacddid = atzmacddid;
	 }
   public Long getAtzmacddid()
   { 	    
  	        
      return this.atzmacddid;     	
   }
 	 	 private Date lururq;
	 public void setLururq(Date lururq)
	 {
		  this.lururq = lururq;
	 }
   public Date getLururq()
   { 	    
  	  	    if( this.lururq != null )
	    {
	        return (Date)new ActizDate( this.lururq.getTime() );
	    }
	          
      return this.lururq;     	
   }
 	 	 private String mac;
	 public void setMac(String mac)
	 {
		  this.mac = mac;
	 }
   public String getMac()
   { 	    
  	        
      return this.mac;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzmacdd atzmacddidRef;
	 public void setAtzmacddidRef(com.actiz.platform.application.dataset.pojo.Atzmacdd atzmacddidRef)
	 {
		  this.atzmacddidRef = atzmacddidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzmacdd getAtzmacddidRef()
   {
     	return this.atzmacddidRef;
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