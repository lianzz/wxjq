package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfahuotzd implements Serializable,IPojo
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
	  	 	 private String banbenxx;
	 public void setBanbenxx(String banbenxx)
	 {
		  this.banbenxx = banbenxx;
	 }
   public String getBanbenxx()
   { 	    
  	        
      return this.banbenxx;     	
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
 	 	 private String bianhaoqz;
	 public void setBianhaoqz(String bianhaoqz)
	 {
		  this.bianhaoqz = bianhaoqz;
	 }
   public String getBianhaoqz()
   { 	    
  	        
      return this.bianhaoqz;     	
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
 	 	 private String daohuodd;
	 public void setDaohuodd(String daohuodd)
	 {
		  this.daohuodd = daohuodd;
	 }
   public String getDaohuodd()
   { 	    
  	        
      return this.daohuodd;     	
   }
 	 	 private Date daohuorq;
	 public void setDaohuorq(Date daohuorq)
	 {
		  this.daohuorq = daohuorq;
	 }
   public Date getDaohuorq()
   { 	    
  	  	    if( this.daohuorq != null )
	    {
	        return (Date)new ActizDate( this.daohuorq.getTime() );
	    }
	          
      return this.daohuorq;     	
   }
 	 	 private String fahuolxlx;
	 public void setFahuolxlx(String fahuolxlx)
	 {
		  this.fahuolxlx = fahuolxlx;
	 }
   public String getFahuolxlx()
   { 	    
  	        
      return this.fahuolxlx;     	
   }
 	 	 private Date fahuorq;
	 public void setFahuorq(Date fahuorq)
	 {
		  this.fahuorq = fahuorq;
	 }
   public Date getFahuorq()
   { 	    
  	  	    if( this.fahuorq != null )
	    {
	        return (Date)new ActizDate( this.fahuorq.getTime() );
	    }
	          
      return this.fahuorq;     	
   }
 	 	 private Long fahuotzdid;
	 public void setFahuotzdid(Long fahuotzdid)
	 {
		  this.fahuotzdid = fahuotzdid;
	 }
   public Long getFahuotzdid()
   { 	    
  	        
      return this.fahuotzdid;     	
   }
 	 	 private String fahuotzdlx;
	 public void setFahuotzdlx(String fahuotzdlx)
	 {
		  this.fahuotzdlx = fahuotzdlx;
	 }
   public String getFahuotzdlx()
   { 	    
  	        
      return this.fahuotzdlx;     	
   }
 	 	 private String fpjfhlx;
	 public void setFpjfhlx(String fpjfhlx)
	 {
		  this.fpjfhlx = fpjfhlx;
	 }
   public String getFpjfhlx()
   { 	    
  	        
      return this.fpjfhlx;     	
   }
 	 	 private String gcxmjl;
	 public void setGcxmjl(String gcxmjl)
	 {
		  this.gcxmjl = gcxmjl;
	 }
   public String getGcxmjl()
   { 	    
  	        
      return this.gcxmjl;     	
   }
 	 	 private String gcxmjllxfs;
	 public void setGcxmjllxfs(String gcxmjllxfs)
	 {
		  this.gcxmjllxfs = gcxmjllxfs;
	 }
   public String getGcxmjllxfs()
   { 	    
  	        
      return this.gcxmjllxfs;     	
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
 	 	 private Double huowubj;
	 public void setHuowubj(Double huowubj)
	 {
		  this.huowubj = huowubj;
	 }
   public Double getHuowubj()
   { 	    
  	        
      return this.huowubj;     	
   }
 	 	 private String jutigznrbc;
	 public void setJutigznrbc(String jutigznrbc)
	 {
		  this.jutigznrbc = jutigznrbc;
	 }
   public String getJutigznrbc()
   { 	    
  	        
      return this.jutigznrbc;     	
   }
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
   }
 	 	 private String kehujl;
	 public void setKehujl(String kehujl)
	 {
		  this.kehujl = kehujl;
	 }
   public String getKehujl()
   { 	    
  	        
      return this.kehujl;     	
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
 	 	 private String shifoujy;
	 public void setShifoujy(String shifoujy)
	 {
		  this.shifoujy = shifoujy;
	 }
   public String getShifoujy()
   { 	    
  	        
      return this.shifoujy;     	
   }
 	 	 private String shifouwc;
	 public void setShifouwc(String shifouwc)
	 {
		  this.shifouwc = shifouwc;
	 }
   public String getShifouwc()
   { 	    
  	        
      return this.shifouwc;     	
   }
 	 	 private String shouhuolxdh;
	 public void setShouhuolxdh(String shouhuolxdh)
	 {
		  this.shouhuolxdh = shouhuolxdh;
	 }
   public String getShouhuolxdh()
   { 	    
  	        
      return this.shouhuolxdh;     	
   }
 	 	 private String shouhuolxr;
	 public void setShouhuolxr(String shouhuolxr)
	 {
		  this.shouhuolxr = shouhuolxr;
	 }
   public String getShouhuolxr()
   { 	    
  	        
      return this.shouhuolxr;     	
   }
 	 	 private String xitongpz;
	 public void setXitongpz(String xitongpz)
	 {
		  this.xitongpz = xitongpz;
	 }
   public String getXitongpz()
   { 	    
  	        
      return this.xitongpz;     	
   }
 	 	 private Long xmpzqdid;
	 public void setXmpzqdid(Long xmpzqdid)
	 {
		  this.xmpzqdid = xmpzqdid;
	 }
   public Long getXmpzqdid()
   { 	    
  	        
      return this.xmpzqdid;     	
   }
 	 	 private String xiaoshoujl;
	 public void setXiaoshoujl(String xiaoshoujl)
	 {
		  this.xiaoshoujl = xiaoshoujl;
	 }
   public String getXiaoshoujl()
   { 	    
  	        
      return this.xiaoshoujl;     	
   }
 	 	 private Long xiaoshoujlid;
	 public void setXiaoshoujlid(Long xiaoshoujlid)
	 {
		  this.xiaoshoujlid = xiaoshoujlid;
	 }
   public Long getXiaoshoujlid()
   { 	    
  	        
      return this.xiaoshoujlid;     	
   }
 	 	 private String xsjllxfs;
	 public void setXsjllxfs(String xsjllxfs)
	 {
		  this.xsjllxfs = xsjllxfs;
	 }
   public String getXsjllxfs()
   { 	    
  	        
      return this.xsjllxfs;     	
   }
 	 	 private Date yjfhsj;
	 public void setYjfhsj(Date yjfhsj)
	 {
		  this.yjfhsj = yjfhsj;
	 }
   public Date getYjfhsj()
   { 	    
  	  	    if( this.yjfhsj != null )
	    {
	        return (Date)new ActizDate( this.yjfhsj.getTime() );
	    }
	          
      return this.yjfhsj;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef;
	 public void setFahuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef)
	 {
		  this.fahuotzdidRef = fahuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuotzd getFahuotzdidRef()
   {
     	return this.fahuotzdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xmpzqdidRef;
	 public void setXmpzqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xmpzqdidRef)
	 {
		  this.xmpzqdidRef = xmpzqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd getXmpzqdidRef()
   {
     	return this.xmpzqdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlidRef;
	 public void setXiaoshoujlidRef(com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlidRef)
	 {
		  this.xiaoshoujlidRef = xiaoshoujlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXiaoshoujlidRef()
   {
     	return this.xiaoshoujlidRef;
   }
  
	private java.util.Set atzfahuotzshjlSet;
	public void setAtzfahuotzshjlSet(java.util.Set atzfahuotzshjlSet)
	{
		 this.atzfahuotzshjlSet = atzfahuotzshjlSet;
	}
  public java.util.Set getAtzfahuotzshjlSet()
  {
     return this.atzfahuotzshjlSet;
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