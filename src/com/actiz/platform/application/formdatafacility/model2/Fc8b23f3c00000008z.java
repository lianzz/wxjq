/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:14.953
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc8b23f3c00000008z{

	
						private Object atzcaigouz_caigouzmc;
			
				
										private Object atzcaigouz_chengyuan;
			
				
										private Object atzcaigouz_id;
			
				
					
						public void setAtzcaigouz_caigouzmc(Object atzcaigouz_caigouzmc){
				this.atzcaigouz_caigouzmc = atzcaigouz_caigouzmc;
			}
			
	  		public Object getAtzcaigouz_caigouzmc(){
	  			return atzcaigouz_caigouzmc;
	  		}
  		  		
  				  		
  						public void setAtzcaigouz_chengyuan(Object atzcaigouz_chengyuan){
				this.atzcaigouz_chengyuan = atzcaigouz_chengyuan;
			}
			
	  		public Object getAtzcaigouz_chengyuan(){
	  			return atzcaigouz_chengyuan;
	  		}
  		  		
  				  		
  						public void setAtzcaigouz_id(Object atzcaigouz_id){
				this.atzcaigouz_id = atzcaigouz_id;
			}
			
	  		public Object getAtzcaigouz_id(){
	  			return atzcaigouz_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc8b23f3c00000008z init(DataContextHelper context) {
  		Fc8b23f3c00000008z o = new Fc8b23f3c00000008z();
									o.setAtzcaigouz_caigouzmc(getValue(context,"atzcaigouz.caigouzmc"));
						
						  									o.setAtzcaigouz_chengyuan(getValue(context,"atztdyg.id"));
						
						  									o.setAtzcaigouz_id(getValue(context,"atzcaigouz.id"));
						
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