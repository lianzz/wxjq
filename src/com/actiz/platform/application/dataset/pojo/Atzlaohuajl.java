package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzlaohuajl implements Serializable,IPojo
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
 	 	 private Long ceshijlid;
	 public void setCeshijlid(Long ceshijlid)
	 {
		  this.ceshijlid = ceshijlid;
	 }
   public Long getCeshijlid()
   { 	    
  	        
      return this.ceshijlid;     	
   }
 	 	 private Long chukudmxid;
	 public void setChukudmxid(Long chukudmxid)
	 {
		  this.chukudmxid = chukudmxid;
	 }
   public Long getChukudmxid()
   { 	    
  	        
      return this.chukudmxid;     	
   }
 	 	 private Integer laohuacxsj;
	 public void setLaohuacxsj(Integer laohuacxsj)
	 {
		  this.laohuacxsj = laohuacxsj;
	 }
   public Integer getLaohuacxsj()
   { 	    
  	        
      return this.laohuacxsj;     	
   }
 	 	 private String laohuajg;
	 public void setLaohuajg(String laohuajg)
	 {
		  this.laohuajg = laohuajg;
	 }
   public String getLaohuajg()
   { 	    
  	        
      return this.laohuajg;     	
   }
 	 	 private Timestamp laohuajssj;
	 public void setLaohuajssj(Timestamp laohuajssj)
	 {
		  this.laohuajssj = laohuajssj;
	 }
   public Timestamp getLaohuajssj()
   { 	    
  	    	  if( this.laohuajssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.laohuajssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.laohuajssj;     	
   }
 	 	 private Timestamp laohuaqssj;
	 public void setLaohuaqssj(Timestamp laohuaqssj)
	 {
		  this.laohuaqssj = laohuaqssj;
	 }
   public Timestamp getLaohuaqssj()
   { 	    
  	    	  if( this.laohuaqssj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.laohuaqssj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.laohuaqssj;     	
   }
 	 	 private String laohuaren;
	 public void setLaohuaren(String laohuaren)
	 {
		  this.laohuaren = laohuaren;
	 }
   public String getLaohuaren()
   { 	    
  	        
      return this.laohuaren;     	
   }
 	 	 private Date laohuarq;
	 public void setLaohuarq(Date laohuarq)
	 {
		  this.laohuarq = laohuarq;
	 }
   public Date getLaohuarq()
   { 	    
  	  	    if( this.laohuarq != null )
	    {
	        return (Date)new ActizDate( this.laohuarq.getTime() );
	    }
	          
      return this.laohuarq;     	
   }
 	 	 private String laohuawd;
	 public void setLaohuawd(String laohuawd)
	 {
		  this.laohuawd = laohuawd;
	 }
   public String getLaohuawd()
   { 	    
  	        
      return this.laohuawd;     	
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
 	 	 private Long scrwid;
	 public void setScrwid(Long scrwid)
	 {
		  this.scrwid = scrwid;
	 }
   public Long getScrwid()
   { 	    
  	        
      return this.scrwid;     	
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
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzceshijl ceshijlidRef;
	 public void setCeshijlidRef(com.actiz.platform.application.dataset.pojo.Atzceshijl ceshijlidRef)
	 {
		  this.ceshijlidRef = ceshijlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzceshijl getCeshijlidRef()
   {
     	return this.ceshijlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchurukdmx chukudmxidRef;
	 public void setChukudmxidRef(com.actiz.platform.application.dataset.pojo.Atzchurukdmx chukudmxidRef)
	 {
		  this.chukudmxidRef = chukudmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchurukdmx getChukudmxidRef()
   {
     	return this.chukudmxidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef;
	 public void setScrwidRef(com.actiz.platform.application.dataset.pojo.Atzscrw scrwidRef)
	 {
		  this.scrwidRef = scrwidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscrw getScrwidRef()
   {
     	return this.scrwidRef;
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