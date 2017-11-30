package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigoufksq implements Serializable,IPojo
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
	  	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
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
 	 	 private Double hetongydzj;
	 public void setHetongydzj(Double hetongydzj)
	 {
		  this.hetongydzj = hetongydzj;
	 }
   public Double getHetongydzj()
   { 	    
  	        
      return this.hetongydzj;     	
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
 	 	 private Long shenqingry;
	 public void setShenqingry(Long shenqingry)
	 {
		  this.shenqingry = shenqingry;
	 }
   public Long getShenqingry()
   { 	    
  	        
      return this.shenqingry;     	
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
 	 	 private String shenheyjzt;
	 public void setShenheyjzt(String shenheyjzt)
	 {
		  this.shenheyjzt = shenheyjzt;
	 }
   public String getShenheyjzt()
   { 	    
  	        
      return this.shenheyjzt;     	
   }
 	 	 private String shifoutjsh;
	 public void setShifoutjsh(String shifoutjsh)
	 {
		  this.shifoutjsh = shifoutjsh;
	 }
   public String getShifoutjsh()
   { 	    
  	        
      return this.shifoutjsh;     	
   }
 	 	 private String shifoucxbj;
	 public void setShifoucxbj(String shifoucxbj)
	 {
		  this.shifoucxbj = shifoucxbj;
	 }
   public String getShifoucxbj()
   { 	    
  	        
      return this.shifoucxbj;     	
   }
 	 	 private Date tijiaosj;
	 public void setTijiaosj(Date tijiaosj)
	 {
		  this.tijiaosj = tijiaosj;
	 }
   public Date getTijiaosj()
   { 	    
  	  	    if( this.tijiaosj != null )
	    {
	        return (Date)new ActizDate( this.tijiaosj.getTime() );
	    }
	          
      return this.tijiaosj;     	
   }
 	 	 private Date wanchengfksj;
	 public void setWanchengfksj(Date wanchengfksj)
	 {
		  this.wanchengfksj = wanchengfksj;
	 }
   public Date getWanchengfksj()
   { 	    
  	  	    if( this.wanchengfksj != null )
	    {
	        return (Date)new ActizDate( this.wanchengfksj.getTime() );
	    }
	          
      return this.wanchengfksj;     	
   }
 	 	 private String zhixingzt;
	 public void setZhixingzt(String zhixingzt)
	 {
		  this.zhixingzt = zhixingzt;
	 }
   public String getZhixingzt()
   { 	    
  	        
      return this.zhixingzt;     	
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
 	 	 private Double zuizhongzj;
	 public void setZuizhongzj(Double zuizhongzj)
	 {
		  this.zuizhongzj = zuizhongzj;
	 }
   public Double getZuizhongzj()
   { 	    
  	        
      return this.zuizhongzj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef;
	 public void setBizhongidRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef)
	 {
		  this.bizhongidRef = bizhongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongidRef()
   {
     	return this.bizhongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shenqingryRef;
	 public void setShenqingryRef(com.actiz.platform.application.dataset.pojo.Atzemployee shenqingryRef)
	 {
		  this.shenqingryRef = shenqingryRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShenqingryRef()
   {
     	return this.shenqingryRef;
   }
  
	private java.util.Set atzcaigoufkdmxSet;
	public void setAtzcaigoufkdmxSet(java.util.Set atzcaigoufkdmxSet)
	{
		 this.atzcaigoufkdmxSet = atzcaigoufkdmxSet;
	}
  public java.util.Set getAtzcaigoufkdmxSet()
  {
     return this.atzcaigoufkdmxSet;
  }
 
	private java.util.Set atzcgfkshenhejlSet;
	public void setAtzcgfkshenhejlSet(java.util.Set atzcgfkshenhejlSet)
	{
		 this.atzcgfkshenhejlSet = atzcgfkshenhejlSet;
	}
  public java.util.Set getAtzcgfkshenhejlSet()
  {
     return this.atzcgfkshenhejlSet;
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