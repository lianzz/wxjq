package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzdiaobodmx implements Serializable,IPojo
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
	  	 	 private Long atzdiaobodid;
	 public void setAtzdiaobodid(Long atzdiaobodid)
	 {
		  this.atzdiaobodid = atzdiaobodid;
	 }
   public Long getAtzdiaobodid()
   { 	    
  	        
      return this.atzdiaobodid;     	
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
 	 	 private String diaobolx;
	 public void setDiaobolx(String diaobolx)
	 {
		  this.diaobolx = diaobolx;
	 }
   public String getDiaobolx()
   { 	    
  	        
      return this.diaobolx;     	
   }
 	 	 private Double jihuasl;
	 public void setJihuasl(Double jihuasl)
	 {
		  this.jihuasl = jihuasl;
	 }
   public Double getJihuasl()
   { 	    
  	        
      return this.jihuasl;     	
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
 	 	 private Long diaochuxmid;
	 public void setDiaochuxmid(Long diaochuxmid)
	 {
		  this.diaochuxmid = diaochuxmid;
	 }
   public Long getDiaochuxmid()
   { 	    
  	        
      return this.diaochuxmid;     	
   }
 	 	 private Long diaorukw;
	 public void setDiaorukw(Long diaorukw)
	 {
		  this.diaorukw = diaorukw;
	 }
   public Long getDiaorukw()
   { 	    
  	        
      return this.diaorukw;     	
   }
 	 	 private Long diaoruxmid;
	 public void setDiaoruxmid(Long diaoruxmid)
	 {
		  this.diaoruxmid = diaoruxmid;
	 }
   public Long getDiaoruxmid()
   { 	    
  	        
      return this.diaoruxmid;     	
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
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzdiaobod atzdiaobodidRef;
	 public void setAtzdiaobodidRef(com.actiz.platform.application.dataset.pojo.Atzdiaobod atzdiaobodidRef)
	 {
		  this.atzdiaobodidRef = atzdiaobodidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdiaobod getAtzdiaobodidRef()
   {
     	return this.atzdiaobodidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu diaochuxmidRef;
	 public void setDiaochuxmidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu diaochuxmidRef)
	 {
		  this.diaochuxmidRef = diaochuxmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getDiaochuxmidRef()
   {
     	return this.diaochuxmidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkuwei diaorukwRef;
	 public void setDiaorukwRef(com.actiz.platform.application.dataset.pojo.Atzkuwei diaorukwRef)
	 {
		  this.diaorukwRef = diaorukwRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkuwei getDiaorukwRef()
   {
     	return this.diaorukwRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu diaoruxmidRef;
	 public void setDiaoruxmidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu diaoruxmidRef)
	 {
		  this.diaoruxmidRef = diaoruxmidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getDiaoruxmidRef()
   {
     	return this.diaoruxmidRef;
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