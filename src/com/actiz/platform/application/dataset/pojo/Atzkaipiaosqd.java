package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkaipiaosqd implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
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
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
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
 	 	 private Date kaipiaorq;
	 public void setKaipiaorq(Date kaipiaorq)
	 {
		  this.kaipiaorq = kaipiaorq;
	 }
   public Date getKaipiaorq()
   { 	    
  	  	    if( this.kaipiaorq != null )
	    {
	        return (Date)new ActizDate( this.kaipiaorq.getTime() );
	    }
	          
      return this.kaipiaorq;     	
   }
 	 	 private String yinghangzh;
	 public void setYinghangzh(String yinghangzh)
	 {
		  this.yinghangzh = yinghangzh;
	 }
   public String getYinghangzh()
   { 	    
  	        
      return this.yinghangzh;     	
   }
 	 	 private Long kehuyhzh;
	 public void setKehuyhzh(Long kehuyhzh)
	 {
		  this.kehuyhzh = kehuyhzh;
	 }
   public Long getKehuyhzh()
   { 	    
  	        
      return this.kehuyhzh;     	
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
 	 	 private String piaojulx;
	 public void setPiaojulx(String piaojulx)
	 {
		  this.piaojulx = piaojulx;
	 }
   public String getPiaojulx()
   { 	    
  	        
      return this.piaojulx;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
   }
 	 	 private String shenhezt;
	 public void setShenhezt(String shenhezt)
	 {
		  this.shenhezt = shenhezt;
	 }
   public String getShenhezt()
   { 	    
  	        
      return this.shenhezt;     	
   }
 	 	 private Double shuilv;
	 public void setShuilv(Double shuilv)
	 {
		  this.shuilv = shuilv;
	 }
   public Double getShuilv()
   { 	    
  	        
      return this.shuilv;     	
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
 	 	 private String wofangdwmc;
	 public void setWofangdwmc(String wofangdwmc)
	 {
		  this.wofangdwmc = wofangdwmc;
	 }
   public String getWofangdwmc()
   { 	    
  	        
      return this.wofangdwmc;     	
   }
 	 	 private String wofangdz;
	 public void setWofangdz(String wofangdz)
	 {
		  this.wofangdz = wofangdz;
	 }
   public String getWofangdz()
   { 	    
  	        
      return this.wofangdz;     	
   }
 	 	 private String wofangdh;
	 public void setWofangdh(String wofangdh)
	 {
		  this.wofangdh = wofangdh;
	 }
   public String getWofangdh()
   { 	    
  	        
      return this.wofangdh;     	
   }
 	 	 private String wofangkhyh;
	 public void setWofangkhyh(String wofangkhyh)
	 {
		  this.wofangkhyh = wofangkhyh;
	 }
   public String getWofangkhyh()
   { 	    
  	        
      return this.wofangkhyh;     	
   }
 	 	 private String wofangswdjh;
	 public void setWofangswdjh(String wofangswdjh)
	 {
		  this.wofangswdjh = wofangswdjh;
	 }
   public String getWofangswdjh()
   { 	    
  	        
      return this.wofangswdjh;     	
   }
 	 	 private String wofangyhzh;
	 public void setWofangyhzh(String wofangyhzh)
	 {
		  this.wofangyhzh = wofangyhzh;
	 }
   public String getWofangyhzh()
   { 	    
  	        
      return this.wofangyhzh;     	
   }
 	 	 private String zhixingzt;
	 public void setZhixingzt(String zhixingzt)
	 {
		  this.zhixingzt = zhixingzt;
	 }
   public String getZhixingzt()
   { 	    
  	        
      return this.zhixingzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkhyinhangzh kehuyhzhRef;
	 public void setKehuyhzhRef(com.actiz.platform.application.dataset.pojo.Atzkhyinhangzh kehuyhzhRef)
	 {
		  this.kehuyhzhRef = kehuyhzhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkhyinhangzh getKehuyhzhRef()
   {
     	return this.kehuyhzhRef;
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
  
	private java.util.Set atzkaipiaomxSet;
	public void setAtzkaipiaomxSet(java.util.Set atzkaipiaomxSet)
	{
		 this.atzkaipiaomxSet = atzkaipiaomxSet;
	}
  public java.util.Set getAtzkaipiaomxSet()
  {
     return this.atzkaipiaomxSet;
  }
 
	private java.util.Set atzkpsqshjlSet;
	public void setAtzkpsqshjlSet(java.util.Set atzkpsqshjlSet)
	{
		 this.atzkpsqshjlSet = atzkpsqshjlSet;
	}
  public java.util.Set getAtzkpsqshjlSet()
  {
     return this.atzkpsqshjlSet;
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