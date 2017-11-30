package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfahuoqingdan implements Serializable,IPojo
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
	  	 	 private Date fahuosj;
	 public void setFahuosj(Date fahuosj)
	 {
		  this.fahuosj = fahuosj;
	 }
   public Date getFahuosj()
   { 	    
  	  	    if( this.fahuosj != null )
	    {
	        return (Date)new ActizDate( this.fahuosj.getTime() );
	    }
	          
      return this.fahuosj;     	
   }
 	 	 private Long fahuotzdid;
	 public void setFahuotzdid(Long fahuotzdid)
	 {
		  this.fahuotzdid = fahuotzdid;
	 }
   public Long getFahuotzdid()
   { 	    
  	        
      return this.fahuotzdid;     	
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
 	 	 private Double tkshuliang;
	 public void setTkshuliang(Double tkshuliang)
	 {
		  this.tkshuliang = tkshuliang;
	 }
   public Double getTkshuliang()
   { 	    
  	        
      return this.tkshuliang;     	
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
 	 	 private Long xiaoshoubmid;
	 public void setXiaoshoubmid(Long xiaoshoubmid)
	 {
		  this.xiaoshoubmid = xiaoshoubmid;
	 }
   public Long getXiaoshoubmid()
   { 	    
  	        
      return this.xiaoshoubmid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef;
	 public void setFahuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef)
	 {
		  this.fahuotzdidRef = fahuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuotzd getFahuotzdidRef()
   {
     	return this.fahuotzdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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