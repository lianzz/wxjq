package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchildren implements Serializable,IPojo
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
	  	 	 private Long employeeid;
	 public void setEmployeeid(Long employeeid)
	 {
		  this.employeeid = employeeid;
	 }
   public Long getEmployeeid()
   { 	    
  	        
      return this.employeeid;     	
   }
 	 	 private Date xiaohaicsny;
	 public void setXiaohaicsny(Date xiaohaicsny)
	 {
		  this.xiaohaicsny = xiaohaicsny;
	 }
   public Date getXiaohaicsny()
   { 	    
  	  	    if( this.xiaohaicsny != null )
	    {
	        return (Date)new ActizDate( this.xiaohaicsny.getTime() );
	    }
	          
      return this.xiaohaicsny;     	
   }
 	 	 private String xiaohaixb;
	 public void setXiaohaixb(String xiaohaixb)
	 {
		  this.xiaohaixb = xiaohaixb;
	 }
   public String getXiaohaixb()
   { 	    
  	        
      return this.xiaohaixb;     	
   }
 	 	 private String xiaohaixm;
	 public void setXiaohaixm(String xiaohaixm)
	 {
		  this.xiaohaixm = xiaohaixm;
	 }
   public String getXiaohaixm()
   { 	    
  	        
      return this.xiaohaixm;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee employeeidRef;
	 public void setEmployeeidRef(com.actiz.platform.application.dataset.pojo.Atzemployee employeeidRef)
	 {
		  this.employeeidRef = employeeidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getEmployeeidRef()
   {
     	return this.employeeidRef;
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