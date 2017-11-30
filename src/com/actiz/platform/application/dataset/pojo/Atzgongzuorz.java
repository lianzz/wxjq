package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgongzuorz implements Serializable,IPojo
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
	  	 	 private String dangriqkms;
	 public void setDangriqkms(String dangriqkms)
	 {
		  this.dangriqkms = dangriqkms;
	 }
   public String getDangriqkms()
   { 	    
  	        
      return this.dangriqkms;     	
   }
 	 	 private String dangriwtcl;
	 public void setDangriwtcl(String dangriwtcl)
	 {
		  this.dangriwtcl = dangriwtcl;
	 }
   public String getDangriwtcl()
   { 	    
  	        
      return this.dangriwtcl;     	
   }
 	 	 private String fuzer;
	 public void setFuzer(String fuzer)
	 {
		  this.fuzer = fuzer;
	 }
   public String getFuzer()
   { 	    
  	        
      return this.fuzer;     	
   }
 	 	 private String gongzuodd;
	 public void setGongzuodd(String gongzuodd)
	 {
		  this.gongzuodd = gongzuodd;
	 }
   public String getGongzuodd()
   { 	    
  	        
      return this.gongzuodd;     	
   }
 	 	 private Long hetongbh;
	 public void setHetongbh(Long hetongbh)
	 {
		  this.hetongbh = hetongbh;
	 }
   public Long getHetongbh()
   { 	    
  	        
      return this.hetongbh;     	
   }
 	 	 private Date jhkssj;
	 public void setJhkssj(Date jhkssj)
	 {
		  this.jhkssj = jhkssj;
	 }
   public Date getJhkssj()
   { 	    
  	  	    if( this.jhkssj != null )
	    {
	        return (Date)new ActizDate( this.jhkssj.getTime() );
	    }
	          
      return this.jhkssj;     	
   }
 	 	 private Date jhwcsj;
	 public void setJhwcsj(Date jhwcsj)
	 {
		  this.jhwcsj = jhwcsj;
	 }
   public Date getJhwcsj()
   { 	    
  	  	    if( this.jhwcsj != null )
	    {
	        return (Date)new ActizDate( this.jhwcsj.getTime() );
	    }
	          
      return this.jhwcsj;     	
   }
 	 	 private String lianxifs;
	 public void setLianxifs(String lianxifs)
	 {
		  this.lianxifs = lianxifs;
	 }
   public String getLianxifs()
   { 	    
  	        
      return this.lianxifs;     	
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
 	 	 private String mingrigzjh;
	 public void setMingrigzjh(String mingrigzjh)
	 {
		  this.mingrigzjh = mingrigzjh;
	 }
   public String getMingrigzjh()
   { 	    
  	        
      return this.mingrigzjh;     	
   }
 	 	 private String rizhilx;
	 public void setRizhilx(String rizhilx)
	 {
		  this.rizhilx = rizhilx;
	 }
   public String getRizhilx()
   { 	    
  	        
      return this.rizhilx;     	
   }
 	 	 private Date tianbaorq;
	 public void setTianbaorq(Date tianbaorq)
	 {
		  this.tianbaorq = tianbaorq;
	 }
   public Date getTianbaorq()
   { 	    
  	  	    if( this.tianbaorq != null )
	    {
	        return (Date)new ActizDate( this.tianbaorq.getTime() );
	    }
	          
      return this.tianbaorq;     	
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
 	 	 private String xianchangry;
	 public void setXianchangry(String xianchangry)
	 {
		  this.xianchangry = xianchangry;
	 }
   public String getXianchangry()
   { 	    
  	        
      return this.xianchangry;     	
   }
 	 	 private Long xmpqdid;
	 public void setXmpqdid(Long xmpqdid)
	 {
		  this.xmpqdid = xmpqdid;
	 }
   public Long getXmpqdid()
   { 	    
  	        
      return this.xmpqdid;     	
   }
 	 	 private String yiqianwtcl;
	 public void setYiqianwtcl(String yiqianwtcl)
	 {
		  this.yiqianwtcl = yiqianwtcl;
	 }
   public String getYiqianwtcl()
   { 	    
  	        
      return this.yiqianwtcl;     	
   }
 	 	 private String yuangongxm;
	 public void setYuangongxm(String yuangongxm)
	 {
		  this.yuangongxm = yuangongxm;
	 }
   public String getYuangongxm()
   { 	    
  	        
      return this.yuangongxm;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongbhRef;
	 public void setHetongbhRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongbhRef)
	 {
		  this.hetongbhRef = hetongbhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongbhRef()
   {
     	return this.hetongbhRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xmpqdidRef;
	 public void setXmpqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xmpqdidRef)
	 {
		  this.xmpqdidRef = xmpqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupqd getXmpqdidRef()
   {
     	return this.xmpqdidRef;
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