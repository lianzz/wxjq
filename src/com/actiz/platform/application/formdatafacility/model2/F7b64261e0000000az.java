/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:07.144
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F7b64261e0000000az{

	
						private Object atzhetong_lxlx;
			
				
										private Object atzhetong_zuizhongyh;
			
				
										private Object atzhetong_xiangmumc;
			
				
										private Object atzhetong_xiaoshoujl;
			
				
										private Object atzhetong_daqu;
			
				
										private Object atzhetong_pingshenzt;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_lxlx(Object atzhetong_lxlx){
				this.atzhetong_lxlx = atzhetong_lxlx;
			}
			
	  		public Object getAtzhetong_lxlx(){
	  			return atzhetong_lxlx;
	  		}
  		  		
  				  		
  						public void setAtzhetong_zuizhongyh(Object atzhetong_zuizhongyh){
				this.atzhetong_zuizhongyh = atzhetong_zuizhongyh;
			}
			
	  		public Object getAtzhetong_zuizhongyh(){
	  			return atzhetong_zuizhongyh;
	  		}
  		  		
  				  		
  						public void setAtzhetong_xiangmumc(Object atzhetong_xiangmumc){
				this.atzhetong_xiangmumc = atzhetong_xiangmumc;
			}
			
	  		public Object getAtzhetong_xiangmumc(){
	  			return atzhetong_xiangmumc;
	  		}
  		  		
  				  		
  						public void setAtzhetong_xiaoshoujl(Object atzhetong_xiaoshoujl){
				this.atzhetong_xiaoshoujl = atzhetong_xiaoshoujl;
			}
			
	  		public Object getAtzhetong_xiaoshoujl(){
	  			return atzhetong_xiaoshoujl;
	  		}
  		  		
  				  		
  						public void setAtzhetong_daqu(Object atzhetong_daqu){
				this.atzhetong_daqu = atzhetong_daqu;
			}
			
	  		public Object getAtzhetong_daqu(){
	  			return atzhetong_daqu;
	  		}
  		  		
  				  		
  						public void setAtzhetong_pingshenzt(Object atzhetong_pingshenzt){
				this.atzhetong_pingshenzt = atzhetong_pingshenzt;
			}
			
	  		public Object getAtzhetong_pingshenzt(){
	  			return atzhetong_pingshenzt;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F7b64261e0000000az init(DataContextHelper context) {
  		F7b64261e0000000az o = new F7b64261e0000000az();
									o.setAtzhetong_lxlx(getValue(context,"atzhetong.lxlx"));
						
						  									o.setAtzhetong_zuizhongyh(getValue(context,"atzhetong.zuizhongyh"));
						
						  									o.setAtzhetong_xiangmumc(getValue(context,"atzhetong.xiangmumc"));
						
						  									o.setAtzhetong_xiaoshoujl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzhetong_daqu(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzhetong_pingshenzt(getValue(context,"atzhetong.pingshenzt"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
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