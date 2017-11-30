package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzniandukhjgqz implements Serializable,IPojo
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
	  	 	 private Long atzniandukhi;
	 public void setAtzniandukhi(Long atzniandukhi)
	 {
		  this.atzniandukhi = atzniandukhi;
	 }
   public Long getAtzniandukhi()
   { 	    
  	        
      return this.atzniandukhi;     	
   }
 	 	 private String beikhzqz;
	 public void setBeikhzqz(String beikhzqz)
	 {
		  this.beikhzqz = beikhzqz;
	 }
   public String getBeikhzqz()
   { 	    
  	        
      return this.beikhzqz;     	
   }
 	 	 private Timestamp beikhzqzsj;
	 public void setBeikhzqzsj(Timestamp beikhzqzsj)
	 {
		  this.beikhzqzsj = beikhzqzsj;
	 }
   public Timestamp getBeikhzqzsj()
   { 	    
  	    	  if( this.beikhzqzsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.beikhzqzsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.beikhzqzsj;     	
   }
 	 	 private String kaohezqz;
	 public void setKaohezqz(String kaohezqz)
	 {
		  this.kaohezqz = kaohezqz;
	 }
   public String getKaohezqz()
   { 	    
  	        
      return this.kaohezqz;     	
   }
 	 	 private Timestamp kaohezqzsj;
	 public void setKaohezqzsj(Timestamp kaohezqzsj)
	 {
		  this.kaohezqzsj = kaohezqzsj;
	 }
   public Timestamp getKaohezqzsj()
   { 	    
  	    	  if( this.kaohezqzsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.kaohezqzsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.kaohezqzsj;     	
   }
 	 	 private Timestamp shenhesj;
	 public void setShenhesj(Timestamp shenhesj)
	 {
		  this.shenhesj = shenhesj;
	 }
   public Timestamp getShenhesj()
   { 	    
  	    	  if( this.shenhesj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.shenhesj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.shenhesj;     	
   }
 	 	 private String shenhezqz;
	 public void setShenhezqz(String shenhezqz)
	 {
		  this.shenhezqz = shenhezqz;
	 }
   public String getShenhezqz()
   { 	    
  	        
      return this.shenhezqz;     	
   }
 	 	 private String kaoheyj;
	 public void setKaoheyj(String kaoheyj)
	 {
		  this.kaoheyj = kaoheyj;
	 }
   public String getKaoheyj()
   { 	    
  	        
      return this.kaoheyj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef;
	 public void setAtzniandukhiRef(com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef)
	 {
		  this.atzniandukhiRef = atzniandukhiRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzniandukh getAtzniandukhiRef()
   {
     	return this.atzniandukhiRef;
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