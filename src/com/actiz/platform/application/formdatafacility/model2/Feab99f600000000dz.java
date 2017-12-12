/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:00:21.707
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Feab99f600000000dz{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzgudingzc_shebeimc;
			
				
										private Object atzgudingzc_guige;
			
				
										private Object atzgudingzc_youxiaoq;
			
				
							private Object atzgudingzc_youxiaoq1;
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
  		  		
  				  		
  						public void setAtzgudingzc_youxiaoq(Object atzgudingzc_youxiaoq){
				this.atzgudingzc_youxiaoq = atzgudingzc_youxiaoq;
			}
			
	  		public Object getAtzgudingzc_youxiaoq(){
	  			return atzgudingzc_youxiaoq;
	  		}
  		  		
  							public void setAtzgudingzc_youxiaoq1(Object atzgudingzc_youxiaoq1){
				this.atzgudingzc_youxiaoq1 = atzgudingzc_youxiaoq1;
			}
			
	  		public Object getAtzgudingzc_youxiaoq1(){
	  			return atzgudingzc_youxiaoq1;
	  		}
		  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Feab99f600000000dz init(DataContextHelper context) {
  		Feab99f600000000dz o = new Feab99f600000000dz();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzgudingzc_shebeimc(getValue(context,"atzgudingzc.shebeimc"));
						
						  									o.setAtzgudingzc_guige(getValue(context,"atzgudingzc.guige"));
						
						  									o.setAtzgudingzc_youxiaoq(getValue(context,"atzgudingzc.youxiaoq"));
						
										o.setAtzgudingzc_youxiaoq1(getValue(context,"atzgudingzc.youxiaoq1"));
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