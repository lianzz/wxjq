/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:05:27.579
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F302957bf00000001z{

	
						private Object atzweibaosbsqd_bianhao;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzweibaosbsqd_id;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzweibaosbsqd_bianhao(Object atzweibaosbsqd_bianhao){
				this.atzweibaosbsqd_bianhao = atzweibaosbsqd_bianhao;
			}
			
	  		public Object getAtzweibaosbsqd_bianhao(){
	  			return atzweibaosbsqd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_id(Object atzweibaosbsqd_id){
				this.atzweibaosbsqd_id = atzweibaosbsqd_id;
			}
			
	  		public Object getAtzweibaosbsqd_id(){
	  			return atzweibaosbsqd_id;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F302957bf00000001z init(DataContextHelper context) {
  		F302957bf00000001z o = new F302957bf00000001z();
									o.setAtzweibaosbsqd_bianhao(getValue(context,"atzweibaosbsqd.bianhao"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzweibaosbsqd_id(getValue(context,"atzweibaosbsqd.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
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