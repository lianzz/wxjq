package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzrenshibd implements Serializable,IPojo
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
	  	 	 private String churulx;
	 public void setChurulx(String churulx)
	 {
		  this.churulx = churulx;
	 }
   public String getChurulx()
   { 	    
  	        
      return this.churulx;     	
   }
 	 	 private String churuqk;
	 public void setChuruqk(String churuqk)
	 {
		  this.churuqk = churuqk;
	 }
   public String getChuruqk()
   { 	    
  	        
      return this.churuqk;     	
   }
 	 	 private String gangweibdyy;
	 public void setGangweibdyy(String gangweibdyy)
	 {
		  this.gangweibdyy = gangweibdyy;
	 }
   public String getGangweibdyy()
   { 	    
  	        
      return this.gangweibdyy;     	
   }
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
   }
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
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
 	 	 private Long nibiandongbm;
	 public void setNibiandongbm(Long nibiandongbm)
	 {
		  this.nibiandongbm = nibiandongbm;
	 }
   public Long getNibiandongbm()
   { 	    
  	        
      return this.nibiandongbm;     	
   }
 	 	 private Long nibiandonggw;
	 public void setNibiandonggw(Long nibiandonggw)
	 {
		  this.nibiandonggw = nibiandonggw;
	 }
   public Long getNibiandonggw()
   { 	    
  	        
      return this.nibiandonggw;     	
   }
 	 	 private Date nibiandongsj;
	 public void setNibiandongsj(Date nibiandongsj)
	 {
		  this.nibiandongsj = nibiandongsj;
	 }
   public Date getNibiandongsj()
   { 	    
  	  	    if( this.nibiandongsj != null )
	    {
	        return (Date)new ActizDate( this.nibiandongsj.getTime() );
	    }
	          
      return this.nibiandongsj;     	
   }
 	 	 private Long xianbm;
	 public void setXianbm(Long xianbm)
	 {
		  this.xianbm = xianbm;
	 }
   public Long getXianbm()
   { 	    
  	        
      return this.xianbm;     	
   }
 	 	 private Long xiangw;
	 public void setXiangw(Long xiangw)
	 {
		  this.xiangw = xiangw;
	 }
   public Long getXiangw()
   { 	    
  	        
      return this.xiangw;     	
   }
 	 	 private Long yuangong;
	 public void setYuangong(Long yuangong)
	 {
		  this.yuangong = yuangong;
	 }
   public Long getYuangong()
   { 	    
  	        
      return this.yuangong;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment nibiandongbmRef;
	 public void setNibiandongbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment nibiandongbmRef)
	 {
		  this.nibiandongbmRef = nibiandongbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getNibiandongbmRef()
   {
     	return this.nibiandongbmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzgangwei nibiandonggwRef;
	 public void setNibiandonggwRef(com.actiz.platform.application.dataset.pojo.Atzgangwei nibiandonggwRef)
	 {
		  this.nibiandonggwRef = nibiandonggwRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgangwei getNibiandonggwRef()
   {
     	return this.nibiandonggwRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment xianbmRef;
	 public void setXianbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment xianbmRef)
	 {
		  this.xianbmRef = xianbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getXianbmRef()
   {
     	return this.xianbmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzgangwei xiangwRef;
	 public void setXiangwRef(com.actiz.platform.application.dataset.pojo.Atzgangwei xiangwRef)
	 {
		  this.xiangwRef = xiangwRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgangwei getXiangwRef()
   {
     	return this.xiangwRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef;
	 public void setYuangongRef(com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef)
	 {
		  this.yuangongRef = yuangongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYuangongRef()
   {
     	return this.yuangongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
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