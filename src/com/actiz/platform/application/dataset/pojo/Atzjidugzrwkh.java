package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjidugzrwkh implements Serializable,IPojo
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
	  	 	 private Long atzjidukhid;
	 public void setAtzjidukhid(Long atzjidukhid)
	 {
		  this.atzjidukhid = atzjidukhid;
	 }
   public Long getAtzjidukhid()
   { 	    
  	        
      return this.atzjidukhid;     	
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
 	 	 private String jidugzlb;
	 public void setJidugzlb(String jidugzlb)
	 {
		  this.jidugzlb = jidugzlb;
	 }
   public String getJidugzlb()
   { 	    
  	        
      return this.jidugzlb;     	
   }
 	 	 private Double kaohef;
	 public void setKaohef(Double kaohef)
	 {
		  this.kaohef = kaohef;
	 }
   public Double getKaohef()
   { 	    
  	        
      return this.kaohef;     	
   }
 	 	 private Double quanzhong;
	 public void setQuanzhong(Double quanzhong)
	 {
		  this.quanzhong = quanzhong;
	 }
   public Double getQuanzhong()
   { 	    
  	        
      return this.quanzhong;     	
   }
 	 	 private Date renwujssj;
	 public void setRenwujssj(Date renwujssj)
	 {
		  this.renwujssj = renwujssj;
	 }
   public Date getRenwujssj()
   { 	    
  	  	    if( this.renwujssj != null )
	    {
	        return (Date)new ActizDate( this.renwujssj.getTime() );
	    }
	          
      return this.renwujssj;     	
   }
 	 	 private Date renwukssj;
	 public void setRenwukssj(Date renwukssj)
	 {
		  this.renwukssj = renwukssj;
	 }
   public Date getRenwukssj()
   { 	    
  	  	    if( this.renwukssj != null )
	    {
	        return (Date)new ActizDate( this.renwukssj.getTime() );
	    }
	          
      return this.renwukssj;     	
   }
 	 	 private Double renwuwczwpj;
	 public void setRenwuwczwpj(Double renwuwczwpj)
	 {
		  this.renwuwczwpj = renwuwczwpj;
	 }
   public Double getRenwuwczwpj()
   { 	    
  	        
      return this.renwuwczwpj;     	
   }
 	 	 private Double shijigzfh;
	 public void setShijigzfh(Double shijigzfh)
	 {
		  this.shijigzfh = shijigzfh;
	 }
   public Double getShijigzfh()
   { 	    
  	        
      return this.shijigzfh;     	
   }
 	 	 private String shijiwcqk;
	 public void setShijiwcqk(String shijiwcqk)
	 {
		  this.shijiwcqk = shijiwcqk;
	 }
   public String getShijiwcqk()
   { 	    
  	        
      return this.shijiwcqk;     	
   }
 	 	 private Double zhuguanpf;
	 public void setZhuguanpf(Double zhuguanpf)
	 {
		  this.zhuguanpf = zhuguanpf;
	 }
   public Double getZhuguanpf()
   { 	    
  	        
      return this.zhuguanpf;     	
   }
 	 	 private Double zhuguanpg;
	 public void setZhuguanpg(Double zhuguanpg)
	 {
		  this.zhuguanpg = zhuguanpg;
	 }
   public Double getZhuguanpg()
   { 	    
  	        
      return this.zhuguanpg;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzjidukh atzjidukhidRef;
	 public void setAtzjidukhidRef(com.actiz.platform.application.dataset.pojo.Atzjidukh atzjidukhidRef)
	 {
		  this.atzjidukhidRef = atzjidukhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzjidukh getAtzjidukhidRef()
   {
     	return this.atzjidukhidRef;
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