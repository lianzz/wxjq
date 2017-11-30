package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigouht implements Serializable,IPojo
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
 	 	 private String beizhun;
	 public void setBeizhun(String beizhun)
	 {
		  this.beizhun = beizhun;
	 }
   public String getBeizhun()
   { 	    
  	        
      return this.beizhun;     	
   }
 	 	 private Long bizhongid;
	 public void setBizhongid(Long bizhongid)
	 {
		  this.bizhongid = bizhongid;
	 }
   public Long getBizhongid()
   { 	    
  	        
      return this.bizhongid;     	
   }
 	 	 private Long caigoucsid;
	 public void setCaigoucsid(Long caigoucsid)
	 {
		  this.caigoucsid = caigoucsid;
	 }
   public Long getCaigoucsid()
   { 	    
  	        
      return this.caigoucsid;     	
   }
 	 	 private String caigouhtzt;
	 public void setCaigouhtzt(String caigouhtzt)
	 {
		  this.caigouhtzt = caigouhtzt;
	 }
   public String getCaigouhtzt()
   { 	    
  	        
      return this.caigouhtzt;     	
   }
 	 	 private Long caigoujhid;
	 public void setCaigoujhid(Long caigoujhid)
	 {
		  this.caigoujhid = caigoujhid;
	 }
   public Long getCaigoujhid()
   { 	    
  	        
      return this.caigoujhid;     	
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
 	 	 private String dingdanbh;
	 public void setDingdanbh(String dingdanbh)
	 {
		  this.dingdanbh = dingdanbh;
	 }
   public String getDingdanbh()
   { 	    
  	        
      return this.dingdanbh;     	
   }
 	 	 private String fukuanfs;
	 public void setFukuanfs(String fukuanfs)
	 {
		  this.fukuanfs = fukuanfs;
	 }
   public String getFukuanfs()
   { 	    
  	        
      return this.fukuanfs;     	
   }
 	 	 private String fukuanfsn;
	 public void setFukuanfsn(String fukuanfsn)
	 {
		  this.fukuanfsn = fukuanfsn;
	 }
   public String getFukuanfsn()
   { 	    
  	        
      return this.fukuanfsn;     	
   }
 	 	 private String gongyings;
	 public void setGongyings(String gongyings)
	 {
		  this.gongyings = gongyings;
	 }
   public String getGongyings()
   { 	    
  	        
      return this.gongyings;     	
   }
 	 	 private String gongyingsdj;
	 public void setGongyingsdj(String gongyingsdj)
	 {
		  this.gongyingsdj = gongyingsdj;
	 }
   public String getGongyingsdj()
   { 	    
  	        
      return this.gongyingsdj;     	
   }
 	 	 private String gongyingssx;
	 public void setGongyingssx(String gongyingssx)
	 {
		  this.gongyingssx = gongyingssx;
	 }
   public String getGongyingssx()
   { 	    
  	        
      return this.gongyingssx;     	
   }
 	 	 private String guanbiyy;
	 public void setGuanbiyy(String guanbiyy)
	 {
		  this.guanbiyy = guanbiyy;
	 }
   public String getGuanbiyy()
   { 	    
  	        
      return this.guanbiyy;     	
   }
 	 	 private String hetongbh;
	 public void setHetongbh(String hetongbh)
	 {
		  this.hetongbh = hetongbh;
	 }
   public String getHetongbh()
   { 	    
  	        
      return this.hetongbh;     	
   }
 	 	 private Date hetongxdsj;
	 public void setHetongxdsj(Date hetongxdsj)
	 {
		  this.hetongxdsj = hetongxdsj;
	 }
   public Date getHetongxdsj()
   { 	    
  	  	    if( this.hetongxdsj != null )
	    {
	        return (Date)new ActizDate( this.hetongxdsj.getTime() );
	    }
	          
      return this.hetongxdsj;     	
   }
 	 	 private Double hetongzj;
	 public void setHetongzj(Double hetongzj)
	 {
		  this.hetongzj = hetongzj;
	 }
   public Double getHetongzj()
   { 	    
  	        
      return this.hetongzj;     	
   }
 	 	 private String jiaohuodd;
	 public void setJiaohuodd(String jiaohuodd)
	 {
		  this.jiaohuodd = jiaohuodd;
	 }
   public String getJiaohuodd()
   { 	    
  	        
      return this.jiaohuodd;     	
   }
 	 	 private String linshibh;
	 public void setLinshibh(String linshibh)
	 {
		  this.linshibh = linshibh;
	 }
   public String getLinshibh()
   { 	    
  	        
      return this.linshibh;     	
   }
 	 	 private String pinzhiyq;
	 public void setPinzhiyq(String pinzhiyq)
	 {
		  this.pinzhiyq = pinzhiyq;
	 }
   public String getPinzhiyq()
   { 	    
  	        
      return this.pinzhiyq;     	
   }
 	 	 private String pinzhiyqn;
	 public void setPinzhiyqn(String pinzhiyqn)
	 {
		  this.pinzhiyqn = pinzhiyqn;
	 }
   public String getPinzhiyqn()
   { 	    
  	        
      return this.pinzhiyqn;     	
   }
 	 	 private String qitatk;
	 public void setQitatk(String qitatk)
	 {
		  this.qitatk = qitatk;
	 }
   public String getQitatk()
   { 	    
  	        
      return this.qitatk;     	
   }
 	 	 private String qitatkn;
	 public void setQitatkn(String qitatkn)
	 {
		  this.qitatkn = qitatkn;
	 }
   public String getQitatkn()
   { 	    
  	        
      return this.qitatkn;     	
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
 	 	 private String shenheyjzt;
	 public void setShenheyjzt(String shenheyjzt)
	 {
		  this.shenheyjzt = shenheyjzt;
	 }
   public String getShenheyjzt()
   { 	    
  	        
      return this.shenheyjzt;     	
   }
 	 	 private Double shengyujk;
	 public void setShengyujk(Double shengyujk)
	 {
		  this.shengyujk = shengyujk;
	 }
   public Double getShengyujk()
   { 	    
  	        
      return this.shengyujk;     	
   }
 	 	 private String shifouqbdh;
	 public void setShifouqbdh(String shifouqbdh)
	 {
		  this.shifouqbdh = shifouqbdh;
	 }
   public String getShifouqbdh()
   { 	    
  	        
      return this.shifouqbdh;     	
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
 	 	 private Date tijiaoshsj;
	 public void setTijiaoshsj(Date tijiaoshsj)
	 {
		  this.tijiaoshsj = tijiaoshsj;
	 }
   public Date getTijiaoshsj()
   { 	    
  	  	    if( this.tijiaoshsj != null )
	    {
	        return (Date)new ActizDate( this.tijiaoshsj.getTime() );
	    }
	          
      return this.tijiaoshsj;     	
   }
 	 	 private String tianxier;
	 public void setTianxier(String tianxier)
	 {
		  this.tianxier = tianxier;
	 }
   public String getTianxier()
   { 	    
  	        
      return this.tianxier;     	
   }
 	 	 private Date tianxierq;
	 public void setTianxierq(Date tianxierq)
	 {
		  this.tianxierq = tianxierq;
	 }
   public Date getTianxierq()
   { 	    
  	  	    if( this.tianxierq != null )
	    {
	        return (Date)new ActizDate( this.tianxierq.getTime() );
	    }
	          
      return this.tianxierq;     	
   }
 	 	 private Date xiadansj;
	 public void setXiadansj(Date xiadansj)
	 {
		  this.xiadansj = xiadansj;
	 }
   public Date getXiadansj()
   { 	    
  	  	    if( this.xiadansj != null )
	    {
	        return (Date)new ActizDate( this.xiadansj.getTime() );
	    }
	          
      return this.xiadansj;     	
   }
 	 	 private String xshth;
	 public void setXshth(String xshth)
	 {
		  this.xshth = xshth;
	 }
   public String getXshth()
   { 	    
  	        
      return this.xshth;     	
   }
 	 	 private String zhixingzt;
	 public void setZhixingzt(String zhixingzt)
	 {
		  this.zhixingzt = zhixingzt;
	 }
   public String getZhixingzt()
   { 	    
  	        
      return this.zhixingzt;     	
   }
 	 	 private Double caigouzq;
	 public void setCaigouzq(Double caigouzq)
	 {
		  this.caigouzq = caigouzq;
	 }
   public Double getCaigouzq()
   { 	    
  	        
      return this.caigouzq;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef;
	 public void setBizhongidRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongidRef)
	 {
		  this.bizhongidRef = bizhongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongidRef()
   {
     	return this.bizhongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoucs caigoucsidRef;
	 public void setCaigoucsidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoucs caigoucsidRef)
	 {
		  this.caigoucsidRef = caigoucsidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoucs getCaigoucsidRef()
   {
     	return this.caigoucsidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef;
	 public void setCaigoujhidRef(com.actiz.platform.application.dataset.pojo.Atzcaigoujh caigoujhidRef)
	 {
		  this.caigoujhidRef = caigoujhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzcaigoujh getCaigoujhidRef()
   {
     	return this.caigoujhidRef;
   }
  
	private java.util.Set atzcaigouhtmxSet;
	public void setAtzcaigouhtmxSet(java.util.Set atzcaigouhtmxSet)
	{
		 this.atzcaigouhtmxSet = atzcaigouhtmxSet;
	}
  public java.util.Set getAtzcaigouhtmxSet()
  {
     return this.atzcaigouhtmxSet;
  }
 
	private java.util.Set atzcghtshenhejlSet;
	public void setAtzcghtshenhejlSet(java.util.Set atzcghtshenhejlSet)
	{
		 this.atzcghtshenhejlSet = atzcghtshenhejlSet;
	}
  public java.util.Set getAtzcghtshenhejlSet()
  {
     return this.atzcghtshenhejlSet;
  }
 
	private java.util.Set atzhetongfkjdSet;
	public void setAtzhetongfkjdSet(java.util.Set atzhetongfkjdSet)
	{
		 this.atzhetongfkjdSet = atzhetongfkjdSet;
	}
  public java.util.Set getAtzhetongfkjdSet()
  {
     return this.atzhetongfkjdSet;
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