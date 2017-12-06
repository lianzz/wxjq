package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdepartment implements Serializable,IPojo
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
	  	 	 private String orgname;
	 public void setOrgname(String orgname)
	 {
		  this.orgname = orgname;
	 }
   public String getOrgname()
   { 	    
  	        
      return this.orgname;     	
   }
 	 	 private String orgcode;
	 public void setOrgcode(String orgcode)
	 {
		  this.orgcode = orgcode;
	 }
   public String getOrgcode()
   { 	    
  	        
      return this.orgcode;     	
   }
 	 	 private String tel;
	 public void setTel(String tel)
	 {
		  this.tel = tel;
	 }
   public String getTel()
   { 	    
  	        
      return this.tel;     	
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
 	 	 private Long fudepartid;
	 public void setFudepartid(Long fudepartid)
	 {
		  this.fudepartid = fudepartid;
	 }
   public Long getFudepartid()
   { 	    
  	        
      return this.fudepartid;     	
   }
 	 	 private Long managerid;
	 public void setManagerid(Long managerid)
	 {
		  this.managerid = managerid;
	 }
   public Long getManagerid()
   { 	    
  	        
      return this.managerid;     	
   }
 	 	 private Long gczgid;
	 public void setGczgid(Long gczgid)
	 {
		  this.gczgid = gczgid;
	 }
   public Long getGczgid()
   { 	    
  	        
      return this.gczgid;     	
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
 	 	 private Integer statuss;
	 public void setStatuss(Integer statuss)
	 {
		  this.statuss = statuss;
	 }
   public Integer getStatuss()
   { 	    
  	        
      return this.statuss;     	
   }
 	 	 private String yewulx;
	 public void setYewulx(String yewulx)
	 {
		  this.yewulx = yewulx;
	 }
   public String getYewulx()
   { 	    
  	        
      return this.yewulx;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment fudepartidRef;
	 public void setFudepartidRef(com.actiz.platform.application.dataset.pojo.Atzdepartment fudepartidRef)
	 {
		  this.fudepartidRef = fudepartidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getFudepartidRef()
   {
     	return this.fudepartidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee manageridRef;
	 public void setManageridRef(com.actiz.platform.application.dataset.pojo.Atzemployee manageridRef)
	 {
		  this.manageridRef = manageridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getManageridRef()
   {
     	return this.manageridRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee gczgidRef;
	 public void setGczgidRef(com.actiz.platform.application.dataset.pojo.Atzemployee gczgidRef)
	 {
		  this.gczgidRef = gczgidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getGczgidRef()
   {
     	return this.gczgidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
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