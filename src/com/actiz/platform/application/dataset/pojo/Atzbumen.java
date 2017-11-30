package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzbumen implements Serializable,IPojo
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
	  	 	 private String bumenbh;
	 public void setBumenbh(String bumenbh)
	 {
		  this.bumenbh = bumenbh;
	 }
   public String getBumenbh()
   { 	    
  	        
      return this.bumenbh;     	
   }
 	 	 private Long bumenfzr;
	 public void setBumenfzr(Long bumenfzr)
	 {
		  this.bumenfzr = bumenfzr;
	 }
   public Long getBumenfzr()
   { 	    
  	        
      return this.bumenfzr;     	
   }
 	 	 private String bumenmc;
	 public void setBumenmc(String bumenmc)
	 {
		  this.bumenmc = bumenmc;
	 }
   public String getBumenmc()
   { 	    
  	        
      return this.bumenmc;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzyuangong bumenfzrRef;
	 public void setBumenfzrRef(com.actiz.platform.application.dataset.pojo.Atzyuangong bumenfzrRef)
	 {
		  this.bumenfzrRef = bumenfzrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyuangong getBumenfzrRef()
   {
     	return this.bumenfzrRef;
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