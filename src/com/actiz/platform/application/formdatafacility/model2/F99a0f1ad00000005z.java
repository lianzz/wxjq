/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:59:34.724
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F99a0f1ad00000005z{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzgudingzc_shebeimc;
			
				
										private Object atzgudingzc_shebeilb;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeimc(Object atzgudingzc_shebeimc){
				this.atzgudingzc_shebeimc = atzgudingzc_shebeimc;
			}
			
	  		public Object getAtzgudingzc_shebeimc(){
	  			return atzgudingzc_shebeimc;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeilb(Object atzgudingzc_shebeilb){
				this.atzgudingzc_shebeilb = atzgudingzc_shebeilb;
			}
			
	  		public Object getAtzgudingzc_shebeilb(){
	  			return atzgudingzc_shebeilb;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static F99a0f1ad00000005z init(DataContextHelper context) {
  		F99a0f1ad00000005z o = new F99a0f1ad00000005z();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzgudingzc_shebeimc(getValue(context,"atzgudingzc.shebeimc"));
						
						  									o.setAtzgudingzc_shebeilb(getValue(context,"atzgudingzc.shebeilb"));
						
						  									o.setAtzgudingzc_id(getValue(context,"atzgudingzc.id"));
						
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