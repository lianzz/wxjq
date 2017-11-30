package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjidukh implements Serializable,IPojo
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
	  	 	 private String beikhrgw;
	 public void setBeikhrgw(String beikhrgw)
	 {
		  this.beikhrgw = beikhrgw;
	 }
   public String getBeikhrgw()
   { 	    
  	        
      return this.beikhrgw;     	
   }
 	 	 private String beikhrxm;
	 public void setBeikhrxm(String beikhrxm)
	 {
		  this.beikhrxm = beikhrxm;
	 }
   public String getBeikhrxm()
   { 	    
  	        
      return this.beikhrxm;     	
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
 	 	 private String bumen;
	 public void setBumen(String bumen)
	 {
		  this.bumen = bumen;
	 }
   public String getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private String gonghao;
	 public void setGonghao(String gonghao)
	 {
		  this.gonghao = gonghao;
	 }
   public String getGonghao()
   { 	    
  	        
      return this.gonghao;     	
   }
 	 	 private String jidukhbh;
	 public void setJidukhbh(String jidukhbh)
	 {
		  this.jidukhbh = jidukhbh;
	 }
   public String getJidukhbh()
   { 	    
  	        
      return this.jidukhbh;     	
   }
 	 	 private Long jidukhhzid;
	 public void setJidukhhzid(Long jidukhhzid)
	 {
		  this.jidukhhzid = jidukhhzid;
	 }
   public Long getJidukhhzid()
   { 	    
  	        
      return this.jidukhhzid;     	
   }
 	 	 private Double jiduzpdf;
	 public void setJiduzpdf(Double jiduzpdf)
	 {
		  this.jiduzpdf = jiduzpdf;
	 }
   public Double getJiduzpdf()
   { 	    
  	        
      return this.jiduzpdf;     	
   }
 	 	 private String kaohejd;
	 public void setKaohejd(String kaohejd)
	 {
		  this.kaohejd = kaohejd;
	 }
   public String getKaohejd()
   { 	    
  	        
      return this.kaohejd;     	
   }
 	 	 private Date kaohejssj;
	 public void setKaohejssj(Date kaohejssj)
	 {
		  this.kaohejssj = kaohejssj;
	 }
   public Date getKaohejssj()
   { 	    
  	  	    if( this.kaohejssj != null )
	    {
	        return (Date)new ActizDate( this.kaohejssj.getTime() );
	    }
	          
      return this.kaohejssj;     	
   }
 	 	 private Date kaohekssj;
	 public void setKaohekssj(Date kaohekssj)
	 {
		  this.kaohekssj = kaohekssj;
	 }
   public Date getKaohekssj()
   { 	    
  	  	    if( this.kaohekssj != null )
	    {
	        return (Date)new ActizDate( this.kaohekssj.getTime() );
	    }
	          
      return this.kaohekssj;     	
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
 	 	 private Long kaohrxm;
	 public void setKaohrxm(Long kaohrxm)
	 {
		  this.kaohrxm = kaohrxm;
	 }
   public Long getKaohrxm()
   { 	    
  	        
      return this.kaohrxm;     	
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
 	 	 private Double renwuwczgpf;
	 public void setRenwuwczgpf(Double renwuwczgpf)
	 {
		  this.renwuwczgpf = renwuwczgpf;
	 }
   public Double getRenwuwczgpf()
   { 	    
  	        
      return this.renwuwczgpf;     	
   }
 	 	 private Double renwuwczpdf;
	 public void setRenwuwczpdf(Double renwuwczpdf)
	 {
		  this.renwuwczpdf = renwuwczpdf;
	 }
   public Double getRenwuwczpdf()
   { 	    
  	        
      return this.renwuwczpdf;     	
   }
 	 	 private Double zongpingdf;
	 public void setZongpingdf(Double zongpingdf)
	 {
		  this.zongpingdf = zongpingdf;
	 }
   public Double getZongpingdf()
   { 	    
  	        
      return this.zongpingdf;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzjidukhhz jidukhhzidRef;
	 public void setJidukhhzidRef(com.actiz.platform.application.dataset.pojo.Atzjidukhhz jidukhhzidRef)
	 {
		  this.jidukhhzidRef = jidukhhzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjidukhhz getJidukhhzidRef()
   {
     	return this.jidukhhzidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee kaohrxmRef;
	 public void setKaohrxmRef(com.actiz.platform.application.dataset.pojo.Atzemployee kaohrxmRef)
	 {
		  this.kaohrxmRef = kaohrxmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getKaohrxmRef()
   {
     	return this.kaohrxmRef;
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