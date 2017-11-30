package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchanpinxq implements Serializable,IPojo
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
	  	 	 private Long chanpin;
	 public void setChanpin(Long chanpin)
	 {
		  this.chanpin = chanpin;
	 }
   public Long getChanpin()
   { 	    
  	        
      return this.chanpin;     	
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
 	 	 private String jiazhims;
	 public void setJiazhims(String jiazhims)
	 {
		  this.jiazhims = jiazhims;
	 }
   public String getJiazhims()
   { 	    
  	        
      return this.jiazhims;     	
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
 	 	 private Date tijiaorq;
	 public void setTijiaorq(Date tijiaorq)
	 {
		  this.tijiaorq = tijiaorq;
	 }
   public Date getTijiaorq()
   { 	    
  	  	    if( this.tijiaorq != null )
	    {
	        return (Date)new ActizDate( this.tijiaorq.getTime() );
	    }
	          
      return this.tijiaorq;     	
   }
 	 	 private String xuqiuclyj;
	 public void setXuqiuclyj(String xuqiuclyj)
	 {
		  this.xuqiuclyj = xuqiuclyj;
	 }
   public String getXuqiuclyj()
   { 	    
  	        
      return this.xuqiuclyj;     	
   }
 	 	 private String xuqiuclzt;
	 public void setXuqiuclzt(String xuqiuclzt)
	 {
		  this.xuqiuclzt = xuqiuclzt;
	 }
   public String getXuqiuclzt()
   { 	    
  	        
      return this.xuqiuclzt;     	
   }
 	 	 private String xuqiudh;
	 public void setXuqiudh(String xuqiudh)
	 {
		  this.xuqiudh = xuqiudh;
	 }
   public String getXuqiudh()
   { 	    
  	        
      return this.xuqiudh;     	
   }
 	 	 private Long xuqiubm;
	 public void setXuqiubm(Long xuqiubm)
	 {
		  this.xuqiubm = xuqiubm;
	 }
   public Long getXuqiubm()
   { 	    
  	        
      return this.xuqiubm;     	
   }
 	 	 private String xqly;
	 public void setXqly(String xqly)
	 {
		  this.xqly = xqly;
	 }
   public String getXqly()
   { 	    
  	        
      return this.xqly;     	
   }
 	 	 private String xuqiuly;
	 public void setXuqiuly(String xuqiuly)
	 {
		  this.xuqiuly = xuqiuly;
	 }
   public String getXuqiuly()
   { 	    
  	        
      return this.xuqiuly;     	
   }
 	 	 private String xuqiumc;
	 public void setXuqiumc(String xuqiumc)
	 {
		  this.xuqiumc = xuqiumc;
	 }
   public String getXuqiumc()
   { 	    
  	        
      return this.xuqiumc;     	
   }
 	 	 private String xuqiusm;
	 public void setXuqiusm(String xuqiusm)
	 {
		  this.xuqiusm = xuqiusm;
	 }
   public String getXuqiusm()
   { 	    
  	        
      return this.xuqiusm;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment xuqiubmRef;
	 public void setXuqiubmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment xuqiubmRef)
	 {
		  this.xuqiubmRef = xuqiubmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getXuqiubmRef()
   {
     	return this.xuqiubmRef;
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