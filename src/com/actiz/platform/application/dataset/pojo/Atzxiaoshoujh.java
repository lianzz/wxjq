package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxiaoshoujh implements Serializable,IPojo
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
 	 	 private String chenggongl;
	 public void setChenggongl(String chenggongl)
	 {
		  this.chenggongl = chenggongl;
	 }
   public String getChenggongl()
   { 	    
  	        
      return this.chenggongl;     	
   }
 	 	 private Date faxiansj;
	 public void setFaxiansj(Date faxiansj)
	 {
		  this.faxiansj = faxiansj;
	 }
   public Date getFaxiansj()
   { 	    
  	  	    if( this.faxiansj != null )
	    {
	        return (Date)new ActizDate( this.faxiansj.getTime() );
	    }
	          
      return this.faxiansj;     	
   }
 	 	 private Long fuzer;
	 public void setFuzer(Long fuzer)
	 {
		  this.fuzer = fuzer;
	 }
   public Long getFuzer()
   { 	    
  	        
      return this.fuzer;     	
   }
 	 	 private Date guanbirq;
	 public void setGuanbirq(Date guanbirq)
	 {
		  this.guanbirq = guanbirq;
	 }
   public Date getGuanbirq()
   { 	    
  	  	    if( this.guanbirq != null )
	    {
	        return (Date)new ActizDate( this.guanbirq.getTime() );
	    }
	          
      return this.guanbirq;     	
   }
 	 	 private String jihuifx;
	 public void setJihuifx(String jihuifx)
	 {
		  this.jihuifx = jihuifx;
	 }
   public String getJihuifx()
   { 	    
  	        
      return this.jihuifx;     	
   }
 	 	 private String jihuizt;
	 public void setJihuizt(String jihuizt)
	 {
		  this.jihuizt = jihuizt;
	 }
   public String getJihuizt()
   { 	    
  	        
      return this.jihuizt;     	
   }
 	 	 private String jipox;
	 public void setJipox(String jipox)
	 {
		  this.jipox = jipox;
	 }
   public String getJipox()
   { 	    
  	        
      return this.jipox;     	
   }
 	 	 private String jieduan;
	 public void setJieduan(String jieduan)
	 {
		  this.jieduan = jieduan;
	 }
   public String getJieduan()
   { 	    
  	        
      return this.jieduan;     	
   }
 	 	 private String jingzhengdw;
	 public void setJingzhengdw(String jingzhengdw)
	 {
		  this.jingzhengdw = jingzhengdw;
	 }
   public String getJingzhengdw()
   { 	    
  	        
      return this.jingzhengdw;     	
   }
 	 	 private String jzdwzy;
	 public void setJzdwzy(String jzdwzy)
	 {
		  this.jzdwzy = jzdwzy;
	 }
   public String getJzdwzy()
   { 	    
  	        
      return this.jzdwzy;     	
   }
 	 	 private String kenengcl;
	 public void setKenengcl(String kenengcl)
	 {
		  this.kenengcl = kenengcl;
	 }
   public String getKenengcl()
   { 	    
  	        
      return this.kenengcl;     	
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
 	 	 private String kehuxq;
	 public void setKehuxq(String kehuxq)
	 {
		  this.kehuxq = kehuxq;
	 }
   public String getKehuxq()
   { 	    
  	        
      return this.kehuxq;     	
   }
 	 	 private String laiyuan;
	 public void setLaiyuan(String laiyuan)
	 {
		  this.laiyuan = laiyuan;
	 }
   public String getLaiyuan()
   { 	    
  	        
      return this.laiyuan;     	
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
 	 	 private String role;
	 public void setRole(String role)
	 {
		  this.role = role;
	 }
   public String getRole()
   { 	    
  	        
      return this.role;     	
   }
 	 	 private String shifougb;
	 public void setShifougb(String shifougb)
	 {
		  this.shifougb = shifougb;
	 }
   public String getShifougb()
   { 	    
  	        
      return this.shifougb;     	
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
 	 	 private String tigongr;
	 public void setTigongr(String tigongr)
	 {
		  this.tigongr = tigongr;
	 }
   public String getTigongr()
   { 	    
  	        
      return this.tigongr;     	
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
 	 	 private Long xiaoshoujl;
	 public void setXiaoshoujl(Long xiaoshoujl)
	 {
		  this.xiaoshoujl = xiaoshoujl;
	 }
   public Long getXiaoshoujl()
   { 	    
  	        
      return this.xiaoshoujl;     	
   }
 	 	 private String yixscp;
	 public void setYixscp(String yixscp)
	 {
		  this.yixscp = yixscp;
	 }
   public String getYixscp()
   { 	    
  	        
      return this.yixscp;     	
   }
 	 	 private Double yixsje;
	 public void setYixsje(Double yixsje)
	 {
		  this.yixsje = yixsje;
	 }
   public Double getYixsje()
   { 	    
  	        
      return this.yixsje;     	
   }
 	 	 private Double yuqije;
	 public void setYuqije(Double yuqije)
	 {
		  this.yuqije = yuqije;
	 }
   public Double getYuqije()
   { 	    
  	        
      return this.yuqije;     	
   }
 	 	 private Date yuqiqdrq;
	 public void setYuqiqdrq(Date yuqiqdrq)
	 {
		  this.yuqiqdrq = yuqiqdrq;
	 }
   public Date getYuqiqdrq()
   { 	    
  	  	    if( this.yuqiqdrq != null )
	    {
	        return (Date)new ActizDate( this.yuqiqdrq.getTime() );
	    }
	          
      return this.yuqiqdrq;     	
   }
 	 	 private String zhuangtai;
	 public void setZhuangtai(String zhuangtai)
	 {
		  this.zhuangtai = zhuangtai;
	 }
   public String getZhuangtai()
   { 	    
  	        
      return this.zhuangtai;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atztdyg fuzerRef;
	 public void setFuzerRef(com.actiz.platform.application.dataset.pojo.Atztdyg fuzerRef)
	 {
		  this.fuzerRef = fuzerRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getFuzerRef()
   {
     	return this.fuzerRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef;
	 public void setXiaoshoujlRef(com.actiz.platform.application.dataset.pojo.Atzemployee xiaoshoujlRef)
	 {
		  this.xiaoshoujlRef = xiaoshoujlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getXiaoshoujlRef()
   {
     	return this.xiaoshoujlRef;
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