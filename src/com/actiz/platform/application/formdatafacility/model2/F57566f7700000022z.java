/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:51.183
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F57566f7700000022z{

	
						private Object atztidaiwl_wuliaoid;
			
				
										private Object atztidaiwl_tidaiwlid;
			
				
										private Object atztidaiwl_id;
			
				
					
						public void setAtztidaiwl_wuliaoid(Object atztidaiwl_wuliaoid){
				this.atztidaiwl_wuliaoid = atztidaiwl_wuliaoid;
			}
			
	  		public Object getAtztidaiwl_wuliaoid(){
	  			return atztidaiwl_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtztidaiwl_tidaiwlid(Object atztidaiwl_tidaiwlid){
				this.atztidaiwl_tidaiwlid = atztidaiwl_tidaiwlid;
			}
			
	  		public Object getAtztidaiwl_tidaiwlid(){
	  			return atztidaiwl_tidaiwlid;
	  		}
  		  		
  				  		
  						public void setAtztidaiwl_id(Object atztidaiwl_id){
				this.atztidaiwl_id = atztidaiwl_id;
			}
			
	  		public Object getAtztidaiwl_id(){
	  			return atztidaiwl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F57566f7700000022z init(DataContextHelper context) {
  		F57566f7700000022z o = new F57566f7700000022z();
									o.setAtztidaiwl_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtztidaiwl_tidaiwlid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtztidaiwl_id(getValue(context,"atztidaiwl.id"));
						
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