package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdafuqk implements Serializable,IPojo
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
	  	 	 private Long calllogid;
	 public void setCalllogid(Long calllogid)
	 {
		  this.calllogid = calllogid;
	 }
   public Long getCalllogid()
   { 	    
  	        
      return this.calllogid;     	
   }
 	 	 private String dafuqk;
	 public void setDafuqk(String dafuqk)
	 {
		  this.dafuqk = dafuqk;
	 }
   public String getDafuqk()
   { 	    
  	        
      return this.dafuqk;     	
   }
 	 	 private String dafuqky;
	 public void setDafuqky(String dafuqky)
	 {
		  this.dafuqky = dafuqky;
	 }
   public String getDafuqky()
   { 	    
  	        
      return this.dafuqky;     	
   }
 	 	 private Timestamp dafurq;
	 public void setDafurq(Timestamp dafurq)
	 {
		  this.dafurq = dafurq;
	 }
   public Timestamp getDafurq()
   { 	    
  	    	  if( this.dafurq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.dafurq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.dafurq;     	
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
 	 	 private String fuzer;
	 public void setFuzer(String fuzer)
	 {
		  this.fuzer = fuzer;
	 }
   public String getFuzer()
   { 	    
  	        
      return this.fuzer;     	
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
 	 	 private Integer xvhao;
	 public void setXvhao(Integer xvhao)
	 {
		  this.xvhao = xvhao;
	 }
   public Integer getXvhao()
   { 	    
  	        
      return this.xvhao;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzcalllog calllogidRef;
	 public void setCalllogidRef(com.actiz.platform.application.dataset.pojo.Atzcalllog calllogidRef)
	 {
		  this.calllogidRef = calllogidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcalllog getCalllogidRef()
   {
     	return this.calllogidRef;
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