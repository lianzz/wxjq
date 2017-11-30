package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzchurukxxxx implements Serializable,IPojo
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
	  	 	 private String cangkugly;
	 public void setCangkugly(String cangkugly)
	 {
		  this.cangkugly = cangkugly;
	 }
   public String getCangkugly()
   { 	    
  	        
      return this.cangkugly;     	
   }
 	 	 private Double danjia;
	 public void setDanjia(Double danjia)
	 {
		  this.danjia = danjia;
	 }
   public Double getDanjia()
   { 	    
  	        
      return this.danjia;     	
   }
 	 	 private String danjubm;
	 public void setDanjubm(String danjubm)
	 {
		  this.danjubm = danjubm;
	 }
   public String getDanjubm()
   { 	    
  	        
      return this.danjubm;     	
   }
 	 	 private String duiyinghth;
	 public void setDuiyinghth(String duiyinghth)
	 {
		  this.duiyinghth = duiyinghth;
	 }
   public String getDuiyinghth()
   { 	    
  	        
      return this.duiyinghth;     	
   }
 	 	 private String gongchengbm;
	 public void setGongchengbm(String gongchengbm)
	 {
		  this.gongchengbm = gongchengbm;
	 }
   public String getGongchengbm()
   { 	    
  	        
      return this.gongchengbm;     	
   }
 	 	 private String gongchengmc;
	 public void setGongchengmc(String gongchengmc)
	 {
		  this.gongchengmc = gongchengmc;
	 }
   public String getGongchengmc()
   { 	    
  	        
      return this.gongchengmc;     	
   }
 	 	 private String guzhangjwxjl;
	 public void setGuzhangjwxjl(String guzhangjwxjl)
	 {
		  this.guzhangjwxjl = guzhangjwxjl;
	 }
   public String getGuzhangjwxjl()
   { 	    
  	        
      return this.guzhangjwxjl;     	
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
 	 	 private String huowulb;
	 public void setHuowulb(String huowulb)
	 {
		  this.huowulb = huowulb;
	 }
   public String getHuowulb()
   { 	    
  	        
      return this.huowulb;     	
   }
 	 	 private Double jihuasl;
	 public void setJihuasl(Double jihuasl)
	 {
		  this.jihuasl = jihuasl;
	 }
   public Double getJihuasl()
   { 	    
  	        
      return this.jihuasl;     	
   }
 	 	 private Date jihuawcrq;
	 public void setJihuawcrq(Date jihuawcrq)
	 {
		  this.jihuawcrq = jihuawcrq;
	 }
   public Date getJihuawcrq()
   { 	    
  	  	    if( this.jihuawcrq != null )
	    {
	        return (Date)new ActizDate( this.jihuawcrq.getTime() );
	    }
	          
      return this.jihuawcrq;     	
   }
 	 	 private String jihuay;
	 public void setJihuay(String jihuay)
	 {
		  this.jihuay = jihuay;
	 }
   public String getJihuay()
   { 	    
  	        
      return this.jihuay;     	
   }
 	 	 private Date jiandangrq;
	 public void setJiandangrq(Date jiandangrq)
	 {
		  this.jiandangrq = jiandangrq;
	 }
   public Date getJiandangrq()
   { 	    
  	  	    if( this.jiandangrq != null )
	    {
	        return (Date)new ActizDate( this.jiandangrq.getTime() );
	    }
	          
      return this.jiandangrq;     	
   }
 	 	 private String kuweibm;
	 public void setKuweibm(String kuweibm)
	 {
		  this.kuweibm = kuweibm;
	 }
   public String getKuweibm()
   { 	    
  	        
      return this.kuweibm;     	
   }
 	 	 private String llhrkry;
	 public void setLlhrkry(String llhrkry)
	 {
		  this.llhrkry = llhrkry;
	 }
   public String getLlhrkry()
   { 	    
  	        
      return this.llhrkry;     	
   }
 	 	 private Double meidwsl;
	 public void setMeidwsl(Double meidwsl)
	 {
		  this.meidwsl = meidwsl;
	 }
   public Double getMeidwsl()
   { 	    
  	        
      return this.meidwsl;     	
   }
 	 	 private String qingdanbm;
	 public void setQingdanbm(String qingdanbm)
	 {
		  this.qingdanbm = qingdanbm;
	 }
   public String getQingdanbm()
   { 	    
  	        
      return this.qingdanbm;     	
   }
 	 	 private String renwubm;
	 public void setRenwubm(String renwubm)
	 {
		  this.renwubm = renwubm;
	 }
   public String getRenwubm()
   { 	    
  	        
      return this.renwubm;     	
   }
 	 	 private String renwuzt;
	 public void setRenwuzt(String renwuzt)
	 {
		  this.renwuzt = renwuzt;
	 }
   public String getRenwuzt()
   { 	    
  	        
      return this.renwuzt;     	
   }
 	 	 private String rukuhckyy;
	 public void setRukuhckyy(String rukuhckyy)
	 {
		  this.rukuhckyy = rukuhckyy;
	 }
   public String getRukuhckyy()
   { 	    
  	        
      return this.rukuhckyy;     	
   }
 	 	 private String shenher;
	 public void setShenher(String shenher)
	 {
		  this.shenher = shenher;
	 }
   public String getShenher()
   { 	    
  	        
      return this.shenher;     	
   }
 	 	 private String shengchanph;
	 public void setShengchanph(String shengchanph)
	 {
		  this.shengchanph = shengchanph;
	 }
   public String getShengchanph()
   { 	    
  	        
      return this.shengchanph;     	
   }
 	 	 private Double shijisl;
	 public void setShijisl(Double shijisl)
	 {
		  this.shijisl = shijisl;
	 }
   public Double getShijisl()
   { 	    
  	        
      return this.shijisl;     	
   }
 	 	 private Date shijiwcrq;
	 public void setShijiwcrq(Date shijiwcrq)
	 {
		  this.shijiwcrq = shijiwcrq;
	 }
   public Date getShijiwcrq()
   { 	    
  	  	    if( this.shijiwcrq != null )
	    {
	        return (Date)new ActizDate( this.shijiwcrq.getTime() );
	    }
	          
      return this.shijiwcrq;     	
   }
 	 	 private String wuliaobm;
	 public void setWuliaobm(String wuliaobm)
	 {
		  this.wuliaobm = wuliaobm;
	 }
   public String getWuliaobm()
   { 	    
  	        
      return this.wuliaobm;     	
   }
 	 	 private String wuliaoms;
	 public void setWuliaoms(String wuliaoms)
	 {
		  this.wuliaoms = wuliaoms;
	 }
   public String getWuliaoms()
   { 	    
  	        
      return this.wuliaoms;     	
   }
 	 	 private String xiangmubm;
	 public void setXiangmubm(String xiangmubm)
	 {
		  this.xiangmubm = xiangmubm;
	 }
   public String getXiangmubm()
   { 	    
  	        
      return this.xiangmubm;     	
   }
 	 	 private String xiangmuhcpmc;
	 public void setXiangmuhcpmc(String xiangmuhcpmc)
	 {
		  this.xiangmuhcpmc = xiangmuhcpmc;
	 }
   public String getXiangmuhcpmc()
   { 	    
  	        
      return this.xiangmuhcpmc;     	
   }
 	 	 private String zhangwubm;
	 public void setZhangwubm(String zhangwubm)
	 {
		  this.zhangwubm = zhangwubm;
	 }
   public String getZhangwubm()
   { 	    
  	        
      return this.zhangwubm;     	
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