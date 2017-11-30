package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehuxtxx implements Serializable,IPojo
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
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private String dizhi;
	 public void setDizhi(String dizhi)
	 {
		  this.dizhi = dizhi;
	 }
   public String getDizhi()
   { 	    
  	        
      return this.dizhi;     	
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
 	 	 private String hechary;
	 public void setHechary(String hechary)
	 {
		  this.hechary = hechary;
	 }
   public String getHechary()
   { 	    
  	        
      return this.hechary;     	
   }
 	 	 private Date hecharq;
	 public void setHecharq(Date hecharq)
	 {
		  this.hecharq = hecharq;
	 }
   public Date getHecharq()
   { 	    
  	  	    if( this.hecharq != null )
	    {
	        return (Date)new ActizDate( this.hecharq.getTime() );
	    }
	          
      return this.hecharq;     	
   }
 	 	 private Long hetong;
	 public void setHetong(Long hetong)
	 {
		  this.hetong = hetong;
	 }
   public Long getHetong()
   { 	    
  	        
      return this.hetong;     	
   }
 	 	 private String jifang;
	 public void setJifang(String jifang)
	 {
		  this.jifang = jifang;
	 }
   public String getJifang()
   { 	    
  	        
      return this.jifang;     	
   }
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
   }
 	 	 private String lianxifs;
	 public void setLianxifs(String lianxifs)
	 {
		  this.lianxifs = lianxifs;
	 }
   public String getLianxifs()
   { 	    
  	        
      return this.lianxifs;     	
   }
 	 	 private String lianxir;
	 public void setLianxir(String lianxir)
	 {
		  this.lianxir = lianxir;
	 }
   public String getLianxir()
   { 	    
  	        
      return this.lianxir;     	
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
 	 	 private String omsbb;
	 public void setOmsbb(String omsbb)
	 {
		  this.omsbb = omsbb;
	 }
   public String getOmsbb()
   { 	    
  	        
      return this.omsbb;     	
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
 	 	 private String shishiry;
	 public void setShishiry(String shishiry)
	 {
		  this.shishiry = shishiry;
	 }
   public String getShishiry()
   { 	    
  	        
      return this.shishiry;     	
   }
 	 	 private Date shishirq;
	 public void setShishirq(Date shishirq)
	 {
		  this.shishirq = shishirq;
	 }
   public Date getShishirq()
   { 	    
  	  	    if( this.shishirq != null )
	    {
	        return (Date)new ActizDate( this.shishirq.getTime() );
	    }
	          
      return this.shishirq;     	
   }
 	 	 private Long xitong;
	 public void setXitong(Long xitong)
	 {
		  this.xitong = xitong;
	 }
   public Long getXitong()
   { 	    
  	        
      return this.xitong;     	
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private String xitongmc;
	 public void setXitongmc(String xitongmc)
	 {
		  this.xitongmc = xitongmc;
	 }
   public String getXitongmc()
   { 	    
  	        
      return this.xitongmc;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinidRef()
   {
     	return this.chanpinidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongRef;
	 public void setHetongRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongRef)
	 {
		  this.hetongRef = hetongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongRef()
   {
     	return this.hetongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehugc xitongRef;
	 public void setXitongRef(com.actiz.platform.application.dataset.pojo.Atzkehugc xitongRef)
	 {
		  this.xitongRef = xitongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehugc getXitongRef()
   {
     	return this.xitongRef;
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