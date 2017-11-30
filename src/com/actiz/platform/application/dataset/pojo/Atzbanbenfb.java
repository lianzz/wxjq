package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbanbenfb implements Serializable,IPojo
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
	  	 	 private String banbenfj;
	 public void setBanbenfj(String banbenfj)
	 {
		  this.banbenfj = banbenfj;
	 }
   public String getBanbenfj()
   { 	    
  	        
      return this.banbenfj;     	
   }
 	 	 private String banbenh;
	 public void setBanbenh(String banbenh)
	 {
		  this.banbenh = banbenh;
	 }
   public String getBanbenh()
   { 	    
  	        
      return this.banbenh;     	
   }
 	 	 private String banbenms;
	 public void setBanbenms(String banbenms)
	 {
		  this.banbenms = banbenms;
	 }
   public String getBanbenms()
   { 	    
  	        
      return this.banbenms;     	
   }
 	 	 private String banbenqc;
	 public void setBanbenqc(String banbenqc)
	 {
		  this.banbenqc = banbenqc;
	 }
   public String getBanbenqc()
   { 	    
  	        
      return this.banbenqc;     	
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
 	 	 private String fabur;
	 public void setFabur(String fabur)
	 {
		  this.fabur = fabur;
	 }
   public String getFabur()
   { 	    
  	        
      return this.fabur;     	
   }
 	 	 private Date faburq;
	 public void setFaburq(Date faburq)
	 {
		  this.faburq = faburq;
	 }
   public Date getFaburq()
   { 	    
  	  	    if( this.faburq != null )
	    {
	        return (Date)new ActizDate( this.faburq.getTime() );
	    }
	          
      return this.faburq;     	
   }
 	 	 private Long fubanbenfbid;
	 public void setFubanbenfbid(Long fubanbenfbid)
	 {
		  this.fubanbenfbid = fubanbenfbid;
	 }
   public Long getFubanbenfbid()
   { 	    
  	        
      return this.fubanbenfbid;     	
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
 	 	 private String xitong;
	 public void setXitong(String xitong)
	 {
		  this.xitong = xitong;
	 }
   public String getXitong()
   { 	    
  	        
      return this.xitong;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzbanbenfb fubanbenfbidRef;
	 public void setFubanbenfbidRef(com.actiz.platform.application.dataset.pojo.Atzbanbenfb fubanbenfbidRef)
	 {
		  this.fubanbenfbidRef = fubanbenfbidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbanbenfb getFubanbenfbidRef()
   {
     	return this.fubanbenfbidRef;
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