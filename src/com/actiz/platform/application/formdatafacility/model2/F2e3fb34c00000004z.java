/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:56:56.603
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F2e3fb34c00000004z{

	
						private Object atztouyingy_touyingyhm;
			
				
										private Object atztouyingy_id;
			
				
					
						public void setAtztouyingy_touyingyhm(Object atztouyingy_touyingyhm){
				this.atztouyingy_touyingyhm = atztouyingy_touyingyhm;
			}
			
	  		public Object getAtztouyingy_touyingyhm(){
	  			return atztouyingy_touyingyhm;
	  		}
  		  		
  				  		
  						public void setAtztouyingy_id(Object atztouyingy_id){
				this.atztouyingy_id = atztouyingy_id;
			}
			
	  		public Object getAtztouyingy_id(){
	  			return atztouyingy_id;
	  		}
  		  		
  				  		
  	  	
  	public static F2e3fb34c00000004z init(DataContextHelper context) {
  		F2e3fb34c00000004z o = new F2e3fb34c00000004z();
									o.setAtztouyingy_touyingyhm(getValue(context,"atztouyingy.touyingyhm"));
						
						  									o.setAtztouyingy_id(getValue(context,"atztouyingy.id"));
						
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