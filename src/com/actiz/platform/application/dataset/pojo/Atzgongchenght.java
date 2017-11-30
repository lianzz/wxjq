package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgongchenght implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private String duifanggs;
	 public void setDuifanggs(String duifanggs)
	 {
		  this.duifanggs = duifanggs;
	 }
   public String getDuifanggs()
   { 	    
  	        
      return this.duifanggs;     	
   }
 	 	 private String duifangkhh;
	 public void setDuifangkhh(String duifangkhh)
	 {
		  this.duifangkhh = duifangkhh;
	 }
   public String getDuifangkhh()
   { 	    
  	        
      return this.duifangkhh;     	
   }
 	 	 private String duifanglx;
	 public void setDuifanglx(String duifanglx)
	 {
		  this.duifanglx = duifanglx;
	 }
   public String getDuifanglx()
   { 	    
  	        
      return this.duifanglx;     	
   }
 	 	 private String duifangyhzh;
	 public void setDuifangyhzh(String duifangyhzh)
	 {
		  this.duifangyhzh = duifangyhzh;
	 }
   public String getDuifangyhzh()
   { 	    
  	        
      return this.duifangyhzh;     	
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
 	 	 private String hetonglx;
	 public void setHetonglx(String hetonglx)
	 {
		  this.hetonglx = hetonglx;
	 }
   public String getHetonglx()
   { 	    
  	        
      return this.hetonglx;     	
   }
 	 	 private String hetongnr;
	 public void setHetongnr(String hetongnr)
	 {
		  this.hetongnr = hetongnr;
	 }
   public String getHetongnr()
   { 	    
  	        
      return this.hetongnr;     	
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
 	 	 private String muqianzt;
	 public void setMuqianzt(String muqianzt)
	 {
		  this.muqianzt = muqianzt;
	 }
   public String getMuqianzt()
   { 	    
  	        
      return this.muqianzt;     	
   }
 	 	 private String hetongbh;
	 public void setHetongbh(String hetongbh)
	 {
		  this.hetongbh = hetongbh;
	 }
   public String getHetongbh()
   { 	    
  	        
      return this.hetongbh;     	
   }
 	 	 private String hetongmc;
	 public void setHetongmc(String hetongmc)
	 {
		  this.hetongmc = hetongmc;
	 }
   public String getHetongmc()
   { 	    
  	        
      return this.hetongmc;     	
   }
 	 	 private String hetongqx;
	 public void setHetongqx(String hetongqx)
	 {
		  this.hetongqx = hetongqx;
	 }
   public String getHetongqx()
   { 	    
  	        
      return this.hetongqx;     	
   }
 	 	 private Date shengxiaorq;
	 public void setShengxiaorq(Date shengxiaorq)
	 {
		  this.shengxiaorq = shengxiaorq;
	 }
   public Date getShengxiaorq()
   { 	    
  	  	    if( this.shengxiaorq != null )
	    {
	        return (Date)new ActizDate( this.shengxiaorq.getTime() );
	    }
	          
      return this.shengxiaorq;     	
   }
 	 	 private Date zhongzhirq;
	 public void setZhongzhirq(Date zhongzhirq)
	 {
		  this.zhongzhirq = zhongzhirq;
	 }
   public Date getZhongzhirq()
   { 	    
  	  	    if( this.zhongzhirq != null )
	    {
	        return (Date)new ActizDate( this.zhongzhirq.getTime() );
	    }
	          
      return this.zhongzhirq;     	
   }
 	 	 private String wofanglx;
	 public void setWofanglx(String wofanglx)
	 {
		  this.wofanglx = wofanglx;
	 }
   public String getWofanglx()
   { 	    
  	        
      return this.wofanglx;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzkjxyfukuanSet;
	public void setAtzkjxyfukuanSet(java.util.Set atzkjxyfukuanSet)
	{
		 this.atzkjxyfukuanSet = atzkjxyfukuanSet;
	}
  public java.util.Set getAtzkjxyfukuanSet()
  {
     return this.atzkjxyfukuanSet;
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