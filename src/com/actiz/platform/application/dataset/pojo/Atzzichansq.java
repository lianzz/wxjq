package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzichansq implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Long zichan;
	 public void setZichan(Long zichan)
	 {
		  this.zichan = zichan;
	 }
   public Long getZichan()
   { 	    
  	        
      return this.zichan;     	
   }
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
   }
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
   }
 	 	 private Date lururq;
	 public void setLururq(Date lururq)
	 {
		  this.lururq = lururq;
	 }
   public Date getLururq()
   { 	    
  	  	    if( this.lururq != null )
	    {
	        return (Date)new ActizDate( this.lururq.getTime() );
	    }
	          
      return this.lururq;     	
   }
 	 	 private Long shenqingbm;
	 public void setShenqingbm(Long shenqingbm)
	 {
		  this.shenqingbm = shenqingbm;
	 }
   public Long getShenqingbm()
   { 	    
  	        
      return this.shenqingbm;     	
   }
 	 	 private Date jieyongzq;
	 public void setJieyongzq(Date jieyongzq)
	 {
		  this.jieyongzq = jieyongzq;
	 }
   public Date getJieyongzq()
   { 	    
  	  	    if( this.jieyongzq != null )
	    {
	        return (Date)new ActizDate( this.jieyongzq.getTime() );
	    }
	          
      return this.jieyongzq;     	
   }
 	 	 private String shenqinglx;
	 public void setShenqinglx(String shenqinglx)
	 {
		  this.shenqinglx = shenqinglx;
	 }
   public String getShenqinglx()
   { 	    
  	        
      return this.shenqinglx;     	
   }
 	 	 private Long shenqingr;
	 public void setShenqingr(Long shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public Long getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shenqingrq;
	 public void setShenqingrq(Date shenqingrq)
	 {
		  this.shenqingrq = shenqingrq;
	 }
   public Date getShenqingrq()
   { 	    
  	  	    if( this.shenqingrq != null )
	    {
	        return (Date)new ActizDate( this.shenqingrq.getTime() );
	    }
	          
      return this.shenqingrq;     	
   }
 	 	 private String shengqingyy;
	 public void setShengqingyy(String shengqingyy)
	 {
		  this.shengqingyy = shengqingyy;
	 }
   public String getShengqingyy()
   { 	    
  	        
      return this.shengqingyy;     	
   }
 	 	 private String xuqiuxx;
	 public void setXuqiuxx(String xuqiuxx)
	 {
		  this.xuqiuxx = xuqiuxx;
	 }
   public String getXuqiuxx()
   { 	    
  	        
      return this.xuqiuxx;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzgudingzc zichanRef;
	 public void setZichanRef(com.actiz.platform.application.dataset.pojo.Atzgudingzc zichanRef)
	 {
		  this.zichanRef = zichanRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgudingzc getZichanRef()
   {
     	return this.zichanRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment shenqingbmRef;
	 public void setShenqingbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment shenqingbmRef)
	 {
		  this.shenqingbmRef = shenqingbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getShenqingbmRef()
   {
     	return this.shenqingbmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shenqingrRef;
	 public void setShenqingrRef(com.actiz.platform.application.dataset.pojo.Atzemployee shenqingrRef)
	 {
		  this.shenqingrRef = shenqingrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShenqingrRef()
   {
     	return this.shenqingrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
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