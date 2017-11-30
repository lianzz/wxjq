package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyuefenycmx implements Serializable,IPojo
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
	  	 	 private Double bayue;
	 public void setBayue(Double bayue)
	 {
		  this.bayue = bayue;
	 }
   public Double getBayue()
   { 	    
  	        
      return this.bayue;     	
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
 	 	 private Double eryue;
	 public void setEryue(Double eryue)
	 {
		  this.eryue = eryue;
	 }
   public Double getEryue()
   { 	    
  	        
      return this.eryue;     	
   }
 	 	 private Double jiuyue;
	 public void setJiuyue(Double jiuyue)
	 {
		  this.jiuyue = jiuyue;
	 }
   public Double getJiuyue()
   { 	    
  	        
      return this.jiuyue;     	
   }
 	 	 private Double liuyue;
	 public void setLiuyue(Double liuyue)
	 {
		  this.liuyue = liuyue;
	 }
   public Double getLiuyue()
   { 	    
  	        
      return this.liuyue;     	
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
 	 	 private Double qiyue;
	 public void setQiyue(Double qiyue)
	 {
		  this.qiyue = qiyue;
	 }
   public Double getQiyue()
   { 	    
  	        
      return this.qiyue;     	
   }
 	 	 private Double sanyue;
	 public void setSanyue(Double sanyue)
	 {
		  this.sanyue = sanyue;
	 }
   public Double getSanyue()
   { 	    
  	        
      return this.sanyue;     	
   }
 	 	 private Double shiery;
	 public void setShiery(Double shiery)
	 {
		  this.shiery = shiery;
	 }
   public Double getShiery()
   { 	    
  	        
      return this.shiery;     	
   }
 	 	 private Double shiyiy;
	 public void setShiyiy(Double shiyiy)
	 {
		  this.shiyiy = shiyiy;
	 }
   public Double getShiyiy()
   { 	    
  	        
      return this.shiyiy;     	
   }
 	 	 private Double shiyue;
	 public void setShiyue(Double shiyue)
	 {
		  this.shiyue = shiyue;
	 }
   public Double getShiyue()
   { 	    
  	        
      return this.shiyue;     	
   }
 	 	 private Double siyue;
	 public void setSiyue(Double siyue)
	 {
		  this.siyue = siyue;
	 }
   public Double getSiyue()
   { 	    
  	        
      return this.siyue;     	
   }
 	 	 private Double wuyue;
	 public void setWuyue(Double wuyue)
	 {
		  this.wuyue = wuyue;
	 }
   public Double getWuyue()
   { 	    
  	        
      return this.wuyue;     	
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
 	 	 private Long xiaoshouycid;
	 public void setXiaoshouycid(Long xiaoshouycid)
	 {
		  this.xiaoshouycid = xiaoshouycid;
	 }
   public Long getXiaoshouycid()
   { 	    
  	        
      return this.xiaoshouycid;     	
   }
 	 	 private Double yiyue;
	 public void setYiyue(Double yiyue)
	 {
		  this.yiyue = yiyue;
	 }
   public Double getYiyue()
   { 	    
  	        
      return this.yiyue;     	
   }
 	 	 private String yuefenyclx;
	 public void setYuefenyclx(String yuefenyclx)
	 {
		  this.yuefenyclx = yuefenyclx;
	 }
   public String getYuefenyclx()
   { 	    
  	        
      return this.yuefenyclx;     	
   }
 	 	 private Double zongsl;
	 public void setZongsl(Double zongsl)
	 {
		  this.zongsl = zongsl;
	 }
   public Double getZongsl()
   { 	    
  	        
      return this.zongsl;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef;
	 public void setXiaoshoubmidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef)
	 {
		  this.xiaoshoubmidRef = xiaoshoubmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmidRef()
   {
     	return this.xiaoshoubmidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef;
	 public void setXiaoshouycidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef)
	 {
		  this.xiaoshouycidRef = xiaoshouycidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc getXiaoshouycidRef()
   {
     	return this.xiaoshouycidRef;
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