/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:23.388
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8ad3f38000000001z{

	
						private Object atzqingjia_yuangongbh;
			
				
										private Object atzqingjia_qingjiabm;
			
				
										private Object atzqingjia_qingjiakssj;
			
				
							private Object atzqingjia_qingjiakssj1;
								private Object atzqingjia_qingjiajssj;
			
				
							private Object atzqingjia_qingjiajssj1;
								private Object atzqingjia_qingjialb;
			
				
										private Object atzqingjia_id;
			
				
					
						public void setAtzqingjia_yuangongbh(Object atzqingjia_yuangongbh){
				this.atzqingjia_yuangongbh = atzqingjia_yuangongbh;
			}
			
	  		public Object getAtzqingjia_yuangongbh(){
	  			return atzqingjia_yuangongbh;
	  		}
  		  		
  				  		
  						public void setAtzqingjia_qingjiabm(Object atzqingjia_qingjiabm){
				this.atzqingjia_qingjiabm = atzqingjia_qingjiabm;
			}
			
	  		public Object getAtzqingjia_qingjiabm(){
	  			return atzqingjia_qingjiabm;
	  		}
  		  		
  				  		
  						public void setAtzqingjia_qingjiakssj(Object atzqingjia_qingjiakssj){
				this.atzqingjia_qingjiakssj = atzqingjia_qingjiakssj;
			}
			
	  		public Object getAtzqingjia_qingjiakssj(){
	  			return atzqingjia_qingjiakssj;
	  		}
  		  		
  							public void setAtzqingjia_qingjiakssj1(Object atzqingjia_qingjiakssj1){
				this.atzqingjia_qingjiakssj1 = atzqingjia_qingjiakssj1;
			}
			
	  		public Object getAtzqingjia_qingjiakssj1(){
	  			return atzqingjia_qingjiakssj1;
	  		}
		  		
  						public void setAtzqingjia_qingjiajssj(Object atzqingjia_qingjiajssj){
				this.atzqingjia_qingjiajssj = atzqingjia_qingjiajssj;
			}
			
	  		public Object getAtzqingjia_qingjiajssj(){
	  			return atzqingjia_qingjiajssj;
	  		}
  		  		
  							public void setAtzqingjia_qingjiajssj1(Object atzqingjia_qingjiajssj1){
				this.atzqingjia_qingjiajssj1 = atzqingjia_qingjiajssj1;
			}
			
	  		public Object getAtzqingjia_qingjiajssj1(){
	  			return atzqingjia_qingjiajssj1;
	  		}
		  		
  						public void setAtzqingjia_qingjialb(Object atzqingjia_qingjialb){
				this.atzqingjia_qingjialb = atzqingjia_qingjialb;
			}
			
	  		public Object getAtzqingjia_qingjialb(){
	  			return atzqingjia_qingjialb;
	  		}
  		  		
  				  		
  						public void setAtzqingjia_id(Object atzqingjia_id){
				this.atzqingjia_id = atzqingjia_id;
			}
			
	  		public Object getAtzqingjia_id(){
	  			return atzqingjia_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8ad3f38000000001z init(DataContextHelper context) {
  		F8ad3f38000000001z o = new F8ad3f38000000001z();
									o.setAtzqingjia_yuangongbh(getValue(context,"atzqingjia.yuangongbh"));
						
						  									o.setAtzqingjia_qingjiabm(getValue(context,"atzqingjia.qingjiabm"));
						
						  									o.setAtzqingjia_qingjiakssj(getValue(context,"atzqingjia.qingjiakssj"));
						
										o.setAtzqingjia_qingjiakssj1(getValue(context,"atzqingjia.qingjiakssj1"));
			  									o.setAtzqingjia_qingjiajssj(getValue(context,"atzqingjia.qingjiajssj"));
						
										o.setAtzqingjia_qingjiajssj1(getValue(context,"atzqingjia.qingjiajssj1"));
			  									o.setAtzqingjia_qingjialb(getValue(context,"atzqingjia.qingjialb"));
						
						  									o.setAtzqingjia_id(getValue(context,"atzqingjia.id"));
						
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