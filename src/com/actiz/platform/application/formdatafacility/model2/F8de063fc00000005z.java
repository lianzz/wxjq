/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:34:58.029
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8de063fc00000005z{

	
						private Object atzxbumen_bumenbh;
			
				
										private Object atzxbumen_bumenmc;
			
				
										private Object atzxbumen_id;
			
				
					
						public void setAtzxbumen_bumenbh(Object atzxbumen_bumenbh){
				this.atzxbumen_bumenbh = atzxbumen_bumenbh;
			}
			
	  		public Object getAtzxbumen_bumenbh(){
	  			return atzxbumen_bumenbh;
	  		}
  		  		
  				  		
  						public void setAtzxbumen_bumenmc(Object atzxbumen_bumenmc){
				this.atzxbumen_bumenmc = atzxbumen_bumenmc;
			}
			
	  		public Object getAtzxbumen_bumenmc(){
	  			return atzxbumen_bumenmc;
	  		}
  		  		
  				  		
  						public void setAtzxbumen_id(Object atzxbumen_id){
				this.atzxbumen_id = atzxbumen_id;
			}
			
	  		public Object getAtzxbumen_id(){
	  			return atzxbumen_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8de063fc00000005z init(DataContextHelper context) {
  		F8de063fc00000005z o = new F8de063fc00000005z();
									o.setAtzxbumen_bumenbh(getValue(context,"atzxbumen.bumenbh"));
						
						  									o.setAtzxbumen_bumenmc(getValue(context,"atzxbumen.bumenmc"));
						
						  									o.setAtzxbumen_id(getValue(context,"atzxbumen.id"));
						
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