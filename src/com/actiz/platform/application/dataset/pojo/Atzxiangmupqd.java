package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiangmupqd implements Serializable,IPojo
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
 	 	 private Date jihuakssj;
	 public void setJihuakssj(Date jihuakssj)
	 {
		  this.jihuakssj = jihuakssj;
	 }
   public Date getJihuakssj()
   { 	    
  	  	    if( this.jihuakssj != null )
	    {
	        return (Date)new ActizDate( this.jihuakssj.getTime() );
	    }
	          
      return this.jihuakssj;     	
   }
 	 	 private Date jihuawcsj;
	 public void setJihuawcsj(Date jihuawcsj)
	 {
		  this.jihuawcsj = jihuawcsj;
	 }
   public Date getJihuawcsj()
   { 	    
  	  	    if( this.jihuawcsj != null )
	    {
	        return (Date)new ActizDate( this.jihuawcsj.getTime() );
	    }
	          
      return this.jihuawcsj;     	
   }
 	 	 private Long kehu;
	 public void setKehu(Long kehu)
	 {
		  this.kehu = kehu;
	 }
   public Long getKehu()
   { 	    
  	        
      return this.kehu;     	
   }
 	 	 private String lianxidh;
	 public void setLianxidh(String lianxidh)
	 {
		  this.lianxidh = lianxidh;
	 }
   public String getLianxidh()
   { 	    
  	        
      return this.lianxidh;     	
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
 	 	 private Long renwujsr;
	 public void setRenwujsr(Long renwujsr)
	 {
		  this.renwujsr = renwujsr;
	 }
   public Long getRenwujsr()
   { 	    
  	        
      return this.renwujsr;     	
   }
 	 	 private Date renwujsrq;
	 public void setRenwujsrq(Date renwujsrq)
	 {
		  this.renwujsrq = renwujsrq;
	 }
   public Date getRenwujsrq()
   { 	    
  	  	    if( this.renwujsrq != null )
	    {
	        return (Date)new ActizDate( this.renwujsrq.getTime() );
	    }
	          
      return this.renwujsrq;     	
   }
 	 	 private String renwulx;
	 public void setRenwulx(String renwulx)
	 {
		  this.renwulx = renwulx;
	 }
   public String getRenwulx()
   { 	    
  	        
      return this.renwulx;     	
   }
 	 	 private String renwuyq;
	 public void setRenwuyq(String renwuyq)
	 {
		  this.renwuyq = renwuyq;
	 }
   public String getRenwuyq()
   { 	    
  	        
      return this.renwuyq;     	
   }
 	 	 private String shenhedjzt;
	 public void setShenhedjzt(String shenhedjzt)
	 {
		  this.shenhedjzt = shenhedjzt;
	 }
   public String getShenhedjzt()
   { 	    
  	        
      return this.shenhedjzt;     	
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
 	 	 private Date shijikssj;
	 public void setShijikssj(Date shijikssj)
	 {
		  this.shijikssj = shijikssj;
	 }
   public Date getShijikssj()
   { 	    
  	  	    if( this.shijikssj != null )
	    {
	        return (Date)new ActizDate( this.shijikssj.getTime() );
	    }
	          
      return this.shijikssj;     	
   }
 	 	 private Double shijits;
	 public void setShijits(Double shijits)
	 {
		  this.shijits = shijits;
	 }
   public Double getShijits()
   { 	    
  	        
      return this.shijits;     	
   }
 	 	 private Date shijiwcsj;
	 public void setShijiwcsj(Date shijiwcsj)
	 {
		  this.shijiwcsj = shijiwcsj;
	 }
   public Date getShijiwcsj()
   { 	    
  	  	    if( this.shijiwcsj != null )
	    {
	        return (Date)new ActizDate( this.shijiwcsj.getTime() );
	    }
	          
      return this.shijiwcsj;     	
   }
 	 	 private String wcqkms;
	 public void setWcqkms(String wcqkms)
	 {
		  this.wcqkms = wcqkms;
	 }
   public String getWcqkms()
   { 	    
  	        
      return this.wcqkms;     	
   }
 	 	 private String wendanglx;
	 public void setWendanglx(String wendanglx)
	 {
		  this.wendanglx = wendanglx;
	 }
   public String getWendanglx()
   { 	    
  	        
      return this.wendanglx;     	
   }
 	 	 private Long xitongmc;
	 public void setXitongmc(Long xitongmc)
	 {
		  this.xitongmc = xitongmc;
	 }
   public Long getXitongmc()
   { 	    
  	        
      return this.xitongmc;     	
   }
 	 	 private Long xiafar;
	 public void setXiafar(Long xiafar)
	 {
		  this.xiafar = xiafar;
	 }
   public Long getXiafar()
   { 	    
  	        
      return this.xiafar;     	
   }
 	 	 private String xiangmufzr;
	 public void setXiangmufzr(String xiangmufzr)
	 {
		  this.xiangmufzr = xiangmufzr;
	 }
   public String getXiangmufzr()
   { 	    
  	        
      return this.xiangmufzr;     	
   }
 	 	 private String xiangmujl;
	 public void setXiangmujl(String xiangmujl)
	 {
		  this.xiangmujl = xiangmujl;
	 }
   public String getXiangmujl()
   { 	    
  	        
      return this.xiangmujl;     	
   }
 	 	 private String xiangmudz;
	 public void setXiangmudz(String xiangmudz)
	 {
		  this.xiangmudz = xiangmudz;
	 }
   public String getXiangmudz()
   { 	    
  	        
      return this.xiangmudz;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuRef;
	 public void setKehuRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuRef)
	 {
		  this.kehuRef = kehuRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuRef()
   {
     	return this.kehuRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg renwujsrRef;
	 public void setRenwujsrRef(com.actiz.platform.application.dataset.pojo.Atztdyg renwujsrRef)
	 {
		  this.renwujsrRef = renwujsrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getRenwujsrRef()
   {
     	return this.renwujsrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongmcRef;
	 public void setXitongmcRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongmcRef)
	 {
		  this.xitongmcRef = xitongmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongmcRef()
   {
     	return this.xitongmcRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg xiafarRef;
	 public void setXiafarRef(com.actiz.platform.application.dataset.pojo.Atztdyg xiafarRef)
	 {
		  this.xiafarRef = xiafarRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getXiafarRef()
   {
     	return this.xiafarRef;
   }
  
	private java.util.Set atzwendangshxxSet;
	public void setAtzwendangshxxSet(java.util.Set atzwendangshxxSet)
	{
		 this.atzwendangshxxSet = atzwendangshxxSet;
	}
  public java.util.Set getAtzwendangshxxSet()
  {
     return this.atzwendangshxxSet;
  }
 
	private java.util.Set atzwendangxxSet;
	public void setAtzwendangxxSet(java.util.Set atzwendangxxSet)
	{
		 this.atzwendangxxSet = atzwendangxxSet;
	}
  public java.util.Set getAtzwendangxxSet()
  {
     return this.atzwendangxxSet;
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