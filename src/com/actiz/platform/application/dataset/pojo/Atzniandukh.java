package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzniandukh implements Serializable,IPojo
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
	  	 	 private String beikhrbh;
	 public void setBeikhrbh(String beikhrbh)
	 {
		  this.beikhrbh = beikhrbh;
	 }
   public String getBeikhrbh()
   { 	    
  	        
      return this.beikhrbh;     	
   }
 	 	 private Long beikhrxm;
	 public void setBeikhrxm(Long beikhrxm)
	 {
		  this.beikhrxm = beikhrxm;
	 }
   public Long getBeikhrxm()
   { 	    
  	        
      return this.beikhrxm;     	
   }
 	 	 private String beikhzxm;
	 public void setBeikhzxm(String beikhzxm)
	 {
		  this.beikhzxm = beikhzxm;
	 }
   public String getBeikhzxm()
   { 	    
  	        
      return this.beikhzxm;     	
   }
 	 	 private Date daozhisj;
	 public void setDaozhisj(Date daozhisj)
	 {
		  this.daozhisj = daozhisj;
	 }
   public Date getDaozhisj()
   { 	    
  	  	    if( this.daozhisj != null )
	    {
	        return (Date)new ActizDate( this.daozhisj.getTime() );
	    }
	          
      return this.daozhisj;     	
   }
 	 	 private String kaohergw;
	 public void setKaohergw(String kaohergw)
	 {
		  this.kaohergw = kaohergw;
	 }
   public String getKaohergw()
   { 	    
  	        
      return this.kaohergw;     	
   }
 	 	 private Long kaoherxm;
	 public void setKaoherxm(Long kaoherxm)
	 {
		  this.kaoherxm = kaoherxm;
	 }
   public Long getKaoherxm()
   { 	    
  	        
      return this.kaoherxm;     	
   }
 	 	 private String kaohezxm;
	 public void setKaohezxm(String kaohezxm)
	 {
		  this.kaohezxm = kaohezxm;
	 }
   public String getKaohezxm()
   { 	    
  	        
      return this.kaohezxm;     	
   }
 	 	 private String muqiangw;
	 public void setMuqiangw(String muqiangw)
	 {
		  this.muqiangw = muqiangw;
	 }
   public String getMuqiangw()
   { 	    
  	        
      return this.muqiangw;     	
   }
 	 	 private String niandukhbh;
	 public void setNiandukhbh(String niandukhbh)
	 {
		  this.niandukhbh = niandukhbh;
	 }
   public String getNiandukhbh()
   { 	    
  	        
      return this.niandukhbh;     	
   }
 	 	 private String nianfen;
	 public void setNianfen(String nianfen)
	 {
		  this.nianfen = nianfen;
	 }
   public String getNianfen()
   { 	    
  	        
      return this.nianfen;     	
   }
 	 	 private Double suzhizgpjdf;
	 public void setSuzhizgpjdf(Double suzhizgpjdf)
	 {
		  this.suzhizgpjdf = suzhizgpjdf;
	 }
   public Double getSuzhizgpjdf()
   { 	    
  	        
      return this.suzhizgpjdf;     	
   }
 	 	 private Double suzhizwpjdf;
	 public void setSuzhizwpjdf(Double suzhizwpjdf)
	 {
		  this.suzhizwpjdf = suzhizwpjdf;
	 }
   public Double getSuzhizwpjdf()
   { 	    
  	        
      return this.suzhizwpjdf;     	
   }
 	 	 private String suoshubm;
	 public void setSuoshubm(String suoshubm)
	 {
		  this.suoshubm = suoshubm;
	 }
   public String getSuoshubm()
   { 	    
  	        
      return this.suoshubm;     	
   }
 	 	 private Date tjrq;
	 public void setTjrq(Date tjrq)
	 {
		  this.tjrq = tjrq;
	 }
   public Date getTjrq()
   { 	    
  	  	    if( this.tjrq != null )
	    {
	        return (Date)new ActizDate( this.tjrq.getTime() );
	    }
	          
      return this.tjrq;     	
   }
 	 	 private Double yejikf;
	 public void setYejikf(Double yejikf)
	 {
		  this.yejikf = yejikf;
	 }
   public Double getYejikf()
   { 	    
  	        
      return this.yejikf;     	
   }
 	 	 private Double yejipjdf;
	 public void setYejipjdf(Double yejipjdf)
	 {
		  this.yejipjdf = yejipjdf;
	 }
   public Double getYejipjdf()
   { 	    
  	        
      return this.yejipjdf;     	
   }
 	 	 private Double yejizdf;
	 public void setYejizdf(Double yejizdf)
	 {
		  this.yejizdf = yejizdf;
	 }
   public Double getYejizdf()
   { 	    
  	        
      return this.yejizdf;     	
   }
 	 	 private String zhiyefzjh;
	 public void setZhiyefzjh(String zhiyefzjh)
	 {
		  this.zhiyefzjh = zhiyefzjh;
	 }
   public String getZhiyefzjh()
   { 	    
  	        
      return this.zhiyefzjh;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee beikhrxmRef;
	 public void setBeikhrxmRef(com.actiz.platform.application.dataset.pojo.Atzemployee beikhrxmRef)
	 {
		  this.beikhrxmRef = beikhrxmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getBeikhrxmRef()
   {
     	return this.beikhrxmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee kaoherxmRef;
	 public void setKaoherxmRef(com.actiz.platform.application.dataset.pojo.Atzemployee kaoherxmRef)
	 {
		  this.kaoherxmRef = kaoherxmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getKaoherxmRef()
   {
     	return this.kaoherxmRef;
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