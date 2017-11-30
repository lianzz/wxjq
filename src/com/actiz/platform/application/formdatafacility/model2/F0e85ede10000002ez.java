/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:48:58.896
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F0e85ede10000002ez{

	
						private Object atzyewuzc_bianhao;
			
				
										private Object atzyewuzc_shenqingr;
			
				
										private Object atzyewuzc_yaoqiuzcbm;
			
				
										private Object atzyewuzc_kehu;
			
				
										private Object atzyewuzc_danjuzt;
			
				
										private Object atzyewuzc_xmmingcheng;
			
				
										private Object atzyewuzc_hetongid;
			
				
										private Object atzyewuzc_id;
			
				
					
						public void setAtzyewuzc_bianhao(Object atzyewuzc_bianhao){
				this.atzyewuzc_bianhao = atzyewuzc_bianhao;
			}
			
	  		public Object getAtzyewuzc_bianhao(){
	  			return atzyewuzc_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_shenqingr(Object atzyewuzc_shenqingr){
				this.atzyewuzc_shenqingr = atzyewuzc_shenqingr;
			}
			
	  		public Object getAtzyewuzc_shenqingr(){
	  			return atzyewuzc_shenqingr;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_yaoqiuzcbm(Object atzyewuzc_yaoqiuzcbm){
				this.atzyewuzc_yaoqiuzcbm = atzyewuzc_yaoqiuzcbm;
			}
			
	  		public Object getAtzyewuzc_yaoqiuzcbm(){
	  			return atzyewuzc_yaoqiuzcbm;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_kehu(Object atzyewuzc_kehu){
				this.atzyewuzc_kehu = atzyewuzc_kehu;
			}
			
	  		public Object getAtzyewuzc_kehu(){
	  			return atzyewuzc_kehu;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_danjuzt(Object atzyewuzc_danjuzt){
				this.atzyewuzc_danjuzt = atzyewuzc_danjuzt;
			}
			
	  		public Object getAtzyewuzc_danjuzt(){
	  			return atzyewuzc_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_xmmingcheng(Object atzyewuzc_xmmingcheng){
				this.atzyewuzc_xmmingcheng = atzyewuzc_xmmingcheng;
			}
			
	  		public Object getAtzyewuzc_xmmingcheng(){
	  			return atzyewuzc_xmmingcheng;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_hetongid(Object atzyewuzc_hetongid){
				this.atzyewuzc_hetongid = atzyewuzc_hetongid;
			}
			
	  		public Object getAtzyewuzc_hetongid(){
	  			return atzyewuzc_hetongid;
	  		}
  		  		
  				  		
  						public void setAtzyewuzc_id(Object atzyewuzc_id){
				this.atzyewuzc_id = atzyewuzc_id;
			}
			
	  		public Object getAtzyewuzc_id(){
	  			return atzyewuzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static F0e85ede10000002ez init(DataContextHelper context) {
  		F0e85ede10000002ez o = new F0e85ede10000002ez();
									o.setAtzyewuzc_bianhao(getValue(context,"atzyewuzc.bianhao"));
						
						  									o.setAtzyewuzc_shenqingr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzyewuzc_yaoqiuzcbm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzyewuzc_kehu(getValue(context,"atzkehu.id"));
						
						  									o.setAtzyewuzc_danjuzt(getValue(context,"atzyewuzc.danjuzt"));
						
						  									o.setAtzyewuzc_xmmingcheng(getValue(context,"atzyewuzc.xmmingcheng"));
						
						  									o.setAtzyewuzc_hetongid(getValue(context,"atzhetong.id"));
						
						  									o.setAtzyewuzc_id(getValue(context,"atzyewuzc.id"));
						
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