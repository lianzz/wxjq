/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:13:13.939
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb36707fc00000004z{

	
						private Object atzscrw_bianhao;
			
				
										private Object atzscrw_linshibh;
			
				
										private Object atzscrw_scrwdlx;
			
				
										private Object atzscrw_lururq;
			
				
							private Object atzscrw_lururq1;
								private Object atzscrw_id;
			
				
					
						public void setAtzscrw_bianhao(Object atzscrw_bianhao){
				this.atzscrw_bianhao = atzscrw_bianhao;
			}
			
	  		public Object getAtzscrw_bianhao(){
	  			return atzscrw_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzscrw_linshibh(Object atzscrw_linshibh){
				this.atzscrw_linshibh = atzscrw_linshibh;
			}
			
	  		public Object getAtzscrw_linshibh(){
	  			return atzscrw_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzscrw_scrwdlx(Object atzscrw_scrwdlx){
				this.atzscrw_scrwdlx = atzscrw_scrwdlx;
			}
			
	  		public Object getAtzscrw_scrwdlx(){
	  			return atzscrw_scrwdlx;
	  		}
  		  		
  				  		
  						public void setAtzscrw_lururq(Object atzscrw_lururq){
				this.atzscrw_lururq = atzscrw_lururq;
			}
			
	  		public Object getAtzscrw_lururq(){
	  			return atzscrw_lururq;
	  		}
  		  		
  							public void setAtzscrw_lururq1(Object atzscrw_lururq1){
				this.atzscrw_lururq1 = atzscrw_lururq1;
			}
			
	  		public Object getAtzscrw_lururq1(){
	  			return atzscrw_lururq1;
	  		}
		  		
  						public void setAtzscrw_id(Object atzscrw_id){
				this.atzscrw_id = atzscrw_id;
			}
			
	  		public Object getAtzscrw_id(){
	  			return atzscrw_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fb36707fc00000004z init(DataContextHelper context) {
  		Fb36707fc00000004z o = new Fb36707fc00000004z();
									o.setAtzscrw_bianhao(getValue(context,"atzscrw.bianhao"));
						
						  									o.setAtzscrw_linshibh(getValue(context,"atzscrw.linshibh"));
						
						  									o.setAtzscrw_scrwdlx(getValue(context,"atzscrw.scrwdlx"));
						
						  									o.setAtzscrw_lururq(getValue(context,"atzscrw.lururq"));
						
										o.setAtzscrw_lururq1(getValue(context,"atzscrw.lururq1"));
			  									o.setAtzscrw_id(getValue(context,"atzscrw.id"));
						
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