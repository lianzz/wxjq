package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxunjianwt implements Serializable,IPojo
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
	  	 	 private String chulijy;
	 public void setChulijy(String chulijy)
	 {
		  this.chulijy = chulijy;
	 }
   public String getChulijy()
   { 	    
  	        
      return this.chulijy;     	
   }
 	 	 private String chulijg;
	 public void setChulijg(String chulijg)
	 {
		  this.chulijg = chulijg;
	 }
   public String getChulijg()
   { 	    
  	        
      return this.chulijg;     	
   }
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
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
 	 	 private String shifougb;
	 public void setShifougb(String shifougb)
	 {
		  this.shifougb = shifougb;
	 }
   public String getShifougb()
   { 	    
  	        
      return this.shifougb;     	
   }
 	 	 private String wentims;
	 public void setWentims(String wentims)
	 {
		  this.wentims = wentims;
	 }
   public String getWentims()
   { 	    
  	        
      return this.wentims;     	
   }
 	 	 private Long xunjianbg;
	 public void setXunjianbg(Long xunjianbg)
	 {
		  this.xunjianbg = xunjianbg;
	 }
   public Long getXunjianbg()
   { 	    
  	        
      return this.xunjianbg;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzxunjianbg xunjianbgRef;
	 public void setXunjianbgRef(com.actiz.platform.application.dataset.pojo.Atzxunjianbg xunjianbgRef)
	 {
		  this.xunjianbgRef = xunjianbgRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxunjianbg getXunjianbgRef()
   {
     	return this.xunjianbgRef;
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