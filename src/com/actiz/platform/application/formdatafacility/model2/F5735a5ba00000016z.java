/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:49:04.979
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5735a5ba00000016z{

	
						private Object atzshengchancj_changjiamc;
			
				
										private Object atzshengchancj_changjiaxh;
			
				
										private Object atzshengchancj_youxianji;
			
				
							private Object atzshengchancj_youxianji1;
								private Object atzshengchancj_caigouzq;
			
				
							private Object atzshengchancj_caigouzq1;
								private Object atzshengchancj_id;
			
				
					
						public void setAtzshengchancj_changjiamc(Object atzshengchancj_changjiamc){
				this.atzshengchancj_changjiamc = atzshengchancj_changjiamc;
			}
			
	  		public Object getAtzshengchancj_changjiamc(){
	  			return atzshengchancj_changjiamc;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_changjiaxh(Object atzshengchancj_changjiaxh){
				this.atzshengchancj_changjiaxh = atzshengchancj_changjiaxh;
			}
			
	  		public Object getAtzshengchancj_changjiaxh(){
	  			return atzshengchancj_changjiaxh;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_youxianji(Object atzshengchancj_youxianji){
				this.atzshengchancj_youxianji = atzshengchancj_youxianji;
			}
			
	  		public Object getAtzshengchancj_youxianji(){
	  			return atzshengchancj_youxianji;
	  		}
  		  		
  							public void setAtzshengchancj_youxianji1(Object atzshengchancj_youxianji1){
				this.atzshengchancj_youxianji1 = atzshengchancj_youxianji1;
			}
			
	  		public Object getAtzshengchancj_youxianji1(){
	  			return atzshengchancj_youxianji1;
	  		}
		  		
  						public void setAtzshengchancj_caigouzq(Object atzshengchancj_caigouzq){
				this.atzshengchancj_caigouzq = atzshengchancj_caigouzq;
			}
			
	  		public Object getAtzshengchancj_caigouzq(){
	  			return atzshengchancj_caigouzq;
	  		}
  		  		
  							public void setAtzshengchancj_caigouzq1(Object atzshengchancj_caigouzq1){
				this.atzshengchancj_caigouzq1 = atzshengchancj_caigouzq1;
			}
			
	  		public Object getAtzshengchancj_caigouzq1(){
	  			return atzshengchancj_caigouzq1;
	  		}
		  		
  						public void setAtzshengchancj_id(Object atzshengchancj_id){
				this.atzshengchancj_id = atzshengchancj_id;
			}
			
	  		public Object getAtzshengchancj_id(){
	  			return atzshengchancj_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5735a5ba00000016z init(DataContextHelper context) {
  		F5735a5ba00000016z o = new F5735a5ba00000016z();
									o.setAtzshengchancj_changjiamc(getValue(context,"atzshengchancj.changjiamc"));
						
						  									o.setAtzshengchancj_changjiaxh(getValue(context,"atzshengchancj.changjiaxh"));
						
						  									o.setAtzshengchancj_youxianji(getValue(context,"atzshengchancj.youxianji"));
						
										o.setAtzshengchancj_youxianji1(getValue(context,"atzshengchancj.youxianji1"));
			  									o.setAtzshengchancj_caigouzq(getValue(context,"atzshengchancj.caigouzq"));
						
										o.setAtzshengchancj_caigouzq1(getValue(context,"atzshengchancj.caigouzq1"));
			  									o.setAtzshengchancj_id(getValue(context,"atzshengchancj.id"));
						
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