package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpzmxbgjl implements Serializable,IPojo
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
	  	 	 private Double hshuliang;
	 public void setHshuliang(Double hshuliang)
	 {
		  this.hshuliang = hshuliang;
	 }
   public Double getHshuliang()
   { 	    
  	        
      return this.hshuliang;     	
   }
 	 	 private String bglx;
	 public void setBglx(String bglx)
	 {
		  this.bglx = bglx;
	 }
   public String getBglx()
   { 	    
  	        
      return this.bglx;     	
   }
 	 	 private Double qshuliang;
	 public void setQshuliang(Double qshuliang)
	 {
		  this.qshuliang = qshuliang;
	 }
   public Double getQshuliang()
   { 	    
  	        
      return this.qshuliang;     	
   }
 	 	 private Long bujianhao;
	 public void setBujianhao(Long bujianhao)
	 {
		  this.bujianhao = bujianhao;
	 }
   public Long getBujianhao()
   { 	    
  	        
      return this.bujianhao;     	
   }
 	 	 private String chandi;
	 public void setChandi(String chandi)
	 {
		  this.chandi = chandi;
	 }
   public String getChandi()
   { 	    
  	        
      return this.chandi;     	
   }
 	 	 private Long changjia;
	 public void setChangjia(Long changjia)
	 {
		  this.changjia = changjia;
	 }
   public Long getChangjia()
   { 	    
  	        
      return this.changjia;     	
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Long pzid;
	 public void setPzid(Long pzid)
	 {
		  this.pzid = pzid;
	 }
   public Long getPzid()
   { 	    
  	        
      return this.pzid;     	
   }
 	 	 private Long xiangmupzmxid;
	 public void setXiangmupzmxid(Long xiangmupzmxid)
	 {
		  this.xiangmupzmxid = xiangmupzmxid;
	 }
   public Long getXiangmupzmxid()
   { 	    
  	        
      return this.xiangmupzmxid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm bujianhaoRef;
	 public void setBujianhaoRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm bujianhaoRef)
	 {
		  this.bujianhaoRef = bujianhaoRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getBujianhaoRef()
   {
     	return this.bujianhaoRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzshengchancj changjiaRef;
	 public void setChangjiaRef(com.actiz.platform.application.dataset.pojo.Atzshengchancj changjiaRef)
	 {
		  this.changjiaRef = changjiaRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzshengchancj getChangjiaRef()
   {
     	return this.changjiaRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd pzidRef;
	 public void setPzidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd pzidRef)
	 {
		  this.pzidRef = pzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupzqd getPzidRef()
   {
     	return this.pzidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupzmx xiangmupzmxidRef;
	 public void setXiangmupzmxidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupzmx xiangmupzmxidRef)
	 {
		  this.xiangmupzmxidRef = xiangmupzmxidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupzmx getXiangmupzmxidRef()
   {
     	return this.xiangmupzmxidRef;
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