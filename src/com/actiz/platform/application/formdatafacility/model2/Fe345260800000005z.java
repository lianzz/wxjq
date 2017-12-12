/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:40.768
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fe345260800000005z{

	
						private Object atzjianyanx_xiangmu;
			
				
										private Object atzjianyanx_xiangmufl;
			
				
										private Object atzjianyanx_id;
			
				
					
						public void setAtzjianyanx_xiangmu(Object atzjianyanx_xiangmu){
				this.atzjianyanx_xiangmu = atzjianyanx_xiangmu;
			}
			
	  		public Object getAtzjianyanx_xiangmu(){
	  			return atzjianyanx_xiangmu;
	  		}
  		  		
  				  		
  						public void setAtzjianyanx_xiangmufl(Object atzjianyanx_xiangmufl){
				this.atzjianyanx_xiangmufl = atzjianyanx_xiangmufl;
			}
			
	  		public Object getAtzjianyanx_xiangmufl(){
	  			return atzjianyanx_xiangmufl;
	  		}
  		  		
  				  		
  						public void setAtzjianyanx_id(Object atzjianyanx_id){
				this.atzjianyanx_id = atzjianyanx_id;
			}
			
	  		public Object getAtzjianyanx_id(){
	  			return atzjianyanx_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fe345260800000005z init(DataContextHelper context) {
  		Fe345260800000005z o = new Fe345260800000005z();
									o.setAtzjianyanx_xiangmu(getValue(context,"atzjianyanx.xiangmu"));
						
						  									o.setAtzjianyanx_xiangmufl(getValue(context,"atzjianyanx.xiangmufl"));
						
						  									o.setAtzjianyanx_id(getValue(context,"atzjianyanx.id"));
						
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