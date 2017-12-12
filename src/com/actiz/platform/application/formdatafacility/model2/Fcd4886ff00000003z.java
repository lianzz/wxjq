/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:35.688
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fcd4886ff00000003z{

	
						private Object atzscph_pihao;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzmacdd_macqs;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzscph_id;
			
				
										private Object atzmacdd_id;
			
				
					
						public void setAtzscph_pihao(Object atzscph_pihao){
				this.atzscph_pihao = atzscph_pihao;
			}
			
	  		public Object getAtzscph_pihao(){
	  			return atzscph_pihao;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzmacdd_macqs(Object atzmacdd_macqs){
				this.atzmacdd_macqs = atzmacdd_macqs;
			}
			
	  		public Object getAtzmacdd_macqs(){
	  			return atzmacdd_macqs;
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
  		  		
  				  		
  						public void setAtzmacdd_id(Object atzmacdd_id){
				this.atzmacdd_id = atzmacdd_id;
			}
			
	  		public Object getAtzmacdd_id(){
	  			return atzmacdd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fcd4886ff00000003z init(DataContextHelper context) {
  		Fcd4886ff00000003z o = new Fcd4886ff00000003z();
									o.setAtzscph_pihao(getValue(context,"atzscph.pihao"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzmacdd_macqs(getValue(context,"atzmacdd.macqs"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzscph_id(getValue(context,"atzscph.id"));
						
						  									o.setAtzmacdd_id(getValue(context,"atzmacdd.id"));
						
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