/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:07:21.205
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F95fe9e3f00000015z{

	
						private Object atzbanbenfb_xitong;
			
				
										private Object atzbanbenfb_banbenh;
			
				
										private Object atzbanbenfb_faburq;
			
				
							private Object atzbanbenfb_faburq1;
								private Object atzbanbenfb_id;
			
				
					
						public void setAtzbanbenfb_xitong(Object atzbanbenfb_xitong){
				this.atzbanbenfb_xitong = atzbanbenfb_xitong;
			}
			
	  		public Object getAtzbanbenfb_xitong(){
	  			return atzbanbenfb_xitong;
	  		}
  		  		
  				  		
  						public void setAtzbanbenfb_banbenh(Object atzbanbenfb_banbenh){
				this.atzbanbenfb_banbenh = atzbanbenfb_banbenh;
			}
			
	  		public Object getAtzbanbenfb_banbenh(){
	  			return atzbanbenfb_banbenh;
	  		}
  		  		
  				  		
  						public void setAtzbanbenfb_faburq(Object atzbanbenfb_faburq){
				this.atzbanbenfb_faburq = atzbanbenfb_faburq;
			}
			
	  		public Object getAtzbanbenfb_faburq(){
	  			return atzbanbenfb_faburq;
	  		}
  		  		
  							public void setAtzbanbenfb_faburq1(Object atzbanbenfb_faburq1){
				this.atzbanbenfb_faburq1 = atzbanbenfb_faburq1;
			}
			
	  		public Object getAtzbanbenfb_faburq1(){
	  			return atzbanbenfb_faburq1;
	  		}
		  		
  						public void setAtzbanbenfb_id(Object atzbanbenfb_id){
				this.atzbanbenfb_id = atzbanbenfb_id;
			}
			
	  		public Object getAtzbanbenfb_id(){
	  			return atzbanbenfb_id;
	  		}
  		  		
  				  		
  	  	
  	public static F95fe9e3f00000015z init(DataContextHelper context) {
  		F95fe9e3f00000015z o = new F95fe9e3f00000015z();
									o.setAtzbanbenfb_xitong(getValue(context,"atzbanbenfb.xitong"));
						
						  									o.setAtzbanbenfb_banbenh(getValue(context,"atzbanbenfb.banbenh"));
						
						  									o.setAtzbanbenfb_faburq(getValue(context,"atzbanbenfb.faburq"));
						
										o.setAtzbanbenfb_faburq1(getValue(context,"atzbanbenfb.faburq1"));
			  									o.setAtzbanbenfb_id(getValue(context,"atzbanbenfb.id"));
						
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