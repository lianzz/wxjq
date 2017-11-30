package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzkjxyfukuan implements Serializable,IPojo
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
 	 	 private Double bencids;
	 public void setBencids(Double bencids)
	 {
		  this.bencids = bencids;
	 }
   public Double getBencids()
   { 	    
  	        
      return this.bencids;     	
   }
 	 	 private String biaohao;
	 public void setBiaohao(String biaohao)
	 {
		  this.biaohao = biaohao;
	 }
   public String getBiaohao()
   { 	    
  	        
      return this.biaohao;     	
   }
 	 	 private Double danjia2;
	 public void setDanjia2(Double danjia2)
	 {
		  this.danjia2 = danjia2;
	 }
   public Double getDanjia2()
   { 	    
  	        
      return this.danjia2;     	
   }
 	 	 private String danjia;
	 public void setDanjia(String danjia)
	 {
		  this.danjia = danjia;
	 }
   public String getDanjia()
   { 	    
  	        
      return this.danjia;     	
   }
 	 	 private String fapiaoh;
	 public void setFapiaoh(String fapiaoh)
	 {
		  this.fapiaoh = fapiaoh;
	 }
   public String getFapiaoh()
   { 	    
  	        
      return this.fapiaoh;     	
   }
 	 	 private String fujian;
	 public void setFujian(String fujian)
	 {
		  this.fujian = fujian;
	 }
   public String getFujian()
   { 	    
  	        
      return this.fujian;     	
   }
 	 	 private String fukuanlx;
	 public void setFukuanlx(String fukuanlx)
	 {
		  this.fukuanlx = fukuanlx;
	 }
   public String getFukuanlx()
   { 	    
  	        
      return this.fukuanlx;     	
   }
 	 	 private Double gongchengk;
	 public void setGongchengk(Double gongchengk)
	 {
		  this.gongchengk = gongchengk;
	 }
   public Double getGongchengk()
   { 	    
  	        
      return this.gongchengk;     	
   }
 	 	 private Date weituorq;
	 public void setWeituorq(Date weituorq)
	 {
		  this.weituorq = weituorq;
	 }
   public Date getWeituorq()
   { 	    
  	  	    if( this.weituorq != null )
	    {
	        return (Date)new ActizDate( this.weituorq.getTime() );
	    }
	          
      return this.weituorq;     	
   }
 	 	 private String weituonr;
	 public void setWeituonr(String weituonr)
	 {
		  this.weituonr = weituonr;
	 }
   public String getWeituonr()
   { 	    
  	        
      return this.weituonr;     	
   }
 	 	 private Long gongchenghtid;
	 public void setGongchenghtid(Long gongchenghtid)
	 {
		  this.gongchenghtid = gongchenghtid;
	 }
   public Long getGongchenghtid()
   { 	    
  	        
      return this.gongchenghtid;     	
   }
 	 	 private Date jiaofeijz;
	 public void setJiaofeijz(Date jiaofeijz)
	 {
		  this.jiaofeijz = jiaofeijz;
	 }
   public Date getJiaofeijz()
   { 	    
  	  	    if( this.jiaofeijz != null )
	    {
	        return (Date)new ActizDate( this.jiaofeijz.getTime() );
	    }
	          
      return this.jiaofeijz;     	
   }
 	 	 private Date jiezhirq;
	 public void setJiezhirq(Date jiezhirq)
	 {
		  this.jiezhirq = jiezhirq;
	 }
   public Date getJiezhirq()
   { 	    
  	  	    if( this.jiezhirq != null )
	    {
	        return (Date)new ActizDate( this.jiezhirq.getTime() );
	    }
	          
      return this.jiezhirq;     	
   }
 	 	 private String jiezhizd;
	 public void setJiezhizd(String jiezhizd)
	 {
		  this.jiezhizd = jiezhizd;
	 }
   public String getJiezhizd()
   { 	    
  	        
      return this.jiezhizd;     	
   }
 	 	 private String jine;
	 public void setJine(String jine)
	 {
		  this.jine = jine;
	 }
   public String getJine()
   { 	    
  	        
      return this.jine;     	
   }
 	 	 private Date kaitongrq;
	 public void setKaitongrq(Date kaitongrq)
	 {
		  this.kaitongrq = kaitongrq;
	 }
   public Date getKaitongrq()
   { 	    
  	  	    if( this.kaitongrq != null )
	    {
	        return (Date)new ActizDate( this.kaitongrq.getTime() );
	    }
	          
      return this.kaitongrq;     	
   }
 	 	 private String muqianzt;
	 public void setMuqianzt(String muqianzt)
	 {
		  this.muqianzt = muqianzt;
	 }
   public String getMuqianzt()
   { 	    
  	        
      return this.muqianzt;     	
   }
 	 	 private Date shiqirq;
	 public void setShiqirq(Date shiqirq)
	 {
		  this.shiqirq = shiqirq;
	 }
   public Date getShiqirq()
   { 	    
  	  	    if( this.shiqirq != null )
	    {
	        return (Date)new ActizDate( this.shiqirq.getTime() );
	    }
	          
      return this.shiqirq;     	
   }
 	 	 private String qishizd;
	 public void setQishizd(String qishizd)
	 {
		  this.qishizd = qishizd;
	 }
   public String getQishizd()
   { 	    
  	        
      return this.qishizd;     	
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
 	 	 private String hetongh;
	 public void setHetongh(String hetongh)
	 {
		  this.hetongh = hetongh;
	 }
   public String getHetongh()
   { 	    
  	        
      return this.hetongh;     	
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
 	 	 private Double shangcids;
	 public void setShangcids(Double shangcids)
	 {
		  this.shangcids = shangcids;
	 }
   public Double getShangcids()
   { 	    
  	        
      return this.shangcids;     	
   }
 	 	 private Double shihao;
	 public void setShihao(Double shihao)
	 {
		  this.shihao = shihao;
	 }
   public Double getShihao()
   { 	    
  	        
      return this.shihao;     	
   }
 	 	 private String shoulidh;
	 public void setShoulidh(String shoulidh)
	 {
		  this.shoulidh = shoulidh;
	 }
   public String getShoulidh()
   { 	    
  	        
      return this.shoulidh;     	
   }
 	 	 private Integer shuliang;
	 public void setShuliang(Integer shuliang)
	 {
		  this.shuliang = shuliang;
	 }
   public Integer getShuliang()
   { 	    
  	        
      return this.shuliang;     	
   }
 	 	 private String zhaiyao;
	 public void setZhaiyao(String zhaiyao)
	 {
		  this.zhaiyao = zhaiyao;
	 }
   public String getZhaiyao()
   { 	    
  	        
      return this.zhaiyao;     	
   }
 	 	 private String xiangmu;
	 public void setXiangmu(String xiangmu)
	 {
		  this.xiangmu = xiangmu;
	 }
   public String getXiangmu()
   { 	    
  	        
      return this.xiangmu;     	
   }
 	 	 private String xiangmuzy;
	 public void setXiangmuzy(String xiangmuzy)
	 {
		  this.xiangmuzy = xiangmuzy;
	 }
   public String getXiangmuzy()
   { 	    
  	        
      return this.xiangmuzy;     	
   }
 	 	 private Double xiaoji;
	 public void setXiaoji(Double xiaoji)
	 {
		  this.xiaoji = xiaoji;
	 }
   public Double getXiaoji()
   { 	    
  	        
      return this.xiaoji;     	
   }
 	 	 private Double youfei;
	 public void setYoufei(Double youfei)
	 {
		  this.youfei = youfei;
	 }
   public Double getYoufei()
   { 	    
  	        
      return this.youfei;     	
   }
 	 	 private String zhifuqk;
	 public void setZhifuqk(String zhifuqk)
	 {
		  this.zhifuqk = zhifuqk;
	 }
   public String getZhifuqk()
   { 	    
  	        
      return this.zhifuqk;     	
   }
 	 	 private Double zuchefy;
	 public void setZuchefy(Double zuchefy)
	 {
		  this.zuchefy = zuchefy;
	 }
   public Double getZuchefy()
   { 	    
  	        
      return this.zuchefy;     	
   }
 	 	 private String zuixinbxqk;
	 public void setZuixinbxqk(String zuixinbxqk)
	 {
		  this.zuixinbxqk = zuixinbxqk;
	 }
   public String getZuixinbxqk()
   { 	    
  	        
      return this.zuixinbxqk;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzgongchenght gongchenghtidRef;
	 public void setGongchenghtidRef(com.actiz.platform.application.dataset.pojo.Atzgongchenght gongchenghtidRef)
	 {
		  this.gongchenghtidRef = gongchenghtidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgongchenght getGongchenghtidRef()
   {
     	return this.gongchenghtidRef;
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