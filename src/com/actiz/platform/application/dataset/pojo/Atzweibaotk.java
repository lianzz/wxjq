package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzweibaotk implements Serializable,IPojo
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
	  	 	 private String wujiufw;
	 public void setWujiufw(String wujiufw)
	 {
		  this.wujiufw = wujiufw;
	 }
   public String getWujiufw()
   { 	    
  	        
      return this.wujiufw;     	
   }
 	 	 private String qiesfw;
	 public void setQiesfw(String qiesfw)
	 {
		  this.qiesfw = qiesfw;
	 }
   public String getQiesfw()
   { 	    
  	        
      return this.qiesfw;     	
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
 	 	 private Date cbsj;
	 public void setCbsj(Date cbsj)
	 {
		  this.cbsj = cbsj;
	 }
   public Date getCbsj()
   { 	    
  	  	    if( this.cbsj != null )
	    {
	        return (Date)new ActizDate( this.cbsj.getTime() );
	    }
	          
      return this.cbsj;     	
   }
 	 	 private String gcysbz;
	 public void setGcysbz(String gcysbz)
	 {
		  this.gcysbz = gcysbz;
	 }
   public String getGcysbz()
   { 	    
  	        
      return this.gcysbz;     	
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
 	 	 private String jishuzxfw;
	 public void setJishuzxfw(String jishuzxfw)
	 {
		  this.jishuzxfw = jishuzxfw;
	 }
   public String getJishuzxfw()
   { 	    
  	        
      return this.jishuzxfw;     	
   }
 	 	 private Double jjgzjwxfwsx;
	 public void setJjgzjwxfwsx(Double jjgzjwxfwsx)
	 {
		  this.jjgzjwxfwsx = jjgzjwxfwsx;
	 }
   public Double getJjgzjwxfwsx()
   { 	    
  	        
      return this.jjgzjwxfwsx;     	
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
 	 	 private String kehupxfw;
	 public void setKehupxfw(String kehupxfw)
	 {
		  this.kehupxfw = kehupxfw;
	 }
   public String getKehupxfw()
   { 	    
  	        
      return this.kehupxfw;     	
   }
 	 	 private Integer kehupxrs;
	 public void setKehupxrs(Integer kehupxrs)
	 {
		  this.kehupxrs = kehupxrs;
	 }
   public Integer getKehupxrs()
   { 	    
  	        
      return this.kehupxrs;     	
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
 	 	 private Integer mnfwzjjlcs;
	 public void setMnfwzjjlcs(Integer mnfwzjjlcs)
	 {
		  this.mnfwzjjlcs = mnfwzjjlcs;
	 }
   public Integer getMnfwzjjlcs()
   { 	    
  	        
      return this.mnfwzjjlcs;     	
   }
 	 	 private Integer mnxcxjcs;
	 public void setMnxcxjcs(Integer mnxcxjcs)
	 {
		  this.mnxcxjcs = mnxcxjcs;
	 }
   public Integer getMnxcxjcs()
   { 	    
  	        
      return this.mnxcxjcs;     	
   }
 	 	 private Integer meinianxjcs;
	 public void setMeinianxjcs(Integer meinianxjcs)
	 {
		  this.meinianxjcs = meinianxjcs;
	 }
   public Integer getMeinianxjcs()
   { 	    
  	        
      return this.meinianxjcs;     	
   }
 	 	 private Integer mnycxjcs;
	 public void setMnycxjcs(Integer mnycxjcs)
	 {
		  this.mnycxjcs = mnycxjcs;
	 }
   public Integer getMnycxjcs()
   { 	    
  	        
      return this.mnycxjcs;     	
   }
 	 	 private String rjsjjbdfw;
	 public void setRjsjjbdfw(String rjsjjbdfw)
	 {
		  this.rjsjjbdfw = rjsjjbdfw;
	 }
   public String getRjsjjbdfw()
   { 	    
  	        
      return this.rjsjjbdfw;     	
   }
 	 	 private String shebeiyjgh;
	 public void setShebeiyjgh(String shebeiyjgh)
	 {
		  this.shebeiyjgh = shebeiyjgh;
	 }
   public String getShebeiyjgh()
   { 	    
  	        
      return this.shebeiyjgh;     	
   }
 	 	 private String shebeiyjwx;
	 public void setShebeiyjwx(String shebeiyjwx)
	 {
		  this.shebeiyjwx = shebeiyjwx;
	 }
   public String getShebeiyjwx()
   { 	    
  	        
      return this.shebeiyjwx;     	
   }
 	 	 private String weibaodw;
	 public void setWeibaodw(String weibaodw)
	 {
		  this.weibaodw = weibaodw;
	 }
   public String getWeibaodw()
   { 	    
  	        
      return this.weibaodw;     	
   }
 	 	 private String weibaokscftj;
	 public void setWeibaokscftj(String weibaokscftj)
	 {
		  this.weibaokscftj = weibaokscftj;
	 }
   public String getWeibaokscftj()
   { 	    
  	        
      return this.weibaokscftj;     	
   }
 	 	 private Integer weibaoqx;
	 public void setWeibaoqx(Integer weibaoqx)
	 {
		  this.weibaoqx = weibaoqx;
	 }
   public Integer getWeibaoqx()
   { 	    
  	        
      return this.weibaoqx;     	
   }
 	 	 private String xcgzclfw;
	 public void setXcgzclfw(String xcgzclfw)
	 {
		  this.xcgzclfw = xcgzclfw;
	 }
   public String getXcgzclfw()
   { 	    
  	        
      return this.xcgzclfw;     	
   }
 	 	 private String xczcfw;
	 public void setXczcfw(String xczcfw)
	 {
		  this.xczcfw = xczcfw;
	 }
   public String getXczcfw()
   { 	    
  	        
      return this.xczcfw;     	
   }
 	 	 private Date xbsj;
	 public void setXbsj(Date xbsj)
	 {
		  this.xbsj = xbsj;
	 }
   public Date getXbsj()
   { 	    
  	  	    if( this.xbsj != null )
	    {
	        return (Date)new ActizDate( this.xbsj.getTime() );
	    }
	          
      return this.xbsj;     	
   }
 	 	 private Double ybgzjwxfwsx;
	 public void setYbgzjwxfwsx(Double ybgzjwxfwsx)
	 {
		  this.ybgzjwxfwsx = ybgzjwxfwsx;
	 }
   public Double getYbgzjwxfwsx()
   { 	    
  	        
      return this.ybgzjwxfwsx;     	
   }
 	 	 private String ycgzclfw;
	 public void setYcgzclfw(String ycgzclfw)
	 {
		  this.ycgzclfw = ycgzclfw;
	 }
   public String getYcgzclfw()
   { 	    
  	        
      return this.ycgzclfw;     	
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