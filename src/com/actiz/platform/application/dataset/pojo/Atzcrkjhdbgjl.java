package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcrkjhdbgjl implements Serializable,IPojo
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
	  	 	 private Double jihuaslh;
	 public void setJihuaslh(Double jihuaslh)
	 {
		  this.jihuaslh = jihuaslh;
	 }
   public Double getJihuaslh()
   { 	    
  	        
      return this.jihuaslh;     	
   }
 	 	 private String kuweibhh;
	 public void setKuweibhh(String kuweibhh)
	 {
		  this.kuweibhh = kuweibhh;
	 }
   public String getKuweibhh()
   { 	    
  	        
      return this.kuweibhh;     	
   }
 	 	 private Double meidwslh;
	 public void setMeidwslh(Double meidwslh)
	 {
		  this.meidwslh = meidwslh;
	 }
   public Double getMeidwslh()
   { 	    
  	        
      return this.meidwslh;     	
   }
 	 	 private String wuliaobmh;
	 public void setWuliaobmh(String wuliaobmh)
	 {
		  this.wuliaobmh = wuliaobmh;
	 }
   public String getWuliaobmh()
   { 	    
  	        
      return this.wuliaobmh;     	
   }
 	 	 private String wuliaomsh;
	 public void setWuliaomsh(String wuliaomsh)
	 {
		  this.wuliaomsh = wuliaomsh;
	 }
   public String getWuliaomsh()
   { 	    
  	        
      return this.wuliaomsh;     	
   }
 	 	 private String bgms;
	 public void setBgms(String bgms)
	 {
		  this.bgms = bgms;
	 }
   public String getBgms()
   { 	    
  	        
      return this.bgms;     	
   }
 	 	 private Double jihuaslq;
	 public void setJihuaslq(Double jihuaslq)
	 {
		  this.jihuaslq = jihuaslq;
	 }
   public Double getJihuaslq()
   { 	    
  	        
      return this.jihuaslq;     	
   }
 	 	 private String kuweibhq;
	 public void setKuweibhq(String kuweibhq)
	 {
		  this.kuweibhq = kuweibhq;
	 }
   public String getKuweibhq()
   { 	    
  	        
      return this.kuweibhq;     	
   }
 	 	 private Double meidwslq;
	 public void setMeidwslq(Double meidwslq)
	 {
		  this.meidwslq = meidwslq;
	 }
   public Double getMeidwslq()
   { 	    
  	        
      return this.meidwslq;     	
   }
 	 	 private String wuliaobmq;
	 public void setWuliaobmq(String wuliaobmq)
	 {
		  this.wuliaobmq = wuliaobmq;
	 }
   public String getWuliaobmq()
   { 	    
  	        
      return this.wuliaobmq;     	
   }
 	 	 private String wuliaomsq;
	 public void setWuliaomsq(String wuliaomsq)
	 {
		  this.wuliaomsq = wuliaomsq;
	 }
   public String getWuliaomsq()
   { 	    
  	        
      return this.wuliaomsq;     	
   }
 	 	 private String bgr;
	 public void setBgr(String bgr)
	 {
		  this.bgr = bgr;
	 }
   public String getBgr()
   { 	    
  	        
      return this.bgr;     	
   }
 	 	 private Date bgrq;
	 public void setBgrq(Date bgrq)
	 {
		  this.bgrq = bgrq;
	 }
   public Date getBgrq()
   { 	    
  	  	    if( this.bgrq != null )
	    {
	        return (Date)new ActizDate( this.bgrq.getTime() );
	    }
	          
      return this.bgrq;     	
   }
 	 	 private String crkjhbglx;
	 public void setCrkjhbglx(String crkjhbglx)
	 {
		  this.crkjhbglx = crkjhbglx;
	 }
   public String getCrkjhbglx()
   { 	    
  	        
      return this.crkjhbglx;     	
   }
 	 	 private Long churukjhdid;
	 public void setChurukjhdid(Long churukjhdid)
	 {
		  this.churukjhdid = churukjhdid;
	 }
   public Long getChurukjhdid()
   { 	    
  	        
      return this.churukjhdid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef;
	 public void setChurukjhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef)
	 {
		  this.churukjhdidRef = churukjhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getChurukjhdidRef()
   {
     	return this.churukjhdidRef;
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