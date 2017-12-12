/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:37.77
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F601b929300000003z{

	
						private Object atzcaigouht_dingdanbh;
			
				
										private Object atzcaigouht_gongyings;
			
				
										private Object atzcaigouht_id;
			
				
					
						public void setAtzcaigouht_dingdanbh(Object atzcaigouht_dingdanbh){
				this.atzcaigouht_dingdanbh = atzcaigouht_dingdanbh;
			}
			
	  		public Object getAtzcaigouht_dingdanbh(){
	  			return atzcaigouht_dingdanbh;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_gongyings(Object atzcaigouht_gongyings){
				this.atzcaigouht_gongyings = atzcaigouht_gongyings;
			}
			
	  		public Object getAtzcaigouht_gongyings(){
	  			return atzcaigouht_gongyings;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_id(Object atzcaigouht_id){
				this.atzcaigouht_id = atzcaigouht_id;
			}
			
	  		public Object getAtzcaigouht_id(){
	  			return atzcaigouht_id;
	  		}
  		  		
  				  		
  	  	
  	public static F601b929300000003z init(DataContextHelper context) {
  		F601b929300000003z o = new F601b929300000003z();
									o.setAtzcaigouht_dingdanbh(getValue(context,"atzcaigouht.dingdanbh"));
						
						  									o.setAtzcaigouht_gongyings(getValue(context,"atzcaigouht.gongyings"));
						
						  									o.setAtzcaigouht_id(getValue(context,"atzcaigouht.id"));
						
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