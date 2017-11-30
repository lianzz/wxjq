package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbenyuezjmx implements Serializable,IPojo
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
	  	 	 private Long atzyuezjjhid;
	 public void setAtzyuezjjhid(Long atzyuezjjhid)
	 {
		  this.atzyuezjjhid = atzyuezjjhid;
	 }
   public Long getAtzyuezjjhid()
   { 	    
  	        
      return this.atzyuezjjhid;     	
   }
 	 	 private String danweimc;
	 public void setDanweimc(String danweimc)
	 {
		  this.danweimc = danweimc;
	 }
   public String getDanweimc()
   { 	    
  	        
      return this.danweimc;     	
   }
 	 	 private String dangyuegzzd;
	 public void setDangyuegzzd(String dangyuegzzd)
	 {
		  this.dangyuegzzd = dangyuegzzd;
	 }
   public String getDangyuegzzd()
   { 	    
  	        
      return this.dangyuegzzd;     	
   }
 	 	 private String gongzuozlyq;
	 public void setGongzuozlyq(String gongzuozlyq)
	 {
		  this.gongzuozlyq = gongzuozlyq;
	 }
   public String getGongzuozlyq()
   { 	    
  	        
      return this.gongzuozlyq;     	
   }
 	 	 private Long huizongid;
	 public void setHuizongid(Long huizongid)
	 {
		  this.huizongid = huizongid;
	 }
   public Long getHuizongid()
   { 	    
  	        
      return this.huizongid;     	
   }
 	 	 private String riqi;
	 public void setRiqi(String riqi)
	 {
		  this.riqi = riqi;
	 }
   public String getRiqi()
   { 	    
  	        
      return this.riqi;     	
   }
 	 	 private String shangxiayzt;
	 public void setShangxiayzt(String shangxiayzt)
	 {
		  this.shangxiayzt = shangxiayzt;
	 }
   public String getShangxiayzt()
   { 	    
  	        
      return this.shangxiayzt;     	
   }
 	 	 private String shijiwcqk;
	 public void setShijiwcqk(String shijiwcqk)
	 {
		  this.shijiwcqk = shijiwcqk;
	 }
   public String getShijiwcqk()
   { 	    
  	        
      return this.shijiwcqk;     	
   }
 	 	 private String shifousy;
	 public void setShifousy(String shifousy)
	 {
		  this.shifousy = shifousy;
	 }
   public String getShifousy()
   { 	    
  	        
      return this.shifousy;     	
   }
 	 	 private Double yuerwbz;
	 public void setYuerwbz(Double yuerwbz)
	 {
		  this.yuerwbz = yuerwbz;
	 }
   public Double getYuerwbz()
   { 	    
  	        
      return this.yuerwbz;     	
   }
 	 	 private Double yuerwwcbl;
	 public void setYuerwwcbl(Double yuerwwcbl)
	 {
		  this.yuerwwcbl = yuerwwcbl;
	 }
   public Double getYuerwwcbl()
   { 	    
  	        
      return this.yuerwwcbl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzyuezjjh atzyuezjjhidRef;
	 public void setAtzyuezjjhidRef(com.actiz.platform.application.dataset.pojo.Atzyuezjjh atzyuezjjhidRef)
	 {
		  this.atzyuezjjhidRef = atzyuezjjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyuezjjh getAtzyuezjjhidRef()
   {
     	return this.atzyuezjjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzyuezjjh huizongidRef;
	 public void setHuizongidRef(com.actiz.platform.application.dataset.pojo.Atzyuezjjh huizongidRef)
	 {
		  this.huizongidRef = huizongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyuezjjh getHuizongidRef()
   {
     	return this.huizongidRef;
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