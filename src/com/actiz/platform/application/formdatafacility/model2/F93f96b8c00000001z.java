/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:07:06.726
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F93f96b8c00000001z{

	
						private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzkehu_kehumc;
			
				
										private Object atzhetong_chanpinyysf;
			
				
										private Object atzkehu_id;
			
				
										private Object atzhetong_id;
			
				
					
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
  		  		
  				  		
  						public void setAtzkehu_kehumc(Object atzkehu_kehumc){
				this.atzkehu_kehumc = atzkehu_kehumc;
			}
			
	  		public Object getAtzkehu_kehumc(){
	  			return atzkehu_kehumc;
	  		}
  		  		
  				  		
  						public void setAtzhetong_chanpinyysf(Object atzhetong_chanpinyysf){
				this.atzhetong_chanpinyysf = atzhetong_chanpinyysf;
			}
			
	  		public Object getAtzhetong_chanpinyysf(){
	  			return atzhetong_chanpinyysf;
	  		}
  		  		
  				  		
  						public void setAtzkehu_id(Object atzkehu_id){
				this.atzkehu_id = atzkehu_id;
			}
			
	  		public Object getAtzkehu_id(){
	  			return atzkehu_id;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F93f96b8c00000001z init(DataContextHelper context) {
  		F93f96b8c00000001z o = new F93f96b8c00000001z();
									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzkehu_kehumc(getValue(context,"atzkehu.kehumc"));
						
						  									o.setAtzhetong_chanpinyysf(getValue(context,"atzhetong.chanpinyysf"));
						
						  									o.setAtzkehu_id(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
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