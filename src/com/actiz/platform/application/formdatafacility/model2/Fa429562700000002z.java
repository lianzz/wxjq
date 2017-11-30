/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:59.459
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa429562700000002z{

	
						private Object atzshoukuanmx_hetongid;
			
				
										private Object atzkaipiaosqd_kaipiaorq;
			
				
							private Object atzkaipiaosqd_kaipiaorq1;
								private Object atzshoukuanmx_zhifusj;
			
				
							private Object atzshoukuanmx_zhifusj1;
								private Object atzkaipiaosqd_id;
			
				
										private Object atzshoukuanmx_id;
			
				
					
						public void setAtzshoukuanmx_hetongid(Object atzshoukuanmx_hetongid){
				this.atzshoukuanmx_hetongid = atzshoukuanmx_hetongid;
			}
			
	  		public Object getAtzshoukuanmx_hetongid(){
	  			return atzshoukuanmx_hetongid;
	  		}
  		  		
  				  		
  						public void setAtzkaipiaosqd_kaipiaorq(Object atzkaipiaosqd_kaipiaorq){
				this.atzkaipiaosqd_kaipiaorq = atzkaipiaosqd_kaipiaorq;
			}
			
	  		public Object getAtzkaipiaosqd_kaipiaorq(){
	  			return atzkaipiaosqd_kaipiaorq;
	  		}
  		  		
  							public void setAtzkaipiaosqd_kaipiaorq1(Object atzkaipiaosqd_kaipiaorq1){
				this.atzkaipiaosqd_kaipiaorq1 = atzkaipiaosqd_kaipiaorq1;
			}
			
	  		public Object getAtzkaipiaosqd_kaipiaorq1(){
	  			return atzkaipiaosqd_kaipiaorq1;
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
		  		
  						public void setAtzkaipiaosqd_id(Object atzkaipiaosqd_id){
				this.atzkaipiaosqd_id = atzkaipiaosqd_id;
			}
			
	  		public Object getAtzkaipiaosqd_id(){
	  			return atzkaipiaosqd_id;
	  		}
  		  		
  				  		
  						public void setAtzshoukuanmx_id(Object atzshoukuanmx_id){
				this.atzshoukuanmx_id = atzshoukuanmx_id;
			}
			
	  		public Object getAtzshoukuanmx_id(){
	  			return atzshoukuanmx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa429562700000002z init(DataContextHelper context) {
  		Fa429562700000002z o = new Fa429562700000002z();
									o.setAtzshoukuanmx_hetongid(getValue(context,"atzhetong.id"));
						
						  									o.setAtzkaipiaosqd_kaipiaorq(getValue(context,"atzkaipiaosqd.kaipiaorq"));
						
										o.setAtzkaipiaosqd_kaipiaorq1(getValue(context,"atzkaipiaosqd.kaipiaorq1"));
			  									o.setAtzshoukuanmx_zhifusj(getValue(context,"atzshoukuanmx.zhifusj"));
						
										o.setAtzshoukuanmx_zhifusj1(getValue(context,"atzshoukuanmx.zhifusj1"));
			  									o.setAtzkaipiaosqd_id(getValue(context,"atzkaipiaosqd.id"));
						
						  									o.setAtzshoukuanmx_id(getValue(context,"atzshoukuanmx.id"));
						
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