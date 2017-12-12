/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:10:27.863
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5bc48cfc00000002z{

	
						private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigoujh_linshibh;
			
				
										private Object atzcaigoujh_tianzhir;
			
				
										private Object atzcaigoujh_id;
			
				
					
						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_linshibh(Object atzcaigoujh_linshibh){
				this.atzcaigoujh_linshibh = atzcaigoujh_linshibh;
			}
			
	  		public Object getAtzcaigoujh_linshibh(){
	  			return atzcaigoujh_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhir(Object atzcaigoujh_tianzhir){
				this.atzcaigoujh_tianzhir = atzcaigoujh_tianzhir;
			}
			
	  		public Object getAtzcaigoujh_tianzhir(){
	  			return atzcaigoujh_tianzhir;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5bc48cfc00000002z init(DataContextHelper context) {
  		F5bc48cfc00000002z o = new F5bc48cfc00000002z();
									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigoujh_linshibh(getValue(context,"atzcaigoujh.linshibh"));
						
						  									o.setAtzcaigoujh_tianzhir(getValue(context,"atzcaigoujh.tianzhir"));
						
						  									o.setAtzcaigoujh_id(getValue(context,"atzcaigoujh.id"));
						
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