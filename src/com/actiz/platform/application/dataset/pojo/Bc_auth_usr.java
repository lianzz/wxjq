package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bc_auth_usr implements Serializable,IPojo
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
	  	 	 private String artificialperson;
	 public void setArtificialperson(String artificialperson)
	 {
		  this.artificialperson = artificialperson;
	 }
   public String getArtificialperson()
   { 	    
  	        
      return this.artificialperson;     	
   }
 	 	 private String company_code;
	 public void setCompany_code(String company_code)
	 {
		  this.company_code = company_code;
	 }
   public String getCompany_code()
   { 	    
  	        
      return this.company_code;     	
   }
 	 	 private String companyaddress;
	 public void setCompanyaddress(String companyaddress)
	 {
		  this.companyaddress = companyaddress;
	 }
   public String getCompanyaddress()
   { 	    
  	        
      return this.companyaddress;     	
   }
 	 	 private String descn;
	 public void setDescn(String descn)
	 {
		  this.descn = descn;
	 }
   public String getDescn()
   { 	    
  	        
      return this.descn;     	
   }
 	 	 private Integer easy;
	 public void setEasy(Integer easy)
	 {
		  this.easy = easy;
	 }
   public Integer getEasy()
   { 	    
  	        
      return this.easy;     	
   }
 	 	 private String email;
	 public void setEmail(String email)
	 {
		  this.email = email;
	 }
   public String getEmail()
   { 	    
  	        
      return this.email;     	
   }
 	 	 private Long empid;
	 public void setEmpid(Long empid)
	 {
		  this.empid = empid;
	 }
   public Long getEmpid()
   { 	    
  	        
      return this.empid;     	
   }
 	 	 private String employee_name;
	 public void setEmployee_name(String employee_name)
	 {
		  this.employee_name = employee_name;
	 }
   public String getEmployee_name()
   { 	    
  	        
      return this.employee_name;     	
   }
 	 	 private String empseq;
	 public void setEmpseq(String empseq)
	 {
		  this.empseq = empseq;
	 }
   public String getEmpseq()
   { 	    
  	        
      return this.empseq;     	
   }
 	 	 private Integer isevolve;
	 public void setIsevolve(Integer isevolve)
	 {
		  this.isevolve = isevolve;
	 }
   public Integer getIsevolve()
   { 	    
  	        
      return this.isevolve;     	
   }
 	 	 private String linkman;
	 public void setLinkman(String linkman)
	 {
		  this.linkman = linkman;
	 }
   public String getLinkman()
   { 	    
  	        
      return this.linkman;     	
   }
 	 	 private String linkphone;
	 public void setLinkphone(String linkphone)
	 {
		  this.linkphone = linkphone;
	 }
   public String getLinkphone()
   { 	    
  	        
      return this.linkphone;     	
   }
 	 	 private String loginid;
	 public void setLoginid(String loginid)
	 {
		  this.loginid = loginid;
	 }
   public String getLoginid()
   { 	    
  	        
      return this.loginid;     	
   }
 	 	 private String mobilephone;
	 public void setMobilephone(String mobilephone)
	 {
		  this.mobilephone = mobilephone;
	 }
   public String getMobilephone()
   { 	    
  	        
      return this.mobilephone;     	
   }
 	 	 private Long module_id;
	 public void setModule_id(Long module_id)
	 {
		  this.module_id = module_id;
	 }
   public Long getModule_id()
   { 	    
  	        
      return this.module_id;     	
   }
 	 	 private String name;
	 public void setName(String name)
	 {
		  this.name = name;
	 }
   public String getName()
   { 	    
  	        
      return this.name;     	
   }
 	 	 private String passwd;
	 public void setPasswd(String passwd)
	 {
		  this.passwd = passwd;
	 }
   public String getPasswd()
   { 	    
  	        
      return this.passwd;     	
   }
 	 	 private Long relatecompanyid;
	 public void setRelatecompanyid(Long relatecompanyid)
	 {
		  this.relatecompanyid = relatecompanyid;
	 }
   public Long getRelatecompanyid()
   { 	    
  	        
      return this.relatecompanyid;     	
   }
 	 	 private String securityanswer1;
	 public void setSecurityanswer1(String securityanswer1)
	 {
		  this.securityanswer1 = securityanswer1;
	 }
   public String getSecurityanswer1()
   { 	    
  	        
      return this.securityanswer1;     	
   }
 	 	 private String securityanswer2;
	 public void setSecurityanswer2(String securityanswer2)
	 {
		  this.securityanswer2 = securityanswer2;
	 }
   public String getSecurityanswer2()
   { 	    
  	        
      return this.securityanswer2;     	
   }
 	 	 private String securityquestion1;
	 public void setSecurityquestion1(String securityquestion1)
	 {
		  this.securityquestion1 = securityquestion1;
	 }
   public String getSecurityquestion1()
   { 	    
  	        
      return this.securityquestion1;     	
   }
 	 	 private String securityquestion2;
	 public void setSecurityquestion2(String securityquestion2)
	 {
		  this.securityquestion2 = securityquestion2;
	 }
   public String getSecurityquestion2()
   { 	    
  	        
      return this.securityquestion2;     	
   }
 	 	 private String sn;
	 public void setSn(String sn)
	 {
		  this.sn = sn;
	 }
   public String getSn()
   { 	    
  	        
      return this.sn;     	
   }
 	 	 private String status;
	 public void setStatus(String status)
	 {
		  this.status = status;
	 }
   public String getStatus()
   { 	    
  	        
      return this.status;     	
   }
 	 	 private Long team_employee_id;
	 public void setTeam_employee_id(Long team_employee_id)
	 {
		  this.team_employee_id = team_employee_id;
	 }
   public Long getTeam_employee_id()
   { 	    
  	        
      return this.team_employee_id;     	
   }
 	 	 private String teamseq;
	 public void setTeamseq(String teamseq)
	 {
		  this.teamseq = teamseq;
	 }
   public String getTeamseq()
   { 	    
  	        
      return this.teamseq;     	
   }
 	 	 private String zipcode;
	 public void setZipcode(String zipcode)
	 {
		  this.zipcode = zipcode;
	 }
   public String getZipcode()
   { 	    
  	        
      return this.zipcode;     	
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