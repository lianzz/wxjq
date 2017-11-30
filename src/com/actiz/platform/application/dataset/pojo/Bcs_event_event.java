package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Bcs_event_event implements Serializable,IPojo
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
	  	 	 private String cron;
	 public void setCron(String cron)
	 {
		  this.cron = cron;
	 }
   public String getCron()
   { 	    
  	        
      return this.cron;     	
   }
 	 	 private Long data_logic_rule;
	 public void setData_logic_rule(Long data_logic_rule)
	 {
		  this.data_logic_rule = data_logic_rule;
	 }
   public Long getData_logic_rule()
   { 	    
  	        
      return this.data_logic_rule;     	
   }
 	 	 private String description;
	 public void setDescription(String description)
	 {
		  this.description = description;
	 }
   public String getDescription()
   { 	    
  	        
      return this.description;     	
   }
 	 	 private Long filter_rule;
	 public void setFilter_rule(Long filter_rule)
	 {
		  this.filter_rule = filter_rule;
	 }
   public Long getFilter_rule()
   { 	    
  	        
      return this.filter_rule;     	
   }
 	 	 private String generate_type;
	 public void setGenerate_type(String generate_type)
	 {
		  this.generate_type = generate_type;
	 }
   public String getGenerate_type()
   { 	    
  	        
      return this.generate_type;     	
   }
 	 	 private String label;
	 public void setLabel(String label)
	 {
		  this.label = label;
	 }
   public String getLabel()
   { 	    
  	        
      return this.label;     	
   }
 	 	 private Long logic_rule;
	 public void setLogic_rule(Long logic_rule)
	 {
		  this.logic_rule = logic_rule;
	 }
   public Long getLogic_rule()
   { 	    
  	        
      return this.logic_rule;     	
   }
 	 	 private String mon_field;
	 public void setMon_field(String mon_field)
	 {
		  this.mon_field = mon_field;
	 }
   public String getMon_field()
   { 	    
  	        
      return this.mon_field;     	
   }
 	 	 private String mon_style;
	 public void setMon_style(String mon_style)
	 {
		  this.mon_style = mon_style;
	 }
   public String getMon_style()
   { 	    
  	        
      return this.mon_style;     	
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
 	 	 private String rel_entity;
	 public void setRel_entity(String rel_entity)
	 {
		  this.rel_entity = rel_entity;
	 }
   public String getRel_entity()
   { 	    
  	        
      return this.rel_entity;     	
   }
 	 	 private String style;
	 public void setStyle(String style)
	 {
		  this.style = style;
	 }
   public String getStyle()
   { 	    
  	        
      return this.style;     	
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