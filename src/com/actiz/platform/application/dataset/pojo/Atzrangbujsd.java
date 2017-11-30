package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzrangbujsd implements Serializable,IPojo
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
	  	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
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
 	 	 private String gongyings;
	 public void setGongyings(String gongyings)
	 {
		  this.gongyings = gongyings;
	 }
   public String getGongyings()
   { 	    
  	        
      return this.gongyings;     	
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
 	 	 private String pizhun;
	 public void setPizhun(String pizhun)
	 {
		  this.pizhun = pizhun;
	 }
   public String getPizhun()
   { 	    
  	        
      return this.pizhun;     	
   }
 	 	 private Date riqi;
	 public void setRiqi(Date riqi)
	 {
		  this.riqi = riqi;
	 }
   public Date getRiqi()
   { 	    
  	  	    if( this.riqi != null )
	    {
	        return (Date)new ActizDate( this.riqi.getTime() );
	    }
	          
      return this.riqi;     	
   }
 	 	 private Long shenqingbm;
	 public void setShenqingbm(Long shenqingbm)
	 {
		  this.shenqingbm = shenqingbm;
	 }
   public Long getShenqingbm()
   { 	    
  	        
      return this.shenqingbm;     	
   }
 	 	 private String shenqingr;
	 public void setShenqingr(String shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public String getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shouhuorq;
	 public void setShouhuorq(Date shouhuorq)
	 {
		  this.shouhuorq = shouhuorq;
	 }
   public Date getShouhuorq()
   { 	    
  	  	    if( this.shouhuorq != null )
	    {
	        return (Date)new ActizDate( this.shouhuorq.getTime() );
	    }
	          
      return this.shouhuorq;     	
   }
 	 	 private String wentims;
	 public void setWentims(String wentims)
	 {
		  this.wentims = wentims;
	 }
   public String getWentims()
   { 	    
  	        
      return this.wentims;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment shenqingbmRef;
	 public void setShenqingbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment shenqingbmRef)
	 {
		  this.shenqingbmRef = shenqingbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getShenqingbmRef()
   {
     	return this.shenqingbmRef;
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