package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdfukuanxx implements Serializable,IPojo
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
	  	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
   }
 	 	 private Long caigouhtid;
	 public void setCaigouhtid(Long caigouhtid)
	 {
		  this.caigouhtid = caigouhtid;
	 }
   public Long getCaigouhtid()
   { 	    
  	        
      return this.caigouhtid;     	
   }
 	 	 private String htddbh;
	 public void setHtddbh(String htddbh)
	 {
		  this.htddbh = htddbh;
	 }
   public String getHtddbh()
   { 	    
  	        
      return this.htddbh;     	
   }
 	 	 private Double fukuanje;
	 public void setFukuanje(Double fukuanje)
	 {
		  this.fukuanje = fukuanje;
	 }
   public Double getFukuanje()
   { 	    
  	        
      return this.fukuanje;     	
   }
 	 	 private String fukuanlx;
	 public void setFukuanlx(String fukuanlx)
	 {
		  this.fukuanlx = fukuanlx;
	 }
   public String getFukuanlx()
   { 	    
  	        
      return this.fukuanlx;     	
   }
 	 	 private Date fukuansj;
	 public void setFukuansj(Date fukuansj)
	 {
		  this.fukuansj = fukuansj;
	 }
   public Date getFukuansj()
   { 	    
  	  	    if( this.fukuansj != null )
	    {
	        return (Date)new ActizDate( this.fukuansj.getTime() );
	    }
	          
      return this.fukuansj;     	
   }
 	 	 private String fukuantk;
	 public void setFukuantk(String fukuantk)
	 {
		  this.fukuantk = fukuantk;
	 }
   public String getFukuantk()
   { 	    
  	        
      return this.fukuantk;     	
   }
 	 	 private String gongyings;
	 public void setGongyings(String gongyings)
	 {
		  this.gongyings = gongyings;
	 }
   public String getGongyings()
   { 	    
  	        
      return this.gongyings;     	
   }
 	 	 private Long hbid;
	 public void setHbid(Long hbid)
	 {
		  this.hbid = hbid;
	 }
   public Long getHbid()
   { 	    
  	        
      return this.hbid;     	
   }
 	 	 private String hbzx;
	 public void setHbzx(String hbzx)
	 {
		  this.hbzx = hbzx;
	 }
   public String getHbzx()
   { 	    
  	        
      return this.hbzx;     	
   }
 	 	 private String shifouzx;
	 public void setShifouzx(String shifouzx)
	 {
		  this.shifouzx = shifouzx;
	 }
   public String getShifouzx()
   { 	    
  	        
      return this.shifouzx;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef;
	 public void setBizhongidRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef)
	 {
		  this.bizhongidRef = bizhongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongidRef()
   {
     	return this.bizhongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef;
	 public void setCaigouhtidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef)
	 {
		  this.caigouhtidRef = caigouhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouht getCaigouhtidRef()
   {
     	return this.caigouhtidRef;
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