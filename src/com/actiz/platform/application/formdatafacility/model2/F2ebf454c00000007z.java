/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:48.543
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F2ebf454c00000007z{

	
						private Object atzxiaoshoujh_jihuizt;
			
				
										private Object atzxiaoshoujh_kehuid;
			
				
										private Object atzxiaoshoujh_fuzer;
			
				
										private Object atzxiaoshoujh_jipox;
			
				
										private Object atzxiaoshoujh_jieduan;
			
				
										private Object atzxiaoshoujh_zhuangtai;
			
				
										private Object atzxiaoshoujh_chenggongl;
			
				
										private Object atzxiaoshoujh_lururq;
			
				
							private Object atzxiaoshoujh_lururq1;
								private Object atzxiaoshoujh_id;
			
				
					
						public void setAtzxiaoshoujh_jihuizt(Object atzxiaoshoujh_jihuizt){
				this.atzxiaoshoujh_jihuizt = atzxiaoshoujh_jihuizt;
			}
			
	  		public Object getAtzxiaoshoujh_jihuizt(){
	  			return atzxiaoshoujh_jihuizt;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_kehuid(Object atzxiaoshoujh_kehuid){
				this.atzxiaoshoujh_kehuid = atzxiaoshoujh_kehuid;
			}
			
	  		public Object getAtzxiaoshoujh_kehuid(){
	  			return atzxiaoshoujh_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_fuzer(Object atzxiaoshoujh_fuzer){
				this.atzxiaoshoujh_fuzer = atzxiaoshoujh_fuzer;
			}
			
	  		public Object getAtzxiaoshoujh_fuzer(){
	  			return atzxiaoshoujh_fuzer;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_jipox(Object atzxiaoshoujh_jipox){
				this.atzxiaoshoujh_jipox = atzxiaoshoujh_jipox;
			}
			
	  		public Object getAtzxiaoshoujh_jipox(){
	  			return atzxiaoshoujh_jipox;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_jieduan(Object atzxiaoshoujh_jieduan){
				this.atzxiaoshoujh_jieduan = atzxiaoshoujh_jieduan;
			}
			
	  		public Object getAtzxiaoshoujh_jieduan(){
	  			return atzxiaoshoujh_jieduan;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_zhuangtai(Object atzxiaoshoujh_zhuangtai){
				this.atzxiaoshoujh_zhuangtai = atzxiaoshoujh_zhuangtai;
			}
			
	  		public Object getAtzxiaoshoujh_zhuangtai(){
	  			return atzxiaoshoujh_zhuangtai;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_chenggongl(Object atzxiaoshoujh_chenggongl){
				this.atzxiaoshoujh_chenggongl = atzxiaoshoujh_chenggongl;
			}
			
	  		public Object getAtzxiaoshoujh_chenggongl(){
	  			return atzxiaoshoujh_chenggongl;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_lururq(Object atzxiaoshoujh_lururq){
				this.atzxiaoshoujh_lururq = atzxiaoshoujh_lururq;
			}
			
	  		public Object getAtzxiaoshoujh_lururq(){
	  			return atzxiaoshoujh_lururq;
	  		}
  		  		
  							public void setAtzxiaoshoujh_lururq1(Object atzxiaoshoujh_lururq1){
				this.atzxiaoshoujh_lururq1 = atzxiaoshoujh_lururq1;
			}
			
	  		public Object getAtzxiaoshoujh_lururq1(){
	  			return atzxiaoshoujh_lururq1;
	  		}
		  		
  						public void setAtzxiaoshoujh_id(Object atzxiaoshoujh_id){
				this.atzxiaoshoujh_id = atzxiaoshoujh_id;
			}
			
	  		public Object getAtzxiaoshoujh_id(){
	  			return atzxiaoshoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F2ebf454c00000007z init(DataContextHelper context) {
  		F2ebf454c00000007z o = new F2ebf454c00000007z();
									o.setAtzxiaoshoujh_jihuizt(getValue(context,"atzxiaoshoujh.jihuizt"));
						
						  									o.setAtzxiaoshoujh_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzxiaoshoujh_fuzer(getValue(context,"atztdyg.id"));
						
						  									o.setAtzxiaoshoujh_jipox(getValue(context,"atzxiaoshoujh.jipox"));
						
						  									o.setAtzxiaoshoujh_jieduan(getValue(context,"atzxiaoshoujh.jieduan"));
						
						  									o.setAtzxiaoshoujh_zhuangtai(getValue(context,"atzxiaoshoujh.zhuangtai"));
						
						  									o.setAtzxiaoshoujh_chenggongl(getValue(context,"atzxiaoshoujh.chenggongl"));
						
						  									o.setAtzxiaoshoujh_lururq(getValue(context,"atzxiaoshoujh.lururq"));
						
										o.setAtzxiaoshoujh_lururq1(getValue(context,"atzxiaoshoujh.lururq1"));
			  									o.setAtzxiaoshoujh_id(getValue(context,"atzxiaoshoujh.id"));
						
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