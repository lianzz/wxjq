package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiangmu implements Serializable,IPojo
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
 	 	 private String guishucbzx;
	 public void setGuishucbzx(String guishucbzx)
	 {
		  this.guishucbzx = guishucbzx;
	 }
   public String getGuishucbzx()
   { 	    
  	        
      return this.guishucbzx;     	
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
 	 	 private String xiangmubh;
	 public void setXiangmubh(String xiangmubh)
	 {
		  this.xiangmubh = xiangmubh;
	 }
   public String getXiangmubh()
   { 	    
  	        
      return this.xiangmubh;     	
   }
 	 	 private Long xiangmujl;
	 public void setXiangmujl(Long xiangmujl)
	 {
		  this.xiangmujl = xiangmujl;
	 }
   public Long getXiangmujl()
   { 	    
  	        
      return this.xiangmujl;     	
   }
 	 	 private String xiangmumc;
	 public void setXiangmumc(String xiangmumc)
	 {
		  this.xiangmumc = xiangmumc;
	 }
   public String getXiangmumc()
   { 	    
  	        
      return this.xiangmumc;     	
   }
 	 	 private String xiangmuzt;
	 public void setXiangmuzt(String xiangmuzt)
	 {
		  this.xiangmuzt = xiangmuzt;
	 }
   public String getXiangmuzt()
   { 	    
  	        
      return this.xiangmuzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xiangmujlRef;
	 public void setXiangmujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee xiangmujlRef)
	 {
		  this.xiangmujlRef = xiangmujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXiangmujlRef()
   {
     	return this.xiangmujlRef;
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
  
	private java.util.Set atzxiangmucyxxSet;
	public void setAtzxiangmucyxxSet(java.util.Set atzxiangmucyxxSet)
	{
		 this.atzxiangmucyxxSet = atzxiangmucyxxSet;
	}
  public java.util.Set getAtzxiangmucyxxSet()
  {
     return this.atzxiangmucyxxSet;
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