/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:56.369
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5260cbc20000001cz{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzwuliaojcxx_lurur;
			
				
										private Object atzwuliaojcxx_lururq;
			
				
							private Object atzwuliaojcxx_lururq1;
								private Object atzwuliaojcxx_id;
			
				
					
						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_lurur(Object atzwuliaojcxx_lurur){
				this.atzwuliaojcxx_lurur = atzwuliaojcxx_lurur;
			}
			
	  		public Object getAtzwuliaojcxx_lurur(){
	  			return atzwuliaojcxx_lurur;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_lururq(Object atzwuliaojcxx_lururq){
				this.atzwuliaojcxx_lururq = atzwuliaojcxx_lururq;
			}
			
	  		public Object getAtzwuliaojcxx_lururq(){
	  			return atzwuliaojcxx_lururq;
	  		}
  		  		
  							public void setAtzwuliaojcxx_lururq1(Object atzwuliaojcxx_lururq1){
				this.atzwuliaojcxx_lururq1 = atzwuliaojcxx_lururq1;
			}
			
	  		public Object getAtzwuliaojcxx_lururq1(){
	  			return atzwuliaojcxx_lururq1;
	  		}
		  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5260cbc20000001cz init(DataContextHelper context) {
  		F5260cbc20000001cz o = new F5260cbc20000001cz();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzwuliaojcxx_lurur(getValue(context,"atzwuliaojcxx.lurur"));
						
						  									o.setAtzwuliaojcxx_lururq(getValue(context,"atzwuliaojcxx.lururq"));
						
										o.setAtzwuliaojcxx_lururq1(getValue(context,"atzwuliaojcxx.lururq1"));
			  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
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