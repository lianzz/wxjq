/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:43.123
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fcbedd09900000007z{

	
						private Object atzchanpin_chanpinx;
			
				
										private Object atzhetong_kehuid;
			
				
										private Object atzhetong_qiandingrq;
			
				
							private Object atzhetong_qiandingrq1;
								private Object atzchanpin_id;
			
				
										private Object atzhetong_id;
			
				
										private Object atzxiaoshoudd_id;
			
				
					
						public void setAtzchanpin_chanpinx(Object atzchanpin_chanpinx){
				this.atzchanpin_chanpinx = atzchanpin_chanpinx;
			}
			
	  		public Object getAtzchanpin_chanpinx(){
	  			return atzchanpin_chanpinx;
	  		}
  		  		
  				  		
  						public void setAtzhetong_kehuid(Object atzhetong_kehuid){
				this.atzhetong_kehuid = atzhetong_kehuid;
			}
			
	  		public Object getAtzhetong_kehuid(){
	  			return atzhetong_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzhetong_qiandingrq(Object atzhetong_qiandingrq){
				this.atzhetong_qiandingrq = atzhetong_qiandingrq;
			}
			
	  		public Object getAtzhetong_qiandingrq(){
	  			return atzhetong_qiandingrq;
	  		}
  		  		
  							public void setAtzhetong_qiandingrq1(Object atzhetong_qiandingrq1){
				this.atzhetong_qiandingrq1 = atzhetong_qiandingrq1;
			}
			
	  		public Object getAtzhetong_qiandingrq1(){
	  			return atzhetong_qiandingrq1;
	  		}
		  		
  						public void setAtzchanpin_id(Object atzchanpin_id){
				this.atzchanpin_id = atzchanpin_id;
			}
			
	  		public Object getAtzchanpin_id(){
	  			return atzchanpin_id;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoudd_id(Object atzxiaoshoudd_id){
				this.atzxiaoshoudd_id = atzxiaoshoudd_id;
			}
			
	  		public Object getAtzxiaoshoudd_id(){
	  			return atzxiaoshoudd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fcbedd09900000007z init(DataContextHelper context) {
  		Fcbedd09900000007z o = new Fcbedd09900000007z();
									o.setAtzchanpin_chanpinx(getValue(context,"atzchanpin.chanpinx"));
						
						  									o.setAtzhetong_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_qiandingrq(getValue(context,"atzhetong.qiandingrq"));
						
										o.setAtzhetong_qiandingrq1(getValue(context,"atzhetong.qiandingrq1"));
			  									o.setAtzchanpin_id(getValue(context,"atzchanpin.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
						  									o.setAtzxiaoshoudd_id(getValue(context,"atzxiaoshoudd.id"));
						
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