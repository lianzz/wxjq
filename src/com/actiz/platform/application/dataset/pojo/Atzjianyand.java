package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjianyand implements Serializable,IPojo
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
 	 	 private String caigouddh;
	 public void setCaigouddh(String caigouddh)
	 {
		  this.caigouddh = caigouddh;
	 }
   public String getCaigouddh()
   { 	    
  	        
      return this.caigouddh;     	
   }
 	 	 private Long caigouhtid;
	 public void setCaigouhtid(Long caigouhtid)
	 {
		  this.caigouhtid = caigouhtid;
	 }
   public Long getCaigouhtid()
   { 	    
  	        
      return this.caigouhtid;     	
   }
 	 	 private Long caigoujhid;
	 public void setCaigoujhid(Long caigoujhid)
	 {
		  this.caigoujhid = caigoujhid;
	 }
   public Long getCaigoujhid()
   { 	    
  	        
      return this.caigoujhid;     	
   }
 	 	 private String ckthyy;
	 public void setCkthyy(String ckthyy)
	 {
		  this.ckthyy = ckthyy;
	 }
   public String getCkthyy()
   { 	    
  	        
      return this.ckthyy;     	
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
 	 	 private String danjusc;
	 public void setDanjusc(String danjusc)
	 {
		  this.danjusc = danjusc;
	 }
   public String getDanjusc()
   { 	    
  	        
      return this.danjusc;     	
   }
 	 	 private Long daohuotzdid;
	 public void setDaohuotzdid(Long daohuotzdid)
	 {
		  this.daohuotzdid = daohuotzdid;
	 }
   public Long getDaohuotzdid()
   { 	    
  	        
      return this.daohuotzdid;     	
   }
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
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
 	 	 private String jianyanbg;
	 public void setJianyanbg(String jianyanbg)
	 {
		  this.jianyanbg = jianyanbg;
	 }
   public String getJianyanbg()
   { 	    
  	        
      return this.jianyanbg;     	
   }
 	 	 private String jianyandlx;
	 public void setJianyandlx(String jianyandlx)
	 {
		  this.jianyandlx = jianyandlx;
	 }
   public String getJianyandlx()
   { 	    
  	        
      return this.jianyandlx;     	
   }
 	 	 private String jianyandzt;
	 public void setJianyandzt(String jianyandzt)
	 {
		  this.jianyandzt = jianyandzt;
	 }
   public String getJianyandzt()
   { 	    
  	        
      return this.jianyandzt;     	
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
 	 	 private String tuihuiyy;
	 public void setTuihuiyy(String tuihuiyy)
	 {
		  this.tuihuiyy = tuihuiyy;
	 }
   public String getTuihuiyy()
   { 	    
  	        
      return this.tuihuiyy;     	
   }
 	 	 private String jianyanz;
	 public void setJianyanz(String jianyanz)
	 {
		  this.jianyanz = jianyanz;
	 }
   public String getJianyanz()
   { 	    
  	        
      return this.jianyanz;     	
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
 	 	 private String rkjhsfshtg;
	 public void setRkjhsfshtg(String rkjhsfshtg)
	 {
		  this.rkjhsfshtg = rkjhsfshtg;
	 }
   public String getRkjhsfshtg()
   { 	    
  	        
      return this.rkjhsfshtg;     	
   }
 	 	 private String sjbeizhu;
	 public void setSjbeizhu(String sjbeizhu)
	 {
		  this.sjbeizhu = sjbeizhu;
	 }
   public String getSjbeizhu()
   { 	    
  	        
      return this.sjbeizhu;     	
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
 	 	 private String shifoufsbg;
	 public void setShifoufsbg(String shifoufsbg)
	 {
		  this.shifoufsbg = shifoufsbg;
	 }
   public String getShifoufsbg()
   { 	    
  	        
      return this.shifoufsbg;     	
   }
 	 	 private String shifoulrbg;
	 public void setShifoulrbg(String shifoulrbg)
	 {
		  this.shifoulrbg = shifoulrbg;
	 }
   public String getShifoulrbg()
   { 	    
  	        
      return this.shifoulrbg;     	
   }
 	 	 private String shifouzx;
	 public void setShifouzx(String shifouzx)
	 {
		  this.shifouzx = shifouzx;
	 }
   public String getShifouzx()
   { 	    
  	        
      return this.shifouzx;     	
   }
 	 	 private String songjianr;
	 public void setSongjianr(String songjianr)
	 {
		  this.songjianr = songjianr;
	 }
   public String getSongjianr()
   { 	    
  	        
      return this.songjianr;     	
   }
 	 	 private Long songjianrid;
	 public void setSongjianrid(Long songjianrid)
	 {
		  this.songjianrid = songjianrid;
	 }
   public Long getSongjianrid()
   { 	    
  	        
      return this.songjianrid;     	
   }
 	 	 private Date songjianrq;
	 public void setSongjianrq(Date songjianrq)
	 {
		  this.songjianrq = songjianrq;
	 }
   public Date getSongjianrq()
   { 	    
  	  	    if( this.songjianrq != null )
	    {
	        return (Date)new ActizDate( this.songjianrq.getTime() );
	    }
	          
      return this.songjianrq;     	
   }
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef;
	 public void setCaigouhtidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef)
	 {
		  this.caigouhtidRef = caigouhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouht getCaigouhtidRef()
   {
     	return this.caigouhtidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef;
	 public void setCaigoujhidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef)
	 {
		  this.caigoujhidRef = caigoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigoujhidRef()
   {
     	return this.caigoujhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdaohuotzd daohuotzdidRef;
	 public void setDaohuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzdaohuotzd daohuotzdidRef)
	 {
		  this.daohuotzdidRef = daohuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdaohuotzd getDaohuotzdidRef()
   {
     	return this.daohuotzdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg songjianridRef;
	 public void setSongjianridRef(com.actiz.platform.application.dataset.pojo.Atztdyg songjianridRef)
	 {
		  this.songjianridRef = songjianridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getSongjianridRef()
   {
     	return this.songjianridRef;
   }
  
	private java.util.Set atzjianyandmxSet;
	public void setAtzjianyandmxSet(java.util.Set atzjianyandmxSet)
	{
		 this.atzjianyandmxSet = atzjianyandmxSet;
	}
  public java.util.Set getAtzjianyandmxSet()
  {
     return this.atzjianyandmxSet;
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