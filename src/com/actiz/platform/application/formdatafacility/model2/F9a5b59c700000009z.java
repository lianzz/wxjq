/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:07:14.067
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9a5b59c700000009z{

	
						private Object atzlaohuajl_wuliaoid;
			
				
										private Object atzlaohuajl_sn;
			
				
										private Object atzlaohuajl_laohuaren;
			
				
										private Object atzlaohuajl_laohuarq;
			
				
							private Object atzlaohuajl_laohuarq1;
								private Object atzlaohuajl_laohuajg;
			
				
										private Object atzlaohuajl_id;
			
				
					
						public void setAtzlaohuajl_wuliaoid(Object atzlaohuajl_wuliaoid){
				this.atzlaohuajl_wuliaoid = atzlaohuajl_wuliaoid;
			}
			
	  		public Object getAtzlaohuajl_wuliaoid(){
	  			return atzlaohuajl_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzlaohuajl_sn(Object atzlaohuajl_sn){
				this.atzlaohuajl_sn = atzlaohuajl_sn;
			}
			
	  		public Object getAtzlaohuajl_sn(){
	  			return atzlaohuajl_sn;
	  		}
  		  		
  				  		
  						public void setAtzlaohuajl_laohuaren(Object atzlaohuajl_laohuaren){
				this.atzlaohuajl_laohuaren = atzlaohuajl_laohuaren;
			}
			
	  		public Object getAtzlaohuajl_laohuaren(){
	  			return atzlaohuajl_laohuaren;
	  		}
  		  		
  				  		
  						public void setAtzlaohuajl_laohuarq(Object atzlaohuajl_laohuarq){
				this.atzlaohuajl_laohuarq = atzlaohuajl_laohuarq;
			}
			
	  		public Object getAtzlaohuajl_laohuarq(){
	  			return atzlaohuajl_laohuarq;
	  		}
  		  		
  							public void setAtzlaohuajl_laohuarq1(Object atzlaohuajl_laohuarq1){
				this.atzlaohuajl_laohuarq1 = atzlaohuajl_laohuarq1;
			}
			
	  		public Object getAtzlaohuajl_laohuarq1(){
	  			return atzlaohuajl_laohuarq1;
	  		}
		  		
  						public void setAtzlaohuajl_laohuajg(Object atzlaohuajl_laohuajg){
				this.atzlaohuajl_laohuajg = atzlaohuajl_laohuajg;
			}
			
	  		public Object getAtzlaohuajl_laohuajg(){
	  			return atzlaohuajl_laohuajg;
	  		}
  		  		
  				  		
  						public void setAtzlaohuajl_id(Object atzlaohuajl_id){
				this.atzlaohuajl_id = atzlaohuajl_id;
			}
			
	  		public Object getAtzlaohuajl_id(){
	  			return atzlaohuajl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9a5b59c700000009z init(DataContextHelper context) {
  		F9a5b59c700000009z o = new F9a5b59c700000009z();
									o.setAtzlaohuajl_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzlaohuajl_sn(getValue(context,"atzlaohuajl.sn"));
						
						  									o.setAtzlaohuajl_laohuaren(getValue(context,"atzlaohuajl.laohuaren"));
						
						  									o.setAtzlaohuajl_laohuarq(getValue(context,"atzlaohuajl.laohuarq"));
						
										o.setAtzlaohuajl_laohuarq1(getValue(context,"atzlaohuajl.laohuarq1"));
			  									o.setAtzlaohuajl_laohuajg(getValue(context,"atzlaohuajl.laohuajg"));
						
						  									o.setAtzlaohuajl_id(getValue(context,"atzlaohuajl.id"));
						
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