/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:06.579
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F7aecede700000004z{

	
						private Object atzxiaoshoubm_bianma;
			
				
										private Object atzxiaoshoubm_id;
			
				
					
						public void setAtzxiaoshoubm_bianma(Object atzxiaoshoubm_bianma){
				this.atzxiaoshoubm_bianma = atzxiaoshoubm_bianma;
			}
			
	  		public Object getAtzxiaoshoubm_bianma(){
	  			return atzxiaoshoubm_bianma;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoubm_id(Object atzxiaoshoubm_id){
				this.atzxiaoshoubm_id = atzxiaoshoubm_id;
			}
			
	  		public Object getAtzxiaoshoubm_id(){
	  			return atzxiaoshoubm_id;
	  		}
  		  		
  				  		
  	  	
  	public static F7aecede700000004z init(DataContextHelper context) {
  		F7aecede700000004z o = new F7aecede700000004z();
									o.setAtzxiaoshoubm_bianma(getValue(context,"atzxiaoshoubm.bianma"));
						
						  									o.setAtzxiaoshoubm_id(getValue(context,"atzxiaoshoubm.id"));
						
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