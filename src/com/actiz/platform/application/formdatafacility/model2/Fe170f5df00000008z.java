/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:04:32.091
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe170f5df00000008z{

	
						private Object atzqingjiad_yuangong;
			
				
										private Object atzemployee_empcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzemployee_bumenid;
			
				
										private Object atzqingjiad_shenqingsj;
			
				
							private Object atzqingjiad_shenqingsj1;
								private Object atzqingjiad_danjuzt;
			
				
										private Object atzqingjiad_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzqingjiad_yuangong(Object atzqingjiad_yuangong){
				this.atzqingjiad_yuangong = atzqingjiad_yuangong;
			}
			
	  		public Object getAtzqingjiad_yuangong(){
	  			return atzqingjiad_yuangong;
	  		}
  		  		
  				  		
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
  		  		
  				  		
  						public void setAtzemployee_bumenid(Object atzemployee_bumenid){
				this.atzemployee_bumenid = atzemployee_bumenid;
			}
			
	  		public Object getAtzemployee_bumenid(){
	  			return atzemployee_bumenid;
	  		}
  		  		
  				  		
  						public void setAtzqingjiad_shenqingsj(Object atzqingjiad_shenqingsj){
				this.atzqingjiad_shenqingsj = atzqingjiad_shenqingsj;
			}
			
	  		public Object getAtzqingjiad_shenqingsj(){
	  			return atzqingjiad_shenqingsj;
	  		}
  		  		
  							public void setAtzqingjiad_shenqingsj1(Object atzqingjiad_shenqingsj1){
				this.atzqingjiad_shenqingsj1 = atzqingjiad_shenqingsj1;
			}
			
	  		public Object getAtzqingjiad_shenqingsj1(){
	  			return atzqingjiad_shenqingsj1;
	  		}
		  		
  						public void setAtzqingjiad_danjuzt(Object atzqingjiad_danjuzt){
				this.atzqingjiad_danjuzt = atzqingjiad_danjuzt;
			}
			
	  		public Object getAtzqingjiad_danjuzt(){
	  			return atzqingjiad_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzqingjiad_id(Object atzqingjiad_id){
				this.atzqingjiad_id = atzqingjiad_id;
			}
			
	  		public Object getAtzqingjiad_id(){
	  			return atzqingjiad_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe170f5df00000008z init(DataContextHelper context) {
  		Fe170f5df00000008z o = new Fe170f5df00000008z();
									o.setAtzqingjiad_yuangong(getValue(context,"atzemployee.id"));
						
						  									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzemployee_bumenid(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzqingjiad_shenqingsj(getValue(context,"atzqingjiad.shenqingsj"));
						
										o.setAtzqingjiad_shenqingsj1(getValue(context,"atzqingjiad.shenqingsj1"));
			  									o.setAtzqingjiad_danjuzt(getValue(context,"atzqingjiad.danjuzt"));
						
						  									o.setAtzqingjiad_id(getValue(context,"atzqingjiad.id"));
						
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