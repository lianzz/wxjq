package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehugc implements Serializable,IPojo
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
	  	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
   }
 	 	 private Date jieshusj;
	 public void setJieshusj(Date jieshusj)
	 {
		  this.jieshusj = jieshusj;
	 }
   public Date getJieshusj()
   { 	    
  	  	    if( this.jieshusj != null )
	    {
	        return (Date)new ActizDate( this.jieshusj.getTime() );
	    }
	          
      return this.jieshusj;     	
   }
 	 	 private Date kaishisj;
	 public void setKaishisj(Date kaishisj)
	 {
		  this.kaishisj = kaishisj;
	 }
   public Date getKaishisj()
   { 	    
  	  	    if( this.kaishisj != null )
	    {
	        return (Date)new ActizDate( this.kaishisj.getTime() );
	    }
	          
      return this.kaishisj;     	
   }
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
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
 	 	 private Long xitongid;
	 public void setXitongid(Long xitongid)
	 {
		  this.xitongid = xitongid;
	 }
   public Long getXitongid()
   { 	    
  	        
      return this.xitongid;     	
   }
 	 	 private String xitongmc;
	 public void setXitongmc(String xitongmc)
	 {
		  this.xitongmc = xitongmc;
	 }
   public String getXitongmc()
   { 	    
  	        
      return this.xitongmc;     	
   }
 	 	 private String xitongbb;
	 public void setXitongbb(String xitongbb)
	 {
		  this.xitongbb = xitongbb;
	 }
   public String getXitongbb()
   { 	    
  	        
      return this.xitongbb;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef;
	 public void setXitongidRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef)
	 {
		  this.xitongidRef = xitongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongidRef()
   {
     	return this.xitongidRef;
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