package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzwendangxx implements Serializable,IPojo
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
	  	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
   }
 	 	 private String gongchengs;
	 public void setGongchengs(String gongchengs)
	 {
		  this.gongchengs = gongchengs;
	 }
   public String getGongchengs()
   { 	    
  	        
      return this.gongchengs;     	
   }
 	 	 private Date shangchuansj;
	 public void setShangchuansj(Date shangchuansj)
	 {
		  this.shangchuansj = shangchuansj;
	 }
   public Date getShangchuansj()
   { 	    
  	  	    if( this.shangchuansj != null )
	    {
	        return (Date)new ActizDate( this.shangchuansj.getTime() );
	    }
	          
      return this.shangchuansj;     	
   }
 	 	 private String wendanglx;
	 public void setWendanglx(String wendanglx)
	 {
		  this.wendanglx = wendanglx;
	 }
   public String getWendanglx()
   { 	    
  	        
      return this.wendanglx;     	
   }
 	 	 private Long xiangmupqdid;
	 public void setXiangmupqdid(Long xiangmupqdid)
	 {
		  this.xiangmupqdid = xiangmupqdid;
	 }
   public Long getXiangmupqdid()
   { 	    
  	        
      return this.xiangmupqdid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqdidRef;
	 public void setXiangmupqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqdidRef)
	 {
		  this.xiangmupqdidRef = xiangmupqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupqd getXiangmupqdidRef()
   {
     	return this.xiangmupqdidRef;
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