package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyewuzc implements Serializable,IPojo
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
	  	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private String chanpinlx;
	 public void setChanpinlx(String chanpinlx)
	 {
		  this.chanpinlx = chanpinlx;
	 }
   public String getChanpinlx()
   { 	    
  	        
      return this.chanpinlx;     	
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
 	 	 private String gongzuol;
	 public void setGongzuol(String gongzuol)
	 {
		  this.gongzuol = gongzuol;
	 }
   public String getGongzuol()
   { 	    
  	        
      return this.gongzuol;     	
   }
 	 	 private String guanbir;
	 public void setGuanbir(String guanbir)
	 {
		  this.guanbir = guanbir;
	 }
   public String getGuanbir()
   { 	    
  	        
      return this.guanbir;     	
   }
 	 	 private Date guanbirq;
	 public void setGuanbirq(Date guanbirq)
	 {
		  this.guanbirq = guanbirq;
	 }
   public Date getGuanbirq()
   { 	    
  	  	    if( this.guanbirq != null )
	    {
	        return (Date)new ActizDate( this.guanbirq.getTime() );
	    }
	          
      return this.guanbirq;     	
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
 	 	 private String jianyaoneir;
	 public void setJianyaoneir(String jianyaoneir)
	 {
		  this.jianyaoneir = jianyaoneir;
	 }
   public String getJianyaoneir()
   { 	    
  	        
      return this.jianyaoneir;     	
   }
 	 	 private String jincheng;
	 public void setJincheng(String jincheng)
	 {
		  this.jincheng = jincheng;
	 }
   public String getJincheng()
   { 	    
  	        
      return this.jincheng;     	
   }
 	 	 private Long kehu;
	 public void setKehu(Long kehu)
	 {
		  this.kehu = kehu;
	 }
   public Long getKehu()
   { 	    
  	        
      return this.kehu;     	
   }
 	 	 private String lianxifs;
	 public void setLianxifs(String lianxifs)
	 {
		  this.lianxifs = lianxifs;
	 }
   public String getLianxifs()
   { 	    
  	        
      return this.lianxifs;     	
   }
 	 	 private String lianxir;
	 public void setLianxir(String lianxir)
	 {
		  this.lianxir = lianxir;
	 }
   public String getLianxir()
   { 	    
  	        
      return this.lianxir;     	
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
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
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
 	 	 private String manyid;
	 public void setManyid(String manyid)
	 {
		  this.manyid = manyid;
	 }
   public String getManyid()
   { 	    
  	        
      return this.manyid;     	
   }
 	 	 private Long shenqingr;
	 public void setShenqingr(Long shenqingr)
	 {
		  this.shenqingr = shenqingr;
	 }
   public Long getShenqingr()
   { 	    
  	        
      return this.shenqingr;     	
   }
 	 	 private Date shijianyq;
	 public void setShijianyq(Date shijianyq)
	 {
		  this.shijianyq = shijianyq;
	 }
   public Date getShijianyq()
   { 	    
  	  	    if( this.shijianyq != null )
	    {
	        return (Date)new ActizDate( this.shijianyq.getTime() );
	    }
	          
      return this.shijianyq;     	
   }
 	 	 private String shifougb;
	 public void setShifougb(String shifougb)
	 {
		  this.shifougb = shifougb;
	 }
   public String getShifougb()
   { 	    
  	        
      return this.shifougb;     	
   }
 	 	 private String suoshuhy;
	 public void setSuoshuhy(String suoshuhy)
	 {
		  this.suoshuhy = suoshuhy;
	 }
   public String getSuoshuhy()
   { 	    
  	        
      return this.suoshuhy;     	
   }
 	 	 private String gongzuocg;
	 public void setGongzuocg(String gongzuocg)
	 {
		  this.gongzuocg = gongzuocg;
	 }
   public String getGongzuocg()
   { 	    
  	        
      return this.gongzuocg;     	
   }
 	 	 private String xmmingcheng;
	 public void setXmmingcheng(String xmmingcheng)
	 {
		  this.xmmingcheng = xmmingcheng;
	 }
   public String getXmmingcheng()
   { 	    
  	        
      return this.xmmingcheng;     	
   }
 	 	 private Long xiangmumc;
	 public void setXiangmumc(Long xiangmumc)
	 {
		  this.xiangmumc = xiangmumc;
	 }
   public Long getXiangmumc()
   { 	    
  	        
      return this.xiangmumc;     	
   }
 	 	 private Long yaoqiuzcbm;
	 public void setYaoqiuzcbm(Long yaoqiuzcbm)
	 {
		  this.yaoqiuzcbm = yaoqiuzcbm;
	 }
   public Long getYaoqiuzcbm()
   { 	    
  	        
      return this.yaoqiuzcbm;     	
   }
 	 	 private String yaoqiucl;
	 public void setYaoqiucl(String yaoqiucl)
	 {
		  this.yaoqiucl = yaoqiucl;
	 }
   public String getYaoqiucl()
   { 	    
  	        
      return this.yaoqiucl;     	
   }
 	 	 private Date yaoqisj;
	 public void setYaoqisj(Date yaoqisj)
	 {
		  this.yaoqisj = yaoqisj;
	 }
   public Date getYaoqisj()
   { 	    
  	  	    if( this.yaoqisj != null )
	    {
	        return (Date)new ActizDate( this.yaoqisj.getTime() );
	    }
	          
      return this.yaoqisj;     	
   }
 	 	 private Double zongrt;
	 public void setZongrt(Double zongrt)
	 {
		  this.zongrt = zongrt;
	 }
   public Double getZongrt()
   { 	    
  	        
      return this.zongrt;     	
   }
 	 	 private String ywzt;
	 public void setYwzt(String ywzt)
	 {
		  this.ywzt = ywzt;
	 }
   public String getYwzt()
   { 	    
  	        
      return this.ywzt;     	
   }
 	 	 private String yijian;
	 public void setYijian(String yijian)
	 {
		  this.yijian = yijian;
	 }
   public String getYijian()
   { 	    
  	        
      return this.yijian;     	
   }
 	 	 private String zcbmfk;
	 public void setZcbmfk(String zcbmfk)
	 {
		  this.zcbmfk = zcbmfk;
	 }
   public String getZcbmfk()
   { 	    
  	        
      return this.zcbmfk;     	
   }
 	 	 private String yewuzclx;
	 public void setYewuzclx(String yewuzclx)
	 {
		  this.yewuzclx = yewuzclx;
	 }
   public String getYewuzclx()
   { 	    
  	        
      return this.yewuzclx;     	
   }
 	 	 private String zhichinr;
	 public void setZhichinr(String zhichinr)
	 {
		  this.zhichinr = zhichinr;
	 }
   public String getZhichinr()
   { 	    
  	        
      return this.zhichinr;     	
   }
 	 	 private Long zdywzcry;
	 public void setZdywzcry(Long zdywzcry)
	 {
		  this.zdywzcry = zdywzcry;
	 }
   public Long getZdywzcry()
   { 	    
  	        
      return this.zdywzcry;     	
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
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuRef;
	 public void setKehuRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuRef)
	 {
		  this.kehuRef = kehuRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuRef()
   {
     	return this.kehuRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee shenqingrRef;
	 public void setShenqingrRef(com.actiz.platform.application.dataset.pojo.Atzemployee shenqingrRef)
	 {
		  this.shenqingrRef = shenqingrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getShenqingrRef()
   {
     	return this.shenqingrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiangmumcRef;
	 public void setXiangmumcRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiangmumcRef)
	 {
		  this.xiangmumcRef = xiangmumcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiangmumcRef()
   {
     	return this.xiangmumcRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment yaoqiuzcbmRef;
	 public void setYaoqiuzcbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment yaoqiuzcbmRef)
	 {
		  this.yaoqiuzcbmRef = yaoqiuzcbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getYaoqiuzcbmRef()
   {
     	return this.yaoqiuzcbmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zdywzcryRef;
	 public void setZdywzcryRef(com.actiz.platform.application.dataset.pojo.Atzemployee zdywzcryRef)
	 {
		  this.zdywzcryRef = zdywzcryRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZdywzcryRef()
   {
     	return this.zdywzcryRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzzhixinggcgzSet;
	public void setAtzzhixinggcgzSet(java.util.Set atzzhixinggcgzSet)
	{
		 this.atzzhixinggcgzSet = atzzhixinggcgzSet;
	}
  public java.util.Set getAtzzhixinggcgzSet()
  {
     return this.atzzhixinggcgzSet;
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