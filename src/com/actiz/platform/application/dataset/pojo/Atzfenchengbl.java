package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfenchengbl implements Serializable,IPojo
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
	  	 	 private Long atzyunyingtkid;
	 public void setAtzyunyingtkid(Long atzyunyingtkid)
	 {
		  this.atzyunyingtkid = atzyunyingtkid;
	 }
   public Long getAtzyunyingtkid()
   { 	    
  	        
      return this.atzyunyingtkid;     	
   }
 	 	 private String fenchengnf;
	 public void setFenchengnf(String fenchengnf)
	 {
		  this.fenchengnf = fenchengnf;
	 }
   public String getFenchengnf()
   { 	    
  	        
      return this.fenchengnf;     	
   }
 	 	 private Double jiafangbl;
	 public void setJiafangbl(Double jiafangbl)
	 {
		  this.jiafangbl = jiafangbl;
	 }
   public Double getJiafangbl()
   { 	    
  	        
      return this.jiafangbl;     	
   }
 	 	 private Double yifangbl;
	 public void setYifangbl(Double yifangbl)
	 {
		  this.yifangbl = yifangbl;
	 }
   public Double getYifangbl()
   { 	    
  	        
      return this.yifangbl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzyunyingtk atzyunyingtkidRef;
	 public void setAtzyunyingtkidRef(com.actiz.platform.application.dataset.pojo.Atzyunyingtk atzyunyingtkidRef)
	 {
		  this.atzyunyingtkidRef = atzyunyingtkidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyunyingtk getAtzyunyingtkidRef()
   {
     	return this.atzyunyingtkidRef;
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