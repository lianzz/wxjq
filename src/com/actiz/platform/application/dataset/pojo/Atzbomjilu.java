package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbomjilu implements Serializable,IPojo
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
	  	 	 private Long xghbomid;
	 public void setXghbomid(Long xghbomid)
	 {
		  this.xghbomid = xghbomid;
	 }
   public Long getXghbomid()
   { 	    
  	        
      return this.xghbomid;     	
   }
 	 	 private Long bomid;
	 public void setBomid(Long bomid)
	 {
		  this.bomid = bomid;
	 }
   public Long getBomid()
   { 	    
  	        
      return this.bomid;     	
   }
 	 	 private String xiugair;
	 public void setXiugair(String xiugair)
	 {
		  this.xiugair = xiugair;
	 }
   public String getXiugair()
   { 	    
  	        
      return this.xiugair;     	
   }
 	 	 private Date xiugaisj;
	 public void setXiugaisj(Date xiugaisj)
	 {
		  this.xiugaisj = xiugaisj;
	 }
   public Date getXiugaisj()
   { 	    
  	  	    if( this.xiugaisj != null )
	    {
	        return (Date)new ActizDate( this.xiugaisj.getTime() );
	    }
	          
      return this.xiugaisj;     	
   }
 	 	 private Long xgwlid;
	 public void setXgwlid(Long xgwlid)
	 {
		  this.xgwlid = xgwlid;
	 }
   public Long getXgwlid()
   { 	    
  	        
      return this.xgwlid;     	
   }
 	 	 private Long ywlid;
	 public void setYwlid(Long ywlid)
	 {
		  this.ywlid = ywlid;
	 }
   public Long getYwlid()
   { 	    
  	        
      return this.ywlid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbom xghbomidRef;
	 public void setXghbomidRef(com.actiz.platform.application.dataset.pojo.Atzbom xghbomidRef)
	 {
		  this.xghbomidRef = xghbomidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbom getXghbomidRef()
   {
     	return this.xghbomidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbom bomidRef;
	 public void setBomidRef(com.actiz.platform.application.dataset.pojo.Atzbom bomidRef)
	 {
		  this.bomidRef = bomidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbom getBomidRef()
   {
     	return this.bomidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx xgwlidRef;
	 public void setXgwlidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx xgwlidRef)
	 {
		  this.xgwlidRef = xgwlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getXgwlidRef()
   {
     	return this.xgwlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx ywlidRef;
	 public void setYwlidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx ywlidRef)
	 {
		  this.ywlidRef = ywlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getYwlidRef()
   {
     	return this.ywlidRef;
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