/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:35:56.94
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F86c6dd6600000002z{

	
						private Object atzjqd_bh;
			
				
										private Object atzjqd_lb;
			
				
										private Object atzjqd_ygid;
			
				
										private Object atzjqd_id;
			
				
					
						public void setAtzjqd_bh(Object atzjqd_bh){
				this.atzjqd_bh = atzjqd_bh;
			}
			
	  		public Object getAtzjqd_bh(){
	  			return atzjqd_bh;
	  		}
  		  		
  				  		
  						public void setAtzjqd_lb(Object atzjqd_lb){
				this.atzjqd_lb = atzjqd_lb;
			}
			
	  		public Object getAtzjqd_lb(){
	  			return atzjqd_lb;
	  		}
  		  		
  				  		
  						public void setAtzjqd_ygid(Object atzjqd_ygid){
				this.atzjqd_ygid = atzjqd_ygid;
			}
			
	  		public Object getAtzjqd_ygid(){
	  			return atzjqd_ygid;
	  		}
  		  		
  				  		
  						public void setAtzjqd_id(Object atzjqd_id){
				this.atzjqd_id = atzjqd_id;
			}
			
	  		public Object getAtzjqd_id(){
	  			return atzjqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F86c6dd6600000002z init(DataContextHelper context) {
  		F86c6dd6600000002z o = new F86c6dd6600000002z();
									o.setAtzjqd_bh(getValue(context,"atzjqd.bh"));
						
						  									o.setAtzjqd_lb(getValue(context,"atzjqd.lb"));
						
						  									o.setAtzjqd_ygid(getValue(context,"atztdyg.id"));
						
						  									o.setAtzjqd_id(getValue(context,"atzjqd.id"));
						
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