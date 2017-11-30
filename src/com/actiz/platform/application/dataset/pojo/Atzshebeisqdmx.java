package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeisqdmx implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
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
 	 	 private String guzhangxx;
	 public void setGuzhangxx(String guzhangxx)
	 {
		  this.guzhangxx = guzhangxx;
	 }
   public String getGuzhangxx()
   { 	    
  	        
      return this.guzhangxx;     	
   }
 	 	 private Date huichangsj;
	 public void setHuichangsj(Date huichangsj)
	 {
		  this.huichangsj = huichangsj;
	 }
   public Date getHuichangsj()
   { 	    
  	  	    if( this.huichangsj != null )
	    {
	        return (Date)new ActizDate( this.huichangsj.getTime() );
	    }
	          
      return this.huichangsj;     	
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
 	 	 private String shebeilx;
	 public void setShebeilx(String shebeilx)
	 {
		  this.shebeilx = shebeilx;
	 }
   public String getShebeilx()
   { 	    
  	        
      return this.shebeilx;     	
   }
 	 	 private String shifoucb;
	 public void setShifoucb(String shifoucb)
	 {
		  this.shifoucb = shifoucb;
	 }
   public String getShifoucb()
   { 	    
  	        
      return this.shifoucb;     	
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
 	 	 private String snhao;
	 public void setSnhao(String snhao)
	 {
		  this.snhao = snhao;
	 }
   public String getSnhao()
   { 	    
  	        
      return this.snhao;     	
   }
 	 	 private Long weibaosbsqdi;
	 public void setWeibaosbsqdi(Long weibaosbsqdi)
	 {
		  this.weibaosbsqdi = weibaosbsqdi;
	 }
   public Long getWeibaosbsqdi()
   { 	    
  	        
      return this.weibaosbsqdi;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosbsqdiRef;
	 public void setWeibaosbsqdiRef(com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosbsqdiRef)
	 {
		  this.weibaosbsqdiRef = weibaosbsqdiRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd getWeibaosbsqdiRef()
   {
     	return this.weibaosbsqdiRef;
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