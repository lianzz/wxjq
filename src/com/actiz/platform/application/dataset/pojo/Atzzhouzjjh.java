package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhouzjjh implements Serializable,IPojo
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
	  	 	 private String jihuamc;
	 public void setJihuamc(String jihuamc)
	 {
		  this.jihuamc = jihuamc;
	 }
   public String getJihuamc()
   { 	    
  	        
      return this.jihuamc;     	
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
 	 	 private Timestamp lurusj;
	 public void setLurusj(Timestamp lurusj)
	 {
		  this.lurusj = lurusj;
	 }
   public Timestamp getLurusj()
   { 	    
  	    	  if( this.lurusj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lurusj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lurusj;     	
   }
 	 	 private String shenher;
	 public void setShenher(String shenher)
	 {
		  this.shenher = shenher;
	 }
   public String getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private Timestamp shenhesj;
	 public void setShenhesj(Timestamp shenhesj)
	 {
		  this.shenhesj = shenhesj;
	 }
   public Timestamp getShenhesj()
   { 	    
  	    	  if( this.shenhesj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.shenhesj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.shenhesj;     	
   }
 	 	 private String shyjzt;
	 public void setShyjzt(String shyjzt)
	 {
		  this.shyjzt = shyjzt;
	 }
   public String getShyjzt()
   { 	    
  	        
      return this.shyjzt;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private String shifouhz;
	 public void setShifouhz(String shifouhz)
	 {
		  this.shifouhz = shifouhz;
	 }
   public String getShifouhz()
   { 	    
  	        
      return this.shifouhz;     	
   }
 	 	 private String zongjiemc;
	 public void setZongjiemc(String zongjiemc)
	 {
		  this.zongjiemc = zongjiemc;
	 }
   public String getZongjiemc()
   { 	    
  	        
      return this.zongjiemc;     	
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
 	 	 private Timestamp zuihouxgsj;
	 public void setZuihouxgsj(Timestamp zuihouxgsj)
	 {
		  this.zuihouxgsj = zuihouxgsj;
	 }
   public Timestamp getZuihouxgsj()
   { 	    
  	    	  if( this.zuihouxgsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.zuihouxgsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.zuihouxgsj;     	
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