/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:53.063
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Feb8a773d00000001z{

	
						private Object atzhetongdb_chuhetong;
			
				
										private Object atzhetongdb_ruhetong;
			
				
										private Object atzhetongdb_dblx;
			
				
										private Object atzhetongdb_id;
			
				
					
						public void setAtzhetongdb_chuhetong(Object atzhetongdb_chuhetong){
				this.atzhetongdb_chuhetong = atzhetongdb_chuhetong;
			}
			
	  		public Object getAtzhetongdb_chuhetong(){
	  			return atzhetongdb_chuhetong;
	  		}
  		  		
  				  		
  						public void setAtzhetongdb_ruhetong(Object atzhetongdb_ruhetong){
				this.atzhetongdb_ruhetong = atzhetongdb_ruhetong;
			}
			
	  		public Object getAtzhetongdb_ruhetong(){
	  			return atzhetongdb_ruhetong;
	  		}
  		  		
  				  		
  						public void setAtzhetongdb_dblx(Object atzhetongdb_dblx){
				this.atzhetongdb_dblx = atzhetongdb_dblx;
			}
			
	  		public Object getAtzhetongdb_dblx(){
	  			return atzhetongdb_dblx;
	  		}
  		  		
  				  		
  						public void setAtzhetongdb_id(Object atzhetongdb_id){
				this.atzhetongdb_id = atzhetongdb_id;
			}
			
	  		public Object getAtzhetongdb_id(){
	  			return atzhetongdb_id;
	  		}
  		  		
  				  		
  	  	
  	public static Feb8a773d00000001z init(DataContextHelper context) {
  		Feb8a773d00000001z o = new Feb8a773d00000001z();
									o.setAtzhetongdb_chuhetong(getValue(context,"atzhetong.id"));
						
						  									o.setAtzhetongdb_ruhetong(getValue(context,"atzhetong.id"));
						
						  									o.setAtzhetongdb_dblx(getValue(context,"atzhetongdb.dblx"));
						
						  									o.setAtzhetongdb_id(getValue(context,"atzhetongdb.id"));
						
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