package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchanpinzl implements Serializable,IPojo
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long chanpin;
	 public void setChanpin(Long chanpin)
	 {
		  this.chanpin = chanpin;
	 }
   public Long getChanpin()
   { 	    
  	        
      return this.chanpin;     	
   }
 	 	 private Long duiyingwlh;
	 public void setDuiyingwlh(Long duiyingwlh)
	 {
		  this.duiyingwlh = duiyingwlh;
	 }
   public Long getDuiyingwlh()
   { 	    
  	        
      return this.duiyingwlh;     	
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
 	 	 private String ziliaobb;
	 public void setZiliaobb(String ziliaobb)
	 {
		  this.ziliaobb = ziliaobb;
	 }
   public String getZiliaobb()
   { 	    
  	        
      return this.ziliaobb;     	
   }
 	 	 private String ziliaocftj;
	 public void setZiliaocftj(String ziliaocftj)
	 {
		  this.ziliaocftj = ziliaocftj;
	 }
   public String getZiliaocftj()
   { 	    
  	        
      return this.ziliaocftj;     	
   }
 	 	 private String ziliaolx;
	 public void setZiliaolx(String ziliaolx)
	 {
		  this.ziliaolx = ziliaolx;
	 }
   public String getZiliaolx()
   { 	    
  	        
      return this.ziliaolx;     	
   }
 	 	 private String ziliaomc;
	 public void setZiliaomc(String ziliaomc)
	 {
		  this.ziliaomc = ziliaomc;
	 }
   public String getZiliaomc()
   { 	    
  	        
      return this.ziliaomc;     	
   }
 	 	 private String ziliaozt;
	 public void setZiliaozt(String ziliaozt)
	 {
		  this.ziliaozt = ziliaozt;
	 }
   public String getZiliaozt()
   { 	    
  	        
      return this.ziliaozt;     	
   }
 	 	 private String zlzt;
	 public void setZlzt(String zlzt)
	 {
		  this.zlzt = zlzt;
	 }
   public String getZlzt()
   { 	    
  	        
      return this.zlzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef;
	 public void setChanpinRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef)
	 {
		  this.chanpinRef = chanpinRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinRef()
   {
     	return this.chanpinRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx duiyingwlhRef;
	 public void setDuiyingwlhRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx duiyingwlhRef)
	 {
		  this.duiyingwlhRef = duiyingwlhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getDuiyingwlhRef()
   {
     	return this.duiyingwlhRef;
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