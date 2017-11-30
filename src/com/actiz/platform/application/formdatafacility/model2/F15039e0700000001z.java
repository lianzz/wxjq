/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:38.044
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F15039e0700000001z{

	
						private Object atzemployee_empcode;
			
				
										private Object atzemployee_name;
			
				
										private Object atzyuangongzz_zhicheng;
			
				
										private Object atzyuangongzz_id;
			
				
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
  		  		
  				  		
  						public void setAtzyuangongzz_zhicheng(Object atzyuangongzz_zhicheng){
				this.atzyuangongzz_zhicheng = atzyuangongzz_zhicheng;
			}
			
	  		public Object getAtzyuangongzz_zhicheng(){
	  			return atzyuangongzz_zhicheng;
	  		}
  		  		
  				  		
  						public void setAtzyuangongzz_id(Object atzyuangongzz_id){
				this.atzyuangongzz_id = atzyuangongzz_id;
			}
			
	  		public Object getAtzyuangongzz_id(){
	  			return atzyuangongzz_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  	  	
  	public static F15039e0700000001z init(DataContextHelper context) {
  		F15039e0700000001z o = new F15039e0700000001z();
									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzyuangongzz_zhicheng(getValue(context,"atzyuangongzz.zhicheng"));
						
						  									o.setAtzyuangongzz_id(getValue(context,"atzyuangongzz.id"));
						
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