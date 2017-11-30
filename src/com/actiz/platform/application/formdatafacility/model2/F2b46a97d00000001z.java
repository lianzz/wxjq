/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:59.426
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F2b46a97d00000001z{

	
						private Object atzemployee_empcode;
			
				
										private Object atztdyg_yuangongid;
			
				
										private Object atzemployee_sex;
			
				
										private Object atztuandui_bumenid;
			
				
										private Object atztuandui_id;
			
				
										private Object atztdyg_id;
			
				
										private Object atzemployee_id;
			
				
					
						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtztdyg_yuangongid(Object atztdyg_yuangongid){
				this.atztdyg_yuangongid = atztdyg_yuangongid;
			}
			
	  		public Object getAtztdyg_yuangongid(){
	  			return atztdyg_yuangongid;
	  		}
  		  		
  				  		
  						public void setAtzemployee_sex(Object atzemployee_sex){
				this.atzemployee_sex = atzemployee_sex;
			}
			
	  		public Object getAtzemployee_sex(){
	  			return atzemployee_sex;
	  		}
  		  		
  				  		
  						public void setAtztuandui_bumenid(Object atztuandui_bumenid){
				this.atztuandui_bumenid = atztuandui_bumenid;
			}
			
	  		public Object getAtztuandui_bumenid(){
	  			return atztuandui_bumenid;
	  		}
  		  		
  				  		
  						public void setAtztuandui_id(Object atztuandui_id){
				this.atztuandui_id = atztuandui_id;
			}
			
	  		public Object getAtztuandui_id(){
	  			return atztuandui_id;
	  		}
  		  		
  				  		
  						public void setAtztdyg_id(Object atztdyg_id){
				this.atztdyg_id = atztdyg_id;
			}
			
	  		public Object getAtztdyg_id(){
	  			return atztdyg_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F2b46a97d00000001z init(DataContextHelper context) {
  		F2b46a97d00000001z o = new F2b46a97d00000001z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtztdyg_yuangongid(getValue(context,"atzemployee.id"));
						
						  									o.setAtzemployee_sex(getValue(context,"atzemployee.sex"));
						
						  									o.setAtztuandui_bumenid(getValue(context,"atzdepartment.id"));
						
						  									o.setAtztuandui_id(getValue(context,"atztuandui.id"));
						
						  									o.setAtztdyg_id(getValue(context,"atztdyg.id"));
						
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