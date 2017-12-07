package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeiqdmx implements Serializable,IPojo
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
	  	 	 private Long atzshebeiqdid;
	 public void setAtzshebeiqdid(Long atzshebeiqdid)
	 {
		  this.atzshebeiqdid = atzshebeiqdid;
	 }
   public Long getAtzshebeiqdid()
   { 	    
  	        
      return this.atzshebeiqdid;     	
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
 	 	 private String danwei;
	 public void setDanwei(String danwei)
	 {
		  this.danwei = danwei;
	 }
   public String getDanwei()
   { 	    
  	        
      return this.danwei;     	
   }
 	 	 private String guigedw;
	 public void setGuigedw(String guigedw)
	 {
		  this.guigedw = guigedw;
	 }
   public String getGuigedw()
   { 	    
  	        
      return this.guigedw;     	
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
 	 	 private Double jhdtksl;
	 public void setJhdtksl(Double jhdtksl)
	 {
		  this.jhdtksl = jhdtksl;
	 }
   public Double getJhdtksl()
   { 	    
  	        
      return this.jhdtksl;     	
   }
 	 	 private Double weifhsl;
	 public void setWeifhsl(Double weifhsl)
	 {
		  this.weifhsl = weifhsl;
	 }
   public Double getWeifhsl()
   { 	    
  	        
      return this.weifhsl;     	
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
 	 	 private Long pzmxid;
	 public void setPzmxid(Long pzmxid)
	 {
		  this.pzmxid = pzmxid;
	 }
   public Long getPzmxid()
   { 	    
  	        
      return this.pzmxid;     	
   }
 	 	 private Double jhtksl;
	 public void setJhtksl(Double jhtksl)
	 {
		  this.jhtksl = jhtksl;
	 }
   public Double getJhtksl()
   { 	    
  	        
      return this.jhtksl;     	
   }
 	 	 private Double tuikusl;
	 public void setTuikusl(Double tuikusl)
	 {
		  this.tuikusl = tuikusl;
	 }
   public Double getTuikusl()
   { 	    
  	        
      return this.tuikusl;     	
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
 	 	 private Double sjwfhsl;
	 public void setSjwfhsl(Double sjwfhsl)
	 {
		  this.sjwfhsl = sjwfhsl;
	 }
   public Double getSjwfhsl()
   { 	    
  	        
      return this.sjwfhsl;     	
   }
 	 	 private String wuliaoms;
	 public void setWuliaoms(String wuliaoms)
	 {
		  this.wuliaoms = wuliaoms;
	 }
   public String getWuliaoms()
   { 	    
  	        
      return this.wuliaoms;     	
   }
 	 	 private Double jhfhsl;
	 public void setJhfhsl(Double jhfhsl)
	 {
		  this.jhfhsl = jhfhsl;
	 }
   public Double getJhfhsl()
   { 	    
  	        
      return this.jhfhsl;     	
   }
 	 	 private String xiaoshoubm;
	 public void setXiaoshoubm(String xiaoshoubm)
	 {
		  this.xiaoshoubm = xiaoshoubm;
	 }
   public String getXiaoshoubm()
   { 	    
  	        
      return this.xiaoshoubm;     	
   }
 	 	 private Long xiaoshoubmid;
	 public void setXiaoshoubmid(Long xiaoshoubmid)
	 {
		  this.xiaoshoubmid = xiaoshoubmid;
	 }
   public Long getXiaoshoubmid()
   { 	    
  	        
      return this.xiaoshoubmid;     	
   }
 	 	 private Double yichusl;
	 public void setYichusl(Double yichusl)
	 {
		  this.yichusl = yichusl;
	 }
   public Double getYichusl()
   { 	    
  	        
      return this.yichusl;     	
   }
 	 	 private Double yirusl;
	 public void setYirusl(Double yirusl)
	 {
		  this.yirusl = yirusl;
	 }
   public Double getYirusl()
   { 	    
  	        
      return this.yirusl;     	
   }
 	 	 private Double yifhsh;
	 public void setYifhsh(Double yifhsh)
	 {
		  this.yifhsh = yifhsh;
	 }
   public Double getYifhsh()
   { 	    
  	        
      return this.yifhsh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzshebeiqd atzshebeiqdidRef;
	 public void setAtzshebeiqdidRef(com.actiz.platform.application.dataset.pojo.Atzshebeiqd atzshebeiqdidRef)
	 {
		  this.atzshebeiqdidRef = atzshebeiqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshebeiqd getAtzshebeiqdidRef()
   {
     	return this.atzshebeiqdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef;
	 public void setXiaoshoubmidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef)
	 {
		  this.xiaoshoubmidRef = xiaoshoubmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmidRef()
   {
     	return this.xiaoshoubmidRef;
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