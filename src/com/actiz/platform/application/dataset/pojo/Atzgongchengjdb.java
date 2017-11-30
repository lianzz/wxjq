package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgongchengjdb implements Serializable,IPojo
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
	  	 	 private String dijiaowd;
	 public void setDijiaowd(String dijiaowd)
	 {
		  this.dijiaowd = dijiaowd;
	 }
   public String getDijiaowd()
   { 	    
  	        
      return this.dijiaowd;     	
   }
 	 	 private String gongchengjh;
	 public void setGongchengjh(String gongchengjh)
	 {
		  this.gongchengjh = gongchengjh;
	 }
   public String getGongchengjh()
   { 	    
  	        
      return this.gongchengjh;     	
   }
 	 	 private String jihuatzyy;
	 public void setJihuatzyy(String jihuatzyy)
	 {
		  this.jihuatzyy = jihuatzyy;
	 }
   public String getJihuatzyy()
   { 	    
  	        
      return this.jihuatzyy;     	
   }
 	 	 private Date jihuajssj;
	 public void setJihuajssj(Date jihuajssj)
	 {
		  this.jihuajssj = jihuajssj;
	 }
   public Date getJihuajssj()
   { 	    
  	  	    if( this.jihuajssj != null )
	    {
	        return (Date)new ActizDate( this.jihuajssj.getTime() );
	    }
	          
      return this.jihuajssj;     	
   }
 	 	 private Date jihuakssj;
	 public void setJihuakssj(Date jihuakssj)
	 {
		  this.jihuakssj = jihuakssj;
	 }
   public Date getJihuakssj()
   { 	    
  	  	    if( this.jihuakssj != null )
	    {
	        return (Date)new ActizDate( this.jihuakssj.getTime() );
	    }
	          
      return this.jihuakssj;     	
   }
 	 	 private String jihuanr;
	 public void setJihuanr(String jihuanr)
	 {
		  this.jihuanr = jihuanr;
	 }
   public String getJihuanr()
   { 	    
  	        
      return this.jihuanr;     	
   }
 	 	 private String jufangph;
	 public void setJufangph(String jufangph)
	 {
		  this.jufangph = jufangph;
	 }
   public String getJufangph()
   { 	    
  	        
      return this.jufangph;     	
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
 	 	 private Date shijijsrq;
	 public void setShijijsrq(Date shijijsrq)
	 {
		  this.shijijsrq = shijijsrq;
	 }
   public Date getShijijsrq()
   { 	    
  	  	    if( this.shijijsrq != null )
	    {
	        return (Date)new ActizDate( this.shijijsrq.getTime() );
	    }
	          
      return this.shijijsrq;     	
   }
 	 	 private Date shijiksrq;
	 public void setShijiksrq(Date shijiksrq)
	 {
		  this.shijiksrq = shijiksrq;
	 }
   public Date getShijiksrq()
   { 	    
  	  	    if( this.shijiksrq != null )
	    {
	        return (Date)new ActizDate( this.shijiksrq.getTime() );
	    }
	          
      return this.shijiksrq;     	
   }
 	 	 private String shifoutj;
	 public void setShifoutj(String shifoutj)
	 {
		  this.shifoutj = shifoutj;
	 }
   public String getShifoutj()
   { 	    
  	        
      return this.shifoutj;     	
   }
 	 	 private String suoxuzy;
	 public void setSuoxuzy(String suoxuzy)
	 {
		  this.suoxuzy = suoxuzy;
	 }
   public String getSuoxuzy()
   { 	    
  	        
      return this.suoxuzy;     	
   }
 	 	 private String wanchengqkms;
	 public void setWanchengqkms(String wanchengqkms)
	 {
		  this.wanchengqkms = wanchengqkms;
	 }
   public String getWanchengqkms()
   { 	    
  	        
      return this.wanchengqkms;     	
   }
 	 	 private String wendangfj;
	 public void setWendangfj(String wendangfj)
	 {
		  this.wendangfj = wendangfj;
	 }
   public String getWendangfj()
   { 	    
  	        
      return this.wendangfj;     	
   }
 	 	 private Date wendangscsj;
	 public void setWendangscsj(Date wendangscsj)
	 {
		  this.wendangscsj = wendangscsj;
	 }
   public Date getWendangscsj()
   { 	    
  	  	    if( this.wendangscsj != null )
	    {
	        return (Date)new ActizDate( this.wendangscsj.getTime() );
	    }
	          
      return this.wendangscsj;     	
   }
 	 	 private Long xiangmupqid;
	 public void setXiangmupqid(Long xiangmupqid)
	 {
		  this.xiangmupqid = xiangmupqid;
	 }
   public Long getXiangmupqid()
   { 	    
  	        
      return this.xiangmupqid;     	
   }
 	 	 private Integer xuhao;
	 public void setXuhao(Integer xuhao)
	 {
		  this.xuhao = xuhao;
	 }
   public Integer getXuhao()
   { 	    
  	        
      return this.xuhao;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqidRef;
	 public void setXiangmupqidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqidRef)
	 {
		  this.xiangmupqidRef = xiangmupqidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupqd getXiangmupqidRef()
   {
     	return this.xiangmupqidRef;
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