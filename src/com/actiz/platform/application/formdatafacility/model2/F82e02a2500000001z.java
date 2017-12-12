/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:03:45.045
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F82e02a2500000001z{

	
						private Object atzemployee_empcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzemployee_gangweiid;
			
				
										private Object atzemployee_bumenid;
			
				
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
  		  		
  				  		
  						public void setAtzemployee_gangweiid(Object atzemployee_gangweiid){
				this.atzemployee_gangweiid = atzemployee_gangweiid;
			}
			
	  		public Object getAtzemployee_gangweiid(){
	  			return atzemployee_gangweiid;
	  		}
  		  		
  				  		
  						public void setAtzemployee_bumenid(Object atzemployee_bumenid){
				this.atzemployee_bumenid = atzemployee_bumenid;
			}
			
	  		public Object getAtzemployee_bumenid(){
	  			return atzemployee_bumenid;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F82e02a2500000001z init(DataContextHelper context) {
  		F82e02a2500000001z o = new F82e02a2500000001z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzemployee_gangweiid(getValue(context,"atzgangwei.id"));
						
						  									o.setAtzemployee_bumenid(getValue(context,"atzdepartment.id"));
						
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