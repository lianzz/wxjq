/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:32.78
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fd83dd32300000003z{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_id;
			
				
					
						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fd83dd32300000003z init(DataContextHelper context) {
  		Fd83dd32300000003z o = new Fd83dd32300000003z();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
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