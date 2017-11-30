package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeiwbxx implements Serializable,IPojo
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
	  	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
   }
 	 	 private String shifouyx;
	 public void setShifouyx(String shifouyx)
	 {
		  this.shifouyx = shifouyx;
	 }
   public String getShifouyx()
   { 	    
  	        
      return this.shifouyx;     	
   }
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
 	 	 private Long weibaohtid;
	 public void setWeibaohtid(Long weibaohtid)
	 {
		  this.weibaohtid = weibaohtid;
	 }
   public Long getWeibaohtid()
   { 	    
  	        
      return this.weibaohtid;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private Long xiaoshouhtid;
	 public void setXiaoshouhtid(Long xiaoshouhtid)
	 {
		  this.xiaoshouhtid = xiaoshouhtid;
	 }
   public Long getXiaoshouhtid()
   { 	    
  	        
      return this.xiaoshouhtid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong weibaohtidRef;
	 public void setWeibaohtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong weibaohtidRef)
	 {
		  this.weibaohtidRef = weibaohtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getWeibaohtidRef()
   {
     	return this.weibaohtidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong xiaoshouhtidRef;
	 public void setXiaoshouhtidRef(com.actiz.platform.application.dataset.pojo.Atzhetong xiaoshouhtidRef)
	 {
		  this.xiaoshouhtidRef = xiaoshouhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getXiaoshouhtidRef()
   {
     	return this.xiaoshouhtidRef;
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