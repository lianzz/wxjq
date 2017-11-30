package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiaoshouyc implements Serializable,IPojo
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
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
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
 	 	 private Integer dangqiann;
	 public void setDangqiann(Integer dangqiann)
	 {
		  this.dangqiann = dangqiann;
	 }
   public Integer getDangqiann()
   { 	    
  	        
      return this.dangqiann;     	
   }
 	 	 private Integer dangqiany;
	 public void setDangqiany(Integer dangqiany)
	 {
		  this.dangqiany = dangqiany;
	 }
   public Integer getDangqiany()
   { 	    
  	        
      return this.dangqiany;     	
   }
 	 	 private String hebingids;
	 public void setHebingids(String hebingids)
	 {
		  this.hebingids = hebingids;
	 }
   public String getHebingids()
   { 	    
  	        
      return this.hebingids;     	
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
 	 	 private String shifoucgyzx;
	 public void setShifoucgyzx(String shifoucgyzx)
	 {
		  this.shifoucgyzx = shifoucgyzx;
	 }
   public String getShifoucgyzx()
   { 	    
  	        
      return this.shifoucgyzx;     	
   }
 	 	 private String shifouls;
	 public void setShifouls(String shifouls)
	 {
		  this.shifouls = shifouls;
	 }
   public String getShifouls()
   { 	    
  	        
      return this.shifouls;     	
   }
 	 	 private String shifouscyzx;
	 public void setShifouscyzx(String shifouscyzx)
	 {
		  this.shifouscyzx = shifouscyzx;
	 }
   public String getShifouscyzx()
   { 	    
  	        
      return this.shifouscyzx;     	
   }
 	 	 private String shujulx;
	 public void setShujulx(String shujulx)
	 {
		  this.shujulx = shujulx;
	 }
   public String getShujulx()
   { 	    
  	        
      return this.shujulx;     	
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
 	 	 private String xiaoshouqy;
	 public void setXiaoshouqy(String xiaoshouqy)
	 {
		  this.xiaoshouqy = xiaoshouqy;
	 }
   public String getXiaoshouqy()
   { 	    
  	        
      return this.xiaoshouqy;     	
   }
 	 	 private String xiaoshouxmmc;
	 public void setXiaoshouxmmc(String xiaoshouxmmc)
	 {
		  this.xiaoshouxmmc = xiaoshouxmmc;
	 }
   public String getXiaoshouxmmc()
   { 	    
  	        
      return this.xiaoshouxmmc;     	
   }
 	 	 private Date yucerq;
	 public void setYucerq(Date yucerq)
	 {
		  this.yucerq = yucerq;
	 }
   public Date getYucerq()
   { 	    
  	  	    if( this.yucerq != null )
	    {
	        return (Date)new ActizDate( this.yucerq.getTime() );
	    }
	          
      return this.yucerq;     	
   }
 	 	 private Long yuanxsycid;
	 public void setYuanxsycid(Long yuanxsycid)
	 {
		  this.yuanxsycid = yuanxsycid;
	 }
   public Long getYuanxsycid()
   { 	    
  	        
      return this.yuanxsycid;     	
   }
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpin getChanpinidRef()
   {
     	return this.chanpinidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc yuanxsycidRef;
	 public void setYuanxsycidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc yuanxsycidRef)
	 {
		  this.yuanxsycidRef = yuanxsycidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc getYuanxsycidRef()
   {
     	return this.yuanxsycidRef;
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
  
	private java.util.Set atzyuceshjlSet;
	public void setAtzyuceshjlSet(java.util.Set atzyuceshjlSet)
	{
		 this.atzyuceshjlSet = atzyuceshjlSet;
	}
  public java.util.Set getAtzyuceshjlSet()
  {
     return this.atzyuceshjlSet;
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