/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:00:10.486
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa6d04e020000000az{

	
						private Object atzgongyings_gongyingsmc;
			
				
										private Object atzgongyings_id;
			
				
					
						public void setAtzgongyings_gongyingsmc(Object atzgongyings_gongyingsmc){
				this.atzgongyings_gongyingsmc = atzgongyings_gongyingsmc;
			}
			
	  		public Object getAtzgongyings_gongyingsmc(){
	  			return atzgongyings_gongyingsmc;
	  		}
  		  		
  				  		
  						public void setAtzgongyings_id(Object atzgongyings_id){
				this.atzgongyings_id = atzgongyings_id;
			}
			
	  		public Object getAtzgongyings_id(){
	  			return atzgongyings_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa6d04e020000000az init(DataContextHelper context) {
  		Fa6d04e020000000az o = new Fa6d04e020000000az();
									o.setAtzgongyings_gongyingsmc(getValue(context,"atzgongyings.gongyingsmc"));
						
						  									o.setAtzgongyings_id(getValue(context,"atzgongyings.id"));
						
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