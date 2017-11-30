/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:47:17.577
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8ea1b5ba00000005z{

	
						private Object atzscjh_bianhao;
			
				
										private Object atzscjh_linshibh;
			
				
										private Object atzscjh_jihuamc;
			
				
										private Object atzscjh_jihuaqsrq;
			
				
							private Object atzscjh_jihuaqsrq1;
								private Object atzscjh_jihuajsrq;
			
				
							private Object atzscjh_jihuajsrq1;
								private Object atzscjh_id;
			
				
					
						public void setAtzscjh_bianhao(Object atzscjh_bianhao){
				this.atzscjh_bianhao = atzscjh_bianhao;
			}
			
	  		public Object getAtzscjh_bianhao(){
	  			return atzscjh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzscjh_linshibh(Object atzscjh_linshibh){
				this.atzscjh_linshibh = atzscjh_linshibh;
			}
			
	  		public Object getAtzscjh_linshibh(){
	  			return atzscjh_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzscjh_jihuamc(Object atzscjh_jihuamc){
				this.atzscjh_jihuamc = atzscjh_jihuamc;
			}
			
	  		public Object getAtzscjh_jihuamc(){
	  			return atzscjh_jihuamc;
	  		}
  		  		
  				  		
  						public void setAtzscjh_jihuaqsrq(Object atzscjh_jihuaqsrq){
				this.atzscjh_jihuaqsrq = atzscjh_jihuaqsrq;
			}
			
	  		public Object getAtzscjh_jihuaqsrq(){
	  			return atzscjh_jihuaqsrq;
	  		}
  		  		
  							public void setAtzscjh_jihuaqsrq1(Object atzscjh_jihuaqsrq1){
				this.atzscjh_jihuaqsrq1 = atzscjh_jihuaqsrq1;
			}
			
	  		public Object getAtzscjh_jihuaqsrq1(){
	  			return atzscjh_jihuaqsrq1;
	  		}
		  		
  						public void setAtzscjh_jihuajsrq(Object atzscjh_jihuajsrq){
				this.atzscjh_jihuajsrq = atzscjh_jihuajsrq;
			}
			
	  		public Object getAtzscjh_jihuajsrq(){
	  			return atzscjh_jihuajsrq;
	  		}
  		  		
  							public void setAtzscjh_jihuajsrq1(Object atzscjh_jihuajsrq1){
				this.atzscjh_jihuajsrq1 = atzscjh_jihuajsrq1;
			}
			
	  		public Object getAtzscjh_jihuajsrq1(){
	  			return atzscjh_jihuajsrq1;
	  		}
		  		
  						public void setAtzscjh_id(Object atzscjh_id){
				this.atzscjh_id = atzscjh_id;
			}
			
	  		public Object getAtzscjh_id(){
	  			return atzscjh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8ea1b5ba00000005z init(DataContextHelper context) {
  		F8ea1b5ba00000005z o = new F8ea1b5ba00000005z();
									o.setAtzscjh_bianhao(getValue(context,"atzscjh.bianhao"));
						
						  									o.setAtzscjh_linshibh(getValue(context,"atzscjh.linshibh"));
						
						  									o.setAtzscjh_jihuamc(getValue(context,"atzscjh.jihuamc"));
						
						  									o.setAtzscjh_jihuaqsrq(getValue(context,"atzscjh.jihuaqsrq"));
						
										o.setAtzscjh_jihuaqsrq1(getValue(context,"atzscjh.jihuaqsrq1"));
			  									o.setAtzscjh_jihuajsrq(getValue(context,"atzscjh.jihuajsrq"));
						
										o.setAtzscjh_jihuajsrq1(getValue(context,"atzscjh.jihuajsrq1"));
			  									o.setAtzscjh_id(getValue(context,"atzscjh.id"));
						
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