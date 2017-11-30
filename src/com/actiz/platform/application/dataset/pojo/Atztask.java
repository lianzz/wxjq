package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atztask implements Serializable,IPojo
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
	  	 	 private String carboncopy;
	 public void setCarboncopy(String carboncopy)
	 {
		  this.carboncopy = carboncopy;
	 }
   public String getCarboncopy()
   { 	    
  	        
      return this.carboncopy;     	
   }
 	 	 private Timestamp createtime;
	 public void setCreatetime(Timestamp createtime)
	 {
		  this.createtime = createtime;
	 }
   public Timestamp getCreatetime()
   { 	    
  	    	  if( this.createtime != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.createtime.getTime() );
	    }	      	  	   	  	     	    
            
      return this.createtime;     	
   }
 	 	 private String groupid;
	 public void setGroupid(String groupid)
	 {
		  this.groupid = groupid;
	 }
   public String getGroupid()
   { 	    
  	        
      return this.groupid;     	
   }
 	 	 private Double assignpolicy;
	 public void setAssignpolicy(Double assignpolicy)
	 {
		  this.assignpolicy = assignpolicy;
	 }
   public Double getAssignpolicy()
   { 	    
  	        
      return this.assignpolicy;     	
   }
 	 	 private Long processinsid;
	 public void setProcessinsid(Long processinsid)
	 {
		  this.processinsid = processinsid;
	 }
   public Long getProcessinsid()
   { 	    
  	        
      return this.processinsid;     	
   }
 	 	 private Timestamp starttime;
	 public void setStarttime(Timestamp starttime)
	 {
		  this.starttime = starttime;
	 }
   public Timestamp getStarttime()
   { 	    
  	    	  if( this.starttime != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.starttime.getTime() );
	    }	      	  	   	  	     	    
            
      return this.starttime;     	
   }
 	 	 private String processname;
	 public void setProcessname(String processname)
	 {
		  this.processname = processname;
	 }
   public String getProcessname()
   { 	    
  	        
      return this.processname;     	
   }
 	 	 private String participants;
	 public void setParticipants(String participants)
	 {
		  this.participants = participants;
	 }
   public String getParticipants()
   { 	    
  	        
      return this.participants;     	
   }
 	 	 private String tasksource;
	 public void setTasksource(String tasksource)
	 {
		  this.tasksource = tasksource;
	 }
   public String getTasksource()
   { 	    
  	        
      return this.tasksource;     	
   }
 	 	 private String tasktype;
	 public void setTasktype(String tasktype)
	 {
		  this.tasktype = tasktype;
	 }
   public String getTasktype()
   { 	    
  	        
      return this.tasktype;     	
   }
 	 	 private Long tasktypeid;
	 public void setTasktypeid(Long tasktypeid)
	 {
		  this.tasktypeid = tasktypeid;
	 }
   public Long getTasktypeid()
   { 	    
  	        
      return this.tasktypeid;     	
   }
 	 	 private String descript;
	 public void setDescript(String descript)
	 {
		  this.descript = descript;
	 }
   public String getDescript()
   { 	    
  	        
      return this.descript;     	
   }
 	 	 private Long taskinstance;
	 public void setTaskinstance(Long taskinstance)
	 {
		  this.taskinstance = taskinstance;
	 }
   public Long getTaskinstance()
   { 	    
  	        
      return this.taskinstance;     	
   }
 	 	 private Timestamp processdt;
	 public void setProcessdt(Timestamp processdt)
	 {
		  this.processdt = processdt;
	 }
   public Timestamp getProcessdt()
   { 	    
  	    	  if( this.processdt != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.processdt.getTime() );
	    }	      	  	   	  	     	    
            
      return this.processdt;     	
   }
 	 	 private String state;
	 public void setState(String state)
	 {
		  this.state = state;
	 }
   public String getState()
   { 	    
  	        
      return this.state;     	
   }
 	 	 private String isassign;
	 public void setIsassign(String isassign)
	 {
		  this.isassign = isassign;
	 }
   public String getIsassign()
   { 	    
  	        
      return this.isassign;     	
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
 	 	 private String doneuserseq;
	 public void setDoneuserseq(String doneuserseq)
	 {
		  this.doneuserseq = doneuserseq;
	 }
   public String getDoneuserseq()
   { 	    
  	        
      return this.doneuserseq;     	
   }
 	 	 private String executor;
	 public void setExecutor(String executor)
	 {
		  this.executor = executor;
	 }
   public String getExecutor()
   { 	    
  	        
      return this.executor;     	
   }
 	 	 private String theme;
	 public void setTheme(String theme)
	 {
		  this.theme = theme;
	 }
   public String getTheme()
   { 	    
  	        
      return this.theme;     	
   }
 	 	 private String customtemp;
	 public void setCustomtemp(String customtemp)
	 {
		  this.customtemp = customtemp;
	 }
   public String getCustomtemp()
   { 	    
  	        
      return this.customtemp;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Bcs_workflow_task tasktypeidRef;
	 public void setTasktypeidRef(com.actiz.platform.application.dataset.pojo.Bcs_workflow_task tasktypeidRef)
	 {
		  this.tasktypeidRef = tasktypeidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Bcs_workflow_task getTasktypeidRef()
   {
     	return this.tasktypeidRef;
   }
  
	private java.util.Set atzrelatedboSet;
	public void setAtzrelatedboSet(java.util.Set atzrelatedboSet)
	{
		 this.atzrelatedboSet = atzrelatedboSet;
	}
  public java.util.Set getAtzrelatedboSet()
  {
     return this.atzrelatedboSet;
  }
 
	private java.util.Set atzactivityboSet;
	public void setAtzactivityboSet(java.util.Set atzactivityboSet)
	{
		 this.atzactivityboSet = atzactivityboSet;
	}
  public java.util.Set getAtzactivityboSet()
  {
     return this.atzactivityboSet;
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