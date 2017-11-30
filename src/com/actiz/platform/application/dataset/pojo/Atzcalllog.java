package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcalllog implements Serializable,IPojo
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
 	 	 private String beizhuy;
	 public void setBeizhuy(String beizhuy)
	 {
		  this.beizhuy = beizhuy;
	 }
   public String getBeizhuy()
   { 	    
  	        
      return this.beizhuy;     	
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
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private Timestamp chengnuojjsj;
	 public void setChengnuojjsj(Timestamp chengnuojjsj)
	 {
		  this.chengnuojjsj = chengnuojjsj;
	 }
   public Timestamp getChengnuojjsj()
   { 	    
  	    	  if( this.chengnuojjsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.chengnuojjsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.chengnuojjsj;     	
   }
 	 	 private String cqsyh;
	 public void setCqsyh(String cqsyh)
	 {
		  this.cqsyh = cqsyh;
	 }
   public String getCqsyh()
   { 	    
  	        
      return this.cqsyh;     	
   }
 	 	 private String fuwulx;
	 public void setFuwulx(String fuwulx)
	 {
		  this.fuwulx = fuwulx;
	 }
   public String getFuwulx()
   { 	    
  	        
      return this.fuwulx;     	
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
 	 	 private String jinjicd;
	 public void setJinjicd(String jinjicd)
	 {
		  this.jinjicd = jinjicd;
	 }
   public String getJinjicd()
   { 	    
  	        
      return this.jinjicd;     	
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
 	 	 private String laidianhm;
	 public void setLaidianhm(String laidianhm)
	 {
		  this.laidianhm = laidianhm;
	 }
   public String getLaidianhm()
   { 	    
  	        
      return this.laidianhm;     	
   }
 	 	 private Timestamp laidiansj;
	 public void setLaidiansj(Timestamp laidiansj)
	 {
		  this.laidiansj = laidiansj;
	 }
   public Timestamp getLaidiansj()
   { 	    
  	    	  if( this.laidiansj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.laidiansj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.laidiansj;     	
   }
 	 	 private String kehulxr;
	 public void setKehulxr(String kehulxr)
	 {
		  this.kehulxr = kehulxr;
	 }
   public String getKehulxr()
   { 	    
  	        
      return this.kehulxr;     	
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
 	 	 private String shifougb;
	 public void setShifougb(String shifougb)
	 {
		  this.shifougb = shifougb;
	 }
   public String getShifougb()
   { 	    
  	        
      return this.shifougb;     	
   }
 	 	 private String tijiaofaq;
	 public void setTijiaofaq(String tijiaofaq)
	 {
		  this.tijiaofaq = tijiaofaq;
	 }
   public String getTijiaofaq()
   { 	    
  	        
      return this.tijiaofaq;     	
   }
 	 	 private String zerenr;
	 public void setZerenr(String zerenr)
	 {
		  this.zerenr = zerenr;
	 }
   public String getZerenr()
   { 	    
  	        
      return this.zerenr;     	
   }
 	 	 private Timestamp tijiaorq;
	 public void setTijiaorq(Timestamp tijiaorq)
	 {
		  this.tijiaorq = tijiaorq;
	 }
   public Timestamp getTijiaorq()
   { 	    
  	    	  if( this.tijiaorq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.tijiaorq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.tijiaorq;     	
   }
 	 	 private String wentims;
	 public void setWentims(String wentims)
	 {
		  this.wentims = wentims;
	 }
   public String getWentims()
   { 	    
  	        
      return this.wentims;     	
   }
 	 	 private String wentimsy;
	 public void setWentimsy(String wentimsy)
	 {
		  this.wentimsy = wentimsy;
	 }
   public String getWentimsy()
   { 	    
  	        
      return this.wentimsy;     	
   }
 	 	 private Long xitongid;
	 public void setXitongid(Long xitongid)
	 {
		  this.xitongid = xitongid;
	 }
   public Long getXitongid()
   { 	    
  	        
      return this.xitongid;     	
   }
 	 	 private String xingbie;
	 public void setXingbie(String xingbie)
	 {
		  this.xingbie = xingbie;
	 }
   public String getXingbie()
   { 	    
  	        
      return this.xingbie;     	
   }
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
   }
 	 	 private Timestamp zuihoudfrq;
	 public void setZuihoudfrq(Timestamp zuihoudfrq)
	 {
		  this.zuihoudfrq = zuihoudfrq;
	 }
   public Timestamp getZuihoudfrq()
   { 	    
  	    	  if( this.zuihoudfrq != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.zuihoudfrq.getTime() );
	    }	      	  	   	  	     	    
            
      return this.zuihoudfrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinn chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinn getChanpinidRef()
   {
     	return this.chanpinidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef;
	 public void setXitongidRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef)
	 {
		  this.xitongidRef = xitongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongidRef()
   {
     	return this.xitongidRef;
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