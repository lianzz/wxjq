package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjylyqingdan implements Serializable,IPojo
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
	  	 	 private Long bmmc;
	 public void setBmmc(Long bmmc)
	 {
		  this.bmmc = bmmc;
	 }
   public Long getBmmc()
   { 	    
  	        
      return this.bmmc;     	
   }
 	 	 private String ckjhdh;
	 public void setCkjhdh(String ckjhdh)
	 {
		  this.ckjhdh = ckjhdh;
	 }
   public String getCkjhdh()
   { 	    
  	        
      return this.ckjhdh;     	
   }
 	 	 private String ghzhuangt;
	 public void setGhzhuangt(String ghzhuangt)
	 {
		  this.ghzhuangt = ghzhuangt;
	 }
   public String getGhzhuangt()
   { 	    
  	        
      return this.ghzhuangt;     	
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
 	 	 private String churukr;
	 public void setChurukr(String churukr)
	 {
		  this.churukr = churukr;
	 }
   public String getChurukr()
   { 	    
  	        
      return this.churukr;     	
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
 	 	 private String rkjhdh;
	 public void setRkjhdh(String rkjhdh)
	 {
		  this.rkjhdh = rkjhdh;
	 }
   public String getRkjhdh()
   { 	    
  	        
      return this.rkjhdh;     	
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
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
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
 	 	 private String yuanyin;
	 public void setYuanyin(String yuanyin)
	 {
		  this.yuanyin = yuanyin;
	 }
   public String getYuanyin()
   { 	    
  	        
      return this.yuanyin;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bmmcRef;
	 public void setBmmcRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bmmcRef)
	 {
		  this.bmmcRef = bmmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBmmcRef()
   {
     	return this.bmmcRef;
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