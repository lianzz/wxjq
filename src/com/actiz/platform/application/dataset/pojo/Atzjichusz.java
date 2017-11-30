package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjichusz implements Serializable,IPojo
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
	  	 	 private Double dqjl;
	 public void setDqjl(Double dqjl)
	 {
		  this.dqjl = dqjl;
	 }
   public Double getDqjl()
   { 	    
  	        
      return this.dqjl;     	
   }
 	 	 private Double baojiabl;
	 public void setBaojiabl(Double baojiabl)
	 {
		  this.baojiabl = baojiabl;
	 }
   public Double getBaojiabl()
   { 	    
  	        
      return this.baojiabl;     	
   }
 	 	 private Double sybzjl;
	 public void setSybzjl(Double sybzjl)
	 {
		  this.sybzjl = sybzjl;
	 }
   public Double getSybzjl()
   { 	    
  	        
      return this.sybzjl;     	
   }
 	 	 private Double xsfz;
	 public void setXsfz(Double xsfz)
	 {
		  this.xsfz = xsfz;
	 }
   public Double getXsfz()
   { 	    
  	        
      return this.xsfz;     	
   }
 	 	 private Double xsjl;
	 public void setXsjl(Double xsjl)
	 {
		  this.xsjl = xsjl;
	 }
   public Double getXsjl()
   { 	    
  	        
      return this.xsjl;     	
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