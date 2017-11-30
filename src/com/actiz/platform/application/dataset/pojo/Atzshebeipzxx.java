package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeipzxx implements Serializable,IPojo
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
 	 	 private String caowei;
	 public void setCaowei(String caowei)
	 {
		  this.caowei = caowei;
	 }
   public String getCaowei()
   { 	    
  	        
      return this.caowei;     	
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
 	 	 private String fujianxx;
	 public void setFujianxx(String fujianxx)
	 {
		  this.fujianxx = fujianxx;
	 }
   public String getFujianxx()
   { 	    
  	        
      return this.fujianxx;     	
   }
 	 	 private String jiguich;
	 public void setJiguich(String jiguich)
	 {
		  this.jiguich = jiguich;
	 }
   public String getJiguich()
   { 	    
  	        
      return this.jiguich;     	
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
 	 	 private String mokuailx;
	 public void setMokuailx(String mokuailx)
	 {
		  this.mokuailx = mokuailx;
	 }
   public String getMokuailx()
   { 	    
  	        
      return this.mokuailx;     	
   }
 	 	 private String mokuaimc;
	 public void setMokuaimc(String mokuaimc)
	 {
		  this.mokuaimc = mokuaimc;
	 }
   public String getMokuaimc()
   { 	    
  	        
      return this.mokuaimc;     	
   }
 	 	 private String ruanjianbb;
	 public void setRuanjianbb(String ruanjianbb)
	 {
		  this.ruanjianbb = ruanjianbb;
	 }
   public String getRuanjianbb()
   { 	    
  	        
      return this.ruanjianbb;     	
   }
 	 	 private String suozaics;
	 public void setSuozaics(String suozaics)
	 {
		  this.suozaics = suozaics;
	 }
   public String getSuozaics()
   { 	    
  	        
      return this.suozaics;     	
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
 	 	 private String wuliaosn;
	 public void setWuliaosn(String wuliaosn)
	 {
		  this.wuliaosn = wuliaosn;
	 }
   public String getWuliaosn()
   { 	    
  	        
      return this.wuliaosn;     	
   }
 	 	 private Long xitongid;
	 public void setXitongid(Long xitongid)
	 {
		  this.xitongid = xitongid;
	 }
   public Long getXitongid()
   { 	    
  	        
      return this.xitongid;     	
   }
 	 	 private String yingjianbb;
	 public void setYingjianbb(String yingjianbb)
	 {
		  this.yingjianbb = yingjianbb;
	 }
   public String getYingjianbb()
   { 	    
  	        
      return this.yingjianbb;     	
   }
 	 	 private String zhandianbh;
	 public void setZhandianbh(String zhandianbh)
	 {
		  this.zhandianbh = zhandianbh;
	 }
   public String getZhandianbh()
   { 	    
  	        
      return this.zhandianbh;     	
   }
 	 	 private String zhandianmc;
	 public void setZhandianmc(String zhandianmc)
	 {
		  this.zhandianmc = zhandianmc;
	 }
   public String getZhandianmc()
   { 	    
  	        
      return this.zhandianmc;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef;
	 public void setXitongidRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef)
	 {
		  this.xitongidRef = xitongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongidRef()
   {
     	return this.xitongidRef;
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