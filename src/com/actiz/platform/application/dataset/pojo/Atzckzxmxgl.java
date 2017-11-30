package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzckzxmxgl implements Serializable,IPojo
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
	  	 	 private Long ckdmxid;
	 public void setCkdmxid(Long ckdmxid)
	 {
		  this.ckdmxid = ckdmxid;
	 }
   public Long getCkdmxid()
   { 	    
  	        
      return this.ckdmxid;     	
   }
 	 	 private Long zxdmxid;
	 public void setZxdmxid(Long zxdmxid)
	 {
		  this.zxdmxid = zxdmxid;
	 }
   public Long getZxdmxid()
   { 	    
  	        
      return this.zxdmxid;     	
   }
 	 	 private Double zxsl;
	 public void setZxsl(Double zxsl)
	 {
		  this.zxsl = zxsl;
	 }
   public Double getZxsl()
   { 	    
  	        
      return this.zxsl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukdmx ckdmxidRef;
	 public void setCkdmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukdmx ckdmxidRef)
	 {
		  this.ckdmxidRef = ckdmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukdmx getCkdmxidRef()
   {
     	return this.ckdmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzzhuangxdanmx zxdmxidRef;
	 public void setZxdmxidRef(com.actiz.platform.application.dataset.pojo.Atzzhuangxdanmx zxdmxidRef)
	 {
		  this.zxdmxidRef = zxdmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzzhuangxdanmx getZxdmxidRef()
   {
     	return this.zxdmxidRef;
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