/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:09:56.18
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F901ba13c0000000ez{

	
						private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_kehuid;
			
				
										private Object atzhetong_xiaoshoujl;
			
				
										private Object atzhetong_qiandingrq;
			
				
							private Object atzhetong_qiandingrq1;
								private Object atzhetong_hetongje;
			
				
							private Object atzhetong_hetongje1;
								private Object atzhetong_suoshuhy;
			
				
										private Object atzhetong_pingshenzt;
			
				
										private Object atzhetong_jgspzt;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
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
  		  		
  				  		
  						public void setAtzhetong_qiandingrq(Object atzhetong_qiandingrq){
				this.atzhetong_qiandingrq = atzhetong_qiandingrq;
			}
			
	  		public Object getAtzhetong_qiandingrq(){
	  			return atzhetong_qiandingrq;
	  		}
  		  		
  							public void setAtzhetong_qiandingrq1(Object atzhetong_qiandingrq1){
				this.atzhetong_qiandingrq1 = atzhetong_qiandingrq1;
			}
			
	  		public Object getAtzhetong_qiandingrq1(){
	  			return atzhetong_qiandingrq1;
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
  		  		
  				  		
  	  	
  	public static F901ba13c0000000ez init(DataContextHelper context) {
  		F901ba13c0000000ez o = new F901ba13c0000000ez();
									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_xiaoshoujl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzhetong_qiandingrq(getValue(context,"atzhetong.qiandingrq"));
						
										o.setAtzhetong_qiandingrq1(getValue(context,"atzhetong.qiandingrq1"));
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