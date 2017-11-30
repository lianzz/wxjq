package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzxunjianbg implements Serializable,IPojo
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
	  	 	 private String baogaozt;
	 public void setBaogaozt(String baogaozt)
	 {
		  this.baogaozt = baogaozt;
	 }
   public String getBaogaozt()
   { 	    
  	        
      return this.baogaozt;     	
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
 	 	 private Integer butonggxmzs;
	 public void setButonggxmzs(Integer butonggxmzs)
	 {
		  this.butonggxmzs = butonggxmzs;
	 }
   public Integer getButonggxmzs()
   { 	    
  	        
      return this.butonggxmzs;     	
   }
 	 	 private Integer ceshixzs;
	 public void setCeshixzs(Integer ceshixzs)
	 {
		  this.ceshixzs = ceshixzs;
	 }
   public Integer getCeshixzs()
   { 	    
  	        
      return this.ceshixzs;     	
   }
 	 	 private Long chanpinid;
	 public void setChanpinid(Long chanpinid)
	 {
		  this.chanpinid = chanpinid;
	 }
   public Long getChanpinid()
   { 	    
  	        
      return this.chanpinid;     	
   }
 	 	 private String dongxinfzr;
	 public void setDongxinfzr(String dongxinfzr)
	 {
		  this.dongxinfzr = dongxinfzr;
	 }
   public String getDongxinfzr()
   { 	    
  	        
      return this.dongxinfzr;     	
   }
 	 	 private String gongchengfzr;
	 public void setGongchengfzr(String gongchengfzr)
	 {
		  this.gongchengfzr = gongchengfzr;
	 }
   public String getGongchengfzr()
   { 	    
  	        
      return this.gongchengfzr;     	
   }
 	 	 private String gongcryhm;
	 public void setGongcryhm(String gongcryhm)
	 {
		  this.gongcryhm = gongcryhm;
	 }
   public String getGongcryhm()
   { 	    
  	        
      return this.gongcryhm;     	
   }
 	 	 private String kehufzr;
	 public void setKehufzr(String kehufzr)
	 {
		  this.kehufzr = kehufzr;
	 }
   public String getKehufzr()
   { 	    
  	        
      return this.kehufzr;     	
   }
 	 	 private String kehuhm;
	 public void setKehuhm(String kehuhm)
	 {
		  this.kehuhm = kehuhm;
	 }
   public String getKehuhm()
   { 	    
  	        
      return this.kehuhm;     	
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
 	 	 private String lianxifs;
	 public void setLianxifs(String lianxifs)
	 {
		  this.lianxifs = lianxifs;
	 }
   public String getLianxifs()
   { 	    
  	        
      return this.lianxifs;     	
   }
 	 	 private Integer qitazs;
	 public void setQitazs(Integer qitazs)
	 {
		  this.qitazs = qitazs;
	 }
   public Integer getQitazs()
   { 	    
  	        
      return this.qitazs;     	
   }
 	 	 private String shebeiszd;
	 public void setShebeiszd(String shebeiszd)
	 {
		  this.shebeiszd = shebeiszd;
	 }
   public String getShebeiszd()
   { 	    
  	        
      return this.shebeiszd;     	
   }
 	 	 private Date tianbaorq;
	 public void setTianbaorq(Date tianbaorq)
	 {
		  this.tianbaorq = tianbaorq;
	 }
   public Date getTianbaorq()
   { 	    
  	  	    if( this.tianbaorq != null )
	    {
	        return (Date)new ActizDate( this.tianbaorq.getTime() );
	    }
	          
      return this.tianbaorq;     	
   }
 	 	 private Integer tongguoxmzs;
	 public void setTongguoxmzs(Integer tongguoxmzs)
	 {
		  this.tongguoxmzs = tongguoxmzs;
	 }
   public Integer getTongguoxmzs()
   { 	    
  	        
      return this.tongguoxmzs;     	
   }
 	 	 private Integer weicexmzs;
	 public void setWeicexmzs(Integer weicexmzs)
	 {
		  this.weicexmzs = weicexmzs;
	 }
   public Integer getWeicexmzs()
   { 	    
  	        
      return this.weicexmzs;     	
   }
 	 	 private Long xitongid;
	 public void setXitongid(Long xitongid)
	 {
		  this.xitongid = xitongid;
	 }
   public Long getXitongid()
   { 	    
  	        
      return this.xitongid;     	
   }
 	 	 private String xitongbbxx;
	 public void setXitongbbxx(String xitongbbxx)
	 {
		  this.xitongbbxx = xitongbbxx;
	 }
   public String getXitongbbxx()
   { 	    
  	        
      return this.xitongbbxx;     	
   }
 	 	 private String xianchangry;
	 public void setXianchangry(String xianchangry)
	 {
		  this.xianchangry = xianchangry;
	 }
   public String getXianchangry()
   { 	    
  	        
      return this.xianchangry;     	
   }
 	 	 private Long xiangmupqdid;
	 public void setXiangmupqdid(Long xiangmupqdid)
	 {
		  this.xiangmupqdid = xiangmupqdid;
	 }
   public Long getXiangmupqdid()
   { 	    
  	        
      return this.xiangmupqdid;     	
   }
 	 	 private String xunjianjl;
	 public void setXunjianjl(String xunjianjl)
	 {
		  this.xunjianjl = xunjianjl;
	 }
   public String getXunjianjl()
   { 	    
  	        
      return this.xunjianjl;     	
   }
 	 	 private Date xunjianjsrq;
	 public void setXunjianjsrq(Date xunjianjsrq)
	 {
		  this.xunjianjsrq = xunjianjsrq;
	 }
   public Date getXunjianjsrq()
   { 	    
  	  	    if( this.xunjianjsrq != null )
	    {
	        return (Date)new ActizDate( this.xunjianjsrq.getTime() );
	    }
	          
      return this.xunjianjsrq;     	
   }
 	 	 private Date xunjiansj;
	 public void setXunjiansj(Date xunjiansj)
	 {
		  this.xunjiansj = xunjiansj;
	 }
   public Date getXunjiansj()
   { 	    
  	  	    if( this.xunjiansj != null )
	    {
	        return (Date)new ActizDate( this.xunjiansj.getTime() );
	    }
	          
      return this.xunjiansj;     	
   }
 	 	 private String xunjianlx;
	 public void setXunjianlx(String xunjianlx)
	 {
		  this.xunjianlx = xunjianlx;
	 }
   public String getXunjianlx()
   { 	    
  	        
      return this.xunjianlx;     	
   }
 	 	 private String xunjiannrfj;
	 public void setXunjiannrfj(String xunjiannrfj)
	 {
		  this.xunjiannrfj = xunjiannrfj;
	 }
   public String getXunjiannrfj()
   { 	    
  	        
      return this.xunjiannrfj;     	
   }
 	 	 private Integer yicexmzs;
	 public void setYicexmzs(Integer yicexmzs)
	 {
		  this.yicexmzs = yicexmzs;
	 }
   public Integer getYicexmzs()
   { 	    
  	        
      return this.yicexmzs;     	
   }
 	 	 private String zhidanr;
	 public void setZhidanr(String zhidanr)
	 {
		  this.zhidanr = zhidanr;
	 }
   public String getZhidanr()
   { 	    
  	        
      return this.zhidanr;     	
   }
 	 	 private Date zhidanrq;
	 public void setZhidanrq(Date zhidanrq)
	 {
		  this.zhidanrq = zhidanrq;
	 }
   public Date getZhidanrq()
   { 	    
  	  	    if( this.zhidanrq != null )
	    {
	        return (Date)new ActizDate( this.zhidanrq.getTime() );
	    }
	          
      return this.zhidanrq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef;
	 public void setChanpinidRef(com.actiz.platform.application.dataset.pojo.Atzchanpin chanpinidRef)
	 {
		  this.chanpinidRef = chanpinidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpin getChanpinidRef()
   {
     	return this.chanpinidRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef;
	 public void setXitongidRef(com.actiz.platform.application.dataset.pojo.Atzkehuxtxx xitongidRef)
	 {
		  this.xitongidRef = xitongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzkehuxtxx getXitongidRef()
   {
     	return this.xitongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqdidRef;
	 public void setXiangmupqdidRef(com.actiz.platform.application.dataset.pojo.Atzxiangmupqd xiangmupqdidRef)
	 {
		  this.xiangmupqdidRef = xiangmupqdidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmupqd getXiangmupqdidRef()
   {
     	return this.xiangmupqdidRef;
   }
  
	private java.util.Set atzxunjianbgmxSet;
	public void setAtzxunjianbgmxSet(java.util.Set atzxunjianbgmxSet)
	{
		 this.atzxunjianbgmxSet = atzxunjianbgmxSet;
	}
  public java.util.Set getAtzxunjianbgmxSet()
  {
     return this.atzxunjianbgmxSet;
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