package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehuycmx implements Serializable,IPojo
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
	  	 	 private Long chanpin;
	 public void setChanpin(Long chanpin)
	 {
		  this.chanpin = chanpin;
	 }
   public Long getChanpin()
   { 	    
  	        
      return this.chanpin;     	
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
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private String xiangmumc;
	 public void setXiangmumc(String xiangmumc)
	 {
		  this.xiangmumc = xiangmumc;
	 }
   public String getXiangmumc()
   { 	    
  	        
      return this.xiangmumc;     	
   }
 	 	 private Long xiaoshoubmid;
	 public void setXiaoshoubmid(Long xiaoshoubmid)
	 {
		  this.xiaoshoubmid = xiaoshoubmid;
	 }
   public Long getXiaoshoubmid()
   { 	    
  	        
      return this.xiaoshoubmid;     	
   }
 	 	 private Long xiaoshouycid;
	 public void setXiaoshouycid(Long xiaoshouycid)
	 {
		  this.xiaoshouycid = xiaoshouycid;
	 }
   public Long getXiaoshouycid()
   { 	    
  	        
      return this.xiaoshouycid;     	
   }
 	 	 private Long yuefenycmxid;
	 public void setYuefenycmxid(Long yuefenycmxid)
	 {
		  this.yuefenycmxid = yuefenycmxid;
	 }
   public Long getYuefenycmxid()
   { 	    
  	        
      return this.yuefenycmxid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef;
	 public void setChanpinRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinRef)
	 {
		  this.chanpinRef = chanpinRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinRef()
   {
     	return this.chanpinRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef;
	 public void setXiaoshoubmidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef)
	 {
		  this.xiaoshoubmidRef = xiaoshoubmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmidRef()
   {
     	return this.xiaoshoubmidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef;
	 public void setXiaoshouycidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc xiaoshouycidRef)
	 {
		  this.xiaoshouycidRef = xiaoshouycidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshouyc getXiaoshouycidRef()
   {
     	return this.xiaoshouycidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzyuefenycmx yuefenycmxidRef;
	 public void setYuefenycmxidRef(com.actiz.platform.application.dataset.pojo.Atzyuefenycmx yuefenycmxidRef)
	 {
		  this.yuefenycmxidRef = yuefenycmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyuefenycmx getYuefenycmxidRef()
   {
     	return this.yuefenycmxidRef;
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