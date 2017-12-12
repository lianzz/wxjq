/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:12:02.764
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fad6eec4000000001z{

	
						private Object atzemployee_empcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzrenshibd_churulx;
			
				
										private Object atzrenshibd_xianbm;
			
				
										private Object atzrenshibd_nibiandongbm;
			
				
										private Object atzrenshibd_nibiandongsj;
			
				
							private Object atzrenshibd_nibiandongsj1;
								private Object atzrenshibd_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzrenshibd_churulx(Object atzrenshibd_churulx){
				this.atzrenshibd_churulx = atzrenshibd_churulx;
			}
			
	  		public Object getAtzrenshibd_churulx(){
	  			return atzrenshibd_churulx;
	  		}
  		  		
  				  		
  						public void setAtzrenshibd_xianbm(Object atzrenshibd_xianbm){
				this.atzrenshibd_xianbm = atzrenshibd_xianbm;
			}
			
	  		public Object getAtzrenshibd_xianbm(){
	  			return atzrenshibd_xianbm;
	  		}
  		  		
  				  		
  						public void setAtzrenshibd_nibiandongbm(Object atzrenshibd_nibiandongbm){
				this.atzrenshibd_nibiandongbm = atzrenshibd_nibiandongbm;
			}
			
	  		public Object getAtzrenshibd_nibiandongbm(){
	  			return atzrenshibd_nibiandongbm;
	  		}
  		  		
  				  		
  						public void setAtzrenshibd_nibiandongsj(Object atzrenshibd_nibiandongsj){
				this.atzrenshibd_nibiandongsj = atzrenshibd_nibiandongsj;
			}
			
	  		public Object getAtzrenshibd_nibiandongsj(){
	  			return atzrenshibd_nibiandongsj;
	  		}
  		  		
  							public void setAtzrenshibd_nibiandongsj1(Object atzrenshibd_nibiandongsj1){
				this.atzrenshibd_nibiandongsj1 = atzrenshibd_nibiandongsj1;
			}
			
	  		public Object getAtzrenshibd_nibiandongsj1(){
	  			return atzrenshibd_nibiandongsj1;
	  		}
		  		
  						public void setAtzrenshibd_id(Object atzrenshibd_id){
				this.atzrenshibd_id = atzrenshibd_id;
			}
			
	  		public Object getAtzrenshibd_id(){
	  			return atzrenshibd_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fad6eec4000000001z init(DataContextHelper context) {
  		Fad6eec4000000001z o = new Fad6eec4000000001z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzrenshibd_churulx(getValue(context,"atzrenshibd.churulx"));
						
						  									o.setAtzrenshibd_xianbm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzrenshibd_nibiandongbm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzrenshibd_nibiandongsj(getValue(context,"atzrenshibd.nibiandongsj"));
						
										o.setAtzrenshibd_nibiandongsj1(getValue(context,"atzrenshibd.nibiandongsj1"));
			  									o.setAtzrenshibd_id(getValue(context,"atzrenshibd.id"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
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