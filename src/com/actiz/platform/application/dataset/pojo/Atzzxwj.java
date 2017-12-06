package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzxwj implements Serializable,IPojo
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
	  	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
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
 	 	 private String lururxm;
	 public void setLururxm(String lururxm)
	 {
		  this.lururxm = lururxm;
	 }
   public String getLururxm()
   { 	    
  	        
      return this.lururxm;     	
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
 	 	 private String mingcheng;
	 public void setMingcheng(String mingcheng)
	 {
		  this.mingcheng = mingcheng;
	 }
   public String getMingcheng()
   { 	    
  	        
      return this.mingcheng;     	
   }
 	 	 private String sfywh;
	 public void setSfywh(String sfywh)
	 {
		  this.sfywh = sfywh;
	 }
   public String getSfywh()
   { 	    
  	        
      return this.sfywh;     	
   }
 	 	 private String wjlb;
	 public void setWjlb(String wjlb)
	 {
		  this.wjlb = wjlb;
	 }
   public String getWjlb()
   { 	    
  	        
      return this.wjlb;     	
   }
 	 	 private Date youxiaorq;
	 public void setYouxiaorq(Date youxiaorq)
	 {
		  this.youxiaorq = youxiaorq;
	 }
   public Date getYouxiaorq()
   { 	    
  	  	    if( this.youxiaorq != null )
	    {
	        return (Date)new ActizDate( this.youxiaorq.getTime() );
	    }
	          
      return this.youxiaorq;     	
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
 	 	 private String zuihouxgrxm;
	 public void setZuihouxgrxm(String zuihouxgrxm)
	 {
		  this.zuihouxgrxm = zuihouxgrxm;
	 }
   public String getZuihouxgrxm()
   { 	    
  	        
      return this.zuihouxgrxm;     	
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