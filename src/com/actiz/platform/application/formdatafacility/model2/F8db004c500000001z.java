/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:35:49.114
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8db004c500000001z{

	
						private Object atzxyuangong_yuangongbh;
			
				
										private Object atzxyuangong_yuangongmc;
			
				
										private Object atzxyuangong_yaungongxb;
			
				
										private Object atzxyuangong_yuangongxl;
			
				
										private Object atzxyuangong_ruzhisj;
			
				
							private Object atzxyuangong_ruzhisj1;
								private Object atzxyuangong_lururq;
			
				
							private Object atzxyuangong_lururq1;
								private Object atzxyuangong_bumenmc;
			
				
										private Object atzxyuangong_id;
			
				
					
						public void setAtzxyuangong_yuangongbh(Object atzxyuangong_yuangongbh){
				this.atzxyuangong_yuangongbh = atzxyuangong_yuangongbh;
			}
			
	  		public Object getAtzxyuangong_yuangongbh(){
	  			return atzxyuangong_yuangongbh;
	  		}
  		  		
  				  		
  						public void setAtzxyuangong_yuangongmc(Object atzxyuangong_yuangongmc){
				this.atzxyuangong_yuangongmc = atzxyuangong_yuangongmc;
			}
			
	  		public Object getAtzxyuangong_yuangongmc(){
	  			return atzxyuangong_yuangongmc;
	  		}
  		  		
  				  		
  						public void setAtzxyuangong_yaungongxb(Object atzxyuangong_yaungongxb){
				this.atzxyuangong_yaungongxb = atzxyuangong_yaungongxb;
			}
			
	  		public Object getAtzxyuangong_yaungongxb(){
	  			return atzxyuangong_yaungongxb;
	  		}
  		  		
  				  		
  						public void setAtzxyuangong_yuangongxl(Object atzxyuangong_yuangongxl){
				this.atzxyuangong_yuangongxl = atzxyuangong_yuangongxl;
			}
			
	  		public Object getAtzxyuangong_yuangongxl(){
	  			return atzxyuangong_yuangongxl;
	  		}
  		  		
  				  		
  						public void setAtzxyuangong_ruzhisj(Object atzxyuangong_ruzhisj){
				this.atzxyuangong_ruzhisj = atzxyuangong_ruzhisj;
			}
			
	  		public Object getAtzxyuangong_ruzhisj(){
	  			return atzxyuangong_ruzhisj;
	  		}
  		  		
  							public void setAtzxyuangong_ruzhisj1(Object atzxyuangong_ruzhisj1){
				this.atzxyuangong_ruzhisj1 = atzxyuangong_ruzhisj1;
			}
			
	  		public Object getAtzxyuangong_ruzhisj1(){
	  			return atzxyuangong_ruzhisj1;
	  		}
		  		
  						public void setAtzxyuangong_lururq(Object atzxyuangong_lururq){
				this.atzxyuangong_lururq = atzxyuangong_lururq;
			}
			
	  		public Object getAtzxyuangong_lururq(){
	  			return atzxyuangong_lururq;
	  		}
  		  		
  							public void setAtzxyuangong_lururq1(Object atzxyuangong_lururq1){
				this.atzxyuangong_lururq1 = atzxyuangong_lururq1;
			}
			
	  		public Object getAtzxyuangong_lururq1(){
	  			return atzxyuangong_lururq1;
	  		}
		  		
  						public void setAtzxyuangong_bumenmc(Object atzxyuangong_bumenmc){
				this.atzxyuangong_bumenmc = atzxyuangong_bumenmc;
			}
			
	  		public Object getAtzxyuangong_bumenmc(){
	  			return atzxyuangong_bumenmc;
	  		}
  		  		
  				  		
  						public void setAtzxyuangong_id(Object atzxyuangong_id){
				this.atzxyuangong_id = atzxyuangong_id;
			}
			
	  		public Object getAtzxyuangong_id(){
	  			return atzxyuangong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8db004c500000001z init(DataContextHelper context) {
  		F8db004c500000001z o = new F8db004c500000001z();
									o.setAtzxyuangong_yuangongbh(getValue(context,"atzxyuangong.yuangongbh"));
						
						  									o.setAtzxyuangong_yuangongmc(getValue(context,"atzxyuangong.yuangongmc"));
						
						  									o.setAtzxyuangong_yaungongxb(getValue(context,"atzxyuangong.yaungongxb"));
						
						  									o.setAtzxyuangong_yuangongxl(getValue(context,"atzxyuangong.yuangongxl"));
						
						  									o.setAtzxyuangong_ruzhisj(getValue(context,"atzxyuangong.ruzhisj"));
						
										o.setAtzxyuangong_ruzhisj1(getValue(context,"atzxyuangong.ruzhisj1"));
			  									o.setAtzxyuangong_lururq(getValue(context,"atzxyuangong.lururq"));
						
										o.setAtzxyuangong_lururq1(getValue(context,"atzxyuangong.lururq1"));
			  									o.setAtzxyuangong_bumenmc(getValue(context,"atzxbumen.id"));
						
						  									o.setAtzxyuangong_id(getValue(context,"atzxyuangong.id"));
						
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