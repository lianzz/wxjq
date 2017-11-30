package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscjh implements Serializable,IPojo
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
	  	 	 private Long beihuotzdid;
	 public void setBeihuotzdid(Long beihuotzdid)
	 {
		  this.beihuotzdid = beihuotzdid;
	 }
   public Long getBeihuotzdid()
   { 	    
  	        
      return this.beihuotzdid;     	
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
 	 	 private String danjusc;
	 public void setDanjusc(String danjusc)
	 {
		  this.danjusc = danjusc;
	 }
   public String getDanjusc()
   { 	    
  	        
      return this.danjusc;     	
   }
 	 	 private Date jihuajsrq;
	 public void setJihuajsrq(Date jihuajsrq)
	 {
		  this.jihuajsrq = jihuajsrq;
	 }
   public Date getJihuajsrq()
   { 	    
  	  	    if( this.jihuajsrq != null )
	    {
	        return (Date)new ActizDate( this.jihuajsrq.getTime() );
	    }
	          
      return this.jihuajsrq;     	
   }
 	 	 private String jihualx;
	 public void setJihualx(String jihualx)
	 {
		  this.jihualx = jihualx;
	 }
   public String getJihualx()
   { 	    
  	        
      return this.jihualx;     	
   }
 	 	 private String jihuamc;
	 public void setJihuamc(String jihuamc)
	 {
		  this.jihuamc = jihuamc;
	 }
   public String getJihuamc()
   { 	    
  	        
      return this.jihuamc;     	
   }
 	 	 private Date jihuaqsrq;
	 public void setJihuaqsrq(Date jihuaqsrq)
	 {
		  this.jihuaqsrq = jihuaqsrq;
	 }
   public Date getJihuaqsrq()
   { 	    
  	  	    if( this.jihuaqsrq != null )
	    {
	        return (Date)new ActizDate( this.jihuaqsrq.getTime() );
	    }
	          
      return this.jihuaqsrq;     	
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
 	 	 private String shangjidj;
	 public void setShangjidj(String shangjidj)
	 {
		  this.shangjidj = shangjidj;
	 }
   public String getShangjidj()
   { 	    
  	        
      return this.shangjidj;     	
   }
 	 	 private String shgczt;
	 public void setShgczt(String shgczt)
	 {
		  this.shgczt = shgczt;
	 }
   public String getShgczt()
   { 	    
  	        
      return this.shgczt;     	
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
 	 	 private String shifoubhwc;
	 public void setShifoubhwc(String shifoubhwc)
	 {
		  this.shifoubhwc = shifoubhwc;
	 }
   public String getShifoubhwc()
   { 	    
  	        
      return this.shifoubhwc;     	
   }
 	 	 private String sfbg;
	 public void setSfbg(String sfbg)
	 {
		  this.sfbg = sfbg;
	 }
   public String getSfbg()
   { 	    
  	        
      return this.sfbg;     	
   }
 	 	 private String shifouzxcg;
	 public void setShifouzxcg(String shifouzxcg)
	 {
		  this.shifouzxcg = shifouzxcg;
	 }
   public String getShifouzxcg()
   { 	    
  	        
      return this.shifouzxcg;     	
   }
 	 	 private Long yuanscjhid;
	 public void setYuanscjhid(Long yuanscjhid)
	 {
		  this.yuanscjhid = yuanscjhid;
	 }
   public Long getYuanscjhid()
   { 	    
  	        
      return this.yuanscjhid;     	
   }
 	 	 private String zhongzhizt;
	 public void setZhongzhizt(String zhongzhizt)
	 {
		  this.zhongzhizt = zhongzhizt;
	 }
   public String getZhongzhizt()
   { 	    
  	        
      return this.zhongzhizt;     	
   }
 	 	 private String zuohouxgr;
	 public void setZuohouxgr(String zuohouxgr)
	 {
		  this.zuohouxgr = zuohouxgr;
	 }
   public String getZuohouxgr()
   { 	    
  	        
      return this.zuohouxgr;     	
   }
 	 	 private Date zuohouxgrq;
	 public void setZuohouxgrq(Date zuohouxgrq)
	 {
		  this.zuohouxgrq = zuohouxgrq;
	 }
   public Date getZuohouxgrq()
   { 	    
  	  	    if( this.zuohouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuohouxgrq.getTime() );
	    }
	          
      return this.zuohouxgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbeihuotzd beihuotzdidRef;
	 public void setBeihuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzbeihuotzd beihuotzdidRef)
	 {
		  this.beihuotzdidRef = beihuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbeihuotzd getBeihuotzdidRef()
   {
     	return this.beihuotzdidRef;
   }
  
	private java.util.Set atzbiangengjlSet;
	public void setAtzbiangengjlSet(java.util.Set atzbiangengjlSet)
	{
		 this.atzbiangengjlSet = atzbiangengjlSet;
	}
  public java.util.Set getAtzbiangengjlSet()
  {
     return this.atzbiangengjlSet;
  }
 
	private java.util.Set atzscjhmxSet;
	public void setAtzscjhmxSet(java.util.Set atzscjhmxSet)
	{
		 this.atzscjhmxSet = atzscjhmxSet;
	}
  public java.util.Set getAtzscjhmxSet()
  {
     return this.atzscjhmxSet;
  }
 
	private java.util.Set atzscjhshjlSet;
	public void setAtzscjhshjlSet(java.util.Set atzscjhshjlSet)
	{
		 this.atzscjhshjlSet = atzscjhshjlSet;
	}
  public java.util.Set getAtzscjhshjlSet()
  {
     return this.atzscjhshjlSet;
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