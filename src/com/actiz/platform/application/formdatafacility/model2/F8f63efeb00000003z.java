/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:35.261
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8f63efeb00000003z{

	
						private Object atzemployee_empcode;
			
				
										private Object atzemployee_bumenid;
			
				
										private Object atzqingjiadmx_kssj;
			
				
							private Object atzqingjiadmx_kssj1;
								private Object atzqingjiadmx_jssj;
			
				
							private Object atzqingjiadmx_jssj1;
								private Object atzqingjiadmx_qingjialx;
			
				
										private Object atzqingjiadmx_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtzemployee_bumenid(Object atzemployee_bumenid){
				this.atzemployee_bumenid = atzemployee_bumenid;
			}
			
	  		public Object getAtzemployee_bumenid(){
	  			return atzemployee_bumenid;
	  		}
  		  		
  				  		
  						public void setAtzqingjiadmx_kssj(Object atzqingjiadmx_kssj){
				this.atzqingjiadmx_kssj = atzqingjiadmx_kssj;
			}
			
	  		public Object getAtzqingjiadmx_kssj(){
	  			return atzqingjiadmx_kssj;
	  		}
  		  		
  							public void setAtzqingjiadmx_kssj1(Object atzqingjiadmx_kssj1){
				this.atzqingjiadmx_kssj1 = atzqingjiadmx_kssj1;
			}
			
	  		public Object getAtzqingjiadmx_kssj1(){
	  			return atzqingjiadmx_kssj1;
	  		}
		  		
  						public void setAtzqingjiadmx_jssj(Object atzqingjiadmx_jssj){
				this.atzqingjiadmx_jssj = atzqingjiadmx_jssj;
			}
			
	  		public Object getAtzqingjiadmx_jssj(){
	  			return atzqingjiadmx_jssj;
	  		}
  		  		
  							public void setAtzqingjiadmx_jssj1(Object atzqingjiadmx_jssj1){
				this.atzqingjiadmx_jssj1 = atzqingjiadmx_jssj1;
			}
			
	  		public Object getAtzqingjiadmx_jssj1(){
	  			return atzqingjiadmx_jssj1;
	  		}
		  		
  						public void setAtzqingjiadmx_qingjialx(Object atzqingjiadmx_qingjialx){
				this.atzqingjiadmx_qingjialx = atzqingjiadmx_qingjialx;
			}
			
	  		public Object getAtzqingjiadmx_qingjialx(){
	  			return atzqingjiadmx_qingjialx;
	  		}
  		  		
  				  		
  						public void setAtzqingjiadmx_id(Object atzqingjiadmx_id){
				this.atzqingjiadmx_id = atzqingjiadmx_id;
			}
			
	  		public Object getAtzqingjiadmx_id(){
	  			return atzqingjiadmx_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8f63efeb00000003z init(DataContextHelper context) {
  		F8f63efeb00000003z o = new F8f63efeb00000003z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_bumenid(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzqingjiadmx_kssj(getValue(context,"atzqingjiadmx.kssj"));
						
										o.setAtzqingjiadmx_kssj1(getValue(context,"atzqingjiadmx.kssj1"));
			  									o.setAtzqingjiadmx_jssj(getValue(context,"atzqingjiadmx.jssj"));
						
										o.setAtzqingjiadmx_jssj1(getValue(context,"atzqingjiadmx.jssj1"));
			  									o.setAtzqingjiadmx_qingjialx(getValue(context,"atzqingjiadmx.qingjialx"));
						
						  									o.setAtzqingjiadmx_id(getValue(context,"atzqingjiadmx.id"));
						
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