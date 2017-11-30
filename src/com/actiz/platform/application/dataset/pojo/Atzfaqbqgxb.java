package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfaqbqgxb implements Serializable,IPojo
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
	  	 	 private Long biaoqianid;
	 public void setBiaoqianid(Long biaoqianid)
	 {
		  this.biaoqianid = biaoqianid;
	 }
   public Long getBiaoqianid()
   { 	    
  	        
      return this.biaoqianid;     	
   }
 	 	 private Long faqid;
	 public void setFaqid(Long faqid)
	 {
		  this.faqid = faqid;
	 }
   public Long getFaqid()
   { 	    
  	        
      return this.faqid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzfaqbq biaoqianidRef;
	 public void setBiaoqianidRef(com.actiz.platform.application.dataset.pojo.Atzfaqbq biaoqianidRef)
	 {
		  this.biaoqianidRef = biaoqianidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfaqbq getBiaoqianidRef()
   {
     	return this.biaoqianidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzfaqbiao faqidRef;
	 public void setFaqidRef(com.actiz.platform.application.dataset.pojo.Atzfaqbiao faqidRef)
	 {
		  this.faqidRef = faqidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfaqbiao getFaqidRef()
   {
     	return this.faqidRef;
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