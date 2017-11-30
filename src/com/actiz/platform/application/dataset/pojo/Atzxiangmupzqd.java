package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiangmupzqd implements Serializable,IPojo
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
 	 	 private Long kehu;
	 public void setKehu(Long kehu)
	 {
		  this.kehu = kehu;
	 }
   public Long getKehu()
   { 	    
  	        
      return this.kehu;     	
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
 	 	 private String peijianlx;
	 public void setPeijianlx(String peijianlx)
	 {
		  this.peijianlx = peijianlx;
	 }
   public String getPeijianlx()
   { 	    
  	        
      return this.peijianlx;     	
   }
 	 	 private Long shenher;
	 public void setShenher(Long shenher)
	 {
		  this.shenher = shenher;
	 }
   public Long getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private String shyj;
	 public void setShyj(String shyj)
	 {
		  this.shyj = shyj;
	 }
   public String getShyj()
   { 	    
  	        
      return this.shyj;     	
   }
 	 	 private String shzt;
	 public void setShzt(String shzt)
	 {
		  this.shzt = shzt;
	 }
   public String getShzt()
   { 	    
  	        
      return this.shzt;     	
   }
 	 	 private String shifouyfh;
	 public void setShifouyfh(String shifouyfh)
	 {
		  this.shifouyfh = shifouyfh;
	 }
   public String getShifouyfh()
   { 	    
  	        
      return this.shifouyfh;     	
   }
 	 	 private String qingdanmc;
	 public void setQingdanmc(String qingdanmc)
	 {
		  this.qingdanmc = qingdanmc;
	 }
   public String getQingdanmc()
   { 	    
  	        
      return this.qingdanmc;     	
   }
 	 	 private Long yewuzcd;
	 public void setYewuzcd(Long yewuzcd)
	 {
		  this.yewuzcd = yewuzcd;
	 }
   public Long getYewuzcd()
   { 	    
  	        
      return this.yewuzcd;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shenherRef;
	 public void setShenherRef(com.actiz.platform.application.dataset.pojo.Atzemployee shenherRef)
	 {
		  this.shenherRef = shenherRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShenherRef()
   {
     	return this.shenherRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzyewuzc yewuzcdRef;
	 public void setYewuzcdRef(com.actiz.platform.application.dataset.pojo.Atzyewuzc yewuzcdRef)
	 {
		  this.yewuzcdRef = yewuzcdRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyewuzc getYewuzcdRef()
   {
     	return this.yewuzcdRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzpeizhimbqdSet;
	public void setAtzpeizhimbqdSet(java.util.Set atzpeizhimbqdSet)
	{
		 this.atzpeizhimbqdSet = atzpeizhimbqdSet;
	}
  public java.util.Set getAtzpeizhimbqdSet()
  {
     return this.atzpeizhimbqdSet;
  }
 
	private java.util.Set atzxiangmupzmxSet;
	public void setAtzxiangmupzmxSet(java.util.Set atzxiangmupzmxSet)
	{
		 this.atzxiangmupzmxSet = atzxiangmupzmxSet;
	}
  public java.util.Set getAtzxiangmupzmxSet()
  {
     return this.atzxiangmupzmxSet;
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