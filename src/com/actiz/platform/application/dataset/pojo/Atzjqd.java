package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjqd implements Serializable,IPojo
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
	  	 	 private String bh;
	 public void setBh(String bh)
	 {
		  this.bh = bh;
	 }
   public String getBh()
   { 	    
  	        
      return this.bh;     	
   }
 	 	 private Timestamp cjsj;
	 public void setCjsj(Timestamp cjsj)
	 {
		  this.cjsj = cjsj;
	 }
   public Timestamp getCjsj()
   { 	    
  	    	  if( this.cjsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.cjsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.cjsj;     	
   }
 	 	 private Date jssj;
	 public void setJssj(Date jssj)
	 {
		  this.jssj = jssj;
	 }
   public Date getJssj()
   { 	    
  	  	    if( this.jssj != null )
	    {
	        return (Date)new ActizDate( this.jssj.getTime() );
	    }
	          
      return this.jssj;     	
   }
 	 	 private Date kssj;
	 public void setKssj(Date kssj)
	 {
		  this.kssj = kssj;
	 }
   public Date getKssj()
   { 	    
  	  	    if( this.kssj != null )
	    {
	        return (Date)new ActizDate( this.kssj.getTime() );
	    }
	          
      return this.kssj;     	
   }
 	 	 private String lb;
	 public void setLb(String lb)
	 {
		  this.lb = lb;
	 }
   public String getLb()
   { 	    
  	        
      return this.lb;     	
   }
 	 	 private String role;
	 public void setRole(String role)
	 {
		  this.role = role;
	 }
   public String getRole()
   { 	    
  	        
      return this.role;     	
   }
 	 	 private Integer sc;
	 public void setSc(Integer sc)
	 {
		  this.sc = sc;
	 }
   public Integer getSc()
   { 	    
  	        
      return this.sc;     	
   }
 	 	 private String teamsequ;
	 public void setTeamsequ(String teamsequ)
	 {
		  this.teamsequ = teamsequ;
	 }
   public String getTeamsequ()
   { 	    
  	        
      return this.teamsequ;     	
   }
 	 	 private String userseq;
	 public void setUserseq(String userseq)
	 {
		  this.userseq = userseq;
	 }
   public String getUserseq()
   { 	    
  	        
      return this.userseq;     	
   }
 	 	 private Timestamp xgsj;
	 public void setXgsj(Timestamp xgsj)
	 {
		  this.xgsj = xgsj;
	 }
   public Timestamp getXgsj()
   { 	    
  	    	  if( this.xgsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.xgsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.xgsj;     	
   }
 	 	 private Long ygid;
	 public void setYgid(Long ygid)
	 {
		  this.ygid = ygid;
	 }
   public Long getYgid()
   { 	    
  	        
      return this.ygid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg ygidRef;
	 public void setYgidRef(com.actiz.platform.application.dataset.pojo.Atztdyg ygidRef)
	 {
		  this.ygidRef = ygidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getYgidRef()
   {
     	return this.ygidRef;
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