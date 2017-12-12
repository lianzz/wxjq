/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:57:06.935
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe3293fb300000002z{

	
						private Object atzgonggao_zhuti;
			
				
										private Object atzgonggao_neirong;
			
				
										private Object atzgonggao_lurur;
			
				
										private Object atzgonggao_lururq;
			
				
							private Object atzgonggao_lururq1;
								private Object atzgonggao_id;
			
				
					
						public void setAtzgonggao_zhuti(Object atzgonggao_zhuti){
				this.atzgonggao_zhuti = atzgonggao_zhuti;
			}
			
	  		public Object getAtzgonggao_zhuti(){
	  			return atzgonggao_zhuti;
	  		}
  		  		
  				  		
  						public void setAtzgonggao_neirong(Object atzgonggao_neirong){
				this.atzgonggao_neirong = atzgonggao_neirong;
			}
			
	  		public Object getAtzgonggao_neirong(){
	  			return atzgonggao_neirong;
	  		}
  		  		
  				  		
  						public void setAtzgonggao_lurur(Object atzgonggao_lurur){
				this.atzgonggao_lurur = atzgonggao_lurur;
			}
			
	  		public Object getAtzgonggao_lurur(){
	  			return atzgonggao_lurur;
	  		}
  		  		
  				  		
  						public void setAtzgonggao_lururq(Object atzgonggao_lururq){
				this.atzgonggao_lururq = atzgonggao_lururq;
			}
			
	  		public Object getAtzgonggao_lururq(){
	  			return atzgonggao_lururq;
	  		}
  		  		
  							public void setAtzgonggao_lururq1(Object atzgonggao_lururq1){
				this.atzgonggao_lururq1 = atzgonggao_lururq1;
			}
			
	  		public Object getAtzgonggao_lururq1(){
	  			return atzgonggao_lururq1;
	  		}
		  		
  						public void setAtzgonggao_id(Object atzgonggao_id){
				this.atzgonggao_id = atzgonggao_id;
			}
			
	  		public Object getAtzgonggao_id(){
	  			return atzgonggao_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe3293fb300000002z init(DataContextHelper context) {
  		Fe3293fb300000002z o = new Fe3293fb300000002z();
									o.setAtzgonggao_zhuti(getValue(context,"atzgonggao.zhuti"));
						
						  									o.setAtzgonggao_neirong(getValue(context,"atzgonggao.neirong"));
						
						  									o.setAtzgonggao_lurur(getValue(context,"atzgonggao.lurur"));
						
						  									o.setAtzgonggao_lururq(getValue(context,"atzgonggao.lururq"));
						
										o.setAtzgonggao_lururq1(getValue(context,"atzgonggao.lururq1"));
			  									o.setAtzgonggao_id(getValue(context,"atzgonggao.id"));
						
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