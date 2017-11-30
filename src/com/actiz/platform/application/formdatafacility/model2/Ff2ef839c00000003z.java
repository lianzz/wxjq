/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:36:35.106
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Ff2ef839c00000003z{

	
						private Object atzqingjiadan_yuangongbh;
			
				
										private Object atzqingjiadan_bumenmc;
			
				
										private Object atzqingjiadan_qingjiakais;
			
				
							private Object atzqingjiadan_qingjiakais1;
								private Object atzqingjiadan_qingjiajies;
			
				
							private Object atzqingjiadan_qingjiajies1;
								private Object atzqingjiadan_danjuzt;
			
				
										private Object atzqingjiadan_id;
			
				
					
						public void setAtzqingjiadan_yuangongbh(Object atzqingjiadan_yuangongbh){
				this.atzqingjiadan_yuangongbh = atzqingjiadan_yuangongbh;
			}
			
	  		public Object getAtzqingjiadan_yuangongbh(){
	  			return atzqingjiadan_yuangongbh;
	  		}
  		  		
  				  		
  						public void setAtzqingjiadan_bumenmc(Object atzqingjiadan_bumenmc){
				this.atzqingjiadan_bumenmc = atzqingjiadan_bumenmc;
			}
			
	  		public Object getAtzqingjiadan_bumenmc(){
	  			return atzqingjiadan_bumenmc;
	  		}
  		  		
  				  		
  						public void setAtzqingjiadan_qingjiakais(Object atzqingjiadan_qingjiakais){
				this.atzqingjiadan_qingjiakais = atzqingjiadan_qingjiakais;
			}
			
	  		public Object getAtzqingjiadan_qingjiakais(){
	  			return atzqingjiadan_qingjiakais;
	  		}
  		  		
  							public void setAtzqingjiadan_qingjiakais1(Object atzqingjiadan_qingjiakais1){
				this.atzqingjiadan_qingjiakais1 = atzqingjiadan_qingjiakais1;
			}
			
	  		public Object getAtzqingjiadan_qingjiakais1(){
	  			return atzqingjiadan_qingjiakais1;
	  		}
		  		
  						public void setAtzqingjiadan_qingjiajies(Object atzqingjiadan_qingjiajies){
				this.atzqingjiadan_qingjiajies = atzqingjiadan_qingjiajies;
			}
			
	  		public Object getAtzqingjiadan_qingjiajies(){
	  			return atzqingjiadan_qingjiajies;
	  		}
  		  		
  							public void setAtzqingjiadan_qingjiajies1(Object atzqingjiadan_qingjiajies1){
				this.atzqingjiadan_qingjiajies1 = atzqingjiadan_qingjiajies1;
			}
			
	  		public Object getAtzqingjiadan_qingjiajies1(){
	  			return atzqingjiadan_qingjiajies1;
	  		}
		  		
  						public void setAtzqingjiadan_danjuzt(Object atzqingjiadan_danjuzt){
				this.atzqingjiadan_danjuzt = atzqingjiadan_danjuzt;
			}
			
	  		public Object getAtzqingjiadan_danjuzt(){
	  			return atzqingjiadan_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzqingjiadan_id(Object atzqingjiadan_id){
				this.atzqingjiadan_id = atzqingjiadan_id;
			}
			
	  		public Object getAtzqingjiadan_id(){
	  			return atzqingjiadan_id;
	  		}
  		  		
  				  		
  	  	
  	public static Ff2ef839c00000003z init(DataContextHelper context) {
  		Ff2ef839c00000003z o = new Ff2ef839c00000003z();
									o.setAtzqingjiadan_yuangongbh(getValue(context,"atzyuangong.id"));
						
						  									o.setAtzqingjiadan_bumenmc(getValue(context,"atzbumen.id"));
						
						  									o.setAtzqingjiadan_qingjiakais(getValue(context,"atzqingjiadan.qingjiakais"));
						
										o.setAtzqingjiadan_qingjiakais1(getValue(context,"atzqingjiadan.qingjiakais1"));
			  									o.setAtzqingjiadan_qingjiajies(getValue(context,"atzqingjiadan.qingjiajies"));
						
										o.setAtzqingjiadan_qingjiajies1(getValue(context,"atzqingjiadan.qingjiajies1"));
			  									o.setAtzqingjiadan_danjuzt(getValue(context,"atzqingjiadan.danjuzt"));
						
						  									o.setAtzqingjiadan_id(getValue(context,"atzqingjiadan.id"));
						
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