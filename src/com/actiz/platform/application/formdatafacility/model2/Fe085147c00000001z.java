/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:48:36.335
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe085147c00000001z{

	
						private Object atzhetongsbqd_wuliaosn;
			
				
										private Object atzhetongsbqd_wuliaobm;
			
				
										private Object atzhetongsbqd_wuliaoms;
			
				
										private Object atzhetongsbqd_id;
			
				
					
						public void setAtzhetongsbqd_wuliaosn(Object atzhetongsbqd_wuliaosn){
				this.atzhetongsbqd_wuliaosn = atzhetongsbqd_wuliaosn;
			}
			
	  		public Object getAtzhetongsbqd_wuliaosn(){
	  			return atzhetongsbqd_wuliaosn;
	  		}
  		  		
  				  		
  						public void setAtzhetongsbqd_wuliaobm(Object atzhetongsbqd_wuliaobm){
				this.atzhetongsbqd_wuliaobm = atzhetongsbqd_wuliaobm;
			}
			
	  		public Object getAtzhetongsbqd_wuliaobm(){
	  			return atzhetongsbqd_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzhetongsbqd_wuliaoms(Object atzhetongsbqd_wuliaoms){
				this.atzhetongsbqd_wuliaoms = atzhetongsbqd_wuliaoms;
			}
			
	  		public Object getAtzhetongsbqd_wuliaoms(){
	  			return atzhetongsbqd_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzhetongsbqd_id(Object atzhetongsbqd_id){
				this.atzhetongsbqd_id = atzhetongsbqd_id;
			}
			
	  		public Object getAtzhetongsbqd_id(){
	  			return atzhetongsbqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe085147c00000001z init(DataContextHelper context) {
  		Fe085147c00000001z o = new Fe085147c00000001z();
									o.setAtzhetongsbqd_wuliaosn(getValue(context,"atzhetongsbqd.wuliaosn"));
						
						  									o.setAtzhetongsbqd_wuliaobm(getValue(context,"atzhetongsbqd.wuliaobm"));
						
						  									o.setAtzhetongsbqd_wuliaoms(getValue(context,"atzhetongsbqd.wuliaoms"));
						
						  									o.setAtzhetongsbqd_id(getValue(context,"atzhetongsbqd.id"));
						
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