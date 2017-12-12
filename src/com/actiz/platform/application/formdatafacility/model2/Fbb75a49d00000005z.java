/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-12-07 00:34:27.082
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fbb75a49d00000005z{

	
						private Object atzfahuoqingdan_fahuotzdid;
			
				
										private Object atzfahuoqingdan_hetongid;
			
				
										private Object atzfahuoqingdan_id;
			
				
					
						public void setAtzfahuoqingdan_fahuotzdid(Object atzfahuoqingdan_fahuotzdid){
				this.atzfahuoqingdan_fahuotzdid = atzfahuoqingdan_fahuotzdid;
			}
			
	  		public Object getAtzfahuoqingdan_fahuotzdid(){
	  			return atzfahuoqingdan_fahuotzdid;
	  		}
  		  		
  				  		
  						public void setAtzfahuoqingdan_hetongid(Object atzfahuoqingdan_hetongid){
				this.atzfahuoqingdan_hetongid = atzfahuoqingdan_hetongid;
			}
			
	  		public Object getAtzfahuoqingdan_hetongid(){
	  			return atzfahuoqingdan_hetongid;
	  		}
  		  		
  				  		
  						public void setAtzfahuoqingdan_id(Object atzfahuoqingdan_id){
				this.atzfahuoqingdan_id = atzfahuoqingdan_id;
			}
			
	  		public Object getAtzfahuoqingdan_id(){
	  			return atzfahuoqingdan_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fbb75a49d00000005z init(DataContextHelper context) {
  		Fbb75a49d00000005z o = new Fbb75a49d00000005z();
									o.setAtzfahuoqingdan_fahuotzdid(getValue(context,"atzfahuotzd.id"));
						
						  									o.setAtzfahuoqingdan_hetongid(getValue(context,"atzhetong.id"));
						
						  									o.setAtzfahuoqingdan_id(getValue(context,"atzfahuoqingdan.id"));
						
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