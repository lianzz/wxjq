package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukls implements Serializable,IPojo
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
	  	 	 private Double bencijhsl;
	 public void setBencijhsl(Double bencijhsl)
	 {
		  this.bencijhsl = bencijhsl;
	 }
   public Double getBencijhsl()
   { 	    
  	        
      return this.bencijhsl;     	
   }
 	 	 private Long churukdid;
	 public void setChurukdid(Long churukdid)
	 {
		  this.churukdid = churukdid;
	 }
   public Long getChurukdid()
   { 	    
  	        
      return this.churukdid;     	
   }
 	 	 private Long churukdmxid;
	 public void setChurukdmxid(Long churukdmxid)
	 {
		  this.churukdmxid = churukdmxid;
	 }
   public Long getChurukdmxid()
   { 	    
  	        
      return this.churukdmxid;     	
   }
 	 	 private Long churukjhdid;
	 public void setChurukjhdid(Long churukjhdid)
	 {
		  this.churukjhdid = churukjhdid;
	 }
   public Long getChurukjhdid()
   { 	    
  	        
      return this.churukjhdid;     	
   }
 	 	 private String churuklx;
	 public void setChuruklx(String churuklx)
	 {
		  this.churuklx = churuklx;
	 }
   public String getChuruklx()
   { 	    
  	        
      return this.churuklx;     	
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
 	 	 private String cunfangwz;
	 public void setCunfangwz(String cunfangwz)
	 {
		  this.cunfangwz = cunfangwz;
	 }
   public String getCunfangwz()
   { 	    
  	        
      return this.cunfangwz;     	
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
 	 	 private String churukr;
	 public void setChurukr(String churukr)
	 {
		  this.churukr = churukr;
	 }
   public String getChurukr()
   { 	    
  	        
      return this.churukr;     	
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
 	 	 private Date riqi;
	 public void setRiqi(Date riqi)
	 {
		  this.riqi = riqi;
	 }
   public Date getRiqi()
   { 	    
  	  	    if( this.riqi != null )
	    {
	        return (Date)new ActizDate( this.riqi.getTime() );
	    }
	          
      return this.riqi;     	
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
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
 	 	 private String zhixingf;
	 public void setZhixingf(String zhixingf)
	 {
		  this.zhixingf = zhixingf;
	 }
   public String getZhixingf()
   { 	    
  	        
      return this.zhixingf;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukd churukdidRef;
	 public void setChurukdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukd churukdidRef)
	 {
		  this.churukdidRef = churukdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukd getChurukdidRef()
   {
     	return this.churukdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef;
	 public void setChurukjhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef)
	 {
		  this.churukjhdidRef = churukjhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getChurukjhdidRef()
   {
     	return this.churukjhdidRef;
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