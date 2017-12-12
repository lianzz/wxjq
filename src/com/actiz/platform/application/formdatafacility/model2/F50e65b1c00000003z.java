/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:05:42.392
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F50e65b1c00000003z{

	
						private Object atzcangku_cangkubh;
			
				
										private Object atzcangku_cangkumc;
			
				
										private Object atzcangku_id;
			
				
					
						public void setAtzcangku_cangkubh(Object atzcangku_cangkubh){
				this.atzcangku_cangkubh = atzcangku_cangkubh;
			}
			
	  		public Object getAtzcangku_cangkubh(){
	  			return atzcangku_cangkubh;
	  		}
  		  		
  				  		
  						public void setAtzcangku_cangkumc(Object atzcangku_cangkumc){
				this.atzcangku_cangkumc = atzcangku_cangkumc;
			}
			
	  		public Object getAtzcangku_cangkumc(){
	  			return atzcangku_cangkumc;
	  		}
  		  		
  				  		
  						public void setAtzcangku_id(Object atzcangku_id){
				this.atzcangku_id = atzcangku_id;
			}
			
	  		public Object getAtzcangku_id(){
	  			return atzcangku_id;
	  		}
  		  		
  				  		
  	  	
  	public static F50e65b1c00000003z init(DataContextHelper context) {
  		F50e65b1c00000003z o = new F50e65b1c00000003z();
									o.setAtzcangku_cangkubh(getValue(context,"atzcangku.cangkubh"));
						
						  									o.setAtzcangku_cangkumc(getValue(context,"atzcangku.cangkumc"));
						
						  									o.setAtzcangku_id(getValue(context,"atzcangku.id"));
						
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