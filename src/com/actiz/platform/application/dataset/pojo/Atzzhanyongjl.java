package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhanyongjl implements Serializable,IPojo
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
	  	 	 private Long crkjhid;
	 public void setCrkjhid(Long crkjhid)
	 {
		  this.crkjhid = crkjhid;
	 }
   public Long getCrkjhid()
   { 	    
  	        
      return this.crkjhid;     	
   }
 	 	 private Long crkjhmxid;
	 public void setCrkjhmxid(Long crkjhmxid)
	 {
		  this.crkjhmxid = crkjhmxid;
	 }
   public Long getCrkjhmxid()
   { 	    
  	        
      return this.crkjhmxid;     	
   }
 	 	 private Long diaobodid;
	 public void setDiaobodid(Long diaobodid)
	 {
		  this.diaobodid = diaobodid;
	 }
   public Long getDiaobodid()
   { 	    
  	        
      return this.diaobodid;     	
   }
 	 	 private Long diaobodmxid;
	 public void setDiaobodmxid(Long diaobodmxid)
	 {
		  this.diaobodmxid = diaobodmxid;
	 }
   public Long getDiaobodmxid()
   { 	    
  	        
      return this.diaobodmxid;     	
   }
 	 	 private Long diaozid;
	 public void setDiaozid(Long diaozid)
	 {
		  this.diaozid = diaozid;
	 }
   public Long getDiaozid()
   { 	    
  	        
      return this.diaozid;     	
   }
 	 	 private Long diaozmxid;
	 public void setDiaozmxid(Long diaozmxid)
	 {
		  this.diaozmxid = diaozmxid;
	 }
   public Long getDiaozmxid()
   { 	    
  	        
      return this.diaozmxid;     	
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
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
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
 	 	 private String kucunlx;
	 public void setKucunlx(String kucunlx)
	 {
		  this.kucunlx = kucunlx;
	 }
   public String getKucunlx()
   { 	    
  	        
      return this.kucunlx;     	
   }
 	 	 private Double zhanyongl;
	 public void setZhanyongl(Double zhanyongl)
	 {
		  this.zhanyongl = zhanyongl;
	 }
   public Double getZhanyongl()
   { 	    
  	        
      return this.zhanyongl;     	
   }
 	 	 private String caozuor;
	 public void setCaozuor(String caozuor)
	 {
		  this.caozuor = caozuor;
	 }
   public String getCaozuor()
   { 	    
  	        
      return this.caozuor;     	
   }
 	 	 private Date caozuorq;
	 public void setCaozuorq(Date caozuorq)
	 {
		  this.caozuorq = caozuorq;
	 }
   public Date getCaozuorq()
   { 	    
  	  	    if( this.caozuorq != null )
	    {
	        return (Date)new ActizDate( this.caozuorq.getTime() );
	    }
	          
      return this.caozuorq;     	
   }
 	 	 private String churukyy;
	 public void setChurukyy(String churukyy)
	 {
		  this.churukyy = churukyy;
	 }
   public String getChurukyy()
   { 	    
  	        
      return this.churukyy;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd crkjhidRef;
	 public void setCrkjhidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd crkjhidRef)
	 {
		  this.crkjhidRef = crkjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getCrkjhidRef()
   {
     	return this.crkjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx crkjhmxidRef;
	 public void setCrkjhmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx crkjhmxidRef)
	 {
		  this.crkjhmxidRef = crkjhmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx getCrkjhmxidRef()
   {
     	return this.crkjhmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdiaobod diaobodidRef;
	 public void setDiaobodidRef(com.actiz.platform.application.dataset.pojo.Atzdiaobod diaobodidRef)
	 {
		  this.diaobodidRef = diaobodidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdiaobod getDiaobodidRef()
   {
     	return this.diaobodidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdiaobodmx diaobodmxidRef;
	 public void setDiaobodmxidRef(com.actiz.platform.application.dataset.pojo.Atzdiaobodmx diaobodmxidRef)
	 {
		  this.diaobodmxidRef = diaobodmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdiaobodmx getDiaobodmxidRef()
   {
     	return this.diaobodmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztiaozhangzb diaozidRef;
	 public void setDiaozidRef(com.actiz.platform.application.dataset.pojo.Atztiaozhangzb diaozidRef)
	 {
		  this.diaozidRef = diaozidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztiaozhangzb getDiaozidRef()
   {
     	return this.diaozidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztiaozhang diaozmxidRef;
	 public void setDiaozmxidRef(com.actiz.platform.application.dataset.pojo.Atztiaozhang diaozmxidRef)
	 {
		  this.diaozmxidRef = diaozmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztiaozhang getDiaozmxidRef()
   {
     	return this.diaozmxidRef;
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