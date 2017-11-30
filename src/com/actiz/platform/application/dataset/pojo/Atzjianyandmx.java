package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjianyandmx implements Serializable,IPojo
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
	  	 	 private String aqlyxsp;
	 public void setAqlyxsp(String aqlyxsp)
	 {
		  this.aqlyxsp = aqlyxsp;
	 }
   public String getAqlyxsp()
   { 	    
  	        
      return this.aqlyxsp;     	
   }
 	 	 private Long atzjianyandid;
	 public void setAtzjianyandid(Long atzjianyandid)
	 {
		  this.atzjianyandid = atzjianyandid;
	 }
   public Long getAtzjianyandid()
   { 	    
  	        
      return this.atzjianyandid;     	
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
 	 	 private Double buhegsl;
	 public void setBuhegsl(Double buhegsl)
	 {
		  this.buhegsl = buhegsl;
	 }
   public Double getBuhegsl()
   { 	    
  	        
      return this.buhegsl;     	
   }
 	 	 private Long caigouhtmxid;
	 public void setCaigouhtmxid(Long caigouhtmxid)
	 {
		  this.caigouhtmxid = caigouhtmxid;
	 }
   public Long getCaigouhtmxid()
   { 	    
  	        
      return this.caigouhtmxid;     	
   }
 	 	 private Long ceshijlid;
	 public void setCeshijlid(Long ceshijlid)
	 {
		  this.ceshijlid = ceshijlid;
	 }
   public Long getCeshijlid()
   { 	    
  	        
      return this.ceshijlid;     	
   }
 	 	 private Double chaiyi;
	 public void setChaiyi(Double chaiyi)
	 {
		  this.chaiyi = chaiyi;
	 }
   public Double getChaiyi()
   { 	    
  	        
      return this.chaiyi;     	
   }
 	 	 private Double chouyangsl;
	 public void setChouyangsl(Double chouyangsl)
	 {
		  this.chouyangsl = chouyangsl;
	 }
   public Double getChouyangsl()
   { 	    
  	        
      return this.chouyangsl;     	
   }
 	 	 private Double drkshuliang;
	 public void setDrkshuliang(Double drkshuliang)
	 {
		  this.drkshuliang = drkshuliang;
	 }
   public Double getDrkshuliang()
   { 	    
  	        
      return this.drkshuliang;     	
   }
 	 	 private Date daoqirq;
	 public void setDaoqirq(Date daoqirq)
	 {
		  this.daoqirq = daoqirq;
	 }
   public Date getDaoqirq()
   { 	    
  	  	    if( this.daoqirq != null )
	    {
	        return (Date)new ActizDate( this.daoqirq.getTime() );
	    }
	          
      return this.daoqirq;     	
   }
 	 	 private Double dinggousl;
	 public void setDinggousl(Double dinggousl)
	 {
		  this.dinggousl = dinggousl;
	 }
   public Double getDinggousl()
   { 	    
  	        
      return this.dinggousl;     	
   }
 	 	 private Double hegesl;
	 public void setHegesl(Double hegesl)
	 {
		  this.hegesl = hegesl;
	 }
   public Double getHegesl()
   { 	    
  	        
      return this.hegesl;     	
   }
 	 	 private String jianyanjl;
	 public void setJianyanjl(String jianyanjl)
	 {
		  this.jianyanjl = jianyanjl;
	 }
   public String getJianyanjl()
   { 	    
  	        
      return this.jianyanjl;     	
   }
 	 	 private String jianyanjg;
	 public void setJianyanjg(String jianyanjg)
	 {
		  this.jianyanjg = jianyanjg;
	 }
   public String getJianyanjg()
   { 	    
  	        
      return this.jianyanjg;     	
   }
 	 	 private String jianyanlx;
	 public void setJianyanlx(String jianyanlx)
	 {
		  this.jianyanlx = jianyanlx;
	 }
   public String getJianyanlx()
   { 	    
  	        
      return this.jianyanlx;     	
   }
 	 	 private Date jianyanrq;
	 public void setJianyanrq(Date jianyanrq)
	 {
		  this.jianyanrq = jianyanrq;
	 }
   public Date getJianyanrq()
   { 	    
  	  	    if( this.jianyanrq != null )
	    {
	        return (Date)new ActizDate( this.jianyanrq.getTime() );
	    }
	          
      return this.jianyanrq;     	
   }
 	 	 private Long kuweiid;
	 public void setKuweiid(Long kuweiid)
	 {
		  this.kuweiid = kuweiid;
	 }
   public Long getKuweiid()
   { 	    
  	        
      return this.kuweiid;     	
   }
 	 	 private Double laihuosl;
	 public void setLaihuosl(Double laihuosl)
	 {
		  this.laihuosl = laihuosl;
	 }
   public Double getLaihuosl()
   { 	    
  	        
      return this.laihuosl;     	
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
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
   }
 	 	 private Long rangbujsdid;
	 public void setRangbujsdid(Long rangbujsdid)
	 {
		  this.rangbujsdid = rangbujsdid;
	 }
   public Long getRangbujsdid()
   { 	    
  	        
      return this.rangbujsdid;     	
   }
 	 	 private Long scrwmxid;
	 public void setScrwmxid(Long scrwmxid)
	 {
		  this.scrwmxid = scrwmxid;
	 }
   public Long getScrwmxid()
   { 	    
  	        
      return this.scrwmxid;     	
   }
 	 	 private Date shengchanrq;
	 public void setShengchanrq(Date shengchanrq)
	 {
		  this.shengchanrq = shengchanrq;
	 }
   public Date getShengchanrq()
   { 	    
  	  	    if( this.shengchanrq != null )
	    {
	        return (Date)new ActizDate( this.shengchanrq.getTime() );
	    }
	          
      return this.shengchanrq;     	
   }
 	 	 private Double shidiansl;
	 public void setShidiansl(Double shidiansl)
	 {
		  this.shidiansl = shidiansl;
	 }
   public Double getShidiansl()
   { 	    
  	        
      return this.shidiansl;     	
   }
 	 	 private String shifoulrbg;
	 public void setShifoulrbg(String shifoulrbg)
	 {
		  this.shifoulrbg = shifoulrbg;
	 }
   public String getShifoulrbg()
   { 	    
  	        
      return this.shifoulrbg;     	
   }
 	 	 private Long teshufxdid;
	 public void setTeshufxdid(Long teshufxdid)
	 {
		  this.teshufxdid = teshufxdid;
	 }
   public Long getTeshufxdid()
   { 	    
  	        
      return this.teshufxdid;     	
   }
 	 	 private Double weirksl;
	 public void setWeirksl(Double weirksl)
	 {
		  this.weirksl = weirksl;
	 }
   public Double getWeirksl()
   { 	    
  	        
      return this.weirksl;     	
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
 	 	 private Double yrkshuliang;
	 public void setYrkshuliang(Double yrkshuliang)
	 {
		  this.yrkshuliang = yrkshuliang;
	 }
   public Double getYrkshuliang()
   { 	    
  	        
      return this.yrkshuliang;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzjianyand atzjianyandidRef;
	 public void setAtzjianyandidRef(com.actiz.platform.application.dataset.pojo.Atzjianyand atzjianyandidRef)
	 {
		  this.atzjianyandidRef = atzjianyandidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyand getAtzjianyandidRef()
   {
     	return this.atzjianyandidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx caigouhtmxidRef;
	 public void setCaigouhtmxidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx caigouhtmxidRef)
	 {
		  this.caigouhtmxidRef = caigouhtmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx getCaigouhtmxidRef()
   {
     	return this.caigouhtmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzceshijl ceshijlidRef;
	 public void setCeshijlidRef(com.actiz.platform.application.dataset.pojo.Atzceshijl ceshijlidRef)
	 {
		  this.ceshijlidRef = ceshijlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshijl getCeshijlidRef()
   {
     	return this.ceshijlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkuwei kuweiidRef;
	 public void setKuweiidRef(com.actiz.platform.application.dataset.pojo.Atzkuwei kuweiidRef)
	 {
		  this.kuweiidRef = kuweiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkuwei getKuweiidRef()
   {
     	return this.kuweiidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzrangbujsd rangbujsdidRef;
	 public void setRangbujsdidRef(com.actiz.platform.application.dataset.pojo.Atzrangbujsd rangbujsdidRef)
	 {
		  this.rangbujsdidRef = rangbujsdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzrangbujsd getRangbujsdidRef()
   {
     	return this.rangbujsdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef;
	 public void setScrwmxidRef(com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef)
	 {
		  this.scrwmxidRef = scrwmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrwmx getScrwmxidRef()
   {
     	return this.scrwmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzteshufxd teshufxdidRef;
	 public void setTeshufxdidRef(com.actiz.platform.application.dataset.pojo.Atzteshufxd teshufxdidRef)
	 {
		  this.teshufxdidRef = teshufxdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzteshufxd getTeshufxdidRef()
   {
     	return this.teshufxdidRef;
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