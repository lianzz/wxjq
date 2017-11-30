/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:29.57
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F577988a400000001z{

	
						private Object atzjihuatz_bianhao;
			
				
										private Object atzjihuatz_tzdanju;
			
				
										private Object atzchurukjhd_bianhao;
			
				
										private Object atzjihuatz_tzren;
			
				
										private Object atzjihuatz_tzriqi;
			
				
							private Object atzjihuatz_tzriqi1;
								private Object atzjihuatz_danjuzt;
			
				
										private Object atzjihuatz_id;
			
				
										private Object atzchurukjhd_id;
			
				
					
						public void setAtzjihuatz_bianhao(Object atzjihuatz_bianhao){
				this.atzjihuatz_bianhao = atzjihuatz_bianhao;
			}
			
	  		public Object getAtzjihuatz_bianhao(){
	  			return atzjihuatz_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzjihuatz_tzdanju(Object atzjihuatz_tzdanju){
				this.atzjihuatz_tzdanju = atzjihuatz_tzdanju;
			}
			
	  		public Object getAtzjihuatz_tzdanju(){
	  			return atzjihuatz_tzdanju;
	  		}
  		  		
  				  		
  						public void setAtzchurukjhd_bianhao(Object atzchurukjhd_bianhao){
				this.atzchurukjhd_bianhao = atzchurukjhd_bianhao;
			}
			
	  		public Object getAtzchurukjhd_bianhao(){
	  			return atzchurukjhd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzjihuatz_tzren(Object atzjihuatz_tzren){
				this.atzjihuatz_tzren = atzjihuatz_tzren;
			}
			
	  		public Object getAtzjihuatz_tzren(){
	  			return atzjihuatz_tzren;
	  		}
  		  		
  				  		
  						public void setAtzjihuatz_tzriqi(Object atzjihuatz_tzriqi){
				this.atzjihuatz_tzriqi = atzjihuatz_tzriqi;
			}
			
	  		public Object getAtzjihuatz_tzriqi(){
	  			return atzjihuatz_tzriqi;
	  		}
  		  		
  							public void setAtzjihuatz_tzriqi1(Object atzjihuatz_tzriqi1){
				this.atzjihuatz_tzriqi1 = atzjihuatz_tzriqi1;
			}
			
	  		public Object getAtzjihuatz_tzriqi1(){
	  			return atzjihuatz_tzriqi1;
	  		}
		  		
  						public void setAtzjihuatz_danjuzt(Object atzjihuatz_danjuzt){
				this.atzjihuatz_danjuzt = atzjihuatz_danjuzt;
			}
			
	  		public Object getAtzjihuatz_danjuzt(){
	  			return atzjihuatz_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzjihuatz_id(Object atzjihuatz_id){
				this.atzjihuatz_id = atzjihuatz_id;
			}
			
	  		public Object getAtzjihuatz_id(){
	  			return atzjihuatz_id;
	  		}
  		  		
  				  		
  						public void setAtzchurukjhd_id(Object atzchurukjhd_id){
				this.atzchurukjhd_id = atzchurukjhd_id;
			}
			
	  		public Object getAtzchurukjhd_id(){
	  			return atzchurukjhd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F577988a400000001z init(DataContextHelper context) {
  		F577988a400000001z o = new F577988a400000001z();
									o.setAtzjihuatz_bianhao(getValue(context,"atzjihuatz.bianhao"));
						
						  									o.setAtzjihuatz_tzdanju(getValue(context,"atzjihuatz.tzdanju"));
						
						  									o.setAtzchurukjhd_bianhao(getValue(context,"atzchurukjhd.bianhao"));
						
						  									o.setAtzjihuatz_tzren(getValue(context,"atzjihuatz.tzren"));
						
						  									o.setAtzjihuatz_tzriqi(getValue(context,"atzjihuatz.tzriqi"));
						
										o.setAtzjihuatz_tzriqi1(getValue(context,"atzjihuatz.tzriqi1"));
			  									o.setAtzjihuatz_danjuzt(getValue(context,"atzjihuatz.danjuzt"));
						
						  									o.setAtzjihuatz_id(getValue(context,"atzjihuatz.id"));
						
						  									o.setAtzchurukjhd_id(getValue(context,"atzchurukjhd.id"));
						
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