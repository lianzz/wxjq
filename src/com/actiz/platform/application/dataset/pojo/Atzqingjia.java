package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqingjia implements Serializable,IPojo
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
	  	 	 private String beizhuxx;
	 public void setBeizhuxx(String beizhuxx)
	 {
		  this.beizhuxx = beizhuxx;
	 }
   public String getBeizhuxx()
   { 	    
  	        
      return this.beizhuxx;     	
   }
 	 	 private Timestamp lurusj;
	 public void setLurusj(Timestamp lurusj)
	 {
		  this.lurusj = lurusj;
	 }
   public Timestamp getLurusj()
   { 	    
  	    	  if( this.lurusj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lurusj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lurusj;     	
   }
 	 	 private String luruyg;
	 public void setLuruyg(String luruyg)
	 {
		  this.luruyg = luruyg;
	 }
   public String getLuruyg()
   { 	    
  	        
      return this.luruyg;     	
   }
 	 	 private String qingjiabm;
	 public void setQingjiabm(String qingjiabm)
	 {
		  this.qingjiabm = qingjiabm;
	 }
   public String getQingjiabm()
   { 	    
  	        
      return this.qingjiabm;     	
   }
 	 	 private String qingjiadbh;
	 public void setQingjiadbh(String qingjiadbh)
	 {
		  this.qingjiadbh = qingjiadbh;
	 }
   public String getQingjiadbh()
   { 	    
  	        
      return this.qingjiadbh;     	
   }
 	 	 private Date qingjiajssj;
	 public void setQingjiajssj(Date qingjiajssj)
	 {
		  this.qingjiajssj = qingjiajssj;
	 }
   public Date getQingjiajssj()
   { 	    
  	  	    if( this.qingjiajssj != null )
	    {
	        return (Date)new ActizDate( this.qingjiajssj.getTime() );
	    }
	          
      return this.qingjiajssj;     	
   }
 	 	 private Date qingjiakssj;
	 public void setQingjiakssj(Date qingjiakssj)
	 {
		  this.qingjiakssj = qingjiakssj;
	 }
   public Date getQingjiakssj()
   { 	    
  	  	    if( this.qingjiakssj != null )
	    {
	        return (Date)new ActizDate( this.qingjiakssj.getTime() );
	    }
	          
      return this.qingjiakssj;     	
   }
 	 	 private String qingjialb;
	 public void setQingjialb(String qingjialb)
	 {
		  this.qingjialb = qingjialb;
	 }
   public String getQingjialb()
   { 	    
  	        
      return this.qingjialb;     	
   }
 	 	 private Long qingjiasc;
	 public void setQingjiasc(Long qingjiasc)
	 {
		  this.qingjiasc = qingjiasc;
	 }
   public Long getQingjiasc()
   { 	    
  	        
      return this.qingjiasc;     	
   }
 	 	 private Long qingjiayg;
	 public void setQingjiayg(Long qingjiayg)
	 {
		  this.qingjiayg = qingjiayg;
	 }
   public Long getQingjiayg()
   { 	    
  	        
      return this.qingjiayg;     	
   }
 	 	 private String shyjzt;
	 public void setShyjzt(String shyjzt)
	 {
		  this.shyjzt = shyjzt;
	 }
   public String getShyjzt()
   { 	    
  	        
      return this.shyjzt;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private String yuangongbh;
	 public void setYuangongbh(String yuangongbh)
	 {
		  this.yuangongbh = yuangongbh;
	 }
   public String getYuangongbh()
   { 	    
  	        
      return this.yuangongbh;     	
   }
 	 	 private String yuangongzw;
	 public void setYuangongzw(String yuangongzw)
	 {
		  this.yuangongzw = yuangongzw;
	 }
   public String getYuangongzw()
   { 	    
  	        
      return this.yuangongzw;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee qingjiaygRef;
	 public void setQingjiaygRef(com.actiz.platform.application.dataset.pojo.Atzemployee qingjiaygRef)
	 {
		  this.qingjiaygRef = qingjiaygRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getQingjiaygRef()
   {
     	return this.qingjiaygRef;
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