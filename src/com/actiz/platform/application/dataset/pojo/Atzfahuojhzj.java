package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfahuojhzj implements Serializable,IPojo
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
 	 	 private Long churukdid;
	 public void setChurukdid(Long churukdid)
	 {
		  this.churukdid = churukdid;
	 }
   public Long getChurukdid()
   { 	    
  	        
      return this.churukdid;     	
   }
 	 	 private Long gongchengid;
	 public void setGongchengid(Long gongchengid)
	 {
		  this.gongchengid = gongchengid;
	 }
   public Long getGongchengid()
   { 	    
  	        
      return this.gongchengid;     	
   }
 	 	 private String huoyundbh;
	 public void setHuoyundbh(String huoyundbh)
	 {
		  this.huoyundbh = huoyundbh;
	 }
   public String getHuoyundbh()
   { 	    
  	        
      return this.huoyundbh;     	
   }
 	 	 private String huoyunlxdh;
	 public void setHuoyunlxdh(String huoyunlxdh)
	 {
		  this.huoyunlxdh = huoyunlxdh;
	 }
   public String getHuoyunlxdh()
   { 	    
  	        
      return this.huoyunlxdh;     	
   }
 	 	 private String huoyunlxr;
	 public void setHuoyunlxr(String huoyunlxr)
	 {
		  this.huoyunlxr = huoyunlxr;
	 }
   public String getHuoyunlxr()
   { 	    
  	        
      return this.huoyunlxr;     	
   }
 	 	 private Integer muxiangs;
	 public void setMuxiangs(Integer muxiangs)
	 {
		  this.muxiangs = muxiangs;
	 }
   public Integer getMuxiangs()
   { 	    
  	        
      return this.muxiangs;     	
   }
 	 	 private Integer qitaxs;
	 public void setQitaxs(Integer qitaxs)
	 {
		  this.qitaxs = qitaxs;
	 }
   public Integer getQitaxs()
   { 	    
  	        
      return this.qitaxs;     	
   }
 	 	 private String qianshour;
	 public void setQianshour(String qianshour)
	 {
		  this.qianshour = qianshour;
	 }
   public String getQianshour()
   { 	    
  	        
      return this.qianshour;     	
   }
 	 	 private Date qianshourq;
	 public void setQianshourq(Date qianshourq)
	 {
		  this.qianshourq = qianshourq;
	 }
   public Date getQianshourq()
   { 	    
  	  	    if( this.qianshourq != null )
	    {
	        return (Date)new ActizDate( this.qianshourq.getTime() );
	    }
	          
      return this.qianshourq;     	
   }
 	 	 private Date shijifhrq;
	 public void setShijifhrq(Date shijifhrq)
	 {
		  this.shijifhrq = shijifhrq;
	 }
   public Date getShijifhrq()
   { 	    
  	  	    if( this.shijifhrq != null )
	    {
	        return (Date)new ActizDate( this.shijifhrq.getTime() );
	    }
	          
      return this.shijifhrq;     	
   }
 	 	 private String shifoubf;
	 public void setShifoubf(String shifoubf)
	 {
		  this.shifoubf = shifoubf;
	 }
   public String getShifoubf()
   { 	    
  	        
      return this.shifoubf;     	
   }
 	 	 private String shifouqf;
	 public void setShifouqf(String shifouqf)
	 {
		  this.shifouqf = shifouqf;
	 }
   public String getShifouqf()
   { 	    
  	        
      return this.shifouqf;     	
   }
 	 	 private Date tongzhidxfrq;
	 public void setTongzhidxfrq(Date tongzhidxfrq)
	 {
		  this.tongzhidxfrq = tongzhidxfrq;
	 }
   public Date getTongzhidxfrq()
   { 	    
  	  	    if( this.tongzhidxfrq != null )
	    {
	        return (Date)new ActizDate( this.tongzhidxfrq.getTime() );
	    }
	          
      return this.tongzhidxfrq;     	
   }
 	 	 private Date yqysgsdhrq;
	 public void setYqysgsdhrq(Date yqysgsdhrq)
	 {
		  this.yqysgsdhrq = yqysgsdhrq;
	 }
   public Date getYqysgsdhrq()
   { 	    
  	  	    if( this.yqysgsdhrq != null )
	    {
	        return (Date)new ActizDate( this.yqysgsdhrq.getTime() );
	    }
	          
      return this.yqysgsdhrq;     	
   }
 	 	 private String yunshufs;
	 public void setYunshufs(String yunshufs)
	 {
		  this.yunshufs = yunshufs;
	 }
   public String getYunshufs()
   { 	    
  	        
      return this.yunshufs;     	
   }
 	 	 private String yunshugs;
	 public void setYunshugs(String yunshugs)
	 {
		  this.yunshugs = yunshugs;
	 }
   public String getYunshugs()
   { 	    
  	        
      return this.yunshugs;     	
   }
 	 	 private Integer zhixiangs;
	 public void setZhixiangs(Integer zhixiangs)
	 {
		  this.zhixiangs = zhixiangs;
	 }
   public Integer getZhixiangs()
   { 	    
  	        
      return this.zhixiangs;     	
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
 	 	 private String zxddh;
	 public void setZxddh(String zxddh)
	 {
		  this.zxddh = zxddh;
	 }
   public String getZxddh()
   { 	    
  	        
      return this.zxddh;     	
   }
 	 	 private String zjsm;
	 public void setZjsm(String zjsm)
	 {
		  this.zjsm = zjsm;
	 }
   public String getZjsm()
   { 	    
  	        
      return this.zjsm;     	
   }
 	 	 private Integer zongxiangs;
	 public void setZongxiangs(Integer zongxiangs)
	 {
		  this.zongxiangs = zongxiangs;
	 }
   public Integer getZongxiangs()
   { 	    
  	        
      return this.zongxiangs;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukd churukdidRef;
	 public void setChurukdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukd churukdidRef)
	 {
		  this.churukdidRef = churukdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukd getChurukdidRef()
   {
     	return this.churukdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehugc gongchengidRef;
	 public void setGongchengidRef(com.actiz.platform.application.dataset.pojo.Atzkehugc gongchengidRef)
	 {
		  this.gongchengidRef = gongchengidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehugc getGongchengidRef()
   {
     	return this.gongchengidRef;
   }
  
	private java.util.Set atzqianfasbmxSet;
	public void setAtzqianfasbmxSet(java.util.Set atzqianfasbmxSet)
	{
		 this.atzqianfasbmxSet = atzqianfasbmxSet;
	}
  public java.util.Set getAtzqianfasbmxSet()
  {
     return this.atzqianfasbmxSet;
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