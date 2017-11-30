package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhuangxiangd implements Serializable,IPojo
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
 	 	 private Long churukid;
	 public void setChurukid(Long churukid)
	 {
		  this.churukid = churukid;
	 }
   public Long getChurukid()
   { 	    
  	        
      return this.churukid;     	
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
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
   }
 	 	 private String qingdianr;
	 public void setQingdianr(String qingdianr)
	 {
		  this.qingdianr = qingdianr;
	 }
   public String getQingdianr()
   { 	    
  	        
      return this.qingdianr;     	
   }
 	 	 private Date shengchanrq;
	 public void setShengchanrq(Date shengchanrq)
	 {
		  this.shengchanrq = shengchanrq;
	 }
   public Date getShengchanrq()
   { 	    
  	  	    if( this.shengchanrq != null )
	    {
	        return (Date)new ActizDate( this.shengchanrq.getTime() );
	    }
	          
      return this.shengchanrq;     	
   }
 	 	 private String shifoubf;
	 public void setShifoubf(String shifoubf)
	 {
		  this.shifoubf = shifoubf;
	 }
   public String getShifoubf()
   { 	    
  	        
      return this.shifoubf;     	
   }
 	 	 private Long wbsbsqdid;
	 public void setWbsbsqdid(Long wbsbsqdid)
	 {
		  this.wbsbsqdid = wbsbsqdid;
	 }
   public Long getWbsbsqdid()
   { 	    
  	        
      return this.wbsbsqdid;     	
   }
 	 	 private String xianghao;
	 public void setXianghao(String xianghao)
	 {
		  this.xianghao = xianghao;
	 }
   public String getXianghao()
   { 	    
  	        
      return this.xianghao;     	
   }
 	 	 private String xiangxing;
	 public void setXiangxing(String xiangxing)
	 {
		  this.xiangxing = xiangxing;
	 }
   public String getXiangxing()
   { 	    
  	        
      return this.xiangxing;     	
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
 	 	 private Long zxrid;
	 public void setZxrid(Long zxrid)
	 {
		  this.zxrid = zxrid;
	 }
   public Long getZxrid()
   { 	    
  	        
      return this.zxrid;     	
   }
 	 	 private String zhuangxiangr;
	 public void setZhuangxiangr(String zhuangxiangr)
	 {
		  this.zhuangxiangr = zhuangxiangr;
	 }
   public String getZhuangxiangr()
   { 	    
  	        
      return this.zhuangxiangr;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinidRef()
   {
     	return this.chanpinidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukd churukidRef;
	 public void setChurukidRef(com.actiz.platform.application.dataset.pojo.Atzchurukd churukidRef)
	 {
		  this.churukidRef = churukidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukd getChurukidRef()
   {
     	return this.churukidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd wbsbsqdidRef;
	 public void setWbsbsqdidRef(com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd wbsbsqdidRef)
	 {
		  this.wbsbsqdidRef = wbsbsqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweibaosbsqd getWbsbsqdidRef()
   {
     	return this.wbsbsqdidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zxridRef;
	 public void setZxridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zxridRef)
	 {
		  this.zxridRef = zxridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZxridRef()
   {
     	return this.zxridRef;
   }
  
	private java.util.Set atzzhuangxdanmxSet;
	public void setAtzzhuangxdanmxSet(java.util.Set atzzhuangxdanmxSet)
	{
		 this.atzzhuangxdanmxSet = atzzhuangxdanmxSet;
	}
  public java.util.Set getAtzzhuangxdanmxSet()
  {
     return this.atzzhuangxdanmxSet;
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