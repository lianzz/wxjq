package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzshengchancj implements Serializable,IPojo
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
 	 	 private Integer caigouzq;
	 public void setCaigouzq(Integer caigouzq)
	 {
		  this.caigouzq = caigouzq;
	 }
   public Integer getCaigouzq()
   { 	    
  	        
      return this.caigouzq;     	
   }
 	 	 private String changjiamc;
	 public void setChangjiamc(String changjiamc)
	 {
		  this.changjiamc = changjiamc;
	 }
   public String getChangjiamc()
   { 	    
  	        
      return this.changjiamc;     	
   }
 	 	 private String changjiaxh;
	 public void setChangjiaxh(String changjiaxh)
	 {
		  this.changjiaxh = changjiaxh;
	 }
   public String getChangjiaxh()
   { 	    
  	        
      return this.changjiaxh;     	
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
 	 	 private String shifouty;
	 public void setShifouty(String shifouty)
	 {
		  this.shifouty = shifouty;
	 }
   public String getShifouty()
   { 	    
  	        
      return this.shifouty;     	
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
 	 	 private String wuliaotp;
	 public void setWuliaotp(String wuliaotp)
	 {
		  this.wuliaotp = wuliaotp;
	 }
   public String getWuliaotp()
   { 	    
  	        
      return this.wuliaotp;     	
   }
 	 	 private Integer youxianji;
	 public void setYouxianji(Integer youxianji)
	 {
		  this.youxianji = youxianji;
	 }
   public Integer getYouxianji()
   { 	    
  	        
      return this.youxianji;     	
   }
 	 	 private Long yuancj;
	 public void setYuancj(Long yuancj)
	 {
		  this.yuancj = yuancj;
	 }
   public Long getYuancj()
   { 	    
  	        
      return this.yuancj;     	
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
 	 	 private Double zuixiaobzsl;
	 public void setZuixiaobzsl(Double zuixiaobzsl)
	 {
		  this.zuixiaobzsl = zuixiaobzsl;
	 }
   public Double getZuixiaobzsl()
   { 	    
  	        
      return this.zuixiaobzsl;     	
   }
 	 	 private Double zuixiaoqdl;
	 public void setZuixiaoqdl(Double zuixiaoqdl)
	 {
		  this.zuixiaoqdl = zuixiaoqdl;
	 }
   public Double getZuixiaoqdl()
   { 	    
  	        
      return this.zuixiaoqdl;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj yuancjRef;
	 public void setYuancjRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj yuancjRef)
	 {
		  this.yuancjRef = yuancjRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getYuancjRef()
   {
     	return this.yuancjRef;
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