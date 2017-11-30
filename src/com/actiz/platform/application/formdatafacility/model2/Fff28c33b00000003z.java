/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:48:34.631
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fff28c33b00000003z{

	
						private Object atzkecheng_kechengmc;
			
				
										private Object atzkecheng_yuangong;
			
				
										private Object atzkecheng_kclb;
			
				
										private Object atzkecheng_id;
			
				
					
						public void setAtzkecheng_kechengmc(Object atzkecheng_kechengmc){
				this.atzkecheng_kechengmc = atzkecheng_kechengmc;
			}
			
	  		public Object getAtzkecheng_kechengmc(){
	  			return atzkecheng_kechengmc;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_yuangong(Object atzkecheng_yuangong){
				this.atzkecheng_yuangong = atzkecheng_yuangong;
			}
			
	  		public Object getAtzkecheng_yuangong(){
	  			return atzkecheng_yuangong;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_kclb(Object atzkecheng_kclb){
				this.atzkecheng_kclb = atzkecheng_kclb;
			}
			
	  		public Object getAtzkecheng_kclb(){
	  			return atzkecheng_kclb;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_id(Object atzkecheng_id){
				this.atzkecheng_id = atzkecheng_id;
			}
			
	  		public Object getAtzkecheng_id(){
	  			return atzkecheng_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fff28c33b00000003z init(DataContextHelper context) {
  		Fff28c33b00000003z o = new Fff28c33b00000003z();
									o.setAtzkecheng_kechengmc(getValue(context,"atzkecheng.kechengmc"));
						
						  									o.setAtzkecheng_yuangong(getValue(context,"atzemployee.id"));
						
						  									o.setAtzkecheng_kclb(getValue(context,"atzkecheng.kclb"));
						
						  									o.setAtzkecheng_id(getValue(context,"atzkecheng.id"));
						
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