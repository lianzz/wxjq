package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyoujianfsjl implements Serializable,IPojo
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
	  	 	 private Timestamp fasongsj;
	 public void setFasongsj(Timestamp fasongsj)
	 {
		  this.fasongsj = fasongsj;
	 }
   public Timestamp getFasongsj()
   { 	    
  	    	  if( this.fasongsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.fasongsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.fasongsj;     	
   }
 	 	 private String fasongzt;
	 public void setFasongzt(String fasongzt)
	 {
		  this.fasongzt = fasongzt;
	 }
   public String getFasongzt()
   { 	    
  	        
      return this.fasongzt;     	
   }
 	 	 private String neirong;
	 public void setNeirong(String neirong)
	 {
		  this.neirong = neirong;
	 }
   public String getNeirong()
   { 	    
  	        
      return this.neirong;     	
   }
 	 	 private Long taskid;
	 public void setTaskid(Long taskid)
	 {
		  this.taskid = taskid;
	 }
   public Long getTaskid()
   { 	    
  	        
      return this.taskid;     	
   }
 	 	 private String shoujianren;
	 public void setShoujianren(String shoujianren)
	 {
		  this.shoujianren = shoujianren;
	 }
   public String getShoujianren()
   { 	    
  	        
      return this.shoujianren;     	
   }
 	 	 private String shoujianryx;
	 public void setShoujianryx(String shoujianryx)
	 {
		  this.shoujianryx = shoujianryx;
	 }
   public String getShoujianryx()
   { 	    
  	        
      return this.shoujianryx;     	
   }
 	 	 private Long fasongid;
	 public void setFasongid(Long fasongid)
	 {
		  this.fasongid = fasongid;
	 }
   public Long getFasongid()
   { 	    
  	        
      return this.fasongid;     	
   }
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztask taskidRef;
	 public void setTaskidRef(com.actiz.platform.application.dataset.pojo.Atztask taskidRef)
	 {
		  this.taskidRef = taskidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztask getTaskidRef()
   {
     	return this.taskidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchongfufsyj fasongidRef;
	 public void setFasongidRef(com.actiz.platform.application.dataset.pojo.Atzchongfufsyj fasongidRef)
	 {
		  this.fasongidRef = fasongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchongfufsyj getFasongidRef()
   {
     	return this.fasongidRef;
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