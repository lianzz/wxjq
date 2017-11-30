package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfahuoxxgzb implements Serializable,IPojo
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
	  	 	 private String danwei;
	 public void setDanwei(String danwei)
	 {
		  this.danwei = danwei;
	 }
   public String getDanwei()
   { 	    
  	        
      return this.danwei;     	
   }
 	 	 private Date fahuosj;
	 public void setFahuosj(Date fahuosj)
	 {
		  this.fahuosj = fahuosj;
	 }
   public Date getFahuosj()
   { 	    
  	  	    if( this.fahuosj != null )
	    {
	        return (Date)new ActizDate( this.fahuosj.getTime() );
	    }
	          
      return this.fahuosj;     	
   }
 	 	 private String fahuotzdh;
	 public void setFahuotzdh(String fahuotzdh)
	 {
		  this.fahuotzdh = fahuotzdh;
	 }
   public String getFahuotzdh()
   { 	    
  	        
      return this.fahuotzdh;     	
   }
 	 	 private String hetongbh;
	 public void setHetongbh(String hetongbh)
	 {
		  this.hetongbh = hetongbh;
	 }
   public String getHetongbh()
   { 	    
  	        
      return this.hetongbh;     	
   }
 	 	 private String hetongmc;
	 public void setHetongmc(String hetongmc)
	 {
		  this.hetongmc = hetongmc;
	 }
   public String getHetongmc()
   { 	    
  	        
      return this.hetongmc;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Double sl;
	 public void setSl(Double sl)
	 {
		  this.sl = sl;
	 }
   public Double getSl()
   { 	    
  	        
      return this.sl;     	
   }
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
   }
 	 	 private String wuliaoms;
	 public void setWuliaoms(String wuliaoms)
	 {
		  this.wuliaoms = wuliaoms;
	 }
   public String getWuliaoms()
   { 	    
  	        
      return this.wuliaoms;     	
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