/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:33.585
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F0601d9b700000007z{

	
						private Object atzhuiyijy_huiyizt;
			
				
										private Object atzhuiyijy_huiyilx;
			
				
										private Object atzhuiyijy_huiyizcr;
			
				
										private Object atzhuiyijy_huiyijlsj;
			
				
							private Object atzhuiyijy_huiyijlsj1;
								private Object atzhuiyijy_id;
			
				
					
						public void setAtzhuiyijy_huiyizt(Object atzhuiyijy_huiyizt){
				this.atzhuiyijy_huiyizt = atzhuiyijy_huiyizt;
			}
			
	  		public Object getAtzhuiyijy_huiyizt(){
	  			return atzhuiyijy_huiyizt;
	  		}
  		  		
  				  		
  						public void setAtzhuiyijy_huiyilx(Object atzhuiyijy_huiyilx){
				this.atzhuiyijy_huiyilx = atzhuiyijy_huiyilx;
			}
			
	  		public Object getAtzhuiyijy_huiyilx(){
	  			return atzhuiyijy_huiyilx;
	  		}
  		  		
  				  		
  						public void setAtzhuiyijy_huiyizcr(Object atzhuiyijy_huiyizcr){
				this.atzhuiyijy_huiyizcr = atzhuiyijy_huiyizcr;
			}
			
	  		public Object getAtzhuiyijy_huiyizcr(){
	  			return atzhuiyijy_huiyizcr;
	  		}
  		  		
  				  		
  						public void setAtzhuiyijy_huiyijlsj(Object atzhuiyijy_huiyijlsj){
				this.atzhuiyijy_huiyijlsj = atzhuiyijy_huiyijlsj;
			}
			
	  		public Object getAtzhuiyijy_huiyijlsj(){
	  			return atzhuiyijy_huiyijlsj;
	  		}
  		  		
  							public void setAtzhuiyijy_huiyijlsj1(Object atzhuiyijy_huiyijlsj1){
				this.atzhuiyijy_huiyijlsj1 = atzhuiyijy_huiyijlsj1;
			}
			
	  		public Object getAtzhuiyijy_huiyijlsj1(){
	  			return atzhuiyijy_huiyijlsj1;
	  		}
		  		
  						public void setAtzhuiyijy_id(Object atzhuiyijy_id){
				this.atzhuiyijy_id = atzhuiyijy_id;
			}
			
	  		public Object getAtzhuiyijy_id(){
	  			return atzhuiyijy_id;
	  		}
  		  		
  				  		
  	  	
  	public static F0601d9b700000007z init(DataContextHelper context) {
  		F0601d9b700000007z o = new F0601d9b700000007z();
									o.setAtzhuiyijy_huiyizt(getValue(context,"atzhuiyijy.huiyizt"));
						
						  									o.setAtzhuiyijy_huiyilx(getValue(context,"atzhuiyijy.huiyilx"));
						
						  									o.setAtzhuiyijy_huiyizcr(getValue(context,"atzhuiyijy.huiyizcr"));
						
						  									o.setAtzhuiyijy_huiyijlsj(getValue(context,"atzhuiyijy.huiyijlsj"));
						
										o.setAtzhuiyijy_huiyijlsj1(getValue(context,"atzhuiyijy.huiyijlsj1"));
			  									o.setAtzhuiyijy_id(getValue(context,"atzhuiyijy.id"));
						
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