package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzmdm_gys implements Serializable,IPojo
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
	  	 	 private String sperm;
	 public void setSperm(String sperm)
	 {
		  this.sperm = sperm;
	 }
   public String getSperm()
   { 	    
  	        
      return this.sperm;     	
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
 	 	 private String telf1;
	 public void setTelf1(String telf1)
	 {
		  this.telf1 = telf1;
	 }
   public String getTelf1()
   { 	    
  	        
      return this.telf1;     	
   }
 	 	 private String smtpaddr;
	 public void setSmtpaddr(String smtpaddr)
	 {
		  this.smtpaddr = smtpaddr;
	 }
   public String getSmtpaddr()
   { 	    
  	        
      return this.smtpaddr;     	
   }
 	 	 private String vendoraddr;
	 public void setVendoraddr(String vendoraddr)
	 {
		  this.vendoraddr = vendoraddr;
	 }
   public String getVendoraddr()
   { 	    
  	        
      return this.vendoraddr;     	
   }
 	 	 private String vendorsname;
	 public void setVendorsname(String vendorsname)
	 {
		  this.vendorsname = vendorsname;
	 }
   public String getVendorsname()
   { 	    
  	        
      return this.vendorsname;     	
   }
 	 	 private String vendortype;
	 public void setVendortype(String vendortype)
	 {
		  this.vendortype = vendortype;
	 }
   public String getVendortype()
   { 	    
  	        
      return this.vendortype;     	
   }
 	 	 private String vendordesc;
	 public void setVendordesc(String vendordesc)
	 {
		  this.vendordesc = vendordesc;
	 }
   public String getVendordesc()
   { 	    
  	        
      return this.vendordesc;     	
   }
 	 	 private String vendorname;
	 public void setVendorname(String vendorname)
	 {
		  this.vendorname = vendorname;
	 }
   public String getVendorname()
   { 	    
  	        
      return this.vendorname;     	
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
 	 	 private String ovendorcode;
	 public void setOvendorcode(String ovendorcode)
	 {
		  this.ovendorcode = ovendorcode;
	 }
   public String getOvendorcode()
   { 	    
  	        
      return this.ovendorcode;     	
   }
 	 	 private String name2;
	 public void setName2(String name2)
	 {
		  this.name2 = name2;
	 }
   public String getName2()
   { 	    
  	        
      return this.name2;     	
   }
 	 	 private String nvendorcode;
	 public void setNvendorcode(String nvendorcode)
	 {
		  this.nvendorcode = nvendorcode;
	 }
   public String getNvendorcode()
   { 	    
  	        
      return this.nvendorcode;     	
   }
 	 	 private String telf2;
	 public void setTelf2(String telf2)
	 {
		  this.telf2 = telf2;
	 }
   public String getTelf2()
   { 	    
  	        
      return this.telf2;     	
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