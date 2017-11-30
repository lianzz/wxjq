package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzcaigoujh implements Serializable,IPojo
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
	  	 	 private Long bizhong;
	 public void setBizhong(Long bizhong)
	 {
		  this.bizhong = bizhong;
	 }
   public Long getBizhong()
   { 	    
  	        
      return this.bizhong;     	
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
 	 	 private String biangengtj;
	 public void setBiangengtj(String biangengtj)
	 {
		  this.biangengtj = biangengtj;
	 }
   public String getBiangengtj()
   { 	    
  	        
      return this.biangengtj;     	
   }
 	 	 private String caigoujhly;
	 public void setCaigoujhly(String caigoujhly)
	 {
		  this.caigoujhly = caigoujhly;
	 }
   public String getCaigoujhly()
   { 	    
  	        
      return this.caigoujhly;     	
   }
 	 	 private String cgxqdh;
	 public void setCgxqdh(String cgxqdh)
	 {
		  this.cgxqdh = cgxqdh;
	 }
   public String getCgxqdh()
   { 	    
  	        
      return this.cgxqdh;     	
   }
 	 	 private Integer caigouzq;
	 public void setCaigouzq(Integer caigouzq)
	 {
		  this.caigouzq = caigouzq;
	 }
   public Integer getCaigouzq()
   { 	    
  	        
      return this.caigouzq;     	
   }
 	 	 private String danjulx;
	 public void setDanjulx(String danjulx)
	 {
		  this.danjulx = danjulx;
	 }
   public String getDanjulx()
   { 	    
  	        
      return this.danjulx;     	
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
 	 	 private String lyids;
	 public void setLyids(String lyids)
	 {
		  this.lyids = lyids;
	 }
   public String getLyids()
   { 	    
  	        
      return this.lyids;     	
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
 	 	 private Date shtgsj;
	 public void setShtgsj(Date shtgsj)
	 {
		  this.shtgsj = shtgsj;
	 }
   public Date getShtgsj()
   { 	    
  	  	    if( this.shtgsj != null )
	    {
	        return (Date)new ActizDate( this.shtgsj.getTime() );
	    }
	          
      return this.shtgsj;     	
   }
 	 	 private Date shenhewcrq;
	 public void setShenhewcrq(Date shenhewcrq)
	 {
		  this.shenhewcrq = shenhewcrq;
	 }
   public Date getShenhewcrq()
   { 	    
  	  	    if( this.shenhewcrq != null )
	    {
	        return (Date)new ActizDate( this.shenhewcrq.getTime() );
	    }
	          
      return this.shenhewcrq;     	
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
 	 	 private Long scjhid;
	 public void setScjhid(Long scjhid)
	 {
		  this.scjhid = scjhid;
	 }
   public Long getScjhid()
   { 	    
  	        
      return this.scjhid;     	
   }
 	 	 private String shifoufsh;
	 public void setShifoufsh(String shifoufsh)
	 {
		  this.shifoufsh = shifoufsh;
	 }
   public String getShifoufsh()
   { 	    
  	        
      return this.shifoufsh;     	
   }
 	 	 private String shifouqbcg;
	 public void setShifouqbcg(String shifouqbcg)
	 {
		  this.shifouqbcg = shifouqbcg;
	 }
   public String getShifouqbcg()
   { 	    
  	        
      return this.shifouqbcg;     	
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
 	 	 private String shifouzxhxg;
	 public void setShifouzxhxg(String shifouzxhxg)
	 {
		  this.shifouzxhxg = shifouzxhxg;
	 }
   public String getShifouzxhxg()
   { 	    
  	        
      return this.shifouzxhxg;     	
   }
 	 	 private String shifoucxbj;
	 public void setShifoucxbj(String shifoucxbj)
	 {
		  this.shifoucxbj = shifoucxbj;
	 }
   public String getShifoucxbj()
   { 	    
  	        
      return this.shifoucxbj;     	
   }
 	 	 private String songhuodz;
	 public void setSonghuodz(String songhuodz)
	 {
		  this.songhuodz = songhuodz;
	 }
   public String getSonghuodz()
   { 	    
  	        
      return this.songhuodz;     	
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
 	 	 private Long tianzhibm;
	 public void setTianzhibm(Long tianzhibm)
	 {
		  this.tianzhibm = tianzhibm;
	 }
   public Long getTianzhibm()
   { 	    
  	        
      return this.tianzhibm;     	
   }
 	 	 private String tianzhir;
	 public void setTianzhir(String tianzhir)
	 {
		  this.tianzhir = tianzhir;
	 }
   public String getTianzhir()
   { 	    
  	        
      return this.tianzhir;     	
   }
 	 	 private Long tianzhirid;
	 public void setTianzhirid(Long tianzhirid)
	 {
		  this.tianzhirid = tianzhirid;
	 }
   public Long getTianzhirid()
   { 	    
  	        
      return this.tianzhirid;     	
   }
 	 	 private Date tianzhirq;
	 public void setTianzhirq(Date tianzhirq)
	 {
		  this.tianzhirq = tianzhirq;
	 }
   public Date getTianzhirq()
   { 	    
  	  	    if( this.tianzhirq != null )
	    {
	        return (Date)new ActizDate( this.tianzhirq.getTime() );
	    }
	          
      return this.tianzhirq;     	
   }
 	 	 private Double waibihl;
	 public void setWaibihl(Double waibihl)
	 {
		  this.waibihl = waibihl;
	 }
   public Double getWaibihl()
   { 	    
  	        
      return this.waibihl;     	
   }
 	 	 private Long xiangmubh;
	 public void setXiangmubh(Long xiangmubh)
	 {
		  this.xiangmubh = xiangmubh;
	 }
   public Long getXiangmubh()
   { 	    
  	        
      return this.xiangmubh;     	
   }
 	 	 private Long xuqiushzg;
	 public void setXuqiushzg(Long xuqiushzg)
	 {
		  this.xuqiushzg = xuqiushzg;
	 }
   public Long getXuqiushzg()
   { 	    
  	        
      return this.xuqiushzg;     	
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
 	 	 private Double zongjia;
	 public void setZongjia(Double zongjia)
	 {
		  this.zongjia = zongjia;
	 }
   public Double getZongjia()
   { 	    
  	        
      return this.zongjia;     	
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
  
	 private com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongRef;
	 public void setBizhongRef(com.actiz.platform.application.dataset.pojo.Atzbizhong bizhongRef)
	 {
		  this.bizhongRef = bizhongRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzbizhong getBizhongRef()
   {
     	return this.bizhongRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef;
	 public void setScjhidRef(com.actiz.platform.application.dataset.pojo.Atzscjh scjhidRef)
	 {
		  this.scjhidRef = scjhidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzscjh getScjhidRef()
   {
     	return this.scjhidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment tianzhibmRef;
	 public void setTianzhibmRef(com.actiz.platform.application.dataset.pojo.Atzdepartment tianzhibmRef)
	 {
		  this.tianzhibmRef = tianzhibmRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getTianzhibmRef()
   {
     	return this.tianzhibmRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg tianzhiridRef;
	 public void setTianzhiridRef(com.actiz.platform.application.dataset.pojo.Atztdyg tianzhiridRef)
	 {
		  this.tianzhiridRef = tianzhiridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getTianzhiridRef()
   {
     	return this.tianzhiridRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmubhRef;
	 public void setXiangmubhRef(com.actiz.platform.application.dataset.pojo.Atzxiangmu xiangmubhRef)
	 {
		  this.xiangmubhRef = xiangmubhRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzxiangmu getXiangmubhRef()
   {
     	return this.xiangmubhRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atztdyg xuqiushzgRef;
	 public void setXuqiushzgRef(com.actiz.platform.application.dataset.pojo.Atztdyg xuqiushzgRef)
	 {
		  this.xuqiushzgRef = xuqiushzgRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atztdyg getXuqiushzgRef()
   {
     	return this.xuqiushzgRef;
   }
  
	private java.util.Set atzbiangengxxSet;
	public void setAtzbiangengxxSet(java.util.Set atzbiangengxxSet)
	{
		 this.atzbiangengxxSet = atzbiangengxxSet;
	}
  public java.util.Set getAtzbiangengxxSet()
  {
     return this.atzbiangengxxSet;
  }
 
	private java.util.Set atzcaigoujhmxSet;
	public void setAtzcaigoujhmxSet(java.util.Set atzcaigoujhmxSet)
	{
		 this.atzcaigoujhmxSet = atzcaigoujhmxSet;
	}
  public java.util.Set getAtzcaigoujhmxSet()
  {
     return this.atzcaigoujhmxSet;
  }
 
	private java.util.Set atzcgjhshenhejlSet;
	public void setAtzcgjhshenhejlSet(java.util.Set atzcgjhshenhejlSet)
	{
		 this.atzcgjhshenhejlSet = atzcgjhshenhejlSet;
	}
  public java.util.Set getAtzcgjhshenhejlSet()
  {
     return this.atzcgjhshenhejlSet;
  }
 
	private java.util.Set atzcaigouxqmxSet;
	public void setAtzcaigouxqmxSet(java.util.Set atzcaigouxqmxSet)
	{
		 this.atzcaigouxqmxSet = atzcaigouxqmxSet;
	}
  public java.util.Set getAtzcaigouxqmxSet()
  {
     return this.atzcaigouxqmxSet;
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