/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:12:56.426
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F4e02e36c0000000cz{

	
						private Object atzfupeijian_biaohao;
			
				
										private Object atzfupeijian_lurur;
			
				
										private Object atzfupeijian_lururq;
			
				
							private Object atzfupeijian_lururq1;
								private Object atzfupeijian_zuihouxgr;
			
				
										private Object atzfupeijian_zuihouxgrq;
			
				
							private Object atzfupeijian_zuihouxgrq1;
								private Object atzfupeijian_id;
			
				
					
						public void setAtzfupeijian_biaohao(Object atzfupeijian_biaohao){
				this.atzfupeijian_biaohao = atzfupeijian_biaohao;
			}
			
	  		public Object getAtzfupeijian_biaohao(){
	  			return atzfupeijian_biaohao;
	  		}
  		  		
  				  		
  						public void setAtzfupeijian_lurur(Object atzfupeijian_lurur){
				this.atzfupeijian_lurur = atzfupeijian_lurur;
			}
			
	  		public Object getAtzfupeijian_lurur(){
	  			return atzfupeijian_lurur;
	  		}
  		  		
  				  		
  						public void setAtzfupeijian_lururq(Object atzfupeijian_lururq){
				this.atzfupeijian_lururq = atzfupeijian_lururq;
			}
			
	  		public Object getAtzfupeijian_lururq(){
	  			return atzfupeijian_lururq;
	  		}
  		  		
  							public void setAtzfupeijian_lururq1(Object atzfupeijian_lururq1){
				this.atzfupeijian_lururq1 = atzfupeijian_lururq1;
			}
			
	  		public Object getAtzfupeijian_lururq1(){
	  			return atzfupeijian_lururq1;
	  		}
		  		
  						public void setAtzfupeijian_zuihouxgr(Object atzfupeijian_zuihouxgr){
				this.atzfupeijian_zuihouxgr = atzfupeijian_zuihouxgr;
			}
			
	  		public Object getAtzfupeijian_zuihouxgr(){
	  			return atzfupeijian_zuihouxgr;
	  		}
  		  		
  				  		
  						public void setAtzfupeijian_zuihouxgrq(Object atzfupeijian_zuihouxgrq){
				this.atzfupeijian_zuihouxgrq = atzfupeijian_zuihouxgrq;
			}
			
	  		public Object getAtzfupeijian_zuihouxgrq(){
	  			return atzfupeijian_zuihouxgrq;
	  		}
  		  		
  							public void setAtzfupeijian_zuihouxgrq1(Object atzfupeijian_zuihouxgrq1){
				this.atzfupeijian_zuihouxgrq1 = atzfupeijian_zuihouxgrq1;
			}
			
	  		public Object getAtzfupeijian_zuihouxgrq1(){
	  			return atzfupeijian_zuihouxgrq1;
	  		}
		  		
  						public void setAtzfupeijian_id(Object atzfupeijian_id){
				this.atzfupeijian_id = atzfupeijian_id;
			}
			
	  		public Object getAtzfupeijian_id(){
	  			return atzfupeijian_id;
	  		}
  		  		
  				  		
  	  	
  	public static F4e02e36c0000000cz init(DataContextHelper context) {
  		F4e02e36c0000000cz o = new F4e02e36c0000000cz();
									o.setAtzfupeijian_biaohao(getValue(context,"atzfupeijian.biaohao"));
						
						  									o.setAtzfupeijian_lurur(getValue(context,"atzfupeijian.lurur"));
						
						  									o.setAtzfupeijian_lururq(getValue(context,"atzfupeijian.lururq"));
						
										o.setAtzfupeijian_lururq1(getValue(context,"atzfupeijian.lururq1"));
			  									o.setAtzfupeijian_zuihouxgr(getValue(context,"atzfupeijian.zuihouxgr"));
						
						  									o.setAtzfupeijian_zuihouxgrq(getValue(context,"atzfupeijian.zuihouxgrq"));
						
										o.setAtzfupeijian_zuihouxgrq1(getValue(context,"atzfupeijian.zuihouxgrq1"));
			  									o.setAtzfupeijian_id(getValue(context,"atzfupeijian.id"));
						
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