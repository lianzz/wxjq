package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzjidukhhz implements Serializable,IPojo
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
	  	 	 private String bum;
	 public void setBum(String bum)
	 {
		  this.bum = bum;
	 }
   public String getBum()
   { 	    
  	        
      return this.bum;     	
   }
 	 	 private String kaohejd;
	 public void setKaohejd(String kaohejd)
	 {
		  this.kaohejd = kaohejd;
	 }
   public String getKaohejd()
   { 	    
  	        
      return this.kaohejd;     	
   }
 	 	 private String nianfen;
	 public void setNianfen(String nianfen)
	 {
		  this.nianfen = nianfen;
	 }
   public String getNianfen()
   { 	    
  	        
      return this.nianfen;     	
   }
 	 	 private String tjjg;
	 public void setTjjg(String tjjg)
	 {
		  this.tjjg = tjjg;
	 }
   public String getTjjg()
   { 	    
  	        
      return this.tjjg;     	
   }
 	 	 private String tongjijg;
	 public void setTongjijg(String tongjijg)
	 {
		  this.tongjijg = tongjijg;
	 }
   public String getTongjijg()
   { 	    
  	        
      return this.tongjijg;     	
   }
 	 	 private String zhibiaor;
	 public void setZhibiaor(String zhibiaor)
	 {
		  this.zhibiaor = zhibiaor;
	 }
   public String getZhibiaor()
   { 	    
  	        
      return this.zhibiaor;     	
   }
 	 	 private Date zhibiaorq;
	 public void setZhibiaorq(Date zhibiaorq)
	 {
		  this.zhibiaorq = zhibiaorq;
	 }
   public Date getZhibiaorq()
   { 	    
  	  	    if( this.zhibiaorq != null )
	    {
	        return (Date)new ActizDate( this.zhibiaorq.getTime() );
	    }
	          
      return this.zhibiaorq;     	
   }
 	 	 private String zhuti;
	 public void setZhuti(String zhuti)
	 {
		  this.zhuti = zhuti;
	 }
   public String getZhuti()
   { 	    
  	        
      return this.zhuti;     	
   }
 	 	 private String zuihouxgr;
	 public void setZuihouxgr(String zuihouxgr)
	 {
		  this.zuihouxgr = zuihouxgr;
	 }
   public String getZuihouxgr()
   { 	    
  	        
      return this.zuihouxgr;     	
   }
 	 	 private Date zuihouxgrq;
	 public void setZuihouxgrq(Date zuihouxgrq)
	 {
		  this.zuihouxgrq = zuihouxgrq;
	 }
   public Date getZuihouxgrq()
   { 	    
  	  	    if( this.zuihouxgrq != null )
	    {
	        return (Date)new ActizDate( this.zuihouxgrq.getTime() );
	    }
	          
      return this.zuihouxgrq;     	
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