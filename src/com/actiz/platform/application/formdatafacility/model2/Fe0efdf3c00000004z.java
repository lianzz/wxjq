/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:55.332
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe0efdf3c00000004z{

	
						private Object atzhuiyis_fangjianhm;
			
				
										private Object atzhuiyis_id;
			
				
					
						public void setAtzhuiyis_fangjianhm(Object atzhuiyis_fangjianhm){
				this.atzhuiyis_fangjianhm = atzhuiyis_fangjianhm;
			}
			
	  		public Object getAtzhuiyis_fangjianhm(){
	  			return atzhuiyis_fangjianhm;
	  		}
  		  		
  				  		
  						public void setAtzhuiyis_id(Object atzhuiyis_id){
				this.atzhuiyis_id = atzhuiyis_id;
			}
			
	  		public Object getAtzhuiyis_id(){
	  			return atzhuiyis_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe0efdf3c00000004z init(DataContextHelper context) {
  		Fe0efdf3c00000004z o = new Fe0efdf3c00000004z();
									o.setAtzhuiyis_fangjianhm(getValue(context,"atzhuiyis.fangjianhm"));
						
						  									o.setAtzhuiyis_id(getValue(context,"atzhuiyis.id"));
						
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