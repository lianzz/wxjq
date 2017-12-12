/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:10:45.058
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb8ad6b2700000003z{

	
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
  		  		
  				  		
  	  	
  	public static Fb8ad6b2700000003z init(DataContextHelper context) {
  		Fb8ad6b2700000003z o = new Fb8ad6b2700000003z();
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