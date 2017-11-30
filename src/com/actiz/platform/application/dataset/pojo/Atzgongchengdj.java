package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzgongchengdj implements Serializable,IPojo
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
 	 	 private String duiyinghth;
	 public void setDuiyinghth(String duiyinghth)
	 {
		  this.duiyinghth = duiyinghth;
	 }
   public String getDuiyinghth()
   { 	    
  	        
      return this.duiyinghth;     	
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
 	 	 private String ggdhdd;
	 public void setGgdhdd(String ggdhdd)
	 {
		  this.ggdhdd = ggdhdd;
	 }
   public String getGgdhdd()
   { 	    
  	        
      return this.ggdhdd;     	
   }
 	 	 private String gongchengfzr;
	 public void setGongchengfzr(String gongchengfzr)
	 {
		  this.gongchengfzr = gongchengfzr;
	 }
   public String getGongchengfzr()
   { 	    
  	        
      return this.gongchengfzr;     	
   }
 	 	 private String gongchengmc;
	 public void setGongchengmc(String gongchengmc)
	 {
		  this.gongchengmc = gongchengmc;
	 }
   public String getGongchengmc()
   { 	    
  	        
      return this.gongchengmc;     	
   }
 	 	 private String hetongmc;
	 public void setHetongmc(String hetongmc)
	 {
		  this.hetongmc = hetongmc;
	 }
   public String getHetongmc()
   { 	    
  	        
      return this.hetongmc;     	
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
 	 	 private String khhgsy;
	 public void setKhhgsy(String khhgsy)
	 {
		  this.khhgsy = khhgsy;
	 }
   public String getKhhgsy()
   { 	    
  	        
      return this.khhgsy;     	
   }
 	 	 private String khhgyslxr;
	 public void setKhhgyslxr(String khhgyslxr)
	 {
		  this.khhgyslxr = khhgyslxr;
	 }
   public String getKhhgyslxr()
   { 	    
  	        
      return this.khhgyslxr;     	
   }
 	 	 private String khhgysmc;
	 public void setKhhgysmc(String khhgysmc)
	 {
		  this.khhgysmc = khhgysmc;
	 }
   public String getKhhgysmc()
   { 	    
  	        
      return this.khhgysmc;     	
   }
 	 	 private String wenjianfj;
	 public void setWenjianfj(String wenjianfj)
	 {
		  this.wenjianfj = wenjianfj;
	 }
   public String getWenjianfj()
   { 	    
  	        
      return this.wenjianfj;     	
   }
 	 	 private Integer xiangmuhcpbm;
	 public void setXiangmuhcpbm(Integer xiangmuhcpbm)
	 {
		  this.xiangmuhcpbm = xiangmuhcpbm;
	 }
   public Integer getXiangmuhcpbm()
   { 	    
  	        
      return this.xiangmuhcpbm;     	
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