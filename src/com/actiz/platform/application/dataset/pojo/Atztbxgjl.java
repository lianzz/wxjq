package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztbxgjl implements Serializable,IPojo
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
	  	 	 private Long toubiaoid;
	 public void setToubiaoid(Long toubiaoid)
	 {
		  this.toubiaoid = toubiaoid;
	 }
   public Long getToubiaoid()
   { 	    
  	        
      return this.toubiaoid;     	
   }
 	 	 private Date xghkbrq;
	 public void setXghkbrq(Date xghkbrq)
	 {
		  this.xghkbrq = xghkbrq;
	 }
   public Date getXghkbrq()
   { 	    
  	  	    if( this.xghkbrq != null )
	    {
	        return (Date)new ActizDate( this.xghkbrq.getTime() );
	    }
	          
      return this.xghkbrq;     	
   }
 	 	 private String xghzjfj;
	 public void setXghzjfj(String xghzjfj)
	 {
		  this.xghzjfj = xghzjfj;
	 }
   public String getXghzjfj()
   { 	    
  	        
      return this.xghzjfj;     	
   }
 	 	 private Date xgqkbrq;
	 public void setXgqkbrq(Date xgqkbrq)
	 {
		  this.xgqkbrq = xgqkbrq;
	 }
   public Date getXgqkbrq()
   { 	    
  	  	    if( this.xgqkbrq != null )
	    {
	        return (Date)new ActizDate( this.xgqkbrq.getTime() );
	    }
	          
      return this.xgqkbrq;     	
   }
 	 	 private String xgqzjfj;
	 public void setXgqzjfj(String xgqzjfj)
	 {
		  this.xgqzjfj = xgqzjfj;
	 }
   public String getXgqzjfj()
   { 	    
  	        
      return this.xgqzjfj;     	
   }
 	 	 private String xgr;
	 public void setXgr(String xgr)
	 {
		  this.xgr = xgr;
	 }
   public String getXgr()
   { 	    
  	        
      return this.xgr;     	
   }
 	 	 private Long xgrid;
	 public void setXgrid(Long xgrid)
	 {
		  this.xgrid = xgrid;
	 }
   public Long getXgrid()
   { 	    
  	        
      return this.xgrid;     	
   }
 	 	 private Timestamp xgrq;
	 public void setXgrq(Timestamp xgrq)
	 {
		  this.xgrq = xgrq;
	 }
   public Timestamp getXgrq()
   { 	    
  	    	  if( this.xgrq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.xgrq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.xgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaoidRef;
	 public void setToubiaoidRef(com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaoidRef)
	 {
		  this.toubiaoidRef = toubiaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztoubiao getToubiaoidRef()
   {
     	return this.toubiaoidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xgridRef;
	 public void setXgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee xgridRef)
	 {
		  this.xgridRef = xgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXgridRef()
   {
     	return this.xgridRef;
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