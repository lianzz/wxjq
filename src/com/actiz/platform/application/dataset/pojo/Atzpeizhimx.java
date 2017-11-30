package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzpeizhimx implements Serializable,IPojo
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
 	 	 private Long bujianh;
	 public void setBujianh(Long bujianh)
	 {
		  this.bujianh = bujianh;
	 }
   public Long getBujianh()
   { 	    
  	        
      return this.bujianh;     	
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
 	 	 private Long chanpinpzid;
	 public void setChanpinpzid(Long chanpinpzid)
	 {
		  this.chanpinpzid = chanpinpzid;
	 }
   public Long getChanpinpzid()
   { 	    
  	        
      return this.chanpinpzid;     	
   }
 	 	 private Double danjia;
	 public void setDanjia(Double danjia)
	 {
		  this.danjia = danjia;
	 }
   public Double getDanjia()
   { 	    
  	        
      return this.danjia;     	
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
 	 	 private String heji;
	 public void setHeji(String heji)
	 {
		  this.heji = heji;
	 }
   public String getHeji()
   { 	    
  	        
      return this.heji;     	
   }
 	 	 private Double muluj;
	 public void setMuluj(Double muluj)
	 {
		  this.muluj = muluj;
	 }
   public Double getMuluj()
   { 	    
  	        
      return this.muluj;     	
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
 	 	 private Double zhekou;
	 public void setZhekou(Double zhekou)
	 {
		  this.zhekou = zhekou;
	 }
   public Double getZhekou()
   { 	    
  	        
      return this.zhekou;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm bujianhRef;
	 public void setBujianhRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm bujianhRef)
	 {
		  this.bujianhRef = bujianhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoubm getBujianhRef()
   {
     	return this.bujianhRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpinpz chanpinpzidRef;
	 public void setChanpinpzidRef(com.actiz.platform.application.dataset.pojo.Atzchanpinpz chanpinpzidRef)
	 {
		  this.chanpinpzidRef = chanpinpzidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpinpz getChanpinpzidRef()
   {
     	return this.chanpinpzidRef;
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