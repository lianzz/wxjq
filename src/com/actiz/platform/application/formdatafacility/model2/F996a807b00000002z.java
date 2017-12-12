/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:47.817
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F996a807b00000002z{

	
						private Object atzchurukd_bianhao;
			
				
										private Object atzcangku_cangkubh;
			
				
										private Object atzchurukd_churukyy;
			
				
										private Object atzchurukdmx_wuliaobm;
			
				
										private Object atzchurukdmx_sn;
			
				
										private Object atzchurukd_churukr;
			
				
										private Object atzchurukd_id;
			
				
										private Object atzchurukdmx_id;
			
				
										private Object atzcangku_id;
			
				
					
						public void setAtzchurukd_bianhao(Object atzchurukd_bianhao){
				this.atzchurukd_bianhao = atzchurukd_bianhao;
			}
			
	  		public Object getAtzchurukd_bianhao(){
	  			return atzchurukd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcangku_cangkubh(Object atzcangku_cangkubh){
				this.atzcangku_cangkubh = atzcangku_cangkubh;
			}
			
	  		public Object getAtzcangku_cangkubh(){
	  			return atzcangku_cangkubh;
	  		}
  		  		
  				  		
  						public void setAtzchurukd_churukyy(Object atzchurukd_churukyy){
				this.atzchurukd_churukyy = atzchurukd_churukyy;
			}
			
	  		public Object getAtzchurukd_churukyy(){
	  			return atzchurukd_churukyy;
	  		}
  		  		
  				  		
  						public void setAtzchurukdmx_wuliaobm(Object atzchurukdmx_wuliaobm){
				this.atzchurukdmx_wuliaobm = atzchurukdmx_wuliaobm;
			}
			
	  		public Object getAtzchurukdmx_wuliaobm(){
	  			return atzchurukdmx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzchurukdmx_sn(Object atzchurukdmx_sn){
				this.atzchurukdmx_sn = atzchurukdmx_sn;
			}
			
	  		public Object getAtzchurukdmx_sn(){
	  			return atzchurukdmx_sn;
	  		}
  		  		
  				  		
  						public void setAtzchurukd_churukr(Object atzchurukd_churukr){
				this.atzchurukd_churukr = atzchurukd_churukr;
			}
			
	  		public Object getAtzchurukd_churukr(){
	  			return atzchurukd_churukr;
	  		}
  		  		
  				  		
  						public void setAtzchurukd_id(Object atzchurukd_id){
				this.atzchurukd_id = atzchurukd_id;
			}
			
	  		public Object getAtzchurukd_id(){
	  			return atzchurukd_id;
	  		}
  		  		
  				  		
  						public void setAtzchurukdmx_id(Object atzchurukdmx_id){
				this.atzchurukdmx_id = atzchurukdmx_id;
			}
			
	  		public Object getAtzchurukdmx_id(){
	  			return atzchurukdmx_id;
	  		}
  		  		
  				  		
  						public void setAtzcangku_id(Object atzcangku_id){
				this.atzcangku_id = atzcangku_id;
			}
			
	  		public Object getAtzcangku_id(){
	  			return atzcangku_id;
	  		}
  		  		
  				  		
  	  	
  	public static F996a807b00000002z init(DataContextHelper context) {
  		F996a807b00000002z o = new F996a807b00000002z();
									o.setAtzchurukd_bianhao(getValue(context,"atzchurukd.bianhao"));
						
						  									o.setAtzcangku_cangkubh(getValue(context,"atzcangku.cangkubh"));
						
						  									o.setAtzchurukd_churukyy(getValue(context,"atzchurukd.churukyy"));
						
						  									o.setAtzchurukdmx_wuliaobm(getValue(context,"atzchurukdmx.wuliaobm"));
						
						  									o.setAtzchurukdmx_sn(getValue(context,"atzchurukdmx.sn"));
						
						  									o.setAtzchurukd_churukr(getValue(context,"atzchurukd.churukr"));
						
						  									o.setAtzchurukd_id(getValue(context,"atzchurukd.id"));
						
						  									o.setAtzchurukdmx_id(getValue(context,"atzchurukdmx.id"));
						
						  									o.setAtzcangku_id(getValue(context,"atzcangku.id"));
						
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