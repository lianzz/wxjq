package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbianmagz implements Serializable,IPojo
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
	  	 	 private Integer bufu;
	 public void setBufu(Integer bufu)
	 {
		  this.bufu = bufu;
	 }
   public Integer getBufu()
   { 	    
  	        
      return this.bufu;     	
   }
 	 	 private String danjulx;
	 public void setDanjulx(String danjulx)
	 {
		  this.danjulx = danjulx;
	 }
   public String getDanjulx()
   { 	    
  	        
      return this.danjulx;     	
   }
 	 	 private String fengef;
	 public void setFengef(String fengef)
	 {
		  this.fengef = fengef;
	 }
   public String getFengef()
   { 	    
  	        
      return this.fengef;     	
   }
 	 	 private Integer liushuiws;
	 public void setLiushuiws(Integer liushuiws)
	 {
		  this.liushuiws = liushuiws;
	 }
   public Integer getLiushuiws()
   { 	    
  	        
      return this.liushuiws;     	
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
 	 	 private String qianzhui;
	 public void setQianzhui(String qianzhui)
	 {
		  this.qianzhui = qianzhui;
	 }
   public String getQianzhui()
   { 	    
  	        
      return this.qianzhui;     	
   }
 	 	 private String riqi;
	 public void setRiqi(String riqi)
	 {
		  this.riqi = riqi;
	 }
   public String getRiqi()
   { 	    
  	        
      return this.riqi;     	
   }
 	 	 private String shifouqy;
	 public void setShifouqy(String shifouqy)
	 {
		  this.shifouqy = shifouqy;
	 }
   public String getShifouqy()
   { 	    
  	        
      return this.shifouqy;     	
   }
 	 	 private String yangli;
	 public void setYangli(String yangli)
	 {
		  this.yangli = yangli;
	 }
   public String getYangli()
   { 	    
  	        
      return this.yangli;     	
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
   
	private java.util.Set atzliushuihSet;
	public void setAtzliushuihSet(java.util.Set atzliushuihSet)
	{
		 this.atzliushuihSet = atzliushuihSet;
	}
  public java.util.Set getAtzliushuihSet()
  {
     return this.atzliushuihSet;
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