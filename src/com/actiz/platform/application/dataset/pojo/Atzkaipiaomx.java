package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkaipiaomx implements Serializable,IPojo
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
	  	 	 private Long atzkaipiaosqdid;
	 public void setAtzkaipiaosqdid(Long atzkaipiaosqdid)
	 {
		  this.atzkaipiaosqdid = atzkaipiaosqdid;
	 }
   public Long getAtzkaipiaosqdid()
   { 	    
  	        
      return this.atzkaipiaosqdid;     	
   }
 	 	 private String zhubei;
	 public void setZhubei(String zhubei)
	 {
		  this.zhubei = zhubei;
	 }
   public String getZhubei()
   { 	    
  	        
      return this.zhubei;     	
   }
 	 	 private Double buhsdj;
	 public void setBuhsdj(Double buhsdj)
	 {
		  this.buhsdj = buhsdj;
	 }
   public Double getBuhsdj()
   { 	    
  	        
      return this.buhsdj;     	
   }
 	 	 private Double buhshjje;
	 public void setBuhshjje(Double buhshjje)
	 {
		  this.buhshjje = buhshjje;
	 }
   public Double getBuhshjje()
   { 	    
  	        
      return this.buhshjje;     	
   }
 	 	 private Double buhshjwbje;
	 public void setBuhshjwbje(Double buhshjwbje)
	 {
		  this.buhshjwbje = buhshjwbje;
	 }
   public Double getBuhshjwbje()
   { 	    
  	        
      return this.buhshjwbje;     	
   }
 	 	 private Double buhswbdj;
	 public void setBuhswbdj(Double buhswbdj)
	 {
		  this.buhswbdj = buhswbdj;
	 }
   public Double getBuhswbdj()
   { 	    
  	        
      return this.buhswbdj;     	
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
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private String fapiaohm;
	 public void setFapiaohm(String fapiaohm)
	 {
		  this.fapiaohm = fapiaohm;
	 }
   public String getFapiaohm()
   { 	    
  	        
      return this.fapiaohm;     	
   }
 	 	 private String fukuanmc;
	 public void setFukuanmc(String fukuanmc)
	 {
		  this.fukuanmc = fukuanmc;
	 }
   public String getFukuanmc()
   { 	    
  	        
      return this.fukuanmc;     	
   }
 	 	 private Long fukuantkid;
	 public void setFukuantkid(Long fukuantkid)
	 {
		  this.fukuantkid = fukuantkid;
	 }
   public Long getFukuantkid()
   { 	    
  	        
      return this.fukuantkid;     	
   }
 	 	 private String guigexh;
	 public void setGuigexh(String guigexh)
	 {
		  this.guigexh = guigexh;
	 }
   public String getGuigexh()
   { 	    
  	        
      return this.guigexh;     	
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
 	 	 private Double hanshuihjje;
	 public void setHanshuihjje(Double hanshuihjje)
	 {
		  this.hanshuihjje = hanshuihjje;
	 }
   public Double getHanshuihjje()
   { 	    
  	        
      return this.hanshuihjje;     	
   }
 	 	 private Double hanshjwbje;
	 public void setHanshjwbje(Double hanshjwbje)
	 {
		  this.hanshjwbje = hanshjwbje;
	 }
   public Double getHanshjwbje()
   { 	    
  	        
      return this.hanshjwbje;     	
   }
 	 	 private Double hanshuiwbdj;
	 public void setHanshuiwbdj(Double hanshuiwbdj)
	 {
		  this.hanshuiwbdj = hanshuiwbdj;
	 }
   public Double getHanshuiwbdj()
   { 	    
  	        
      return this.hanshuiwbdj;     	
   }
 	 	 private Date kaipiaorq;
	 public void setKaipiaorq(Date kaipiaorq)
	 {
		  this.kaipiaorq = kaipiaorq;
	 }
   public Date getKaipiaorq()
   { 	    
  	  	    if( this.kaipiaorq != null )
	    {
	        return (Date)new ActizDate( this.kaipiaorq.getTime() );
	    }
	          
      return this.kaipiaorq;     	
   }
 	 	 private String kaipiaonr;
	 public void setKaipiaonr(String kaipiaonr)
	 {
		  this.kaipiaonr = kaipiaonr;
	 }
   public String getKaipiaonr()
   { 	    
  	        
      return this.kaipiaonr;     	
   }
 	 	 private Date querenxssrsj;
	 public void setQuerenxssrsj(Date querenxssrsj)
	 {
		  this.querenxssrsj = querenxssrsj;
	 }
   public Date getQuerenxssrsj()
   { 	    
  	  	    if( this.querenxssrsj != null )
	    {
	        return (Date)new ActizDate( this.querenxssrsj.getTime() );
	    }
	          
      return this.querenxssrsj;     	
   }
 	 	 private String shifouqrxssr;
	 public void setShifouqrxssr(String shifouqrxssr)
	 {
		  this.shifouqrxssr = shifouqrxssr;
	 }
   public String getShifouqrxssr()
   { 	    
  	        
      return this.shifouqrxssr;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Long wubizl;
	 public void setWubizl(Long wubizl)
	 {
		  this.wubizl = wubizl;
	 }
   public Long getWubizl()
   { 	    
  	        
      return this.wubizl;     	
   }
 	 	 private Double weishouje;
	 public void setWeishouje(Double weishouje)
	 {
		  this.weishouje = weishouje;
	 }
   public Double getWeishouje()
   { 	    
  	        
      return this.weishouje;     	
   }
 	 	 private Double yishouje;
	 public void setYishouje(Double yishouje)
	 {
		  this.yishouje = yishouje;
	 }
   public Double getYishouje()
   { 	    
  	        
      return this.yishouje;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzkaipiaosqd atzkaipiaosqdidRef;
	 public void setAtzkaipiaosqdidRef(com.actiz.platform.application.dataset.pojo.Atzkaipiaosqd atzkaipiaosqdidRef)
	 {
		  this.atzkaipiaosqdidRef = atzkaipiaosqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkaipiaosqd getAtzkaipiaosqdidRef()
   {
     	return this.atzkaipiaosqdidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzfukuantk fukuantkidRef;
	 public void setFukuantkidRef(com.actiz.platform.application.dataset.pojo.Atzfukuantk fukuantkidRef)
	 {
		  this.fukuantkidRef = fukuantkidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzfukuantk getFukuantkidRef()
   {
     	return this.fukuantkidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef;
	 public void setWubizlRef(com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef)
	 {
		  this.wubizlRef = wubizlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getWubizlRef()
   {
     	return this.wubizlRef;
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