package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzmdm_kehu implements Serializable,IPojo
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
	  	 	 private String remark;
	 public void setRemark(String remark)
	 {
		  this.remark = remark;
	 }
   public String getRemark()
   { 	    
  	        
      return this.remark;     	
   }
 	 	 private String city;
	 public void setCity(String city)
	 {
		  this.city = city;
	 }
   public String getCity()
   { 	    
  	        
      return this.city;     	
   }
 	 	 private String region;
	 public void setRegion(String region)
	 {
		  this.region = region;
	 }
   public String getRegion()
   { 	    
  	        
      return this.region;     	
   }
 	 	 private String orderblock;
	 public void setOrderblock(String orderblock)
	 {
		  this.orderblock = orderblock;
	 }
   public String getOrderblock()
   { 	    
  	        
      return this.orderblock;     	
   }
 	 	 private String country;
	 public void setCountry(String country)
	 {
		  this.country = country;
	 }
   public String getCountry()
   { 	    
  	        
      return this.country;     	
   }
 	 	 private String clientcodeo;
	 public void setClientcodeo(String clientcodeo)
	 {
		  this.clientcodeo = clientcodeo;
	 }
   public String getClientcodeo()
   { 	    
  	        
      return this.clientcodeo;     	
   }
 	 	 private String clientaddr;
	 public void setClientaddr(String clientaddr)
	 {
		  this.clientaddr = clientaddr;
	 }
   public String getClientaddr()
   { 	    
  	        
      return this.clientaddr;     	
   }
 	 	 private String clientshortn;
	 public void setClientshortn(String clientshortn)
	 {
		  this.clientshortn = clientshortn;
	 }
   public String getClientshortn()
   { 	    
  	        
      return this.clientshortn;     	
   }
 	 	 private String clientype;
	 public void setClientype(String clientype)
	 {
		  this.clientype = clientype;
	 }
   public String getClientype()
   { 	    
  	        
      return this.clientype;     	
   }
 	 	 private String clienttyped;
	 public void setClienttyped(String clienttyped)
	 {
		  this.clienttyped = clienttyped;
	 }
   public String getClienttyped()
   { 	    
  	        
      return this.clienttyped;     	
   }
 	 	 private String clientname;
	 public void setClientname(String clientname)
	 {
		  this.clientname = clientname;
	 }
   public String getClientname()
   { 	    
  	        
      return this.clientname;     	
   }
 	 	 private String clientcoden;
	 public void setClientcoden(String clientcoden)
	 {
		  this.clientcoden = clientcoden;
	 }
   public String getClientcoden()
   { 	    
  	        
      return this.clientcoden;     	
   }
 	 	 private String industry;
	 public void setIndustry(String industry)
	 {
		  this.industry = industry;
	 }
   public String getIndustry()
   { 	    
  	        
      return this.industry;     	
   }
 	 	 private String postalcode;
	 public void setPostalcode(String postalcode)
	 {
		  this.postalcode = postalcode;
	 }
   public String getPostalcode()
   { 	    
  	        
      return this.postalcode;     	
   }
 	 	 private String taxcode;
	 public void setTaxcode(String taxcode)
	 {
		  this.taxcode = taxcode;
	 }
   public String getTaxcode()
   { 	    
  	        
      return this.taxcode;     	
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