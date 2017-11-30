/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:43.262
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F06708b8200000002z{

	
						private Object atzcaigoufksq_bianhao;
			
				
										private Object atzcaigoufksq_linshibh;
			
				
										private Object atzcaigoufksq_zhidanr;
			
				
										private Object atzcaigoufksq_zhidanrq;
			
				
							private Object atzcaigoufksq_zhidanrq1;
								private Object atzcaigoufksq_zhixingzt;
			
				
										private Object atzcaigoufksq_wanchengfksj;
			
				
							private Object atzcaigoufksq_wanchengfksj1;
								private Object atzcaigoufksq_id;
			
				
					
						public void setAtzcaigoufksq_bianhao(Object atzcaigoufksq_bianhao){
				this.atzcaigoufksq_bianhao = atzcaigoufksq_bianhao;
			}
			
	  		public Object getAtzcaigoufksq_bianhao(){
	  			return atzcaigoufksq_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoufksq_linshibh(Object atzcaigoufksq_linshibh){
				this.atzcaigoufksq_linshibh = atzcaigoufksq_linshibh;
			}
			
	  		public Object getAtzcaigoufksq_linshibh(){
	  			return atzcaigoufksq_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzcaigoufksq_zhidanr(Object atzcaigoufksq_zhidanr){
				this.atzcaigoufksq_zhidanr = atzcaigoufksq_zhidanr;
			}
			
	  		public Object getAtzcaigoufksq_zhidanr(){
	  			return atzcaigoufksq_zhidanr;
	  		}
  		  		
  				  		
  						public void setAtzcaigoufksq_zhidanrq(Object atzcaigoufksq_zhidanrq){
				this.atzcaigoufksq_zhidanrq = atzcaigoufksq_zhidanrq;
			}
			
	  		public Object getAtzcaigoufksq_zhidanrq(){
	  			return atzcaigoufksq_zhidanrq;
	  		}
  		  		
  							public void setAtzcaigoufksq_zhidanrq1(Object atzcaigoufksq_zhidanrq1){
				this.atzcaigoufksq_zhidanrq1 = atzcaigoufksq_zhidanrq1;
			}
			
	  		public Object getAtzcaigoufksq_zhidanrq1(){
	  			return atzcaigoufksq_zhidanrq1;
	  		}
		  		
  						public void setAtzcaigoufksq_zhixingzt(Object atzcaigoufksq_zhixingzt){
				this.atzcaigoufksq_zhixingzt = atzcaigoufksq_zhixingzt;
			}
			
	  		public Object getAtzcaigoufksq_zhixingzt(){
	  			return atzcaigoufksq_zhixingzt;
	  		}
  		  		
  				  		
  						public void setAtzcaigoufksq_wanchengfksj(Object atzcaigoufksq_wanchengfksj){
				this.atzcaigoufksq_wanchengfksj = atzcaigoufksq_wanchengfksj;
			}
			
	  		public Object getAtzcaigoufksq_wanchengfksj(){
	  			return atzcaigoufksq_wanchengfksj;
	  		}
  		  		
  							public void setAtzcaigoufksq_wanchengfksj1(Object atzcaigoufksq_wanchengfksj1){
				this.atzcaigoufksq_wanchengfksj1 = atzcaigoufksq_wanchengfksj1;
			}
			
	  		public Object getAtzcaigoufksq_wanchengfksj1(){
	  			return atzcaigoufksq_wanchengfksj1;
	  		}
		  		
  						public void setAtzcaigoufksq_id(Object atzcaigoufksq_id){
				this.atzcaigoufksq_id = atzcaigoufksq_id;
			}
			
	  		public Object getAtzcaigoufksq_id(){
	  			return atzcaigoufksq_id;
	  		}
  		  		
  				  		
  	  	
  	public static F06708b8200000002z init(DataContextHelper context) {
  		F06708b8200000002z o = new F06708b8200000002z();
									o.setAtzcaigoufksq_bianhao(getValue(context,"atzcaigoufksq.bianhao"));
						
						  									o.setAtzcaigoufksq_linshibh(getValue(context,"atzcaigoufksq.linshibh"));
						
						  									o.setAtzcaigoufksq_zhidanr(getValue(context,"atzcaigoufksq.zhidanr"));
						
						  									o.setAtzcaigoufksq_zhidanrq(getValue(context,"atzcaigoufksq.zhidanrq"));
						
										o.setAtzcaigoufksq_zhidanrq1(getValue(context,"atzcaigoufksq.zhidanrq1"));
			  									o.setAtzcaigoufksq_zhixingzt(getValue(context,"atzcaigoufksq.zhixingzt"));
						
						  									o.setAtzcaigoufksq_wanchengfksj(getValue(context,"atzcaigoufksq.wanchengfksj"));
						
										o.setAtzcaigoufksq_wanchengfksj1(getValue(context,"atzcaigoufksq.wanchengfksj1"));
			  									o.setAtzcaigoufksq_id(getValue(context,"atzcaigoufksq.id"));
						
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