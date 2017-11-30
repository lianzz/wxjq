package com.actiz.platform.application.dataset.pojo;

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Blob;
import com.actiz.platform.application.dataset.other.IPojo;
import com.actiz.util.jdk.*;

public class Atzemployee implements Serializable,IPojo
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
	  	 	 private String remark;
	 public void setRemark(String remark)
	 {
		  this.remark = remark;
	 }
   public String getRemark()
   { 	    
  	        
      return this.remark;     	
   }
 	 	 private String biyeyx;
	 public void setBiyeyx(String biyeyx)
	 {
		  this.biyeyx = biyeyx;
	 }
   public String getBiyeyx()
   { 	    
  	        
      return this.biyeyx;     	
   }
 	 	 private Long bumenid;
	 public void setBumenid(Long bumenid)
	 {
		  this.bumenid = bumenid;
	 }
   public Long getBumenid()
   { 	    
  	        
      return this.bumenid;     	
   }
 	 	 private Date cjgongzuosj;
	 public void setCjgongzuosj(Date cjgongzuosj)
	 {
		  this.cjgongzuosj = cjgongzuosj;
	 }
   public Date getCjgongzuosj()
   { 	    
  	  	    if( this.cjgongzuosj != null )
	    {
	        return (Date)new ActizDate( this.cjgongzuosj.getTime() );
	    }
	          
      return this.cjgongzuosj;     	
   }
 	 	 private Date birthday;
	 public void setBirthday(Date birthday)
	 {
		  this.birthday = birthday;
	 }
   public Date getBirthday()
   { 	    
  	  	    if( this.birthday != null )
	    {
	        return (Date)new ActizDate( this.birthday.getTime() );
	    }
	          
      return this.birthday;     	
   }
 	 	 private String faxno;
	 public void setFaxno(String faxno)
	 {
		  this.faxno = faxno;
	 }
   public String getFaxno()
   { 	    
  	        
      return this.faxno;     	
   }
 	 	 private Date createtime;
	 public void setCreatetime(Date createtime)
	 {
		  this.createtime = createtime;
	 }
   public Date getCreatetime()
   { 	    
  	  	    if( this.createtime != null )
	    {
	        return (Date)new ActizDate( this.createtime.getTime() );
	    }
	          
      return this.createtime;     	
   }
 	 	 private String dangangs;
	 public void setDangangs(String dangangs)
	 {
		  this.dangangs = dangangs;
	 }
   public String getDangangs()
   { 	    
  	        
      return this.dangangs;     	
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
 	 	 private Long gangweiid;
	 public void setGangweiid(Long gangweiid)
	 {
		  this.gangweiid = gangweiid;
	 }
   public Long getGangweiid()
   { 	    
  	        
      return this.gangweiid;     	
   }
 	 	 private String gangweizj;
	 public void setGangweizj(String gangweizj)
	 {
		  this.gangweizj = gangweizj;
	 }
   public String getGangweizj()
   { 	    
  	        
      return this.gangweizj;     	
   }
 	 	 private String pemail;
	 public void setPemail(String pemail)
	 {
		  this.pemail = pemail;
	 }
   public String getPemail()
   { 	    
  	        
      return this.pemail;     	
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
 	 	 private String ghgzk;
	 public void setGhgzk(String ghgzk)
	 {
		  this.ghgzk = ghgzk;
	 }
   public String getGhgzk()
   { 	    
  	        
      return this.ghgzk;     	
   }
 	 	 private String ldhetonglx;
	 public void setLdhetonglx(String ldhetonglx)
	 {
		  this.ldhetonglx = ldhetonglx;
	 }
   public String getLdhetonglx()
   { 	    
  	        
      return this.ldhetonglx;     	
   }
 	 	 private Date hetongqssj;
	 public void setHetongqssj(Date hetongqssj)
	 {
		  this.hetongqssj = hetongqssj;
	 }
   public Date getHetongqssj()
   { 	    
  	  	    if( this.hetongqssj != null )
	    {
	        return (Date)new ActizDate( this.hetongqssj.getTime() );
	    }
	          
      return this.hetongqssj;     	
   }
 	 	 private Date hetongzzsj;
	 public void setHetongzzsj(Date hetongzzsj)
	 {
		  this.hetongzzsj = hetongzzsj;
	 }
   public Date getHetongzzsj()
   { 	    
  	  	    if( this.hetongzzsj != null )
	    {
	        return (Date)new ActizDate( this.hetongzzsj.getTime() );
	    }
	          
      return this.hetongzzsj;     	
   }
 	 	 private String hukouszd;
	 public void setHukouszd(String hukouszd)
	 {
		  this.hukouszd = hukouszd;
	 }
   public String getHukouszd()
   { 	    
  	        
      return this.hukouszd;     	
   }
 	 	 private String hunfou;
	 public void setHunfou(String hunfou)
	 {
		  this.hunfou = hunfou;
	 }
   public String getHunfou()
   { 	    
  	        
      return this.hunfou;     	
   }
 	 	 private String jiashudh;
	 public void setJiashudh(String jiashudh)
	 {
		  this.jiashudh = jiashudh;
	 }
   public String getJiashudh()
   { 	    
  	        
      return this.jiashudh;     	
   }
 	 	 private String lxdizhi;
	 public void setLxdizhi(String lxdizhi)
	 {
		  this.lxdizhi = lxdizhi;
	 }
   public String getLxdizhi()
   { 	    
  	        
      return this.lxdizhi;     	
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
 	 	 private String youbian;
	 public void setYoubian(String youbian)
	 {
		  this.youbian = youbian;
	 }
   public String getYoubian()
   { 	    
  	        
      return this.youbian;     	
   }
 	 	 private String ftel;
	 public void setFtel(String ftel)
	 {
		  this.ftel = ftel;
	 }
   public String getFtel()
   { 	    
  	        
      return this.ftel;     	
   }
 	 	 private Date jbumensj;
	 public void setJbumensj(Date jbumensj)
	 {
		  this.jbumensj = jbumensj;
	 }
   public Date getJbumensj()
   { 	    
  	  	    if( this.jbumensj != null )
	    {
	        return (Date)new ActizDate( this.jbumensj.getTime() );
	    }
	          
      return this.jbumensj;     	
   }
 	 	 private Date jgongsisj;
	 public void setJgongsisj(Date jgongsisj)
	 {
		  this.jgongsisj = jgongsisj;
	 }
   public Date getJgongsisj()
   { 	    
  	  	    if( this.jgongsisj != null )
	    {
	        return (Date)new ActizDate( this.jgongsisj.getTime() );
	    }
	          
      return this.jgongsisj;     	
   }
 	 	 private String zcdengji;
	 public void setZcdengji(String zcdengji)
	 {
		  this.zcdengji = zcdengji;
	 }
   public String getZcdengji()
   { 	    
  	        
      return this.zcdengji;     	
   }
 	 	 private Double tiaoxiusj;
	 public void setTiaoxiusj(Double tiaoxiusj)
	 {
		  this.tiaoxiusj = tiaoxiusj;
	 }
   public Double getTiaoxiusj()
   { 	    
  	        
      return this.tiaoxiusj;     	
   }
 	 	 private Double kxsnj;
	 public void setKxsnj(Double kxsnj)
	 {
		  this.kxsnj = kxsnj;
	 }
   public Double getKxsnj()
   { 	    
  	        
      return this.kxsnj;     	
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
 	 	 private Long lururid;
	 public void setLururid(Long lururid)
	 {
		  this.lururid = lururid;
	 }
   public Long getLururid()
   { 	    
  	        
      return this.lururid;     	
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
 	 	 private String shenfenzhm;
	 public void setShenfenzhm(String shenfenzhm)
	 {
		  this.shenfenzhm = shenfenzhm;
	 }
   public String getShenfenzhm()
   { 	    
  	        
      return this.shenfenzhm;     	
   }
 	 	 private String shifoulz;
	 public void setShifoulz(String shifoulz)
	 {
		  this.shifoulz = shifoulz;
	 }
   public String getShifoulz()
   { 	    
  	        
      return this.shifoulz;     	
   }
 	 	 private String sfyxh;
	 public void setSfyxh(String sfyxh)
	 {
		  this.sfyxh = sfyxh;
	 }
   public String getSfyxh()
   { 	    
  	        
      return this.sfyxh;     	
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
 	 	 private String sfgx;
	 public void setSfgx(String sfgx)
	 {
		  this.sfgx = sfgx;
	 }
   public String getSfgx()
   { 	    
  	        
      return this.sfgx;     	
   }
 	 	 private Integer status;
	 public void setStatus(Integer status)
	 {
		  this.status = status;
	 }
   public Integer getStatus()
   { 	    
  	        
      return this.status;     	
   }
 	 	 private String wenhuacd;
	 public void setWenhuacd(String wenhuacd)
	 {
		  this.wenhuacd = wenhuacd;
	 }
   public String getWenhuacd()
   { 	    
  	        
      return this.wenhuacd;     	
   }
 	 	 private String xjuzhudz;
	 public void setXjuzhudz(String xjuzhudz)
	 {
		  this.xjuzhudz = xjuzhudz;
	 }
   public String getXjuzhudz()
   { 	    
  	        
      return this.xjuzhudz;     	
   }
 	 	 private Date xiaohainy;
	 public void setXiaohainy(Date xiaohainy)
	 {
		  this.xiaohainy = xiaohainy;
	 }
   public Date getXiaohainy()
   { 	    
  	  	    if( this.xiaohainy != null )
	    {
	        return (Date)new ActizDate( this.xiaohainy.getTime() );
	    }
	          
      return this.xiaohainy;     	
   }
 	 	 private String xiaohaixb;
	 public void setXiaohaixb(String xiaohaixb)
	 {
		  this.xiaohaixb = xiaohaixb;
	 }
   public String getXiaohaixb()
   { 	    
  	        
      return this.xiaohaixb;     	
   }
 	 	 private String xiaohaixm;
	 public void setXiaohaixm(String xiaohaixm)
	 {
		  this.xiaohaixm = xiaohaixm;
	 }
   public String getXiaohaixm()
   { 	    
  	        
      return this.xiaohaixm;     	
   }
 	 	 private String xingquah;
	 public void setXingquah(String xingquah)
	 {
		  this.xingquah = xingquah;
	 }
   public String getXingquah()
   { 	    
  	        
      return this.xingquah;     	
   }
 	 	 private String sex;
	 public void setSex(String sex)
	 {
		  this.sex = sex;
	 }
   public String getSex()
   { 	    
  	        
      return this.sex;     	
   }
 	 	 private String name;
	 public void setName(String name)
	 {
		  this.name = name;
	 }
   public String getName()
   { 	    
  	        
      return this.name;     	
   }
 	 	 private String degree;
	 public void setDegree(String degree)
	 {
		  this.degree = degree;
	 }
   public String getDegree()
   { 	    
  	        
      return this.degree;     	
   }
 	 	 private String youwu;
	 public void setYouwu(String youwu)
	 {
		  this.youwu = youwu;
	 }
   public String getYouwu()
   { 	    
  	        
      return this.youwu;     	
   }
 	 	 private String empcode;
	 public void setEmpcode(String empcode)
	 {
		  this.empcode = empcode;
	 }
   public String getEmpcode()
   { 	    
  	        
      return this.empcode;     	
   }
 	 	 private String ygjiashuxm;
	 public void setYgjiashuxm(String ygjiashuxm)
	 {
		  this.ygjiashuxm = ygjiashuxm;
	 }
   public String getYgjiashuxm()
   { 	    
  	        
      return this.ygjiashuxm;     	
   }
 	 	 private String ygseq;
	 public void setYgseq(String ygseq)
	 {
		  this.ygseq = ygseq;
	 }
   public String getYgseq()
   { 	    
  	        
      return this.ygseq;     	
   }
 	 	 private String photo;
	 public void setPhoto(String photo)
	 {
		  this.photo = photo;
	 }
   public String getPhoto()
   { 	    
  	        
      return this.photo;     	
   }
 	 	 private String yuangongz;
	 public void setYuangongz(String yuangongz)
	 {
		  this.yuangongz = yuangongz;
	 }
   public String getYuangongz()
   { 	    
  	        
      return this.yuangongz;     	
   }
 	 	 private String zhaopinqd;
	 public void setZhaopinqd(String zhaopinqd)
	 {
		  this.zhaopinqd = zhaopinqd;
	 }
   public String getZhaopinqd()
   { 	    
  	        
      return this.zhaopinqd;     	
   }
 	 	 private String zhengzhimm;
	 public void setZhengzhimm(String zhengzhimm)
	 {
		  this.zhengzhimm = zhengzhimm;
	 }
   public String getZhengzhimm()
   { 	    
  	        
      return this.zhengzhimm;     	
   }
 	 	 private String zhicheng;
	 public void setZhicheng(String zhicheng)
	 {
		  this.zhicheng = zhicheng;
	 }
   public String getZhicheng()
   { 	    
  	        
      return this.zhicheng;     	
   }
 	 	 private Date zcpingdingsj;
	 public void setZcpingdingsj(Date zcpingdingsj)
	 {
		  this.zcpingdingsj = zcpingdingsj;
	 }
   public Date getZcpingdingsj()
   { 	    
  	  	    if( this.zcpingdingsj != null )
	    {
	        return (Date)new ActizDate( this.zcpingdingsj.getTime() );
	    }
	          
      return this.zcpingdingsj;     	
   }
 	 	 private Date zcpsyouxianq;
	 public void setZcpsyouxianq(Date zcpsyouxianq)
	 {
		  this.zcpsyouxianq = zcpsyouxianq;
	 }
   public Date getZcpsyouxianq()
   { 	    
  	  	    if( this.zcpsyouxianq != null )
	    {
	        return (Date)new ActizDate( this.zcpsyouxianq.getTime() );
	    }
	          
      return this.zcpsyouxianq;     	
   }
 	 	 private String zcnianshenqk;
	 public void setZcnianshenqk(String zcnianshenqk)
	 {
		  this.zcnianshenqk = zcnianshenqk;
	 }
   public String getZcnianshenqk()
   { 	    
  	        
      return this.zcnianshenqk;     	
   }
 	 	 private Date regdate;
	 public void setRegdate(Date regdate)
	 {
		  this.regdate = regdate;
	 }
   public Date getRegdate()
   { 	    
  	  	    if( this.regdate != null )
	    {
	        return (Date)new ActizDate( this.regdate.getTime() );
	    }
	          
      return this.regdate;     	
   }
 	 	 private String zhuanye;
	 public void setZhuanye(String zhuanye)
	 {
		  this.zhuanye = zhuanye;
	 }
   public String getZhuanye()
   { 	    
  	        
      return this.zhuanye;     	
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
 	 	 private Long zuihouxgrid;
	 public void setZuihouxgrid(Long zuihouxgrid)
	 {
		  this.zuihouxgrid = zuihouxgrid;
	 }
   public Long getZuihouxgrid()
   { 	    
  	        
      return this.zuihouxgrid;     	
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
 	 	 private Date lmodifytime;
	 public void setLmodifytime(Date lmodifytime)
	 {
		  this.lmodifytime = lmodifytime;
	 }
   public Date getLmodifytime()
   { 	    
  	  	    if( this.lmodifytime != null )
	    {
	        return (Date)new ActizDate( this.lmodifytime.getTime() );
	    }
	          
      return this.lmodifytime;     	
   }
  
	 private com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef;
	 public void setBumenidRef(com.actiz.platform.application.dataset.pojo.Atzdepartment bumenidRef)
	 {
		  this.bumenidRef = bumenidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzdepartment getBumenidRef()
   {
     	return this.bumenidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzgangwei gangweiidRef;
	 public void setGangweiidRef(com.actiz.platform.application.dataset.pojo.Atzgangwei gangweiidRef)
	 {
		  this.gangweiidRef = gangweiidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzgangwei getGangweiidRef()
   {
     	return this.gangweiidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef;
	 public void setLururidRef(com.actiz.platform.application.dataset.pojo.Atzemployee lururidRef)
	 {
		  this.lururidRef = lururidRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getLururidRef()
   {
     	return this.lururidRef;
   }
 
	 private com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef;
	 public void setZuihouxgridRef(com.actiz.platform.application.dataset.pojo.Atzemployee zuihouxgridRef)
	 {
		  this.zuihouxgridRef = zuihouxgridRef;
	 }
   public com.actiz.platform.application.dataset.pojo.Atzemployee getZuihouxgridRef()
   {
     	return this.zuihouxgridRef;
   }
  
	private java.util.Set atzchildrenSet;
	public void setAtzchildrenSet(java.util.Set atzchildrenSet)
	{
		 this.atzchildrenSet = atzchildrenSet;
	}
  public java.util.Set getAtzchildrenSet()
  {
     return this.atzchildrenSet;
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