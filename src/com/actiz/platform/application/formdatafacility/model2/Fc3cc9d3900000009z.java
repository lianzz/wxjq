/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-20 17:30:19.679
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc3cc9d3900000009z{

	
						private Object atzhetongtk_bianhao;
			
				
										private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzhetongtk_danjuzt;
			
				
										private Object atzhetong_id;
			
				
										private Object atzhetongtk_id;
			
				
					
						public void setAtzhetongtk_bianhao(Object atzhetongtk_bianhao){
				this.atzhetongtk_bianhao = atzhetongtk_bianhao;
			}
			
	  		public Object getAtzhetongtk_bianhao(){
	  			return atzhetongtk_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzhetongtk_danjuzt(Object atzhetongtk_danjuzt){
				this.atzhetongtk_danjuzt = atzhetongtk_danjuzt;
			}
			
	  		public Object getAtzhetongtk_danjuzt(){
	  			return atzhetongtk_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  						public void setAtzhetongtk_id(Object atzhetongtk_id){
				this.atzhetongtk_id = atzhetongtk_id;
			}
			
	  		public Object getAtzhetongtk_id(){
	  			return atzhetongtk_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc3cc9d3900000009z init(DataContextHelper context) {
  		Fc3cc9d3900000009z o = new Fc3cc9d3900000009z();
									o.setAtzhetongtk_bianhao(getValue(context,"atzhetongtk.bianhao"));
						
						  									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetongtk_danjuzt(getValue(context,"atzhetongtk.danjuzt"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
						  									o.setAtzhetongtk_id(getValue(context,"atzhetongtk.id"));
						
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