package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhetonggz implements Serializable,IPojo
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
 	 	 private String hetongcplx;
	 public void setHetongcplx(String hetongcplx)
	 {
		  this.hetongcplx = hetongcplx;
	 }
   public String getHetongcplx()
   { 	    
  	        
      return this.hetongcplx;     	
   }
 	 	 private String dfqianshour;
	 public void setDfqianshour(String dfqianshour)
	 {
		  this.dfqianshour = dfqianshour;
	 }
   public String getDfqianshour()
   { 	    
  	        
      return this.dfqianshour;     	
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
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
   }
 	 	 private String genzonglx;
	 public void setGenzonglx(String genzonglx)
	 {
		  this.genzonglx = genzonglx;
	 }
   public String getGenzonglx()
   { 	    
  	        
      return this.genzonglx;     	
   }
 	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
   }
 	 	 private Date jihuasj;
	 public void setJihuasj(Date jihuasj)
	 {
		  this.jihuasj = jihuasj;
	 }
   public Date getJihuasj()
   { 	    
  	  	    if( this.jihuasj != null )
	    {
	        return (Date)new ActizDate( this.jihuasj.getTime() );
	    }
	          
      return this.jihuasj;     	
   }
 	 	 private Date wfqianshourq;
	 public void setWfqianshourq(Date wfqianshourq)
	 {
		  this.wfqianshourq = wfqianshourq;
	 }
   public Date getWfqianshourq()
   { 	    
  	  	    if( this.wfqianshourq != null )
	    {
	        return (Date)new ActizDate( this.wfqianshourq.getTime() );
	    }
	          
      return this.wfqianshourq;     	
   }
 	 	 private String wfqianshour;
	 public void setWfqianshour(String wfqianshour)
	 {
		  this.wfqianshour = wfqianshour;
	 }
   public String getWfqianshour()
   { 	    
  	        
      return this.wfqianshour;     	
   }
 	 	 private Long xitongid;
	 public void setXitongid(Long xitongid)
	 {
		  this.xitongid = xitongid;
	 }
   public Long getXitongid()
   { 	    
  	        
      return this.xitongid;     	
   }
 	 	 private Date shijisj;
	 public void setShijisj(Date shijisj)
	 {
		  this.shijisj = shijisj;
	 }
   public Date getShijisj()
   { 	    
  	  	    if( this.shijisj != null )
	    {
	        return (Date)new ActizDate( this.shijisj.getTime() );
	    }
	          
      return this.shijisj;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef;
	 public void setXitongidRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef)
	 {
		  this.xitongidRef = xitongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongidRef()
   {
     	return this.xitongidRef;
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