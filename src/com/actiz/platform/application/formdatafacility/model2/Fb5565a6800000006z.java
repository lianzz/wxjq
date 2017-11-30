/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:12.218
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb5565a6800000006z{

	
						private Object atzjianyand_jianyandlx;
			
				
										private Object atzjianyand_jianyandzt;
			
				
										private Object atzjianyand_jianyanz;
			
				
										private Object atzjianyand_jianyanrq;
			
				
							private Object atzjianyand_jianyanrq1;
								private Object atzjianyandmx_id;
			
				
										private Object atzjianyand_id;
			
				
					
						public void setAtzjianyand_jianyandlx(Object atzjianyand_jianyandlx){
				this.atzjianyand_jianyandlx = atzjianyand_jianyandlx;
			}
			
	  		public Object getAtzjianyand_jianyandlx(){
	  			return atzjianyand_jianyandlx;
	  		}
  		  		
  				  		
  						public void setAtzjianyand_jianyandzt(Object atzjianyand_jianyandzt){
				this.atzjianyand_jianyandzt = atzjianyand_jianyandzt;
			}
			
	  		public Object getAtzjianyand_jianyandzt(){
	  			return atzjianyand_jianyandzt;
	  		}
  		  		
  				  		
  						public void setAtzjianyand_jianyanz(Object atzjianyand_jianyanz){
				this.atzjianyand_jianyanz = atzjianyand_jianyanz;
			}
			
	  		public Object getAtzjianyand_jianyanz(){
	  			return atzjianyand_jianyanz;
	  		}
  		  		
  				  		
  						public void setAtzjianyand_jianyanrq(Object atzjianyand_jianyanrq){
				this.atzjianyand_jianyanrq = atzjianyand_jianyanrq;
			}
			
	  		public Object getAtzjianyand_jianyanrq(){
	  			return atzjianyand_jianyanrq;
	  		}
  		  		
  							public void setAtzjianyand_jianyanrq1(Object atzjianyand_jianyanrq1){
				this.atzjianyand_jianyanrq1 = atzjianyand_jianyanrq1;
			}
			
	  		public Object getAtzjianyand_jianyanrq1(){
	  			return atzjianyand_jianyanrq1;
	  		}
		  		
  						public void setAtzjianyandmx_id(Object atzjianyandmx_id){
				this.atzjianyandmx_id = atzjianyandmx_id;
			}
			
	  		public Object getAtzjianyandmx_id(){
	  			return atzjianyandmx_id;
	  		}
  		  		
  				  		
  						public void setAtzjianyand_id(Object atzjianyand_id){
				this.atzjianyand_id = atzjianyand_id;
			}
			
	  		public Object getAtzjianyand_id(){
	  			return atzjianyand_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fb5565a6800000006z init(DataContextHelper context) {
  		Fb5565a6800000006z o = new Fb5565a6800000006z();
									o.setAtzjianyand_jianyandlx(getValue(context,"atzjianyand.jianyandlx"));
						
						  									o.setAtzjianyand_jianyandzt(getValue(context,"atzjianyand.jianyandzt"));
						
						  									o.setAtzjianyand_jianyanz(getValue(context,"atzjianyand.jianyanz"));
						
						  									o.setAtzjianyand_jianyanrq(getValue(context,"atzjianyand.jianyanrq"));
						
										o.setAtzjianyand_jianyanrq1(getValue(context,"atzjianyand.jianyanrq1"));
			  									o.setAtzjianyandmx_id(getValue(context,"atzjianyandmx.id"));
						
						  									o.setAtzjianyand_id(getValue(context,"atzjianyand.id"));
						
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