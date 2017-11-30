/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:40.571
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F259949df00000001z{

	
						private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_qiandingrq;
			
				
							private Object atzhetong_qiandingrq1;
								private Object atzhetong_id;
			
				
					
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
  		  		
  				  		
  						public void setAtzhetong_qiandingrq(Object atzhetong_qiandingrq){
				this.atzhetong_qiandingrq = atzhetong_qiandingrq;
			}
			
	  		public Object getAtzhetong_qiandingrq(){
	  			return atzhetong_qiandingrq;
	  		}
  		  		
  							public void setAtzhetong_qiandingrq1(Object atzhetong_qiandingrq1){
				this.atzhetong_qiandingrq1 = atzhetong_qiandingrq1;
			}
			
	  		public Object getAtzhetong_qiandingrq1(){
	  			return atzhetong_qiandingrq1;
	  		}
		  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F259949df00000001z init(DataContextHelper context) {
  		F259949df00000001z o = new F259949df00000001z();
									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_qiandingrq(getValue(context,"atzhetong.qiandingrq"));
						
										o.setAtzhetong_qiandingrq1(getValue(context,"atzhetong.qiandingrq1"));
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