/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:39.372
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F238697ad00000012z{

	
						private Object atzdepartment_orgname;
			
				
										private Object atzdepartment_orgcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzdepartment_tel;
			
				
										private Object atzdepartment_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzdepartment_orgname(Object atzdepartment_orgname){
				this.atzdepartment_orgname = atzdepartment_orgname;
			}
			
	  		public Object getAtzdepartment_orgname(){
	  			return atzdepartment_orgname;
	  		}
  		  		
  				  		
  						public void setAtzdepartment_orgcode(Object atzdepartment_orgcode){
				this.atzdepartment_orgcode = atzdepartment_orgcode;
			}
			
	  		public Object getAtzdepartment_orgcode(){
	  			return atzdepartment_orgcode;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzdepartment_tel(Object atzdepartment_tel){
				this.atzdepartment_tel = atzdepartment_tel;
			}
			
	  		public Object getAtzdepartment_tel(){
	  			return atzdepartment_tel;
	  		}
  		  		
  				  		
  						public void setAtzdepartment_id(Object atzdepartment_id){
				this.atzdepartment_id = atzdepartment_id;
			}
			
	  		public Object getAtzdepartment_id(){
	  			return atzdepartment_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F238697ad00000012z init(DataContextHelper context) {
  		F238697ad00000012z o = new F238697ad00000012z();
									o.setAtzdepartment_orgname(getValue(context,"atzdepartment.orgname"));
						
						  									o.setAtzdepartment_orgcode(getValue(context,"atzdepartment.orgcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzdepartment_tel(getValue(context,"atzdepartment.tel"));
						
						  									o.setAtzdepartment_id(getValue(context,"atzdepartment.id"));
						
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