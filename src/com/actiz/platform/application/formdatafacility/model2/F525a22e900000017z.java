/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:32.264
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F525a22e900000017z{

	
						private Object atzrenwulx_renwuzt;
			
				
										private Object atzrenwulx_id;
			
				
					
						public void setAtzrenwulx_renwuzt(Object atzrenwulx_renwuzt){
				this.atzrenwulx_renwuzt = atzrenwulx_renwuzt;
			}
			
	  		public Object getAtzrenwulx_renwuzt(){
	  			return atzrenwulx_renwuzt;
	  		}
  		  		
  				  		
  						public void setAtzrenwulx_id(Object atzrenwulx_id){
				this.atzrenwulx_id = atzrenwulx_id;
			}
			
	  		public Object getAtzrenwulx_id(){
	  			return atzrenwulx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F525a22e900000017z init(DataContextHelper context) {
  		F525a22e900000017z o = new F525a22e900000017z();
									o.setAtzrenwulx_renwuzt(getValue(context,"atzrenwulx.renwuzt"));
						
						  									o.setAtzrenwulx_id(getValue(context,"atzrenwulx.id"));
						
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