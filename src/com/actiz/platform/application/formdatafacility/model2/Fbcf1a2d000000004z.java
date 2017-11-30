/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:58.424
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fbcf1a2d000000004z{

	
						private Object atzbanbendysqd_bianhao;
			
				
										private Object atzbanbendysqd_shifoujjdy;
			
				
										private Object atzbanbendysqd_chanpinmkmc;
			
				
										private Object atzbanbendysqd_shenhezt;
			
				
										private Object atzbanbendysqd_id;
			
				
					
						public void setAtzbanbendysqd_bianhao(Object atzbanbendysqd_bianhao){
				this.atzbanbendysqd_bianhao = atzbanbendysqd_bianhao;
			}
			
	  		public Object getAtzbanbendysqd_bianhao(){
	  			return atzbanbendysqd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzbanbendysqd_shifoujjdy(Object atzbanbendysqd_shifoujjdy){
				this.atzbanbendysqd_shifoujjdy = atzbanbendysqd_shifoujjdy;
			}
			
	  		public Object getAtzbanbendysqd_shifoujjdy(){
	  			return atzbanbendysqd_shifoujjdy;
	  		}
  		  		
  				  		
  						public void setAtzbanbendysqd_chanpinmkmc(Object atzbanbendysqd_chanpinmkmc){
				this.atzbanbendysqd_chanpinmkmc = atzbanbendysqd_chanpinmkmc;
			}
			
	  		public Object getAtzbanbendysqd_chanpinmkmc(){
	  			return atzbanbendysqd_chanpinmkmc;
	  		}
  		  		
  				  		
  						public void setAtzbanbendysqd_shenhezt(Object atzbanbendysqd_shenhezt){
				this.atzbanbendysqd_shenhezt = atzbanbendysqd_shenhezt;
			}
			
	  		public Object getAtzbanbendysqd_shenhezt(){
	  			return atzbanbendysqd_shenhezt;
	  		}
  		  		
  				  		
  						public void setAtzbanbendysqd_id(Object atzbanbendysqd_id){
				this.atzbanbendysqd_id = atzbanbendysqd_id;
			}
			
	  		public Object getAtzbanbendysqd_id(){
	  			return atzbanbendysqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fbcf1a2d000000004z init(DataContextHelper context) {
  		Fbcf1a2d000000004z o = new Fbcf1a2d000000004z();
									o.setAtzbanbendysqd_bianhao(getValue(context,"atzbanbendysqd.bianhao"));
						
						  									o.setAtzbanbendysqd_shifoujjdy(getValue(context,"atzbanbendysqd.shifoujjdy"));
						
						  									o.setAtzbanbendysqd_chanpinmkmc(getValue(context,"atzbanbendysqd.chanpinmkmc"));
						
						  									o.setAtzbanbendysqd_shenhezt(getValue(context,"atzbanbendysqd.shenhezt"));
						
						  									o.setAtzbanbendysqd_id(getValue(context,"atzbanbendysqd.id"));
						
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