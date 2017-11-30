/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:24.158
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe193f74300000001z{

	
						private Object atzdfukuanxx_fukuanlx;
			
				
										private Object atzdfukuanxx_caigouhtid;
			
				
										private Object atzdfukuanxx_gongyings;
			
				
										private Object atzdfukuanxx_fukuansj;
			
				
							private Object atzdfukuanxx_fukuansj1;
								private Object atzdfukuanxx_bizhongid;
			
				
										private Object atzdfukuanxx_id;
			
				
					
						public void setAtzdfukuanxx_fukuanlx(Object atzdfukuanxx_fukuanlx){
				this.atzdfukuanxx_fukuanlx = atzdfukuanxx_fukuanlx;
			}
			
	  		public Object getAtzdfukuanxx_fukuanlx(){
	  			return atzdfukuanxx_fukuanlx;
	  		}
  		  		
  				  		
  						public void setAtzdfukuanxx_caigouhtid(Object atzdfukuanxx_caigouhtid){
				this.atzdfukuanxx_caigouhtid = atzdfukuanxx_caigouhtid;
			}
			
	  		public Object getAtzdfukuanxx_caigouhtid(){
	  			return atzdfukuanxx_caigouhtid;
	  		}
  		  		
  				  		
  						public void setAtzdfukuanxx_gongyings(Object atzdfukuanxx_gongyings){
				this.atzdfukuanxx_gongyings = atzdfukuanxx_gongyings;
			}
			
	  		public Object getAtzdfukuanxx_gongyings(){
	  			return atzdfukuanxx_gongyings;
	  		}
  		  		
  				  		
  						public void setAtzdfukuanxx_fukuansj(Object atzdfukuanxx_fukuansj){
				this.atzdfukuanxx_fukuansj = atzdfukuanxx_fukuansj;
			}
			
	  		public Object getAtzdfukuanxx_fukuansj(){
	  			return atzdfukuanxx_fukuansj;
	  		}
  		  		
  							public void setAtzdfukuanxx_fukuansj1(Object atzdfukuanxx_fukuansj1){
				this.atzdfukuanxx_fukuansj1 = atzdfukuanxx_fukuansj1;
			}
			
	  		public Object getAtzdfukuanxx_fukuansj1(){
	  			return atzdfukuanxx_fukuansj1;
	  		}
		  		
  						public void setAtzdfukuanxx_bizhongid(Object atzdfukuanxx_bizhongid){
				this.atzdfukuanxx_bizhongid = atzdfukuanxx_bizhongid;
			}
			
	  		public Object getAtzdfukuanxx_bizhongid(){
	  			return atzdfukuanxx_bizhongid;
	  		}
  		  		
  				  		
  						public void setAtzdfukuanxx_id(Object atzdfukuanxx_id){
				this.atzdfukuanxx_id = atzdfukuanxx_id;
			}
			
	  		public Object getAtzdfukuanxx_id(){
	  			return atzdfukuanxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe193f74300000001z init(DataContextHelper context) {
  		Fe193f74300000001z o = new Fe193f74300000001z();
									o.setAtzdfukuanxx_fukuanlx(getValue(context,"atzdfukuanxx.fukuanlx"));
						
						  									o.setAtzdfukuanxx_caigouhtid(getValue(context,"atzcaigouht.id"));
						
						  									o.setAtzdfukuanxx_gongyings(getValue(context,"atzdfukuanxx.gongyings"));
						
						  									o.setAtzdfukuanxx_fukuansj(getValue(context,"atzdfukuanxx.fukuansj"));
						
										o.setAtzdfukuanxx_fukuansj1(getValue(context,"atzdfukuanxx.fukuansj1"));
			  									o.setAtzdfukuanxx_bizhongid(getValue(context,"atzbizhong.id"));
						
						  									o.setAtzdfukuanxx_id(getValue(context,"atzdfukuanxx.id"));
						
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