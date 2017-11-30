/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:47:56.061
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fcd0376a400000009z{

	
						private Object atzchanpin_chanpinx;
			
				
										private Object atzhetong_hetongmc;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_kehuid;
			
				
										private Object atzhetong_hetongyy;
			
				
										private Object atzchanpin_id;
			
				
										private Object atzhetong_id;
			
				
										private Object atzxiaoshoudd_id;
			
				
					
						public void setAtzchanpin_chanpinx(Object atzchanpin_chanpinx){
				this.atzchanpin_chanpinx = atzchanpin_chanpinx;
			}
			
	  		public Object getAtzchanpin_chanpinx(){
	  			return atzchanpin_chanpinx;
	  		}
  		  		
  				  		
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
  		  		
  				  		
  						public void setAtzhetong_kehuid(Object atzhetong_kehuid){
				this.atzhetong_kehuid = atzhetong_kehuid;
			}
			
	  		public Object getAtzhetong_kehuid(){
	  			return atzhetong_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongyy(Object atzhetong_hetongyy){
				this.atzhetong_hetongyy = atzhetong_hetongyy;
			}
			
	  		public Object getAtzhetong_hetongyy(){
	  			return atzhetong_hetongyy;
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
  		  		
  				  		
  	  	
  	public static Fcd0376a400000009z init(DataContextHelper context) {
  		Fcd0376a400000009z o = new Fcd0376a400000009z();
									o.setAtzchanpin_chanpinx(getValue(context,"atzchanpin.chanpinx"));
						
						  									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_hetongyy(getValue(context,"atzhetong.hetongyy"));
						
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