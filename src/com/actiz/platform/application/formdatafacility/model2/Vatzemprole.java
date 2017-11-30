/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:45:53.018
*/
package com.actiz.platform.application.formdatafacility.model2;

	import java.sql.Date;
import com.actiz.resource.entity.application.IAppEntityObject;
import java.sql.Timestamp;
import java.io.Serializable;
import java.sql.Blob;

public class Vatzemprole implements IAppEntityObject,Serializable{

				private Long atzemployee_id;
			private String atzemployee_ygseq = "";
			private String atzemployee_empcode = "";
			private String atzemployee_name = "";
			private String atzemployee_sex = "";
			private String atzemployee_mobile = "";
			private String atzemployee_tel = "";
			private String atzemployee_email = "";
			private String atzemployee_faxno = "";
			private String atzemployee_ftel = "";
			private String atzemployee_pemail = "";
			private Date atzemployee_birthday;
			private String atzemployee_degree = "";
			private String atzemployee_photo;
			private Date atzemployee_regdate;
			private Date atzemployee_createtime;
			private Date atzemployee_lmodifytime;
			private String atzemployee_remark;
			private Integer atzemployee_status = 0;
			private Long atzemployee_gangweiid;
			private Long atzemployee_bumenid;
			private String atzemployee_qq = "";
			private String atzemployee_msn = "";
			private String atzemployee_zhengzhimm = "";
			private String atzemployee_wenhuacd = "";
			private String atzemployee_biyeyx = "";
			private String atzemployee_zhuanye = "";
			private String atzemployee_ldhetonglx = "";
			private Date atzemployee_hetongqssj;
			private Date atzemployee_hetongzzsj;
			private String atzemployee_shenfenzhm = "";
			private Date atzemployee_cjgongzuosj;
			private Date atzemployee_jgongsisj;
			private Date atzemployee_jbumensj;
			private String atzemployee_zhaopinqd = "";
			private String atzemployee_dangangs = "";
			private String atzemployee_hunfou = "";
			private String atzemployee_sfyxh = "";
			private String atzemployee_xiaohaixm = "";
			private Date atzemployee_xiaohainy;
			private String atzemployee_xiaohaixb = "";
			private String atzemployee_hukouszd = "";
			private String atzemployee_xjuzhudz = "";
			private String atzemployee_ygjiashuxm = "";
			private String atzemployee_lxdizhi = "";
			private String atzemployee_youbian = "";
			private String atzemployee_lianxifs = "";
			private String atzemployee_zhicheng = "";
			private Date atzemployee_zcpingdingsj;
			private Date atzemployee_zcpsyouxianq;
			private String atzemployee_zcnianshenqk = "";
			private String atzemployee_zcdengji = "";
			private Double atzemployee_tiaoxiusj = 0.0;
			private Double atzemployee_kxsnj = 0.0;
			private String atzemployee_lurur = "";
			private Date atzemployee_lururq;
			private String atzemployee_zuihouxgr = "";
			private Date atzemployee_zuihouxgrq;
			private Long atzemployee_lururid;
			private Long atzemployee_zuihouxgrid;
			private String atzemployee_jiashudh = "";
			private String atzemployee_yuangongz = "";
			private String atzemployee_youwu = "";
			private String atzemployee_gangweizj = "";
			private String atzemployee_sfgx = "";
			private String atzemployee_xingquah = "";
			private String atzemployee_ghgzk = "";
			private String atzemployee_shifoulz = "";
			private Long atztdyg_id;
			private Long atztdyg_tuanduiid;
			private Long atztdyg_yuangongid;
			private String atztdyg_guanxi = "";
			private String atztdyg_yuangongmc = "";
			private String atztdyg_email = "";
			private Integer atztdyg_status = 0;
			private String atztdyg_teamseq = "";
			private Long bc_auth_usr_id;
			private String bc_auth_usr_loginid = "";
			private String bc_auth_usr_passwd = "";
			private Integer bc_auth_usr_easy = 0;
			private Long bc_auth_usr_empid;
			private String bc_auth_usr_empseq = "";
			private String bc_auth_usr_name = "";
			private String bc_auth_usr_email = "";
			private String bc_auth_usr_zipcode = "";
			private String bc_auth_usr_companyaddress = "";
			private String bc_auth_usr_linkman = "";
			private String bc_auth_usr_linkphone = "";
			private String bc_auth_usr_mobilephone = "";
			private String bc_auth_usr_securityquestion1 = "";
			private String bc_auth_usr_securityanswer1 = "";
			private String bc_auth_usr_securityquestion2 = "";
			private String bc_auth_usr_securityanswer2 = "";
			private String bc_auth_usr_artificialperson = "";
			private String bc_auth_usr_status = "";
			private String bc_auth_usr_descn = "";
			private Integer bc_auth_usr_isevolve = 0;
			private String bc_auth_usr_company_code = "";
			private Long bc_auth_usr_module_id;
			private String bc_auth_usr_sn = "";
			private Long bc_auth_usr_relatecompanyid;
			private Long bc_auth_usr_team_employee_id;
			private String bc_auth_usr_employee_name = "";
			private String bc_auth_usr_teamseq = "";
			private Long bc_auth_roles_id;
			private Integer bc_auth_roles_ispublic = 0;
			private Integer bc_auth_roles_isevolve = 0;
			private Long bc_auth_roles_module_id;
			private Long bc_auth_roles_resource_id;
			private String bc_auth_roles_name = "";
			private Long bc_auth_roles_parent_role_id;
			private String bc_auth_roles_description = "";
			private Long bc_auth_userrole_id;
			private Long bc_auth_userrole_user_id;
			private Long bc_auth_userrole_role_id;
			private Long bc_auth_userrole_module_id;
			private Integer bc_auth_userrole_isevolve = 0;
	
		
		public void setAtzemployee_id(Long atzemployee_id){
			this.atzemployee_id = atzemployee_id;
		}
		
