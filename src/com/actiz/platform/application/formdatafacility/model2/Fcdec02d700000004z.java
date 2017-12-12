/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:01:15.576
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fcdec02d700000004z{

	
						private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_hetongje;
			
				
							private Object atzhetong_hetongje1;
								private Object atzhetong_hetonglx;
			
				
										private Object atzhetong_daqu;
			
				
										private Object atzhetong_suoshuhy;
			
				
										private Object atzhetong_id;
			
				
					
						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongje(Object atzhetong_hetongje){
				this.atzhetong_hetongje = atzhetong_hetongje;
			}
			
	  		public Object getAtzhetong_hetongje(){
	  			return atzhetong_hetongje;
	  		}
  		  		
  							public void setAtzhetong_hetongje1(Object atzhetong_hetongje1){
				this.atzhetong_hetongje1 = atzhetong_hetongje1;
			}
			
	  		public Object getAtzhetong_hetongje1(){
	  			return atzhetong_hetongje1;
	  		}
		  		
  						public void setAtzhetong_hetonglx(Object atzhetong_hetonglx){
				this.atzhetong_hetonglx = atzhetong_hetonglx;
			}
			
	  		public Object getAtzhetong_hetonglx(){
	  			return atzhetong_hetonglx;
	  		}
  		  		
  				  		
  						public void setAtzhetong_daqu(Object atzhetong_daqu){
				this.atzhetong_daqu = atzhetong_daqu;
			}
			
	  		public Object getAtzhetong_daqu(){
	  			return atzhetong_daqu;
	  		}
  		  		
  				  		
  						public void setAtzhetong_suoshuhy(Object atzhetong_suoshuhy){
				this.atzhetong_suoshuhy = atzhetong_suoshuhy;
			}
			
	  		public Object getAtzhetong_suoshuhy(){
	  			return atzhetong_suoshuhy;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fcdec02d700000004z init(DataContextHelper context) {
  		Fcdec02d700000004z o = new Fcdec02d700000004z();
									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_hetongje(getValue(context,"atzhetong.hetongje"));
						
										o.setAtzhetong_hetongje1(getValue(context,"atzhetong.hetongje1"));
			  									o.setAtzhetong_hetonglx(getValue(context,"atzhetong.hetonglx"));
						
						  									o.setAtzhetong_daqu(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzhetong_suoshuhy(getValue(context,"atzhetong.suoshuhy"));
						
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