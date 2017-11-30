package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyuangongzz implements Serializable,IPojo
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
 	 	 private String fazhengdw;
	 public void setFazhengdw(String fazhengdw)
	 {
		  this.fazhengdw = fazhengdw;
	 }
   public String getFazhengdw()
   { 	    
  	        
      return this.fazhengdw;     	
   }
 	 	 private Date fushenrq;
	 public void setFushenrq(Date fushenrq)
	 {
		  this.fushenrq = fushenrq;
	 }
   public Date getFushenrq()
   { 	    
  	  	    if( this.fushenrq != null )
	    {
	        return (Date)new ActizDate( this.fushenrq.getTime() );
	    }
	          
      return this.fushenrq;     	
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
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
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
 	 	 private String nianshen;
	 public void setNianshen(String nianshen)
	 {
		  this.nianshen = nianshen;
	 }
   public String getNianshen()
   { 	    
  	        
      return this.nianshen;     	
   }
 	 	 private Date qishisj;
	 public void setQishisj(Date qishisj)
	 {
		  this.qishisj = qishisj;
	 }
   public Date getQishisj()
   { 	    
  	  	    if( this.qishisj != null )
	    {
	        return (Date)new ActizDate( this.qishisj.getTime() );
	    }
	          
      return this.qishisj;     	
   }
 	 	 private Date youxianq;
	 public void setYouxianq(Date youxianq)
	 {
		  this.youxianq = youxianq;
	 }
   public Date getYouxianq()
   { 	    
  	  	    if( this.youxianq != null )
	    {
	        return (Date)new ActizDate( this.youxianq.getTime() );
	    }
	          
      return this.youxianq;     	
   }
 	 	 private Long yuangong;
	 public void setYuangong(Long yuangong)
	 {
		  this.yuangong = yuangong;
	 }
   public Long getYuangong()
   { 	    
  	        
      return this.yuangong;     	
   }
 	 	 private String zhengshubh;
	 public void setZhengshubh(String zhengshubh)
	 {
		  this.zhengshubh = zhengshubh;
	 }
   public String getZhengshubh()
   { 	    
  	        
      return this.zhengshubh;     	
   }
 	 	 private String zhuncaoxm;
	 public void setZhuncaoxm(String zhuncaoxm)
	 {
		  this.zhuncaoxm = zhuncaoxm;
	 }
   public String getZhuncaoxm()
   { 	    
  	        
      return this.zhuncaoxm;     	
   }
 	 	 private String zhichengdj;
	 public void setZhichengdj(String zhichengdj)
	 {
		  this.zhichengdj = zhichengdj;
	 }
   public String getZhichengdj()
   { 	    
  	        
      return this.zhichengdj;     	
   }
 	 	 private String zizhilb;
	 public void setZizhilb(String zizhilb)
	 {
		  this.zizhilb = zizhilb;
	 }
   public String getZizhilb()
   { 	    
  	        
      return this.zizhilb;     	
   }
 	 	 private String zhicheng;
	 public void setZhicheng(String zhicheng)
	 {
		  this.zhicheng = zhicheng;
	 }
   public String getZhicheng()
   { 	    
  	        
      return this.zhicheng;     	
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
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef;
	 public void setYuangongRef(com.actiz.platform.application.dataset.pojo.Atzemployee yuangongRef)
	 {
		  this.yuangongRef = yuangongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getYuangongRef()
   {
     	return this.yuangongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
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