  		public Long getAtzemployee_id(){
  			return atzemployee_id;
  		}
  		
		public void setAtzemployee_ygseq(String atzemployee_ygseq){
			this.atzemployee_ygseq = atzemployee_ygseq;
		}
		
  		public String getAtzemployee_ygseq(){
  			return atzemployee_ygseq;
  		}
  		
		public void setAtzemployee_empcode(String atzemployee_empcode){
			this.atzemployee_empcode = atzemployee_empcode;
		}
		
  		public String getAtzemployee_empcode(){
  			return atzemployee_empcode;
  		}
  		
		public void setAtzemployee_name(String atzemployee_name){
			this.atzemployee_name = atzemployee_name;
		}
		
  		public String getAtzemployee_name(){
  			return atzemployee_name;
  		}
  		
		public void setAtzemployee_sex(String atzemployee_sex){
			this.atzemployee_sex = atzemployee_sex;
		}
		
  		public String getAtzemployee_sex(){
  			return atzemployee_sex;
  		}
  		
		public void setAtzemployee_mobile(String atzemployee_mobile){
			this.atzemployee_mobile = atzemployee_mobile;
		}
		
  		public String getAtzemployee_mobile(){
  			return atzemployee_mobile;
  		}
  		
		public void setAtzemployee_tel(String atzemployee_tel){
			this.atzemployee_tel = atzemployee_tel;
		}
		
  		public String getAtzemployee_tel(){
  			return atzemployee_tel;
  		}
  		
		public void setAtzemployee_email(String atzemployee_email){
			this.atzemployee_email = atzemployee_email;
		}
		
  		public String getAtzemployee_email(){
  			return atzemployee_email;
  		}
  		
		public void setAtzemployee_faxno(String atzemployee_faxno){
			this.atzemployee_faxno = atzemployee_faxno;
		}
		
  		public String getAtzemployee_faxno(){
  			return atzemployee_faxno;
  		}
  		
		public void setAtzemployee_ftel(String atzemployee_ftel){
			this.atzemployee_ftel = atzemployee_ftel;
		}
		
  		public String getAtzemployee_ftel(){
  			return atzemployee_ftel;
  		}
  		
		public void setAtzemployee_pemail(String atzemployee_pemail){
			this.atzemployee_pemail = atzemployee_pemail;
		}
		
  		public String getAtzemployee_pemail(){
  			return atzemployee_pemail;
  		}
  		
		public void setAtzemployee_birthday(Date atzemployee_birthday){
			this.atzemployee_birthday = atzemployee_birthday;
		}
		
  		public Date getAtzemployee_birthday(){
  			return atzemployee_birthday;
  		}
  		
		public void setAtzemployee_degree(String atzemployee_degree){
			this.atzemployee_degree = atzemployee_degree;
		}
		
  		public String getAtzemployee_degree(){
  			return atzemployee_degree;
  		}
  		
		public void setAtzemployee_photo(String atzemployee_photo){
			this.atzemployee_photo = atzemployee_photo;
		}
		
  		public String getAtzemployee_photo(){
  			return atzemployee_photo;
  		}
  		
		public void setAtzemployee_regdate(Date atzemployee_regdate){
			this.atzemployee_regdate = atzemployee_regdate;
		}
		
  		public Date getAtzemployee_regdate(){
  			return atzemployee_regdate;
  		}
  		
		public void setAtzemployee_createtime(Date atzemployee_createtime){
			this.atzemployee_createtime = atzemployee_createtime;
		}
		
  		public Date getAtzemployee_createtime(){
  			return atzemployee_createtime;
  		}
  		
