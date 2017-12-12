/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:13:03.823
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fea959afb0000000cz{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzemployee_name;
			
				
										private Object atzzichansq_shenqingrq;
			
				
							private Object atzzichansq_shenqingrq1;
								private Object atzzichansq_id;
			
				
										private Object atzemployee_id;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzzichansq_shenqingrq(Object atzzichansq_shenqingrq){
				this.atzzichansq_shenqingrq = atzzichansq_shenqingrq;
			}
			
	  		public Object getAtzzichansq_shenqingrq(){
	  			return atzzichansq_shenqingrq;
	  		}
  		  		
  							public void setAtzzichansq_shenqingrq1(Object atzzichansq_shenqingrq1){
				this.atzzichansq_shenqingrq1 = atzzichansq_shenqingrq1;
			}
			
	  		public Object getAtzzichansq_shenqingrq1(){
	  			return atzzichansq_shenqingrq1;
	  		}
		  		
  						public void setAtzzichansq_id(Object atzzichansq_id){
				this.atzzichansq_id = atzzichansq_id;
			}
			
	  		public Object getAtzzichansq_id(){
	  			return atzzichansq_id;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fea959afb0000000cz init(DataContextHelper context) {
  		Fea959afb0000000cz o = new Fea959afb0000000cz();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzzichansq_shenqingrq(getValue(context,"atzzichansq.shenqingrq"));
						
										o.setAtzzichansq_shenqingrq1(getValue(context,"atzzichansq.shenqingrq1"));
			  									o.setAtzzichansq_id(getValue(context,"atzzichansq.id"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
						  									o.setAtzgudingzc_id(getValue(context,"atzgudingzc.id"));
						
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