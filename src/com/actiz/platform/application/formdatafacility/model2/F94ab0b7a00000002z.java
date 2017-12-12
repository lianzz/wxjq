/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:16.9
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F94ab0b7a00000002z{

	
						private Object atzcalllog_bianhao;
			
				
										private Object atzcalllog_zerenr;
			
				
										private Object atzcalllog_id;
			
				
					
						public void setAtzcalllog_bianhao(Object atzcalllog_bianhao){
				this.atzcalllog_bianhao = atzcalllog_bianhao;
			}
			
	  		public Object getAtzcalllog_bianhao(){
	  			return atzcalllog_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcalllog_zerenr(Object atzcalllog_zerenr){
				this.atzcalllog_zerenr = atzcalllog_zerenr;
			}
			
	  		public Object getAtzcalllog_zerenr(){
	  			return atzcalllog_zerenr;
	  		}
  		  		
  				  		
  						public void setAtzcalllog_id(Object atzcalllog_id){
				this.atzcalllog_id = atzcalllog_id;
			}
			
	  		public Object getAtzcalllog_id(){
	  			return atzcalllog_id;
	  		}
  		  		
  				  		
  	  	
  	public static F94ab0b7a00000002z init(DataContextHelper context) {
  		F94ab0b7a00000002z o = new F94ab0b7a00000002z();
									o.setAtzcalllog_bianhao(getValue(context,"atzcalllog.bianhao"));
						
						  									o.setAtzcalllog_zerenr(getValue(context,"atzcalllog.zerenr"));
						
						  									o.setAtzcalllog_id(getValue(context,"atzcalllog.id"));
						
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