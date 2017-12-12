/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:16.351
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F39c6988400000004z{

	
						private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_hetongmc;
			
				
										private Object atzhetongbg_bianhao;
			
				
										private Object atzhetongbg_biangenglx;
			
				
										private Object atzhetong_id;
			
				
										private Object atzhetongbg_id;
			
				
					
						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzhetongbg_bianhao(Object atzhetongbg_bianhao){
				this.atzhetongbg_bianhao = atzhetongbg_bianhao;
			}
			
	  		public Object getAtzhetongbg_bianhao(){
	  			return atzhetongbg_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzhetongbg_biangenglx(Object atzhetongbg_biangenglx){
				this.atzhetongbg_biangenglx = atzhetongbg_biangenglx;
			}
			
	  		public Object getAtzhetongbg_biangenglx(){
	  			return atzhetongbg_biangenglx;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  						public void setAtzhetongbg_id(Object atzhetongbg_id){
				this.atzhetongbg_id = atzhetongbg_id;
			}
			
	  		public Object getAtzhetongbg_id(){
	  			return atzhetongbg_id;
	  		}
  		  		
  				  		
  	  	
  	public static F39c6988400000004z init(DataContextHelper context) {
  		F39c6988400000004z o = new F39c6988400000004z();
									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetongbg_bianhao(getValue(context,"atzhetongbg.bianhao"));
						
						  									o.setAtzhetongbg_biangenglx(getValue(context,"atzhetongbg.biangenglx"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
						  									o.setAtzhetongbg_id(getValue(context,"atzhetongbg.id"));
						
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