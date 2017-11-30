/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:19.988
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F7cbdd3ba00000004z{

	
						private Object atzweibaosbsqd_kehuid;
			
				
										private Object atzweibaosbsqd_shenqingsj;
			
				
							private Object atzweibaosbsqd_shenqingsj1;
								private Object atzweibaosbsqd_id;
			
				
					
						public void setAtzweibaosbsqd_kehuid(Object atzweibaosbsqd_kehuid){
				this.atzweibaosbsqd_kehuid = atzweibaosbsqd_kehuid;
			}
			
	  		public Object getAtzweibaosbsqd_kehuid(){
	  			return atzweibaosbsqd_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_shenqingsj(Object atzweibaosbsqd_shenqingsj){
				this.atzweibaosbsqd_shenqingsj = atzweibaosbsqd_shenqingsj;
			}
			
	  		public Object getAtzweibaosbsqd_shenqingsj(){
	  			return atzweibaosbsqd_shenqingsj;
	  		}
  		  		
  							public void setAtzweibaosbsqd_shenqingsj1(Object atzweibaosbsqd_shenqingsj1){
				this.atzweibaosbsqd_shenqingsj1 = atzweibaosbsqd_shenqingsj1;
			}
			
	  		public Object getAtzweibaosbsqd_shenqingsj1(){
	  			return atzweibaosbsqd_shenqingsj1;
	  		}
		  		
  						public void setAtzweibaosbsqd_id(Object atzweibaosbsqd_id){
				this.atzweibaosbsqd_id = atzweibaosbsqd_id;
			}
			
	  		public Object getAtzweibaosbsqd_id(){
	  			return atzweibaosbsqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F7cbdd3ba00000004z init(DataContextHelper context) {
  		F7cbdd3ba00000004z o = new F7cbdd3ba00000004z();
									o.setAtzweibaosbsqd_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzweibaosbsqd_shenqingsj(getValue(context,"atzweibaosbsqd.shenqingsj"));
						
										o.setAtzweibaosbsqd_shenqingsj1(getValue(context,"atzweibaosbsqd.shenqingsj1"));
			  									o.setAtzweibaosbsqd_id(getValue(context,"atzweibaosbsqd.id"));
						
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