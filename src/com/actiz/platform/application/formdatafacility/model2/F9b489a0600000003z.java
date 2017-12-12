/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:11.532
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9b489a0600000003z{

	
						private Object atzpeixunjl_kechengmc;
			
				
										private Object atzpeixunjl_peixunkssj;
			
				
							private Object atzpeixunjl_peixunkssj1;
								private Object atzpeixunjl_id;
			
				
					
						public void setAtzpeixunjl_kechengmc(Object atzpeixunjl_kechengmc){
				this.atzpeixunjl_kechengmc = atzpeixunjl_kechengmc;
			}
			
	  		public Object getAtzpeixunjl_kechengmc(){
	  			return atzpeixunjl_kechengmc;
	  		}
  		  		
  				  		
  						public void setAtzpeixunjl_peixunkssj(Object atzpeixunjl_peixunkssj){
				this.atzpeixunjl_peixunkssj = atzpeixunjl_peixunkssj;
			}
			
	  		public Object getAtzpeixunjl_peixunkssj(){
	  			return atzpeixunjl_peixunkssj;
	  		}
  		  		
  							public void setAtzpeixunjl_peixunkssj1(Object atzpeixunjl_peixunkssj1){
				this.atzpeixunjl_peixunkssj1 = atzpeixunjl_peixunkssj1;
			}
			
	  		public Object getAtzpeixunjl_peixunkssj1(){
	  			return atzpeixunjl_peixunkssj1;
	  		}
		  		
  						public void setAtzpeixunjl_id(Object atzpeixunjl_id){
				this.atzpeixunjl_id = atzpeixunjl_id;
			}
			
	  		public Object getAtzpeixunjl_id(){
	  			return atzpeixunjl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9b489a0600000003z init(DataContextHelper context) {
  		F9b489a0600000003z o = new F9b489a0600000003z();
									o.setAtzpeixunjl_kechengmc(getValue(context,"atzpeixunjl.kechengmc"));
						
						  									o.setAtzpeixunjl_peixunkssj(getValue(context,"atzpeixunjl.peixunkssj"));
						
										o.setAtzpeixunjl_peixunkssj1(getValue(context,"atzpeixunjl.peixunkssj1"));
			  									o.setAtzpeixunjl_id(getValue(context,"atzpeixunjl.id"));
						
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