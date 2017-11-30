package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfupeijianmx implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private Long fupeijianid;
	 public void setFupeijianid(Long fupeijianid)
	 {
		  this.fupeijianid = fupeijianid;
	 }
   public Long getFupeijianid()
   { 	    
  	        
      return this.fupeijianid;     	
   }
 	 	 private String shebeimc;
	 public void setShebeimc(String shebeimc)
	 {
		  this.shebeimc = shebeimc;
	 }
   public String getShebeimc()
   { 	    
  	        
      return this.shebeimc;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private Double zongshu;
	 public void setZongshu(Double zongshu)
	 {
		  this.zongshu = zongshu;
	 }
   public Double getZongshu()
   { 	    
  	        
      return this.zongshu;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzfupeijian fupeijianidRef;
	 public void setFupeijianidRef(com.actiz.platform.application.dataset.pojo.Atzfupeijian fupeijianidRef)
	 {
		  this.fupeijianidRef = fupeijianidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfupeijian getFupeijianidRef()
   {
     	return this.fupeijianidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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