/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:58:00.242
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe67a9b5500000001z{

	
						private Object atzhuiyiszt_yudingrq;
			
				
							private Object atzhuiyiszt_yudingrq1;
								private Object atzhuiyis_fangjianhm;
			
				
										private Object atzhuiyiszt_id;
			
				
										private Object atzhuiyis_id;
			
				
					
						public void setAtzhuiyiszt_yudingrq(Object atzhuiyiszt_yudingrq){
				this.atzhuiyiszt_yudingrq = atzhuiyiszt_yudingrq;
			}
			
	  		public Object getAtzhuiyiszt_yudingrq(){
	  			return atzhuiyiszt_yudingrq;
	  		}
  		  		
  							public void setAtzhuiyiszt_yudingrq1(Object atzhuiyiszt_yudingrq1){
				this.atzhuiyiszt_yudingrq1 = atzhuiyiszt_yudingrq1;
			}
			
	  		public Object getAtzhuiyiszt_yudingrq1(){
	  			return atzhuiyiszt_yudingrq1;
	  		}
		  		
  						public void setAtzhuiyis_fangjianhm(Object atzhuiyis_fangjianhm){
				this.atzhuiyis_fangjianhm = atzhuiyis_fangjianhm;
			}
			
	  		public Object getAtzhuiyis_fangjianhm(){
	  			return atzhuiyis_fangjianhm;
	  		}
  		  		
  				  		
  						public void setAtzhuiyiszt_id(Object atzhuiyiszt_id){
				this.atzhuiyiszt_id = atzhuiyiszt_id;
			}
			
	  		public Object getAtzhuiyiszt_id(){
	  			return atzhuiyiszt_id;
	  		}
  		  		
  				  		
  						public void setAtzhuiyis_id(Object atzhuiyis_id){
				this.atzhuiyis_id = atzhuiyis_id;
			}
			
	  		public Object getAtzhuiyis_id(){
	  			return atzhuiyis_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe67a9b5500000001z init(DataContextHelper context) {
  		Fe67a9b5500000001z o = new Fe67a9b5500000001z();
									o.setAtzhuiyiszt_yudingrq(getValue(context,"atzhuiyiszt.yudingrq"));
						
										o.setAtzhuiyiszt_yudingrq1(getValue(context,"atzhuiyiszt.yudingrq1"));
			  									o.setAtzhuiyis_fangjianhm(getValue(context,"atzhuiyis.fangjianhm"));
						
						  									o.setAtzhuiyiszt_id(getValue(context,"atzhuiyiszt.id"));
						
						  									o.setAtzhuiyis_id(getValue(context,"atzhuiyis.id"));
						
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