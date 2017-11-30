package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgudingzc implements Serializable,IPojo
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
	  	 	 private String bxq;
	 public void setBxq(String bxq)
	 {
		  this.bxq = bxq;
	 }
   public String getBxq()
   { 	    
  	        
      return this.bxq;     	
   }
 	 	 private String chuchangbh;
	 public void setChuchangbh(String chuchangbh)
	 {
		  this.chuchangbh = chuchangbh;
	 }
   public String getChuchangbh()
   { 	    
  	        
      return this.chuchangbh;     	
   }
 	 	 private String erp;
	 public void setErp(String erp)
	 {
		  this.erp = erp;
	 }
   public String getErp()
   { 	    
  	        
      return this.erp;     	
   }
 	 	 private String fangzhidd;
	 public void setFangzhidd(String fangzhidd)
	 {
		  this.fangzhidd = fangzhidd;
	 }
   public String getFangzhidd()
   { 	    
  	        
      return this.fangzhidd;     	
   }
 	 	 private String peizhi;
	 public void setPeizhi(String peizhi)
	 {
		  this.peizhi = peizhi;
	 }
   public String getPeizhi()
   { 	    
  	        
      return this.peizhi;     	
   }
 	 	 private String hetongh;
	 public void setHetongh(String hetongh)
	 {
		  this.hetongh = hetongh;
	 }
   public String getHetongh()
   { 	    
  	        
      return this.hetongh;     	
   }
 	 	 private Double jiliangfy;
	 public void setJiliangfy(Double jiliangfy)
	 {
		  this.jiliangfy = jiliangfy;
	 }
   public Double getJiliangfy()
   { 	    
  	        
      return this.jiliangfy;     	
   }
 	 	 private Long jlglzcid;
	 public void setJlglzcid(Long jlglzcid)
	 {
		  this.jlglzcid = jlglzcid;
	 }
   public Long getJlglzcid()
   { 	    
  	        
      return this.jlglzcid;     	
   }
 	 	 private String jiandingdw;
	 public void setJiandingdw(String jiandingdw)
	 {
		  this.jiandingdw = jiandingdw;
	 }
   public String getJiandingdw()
   { 	    
  	        
      return this.jiandingdw;     	
   }
 	 	 private Date jdriqi;
	 public void setJdriqi(Date jdriqi)
	 {
		  this.jdriqi = jdriqi;
	 }
   public Date getJdriqi()
   { 	    
  	  	    if( this.jdriqi != null )
	    {
	        return (Date)new ActizDate( this.jdriqi.getTime() );
	    }
	          
      return this.jdriqi;     	
   }
 	 	 private Double jiandingzq;
	 public void setJiandingzq(Double jiandingzq)
	 {
		  this.jiandingzq = jiandingzq;
	 }
   public Double getJiandingzq()
   { 	    
  	        
      return this.jiandingzq;     	
   }
 	 	 private Long shiyongbm;
	 public void setShiyongbm(Long shiyongbm)
	 {
		  this.shiyongbm = shiyongbm;
	 }
   public Long getShiyongbm()
   { 	    
  	        
      return this.shiyongbm;     	
   }
 	 	 private Long lingyongr;
	 public void setLingyongr(Long lingyongr)
	 {
		  this.lingyongr = lingyongr;
	 }
   public Long getLingyongr()
   { 	    
  	        
      return this.lingyongr;     	
   }
 	 	 private Date lingyongrq;
	 public void setLingyongrq(Date lingyongrq)
	 {
		  this.lingyongrq = lingyongrq;
	 }
   public Date getLingyongrq()
   { 	    
  	  	    if( this.lingyongrq != null )
	    {
	        return (Date)new ActizDate( this.lingyongrq.getTime() );
	    }
	          
      return this.lingyongrq;     	
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
 	 	 private String shebeibh;
	 public void setShebeibh(String shebeibh)
	 {
		  this.shebeibh = shebeibh;
	 }
   public String getShebeibh()
   { 	    
  	        
      return this.shebeibh;     	
   }
 	 	 private String shebeilb;
	 public void setShebeilb(String shebeilb)
	 {
		  this.shebeilb = shebeilb;
	 }
   public String getShebeilb()
   { 	    
  	        
      return this.shebeilb;     	
   }
 	 	 private String shebeimc;
	 public void setShebeimc(String shebeimc)
	 {
		  this.shebeimc = shebeimc;
	 }
   public String getShebeimc()
   { 	    
  	        
      return this.shebeimc;     	
   }
 	 	 private String shegnchancj;
	 public void setShegnchancj(String shegnchancj)
	 {
		  this.shegnchancj = shegnchancj;
	 }
   public String getShegnchancj()
   { 	    
  	        
      return this.shegnchancj;     	
   }
 	 	 private Date shijirksj;
	 public void setShijirksj(Date shijirksj)
	 {
		  this.shijirksj = shijirksj;
	 }
   public Date getShijirksj()
   { 	    
  	  	    if( this.shijirksj != null )
	    {
	        return (Date)new ActizDate( this.shijirksj.getTime() );
	    }
	          
      return this.shijirksj;     	
   }
 	 	 private String shiyongdw;
	 public void setShiyongdw(String shiyongdw)
	 {
		  this.shiyongdw = shiyongdw;
	 }
   public String getShiyongdw()
   { 	    
  	        
      return this.shiyongdw;     	
   }
 	 	 private String shifousc;
	 public void setShifousc(String shifousc)
	 {
		  this.shifousc = shifousc;
	 }
   public String getShifousc()
   { 	    
  	        
      return this.shifousc;     	
   }
 	 	 private String guige;
	 public void setGuige(String guige)
	 {
		  this.guige = guige;
	 }
   public String getGuige()
   { 	    
  	        
      return this.guige;     	
   }
 	 	 private String yongtu;
	 public void setYongtu(String yongtu)
	 {
		  this.yongtu = yongtu;
	 }
   public String getYongtu()
   { 	    
  	        
      return this.yongtu;     	
   }
 	 	 private Date youxiaoq;
	 public void setYouxiaoq(Date youxiaoq)
	 {
		  this.youxiaoq = youxiaoq;
	 }
   public Date getYouxiaoq()
   { 	    
  	  	    if( this.youxiaoq != null )
	    {
	        return (Date)new ActizDate( this.youxiaoq.getTime() );
	    }
	          
      return this.youxiaoq;     	
   }
 	 	 private String zhengshuh;
	 public void setZhengshuh(String zhengshuh)
	 {
		  this.zhengshuh = zhengshuh;
	 }
   public String getZhengshuh()
   { 	    
  	        
      return this.zhengshuh;     	
   }
 	 	 private String zichanlx;
	 public void setZichanlx(String zichanlx)
	 {
		  this.zichanlx = zichanlx;
	 }
   public String getZichanlx()
   { 	    
  	        
      return this.zichanlx;     	
   }
 	 	 private Double zichanyz;
	 public void setZichanyz(Double zichanyz)
	 {
		  this.zichanyz = zichanyz;
	 }
   public Double getZichanyz()
   { 	    
  	        
      return this.zichanyz;     	
   }
 	 	 private String zichanzt;
	 public void setZichanzt(String zichanzt)
	 {
		  this.zichanzt = zichanzt;
	 }
   public String getZichanzt()
   { 	    
  	        
      return this.zichanzt;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzgudingzc jlglzcidRef;
	 public void setJlglzcidRef(com.actiz.platform.application.dataset.pojo.Atzgudingzc jlglzcidRef)
	 {
		  this.jlglzcidRef = jlglzcidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgudingzc getJlglzcidRef()
   {
     	return this.jlglzcidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment shiyongbmRef;
	 public void setShiyongbmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment shiyongbmRef)
	 {
		  this.shiyongbmRef = shiyongbmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getShiyongbmRef()
   {
     	return this.shiyongbmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lingyongrRef;
	 public void setLingyongrRef(com.actiz.platform.application.dataset.pojo.Atzemployee lingyongrRef)
	 {
		  this.lingyongrRef = lingyongrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLingyongrRef()
   {
     	return this.lingyongrRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
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