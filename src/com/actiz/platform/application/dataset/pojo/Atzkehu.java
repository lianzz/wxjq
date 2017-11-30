package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehu implements Serializable,IPojo
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
	  	 	 private Long bizhong;
	 public void setBizhong(Long bizhong)
	 {
		  this.bizhong = bizhong;
	 }
   public Long getBizhong()
   { 	    
  	        
      return this.bizhong;     	
   }
 	 	 private String chuanzhen;
	 public void setChuanzhen(String chuanzhen)
	 {
		  this.chuanzhen = chuanzhen;
	 }
   public String getChuanzhen()
   { 	    
  	        
      return this.chuanzhen;     	
   }
 	 	 private String dianhua;
	 public void setDianhua(String dianhua)
	 {
		  this.dianhua = dianhua;
	 }
   public String getDianhua()
   { 	    
  	        
      return this.dianhua;     	
   }
 	 	 private String email;
	 public void setEmail(String email)
	 {
		  this.email = email;
	 }
   public String getEmail()
   { 	    
  	        
      return this.email;     	
   }
 	 	 private String fadingdbr;
	 public void setFadingdbr(String fadingdbr)
	 {
		  this.fadingdbr = fadingdbr;
	 }
   public String getFadingdbr()
   { 	    
  	        
      return this.fadingdbr;     	
   }
 	 	 private String kaihuyh;
	 public void setKaihuyh(String kaihuyh)
	 {
		  this.kaihuyh = kaihuyh;
	 }
   public String getKaihuyh()
   { 	    
  	        
      return this.kaihuyh;     	
   }
 	 	 private Date kaishihzsj;
	 public void setKaishihzsj(Date kaishihzsj)
	 {
		  this.kaishihzsj = kaishihzsj;
	 }
   public Date getKaishihzsj()
   { 	    
  	  	    if( this.kaishihzsj != null )
	    {
	        return (Date)new ActizDate( this.kaishihzsj.getTime() );
	    }
	          
      return this.kaishihzsj;     	
   }
 	 	 private String kehujd;
	 public void setKehujd(String kehujd)
	 {
		  this.kehujd = kehujd;
	 }
   public String getKehujd()
   { 	    
  	        
      return this.kehujd;     	
   }
 	 	 private String kehulx;
	 public void setKehulx(String kehulx)
	 {
		  this.kehulx = kehulx;
	 }
   public String getKehulx()
   { 	    
  	        
      return this.kehulx;     	
   }
 	 	 private String kehumc;
	 public void setKehumc(String kehumc)
	 {
		  this.kehumc = kehumc;
	 }
   public String getKehumc()
   { 	    
  	        
      return this.kehumc;     	
   }
 	 	 private String kehuzyx;
	 public void setKehuzyx(String kehuzyx)
	 {
		  this.kehuzyx = kehuzyx;
	 }
   public String getKehuzyx()
   { 	    
  	        
      return this.kehuzyx;     	
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
 	 	 private String mingchengjj;
	 public void setMingchengjj(String mingchengjj)
	 {
		  this.mingchengjj = mingchengjj;
	 }
   public String getMingchengjj()
   { 	    
  	        
      return this.mingchengjj;     	
   }
 	 	 private String shifoudl;
	 public void setShifoudl(String shifoudl)
	 {
		  this.shifoudl = shifoudl;
	 }
   public String getShifoudl()
   { 	    
  	        
      return this.shifoudl;     	
   }
 	 	 private String shuiwudjh;
	 public void setShuiwudjh(String shuiwudjh)
	 {
		  this.shuiwudjh = shuiwudjh;
	 }
   public String getShuiwudjh()
   { 	    
  	        
      return this.shuiwudjh;     	
   }
 	 	 private String yunyings;
	 public void setYunyings(String yunyings)
	 {
		  this.yunyings = yunyings;
	 }
   public String getYunyings()
   { 	    
  	        
      return this.yunyings;     	
   }
 	 	 private String tongxundz;
	 public void setTongxundz(String tongxundz)
	 {
		  this.tongxundz = tongxundz;
	 }
   public String getTongxundz()
   { 	    
  	        
      return this.tongxundz;     	
   }
 	 	 private Long xiaoshoujl;
	 public void setXiaoshoujl(Long xiaoshoujl)
	 {
		  this.xiaoshoujl = xiaoshoujl;
	 }
   public Long getXiaoshoujl()
   { 	    
  	        
      return this.xiaoshoujl;     	
   }
 	 	 private Double xinyonged;
	 public void setXinyonged(Double xinyonged)
	 {
		  this.xinyonged = xinyonged;
	 }
   public Double getXinyonged()
   { 	    
  	        
      return this.xinyonged;     	
   }
 	 	 private String yinhangzh;
	 public void setYinhangzh(String yinhangzh)
	 {
		  this.yinhangzh = yinhangzh;
	 }
   public String getYinhangzh()
   { 	    
  	        
      return this.yinhangzh;     	
   }
 	 	 private Date shixiaorq;
	 public void setShixiaorq(Date shixiaorq)
	 {
		  this.shixiaorq = shixiaorq;
	 }
   public Date getShixiaorq()
   { 	    
  	  	    if( this.shixiaorq != null )
	    {
	        return (Date)new ActizDate( this.shixiaorq.getTime() );
	    }
	          
      return this.shixiaorq;     	
   }
 	 	 private String youbian;
	 public void setYoubian(String youbian)
	 {
		  this.youbian = youbian;
	 }
   public String getYoubian()
   { 	    
  	        
      return this.youbian;     	
   }
 	 	 private String zhuceh;
	 public void setZhuceh(String zhuceh)
	 {
		  this.zhuceh = zhuceh;
	 }
   public String getZhuceh()
   { 	    
  	        
      return this.zhuceh;     	
   }
 	 	 private Double zhucezj;
	 public void setZhucezj(Double zhucezj)
	 {
		  this.zhucezj = zhucezj;
	 }
   public Double getZhucezj()
   { 	    
  	        
      return this.zhucezj;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongRef;
	 public void setBizhongRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongRef)
	 {
		  this.bizhongRef = bizhongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongRef()
   {
     	return this.bizhongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef;
	 public void setXiaoshoujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef)
	 {
		  this.xiaoshoujlRef = xiaoshoujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXiaoshoujlRef()
   {
     	return this.xiaoshoujlRef;
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