package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgenggaixx implements Serializable,IPojo
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
	  	 	 private Long atzhetongid;
	 public void setAtzhetongid(Long atzhetongid)
	 {
		  this.atzhetongid = atzhetongid;
	 }
   public Long getAtzhetongid()
   { 	    
  	        
      return this.atzhetongid;     	
   }
 	 	 private Date genggairq;
	 public void setGenggairq(Date genggairq)
	 {
		  this.genggairq = genggairq;
	 }
   public Date getGenggairq()
   { 	    
  	  	    if( this.genggairq != null )
	    {
	        return (Date)new ActizDate( this.genggairq.getTime() );
	    }
	          
      return this.genggairq;     	
   }
 	 	 private String genggaixx;
	 public void setGenggaixx(String genggaixx)
	 {
		  this.genggaixx = genggaixx;
	 }
   public String getGenggaixx()
   { 	    
  	        
      return this.genggaixx;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong atzhetongidRef;
	 public void setAtzhetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong atzhetongidRef)
	 {
		  this.atzhetongidRef = atzhetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getAtzhetongidRef()
   {
     	return this.atzhetongidRef;
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