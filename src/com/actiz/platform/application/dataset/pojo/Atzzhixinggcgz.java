package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhixinggcgz implements Serializable,IPojo
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
	  	 	 private Long chukudid;
	 public void setChukudid(Long chukudid)
	 {
		  this.chukudid = chukudid;
	 }
   public Long getChukudid()
   { 	    
  	        
      return this.chukudid;     	
   }
 	 	 private Long chukujhdid;
	 public void setChukujhdid(Long chukujhdid)
	 {
		  this.chukujhdid = chukujhdid;
	 }
   public Long getChukujhdid()
   { 	    
  	        
      return this.chukujhdid;     	
   }
 	 	 private String danjumc;
	 public void setDanjumc(String danjumc)
	 {
		  this.danjumc = danjumc;
	 }
   public String getDanjumc()
   { 	    
  	        
      return this.danjumc;     	
   }
 	 	 private Long fahuotzdid;
	 public void setFahuotzdid(Long fahuotzdid)
	 {
		  this.fahuotzdid = fahuotzdid;
	 }
   public Long getFahuotzdid()
   { 	    
  	        
      return this.fahuotzdid;     	
   }
 	 	 private Long xmpzqdid;
	 public void setXmpzqdid(Long xmpzqdid)
	 {
		  this.xmpzqdid = xmpzqdid;
	 }
   public Long getXmpzqdid()
   { 	    
  	        
      return this.xmpzqdid;     	
   }
 	 	 private Long yewuzcid;
	 public void setYewuzcid(Long yewuzcid)
	 {
		  this.yewuzcid = yewuzcid;
	 }
   public Long getYewuzcid()
   { 	    
  	        
      return this.yewuzcid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukd chukudidRef;
	 public void setChukudidRef(com.actiz.platform.application.dataset.pojo.Atzchurukd chukudidRef)
	 {
		  this.chukudidRef = chukudidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukd getChukudidRef()
   {
     	return this.chukudidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd chukujhdidRef;
	 public void setChukujhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd chukujhdidRef)
	 {
		  this.chukujhdidRef = chukujhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getChukujhdidRef()
   {
     	return this.chukujhdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef;
	 public void setFahuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef)
	 {
		  this.fahuotzdidRef = fahuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuotzd getFahuotzdidRef()
   {
     	return this.fahuotzdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xmpzqdidRef;
	 public void setXmpzqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd xmpzqdidRef)
	 {
		  this.xmpzqdidRef = xmpzqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd getXmpzqdidRef()
   {
     	return this.xmpzqdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzyewuzc yewuzcidRef;
	 public void setYewuzcidRef(com.actiz.platform.application.dataset.pojo.Atzyewuzc yewuzcidRef)
	 {
		  this.yewuzcidRef = yewuzcidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyewuzc getYewuzcidRef()
   {
     	return this.yewuzcidRef;
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