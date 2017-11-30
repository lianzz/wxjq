package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpeixunjl implements Serializable,IPojo
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
	  	 	 private String didian;
	 public void setDidian(String didian)
	 {
		  this.didian = didian;
	 }
   public String getDidian()
   { 	    
  	        
      return this.didian;     	
   }
 	 	 private String jiangshi;
	 public void setJiangshi(String jiangshi)
	 {
		  this.jiangshi = jiangshi;
	 }
   public String getJiangshi()
   { 	    
  	        
      return this.jiangshi;     	
   }
 	 	 private Long jiangshiid;
	 public void setJiangshiid(Long jiangshiid)
	 {
		  this.jiangshiid = jiangshiid;
	 }
   public Long getJiangshiid()
   { 	    
  	        
      return this.jiangshiid;     	
   }
 	 	 private String jiangshipj;
	 public void setJiangshipj(String jiangshipj)
	 {
		  this.jiangshipj = jiangshipj;
	 }
   public String getJiangshipj()
   { 	    
  	        
      return this.jiangshipj;     	
   }
 	 	 private Long kecheng;
	 public void setKecheng(Long kecheng)
	 {
		  this.kecheng = kecheng;
	 }
   public Long getKecheng()
   { 	    
  	        
      return this.kecheng;     	
   }
 	 	 private String kechengmc;
	 public void setKechengmc(String kechengmc)
	 {
		  this.kechengmc = kechengmc;
	 }
   public String getKechengmc()
   { 	    
  	        
      return this.kechengmc;     	
   }
 	 	 private String kejiankfsj;
	 public void setKejiankfsj(String kejiankfsj)
	 {
		  this.kejiankfsj = kejiankfsj;
	 }
   public String getKejiankfsj()
   { 	    
  	        
      return this.kejiankfsj;     	
   }
 	 	 private String kejian;
	 public void setKejian(String kejian)
	 {
		  this.kejian = kejian;
	 }
   public String getKejian()
   { 	    
  	        
      return this.kejian;     	
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
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
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
 	 	 private String peixundx;
	 public void setPeixundx(String peixundx)
	 {
		  this.peixundx = peixundx;
	 }
   public String getPeixundx()
   { 	    
  	        
      return this.peixundx;     	
   }
 	 	 private Double peixunfy;
	 public void setPeixunfy(Double peixunfy)
	 {
		  this.peixunfy = peixunfy;
	 }
   public Double getPeixunfy()
   { 	    
  	        
      return this.peixunfy;     	
   }
 	 	 private Timestamp peixunjssj;
	 public void setPeixunjssj(Timestamp peixunjssj)
	 {
		  this.peixunjssj = peixunjssj;
	 }
   public Timestamp getPeixunjssj()
   { 	    
  	    	  if( this.peixunjssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.peixunjssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.peixunjssj;     	
   }
 	 	 private Timestamp peixunkssj;
	 public void setPeixunkssj(Timestamp peixunkssj)
	 {
		  this.peixunkssj = peixunkssj;
	 }
   public Timestamp getPeixunkssj()
   { 	    
  	    	  if( this.peixunkssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.peixunkssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.peixunkssj;     	
   }
 	 	 private Double peixunsc;
	 public void setPeixunsc(Double peixunsc)
	 {
		  this.peixunsc = peixunsc;
	 }
   public Double getPeixunsc()
   { 	    
  	        
      return this.peixunsc;     	
   }
 	 	 private String peixunxs;
	 public void setPeixunxs(String peixunxs)
	 {
		  this.peixunxs = peixunxs;
	 }
   public String getPeixunxs()
   { 	    
  	        
      return this.peixunxs;     	
   }
 	 	 private Integer renshu;
	 public void setRenshu(Integer renshu)
	 {
		  this.renshu = renshu;
	 }
   public Integer getRenshu()
   { 	    
  	        
      return this.renshu;     	
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
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee jiangshiidRef;
	 public void setJiangshiidRef(com.actiz.platform.application.dataset.pojo.Atzemployee jiangshiidRef)
	 {
		  this.jiangshiidRef = jiangshiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getJiangshiidRef()
   {
     	return this.jiangshiidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkecheng kechengRef;
	 public void setKechengRef(com.actiz.platform.application.dataset.pojo.Atzkecheng kechengRef)
	 {
		  this.kechengRef = kechengRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkecheng getKechengRef()
   {
     	return this.kechengRef;
   }
  
	private java.util.Set atzpeixunfkSet;
	public void setAtzpeixunfkSet(java.util.Set atzpeixunfkSet)
	{
		 this.atzpeixunfkSet = atzpeixunfkSet;
	}
  public java.util.Set getAtzpeixunfkSet()
  {
     return this.atzpeixunfkSet;
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