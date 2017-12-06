package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzhtbgls implements Serializable,IPojo
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
	  	 	 private Long bkbht;
	 public void setBkbht(Long bkbht)
	 {
		  this.bkbht = bkbht;
	 }
   public Long getBkbht()
   { 	    
  	        
      return this.bkbht;     	
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
 	 	 private String shifouxqwbht;
	 public void setShifouxqwbht(String shifouxqwbht)
	 {
		  this.shifouxqwbht = shifouxqwbht;
	 }
   public String getShifouxqwbht()
   { 	    
  	        
      return this.shifouxqwbht;     	
   }
 	 	 private String chanpinlx;
	 public void setChanpinlx(String chanpinlx)
	 {
		  this.chanpinlx = chanpinlx;
	 }
   public String getChanpinlx()
   { 	    
  	        
      return this.chanpinlx;     	
   }
 	 	 private String chanpinyysf;
	 public void setChanpinyysf(String chanpinyysf)
	 {
		  this.chanpinyysf = chanpinyysf;
	 }
   public String getChanpinyysf()
   { 	    
  	        
      return this.chanpinyysf;     	
   }
 	 	 private Long chanpinzs;
	 public void setChanpinzs(Long chanpinzs)
	 {
		  this.chanpinzs = chanpinzs;
	 }
   public Long getChanpinzs()
   { 	    
  	        
      return this.chanpinzs;     	
   }
 	 	 private Long cbzx;
	 public void setCbzx(Long cbzx)
	 {
		  this.cbzx = cbzx;
	 }
   public Long getCbzx()
   { 	    
  	        
      return this.cbzx;     	
   }
 	 	 private Double dangshihl;
	 public void setDangshihl(Double dangshihl)
	 {
		  this.dangshihl = dangshihl;
	 }
   public Double getDangshihl()
   { 	    
  	        
      return this.dangshihl;     	
   }
 	 	 private String fktk;
	 public void setFktk(String fktk)
	 {
		  this.fktk = fktk;
	 }
   public String getFktk()
   { 	    
  	        
      return this.fktk;     	
   }
 	 	 private String xiangmujl;
	 public void setXiangmujl(String xiangmujl)
	 {
		  this.xiangmujl = xiangmujl;
	 }
   public String getXiangmujl()
   { 	    
  	        
      return this.xiangmujl;     	
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
 	 	 private String hetongfj;
	 public void setHetongfj(String hetongfj)
	 {
		  this.hetongfj = hetongfj;
	 }
   public String getHetongfj()
   { 	    
  	        
      return this.hetongfj;     	
   }
 	 	 private String htfjsmj;
	 public void setHtfjsmj(String htfjsmj)
	 {
		  this.htfjsmj = htfjsmj;
	 }
   public String getHtfjsmj()
   { 	    
  	        
      return this.htfjsmj;     	
   }
 	 	 private Double hetongje;
	 public void setHetongje(Double hetongje)
	 {
		  this.hetongje = hetongje;
	 }
   public Double getHetongje()
   { 	    
  	        
      return this.hetongje;     	
   }
 	 	 private String hetongmc;
	 public void setHetongmc(String hetongmc)
	 {
		  this.hetongmc = hetongmc;
	 }
   public String getHetongmc()
   { 	    
  	        
      return this.hetongmc;     	
   }
 	 	 private Double hetongwbje;
	 public void setHetongwbje(Double hetongwbje)
	 {
		  this.hetongwbje = hetongwbje;
	 }
   public Double getHetongwbje()
   { 	    
  	        
      return this.hetongwbje;     	
   }
 	 	 private Long hetongid;
	 public void setHetongid(Long hetongid)
	 {
		  this.hetongid = hetongid;
	 }
   public Long getHetongid()
   { 	    
  	        
      return this.hetongid;     	
   }
 	 	 private Long jingbanr;
	 public void setJingbanr(Long jingbanr)
	 {
		  this.jingbanr = jingbanr;
	 }
   public Long getJingbanr()
   { 	    
  	        
      return this.jingbanr;     	
   }
 	 	 private Date jingbanrq;
	 public void setJingbanrq(Date jingbanrq)
	 {
		  this.jingbanrq = jingbanrq;
	 }
   public Date getJingbanrq()
   { 	    
  	  	    if( this.jingbanrq != null )
	    {
	        return (Date)new ActizDate( this.jingbanrq.getTime() );
	    }
	          
      return this.jingbanrq;     	
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
 	 	 private String kehulxr;
	 public void setKehulxr(String kehulxr)
	 {
		  this.kehulxr = kehulxr;
	 }
   public String getKehulxr()
   { 	    
  	        
      return this.kehulxr;     	
   }
 	 	 private String oahth;
	 public void setOahth(String oahth)
	 {
		  this.oahth = oahth;
	 }
   public String getOahth()
   { 	    
  	        
      return this.oahth;     	
   }
 	 	 private Date oapstgsj;
	 public void setOapstgsj(Date oapstgsj)
	 {
		  this.oapstgsj = oapstgsj;
	 }
   public Date getOapstgsj()
   { 	    
  	  	    if( this.oapstgsj != null )
	    {
	        return (Date)new ActizDate( this.oapstgsj.getTime() );
	    }
	          
      return this.oapstgsj;     	
   }
 	 	 private Date qiandingrq;
	 public void setQiandingrq(Date qiandingrq)
	 {
		  this.qiandingrq = qiandingrq;
	 }
   public Date getQiandingrq()
   { 	    
  	  	    if( this.qiandingrq != null )
	    {
	        return (Date)new ActizDate( this.qiandingrq.getTime() );
	    }
	          
      return this.qiandingrq;     	
   }
 	 	 private String sjh;
	 public void setSjh(String sjh)
	 {
		  this.sjh = sjh;
	 }
   public String getSjh()
   { 	    
  	        
      return this.sjh;     	
   }
 	 	 private String shifoubz;
	 public void setShifoubz(String shifoubz)
	 {
		  this.shifoubz = shifoubz;
	 }
   public String getShifoubz()
   { 	    
  	        
      return this.shifoubz;     	
   }
 	 	 private String shifoujyht;
	 public void setShifoujyht(String shifoujyht)
	 {
		  this.shifoujyht = shifoujyht;
	 }
   public String getShifoujyht()
   { 	    
  	        
      return this.shifoujyht;     	
   }
 	 	 private String shifouxynbps;
	 public void setShifouxynbps(String shifouxynbps)
	 {
		  this.shifouxynbps = shifouxynbps;
	 }
   public String getShifouxynbps()
   { 	    
  	        
      return this.shifouxynbps;     	
   }
 	 	 private String sfzzyh;
	 public void setSfzzyh(String sfzzyh)
	 {
		  this.sfzzyh = sfzzyh;
	 }
   public String getSfzzyh()
   { 	    
  	        
      return this.sfzzyh;     	
   }
 	 	 private String suoshuhy;
	 public void setSuoshuhy(String suoshuhy)
	 {
		  this.suoshuhy = suoshuhy;
	 }
   public String getSuoshuhy()
   { 	    
  	        
      return this.suoshuhy;     	
   }
 	 	 private Long toubiaodid;
	 public void setToubiaodid(Long toubiaodid)
	 {
		  this.toubiaodid = toubiaodid;
	 }
   public Long getToubiaodid()
   { 	    
  	        
      return this.toubiaodid;     	
   }
 	 	 private Long wubizl;
	 public void setWubizl(Long wubizl)
	 {
		  this.wubizl = wubizl;
	 }
   public Long getWubizl()
   { 	    
  	        
      return this.wubizl;     	
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
 	 	 private String xiaoshouqy;
	 public void setXiaoshouqy(String xiaoshouqy)
	 {
		  this.xiaoshouqy = xiaoshouqy;
	 }
   public String getXiaoshouqy()
   { 	    
  	        
      return this.xiaoshouqy;     	
   }
 	 	 private String yxsht;
	 public void setYxsht(String yxsht)
	 {
		  this.yxsht = yxsht;
	 }
   public String getYxsht()
   { 	    
  	        
      return this.yxsht;     	
   }
 	 	 private String zhixingdd;
	 public void setZhixingdd(String zhixingdd)
	 {
		  this.zhixingdd = zhixingdd;
	 }
   public String getZhixingdd()
   { 	    
  	        
      return this.zhixingdd;     	
   }
 	 	 private String zuizhongyh;
	 public void setZuizhongyh(String zuizhongyh)
	 {
		  this.zuizhongyh = zuizhongyh;
	 }
   public String getZuizhongyh()
   { 	    
  	        
      return this.zuizhongyh;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzhetong bkbhtRef;
	 public void setBkbhtRef(com.actiz.platform.application.dataset.pojo.Atzhetong bkbhtRef)
	 {
		  this.bkbhtRef = bkbhtRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getBkbhtRef()
   {
     	return this.bkbhtRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpinzsRef;
	 public void setChanpinzsRef(com.actiz.platform.application.dataset.pojo.Atzchanpindl chanpinzsRef)
	 {
		  this.chanpinzsRef = chanpinzsRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzchanpindl getChanpinzsRef()
   {
     	return this.chanpinzsRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu cbzxRef;
	 public void setCbzxRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu cbzxRef)
	 {
		  this.cbzxRef = cbzxRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getCbzxRef()
   {
     	return this.cbzxRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef;
	 public void setHetongidRef(com.actiz.platform.application.dataset.pojo.Atzhetong hetongidRef)
	 {
		  this.hetongidRef = hetongidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzhetong getHetongidRef()
   {
     	return this.hetongidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg jingbanrRef;
	 public void setJingbanrRef(com.actiz.platform.application.dataset.pojo.Atztdyg jingbanrRef)
	 {
		  this.jingbanrRef = jingbanrRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getJingbanrRef()
   {
     	return this.jingbanrRef;
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
 
	 private com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaodidRef;
	 public void setToubiaodidRef(com.actiz.platform.application.dataset.pojo.Atztoubiao toubiaodidRef)
	 {
		  this.toubiaodidRef = toubiaodidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztoubiao getToubiaodidRef()
   {
     	return this.toubiaodidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef;
	 public void setWubizlRef(com.actiz.platform.application.dataset.pojo.Atzbizhong wubizlRef)
	 {
		  this.wubizlRef = wubizlRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getWubizlRef()
   {
     	return this.wubizlRef;
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