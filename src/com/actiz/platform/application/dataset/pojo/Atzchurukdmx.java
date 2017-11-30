package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukdmx implements Serializable,IPojo
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
	  	 	 private Long atzchurukdid;
	 public void setAtzchurukdid(Long atzchurukdid)
	 {
		  this.atzchurukdid = atzchurukdid;
	 }
   public Long getAtzchurukdid()
   { 	    
  	        
      return this.atzchurukdid;     	
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
 	 	 private Double bencijhsl;
	 public void setBencijhsl(Double bencijhsl)
	 {
		  this.bencijhsl = bencijhsl;
	 }
   public Double getBencijhsl()
   { 	    
  	        
      return this.bencijhsl;     	
   }
 	 	 private Long cangkuid;
	 public void setCangkuid(Long cangkuid)
	 {
		  this.cangkuid = cangkuid;
	 }
   public Long getCangkuid()
   { 	    
  	        
      return this.cangkuid;     	
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
 	 	 private Long crkjhmxid;
	 public void setCrkjhmxid(Long crkjhmxid)
	 {
		  this.crkjhmxid = crkjhmxid;
	 }
   public Long getCrkjhmxid()
   { 	    
  	        
      return this.crkjhmxid;     	
   }
 	 	 private String cunfangwz;
	 public void setCunfangwz(String cunfangwz)
	 {
		  this.cunfangwz = cunfangwz;
	 }
   public String getCunfangwz()
   { 	    
  	        
      return this.cunfangwz;     	
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
 	 	 private Long jianyandmxid;
	 public void setJianyandmxid(Long jianyandmxid)
	 {
		  this.jianyandmxid = jianyandmxid;
	 }
   public Long getJianyandmxid()
   { 	    
  	        
      return this.jianyandmxid;     	
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
 	 	 private String shifouylh;
	 public void setShifouylh(String shifouylh)
	 {
		  this.shifouylh = shifouylh;
	 }
   public String getShifouylh()
   { 	    
  	        
      return this.shifouylh;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Double weizxsl;
	 public void setWeizxsl(Double weizxsl)
	 {
		  this.weizxsl = weizxsl;
	 }
   public Double getWeizxsl()
   { 	    
  	        
      return this.weizxsl;     	
   }
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
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
 	 	 private Double zmkucun;
	 public void setZmkucun(Double zmkucun)
	 {
		  this.zmkucun = zmkucun;
	 }
   public Double getZmkucun()
   { 	    
  	        
      return this.zmkucun;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukd atzchurukdidRef;
	 public void setAtzchurukdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukd atzchurukdidRef)
	 {
		  this.atzchurukdidRef = atzchurukdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukd getAtzchurukdidRef()
   {
     	return this.atzchurukdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef;
	 public void setCangkuidRef(com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef)
	 {
		  this.cangkuidRef = cangkuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcangku getCangkuidRef()
   {
     	return this.cangkuidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzjianyandmx jianyandmxidRef;
	 public void setJianyandmxidRef(com.actiz.platform.application.dataset.pojo.Atzjianyandmx jianyandmxidRef)
	 {
		  this.jianyandmxidRef = jianyandmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyandmx getJianyandmxidRef()
   {
     	return this.jianyandmxidRef;
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