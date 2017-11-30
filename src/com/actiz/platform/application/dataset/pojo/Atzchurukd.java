package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukd implements Serializable,IPojo
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
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
 	 	 private Long churukjhdid;
	 public void setChurukjhdid(Long churukjhdid)
	 {
		  this.churukjhdid = churukjhdid;
	 }
   public Long getChurukjhdid()
   { 	    
  	        
      return this.churukjhdid;     	
   }
 	 	 private String churuknr;
	 public void setChuruknr(String churuknr)
	 {
		  this.churuknr = churuknr;
	 }
   public String getChuruknr()
   { 	    
  	        
      return this.churuknr;     	
   }
 	 	 private String churukr;
	 public void setChurukr(String churukr)
	 {
		  this.churukr = churukr;
	 }
   public String getChurukr()
   { 	    
  	        
      return this.churukr;     	
   }
 	 	 private Date churukrq;
	 public void setChurukrq(Date churukrq)
	 {
		  this.churukrq = churukrq;
	 }
   public Date getChurukrq()
   { 	    
  	  	    if( this.churukrq != null )
	    {
	        return (Date)new ActizDate( this.churukrq.getTime() );
	    }
	          
      return this.churukrq;     	
   }
 	 	 private String churukyy;
	 public void setChurukyy(String churukyy)
	 {
		  this.churukyy = churukyy;
	 }
   public String getChurukyy()
   { 	    
  	        
      return this.churukyy;     	
   }
 	 	 private String danjulx;
	 public void setDanjulx(String danjulx)
	 {
		  this.danjulx = danjulx;
	 }
   public String getDanjulx()
   { 	    
  	        
      return this.danjulx;     	
   }
 	 	 private String jgrwdh;
	 public void setJgrwdh(String jgrwdh)
	 {
		  this.jgrwdh = jgrwdh;
	 }
   public String getJgrwdh()
   { 	    
  	        
      return this.jgrwdh;     	
   }
 	 	 private Long diaobodid;
	 public void setDiaobodid(Long diaobodid)
	 {
		  this.diaobodid = diaobodid;
	 }
   public Long getDiaobodid()
   { 	    
  	        
      return this.diaobodid;     	
   }
 	 	 private Long jianyandid;
	 public void setJianyandid(Long jianyandid)
	 {
		  this.jianyandid = jianyandid;
	 }
   public Long getJianyandid()
   { 	    
  	        
      return this.jianyandid;     	
   }
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
   }
 	 	 private String renwuzt;
	 public void setRenwuzt(String renwuzt)
	 {
		  this.renwuzt = renwuzt;
	 }
   public String getRenwuzt()
   { 	    
  	        
      return this.renwuzt;     	
   }
 	 	 private String shifouysh;
	 public void setShifouysh(String shifouysh)
	 {
		  this.shifouysh = shifouysh;
	 }
   public String getShifouysh()
   { 	    
  	        
      return this.shifouysh;     	
   }
 	 	 private String shifouzx;
	 public void setShifouzx(String shifouzx)
	 {
		  this.shifouzx = shifouzx;
	 }
   public String getShifouzx()
   { 	    
  	        
      return this.shifouzx;     	
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
 	 	 private String zhixingf;
	 public void setZhixingf(String zhixingf)
	 {
		  this.zhixingf = zhixingf;
	 }
   public String getZhixingf()
   { 	    
  	        
      return this.zhixingf;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef;
	 public void setChurukjhdidRef(com.actiz.platform.application.dataset.pojo.Atzchurukjhd churukjhdidRef)
	 {
		  this.churukjhdidRef = churukjhdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukjhd getChurukjhdidRef()
   {
     	return this.churukjhdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdiaobod diaobodidRef;
	 public void setDiaobodidRef(com.actiz.platform.application.dataset.pojo.Atzdiaobod diaobodidRef)
	 {
		  this.diaobodidRef = diaobodidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdiaobod getDiaobodidRef()
   {
     	return this.diaobodidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzjianyand jianyandidRef;
	 public void setJianyandidRef(com.actiz.platform.application.dataset.pojo.Atzjianyand jianyandidRef)
	 {
		  this.jianyandidRef = jianyandidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjianyand getJianyandidRef()
   {
     	return this.jianyandidRef;
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
  
	private java.util.Set atzchurukdmxSet;
	public void setAtzchurukdmxSet(java.util.Set atzchurukdmxSet)
	{
		 this.atzchurukdmxSet = atzchurukdmxSet;
	}
  public java.util.Set getAtzchurukdmxSet()
  {
     return this.atzchurukdmxSet;
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