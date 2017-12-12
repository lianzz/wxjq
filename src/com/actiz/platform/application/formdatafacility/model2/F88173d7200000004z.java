/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:01:50.265
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F88173d7200000004z{

	
						private Object atzchanpinn_chanpindl;
			
				
										private Object atzchanpinn_chanpinmc;
			
				
										private Object atzchanpinn_chanpinxh;
			
				
										private Object atzchanpinn_chanpinms;
			
				
										private Object atzchanpinn_chanpinzt;
			
				
										private Object atzchanpinn_danjuzt;
			
				
										private Object atzchanpinn_id;
			
				
					
						public void setAtzchanpinn_chanpindl(Object atzchanpinn_chanpindl){
				this.atzchanpinn_chanpindl = atzchanpinn_chanpindl;
			}
			
	  		public Object getAtzchanpinn_chanpindl(){
	  			return atzchanpinn_chanpindl;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_chanpinmc(Object atzchanpinn_chanpinmc){
				this.atzchanpinn_chanpinmc = atzchanpinn_chanpinmc;
			}
			
	  		public Object getAtzchanpinn_chanpinmc(){
	  			return atzchanpinn_chanpinmc;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_chanpinxh(Object atzchanpinn_chanpinxh){
				this.atzchanpinn_chanpinxh = atzchanpinn_chanpinxh;
			}
			
	  		public Object getAtzchanpinn_chanpinxh(){
	  			return atzchanpinn_chanpinxh;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_chanpinms(Object atzchanpinn_chanpinms){
				this.atzchanpinn_chanpinms = atzchanpinn_chanpinms;
			}
			
	  		public Object getAtzchanpinn_chanpinms(){
	  			return atzchanpinn_chanpinms;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_chanpinzt(Object atzchanpinn_chanpinzt){
				this.atzchanpinn_chanpinzt = atzchanpinn_chanpinzt;
			}
			
	  		public Object getAtzchanpinn_chanpinzt(){
	  			return atzchanpinn_chanpinzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_danjuzt(Object atzchanpinn_danjuzt){
				this.atzchanpinn_danjuzt = atzchanpinn_danjuzt;
			}
			
	  		public Object getAtzchanpinn_danjuzt(){
	  			return atzchanpinn_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_id(Object atzchanpinn_id){
				this.atzchanpinn_id = atzchanpinn_id;
			}
			
	  		public Object getAtzchanpinn_id(){
	  			return atzchanpinn_id;
	  		}
  		  		
  				  		
  	  	
  	public static F88173d7200000004z init(DataContextHelper context) {
  		F88173d7200000004z o = new F88173d7200000004z();
									o.setAtzchanpinn_chanpindl(getValue(context,"atzchanpindl.id"));
						
						  									o.setAtzchanpinn_chanpinmc(getValue(context,"atzchanpinn.chanpinmc"));
						
						  									o.setAtzchanpinn_chanpinxh(getValue(context,"atzchanpinn.chanpinxh"));
						
						  									o.setAtzchanpinn_chanpinms(getValue(context,"atzchanpinn.chanpinms"));
						
						  									o.setAtzchanpinn_chanpinzt(getValue(context,"atzchanpinn.chanpinzt"));
						
						  									o.setAtzchanpinn_danjuzt(getValue(context,"atzchanpinn.danjuzt"));
						
						  									o.setAtzchanpinn_id(getValue(context,"atzchanpinn.id"));
						
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