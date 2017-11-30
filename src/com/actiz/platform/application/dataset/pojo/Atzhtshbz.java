package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhtshbz implements Serializable,IPojo
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
	  	 	 private Double daqujljg;
	 public void setDaqujljg(Double daqujljg)
	 {
		  this.daqujljg = daqujljg;
	 }
   public Double getDaqujljg()
   { 	    
  	        
      return this.daqujljg;     	
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
 	 	 private String shbzlx;
	 public void setShbzlx(String shbzlx)
	 {
		  this.shbzlx = shbzlx;
	 }
   public String getShbzlx()
   { 	    
  	        
      return this.shbzlx;     	
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
 	 	 private Double sybzjl;
	 public void setSybzjl(Double sybzjl)
	 {
		  this.sybzjl = sybzjl;
	 }
   public Double getSybzjl()
   { 	    
  	        
      return this.sybzjl;     	
   }
 	 	 private Long xiaoshoubm;
	 public void setXiaoshoubm(Long xiaoshoubm)
	 {
		  this.xiaoshoubm = xiaoshoubm;
	 }
   public Long getXiaoshoubm()
   { 	    
  	        
      return this.xiaoshoubm;     	
   }
 	 	 private Double xiaoshoufzjg;
	 public void setXiaoshoufzjg(Double xiaoshoufzjg)
	 {
		  this.xiaoshoufzjg = xiaoshoufzjg;
	 }
   public Double getXiaoshoufzjg()
   { 	    
  	        
      return this.xiaoshoufzjg;     	
   }
 	 	 private Double xiaoshoujljg;
	 public void setXiaoshoujljg(Double xiaoshoujljg)
	 {
		  this.xiaoshoujljg = xiaoshoujljg;
	 }
   public Double getXiaoshoujljg()
   { 	    
  	        
      return this.xiaoshoujljg;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atztdyg lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmRef;
	 public void setXiaoshoubmRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmRef)
	 {
		  this.xiaoshoubmRef = xiaoshoubmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmRef()
   {
     	return this.xiaoshoubmRef;
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