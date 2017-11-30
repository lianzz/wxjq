package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdaohuotzd implements Serializable,IPojo
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
	  	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Long caigouht;
	 public void setCaigouht(Long caigouht)
	 {
		  this.caigouht = caigouht;
	 }
   public Long getCaigouht()
   { 	    
  	        
      return this.caigouht;     	
   }
 	 	 private Long caigoujhd;
	 public void setCaigoujhd(Long caigoujhd)
	 {
		  this.caigoujhd = caigoujhd;
	 }
   public Long getCaigoujhd()
   { 	    
  	        
      return this.caigoujhd;     	
   }
 	 	 private Date daohuorq;
	 public void setDaohuorq(Date daohuorq)
	 {
		  this.daohuorq = daohuorq;
	 }
   public Date getDaohuorq()
   { 	    
  	  	    if( this.daohuorq != null )
	    {
	        return (Date)new ActizDate( this.daohuorq.getTime() );
	    }
	          
      return this.daohuorq;     	
   }
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
   }
 	 	 private String shifoutjzj;
	 public void setShifoutjzj(String shifoutjzj)
	 {
		  this.shifoutjzj = shifoutjzj;
	 }
   public String getShifoutjzj()
   { 	    
  	        
      return this.shifoutjzj;     	
   }
 	 	 private String shifoutjcggz;
	 public void setShifoutjcggz(String shifoutjcggz)
	 {
		  this.shifoutjcggz = shifoutjcggz;
	 }
   public String getShifoutjcggz()
   { 	    
  	        
      return this.shifoutjcggz;     	
   }
 	 	 private String tianxier;
	 public void setTianxier(String tianxier)
	 {
		  this.tianxier = tianxier;
	 }
   public String getTianxier()
   { 	    
  	        
      return this.tianxier;     	
   }
 	 	 private Date tianxierq;
	 public void setTianxierq(Date tianxierq)
	 {
		  this.tianxierq = tianxierq;
	 }
   public Date getTianxierq()
   { 	    
  	  	    if( this.tianxierq != null )
	    {
	        return (Date)new ActizDate( this.tianxierq.getTime() );
	    }
	          
      return this.tianxierq;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtRef;
	 public void setCaigouhtRef(com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtRef)
	 {
		  this.caigouhtRef = caigouhtRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouht getCaigouhtRef()
   {
     	return this.caigouhtRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhdRef;
	 public void setCaigoujhdRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhdRef)
	 {
		  this.caigoujhdRef = caigoujhdRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigoujhdRef()
   {
     	return this.caigoujhdRef;
   }
  
	private java.util.Set atzdaohuotzdmxSet;
	public void setAtzdaohuotzdmxSet(java.util.Set atzdaohuotzdmxSet)
	{
		 this.atzdaohuotzdmxSet = atzdaohuotzdmxSet;
	}
  public java.util.Set getAtzdaohuotzdmxSet()
  {
     return this.atzdaohuotzdmxSet;
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