package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetongfkjd implements Serializable,IPojo
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
	  	 	 private Long atzcaigouhtid;
	 public void setAtzcaigouhtid(Long atzcaigouhtid)
	 {
		  this.atzcaigouhtid = atzcaigouhtid;
	 }
   public Long getAtzcaigouhtid()
   { 	    
  	        
      return this.atzcaigouhtid;     	
   }
 	 	 private Double fukuanbl;
	 public void setFukuanbl(Double fukuanbl)
	 {
		  this.fukuanbl = fukuanbl;
	 }
   public Double getFukuanbl()
   { 	    
  	        
      return this.fukuanbl;     	
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
 	 	 private String miaoshu;
	 public void setMiaoshu(String miaoshu)
	 {
		  this.miaoshu = miaoshu;
	 }
   public String getMiaoshu()
   { 	    
  	        
      return this.miaoshu;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouht atzcaigouhtidRef;
	 public void setAtzcaigouhtidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouht atzcaigouhtidRef)
	 {
		  this.atzcaigouhtidRef = atzcaigouhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouht getAtzcaigouhtidRef()
   {
     	return this.atzcaigouhtidRef;
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