package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscrwmx implements Serializable,IPojo
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
	  	 	 private Long atzscrwid;
	 public void setAtzscrwid(Long atzscrwid)
	 {
		  this.atzscrwid = atzscrwid;
	 }
   public Long getAtzscrwid()
   { 	    
  	        
      return this.atzscrwid;     	
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
 	 	 private Double chexiaosl;
	 public void setChexiaosl(Double chexiaosl)
	 {
		  this.chexiaosl = chexiaosl;
	 }
   public Double getChexiaosl()
   { 	    
  	        
      return this.chexiaosl;     	
   }
 	 	 private Date jihuawcrq;
	 public void setJihuawcrq(Date jihuawcrq)
	 {
		  this.jihuawcrq = jihuawcrq;
	 }
   public Date getJihuawcrq()
   { 	    
  	  	    if( this.jihuawcrq != null )
	    {
	        return (Date)new ActizDate( this.jihuawcrq.getTime() );
	    }
	          
      return this.jihuawcrq;     	
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
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
   }
 	 	 private Long scjhmxid;
	 public void setScjhmxid(Long scjhmxid)
	 {
		  this.scjhmxid = scjhmxid;
	 }
   public Long getScjhmxid()
   { 	    
  	        
      return this.scjhmxid;     	
   }
 	 	 private Integer scpx;
	 public void setScpx(Integer scpx)
	 {
		  this.scpx = scpx;
	 }
   public Integer getScpx()
   { 	    
  	        
      return this.scpx;     	
   }
 	 	 private String scwdjqbb;
	 public void setScwdjqbb(String scwdjqbb)
	 {
		  this.scwdjqbb = scwdjqbb;
	 }
   public String getScwdjqbb()
   { 	    
  	        
      return this.scwdjqbb;     	
   }
 	 	 private String shifouyfh;
	 public void setShifouyfh(String shifouyfh)
	 {
		  this.shifouyfh = shifouyfh;
	 }
   public String getShifouyfh()
   { 	    
  	        
      return this.shifouyfh;     	
   }
 	 	 private String shifouyscmac;
	 public void setShifouyscmac(String shifouyscmac)
	 {
		  this.shifouyscmac = shifouyscmac;
	 }
   public String getShifouyscmac()
   { 	    
  	        
      return this.shifouyscmac;     	
   }
 	 	 private String shifouyxd;
	 public void setShifouyxd(String shifouyxd)
	 {
		  this.shifouyxd = shifouyxd;
	 }
   public String getShifouyxd()
   { 	    
  	        
      return this.shifouyxd;     	
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
 	 	 private Double weisjsl;
	 public void setWeisjsl(Double weisjsl)
	 {
		  this.weisjsl = weisjsl;
	 }
   public Double getWeisjsl()
   { 	    
  	        
      return this.weisjsl;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private String wuliaozk;
	 public void setWuliaozk(String wuliaozk)
	 {
		  this.wuliaozk = wuliaozk;
	 }
   public String getWuliaozk()
   { 	    
  	        
      return this.wuliaozk;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzscrw atzscrwidRef;
	 public void setAtzscrwidRef(com.actiz.platform.application.dataset.pojo.Atzscrw atzscrwidRef)
	 {
		  this.atzscrwidRef = atzscrwidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getAtzscrwidRef()
   {
     	return this.atzscrwidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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