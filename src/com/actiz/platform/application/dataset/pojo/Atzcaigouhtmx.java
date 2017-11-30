package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigouhtmx implements Serializable,IPojo
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
	  	 	 private String banbenh;
	 public void setBanbenh(String banbenh)
	 {
		  this.banbenh = banbenh;
	 }
   public String getBanbenh()
   { 	    
  	        
      return this.banbenh;     	
   }
 	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
   }
 	 	 private String buliangpcl;
	 public void setBuliangpcl(String buliangpcl)
	 {
		  this.buliangpcl = buliangpcl;
	 }
   public String getBuliangpcl()
   { 	    
  	        
      return this.buliangpcl;     	
   }
 	 	 private Long caigouhtid;
	 public void setCaigouhtid(Long caigouhtid)
	 {
		  this.caigouhtid = caigouhtid;
	 }
   public Long getCaigouhtid()
   { 	    
  	        
      return this.caigouhtid;     	
   }
 	 	 private String caigoujhbh;
	 public void setCaigoujhbh(String caigoujhbh)
	 {
		  this.caigoujhbh = caigoujhbh;
	 }
   public String getCaigoujhbh()
   { 	    
  	        
      return this.caigoujhbh;     	
   }
 	 	 private Long caigoujhmxid;
	 public void setCaigoujhmxid(Long caigoujhmxid)
	 {
		  this.caigoujhmxid = caigoujhmxid;
	 }
   public Long getCaigoujhmxid()
   { 	    
  	        
      return this.caigoujhmxid;     	
   }
 	 	 private String zhibaoq;
	 public void setZhibaoq(String zhibaoq)
	 {
		  this.zhibaoq = zhibaoq;
	 }
   public String getZhibaoq()
   { 	    
  	        
      return this.zhibaoq;     	
   }
 	 	 private Long changshang;
	 public void setChangshang(Long changshang)
	 {
		  this.changshang = changshang;
	 }
   public Long getChangshang()
   { 	    
  	        
      return this.changshang;     	
   }
 	 	 private String changshangxh;
	 public void setChangshangxh(String changshangxh)
	 {
		  this.changshangxh = changshangxh;
	 }
   public String getChangshangxh()
   { 	    
  	        
      return this.changshangxh;     	
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
 	 	 private Double dinggousl;
	 public void setDinggousl(Double dinggousl)
	 {
		  this.dinggousl = dinggousl;
	 }
   public Double getDinggousl()
   { 	    
  	        
      return this.dinggousl;     	
   }
 	 	 private Double gongchengk;
	 public void setGongchengk(Double gongchengk)
	 {
		  this.gongchengk = gongchengk;
	 }
   public Double getGongchengk()
   { 	    
  	        
      return this.gongchengk;     	
   }
 	 	 private Double hanshuidj;
	 public void setHanshuidj(Double hanshuidj)
	 {
		  this.hanshuidj = hanshuidj;
	 }
   public Double getHanshuidj()
   { 	    
  	        
      return this.hanshuidj;     	
   }
 	 	 private Double hanshuizj;
	 public void setHanshuizj(Double hanshuizj)
	 {
		  this.hanshuizj = hanshuizj;
	 }
   public Double getHanshuizj()
   { 	    
  	        
      return this.hanshuizj;     	
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
 	 	 private Double shangqidj;
	 public void setShangqidj(Double shangqidj)
	 {
		  this.shangqidj = shangqidj;
	 }
   public Double getShangqidj()
   { 	    
  	        
      return this.shangqidj;     	
   }
 	 	 private String shengchancs;
	 public void setShengchancs(String shengchancs)
	 {
		  this.shengchancs = shengchancs;
	 }
   public String getShengchancs()
   { 	    
  	        
      return this.shengchancs;     	
   }
 	 	 private String bjxz;
	 public void setBjxz(String bjxz)
	 {
		  this.bjxz = bjxz;
	 }
   public String getBjxz()
   { 	    
  	        
      return this.bjxz;     	
   }
 	 	 private String shifoudh;
	 public void setShifoudh(String shifoudh)
	 {
		  this.shifoudh = shifoudh;
	 }
   public String getShifoudh()
   { 	    
  	        
      return this.shifoudh;     	
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
 	 	 private String tuhao;
	 public void setTuhao(String tuhao)
	 {
		  this.tuhao = tuhao;
	 }
   public String getTuhao()
   { 	    
  	        
      return this.tuhao;     	
   }
 	 	 private Double weidaohsl;
	 public void setWeidaohsl(Double weidaohsl)
	 {
		  this.weidaohsl = weidaohsl;
	 }
   public Double getWeidaohsl()
   { 	    
  	        
      return this.weidaohsl;     	
   }
 	 	 private Double weihsdj;
	 public void setWeihsdj(Double weihsdj)
	 {
		  this.weihsdj = weihsdj;
	 }
   public Double getWeihsdj()
   { 	    
  	        
      return this.weihsdj;     	
   }
 	 	 private Double weirksl;
	 public void setWeirksl(Double weirksl)
	 {
		  this.weirksl = weirksl;
	 }
   public Double getWeirksl()
   { 	    
  	        
      return this.weirksl;     	
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
 	 	 private Long xiangmu;
	 public void setXiangmu(Long xiangmu)
	 {
		  this.xiangmu = xiangmu;
	 }
   public Long getXiangmu()
   { 	    
  	        
      return this.xiangmu;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef;
	 public void setBizhongidRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef)
	 {
		  this.bizhongidRef = bizhongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongidRef()
   {
     	return this.bizhongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef;
	 public void setCaigouhtidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouht caigouhtidRef)
	 {
		  this.caigouhtidRef = caigouhtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouht getCaigouhtidRef()
   {
     	return this.caigouhtidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx caigoujhmxidRef;
	 public void setCaigoujhmxidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx caigoujhmxidRef)
	 {
		  this.caigoujhmxidRef = caigoujhmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx getCaigoujhmxidRef()
   {
     	return this.caigoujhmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj changshangRef;
	 public void setChangshangRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj changshangRef)
	 {
		  this.changshangRef = changshangRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getChangshangRef()
   {
     	return this.changshangRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuRef;
	 public void setXiangmuRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuRef)
	 {
		  this.xiangmuRef = xiangmuRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuRef()
   {
     	return this.xiangmuRef;
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