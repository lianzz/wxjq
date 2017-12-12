/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:04.729
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F064fdb4c00000003z{

	
						private Object atztoubiao_bianhao;
			
				
										private Object atztoubiao_xsjlxm;
			
				
										private Object atztoubiao_daquid;
			
				
										private Object atztoubiao_id;
			
				
					
						public void setAtztoubiao_bianhao(Object atztoubiao_bianhao){
				this.atztoubiao_bianhao = atztoubiao_bianhao;
			}
			
	  		public Object getAtztoubiao_bianhao(){
	  			return atztoubiao_bianhao;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_xsjlxm(Object atztoubiao_xsjlxm){
				this.atztoubiao_xsjlxm = atztoubiao_xsjlxm;
			}
			
	  		public Object getAtztoubiao_xsjlxm(){
	  			return atztoubiao_xsjlxm;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_daquid(Object atztoubiao_daquid){
				this.atztoubiao_daquid = atztoubiao_daquid;
			}
			
	  		public Object getAtztoubiao_daquid(){
	  			return atztoubiao_daquid;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_id(Object atztoubiao_id){
				this.atztoubiao_id = atztoubiao_id;
			}
			
	  		public Object getAtztoubiao_id(){
	  			return atztoubiao_id;
	  		}
  		  		
  				  		
  	  	
  	public static F064fdb4c00000003z init(DataContextHelper context) {
  		F064fdb4c00000003z o = new F064fdb4c00000003z();
									o.setAtztoubiao_bianhao(getValue(context,"atztoubiao.bianhao"));
						
						  									o.setAtztoubiao_xsjlxm(getValue(context,"atztoubiao.xsjlxm"));
						
						  									o.setAtztoubiao_daquid(getValue(context,"atzdepartment.id"));
						
						  									o.setAtztoubiao_id(getValue(context,"atztoubiao.id"));
						
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