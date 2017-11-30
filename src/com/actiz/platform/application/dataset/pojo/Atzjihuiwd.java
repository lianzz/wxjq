package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjihuiwd implements Serializable,IPojo
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
	  	 	 private Date chuangjianrq;
	 public void setChuangjianrq(Date chuangjianrq)
	 {
		  this.chuangjianrq = chuangjianrq;
	 }
   public Date getChuangjianrq()
   { 	    
  	  	    if( this.chuangjianrq != null )
	    {
	        return (Date)new ActizDate( this.chuangjianrq.getTime() );
	    }
	          
      return this.chuangjianrq;     	
   }
 	 	 private String chuangjianz;
	 public void setChuangjianz(String chuangjianz)
	 {
		  this.chuangjianz = chuangjianz;
	 }
   public String getChuangjianz()
   { 	    
  	        
      return this.chuangjianz;     	
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
 	 	 private String wendangfj;
	 public void setWendangfj(String wendangfj)
	 {
		  this.wendangfj = wendangfj;
	 }
   public String getWendangfj()
   { 	    
  	        
      return this.wendangfj;     	
   }
 	 	 private String wendanglx;
	 public void setWendanglx(String wendanglx)
	 {
		  this.wendanglx = wendanglx;
	 }
   public String getWendanglx()
   { 	    
  	        
      return this.wendanglx;     	
   }
 	 	 private String wendangms;
	 public void setWendangms(String wendangms)
	 {
		  this.wendangms = wendangms;
	 }
   public String getWendangms()
   { 	    
  	        
      return this.wendangms;     	
   }
 	 	 private String wendangmc;
	 public void setWendangmc(String wendangmc)
	 {
		  this.wendangmc = wendangmc;
	 }
   public String getWendangmc()
   { 	    
  	        
      return this.wendangmc;     	
   }
 	 	 private Long xiaoshoujh;
	 public void setXiaoshoujh(Long xiaoshoujh)
	 {
		  this.xiaoshoujh = xiaoshoujh;
	 }
   public Long getXiaoshoujh()
   { 	    
  	        
      return this.xiaoshoujh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhRef;
	 public void setXiaoshoujhRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhRef)
	 {
		  this.xiaoshoujhRef = xiaoshoujhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiaoshoujhRef()
   {
     	return this.xiaoshoujhRef;
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