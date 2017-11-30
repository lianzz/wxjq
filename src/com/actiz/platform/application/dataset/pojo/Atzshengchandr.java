package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshengchandr implements Serializable,IPojo
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
 	 	 private String scdrbj;
	 public void setScdrbj(String scdrbj)
	 {
		  this.scdrbj = scdrbj;
	 }
   public String getScdrbj()
   { 	    
  	        
      return this.scdrbj;     	
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
 	 	 private Integer shuliang;
	 public void setShuliang(Integer shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Integer getShuliang()
   { 	    
  	        
      return this.shuliang;     	
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
 	 	 private Date scsj;
	 public void setScsj(Date scsj)
	 {
		  this.scsj = scsj;
	 }
   public Date getScsj()
   { 	    
  	  	    if( this.scsj != null )
	    {
	        return (Date)new ActizDate( this.scsj.getTime() );
	    }
	          
      return this.scsj;     	
   }
 	 	 private String sfjh;
	 public void setSfjh(String sfjh)
	 {
		  this.sfjh = sfjh;
	 }
   public String getSfjh()
   { 	    
  	        
      return this.sfjh;     	
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