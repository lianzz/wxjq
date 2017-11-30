package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjihuatzmx implements Serializable,IPojo
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
	  	 	 private Long crkjhmxid;
	 public void setCrkjhmxid(Long crkjhmxid)
	 {
		  this.crkjhmxid = crkjhmxid;
	 }
   public Long getCrkjhmxid()
   { 	    
  	        
      return this.crkjhmxid;     	
   }
 	 	 private Double tzshuliang;
	 public void setTzshuliang(Double tzshuliang)
	 {
		  this.tzshuliang = tzshuliang;
	 }
   public Double getTzshuliang()
   { 	    
  	        
      return this.tzshuliang;     	
   }
 	 	 private String tzyy;
	 public void setTzyy(String tzyy)
	 {
		  this.tzyy = tzyy;
	 }
   public String getTzyy()
   { 	    
  	        
      return this.tzyy;     	
   }
 	 	 private Long jihuatzid;
	 public void setJihuatzid(Long jihuatzid)
	 {
		  this.jihuatzid = jihuatzid;
	 }
   public Long getJihuatzid()
   { 	    
  	        
      return this.jihuatzid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx crkjhmxidRef;
	 public void setCrkjhmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx crkjhmxidRef)
	 {
		  this.crkjhmxidRef = crkjhmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhdmx getCrkjhmxidRef()
   {
     	return this.crkjhmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzjihuatz jihuatzidRef;
	 public void setJihuatzidRef(com.actiz.platform.application.dataset.pojo.Atzjihuatz jihuatzidRef)
	 {
		  this.jihuatzidRef = jihuatzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjihuatz getJihuatzidRef()
   {
     	return this.jihuatzidRef;
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