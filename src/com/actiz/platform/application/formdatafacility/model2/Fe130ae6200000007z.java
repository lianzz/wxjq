/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:54:17.808
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe130ae6200000007z{

	
						private Object atzemployee_empcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzjiaban_jiabanrq;
			
				
							private Object atzjiaban_jiabanrq1;
								private Object atzjiaban_jiabansc;
			
				
							private Object atzjiaban_jiabansc1;
								private Object atzjiaban_danjuzt;
			
				
										private Object atzjiaban_jiabansy;
			
				
										private Object atzjiaban_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzjiaban_jiabanrq(Object atzjiaban_jiabanrq){
				this.atzjiaban_jiabanrq = atzjiaban_jiabanrq;
			}
			
	  		public Object getAtzjiaban_jiabanrq(){
	  			return atzjiaban_jiabanrq;
	  		}
  		  		
  							public void setAtzjiaban_jiabanrq1(Object atzjiaban_jiabanrq1){
				this.atzjiaban_jiabanrq1 = atzjiaban_jiabanrq1;
			}
			
	  		public Object getAtzjiaban_jiabanrq1(){
	  			return atzjiaban_jiabanrq1;
	  		}
		  		
  						public void setAtzjiaban_jiabansc(Object atzjiaban_jiabansc){
				this.atzjiaban_jiabansc = atzjiaban_jiabansc;
			}
			
	  		public Object getAtzjiaban_jiabansc(){
	  			return atzjiaban_jiabansc;
	  		}
  		  		
  							public void setAtzjiaban_jiabansc1(Object atzjiaban_jiabansc1){
				this.atzjiaban_jiabansc1 = atzjiaban_jiabansc1;
			}
			
	  		public Object getAtzjiaban_jiabansc1(){
	  			return atzjiaban_jiabansc1;
	  		}
		  		
  						public void setAtzjiaban_danjuzt(Object atzjiaban_danjuzt){
				this.atzjiaban_danjuzt = atzjiaban_danjuzt;
			}
			
	  		public Object getAtzjiaban_danjuzt(){
	  			return atzjiaban_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzjiaban_jiabansy(Object atzjiaban_jiabansy){
				this.atzjiaban_jiabansy = atzjiaban_jiabansy;
			}
			
	  		public Object getAtzjiaban_jiabansy(){
	  			return atzjiaban_jiabansy;
	  		}
  		  		
  				  		
  						public void setAtzjiaban_id(Object atzjiaban_id){
				this.atzjiaban_id = atzjiaban_id;
			}
			
	  		public Object getAtzjiaban_id(){
	  			return atzjiaban_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe130ae6200000007z init(DataContextHelper context) {
  		Fe130ae6200000007z o = new Fe130ae6200000007z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzjiaban_jiabanrq(getValue(context,"atzjiaban.jiabanrq"));
						
										o.setAtzjiaban_jiabanrq1(getValue(context,"atzjiaban.jiabanrq1"));
			  									o.setAtzjiaban_jiabansc(getValue(context,"atzjiaban.jiabansc"));
						
										o.setAtzjiaban_jiabansc1(getValue(context,"atzjiaban.jiabansc1"));
			  									o.setAtzjiaban_danjuzt(getValue(context,"atzjiaban.danjuzt"));
						
						  									o.setAtzjiaban_jiabansy(getValue(context,"atzjiaban.jiabansy"));
						
						  									o.setAtzjiaban_id(getValue(context,"atzjiaban.id"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
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