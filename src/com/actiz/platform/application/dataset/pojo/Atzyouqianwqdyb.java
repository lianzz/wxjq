package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyouqianwqdyb implements Serializable,IPojo
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
 	 	 private Long wuqianwlid;
	 public void setWuqianwlid(Long wuqianwlid)
	 {
		  this.wuqianwlid = wuqianwlid;
	 }
   public Long getWuqianwlid()
   { 	    
  	        
      return this.wuqianwlid;     	
   }
 	 	 private Long youqianwlid;
	 public void setYouqianwlid(Long youqianwlid)
	 {
		  this.youqianwlid = youqianwlid;
	 }
   public Long getYouqianwlid()
   { 	    
  	        
      return this.youqianwlid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuqianwlidRef;
	 public void setWuqianwlidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuqianwlidRef)
	 {
		  this.wuqianwlidRef = wuqianwlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuqianwlidRef()
   {
     	return this.wuqianwlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx youqianwlidRef;
	 public void setYouqianwlidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx youqianwlidRef)
	 {
		  this.youqianwlidRef = youqianwlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getYouqianwlidRef()
   {
     	return this.youqianwlidRef;
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