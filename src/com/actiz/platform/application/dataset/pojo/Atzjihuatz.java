package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjihuatz implements Serializable,IPojo
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long churukjhdid;
	 public void setChurukjhdid(Long churukjhdid)
	 {
		  this.churukjhdid = churukjhdid;
	 }
   public Long getChurukjhdid()
   { 	    
  	        
      return this.churukjhdid;     	
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
 	 	 private String tzdanju;
	 public void setTzdanju(String tzdanju)
	 {
		  this.tzdanju = tzdanju;
	 }
   public String getTzdanju()
   { 	    
  	        
      return this.tzdanju;     	
   }
 	 	 private String tzren;
	 public void setTzren(String tzren)
	 {
		  this.tzren = tzren;
	 }
   public String getTzren()
   { 	    
  	        
      return this.tzren;     	
   }
 	 	 private Date tzriqi;
	 public void setTzriqi(Date tzriqi)
	 {
		  this.tzriqi = tzriqi;
	 }
   public Date getTzriqi()
   { 	    
  	  	    if( this.tzriqi != null )
	    {
	        return (Date)new ActizDate( this.tzriqi.getTime() );
	    }
	          
      return this.tzriqi;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef;
	 public void setChurukjhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef)
	 {
		  this.churukjhdidRef = churukjhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getChurukjhdidRef()
   {
     	return this.churukjhdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
   }
  
	private java.util.Set atzjihuatzmxSet;
	public void setAtzjihuatzmxSet(java.util.Set atzjihuatzmxSet)
	{
		 this.atzjihuatzmxSet = atzjihuatzmxSet;
	}
  public java.util.Set getAtzjihuatzmxSet()
  {
     return this.atzjihuatzmxSet;
  }
 
	private java.util.Set atzjihuatzshjlSet;
	public void setAtzjihuatzshjlSet(java.util.Set atzjihuatzshjlSet)
	{
		 this.atzjihuatzshjlSet = atzjihuatzshjlSet;
	}
  public java.util.Set getAtzjihuatzshjlSet()
  {
     return this.atzjihuatzshjlSet;
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