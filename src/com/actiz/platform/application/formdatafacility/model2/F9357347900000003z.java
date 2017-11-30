/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:48:27.836
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9357347900000003z{

	
						private Object atzkucun_wuliaoid;
			
				
										private Object atzkucun_xiangmuid;
			
				
										private Object atzkucun_kuweiid;
			
				
										private Object atzkucun_id;
			
				
					
						public void setAtzkucun_wuliaoid(Object atzkucun_wuliaoid){
				this.atzkucun_wuliaoid = atzkucun_wuliaoid;
			}
			
	  		public Object getAtzkucun_wuliaoid(){
	  			return atzkucun_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzkucun_xiangmuid(Object atzkucun_xiangmuid){
				this.atzkucun_xiangmuid = atzkucun_xiangmuid;
			}
			
	  		public Object getAtzkucun_xiangmuid(){
	  			return atzkucun_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzkucun_kuweiid(Object atzkucun_kuweiid){
				this.atzkucun_kuweiid = atzkucun_kuweiid;
			}
			
	  		public Object getAtzkucun_kuweiid(){
	  			return atzkucun_kuweiid;
	  		}
  		  		
  				  		
  						public void setAtzkucun_id(Object atzkucun_id){
				this.atzkucun_id = atzkucun_id;
			}
			
	  		public Object getAtzkucun_id(){
	  			return atzkucun_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9357347900000003z init(DataContextHelper context) {
  		F9357347900000003z o = new F9357347900000003z();
									o.setAtzkucun_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzkucun_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzkucun_kuweiid(getValue(context,"atzkuwei.id"));
						
						  									o.setAtzkucun_id(getValue(context,"atzkucun.id"));
						
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