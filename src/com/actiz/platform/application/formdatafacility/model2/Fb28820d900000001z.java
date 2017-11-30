/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:27.334
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb28820d900000001z{

	
						private Object atzgongchenght_hetongbh;
			
				
										private Object atzgongchenght_hetonglx;
			
				
										private Object atzgongchenght_id;
			
				
					
						public void setAtzgongchenght_hetongbh(Object atzgongchenght_hetongbh){
				this.atzgongchenght_hetongbh = atzgongchenght_hetongbh;
			}
			
	  		public Object getAtzgongchenght_hetongbh(){
	  			return atzgongchenght_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzgongchenght_hetonglx(Object atzgongchenght_hetonglx){
				this.atzgongchenght_hetonglx = atzgongchenght_hetonglx;
			}
			
	  		public Object getAtzgongchenght_hetonglx(){
	  			return atzgongchenght_hetonglx;
	  		}
  		  		
  				  		
  						public void setAtzgongchenght_id(Object atzgongchenght_id){
				this.atzgongchenght_id = atzgongchenght_id;
			}
			
	  		public Object getAtzgongchenght_id(){
	  			return atzgongchenght_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fb28820d900000001z init(DataContextHelper context) {
  		Fb28820d900000001z o = new Fb28820d900000001z();
									o.setAtzgongchenght_hetongbh(getValue(context,"atzgongchenght.hetongbh"));
						
						  									o.setAtzgongchenght_hetonglx(getValue(context,"atzgongchenght.hetonglx"));
						
						  									o.setAtzgongchenght_id(getValue(context,"atzgongchenght.id"));
						
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