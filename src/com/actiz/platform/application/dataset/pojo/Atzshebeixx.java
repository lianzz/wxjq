package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshebeixx implements Serializable,IPojo
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
 	 	 private String botrombb;
	 public void setBotrombb(String botrombb)
	 {
		  this.botrombb = botrombb;
	 }
   public String getBotrombb()
   { 	    
  	        
      return this.botrombb;     	
   }
 	 	 private String cpldbb;
	 public void setCpldbb(String cpldbb)
	 {
		  this.cpldbb = cpldbb;
	 }
   public String getCpldbb()
   { 	    
  	        
      return this.cpldbb;     	
   }
 	 	 private String shifouzk;
	 public void setShifouzk(String shifouzk)
	 {
		  this.shifouzk = shifouzk;
	 }
   public String getShifouzk()
   { 	    
  	        
      return this.shifouzk;     	
   }
 	 	 private String fpgabb;
	 public void setFpgabb(String fpgabb)
	 {
		  this.fpgabb = fpgabb;
	 }
   public String getFpgabb()
   { 	    
  	        
      return this.fpgabb;     	
   }
 	 	 private String ipdz;
	 public void setIpdz(String ipdz)
	 {
		  this.ipdz = ipdz;
	 }
   public String getIpdz()
   { 	    
  	        
      return this.ipdz;     	
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
 	 	 private Long scphid;
	 public void setScphid(Long scphid)
	 {
		  this.scphid = scphid;
	 }
   public Long getScphid()
   { 	    
  	        
      return this.scphid;     	
   }
 	 	 private String shifouxycs;
	 public void setShifouxycs(String shifouxycs)
	 {
		  this.shifouxycs = shifouxycs;
	 }
   public String getShifouxycs()
   { 	    
  	        
      return this.shifouxycs;     	
   }
 	 	 private String shifouxylh;
	 public void setShifouxylh(String shifouxylh)
	 {
		  this.shifouxylh = shifouxylh;
	 }
   public String getShifouxylh()
   { 	    
  	        
      return this.shifouxylh;     	
   }
 	 	 private String shifouxywx;
	 public void setShifouxywx(String shifouxywx)
	 {
		  this.shifouxywx = shifouxywx;
	 }
   public String getShifouxywx()
   { 	    
  	        
      return this.shifouxywx;     	
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
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzscph scphidRef;
	 public void setScphidRef(com.actiz.platform.application.dataset.pojo.Atzscph scphidRef)
	 {
		  this.scphidRef = scphidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscph getScphidRef()
   {
     	return this.scphidRef;
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
  
	private java.util.Set atzshebeimaxdzSet;
	public void setAtzshebeimaxdzSet(java.util.Set atzshebeimaxdzSet)
	{
		 this.atzshebeimaxdzSet = atzshebeimaxdzSet;
	}
  public java.util.Set getAtzshebeimaxdzSet()
  {
     return this.atzshebeimaxdzSet;
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