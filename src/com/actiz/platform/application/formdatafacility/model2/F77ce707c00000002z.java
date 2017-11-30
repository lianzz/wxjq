/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:13.175
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F77ce707c00000002z{

	
						private Object atzbanbenfb_banbenh;
			
				
										private Object atzbanbenfb_id;
			
				
					
						public void setAtzbanbenfb_banbenh(Object atzbanbenfb_banbenh){
				this.atzbanbenfb_banbenh = atzbanbenfb_banbenh;
			}
			
	  		public Object getAtzbanbenfb_banbenh(){
	  			return atzbanbenfb_banbenh;
	  		}
  		  		
  				  		
  						public void setAtzbanbenfb_id(Object atzbanbenfb_id){
				this.atzbanbenfb_id = atzbanbenfb_id;
			}
			
	  		public Object getAtzbanbenfb_id(){
	  			return atzbanbenfb_id;
	  		}
  		  		
  				  		
  	  	
  	public static F77ce707c00000002z init(DataContextHelper context) {
  		F77ce707c00000002z o = new F77ce707c00000002z();
									o.setAtzbanbenfb_banbenh(getValue(context,"atzbanbenfb.banbenh"));
						
						  									o.setAtzbanbenfb_id(getValue(context,"atzbanbenfb.id"));
						
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