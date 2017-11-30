/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:23.329
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8eb0655a0000000az{

	
						private Object atzscrw_bianhao;
			
				
										private Object atzscrw_linshibh;
			
				
										private Object atzscrw_jiagongdw;
			
				
										private Object atzscrw_scrwdlx;
			
				
										private Object atzscrw_shifouygb;
			
				
										private Object atzscrw_scjhid;
			
				
										private Object atzscrw_jgrwdh;
			
				
										private Object atzscrw_jgrwmc;
			
				
										private Object atzscrw_beizhu;
			
				
										private Object atzscrw_id;
			
				
					
						public void setAtzscrw_bianhao(Object atzscrw_bianhao){
				this.atzscrw_bianhao = atzscrw_bianhao;
			}
			
	  		public Object getAtzscrw_bianhao(){
	  			return atzscrw_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzscrw_linshibh(Object atzscrw_linshibh){
				this.atzscrw_linshibh = atzscrw_linshibh;
			}
			
	  		public Object getAtzscrw_linshibh(){
	  			return atzscrw_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzscrw_jiagongdw(Object atzscrw_jiagongdw){
				this.atzscrw_jiagongdw = atzscrw_jiagongdw;
			}
			
	  		public Object getAtzscrw_jiagongdw(){
	  			return atzscrw_jiagongdw;
	  		}
  		  		
  				  		
  						public void setAtzscrw_scrwdlx(Object atzscrw_scrwdlx){
				this.atzscrw_scrwdlx = atzscrw_scrwdlx;
			}
			
	  		public Object getAtzscrw_scrwdlx(){
	  			return atzscrw_scrwdlx;
	  		}
  		  		
  				  		
  						public void setAtzscrw_shifouygb(Object atzscrw_shifouygb){
				this.atzscrw_shifouygb = atzscrw_shifouygb;
			}
			
	  		public Object getAtzscrw_shifouygb(){
	  			return atzscrw_shifouygb;
	  		}
  		  		
  				  		
  						public void setAtzscrw_scjhid(Object atzscrw_scjhid){
				this.atzscrw_scjhid = atzscrw_scjhid;
			}
			
	  		public Object getAtzscrw_scjhid(){
	  			return atzscrw_scjhid;
	  		}
  		  		
  				  		
  						public void setAtzscrw_jgrwdh(Object atzscrw_jgrwdh){
				this.atzscrw_jgrwdh = atzscrw_jgrwdh;
			}
			
	  		public Object getAtzscrw_jgrwdh(){
	  			return atzscrw_jgrwdh;
	  		}
  		  		
  				  		
  						public void setAtzscrw_jgrwmc(Object atzscrw_jgrwmc){
				this.atzscrw_jgrwmc = atzscrw_jgrwmc;
			}
			
	  		public Object getAtzscrw_jgrwmc(){
	  			return atzscrw_jgrwmc;
	  		}
  		  		
  				  		
  						public void setAtzscrw_beizhu(Object atzscrw_beizhu){
				this.atzscrw_beizhu = atzscrw_beizhu;
			}
			
	  		public Object getAtzscrw_beizhu(){
	  			return atzscrw_beizhu;
	  		}
  		  		
  				  		
  						public void setAtzscrw_id(Object atzscrw_id){
				this.atzscrw_id = atzscrw_id;
			}
			
	  		public Object getAtzscrw_id(){
	  			return atzscrw_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8eb0655a0000000az init(DataContextHelper context) {
  		F8eb0655a0000000az o = new F8eb0655a0000000az();
									o.setAtzscrw_bianhao(getValue(context,"atzscrw.bianhao"));
						
						  									o.setAtzscrw_linshibh(getValue(context,"atzscrw.linshibh"));
						
						  									o.setAtzscrw_jiagongdw(getValue(context,"atzscrw.jiagongdw"));
						
						  									o.setAtzscrw_scrwdlx(getValue(context,"atzscrw.scrwdlx"));
						
						  									o.setAtzscrw_shifouygb(getValue(context,"atzscrw.shifouygb"));
						
						  									o.setAtzscrw_scjhid(getValue(context,"atzscjh.id"));
						
						  									o.setAtzscrw_jgrwdh(getValue(context,"atzscrw.jgrwdh"));
						
						  									o.setAtzscrw_jgrwmc(getValue(context,"atzscrw.jgrwmc"));
						
						  									o.setAtzscrw_beizhu(getValue(context,"atzscrw.beizhu"));
						
						  									o.setAtzscrw_id(getValue(context,"atzscrw.id"));
						
						  				return o;
	}
	
  	private static String getValue(DataContextHelper context,String contextKey){
		String s = context.getString(contextKey);
		if(s.equals("*")){
			return "";
		}
		else{
			return s;
		}
	}
	
}