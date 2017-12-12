/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:09:38.336
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F90ade35500000004z{

	
						private Object atzjidukhhz_zhuti;
			
				
										private Object atzjidukhhz_kaohejd;
			
				
										private Object atzjidukhhz_bum;
			
				
										private Object atzjidukhhz_zhibiaor;
			
				
										private Object atzjidukhhz_zhibiaorq;
			
				
							private Object atzjidukhhz_zhibiaorq1;
								private Object atzjidukhhz_id;
			
				
					
						public void setAtzjidukhhz_zhuti(Object atzjidukhhz_zhuti){
				this.atzjidukhhz_zhuti = atzjidukhhz_zhuti;
			}
			
	  		public Object getAtzjidukhhz_zhuti(){
	  			return atzjidukhhz_zhuti;
	  		}
  		  		
  				  		
  						public void setAtzjidukhhz_kaohejd(Object atzjidukhhz_kaohejd){
				this.atzjidukhhz_kaohejd = atzjidukhhz_kaohejd;
			}
			
	  		public Object getAtzjidukhhz_kaohejd(){
	  			return atzjidukhhz_kaohejd;
	  		}
  		  		
  				  		
  						public void setAtzjidukhhz_bum(Object atzjidukhhz_bum){
				this.atzjidukhhz_bum = atzjidukhhz_bum;
			}
			
	  		public Object getAtzjidukhhz_bum(){
	  			return atzjidukhhz_bum;
	  		}
  		  		
  				  		
  						public void setAtzjidukhhz_zhibiaor(Object atzjidukhhz_zhibiaor){
				this.atzjidukhhz_zhibiaor = atzjidukhhz_zhibiaor;
			}
			
	  		public Object getAtzjidukhhz_zhibiaor(){
	  			return atzjidukhhz_zhibiaor;
	  		}
  		  		
  				  		
  						public void setAtzjidukhhz_zhibiaorq(Object atzjidukhhz_zhibiaorq){
				this.atzjidukhhz_zhibiaorq = atzjidukhhz_zhibiaorq;
			}
			
	  		public Object getAtzjidukhhz_zhibiaorq(){
	  			return atzjidukhhz_zhibiaorq;
	  		}
  		  		
  							public void setAtzjidukhhz_zhibiaorq1(Object atzjidukhhz_zhibiaorq1){
				this.atzjidukhhz_zhibiaorq1 = atzjidukhhz_zhibiaorq1;
			}
			
	  		public Object getAtzjidukhhz_zhibiaorq1(){
	  			return atzjidukhhz_zhibiaorq1;
	  		}
		  		
  						public void setAtzjidukhhz_id(Object atzjidukhhz_id){
				this.atzjidukhhz_id = atzjidukhhz_id;
			}
			
	  		public Object getAtzjidukhhz_id(){
	  			return atzjidukhhz_id;
	  		}
  		  		
  				  		
  	  	
  	public static F90ade35500000004z init(DataContextHelper context) {
  		F90ade35500000004z o = new F90ade35500000004z();
									o.setAtzjidukhhz_zhuti(getValue(context,"atzjidukhhz.zhuti"));
						
						  									o.setAtzjidukhhz_kaohejd(getValue(context,"atzjidukhhz.kaohejd"));
						
						  									o.setAtzjidukhhz_bum(getValue(context,"atzjidukhhz.bum"));
						
						  									o.setAtzjidukhhz_zhibiaor(getValue(context,"atzjidukhhz.zhibiaor"));
						
						  									o.setAtzjidukhhz_zhibiaorq(getValue(context,"atzjidukhhz.zhibiaorq"));
						
										o.setAtzjidukhhz_zhibiaorq1(getValue(context,"atzjidukhhz.zhibiaorq1"));
			  									o.setAtzjidukhhz_id(getValue(context,"atzjidukhhz.id"));
						
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