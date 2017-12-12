/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:04.089
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fd337730700000006z{

	
						private Object atzscjh_bianhao;
			
				
										private Object atzscrw_bianhao;
			
				
										private Object atzscjh_jihuaqsrq;
			
				
							private Object atzscjh_jihuaqsrq1;
								private Object atzscph_pihao;
			
				
										private Object atzscjh_id;
			
				
										private Object atzscph_id;
			
				
										private Object atzscrw_id;
			
				
					
						public void setAtzscjh_bianhao(Object atzscjh_bianhao){
				this.atzscjh_bianhao = atzscjh_bianhao;
			}
			
	  		public Object getAtzscjh_bianhao(){
	  			return atzscjh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzscrw_bianhao(Object atzscrw_bianhao){
				this.atzscrw_bianhao = atzscrw_bianhao;
			}
			
	  		public Object getAtzscrw_bianhao(){
	  			return atzscrw_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzscjh_jihuaqsrq(Object atzscjh_jihuaqsrq){
				this.atzscjh_jihuaqsrq = atzscjh_jihuaqsrq;
			}
			
	  		public Object getAtzscjh_jihuaqsrq(){
	  			return atzscjh_jihuaqsrq;
	  		}
  		  		
  							public void setAtzscjh_jihuaqsrq1(Object atzscjh_jihuaqsrq1){
				this.atzscjh_jihuaqsrq1 = atzscjh_jihuaqsrq1;
			}
			
	  		public Object getAtzscjh_jihuaqsrq1(){
	  			return atzscjh_jihuaqsrq1;
	  		}
		  		
  						public void setAtzscph_pihao(Object atzscph_pihao){
				this.atzscph_pihao = atzscph_pihao;
			}
			
	  		public Object getAtzscph_pihao(){
	  			return atzscph_pihao;
	  		}
  		  		
  				  		
  						public void setAtzscjh_id(Object atzscjh_id){
				this.atzscjh_id = atzscjh_id;
			}
			
	  		public Object getAtzscjh_id(){
	  			return atzscjh_id;
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
  		  		
  				  		
  	  	
  	public static Fd337730700000006z init(DataContextHelper context) {
  		Fd337730700000006z o = new Fd337730700000006z();
									o.setAtzscjh_bianhao(getValue(context,"atzscjh.bianhao"));
						
						  									o.setAtzscrw_bianhao(getValue(context,"atzscrw.bianhao"));
						
						  									o.setAtzscjh_jihuaqsrq(getValue(context,"atzscjh.jihuaqsrq"));
						
										o.setAtzscjh_jihuaqsrq1(getValue(context,"atzscjh.jihuaqsrq1"));
			  									o.setAtzscph_pihao(getValue(context,"atzscph.pihao"));
						
						  									o.setAtzscjh_id(getValue(context,"atzscjh.id"));
						
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