package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshoukuanmx implements Serializable,IPojo
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
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private String fukuanfs;
	 public void setFukuanfs(String fukuanfs)
	 {
		  this.fukuanfs = fukuanfs;
	 }
   public String getFukuanfs()
   { 	    
  	        
      return this.fukuanfs;     	
   }
 	 	 private Long fukuantkid;
	 public void setFukuantkid(Long fukuantkid)
	 {
		  this.fukuantkid = fukuantkid;
	 }
   public Long getFukuantkid()
   { 	    
  	        
      return this.fukuantkid;     	
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
 	 	 private Long kaipiaomxid;
	 public void setKaipiaomxid(Long kaipiaomxid)
	 {
		  this.kaipiaomxid = kaipiaomxid;
	 }
   public Long getKaipiaomxid()
   { 	    
  	        
      return this.kaipiaomxid;     	
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
 	 	 private Date shangduicdsj;
	 public void setShangduicdsj(Date shangduicdsj)
	 {
		  this.shangduicdsj = shangduicdsj;
	 }
   public Date getShangduicdsj()
   { 	    
  	  	    if( this.shangduicdsj != null )
	    {
	        return (Date)new ActizDate( this.shangduicdsj.getTime() );
	    }
	          
      return this.shangduicdsj;     	
   }
 	 	 private String shebeilb;
	 public void setShebeilb(String shebeilb)
	 {
		  this.shebeilb = shebeilb;
	 }
   public String getShebeilb()
   { 	    
  	        
      return this.shebeilb;     	
   }
 	 	 private Double jine;
	 public void setJine(Double jine)
	 {
		  this.jine = jine;
	 }
   public Double getJine()
   { 	    
  	        
      return this.jine;     	
   }
 	 	 private Date zhifusj;
	 public void setZhifusj(Date zhifusj)
	 {
		  this.zhifusj = zhifusj;
	 }
   public Date getZhifusj()
   { 	    
  	  	    if( this.zhifusj != null )
	    {
	        return (Date)new ActizDate( this.zhifusj.getTime() );
	    }
	          
      return this.zhifusj;     	
   }
 	 	 private Double shijijfwbje;
	 public void setShijijfwbje(Double shijijfwbje)
	 {
		  this.shijijfwbje = shijijfwbje;
	 }
   public Double getShijijfwbje()
   { 	    
  	        
      return this.shijijfwbje;     	
   }
 	 	 private Date shoudaosdsj;
	 public void setShoudaosdsj(Date shoudaosdsj)
	 {
		  this.shoudaosdsj = shoudaosdsj;
	 }
   public Date getShoudaosdsj()
   { 	    
  	  	    if( this.shoudaosdsj != null )
	    {
	        return (Date)new ActizDate( this.shoudaosdsj.getTime() );
	    }
	          
      return this.shoudaosdsj;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzfukuantk fukuantkidRef;
	 public void setFukuantkidRef(com.actiz.platform.application.dataset.pojo.Atzfukuantk fukuantkidRef)
	 {
		  this.fukuantkidRef = fukuantkidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfukuantk getFukuantkidRef()
   {
     	return this.fukuantkidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkaipiaomx kaipiaomxidRef;
	 public void setKaipiaomxidRef(com.actiz.platform.application.dataset.pojo.Atzkaipiaomx kaipiaomxidRef)
	 {
		  this.kaipiaomxidRef = kaipiaomxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkaipiaomx getKaipiaomxidRef()
   {
     	return this.kaipiaomxidRef;
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