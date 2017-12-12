/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:01:10.506
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9a684fae00000010z{

	
						private Object atzceshijl_sn;
			
				
										private Object atzceshijl_wuliaoid;
			
				
										private Object atzceshijl_chuzongc;
			
				
										private Object atzscrw_bianhao;
			
				
										private Object atzceshijl_ceshir;
			
				
										private Object atzceshijl_ceshirq;
			
				
							private Object atzceshijl_ceshirq1;
								private Object atzscrw_id;
			
				
										private Object atzceshijl_id;
			
				
					
						public void setAtzceshijl_sn(Object atzceshijl_sn){
				this.atzceshijl_sn = atzceshijl_sn;
			}
			
	  		public Object getAtzceshijl_sn(){
	  			return atzceshijl_sn;
	  		}
  		  		
  				  		
  						public void setAtzceshijl_wuliaoid(Object atzceshijl_wuliaoid){
				this.atzceshijl_wuliaoid = atzceshijl_wuliaoid;
			}
			
	  		public Object getAtzceshijl_wuliaoid(){
	  			return atzceshijl_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzceshijl_chuzongc(Object atzceshijl_chuzongc){
				this.atzceshijl_chuzongc = atzceshijl_chuzongc;
			}
			
	  		public Object getAtzceshijl_chuzongc(){
	  			return atzceshijl_chuzongc;
	  		}
  		  		
  				  		
  						public void setAtzscrw_bianhao(Object atzscrw_bianhao){
				this.atzscrw_bianhao = atzscrw_bianhao;
			}
			
	  		public Object getAtzscrw_bianhao(){
	  			return atzscrw_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzceshijl_ceshir(Object atzceshijl_ceshir){
				this.atzceshijl_ceshir = atzceshijl_ceshir;
			}
			
	  		public Object getAtzceshijl_ceshir(){
	  			return atzceshijl_ceshir;
	  		}
  		  		
  				  		
  						public void setAtzceshijl_ceshirq(Object atzceshijl_ceshirq){
				this.atzceshijl_ceshirq = atzceshijl_ceshirq;
			}
			
	  		public Object getAtzceshijl_ceshirq(){
	  			return atzceshijl_ceshirq;
	  		}
  		  		
  							public void setAtzceshijl_ceshirq1(Object atzceshijl_ceshirq1){
				this.atzceshijl_ceshirq1 = atzceshijl_ceshirq1;
			}
			
	  		public Object getAtzceshijl_ceshirq1(){
	  			return atzceshijl_ceshirq1;
	  		}
		  		
  						public void setAtzscrw_id(Object atzscrw_id){
				this.atzscrw_id = atzscrw_id;
			}
			
	  		public Object getAtzscrw_id(){
	  			return atzscrw_id;
	  		}
  		  		
  				  		
  						public void setAtzceshijl_id(Object atzceshijl_id){
				this.atzceshijl_id = atzceshijl_id;
			}
			
	  		public Object getAtzceshijl_id(){
	  			return atzceshijl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9a684fae00000010z init(DataContextHelper context) {
  		F9a684fae00000010z o = new F9a684fae00000010z();
									o.setAtzceshijl_sn(getValue(context,"atzceshijl.sn"));
						
						  									o.setAtzceshijl_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzceshijl_chuzongc(getValue(context,"atzceshijl.chuzongc"));
						
						  									o.setAtzscrw_bianhao(getValue(context,"atzscrw.bianhao"));
						
						  									o.setAtzceshijl_ceshir(getValue(context,"atzceshijl.ceshir"));
						
						  									o.setAtzceshijl_ceshirq(getValue(context,"atzceshijl.ceshirq"));
						
										o.setAtzceshijl_ceshirq1(getValue(context,"atzceshijl.ceshirq1"));
			  									o.setAtzscrw_id(getValue(context,"atzscrw.id"));
						
						  									o.setAtzceshijl_id(getValue(context,"atzceshijl.id"));
						
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