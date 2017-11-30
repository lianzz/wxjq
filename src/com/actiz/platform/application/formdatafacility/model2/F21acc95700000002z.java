/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:01.193
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F21acc95700000002z{

	
						private Object atzshebeixx_sn;
			
				
										private Object atzshebeimaxdz_maxdz;
			
				
										private Object atzshebeimaxdz_lururq;
			
				
							private Object atzshebeimaxdz_lururq1;
								private Object atzshebeimaxdz_id;
			
				
										private Object atzshebeixx_id;
			
				
					
						public void setAtzshebeixx_sn(Object atzshebeixx_sn){
				this.atzshebeixx_sn = atzshebeixx_sn;
			}
			
	  		public Object getAtzshebeixx_sn(){
	  			return atzshebeixx_sn;
	  		}
  		  		
  				  		
  						public void setAtzshebeimaxdz_maxdz(Object atzshebeimaxdz_maxdz){
				this.atzshebeimaxdz_maxdz = atzshebeimaxdz_maxdz;
			}
			
	  		public Object getAtzshebeimaxdz_maxdz(){
	  			return atzshebeimaxdz_maxdz;
	  		}
  		  		
  				  		
  						public void setAtzshebeimaxdz_lururq(Object atzshebeimaxdz_lururq){
				this.atzshebeimaxdz_lururq = atzshebeimaxdz_lururq;
			}
			
	  		public Object getAtzshebeimaxdz_lururq(){
	  			return atzshebeimaxdz_lururq;
	  		}
  		  		
  							public void setAtzshebeimaxdz_lururq1(Object atzshebeimaxdz_lururq1){
				this.atzshebeimaxdz_lururq1 = atzshebeimaxdz_lururq1;
			}
			
	  		public Object getAtzshebeimaxdz_lururq1(){
	  			return atzshebeimaxdz_lururq1;
	  		}
		  		
  						public void setAtzshebeimaxdz_id(Object atzshebeimaxdz_id){
				this.atzshebeimaxdz_id = atzshebeimaxdz_id;
			}
			
	  		public Object getAtzshebeimaxdz_id(){
	  			return atzshebeimaxdz_id;
	  		}
  		  		
  				  		
  						public void setAtzshebeixx_id(Object atzshebeixx_id){
				this.atzshebeixx_id = atzshebeixx_id;
			}
			
	  		public Object getAtzshebeixx_id(){
	  			return atzshebeixx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F21acc95700000002z init(DataContextHelper context) {
  		F21acc95700000002z o = new F21acc95700000002z();
									o.setAtzshebeixx_sn(getValue(context,"atzshebeixx.sn"));
						
						  									o.setAtzshebeimaxdz_maxdz(getValue(context,"atzshebeimaxdz.maxdz"));
						
						  									o.setAtzshebeimaxdz_lururq(getValue(context,"atzshebeimaxdz.lururq"));
						
										o.setAtzshebeimaxdz_lururq1(getValue(context,"atzshebeimaxdz.lururq1"));
			  									o.setAtzshebeimaxdz_id(getValue(context,"atzshebeimaxdz.id"));
						
						  									o.setAtzshebeixx_id(getValue(context,"atzshebeixx.id"));
						
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