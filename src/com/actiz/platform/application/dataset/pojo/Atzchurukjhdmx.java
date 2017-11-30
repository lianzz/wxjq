package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukjhdmx implements Serializable,IPojo
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
	  	 	 private Long atzchurukjhdid;
	 public void setAtzchurukjhdid(Long atzchurukjhdid)
	 {
		  this.atzchurukjhdid = atzchurukjhdid;
	 }
   public Long getAtzchurukjhdid()
   { 	    
  	        
      return this.atzchurukjhdid;     	
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
 	 	 private String cunfangwz;
	 public void setCunfangwz(String cunfangwz)
	 {
		  this.cunfangwz = cunfangwz;
	 }
   public String getCunfangwz()
   { 	    
  	        
      return this.cunfangwz;     	
   }
 	 	 private String danwei;
	 public void setDanwei(String danwei)
	 {
		  this.danwei = danwei;
	 }
   public String getDanwei()
   { 	    
  	        
      return this.danwei;     	
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
 	 	 private String guigedw;
	 public void setGuigedw(String guigedw)
	 {
		  this.guigedw = guigedw;
	 }
   public String getGuigedw()
   { 	    
  	        
      return this.guigedw;     	
   }
 	 	 private Double initshuliang;
	 public void setInitshuliang(Double initshuliang)
	 {
		  this.initshuliang = initshuliang;
	 }
   public Double getInitshuliang()
   { 	    
  	        
      return this.initshuliang;     	
   }
 	 	 private String kucunck;
	 public void setKucunck(String kucunck)
	 {
		  this.kucunck = kucunck;
	 }
   public String getKucunck()
   { 	    
  	        
      return this.kucunck;     	
   }
 	 	 private Long kuweiid;
	 public void setKuweiid(Long kuweiid)
	 {
		  this.kuweiid = kuweiid;
	 }
   public Long getKuweiid()
   { 	    
  	        
      return this.kuweiid;     	
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
 	 	 private Double weicrksl;
	 public void setWeicrksl(Double weicrksl)
	 {
		  this.weicrksl = weicrksl;
	 }
   public Double getWeicrksl()
   { 	    
  	        
      return this.weicrksl;     	
   }
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
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
 	 	 private String wuliaoms;
	 public void setWuliaoms(String wuliaoms)
	 {
		  this.wuliaoms = wuliaoms;
	 }
   public String getWuliaoms()
   { 	    
  	        
      return this.wuliaoms;     	
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
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
 	 	 private Date yujighrq;
	 public void setYujighrq(Date yujighrq)
	 {
		  this.yujighrq = yujighrq;
	 }
   public Date getYujighrq()
   { 	    
  	  	    if( this.yujighrq != null )
	    {
	        return (Date)new ActizDate( this.yujighrq.getTime() );
	    }
	          
      return this.yujighrq;     	
   }
 	 	 private Double zaixianl;
	 public void setZaixianl(Double zaixianl)
	 {
		  this.zaixianl = zaixianl;
	 }
   public Double getZaixianl()
   { 	    
  	        
      return this.zaixianl;     	
   }
 	 	 private Double zhizaowzxl;
	 public void setZhizaowzxl(Double zhizaowzxl)
	 {
		  this.zhizaowzxl = zhizaowzxl;
	 }
   public Double getZhizaowzxl()
   { 	    
  	        
      return this.zhizaowzxl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd atzchurukjhdidRef;
	 public void setAtzchurukjhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd atzchurukjhdidRef)
	 {
		  this.atzchurukjhdidRef = atzchurukjhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getAtzchurukjhdidRef()
   {
     	return this.atzchurukjhdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkuwei kuweiidRef;
	 public void setKuweiidRef(com.actiz.platform.application.dataset.pojo.Atzkuwei kuweiidRef)
	 {
		  this.kuweiidRef = kuweiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkuwei getKuweiidRef()
   {
     	return this.kuweiidRef;
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