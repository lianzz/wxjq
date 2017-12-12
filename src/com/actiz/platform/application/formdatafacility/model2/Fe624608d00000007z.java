/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:13:11.212
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe624608d00000007z{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzgudingzc_shebeimc;
			
				
										private Object atzemployee_empcode;
			
				
										private Object atzgudingzc_lingyongr;
			
				
										private Object atzgudingzc_zichanzt;
			
				
										private Object atzgudingzc_shebeilb;
			
				
										private Object atzemployee_id;
			
				
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
  		  		
  				  		
  						public void setAtzemployee_empcode(Object atzemployee_empcode){
				this.atzemployee_empcode = atzemployee_empcode;
			}
			
	  		public Object getAtzemployee_empcode(){
	  			return atzemployee_empcode;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_lingyongr(Object atzgudingzc_lingyongr){
				this.atzgudingzc_lingyongr = atzgudingzc_lingyongr;
			}
			
	  		public Object getAtzgudingzc_lingyongr(){
	  			return atzgudingzc_lingyongr;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_zichanzt(Object atzgudingzc_zichanzt){
				this.atzgudingzc_zichanzt = atzgudingzc_zichanzt;
			}
			
	  		public Object getAtzgudingzc_zichanzt(){
	  			return atzgudingzc_zichanzt;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeilb(Object atzgudingzc_shebeilb){
				this.atzgudingzc_shebeilb = atzgudingzc_shebeilb;
			}
			
	  		public Object getAtzgudingzc_shebeilb(){
	  			return atzgudingzc_shebeilb;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe624608d00000007z init(DataContextHelper context) {
  		Fe624608d00000007z o = new Fe624608d00000007z();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzgudingzc_shebeimc(getValue(context,"atzgudingzc.shebeimc"));
						
						  									o.setAtzemployee_empcode(getValue(context,"atzemployee.empcode"));
						
						  									o.setAtzgudingzc_lingyongr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzgudingzc_zichanzt(getValue(context,"atzgudingzc.zichanzt"));
						
						  									o.setAtzgudingzc_shebeilb(getValue(context,"atzgudingzc.shebeilb"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
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