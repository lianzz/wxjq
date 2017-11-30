package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzyanfasz implements Serializable,IPojo
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
	  	 	 private String danjuzt;
	 public void setDanjuzt(String danjuzt)
	 {
		  this.danjuzt = danjuzt;
	 }
   public String getDanjuzt()
   { 	    
  	        
      return this.danjuzt;     	
   }
 	 	 private String shenhejg;
	 public void setShenhejg(String shenhejg)
	 {
		  this.shenhejg = shenhejg;
	 }
   public String getShenhejg()
   { 	    
  	        
      return this.shenhejg;     	
   }
 	 	 private Date pingshenwcrq;
	 public void setPingshenwcrq(Date pingshenwcrq)
	 {
		  this.pingshenwcrq = pingshenwcrq;
	 }
   public Date getPingshenwcrq()
   { 	    
  	  	    if( this.pingshenwcrq != null )
	    {
	        return (Date)new ActizDate( this.pingshenwcrq.getTime() );
	    }
	          
      return this.pingshenwcrq;     	
   }
 	 	 private String shenheyj;
	 public void setShenheyj(String shenheyj)
	 {
		  this.shenheyj = shenheyj;
	 }
   public String getShenheyj()
   { 	    
  	        
      return this.shenheyj;     	
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
 	 	 private String beizhu1;
	 public void setBeizhu1(String beizhu1)
	 {
		  this.beizhu1 = beizhu1;
	 }
   public String getBeizhu1()
   { 	    
  	        
      return this.beizhu1;     	
   }
 	 	 private String bianhao;
	 public void setBianhao(String bianhao)
	 {
		  this.bianhao = bianhao;
	 }
   public String getBianhao()
   { 	    
  	        
      return this.bianhao;     	
   }
 	 	 private String csbglj;
	 public void setCsbglj(String csbglj)
	 {
		  this.csbglj = csbglj;
	 }
   public String getCsbglj()
   { 	    
  	        
      return this.csbglj;     	
   }
 	 	 private Date csbgwcr;
	 public void setCsbgwcr(Date csbgwcr)
	 {
		  this.csbgwcr = csbgwcr;
	 }
   public Date getCsbgwcr()
   { 	    
  	  	    if( this.csbgwcr != null )
	    {
	        return (Date)new ActizDate( this.csbgwcr.getTime() );
	    }
	          
      return this.csbgwcr;     	
   }
 	 	 private String cyhszwdlj;
	 public void setCyhszwdlj(String cyhszwdlj)
	 {
		  this.cyhszwdlj = cyhszwdlj;
	 }
   public String getCyhszwdlj()
   { 	    
  	        
      return this.cyhszwdlj;     	
   }
 	 	 private String tcbglj;
	 public void setTcbglj(String tcbglj)
	 {
		  this.tcbglj = tcbglj;
	 }
   public String getTcbglj()
   { 	    
  	        
      return this.tcbglj;     	
   }
 	 	 private Date tcbgwcr;
	 public void setTcbgwcr(Date tcbgwcr)
	 {
		  this.tcbgwcr = tcbgwcr;
	 }
   public Date getTcbgwcr()
   { 	    
  	  	    if( this.tcbgwcr != null )
	    {
	        return (Date)new ActizDate( this.tcbgwcr.getTime() );
	    }
	          
      return this.tcbgwcr;     	
   }
 	 	 private Date jihuasscr;
	 public void setJihuasscr(Date jihuasscr)
	 {
		  this.jihuasscr = jihuasscr;
	 }
   public Date getJihuasscr()
   { 	    
  	  	    if( this.jihuasscr != null )
	    {
	        return (Date)new ActizDate( this.jihuasscr.getTime() );
	    }
	          
      return this.jihuasscr;     	
   }
 	 	 private Date jihuawcr;
	 public void setJihuawcr(Date jihuawcr)
	 {
		  this.jihuawcr = jihuawcr;
	 }
   public Date getJihuawcr()
   { 	    
  	  	    if( this.jihuawcr != null )
	    {
	        return (Date)new ActizDate( this.jihuawcr.getTime() );
	    }
	          
      return this.jihuawcr;     	
   }
 	 	 private String lurur;
	 public void setLurur(String lurur)
	 {
		  this.lurur = lurur;
	 }
   public String getLurur()
   { 	    
  	        
      return this.lurur;     	
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
 	 	 private Long pingshenr;
	 public void setPingshenr(Long pingshenr)
	 {
		  this.pingshenr = pingshenr;
	 }
   public Long getPingshenr()
   { 	    
  	        
      return this.pingshenr;     	
   }
 	 	 private Date pingshenzzrq;
	 public void setPingshenzzrq(Date pingshenzzrq)
	 {
		  this.pingshenzzrq = pingshenzzrq;
	 }
   public Date getPingshenzzrq()
   { 	    
  	  	    if( this.pingshenzzrq != null )
	    {
	        return (Date)new ActizDate( this.pingshenzzrq.getTime() );
	    }
	          
      return this.pingshenzzrq;     	
   }
 	 	 private Date sqpsrq;
	 public void setSqpsrq(Date sqpsrq)
	 {
		  this.sqpsrq = sqpsrq;
	 }
   public Date getSqpsrq()
   { 	    
  	  	    if( this.sqpsrq != null )
	    {
	        return (Date)new ActizDate( this.sqpsrq.getTime() );
	    }
	          
      return this.sqpsrq;     	
   }
 	 	 private String sqrtxwdlj;
	 public void setSqrtxwdlj(String sqrtxwdlj)
	 {
		  this.sqrtxwdlj = sqrtxwdlj;
	 }
   public String getSqrtxwdlj()
   { 	    
  	        
      return this.sqrtxwdlj;     	
   }
 	 	 private Date shijiksszr;
	 public void setShijiksszr(Date shijiksszr)
	 {
		  this.shijiksszr = shijiksszr;
	 }
   public Date getShijiksszr()
   { 	    
  	  	    if( this.shijiksszr != null )
	    {
	        return (Date)new ActizDate( this.shijiksszr.getTime() );
	    }
	          
      return this.shijiksszr;     	
   }
 	 	 private Date shishousqdr;
	 public void setShishousqdr(Date shishousqdr)
	 {
		  this.shishousqdr = shishousqdr;
	 }
   public Date getShishousqdr()
   { 	    
  	  	    if( this.shishousqdr != null )
	    {
	        return (Date)new ActizDate( this.shishousqdr.getTime() );
	    }
	          
      return this.shishousqdr;     	
   }
 	 	 private String sfyscscjh;
	 public void setSfyscscjh(String sfyscscjh)
	 {
		  this.sfyscscjh = sfyscscjh;
	 }
   public String getSfyscscjh()
   { 	    
  	        
      return this.sfyscscjh;     	
   }
 	 	 private Date szbgwcr;
	 public void setSzbgwcr(Date szbgwcr)
	 {
		  this.szbgwcr = szbgwcr;
	 }
   public Date getSzbgwcr()
   { 	    
  	  	    if( this.szbgwcr != null )
	    {
	        return (Date)new ActizDate( this.szbgwcr.getTime() );
	    }
	          
      return this.szbgwcr;     	
   }
 	 	 private Date shizhibomscr;
	 public void setShizhibomscr(Date shizhibomscr)
	 {
		  this.shizhibomscr = shizhibomscr;
	 }
   public Date getShizhibomscr()
   { 	    
  	  	    if( this.shizhibomscr != null )
	    {
	        return (Date)new ActizDate( this.shizhibomscr.getTime() );
	    }
	          
      return this.shizhibomscr;     	
   }
 	 	 private String szjl;
	 public void setSzjl(String szjl)
	 {
		  this.szjl = szjl;
	 }
   public String getSzjl()
   { 	    
  	        
      return this.szjl;     	
   }
 	 	 private Date shijirkr;
	 public void setShijirkr(Date shijirkr)
	 {
		  this.shijirkr = shijirkr;
	 }
   public Date getShijirkr()
   { 	    
  	  	    if( this.shijirkr != null )
	    {
	        return (Date)new ActizDate( this.shijirkr.getTime() );
	    }
	          
      return this.shijirkr;     	
   }
 	 	 private Date shishouszwdr;
	 public void setShishouszwdr(Date shishouszwdr)
	 {
		  this.shishouszwdr = shishouszwdr;
	 }
   public Date getShishouszwdr()
   { 	    
  	  	    if( this.shishouszwdr != null )
	    {
	        return (Date)new ActizDate( this.shishouszwdr.getTime() );
	    }
	          
      return this.shishouszwdr;     	
   }
 	 	 private Double shuliang;
	 public void setShuliang(Double shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Double getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private Date tijiaosqrq;
	 public void setTijiaosqrq(Date tijiaosqrq)
	 {
		  this.tijiaosqrq = tijiaosqrq;
	 }
   public Date getTijiaosqrq()
   { 	    
  	  	    if( this.tijiaosqrq != null )
	    {
	        return (Date)new ActizDate( this.tijiaosqrq.getTime() );
	    }
	          
      return this.tijiaosqrq;     	
   }
 	 	 private Date wcwlzbr;
	 public void setWcwlzbr(Date wcwlzbr)
	 {
		  this.wcwlzbr = wcwlzbr;
	 }
   public Date getWcwlzbr()
   { 	    
  	  	    if( this.wcwlzbr != null )
	    {
	        return (Date)new ActizDate( this.wcwlzbr.getTime() );
	    }
	          
      return this.wcwlzbr;     	
   }
 	 	 private Timestamp wdgdsj;
	 public void setWdgdsj(Timestamp wdgdsj)
	 {
		  this.wdgdsj = wdgdsj;
	 }
   public Timestamp getWdgdsj()
   { 	    
  	    	  if( this.wdgdsj != null )
	    {
	        return (Timestamp)new ActizTimestamp( this.wdgdsj.getTime() );
	    }	      	  	   	  	     	    
            
      return this.wdgdsj;     	
   }
 	 	 private String wendangzbqk;
	 public void setWendangzbqk(String wendangzbqk)
	 {
		  this.wendangzbqk = wendangzbqk;
	 }
   public String getWendangzbqk()
   { 	    
  	        
      return this.wendangzbqk;     	
   }
 	 	 private Long wuliaoid;
	 public void setWuliaoid(Long wuliaoid)
	 {
		  this.wuliaoid = wuliaoid;
	 }
   public Long getWuliaoid()
   { 	    
  	        
      return this.wuliaoid;     	
   }
 	 	 private Long xiangmuid;
	 public void setXiangmuid(Long xiangmuid)
	 {
		  this.xiangmuid = xiangmuid;
	 }
   public Long getXiangmuid()
   { 	    
  	        
      return this.xiangmuid;     	
   }
 	 	 private String yfzltxwdlj;
	 public void setYfzltxwdlj(String yfzltxwdlj)
	 {
		  this.yfzltxwdlj = yfzltxwdlj;
	 }
   public String getYfzltxwdlj()
   { 	    
  	        
      return this.yfzltxwdlj;     	
   }
 	 	 private Date yaoqiuwcrq;
	 public void setYaoqiuwcrq(Date yaoqiuwcrq)
	 {
		  this.yaoqiuwcrq = yaoqiuwcrq;
	 }
   public Date getYaoqiuwcrq()
   { 	    
  	  	    if( this.yaoqiuwcrq != null )
	    {
	        return (Date)new ActizDate( this.yaoqiuwcrq.getTime() );
	    }
	          
      return this.yaoqiuwcrq;     	
   }
 	 	 private String yewuzt;
	 public void setYewuzt(String yewuzt)
	 {
		  this.yewuzt = yewuzt;
	 }
   public String getYewuzt()
   { 	    
  	        
      return this.yewuzt;     	
   }
 	 	 private String youxianj;
	 public void setYouxianj(String youxianj)
	 {
		  this.youxianj = youxianj;
	 }
   public String getYouxianj()
   { 	    
  	        
      return this.youxianj;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzemployee pingshenrRef;
	 public void setPingshenrRef(com.actiz.platform.application.dataset.pojo.Atzemployee pingshenrRef)
	 {
		  this.pingshenrRef = pingshenrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getPingshenrRef()
   {
     	return this.pingshenrRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef;
	 public void setWuliaoidRef(com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx wuliaoidRef)
	 {
		  this.wuliaoidRef = wuliaoidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzwuliaojcxx getWuliaoidRef()
   {
     	return this.wuliaoidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef;
	 public void setXiangmuidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmuidRef)
	 {
		  this.xiangmuidRef = xiangmuidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmuidRef()
   {
     	return this.xiangmuidRef;
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