/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:57.871
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe520b68600000001z{

	
						private Object atzkecheng_kechengmc;
			
				
										private Object atzkecheng_yuangong;
			
				
										private Object atzemployee_name;
			
				
										private Object atzkecheng_mxdx;
			
				
										private Object atzkecheng_bumen;
			
				
										private Object atzkecheng_kclb;
			
				
										private Object atzkecheng_danjuzt;
			
				
										private Object atzemployee_id;
			
				
										private Object atzkecheng_id;
			
				
					
						public void setAtzkecheng_kechengmc(Object atzkecheng_kechengmc){
				this.atzkecheng_kechengmc = atzkecheng_kechengmc;
			}
			
	  		public Object getAtzkecheng_kechengmc(){
	  			return atzkecheng_kechengmc;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_yuangong(Object atzkecheng_yuangong){
				this.atzkecheng_yuangong = atzkecheng_yuangong;
			}
			
	  		public Object getAtzkecheng_yuangong(){
	  			return atzkecheng_yuangong;
	  		}
  		  		
  				  		
  						public void setAtzemployee_name(Object atzemployee_name){
				this.atzemployee_name = atzemployee_name;
			}
			
	  		public Object getAtzemployee_name(){
	  			return atzemployee_name;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_mxdx(Object atzkecheng_mxdx){
				this.atzkecheng_mxdx = atzkecheng_mxdx;
			}
			
	  		public Object getAtzkecheng_mxdx(){
	  			return atzkecheng_mxdx;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_bumen(Object atzkecheng_bumen){
				this.atzkecheng_bumen = atzkecheng_bumen;
			}
			
	  		public Object getAtzkecheng_bumen(){
	  			return atzkecheng_bumen;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_kclb(Object atzkecheng_kclb){
				this.atzkecheng_kclb = atzkecheng_kclb;
			}
			
	  		public Object getAtzkecheng_kclb(){
	  			return atzkecheng_kclb;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_danjuzt(Object atzkecheng_danjuzt){
				this.atzkecheng_danjuzt = atzkecheng_danjuzt;
			}
			
	  		public Object getAtzkecheng_danjuzt(){
	  			return atzkecheng_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzemployee_id(Object atzemployee_id){
				this.atzemployee_id = atzemployee_id;
			}
			
	  		public Object getAtzemployee_id(){
	  			return atzemployee_id;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_id(Object atzkecheng_id){
				this.atzkecheng_id = atzkecheng_id;
			}
			
	  		public Object getAtzkecheng_id(){
	  			return atzkecheng_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe520b68600000001z init(DataContextHelper context) {
  		Fe520b68600000001z o = new Fe520b68600000001z();
									o.setAtzkecheng_kechengmc(getValue(context,"atzkecheng.kechengmc"));
						
						  									o.setAtzkecheng_yuangong(getValue(context,"atzemployee.id"));
						
						  									o.setAtzemployee_name(getValue(context,"atzemployee.name"));
						
						  									o.setAtzkecheng_mxdx(getValue(context,"atzkecheng.mxdx"));
						
						  									o.setAtzkecheng_bumen(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzkecheng_kclb(getValue(context,"atzkecheng.kclb"));
						
						  									o.setAtzkecheng_danjuzt(getValue(context,"atzkecheng.danjuzt"));
						
						  									o.setAtzemployee_id(getValue(context,"atzemployee.id"));
						
						  									o.setAtzkecheng_id(getValue(context,"atzkecheng.id"));
						
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