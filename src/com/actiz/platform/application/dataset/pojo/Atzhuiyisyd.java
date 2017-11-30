package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhuiyisyd implements Serializable,IPojo
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
	  	 	 private String canyurids;
	 public void setCanyurids(String canyurids)
	 {
		  this.canyurids = canyurids;
	 }
   public String getCanyurids()
   { 	    
  	        
      return this.canyurids;     	
   }
 	 	 private String canyur;
	 public void setCanyur(String canyur)
	 {
		  this.canyur = canyur;
	 }
   public String getCanyur()
   { 	    
  	        
      return this.canyur;     	
   }
 	 	 private String huiyijj;
	 public void setHuiyijj(String huiyijj)
	 {
		  this.huiyijj = huiyijj;
	 }
   public String getHuiyijj()
   { 	    
  	        
      return this.huiyijj;     	
   }
 	 	 private String huiyijssj;
	 public void setHuiyijssj(String huiyijssj)
	 {
		  this.huiyijssj = huiyijssj;
	 }
   public String getHuiyijssj()
   { 	    
  	        
      return this.huiyijssj;     	
   }
 	 	 private String huiyikssj;
	 public void setHuiyikssj(String huiyikssj)
	 {
		  this.huiyikssj = huiyikssj;
	 }
   public String getHuiyikssj()
   { 	    
  	        
      return this.huiyikssj;     	
   }
 	 	 private String huiyimc;
	 public void setHuiyimc(String huiyimc)
	 {
		  this.huiyimc = huiyimc;
	 }
   public String getHuiyimc()
   { 	    
  	        
      return this.huiyimc;     	
   }
 	 	 private Long huiyishm;
	 public void setHuiyishm(Long huiyishm)
	 {
		  this.huiyishm = huiyishm;
	 }
   public Long getHuiyishm()
   { 	    
  	        
      return this.huiyishm;     	
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
 	 	 private String lianxirbm;
	 public void setLianxirbm(String lianxirbm)
	 {
		  this.lianxirbm = lianxirbm;
	 }
   public String getLianxirbm()
   { 	    
  	        
      return this.lianxirbm;     	
   }
 	 	 private String lianxirdh;
	 public void setLianxirdh(String lianxirdh)
	 {
		  this.lianxirdh = lianxirdh;
	 }
   public String getLianxirdh()
   { 	    
  	        
      return this.lianxirdh;     	
   }
 	 	 private String lianxiryj;
	 public void setLianxiryj(String lianxiryj)
	 {
		  this.lianxiryj = lianxiryj;
	 }
   public String getLianxiryj()
   { 	    
  	        
      return this.lianxiryj;     	
   }
 	 	 private String shenqingdbh;
	 public void setShenqingdbh(String shenqingdbh)
	 {
		  this.shenqingdbh = shenqingdbh;
	 }
   public String getShenqingdbh()
   { 	    
  	        
      return this.shenqingdbh;     	
   }
 	 	 private Long touyingy;
	 public void setTouyingy(Long touyingy)
	 {
		  this.touyingy = touyingy;
	 }
   public Long getTouyingy()
   { 	    
  	        
      return this.touyingy;     	
   }
 	 	 private String yuhuirs;
	 public void setYuhuirs(String yuhuirs)
	 {
		  this.yuhuirs = yuhuirs;
	 }
   public String getYuhuirs()
   { 	    
  	        
      return this.yuhuirs;     	
   }
 	 	 private Date yudingrq;
	 public void setYudingrq(Date yudingrq)
	 {
		  this.yudingrq = yudingrq;
	 }
   public Date getYudingrq()
   { 	    
  	  	    if( this.yudingrq != null )
	    {
	        return (Date)new ActizDate( this.yudingrq.getTime() );
	    }
	          
      return this.yudingrq;     	
   }
 	 	 private String yuangongid;
	 public void setYuangongid(String yuangongid)
	 {
		  this.yuangongid = yuangongid;
	 }
   public String getYuangongid()
   { 	    
  	        
      return this.yuangongid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhuiyis huiyishmRef;
	 public void setHuiyishmRef(com.actiz.platform.application.dataset.pojo.Atzhuiyis huiyishmRef)
	 {
		  this.huiyishmRef = huiyishmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhuiyis getHuiyishmRef()
   {
     	return this.huiyishmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztouyingy touyingyRef;
	 public void setTouyingyRef(com.actiz.platform.application.dataset.pojo.Atztouyingy touyingyRef)
	 {
		  this.touyingyRef = touyingyRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztouyingy getTouyingyRef()
   {
     	return this.touyingyRef;
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