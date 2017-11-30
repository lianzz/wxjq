package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigousy implements Serializable,IPojo
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
 	 	 private String chuliyj;
	 public void setChuliyj(String chuliyj)
	 {
		  this.chuliyj = chuliyj;
	 }
   public String getChuliyj()
   { 	    
  	        
      return this.chuliyj;     	
   }
 	 	 private String danjuzxzt;
	 public void setDanjuzxzt(String danjuzxzt)
	 {
		  this.danjuzxzt = danjuzxzt;
	 }
   public String getDanjuzxzt()
   { 	    
  	        
      return this.danjuzxzt;     	
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
 	 	 private String shenyangr;
	 public void setShenyangr(String shenyangr)
	 {
		  this.shenyangr = shenyangr;
	 }
   public String getShenyangr()
   { 	    
  	        
      return this.shenyangr;     	
   }
 	 	 private String shifouty;
	 public void setShifouty(String shifouty)
	 {
		  this.shifouty = shifouty;
	 }
   public String getShifouty()
   { 	    
  	        
      return this.shifouty;     	
   }
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
   }
 	 	 private String zxzt;
	 public void setZxzt(String zxzt)
	 {
		  this.zxzt = zxzt;
	 }
   public String getZxzt()
   { 	    
  	        
      return this.zxzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
   }
  
	private java.util.Set atzcaigousymxSet;
	public void setAtzcaigousymxSet(java.util.Set atzcaigousymxSet)
	{
		 this.atzcaigousymxSet = atzcaigousymxSet;
	}
  public java.util.Set getAtzcaigousymxSet()
  {
     return this.atzcaigousymxSet;
  }
 
	private java.util.Set atzshenyangcljlSet;
	public void setAtzshenyangcljlSet(java.util.Set atzshenyangcljlSet)
	{
		 this.atzshenyangcljlSet = atzshenyangcljlSet;
	}
  public java.util.Set getAtzshenyangcljlSet()
  {
     return this.atzshenyangcljlSet;
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