		public void setAtzemployee_lmodifytime(Date atzemployee_lmodifytime){
			this.atzemployee_lmodifytime = atzemployee_lmodifytime;
		}
		
  		public Date getAtzemployee_lmodifytime(){
  			return atzemployee_lmodifytime;
  		}
  		
		public void setAtzemployee_remark(String atzemployee_remark){
			this.atzemployee_remark = atzemployee_remark;
		}
		
  		public String getAtzemployee_remark(){
  			return atzemployee_remark;
  		}
  		
		public void setAtzemployee_status(Integer atzemployee_status){
			this.atzemployee_status = atzemployee_status;
		}
		
  		public Integer getAtzemployee_status(){
  			return atzemployee_status;
  		}
  		
		public void setAtzemployee_gangweiid(Long atzemployee_gangweiid){
			this.atzemployee_gangweiid = atzemployee_gangweiid;
		}
		
  		public Long getAtzemployee_gangweiid(){
  			return atzemployee_gangweiid;
  		}
  		
		public void setAtzemployee_bumenid(Long atzemployee_bumenid){
			this.atzemployee_bumenid = atzemployee_bumenid;
		}
		
  		public Long getAtzemployee_bumenid(){
  			return atzemployee_bumenid;
  		}
  		
		public void setAtzemployee_qq(String atzemployee_qq){
			this.atzemployee_qq = atzemployee_qq;
		}
		
  		public String getAtzemployee_qq(){
  			return atzemployee_qq;
  		}
  		
		public void setAtzemployee_msn(String atzemployee_msn){
			this.atzemployee_msn = atzemployee_msn;
		}
		
  		public String getAtzemployee_msn(){
  			return atzemployee_msn;
  		}
  		
		public void setAtzemployee_zhengzhimm(String atzemployee_zhengzhimm){
			this.atzemployee_zhengzhimm = atzemployee_zhengzhimm;
		}
		
  		public String getAtzemployee_zhengzhimm(){
  			return atzemployee_zhengzhimm;
  		}
  		
		public void setAtzemployee_wenhuacd(String atzemployee_wenhuacd){
			this.atzemployee_wenhuacd = atzemployee_wenhuacd;
		}
		
  		public String getAtzemployee_wenhuacd(){
  			return atzemployee_wenhuacd;
  		}
  		
		public void setAtzemployee_biyeyx(String atzemployee_biyeyx){
			this.atzemployee_biyeyx = atzemployee_biyeyx;
		}
		
  		public String getAtzemployee_biyeyx(){
  			return atzemployee_biyeyx;
  		}
  		
		public void setAtzemployee_zhuanye(String atzemployee_zhuanye){
			this.atzemployee_zhuanye = atzemployee_zhuanye;
		}
		
  		public String getAtzemployee_zhuanye(){
  			return atzemployee_zhuanye;
  		}
  		
		public void setAtzemployee_ldhetonglx(String atzemployee_ldhetonglx){
			this.atzemployee_ldhetonglx = atzemployee_ldhetonglx;
		}
		
  		public String getAtzemployee_ldhetonglx(){
  			return atzemployee_ldhetonglx;
  		}
  		
		public void setAtzemployee_hetongqssj(Date atzemployee_hetongqssj){
			this.atzemployee_hetongqssj = atzemployee_hetongqssj;
		}
		
  		public Date getAtzemployee_hetongqssj(){
  			return atzemployee_hetongqssj;
  		}
  		
		public void setAtzemployee_hetongzzsj(Date atzemployee_hetongzzsj){
			this.atzemployee_hetongzzsj = atzemployee_hetongzzsj;
		}
		
  		public Date getAtzemployee_hetongzzsj(){
  			return atzemployee_hetongzzsj;
  		}
  		
		public void setAtzemployee_shenfenzhm(String atzemployee_shenfenzhm){
			this.atzemployee_shenfenzhm = atzemployee_shenfenzhm;
		}
		
  		public String getAtzemployee_shenfenzhm(){
  			return atzemployee_shenfenzhm;
  		}
  		
		public void setAtzemployee_cjgongzuosj(Date atzemployee_cjgongzuosj){
			this.atzemployee_cjgongzuosj = atzemployee_cjgongzuosj;
		}
		
  		public Date getAtzemployee_cjgongzuosj(){
  			return atzemployee_cjgongzuosj;
  		}
  		
		public void setAtzemployee_jgongsisj(Date atzemployee_jgongsisj){
			this.atzemployee_jgongsisj = atzemployee_jgongsisj;
		}
		
  		public Date getAtzemployee_jgongsisj(){
  			return atzemployee_jgongsisj;
  		}
  		
