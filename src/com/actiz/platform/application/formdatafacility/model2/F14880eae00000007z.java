/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:57:18.317
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F14880eae00000007z{

	
						private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_kehuid;
			
				
										private Object atzhetong_xiaoshoujl;
			
				
										private Object atzhetong_hetongje;
			
				
							private Object atzhetong_hetongje1;
								private Object atzhetong_suoshuhy;
			
				
										private Object atzhetong_pingshenzt;
			
				
										private Object atzhetong_jgspzt;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzhetong_kehuid(Object atzhetong_kehuid){
				this.atzhetong_kehuid = atzhetong_kehuid;
			}
			
	  		public Object getAtzhetong_kehuid(){
	  			return atzhetong_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzhetong_xiaoshoujl(Object atzhetong_xiaoshoujl){
				this.atzhetong_xiaoshoujl = atzhetong_xiaoshoujl;
			}
			
	  		public Object getAtzhetong_xiaoshoujl(){
	  			return atzhetong_xiaoshoujl;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongje(Object atzhetong_hetongje){
				this.atzhetong_hetongje = atzhetong_hetongje;
			}
			
	  		public Object getAtzhetong_hetongje(){
	  			return atzhetong_hetongje;
	  		}
  		  		
  							public void setAtzhetong_hetongje1(Object atzhetong_hetongje1){
				this.atzhetong_hetongje1 = atzhetong_hetongje1;
			}
			
	  		public Object getAtzhetong_hetongje1(){
	  			return atzhetong_hetongje1;
	  		}
		  		
  						public void setAtzhetong_suoshuhy(Object atzhetong_suoshuhy){
				this.atzhetong_suoshuhy = atzhetong_suoshuhy;
			}
			
	  		public Object getAtzhetong_suoshuhy(){
	  			return atzhetong_suoshuhy;
	  		}
  		  		
  				  		
  						public void setAtzhetong_pingshenzt(Object atzhetong_pingshenzt){
				this.atzhetong_pingshenzt = atzhetong_pingshenzt;
			}
			
	  		public Object getAtzhetong_pingshenzt(){
	  			return atzhetong_pingshenzt;
	  		}
  		  		
  				  		
  						public void setAtzhetong_jgspzt(Object atzhetong_jgspzt){
				this.atzhetong_jgspzt = atzhetong_jgspzt;
			}
			
	  		public Object getAtzhetong_jgspzt(){
	  			return atzhetong_jgspzt;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F14880eae00000007z init(DataContextHelper context) {
  		F14880eae00000007z o = new F14880eae00000007z();
									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_xiaoshoujl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzhetong_hetongje(getValue(context,"atzhetong.hetongje"));
						
										o.setAtzhetong_hetongje1(getValue(context,"atzhetong.hetongje1"));
			  									o.setAtzhetong_suoshuhy(getValue(context,"atzhetong.suoshuhy"));
						
						  									o.setAtzhetong_pingshenzt(getValue(context,"atzhetong.pingshenzt"));
						
						  									o.setAtzhetong_jgspzt(getValue(context,"atzhetong.jgspzt"));
						
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