package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzzhangwudj implements Serializable,IPojo
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
 	 	 private Double danjia;
	 public void setDanjia(Double danjia)
	 {
		  this.danjia = danjia;
	 }
   public Double getDanjia()
   { 	    
  	        
      return this.danjia;     	
   }
 	 	 private String gzjwxjl;
	 public void setGzjwxjl(String gzjwxjl)
	 {
		  this.gzjwxjl = gzjwxjl;
	 }
   public String getGzjwxjl()
   { 	    
  	        
      return this.gzjwxjl;     	
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
 	 	 private Integer qingdanbm;
	 public void setQingdanbm(Integer qingdanbm)
	 {
		  this.qingdanbm = qingdanbm;
	 }
   public Integer getQingdanbm()
   { 	    
  	        
      return this.qingdanbm;     	
   }
 	 	 private String shengchanph;
	 public void setShengchanph(String shengchanph)
	 {
		  this.shengchanph = shengchanph;
	 }
   public String getShengchanph()
   { 	    
  	        
      return this.shengchanph;     	
   }
 	 	 private Double shijisl;
	 public void setShijisl(Double shijisl)
	 {
		  this.shijisl = shijisl;
	 }
   public Double getShijisl()
   { 	    
  	        
      return this.shijisl;     	
   }
 	 	 private Date shijiwcrq;
	 public void setShijiwcrq(Date shijiwcrq)
	 {
		  this.shijiwcrq = shijiwcrq;
	 }
   public Date getShijiwcrq()
   { 	    
  	  	    if( this.shijiwcrq != null )
	    {
	        return (Date)new ActizDate( this.shijiwcrq.getTime() );
	    }
	          
      return this.shijiwcrq;     	
   }
 	 	 private Integer zhangwubm;
	 public void setZhangwubm(Integer zhangwubm)
	 {
		  this.zhangwubm = zhangwubm;
	 }
   public Integer getZhangwubm()
   { 	    
  	        
      return this.zhangwubm;     	
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