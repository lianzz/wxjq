package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhuiyijy implements Serializable,IPojo
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
	  	 	 private Long atzhuiyisydi;
	 public void setAtzhuiyisydi(Long atzhuiyisydi)
	 {
		  this.atzhuiyisydi = atzhuiyisydi;
	 }
   public Long getAtzhuiyisydi()
   { 	    
  	        
      return this.atzhuiyisydi;     	
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
 	 	 private String huiyidd;
	 public void setHuiyidd(String huiyidd)
	 {
		  this.huiyidd = huiyidd;
	 }
   public String getHuiyidd()
   { 	    
  	        
      return this.huiyidd;     	
   }
 	 	 private String huiyijlr;
	 public void setHuiyijlr(String huiyijlr)
	 {
		  this.huiyijlr = huiyijlr;
	 }
   public String getHuiyijlr()
   { 	    
  	        
      return this.huiyijlr;     	
   }
 	 	 private Timestamp huiyijlsj;
	 public void setHuiyijlsj(Timestamp huiyijlsj)
	 {
		  this.huiyijlsj = huiyijlsj;
	 }
   public Timestamp getHuiyijlsj()
   { 	    
  	    	  if( this.huiyijlsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.huiyijlsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.huiyijlsj;     	
   }
 	 	 private String huiyijybh;
	 public void setHuiyijybh(String huiyijybh)
	 {
		  this.huiyijybh = huiyijybh;
	 }
   public String getHuiyijybh()
   { 	    
  	        
      return this.huiyijybh;     	
   }
 	 	 private String huiyilx;
	 public void setHuiyilx(String huiyilx)
	 {
		  this.huiyilx = huiyilx;
	 }
   public String getHuiyilx()
   { 	    
  	        
      return this.huiyilx;     	
   }
 	 	 private String huiyimd;
	 public void setHuiyimd(String huiyimd)
	 {
		  this.huiyimd = huiyimd;
	 }
   public String getHuiyimd()
   { 	    
  	        
      return this.huiyimd;     	
   }
 	 	 private String huiyinrjl;
	 public void setHuiyinrjl(String huiyinrjl)
	 {
		  this.huiyinrjl = huiyinrjl;
	 }
   public String getHuiyinrjl()
   { 	    
  	        
      return this.huiyinrjl;     	
   }
 	 	 private String huiyisj;
	 public void setHuiyisj(String huiyisj)
	 {
		  this.huiyisj = huiyisj;
	 }
   public String getHuiyisj()
   { 	    
  	        
      return this.huiyisj;     	
   }
 	 	 private String huiyizcr;
	 public void setHuiyizcr(String huiyizcr)
	 {
		  this.huiyizcr = huiyizcr;
	 }
   public String getHuiyizcr()
   { 	    
  	        
      return this.huiyizcr;     	
   }
 	 	 private String huiyizt;
	 public void setHuiyizt(String huiyizt)
	 {
		  this.huiyizt = huiyizt;
	 }
   public String getHuiyizt()
   { 	    
  	        
      return this.huiyizt;     	
   }
 	 	 private String quexiry;
	 public void setQuexiry(String quexiry)
	 {
		  this.quexiry = quexiry;
	 }
   public String getQuexiry()
   { 	    
  	        
      return this.quexiry;     	
   }
 	 	 private String yuhuiry;
	 public void setYuhuiry(String yuhuiry)
	 {
		  this.yuhuiry = yuhuiry;
	 }
   public String getYuhuiry()
   { 	    
  	        
      return this.yuhuiry;     	
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
 	 	 private Timestamp zuihouxgsj;
	 public void setZuihouxgsj(Timestamp zuihouxgsj)
	 {
		  this.zuihouxgsj = zuihouxgsj;
	 }
   public Timestamp getZuihouxgsj()
   { 	    
  	    	  if( this.zuihouxgsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.zuihouxgsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.zuihouxgsj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhuiyisyd atzhuiyisydiRef;
	 public void setAtzhuiyisydiRef(com.actiz.platform.application.dataset.pojo.Atzhuiyisyd atzhuiyisydiRef)
	 {
		  this.atzhuiyisydiRef = atzhuiyisydiRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhuiyisyd getAtzhuiyisydiRef()
   {
     	return this.atzhuiyisydiRef;
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