package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhengjicsjl implements Serializable,IPojo
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
 	 	 private String botrombb;
	 public void setBotrombb(String botrombb)
	 {
		  this.botrombb = botrombb;
	 }
   public String getBotrombb()
   { 	    
  	        
      return this.botrombb;     	
   }
 	 	 private String ceshiry;
	 public void setCeshiry(String ceshiry)
	 {
		  this.ceshiry = ceshiry;
	 }
   public String getCeshiry()
   { 	    
  	        
      return this.ceshiry;     	
   }
 	 	 private Date ceshirq;
	 public void setCeshirq(Date ceshirq)
	 {
		  this.ceshirq = ceshirq;
	 }
   public Date getCeshirq()
   { 	    
  	  	    if( this.ceshirq != null )
	    {
	        return (Date)new ActizDate( this.ceshirq.getTime() );
	    }
	          
      return this.ceshirq;     	
   }
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private String cpldbb;
	 public void setCpldbb(String cpldbb)
	 {
		  this.cpldbb = cpldbb;
	 }
   public String getCpldbb()
   { 	    
  	        
      return this.cpldbb;     	
   }
 	 	 private String fpgabb;
	 public void setFpgabb(String fpgabb)
	 {
		  this.fpgabb = fpgabb;
	 }
   public String getFpgabb()
   { 	    
  	        
      return this.fpgabb;     	
   }
 	 	 private String jieshumac;
	 public void setJieshumac(String jieshumac)
	 {
		  this.jieshumac = jieshumac;
	 }
   public String getJieshumac()
   { 	    
  	        
      return this.jieshumac;     	
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
 	 	 private String qishimac;
	 public void setQishimac(String qishimac)
	 {
		  this.qishimac = qishimac;
	 }
   public String getQishimac()
   { 	    
  	        
      return this.qishimac;     	
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
 	 	 private Long scrwmxid;
	 public void setScrwmxid(Long scrwmxid)
	 {
		  this.scrwmxid = scrwmxid;
	 }
   public Long getScrwmxid()
   { 	    
  	        
      return this.scrwmxid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpin getChanpinidRef()
   {
     	return this.chanpinidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef;
	 public void setScrwmxidRef(com.actiz.platform.application.dataset.pojo.Atzscrwmx scrwmxidRef)
	 {
		  this.scrwmxidRef = scrwmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrwmx getScrwmxidRef()
   {
     	return this.scrwmxidRef;
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
  
	private java.util.Set atzzjcsjlmxSet;
	public void setAtzzjcsjlmxSet(java.util.Set atzzjcsjlmxSet)
	{
		 this.atzzjcsjlmxSet = atzzjcsjlmxSet;
	}
  public java.util.Set getAtzzjcsjlmxSet()
  {
     return this.atzzjcsjlmxSet;
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