/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:57:38.207
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa023459300000015z{

	
						private Object atzhetongyj_yijiaoqjl;
			
				
										private Object atzhetongyj_yijiaohjl;
			
				
										private Object atzhetongyj_zhixingzt;
			
				
										private Object atzhetongyj_id;
			
				
					
						public void setAtzhetongyj_yijiaoqjl(Object atzhetongyj_yijiaoqjl){
				this.atzhetongyj_yijiaoqjl = atzhetongyj_yijiaoqjl;
			}
			
	  		public Object getAtzhetongyj_yijiaoqjl(){
	  			return atzhetongyj_yijiaoqjl;
	  		}
  		  		
  				  		
  						public void setAtzhetongyj_yijiaohjl(Object atzhetongyj_yijiaohjl){
				this.atzhetongyj_yijiaohjl = atzhetongyj_yijiaohjl;
			}
			
	  		public Object getAtzhetongyj_yijiaohjl(){
	  			return atzhetongyj_yijiaohjl;
	  		}
  		  		
  				  		
  						public void setAtzhetongyj_zhixingzt(Object atzhetongyj_zhixingzt){
				this.atzhetongyj_zhixingzt = atzhetongyj_zhixingzt;
			}
			
	  		public Object getAtzhetongyj_zhixingzt(){
	  			return atzhetongyj_zhixingzt;
	  		}
  		  		
  				  		
  						public void setAtzhetongyj_id(Object atzhetongyj_id){
				this.atzhetongyj_id = atzhetongyj_id;
			}
			
	  		public Object getAtzhetongyj_id(){
	  			return atzhetongyj_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa023459300000015z init(DataContextHelper context) {
  		Fa023459300000015z o = new Fa023459300000015z();
									o.setAtzhetongyj_yijiaoqjl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzhetongyj_yijiaohjl(getValue(context,"atzemployee.id"));
						
						  									o.setAtzhetongyj_zhixingzt(getValue(context,"atzhetongyj.zhixingzt"));
						
						  									o.setAtzhetongyj_id(getValue(context,"atzhetongyj.id"));
						
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