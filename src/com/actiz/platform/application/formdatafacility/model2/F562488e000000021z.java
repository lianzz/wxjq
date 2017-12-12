/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:09:06.971
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F562488e000000021z{

	
						private Object atzkehu_mingchengjj;
			
				
										private Object atzkehu_kehumc;
			
				
										private Object atzkehu_kehulx;
			
				
										private Object atzkehu_kehujd;
			
				
										private Object atzkehu_xiaoshoujl;
			
				
										private Object atzkehu_id;
			
				
					
						public void setAtzkehu_mingchengjj(Object atzkehu_mingchengjj){
				this.atzkehu_mingchengjj = atzkehu_mingchengjj;
			}
			
	  		public Object getAtzkehu_mingchengjj(){
	  			return atzkehu_mingchengjj;
	  		}
  		  		
  				  		
  						public void setAtzkehu_kehumc(Object atzkehu_kehumc){
				this.atzkehu_kehumc = atzkehu_kehumc;
			}
			
	  		public Object getAtzkehu_kehumc(){
	  			return atzkehu_kehumc;
	  		}
  		  		
  				  		
  						public void setAtzkehu_kehulx(Object atzkehu_kehulx){
				this.atzkehu_kehulx = atzkehu_kehulx;
			}
			
	  		public Object getAtzkehu_kehulx(){
	  			return atzkehu_kehulx;
	  		}
  		  		
  				  		
  						public void setAtzkehu_kehujd(Object atzkehu_kehujd){
				this.atzkehu_kehujd = atzkehu_kehujd;
			}
			
	  		public Object getAtzkehu_kehujd(){
	  			return atzkehu_kehujd;
	  		}
  		  		
  				  		
  						public void setAtzkehu_xiaoshoujl(Object atzkehu_xiaoshoujl){
				this.atzkehu_xiaoshoujl = atzkehu_xiaoshoujl;
			}
			
	  		public Object getAtzkehu_xiaoshoujl(){
	  			return atzkehu_xiaoshoujl;
	  		}
  		  		
  				  		
  						public void setAtzkehu_id(Object atzkehu_id){
				this.atzkehu_id = atzkehu_id;
			}
			
	  		public Object getAtzkehu_id(){
	  			return atzkehu_id;
	  		}
  		  		
  				  		
  	  	
  	public static F562488e000000021z init(DataContextHelper context) {
  		F562488e000000021z o = new F562488e000000021z();
									o.setAtzkehu_mingchengjj(getValue(context,"atzkehu.mingchengjj"));
						
						  									o.setAtzkehu_kehumc(getValue(context,"atzkehu.kehumc"));
						
						  									o.setAtzkehu_kehulx(getValue(context,"atzkehu.kehulx"));
						
						  									o.setAtzkehu_kehujd(getValue(context,"atzkehu.kehujd"));
						
						  									o.setAtzkehu_xiaoshoujl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzkehu_id(getValue(context,"atzkehu.id"));
						
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