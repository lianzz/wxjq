package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjiezhangjl implements Serializable,IPojo
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
	  	 	 private Date dcrq;
	 public void setDcrq(Date dcrq)
	 {
		  this.dcrq = dcrq;
	 }
   public Date getDcrq()
   { 	    
  	  	    if( this.dcrq != null )
	    {
	        return (Date)new ActizDate( this.dcrq.getTime() );
	    }
	          
      return this.dcrq;     	
   }
 	 	 private Date jsrq;
	 public void setJsrq(Date jsrq)
	 {
		  this.jsrq = jsrq;
	 }
   public Date getJsrq()
   { 	    
  	  	    if( this.jsrq != null )
	    {
	        return (Date)new ActizDate( this.jsrq.getTime() );
	    }
	          
      return this.jsrq;     	
   }
 	 	 private String jzr;
	 public void setJzr(String jzr)
	 {
		  this.jzr = jzr;
	 }
   public String getJzr()
   { 	    
  	        
      return this.jzr;     	
   }
 	 	 private Date jzrq;
	 public void setJzrq(Date jzrq)
	 {
		  this.jzrq = jzrq;
	 }
   public Date getJzrq()
   { 	    
  	  	    if( this.jzrq != null )
	    {
	        return (Date)new ActizDate( this.jzrq.getTime() );
	    }
	          
      return this.jzrq;     	
   }
 	 	 private Date ksrq;
	 public void setKsrq(Date ksrq)
	 {
		  this.ksrq = ksrq;
	 }
   public Date getKsrq()
   { 	    
  	  	    if( this.ksrq != null )
	    {
	        return (Date)new ActizDate( this.ksrq.getTime() );
	    }
	          
      return this.ksrq;     	
   }
 	 	 private String leixing;
	 public void setLeixing(String leixing)
	 {
		  this.leixing = leixing;
	 }
   public String getLeixing()
   { 	    
  	        
      return this.leixing;     	
   }
 	 	 private Long sjjlid;
	 public void setSjjlid(Long sjjlid)
	 {
		  this.sjjlid = sjjlid;
	 }
   public Long getSjjlid()
   { 	    
  	        
      return this.sjjlid;     	
   }
 	 	 private String sfjz;
	 public void setSfjz(String sfjz)
	 {
		  this.sfjz = sfjz;
	 }
   public String getSfjz()
   { 	    
  	        
      return this.sfjz;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzjiezhangjl sjjlidRef;
	 public void setSjjlidRef(com.actiz.platform.application.dataset.pojo.Atzjiezhangjl sjjlidRef)
	 {
		  this.sjjlidRef = sjjlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjiezhangjl getSjjlidRef()
   {
     	return this.sjjlidRef;
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