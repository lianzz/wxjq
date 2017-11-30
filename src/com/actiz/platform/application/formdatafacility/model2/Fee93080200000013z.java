/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:54:32.141
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fee93080200000013z{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzemployee_name;
			
				
										private Object atzzichanwx_danjuzt;
			
				
										private Object atzzichanwx_zcsfwh;
			
				
										private Object atzzichanwx_id;
			
				
										private Object atzemployee_id;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzzichanwx_danjuzt(Object atzzichanwx_danjuzt){
				this.atzzichanwx_danjuzt = atzzichanwx_danjuzt;
			}
			
	  		public Object getAtzzichanwx_danjuzt(){
	  			return atzzichanwx_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzzichanwx_zcsfwh(Object atzzichanwx_zcsfwh){
				this.atzzichanwx_zcsfwh = atzzichanwx_zcsfwh;
			}
			
	  		public Object getAtzzichanwx_zcsfwh(){
	  			return atzzichanwx_zcsfwh;
	  		}
  		  		
  				  		
  						public void setAtzzichanwx_id(Object atzzichanwx_id){
				this.atzzichanwx_id = atzzichanwx_id;
			}
			
	  		public Object getAtzzichanwx_id(){
	  			return atzzichanwx_id;
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
  		  		
  				  		
  	  	
  	public static Fee93080200000013z init(DataContextHelper context) {
  		Fee93080200000013z o = new Fee93080200000013z();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzzichanwx_danjuzt(getValue(context,"atzzichanwx.danjuzt"));
						
						  									o.setAtzzichanwx_zcsfwh(getValue(context,"atzzichanwx.zcsfwh"));
						
						  									o.setAtzzichanwx_id(getValue(context,"atzzichanwx.id"));
						
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