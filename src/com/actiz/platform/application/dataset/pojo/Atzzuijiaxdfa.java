package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzuijiaxdfa implements Serializable,IPojo
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
	  	 	 private String xingdong;
	 public void setXingdong(String xingdong)
	 {
		  this.xingdong = xingdong;
	 }
   public String getXingdong()
   { 	    
  	        
      return this.xingdong;     	
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
 	 	 private String fuzer;
	 public void setFuzer(String fuzer)
	 {
		  this.fuzer = fuzer;
	 }
   public String getFuzer()
   { 	    
  	        
      return this.fuzer;     	
   }
 	 	 private String ziyuan;
	 public void setZiyuan(String ziyuan)
	 {
		  this.ziyuan = ziyuan;
	 }
   public String getZiyuan()
   { 	    
  	        
      return this.ziyuan;     	
   }
 	 	 private Date shijian;
	 public void setShijian(Date shijian)
	 {
		  this.shijian = shijian;
	 }
   public Date getShijian()
   { 	    
  	  	    if( this.shijian != null )
	    {
	        return (Date)new ActizDate( this.shijian.getTime() );
	    }
	          
      return this.shijian;     	
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