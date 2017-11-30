package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyuangong implements Serializable,IPojo
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
	  	 	 private Long bumenmc;
	 public void setBumenmc(Long bumenmc)
	 {
		  this.bumenmc = bumenmc;
	 }
   public Long getBumenmc()
   { 	    
  	        
      return this.bumenmc;     	
   }
 	 	 private Timestamp lurusj;
	 public void setLurusj(Timestamp lurusj)
	 {
		  this.lurusj = lurusj;
	 }
   public Timestamp getLurusj()
   { 	    
  	    	  if( this.lurusj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.lurusj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.lurusj;     	
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
 	 	 private Date yuangongrz;
	 public void setYuangongrz(Date yuangongrz)
	 {
		  this.yuangongrz = yuangongrz;
	 }
   public Date getYuangongrz()
   { 	    
  	  	    if( this.yuangongrz != null )
	    {
	        return (Date)new ActizDate( this.yuangongrz.getTime() );
	    }
	          
      return this.yuangongrz;     	
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
 	 	 private String xingbie;
	 public void setXingbie(String xingbie)
	 {
		  this.xingbie = xingbie;
	 }
   public String getXingbie()
   { 	    
  	        
      return this.xingbie;     	
   }
 	 	 private String yuangongxl;
	 public void setYuangongxl(String yuangongxl)
	 {
		  this.yuangongxl = yuangongxl;
	 }
   public String getYuangongxl()
   { 	    
  	        
      return this.yuangongxl;     	
   }
 	 	 private String yuangongid;
	 public void setYuangongid(String yuangongid)
	 {
		  this.yuangongid = yuangongid;
	 }
   public String getYuangongid()
   { 	    
  	        
      return this.yuangongid;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzbumen bumenmcRef;
	 public void setBumenmcRef(com.actiz.platform.application.dataset.pojo.Atzbumen bumenmcRef)
	 {
		  this.bumenmcRef = bumenmcRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbumen getBumenmcRef()
   {
     	return this.bumenmcRef;
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