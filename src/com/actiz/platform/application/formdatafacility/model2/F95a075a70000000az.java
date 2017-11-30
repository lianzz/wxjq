/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:25.587
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F95a075a70000000az{

	
						private Object atzcaigousy_bianhao;
			
				
										private Object atzcaigousy_linshibh;
			
				
										private Object atzcaigousy_xiangmuid;
			
				
										private Object atzcaigousy_shenyangr;
			
				
										private Object atzcaigousy_zhidanrq;
			
				
							private Object atzcaigousy_zhidanrq1;
								private Object atzcaigousy_id;
			
				
					
						public void setAtzcaigousy_bianhao(Object atzcaigousy_bianhao){
				this.atzcaigousy_bianhao = atzcaigousy_bianhao;
			}
			
	  		public Object getAtzcaigousy_bianhao(){
	  			return atzcaigousy_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigousy_linshibh(Object atzcaigousy_linshibh){
				this.atzcaigousy_linshibh = atzcaigousy_linshibh;
			}
			
	  		public Object getAtzcaigousy_linshibh(){
	  			return atzcaigousy_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzcaigousy_xiangmuid(Object atzcaigousy_xiangmuid){
				this.atzcaigousy_xiangmuid = atzcaigousy_xiangmuid;
			}
			
	  		public Object getAtzcaigousy_xiangmuid(){
	  			return atzcaigousy_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzcaigousy_shenyangr(Object atzcaigousy_shenyangr){
				this.atzcaigousy_shenyangr = atzcaigousy_shenyangr;
			}
			
	  		public Object getAtzcaigousy_shenyangr(){
	  			return atzcaigousy_shenyangr;
	  		}
  		  		
  				  		
  						public void setAtzcaigousy_zhidanrq(Object atzcaigousy_zhidanrq){
				this.atzcaigousy_zhidanrq = atzcaigousy_zhidanrq;
			}
			
	  		public Object getAtzcaigousy_zhidanrq(){
	  			return atzcaigousy_zhidanrq;
	  		}
  		  		
  							public void setAtzcaigousy_zhidanrq1(Object atzcaigousy_zhidanrq1){
				this.atzcaigousy_zhidanrq1 = atzcaigousy_zhidanrq1;
			}
			
	  		public Object getAtzcaigousy_zhidanrq1(){
	  			return atzcaigousy_zhidanrq1;
	  		}
		  		
  						public void setAtzcaigousy_id(Object atzcaigousy_id){
				this.atzcaigousy_id = atzcaigousy_id;
			}
			
	  		public Object getAtzcaigousy_id(){
	  			return atzcaigousy_id;
	  		}
  		  		
  				  		
  	  	
  	public static F95a075a70000000az init(DataContextHelper context) {
  		F95a075a70000000az o = new F95a075a70000000az();
									o.setAtzcaigousy_bianhao(getValue(context,"atzcaigousy.bianhao"));
						
						  									o.setAtzcaigousy_linshibh(getValue(context,"atzcaigousy.linshibh"));
						
						  									o.setAtzcaigousy_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzcaigousy_shenyangr(getValue(context,"atzcaigousy.shenyangr"));
						
						  									o.setAtzcaigousy_zhidanrq(getValue(context,"atzcaigousy.zhidanrq"));
						
										o.setAtzcaigousy_zhidanrq1(getValue(context,"atzcaigousy.zhidanrq1"));
			  									o.setAtzcaigousy_id(getValue(context,"atzcaigousy.id"));
						
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