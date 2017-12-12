/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:11.673
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc7a159090000001bz{

	
						private Object atzzhouzjjh_zongjiemc;
			
				
										private Object atzzhouzjjh_jihuamc;
			
				
										private Object atzzhouzjjh_lurusj;
			
				
							private Object atzzhouzjjh_lurusj1;
								private Object atzzhouzjjh_id;
			
				
					
						public void setAtzzhouzjjh_zongjiemc(Object atzzhouzjjh_zongjiemc){
				this.atzzhouzjjh_zongjiemc = atzzhouzjjh_zongjiemc;
			}
			
	  		public Object getAtzzhouzjjh_zongjiemc(){
	  			return atzzhouzjjh_zongjiemc;
	  		}
  		  		
  				  		
  						public void setAtzzhouzjjh_jihuamc(Object atzzhouzjjh_jihuamc){
				this.atzzhouzjjh_jihuamc = atzzhouzjjh_jihuamc;
			}
			
	  		public Object getAtzzhouzjjh_jihuamc(){
	  			return atzzhouzjjh_jihuamc;
	  		}
  		  		
  				  		
  						public void setAtzzhouzjjh_lurusj(Object atzzhouzjjh_lurusj){
				this.atzzhouzjjh_lurusj = atzzhouzjjh_lurusj;
			}
			
	  		public Object getAtzzhouzjjh_lurusj(){
	  			return atzzhouzjjh_lurusj;
	  		}
  		  		
  							public void setAtzzhouzjjh_lurusj1(Object atzzhouzjjh_lurusj1){
				this.atzzhouzjjh_lurusj1 = atzzhouzjjh_lurusj1;
			}
			
	  		public Object getAtzzhouzjjh_lurusj1(){
	  			return atzzhouzjjh_lurusj1;
	  		}
		  		
  						public void setAtzzhouzjjh_id(Object atzzhouzjjh_id){
				this.atzzhouzjjh_id = atzzhouzjjh_id;
			}
			
	  		public Object getAtzzhouzjjh_id(){
	  			return atzzhouzjjh_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc7a159090000001bz init(DataContextHelper context) {
  		Fc7a159090000001bz o = new Fc7a159090000001bz();
									o.setAtzzhouzjjh_zongjiemc(getValue(context,"atzzhouzjjh.zongjiemc"));
						
						  									o.setAtzzhouzjjh_jihuamc(getValue(context,"atzzhouzjjh.jihuamc"));
						
						  									o.setAtzzhouzjjh_lurusj(getValue(context,"atzzhouzjjh.lurusj"));
						
										o.setAtzzhouzjjh_lurusj1(getValue(context,"atzzhouzjjh.lurusj1"));
			  									o.setAtzzhouzjjh_id(getValue(context,"atzzhouzjjh.id"));
						
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