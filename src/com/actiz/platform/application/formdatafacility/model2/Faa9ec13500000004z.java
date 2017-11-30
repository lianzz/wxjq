/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2016-01-20 23:38:31.497
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Faa9ec13500000004z{

	
						private Object atzchanpinn2_chanpinl;
			
				
										private Object atzchanpinn2_chanpinmc;
			
				
										private Object atzchanpinn2_chanpinxh;
			
				
										private Object atzchanpinn2_chanpinms;
			
				
										private Object atzchanpinn2_chanpinzt;
			
				
										private Object atzchanpinn2_danjuzt;
			
				
										private Object atzchanpinn2_id;
			
				
					
						public void setAtzchanpinn2_chanpinl(Object atzchanpinn2_chanpinl){
				this.atzchanpinn2_chanpinl = atzchanpinn2_chanpinl;
			}
			
	  		public Object getAtzchanpinn2_chanpinl(){
	  			return atzchanpinn2_chanpinl;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_chanpinmc(Object atzchanpinn2_chanpinmc){
				this.atzchanpinn2_chanpinmc = atzchanpinn2_chanpinmc;
			}
			
	  		public Object getAtzchanpinn2_chanpinmc(){
	  			return atzchanpinn2_chanpinmc;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_chanpinxh(Object atzchanpinn2_chanpinxh){
				this.atzchanpinn2_chanpinxh = atzchanpinn2_chanpinxh;
			}
			
	  		public Object getAtzchanpinn2_chanpinxh(){
	  			return atzchanpinn2_chanpinxh;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_chanpinms(Object atzchanpinn2_chanpinms){
				this.atzchanpinn2_chanpinms = atzchanpinn2_chanpinms;
			}
			
	  		public Object getAtzchanpinn2_chanpinms(){
	  			return atzchanpinn2_chanpinms;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_chanpinzt(Object atzchanpinn2_chanpinzt){
				this.atzchanpinn2_chanpinzt = atzchanpinn2_chanpinzt;
			}
			
	  		public Object getAtzchanpinn2_chanpinzt(){
	  			return atzchanpinn2_chanpinzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_danjuzt(Object atzchanpinn2_danjuzt){
				this.atzchanpinn2_danjuzt = atzchanpinn2_danjuzt;
			}
			
	  		public Object getAtzchanpinn2_danjuzt(){
	  			return atzchanpinn2_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn2_id(Object atzchanpinn2_id){
				this.atzchanpinn2_id = atzchanpinn2_id;
			}
			
	  		public Object getAtzchanpinn2_id(){
	  			return atzchanpinn2_id;
	  		}
  		  		
  				  		
  	  	
  	public static Faa9ec13500000004z init(DataContextHelper context) {
  		Faa9ec13500000004z o = new Faa9ec13500000004z();
									o.setAtzchanpinn2_chanpinl(getValue(context,"atzchanpindl.id"));
						
						  									o.setAtzchanpinn2_chanpinmc(getValue(context,"atzchanpinn2.chanpinmc"));
						
						  									o.setAtzchanpinn2_chanpinxh(getValue(context,"atzchanpinn2.chanpinxh"));
						
						  									o.setAtzchanpinn2_chanpinms(getValue(context,"atzchanpinn2.chanpinms"));
						
						  									o.setAtzchanpinn2_chanpinzt(getValue(context,"atzchanpinn2.chanpinzt"));
						
						  									o.setAtzchanpinn2_danjuzt(getValue(context,"atzchanpinn2.danjuzt"));
						
						  									o.setAtzchanpinn2_id(getValue(context,"atzchanpinn2.id"));
						
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