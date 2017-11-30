package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpeizhimbqd implements Serializable,IPojo
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
	  	 	 private Long chanpinpzid;
	 public void setChanpinpzid(Long chanpinpzid)
	 {
		  this.chanpinpzid = chanpinpzid;
	 }
   public Long getChanpinpzid()
   { 	    
  	        
      return this.chanpinpzid;     	
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
 	 	 private Long xiangmupzqdid;
	 public void setXiangmupzqdid(Long xiangmupzqdid)
	 {
		  this.xiangmupzqdid = xiangmupzqdid;
	 }
   public Long getXiangmupzqdid()
   { 	    
  	        
      return this.xiangmupzqdid;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xiangmupzqdidRef;
	 public void setXiangmupzqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xiangmupzqdidRef)
	 {
		  this.xiangmupzqdidRef = xiangmupzqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd getXiangmupzqdidRef()
   {
     	return this.xiangmupzqdidRef;
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