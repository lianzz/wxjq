/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:25.527
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F56a4982e00000007z{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx1_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzwuliaojcxx1_wuliaoms;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzwuliaojcxx1_id;
			
				
										private Object atzyouqianwqdyb_id;
			
				
					
						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_wuliaobm(Object atzwuliaojcxx1_wuliaobm){
				this.atzwuliaojcxx1_wuliaobm = atzwuliaojcxx1_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx1_wuliaobm(){
	  			return atzwuliaojcxx1_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_wuliaoms(Object atzwuliaojcxx1_wuliaoms){
				this.atzwuliaojcxx1_wuliaoms = atzwuliaojcxx1_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx1_wuliaoms(){
	  			return atzwuliaojcxx1_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_id(Object atzwuliaojcxx1_id){
				this.atzwuliaojcxx1_id = atzwuliaojcxx1_id;
			}
			
	  		public Object getAtzwuliaojcxx1_id(){
	  			return atzwuliaojcxx1_id;
	  		}
  		  		
  				  		
  						public void setAtzyouqianwqdyb_id(Object atzyouqianwqdyb_id){
				this.atzyouqianwqdyb_id = atzyouqianwqdyb_id;
			}
			
	  		public Object getAtzyouqianwqdyb_id(){
	  			return atzyouqianwqdyb_id;
	  		}
  		  		
  				  		
  	  	
  	public static F56a4982e00000007z init(DataContextHelper context) {
  		F56a4982e00000007z o = new F56a4982e00000007z();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx1_wuliaobm(getValue(context,"atzwuliaojcxx1.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzwuliaojcxx1_wuliaoms(getValue(context,"atzwuliaojcxx1.wuliaoms"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzwuliaojcxx1_id(getValue(context,"atzwuliaojcxx1.id"));
						
						  									o.setAtzyouqianwqdyb_id(getValue(context,"atzyouqianwqdyb.id"));
						
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