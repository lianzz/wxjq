/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:59:53.367
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F88a293bb00000001z{

	
						private Object atzkuwei_kuweimc;
			
				
										private Object atzwuliaojcxx_wuliaomc;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzchurukd_churukrq;
			
				
							private Object atzchurukd_churukrq1;
								private Object atzwuliaojcxx_id;
			
				
										private Object atzchurukd_id;
			
				
										private Object atzkuwei_id;
			
				
										private Object atzchurukdmx_id;
			
				
					
						public void setAtzkuwei_kuweimc(Object atzkuwei_kuweimc){
				this.atzkuwei_kuweimc = atzkuwei_kuweimc;
			}
			
	  		public Object getAtzkuwei_kuweimc(){
	  			return atzkuwei_kuweimc;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaomc(Object atzwuliaojcxx_wuliaomc){
				this.atzwuliaojcxx_wuliaomc = atzwuliaojcxx_wuliaomc;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaomc(){
	  			return atzwuliaojcxx_wuliaomc;
	  		}
  		  		
  				  		
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
  		  		
  				  		
  						public void setAtzchurukd_churukrq(Object atzchurukd_churukrq){
				this.atzchurukd_churukrq = atzchurukd_churukrq;
			}
			
	  		public Object getAtzchurukd_churukrq(){
	  			return atzchurukd_churukrq;
	  		}
  		  		
  							public void setAtzchurukd_churukrq1(Object atzchurukd_churukrq1){
				this.atzchurukd_churukrq1 = atzchurukd_churukrq1;
			}
			
	  		public Object getAtzchurukd_churukrq1(){
	  			return atzchurukd_churukrq1;
	  		}
		  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzchurukd_id(Object atzchurukd_id){
				this.atzchurukd_id = atzchurukd_id;
			}
			
	  		public Object getAtzchurukd_id(){
	  			return atzchurukd_id;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_id(Object atzkuwei_id){
				this.atzkuwei_id = atzkuwei_id;
			}
			
	  		public Object getAtzkuwei_id(){
	  			return atzkuwei_id;
	  		}
  		  		
  				  		
  						public void setAtzchurukdmx_id(Object atzchurukdmx_id){
				this.atzchurukdmx_id = atzchurukdmx_id;
			}
			
	  		public Object getAtzchurukdmx_id(){
	  			return atzchurukdmx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F88a293bb00000001z init(DataContextHelper context) {
  		F88a293bb00000001z o = new F88a293bb00000001z();
									o.setAtzkuwei_kuweimc(getValue(context,"atzkuwei.kuweimc"));
						
						  									o.setAtzwuliaojcxx_wuliaomc(getValue(context,"atzwuliaojcxx.wuliaomc"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzchurukd_churukrq(getValue(context,"atzchurukd.churukrq"));
						
										o.setAtzchurukd_churukrq1(getValue(context,"atzchurukd.churukrq1"));
			  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzchurukd_id(getValue(context,"atzchurukd.id"));
						
						  									o.setAtzkuwei_id(getValue(context,"atzkuwei.id"));
						
						  									o.setAtzchurukdmx_id(getValue(context,"atzchurukdmx.id"));
						
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