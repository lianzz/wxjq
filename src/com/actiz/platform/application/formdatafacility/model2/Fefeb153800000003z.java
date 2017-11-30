/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:46:54.316
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fefeb153800000003z{

	
						private Object atzhuiyis_fangjianhm;
			
				
										private Object atzhuiyisyd_yudingrq;
			
				
							private Object atzhuiyisyd_yudingrq1;
								private Object atzhuiyisyd_lianxir;
			
				
										private Object atzhuiyisyd_id;
			
				
										private Object atzhuiyis_id;
			
				
					
						public void setAtzhuiyis_fangjianhm(Object atzhuiyis_fangjianhm){
				this.atzhuiyis_fangjianhm = atzhuiyis_fangjianhm;
			}
			
	  		public Object getAtzhuiyis_fangjianhm(){
	  			return atzhuiyis_fangjianhm;
	  		}
  		  		
  				  		
  						public void setAtzhuiyisyd_yudingrq(Object atzhuiyisyd_yudingrq){
				this.atzhuiyisyd_yudingrq = atzhuiyisyd_yudingrq;
			}
			
	  		public Object getAtzhuiyisyd_yudingrq(){
	  			return atzhuiyisyd_yudingrq;
	  		}
  		  		
  							public void setAtzhuiyisyd_yudingrq1(Object atzhuiyisyd_yudingrq1){
				this.atzhuiyisyd_yudingrq1 = atzhuiyisyd_yudingrq1;
			}
			
	  		public Object getAtzhuiyisyd_yudingrq1(){
	  			return atzhuiyisyd_yudingrq1;
	  		}
		  		
  						public void setAtzhuiyisyd_lianxir(Object atzhuiyisyd_lianxir){
				this.atzhuiyisyd_lianxir = atzhuiyisyd_lianxir;
			}
			
	  		public Object getAtzhuiyisyd_lianxir(){
	  			return atzhuiyisyd_lianxir;
	  		}
  		  		
  				  		
  						public void setAtzhuiyisyd_id(Object atzhuiyisyd_id){
				this.atzhuiyisyd_id = atzhuiyisyd_id;
			}
			
	  		public Object getAtzhuiyisyd_id(){
	  			return atzhuiyisyd_id;
	  		}
  		  		
  				  		
  						public void setAtzhuiyis_id(Object atzhuiyis_id){
				this.atzhuiyis_id = atzhuiyis_id;
			}
			
	  		public Object getAtzhuiyis_id(){
	  			return atzhuiyis_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fefeb153800000003z init(DataContextHelper context) {
  		Fefeb153800000003z o = new Fefeb153800000003z();
									o.setAtzhuiyis_fangjianhm(getValue(context,"atzhuiyis.fangjianhm"));
						
						  									o.setAtzhuiyisyd_yudingrq(getValue(context,"atzhuiyisyd.yudingrq"));
						
										o.setAtzhuiyisyd_yudingrq1(getValue(context,"atzhuiyisyd.yudingrq1"));
			  									o.setAtzhuiyisyd_lianxir(getValue(context,"atzhuiyisyd.lianxir"));
						
						  									o.setAtzhuiyisyd_id(getValue(context,"atzhuiyisyd.id"));
						
						  									o.setAtzhuiyis_id(getValue(context,"atzhuiyis.id"));
						
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