package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchanpinda implements Serializable,IPojo
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
 	 	 private Long chanpin;
	 public void setChanpin(Long chanpin)
	 {
		  this.chanpin = chanpin;
	 }
   public Long getChanpin()
   { 	    
  	        
      return this.chanpin;     	
   }
 	 	 private String danganlx;
	 public void setDanganlx(String danganlx)
	 {
		  this.danganlx = danganlx;
	 }
   public String getDanganlx()
   { 	    
  	        
      return this.danganlx;     	
   }
 	 	 private String danganmc;
	 public void setDanganmc(String danganmc)
	 {
		  this.danganmc = danganmc;
	 }
   public String getDanganmc()
   { 	    
  	        
      return this.danganmc;     	
   }
 	 	 private Date danganyxq;
	 public void setDanganyxq(Date danganyxq)
	 {
		  this.danganyxq = danganyxq;
	 }
   public Date getDanganyxq()
   { 	    
  	  	    if( this.danganyxq != null )
	    {
	        return (Date)new ActizDate( this.danganyxq.getTime() );
	    }
	          
      return this.danganyxq;     	
   }
 	 	 private String danganyjwz;
	 public void setDanganyjwz(String danganyjwz)
	 {
		  this.danganyjwz = danganyjwz;
	 }
   public String getDanganyjwz()
   { 	    
  	        
      return this.danganyjwz;     	
   }
 	 	 private String fazhengjg;
	 public void setFazhengjg(String fazhengjg)
	 {
		  this.fazhengjg = fazhengjg;
	 }
   public String getFazhengjg()
   { 	    
  	        
      return this.fazhengjg;     	
   }
 	 	 private Date fazhengrq;
	 public void setFazhengrq(Date fazhengrq)
	 {
		  this.fazhengrq = fazhengrq;
	 }
   public Date getFazhengrq()
   { 	    
  	  	    if( this.fazhengrq != null )
	    {
	        return (Date)new ActizDate( this.fazhengrq.getTime() );
	    }
	          
      return this.fazhengrq;     	
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
 	 	 private String xuhao;
	 public void setXuhao(String xuhao)
	 {
		  this.xuhao = xuhao;
	 }
   public String getXuhao()
   { 	    
  	        
      return this.xuhao;     	
   }
 	 	 private String youxiaox;
	 public void setYouxiaox(String youxiaox)
	 {
		  this.youxiaox = youxiaox;
	 }
   public String getYouxiaox()
   { 	    
  	        
      return this.youxiaox;     	
   }
 	 	 private String zhengshubh;
	 public void setZhengshubh(String zhengshubh)
	 {
		  this.zhengshubh = zhengshubh;
	 }
   public String getZhengshubh()
   { 	    
  	        
      return this.zhengshubh;     	
   }
 	 	 private String zhongyaoxx;
	 public void setZhongyaoxx(String zhongyaoxx)
	 {
		  this.zhongyaoxx = zhongyaoxx;
	 }
   public String getZhongyaoxx()
   { 	    
  	        
      return this.zhongyaoxx;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef;
	 public void setChanpinRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef)
	 {
		  this.chanpinRef = chanpinRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinRef()
   {
     	return this.chanpinRef;
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