/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:27.642
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9cdb542300000005z{

	
						private Object atzkaipiaomx_kaipiaorq;
			
				
							private Object atzkaipiaomx_kaipiaorq1;
								private Object atzshoukuanmx_zhifusj;
			
				
							private Object atzshoukuanmx_zhifusj1;
								private Object atzshoukuanmx_id;
			
				
										private Object atzkaipiaomx_id;
			
				
					
						public void setAtzkaipiaomx_kaipiaorq(Object atzkaipiaomx_kaipiaorq){
				this.atzkaipiaomx_kaipiaorq = atzkaipiaomx_kaipiaorq;
			}
			
	  		public Object getAtzkaipiaomx_kaipiaorq(){
	  			return atzkaipiaomx_kaipiaorq;
	  		}
  		  		
  							public void setAtzkaipiaomx_kaipiaorq1(Object atzkaipiaomx_kaipiaorq1){
				this.atzkaipiaomx_kaipiaorq1 = atzkaipiaomx_kaipiaorq1;
			}
			
	  		public Object getAtzkaipiaomx_kaipiaorq1(){
	  			return atzkaipiaomx_kaipiaorq1;
	  		}
		  		
  						public void setAtzshoukuanmx_zhifusj(Object atzshoukuanmx_zhifusj){
				this.atzshoukuanmx_zhifusj = atzshoukuanmx_zhifusj;
			}
			
	  		public Object getAtzshoukuanmx_zhifusj(){
	  			return atzshoukuanmx_zhifusj;
	  		}
  		  		
  							public void setAtzshoukuanmx_zhifusj1(Object atzshoukuanmx_zhifusj1){
				this.atzshoukuanmx_zhifusj1 = atzshoukuanmx_zhifusj1;
			}
			
	  		public Object getAtzshoukuanmx_zhifusj1(){
	  			return atzshoukuanmx_zhifusj1;
	  		}
		  		
  						public void setAtzshoukuanmx_id(Object atzshoukuanmx_id){
				this.atzshoukuanmx_id = atzshoukuanmx_id;
			}
			
	  		public Object getAtzshoukuanmx_id(){
	  			return atzshoukuanmx_id;
	  		}
  		  		
  				  		
  						public void setAtzkaipiaomx_id(Object atzkaipiaomx_id){
				this.atzkaipiaomx_id = atzkaipiaomx_id;
			}
			
	  		public Object getAtzkaipiaomx_id(){
	  			return atzkaipiaomx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9cdb542300000005z init(DataContextHelper context) {
  		F9cdb542300000005z o = new F9cdb542300000005z();
									o.setAtzkaipiaomx_kaipiaorq(getValue(context,"atzkaipiaomx.kaipiaorq"));
						
										o.setAtzkaipiaomx_kaipiaorq1(getValue(context,"atzkaipiaomx.kaipiaorq1"));
			  									o.setAtzshoukuanmx_zhifusj(getValue(context,"atzshoukuanmx.zhifusj"));
						
										o.setAtzshoukuanmx_zhifusj1(getValue(context,"atzshoukuanmx.zhifusj1"));
			  									o.setAtzshoukuanmx_id(getValue(context,"atzshoukuanmx.id"));
						
						  									o.setAtzkaipiaomx_id(getValue(context,"atzkaipiaomx.id"));
						
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