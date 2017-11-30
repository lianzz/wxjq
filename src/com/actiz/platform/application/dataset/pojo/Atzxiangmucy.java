package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiangmucy implements Serializable,IPojo
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
	  	 	 private Long bumen;
	 public void setBumen(Long bumen)
	 {
		  this.bumen = bumen;
	 }
   public Long getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private Long chengyuanmc;
	 public void setChengyuanmc(Long chengyuanmc)
	 {
		  this.chengyuanmc = chengyuanmc;
	 }
   public Long getChengyuanmc()
   { 	    
  	        
      return this.chengyuanmc;     	
   }
 	 	 private String juese;
	 public void setJuese(String juese)
	 {
		  this.juese = juese;
	 }
   public String getJuese()
   { 	    
  	        
      return this.juese;     	
   }
 	 	 private String lianxifs;
	 public void setLianxifs(String lianxifs)
	 {
		  this.lianxifs = lianxifs;
	 }
   public String getLianxifs()
   { 	    
  	        
      return this.lianxifs;     	
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
 	 	 private Long xiaoshoujhid;
	 public void setXiaoshoujhid(Long xiaoshoujhid)
	 {
		  this.xiaoshoujhid = xiaoshoujhid;
	 }
   public Long getXiaoshoujhid()
   { 	    
  	        
      return this.xiaoshoujhid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztuandui bumenRef;
	 public void setBumenRef(com.actiz.platform.application.dataset.pojo.Atztuandui bumenRef)
	 {
		  this.bumenRef = bumenRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztuandui getBumenRef()
   {
     	return this.bumenRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg chengyuanmcRef;
	 public void setChengyuanmcRef(com.actiz.platform.application.dataset.pojo.Atztdyg chengyuanmcRef)
	 {
		  this.chengyuanmcRef = chengyuanmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getChengyuanmcRef()
   {
     	return this.chengyuanmcRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef;
	 public void setXiaoshoujhidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef)
	 {
		  this.xiaoshoujhidRef = xiaoshoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiaoshoujhidRef()
   {
     	return this.xiaoshoujhidRef;
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