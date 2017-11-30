package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkecheng implements Serializable,IPojo
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
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
   }
 	 	 private Long yuangong;
	 public void setYuangong(Long yuangong)
	 {
		  this.yuangong = yuangong;
	 }
   public Long getYuangong()
   { 	    
  	        
      return this.yuangong;     	
   }
 	 	 private Long bumen;
	 public void setBumen(Long bumen)
	 {
		  this.bumen = bumen;
	 }
   public Long getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private String kclb;
	 public void setKclb(String kclb)
	 {
		  this.kclb = kclb;
	 }
   public String getKclb()
   { 	    
  	        
      return this.kclb;     	
   }
 	 	 private String kechengmc;
	 public void setKechengmc(String kechengmc)
	 {
		  this.kechengmc = kechengmc;
	 }
   public String getKechengmc()
   { 	    
  	        
      return this.kechengmc;     	
   }
 	 	 private Double keshi;
	 public void setKeshi(Double keshi)
	 {
		  this.keshi = keshi;
	 }
   public Double getKeshi()
   { 	    
  	        
      return this.keshi;     	
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
 	 	 private String mxdx;
	 public void setMxdx(String mxdx)
	 {
		  this.mxdx = mxdx;
	 }
   public String getMxdx()
   { 	    
  	        
      return this.mxdx;     	
   }
 	 	 private String shijiangjl;
	 public void setShijiangjl(String shijiangjl)
	 {
		  this.shijiangjl = shijiangjl;
	 }
   public String getShijiangjl()
   { 	    
  	        
      return this.shijiangjl;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef;
	 public void setYuangongRef(com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef)
	 {
		  this.yuangongRef = yuangongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYuangongRef()
   {
     	return this.yuangongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bumenRef;
	 public void setBumenRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bumenRef)
	 {
		  this.bumenRef = bumenRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBumenRef()
   {
     	return this.bumenRef;
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