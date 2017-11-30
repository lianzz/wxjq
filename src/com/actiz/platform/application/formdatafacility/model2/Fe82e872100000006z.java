/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:52.528
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe82e872100000006z{

	
						private Object atzrangbujsd_bianhao;
			
				
										private Object atzrangbujsd_wuliaoid;
			
				
										private Object atzrangbujsd_gongyings;
			
				
										private Object atzrangbujsd_shouhuorq;
			
				
							private Object atzrangbujsd_shouhuorq1;
								private Object atzrangbujsd_shenqingbm;
			
				
										private Object atzrangbujsd_shenqingr;
			
				
										private Object atzrangbujsd_riqi;
			
				
							private Object atzrangbujsd_riqi1;
								private Object atzrangbujsd_danjuzt;
			
				
										private Object atzrangbujsd_id;
			
				
					
						public void setAtzrangbujsd_bianhao(Object atzrangbujsd_bianhao){
				this.atzrangbujsd_bianhao = atzrangbujsd_bianhao;
			}
			
	  		public Object getAtzrangbujsd_bianhao(){
	  			return atzrangbujsd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_wuliaoid(Object atzrangbujsd_wuliaoid){
				this.atzrangbujsd_wuliaoid = atzrangbujsd_wuliaoid;
			}
			
	  		public Object getAtzrangbujsd_wuliaoid(){
	  			return atzrangbujsd_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_gongyings(Object atzrangbujsd_gongyings){
				this.atzrangbujsd_gongyings = atzrangbujsd_gongyings;
			}
			
	  		public Object getAtzrangbujsd_gongyings(){
	  			return atzrangbujsd_gongyings;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_shouhuorq(Object atzrangbujsd_shouhuorq){
				this.atzrangbujsd_shouhuorq = atzrangbujsd_shouhuorq;
			}
			
	  		public Object getAtzrangbujsd_shouhuorq(){
	  			return atzrangbujsd_shouhuorq;
	  		}
  		  		
  							public void setAtzrangbujsd_shouhuorq1(Object atzrangbujsd_shouhuorq1){
				this.atzrangbujsd_shouhuorq1 = atzrangbujsd_shouhuorq1;
			}
			
	  		public Object getAtzrangbujsd_shouhuorq1(){
	  			return atzrangbujsd_shouhuorq1;
	  		}
		  		
  						public void setAtzrangbujsd_shenqingbm(Object atzrangbujsd_shenqingbm){
				this.atzrangbujsd_shenqingbm = atzrangbujsd_shenqingbm;
			}
			
	  		public Object getAtzrangbujsd_shenqingbm(){
	  			return atzrangbujsd_shenqingbm;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_shenqingr(Object atzrangbujsd_shenqingr){
				this.atzrangbujsd_shenqingr = atzrangbujsd_shenqingr;
			}
			
	  		public Object getAtzrangbujsd_shenqingr(){
	  			return atzrangbujsd_shenqingr;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_riqi(Object atzrangbujsd_riqi){
				this.atzrangbujsd_riqi = atzrangbujsd_riqi;
			}
			
	  		public Object getAtzrangbujsd_riqi(){
	  			return atzrangbujsd_riqi;
	  		}
  		  		
  							public void setAtzrangbujsd_riqi1(Object atzrangbujsd_riqi1){
				this.atzrangbujsd_riqi1 = atzrangbujsd_riqi1;
			}
			
	  		public Object getAtzrangbujsd_riqi1(){
	  			return atzrangbujsd_riqi1;
	  		}
		  		
  						public void setAtzrangbujsd_danjuzt(Object atzrangbujsd_danjuzt){
				this.atzrangbujsd_danjuzt = atzrangbujsd_danjuzt;
			}
			
	  		public Object getAtzrangbujsd_danjuzt(){
	  			return atzrangbujsd_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzrangbujsd_id(Object atzrangbujsd_id){
				this.atzrangbujsd_id = atzrangbujsd_id;
			}
			
	  		public Object getAtzrangbujsd_id(){
	  			return atzrangbujsd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe82e872100000006z init(DataContextHelper context) {
  		Fe82e872100000006z o = new Fe82e872100000006z();
									o.setAtzrangbujsd_bianhao(getValue(context,"atzrangbujsd.bianhao"));
						
						  									o.setAtzrangbujsd_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzrangbujsd_gongyings(getValue(context,"atzrangbujsd.gongyings"));
						
						  									o.setAtzrangbujsd_shouhuorq(getValue(context,"atzrangbujsd.shouhuorq"));
						
										o.setAtzrangbujsd_shouhuorq1(getValue(context,"atzrangbujsd.shouhuorq1"));
			  									o.setAtzrangbujsd_shenqingbm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzrangbujsd_shenqingr(getValue(context,"atzrangbujsd.shenqingr"));
						
						  									o.setAtzrangbujsd_riqi(getValue(context,"atzrangbujsd.riqi"));
						
										o.setAtzrangbujsd_riqi1(getValue(context,"atzrangbujsd.riqi1"));
			  									o.setAtzrangbujsd_danjuzt(getValue(context,"atzrangbujsd.danjuzt"));
						
						  									o.setAtzrangbujsd_id(getValue(context,"atzrangbujsd.id"));
						
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