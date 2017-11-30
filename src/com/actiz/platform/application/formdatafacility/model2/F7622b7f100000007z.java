/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:36.606
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F7622b7f100000007z{

	
						private Object atzcaigouhtmx_wuliaoid;
			
				
										private Object atzcaigouht_caigoujhid;
			
				
										private Object atzcaigouht_dingdanbh;
			
				
										private Object atzcaigouht_gongyings;
			
				
										private Object atzcaigouht_tianxier;
			
				
										private Object atzcaigouht_tianxierq;
			
				
							private Object atzcaigouht_tianxierq1;
								private Object atzcaigouhtmx_id;
			
				
										private Object atzcaigouht_id;
			
				
					
						public void setAtzcaigouhtmx_wuliaoid(Object atzcaigouhtmx_wuliaoid){
				this.atzcaigouhtmx_wuliaoid = atzcaigouhtmx_wuliaoid;
			}
			
	  		public Object getAtzcaigouhtmx_wuliaoid(){
	  			return atzcaigouhtmx_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_caigoujhid(Object atzcaigouht_caigoujhid){
				this.atzcaigouht_caigoujhid = atzcaigouht_caigoujhid;
			}
			
	  		public Object getAtzcaigouht_caigoujhid(){
	  			return atzcaigouht_caigoujhid;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_dingdanbh(Object atzcaigouht_dingdanbh){
				this.atzcaigouht_dingdanbh = atzcaigouht_dingdanbh;
			}
			
	  		public Object getAtzcaigouht_dingdanbh(){
	  			return atzcaigouht_dingdanbh;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_gongyings(Object atzcaigouht_gongyings){
				this.atzcaigouht_gongyings = atzcaigouht_gongyings;
			}
			
	  		public Object getAtzcaigouht_gongyings(){
	  			return atzcaigouht_gongyings;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_tianxier(Object atzcaigouht_tianxier){
				this.atzcaigouht_tianxier = atzcaigouht_tianxier;
			}
			
	  		public Object getAtzcaigouht_tianxier(){
	  			return atzcaigouht_tianxier;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_tianxierq(Object atzcaigouht_tianxierq){
				this.atzcaigouht_tianxierq = atzcaigouht_tianxierq;
			}
			
	  		public Object getAtzcaigouht_tianxierq(){
	  			return atzcaigouht_tianxierq;
	  		}
  		  		
  							public void setAtzcaigouht_tianxierq1(Object atzcaigouht_tianxierq1){
				this.atzcaigouht_tianxierq1 = atzcaigouht_tianxierq1;
			}
			
	  		public Object getAtzcaigouht_tianxierq1(){
	  			return atzcaigouht_tianxierq1;
	  		}
		  		
  						public void setAtzcaigouhtmx_id(Object atzcaigouhtmx_id){
				this.atzcaigouhtmx_id = atzcaigouhtmx_id;
			}
			
	  		public Object getAtzcaigouhtmx_id(){
	  			return atzcaigouhtmx_id;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_id(Object atzcaigouht_id){
				this.atzcaigouht_id = atzcaigouht_id;
			}
			
	  		public Object getAtzcaigouht_id(){
	  			return atzcaigouht_id;
	  		}
  		  		
  				  		
  	  	
  	public static F7622b7f100000007z init(DataContextHelper context) {
  		F7622b7f100000007z o = new F7622b7f100000007z();
									o.setAtzcaigouhtmx_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzcaigouht_caigoujhid(getValue(context,"atzcaigoujh.id"));
						
						  									o.setAtzcaigouht_dingdanbh(getValue(context,"atzcaigouht.dingdanbh"));
						
						  									o.setAtzcaigouht_gongyings(getValue(context,"atzcaigouht.gongyings"));
						
						  									o.setAtzcaigouht_tianxier(getValue(context,"atzcaigouht.tianxier"));
						
						  									o.setAtzcaigouht_tianxierq(getValue(context,"atzcaigouht.tianxierq"));
						
										o.setAtzcaigouht_tianxierq1(getValue(context,"atzcaigouht.tianxierq1"));
			  									o.setAtzcaigouhtmx_id(getValue(context,"atzcaigouhtmx.id"));
						
						  									o.setAtzcaigouht_id(getValue(context,"atzcaigouht.id"));
						
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