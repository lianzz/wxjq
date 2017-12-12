/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:06:41.225
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F3914207500000001z{

	
						private Object atzlinshiwlsq_bianhao;
			
				
										private Object atzlinshiwlsq_xiangmuid;
			
				
										private Object atzlinshiwlsq_shengqr;
			
				
										private Object atzlinshiwlsq_shenqrq;
			
				
							private Object atzlinshiwlsq_shenqrq1;
								private Object atzlinshiwlsq_danjuzt;
			
				
										private Object atzlinshiwlsq_id;
			
				
					
						public void setAtzlinshiwlsq_bianhao(Object atzlinshiwlsq_bianhao){
				this.atzlinshiwlsq_bianhao = atzlinshiwlsq_bianhao;
			}
			
	  		public Object getAtzlinshiwlsq_bianhao(){
	  			return atzlinshiwlsq_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzlinshiwlsq_xiangmuid(Object atzlinshiwlsq_xiangmuid){
				this.atzlinshiwlsq_xiangmuid = atzlinshiwlsq_xiangmuid;
			}
			
	  		public Object getAtzlinshiwlsq_xiangmuid(){
	  			return atzlinshiwlsq_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzlinshiwlsq_shengqr(Object atzlinshiwlsq_shengqr){
				this.atzlinshiwlsq_shengqr = atzlinshiwlsq_shengqr;
			}
			
	  		public Object getAtzlinshiwlsq_shengqr(){
	  			return atzlinshiwlsq_shengqr;
	  		}
  		  		
  				  		
  						public void setAtzlinshiwlsq_shenqrq(Object atzlinshiwlsq_shenqrq){
				this.atzlinshiwlsq_shenqrq = atzlinshiwlsq_shenqrq;
			}
			
	  		public Object getAtzlinshiwlsq_shenqrq(){
	  			return atzlinshiwlsq_shenqrq;
	  		}
  		  		
  							public void setAtzlinshiwlsq_shenqrq1(Object atzlinshiwlsq_shenqrq1){
				this.atzlinshiwlsq_shenqrq1 = atzlinshiwlsq_shenqrq1;
			}
			
	  		public Object getAtzlinshiwlsq_shenqrq1(){
	  			return atzlinshiwlsq_shenqrq1;
	  		}
		  		
  						public void setAtzlinshiwlsq_danjuzt(Object atzlinshiwlsq_danjuzt){
				this.atzlinshiwlsq_danjuzt = atzlinshiwlsq_danjuzt;
			}
			
	  		public Object getAtzlinshiwlsq_danjuzt(){
	  			return atzlinshiwlsq_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzlinshiwlsq_id(Object atzlinshiwlsq_id){
				this.atzlinshiwlsq_id = atzlinshiwlsq_id;
			}
			
	  		public Object getAtzlinshiwlsq_id(){
	  			return atzlinshiwlsq_id;
	  		}
  		  		
  				  		
  	  	
  	public static F3914207500000001z init(DataContextHelper context) {
  		F3914207500000001z o = new F3914207500000001z();
									o.setAtzlinshiwlsq_bianhao(getValue(context,"atzlinshiwlsq.bianhao"));
						
						  									o.setAtzlinshiwlsq_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzlinshiwlsq_shengqr(getValue(context,"atzlinshiwlsq.shengqr"));
						
						  									o.setAtzlinshiwlsq_shenqrq(getValue(context,"atzlinshiwlsq.shenqrq"));
						
										o.setAtzlinshiwlsq_shenqrq1(getValue(context,"atzlinshiwlsq.shenqrq1"));
			  									o.setAtzlinshiwlsq_danjuzt(getValue(context,"atzlinshiwlsq.danjuzt"));
						
						  									o.setAtzlinshiwlsq_id(getValue(context,"atzlinshiwlsq.id"));
						
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