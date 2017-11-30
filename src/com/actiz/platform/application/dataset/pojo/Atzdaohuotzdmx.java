package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdaohuotzdmx implements Serializable,IPojo
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
	  	 	 private Long atzdaohuotzdid;
	 public void setAtzdaohuotzdid(Long atzdaohuotzdid)
	 {
		  this.atzdaohuotzdid = atzdaohuotzdid;
	 }
   public Long getAtzdaohuotzdid()
   { 	    
  	        
      return this.atzdaohuotzdid;     	
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
 	 	 private String bizhong;
	 public void setBizhong(String bizhong)
	 {
		  this.bizhong = bizhong;
	 }
   public String getBizhong()
   { 	    
  	        
      return this.bizhong;     	
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
 	 	 private String caigoujhbh;
	 public void setCaigoujhbh(String caigoujhbh)
	 {
		  this.caigoujhbh = caigoujhbh;
	 }
   public String getCaigoujhbh()
   { 	    
  	        
      return this.caigoujhbh;     	
   }
 	 	 private Long caigoujhmxid;
	 public void setCaigoujhmxid(Long caigoujhmxid)
	 {
		  this.caigoujhmxid = caigoujhmxid;
	 }
   public Long getCaigoujhmxid()
   { 	    
  	        
      return this.caigoujhmxid;     	
   }
 	 	 private String danwei;
	 public void setDanwei(String danwei)
	 {
		  this.danwei = danwei;
	 }
   public String getDanwei()
   { 	    
  	        
      return this.danwei;     	
   }
 	 	 private Double daohuosl;
	 public void setDaohuosl(Double daohuosl)
	 {
		  this.daohuosl = daohuosl;
	 }
   public Double getDaohuosl()
   { 	    
  	        
      return this.daohuosl;     	
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
 	 	 private String gongyingsbjh;
	 public void setGongyingsbjh(String gongyingsbjh)
	 {
		  this.gongyingsbjh = gongyingsbjh;
	 }
   public String getGongyingsbjh()
   { 	    
  	        
      return this.gongyingsbjh;     	
   }
 	 	 private Double hanshuidj;
	 public void setHanshuidj(Double hanshuidj)
	 {
		  this.hanshuidj = hanshuidj;
	 }
   public Double getHanshuidj()
   { 	    
  	        
      return this.hanshuidj;     	
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
 	 	 private Long rangbujsdid;
	 public void setRangbujsdid(Long rangbujsdid)
	 {
		  this.rangbujsdid = rangbujsdid;
	 }
   public Long getRangbujsdid()
   { 	    
  	        
      return this.rangbujsdid;     	
   }
 	 	 private String shengchancj;
	 public void setShengchancj(String shengchancj)
	 {
		  this.shengchancj = shengchancj;
	 }
   public String getShengchancj()
   { 	    
  	        
      return this.shengchancj;     	
   }
 	 	 private Double weidaohsl;
	 public void setWeidaohsl(Double weidaohsl)
	 {
		  this.weidaohsl = weidaohsl;
	 }
   public Double getWeidaohsl()
   { 	    
  	        
      return this.weidaohsl;     	
   }
 	 	 private Double whanshuidj;
	 public void setWhanshuidj(Double whanshuidj)
	 {
		  this.whanshuidj = whanshuidj;
	 }
   public Double getWhanshuidj()
   { 	    
  	        
      return this.whanshuidj;     	
   }
 	 	 private Double wrksl;
	 public void setWrksl(Double wrksl)
	 {
		  this.wrksl = wrksl;
	 }
   public Double getWrksl()
   { 	    
  	        
      return this.wrksl;     	
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
 	 	 private String wuliaims;
	 public void setWuliaims(String wuliaims)
	 {
		  this.wuliaims = wuliaims;
	 }
   public String getWuliaims()
   { 	    
  	        
      return this.wuliaims;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzdaohuotzd atzdaohuotzdidRef;
	 public void setAtzdaohuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzdaohuotzd atzdaohuotzdidRef)
	 {
		  this.atzdaohuotzdidRef = atzdaohuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdaohuotzd getAtzdaohuotzdidRef()
   {
     	return this.atzdaohuotzdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx caigoujhmxidRef;
	 public void setCaigoujhmxidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx caigoujhmxidRef)
	 {
		  this.caigoujhmxidRef = caigoujhmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx getCaigoujhmxidRef()
   {
     	return this.caigoujhmxidRef;
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