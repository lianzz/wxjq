/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:27.403
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F75dfcfdf00000003z{

	
						private Object atzlcshenhejl_renwulx;
			
				
										private Object atzlcshenhejl_shenherq;
			
				
							private Object atzlcshenhejl_shenherq1;
								private Object atzlcshenhejl_id;
			
				
					
						public void setAtzlcshenhejl_renwulx(Object atzlcshenhejl_renwulx){
				this.atzlcshenhejl_renwulx = atzlcshenhejl_renwulx;
			}
			
	  		public Object getAtzlcshenhejl_renwulx(){
	  			return atzlcshenhejl_renwulx;
	  		}
  		  		
  				  		
  						public void setAtzlcshenhejl_shenherq(Object atzlcshenhejl_shenherq){
				this.atzlcshenhejl_shenherq = atzlcshenhejl_shenherq;
			}
			
	  		public Object getAtzlcshenhejl_shenherq(){
	  			return atzlcshenhejl_shenherq;
	  		}
  		  		
  							public void setAtzlcshenhejl_shenherq1(Object atzlcshenhejl_shenherq1){
				this.atzlcshenhejl_shenherq1 = atzlcshenhejl_shenherq1;
			}
			
	  		public Object getAtzlcshenhejl_shenherq1(){
	  			return atzlcshenhejl_shenherq1;
	  		}
		  		
  						public void setAtzlcshenhejl_id(Object atzlcshenhejl_id){
				this.atzlcshenhejl_id = atzlcshenhejl_id;
			}
			
	  		public Object getAtzlcshenhejl_id(){
	  			return atzlcshenhejl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F75dfcfdf00000003z init(DataContextHelper context) {
  		F75dfcfdf00000003z o = new F75dfcfdf00000003z();
									o.setAtzlcshenhejl_renwulx(getValue(context,"atzlcshenhejl.renwulx"));
						
						  									o.setAtzlcshenhejl_shenherq(getValue(context,"atzlcshenhejl.shenherq"));
						
										o.setAtzlcshenhejl_shenherq1(getValue(context,"atzlcshenhejl.shenherq1"));
			  									o.setAtzlcshenhejl_id(getValue(context,"atzlcshenhejl.id"));
						
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