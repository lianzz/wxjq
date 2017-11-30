/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:22.559
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Febe1031f00000003z{

	
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
  		  		
  				  		
  	  	
  	public static Febe1031f00000003z init(DataContextHelper context) {
  		Febe1031f00000003z o = new Febe1031f00000003z();
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