package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhuangxdanmx implements Serializable,IPojo
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
	  	 	 private Long churukdmxid;
	 public void setChurukdmxid(Long churukdmxid)
	 {
		  this.churukdmxid = churukdmxid;
	 }
   public Long getChurukdmxid()
   { 	    
  	        
      return this.churukdmxid;     	
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
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
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
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private Long zhuangxiangd;
	 public void setZhuangxiangd(Long zhuangxiangd)
	 {
		  this.zhuangxiangd = zhuangxiangd;
	 }
   public Long getZhuangxiangd()
   { 	    
  	        
      return this.zhuangxiangd;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukdmx churukdmxidRef;
	 public void setChurukdmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukdmx churukdmxidRef)
	 {
		  this.churukdmxidRef = churukdmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukdmx getChurukdmxidRef()
   {
     	return this.churukdmxidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzzhuangxiangd zhuangxiangdRef;
	 public void setZhuangxiangdRef(com.actiz.platform.application.dataset.pojo.Atzzhuangxiangd zhuangxiangdRef)
	 {
		  this.zhuangxiangdRef = zhuangxiangdRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzzhuangxiangd getZhuangxiangdRef()
   {
     	return this.zhuangxiangdRef;
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