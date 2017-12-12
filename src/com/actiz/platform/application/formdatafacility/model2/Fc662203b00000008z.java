/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:49.801
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc662203b00000008z{

	
						private Object atzwuliaojcxx_tuhao;
			
				
										private Object atzwuliaojcxx_banbenh;
			
				
										private Object atzwuliaojcxx_id;
			
				
					
						public void setAtzwuliaojcxx_tuhao(Object atzwuliaojcxx_tuhao){
				this.atzwuliaojcxx_tuhao = atzwuliaojcxx_tuhao;
			}
			
	  		public Object getAtzwuliaojcxx_tuhao(){
	  			return atzwuliaojcxx_tuhao;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_banbenh(Object atzwuliaojcxx_banbenh){
				this.atzwuliaojcxx_banbenh = atzwuliaojcxx_banbenh;
			}
			
	  		public Object getAtzwuliaojcxx_banbenh(){
	  			return atzwuliaojcxx_banbenh;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc662203b00000008z init(DataContextHelper context) {
  		Fc662203b00000008z o = new Fc662203b00000008z();
									o.setAtzwuliaojcxx_tuhao(getValue(context,"atzwuliaojcxx.tuhao"));
						
						  									o.setAtzwuliaojcxx_banbenh(getValue(context,"atzwuliaojcxx.banbenh"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
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