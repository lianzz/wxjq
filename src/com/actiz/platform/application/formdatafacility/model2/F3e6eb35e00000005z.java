/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:54:23.649
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F3e6eb35e00000005z{

	
						private Object atzxiaoshoubm_bianma;
			
				
										private Object atzxiaoshoubm_wuliaoms;
			
				
										private Object atzxiaoshoubm_id;
			
				
										private Object atzhtshbz_id;
			
				
					
						public void setAtzxiaoshoubm_bianma(Object atzxiaoshoubm_bianma){
				this.atzxiaoshoubm_bianma = atzxiaoshoubm_bianma;
			}
			
	  		public Object getAtzxiaoshoubm_bianma(){
	  			return atzxiaoshoubm_bianma;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoubm_wuliaoms(Object atzxiaoshoubm_wuliaoms){
				this.atzxiaoshoubm_wuliaoms = atzxiaoshoubm_wuliaoms;
			}
			
	  		public Object getAtzxiaoshoubm_wuliaoms(){
	  			return atzxiaoshoubm_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoubm_id(Object atzxiaoshoubm_id){
				this.atzxiaoshoubm_id = atzxiaoshoubm_id;
			}
			
	  		public Object getAtzxiaoshoubm_id(){
	  			return atzxiaoshoubm_id;
	  		}
  		  		
  				  		
  						public void setAtzhtshbz_id(Object atzhtshbz_id){
				this.atzhtshbz_id = atzhtshbz_id;
			}
			
	  		public Object getAtzhtshbz_id(){
	  			return atzhtshbz_id;
	  		}
  		  		
  				  		
  	  	
  	public static F3e6eb35e00000005z init(DataContextHelper context) {
  		F3e6eb35e00000005z o = new F3e6eb35e00000005z();
									o.setAtzxiaoshoubm_bianma(getValue(context,"atzxiaoshoubm.bianma"));
						
						  									o.setAtzxiaoshoubm_wuliaoms(getValue(context,"atzxiaoshoubm.wuliaoms"));
						
						  									o.setAtzxiaoshoubm_id(getValue(context,"atzxiaoshoubm.id"));
						
						  									o.setAtzhtshbz_id(getValue(context,"atzhtshbz.id"));
						
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