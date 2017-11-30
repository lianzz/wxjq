package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfukuantk implements Serializable,IPojo
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
	  	 	 private Long atzxiaoshouddid;
	 public void setAtzxiaoshouddid(Long atzxiaoshouddid)
	 {
		  this.atzxiaoshouddid = atzxiaoshouddid;
	 }
   public Long getAtzxiaoshouddid()
   { 	    
  	        
      return this.atzxiaoshouddid;     	
   }
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private String fukuanmc;
	 public void setFukuanmc(String fukuanmc)
	 {
		  this.fukuanmc = fukuanmc;
	 }
   public String getFukuanmc()
   { 	    
  	        
      return this.fukuanmc;     	
   }
 	 	 private Double hetongje;
	 public void setHetongje(Double hetongje)
	 {
		  this.hetongje = hetongje;
	 }
   public Double getHetongje()
   { 	    
  	        
      return this.hetongje;     	
   }
 	 	 private Double hetongwbje;
	 public void setHetongwbje(Double hetongwbje)
	 {
		  this.hetongwbje = hetongwbje;
	 }
   public Double getHetongwbje()
   { 	    
  	        
      return this.hetongwbje;     	
   }
 	 	 private Date hetongzfsj;
	 public void setHetongzfsj(Date hetongzfsj)
	 {
		  this.hetongzfsj = hetongzfsj;
	 }
   public Date getHetongzfsj()
   { 	    
  	  	    if( this.hetongzfsj != null )
	    {
	        return (Date)new ActizDate( this.hetongzfsj.getTime() );
	    }
	          
      return this.hetongzfsj;     	
   }
 	 	 private String kuanxiang;
	 public void setKuanxiang(String kuanxiang)
	 {
		  this.kuanxiang = kuanxiang;
	 }
   public String getKuanxiang()
   { 	    
  	        
      return this.kuanxiang;     	
   }
 	 	 private Double kuanxiangbl;
	 public void setKuanxiangbl(Double kuanxiangbl)
	 {
		  this.kuanxiangbl = kuanxiangbl;
	 }
   public Double getKuanxiangbl()
   { 	    
  	        
      return this.kuanxiangbl;     	
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
 	 	 private Long wubizl;
	 public void setWubizl(Long wubizl)
	 {
		  this.wubizl = wubizl;
	 }
   public Long getWubizl()
   { 	    
  	        
      return this.wubizl;     	
   }
 	 	 private String zhifutj;
	 public void setZhifutj(String zhifutj)
	 {
		  this.zhifutj = zhifutj;
	 }
   public String getZhifutj()
   { 	    
  	        
      return this.zhifutj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoudd atzxiaoshouddidRef;
	 public void setAtzxiaoshouddidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoudd atzxiaoshouddidRef)
	 {
		  this.atzxiaoshouddidRef = atzxiaoshouddidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoudd getAtzxiaoshouddidRef()
   {
     	return this.atzxiaoshouddidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef;
	 public void setWubizlRef(com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef)
	 {
		  this.wubizlRef = wubizlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getWubizlRef()
   {
     	return this.wubizlRef;
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