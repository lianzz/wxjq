/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:32.423
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fd77287c700000001z{

	
						private Object atzchurukd_bianhao;
			
				
										private Object atzchurukd_id;
			
				
					
						public void setAtzchurukd_bianhao(Object atzchurukd_bianhao){
				this.atzchurukd_bianhao = atzchurukd_bianhao;
			}
			
	  		public Object getAtzchurukd_bianhao(){
	  			return atzchurukd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzchurukd_id(Object atzchurukd_id){
				this.atzchurukd_id = atzchurukd_id;
			}
			
	  		public Object getAtzchurukd_id(){
	  			return atzchurukd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fd77287c700000001z init(DataContextHelper context) {
  		Fd77287c700000001z o = new Fd77287c700000001z();
									o.setAtzchurukd_bianhao(getValue(context,"atzchurukd.bianhao"));
						
						  									o.setAtzchurukd_id(getValue(context,"atzchurukd.id"));
						
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