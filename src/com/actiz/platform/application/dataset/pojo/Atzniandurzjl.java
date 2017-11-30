package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzniandurzjl implements Serializable,IPojo
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
 	 	 private String bumen;
	 public void setBumen(String bumen)
	 {
		  this.bumen = bumen;
	 }
   public String getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private String gangwei;
	 public void setGangwei(String gangwei)
	 {
		  this.gangwei = gangwei;
	 }
   public String getGangwei()
   { 	    
  	        
      return this.gangwei;     	
   }
 	 	 private String niandukhbh;
	 public void setNiandukhbh(String niandukhbh)
	 {
		  this.niandukhbh = niandukhbh;
	 }
   public String getNiandukhbh()
   { 	    
  	        
      return this.niandukhbh;     	
   }
 	 	 private Date renzhijssj;
	 public void setRenzhijssj(Date renzhijssj)
	 {
		  this.renzhijssj = renzhijssj;
	 }
   public Date getRenzhijssj()
   { 	    
  	  	    if( this.renzhijssj != null )
	    {
	        return (Date)new ActizDate( this.renzhijssj.getTime() );
	    }
	          
      return this.renzhijssj;     	
   }
 	 	 private Date renzhikssj;
	 public void setRenzhikssj(Date renzhikssj)
	 {
		  this.renzhikssj = renzhikssj;
	 }
   public Date getRenzhikssj()
   { 	    
  	  	    if( this.renzhikssj != null )
	    {
	        return (Date)new ActizDate( this.renzhikssj.getTime() );
	    }
	          
      return this.renzhikssj;     	
   }
 	 	 private String zhijiezg;
	 public void setZhijiezg(String zhijiezg)
	 {
		  this.zhijiezg = zhijiezg;
	 }
   public String getZhijiezg()
   { 	    
  	        
      return this.zhijiezg;     	
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