package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigougz implements Serializable,IPojo
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
	  	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
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
 	 	 private Long caigoujhid;
	 public void setCaigoujhid(Long caigoujhid)
	 {
		  this.caigoujhid = caigoujhid;
	 }
   public Long getCaigoujhid()
   { 	    
  	        
      return this.caigoujhid;     	
   }
 	 	 private String cgxqbz;
	 public void setCgxqbz(String cgxqbz)
	 {
		  this.cgxqbz = cgxqbz;
	 }
   public String getCgxqbz()
   { 	    
  	        
      return this.cgxqbz;     	
   }
 	 	 private String cgxqbm;
	 public void setCgxqbm(String cgxqbm)
	 {
		  this.cgxqbm = cgxqbm;
	 }
   public String getCgxqbm()
   { 	    
  	        
      return this.cgxqbm;     	
   }
 	 	 private Long caigouy;
	 public void setCaigouy(Long caigouy)
	 {
		  this.caigouy = caigouy;
	 }
   public Long getCaigouy()
   { 	    
  	        
      return this.caigouy;     	
   }
 	 	 private Double danjia;
	 public void setDanjia(Double danjia)
	 {
		  this.danjia = danjia;
	 }
   public Double getDanjia()
   { 	    
  	        
      return this.danjia;     	
   }
 	 	 private String dangqianzxzt;
	 public void setDangqianzxzt(String dangqianzxzt)
	 {
		  this.dangqianzxzt = dangqianzxzt;
	 }
   public String getDangqianzxzt()
   { 	    
  	        
      return this.dangqianzxzt;     	
   }
 	 	 private String daohuobz;
	 public void setDaohuobz(String daohuobz)
	 {
		  this.daohuobz = daohuobz;
	 }
   public String getDaohuobz()
   { 	    
  	        
      return this.daohuobz;     	
   }
 	 	 private String daohuotzdbh;
	 public void setDaohuotzdbh(String daohuotzdbh)
	 {
		  this.daohuotzdbh = daohuotzdbh;
	 }
   public String getDaohuotzdbh()
   { 	    
  	        
      return this.daohuotzdbh;     	
   }
 	 	 private String dingdanbz;
	 public void setDingdanbz(String dingdanbz)
	 {
		  this.dingdanbz = dingdanbz;
	 }
   public String getDingdanbz()
   { 	    
  	        
      return this.dingdanbz;     	
   }
 	 	 private String fukuanfs;
	 public void setFukuanfs(String fukuanfs)
	 {
		  this.fukuanfs = fukuanfs;
	 }
   public String getFukuanfs()
   { 	    
  	        
      return this.fukuanfs;     	
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
 	 	 private Long hetongmxid;
	 public void setHetongmxid(Long hetongmxid)
	 {
		  this.hetongmxid = hetongmxid;
	 }
   public Long getHetongmxid()
   { 	    
  	        
      return this.hetongmxid;     	
   }
 	 	 private String jihuadbz;
	 public void setJihuadbz(String jihuadbz)
	 {
		  this.jihuadbz = jihuadbz;
	 }
   public String getJihuadbz()
   { 	    
  	        
      return this.jihuadbz;     	
   }
 	 	 private Long jihuamxid;
	 public void setJihuamxid(Long jihuamxid)
	 {
		  this.jihuamxid = jihuamxid;
	 }
   public Long getJihuamxid()
   { 	    
  	        
      return this.jihuamxid;     	
   }
 	 	 private String jiaohuozq;
	 public void setJiaohuozq(String jiaohuozq)
	 {
		  this.jiaohuozq = jiaohuozq;
	 }
   public String getJiaohuozq()
   { 	    
  	        
      return this.jiaohuozq;     	
   }
 	 	 private Double sjcgsl;
	 public void setSjcgsl(Double sjcgsl)
	 {
		  this.sjcgsl = sjcgsl;
	 }
   public Double getSjcgsl()
   { 	    
  	        
      return this.sjcgsl;     	
   }
 	 	 private Date shijidhrq;
	 public void setShijidhrq(Date shijidhrq)
	 {
		  this.shijidhrq = shijidhrq;
	 }
   public Date getShijidhrq()
   { 	    
  	  	    if( this.shijidhrq != null )
	    {
	        return (Date)new ActizDate( this.shijidhrq.getTime() );
	    }
	          
      return this.shijidhrq;     	
   }
 	 	 private Double shijidhsl;
	 public void setShijidhsl(Double shijidhsl)
	 {
		  this.shijidhsl = shijidhsl;
	 }
   public Double getShijidhsl()
   { 	    
  	        
      return this.shijidhsl;     	
   }
 	 	 private String zhiliangwt;
	 public void setZhiliangwt(String zhiliangwt)
	 {
		  this.zhiliangwt = zhiliangwt;
	 }
   public String getZhiliangwt()
   { 	    
  	        
      return this.zhiliangwt;     	
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
 	 	 private Long tuijiancs;
	 public void setTuijiancs(Long tuijiancs)
	 {
		  this.tuijiancs = tuijiancs;
	 }
   public Long getTuijiancs()
   { 	    
  	        
      return this.tuijiancs;     	
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
 	 	 private Long xiangmu;
	 public void setXiangmu(Long xiangmu)
	 {
		  this.xiangmu = xiangmu;
	 }
   public Long getXiangmu()
   { 	    
  	        
      return this.xiangmu;     	
   }
 	 	 private Date xuqiupzsj;
	 public void setXuqiupzsj(Date xuqiupzsj)
	 {
		  this.xuqiupzsj = xuqiupzsj;
	 }
   public Date getXuqiupzsj()
   { 	    
  	  	    if( this.xuqiupzsj != null )
	    {
	        return (Date)new ActizDate( this.xuqiupzsj.getTime() );
	    }
	          
      return this.xuqiupzsj;     	
   }
 	 	 private String xuqiusqr;
	 public void setXuqiusqr(String xuqiusqr)
	 {
		  this.xuqiusqr = xuqiusqr;
	 }
   public String getXuqiusqr()
   { 	    
  	        
      return this.xuqiusqr;     	
   }
 	 	 private Date yujidhrq;
	 public void setYujidhrq(Date yujidhrq)
	 {
		  this.yujidhrq = yujidhrq;
	 }
   public Date getYujidhrq()
   { 	    
  	  	    if( this.yujidhrq != null )
	    {
	        return (Date)new ActizDate( this.yujidhrq.getTime() );
	    }
	          
      return this.yujidhrq;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef;
	 public void setCaigoujhidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef)
	 {
		  this.caigoujhidRef = caigoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigoujhidRef()
   {
     	return this.caigoujhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg caigouyRef;
	 public void setCaigouyRef(com.actiz.platform.application.dataset.pojo.Atztdyg caigouyRef)
	 {
		  this.caigouyRef = caigouyRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getCaigouyRef()
   {
     	return this.caigouyRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx hetongmxidRef;
	 public void setHetongmxidRef(com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx hetongmxidRef)
	 {
		  this.hetongmxidRef = hetongmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigouhtmx getHetongmxidRef()
   {
     	return this.hetongmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx jihuamxidRef;
	 public void setJihuamxidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx jihuamxidRef)
	 {
		  this.jihuamxidRef = jihuamxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujhmx getJihuamxidRef()
   {
     	return this.jihuamxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj tuijiancsRef;
	 public void setTuijiancsRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj tuijiancsRef)
	 {
		  this.tuijiancsRef = tuijiancsRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getTuijiancsRef()
   {
     	return this.tuijiancsRef;
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