		public void setAtzemployee_jbumensj(Date atzemployee_jbumensj){
			this.atzemployee_jbumensj = atzemployee_jbumensj;
		}
		
  		public Date getAtzemployee_jbumensj(){
  			return atzemployee_jbumensj;
  		}
  		
		public void setAtzemployee_zhaopinqd(String atzemployee_zhaopinqd){
			this.atzemployee_zhaopinqd = atzemployee_zhaopinqd;
		}
		
  		public String getAtzemployee_zhaopinqd(){
  			return atzemployee_zhaopinqd;
  		}
  		
		public void setAtzemployee_dangangs(String atzemployee_dangangs){
			this.atzemployee_dangangs = atzemployee_dangangs;
		}
		
  		public String getAtzemployee_dangangs(){
  			return atzemployee_dangangs;
  		}
  		
		public void setAtzemployee_hunfou(String atzemployee_hunfou){
			this.atzemployee_hunfou = atzemployee_hunfou;
		}
		
  		public String getAtzemployee_hunfou(){
  			return atzemployee_hunfou;
  		}
  		
		public void setAtzemployee_sfyxh(String atzemployee_sfyxh){
			this.atzemployee_sfyxh = atzemployee_sfyxh;
		}
		
  		public String getAtzemployee_sfyxh(){
  			return atzemployee_sfyxh;
  		}
  		
		public void setAtzemployee_xiaohaixm(String atzemployee_xiaohaixm){
			this.atzemployee_xiaohaixm = atzemployee_xiaohaixm;
		}
		
  		public String getAtzemployee_xiaohaixm(){
  			return atzemployee_xiaohaixm;
  		}
  		
		public void setAtzemployee_xiaohainy(Date atzemployee_xiaohainy){
			this.atzemployee_xiaohainy = atzemployee_xiaohainy;
		}
		
  		public Date getAtzemployee_xiaohainy(){
  			return atzemployee_xiaohainy;
  		}
  		
		public void setAtzemployee_xiaohaixb(String atzemployee_xiaohaixb){
			this.atzemployee_xiaohaixb = atzemployee_xiaohaixb;
		}
		
  		public String getAtzemployee_xiaohaixb(){
  			return atzemployee_xiaohaixb;
  		}
  		
		public void setAtzemployee_hukouszd(String atzemployee_hukouszd){
			this.atzemployee_hukouszd = atzemployee_hukouszd;
		}
		
  		public String getAtzemployee_hukouszd(){
  			return atzemployee_hukouszd;
  		}
  		
		public void setAtzemployee_xjuzhudz(String atzemployee_xjuzhudz){
			this.atzemployee_xjuzhudz = atzemployee_xjuzhudz;
		}
		
  		public String getAtzemployee_xjuzhudz(){
  			return atzemployee_xjuzhudz;
  		}
  		
		public void setAtzemployee_ygjiashuxm(String atzemployee_ygjiashuxm){
			this.atzemployee_ygjiashuxm = atzemployee_ygjiashuxm;
		}
		
  		public String getAtzemployee_ygjiashuxm(){
  			return atzemployee_ygjiashuxm;
  		}
  		
		public void setAtzemployee_lxdizhi(String atzemployee_lxdizhi){
			this.atzemployee_lxdizhi = atzemployee_lxdizhi;
		}
		
  		public String getAtzemployee_lxdizhi(){
  			return atzemployee_lxdizhi;
  		}
  		
		public void setAtzemployee_youbian(String atzemployee_youbian){
			this.atzemployee_youbian = atzemployee_youbian;
		}
		
  		public String getAtzemployee_youbian(){
  			return atzemployee_youbian;
  		}
  		
		public void setAtzemployee_lianxifs(String atzemployee_lianxifs){
			this.atzemployee_lianxifs = atzemployee_lianxifs;
		}
		
  		public String getAtzemployee_lianxifs(){
  			return atzemployee_lianxifs;
  		}
  		
		public void setAtzemployee_zhicheng(String atzemployee_zhicheng){
			this.atzemployee_zhicheng = atzemployee_zhicheng;
		}
		
  		public String getAtzemployee_zhicheng(){
  			return atzemployee_zhicheng;
  		}
  		
		public void setAtzemployee_zcpingdingsj(Date atzemployee_zcpingdingsj){
			this.atzemployee_zcpingdingsj = atzemployee_zcpingdingsj;
		}
		
  		public Date getAtzemployee_zcpingdingsj(){
  			return atzemployee_zcpingdingsj;
  		}
  		
		public void setAtzemployee_zcpsyouxianq(Date atzemployee_zcpsyouxianq){
			this.atzemployee_zcpsyouxianq = atzemployee_zcpsyouxianq;
		}
		
  		public Date getAtzemployee_zcpsyouxianq(){
  			return atzemployee_zcpsyouxianq;
  		}
  		
