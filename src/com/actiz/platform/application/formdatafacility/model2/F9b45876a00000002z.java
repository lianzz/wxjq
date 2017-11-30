/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:49:47.05
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9b45876a00000002z{

	
						private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigoujh_tianzhibm;
			
				
										private Object atzcaigoujh_tianzhirq;
			
				
							private Object atzcaigoujh_tianzhirq1;
								private Object atzcaigoujh_id;
			
				
					
						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhibm(Object atzcaigoujh_tianzhibm){
				this.atzcaigoujh_tianzhibm = atzcaigoujh_tianzhibm;
			}
			
	  		public Object getAtzcaigoujh_tianzhibm(){
	  			return atzcaigoujh_tianzhibm;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhirq(Object atzcaigoujh_tianzhirq){
				this.atzcaigoujh_tianzhirq = atzcaigoujh_tianzhirq;
			}
			
	  		public Object getAtzcaigoujh_tianzhirq(){
	  			return atzcaigoujh_tianzhirq;
	  		}
  		  		
  							public void setAtzcaigoujh_tianzhirq1(Object atzcaigoujh_tianzhirq1){
				this.atzcaigoujh_tianzhirq1 = atzcaigoujh_tianzhirq1;
			}
			
	  		public Object getAtzcaigoujh_tianzhirq1(){
	  			return atzcaigoujh_tianzhirq1;
	  		}
		  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9b45876a00000002z init(DataContextHelper context) {
  		F9b45876a00000002z o = new F9b45876a00000002z();
									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigoujh_tianzhibm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzcaigoujh_tianzhirq(getValue(context,"atzcaigoujh.tianzhirq"));
						
										o.setAtzcaigoujh_tianzhirq1(getValue(context,"atzcaigoujh.tianzhirq1"));
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