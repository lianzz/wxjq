/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:21.387
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F09547c2500000010z{

	
						private Object atzchanpinpz_peizhimc;
			
				
										private Object atzchanpinpz_chanpin;
			
				
										private Object atzchanpinpz_peizhism;
			
				
										private Object atzchanpinpz_danjuzt;
			
				
										private Object atzchanpinpz_lururq;
			
				
							private Object atzchanpinpz_lururq1;
								private Object atzchanpinpz_id;
			
				
					
						public void setAtzchanpinpz_peizhimc(Object atzchanpinpz_peizhimc){
				this.atzchanpinpz_peizhimc = atzchanpinpz_peizhimc;
			}
			
	  		public Object getAtzchanpinpz_peizhimc(){
	  			return atzchanpinpz_peizhimc;
	  		}
  		  		
  				  		
  						public void setAtzchanpinpz_chanpin(Object atzchanpinpz_chanpin){
				this.atzchanpinpz_chanpin = atzchanpinpz_chanpin;
			}
			
	  		public Object getAtzchanpinpz_chanpin(){
	  			return atzchanpinpz_chanpin;
	  		}
  		  		
  				  		
  						public void setAtzchanpinpz_peizhism(Object atzchanpinpz_peizhism){
				this.atzchanpinpz_peizhism = atzchanpinpz_peizhism;
			}
			
	  		public Object getAtzchanpinpz_peizhism(){
	  			return atzchanpinpz_peizhism;
	  		}
  		  		
  				  		
  						public void setAtzchanpinpz_danjuzt(Object atzchanpinpz_danjuzt){
				this.atzchanpinpz_danjuzt = atzchanpinpz_danjuzt;
			}
			
	  		public Object getAtzchanpinpz_danjuzt(){
	  			return atzchanpinpz_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzchanpinpz_lururq(Object atzchanpinpz_lururq){
				this.atzchanpinpz_lururq = atzchanpinpz_lururq;
			}
			
	  		public Object getAtzchanpinpz_lururq(){
	  			return atzchanpinpz_lururq;
	  		}
  		  		
  							public void setAtzchanpinpz_lururq1(Object atzchanpinpz_lururq1){
				this.atzchanpinpz_lururq1 = atzchanpinpz_lururq1;
			}
			
	  		public Object getAtzchanpinpz_lururq1(){
	  			return atzchanpinpz_lururq1;
	  		}
		  		
  						public void setAtzchanpinpz_id(Object atzchanpinpz_id){
				this.atzchanpinpz_id = atzchanpinpz_id;
			}
			
	  		public Object getAtzchanpinpz_id(){
	  			return atzchanpinpz_id;
	  		}
  		  		
  				  		
  	  	
  	public static F09547c2500000010z init(DataContextHelper context) {
  		F09547c2500000010z o = new F09547c2500000010z();
									o.setAtzchanpinpz_peizhimc(getValue(context,"atzchanpinpz.peizhimc"));
						
						  									o.setAtzchanpinpz_chanpin(getValue(context,"atzchanpinn.id"));
						
						  									o.setAtzchanpinpz_peizhism(getValue(context,"atzchanpinpz.peizhism"));
						
						  									o.setAtzchanpinpz_danjuzt(getValue(context,"atzchanpinpz.danjuzt"));
						
						  									o.setAtzchanpinpz_lururq(getValue(context,"atzchanpinpz.lururq"));
						
										o.setAtzchanpinpz_lururq1(getValue(context,"atzchanpinpz.lururq1"));
			  									o.setAtzchanpinpz_id(getValue(context,"atzchanpinpz.id"));
						
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