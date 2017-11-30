package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzwuliaogg implements Serializable,IPojo
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
 	 	 private String gghcjxh;
	 public void setGghcjxh(String gghcjxh)
	 {
		  this.gghcjxh = gghcjxh;
	 }
   public String getGghcjxh()
   { 	    
  	        
      return this.gghcjxh;     	
   }
 	 	 private String gghsccj;
	 public void setGghsccj(String gghsccj)
	 {
		  this.gghsccj = gghsccj;
	 }
   public String getGghsccj()
   { 	    
  	        
      return this.gghsccj;     	
   }
 	 	 private String gghwlms;
	 public void setGghwlms(String gghwlms)
	 {
		  this.gghwlms = gghwlms;
	 }
   public String getGghwlms()
   { 	    
  	        
      return this.gghwlms;     	
   }
 	 	 private Long ggqsccj;
	 public void setGgqsccj(Long ggqsccj)
	 {
		  this.ggqsccj = ggqsccj;
	 }
   public Long getGgqsccj()
   { 	    
  	        
      return this.ggqsccj;     	
   }
 	 	 private String ggqwlms;
	 public void setGgqwlms(String ggqwlms)
	 {
		  this.ggqwlms = ggqwlms;
	 }
   public String getGgqwlms()
   { 	    
  	        
      return this.ggqwlms;     	
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
 	 	 private String genggaiyy;
	 public void setGenggaiyy(String genggaiyy)
	 {
		  this.genggaiyy = genggaiyy;
	 }
   public String getGenggaiyy()
   { 	    
  	        
      return this.genggaiyy;     	
   }
 	 	 private Date wanchengrq;
	 public void setWanchengrq(Date wanchengrq)
	 {
		  this.wanchengrq = wanchengrq;
	 }
   public Date getWanchengrq()
   { 	    
  	  	    if( this.wanchengrq != null )
	    {
	        return (Date)new ActizDate( this.wanchengrq.getTime() );
	    }
	          
      return this.wanchengrq;     	
   }
 	 	 private String weihury;
	 public void setWeihury(String weihury)
	 {
		  this.weihury = weihury;
	 }
   public String getWeihury()
   { 	    
  	        
      return this.weihury;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj ggqsccjRef;
	 public void setGgqsccjRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj ggqsccjRef)
	 {
		  this.ggqsccjRef = ggqsccjRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getGgqsccjRef()
   {
     	return this.ggqsccjRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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