package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkhyinhangzh implements Serializable,IPojo
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
	  	 	 private String beizhu;
	 public void setBeizhu(String beizhu)
	 {
		  this.beizhu = beizhu;
	 }
   public String getBeizhu()
   { 	    
  	        
      return this.beizhu;     	
   }
 	 	 private String kaihuyh;
	 public void setKaihuyh(String kaihuyh)
	 {
		  this.kaihuyh = kaihuyh;
	 }
   public String getKaihuyh()
   { 	    
  	        
      return this.kaihuyh;     	
   }
 	 	 private Long kehuid;
	 public void setKehuid(Long kehuid)
	 {
		  this.kehuid = kehuid;
	 }
   public Long getKehuid()
   { 	    
  	        
      return this.kehuid;     	
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
 	 	 private Date shixiaorq;
	 public void setShixiaorq(Date shixiaorq)
	 {
		  this.shixiaorq = shixiaorq;
	 }
   public Date getShixiaorq()
   { 	    
  	  	    if( this.shixiaorq != null )
	    {
	        return (Date)new ActizDate( this.shixiaorq.getTime() );
	    }
	          
      return this.shixiaorq;     	
   }
 	 	 private String shifouyx;
	 public void setShifouyx(String shifouyx)
	 {
		  this.shifouyx = shifouyx;
	 }
   public String getShifouyx()
   { 	    
  	        
      return this.shifouyx;     	
   }
 	 	 private String shuiwudjh;
	 public void setShuiwudjh(String shuiwudjh)
	 {
		  this.shuiwudjh = shuiwudjh;
	 }
   public String getShuiwudjh()
   { 	    
  	        
      return this.shuiwudjh;     	
   }
 	 	 private String yinhangzh;
	 public void setYinhangzh(String yinhangzh)
	 {
		  this.yinhangzh = yinhangzh;
	 }
   public String getYinhangzh()
   { 	    
  	        
      return this.yinhangzh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef;
	 public void setKehuidRef(com.actiz.platform.application.dataset.pojo.Atzkehu kehuidRef)
	 {
		  this.kehuidRef = kehuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehu getKehuidRef()
   {
     	return this.kehuidRef;
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