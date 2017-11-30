package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzqingjiadan implements Serializable,IPojo
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
 	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private Timestamp qingjiajies;
	 public void setQingjiajies(Timestamp qingjiajies)
	 {
		  this.qingjiajies = qingjiajies;
	 }
   public Timestamp getQingjiajies()
   { 	    
  	    	  if( this.qingjiajies != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.qingjiajies.getTime() );
	    }	      	  	   	  	     	    
            
      return this.qingjiajies;     	
   }
 	 	 private Timestamp qingjiakais;
	 public void setQingjiakais(Timestamp qingjiakais)
	 {
		  this.qingjiakais = qingjiakais;
	 }
   public Timestamp getQingjiakais()
   { 	    
  	    	  if( this.qingjiakais != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.qingjiakais.getTime() );
	    }	      	  	   	  	     	    
            
      return this.qingjiakais;     	
   }
 	 	 private String qingjiashiy;
	 public void setQingjiashiy(String qingjiashiy)
	 {
		  this.qingjiashiy = qingjiashiy;
	 }
   public String getQingjiashiy()
   { 	    
  	        
      return this.qingjiashiy;     	
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
 	 	 private Long yuangongbh;
	 public void setYuangongbh(Long yuangongbh)
	 {
		  this.yuangongbh = yuangongbh;
	 }
   public Long getYuangongbh()
   { 	    
  	        
      return this.yuangongbh;     	
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzyuangong yuangongbhRef;
	 public void setYuangongbhRef(com.actiz.platform.application.dataset.pojo.Atzyuangong yuangongbhRef)
	 {
		  this.yuangongbhRef = yuangongbhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzyuangong getYuangongbhRef()
   {
     	return this.yuangongbhRef;
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