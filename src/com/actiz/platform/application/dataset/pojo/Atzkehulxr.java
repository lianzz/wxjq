package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkehulxr implements Serializable,IPojo
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
	  	 	 private String aihao;
	 public void setAihao(String aihao)
	 {
		  this.aihao = aihao;
	 }
   public String getAihao()
   { 	    
  	        
      return this.aihao;     	
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
 	 	 private String bumen;
	 public void setBumen(String bumen)
	 {
		  this.bumen = bumen;
	 }
   public String getBumen()
   { 	    
  	        
      return this.bumen;     	
   }
 	 	 private String chengwei;
	 public void setChengwei(String chengwei)
	 {
		  this.chengwei = chengwei;
	 }
   public String getChengwei()
   { 	    
  	        
      return this.chengwei;     	
   }
 	 	 private String tel;
	 public void setTel(String tel)
	 {
		  this.tel = tel;
	 }
   public String getTel()
   { 	    
  	        
      return this.tel;     	
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
 	 	 private String fax;
	 public void setFax(String fax)
	 {
		  this.fax = fax;
	 }
   public String getFax()
   { 	    
  	        
      return this.fax;     	
   }
 	 	 private String fuzeyw;
	 public void setFuzeyw(String fuzeyw)
	 {
		  this.fuzeyw = fuzeyw;
	 }
   public String getFuzeyw()
   { 	    
  	        
      return this.fuzeyw;     	
   }
 	 	 private String jiatingdh;
	 public void setJiatingdh(String jiatingdh)
	 {
		  this.jiatingdh = jiatingdh;
	 }
   public String getJiatingdh()
   { 	    
  	        
      return this.jiatingdh;     	
   }
 	 	 private String jiatingzz;
	 public void setJiatingzz(String jiatingzz)
	 {
		  this.jiatingzz = jiatingzz;
	 }
   public String getJiatingzz()
   { 	    
  	        
      return this.jiatingzz;     	
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
 	 	 private String lianxirfl;
	 public void setLianxirfl(String lianxirfl)
	 {
		  this.lianxirfl = lianxirfl;
	 }
   public String getLianxirfl()
   { 	    
  	        
      return this.lianxirfl;     	
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
 	 	 private String mobile;
	 public void setMobile(String mobile)
	 {
		  this.mobile = mobile;
	 }
   public String getMobile()
   { 	    
  	        
      return this.mobile;     	
   }
 	 	 private String msn;
	 public void setMsn(String msn)
	 {
		  this.msn = msn;
	 }
   public String getMsn()
   { 	    
  	        
      return this.msn;     	
   }
 	 	 private String qq;
	 public void setQq(String qq)
	 {
		  this.qq = qq;
	 }
   public String getQq()
   { 	    
  	        
      return this.qq;     	
   }
 	 	 private Date shengri;
	 public void setShengri(Date shengri)
	 {
		  this.shengri = shengri;
	 }
   public Date getShengri()
   { 	    
  	  	    if( this.shengri != null )
	    {
	        return (Date)new ActizDate( this.shengri.getTime() );
	    }
	          
      return this.shengri;     	
   }
 	 	 private String shype;
	 public void setShype(String shype)
	 {
		  this.shype = shype;
	 }
   public String getShype()
   { 	    
  	        
      return this.shype;     	
   }
 	 	 private String xingbie;
	 public void setXingbie(String xingbie)
	 {
		  this.xingbie = xingbie;
	 }
   public String getXingbie()
   { 	    
  	        
      return this.xingbie;     	
   }
 	 	 private String xingming;
	 public void setXingming(String xingming)
	 {
		  this.xingming = xingming;
	 }
   public String getXingming()
   { 	    
  	        
      return this.xingming;     	
   }
 	 	 private String youbian;
	 public void setYoubian(String youbian)
	 {
		  this.youbian = youbian;
	 }
   public String getYoubian()
   { 	    
  	        
      return this.youbian;     	
   }
 	 	 private String zhaopian;
	 public void setZhaopian(String zhaopian)
	 {
		  this.zhaopian = zhaopian;
	 }
   public String getZhaopian()
   { 	    
  	        
      return this.zhaopian;     	
   }
 	 	 private String zhengjianhm;
	 public void setZhengjianhm(String zhengjianhm)
	 {
		  this.zhengjianhm = zhengjianhm;
	 }
   public String getZhengjianhm()
   { 	    
  	        
      return this.zhengjianhm;     	
   }
 	 	 private String zhengjianlx;
	 public void setZhengjianlx(String zhengjianlx)
	 {
		  this.zhengjianlx = zhengjianlx;
	 }
   public String getZhengjianlx()
   { 	    
  	        
      return this.zhengjianlx;     	
   }
 	 	 private String zhiwu;
	 public void setZhiwu(String zhiwu)
	 {
		  this.zhiwu = zhiwu;
	 }
   public String getZhiwu()
   { 	    
  	        
      return this.zhiwu;     	
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