package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzmdm_hetong implements Serializable,IPojo
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
	  	 	 private String vname;
	 public void setVname(String vname)
	 {
		  this.vname = vname;
	 }
   public String getVname()
   { 	    
  	        
      return this.vname;     	
   }
 	 	 private String vaccount;
	 public void setVaccount(String vaccount)
	 {
		  this.vaccount = vaccount;
	 }
   public String getVaccount()
   { 	    
  	        
      return this.vaccount;     	
   }
 	 	 private String companycode;
	 public void setCompanycode(String companycode)
	 {
		  this.companycode = companycode;
	 }
   public String getCompanycode()
   { 	    
  	        
      return this.companycode;     	
   }
 	 	 private String contype;
	 public void setContype(String contype)
	 {
		  this.contype = contype;
	 }
   public String getContype()
   { 	    
  	        
      return this.contype;     	
   }
 	 	 private String compname;
	 public void setCompname(String compname)
	 {
		  this.compname = compname;
	 }
   public String getCompname()
   { 	    
  	        
      return this.compname;     	
   }
 	 	 private String conenddate;
	 public void setConenddate(String conenddate)
	 {
		  this.conenddate = conenddate;
	 }
   public String getConenddate()
   { 	    
  	        
      return this.conenddate;     	
   }
 	 	 private String condept;
	 public void setCondept(String condept)
	 {
		  this.condept = condept;
	 }
   public String getCondept()
   { 	    
  	        
      return this.condept;     	
   }
 	 	 private String concuser;
	 public void setConcuser(String concuser)
	 {
		  this.concuser = concuser;
	 }
   public String getConcuser()
   { 	    
  	        
      return this.concuser;     	
   }
 	 	 private String cname;
	 public void setCname(String cname)
	 {
		  this.cname = cname;
	 }
   public String getCname()
   { 	    
  	        
      return this.cname;     	
   }
 	 	 private String claccount;
	 public void setClaccount(String claccount)
	 {
		  this.claccount = claccount;
	 }
   public String getClaccount()
   { 	    
  	        
      return this.claccount;     	
   }
 	 	 private String compnahyno;
	 public void setCompnahyno(String compnahyno)
	 {
		  this.compnahyno = compnahyno;
	 }
   public String getCompnahyno()
   { 	    
  	        
      return this.compnahyno;     	
   }
 	 	 private String xsidel;
	 public void setXsidel(String xsidel)
	 {
		  this.xsidel = xsidel;
	 }
   public String getXsidel()
   { 	    
  	        
      return this.xsidel;     	
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