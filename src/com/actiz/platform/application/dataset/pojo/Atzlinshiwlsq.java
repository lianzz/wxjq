package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzlinshiwlsq implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
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
 	 	 private String shenqbm;
	 public void setShenqbm(String shenqbm)
	 {
		  this.shenqbm = shenqbm;
	 }
   public String getShenqbm()
   { 	    
  	        
      return this.shenqbm;     	
   }
 	 	 private String shengqr;
	 public void setShengqr(String shengqr)
	 {
		  this.shengqr = shengqr;
	 }
   public String getShengqr()
   { 	    
  	        
      return this.shengqr;     	
   }
 	 	 private Date shenqrq;
	 public void setShenqrq(Date shenqrq)
	 {
		  this.shenqrq = shenqrq;
	 }
   public Date getShenqrq()
   { 	    
  	  	    if( this.shenqrq != null )
	    {
	        return (Date)new ActizDate( this.shenqrq.getTime() );
	    }
	          
      return this.shenqrq;     	
   }
 	 	 private String shenqyy;
	 public void setShenqyy(String shenqyy)
	 {
		  this.shenqyy = shenqyy;
	 }
   public String getShenqyy()
   { 	    
  	        
      return this.shenqyy;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
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
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
   }
  
	private java.util.Set atzlinshiwlsqmxSet;
	public void setAtzlinshiwlsqmxSet(java.util.Set atzlinshiwlsqmxSet)
	{
		 this.atzlinshiwlsqmxSet = atzlinshiwlsqmxSet;
	}
  public java.util.Set getAtzlinshiwlsqmxSet()
  {
     return this.atzlinshiwlsqmxSet;
  }
 
	private java.util.Set atzlswlsqshjlSet;
	public void setAtzlswlsqshjlSet(java.util.Set atzlswlsqshjlSet)
	{
		 this.atzlswlsqshjlSet = atzlswlsqshjlSet;
	}
  public java.util.Set getAtzlswlsqshjlSet()
  {
     return this.atzlswlsqshjlSet;
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