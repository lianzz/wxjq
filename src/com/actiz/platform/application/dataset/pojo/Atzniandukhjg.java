package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzniandukhjg implements Serializable,IPojo
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
	  	 	 private Long atzniandukhi;
	 public void setAtzniandukhi(Long atzniandukhi)
	 {
		  this.atzniandukhi = atzniandukhi;
	 }
   public Long getAtzniandukhi()
   { 	    
  	        
      return this.atzniandukhi;     	
   }
 	 	 private Double defen;
	 public void setDefen(Double defen)
	 {
		  this.defen = defen;
	 }
   public Double getDefen()
   { 	    
  	        
      return this.defen;     	
   }
 	 	 private String niandukhdj;
	 public void setNiandukhdj(String niandukhdj)
	 {
		  this.niandukhdj = niandukhdj;
	 }
   public String getNiandukhdj()
   { 	    
  	        
      return this.niandukhdj;     	
   }
 	 	 private String niandukhlx;
	 public void setNiandukhlx(String niandukhlx)
	 {
		  this.niandukhlx = niandukhlx;
	 }
   public String getNiandukhlx()
   { 	    
  	        
      return this.niandukhlx;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef;
	 public void setAtzniandukhiRef(com.actiz.platform.application.dataset.pojo.Atzniandukh atzniandukhiRef)
	 {
		  this.atzniandukhiRef = atzniandukhiRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzniandukh getAtzniandukhiRef()
   {
     	return this.atzniandukhiRef;
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