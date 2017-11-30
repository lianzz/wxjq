package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzjcsjlmx implements Serializable,IPojo
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
	  	 	 private Long atzzhengjicsjlid;
	 public void setAtzzhengjicsjlid(Long atzzhengjicsjlid)
	 {
		  this.atzzhengjicsjlid = atzzhengjicsjlid;
	 }
   public Long getAtzzhengjicsjlid()
   { 	    
  	        
      return this.atzzhengjicsjlid;     	
   }
 	 	 private String ceshijg;
	 public void setCeshijg(String ceshijg)
	 {
		  this.ceshijg = ceshijg;
	 }
   public String getCeshijg()
   { 	    
  	        
      return this.ceshijg;     	
   }
 	 	 private Long ceshixflid;
	 public void setCeshixflid(Long ceshixflid)
	 {
		  this.ceshixflid = ceshixflid;
	 }
   public Long getCeshixflid()
   { 	    
  	        
      return this.ceshixflid;     	
   }
 	 	 private Long ceshixid;
	 public void setCeshixid(Long ceshixid)
	 {
		  this.ceshixid = ceshixid;
	 }
   public Long getCeshixid()
   { 	    
  	        
      return this.ceshixid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzzhengjicsjl atzzhengjicsjlidRef;
	 public void setAtzzhengjicsjlidRef(com.actiz.platform.application.dataset.pojo.Atzzhengjicsjl atzzhengjicsjlidRef)
	 {
		  this.atzzhengjicsjlidRef = atzzhengjicsjlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzzhengjicsjl getAtzzhengjicsjlidRef()
   {
     	return this.atzzhengjicsjlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzceshixfl ceshixflidRef;
	 public void setCeshixflidRef(com.actiz.platform.application.dataset.pojo.Atzceshixfl ceshixflidRef)
	 {
		  this.ceshixflidRef = ceshixflidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshixfl getCeshixflidRef()
   {
     	return this.ceshixflidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixidRef;
	 public void setCeshixidRef(com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixidRef)
	 {
		  this.ceshixidRef = ceshixidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshixiang getCeshixidRef()
   {
     	return this.ceshixidRef;
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