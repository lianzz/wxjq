package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxyuangong implements Serializable,IPojo
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
	  	 	 private Long bumenmc;
	 public void setBumenmc(Long bumenmc)
	 {
		  this.bumenmc = bumenmc;
	 }
   public Long getBumenmc()
   { 	    
  	        
      return this.bumenmc;     	
   }
 	 	 private Timestamp lururq;
	 public void setLururq(Timestamp lururq)
	 {
		  this.lururq = lururq;
	 }
   public Timestamp getLururq()
   { 	    
  	    	  if( this.lururq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lururq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lururq;     	
   }
 	 	 private Date ruzhisj;
	 public void setRuzhisj(Date ruzhisj)
	 {
		  this.ruzhisj = ruzhisj;
	 }
   public Date getRuzhisj()
   { 	    
  	  	    if( this.ruzhisj != null )
	    {
	        return (Date)new ActizDate( this.ruzhisj.getTime() );
	    }
	          
      return this.ruzhisj;     	
   }
 	 	 private String yuangongbh;
	 public void setYuangongbh(String yuangongbh)
	 {
		  this.yuangongbh = yuangongbh;
	 }
   public String getYuangongbh()
   { 	    
  	        
      return this.yuangongbh;     	
   }
 	 	 private String yuangongmc;
	 public void setYuangongmc(String yuangongmc)
	 {
		  this.yuangongmc = yuangongmc;
	 }
   public String getYuangongmc()
   { 	    
  	        
      return this.yuangongmc;     	
   }
 	 	 private String yaungongxb;
	 public void setYaungongxb(String yaungongxb)
	 {
		  this.yaungongxb = yaungongxb;
	 }
   public String getYaungongxb()
   { 	    
  	        
      return this.yaungongxb;     	
   }
 	 	 private String yuangongxl;
	 public void setYuangongxl(String yuangongxl)
	 {
		  this.yuangongxl = yuangongxl;
	 }
   public String getYuangongxl()
   { 	    
  	        
      return this.yuangongxl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxbumen bumenmcRef;
	 public void setBumenmcRef(com.actiz.platform.application.dataset.pojo.Atzxbumen bumenmcRef)
	 {
		  this.bumenmcRef = bumenmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxbumen getBumenmcRef()
   {
     	return this.bumenmcRef;
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