/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:32:59.435
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fef13d0d000000003z{

	
						private Object atzbumen_bumenbh;
			
				
										private Object atzbumen_bumenmc;
			
				
										private Object atzbumen_bumenfzr;
			
				
										private Object atzbumen_id;
			
				
					
						public void setAtzbumen_bumenbh(Object atzbumen_bumenbh){
				this.atzbumen_bumenbh = atzbumen_bumenbh;
			}
			
	  		public Object getAtzbumen_bumenbh(){
	  			return atzbumen_bumenbh;
	  		}
  		  		
  				  		
  						public void setAtzbumen_bumenmc(Object atzbumen_bumenmc){
				this.atzbumen_bumenmc = atzbumen_bumenmc;
			}
			
	  		public Object getAtzbumen_bumenmc(){
	  			return atzbumen_bumenmc;
	  		}
  		  		
  				  		
  						public void setAtzbumen_bumenfzr(Object atzbumen_bumenfzr){
				this.atzbumen_bumenfzr = atzbumen_bumenfzr;
			}
			
	  		public Object getAtzbumen_bumenfzr(){
	  			return atzbumen_bumenfzr;
	  		}
  		  		
  				  		
  						public void setAtzbumen_id(Object atzbumen_id){
				this.atzbumen_id = atzbumen_id;
			}
			
	  		public Object getAtzbumen_id(){
	  			return atzbumen_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fef13d0d000000003z init(DataContextHelper context) {
  		Fef13d0d000000003z o = new Fef13d0d000000003z();
									o.setAtzbumen_bumenbh(getValue(context,"atzbumen.bumenbh"));
						
						  									o.setAtzbumen_bumenmc(getValue(context,"atzbumen.bumenmc"));
						
						  									o.setAtzbumen_bumenfzr(getValue(context,"atzyuangong.id"));
						
						  									o.setAtzbumen_id(getValue(context,"atzbumen.id"));
						
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