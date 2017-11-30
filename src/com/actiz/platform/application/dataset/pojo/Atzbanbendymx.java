package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbanbendymx implements Serializable,IPojo
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
 	 	 private Long banbensqd;
	 public void setBanbensqd(Long banbensqd)
	 {
		  this.banbensqd = banbensqd;
	 }
   public Long getBanbensqd()
   { 	    
  	        
      return this.banbensqd;     	
   }
 	 	 private Long banbenxx;
	 public void setBanbenxx(Long banbenxx)
	 {
		  this.banbenxx = banbenxx;
	 }
   public Long getBanbenxx()
   { 	    
  	        
      return this.banbenxx;     	
   }
 	 	 private String banbenmc;
	 public void setBanbenmc(String banbenmc)
	 {
		  this.banbenmc = banbenmc;
	 }
   public String getBanbenmc()
   { 	    
  	        
      return this.banbenmc;     	
   }
 	 	 private String shifoujj;
	 public void setShifoujj(String shifoujj)
	 {
		  this.shifoujj = shifoujj;
	 }
   public String getShifoujj()
   { 	    
  	        
      return this.shifoujj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbanbendysqd banbensqdRef;
	 public void setBanbensqdRef(com.actiz.platform.application.dataset.pojo.Atzbanbendysqd banbensqdRef)
	 {
		  this.banbensqdRef = banbensqdRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbanbendysqd getBanbensqdRef()
   {
     	return this.banbensqdRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbanbenfb banbenxxRef;
	 public void setBanbenxxRef(com.actiz.platform.application.dataset.pojo.Atzbanbenfb banbenxxRef)
	 {
		  this.banbenxxRef = banbenxxRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbanbenfb getBanbenxxRef()
   {
     	return this.banbenxxRef;
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