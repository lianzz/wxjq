/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:03:27.343
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa6b6c12600000001z{

	
						private Object atzweibaosbsqd_id;
			
				
					
						public void setAtzweibaosbsqd_id(Object atzweibaosbsqd_id){
				this.atzweibaosbsqd_id = atzweibaosbsqd_id;
			}
			
	  		public Object getAtzweibaosbsqd_id(){
	  			return atzweibaosbsqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa6b6c12600000001z init(DataContextHelper context) {
  		Fa6b6c12600000001z o = new Fa6b6c12600000001z();
									o.setAtzweibaosbsqd_id(getValue(context,"atzweibaosbsqd.id"));
						
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