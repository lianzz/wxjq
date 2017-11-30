/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:04.148
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Feb52e66200000001z{

	
						private Object atzzichansq_zichan;
			
				
										private Object atzgudingzc_shebeibh;
			
				
										private Object atzzichansq_shenqingr;
			
				
										private Object atzzichansq_shenqingrq;
			
				
							private Object atzzichansq_shenqingrq1;
								private Object atzemployee_name;
			
				
										private Object atzzichansq_danjuzt;
			
				
										private Object atzzichansq_id;
			
				
										private Object atzemployee_id;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzzichansq_zichan(Object atzzichansq_zichan){
				this.atzzichansq_zichan = atzzichansq_zichan;
			}
			
	  		public Object getAtzzichansq_zichan(){
	  			return atzzichansq_zichan;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzzichansq_shenqingr(Object atzzichansq_shenqingr){
				this.atzzichansq_shenqingr = atzzichansq_shenqingr;
			}
			
	  		public Object getAtzzichansq_shenqingr(){
	  			return atzzichansq_shenqingr;
	  		}
  		  		
  				  		
  						public void setAtzzichansq_shenqingrq(Object atzzichansq_shenqingrq){
				this.atzzichansq_shenqingrq = atzzichansq_shenqingrq;
			}
			
	  		public Object getAtzzichansq_shenqingrq(){
	  			return atzzichansq_shenqingrq;
	  		}
  		  		
  							public void setAtzzichansq_shenqingrq1(Object atzzichansq_shenqingrq1){
				this.atzzichansq_shenqingrq1 = atzzichansq_shenqingrq1;
			}
			
	  		public Object getAtzzichansq_shenqingrq1(){
	  			return atzzichansq_shenqingrq1;
	  		}
		  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzzichansq_danjuzt(Object atzzichansq_danjuzt){
				this.atzzichansq_danjuzt = atzzichansq_danjuzt;
			}
			
	  		public Object getAtzzichansq_danjuzt(){
	  			return atzzichansq_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzzichansq_id(Object atzzichansq_id){
				this.atzzichansq_id = atzzichansq_id;
			}
			
	  		public Object getAtzzichansq_id(){
	  			return atzzichansq_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Feb52e66200000001z init(DataContextHelper context) {
  		Feb52e66200000001z o = new Feb52e66200000001z();
									o.setAtzzichansq_zichan(getValue(context,"atzgudingzc.id"));
						
						  									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzzichansq_shenqingr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzzichansq_shenqingrq(getValue(context,"atzzichansq.shenqingrq"));
						
										o.setAtzzichansq_shenqingrq1(getValue(context,"atzzichansq.shenqingrq1"));
			  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzzichansq_danjuzt(getValue(context,"atzzichansq.danjuzt"));
						
						  									o.setAtzzichansq_id(getValue(context,"atzzichansq.id"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
						  									o.setAtzgudingzc_id(getValue(context,"atzgudingzc.id"));
						
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