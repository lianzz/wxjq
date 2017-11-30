package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongyj implements Serializable,IPojo
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
 	 	 private Long yijiaohjl;
	 public void setYijiaohjl(Long yijiaohjl)
	 {
		  this.yijiaohjl = yijiaohjl;
	 }
   public Long getYijiaohjl()
   { 	    
  	        
      return this.yijiaohjl;     	
   }
 	 	 private Long yijiaoqjl;
	 public void setYijiaoqjl(Long yijiaoqjl)
	 {
		  this.yijiaoqjl = yijiaoqjl;
	 }
   public Long getYijiaoqjl()
   { 	    
  	        
      return this.yijiaoqjl;     	
   }
 	 	 private String zhixingzt;
	 public void setZhixingzt(String zhixingzt)
	 {
		  this.zhixingzt = zhixingzt;
	 }
   public String getZhixingzt()
   { 	    
  	        
      return this.zhixingzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yijiaohjlRef;
	 public void setYijiaohjlRef(com.actiz.platform.application.dataset.pojo.Atzemployee yijiaohjlRef)
	 {
		  this.yijiaohjlRef = yijiaohjlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYijiaohjlRef()
   {
     	return this.yijiaohjlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yijiaoqjlRef;
	 public void setYijiaoqjlRef(com.actiz.platform.application.dataset.pojo.Atzemployee yijiaoqjlRef)
	 {
		  this.yijiaoqjlRef = yijiaoqjlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYijiaoqjlRef()
   {
     	return this.yijiaoqjlRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atztdyg zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getZuihouxgridRef()
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