package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzceshixjl implements Serializable,IPojo
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
	  	 	 private Long atzceshijlid;
	 public void setAtzceshijlid(Long atzceshijlid)
	 {
		  this.atzceshijlid = atzceshijlid;
	 }
   public Long getAtzceshijlid()
   { 	    
  	        
      return this.atzceshijlid;     	
   }
 	 	 private String cengshijg;
	 public void setCengshijg(String cengshijg)
	 {
		  this.cengshijg = cengshijg;
	 }
   public String getCengshijg()
   { 	    
  	        
      return this.cengshijg;     	
   }
 	 	 private Long ceshixflid;
	 public void setCeshixflid(Long ceshixflid)
	 {
		  this.ceshixflid = ceshixflid;
	 }
   public Long getCeshixflid()
   { 	    
  	        
      return this.ceshixflid;     	
   }
 	 	 private Long ceshixid;
	 public void setCeshixid(Long ceshixid)
	 {
		  this.ceshixid = ceshixid;
	 }
   public Long getCeshixid()
   { 	    
  	        
      return this.ceshixid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzceshijl atzceshijlidRef;
	 public void setAtzceshijlidRef(com.actiz.platform.application.dataset.pojo.Atzceshijl atzceshijlidRef)
	 {
		  this.atzceshijlidRef = atzceshijlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshijl getAtzceshijlidRef()
   {
     	return this.atzceshijlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzceshixfl ceshixflidRef;
	 public void setCeshixflidRef(com.actiz.platform.application.dataset.pojo.Atzceshixfl ceshixflidRef)
	 {
		  this.ceshixflidRef = ceshixflidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshixfl getCeshixflidRef()
   {
     	return this.ceshixflidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixidRef;
	 public void setCeshixidRef(com.actiz.platform.application.dataset.pojo.Atzceshixiang ceshixidRef)
	 {
		  this.ceshixidRef = ceshixidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshixiang getCeshixidRef()
   {
     	return this.ceshixidRef;
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