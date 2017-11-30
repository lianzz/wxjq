package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bcs_workflow_instance_history implements Serializable,IPojo
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
	  	 	 private String action_type;
	 public void setAction_type(String action_type)
	 {
		  this.action_type = action_type;
	 }
   public String getAction_type()
   { 	    
  	        
      return this.action_type;     	
   }
 	 	 private Long node_id;
	 public void setNode_id(Long node_id)
	 {
		  this.node_id = node_id;
	 }
   public Long getNode_id()
   { 	    
  	        
      return this.node_id;     	
   }
 	 	 private String node_name;
	 public void setNode_name(String node_name)
	 {
		  this.node_name = node_name;
	 }
   public String getNode_name()
   { 	    
  	        
      return this.node_name;     	
   }
 	 	 private Long process_instance_id;
	 public void setProcess_instance_id(Long process_instance_id)
	 {
		  this.process_instance_id = process_instance_id;
	 }
   public Long getProcess_instance_id()
   { 	    
  	        
      return this.process_instance_id;     	
   }
 	 	 private String remark;
	 public void setRemark(String remark)
	 {
		  this.remark = remark;
	 }
   public String getRemark()
   { 	    
  	        
      return this.remark;     	
   }
 	 	 private Timestamp remarktime;
	 public void setRemarktime(Timestamp remarktime)
	 {
		  this.remarktime = remarktime;
	 }
   public Timestamp getRemarktime()
   { 	    
  	    	  if( this.remarktime != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.remarktime.getTime() );
	    }	      	  	   	  	     	    
            
      return this.remarktime;     	
   }
 	 	 private Long taskinstance_id;
	 public void setTaskinstance_id(Long taskinstance_id)
	 {
		  this.taskinstance_id = taskinstance_id;
	 }
   public Long getTaskinstance_id()
   { 	    
  	        
      return this.taskinstance_id;     	
   }
 	 	 private Long user_id;
	 public void setUser_id(Long user_id)
	 {
		  this.user_id = user_id;
	 }
   public Long getUser_id()
   { 	    
  	        
      return this.user_id;     	
   }
 	 	 private String user_name;
	 public void setUser_name(String user_name)
	 {
		  this.user_name = user_name;
	 }
   public String getUser_name()
   { 	    
  	        
      return this.user_name;     	
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