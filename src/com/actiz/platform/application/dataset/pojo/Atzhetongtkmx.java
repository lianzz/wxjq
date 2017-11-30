package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongtkmx implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private Long fahuoqdid;
	 public void setFahuoqdid(Long fahuoqdid)
	 {
		  this.fahuoqdid = fahuoqdid;
	 }
   public Long getFahuoqdid()
   { 	    
  	        
      return this.fahuoqdid;     	
   }
 	 	 private Long hetongtkid;
	 public void setHetongtkid(Long hetongtkid)
	 {
		  this.hetongtkid = hetongtkid;
	 }
   public Long getHetongtkid()
   { 	    
  	        
      return this.hetongtkid;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
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
 	 	 private Long wuliaobmid;
	 public void setWuliaobmid(Long wuliaobmid)
	 {
		  this.wuliaobmid = wuliaobmid;
	 }
   public Long getWuliaobmid()
   { 	    
  	        
      return this.wuliaobmid;     	
   }
 	 	 private Long xiaoshoubmid;
	 public void setXiaoshoubmid(Long xiaoshoubmid)
	 {
		  this.xiaoshoubmid = xiaoshoubmid;
	 }
   public Long getXiaoshoubmid()
   { 	    
  	        
      return this.xiaoshoubmid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzfahuoqingdan fahuoqdidRef;
	 public void setFahuoqdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuoqingdan fahuoqdidRef)
	 {
		  this.fahuoqdidRef = fahuoqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuoqingdan getFahuoqdidRef()
   {
     	return this.fahuoqdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetongtk hetongtkidRef;
	 public void setHetongtkidRef(com.actiz.platform.application.dataset.pojo.Atzhetongtk hetongtkidRef)
	 {
		  this.hetongtkidRef = hetongtkidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetongtk getHetongtkidRef()
   {
     	return this.hetongtkidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaobmidRef;
	 public void setWuliaobmidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaobmidRef)
	 {
		  this.wuliaobmidRef = wuliaobmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaobmidRef()
   {
     	return this.wuliaobmidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef;
	 public void setXiaoshoubmidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef)
	 {
		  this.xiaoshoubmidRef = xiaoshoubmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmidRef()
   {
     	return this.xiaoshoubmidRef;
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