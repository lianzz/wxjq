package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzfaqbiao implements Serializable,IPojo
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
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
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
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
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
 	 	 private String guzhanglx;
	 public void setGuzhanglx(String guzhanglx)
	 {
		  this.guzhanglx = guzhanglx;
	 }
   public String getGuzhanglx()
   { 	    
  	        
      return this.guzhanglx;     	
   }
 	 	 private String jiejueff;
	 public void setJiejueff(String jiejueff)
	 {
		  this.jiejueff = jiejueff;
	 }
   public String getJiejueff()
   { 	    
  	        
      return this.jiejueff;     	
   }
 	 	 private String laiyuan;
	 public void setLaiyuan(String laiyuan)
	 {
		  this.laiyuan = laiyuan;
	 }
   public String getLaiyuan()
   { 	    
  	        
      return this.laiyuan;     	
   }
 	 	 private String tijiaor;
	 public void setTijiaor(String tijiaor)
	 {
		  this.tijiaor = tijiaor;
	 }
   public String getTijiaor()
   { 	    
  	        
      return this.tijiaor;     	
   }
 	 	 private Date tijiaorq;
	 public void setTijiaorq(Date tijiaorq)
	 {
		  this.tijiaorq = tijiaorq;
	 }
   public Date getTijiaorq()
   { 	    
  	  	    if( this.tijiaorq != null )
	    {
	        return (Date)new ActizDate( this.tijiaorq.getTime() );
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
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
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