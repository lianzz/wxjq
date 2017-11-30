package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjiduqtkh implements Serializable,IPojo
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
	  	 	 private Long atzjidukhid;
	 public void setAtzjidukhid(Long atzjidukhid)
	 {
		  this.atzjidukhid = atzjidukhid;
	 }
   public Long getAtzjidukhid()
   { 	    
  	        
      return this.atzjidukhid;     	
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
 	 	 private String jiduqtpgx;
	 public void setJiduqtpgx(String jiduqtpgx)
	 {
		  this.jiduqtpgx = jiduqtpgx;
	 }
   public String getJiduqtpgx()
   { 	    
  	        
      return this.jiduqtpgx;     	
   }
 	 	 private Double kaohef;
	 public void setKaohef(Double kaohef)
	 {
		  this.kaohef = kaohef;
	 }
   public Double getKaohef()
   { 	    
  	        
      return this.kaohef;     	
   }
 	 	 private Double renwuwczwpj;
	 public void setRenwuwczwpj(Double renwuwczwpj)
	 {
		  this.renwuwczwpj = renwuwczwpj;
	 }
   public Double getRenwuwczwpj()
   { 	    
  	        
      return this.renwuwczwpj;     	
   }
 	 	 private Double zhugkpf;
	 public void setZhugkpf(Double zhugkpf)
	 {
		  this.zhugkpf = zhugkpf;
	 }
   public Double getZhugkpf()
   { 	    
  	        
      return this.zhugkpf;     	
   }
 	 	 private Double zhuguanpg;
	 public void setZhuguanpg(Double zhuguanpg)
	 {
		  this.zhuguanpg = zhuguanpg;
	 }
   public Double getZhuguanpg()
   { 	    
  	        
      return this.zhuguanpg;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzjidukh atzjidukhidRef;
	 public void setAtzjidukhidRef(com.actiz.platform.application.dataset.pojo.Atzjidukh atzjidukhidRef)
	 {
		  this.atzjidukhidRef = atzjidukhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjidukh getAtzjidukhidRef()
   {
     	return this.atzjidukhidRef;
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