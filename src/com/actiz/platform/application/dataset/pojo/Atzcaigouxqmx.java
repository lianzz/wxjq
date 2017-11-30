package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigouxqmx implements Serializable,IPojo
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
	  	 	 private Long atzcaigoujhid;
	 public void setAtzcaigoujhid(Long atzcaigoujhid)
	 {
		  this.atzcaigoujhid = atzcaigoujhid;
	 }
   public Long getAtzcaigoujhid()
   { 	    
  	        
      return this.atzcaigoujhid;     	
   }
 	 	 private Long caigouxqid;
	 public void setCaigouxqid(Long caigouxqid)
	 {
		  this.caigouxqid = caigouxqid;
	 }
   public Long getCaigouxqid()
   { 	    
  	        
      return this.caigouxqid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh atzcaigoujhidRef;
	 public void setAtzcaigoujhidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh atzcaigoujhidRef)
	 {
		  this.atzcaigoujhidRef = atzcaigoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getAtzcaigoujhidRef()
   {
     	return this.atzcaigoujhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigouxqidRef;
	 public void setCaigouxqidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigouxqidRef)
	 {
		  this.caigouxqidRef = caigouxqidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigouxqidRef()
   {
     	return this.caigouxqidRef;
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