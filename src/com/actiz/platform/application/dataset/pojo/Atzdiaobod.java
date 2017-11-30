package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdiaobod implements Serializable,IPojo
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private String ckjhdbh;
	 public void setCkjhdbh(String ckjhdbh)
	 {
		  this.ckjhdbh = ckjhdbh;
	 }
   public String getCkjhdbh()
   { 	    
  	        
      return this.ckjhdbh;     	
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
 	 	 private String diaobor;
	 public void setDiaobor(String diaobor)
	 {
		  this.diaobor = diaobor;
	 }
   public String getDiaobor()
   { 	    
  	        
      return this.diaobor;     	
   }
 	 	 private Date diaoborq;
	 public void setDiaoborq(Date diaoborq)
	 {
		  this.diaoborq = diaoborq;
	 }
   public Date getDiaoborq()
   { 	    
  	  	    if( this.diaoborq != null )
	    {
	        return (Date)new ActizDate( this.diaoborq.getTime() );
	    }
	          
      return this.diaoborq;     	
   }
 	 	 private String diaoboyy;
	 public void setDiaoboyy(String diaoboyy)
	 {
		  this.diaoboyy = diaoboyy;
	 }
   public String getDiaoboyy()
   { 	    
  	        
      return this.diaoboyy;     	
   }
 	 	 private String laoxtid;
	 public void setLaoxtid(String laoxtid)
	 {
		  this.laoxtid = laoxtid;
	 }
   public String getLaoxtid()
   { 	    
  	        
      return this.laoxtid;     	
   }
 	 	 private String diaorurwbm;
	 public void setDiaorurwbm(String diaorurwbm)
	 {
		  this.diaorurwbm = diaorurwbm;
	 }
   public String getDiaorurwbm()
   { 	    
  	        
      return this.diaorurwbm;     	
   }
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
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
 	 	 private String sfwh;
	 public void setSfwh(String sfwh)
	 {
		  this.sfwh = sfwh;
	 }
   public String getSfwh()
   { 	    
  	        
      return this.sfwh;     	
   }
 	 	 private String sfzf;
	 public void setSfzf(String sfzf)
	 {
		  this.sfzf = sfzf;
	 }
   public String getSfzf()
   { 	    
  	        
      return this.sfzf;     	
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
   
	private java.util.Set atzdiaobodmxSet;
	public void setAtzdiaobodmxSet(java.util.Set atzdiaobodmxSet)
	{
		 this.atzdiaobodmxSet = atzdiaobodmxSet;
	}
  public java.util.Set getAtzdiaobodmxSet()
  {
     return this.atzdiaobodmxSet;
  }
 
	private java.util.Set atzdiaobodshjlSet;
	public void setAtzdiaobodshjlSet(java.util.Set atzdiaobodshjlSet)
	{
		 this.atzdiaobodshjlSet = atzdiaobodshjlSet;
	}
  public java.util.Set getAtzdiaobodshjlSet()
  {
     return this.atzdiaobodshjlSet;
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