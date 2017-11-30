/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:34.758
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F0a392b3e0000000bz{

	
						private Object atzkhyinhangzh_yinhangzh;
			
				
										private Object atzkhyinhangzh_kaihuyh;
			
				
										private Object atzkhyinhangzh_shuiwudjh;
			
				
										private Object atzkhyinhangzh_id;
			
				
					
						public void setAtzkhyinhangzh_yinhangzh(Object atzkhyinhangzh_yinhangzh){
				this.atzkhyinhangzh_yinhangzh = atzkhyinhangzh_yinhangzh;
			}
			
	  		public Object getAtzkhyinhangzh_yinhangzh(){
	  			return atzkhyinhangzh_yinhangzh;
	  		}
  		  		
  				  		
  						public void setAtzkhyinhangzh_kaihuyh(Object atzkhyinhangzh_kaihuyh){
				this.atzkhyinhangzh_kaihuyh = atzkhyinhangzh_kaihuyh;
			}
			
	  		public Object getAtzkhyinhangzh_kaihuyh(){
	  			return atzkhyinhangzh_kaihuyh;
	  		}
  		  		
  				  		
  						public void setAtzkhyinhangzh_shuiwudjh(Object atzkhyinhangzh_shuiwudjh){
				this.atzkhyinhangzh_shuiwudjh = atzkhyinhangzh_shuiwudjh;
			}
			
	  		public Object getAtzkhyinhangzh_shuiwudjh(){
	  			return atzkhyinhangzh_shuiwudjh;
	  		}
  		  		
  				  		
  						public void setAtzkhyinhangzh_id(Object atzkhyinhangzh_id){
				this.atzkhyinhangzh_id = atzkhyinhangzh_id;
			}
			
	  		public Object getAtzkhyinhangzh_id(){
	  			return atzkhyinhangzh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F0a392b3e0000000bz init(DataContextHelper context) {
  		F0a392b3e0000000bz o = new F0a392b3e0000000bz();
									o.setAtzkhyinhangzh_yinhangzh(getValue(context,"atzkhyinhangzh.yinhangzh"));
						
						  									o.setAtzkhyinhangzh_kaihuyh(getValue(context,"atzkhyinhangzh.kaihuyh"));
						
						  									o.setAtzkhyinhangzh_shuiwudjh(getValue(context,"atzkhyinhangzh.shuiwudjh"));
						
						  									o.setAtzkhyinhangzh_id(getValue(context,"atzkhyinhangzh.id"));
						
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