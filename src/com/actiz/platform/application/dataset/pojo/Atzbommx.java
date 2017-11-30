package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbommx implements Serializable,IPojo
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
	  	 	 private Long atzbomid;
	 public void setAtzbomid(Long atzbomid)
	 {
		  this.atzbomid = atzbomid;
	 }
   public Long getAtzbomid()
   { 	    
  	        
      return this.atzbomid;     	
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
 	 	 private Integer cengci;
	 public void setCengci(Integer cengci)
	 {
		  this.cengci = cengci;
	 }
   public Integer getCengci()
   { 	    
  	        
      return this.cengci;     	
   }
 	 	 private Long fubommxid;
	 public void setFubommxid(Long fubommxid)
	 {
		  this.fubommxid = fubommxid;
	 }
   public Long getFubommxid()
   { 	    
  	        
      return this.fubommxid;     	
   }
 	 	 private String lujing;
	 public void setLujing(String lujing)
	 {
		  this.lujing = lujing;
	 }
   public String getLujing()
   { 	    
  	        
      return this.lujing;     	
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
 	 	 private String shifoucymrp;
	 public void setShifoucymrp(String shifoucymrp)
	 {
		  this.shifoucymrp = shifoucymrp;
	 }
   public String getShifoucymrp()
   { 	    
  	        
      return this.shifoucymrp;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private String yuanjianwh;
	 public void setYuanjianwh(String yuanjianwh)
	 {
		  this.yuanjianwh = yuanjianwh;
	 }
   public String getYuanjianwh()
   { 	    
  	        
      return this.yuanjianwh;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzbom atzbomidRef;
	 public void setAtzbomidRef(com.actiz.platform.application.dataset.pojo.Atzbom atzbomidRef)
	 {
		  this.atzbomidRef = atzbomidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbom getAtzbomidRef()
   {
     	return this.atzbomidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbommx fubommxidRef;
	 public void setFubommxidRef(com.actiz.platform.application.dataset.pojo.Atzbommx fubommxidRef)
	 {
		  this.fubommxidRef = fubommxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbommx getFubommxidRef()
   {
     	return this.fubommxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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