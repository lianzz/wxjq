package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqingjiadmx implements Serializable,IPojo
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
	  	 	 private Timestamp jssj;
	 public void setJssj(Timestamp jssj)
	 {
		  this.jssj = jssj;
	 }
   public Timestamp getJssj()
   { 	    
  	    	  if( this.jssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.jssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.jssj;     	
   }
 	 	 private Timestamp kssj;
	 public void setKssj(Timestamp kssj)
	 {
		  this.kssj = kssj;
	 }
   public Timestamp getKssj()
   { 	    
  	    	  if( this.kssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.kssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.kssj;     	
   }
 	 	 private String qingjialx;
	 public void setQingjialx(String qingjialx)
	 {
		  this.qingjialx = qingjialx;
	 }
   public String getQingjialx()
   { 	    
  	        
      return this.qingjialx;     	
   }
 	 	 private Date kaishisj;
	 public void setKaishisj(Date kaishisj)
	 {
		  this.kaishisj = kaishisj;
	 }
   public Date getKaishisj()
   { 	    
  	  	    if( this.kaishisj != null )
	    {
	        return (Date)new ActizDate( this.kaishisj.getTime() );
	    }
	          
      return this.kaishisj;     	
   }
 	 	 private Long qingjiadid;
	 public void setQingjiadid(Long qingjiadid)
	 {
		  this.qingjiadid = qingjiadid;
	 }
   public Long getQingjiadid()
   { 	    
  	        
      return this.qingjiadid;     	
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
 	 	 private Double shishu;
	 public void setShishu(Double shishu)
	 {
		  this.shishu = shishu;
	 }
   public Double getShishu()
   { 	    
  	        
      return this.shishu;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzqingjiad qingjiadidRef;
	 public void setQingjiadidRef(com.actiz.platform.application.dataset.pojo.Atzqingjiad qingjiadidRef)
	 {
		  this.qingjiadidRef = qingjiadidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzqingjiad getQingjiadidRef()
   {
     	return this.qingjiadidRef;
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