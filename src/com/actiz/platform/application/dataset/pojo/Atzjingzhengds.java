package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjingzhengds implements Serializable,IPojo
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
	  	 	 private String gaikuang;
	 public void setGaikuang(String gaikuang)
	 {
		  this.gaikuang = gaikuang;
	 }
   public String getGaikuang()
   { 	    
  	        
      return this.gaikuang;     	
   }
 	 	 private String gongsimc;
	 public void setGongsimc(String gongsimc)
	 {
		  this.gongsimc = gongsimc;
	 }
   public String getGongsimc()
   { 	    
  	        
      return this.gongsimc;     	
   }
 	 	 private String jingzhengnl;
	 public void setJingzhengnl(String jingzhengnl)
	 {
		  this.jingzhengnl = jingzhengnl;
	 }
   public String getJingzhengnl()
   { 	    
  	        
      return this.jingzhengnl;     	
   }
 	 	 private String kehupj;
	 public void setKehupj(String kehupj)
	 {
		  this.kehupj = kehupj;
	 }
   public String getKehupj()
   { 	    
  	        
      return this.kehupj;     	
   }
 	 	 private String lieshi;
	 public void setLieshi(String lieshi)
	 {
		  this.lieshi = lieshi;
	 }
   public String getLieshi()
   { 	    
  	        
      return this.lieshi;     	
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
 	 	 private Long xiaoshoujhid;
	 public void setXiaoshoujhid(Long xiaoshoujhid)
	 {
		  this.xiaoshoujhid = xiaoshoujhid;
	 }
   public Long getXiaoshoujhid()
   { 	    
  	        
      return this.xiaoshoujhid;     	
   }
 	 	 private String yingduicl;
	 public void setYingduicl(String yingduicl)
	 {
		  this.yingduicl = yingduicl;
	 }
   public String getYingduicl()
   { 	    
  	        
      return this.yingduicl;     	
   }
 	 	 private String youshi;
	 public void setYoushi(String youshi)
	 {
		  this.youshi = youshi;
	 }
   public String getYoushi()
   { 	    
  	        
      return this.youshi;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef;
	 public void setXiaoshoujhidRef(com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh xiaoshoujhidRef)
	 {
		  this.xiaoshoujhidRef = xiaoshoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiaoshoujh getXiaoshoujhidRef()
   {
     	return this.xiaoshoujhidRef;
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