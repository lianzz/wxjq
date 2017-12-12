/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:00:23.24
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9ad25ee700000007z{

	
						private Object atzhetong_hetongmc;
			
				
										private Object atzkehugc_kehuid;
			
				
										private Object atzkehugc_xitongmc;
			
				
										private Object atzkehugc_kaishisj;
			
				
							private Object atzkehugc_kaishisj1;
								private Object atzkehugc_jieshusj;
			
				
							private Object atzkehugc_jieshusj1;
								private Object atzkehugc_id;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzkehugc_kehuid(Object atzkehugc_kehuid){
				this.atzkehugc_kehuid = atzkehugc_kehuid;
			}
			
	  		public Object getAtzkehugc_kehuid(){
	  			return atzkehugc_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzkehugc_xitongmc(Object atzkehugc_xitongmc){
				this.atzkehugc_xitongmc = atzkehugc_xitongmc;
			}
			
	  		public Object getAtzkehugc_xitongmc(){
	  			return atzkehugc_xitongmc;
	  		}
  		  		
  				  		
  						public void setAtzkehugc_kaishisj(Object atzkehugc_kaishisj){
				this.atzkehugc_kaishisj = atzkehugc_kaishisj;
			}
			
	  		public Object getAtzkehugc_kaishisj(){
	  			return atzkehugc_kaishisj;
	  		}
  		  		
  							public void setAtzkehugc_kaishisj1(Object atzkehugc_kaishisj1){
				this.atzkehugc_kaishisj1 = atzkehugc_kaishisj1;
			}
			
	  		public Object getAtzkehugc_kaishisj1(){
	  			return atzkehugc_kaishisj1;
	  		}
		  		
  						public void setAtzkehugc_jieshusj(Object atzkehugc_jieshusj){
				this.atzkehugc_jieshusj = atzkehugc_jieshusj;
			}
			
	  		public Object getAtzkehugc_jieshusj(){
	  			return atzkehugc_jieshusj;
	  		}
  		  		
  							public void setAtzkehugc_jieshusj1(Object atzkehugc_jieshusj1){
				this.atzkehugc_jieshusj1 = atzkehugc_jieshusj1;
			}
			
	  		public Object getAtzkehugc_jieshusj1(){
	  			return atzkehugc_jieshusj1;
	  		}
		  		
  						public void setAtzkehugc_id(Object atzkehugc_id){
				this.atzkehugc_id = atzkehugc_id;
			}
			
	  		public Object getAtzkehugc_id(){
	  			return atzkehugc_id;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9ad25ee700000007z init(DataContextHelper context) {
  		F9ad25ee700000007z o = new F9ad25ee700000007z();
									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzkehugc_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzkehugc_xitongmc(getValue(context,"atzkehugc.xitongmc"));
						
						  									o.setAtzkehugc_kaishisj(getValue(context,"atzkehugc.kaishisj"));
						
										o.setAtzkehugc_kaishisj1(getValue(context,"atzkehugc.kaishisj1"));
			  									o.setAtzkehugc_jieshusj(getValue(context,"atzkehugc.jieshusj"));
						
										o.setAtzkehugc_jieshusj1(getValue(context,"atzkehugc.jieshusj1"));
			  									o.setAtzkehugc_id(getValue(context,"atzkehugc.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
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