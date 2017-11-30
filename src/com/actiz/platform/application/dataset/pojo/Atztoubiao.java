package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztoubiao implements Serializable,IPojo
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
	  	 	 private String bjry;
	 public void setBjry(String bjry)
	 {
		  this.bjry = bjry;
	 }
   public String getBjry()
   { 	    
  	        
      return this.bjry;     	
   }
 	 	 private String bjygids;
	 public void setBjygids(String bjygids)
	 {
		  this.bjygids = bjygids;
	 }
   public String getBjygids()
   { 	    
  	        
      return this.bjygids;     	
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
 	 	 private String cgry;
	 public void setCgry(String cgry)
	 {
		  this.cgry = cgry;
	 }
   public String getCgry()
   { 	    
  	        
      return this.cgry;     	
   }
 	 	 private String cgygids;
	 public void setCgygids(String cgygids)
	 {
		  this.cgygids = cgygids;
	 }
   public String getCgygids()
   { 	    
  	        
      return this.cgygids;     	
   }
 	 	 private String cplx;
	 public void setCplx(String cplx)
	 {
		  this.cplx = cplx;
	 }
   public String getCplx()
   { 	    
  	        
      return this.cplx;     	
   }
 	 	 private Long managerid;
	 public void setManagerid(Long managerid)
	 {
		  this.managerid = managerid;
	 }
   public Long getManagerid()
   { 	    
  	        
      return this.managerid;     	
   }
 	 	 private String daqumc;
	 public void setDaqumc(String daqumc)
	 {
		  this.daqumc = daqumc;
	 }
   public String getDaqumc()
   { 	    
  	        
      return this.daqumc;     	
   }
 	 	 private String fkyj;
	 public void setFkyj(String fkyj)
	 {
		  this.fkyj = fkyj;
	 }
   public String getFkyj()
   { 	    
  	        
      return this.fkyj;     	
   }
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
   }
 	 	 private String gcry;
	 public void setGcry(String gcry)
	 {
		  this.gcry = gcry;
	 }
   public String getGcry()
   { 	    
  	        
      return this.gcry;     	
   }
 	 	 private String gcygids;
	 public void setGcygids(String gcygids)
	 {
		  this.gcygids = gcygids;
	 }
   public String getGcygids()
   { 	    
  	        
      return this.gcygids;     	
   }
 	 	 private String jsry;
	 public void setJsry(String jsry)
	 {
		  this.jsry = jsry;
	 }
   public String getJsry()
   { 	    
  	        
      return this.jsry;     	
   }
 	 	 private String jsygids;
	 public void setJsygids(String jsygids)
	 {
		  this.jsygids = jsygids;
	 }
   public String getJsygids()
   { 	    
  	        
      return this.jsygids;     	
   }
 	 	 private Date kbrq;
	 public void setKbrq(Date kbrq)
	 {
		  this.kbrq = kbrq;
	 }
   public Date getKbrq()
   { 	    
  	  	    if( this.kbrq != null )
	    {
	        return (Date)new ActizDate( this.kbrq.getTime() );
	    }
	          
      return this.kbrq;     	
   }
 	 	 private String lcyshrids;
	 public void setLcyshrids(String lcyshrids)
	 {
		  this.lcyshrids = lcyshrids;
	 }
   public String getLcyshrids()
   { 	    
  	        
      return this.lcyshrids;     	
   }
 	 	 private Long lrrid;
	 public void setLrrid(Long lrrid)
	 {
		  this.lrrid = lrrid;
	 }
   public Long getLrrid()
   { 	    
  	        
      return this.lrrid;     	
   }
 	 	 private Timestamp lrsj;
	 public void setLrsj(Timestamp lrsj)
	 {
		  this.lrsj = lrsj;
	 }
   public Timestamp getLrsj()
   { 	    
  	    	  if( this.lrsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lrsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lrsj;     	
   }
 	 	 private String qtry;
	 public void setQtry(String qtry)
	 {
		  this.qtry = qtry;
	 }
   public String getQtry()
   { 	    
  	        
      return this.qtry;     	
   }
 	 	 private String qtygids;
	 public void setQtygids(String qtygids)
	 {
		  this.qtygids = qtygids;
	 }
   public String getQtygids()
   { 	    
  	        
      return this.qtygids;     	
   }
 	 	 private String qxjtyy;
	 public void setQxjtyy(String qxjtyy)
	 {
		  this.qxjtyy = qxjtyy;
	 }
   public String getQxjtyy()
   { 	    
  	        
      return this.qxjtyy;     	
   }
 	 	 private String qxqzt;
	 public void setQxqzt(String qxqzt)
	 {
		  this.qxqzt = qxqzt;
	 }
   public String getQxqzt()
   { 	    
  	        
      return this.qxqzt;     	
   }
 	 	 private String qxyy;
	 public void setQxyy(String qxyy)
	 {
		  this.qxyy = qxyy;
	 }
   public String getQxyy()
   { 	    
  	        
      return this.qxyy;     	
   }
 	 	 private String shengfen;
	 public void setShengfen(String shengfen)
	 {
		  this.shengfen = shengfen;
	 }
   public String getShengfen()
   { 	    
  	        
      return this.shengfen;     	
   }
 	 	 private String shixianqu;
	 public void setShixianqu(String shixianqu)
	 {
		  this.shixianqu = shixianqu;
	 }
   public String getShixianqu()
   { 	    
  	        
      return this.shixianqu;     	
   }
 	 	 private Long daquid;
	 public void setDaquid(Long daquid)
	 {
		  this.daquid = daquid;
	 }
   public Long getDaquid()
   { 	    
  	        
      return this.daquid;     	
   }
 	 	 private String tblx;
	 public void setTblx(String tblx)
	 {
		  this.tblx = tblx;
	 }
   public String getTblx()
   { 	    
  	        
      return this.tblx;     	
   }
 	 	 private Date tbrq;
	 public void setTbrq(Date tbrq)
	 {
		  this.tbrq = tbrq;
	 }
   public Date getTbrq()
   { 	    
  	  	    if( this.tbrq != null )
	    {
	        return (Date)new ActizDate( this.tbrq.getTime() );
	    }
	          
      return this.tbrq;     	
   }
 	 	 private String tbdjzt;
	 public void setTbdjzt(String tbdjzt)
	 {
		  this.tbdjzt = tbdjzt;
	 }
   public String getTbdjzt()
   { 	    
  	        
      return this.tbdjzt;     	
   }
 	 	 private String tbxmmc;
	 public void setTbxmmc(String tbxmmc)
	 {
		  this.tbxmmc = tbxmmc;
	 }
   public String getTbxmmc()
   { 	    
  	        
      return this.tbxmmc;     	
   }
 	 	 private String tbzt;
	 public void setTbzt(String tbzt)
	 {
		  this.tbzt = tbzt;
	 }
   public String getTbzt()
   { 	    
  	        
      return this.tbzt;     	
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
 	 	 private String xmbh;
	 public void setXmbh(String xmbh)
	 {
		  this.xmbh = xmbh;
	 }
   public String getXmbh()
   { 	    
  	        
      return this.xmbh;     	
   }
 	 	 private Long xsjlid;
	 public void setXsjlid(Long xsjlid)
	 {
		  this.xsjlid = xsjlid;
	 }
   public Long getXsjlid()
   { 	    
  	        
      return this.xsjlid;     	
   }
 	 	 private String xsjlxm;
	 public void setXsjlxm(String xsjlxm)
	 {
		  this.xsjlxm = xsjlxm;
	 }
   public String getXsjlxm()
   { 	    
  	        
      return this.xsjlxm;     	
   }
 	 	 private Double ysje;
	 public void setYsje(Double ysje)
	 {
		  this.ysje = ysje;
	 }
   public Double getYsje()
   { 	    
  	        
      return this.ysje;     	
   }
 	 	 private String zxry;
	 public void setZxry(String zxry)
	 {
		  this.zxry = zxry;
	 }
   public String getZxry()
   { 	    
  	        
      return this.zxry;     	
   }
 	 	 private String zxygids;
	 public void setZxygids(String zxygids)
	 {
		  this.zxygids = zxygids;
	 }
   public String getZxygids()
   { 	    
  	        
      return this.zxygids;     	
   }
 	 	 private Integer zuidashhj;
	 public void setZuidashhj(Integer zuidashhj)
	 {
		  this.zuidashhj = zuidashhj;
	 }
   public Integer getZuidashhj()
   { 	    
  	        
      return this.zuidashhj;     	
   }
 	 	 private Timestamp zhxgsj;
	 public void setZhxgsj(Timestamp zhxgsj)
	 {
		  this.zhxgsj = zhxgsj;
	 }
   public Timestamp getZhxgsj()
   { 	    
  	    	  if( this.zhxgsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.zhxgsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.zhxgsj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lrridRef;
	 public void setLrridRef(com.actiz.platform.application.dataset.pojo.Atzemployee lrridRef)
	 {
		  this.lrridRef = lrridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLrridRef()
   {
     	return this.lrridRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment daquidRef;
	 public void setDaquidRef(com.actiz.platform.application.dataset.pojo.Atzdepartment daquidRef)
	 {
		  this.daquidRef = daquidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getDaquidRef()
   {
     	return this.daquidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xsjlidRef;
	 public void setXsjlidRef(com.actiz.platform.application.dataset.pojo.Atzemployee xsjlidRef)
	 {
		  this.xsjlidRef = xsjlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXsjlidRef()
   {
     	return this.xsjlidRef;
   }
  
	private java.util.Set atztoubiaoqxSet;
	public void setAtztoubiaoqxSet(java.util.Set atztoubiaoqxSet)
	{
		 this.atztoubiaoqxSet = atztoubiaoqxSet;
	}
  public java.util.Set getAtztoubiaoqxSet()
  {
     return this.atztoubiaoqxSet;
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