package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzceshijl implements Serializable,IPojo
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
 	 	 private String botrombb;
	 public void setBotrombb(String botrombb)
	 {
		  this.botrombb = botrombb;
	 }
   public String getBotrombb()
   { 	    
  	        
      return this.botrombb;     	
   }
 	 	 private String ceshijg;
	 public void setCeshijg(String ceshijg)
	 {
		  this.ceshijg = ceshijg;
	 }
   public String getCeshijg()
   { 	    
  	        
      return this.ceshijg;     	
   }
 	 	 private String ceshir;
	 public void setCeshir(String ceshir)
	 {
		  this.ceshir = ceshir;
	 }
   public String getCeshir()
   { 	    
  	        
      return this.ceshir;     	
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
 	 	 private Long ceshixiangid;
	 public void setCeshixiangid(Long ceshixiangid)
	 {
		  this.ceshixiangid = ceshixiangid;
	 }
   public Long getCeshixiangid()
   { 	    
  	        
      return this.ceshixiangid;     	
   }
 	 	 private Long chucejlid;
	 public void setChucejlid(Long chucejlid)
	 {
		  this.chucejlid = chucejlid;
	 }
   public Long getChucejlid()
   { 	    
  	        
      return this.chucejlid;     	
   }
 	 	 private Long ckdmxid;
	 public void setCkdmxid(Long ckdmxid)
	 {
		  this.ckdmxid = ckdmxid;
	 }
   public Long getCkdmxid()
   { 	    
  	        
      return this.ckdmxid;     	
   }
 	 	 private String chuzongc;
	 public void setChuzongc(String chuzongc)
	 {
		  this.chuzongc = chuzongc;
	 }
   public String getChuzongc()
   { 	    
  	        
      return this.chuzongc;     	
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
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
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
 	 	 private String shifoucswc;
	 public void setShifoucswc(String shifoucswc)
	 {
		  this.shifoucswc = shifoucswc;
	 }
   public String getShifoucswc()
   { 	    
  	        
      return this.shifoucswc;     	
   }
 	 	 private String shifoulhwc;
	 public void setShifoulhwc(String shifoulhwc)
	 {
		  this.shifoulhwc = shifoulhwc;
	 }
   public String getShifoulhwc()
   { 	    
  	        
      return this.shifoulhwc;     	
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
 	 	 private String shifouyzc;
	 public void setShifouyzc(String shifouyzc)
	 {
		  this.shifouyzc = shifouyzc;
	 }
   public String getShifouyzc()
   { 	    
  	        
      return this.shifouyzc;     	
   }
 	 	 private String shifouzcwc;
	 public void setShifouzcwc(String shifouzcwc)
	 {
		  this.shifouzcwc = shifouzcwc;
	 }
   public String getShifouzcwc()
   { 	    
  	        
      return this.shifouzcwc;     	
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
 	 	 private Double weisjsl;
	 public void setWeisjsl(Double weisjsl)
	 {
		  this.weisjsl = weisjsl;
	 }
   public Double getWeisjsl()
   { 	    
  	        
      return this.weisjsl;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixiangidRef;
	 public void setCeshixiangidRef(com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixiangidRef)
	 {
		  this.ceshixiangidRef = ceshixiangidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshixiang getCeshixiangidRef()
   {
     	return this.ceshixiangidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukdmx ckdmxidRef;
	 public void setCkdmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukdmx ckdmxidRef)
	 {
		  this.ckdmxidRef = ckdmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukdmx getCkdmxidRef()
   {
     	return this.ckdmxidRef;
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
  
	private java.util.Set atzceshixjlSet;
	public void setAtzceshixjlSet(java.util.Set atzceshixjlSet)
	{
		 this.atzceshixjlSet = atzceshixjlSet;
	}
  public java.util.Set getAtzceshixjlSet()
  {
     return this.atzceshixjlSet;
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