package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztoubiaoqx implements Serializable,IPojo
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
	  	 	 private String qxjtyy;
	 public void setQxjtyy(String qxjtyy)
	 {
		  this.qxjtyy = qxjtyy;
	 }
   public String getQxjtyy()
   { 	    
  	        
      return this.qxjtyy;     	
   }
 	 	 private Timestamp lrrq;
	 public void setLrrq(Timestamp lrrq)
	 {
		  this.lrrq = lrrq;
	 }
   public Timestamp getLrrq()
   { 	    
  	    	  if( this.lrrq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lrrq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lrrq;     	
   }
 	 	 private String qxshzt;
	 public void setQxshzt(String qxshzt)
	 {
		  this.qxshzt = qxshzt;
	 }
   public String getQxshzt()
   { 	    
  	        
      return this.qxshzt;     	
   }
 	 	 private String qxyylb;
	 public void setQxyylb(String qxyylb)
	 {
		  this.qxyylb = qxyylb;
	 }
   public String getQxyylb()
   { 	    
  	        
      return this.qxyylb;     	
   }
 	 	 private String shjg;
	 public void setShjg(String shjg)
	 {
		  this.shjg = shjg;
	 }
   public String getShjg()
   { 	    
  	        
      return this.shjg;     	
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
 	 	 private Date shrq;
	 public void setShrq(Date shrq)
	 {
		  this.shrq = shrq;
	 }
   public Date getShrq()
   { 	    
  	  	    if( this.shrq != null )
	    {
	        return (Date)new ActizDate( this.shrq.getTime() );
	    }
	          
      return this.shrq;     	
   }
 	 	 private String shyj;
	 public void setShyj(String shyj)
	 {
		  this.shyj = shyj;
	 }
   public String getShyj()
   { 	    
  	        
      return this.shyj;     	
   }
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long toubiaoid;
	 public void setToubiaoid(Long toubiaoid)
	 {
		  this.toubiaoid = toubiaoid;
	 }
   public Long getToubiaoid()
   { 	    
  	        
      return this.toubiaoid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaoidRef;
	 public void setToubiaoidRef(com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaoidRef)
	 {
		  this.toubiaoidRef = toubiaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztoubiao getToubiaoidRef()
   {
     	return this.toubiaoidRef;
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