package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzexample implements Serializable,IPojo
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
	  	 	 private Integer applyage;
	 public void setApplyage(Integer applyage)
	 {
		  this.applyage = applyage;
	 }
   public Integer getApplyage()
   { 	    
  	        
      return this.applyage;     	
   }
 	 	 private String applyname;
	 public void setApplyname(String applyname)
	 {
		  this.applyname = applyname;
	 }
   public String getApplyname()
   { 	    
  	        
      return this.applyname;     	
   }
 	 	 private Date applydate;
	 public void setApplydate(Date applydate)
	 {
		  this.applydate = applydate;
	 }
   public Date getApplydate()
   { 	    
  	  	    if( this.applydate != null )
	    {
	        return (Date)new ActizDate( this.applydate.getTime() );
	    }
	          
      return this.applydate;     	
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