		public void setAtzemployee_zcnianshenqk(String atzemployee_zcnianshenqk){
			this.atzemployee_zcnianshenqk = atzemployee_zcnianshenqk;
		}
		
  		public String getAtzemployee_zcnianshenqk(){
  			return atzemployee_zcnianshenqk;
  		}
  		
		public void setAtzemployee_zcdengji(String atzemployee_zcdengji){
			this.atzemployee_zcdengji = atzemployee_zcdengji;
		}
		
  		public String getAtzemployee_zcdengji(){
  			return atzemployee_zcdengji;
  		}
  		
		public void setAtzemployee_tiaoxiusj(Double atzemployee_tiaoxiusj){
			this.atzemployee_tiaoxiusj = atzemployee_tiaoxiusj;
		}
		
  		public Double getAtzemployee_tiaoxiusj(){
  			return atzemployee_tiaoxiusj;
  		}
  		
		public void setAtzemployee_kxsnj(Double atzemployee_kxsnj){
			this.atzemployee_kxsnj = atzemployee_kxsnj;
		}
		
  		public Double getAtzemployee_kxsnj(){
  			return atzemployee_kxsnj;
  		}
  		
		public void setAtzemployee_lurur(String atzemployee_lurur){
			this.atzemployee_lurur = atzemployee_lurur;
		}
		
  		public String getAtzemployee_lurur(){
  			return atzemployee_lurur;
  		}
  		
		public void setAtzemployee_lururq(Date atzemployee_lururq){
			this.atzemployee_lururq = atzemployee_lururq;
		}
		
  		public Date getAtzemployee_lururq(){
  			return atzemployee_lururq;
  		}
  		
		public void setAtzemployee_zuihouxgr(String atzemployee_zuihouxgr){
			this.atzemployee_zuihouxgr = atzemployee_zuihouxgr;
		}
		
  		public String getAtzemployee_zuihouxgr(){
  			return atzemployee_zuihouxgr;
  		}
  		
		public void setAtzemployee_zuihouxgrq(Date atzemployee_zuihouxgrq){
			this.atzemployee_zuihouxgrq = atzemployee_zuihouxgrq;
		}
		
  		public Date getAtzemployee_zuihouxgrq(){
  			return atzemployee_zuihouxgrq;
  		}
  		
		public void setAtzemployee_lururid(Long atzemployee_lururid){
			this.atzemployee_lururid = atzemployee_lururid;
		}
		
  		public Long getAtzemployee_lururid(){
  			return atzemployee_lururid;
  		}
  		
		public void setAtzemployee_zuihouxgrid(Long atzemployee_zuihouxgrid){
			this.atzemployee_zuihouxgrid = atzemployee_zuihouxgrid;
		}
		
  		public Long getAtzemployee_zuihouxgrid(){
  			return atzemployee_zuihouxgrid;
  		}
  		
		public void setAtzemployee_jiashudh(String atzemployee_jiashudh){
			this.atzemployee_jiashudh = atzemployee_jiashudh;
		}
		
  		public String getAtzemployee_jiashudh(){
  			return atzemployee_jiashudh;
  		}
  		
		public void setAtzemployee_yuangongz(String atzemployee_yuangongz){
			this.atzemployee_yuangongz = atzemployee_yuangongz;
		}
		
  		public String getAtzemployee_yuangongz(){
  			return atzemployee_yuangongz;
  		}
  		
		public void setAtzemployee_youwu(String atzemployee_youwu){
			this.atzemployee_youwu = atzemployee_youwu;
		}
		
  		public String getAtzemployee_youwu(){
  			return atzemployee_youwu;
  		}
  		
		public void setAtzemployee_gangweizj(String atzemployee_gangweizj){
			this.atzemployee_gangweizj = atzemployee_gangweizj;
		}
		
  		public String getAtzemployee_gangweizj(){
  			return atzemployee_gangweizj;
  		}
  		
		public void setAtzemployee_sfgx(String atzemployee_sfgx){
			this.atzemployee_sfgx = atzemployee_sfgx;
		}
		
  		public String getAtzemployee_sfgx(){
  			return atzemployee_sfgx;
  		}
  		
		public void setAtzemployee_xingquah(String atzemployee_xingquah){
			this.atzemployee_xingquah = atzemployee_xingquah;
		}
		
  		public String getAtzemployee_xingquah(){
  			return atzemployee_xingquah;
  		}
  		
		public void setAtzemployee_ghgzk(String atzemployee_ghgzk){
			this.atzemployee_ghgzk = atzemployee_ghgzk;
		}
		
  		public String getAtzemployee_ghgzk(){
  			return atzemployee_ghgzk;
  		}
  		
