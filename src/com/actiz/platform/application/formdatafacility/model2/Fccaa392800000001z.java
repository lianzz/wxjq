/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-22 11:31:39.678
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fccaa392800000001z{

	
						private Object atzhetong_hetonglx;
			
				
										private Object atzhetong_daqu;
			
				
										private Object atzhetong_chanpinzs;
			
				
										private Object atzhetong_suoshuhy;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetonglx(Object atzhetong_hetonglx){
				this.atzhetong_hetonglx = atzhetong_hetonglx;
			}
			
	  		public Object getAtzhetong_hetonglx(){
	  			return atzhetong_hetonglx;
	  		}
  		  		
  				  		
  						public void setAtzhetong_daqu(Object atzhetong_daqu){
				this.atzhetong_daqu = atzhetong_daqu;
			}
			
	  		public Object getAtzhetong_daqu(){
	  			return atzhetong_daqu;
	  		}
  		  		
  				  		
  						public void setAtzhetong_chanpinzs(Object atzhetong_chanpinzs){
				this.atzhetong_chanpinzs = atzhetong_chanpinzs;
			}
			
	  		public Object getAtzhetong_chanpinzs(){
	  			return atzhetong_chanpinzs;
	  		}
  		  		
  				  		
  						public void setAtzhetong_suoshuhy(Object atzhetong_suoshuhy){
				this.atzhetong_suoshuhy = atzhetong_suoshuhy;
			}
			
	  		public Object getAtzhetong_suoshuhy(){
	  			return atzhetong_suoshuhy;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fccaa392800000001z init(DataContextHelper context) {
  		Fccaa392800000001z o = new Fccaa392800000001z();
									o.setAtzhetong_hetonglx(getValue(context,"atzhetong.hetonglx"));
						
						  									o.setAtzhetong_daqu(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzhetong_chanpinzs(getValue(context,"atzhetong.chanpinzs"));
						
						  									o.setAtzhetong_suoshuhy(getValue(context,"atzhetong.suoshuhy"));
						
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