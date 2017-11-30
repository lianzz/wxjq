package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbeihuotzd implements Serializable,IPojo
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
	  	 	 private String beihuozt;
	 public void setBeihuozt(String beihuozt)
	 {
		  this.beihuozt = beihuozt;
	 }
   public String getBeihuozt()
   { 	    
  	        
      return this.beihuozt;     	
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
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
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
   }
 	 	 private Date qiwangwcrq;
	 public void setQiwangwcrq(Date qiwangwcrq)
	 {
		  this.qiwangwcrq = qiwangwcrq;
	 }
   public Date getQiwangwcrq()
   { 	    
  	  	    if( this.qiwangwcrq != null )
	    {
	        return (Date)new ActizDate( this.qiwangwcrq.getTime() );
	    }
	          
      return this.qiwangwcrq;     	
   }
 	 	 private String quxiaor;
	 public void setQuxiaor(String quxiaor)
	 {
		  this.quxiaor = quxiaor;
	 }
   public String getQuxiaor()
   { 	    
  	        
      return this.quxiaor;     	
   }
 	 	 private Date quxiaorq;
	 public void setQuxiaorq(Date quxiaorq)
	 {
		  this.quxiaorq = quxiaorq;
	 }
   public Date getQuxiaorq()
   { 	    
  	  	    if( this.quxiaorq != null )
	    {
	        return (Date)new ActizDate( this.quxiaorq.getTime() );
	    }
	          
      return this.quxiaorq;     	
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
 	 	 private String shifouqx;
	 public void setShifouqx(String shifouqx)
	 {
		  this.shifouqx = shifouqx;
	 }
   public String getShifouqx()
   { 	    
  	        
      return this.shifouqx;     	
   }
 	 	 private Long xiaoshoujhid;
	 public void setXiaoshoujhid(Long xiaoshoujhid)
	 {
		  this.xiaoshoujhid = xiaoshoujhid;
	 }
   public Long getXiaoshoujhid()
   { 	    
  	        
      return this.xiaoshoujhid;     	
   }
 	 	 private Date youxiaojzrq;
	 public void setYouxiaojzrq(Date youxiaojzrq)
	 {
		  this.youxiaojzrq = youxiaojzrq;
	 }
   public Date getYouxiaojzrq()
   { 	    
  	  	    if( this.youxiaojzrq != null )
	    {
	        return (Date)new ActizDate( this.youxiaojzrq.getTime() );
	    }
	          
      return this.youxiaojzrq;     	
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
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef;
	 public void setXiaoshoujhidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef)
	 {
		  this.xiaoshoujhidRef = xiaoshoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiaoshoujhidRef()
   {
     	return this.xiaoshoujhidRef;
   }
  
	private java.util.Set atzbeihuotzdmxSet;
	public void setAtzbeihuotzdmxSet(java.util.Set atzbeihuotzdmxSet)
	{
		 this.atzbeihuotzdmxSet = atzbeihuotzdmxSet;
	}
  public java.util.Set getAtzbeihuotzdmxSet()
  {
     return this.atzbeihuotzdmxSet;
  }
 
	private java.util.Set atzbeihuotzshjlSet;
	public void setAtzbeihuotzshjlSet(java.util.Set atzbeihuotzshjlSet)
	{
		 this.atzbeihuotzshjlSet = atzbeihuotzshjlSet;
	}
  public java.util.Set getAtzbeihuotzshjlSet()
  {
     return this.atzbeihuotzshjlSet;
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