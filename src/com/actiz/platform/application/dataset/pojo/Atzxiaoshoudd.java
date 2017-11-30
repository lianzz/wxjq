package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiaoshoudd implements Serializable,IPojo
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
	  	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private String cpfwkhbf;
	 public void setCpfwkhbf(String cpfwkhbf)
	 {
		  this.cpfwkhbf = cpfwkhbf;
	 }
   public String getCpfwkhbf()
   { 	    
  	        
      return this.cpfwkhbf;     	
   }
 	 	 private String cpfwnrbj;
	 public void setCpfwnrbj(String cpfwnrbj)
	 {
		  this.cpfwnrbj = cpfwnrbj;
	 }
   public String getCpfwnrbj()
   { 	    
  	        
      return this.cpfwnrbj;     	
   }
 	 	 private String chanpinfwtx;
	 public void setChanpinfwtx(String chanpinfwtx)
	 {
		  this.chanpinfwtx = chanpinfwtx;
	 }
   public String getChanpinfwtx()
   { 	    
  	        
      return this.chanpinfwtx;     	
   }
 	 	 private Long chanpinnid;
	 public void setChanpinnid(Long chanpinnid)
	 {
		  this.chanpinnid = chanpinnid;
	 }
   public Long getChanpinnid()
   { 	    
  	        
      return this.chanpinnid;     	
   }
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private String dingdanfj;
	 public void setDingdanfj(String dingdanfj)
	 {
		  this.dingdanfj = dingdanfj;
	 }
   public String getDingdanfj()
   { 	    
  	        
      return this.dingdanfj;     	
   }
 	 	 private Double hejije;
	 public void setHejije(Double hejije)
	 {
		  this.hejije = hejije;
	 }
   public Double getHejije()
   { 	    
  	        
      return this.hejije;     	
   }
 	 	 private Double hejiwbje;
	 public void setHejiwbje(Double hejiwbje)
	 {
		  this.hejiwbje = hejiwbje;
	 }
   public Double getHejiwbje()
   { 	    
  	        
      return this.hejiwbje;     	
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
 	 	 private String jiaofuyq;
	 public void setJiaofuyq(String jiaofuyq)
	 {
		  this.jiaofuyq = jiaofuyq;
	 }
   public String getJiaofuyq()
   { 	    
  	        
      return this.jiaofuyq;     	
   }
 	 	 private String jiaohuodd;
	 public void setJiaohuodd(String jiaohuodd)
	 {
		  this.jiaohuodd = jiaohuodd;
	 }
   public String getJiaohuodd()
   { 	    
  	        
      return this.jiaohuodd;     	
   }
 	 	 private Date jiaohuorq;
	 public void setJiaohuorq(Date jiaohuorq)
	 {
		  this.jiaohuorq = jiaohuorq;
	 }
   public Date getJiaohuorq()
   { 	    
  	  	    if( this.jiaohuorq != null )
	    {
	        return (Date)new ActizDate( this.jiaohuorq.getTime() );
	    }
	          
      return this.jiaohuorq;     	
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
 	 	 private String qita;
	 public void setQita(String qita)
	 {
		  this.qita = qita;
	 }
   public String getQita()
   { 	    
  	        
      return this.qita;     	
   }
 	 	 private Integer shebeisl;
	 public void setShebeisl(Integer shebeisl)
	 {
		  this.shebeisl = shebeisl;
	 }
   public Integer getShebeisl()
   { 	    
  	        
      return this.shebeisl;     	
   }
 	 	 private Long wubizl;
	 public void setWubizl(Long wubizl)
	 {
		  this.wubizl = wubizl;
	 }
   public Long getWubizl()
   { 	    
  	        
      return this.wubizl;     	
   }
 	 	 private String zongjiamx;
	 public void setZongjiamx(String zongjiamx)
	 {
		  this.zongjiamx = zongjiamx;
	 }
   public String getZongjiamx()
   { 	    
  	        
      return this.zongjiamx;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpin getChanpinidRef()
   {
     	return this.chanpinidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinnidRef;
	 public void setChanpinnidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinnidRef)
	 {
		  this.chanpinnidRef = chanpinnidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinnidRef()
   {
     	return this.chanpinnidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef;
	 public void setWubizlRef(com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef)
	 {
		  this.wubizlRef = wubizlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getWubizlRef()
   {
     	return this.wubizlRef;
   }
  
	private java.util.Set atzfukuantkSet;
	public void setAtzfukuantkSet(java.util.Set atzfukuantkSet)
	{
		 this.atzfukuantkSet = atzfukuantkSet;
	}
  public java.util.Set getAtzfukuantkSet()
  {
     return this.atzfukuantkSet;
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