		public void setAtzemployee_shifoulz(String atzemployee_shifoulz){
			this.atzemployee_shifoulz = atzemployee_shifoulz;
		}
		
  		public String getAtzemployee_shifoulz(){
  			return atzemployee_shifoulz;
  		}
  		
		public void setAtztdyg_id(Long atztdyg_id){
			this.atztdyg_id = atztdyg_id;
		}
		
  		public Long getAtztdyg_id(){
  			return atztdyg_id;
  		}
  		
		public void setAtztdyg_tuanduiid(Long atztdyg_tuanduiid){
			this.atztdyg_tuanduiid = atztdyg_tuanduiid;
		}
		
  		public Long getAtztdyg_tuanduiid(){
  			return atztdyg_tuanduiid;
  		}
  		
		public void setAtztdyg_yuangongid(Long atztdyg_yuangongid){
			this.atztdyg_yuangongid = atztdyg_yuangongid;
		}
		
  		public Long getAtztdyg_yuangongid(){
  			return atztdyg_yuangongid;
  		}
  		
		public void setAtztdyg_guanxi(String atztdyg_guanxi){
			this.atztdyg_guanxi = atztdyg_guanxi;
		}
		
  		public String getAtztdyg_guanxi(){
  			return atztdyg_guanxi;
  		}
  		
		public void setAtztdyg_yuangongmc(String atztdyg_yuangongmc){
			this.atztdyg_yuangongmc = atztdyg_yuangongmc;
		}
		
  		public String getAtztdyg_yuangongmc(){
  			return atztdyg_yuangongmc;
  		}
  		
		public void setAtztdyg_email(String atztdyg_email){
			this.atztdyg_email = atztdyg_email;
		}
		
  		public String getAtztdyg_email(){
  			return atztdyg_email;
  		}
  		
		public void setAtztdyg_status(Integer atztdyg_status){
			this.atztdyg_status = atztdyg_status;
		}
		
  		public Integer getAtztdyg_status(){
  			return atztdyg_status;
  		}
  		
		public void setAtztdyg_teamseq(String atztdyg_teamseq){
			this.atztdyg_teamseq = atztdyg_teamseq;
		}
		
  		public String getAtztdyg_teamseq(){
  			return atztdyg_teamseq;
  		}
  		
		public void setBc_auth_usr_id(Long bc_auth_usr_id){
			this.bc_auth_usr_id = bc_auth_usr_id;
		}
		
  		public Long getBc_auth_usr_id(){
  			return bc_auth_usr_id;
  		}
  		
		public void setBc_auth_usr_loginid(String bc_auth_usr_loginid){
			this.bc_auth_usr_loginid = bc_auth_usr_loginid;
		}
		
  		public String getBc_auth_usr_loginid(){
  			return bc_auth_usr_loginid;
  		}
  		
		public void setBc_auth_usr_passwd(String bc_auth_usr_passwd){
			this.bc_auth_usr_passwd = bc_auth_usr_passwd;
		}
		
  		public String getBc_auth_usr_passwd(){
  			return bc_auth_usr_passwd;
  		}
  		
		public void setBc_auth_usr_easy(Integer bc_auth_usr_easy){
			this.bc_auth_usr_easy = bc_auth_usr_easy;
		}
		
  		public Integer getBc_auth_usr_easy(){
  			return bc_auth_usr_easy;
  		}
  		
		public void setBc_auth_usr_empid(Long bc_auth_usr_empid){
			this.bc_auth_usr_empid = bc_auth_usr_empid;
		}
		
  		public Long getBc_auth_usr_empid(){
  			return bc_auth_usr_empid;
  		}
  		
		public void setBc_auth_usr_empseq(String bc_auth_usr_empseq){
			this.bc_auth_usr_empseq = bc_auth_usr_empseq;
		}
		
  		public String getBc_auth_usr_empseq(){
  			return bc_auth_usr_empseq;
  		}
  		
		public void setBc_auth_usr_name(String bc_auth_usr_name){
			this.bc_auth_usr_name = bc_auth_usr_name;
		}
		
  		public String getBc_auth_usr_name(){
  			return bc_auth_usr_name;
  		}
  		
		public void setBc_auth_usr_email(String bc_auth_usr_email){
			this.bc_auth_usr_email = bc_auth_usr_email;
		}
		
  		public String getBc_auth_usr_email(){
  			return bc_auth_usr_email;
  		}
  		
		public void setBc_auth_usr_zipcode(String bc_auth_usr_zipcode){
			this.bc_auth_usr_zipcode = bc_auth_usr_zipcode;
		}
		
  		public String getBc_auth_usr_zipcode(){
  			return bc_auth_usr_zipcode;
  		}
  		
		public void setBc_auth_usr_companyaddress(String bc_auth_usr_companyaddress){
			this.bc_auth_usr_companyaddress = bc_auth_usr_companyaddress;
		}
		
