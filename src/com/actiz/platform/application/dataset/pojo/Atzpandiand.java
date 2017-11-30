package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpandiand implements Serializable,IPojo
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
	  	 	 private Long abcpdjlid;
	 public void setAbcpdjlid(Long abcpdjlid)
	 {
		  this.abcpdjlid = abcpdjlid;
	 }
   public Long getAbcpdjlid()
   { 	    
  	        
      return this.abcpdjlid;     	
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private Date pandianjsrq;
	 public void setPandianjsrq(Date pandianjsrq)
	 {
		  this.pandianjsrq = pandianjsrq;
	 }
   public Date getPandianjsrq()
   { 	    
  	  	    if( this.pandianjsrq != null )
	    {
	        return (Date)new ActizDate( this.pandianjsrq.getTime() );
	    }
	          
      return this.pandianjsrq;     	
   }
 	 	 private Date pandianksrq;
	 public void setPandianksrq(Date pandianksrq)
	 {
		  this.pandianksrq = pandianksrq;
	 }
   public Date getPandianksrq()
   { 	    
  	  	    if( this.pandianksrq != null )
	    {
	        return (Date)new ActizDate( this.pandianksrq.getTime() );
	    }
	          
      return this.pandianksrq;     	
   }
 	 	 private String pandianr;
	 public void setPandianr(String pandianr)
	 {
		  this.pandianr = pandianr;
	 }
   public String getPandianr()
   { 	    
  	        
      return this.pandianr;     	
   }
 	 	 private String ispandian;
	 public void setIspandian(String ispandian)
	 {
		  this.ispandian = ispandian;
	 }
   public String getIspandian()
   { 	    
  	        
      return this.ispandian;     	
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
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzabcpdjl abcpdjlidRef;
	 public void setAbcpdjlidRef(com.actiz.platform.application.dataset.pojo.Atzabcpdjl abcpdjlidRef)
	 {
		  this.abcpdjlidRef = abcpdjlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzabcpdjl getAbcpdjlidRef()
   {
     	return this.abcpdjlidRef;
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
  
	private java.util.Set atzpandiandmxSet;
	public void setAtzpandiandmxSet(java.util.Set atzpandiandmxSet)
	{
		 this.atzpandiandmxSet = atzpandiandmxSet;
	}
  public java.util.Set getAtzpandiandmxSet()
  {
     return this.atzpandiandmxSet;
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