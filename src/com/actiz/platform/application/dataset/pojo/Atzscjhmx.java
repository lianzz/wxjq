package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzscjhmx implements Serializable,IPojo
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
	  	 	 private Long atzscjhid;
	 public void setAtzscjhid(Long atzscjhid)
	 {
		  this.atzscjhid = atzscjhid;
	 }
   public Long getAtzscjhid()
   { 	    
  	        
      return this.atzscjhid;     	
   }
 	 	 private Long beihuojhmxid;
	 public void setBeihuojhmxid(Long beihuojhmxid)
	 {
		  this.beihuojhmxid = beihuojhmxid;
	 }
   public Long getBeihuojhmxid()
   { 	    
  	        
      return this.beihuojhmxid;     	
   }
 	 	 private Double beihuosl;
	 public void setBeihuosl(Double beihuosl)
	 {
		  this.beihuosl = beihuosl;
	 }
   public Double getBeihuosl()
   { 	    
  	        
      return this.beihuosl;     	
   }
 	 	 private Long bhtzdmxid;
	 public void setBhtzdmxid(Long bhtzdmxid)
	 {
		  this.bhtzdmxid = bhtzdmxid;
	 }
   public Long getBhtzdmxid()
   { 	    
  	        
      return this.bhtzdmxid;     	
   }
 	 	 private Double beijiankky;
	 public void setBeijiankky(Double beijiankky)
	 {
		  this.beijiankky = beijiankky;
	 }
   public Double getBeijiankky()
   { 	    
  	        
      return this.beijiankky;     	
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
 	 	 private String jiagonggx;
	 public void setJiagonggx(String jiagonggx)
	 {
		  this.jiagonggx = jiagonggx;
	 }
   public String getJiagonggx()
   { 	    
  	        
      return this.jiagonggx;     	
   }
 	 	 private Double kucunsl;
	 public void setKucunsl(Double kucunsl)
	 {
		  this.kucunsl = kucunsl;
	 }
   public Double getKucunsl()
   { 	    
  	        
      return this.kucunsl;     	
   }
 	 	 private Double gongchengjy;
	 public void setGongchengjy(Double gongchengjy)
	 {
		  this.gongchengjy = gongchengjy;
	 }
   public Double getGongchengjy()
   { 	    
  	        
      return this.gongchengjy;     	
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
 	 	 private Double quekousl;
	 public void setQuekousl(Double quekousl)
	 {
		  this.quekousl = quekousl;
	 }
   public Double getQuekousl()
   { 	    
  	        
      return this.quekousl;     	
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
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Double shengchanzx;
	 public void setShengchanzx(Double shengchanzx)
	 {
		  this.shengchanzx = shengchanzx;
	 }
   public Double getShengchanzx()
   { 	    
  	        
      return this.shengchanzx;     	
   }
 	 	 private Double sjweibhsl;
	 public void setSjweibhsl(Double sjweibhsl)
	 {
		  this.sjweibhsl = sjweibhsl;
	 }
   public Double getSjweibhsl()
   { 	    
  	        
      return this.sjweibhsl;     	
   }
 	 	 private String shifoubh;
	 public void setShifoubh(String shifoubh)
	 {
		  this.shifoubh = shifoubh;
	 }
   public String getShifoubh()
   { 	    
  	        
      return this.shifoubh;     	
   }
 	 	 private String shifouscscrw;
	 public void setShifouscscrw(String shifouscscrw)
	 {
		  this.shifouscscrw = shifouscscrw;
	 }
   public String getShifouscscrw()
   { 	    
  	        
      return this.shifouscscrw;     	
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
 	 	 private String shifouymrpys;
	 public void setShifouymrpys(String shifouymrpys)
	 {
		  this.shifouymrpys = shifouymrpys;
	 }
   public String getShifouymrpys()
   { 	    
  	        
      return this.shifouymrpys;     	
   }
 	 	 private String shifouysclld;
	 public void setShifouysclld(String shifouysclld)
	 {
		  this.shifouysclld = shifouysclld;
	 }
   public String getShifouysclld()
   { 	    
  	        
      return this.shifouysclld;     	
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
 	 	 private Double weibhsl;
	 public void setWeibhsl(Double weibhsl)
	 {
		  this.weibhsl = weibhsl;
	 }
   public Double getWeibhsl()
   { 	    
  	        
      return this.weibhsl;     	
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
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
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
 	 	 private Long yfszid;
	 public void setYfszid(Long yfszid)
	 {
		  this.yfszid = yfszid;
	 }
   public Long getYfszid()
   { 	    
  	        
      return this.yfszid;     	
   }
 	 	 private Date yaoqiuwcrq;
	 public void setYaoqiuwcrq(Date yaoqiuwcrq)
	 {
		  this.yaoqiuwcrq = yaoqiuwcrq;
	 }
   public Date getYaoqiuwcrq()
   { 	    
  	  	    if( this.yaoqiuwcrq != null )
	    {
	        return (Date)new ActizDate( this.yaoqiuwcrq.getTime() );
	    }
	          
      return this.yaoqiuwcrq;     	
   }
 	 	 private Double yibeizt;
	 public void setYibeizt(Double yibeizt)
	 {
		  this.yibeizt = yibeizt;
	 }
   public Double getYibeizt()
   { 	    
  	        
      return this.yibeizt;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzscjh atzscjhidRef;
	 public void setAtzscjhidRef(com.actiz.platform.application.dataset.pojo.Atzscjh atzscjhidRef)
	 {
		  this.atzscjhidRef = atzscjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjh getAtzscjhidRef()
   {
     	return this.atzscjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbeihuotzdmx bhtzdmxidRef;
	 public void setBhtzdmxidRef(com.actiz.platform.application.dataset.pojo.Atzbeihuotzdmx bhtzdmxidRef)
	 {
		  this.bhtzdmxidRef = bhtzdmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbeihuotzdmx getBhtzdmxidRef()
   {
     	return this.bhtzdmxidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef;
	 public void setXiaoshoubmidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm xiaoshoubmidRef)
	 {
		  this.xiaoshoubmidRef = xiaoshoubmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getXiaoshoubmidRef()
   {
     	return this.xiaoshoubmidRef;
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