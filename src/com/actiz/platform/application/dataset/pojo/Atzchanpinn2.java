package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchanpinn2 implements Serializable,IPojo
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
 	 	 private String daleimc;
	 public void setDaleimc(String daleimc)
	 {
		  this.daleimc = daleimc;
	 }
   public String getDaleimc()
   { 	    
  	        
      return this.daleimc;     	
   }
 	 	 private Long chanpinjl;
	 public void setChanpinjl(Long chanpinjl)
	 {
		  this.chanpinjl = chanpinjl;
	 }
   public Long getChanpinjl()
   { 	    
  	        
      return this.chanpinjl;     	
   }
 	 	 private Long chanpinl;
	 public void setChanpinl(Long chanpinl)
	 {
		  this.chanpinl = chanpinl;
	 }
   public Long getChanpinl()
   { 	    
  	        
      return this.chanpinl;     	
   }
 	 	 private String chanpinms;
	 public void setChanpinms(String chanpinms)
	 {
		  this.chanpinms = chanpinms;
	 }
   public String getChanpinms()
   { 	    
  	        
      return this.chanpinms;     	
   }
 	 	 private String chanpinmc;
	 public void setChanpinmc(String chanpinmc)
	 {
		  this.chanpinmc = chanpinmc;
	 }
   public String getChanpinmc()
   { 	    
  	        
      return this.chanpinmc;     	
   }
 	 	 private String chanpinxh;
	 public void setChanpinxh(String chanpinxh)
	 {
		  this.chanpinxh = chanpinxh;
	 }
   public String getChanpinxh()
   { 	    
  	        
      return this.chanpinxh;     	
   }
 	 	 private String chanpinzt;
	 public void setChanpinzt(String chanpinzt)
	 {
		  this.chanpinzt = chanpinzt;
	 }
   public String getChanpinzt()
   { 	    
  	        
      return this.chanpinzt;     	
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
 	 	 private String putiancpxh;
	 public void setPutiancpxh(String putiancpxh)
	 {
		  this.putiancpxh = putiancpxh;
	 }
   public String getPutiancpxh()
   { 	    
  	        
      return this.putiancpxh;     	
   }
 	 	 private String shyj;
	 public void setShyj(String shyj)
	 {
		  this.shyj = shyj;
	 }
   public String getShyj()
   { 	    
  	        
      return this.shyj;     	
   }
 	 	 private String shzt;
	 public void setShzt(String shzt)
	 {
		  this.shzt = shzt;
	 }
   public String getShzt()
   { 	    
  	        
      return this.shzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee chanpinjlRef;
	 public void setChanpinjlRef(com.actiz.platform.application.dataset.pojo.Atzemployee chanpinjlRef)
	 {
		  this.chanpinjlRef = chanpinjlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getChanpinjlRef()
   {
     	return this.chanpinjlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpinlRef;
	 public void setChanpinlRef(com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpinlRef)
	 {
		  this.chanpinlRef = chanpinlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpindl getChanpinlRef()
   {
     	return this.chanpinlRef;
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