/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:07:27.08
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fdb72a40a00000002z{

	
						private Object atzwenjiandr_mobanlx;
			
				
										private Object atzwenjiandr_id;
			
				
					
						public void setAtzwenjiandr_mobanlx(Object atzwenjiandr_mobanlx){
				this.atzwenjiandr_mobanlx = atzwenjiandr_mobanlx;
			}
			
	  		public Object getAtzwenjiandr_mobanlx(){
	  			return atzwenjiandr_mobanlx;
	  		}
  		  		
  				  		
  						public void setAtzwenjiandr_id(Object atzwenjiandr_id){
				this.atzwenjiandr_id = atzwenjiandr_id;
			}
			
	  		public Object getAtzwenjiandr_id(){
	  			return atzwenjiandr_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fdb72a40a00000002z init(DataContextHelper context) {
  		Fdb72a40a00000002z o = new Fdb72a40a00000002z();
									o.setAtzwenjiandr_mobanlx(getValue(context,"atzwenjiandr.mobanlx"));
						
						  									o.setAtzwenjiandr_id(getValue(context,"atzwenjiandr.id"));
						
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