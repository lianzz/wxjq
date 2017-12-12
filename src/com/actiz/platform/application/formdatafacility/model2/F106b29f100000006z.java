/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:02:43.686
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F106b29f100000006z{

	
						private Object atzweibaosbsqd_bianhao;
			
				
										private Object atzweibaosbsqd_linshibh;
			
				
										private Object atzweibaosbsqd_kehuid;
			
				
										private Object atzweibaosbsqd_shenqingr;
			
				
										private Object atzweibaosbsqd_hetong;
			
				
										private Object atzweibaosbsqd_xitong;
			
				
										private Object atzweibaosbsqd_id;
			
				
					
						public void setAtzweibaosbsqd_bianhao(Object atzweibaosbsqd_bianhao){
				this.atzweibaosbsqd_bianhao = atzweibaosbsqd_bianhao;
			}
			
	  		public Object getAtzweibaosbsqd_bianhao(){
	  			return atzweibaosbsqd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_linshibh(Object atzweibaosbsqd_linshibh){
				this.atzweibaosbsqd_linshibh = atzweibaosbsqd_linshibh;
			}
			
	  		public Object getAtzweibaosbsqd_linshibh(){
	  			return atzweibaosbsqd_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_kehuid(Object atzweibaosbsqd_kehuid){
				this.atzweibaosbsqd_kehuid = atzweibaosbsqd_kehuid;
			}
			
	  		public Object getAtzweibaosbsqd_kehuid(){
	  			return atzweibaosbsqd_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_shenqingr(Object atzweibaosbsqd_shenqingr){
				this.atzweibaosbsqd_shenqingr = atzweibaosbsqd_shenqingr;
			}
			
	  		public Object getAtzweibaosbsqd_shenqingr(){
	  			return atzweibaosbsqd_shenqingr;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_hetong(Object atzweibaosbsqd_hetong){
				this.atzweibaosbsqd_hetong = atzweibaosbsqd_hetong;
			}
			
	  		public Object getAtzweibaosbsqd_hetong(){
	  			return atzweibaosbsqd_hetong;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_xitong(Object atzweibaosbsqd_xitong){
				this.atzweibaosbsqd_xitong = atzweibaosbsqd_xitong;
			}
			
	  		public Object getAtzweibaosbsqd_xitong(){
	  			return atzweibaosbsqd_xitong;
	  		}
  		  		
  				  		
  						public void setAtzweibaosbsqd_id(Object atzweibaosbsqd_id){
				this.atzweibaosbsqd_id = atzweibaosbsqd_id;
			}
			
	  		public Object getAtzweibaosbsqd_id(){
	  			return atzweibaosbsqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F106b29f100000006z init(DataContextHelper context) {
  		F106b29f100000006z o = new F106b29f100000006z();
									o.setAtzweibaosbsqd_bianhao(getValue(context,"atzweibaosbsqd.bianhao"));
						
						  									o.setAtzweibaosbsqd_linshibh(getValue(context,"atzweibaosbsqd.linshibh"));
						
						  									o.setAtzweibaosbsqd_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzweibaosbsqd_shenqingr(getValue(context,"atzweibaosbsqd.shenqingr"));
						
						  									o.setAtzweibaosbsqd_hetong(getValue(context,"atzhetong.id"));
						
						  									o.setAtzweibaosbsqd_xitong(getValue(context,"atzkehuxtxx.id"));
						
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