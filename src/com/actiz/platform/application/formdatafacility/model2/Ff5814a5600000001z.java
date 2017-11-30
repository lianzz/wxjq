/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:48.405
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Ff5814a5600000001z{

	
						private Object atzyuezjjh_zongjiemc;
			
				
										private Object atzyuezjjh_jihuamc;
			
				
										private Object atzyuezjjh_lurusj;
			
				
							private Object atzyuezjjh_lurusj1;
								private Object atzyuezjjh_id;
			
				
					
						public void setAtzyuezjjh_zongjiemc(Object atzyuezjjh_zongjiemc){
				this.atzyuezjjh_zongjiemc = atzyuezjjh_zongjiemc;
			}
			
	  		public Object getAtzyuezjjh_zongjiemc(){
	  			return atzyuezjjh_zongjiemc;
	  		}
  		  		
  				  		
  						public void setAtzyuezjjh_jihuamc(Object atzyuezjjh_jihuamc){
				this.atzyuezjjh_jihuamc = atzyuezjjh_jihuamc;
			}
			
	  		public Object getAtzyuezjjh_jihuamc(){
	  			return atzyuezjjh_jihuamc;
	  		}
  		  		
  				  		
  						public void setAtzyuezjjh_lurusj(Object atzyuezjjh_lurusj){
				this.atzyuezjjh_lurusj = atzyuezjjh_lurusj;
			}
			
	  		public Object getAtzyuezjjh_lurusj(){
	  			return atzyuezjjh_lurusj;
	  		}
  		  		
  							public void setAtzyuezjjh_lurusj1(Object atzyuezjjh_lurusj1){
				this.atzyuezjjh_lurusj1 = atzyuezjjh_lurusj1;
			}
			
	  		public Object getAtzyuezjjh_lurusj1(){
	  			return atzyuezjjh_lurusj1;
	  		}
		  		
  						public void setAtzyuezjjh_id(Object atzyuezjjh_id){
				this.atzyuezjjh_id = atzyuezjjh_id;
			}
			
	  		public Object getAtzyuezjjh_id(){
	  			return atzyuezjjh_id;
	  		}
  		  		
  				  		
  	  	
  	public static Ff5814a5600000001z init(DataContextHelper context) {
  		Ff5814a5600000001z o = new Ff5814a5600000001z();
									o.setAtzyuezjjh_zongjiemc(getValue(context,"atzyuezjjh.zongjiemc"));
						
						  									o.setAtzyuezjjh_jihuamc(getValue(context,"atzyuezjjh.jihuamc"));
						
						  									o.setAtzyuezjjh_lurusj(getValue(context,"atzyuezjjh.lurusj"));
						
										o.setAtzyuezjjh_lurusj1(getValue(context,"atzyuezjjh.lurusj1"));
			  									o.setAtzyuezjjh_id(getValue(context,"atzyuezjjh.id"));
						
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