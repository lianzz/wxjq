package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztuandui implements Serializable,IPojo
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
	  	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long bumenid;
	 public void setBumenid(Long bumenid)
	 {
		  this.bumenid = bumenid;
	 }
   public Long getBumenid()
   { 	    
  	        
      return this.bumenid;     	
   }
 	 	 private Integer cengci;
	 public void setCengci(Integer cengci)
	 {
		  this.cengci = cengci;
	 }
   public Integer getCengci()
   { 	    
  	        
      return this.cengci;     	
   }
 	 	 private Long futuanduiid;
	 public void setFutuanduiid(Long futuanduiid)
	 {
		  this.futuanduiid = futuanduiid;
	 }
   public Long getFutuanduiid()
   { 	    
  	        
      return this.futuanduiid;     	
   }
 	 	 private String lujing;
	 public void setLujing(String lujing)
	 {
		  this.lujing = lujing;
	 }
   public String getLujing()
   { 	    
  	        
      return this.lujing;     	
   }
 	 	 private String mingcheng;
	 public void setMingcheng(String mingcheng)
	 {
		  this.mingcheng = mingcheng;
	 }
   public String getMingcheng()
   { 	    
  	        
      return this.mingcheng;     	
   }
 	 	 private Integer status;
	 public void setStatus(Integer status)
	 {
		  this.status = status;
	 }
   public Integer getStatus()
   { 	    
  	        
      return this.status;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef;
	 public void setBumenidRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef)
	 {
		  this.bumenidRef = bumenidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBumenidRef()
   {
     	return this.bumenidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztuandui futuanduiidRef;
	 public void setFutuanduiidRef(com.actiz.platform.application.dataset.pojo.Atztuandui futuanduiidRef)
	 {
		  this.futuanduiidRef = futuanduiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztuandui getFutuanduiidRef()
   {
     	return this.futuanduiidRef;
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