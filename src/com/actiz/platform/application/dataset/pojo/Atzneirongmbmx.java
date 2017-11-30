package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzneirongmbmx implements Serializable,IPojo
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
 	 	 private String xitongjcx;
	 public void setXitongjcx(String xitongjcx)
	 {
		  this.xitongjcx = xitongjcx;
	 }
   public String getXitongjcx()
   { 	    
  	        
      return this.xitongjcx;     	
   }
 	 	 private String xitongjczx;
	 public void setXitongjczx(String xitongjczx)
	 {
		  this.xitongjczx = xitongjczx;
	 }
   public String getXitongjczx()
   { 	    
  	        
      return this.xitongjczx;     	
   }
 	 	 private Long xunjianmbid;
	 public void setXunjianmbid(Long xunjianmbid)
	 {
		  this.xunjianmbid = xunjianmbid;
	 }
   public Long getXunjianmbid()
   { 	    
  	        
      return this.xunjianmbid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxunjiannrmb xunjianmbidRef;
	 public void setXunjianmbidRef(com.actiz.platform.application.dataset.pojo.Atzxunjiannrmb xunjianmbidRef)
	 {
		  this.xunjianmbidRef = xunjianmbidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxunjiannrmb getXunjianmbidRef()
   {
     	return this.xunjianmbidRef;
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