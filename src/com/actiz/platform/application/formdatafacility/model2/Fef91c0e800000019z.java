/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:00:36.712
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fef91c0e800000019z{

	
						private Object atzchanpindl_daleimc;
			
				
										private Object atzchanpindl_chanpinjl;
			
				
										private Object atzchanpindl_lurur;
			
				
										private Object atzchanpindl_lururq;
			
				
							private Object atzchanpindl_lururq1;
								private Object atzchanpindl_zuihouxgr;
			
				
										private Object atzchanpindl_zuihouxgrq;
			
				
							private Object atzchanpindl_zuihouxgrq1;
								private Object atzchanpindl_id;
			
				
					
						public void setAtzchanpindl_daleimc(Object atzchanpindl_daleimc){
				this.atzchanpindl_daleimc = atzchanpindl_daleimc;
			}
			
	  		public Object getAtzchanpindl_daleimc(){
	  			return atzchanpindl_daleimc;
	  		}
  		  		
  				  		
  						public void setAtzchanpindl_chanpinjl(Object atzchanpindl_chanpinjl){
				this.atzchanpindl_chanpinjl = atzchanpindl_chanpinjl;
			}
			
	  		public Object getAtzchanpindl_chanpinjl(){
	  			return atzchanpindl_chanpinjl;
	  		}
  		  		
  				  		
  						public void setAtzchanpindl_lurur(Object atzchanpindl_lurur){
				this.atzchanpindl_lurur = atzchanpindl_lurur;
			}
			
	  		public Object getAtzchanpindl_lurur(){
	  			return atzchanpindl_lurur;
	  		}
  		  		
  				  		
  						public void setAtzchanpindl_lururq(Object atzchanpindl_lururq){
				this.atzchanpindl_lururq = atzchanpindl_lururq;
			}
			
	  		public Object getAtzchanpindl_lururq(){
	  			return atzchanpindl_lururq;
	  		}
  		  		
  							public void setAtzchanpindl_lururq1(Object atzchanpindl_lururq1){
				this.atzchanpindl_lururq1 = atzchanpindl_lururq1;
			}
			
	  		public Object getAtzchanpindl_lururq1(){
	  			return atzchanpindl_lururq1;
	  		}
		  		
  						public void setAtzchanpindl_zuihouxgr(Object atzchanpindl_zuihouxgr){
				this.atzchanpindl_zuihouxgr = atzchanpindl_zuihouxgr;
			}
			
	  		public Object getAtzchanpindl_zuihouxgr(){
	  			return atzchanpindl_zuihouxgr;
	  		}
  		  		
  				  		
  						public void setAtzchanpindl_zuihouxgrq(Object atzchanpindl_zuihouxgrq){
				this.atzchanpindl_zuihouxgrq = atzchanpindl_zuihouxgrq;
			}
			
	  		public Object getAtzchanpindl_zuihouxgrq(){
	  			return atzchanpindl_zuihouxgrq;
	  		}
  		  		
  							public void setAtzchanpindl_zuihouxgrq1(Object atzchanpindl_zuihouxgrq1){
				this.atzchanpindl_zuihouxgrq1 = atzchanpindl_zuihouxgrq1;
			}
			
	  		public Object getAtzchanpindl_zuihouxgrq1(){
	  			return atzchanpindl_zuihouxgrq1;
	  		}
		  		
  						public void setAtzchanpindl_id(Object atzchanpindl_id){
				this.atzchanpindl_id = atzchanpindl_id;
			}
			
	  		public Object getAtzchanpindl_id(){
	  			return atzchanpindl_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fef91c0e800000019z init(DataContextHelper context) {
  		Fef91c0e800000019z o = new Fef91c0e800000019z();
									o.setAtzchanpindl_daleimc(getValue(context,"atzchanpindl.daleimc"));
						
						  									o.setAtzchanpindl_chanpinjl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzchanpindl_lurur(getValue(context,"atzchanpindl.lurur"));
						
						  									o.setAtzchanpindl_lururq(getValue(context,"atzchanpindl.lururq"));
						
										o.setAtzchanpindl_lururq1(getValue(context,"atzchanpindl.lururq1"));
			  									o.setAtzchanpindl_zuihouxgr(getValue(context,"atzchanpindl.zuihouxgr"));
						
						  									o.setAtzchanpindl_zuihouxgrq(getValue(context,"atzchanpindl.zuihouxgrq"));
						
										o.setAtzchanpindl_zuihouxgrq1(getValue(context,"atzchanpindl.zuihouxgrq1"));
			  									o.setAtzchanpindl_id(getValue(context,"atzchanpindl.id"));
						
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