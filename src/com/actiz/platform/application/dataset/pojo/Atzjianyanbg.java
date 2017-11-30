package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjianyanbg implements Serializable,IPojo
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
 	 	 private String changshang;
	 public void setChangshang(String changshang)
	 {
		  this.changshang = changshang;
	 }
   public String getChangshang()
   { 	    
  	        
      return this.changshang;     	
   }
 	 	 private Double choujiansl;
	 public void setChoujiansl(Double choujiansl)
	 {
		  this.choujiansl = choujiansl;
	 }
   public Double getChoujiansl()
   { 	    
  	        
      return this.choujiansl;     	
   }
 	 	 private String gongyings;
	 public void setGongyings(String gongyings)
	 {
		  this.gongyings = gongyings;
	 }
   public String getGongyings()
   { 	    
  	        
      return this.gongyings;     	
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
 	 	 private String jianyanjl;
	 public void setJianyanjl(String jianyanjl)
	 {
		  this.jianyanjl = jianyanjl;
	 }
   public String getJianyanjl()
   { 	    
  	        
      return this.jianyanjl;     	
   }
 	 	 private Date jianyanrq;
	 public void setJianyanrq(Date jianyanrq)
	 {
		  this.jianyanrq = jianyanrq;
	 }
   public Date getJianyanrq()
   { 	    
  	  	    if( this.jianyanrq != null )
	    {
	        return (Date)new ActizDate( this.jianyanrq.getTime() );
	    }
	          
      return this.jianyanrq;     	
   }
 	 	 private String jianyany;
	 public void setJianyany(String jianyany)
	 {
		  this.jianyany = jianyany;
	 }
   public String getJianyany()
   { 	    
  	        
      return this.jianyany;     	
   }
 	 	 private Date lailiaorq;
	 public void setLailiaorq(Date lailiaorq)
	 {
		  this.lailiaorq = lailiaorq;
	 }
   public Date getLailiaorq()
   { 	    
  	  	    if( this.lailiaorq != null )
	    {
	        return (Date)new ActizDate( this.lailiaorq.getTime() );
	    }
	          
      return this.lailiaorq;     	
   }
 	 	 private Double lailiaosl;
	 public void setLailiaosl(Double lailiaosl)
	 {
		  this.lailiaosl = lailiaosl;
	 }
   public Double getLailiaosl()
   { 	    
  	        
      return this.lailiaosl;     	
   }
 	 	 private String pihao;
	 public void setPihao(String pihao)
	 {
		  this.pihao = pihao;
	 }
   public String getPihao()
   { 	    
  	        
      return this.pihao;     	
   }
 	 	 private String shifouyfs;
	 public void setShifouyfs(String shifouyfs)
	 {
		  this.shifouyfs = shifouyfs;
	 }
   public String getShifouyfs()
   { 	    
  	        
      return this.shifouyfs;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzjianyandmx jianyandmxidRef;
	 public void setJianyandmxidRef(com.actiz.platform.application.dataset.pojo.Atzjianyandmx jianyandmxidRef)
	 {
		  this.jianyandmxidRef = jianyandmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyandmx getJianyandmxidRef()
   {
     	return this.jianyandmxidRef;
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
  
	private java.util.Set atzjianyanbgmxSet;
	public void setAtzjianyanbgmxSet(java.util.Set atzjianyanbgmxSet)
	{
		 this.atzjianyanbgmxSet = atzjianyanbgmxSet;
	}
  public java.util.Set getAtzjianyanbgmxSet()
  {
     return this.atzjianyanbgmxSet;
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