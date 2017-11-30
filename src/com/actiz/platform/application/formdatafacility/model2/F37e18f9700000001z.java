/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:04.047
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F37e18f9700000001z{

	
						private Object atzshebeixx_sn;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzshebeixx_shifouzk;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzshebeixx_id;
			
				
					
						public void setAtzshebeixx_sn(Object atzshebeixx_sn){
				this.atzshebeixx_sn = atzshebeixx_sn;
			}
			
	  		public Object getAtzshebeixx_sn(){
	  			return atzshebeixx_sn;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzshebeixx_shifouzk(Object atzshebeixx_shifouzk){
				this.atzshebeixx_shifouzk = atzshebeixx_shifouzk;
			}
			
	  		public Object getAtzshebeixx_shifouzk(){
	  			return atzshebeixx_shifouzk;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzshebeixx_id(Object atzshebeixx_id){
				this.atzshebeixx_id = atzshebeixx_id;
			}
			
	  		public Object getAtzshebeixx_id(){
	  			return atzshebeixx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F37e18f9700000001z init(DataContextHelper context) {
  		F37e18f9700000001z o = new F37e18f9700000001z();
									o.setAtzshebeixx_sn(getValue(context,"atzshebeixx.sn"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzshebeixx_shifouzk(getValue(context,"atzshebeixx.shifouzk"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzshebeixx_id(getValue(context,"atzshebeixx.id"));
						
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