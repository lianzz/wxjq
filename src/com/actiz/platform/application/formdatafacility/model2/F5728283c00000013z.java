/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:53:48.148
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5728283c00000013z{

	
						private Object atzbizhong_bizhongmc;
			
				
										private Object atzbizhong_bizhongfh;
			
				
										private Object atzbizhong_id;
			
				
					
						public void setAtzbizhong_bizhongmc(Object atzbizhong_bizhongmc){
				this.atzbizhong_bizhongmc = atzbizhong_bizhongmc;
			}
			
	  		public Object getAtzbizhong_bizhongmc(){
	  			return atzbizhong_bizhongmc;
	  		}
  		  		
  				  		
  						public void setAtzbizhong_bizhongfh(Object atzbizhong_bizhongfh){
				this.atzbizhong_bizhongfh = atzbizhong_bizhongfh;
			}
			
	  		public Object getAtzbizhong_bizhongfh(){
	  			return atzbizhong_bizhongfh;
	  		}
  		  		
  				  		
  						public void setAtzbizhong_id(Object atzbizhong_id){
				this.atzbizhong_id = atzbizhong_id;
			}
			
	  		public Object getAtzbizhong_id(){
	  			return atzbizhong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5728283c00000013z init(DataContextHelper context) {
  		F5728283c00000013z o = new F5728283c00000013z();
									o.setAtzbizhong_bizhongmc(getValue(context,"atzbizhong.bizhongmc"));
						
						  									o.setAtzbizhong_bizhongfh(getValue(context,"atzbizhong.bizhongfh"));
						
						  									o.setAtzbizhong_id(getValue(context,"atzbizhong.id"));
						
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