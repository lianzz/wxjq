/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:04:50.572
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Feafcc92400000012z{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzgudingzc_shebeimc;
			
				
										private Object atzgudingzc_guige;
			
				
										private Object atzgudingzc_shegnchancj;
			
				
										private Object atzgudingzc_chuchangbh;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeimc(Object atzgudingzc_shebeimc){
				this.atzgudingzc_shebeimc = atzgudingzc_shebeimc;
			}
			
	  		public Object getAtzgudingzc_shebeimc(){
	  			return atzgudingzc_shebeimc;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_guige(Object atzgudingzc_guige){
				this.atzgudingzc_guige = atzgudingzc_guige;
			}
			
	  		public Object getAtzgudingzc_guige(){
	  			return atzgudingzc_guige;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shegnchancj(Object atzgudingzc_shegnchancj){
				this.atzgudingzc_shegnchancj = atzgudingzc_shegnchancj;
			}
			
	  		public Object getAtzgudingzc_shegnchancj(){
	  			return atzgudingzc_shegnchancj;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_chuchangbh(Object atzgudingzc_chuchangbh){
				this.atzgudingzc_chuchangbh = atzgudingzc_chuchangbh;
			}
			
	  		public Object getAtzgudingzc_chuchangbh(){
	  			return atzgudingzc_chuchangbh;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Feafcc92400000012z init(DataContextHelper context) {
  		Feafcc92400000012z o = new Feafcc92400000012z();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzgudingzc_shebeimc(getValue(context,"atzgudingzc.shebeimc"));
						
						  									o.setAtzgudingzc_guige(getValue(context,"atzgudingzc.guige"));
						
						  									o.setAtzgudingzc_shegnchancj(getValue(context,"atzgudingzc.shegnchancj"));
						
						  									o.setAtzgudingzc_chuchangbh(getValue(context,"atzgudingzc.chuchangbh"));
						
						  									o.setAtzgudingzc_id(getValue(context,"atzgudingzc.id"));
						
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