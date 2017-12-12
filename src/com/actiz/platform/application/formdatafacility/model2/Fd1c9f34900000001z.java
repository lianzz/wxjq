/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:05:56.031
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fd1c9f34900000001z{

	
						private Object atzhetong_hetongje;
			
				
							private Object atzhetong_hetongje1;
								private Object atzhetong_daqu;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetongje(Object atzhetong_hetongje){
				this.atzhetong_hetongje = atzhetong_hetongje;
			}
			
	  		public Object getAtzhetong_hetongje(){
	  			return atzhetong_hetongje;
	  		}
  		  		
  							public void setAtzhetong_hetongje1(Object atzhetong_hetongje1){
				this.atzhetong_hetongje1 = atzhetong_hetongje1;
			}
			
	  		public Object getAtzhetong_hetongje1(){
	  			return atzhetong_hetongje1;
	  		}
		  		
  						public void setAtzhetong_daqu(Object atzhetong_daqu){
				this.atzhetong_daqu = atzhetong_daqu;
			}
			
	  		public Object getAtzhetong_daqu(){
	  			return atzhetong_daqu;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fd1c9f34900000001z init(DataContextHelper context) {
  		Fd1c9f34900000001z o = new Fd1c9f34900000001z();
									o.setAtzhetong_hetongje(getValue(context,"atzhetong.hetongje"));
						
										o.setAtzhetong_hetongje1(getValue(context,"atzhetong.hetongje1"));
			  									o.setAtzhetong_daqu(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
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