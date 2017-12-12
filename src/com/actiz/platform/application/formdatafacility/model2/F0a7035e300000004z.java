/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:04.986
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F0a7035e300000004z{

	
						private Object atzdaohuotzd_bianhao;
			
				
										private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigouht_dingdanbh;
			
				
										private Object atzdaohuotzd_daohuorq;
			
				
							private Object atzdaohuotzd_daohuorq1;
								private Object atzcaigouht_id;
			
				
										private Object atzdaohuotzd_id;
			
				
										private Object atzcaigoujh_id;
			
				
					
						public void setAtzdaohuotzd_bianhao(Object atzdaohuotzd_bianhao){
				this.atzdaohuotzd_bianhao = atzdaohuotzd_bianhao;
			}
			
	  		public Object getAtzdaohuotzd_bianhao(){
	  			return atzdaohuotzd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigouht_dingdanbh(Object atzcaigouht_dingdanbh){
				this.atzcaigouht_dingdanbh = atzcaigouht_dingdanbh;
			}
			
	  		public Object getAtzcaigouht_dingdanbh(){
	  			return atzcaigouht_dingdanbh;
	  		}
  		  		
  				  		
  						public void setAtzdaohuotzd_daohuorq(Object atzdaohuotzd_daohuorq){
				this.atzdaohuotzd_daohuorq = atzdaohuotzd_daohuorq;
			}
			
	  		public Object getAtzdaohuotzd_daohuorq(){
	  			return atzdaohuotzd_daohuorq;
	  		}
  		  		
  							public void setAtzdaohuotzd_daohuorq1(Object atzdaohuotzd_daohuorq1){
				this.atzdaohuotzd_daohuorq1 = atzdaohuotzd_daohuorq1;
			}
			
	  		public Object getAtzdaohuotzd_daohuorq1(){
	  			return atzdaohuotzd_daohuorq1;
	  		}
		  		
  						public void setAtzcaigouht_id(Object atzcaigouht_id){
				this.atzcaigouht_id = atzcaigouht_id;
			}
			
	  		public Object getAtzcaigouht_id(){
	  			return atzcaigouht_id;
	  		}
  		  		
  				  		
  						public void setAtzdaohuotzd_id(Object atzdaohuotzd_id){
				this.atzdaohuotzd_id = atzdaohuotzd_id;
			}
			
	  		public Object getAtzdaohuotzd_id(){
	  			return atzdaohuotzd_id;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F0a7035e300000004z init(DataContextHelper context) {
  		F0a7035e300000004z o = new F0a7035e300000004z();
									o.setAtzdaohuotzd_bianhao(getValue(context,"atzdaohuotzd.bianhao"));
						
						  									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigouht_dingdanbh(getValue(context,"atzcaigouht.dingdanbh"));
						
						  									o.setAtzdaohuotzd_daohuorq(getValue(context,"atzdaohuotzd.daohuorq"));
						
										o.setAtzdaohuotzd_daohuorq1(getValue(context,"atzdaohuotzd.daohuorq1"));
			  									o.setAtzcaigouht_id(getValue(context,"atzcaigouht.id"));
						
						  									o.setAtzdaohuotzd_id(getValue(context,"atzdaohuotzd.id"));
						
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