/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:00:39.182
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa2424c6700000001z{

	
						private Object atzbom_mingcheng;
			
				
										private Object atzbom_banbenh;
			
				
										private Object atzbom_id;
			
				
					
						public void setAtzbom_mingcheng(Object atzbom_mingcheng){
				this.atzbom_mingcheng = atzbom_mingcheng;
			}
			
	  		public Object getAtzbom_mingcheng(){
	  			return atzbom_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzbom_banbenh(Object atzbom_banbenh){
				this.atzbom_banbenh = atzbom_banbenh;
			}
			
	  		public Object getAtzbom_banbenh(){
	  			return atzbom_banbenh;
	  		}
  		  		
  				  		
  						public void setAtzbom_id(Object atzbom_id){
				this.atzbom_id = atzbom_id;
			}
			
	  		public Object getAtzbom_id(){
	  			return atzbom_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa2424c6700000001z init(DataContextHelper context) {
  		Fa2424c6700000001z o = new Fa2424c6700000001z();
									o.setAtzbom_mingcheng(getValue(context,"atzbom.mingcheng"));
						
						  									o.setAtzbom_banbenh(getValue(context,"atzbom.banbenh"));
						
						  									o.setAtzbom_id(getValue(context,"atzbom.id"));
						
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