  		public String getBc_auth_usr_companyaddress(){
  			return bc_auth_usr_companyaddress;
  		}
  		
		public void setBc_auth_usr_linkman(String bc_auth_usr_linkman){
			this.bc_auth_usr_linkman = bc_auth_usr_linkman;
		}
		
  		public String getBc_auth_usr_linkman(){
  			return bc_auth_usr_linkman;
  		}
  		
		public void setBc_auth_usr_linkphone(String bc_auth_usr_linkphone){
			this.bc_auth_usr_linkphone = bc_auth_usr_linkphone;
		}
		
  		public String getBc_auth_usr_linkphone(){
  			return bc_auth_usr_linkphone;
  		}
  		
		public void setBc_auth_usr_mobilephone(String bc_auth_usr_mobilephone){
			this.bc_auth_usr_mobilephone = bc_auth_usr_mobilephone;
		}
		
  		public String getBc_auth_usr_mobilephone(){
  			return bc_auth_usr_mobilephone;
  		}
  		
		public void setBc_auth_usr_securityquestion1(String bc_auth_usr_securityquestion1){
			this.bc_auth_usr_securityquestion1 = bc_auth_usr_securityquestion1;
		}
		
  		public String getBc_auth_usr_securityquestion1(){
  			return bc_auth_usr_securityquestion1;
  		}
  		
		public void setBc_auth_usr_securityanswer1(String bc_auth_usr_securityanswer1){
			this.bc_auth_usr_securityanswer1 = bc_auth_usr_securityanswer1;
		}
		
  		public String getBc_auth_usr_securityanswer1(){
  			return bc_auth_usr_securityanswer1;
  		}
  		
		public void setBc_auth_usr_securityquestion2(String bc_auth_usr_securityquestion2){
			this.bc_auth_usr_securityquestion2 = bc_auth_usr_securityquestion2;
		}
		
  		public String getBc_auth_usr_securityquestion2(){
  			return bc_auth_usr_securityquestion2;
  		}
  		
		public void setBc_auth_usr_securityanswer2(String bc_auth_usr_securityanswer2){
			this.bc_auth_usr_securityanswer2 = bc_auth_usr_securityanswer2;
		}
		
  		public String getBc_auth_usr_securityanswer2(){
  			return bc_auth_usr_securityanswer2;
  		}
  		
		public void setBc_auth_usr_artificialperson(String bc_auth_usr_artificialperson){
			this.bc_auth_usr_artificialperson = bc_auth_usr_artificialperson;
		}
		
  		public String getBc_auth_usr_artificialperson(){
  			return bc_auth_usr_artificialperson;
  		}
  		
		public void setBc_auth_usr_status(String bc_auth_usr_status){
			this.bc_auth_usr_status = bc_auth_usr_status;
		}
		
  		public String getBc_auth_usr_status(){
  			return bc_auth_usr_status;
  		}
  		
		public void setBc_auth_usr_descn(String bc_auth_usr_descn){
			this.bc_auth_usr_descn = bc_auth_usr_descn;
		}
		
  		public String getBc_auth_usr_descn(){
  			return bc_auth_usr_descn;
  		}
  		
		public void setBc_auth_usr_isevolve(Integer bc_auth_usr_isevolve){
			this.bc_auth_usr_isevolve = bc_auth_usr_isevolve;
		}
		
  		public Integer getBc_auth_usr_isevolve(){
  			return bc_auth_usr_isevolve;
  		}
  		
		public void setBc_auth_usr_company_code(String bc_auth_usr_company_code){
			this.bc_auth_usr_company_code = bc_auth_usr_company_code;
		}
		
  		public String getBc_auth_usr_company_code(){
  			return bc_auth_usr_company_code;
  		}
  		
		public void setBc_auth_usr_module_id(Long bc_auth_usr_module_id){
			this.bc_auth_usr_module_id = bc_auth_usr_module_id;
		}
		
  		public Long getBc_auth_usr_module_id(){
  			return bc_auth_usr_module_id;
  		}
  		
		public void setBc_auth_usr_sn(String bc_auth_usr_sn){
			this.bc_auth_usr_sn = bc_auth_usr_sn;
		}
		
  		public String getBc_auth_usr_sn(){
  			return bc_auth_usr_sn;
  		}
  		
		public void setBc_auth_usr_relatecompanyid(Long bc_auth_usr_relatecompanyid){
			this.bc_auth_usr_relatecompanyid = bc_auth_usr_relatecompanyid;
		}
		
  		public Long getBc_auth_usr_relatecompanyid(){
  			return bc_auth_usr_relatecompanyid;
  		}
  		
