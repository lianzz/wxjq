/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:13.663
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F12503fcd00000004z{

	
						private Object atzgangwei_gangweimc;
			
				
										private Object atzgangwei_id;
			
				
					
						public void setAtzgangwei_gangweimc(Object atzgangwei_gangweimc){
				this.atzgangwei_gangweimc = atzgangwei_gangweimc;
			}
			
	  		public Object getAtzgangwei_gangweimc(){
	  			return atzgangwei_gangweimc;
	  		}
  		  		
  				  		
  						public void setAtzgangwei_id(Object atzgangwei_id){
				this.atzgangwei_id = atzgangwei_id;
			}
			
	  		public Object getAtzgangwei_id(){
	  			return atzgangwei_id;
	  		}
  		  		
  				  		
  	  	
  	public static F12503fcd00000004z init(DataContextHelper context) {
  		F12503fcd00000004z o = new F12503fcd00000004z();
									o.setAtzgangwei_gangweimc(getValue(context,"atzgangwei.gangweimc"));
						
						  									o.setAtzgangwei_id(getValue(context,"atzgangwei.id"));
						
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