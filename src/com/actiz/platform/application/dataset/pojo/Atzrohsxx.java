package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzrohsxx implements Serializable,IPojo
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
 	 	 private String fuherohs;
	 public void setFuherohs(String fuherohs)
	 {
		  this.fuherohs = fuherohs;
	 }
   public String getFuherohs()
   { 	    
  	        
      return this.fuherohs;     	
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
 	 	 private String cd;
	 public void setCd(String cd)
	 {
		  this.cd = cd;
	 }
   public String getCd()
   { 	    
  	        
      return this.cd;     	
   }
 	 	 private String gong;
	 public void setGong(String gong)
	 {
		  this.gong = gong;
	 }
   public String getGong()
   { 	    
  	        
      return this.gong;     	
   }
 	 	 private String liujiag;
	 public void setLiujiag(String liujiag)
	 {
		  this.liujiag = liujiag;
	 }
   public String getLiujiag()
   { 	    
  	        
      return this.liujiag;     	
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
 	 	 private String pbds;
	 public void setPbds(String pbds)
	 {
		  this.pbds = pbds;
	 }
   public String getPbds()
   { 	    
  	        
      return this.pbds;     	
   }
 	 	 private String ppb;
	 public void setPpb(String ppb)
	 {
		  this.ppb = ppb;
	 }
   public String getPpb()
   { 	    
  	        
      return this.ppb;     	
   }
 	 	 private String qian;
	 public void setQian(String qian)
	 {
		  this.qian = qian;
	 }
   public String getQian()
   { 	    
  	        
      return this.qian;     	
   }
 	 	 private String rohszlbh;
	 public void setRohszlbh(String rohszlbh)
	 {
		  this.rohszlbh = rohszlbh;
	 }
   public String getRohszlbh()
   { 	    
  	        
      return this.rohszlbh;     	
   }
 	 	 private Long sccjid;
	 public void setSccjid(Long sccjid)
	 {
		  this.sccjid = sccjid;
	 }
   public Long getSccjid()
   { 	    
  	        
      return this.sccjid;     	
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
 	 	 private Date youxiaoq;
	 public void setYouxiaoq(Date youxiaoq)
	 {
		  this.youxiaoq = youxiaoq;
	 }
   public Date getYouxiaoq()
   { 	    
  	  	    if( this.youxiaoq != null )
	    {
	        return (Date)new ActizDate( this.youxiaoq.getTime() );
	    }
	          
      return this.youxiaoq;     	
   }
 	 	 private Long yuanrs;
	 public void setYuanrs(Long yuanrs)
	 {
		  this.yuanrs = yuanrs;
	 }
   public Long getYuanrs()
   { 	    
  	        
      return this.yuanrs;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj sccjidRef;
	 public void setSccjidRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj sccjidRef)
	 {
		  this.sccjidRef = sccjidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getSccjidRef()
   {
     	return this.sccjidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzrohsxx yuanrsRef;
	 public void setYuanrsRef(com.actiz.platform.application.dataset.pojo.Atzrohsxx yuanrsRef)
	 {
		  this.yuanrsRef = yuanrsRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzrohsxx getYuanrsRef()
   {
     	return this.yuanrsRef;
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