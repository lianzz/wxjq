/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:20.65
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F62d6523600000002z{

	
						private Object atzfahuoxxgzb_fahuosj;
			
				
							private Object atzfahuoxxgzb_fahuosj1;
								private Object atzfahuoxxgzb_fahuotzdh;
			
				
										private Object atzfahuoxxgzb_hetongbh;
			
				
										private Object atzfahuoxxgzb_hetongmc;
			
				
										private Object atzfahuoxxgzb_wuliaobm;
			
				
										private Object atzfahuoxxgzb_wuliaoms;
			
				
										private Object atzfahuoxxgzb_sn;
			
				
										private Object atzfahuoxxgzb_id;
			
				
					
						public void setAtzfahuoxxgzb_fahuosj(Object atzfahuoxxgzb_fahuosj){
				this.atzfahuoxxgzb_fahuosj = atzfahuoxxgzb_fahuosj;
			}
			
	  		public Object getAtzfahuoxxgzb_fahuosj(){
	  			return atzfahuoxxgzb_fahuosj;
	  		}
  		  		
  							public void setAtzfahuoxxgzb_fahuosj1(Object atzfahuoxxgzb_fahuosj1){
				this.atzfahuoxxgzb_fahuosj1 = atzfahuoxxgzb_fahuosj1;
			}
			
	  		public Object getAtzfahuoxxgzb_fahuosj1(){
	  			return atzfahuoxxgzb_fahuosj1;
	  		}
		  		
  						public void setAtzfahuoxxgzb_fahuotzdh(Object atzfahuoxxgzb_fahuotzdh){
				this.atzfahuoxxgzb_fahuotzdh = atzfahuoxxgzb_fahuotzdh;
			}
			
	  		public Object getAtzfahuoxxgzb_fahuotzdh(){
	  			return atzfahuoxxgzb_fahuotzdh;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_hetongbh(Object atzfahuoxxgzb_hetongbh){
				this.atzfahuoxxgzb_hetongbh = atzfahuoxxgzb_hetongbh;
			}
			
	  		public Object getAtzfahuoxxgzb_hetongbh(){
	  			return atzfahuoxxgzb_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_hetongmc(Object atzfahuoxxgzb_hetongmc){
				this.atzfahuoxxgzb_hetongmc = atzfahuoxxgzb_hetongmc;
			}
			
	  		public Object getAtzfahuoxxgzb_hetongmc(){
	  			return atzfahuoxxgzb_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_wuliaobm(Object atzfahuoxxgzb_wuliaobm){
				this.atzfahuoxxgzb_wuliaobm = atzfahuoxxgzb_wuliaobm;
			}
			
	  		public Object getAtzfahuoxxgzb_wuliaobm(){
	  			return atzfahuoxxgzb_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_wuliaoms(Object atzfahuoxxgzb_wuliaoms){
				this.atzfahuoxxgzb_wuliaoms = atzfahuoxxgzb_wuliaoms;
			}
			
	  		public Object getAtzfahuoxxgzb_wuliaoms(){
	  			return atzfahuoxxgzb_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_sn(Object atzfahuoxxgzb_sn){
				this.atzfahuoxxgzb_sn = atzfahuoxxgzb_sn;
			}
			
	  		public Object getAtzfahuoxxgzb_sn(){
	  			return atzfahuoxxgzb_sn;
	  		}
  		  		
  				  		
  						public void setAtzfahuoxxgzb_id(Object atzfahuoxxgzb_id){
				this.atzfahuoxxgzb_id = atzfahuoxxgzb_id;
			}
			
	  		public Object getAtzfahuoxxgzb_id(){
	  			return atzfahuoxxgzb_id;
	  		}
  		  		
  				  		
  	  	
  	public static F62d6523600000002z init(DataContextHelper context) {
  		F62d6523600000002z o = new F62d6523600000002z();
									o.setAtzfahuoxxgzb_fahuosj(getValue(context,"atzfahuoxxgzb.fahuosj"));
						
										o.setAtzfahuoxxgzb_fahuosj1(getValue(context,"atzfahuoxxgzb.fahuosj1"));
			  									o.setAtzfahuoxxgzb_fahuotzdh(getValue(context,"atzfahuoxxgzb.fahuotzdh"));
						
						  									o.setAtzfahuoxxgzb_hetongbh(getValue(context,"atzfahuoxxgzb.hetongbh"));
						
						  									o.setAtzfahuoxxgzb_hetongmc(getValue(context,"atzfahuoxxgzb.hetongmc"));
						
						  									o.setAtzfahuoxxgzb_wuliaobm(getValue(context,"atzfahuoxxgzb.wuliaobm"));
						
						  									o.setAtzfahuoxxgzb_wuliaoms(getValue(context,"atzfahuoxxgzb.wuliaoms"));
						
						  									o.setAtzfahuoxxgzb_sn(getValue(context,"atzfahuoxxgzb.sn"));
						
						  									o.setAtzfahuoxxgzb_id(getValue(context,"atzfahuoxxgzb.id"));
						
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