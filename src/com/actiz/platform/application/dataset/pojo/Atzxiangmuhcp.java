package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiangmuhcp implements Serializable,IPojo
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
	  	 	 private String chanpinjl;
	 public void setChanpinjl(String chanpinjl)
	 {
		  this.chanpinjl = chanpinjl;
	 }
   public String getChanpinjl()
   { 	    
  	        
      return this.chanpinjl;     	
   }
 	 	 private String feiyongbm;
	 public void setFeiyongbm(String feiyongbm)
	 {
		  this.feiyongbm = feiyongbm;
	 }
   public String getFeiyongbm()
   { 	    
  	        
      return this.feiyongbm;     	
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
 	 	 private Integer xiangmuhcpbm;
	 public void setXiangmuhcpbm(Integer xiangmuhcpbm)
	 {
		  this.xiangmuhcpbm = xiangmuhcpbm;
	 }
   public Integer getXiangmuhcpbm()
   { 	    
  	        
      return this.xiangmuhcpbm;     	
   }
 	 	 private String xiangmuhcpmc;
	 public void setXiangmuhcpmc(String xiangmuhcpmc)
	 {
		  this.xiangmuhcpmc = xiangmuhcpmc;
	 }
   public String getXiangmuhcpmc()
   { 	    
  	        
      return this.xiangmuhcpmc;     	
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