		public void setBc_auth_usr_team_employee_id(Long bc_auth_usr_team_employee_id){
			this.bc_auth_usr_team_employee_id = bc_auth_usr_team_employee_id;
		}
		
  		public Long getBc_auth_usr_team_employee_id(){
  			return bc_auth_usr_team_employee_id;
  		}
  		
		public void setBc_auth_usr_employee_name(String bc_auth_usr_employee_name){
			this.bc_auth_usr_employee_name = bc_auth_usr_employee_name;
		}
		
  		public String getBc_auth_usr_employee_name(){
  			return bc_auth_usr_employee_name;
  		}
  		
		public void setBc_auth_usr_teamseq(String bc_auth_usr_teamseq){
			this.bc_auth_usr_teamseq = bc_auth_usr_teamseq;
		}
		
  		public String getBc_auth_usr_teamseq(){
  			return bc_auth_usr_teamseq;
  		}
  		
		public void setBc_auth_roles_id(Long bc_auth_roles_id){
			this.bc_auth_roles_id = bc_auth_roles_id;
		}
		
  		public Long getBc_auth_roles_id(){
  			return bc_auth_roles_id;
  		}
  		
		public void setBc_auth_roles_ispublic(Integer bc_auth_roles_ispublic){
			this.bc_auth_roles_ispublic = bc_auth_roles_ispublic;
		}
		
  		public Integer getBc_auth_roles_ispublic(){
  			return bc_auth_roles_ispublic;
  		}
  		
		public void setBc_auth_roles_isevolve(Integer bc_auth_roles_isevolve){
			this.bc_auth_roles_isevolve = bc_auth_roles_isevolve;
		}
		
  		public Integer getBc_auth_roles_isevolve(){
  			return bc_auth_roles_isevolve;
  		}
  		
		public void setBc_auth_roles_module_id(Long bc_auth_roles_module_id){
			this.bc_auth_roles_module_id = bc_auth_roles_module_id;
		}
		
  		public Long getBc_auth_roles_module_id(){
  			return bc_auth_roles_module_id;
  		}
  		
		public void setBc_auth_roles_resource_id(Long bc_auth_roles_resource_id){
			this.bc_auth_roles_resource_id = bc_auth_roles_resource_id;
		}
		
  		public Long getBc_auth_roles_resource_id(){
  			return bc_auth_roles_resource_id;
  		}
  		
		public void setBc_auth_roles_name(String bc_auth_roles_name){
			this.bc_auth_roles_name = bc_auth_roles_name;
		}
		
  		public String getBc_auth_roles_name(){
  			return bc_auth_roles_name;
  		}
  		
		public void setBc_auth_roles_parent_role_id(Long bc_auth_roles_parent_role_id){
			this.bc_auth_roles_parent_role_id = bc_auth_roles_parent_role_id;
		}
		
  		public Long getBc_auth_roles_parent_role_id(){
  			return bc_auth_roles_parent_role_id;
  		}
  		
		public void setBc_auth_roles_description(String bc_auth_roles_description){
			this.bc_auth_roles_description = bc_auth_roles_description;
		}
		
  		public String getBc_auth_roles_description(){
  			return bc_auth_roles_description;
  		}
  		
		public void setBc_auth_userrole_id(Long bc_auth_userrole_id){
			this.bc_auth_userrole_id = bc_auth_userrole_id;
		}
		
  		public Long getBc_auth_userrole_id(){
  			return bc_auth_userrole_id;
  		}
  		
		public void setBc_auth_userrole_user_id(Long bc_auth_userrole_user_id){
			this.bc_auth_userrole_user_id = bc_auth_userrole_user_id;
		}
		
  		public Long getBc_auth_userrole_user_id(){
  			return bc_auth_userrole_user_id;
  		}
  		
		public void setBc_auth_userrole_role_id(Long bc_auth_userrole_role_id){
			this.bc_auth_userrole_role_id = bc_auth_userrole_role_id;
		}
		
  		public Long getBc_auth_userrole_role_id(){
  			return bc_auth_userrole_role_id;
  		}
  		
		public void setBc_auth_userrole_module_id(Long bc_auth_userrole_module_id){
			this.bc_auth_userrole_module_id = bc_auth_userrole_module_id;
		}
		
  		public Long getBc_auth_userrole_module_id(){
  			return bc_auth_userrole_module_id;
  		}
  		
		public void setBc_auth_userrole_isevolve(Integer bc_auth_userrole_isevolve){
			this.bc_auth_userrole_isevolve = bc_auth_userrole_isevolve;
		}
		
  		public Integer getBc_auth_userrole_isevolve(){
  			return bc_auth_userrole_isevolve;
  		}
  			public Long getId(){
			return getAtzemployee_id();
		}
		
		public String getObjectLabel(){
  			return "";
  		}
  		
    	
}