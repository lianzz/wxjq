/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:44.832
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F958cf31a00000002z{

	
						private Object atzdiaobod_bianhao;
			
				
										private Object atzdiaobod_ckjhdbh;
			
				
										private Object atzdiaobod_diaoboyy;
			
				
										private Object atzdiaobod_diaobor;
			
				
										private Object atzdiaobod_diaoborq;
			
				
							private Object atzdiaobod_diaoborq1;
								private Object atzdiaobod_beizhu;
			
				
										private Object atzdiaobod_linshibh;
			
				
										private Object atzdiaobod_danjuzt;
			
				
										private Object atzdiaobod_sfzf;
			
				
										private Object atzdiaobod_id;
			
				
					
						public void setAtzdiaobod_bianhao(Object atzdiaobod_bianhao){
				this.atzdiaobod_bianhao = atzdiaobod_bianhao;
			}
			
	  		public Object getAtzdiaobod_bianhao(){
	  			return atzdiaobod_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_ckjhdbh(Object atzdiaobod_ckjhdbh){
				this.atzdiaobod_ckjhdbh = atzdiaobod_ckjhdbh;
			}
			
	  		public Object getAtzdiaobod_ckjhdbh(){
	  			return atzdiaobod_ckjhdbh;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_diaoboyy(Object atzdiaobod_diaoboyy){
				this.atzdiaobod_diaoboyy = atzdiaobod_diaoboyy;
			}
			
	  		public Object getAtzdiaobod_diaoboyy(){
	  			return atzdiaobod_diaoboyy;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_diaobor(Object atzdiaobod_diaobor){
				this.atzdiaobod_diaobor = atzdiaobod_diaobor;
			}
			
	  		public Object getAtzdiaobod_diaobor(){
	  			return atzdiaobod_diaobor;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_diaoborq(Object atzdiaobod_diaoborq){
				this.atzdiaobod_diaoborq = atzdiaobod_diaoborq;
			}
			
	  		public Object getAtzdiaobod_diaoborq(){
	  			return atzdiaobod_diaoborq;
	  		}
  		  		
  							public void setAtzdiaobod_diaoborq1(Object atzdiaobod_diaoborq1){
				this.atzdiaobod_diaoborq1 = atzdiaobod_diaoborq1;
			}
			
	  		public Object getAtzdiaobod_diaoborq1(){
	  			return atzdiaobod_diaoborq1;
	  		}
		  		
  						public void setAtzdiaobod_beizhu(Object atzdiaobod_beizhu){
				this.atzdiaobod_beizhu = atzdiaobod_beizhu;
			}
			
	  		public Object getAtzdiaobod_beizhu(){
	  			return atzdiaobod_beizhu;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_linshibh(Object atzdiaobod_linshibh){
				this.atzdiaobod_linshibh = atzdiaobod_linshibh;
			}
			
	  		public Object getAtzdiaobod_linshibh(){
	  			return atzdiaobod_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_danjuzt(Object atzdiaobod_danjuzt){
				this.atzdiaobod_danjuzt = atzdiaobod_danjuzt;
			}
			
	  		public Object getAtzdiaobod_danjuzt(){
	  			return atzdiaobod_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_sfzf(Object atzdiaobod_sfzf){
				this.atzdiaobod_sfzf = atzdiaobod_sfzf;
			}
			
	  		public Object getAtzdiaobod_sfzf(){
	  			return atzdiaobod_sfzf;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_id(Object atzdiaobod_id){
				this.atzdiaobod_id = atzdiaobod_id;
			}
			
	  		public Object getAtzdiaobod_id(){
	  			return atzdiaobod_id;
	  		}
  		  		
  				  		
  	  	
  	public static F958cf31a00000002z init(DataContextHelper context) {
  		F958cf31a00000002z o = new F958cf31a00000002z();
									o.setAtzdiaobod_bianhao(getValue(context,"atzdiaobod.bianhao"));
						
						  									o.setAtzdiaobod_ckjhdbh(getValue(context,"atzdiaobod.ckjhdbh"));
						
						  									o.setAtzdiaobod_diaoboyy(getValue(context,"atzdiaobod.diaoboyy"));
						
						  									o.setAtzdiaobod_diaobor(getValue(context,"atzdiaobod.diaobor"));
						
						  									o.setAtzdiaobod_diaoborq(getValue(context,"atzdiaobod.diaoborq"));
						
										o.setAtzdiaobod_diaoborq1(getValue(context,"atzdiaobod.diaoborq1"));
			  									o.setAtzdiaobod_beizhu(getValue(context,"atzdiaobod.beizhu"));
						
						  									o.setAtzdiaobod_linshibh(getValue(context,"atzdiaobod.linshibh"));
						
						  									o.setAtzdiaobod_danjuzt(getValue(context,"atzdiaobod.danjuzt"));
						
						  									o.setAtzdiaobod_sfzf(getValue(context,"atzdiaobod.sfzf"));
						
						  									o.setAtzdiaobod_id(getValue(context,"atzdiaobod.id"));
						
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