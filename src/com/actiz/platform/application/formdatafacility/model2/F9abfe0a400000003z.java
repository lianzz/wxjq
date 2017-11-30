/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:51.341
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9abfe0a400000003z{

	
						private Object atzshengchancj_wuliaoid;
			
				
										private Object atzshengchancj_youxianji;
			
				
							private Object atzshengchancj_youxianji1;
								private Object atzshengchancj_id;
			
				
					
						public void setAtzshengchancj_wuliaoid(Object atzshengchancj_wuliaoid){
				this.atzshengchancj_wuliaoid = atzshengchancj_wuliaoid;
			}
			
	  		public Object getAtzshengchancj_wuliaoid(){
	  			return atzshengchancj_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_youxianji(Object atzshengchancj_youxianji){
				this.atzshengchancj_youxianji = atzshengchancj_youxianji;
			}
			
	  		public Object getAtzshengchancj_youxianji(){
	  			return atzshengchancj_youxianji;
	  		}
  		  		
  							public void setAtzshengchancj_youxianji1(Object atzshengchancj_youxianji1){
				this.atzshengchancj_youxianji1 = atzshengchancj_youxianji1;
			}
			
	  		public Object getAtzshengchancj_youxianji1(){
	  			return atzshengchancj_youxianji1;
	  		}
		  		
  						public void setAtzshengchancj_id(Object atzshengchancj_id){
				this.atzshengchancj_id = atzshengchancj_id;
			}
			
	  		public Object getAtzshengchancj_id(){
	  			return atzshengchancj_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9abfe0a400000003z init(DataContextHelper context) {
  		F9abfe0a400000003z o = new F9abfe0a400000003z();
									o.setAtzshengchancj_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzshengchancj_youxianji(getValue(context,"atzshengchancj.youxianji"));
						
										o.setAtzshengchancj_youxianji1(getValue(context,"atzshengchancj.youxianji1"));
			  									o.setAtzshengchancj_id(getValue(context,"atzshengchancj.id"));
						
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