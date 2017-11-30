package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxunjianbgmx implements Serializable,IPojo
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
	  	 	 private String jianchajg;
	 public void setJianchajg(String jianchajg)
	 {
		  this.jianchajg = jianchajg;
	 }
   public String getJianchajg()
   { 	    
  	        
      return this.jianchajg;     	
   }
 	 	 private String jielun;
	 public void setJielun(String jielun)
	 {
		  this.jielun = jielun;
	 }
   public String getJielun()
   { 	    
  	        
      return this.jielun;     	
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
 	 	 private String xitongjcx;
	 public void setXitongjcx(String xitongjcx)
	 {
		  this.xitongjcx = xitongjcx;
	 }
   public String getXitongjcx()
   { 	    
  	        
      return this.xitongjcx;     	
   }
 	 	 private String xitongjczx;
	 public void setXitongjczx(String xitongjczx)
	 {
		  this.xitongjczx = xitongjczx;
	 }
   public String getXitongjczx()
   { 	    
  	        
      return this.xitongjczx;     	
   }
 	 	 private Long xunjianbg;
	 public void setXunjianbg(Long xunjianbg)
	 {
		  this.xunjianbg = xunjianbg;
	 }
   public Long getXunjianbg()
   { 	    
  	        
      return this.xunjianbg;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxunjianbgmx xunjianbgRef;
	 public void setXunjianbgRef(com.actiz.platform.application.dataset.pojo.Atzxunjianbgmx xunjianbgRef)
	 {
		  this.xunjianbgRef = xunjianbgRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxunjianbgmx getXunjianbgRef()
   {
     	return this.xunjianbgRef;
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