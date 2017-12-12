/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:43.774
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9a5f194e0000000cz{

	
						private Object atzceshixiang_item;
			
				
										private Object atzceshixiang_id;
			
				
					
						public void setAtzceshixiang_item(Object atzceshixiang_item){
				this.atzceshixiang_item = atzceshixiang_item;
			}
			
	  		public Object getAtzceshixiang_item(){
	  			return atzceshixiang_item;
	  		}
  		  		
  				  		
  						public void setAtzceshixiang_id(Object atzceshixiang_id){
				this.atzceshixiang_id = atzceshixiang_id;
			}
			
	  		public Object getAtzceshixiang_id(){
	  			return atzceshixiang_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9a5f194e0000000cz init(DataContextHelper context) {
  		F9a5f194e0000000cz o = new F9a5f194e0000000cz();
									o.setAtzceshixiang_item(getValue(context,"atzceshixiang.item"));
						
						  									o.setAtzceshixiang_id(getValue(context,"atzceshixiang.id"));
						
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