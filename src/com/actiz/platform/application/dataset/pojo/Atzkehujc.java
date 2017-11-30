package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehujc implements Serializable,IPojo
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
	  	 	 private Timestamp baifangsj;
	 public void setBaifangsj(Timestamp baifangsj)
	 {
		  this.baifangsj = baifangsj;
	 }
   public Timestamp getBaifangsj()
   { 	    
  	    	  if( this.baifangsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.baifangsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.baifangsj;     	
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
 	 	 private String houxuxdjh;
	 public void setHouxuxdjh(String houxuxdjh)
	 {
		  this.houxuxdjh = houxuxdjh;
	 }
   public String getHouxuxdjh()
   { 	    
  	        
      return this.houxuxdjh;     	
   }
 	 	 private Date jihuarq;
	 public void setJihuarq(Date jihuarq)
	 {
		  this.jihuarq = jihuarq;
	 }
   public Date getJihuarq()
   { 	    
  	  	    if( this.jihuarq != null )
	    {
	        return (Date)new ActizDate( this.jihuarq.getTime() );
	    }
	          
      return this.jihuarq;     	
   }
 	 	 private String jiechulx;
	 public void setJiechulx(String jiechulx)
	 {
		  this.jiechulx = jiechulx;
	 }
   public String getJiechulx()
   { 	    
  	        
      return this.jiechulx;     	
   }
 	 	 private String jiechumd;
	 public void setJiechumd(String jiechumd)
	 {
		  this.jiechumd = jiechumd;
	 }
   public String getJiechumd()
   { 	    
  	        
      return this.jiechumd;     	
   }
 	 	 private String jiechuyy;
	 public void setJiechuyy(String jiechuyy)
	 {
		  this.jiechuyy = jiechuyy;
	 }
   public String getJiechuyy()
   { 	    
  	        
      return this.jiechuyy;     	
   }
 	 	 private String jieguo;
	 public void setJieguo(String jieguo)
	 {
		  this.jieguo = jieguo;
	 }
   public String getJieguo()
   { 	    
  	        
      return this.jieguo;     	
   }
 	 	 private String kcbxqxy;
	 public void setKcbxqxy(String kcbxqxy)
	 {
		  this.kcbxqxy = kcbxqxy;
	 }
   public String getKcbxqxy()
   { 	    
  	        
      return this.kcbxqxy;     	
   }
 	 	 private String kenengza;
	 public void setKenengza(String kenengza)
	 {
		  this.kenengza = kenengza;
	 }
   public String getKenengza()
   { 	    
  	        
      return this.kenengza;     	
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
 	 	 private String lianluor;
	 public void setLianluor(String lianluor)
	 {
		  this.lianluor = lianluor;
	 }
   public String getLianluor()
   { 	    
  	        
      return this.lianluor;     	
   }
 	 	 private String liuchengshzt;
	 public void setLiuchengshzt(String liuchengshzt)
	 {
		  this.liuchengshzt = liuchengshzt;
	 }
   public String getLiuchengshzt()
   { 	    
  	        
      return this.liuchengshzt;     	
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
 	 	 private String qudecn;
	 public void setQudecn(String qudecn)
	 {
		  this.qudecn = qudecn;
	 }
   public String getQudecn()
   { 	    
  	        
      return this.qudecn;     	
   }
 	 	 private String qudexx;
	 public void setQudexx(String qudexx)
	 {
		  this.qudexx = qudexx;
	 }
   public String getQudexx()
   { 	    
  	        
      return this.qudexx;     	
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
 	 	 private String tigongxx;
	 public void setTigongxx(String tigongxx)
	 {
		  this.tigongxx = tigongxx;
	 }
   public String getTigongxx()
   { 	    
  	        
      return this.tigongxx;     	
   }
 	 	 private String xiaciff;
	 public void setXiaciff(String xiaciff)
	 {
		  this.xiaciff = xiaciff;
	 }
   public String getXiaciff()
   { 	    
  	        
      return this.xiaciff;     	
   }
 	 	 private Date xiacijhsj;
	 public void setXiacijhsj(Date xiacijhsj)
	 {
		  this.xiacijhsj = xiacijhsj;
	 }
   public Date getXiacijhsj()
   { 	    
  	  	    if( this.xiacijhsj != null )
	    {
	        return (Date)new ActizDate( this.xiacijhsj.getTime() );
	    }
	          
      return this.xiacijhsj;     	
   }
 	 	 private String xiacijc;
	 public void setXiacijc(String xiacijc)
	 {
		  this.xiacijc = xiacijc;
	 }
   public String getXiacijc()
   { 	    
  	        
      return this.xiacijc;     	
   }
 	 	 private String xiacimd;
	 public void setXiacimd(String xiacimd)
	 {
		  this.xiacimd = xiacimd;
	 }
   public String getXiacimd()
   { 	    
  	        
      return this.xiacimd;     	
   }
 	 	 private Long xiaoshoujhid;
	 public void setXiaoshoujhid(Long xiaoshoujhid)
	 {
		  this.xiaoshoujhid = xiaoshoujhid;
	 }
   public Long getXiaoshoujhid()
   { 	    
  	        
      return this.xiaoshoujhid;     	
   }
 	 	 private Double xiaoshoumb;
	 public void setXiaoshoumb(Double xiaoshoumb)
	 {
		  this.xiaoshoumb = xiaoshoumb;
	 }
   public Double getXiaoshoumb()
   { 	    
  	        
      return this.xiaoshoumb;     	
   }
 	 	 private String xinlaily;
	 public void setXinlaily(String xinlaily)
	 {
		  this.xinlaily = xinlaily;
	 }
   public String getXinlaily()
   { 	    
  	        
      return this.xinlaily;     	
   }
 	 	 private String yewury;
	 public void setYewury(String yewury)
	 {
		  this.yewury = yewury;
	 }
   public String getYewury()
   { 	    
  	        
      return this.yewury;     	
   }
 	 	 private String zhicheng;
	 public void setZhicheng(String zhicheng)
	 {
		  this.zhicheng = zhicheng;
	 }
   public String getZhicheng()
   { 	    
  	        
      return this.zhicheng;     	
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
 	 	 private String zongjiezy;
	 public void setZongjiezy(String zongjiezy)
	 {
		  this.zongjiezy = zongjiezy;
	 }
   public String getZongjiezy()
   { 	    
  	        
      return this.zongjiezy;     	
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
 	 	 private Double zuijia;
	 public void setZuijia(Double zuijia)
	 {
		  this.zuijia = zuijia;
	 }
   public Double getZuijia()
   { 	    
  	        
      return this.zuijia;     	
   }
 	 	 private Double zuixiao;
	 public void setZuixiao(Double zuixiao)
	 {
		  this.zuixiao = zuixiao;
	 }
   public Double getZuixiao()
   { 	    
  	        
      return this.zuixiao;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef;
	 public void setXiaoshoujhidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef)
	 {
		  this.xiaoshoujhidRef = xiaoshoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiaoshoujhidRef()
   {
     	return this.xiaoshoujhidRef;
   }
  
	private java.util.Set atzkehujcshjlSet;
	public void setAtzkehujcshjlSet(java.util.Set atzkehujcshjlSet)
	{
		 this.atzkehujcshjlSet = atzkehujcshjlSet;
	}
  public java.util.Set getAtzkehujcshjlSet()
  {
     return this.atzkehujcshjlSet;
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