package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzrenwudj implements Serializable,IPojo
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
 	 	 private String cangkugly;
	 public void setCangkugly(String cangkugly)
	 {
		  this.cangkugly = cangkugly;
	 }
   public String getCangkugly()
   { 	    
  	        
      return this.cangkugly;     	
   }
 	 	 private String danjubm;
	 public void setDanjubm(String danjubm)
	 {
		  this.danjubm = danjubm;
	 }
   public String getDanjubm()
   { 	    
  	        
      return this.danjubm;     	
   }
 	 	 private Integer gongchengbm;
	 public void setGongchengbm(Integer gongchengbm)
	 {
		  this.gongchengbm = gongchengbm;
	 }
   public Integer getGongchengbm()
   { 	    
  	        
      return this.gongchengbm;     	
   }
 	 	 private Date jihuawcrq;
	 public void setJihuawcrq(Date jihuawcrq)
	 {
		  this.jihuawcrq = jihuawcrq;
	 }
   public Date getJihuawcrq()
   { 	    
  	  	    if( this.jihuawcrq != null )
	    {
	        return (Date)new ActizDate( this.jihuawcrq.getTime() );
	    }
	          
      return this.jihuawcrq;     	
   }
 	 	 private String jihuay;
	 public void setJihuay(String jihuay)
	 {
		  this.jihuay = jihuay;
	 }
   public String getJihuay()
   { 	    
  	        
      return this.jihuay;     	
   }
 	 	 private Date jiandangrq;
	 public void setJiandangrq(Date jiandangrq)
	 {
		  this.jiandangrq = jiandangrq;
	 }
   public Date getJiandangrq()
   { 	    
  	  	    if( this.jiandangrq != null )
	    {
	        return (Date)new ActizDate( this.jiandangrq.getTime() );
	    }
	          
      return this.jiandangrq;     	
   }
 	 	 private String llhckry;
	 public void setLlhckry(String llhckry)
	 {
		  this.llhckry = llhckry;
	 }
   public String getLlhckry()
   { 	    
  	        
      return this.llhckry;     	
   }
 	 	 private String qingdanfj;
	 public void setQingdanfj(String qingdanfj)
	 {
		  this.qingdanfj = qingdanfj;
	 }
   public String getQingdanfj()
   { 	    
  	        
      return this.qingdanfj;     	
   }
 	 	 private Integer renwubm;
	 public void setRenwubm(Integer renwubm)
	 {
		  this.renwubm = renwubm;
	 }
   public Integer getRenwubm()
   { 	    
  	        
      return this.renwubm;     	
   }
 	 	 private String renwuzt;
	 public void setRenwuzt(String renwuzt)
	 {
		  this.renwuzt = renwuzt;
	 }
   public String getRenwuzt()
   { 	    
  	        
      return this.renwuzt;     	
   }
 	 	 private String rukuhckyy;
	 public void setRukuhckyy(String rukuhckyy)
	 {
		  this.rukuhckyy = rukuhckyy;
	 }
   public String getRukuhckyy()
   { 	    
  	        
      return this.rukuhckyy;     	
   }
 	 	 private String shenher;
	 public void setShenher(String shenher)
	 {
		  this.shenher = shenher;
	 }
   public String getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private String xiangmubm;
	 public void setXiangmubm(String xiangmubm)
	 {
		  this.xiangmubm = xiangmubm;
	 }
   public String getXiangmubm()
   { 	    
  	        
      return this.xiangmubm;     	
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