package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztoubaod implements Serializable,IPojo
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
	  	 	 private Double baoxianje;
	 public void setBaoxianje(Double baoxianje)
	 {
		  this.baoxianje = baoxianje;
	 }
   public Double getBaoxianje()
   { 	    
  	        
      return this.baoxianje;     	
   }
 	 	 private String daohuodz;
	 public void setDaohuodz(String daohuodz)
	 {
		  this.daohuodz = daohuodz;
	 }
   public String getDaohuodz()
   { 	    
  	        
      return this.daohuodz;     	
   }
 	 	 private Long fahuotzdid;
	 public void setFahuotzdid(Long fahuotzdid)
	 {
		  this.fahuotzdid = fahuotzdid;
	 }
   public Long getFahuotzdid()
   { 	    
  	        
      return this.fahuotzdid;     	
   }
 	 	 private String huoyungs;
	 public void setHuoyungs(String huoyungs)
	 {
		  this.huoyungs = huoyungs;
	 }
   public String getHuoyungs()
   { 	    
  	        
      return this.huoyungs;     	
   }
 	 	 private Date qiyunrq;
	 public void setQiyunrq(Date qiyunrq)
	 {
		  this.qiyunrq = qiyunrq;
	 }
   public Date getQiyunrq()
   { 	    
  	  	    if( this.qiyunrq != null )
	    {
	        return (Date)new ActizDate( this.qiyunrq.getTime() );
	    }
	          
      return this.qiyunrq;     	
   }
 	 	 private String tidanh;
	 public void setTidanh(String tidanh)
	 {
		  this.tidanh = tidanh;
	 }
   public String getTidanh()
   { 	    
  	        
      return this.tidanh;     	
   }
 	 	 private Long weibaosqdid;
	 public void setWeibaosqdid(Long weibaosqdid)
	 {
		  this.weibaosqdid = weibaosqdid;
	 }
   public Long getWeibaosqdid()
   { 	    
  	        
      return this.weibaosqdid;     	
   }
 	 	 private String yunshufs;
	 public void setYunshufs(String yunshufs)
	 {
		  this.yunshufs = yunshufs;
	 }
   public String getYunshufs()
   { 	    
  	        
      return this.yunshufs;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef;
	 public void setFahuotzdidRef(com.actiz.platform.application.dataset.pojo.Atzfahuotzd fahuotzdidRef)
	 {
		  this.fahuotzdidRef = fahuotzdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfahuotzd getFahuotzdidRef()
   {
     	return this.fahuotzdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosqdidRef;
	 public void setWeibaosqdidRef(com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd weibaosqdidRef)
	 {
		  this.weibaosqdidRef = weibaosqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd getWeibaosqdidRef()
   {
     	return this.weibaosqdidRef;
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