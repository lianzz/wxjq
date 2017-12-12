/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:07:05.431
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F055124fb0000000bz{

	
						private Object atzchanpinzl_bianhao;
			
				
										private Object atzchanpinzl_chanpin;
			
				
										private Object atzchanpinzl_ziliaolx;
			
				
										private Object atzchanpinzl_ziliaomc;
			
				
										private Object atzchanpinzl_ziliaobb;
			
				
										private Object atzchanpinzl_zlzt;
			
				
										private Object atzchanpinzl_id;
			
				
					
						public void setAtzchanpinzl_bianhao(Object atzchanpinzl_bianhao){
				this.atzchanpinzl_bianhao = atzchanpinzl_bianhao;
			}
			
	  		public Object getAtzchanpinzl_bianhao(){
	  			return atzchanpinzl_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_chanpin(Object atzchanpinzl_chanpin){
				this.atzchanpinzl_chanpin = atzchanpinzl_chanpin;
			}
			
	  		public Object getAtzchanpinzl_chanpin(){
	  			return atzchanpinzl_chanpin;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_ziliaolx(Object atzchanpinzl_ziliaolx){
				this.atzchanpinzl_ziliaolx = atzchanpinzl_ziliaolx;
			}
			
	  		public Object getAtzchanpinzl_ziliaolx(){
	  			return atzchanpinzl_ziliaolx;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_ziliaomc(Object atzchanpinzl_ziliaomc){
				this.atzchanpinzl_ziliaomc = atzchanpinzl_ziliaomc;
			}
			
	  		public Object getAtzchanpinzl_ziliaomc(){
	  			return atzchanpinzl_ziliaomc;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_ziliaobb(Object atzchanpinzl_ziliaobb){
				this.atzchanpinzl_ziliaobb = atzchanpinzl_ziliaobb;
			}
			
	  		public Object getAtzchanpinzl_ziliaobb(){
	  			return atzchanpinzl_ziliaobb;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_zlzt(Object atzchanpinzl_zlzt){
				this.atzchanpinzl_zlzt = atzchanpinzl_zlzt;
			}
			
	  		public Object getAtzchanpinzl_zlzt(){
	  			return atzchanpinzl_zlzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinzl_id(Object atzchanpinzl_id){
				this.atzchanpinzl_id = atzchanpinzl_id;
			}
			
	  		public Object getAtzchanpinzl_id(){
	  			return atzchanpinzl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F055124fb0000000bz init(DataContextHelper context) {
  		F055124fb0000000bz o = new F055124fb0000000bz();
									o.setAtzchanpinzl_bianhao(getValue(context,"atzchanpinzl.bianhao"));
						
						  									o.setAtzchanpinzl_chanpin(getValue(context,"atzchanpinn.id"));
						
						  									o.setAtzchanpinzl_ziliaolx(getValue(context,"atzchanpinzl.ziliaolx"));
						
						  									o.setAtzchanpinzl_ziliaomc(getValue(context,"atzchanpinzl.ziliaomc"));
						
						  									o.setAtzchanpinzl_ziliaobb(getValue(context,"atzchanpinzl.ziliaobb"));
						
						  									o.setAtzchanpinzl_zlzt(getValue(context,"atzchanpinzl.zlzt"));
						
						  									o.setAtzchanpinzl_id(getValue(context,"atzchanpinzl.id"));
						
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