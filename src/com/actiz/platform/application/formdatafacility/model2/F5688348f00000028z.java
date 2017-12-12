/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:11.366
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5688348f00000028z{

	
						private Object atzkehuxtxx_xitong;
			
				
										private Object atzkehuxtxx_bianhao;
			
				
										private Object atzkehuxtxx_xitongmc;
			
				
										private Object atzkehuxtxx_kehuid;
			
				
										private Object atzkehuxtxx_ruanjianbb;
			
				
										private Object atzkehuxtxx_dizhi;
			
				
										private Object atzkehuxtxx_lianxifs;
			
				
										private Object atzkehuxtxx_id;
			
				
					
						public void setAtzkehuxtxx_xitong(Object atzkehuxtxx_xitong){
				this.atzkehuxtxx_xitong = atzkehuxtxx_xitong;
			}
			
	  		public Object getAtzkehuxtxx_xitong(){
	  			return atzkehuxtxx_xitong;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_bianhao(Object atzkehuxtxx_bianhao){
				this.atzkehuxtxx_bianhao = atzkehuxtxx_bianhao;
			}
			
	  		public Object getAtzkehuxtxx_bianhao(){
	  			return atzkehuxtxx_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_xitongmc(Object atzkehuxtxx_xitongmc){
				this.atzkehuxtxx_xitongmc = atzkehuxtxx_xitongmc;
			}
			
	  		public Object getAtzkehuxtxx_xitongmc(){
	  			return atzkehuxtxx_xitongmc;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_kehuid(Object atzkehuxtxx_kehuid){
				this.atzkehuxtxx_kehuid = atzkehuxtxx_kehuid;
			}
			
	  		public Object getAtzkehuxtxx_kehuid(){
	  			return atzkehuxtxx_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_ruanjianbb(Object atzkehuxtxx_ruanjianbb){
				this.atzkehuxtxx_ruanjianbb = atzkehuxtxx_ruanjianbb;
			}
			
	  		public Object getAtzkehuxtxx_ruanjianbb(){
	  			return atzkehuxtxx_ruanjianbb;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_dizhi(Object atzkehuxtxx_dizhi){
				this.atzkehuxtxx_dizhi = atzkehuxtxx_dizhi;
			}
			
	  		public Object getAtzkehuxtxx_dizhi(){
	  			return atzkehuxtxx_dizhi;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_lianxifs(Object atzkehuxtxx_lianxifs){
				this.atzkehuxtxx_lianxifs = atzkehuxtxx_lianxifs;
			}
			
	  		public Object getAtzkehuxtxx_lianxifs(){
	  			return atzkehuxtxx_lianxifs;
	  		}
  		  		
  				  		
  						public void setAtzkehuxtxx_id(Object atzkehuxtxx_id){
				this.atzkehuxtxx_id = atzkehuxtxx_id;
			}
			
	  		public Object getAtzkehuxtxx_id(){
	  			return atzkehuxtxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5688348f00000028z init(DataContextHelper context) {
  		F5688348f00000028z o = new F5688348f00000028z();
									o.setAtzkehuxtxx_xitong(getValue(context,"atzkehugc.id"));
						
						  									o.setAtzkehuxtxx_bianhao(getValue(context,"atzkehuxtxx.bianhao"));
						
						  									o.setAtzkehuxtxx_xitongmc(getValue(context,"atzkehuxtxx.xitongmc"));
						
						  									o.setAtzkehuxtxx_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzkehuxtxx_ruanjianbb(getValue(context,"atzkehuxtxx.ruanjianbb"));
						
						  									o.setAtzkehuxtxx_dizhi(getValue(context,"atzkehuxtxx.dizhi"));
						
						  									o.setAtzkehuxtxx_lianxifs(getValue(context,"atzkehuxtxx.lianxifs"));
						
						  									o.setAtzkehuxtxx_id(getValue(context,"atzkehuxtxx.id"));
						
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