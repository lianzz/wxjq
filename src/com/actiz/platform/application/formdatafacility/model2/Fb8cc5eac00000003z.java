/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:11.754
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb8cc5eac00000003z{

	
						private Object atzcaigoucs_canshubm;
			
				
										private Object atzcaigoucs_canshumc;
			
				
										private Object atzcaigoucs_id;
			
				
					
						public void setAtzcaigoucs_canshubm(Object atzcaigoucs_canshubm){
				this.atzcaigoucs_canshubm = atzcaigoucs_canshubm;
			}
			
	  		public Object getAtzcaigoucs_canshubm(){
	  			return atzcaigoucs_canshubm;
	  		}
  		  		
  				  		
  						public void setAtzcaigoucs_canshumc(Object atzcaigoucs_canshumc){
				this.atzcaigoucs_canshumc = atzcaigoucs_canshumc;
			}
			
	  		public Object getAtzcaigoucs_canshumc(){
	  			return atzcaigoucs_canshumc;
	  		}
  		  		
  				  		
  						public void setAtzcaigoucs_id(Object atzcaigoucs_id){
				this.atzcaigoucs_id = atzcaigoucs_id;
			}
			
	  		public Object getAtzcaigoucs_id(){
	  			return atzcaigoucs_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fb8cc5eac00000003z init(DataContextHelper context) {
  		Fb8cc5eac00000003z o = new Fb8cc5eac00000003z();
									o.setAtzcaigoucs_canshubm(getValue(context,"atzcaigoucs.canshubm"));
						
						  									o.setAtzcaigoucs_canshumc(getValue(context,"atzcaigoucs.canshumc"));
						
						  									o.setAtzcaigoucs_id(getValue(context,"atzcaigoucs.id"));
						
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