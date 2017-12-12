/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:06.645
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe1a854c800000003z{

	
						private Object atzzhengjicsjl_sn;
			
				
										private Object atzzhengjicsjl_chanpinid;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzzhengjicsjl_ceshiry;
			
				
										private Object atzzhengjicsjl_ceshirq;
			
				
							private Object atzzhengjicsjl_ceshirq1;
								private Object atzwuliaojcxx_id;
			
				
										private Object atzzhengjicsjl_id;
			
				
					
						public void setAtzzhengjicsjl_sn(Object atzzhengjicsjl_sn){
				this.atzzhengjicsjl_sn = atzzhengjicsjl_sn;
			}
			
	  		public Object getAtzzhengjicsjl_sn(){
	  			return atzzhengjicsjl_sn;
	  		}
  		  		
  				  		
  						public void setAtzzhengjicsjl_chanpinid(Object atzzhengjicsjl_chanpinid){
				this.atzzhengjicsjl_chanpinid = atzzhengjicsjl_chanpinid;
			}
			
	  		public Object getAtzzhengjicsjl_chanpinid(){
	  			return atzzhengjicsjl_chanpinid;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzzhengjicsjl_ceshiry(Object atzzhengjicsjl_ceshiry){
				this.atzzhengjicsjl_ceshiry = atzzhengjicsjl_ceshiry;
			}
			
	  		public Object getAtzzhengjicsjl_ceshiry(){
	  			return atzzhengjicsjl_ceshiry;
	  		}
  		  		
  				  		
  						public void setAtzzhengjicsjl_ceshirq(Object atzzhengjicsjl_ceshirq){
				this.atzzhengjicsjl_ceshirq = atzzhengjicsjl_ceshirq;
			}
			
	  		public Object getAtzzhengjicsjl_ceshirq(){
	  			return atzzhengjicsjl_ceshirq;
	  		}
  		  		
  							public void setAtzzhengjicsjl_ceshirq1(Object atzzhengjicsjl_ceshirq1){
				this.atzzhengjicsjl_ceshirq1 = atzzhengjicsjl_ceshirq1;
			}
			
	  		public Object getAtzzhengjicsjl_ceshirq1(){
	  			return atzzhengjicsjl_ceshirq1;
	  		}
		  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzzhengjicsjl_id(Object atzzhengjicsjl_id){
				this.atzzhengjicsjl_id = atzzhengjicsjl_id;
			}
			
	  		public Object getAtzzhengjicsjl_id(){
	  			return atzzhengjicsjl_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe1a854c800000003z init(DataContextHelper context) {
  		Fe1a854c800000003z o = new Fe1a854c800000003z();
									o.setAtzzhengjicsjl_sn(getValue(context,"atzzhengjicsjl.sn"));
						
						  									o.setAtzzhengjicsjl_chanpinid(getValue(context,"atzchanpin.id"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzzhengjicsjl_ceshiry(getValue(context,"atzzhengjicsjl.ceshiry"));
						
						  									o.setAtzzhengjicsjl_ceshirq(getValue(context,"atzzhengjicsjl.ceshirq"));
						
										o.setAtzzhengjicsjl_ceshirq1(getValue(context,"atzzhengjicsjl.ceshirq1"));
			  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzzhengjicsjl_id(getValue(context,"atzzhengjicsjl.id"));
						
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