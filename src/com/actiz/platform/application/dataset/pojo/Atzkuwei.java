package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkuwei implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private Long cangkuid;
	 public void setCangkuid(Long cangkuid)
	 {
		  this.cangkuid = cangkuid;
	 }
   public Long getCangkuid()
   { 	    
  	        
      return this.cangkuid;     	
   }
 	 	 private String kuweibh;
	 public void setKuweibh(String kuweibh)
	 {
		  this.kuweibh = kuweibh;
	 }
   public String getKuweibh()
   { 	    
  	        
      return this.kuweibh;     	
   }
 	 	 private String kuweimc;
	 public void setKuweimc(String kuweimc)
	 {
		  this.kuweimc = kuweimc;
	 }
   public String getKuweimc()
   { 	    
  	        
      return this.kuweimc;     	
   }
 	 	 private String kuweiwlzt;
	 public void setKuweiwlzt(String kuweiwlzt)
	 {
		  this.kuweiwlzt = kuweiwlzt;
	 }
   public String getKuweiwlzt()
   { 	    
  	        
      return this.kuweiwlzt;     	
   }
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
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
 	 	 private String weizhi;
	 public void setWeizhi(String weizhi)
	 {
		  this.weizhi = weizhi;
	 }
   public String getWeizhi()
   { 	    
  	        
      return this.weizhi;     	
   }
 	 	 private String shifougz;
	 public void setShifougz(String shifougz)
	 {
		  this.shifougz = shifougz;
	 }
   public String getShifougz()
   { 	    
  	        
      return this.shifougz;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef;
	 public void setCangkuidRef(com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef)
	 {
		  this.cangkuidRef = cangkuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcangku getCangkuidRef()
   {
     	return this.cangkuidRef;
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