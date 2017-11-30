/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:36.781
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa7b5a70d00000002z{

	
						private Object atzxunjiannrmb_mobanmc;
			
				
										private Object atzxunjiannrmb_mobansm;
			
				
										private Object atzxunjiannrmb_id;
			
				
					
						public void setAtzxunjiannrmb_mobanmc(Object atzxunjiannrmb_mobanmc){
				this.atzxunjiannrmb_mobanmc = atzxunjiannrmb_mobanmc;
			}
			
	  		public Object getAtzxunjiannrmb_mobanmc(){
	  			return atzxunjiannrmb_mobanmc;
	  		}
  		  		
  				  		
  						public void setAtzxunjiannrmb_mobansm(Object atzxunjiannrmb_mobansm){
				this.atzxunjiannrmb_mobansm = atzxunjiannrmb_mobansm;
			}
			
	  		public Object getAtzxunjiannrmb_mobansm(){
	  			return atzxunjiannrmb_mobansm;
	  		}
  		  		
  				  		
  						public void setAtzxunjiannrmb_id(Object atzxunjiannrmb_id){
				this.atzxunjiannrmb_id = atzxunjiannrmb_id;
			}
			
	  		public Object getAtzxunjiannrmb_id(){
	  			return atzxunjiannrmb_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa7b5a70d00000002z init(DataContextHelper context) {
  		Fa7b5a70d00000002z o = new Fa7b5a70d00000002z();
									o.setAtzxunjiannrmb_mobanmc(getValue(context,"atzxunjiannrmb.mobanmc"));
						
						  									o.setAtzxunjiannrmb_mobansm(getValue(context,"atzxunjiannrmb.mobansm"));
						
						  									o.setAtzxunjiannrmb_id(getValue(context,"atzxunjiannrmb.id"));
						
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