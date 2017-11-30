package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjieyingbsqd implements Serializable,IPojo
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
	  	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private String fujiane;
	 public void setFujiane(String fujiane)
	 {
		  this.fujiane = fujiane;
	 }
   public String getFujiane()
   { 	    
  	        
      return this.fujiane;     	
   }
 	 	 private String fujians;
	 public void setFujians(String fujians)
	 {
		  this.fujians = fujians;
	 }
   public String getFujians()
   { 	    
  	        
      return this.fujians;     	
   }
 	 	 private String fujiany;
	 public void setFujiany(String fujiany)
	 {
		  this.fujiany = fujiany;
	 }
   public String getFujiany()
   { 	    
  	        
      return this.fujiany;     	
   }
 	 	 private Long jiebiaosqdid;
	 public void setJiebiaosqdid(Long jiebiaosqdid)
	 {
		  this.jiebiaosqdid = jiebiaosqdid;
	 }
   public Long getJiebiaosqdid()
   { 	    
  	        
      return this.jiebiaosqdid;     	
   }
 	 	 private String liuchengshzt;
	 public void setLiuchengshzt(String liuchengshzt)
	 {
		  this.liuchengshzt = liuchengshzt;
	 }
   public String getLiuchengshzt()
   { 	    
  	        
      return this.liuchengshzt;     	
   }
 	 	 private String miaoshu;
	 public void setMiaoshu(String miaoshu)
	 {
		  this.miaoshu = miaoshu;
	 }
   public String getMiaoshu()
   { 	    
  	        
      return this.miaoshu;     	
   }
 	 	 private String shenqingdlx;
	 public void setShenqingdlx(String shenqingdlx)
	 {
		  this.shenqingdlx = shenqingdlx;
	 }
   public String getShenqingdlx()
   { 	    
  	        
      return this.shenqingdlx;     	
   }
 	 	 private String shenqingr;
	 public void setShenqingr(String shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public String getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shenqingrq;
	 public void setShenqingrq(Date shenqingrq)
	 {
		  this.shenqingrq = shenqingrq;
	 }
   public Date getShenqingrq()
   { 	    
  	  	    if( this.shenqingrq != null )
	    {
	        return (Date)new ActizDate( this.shenqingrq.getTime() );
	    }
	          
      return this.shenqingrq;     	
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
 	 	 private Long xiaoshoujhid;
	 public void setXiaoshoujhid(Long xiaoshoujhid)
	 {
		  this.xiaoshoujhid = xiaoshoujhid;
	 }
   public Long getXiaoshoujhid()
   { 	    
  	        
      return this.xiaoshoujhid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzjieyingbsqd jiebiaosqdidRef;
	 public void setJiebiaosqdidRef(com.actiz.platform.application.dataset.pojo.Atzjieyingbsqd jiebiaosqdidRef)
	 {
		  this.jiebiaosqdidRef = jiebiaosqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjieyingbsqd getJiebiaosqdidRef()
   {
     	return this.jiebiaosqdidRef;
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
  
	private java.util.Set atzjieyingbshjlSet;
	public void setAtzjieyingbshjlSet(java.util.Set atzjieyingbshjlSet)
	{
		 this.atzjieyingbshjlSet = atzjieyingbshjlSet;
	}
  public java.util.Set getAtzjieyingbshjlSet()
  {
     return this.atzjieyingbshjlSet;
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