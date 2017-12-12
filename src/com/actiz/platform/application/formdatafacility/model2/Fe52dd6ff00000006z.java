/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:12:32.479
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe52dd6ff00000006z{

	
						private Object atzkecheng_kechengmc;
			
				
										private Object atzkecheng_kclb;
			
				
										private Object atzkecheng_mxdx;
			
				
										private Object atzkecheng_danjuzt;
			
				
										private Object atzkecheng_id;
			
				
					
						public void setAtzkecheng_kechengmc(Object atzkecheng_kechengmc){
				this.atzkecheng_kechengmc = atzkecheng_kechengmc;
			}
			
	  		public Object getAtzkecheng_kechengmc(){
	  			return atzkecheng_kechengmc;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_kclb(Object atzkecheng_kclb){
				this.atzkecheng_kclb = atzkecheng_kclb;
			}
			
	  		public Object getAtzkecheng_kclb(){
	  			return atzkecheng_kclb;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_mxdx(Object atzkecheng_mxdx){
				this.atzkecheng_mxdx = atzkecheng_mxdx;
			}
			
	  		public Object getAtzkecheng_mxdx(){
	  			return atzkecheng_mxdx;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_danjuzt(Object atzkecheng_danjuzt){
				this.atzkecheng_danjuzt = atzkecheng_danjuzt;
			}
			
	  		public Object getAtzkecheng_danjuzt(){
	  			return atzkecheng_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzkecheng_id(Object atzkecheng_id){
				this.atzkecheng_id = atzkecheng_id;
			}
			
	  		public Object getAtzkecheng_id(){
	  			return atzkecheng_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe52dd6ff00000006z init(DataContextHelper context) {
  		Fe52dd6ff00000006z o = new Fe52dd6ff00000006z();
									o.setAtzkecheng_kechengmc(getValue(context,"atzkecheng.kechengmc"));
						
						  									o.setAtzkecheng_kclb(getValue(context,"atzkecheng.kclb"));
						
						  									o.setAtzkecheng_mxdx(getValue(context,"atzkecheng.mxdx"));
						
						  									o.setAtzkecheng_danjuzt(getValue(context,"atzkecheng.danjuzt"));
						
						  									o.setAtzkecheng_id(getValue(context,"atzkecheng.id"));
						
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