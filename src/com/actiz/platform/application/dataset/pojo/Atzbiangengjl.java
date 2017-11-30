package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbiangengjl implements Serializable,IPojo
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
 	 	 private Double dinggouslh;
	 public void setDinggouslh(Double dinggouslh)
	 {
		  this.dinggouslh = dinggouslh;
	 }
   public Double getDinggouslh()
   { 	    
  	        
      return this.dinggouslh;     	
   }
 	 	 private String jggxh;
	 public void setJggxh(String jggxh)
	 {
		  this.jggxh = jggxh;
	 }
   public String getJggxh()
   { 	    
  	        
      return this.jggxh;     	
   }
 	 	 private Double mdwslh;
	 public void setMdwslh(Double mdwslh)
	 {
		  this.mdwslh = mdwslh;
	 }
   public Double getMdwslh()
   { 	    
  	        
      return this.mdwslh;     	
   }
 	 	 private String qitaxxh;
	 public void setQitaxxh(String qitaxxh)
	 {
		  this.qitaxxh = qitaxxh;
	 }
   public String getQitaxxh()
   { 	    
  	        
      return this.qitaxxh;     	
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
 	 	 private Long wuliaoidh;
	 public void setWuliaoidh(Long wuliaoidh)
	 {
		  this.wuliaoidh = wuliaoidh;
	 }
   public Long getWuliaoidh()
   { 	    
  	        
      return this.wuliaoidh;     	
   }
 	 	 private String xiangmubhh;
	 public void setXiangmubhh(String xiangmubhh)
	 {
		  this.xiangmubhh = xiangmubhh;
	 }
   public String getXiangmubhh()
   { 	    
  	        
      return this.xiangmubhh;     	
   }
 	 	 private Long xiangmuidh;
	 public void setXiangmuidh(Long xiangmuidh)
	 {
		  this.xiangmuidh = xiangmuidh;
	 }
   public Long getXiangmuidh()
   { 	    
  	        
      return this.xiangmuidh;     	
   }
 	 	 private Date yqwcrqh;
	 public void setYqwcrqh(Date yqwcrqh)
	 {
		  this.yqwcrqh = yqwcrqh;
	 }
   public Date getYqwcrqh()
   { 	    
  	  	    if( this.yqwcrqh != null )
	    {
	        return (Date)new ActizDate( this.yqwcrqh.getTime() );
	    }
	          
      return this.yqwcrqh;     	
   }
 	 	 private Double dinggouslq;
	 public void setDinggouslq(Double dinggouslq)
	 {
		  this.dinggouslq = dinggouslq;
	 }
   public Double getDinggouslq()
   { 	    
  	        
      return this.dinggouslq;     	
   }
 	 	 private String jggxq;
	 public void setJggxq(String jggxq)
	 {
		  this.jggxq = jggxq;
	 }
   public String getJggxq()
   { 	    
  	        
      return this.jggxq;     	
   }
 	 	 private Double mdwslq;
	 public void setMdwslq(Double mdwslq)
	 {
		  this.mdwslq = mdwslq;
	 }
   public Double getMdwslq()
   { 	    
  	        
      return this.mdwslq;     	
   }
 	 	 private String qitaxxq;
	 public void setQitaxxq(String qitaxxq)
	 {
		  this.qitaxxq = qitaxxq;
	 }
   public String getQitaxxq()
   { 	    
  	        
      return this.qitaxxq;     	
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
 	 	 private Long wuliaoidq;
	 public void setWuliaoidq(Long wuliaoidq)
	 {
		  this.wuliaoidq = wuliaoidq;
	 }
   public Long getWuliaoidq()
   { 	    
  	        
      return this.wuliaoidq;     	
   }
 	 	 private String xiangmubhq;
	 public void setXiangmubhq(String xiangmubhq)
	 {
		  this.xiangmubhq = xiangmubhq;
	 }
   public String getXiangmubhq()
   { 	    
  	        
      return this.xiangmubhq;     	
   }
 	 	 private Long xiangmuidq;
	 public void setXiangmuidq(Long xiangmuidq)
	 {
		  this.xiangmuidq = xiangmuidq;
	 }
   public Long getXiangmuidq()
   { 	    
  	        
      return this.xiangmuidq;     	
   }
 	 	 private Date yqwcrqq;
	 public void setYqwcrqq(Date yqwcrqq)
	 {
		  this.yqwcrqq = yqwcrqq;
	 }
   public Date getYqwcrqq()
   { 	    
  	  	    if( this.yqwcrqq != null )
	    {
	        return (Date)new ActizDate( this.yqwcrqq.getTime() );
	    }
	          
      return this.yqwcrqq;     	
   }
 	 	 private Date biangengrq;
	 public void setBiangengrq(Date biangengrq)
	 {
		  this.biangengrq = biangengrq;
	 }
   public Date getBiangengrq()
   { 	    
  	  	    if( this.biangengrq != null )
	    {
	        return (Date)new ActizDate( this.biangengrq.getTime() );
	    }
	          
      return this.biangengrq;     	
   }
 	 	 private Double biangengsl;
	 public void setBiangengsl(Double biangengsl)
	 {
		  this.biangengsl = biangengsl;
	 }
   public Double getBiangengsl()
   { 	    
  	        
      return this.biangengsl;     	
   }
 	 	 private String biangengx;
	 public void setBiangengx(String biangengx)
	 {
		  this.biangengx = biangengx;
	 }
   public String getBiangengx()
   { 	    
  	        
      return this.biangengx;     	
   }
 	 	 private String genggaihz;
	 public void setGenggaihz(String genggaihz)
	 {
		  this.genggaihz = genggaihz;
	 }
   public String getGenggaihz()
   { 	    
  	        
      return this.genggaihz;     	
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
 	 	 private String shujusfhg;
	 public void setShujusfhg(String shujusfhg)
	 {
		  this.shujusfhg = shujusfhg;
	 }
   public String getShujusfhg()
   { 	    
  	        
      return this.shujusfhg;     	
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
 	 	 private String xiugailx;
	 public void setXiugailx(String xiugailx)
	 {
		  this.xiugailx = xiugailx;
	 }
   public String getXiugailx()
   { 	    
  	        
      return this.xiugailx;     	
   }
 	 	 private String yuanshiz;
	 public void setYuanshiz(String yuanshiz)
	 {
		  this.yuanshiz = yuanshiz;
	 }
   public String getYuanshiz()
   { 	    
  	        
      return this.yuanshiz;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidhRef;
	 public void setWuliaoidhRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidhRef)
	 {
		  this.wuliaoidhRef = wuliaoidhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidhRef()
   {
     	return this.wuliaoidhRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidhRef;
	 public void setXiangmuidhRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidhRef)
	 {
		  this.xiangmuidhRef = xiangmuidhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidhRef()
   {
     	return this.xiangmuidhRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidqRef;
	 public void setWuliaoidqRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidqRef)
	 {
		  this.wuliaoidqRef = wuliaoidqRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidqRef()
   {
     	return this.wuliaoidqRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidqRef;
	 public void setXiangmuidqRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidqRef)
	 {
		  this.xiangmuidqRef = xiangmuidqRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidqRef()
   {
     	return this.xiangmuidqRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscjhmx scjhmxidRef;
	 public void setScjhmxidRef(com.actiz.platform.application.dataset.pojo.Atzscjhmx scjhmxidRef)
	 {
		  this.scjhmxidRef = scjhmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjhmx getScjhmxidRef()
   {
     	return this.scjhmxidRef;
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