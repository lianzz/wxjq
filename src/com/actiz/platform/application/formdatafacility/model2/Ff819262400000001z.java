/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:05:10.075
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Ff819262400000001z{

	
						private Object atzkaipiaomx_fapiaohm;
			
				
										private Object atzkaipiaomx_kaipiaorq;
			
				
							private Object atzkaipiaomx_kaipiaorq1;
								private Object atzkaipiaomx_kaipiaonr;
			
				
										private Object atzkaipiaomx_id;
			
				
					
						public void setAtzkaipiaomx_fapiaohm(Object atzkaipiaomx_fapiaohm){
				this.atzkaipiaomx_fapiaohm = atzkaipiaomx_fapiaohm;
			}
			
	  		public Object getAtzkaipiaomx_fapiaohm(){
	  			return atzkaipiaomx_fapiaohm;
	  		}
  		  		
  				  		
  						public void setAtzkaipiaomx_kaipiaorq(Object atzkaipiaomx_kaipiaorq){
				this.atzkaipiaomx_kaipiaorq = atzkaipiaomx_kaipiaorq;
			}
			
	  		public Object getAtzkaipiaomx_kaipiaorq(){
	  			return atzkaipiaomx_kaipiaorq;
	  		}
  		  		
  							public void setAtzkaipiaomx_kaipiaorq1(Object atzkaipiaomx_kaipiaorq1){
				this.atzkaipiaomx_kaipiaorq1 = atzkaipiaomx_kaipiaorq1;
			}
			
	  		public Object getAtzkaipiaomx_kaipiaorq1(){
	  			return atzkaipiaomx_kaipiaorq1;
	  		}
		  		
  						public void setAtzkaipiaomx_kaipiaonr(Object atzkaipiaomx_kaipiaonr){
				this.atzkaipiaomx_kaipiaonr = atzkaipiaomx_kaipiaonr;
			}
			
	  		public Object getAtzkaipiaomx_kaipiaonr(){
	  			return atzkaipiaomx_kaipiaonr;
	  		}
  		  		
  				  		
  						public void setAtzkaipiaomx_id(Object atzkaipiaomx_id){
				this.atzkaipiaomx_id = atzkaipiaomx_id;
			}
			
	  		public Object getAtzkaipiaomx_id(){
	  			return atzkaipiaomx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Ff819262400000001z init(DataContextHelper context) {
  		Ff819262400000001z o = new Ff819262400000001z();
									o.setAtzkaipiaomx_fapiaohm(getValue(context,"atzkaipiaomx.fapiaohm"));
						
						  									o.setAtzkaipiaomx_kaipiaorq(getValue(context,"atzkaipiaomx.kaipiaorq"));
						
										o.setAtzkaipiaomx_kaipiaorq1(getValue(context,"atzkaipiaomx.kaipiaorq1"));
			  									o.setAtzkaipiaomx_kaipiaonr(getValue(context,"atzkaipiaomx.kaipiaonr"));
						
						  									o.setAtzkaipiaomx_id(getValue(context,"atzkaipiaomx.id"));
						
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