/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-12-06 11:29:50.759
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F258609a600000004z{

	
						private Object atzyonghusq_shouquanr;
			
				
										private Object atzyonghusq_bshouquanr;
			
				
										private Object atzyonghusq_kssj;
			
				
							private Object atzyonghusq_kssj1;
								private Object atzyonghusq_jssj;
			
				
							private Object atzyonghusq_jssj1;
								private Object atzyonghusq_shifouyx;
			
				
										private Object atzyonghusq_id;
			
				
					
						public void setAtzyonghusq_shouquanr(Object atzyonghusq_shouquanr){
				this.atzyonghusq_shouquanr = atzyonghusq_shouquanr;
			}
			
	  		public Object getAtzyonghusq_shouquanr(){
	  			return atzyonghusq_shouquanr;
	  		}
  		  		
  				  		
  						public void setAtzyonghusq_bshouquanr(Object atzyonghusq_bshouquanr){
				this.atzyonghusq_bshouquanr = atzyonghusq_bshouquanr;
			}
			
	  		public Object getAtzyonghusq_bshouquanr(){
	  			return atzyonghusq_bshouquanr;
	  		}
  		  		
  				  		
  						public void setAtzyonghusq_kssj(Object atzyonghusq_kssj){
				this.atzyonghusq_kssj = atzyonghusq_kssj;
			}
			
	  		public Object getAtzyonghusq_kssj(){
	  			return atzyonghusq_kssj;
	  		}
  		  		
  							public void setAtzyonghusq_kssj1(Object atzyonghusq_kssj1){
				this.atzyonghusq_kssj1 = atzyonghusq_kssj1;
			}
			
	  		public Object getAtzyonghusq_kssj1(){
	  			return atzyonghusq_kssj1;
	  		}
		  		
  						public void setAtzyonghusq_jssj(Object atzyonghusq_jssj){
				this.atzyonghusq_jssj = atzyonghusq_jssj;
			}
			
	  		public Object getAtzyonghusq_jssj(){
	  			return atzyonghusq_jssj;
	  		}
  		  		
  							public void setAtzyonghusq_jssj1(Object atzyonghusq_jssj1){
				this.atzyonghusq_jssj1 = atzyonghusq_jssj1;
			}
			
	  		public Object getAtzyonghusq_jssj1(){
	  			return atzyonghusq_jssj1;
	  		}
		  		
  						public void setAtzyonghusq_shifouyx(Object atzyonghusq_shifouyx){
				this.atzyonghusq_shifouyx = atzyonghusq_shifouyx;
			}
			
	  		public Object getAtzyonghusq_shifouyx(){
	  			return atzyonghusq_shifouyx;
	  		}
  		  		
  				  		
  						public void setAtzyonghusq_id(Object atzyonghusq_id){
				this.atzyonghusq_id = atzyonghusq_id;
			}
			
	  		public Object getAtzyonghusq_id(){
	  			return atzyonghusq_id;
	  		}
  		  		
  				  		
  	  	
  	public static F258609a600000004z init(DataContextHelper context) {
  		F258609a600000004z o = new F258609a600000004z();
									o.setAtzyonghusq_shouquanr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzyonghusq_bshouquanr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzyonghusq_kssj(getValue(context,"atzyonghusq.kssj"));
						
										o.setAtzyonghusq_kssj1(getValue(context,"atzyonghusq.kssj1"));
			  									o.setAtzyonghusq_jssj(getValue(context,"atzyonghusq.jssj"));
						
										o.setAtzyonghusq_jssj1(getValue(context,"atzyonghusq.jssj1"));
			  									o.setAtzyonghusq_shifouyx(getValue(context,"atzyonghusq.shifouyx"));
						
						  									o.setAtzyonghusq_id(getValue(context,"atzyonghusq.id"));
						
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