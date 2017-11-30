package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atznianjia implements Serializable,IPojo
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
	  	 	 private Double syts;
	 public void setSyts(Double syts)
	 {
		  this.syts = syts;
	 }
   public Double getSyts()
   { 	    
  	        
      return this.syts;     	
   }
 	 	 private Date jiezhiriqi;
	 public void setJiezhiriqi(Date jiezhiriqi)
	 {
		  this.jiezhiriqi = jiezhiriqi;
	 }
   public Date getJiezhiriqi()
   { 	    
  	  	    if( this.jiezhiriqi != null )
	    {
	        return (Date)new ActizDate( this.jiezhiriqi.getTime() );
	    }
	          
      return this.jiezhiriqi;     	
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
 	 	 private String niandu;
	 public void setNiandu(String niandu)
	 {
		  this.niandu = niandu;
	 }
   public String getNiandu()
   { 	    
  	        
      return this.niandu;     	
   }
 	 	 private Double tianshu;
	 public void setTianshu(Double tianshu)
	 {
		  this.tianshu = tianshu;
	 }
   public Double getTianshu()
   { 	    
  	        
      return this.tianshu;     	
   }
 	 	 private Long ygid;
	 public void setYgid(Long ygid)
	 {
		  this.ygid = ygid;
	 }
   public Long getYgid()
   { 	    
  	        
      return this.ygid;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee ygidRef;
	 public void setYgidRef(com.actiz.platform.application.dataset.pojo.Atzemployee ygidRef)
	 {
		  this.ygidRef = ygidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYgidRef()
   {
     	return this.ygidRef;
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