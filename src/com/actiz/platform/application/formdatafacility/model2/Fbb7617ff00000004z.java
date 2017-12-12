/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:11:18.398
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fbb7617ff00000004z{

	
						private Object atzlzs_id;
			
				
					
						public void setAtzlzs_id(Object atzlzs_id){
				this.atzlzs_id = atzlzs_id;
			}
			
	  		public Object getAtzlzs_id(){
	  			return atzlzs_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fbb7617ff00000004z init(DataContextHelper context) {
  		Fbb7617ff00000004z o = new Fbb7617ff00000004z();
									o.setAtzlzs_id(getValue(context,"atzlzs.id"));
						
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