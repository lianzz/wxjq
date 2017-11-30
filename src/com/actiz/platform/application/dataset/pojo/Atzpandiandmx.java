package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpandiandmx implements Serializable,IPojo
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
	  	 	 private Long atzpandiandid;
	 public void setAtzpandiandid(Long atzpandiandid)
	 {
		  this.atzpandiandid = atzpandiandid;
	 }
   public Long getAtzpandiandid()
   { 	    
  	        
      return this.atzpandiandid;     	
   }
 	 	 private Long cangkuid;
	 public void setCangkuid(Long cangkuid)
	 {
		  this.cangkuid = cangkuid;
	 }
   public Long getCangkuid()
   { 	    
  	        
      return this.cangkuid;     	
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
 	 	 private Double shipansl;
	 public void setShipansl(Double shipansl)
	 {
		  this.shipansl = shipansl;
	 }
   public Double getShipansl()
   { 	    
  	        
      return this.shipansl;     	
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
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
   }
 	 	 private Double yingkuisl;
	 public void setYingkuisl(Double yingkuisl)
	 {
		  this.yingkuisl = yingkuisl;
	 }
   public Double getYingkuisl()
   { 	    
  	        
      return this.yingkuisl;     	
   }
 	 	 private Double zhangmiansl;
	 public void setZhangmiansl(Double zhangmiansl)
	 {
		  this.zhangmiansl = zhangmiansl;
	 }
   public Double getZhangmiansl()
   { 	    
  	        
      return this.zhangmiansl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzpandiand atzpandiandidRef;
	 public void setAtzpandiandidRef(com.actiz.platform.application.dataset.pojo.Atzpandiand atzpandiandidRef)
	 {
		  this.atzpandiandidRef = atzpandiandidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzpandiand getAtzpandiandidRef()
   {
     	return this.atzpandiandidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef;
	 public void setCangkuidRef(com.actiz.platform.application.dataset.pojo.Atzcangku cangkuidRef)
	 {
		  this.cangkuidRef = cangkuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcangku getCangkuidRef()
   {
     	return this.cangkuidRef;
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