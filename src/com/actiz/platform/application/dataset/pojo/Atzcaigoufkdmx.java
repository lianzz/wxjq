package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigoufkdmx implements Serializable,IPojo
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
 	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
   }
 	 	 private String caiwupzhm;
	 public void setCaiwupzhm(String caiwupzhm)
	 {
		  this.caiwupzhm = caiwupzhm;
	 }
   public String getCaiwupzhm()
   { 	    
  	        
      return this.caiwupzhm;     	
   }
 	 	 private Double caigbxwfkje;
	 public void setCaigbxwfkje(Double caigbxwfkje)
	 {
		  this.caigbxwfkje = caigbxwfkje;
	 }
   public Double getCaigbxwfkje()
   { 	    
  	        
      return this.caigbxwfkje;     	
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
 	 	 private String caigouy;
	 public void setCaigouy(String caigouy)
	 {
		  this.caigouy = caigouy;
	 }
   public String getCaigouy()
   { 	    
  	        
      return this.caigouy;     	
   }
 	 	 private Long dfukuanxxid;
	 public void setDfukuanxxid(Long dfukuanxxid)
	 {
		  this.dfukuanxxid = dfukuanxxid;
	 }
   public Long getDfukuanxxid()
   { 	    
  	        
      return this.dfukuanxxid;     	
   }
 	 	 private String dingdanbh;
	 public void setDingdanbh(String dingdanbh)
	 {
		  this.dingdanbh = dingdanbh;
	 }
   public String getDingdanbh()
   { 	    
  	        
      return this.dingdanbh;     	
   }
 	 	 private String fapiao;
	 public void setFapiao(String fapiao)
	 {
		  this.fapiao = fapiao;
	 }
   public String getFapiao()
   { 	    
  	        
      return this.fapiao;     	
   }
 	 	 private Long fukuandbh;
	 public void setFukuandbh(Long fukuandbh)
	 {
		  this.fukuandbh = fukuandbh;
	 }
   public Long getFukuandbh()
   { 	    
  	        
      return this.fukuandbh;     	
   }
 	 	 private String fukuantk;
	 public void setFukuantk(String fukuantk)
	 {
		  this.fukuantk = fukuantk;
	 }
   public String getFukuantk()
   { 	    
  	        
      return this.fukuantk;     	
   }
 	 	 private String gongyings;
	 public void setGongyings(String gongyings)
	 {
		  this.gongyings = gongyings;
	 }
   public String getGongyings()
   { 	    
  	        
      return this.gongyings;     	
   }
 	 	 private Double yuedingfkje;
	 public void setYuedingfkje(Double yuedingfkje)
	 {
		  this.yuedingfkje = yuedingfkje;
	 }
   public Double getYuedingfkje()
   { 	    
  	        
      return this.yuedingfkje;     	
   }
 	 	 private Date yuedingfksj;
	 public void setYuedingfksj(Date yuedingfksj)
	 {
		  this.yuedingfksj = yuedingfksj;
	 }
   public Date getYuedingfksj()
   { 	    
  	  	    if( this.yuedingfksj != null )
	    {
	        return (Date)new ActizDate( this.yuedingfksj.getTime() );
	    }
	          
      return this.yuedingfksj;     	
   }
 	 	 private Date jianyifksj;
	 public void setJianyifksj(Date jianyifksj)
	 {
		  this.jianyifksj = jianyifksj;
	 }
   public Date getJianyifksj()
   { 	    
  	  	    if( this.jianyifksj != null )
	    {
	        return (Date)new ActizDate( this.jianyifksj.getTime() );
	    }
	          
      return this.jianyifksj;     	
   }
 	 	 private String oaslh;
	 public void setOaslh(String oaslh)
	 {
		  this.oaslh = oaslh;
	 }
   public String getOaslh()
   { 	    
  	        
      return this.oaslh;     	
   }
 	 	 private Date zengzhirqdsj;
	 public void setZengzhirqdsj(Date zengzhirqdsj)
	 {
		  this.zengzhirqdsj = zengzhirqdsj;
	 }
   public Date getZengzhirqdsj()
   { 	    
  	  	    if( this.zengzhirqdsj != null )
	    {
	        return (Date)new ActizDate( this.zengzhirqdsj.getTime() );
	    }
	          
      return this.zengzhirqdsj;     	
   }
 	 	 private Date rukusj;
	 public void setRukusj(Date rukusj)
	 {
		  this.rukusj = rukusj;
	 }
   public Date getRukusj()
   { 	    
  	  	    if( this.rukusj != null )
	    {
	        return (Date)new ActizDate( this.rukusj.getTime() );
	    }
	          
      return this.rukusj;     	
   }
 	 	 private String shifouxz;
	 public void setShifouxz(String shifouxz)
	 {
		  this.shifouxz = shifouxz;
	 }
   public String getShifouxz()
   { 	    
  	        
      return this.shifouxz;     	
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
 	 	 private String caiwuxf;
	 public void setCaiwuxf(String caiwuxf)
	 {
		  this.caiwuxf = caiwuxf;
	 }
   public String getCaiwuxf()
   { 	    
  	        
      return this.caiwuxf;     	
   }
 	 	 private Double yinhangwcfkj;
	 public void setYinhangwcfkj(Double yinhangwcfkj)
	 {
		  this.yinhangwcfkj = yinhangwcfkj;
	 }
   public Double getYinhangwcfkj()
   { 	    
  	        
      return this.yinhangwcfkj;     	
   }
 	 	 private Date yinhangwcfks;
	 public void setYinhangwcfks(Date yinhangwcfks)
	 {
		  this.yinhangwcfks = yinhangwcfks;
	 }
   public Date getYinhangwcfks()
   { 	    
  	  	    if( this.yinhangwcfks != null )
	    {
	        return (Date)new ActizDate( this.yinhangwcfks.getTime() );
	    }
	          
      return this.yinhangwcfks;     	
   }
 	 	 private Date zuihypclrksj;
	 public void setZuihypclrksj(Date zuihypclrksj)
	 {
		  this.zuihypclrksj = zuihypclrksj;
	 }
   public Date getZuihypclrksj()
   { 	    
  	  	    if( this.zuihypclrksj != null )
	    {
	        return (Date)new ActizDate( this.zuihypclrksj.getTime() );
	    }
	          
      return this.zuihypclrksj;     	
   }
 	 	 private Double zuizhongfkje;
	 public void setZuizhongfkje(Double zuizhongfkje)
	 {
		  this.zuizhongfkje = zuizhongfkje;
	 }
   public Double getZuizhongfkje()
   { 	    
  	        
      return this.zuizhongfkje;     	
   }
 	 	 private Date zuizhongfksj;
	 public void setZuizhongfksj(Date zuizhongfksj)
	 {
		  this.zuizhongfksj = zuizhongfksj;
	 }
   public Date getZuizhongfksj()
   { 	    
  	  	    if( this.zuizhongfksj != null )
	    {
	        return (Date)new ActizDate( this.zuizhongfksj.getTime() );
	    }
	          
      return this.zuizhongfksj;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzdfukuanxx dfukuanxxidRef;
	 public void setDfukuanxxidRef(com.actiz.platform.application.dataset.pojo.Atzdfukuanxx dfukuanxxidRef)
	 {
		  this.dfukuanxxidRef = dfukuanxxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdfukuanxx getDfukuanxxidRef()
   {
     	return this.dfukuanxxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoufksq fukuandbhRef;
	 public void setFukuandbhRef(com.actiz.platform.application.dataset.pojo.Atzcaigoufksq fukuandbhRef)
	 {
		  this.fukuandbhRef = fukuandbhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoufksq getFukuandbhRef()
   {
     	return this.fukuandbhRef;
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