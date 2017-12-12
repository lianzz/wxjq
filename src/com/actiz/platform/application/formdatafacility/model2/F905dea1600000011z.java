/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:01:58.277
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F905dea1600000011z{

	
						private Object atzxiaoshouyc_bianhao;
			
				
										private Object atzxiaoshouyc_zhuti;
			
				
										private Object atzxiaoshouyc_xiaoshouqy;
			
				
										private Object atzxiaoshouyc_xiaoshouxmmc;
			
				
										private Object atzxiaoshouyc_danjuzt;
			
				
										private Object atzxiaoshouyc_lurur;
			
				
										private Object atzxiaoshouyc_id;
			
				
					
						public void setAtzxiaoshouyc_bianhao(Object atzxiaoshouyc_bianhao){
				this.atzxiaoshouyc_bianhao = atzxiaoshouyc_bianhao;
			}
			
	  		public Object getAtzxiaoshouyc_bianhao(){
	  			return atzxiaoshouyc_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_zhuti(Object atzxiaoshouyc_zhuti){
				this.atzxiaoshouyc_zhuti = atzxiaoshouyc_zhuti;
			}
			
	  		public Object getAtzxiaoshouyc_zhuti(){
	  			return atzxiaoshouyc_zhuti;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_xiaoshouqy(Object atzxiaoshouyc_xiaoshouqy){
				this.atzxiaoshouyc_xiaoshouqy = atzxiaoshouyc_xiaoshouqy;
			}
			
	  		public Object getAtzxiaoshouyc_xiaoshouqy(){
	  			return atzxiaoshouyc_xiaoshouqy;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_xiaoshouxmmc(Object atzxiaoshouyc_xiaoshouxmmc){
				this.atzxiaoshouyc_xiaoshouxmmc = atzxiaoshouyc_xiaoshouxmmc;
			}
			
	  		public Object getAtzxiaoshouyc_xiaoshouxmmc(){
	  			return atzxiaoshouyc_xiaoshouxmmc;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_danjuzt(Object atzxiaoshouyc_danjuzt){
				this.atzxiaoshouyc_danjuzt = atzxiaoshouyc_danjuzt;
			}
			
	  		public Object getAtzxiaoshouyc_danjuzt(){
	  			return atzxiaoshouyc_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_lurur(Object atzxiaoshouyc_lurur){
				this.atzxiaoshouyc_lurur = atzxiaoshouyc_lurur;
			}
			
	  		public Object getAtzxiaoshouyc_lurur(){
	  			return atzxiaoshouyc_lurur;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshouyc_id(Object atzxiaoshouyc_id){
				this.atzxiaoshouyc_id = atzxiaoshouyc_id;
			}
			
	  		public Object getAtzxiaoshouyc_id(){
	  			return atzxiaoshouyc_id;
	  		}
  		  		
  				  		
  	  	
  	public static F905dea1600000011z init(DataContextHelper context) {
  		F905dea1600000011z o = new F905dea1600000011z();
									o.setAtzxiaoshouyc_bianhao(getValue(context,"atzxiaoshouyc.bianhao"));
						
						  									o.setAtzxiaoshouyc_zhuti(getValue(context,"atzxiaoshouyc.zhuti"));
						
						  									o.setAtzxiaoshouyc_xiaoshouqy(getValue(context,"atzxiaoshouyc.xiaoshouqy"));
						
						  									o.setAtzxiaoshouyc_xiaoshouxmmc(getValue(context,"atzxiaoshouyc.xiaoshouxmmc"));
						
						  									o.setAtzxiaoshouyc_danjuzt(getValue(context,"atzxiaoshouyc.danjuzt"));
						
						  									o.setAtzxiaoshouyc_lurur(getValue(context,"atzxiaoshouyc.lurur"));
						
						  									o.setAtzxiaoshouyc_id(getValue(context,"atzxiaoshouyc.id"));
						
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