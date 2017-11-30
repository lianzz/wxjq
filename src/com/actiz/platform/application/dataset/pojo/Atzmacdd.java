package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzmacdd implements Serializable,IPojo
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
 	 	 private String danjusc;
	 public void setDanjusc(String danjusc)
	 {
		  this.danjusc = danjusc;
	 }
   public String getDanjusc()
   { 	    
  	        
      return this.danjusc;     	
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
 	 	 private String macqs;
	 public void setMacqs(String macqs)
	 {
		  this.macqs = macqs;
	 }
   public String getMacqs()
   { 	    
  	        
      return this.macqs;     	
   }
 	 	 private Long scjhid;
	 public void setScjhid(Long scjhid)
	 {
		  this.scjhid = scjhid;
	 }
   public Long getScjhid()
   { 	    
  	        
      return this.scjhid;     	
   }
 	 	 private Long scphid;
	 public void setScphid(Long scphid)
	 {
		  this.scphid = scphid;
	 }
   public Long getScphid()
   { 	    
  	        
      return this.scphid;     	
   }
 	 	 private Long scrwid;
	 public void setScrwid(Long scrwid)
	 {
		  this.scrwid = scrwid;
	 }
   public Long getScrwid()
   { 	    
  	        
      return this.scrwid;     	
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
 	 	 private Integer suoxumacs;
	 public void setSuoxumacs(Integer suoxumacs)
	 {
		  this.suoxumacs = suoxumacs;
	 }
   public Integer getSuoxumacs()
   { 	    
  	        
      return this.suoxumacs;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef;
	 public void setScjhidRef(com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef)
	 {
		  this.scjhidRef = scjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjh getScjhidRef()
   {
     	return this.scjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscph scphidRef;
	 public void setScphidRef(com.actiz.platform.application.dataset.pojo.Atzscph scphidRef)
	 {
		  this.scphidRef = scphidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscph getScphidRef()
   {
     	return this.scphidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef;
	 public void setScrwidRef(com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef)
	 {
		  this.scrwidRef = scrwidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getScrwidRef()
   {
     	return this.scrwidRef;
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
  
	private java.util.Set atzmacddmxSet;
	public void setAtzmacddmxSet(java.util.Set atzmacddmxSet)
	{
		 this.atzmacddmxSet = atzmacddmxSet;
	}
  public java.util.Set getAtzmacddmxSet()
  {
     return this.atzmacddmxSet;
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