package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongcpqd implements Serializable,IPojo
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
	  	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private Long chanpindl;
	 public void setChanpindl(Long chanpindl)
	 {
		  this.chanpindl = chanpindl;
	 }
   public Long getChanpindl()
   { 	    
  	        
      return this.chanpindl;     	
   }
 	 	 private Long chanpinpzid;
	 public void setChanpinpzid(Long chanpinpzid)
	 {
		  this.chanpinpzid = chanpinpzid;
	 }
   public Long getChanpinpzid()
   { 	    
  	        
      return this.chanpinpzid;     	
   }
 	 	 private Double danjia;
	 public void setDanjia(Double danjia)
	 {
		  this.danjia = danjia;
	 }
   public Double getDanjia()
   { 	    
  	        
      return this.danjia;     	
   }
 	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
   }
 	 	 private Integer shuliang;
	 public void setShuliang(Integer shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Integer getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinidRef()
   {
     	return this.chanpinidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpindlRef;
	 public void setChanpindlRef(com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpindlRef)
	 {
		  this.chanpindlRef = chanpindlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpindl getChanpindlRef()
   {
     	return this.chanpindlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinpz chanpinpzidRef;
	 public void setChanpinpzidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinpz chanpinpzidRef)
	 {
		  this.chanpinpzidRef = chanpinpzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinpz getChanpinpzidRef()
   {
     	return this.chanpinpzidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
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