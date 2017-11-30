package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzweixiujlzb implements Serializable,IPojo
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
	  	 	 private Long atzweixiujlid;
	 public void setAtzweixiujlid(Long atzweixiujlid)
	 {
		  this.atzweixiujlid = atzweixiujlid;
	 }
   public Long getAtzweixiujlid()
   { 	    
  	        
      return this.atzweixiujlid;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private Date genghuanrq;
	 public void setGenghuanrq(Date genghuanrq)
	 {
		  this.genghuanrq = genghuanrq;
	 }
   public Date getGenghuanrq()
   { 	    
  	  	    if( this.genghuanrq != null )
	    {
	        return (Date)new ActizDate( this.genghuanrq.getTime() );
	    }
	          
      return this.genghuanrq;     	
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
 	 	 private String weihao;
	 public void setWeihao(String weihao)
	 {
		  this.weihao = weihao;
	 }
   public String getWeihao()
   { 	    
  	        
      return this.weihao;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzweixiujl atzweixiujlidRef;
	 public void setAtzweixiujlidRef(com.actiz.platform.application.dataset.pojo.Atzweixiujl atzweixiujlidRef)
	 {
		  this.atzweixiujlidRef = atzweixiujlidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzweixiujl getAtzweixiujlidRef()
   {
     	return this.atzweixiujlidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
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