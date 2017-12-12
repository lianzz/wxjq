/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:56:54.763
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fc1ea90b40000001bz{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzwuliaogg_ggqsccj;
			
				
										private Object atzshengchancj_changjiamc;
			
				
										private Object atzshengchancj_changjiaxh;
			
				
										private Object atzwuliaogg_danjuzt;
			
				
										private Object atzshengchancj_id;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzwuliaogg_id;
			
				
					
						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaogg_ggqsccj(Object atzwuliaogg_ggqsccj){
				this.atzwuliaogg_ggqsccj = atzwuliaogg_ggqsccj;
			}
			
	  		public Object getAtzwuliaogg_ggqsccj(){
	  			return atzwuliaogg_ggqsccj;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_changjiamc(Object atzshengchancj_changjiamc){
				this.atzshengchancj_changjiamc = atzshengchancj_changjiamc;
			}
			
	  		public Object getAtzshengchancj_changjiamc(){
	  			return atzshengchancj_changjiamc;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_changjiaxh(Object atzshengchancj_changjiaxh){
				this.atzshengchancj_changjiaxh = atzshengchancj_changjiaxh;
			}
			
	  		public Object getAtzshengchancj_changjiaxh(){
	  			return atzshengchancj_changjiaxh;
	  		}
  		  		
  				  		
  						public void setAtzwuliaogg_danjuzt(Object atzwuliaogg_danjuzt){
				this.atzwuliaogg_danjuzt = atzwuliaogg_danjuzt;
			}
			
	  		public Object getAtzwuliaogg_danjuzt(){
	  			return atzwuliaogg_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzshengchancj_id(Object atzshengchancj_id){
				this.atzshengchancj_id = atzshengchancj_id;
			}
			
	  		public Object getAtzshengchancj_id(){
	  			return atzshengchancj_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaogg_id(Object atzwuliaogg_id){
				this.atzwuliaogg_id = atzwuliaogg_id;
			}
			
	  		public Object getAtzwuliaogg_id(){
	  			return atzwuliaogg_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fc1ea90b40000001bz init(DataContextHelper context) {
  		Fc1ea90b40000001bz o = new Fc1ea90b40000001bz();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzwuliaogg_ggqsccj(getValue(context,"atzshengchancj.id"));
						
						  									o.setAtzshengchancj_changjiamc(getValue(context,"atzshengchancj.changjiamc"));
						
						  									o.setAtzshengchancj_changjiaxh(getValue(context,"atzshengchancj.changjiaxh"));
						
						  									o.setAtzwuliaogg_danjuzt(getValue(context,"atzwuliaogg.danjuzt"));
						
						  									o.setAtzshengchancj_id(getValue(context,"atzshengchancj.id"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzwuliaogg_id(getValue(context,"atzwuliaogg.id"));
						
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