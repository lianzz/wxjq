/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:48:14.723
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F55f5e3be00000007z{

	
						private Object atzxiangmu_xiangmubh;
			
				
										private Object atzxiangmu_xiangmumc;
			
				
										private Object atzxiangmu_guishucbzx;
			
				
										private Object atzxiangmu_id;
			
				
					
						public void setAtzxiangmu_xiangmubh(Object atzxiangmu_xiangmubh){
				this.atzxiangmu_xiangmubh = atzxiangmu_xiangmubh;
			}
			
	  		public Object getAtzxiangmu_xiangmubh(){
	  			return atzxiangmu_xiangmubh;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_xiangmumc(Object atzxiangmu_xiangmumc){
				this.atzxiangmu_xiangmumc = atzxiangmu_xiangmumc;
			}
			
	  		public Object getAtzxiangmu_xiangmumc(){
	  			return atzxiangmu_xiangmumc;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_guishucbzx(Object atzxiangmu_guishucbzx){
				this.atzxiangmu_guishucbzx = atzxiangmu_guishucbzx;
			}
			
	  		public Object getAtzxiangmu_guishucbzx(){
	  			return atzxiangmu_guishucbzx;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_id(Object atzxiangmu_id){
				this.atzxiangmu_id = atzxiangmu_id;
			}
			
	  		public Object getAtzxiangmu_id(){
	  			return atzxiangmu_id;
	  		}
  		  		
  				  		
  	  	
  	public static F55f5e3be00000007z init(DataContextHelper context) {
  		F55f5e3be00000007z o = new F55f5e3be00000007z();
									o.setAtzxiangmu_xiangmubh(getValue(context,"atzxiangmu.xiangmubh"));
						
						  									o.setAtzxiangmu_xiangmumc(getValue(context,"atzxiangmu.xiangmumc"));
						
						  									o.setAtzxiangmu_guishucbzx(getValue(context,"atzxiangmu.guishucbzx"));
						
						  									o.setAtzxiangmu_id(getValue(context,"atzxiangmu.id"));
						
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