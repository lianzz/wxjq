package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjianyanbgmx implements Serializable,IPojo
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
	  	 	 private Long atzjianyanbgid;
	 public void setAtzjianyanbgid(Long atzjianyanbgid)
	 {
		  this.atzjianyanbgid = atzjianyanbgid;
	 }
   public Long getAtzjianyanbgid()
   { 	    
  	        
      return this.atzjianyanbgid;     	
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
 	 	 private Double biaozhunz;
	 public void setBiaozhunz(Double biaozhunz)
	 {
		  this.biaozhunz = biaozhunz;
	 }
   public Double getBiaozhunz()
   { 	    
  	        
      return this.biaozhunz;     	
   }
 	 	 private String celianggj;
	 public void setCelianggj(String celianggj)
	 {
		  this.celianggj = celianggj;
	 }
   public String getCelianggj()
   { 	    
  	        
      return this.celianggj;     	
   }
 	 	 private Double chicunjysl;
	 public void setChicunjysl(Double chicunjysl)
	 {
		  this.chicunjysl = chicunjysl;
	 }
   public Double getChicunjysl()
   { 	    
  	        
      return this.chicunjysl;     	
   }
 	 	 private Long jianyanx;
	 public void setJianyanx(Long jianyanx)
	 {
		  this.jianyanx = jianyanx;
	 }
   public Long getJianyanx()
   { 	    
  	        
      return this.jianyanx;     	
   }
 	 	 private String jianyanxfl;
	 public void setJianyanxfl(String jianyanxfl)
	 {
		  this.jianyanxfl = jianyanxfl;
	 }
   public String getJianyanxfl()
   { 	    
  	        
      return this.jianyanxfl;     	
   }
 	 	 private Date lururq;
	 public void setLururq(Date lururq)
	 {
		  this.lururq = lururq;
	 }
   public Date getLururq()
   { 	    
  	  	    if( this.lururq != null )
	    {
	        return (Date)new ActizDate( this.lururq.getTime() );
	    }
	          
      return this.lururq;     	
   }
 	 	 private Double shicez1;
	 public void setShicez1(Double shicez1)
	 {
		  this.shicez1 = shicez1;
	 }
   public Double getShicez1()
   { 	    
  	        
      return this.shicez1;     	
   }
 	 	 private Double shicez2;
	 public void setShicez2(Double shicez2)
	 {
		  this.shicez2 = shicez2;
	 }
   public Double getShicez2()
   { 	    
  	        
      return this.shicez2;     	
   }
 	 	 private Double shicez3;
	 public void setShicez3(Double shicez3)
	 {
		  this.shicez3 = shicez3;
	 }
   public Double getShicez3()
   { 	    
  	        
      return this.shicez3;     	
   }
 	 	 private Double shicez4;
	 public void setShicez4(Double shicez4)
	 {
		  this.shicez4 = shicez4;
	 }
   public Double getShicez4()
   { 	    
  	        
      return this.shicez4;     	
   }
 	 	 private Double shicez5;
	 public void setShicez5(Double shicez5)
	 {
		  this.shicez5 = shicez5;
	 }
   public Double getShicez5()
   { 	    
  	        
      return this.shicez5;     	
   }
 	 	 private String shijijg;
	 public void setShijijg(String shijijg)
	 {
		  this.shijijg = shijijg;
	 }
   public String getShijijg()
   { 	    
  	        
      return this.shijijg;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzjianyanbg atzjianyanbgidRef;
	 public void setAtzjianyanbgidRef(com.actiz.platform.application.dataset.pojo.Atzjianyanbg atzjianyanbgidRef)
	 {
		  this.atzjianyanbgidRef = atzjianyanbgidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyanbg getAtzjianyanbgidRef()
   {
     	return this.atzjianyanbgidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzjianyanx jianyanxRef;
	 public void setJianyanxRef(com.actiz.platform.application.dataset.pojo.Atzjianyanx jianyanxRef)
	 {
		  this.jianyanxRef = jianyanxRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyanx getJianyanxRef()
   {
     	return this.jianyanxRef;
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