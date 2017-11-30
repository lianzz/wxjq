/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-22 11:31:41.943
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc434dfb100000007z{

	
						private Object atzzxwj_mingcheng;
			
				
										private Object atzzxwj_youxiaorq;
			
				
							private Object atzzxwj_youxiaorq1;
								private Object atzzxwj_lururxm;
			
				
										private Object atzzxwj_zuihouxgrxm;
			
				
										private Object atzzxwj_lururq;
			
				
							private Object atzzxwj_lururq1;
								private Object atzzxwj_zuihouxgrq;
			
				
							private Object atzzxwj_zuihouxgrq1;
								private Object atzzxwj_id;
			
				
					
						public void setAtzzxwj_mingcheng(Object atzzxwj_mingcheng){
				this.atzzxwj_mingcheng = atzzxwj_mingcheng;
			}
			
	  		public Object getAtzzxwj_mingcheng(){
	  			return atzzxwj_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzzxwj_youxiaorq(Object atzzxwj_youxiaorq){
				this.atzzxwj_youxiaorq = atzzxwj_youxiaorq;
			}
			
	  		public Object getAtzzxwj_youxiaorq(){
	  			return atzzxwj_youxiaorq;
	  		}
  		  		
  							public void setAtzzxwj_youxiaorq1(Object atzzxwj_youxiaorq1){
				this.atzzxwj_youxiaorq1 = atzzxwj_youxiaorq1;
			}
			
	  		public Object getAtzzxwj_youxiaorq1(){
	  			return atzzxwj_youxiaorq1;
	  		}
		  		
  						public void setAtzzxwj_lururxm(Object atzzxwj_lururxm){
				this.atzzxwj_lururxm = atzzxwj_lururxm;
			}
			
	  		public Object getAtzzxwj_lururxm(){
	  			return atzzxwj_lururxm;
	  		}
  		  		
  				  		
  						public void setAtzzxwj_zuihouxgrxm(Object atzzxwj_zuihouxgrxm){
				this.atzzxwj_zuihouxgrxm = atzzxwj_zuihouxgrxm;
			}
			
	  		public Object getAtzzxwj_zuihouxgrxm(){
	  			return atzzxwj_zuihouxgrxm;
	  		}
  		  		
  				  		
  						public void setAtzzxwj_lururq(Object atzzxwj_lururq){
				this.atzzxwj_lururq = atzzxwj_lururq;
			}
			
	  		public Object getAtzzxwj_lururq(){
	  			return atzzxwj_lururq;
	  		}
  		  		
  							public void setAtzzxwj_lururq1(Object atzzxwj_lururq1){
				this.atzzxwj_lururq1 = atzzxwj_lururq1;
			}
			
	  		public Object getAtzzxwj_lururq1(){
	  			return atzzxwj_lururq1;
	  		}
		  		
  						public void setAtzzxwj_zuihouxgrq(Object atzzxwj_zuihouxgrq){
				this.atzzxwj_zuihouxgrq = atzzxwj_zuihouxgrq;
			}
			
	  		public Object getAtzzxwj_zuihouxgrq(){
	  			return atzzxwj_zuihouxgrq;
	  		}
  		  		
  							public void setAtzzxwj_zuihouxgrq1(Object atzzxwj_zuihouxgrq1){
				this.atzzxwj_zuihouxgrq1 = atzzxwj_zuihouxgrq1;
			}
			
	  		public Object getAtzzxwj_zuihouxgrq1(){
	  			return atzzxwj_zuihouxgrq1;
	  		}
		  		
  						public void setAtzzxwj_id(Object atzzxwj_id){
				this.atzzxwj_id = atzzxwj_id;
			}
			
	  		public Object getAtzzxwj_id(){
	  			return atzzxwj_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc434dfb100000007z init(DataContextHelper context) {
  		Fc434dfb100000007z o = new Fc434dfb100000007z();
									o.setAtzzxwj_mingcheng(getValue(context,"atzzxwj.mingcheng"));
						
						  									o.setAtzzxwj_youxiaorq(getValue(context,"atzzxwj.youxiaorq"));
						
										o.setAtzzxwj_youxiaorq1(getValue(context,"atzzxwj.youxiaorq1"));
			  									o.setAtzzxwj_lururxm(getValue(context,"atzzxwj.lururxm"));
						
						  									o.setAtzzxwj_zuihouxgrxm(getValue(context,"atzzxwj.zuihouxgrxm"));
						
						  									o.setAtzzxwj_lururq(getValue(context,"atzzxwj.lururq"));
						
										o.setAtzzxwj_lururq1(getValue(context,"atzzxwj.lururq1"));
			  									o.setAtzzxwj_zuihouxgrq(getValue(context,"atzzxwj.zuihouxgrq"));
						
										o.setAtzzxwj_zuihouxgrq1(getValue(context,"atzzxwj.zuihouxgrq1"));
			  									o.setAtzzxwj_id(getValue(context,"atzzxwj.id"));
						
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