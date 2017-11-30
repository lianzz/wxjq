package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzweixiujl implements Serializable,IPojo
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
 	 	 private String fanghuidd;
	 public void setFanghuidd(String fanghuidd)
	 {
		  this.fanghuidd = fanghuidd;
	 }
   public String getFanghuidd()
   { 	    
  	        
      return this.fanghuidd;     	
   }
 	 	 private String guzhangxx;
	 public void setGuzhangxx(String guzhangxx)
	 {
		  this.guzhangxx = guzhangxx;
	 }
   public String getGuzhangxx()
   { 	    
  	        
      return this.guzhangxx;     	
   }
 	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
   }
 	 	 private Date huichangsj;
	 public void setHuichangsj(Date huichangsj)
	 {
		  this.huichangsj = huichangsj;
	 }
   public Date getHuichangsj()
   { 	    
  	  	    if( this.huichangsj != null )
	    {
	        return (Date)new ActizDate( this.huichangsj.getTime() );
	    }
	          
      return this.huichangsj;     	
   }
 	 	 private Date jihuawcrq;
	 public void setJihuawcrq(Date jihuawcrq)
	 {
		  this.jihuawcrq = jihuawcrq;
	 }
   public Date getJihuawcrq()
   { 	    
  	  	    if( this.jihuawcrq != null )
	    {
	        return (Date)new ActizDate( this.jihuawcrq.getTime() );
	    }
	          
      return this.jihuawcrq;     	
   }
 	 	 private String laiyuan;
	 public void setLaiyuan(String laiyuan)
	 {
		  this.laiyuan = laiyuan;
	 }
   public String getLaiyuan()
   { 	    
  	        
      return this.laiyuan;     	
   }
 	 	 private String lianxidh;
	 public void setLianxidh(String lianxidh)
	 {
		  this.lianxidh = lianxidh;
	 }
   public String getLianxidh()
   { 	    
  	        
      return this.lianxidh;     	
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
 	 	 private Long scrwid;
	 public void setScrwid(Long scrwid)
	 {
		  this.scrwid = scrwid;
	 }
   public Long getScrwid()
   { 	    
  	        
      return this.scrwid;     	
   }
 	 	 private String weixiujl;
	 public void setWeixiujl(String weixiujl)
	 {
		  this.weixiujl = weixiujl;
	 }
   public String getWeixiujl()
   { 	    
  	        
      return this.weixiujl;     	
   }
 	 	 private Date weixiujsrq;
	 public void setWeixiujsrq(Date weixiujsrq)
	 {
		  this.weixiujsrq = weixiujsrq;
	 }
   public Date getWeixiujsrq()
   { 	    
  	  	    if( this.weixiujsrq != null )
	    {
	        return (Date)new ActizDate( this.weixiujsrq.getTime() );
	    }
	          
      return this.weixiujsrq;     	
   }
 	 	 private Date weixiuksrq;
	 public void setWeixiuksrq(Date weixiuksrq)
	 {
		  this.weixiuksrq = weixiuksrq;
	 }
   public Date getWeixiuksrq()
   { 	    
  	  	    if( this.weixiuksrq != null )
	    {
	        return (Date)new ActizDate( this.weixiuksrq.getTime() );
	    }
	          
      return this.weixiuksrq;     	
   }
 	 	 private String weixiur;
	 public void setWeixiur(String weixiur)
	 {
		  this.weixiur = weixiur;
	 }
   public String getWeixiur()
   { 	    
  	        
      return this.weixiur;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef;
	 public void setScrwidRef(com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef)
	 {
		  this.scrwidRef = scrwidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getScrwidRef()
   {
     	return this.scrwidRef;
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
  
	private java.util.Set atzweixiujlzbSet;
	public void setAtzweixiujlzbSet(java.util.Set atzweixiujlzbSet)
	{
		 this.atzweixiujlzbSet = atzweixiujlzbSet;
	}
  public java.util.Set getAtzweixiujlzbSet()
  {
     return this.atzweixiujlzbSet;
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