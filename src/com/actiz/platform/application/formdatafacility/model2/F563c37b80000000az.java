/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:03:32.53
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F563c37b80000000az{

	
						private Object atzemployee_empcode;
			
				
										private Object atztdyg_yuangongmc;
			
				
										private Object atzemployee_sex;
			
				
										private Object atztdyg_tuanduiid;
			
				
										private Object atztdyg_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtztdyg_yuangongmc(Object atztdyg_yuangongmc){
				this.atztdyg_yuangongmc = atztdyg_yuangongmc;
			}
			
	  		public Object getAtztdyg_yuangongmc(){
	  			return atztdyg_yuangongmc;
	  		}
  		  		
  				  		
  						public void setAtzemployee_sex(Object atzemployee_sex){
				this.atzemployee_sex = atzemployee_sex;
			}
			
	  		public Object getAtzemployee_sex(){
	  			return atzemployee_sex;
	  		}
  		  		
  				  		
  						public void setAtztdyg_tuanduiid(Object atztdyg_tuanduiid){
				this.atztdyg_tuanduiid = atztdyg_tuanduiid;
			}
			
	  		public Object getAtztdyg_tuanduiid(){
	  			return atztdyg_tuanduiid;
	  		}
  		  		
  				  		
  						public void setAtztdyg_id(Object atztdyg_id){
				this.atztdyg_id = atztdyg_id;
			}
			
	  		public Object getAtztdyg_id(){
	  			return atztdyg_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F563c37b80000000az init(DataContextHelper context) {
  		F563c37b80000000az o = new F563c37b80000000az();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtztdyg_yuangongmc(getValue(context,"atztdyg.yuangongmc"));
						
						  									o.setAtzemployee_sex(getValue(context,"atzemployee.sex"));
						
						  									o.setAtztdyg_tuanduiid(getValue(context,"atztuandui.id"));
						
						  									o.setAtztdyg_id(getValue(context,"atztdyg.id"));
						
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