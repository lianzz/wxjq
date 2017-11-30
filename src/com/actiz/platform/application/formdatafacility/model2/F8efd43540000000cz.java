/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:20.122
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F8efd43540000000cz{

	
						private Object atzscrw_bianhao;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzscph_pihao;
			
				
										private Object atzscph_chuanhaoqs;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzscph_id;
			
				
										private Object atzscrw_id;
			
				
					
						public void setAtzscrw_bianhao(Object atzscrw_bianhao){
				this.atzscrw_bianhao = atzscrw_bianhao;
			}
			
	  		public Object getAtzscrw_bianhao(){
	  			return atzscrw_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzscph_pihao(Object atzscph_pihao){
				this.atzscph_pihao = atzscph_pihao;
			}
			
	  		public Object getAtzscph_pihao(){
	  			return atzscph_pihao;
	  		}
  		  		
  				  		
  						public void setAtzscph_chuanhaoqs(Object atzscph_chuanhaoqs){
				this.atzscph_chuanhaoqs = atzscph_chuanhaoqs;
			}
			
	  		public Object getAtzscph_chuanhaoqs(){
	  			return atzscph_chuanhaoqs;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzscph_id(Object atzscph_id){
				this.atzscph_id = atzscph_id;
			}
			
	  		public Object getAtzscph_id(){
	  			return atzscph_id;
	  		}
  		  		
  				  		
  						public void setAtzscrw_id(Object atzscrw_id){
				this.atzscrw_id = atzscrw_id;
			}
			
	  		public Object getAtzscrw_id(){
	  			return atzscrw_id;
	  		}
  		  		
  				  		
  	  	
  	public static F8efd43540000000cz init(DataContextHelper context) {
  		F8efd43540000000cz o = new F8efd43540000000cz();
									o.setAtzscrw_bianhao(getValue(context,"atzscrw.bianhao"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzscph_pihao(getValue(context,"atzscph.pihao"));
						
						  									o.setAtzscph_chuanhaoqs(getValue(context,"atzscph.chuanhaoqs"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzscph_id(getValue(context,"atzscph.id"));
						
						  									o.setAtzscrw_id(getValue(context,"atzscrw.id"));
						
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