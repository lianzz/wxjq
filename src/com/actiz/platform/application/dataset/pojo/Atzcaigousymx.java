package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigousymx implements Serializable,IPojo
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
	  	 	 private Long caigouy;
	 public void setCaigouy(Long caigouy)
	 {
		  this.caigouy = caigouy;
	 }
   public Long getCaigouy()
   { 	    
  	        
      return this.caigouy;     	
   }
 	 	 private String changjia;
	 public void setChangjia(String changjia)
	 {
		  this.changjia = changjia;
	 }
   public String getChangjia()
   { 	    
  	        
      return this.changjia;     	
   }
 	 	 private String changshangxh;
	 public void setChangshangxh(String changshangxh)
	 {
		  this.changshangxh = changshangxh;
	 }
   public String getChangshangxh()
   { 	    
  	        
      return this.changshangxh;     	
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
 	 	 private Date qiwangdhrq;
	 public void setQiwangdhrq(Date qiwangdhrq)
	 {
		  this.qiwangdhrq = qiwangdhrq;
	 }
   public Date getQiwangdhrq()
   { 	    
  	  	    if( this.qiwangdhrq != null )
	    {
	        return (Date)new ActizDate( this.qiwangdhrq.getTime() );
	    }
	          
      return this.qiwangdhrq;     	
   }
 	 	 private Long shenyangdbh;
	 public void setShenyangdbh(Long shenyangdbh)
	 {
		  this.shenyangdbh = shenyangdbh;
	 }
   public Long getShenyangdbh()
   { 	    
  	        
      return this.shenyangdbh;     	
   }
 	 	 private Long shengchancj;
	 public void setShengchancj(Long shengchancj)
	 {
		  this.shengchancj = shengchancj;
	 }
   public Long getShengchancj()
   { 	    
  	        
      return this.shengchancj;     	
   }
 	 	 private String shifousycg;
	 public void setShifousycg(String shifousycg)
	 {
		  this.shifousycg = shifousycg;
	 }
   public String getShifousycg()
   { 	    
  	        
      return this.shifousycg;     	
   }
 	 	 private Long wuliaobm;
	 public void setWuliaobm(Long wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public Long getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
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
 	 	 private Double yangpinsl;
	 public void setYangpinsl(Double yangpinsl)
	 {
		  this.yangpinsl = yangpinsl;
	 }
   public Double getYangpinsl()
   { 	    
  	        
      return this.yangpinsl;     	
   }
 	 	 private String yingyong;
	 public void setYingyong(String yingyong)
	 {
		  this.yingyong = yingyong;
	 }
   public String getYingyong()
   { 	    
  	        
      return this.yingyong;     	
   }
 	 	 private Date yujidhrq;
	 public void setYujidhrq(Date yujidhrq)
	 {
		  this.yujidhrq = yujidhrq;
	 }
   public Date getYujidhrq()
   { 	    
  	  	    if( this.yujidhrq != null )
	    {
	        return (Date)new ActizDate( this.yujidhrq.getTime() );
	    }
	          
      return this.yujidhrq;     	
   }
 	 	 private Double yujiyl;
	 public void setYujiyl(Double yujiyl)
	 {
		  this.yujiyl = yujiyl;
	 }
   public Double getYujiyl()
   { 	    
  	        
      return this.yujiyl;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg caigouyRef;
	 public void setCaigouyRef(com.actiz.platform.application.dataset.pojo.Atztdyg caigouyRef)
	 {
		  this.caigouyRef = caigouyRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getCaigouyRef()
   {
     	return this.caigouyRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigousy shenyangdbhRef;
	 public void setShenyangdbhRef(com.actiz.platform.application.dataset.pojo.Atzcaigousy shenyangdbhRef)
	 {
		  this.shenyangdbhRef = shenyangdbhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigousy getShenyangdbhRef()
   {
     	return this.shenyangdbhRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj shengchancjRef;
	 public void setShengchancjRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj shengchancjRef)
	 {
		  this.shengchancjRef = shengchancjRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getShengchancjRef()
   {
     	return this.shengchancjRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaobmRef;
	 public void setWuliaobmRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaobmRef)
	 {
		  this.wuliaobmRef = wuliaobmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaobmRef()
   {
     	return this.wuliaobmRef;
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