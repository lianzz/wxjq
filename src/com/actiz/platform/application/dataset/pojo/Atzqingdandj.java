package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqingdandj implements Serializable,IPojo
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
 	 	 private String huowulb;
	 public void setHuowulb(String huowulb)
	 {
		  this.huowulb = huowulb;
	 }
   public String getHuowulb()
   { 	    
  	        
      return this.huowulb;     	
   }
 	 	 private Double jihuasl;
	 public void setJihuasl(Double jihuasl)
	 {
		  this.jihuasl = jihuasl;
	 }
   public Double getJihuasl()
   { 	    
  	        
      return this.jihuasl;     	
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
 	 	 private Integer kuweibm;
	 public void setKuweibm(Integer kuweibm)
	 {
		  this.kuweibm = kuweibm;
	 }
   public Integer getKuweibm()
   { 	    
  	        
      return this.kuweibm;     	
   }
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
   }
 	 	 private Integer qingdanbm;
	 public void setQingdanbm(Integer qingdanbm)
	 {
		  this.qingdanbm = qingdanbm;
	 }
   public Integer getQingdanbm()
   { 	    
  	        
      return this.qingdanbm;     	
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
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
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