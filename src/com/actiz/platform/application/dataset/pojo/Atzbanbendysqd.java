package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbanbendysqd implements Serializable,IPojo
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
	  	 	 private String banbenh;
	 public void setBanbenh(String banbenh)
	 {
		  this.banbenh = banbenh;
	 }
   public String getBanbenh()
   { 	    
  	        
      return this.banbenh;     	
   }
 	 	 private String diaoyongbbnr;
	 public void setDiaoyongbbnr(String diaoyongbbnr)
	 {
		  this.diaoyongbbnr = diaoyongbbnr;
	 }
   public String getDiaoyongbbnr()
   { 	    
  	        
      return this.diaoyongbbnr;     	
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
 	 	 private String liuchengshzt;
	 public void setLiuchengshzt(String liuchengshzt)
	 {
		  this.liuchengshzt = liuchengshzt;
	 }
   public String getLiuchengshzt()
   { 	    
  	        
      return this.liuchengshzt;     	
   }
 	 	 private Long shenqinbm;
	 public void setShenqinbm(Long shenqinbm)
	 {
		  this.shenqinbm = shenqinbm;
	 }
   public Long getShenqinbm()
   { 	    
  	        
      return this.shenqinbm;     	
   }
 	 	 private String shenqingr;
	 public void setShenqingr(String shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public String getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shenqingsj;
	 public void setShenqingsj(Date shenqingsj)
	 {
		  this.shenqingsj = shenqingsj;
	 }
   public Date getShenqingsj()
   { 	    
  	  	    if( this.shenqingsj != null )
	    {
	        return (Date)new ActizDate( this.shenqingsj.getTime() );
	    }
	          
      return this.shenqingsj;     	
   }
 	 	 private String shenqingyy;
	 public void setShenqingyy(String shenqingyy)
	 {
		  this.shenqingyy = shenqingyy;
	 }
   public String getShenqingyy()
   { 	    
  	        
      return this.shenqingyy;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private String shifoujjdy;
	 public void setShifoujjdy(String shifoujjdy)
	 {
		  this.shifoujjdy = shifoujjdy;
	 }
   public String getShifoujjdy()
   { 	    
  	        
      return this.shifoujjdy;     	
   }
 	 	 private String chanpinmkmc;
	 public void setChanpinmkmc(String chanpinmkmc)
	 {
		  this.chanpinmkmc = chanpinmkmc;
	 }
   public String getChanpinmkmc()
   { 	    
  	        
      return this.chanpinmkmc;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atztuandui shenqinbmRef;
	 public void setShenqinbmRef(com.actiz.platform.application.dataset.pojo.Atztuandui shenqinbmRef)
	 {
		  this.shenqinbmRef = shenqinbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztuandui getShenqinbmRef()
   {
     	return this.shenqinbmRef;
   }
  
	private java.util.Set atzbanbendymxSet;
	public void setAtzbanbendymxSet(java.util.Set atzbanbendymxSet)
	{
		 this.atzbanbendymxSet = atzbanbendymxSet;
	}
  public java.util.Set getAtzbanbendymxSet()
  {
     return this.atzbanbendymxSet;
  }
 
	private java.util.Set atzbanbenshxxSet;
	public void setAtzbanbenshxxSet(java.util.Set atzbanbenshxxSet)
	{
		 this.atzbanbenshxxSet = atzbanbenshxxSet;
	}
  public java.util.Set getAtzbanbenshxxSet()
  {
     return this.atzbanbenshxxSet;
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