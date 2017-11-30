package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehuldjl implements Serializable,IPojo
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
	  	 	 private String dianhuahm;
	 public void setDianhuahm(String dianhuahm)
	 {
		  this.dianhuahm = dianhuahm;
	 }
   public String getDianhuahm()
   { 	    
  	        
      return this.dianhuahm;     	
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
 	 	 private Long suoshukh;
	 public void setSuoshukh(Long suoshukh)
	 {
		  this.suoshukh = suoshukh;
	 }
   public Long getSuoshukh()
   { 	    
  	        
      return this.suoshukh;     	
   }
 	 	 private String xingbie;
	 public void setXingbie(String xingbie)
	 {
		  this.xingbie = xingbie;
	 }
   public String getXingbie()
   { 	    
  	        
      return this.xingbie;     	
   }
 	 	 private String xingming;
	 public void setXingming(String xingming)
	 {
		  this.xingming = xingming;
	 }
   public String getXingming()
   { 	    
  	        
      return this.xingming;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzkehu suoshukhRef;
	 public void setSuoshukhRef(com.actiz.platform.application.dataset.pojo.Atzkehu suoshukhRef)
	 {
		  this.suoshukhRef = suoshukhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getSuoshukhRef()
   {
     	return this.suoshukhRef;
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