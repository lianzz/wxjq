/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:11:22.851
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F3916164f0000000az{

	
						private Object atzfahuotzd_bianhao;
			
				
										private Object atzfahuotzd_zhuti;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzkehu_kehumc;
			
				
										private Object atzkehu_id;
			
				
										private Object atzhetong_id;
			
				
										private Object atzfahuotzd_id;
			
				
					
						public void setAtzfahuotzd_bianhao(Object atzfahuotzd_bianhao){
				this.atzfahuotzd_bianhao = atzfahuotzd_bianhao;
			}
			
	  		public Object getAtzfahuotzd_bianhao(){
	  			return atzfahuotzd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_zhuti(Object atzfahuotzd_zhuti){
				this.atzfahuotzd_zhuti = atzfahuotzd_zhuti;
			}
			
	  		public Object getAtzfahuotzd_zhuti(){
	  			return atzfahuotzd_zhuti;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzkehu_kehumc(Object atzkehu_kehumc){
				this.atzkehu_kehumc = atzkehu_kehumc;
			}
			
	  		public Object getAtzkehu_kehumc(){
	  			return atzkehu_kehumc;
	  		}
  		  		
  				  		
  						public void setAtzkehu_id(Object atzkehu_id){
				this.atzkehu_id = atzkehu_id;
			}
			
	  		public Object getAtzkehu_id(){
	  			return atzkehu_id;
	  		}
  		  		
  				  		
  						public void setAtzhetong_id(Object atzhetong_id){
				this.atzhetong_id = atzhetong_id;
			}
			
	  		public Object getAtzhetong_id(){
	  			return atzhetong_id;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_id(Object atzfahuotzd_id){
				this.atzfahuotzd_id = atzfahuotzd_id;
			}
			
	  		public Object getAtzfahuotzd_id(){
	  			return atzfahuotzd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F3916164f0000000az init(DataContextHelper context) {
  		F3916164f0000000az o = new F3916164f0000000az();
									o.setAtzfahuotzd_bianhao(getValue(context,"atzfahuotzd.bianhao"));
						
						  									o.setAtzfahuotzd_zhuti(getValue(context,"atzfahuotzd.zhuti"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzkehu_kehumc(getValue(context,"atzkehu.kehumc"));
						
						  									o.setAtzkehu_id(getValue(context,"atzkehu.id"));
						
						  									o.setAtzhetong_id(getValue(context,"atzhetong.id"));
						
						  									o.setAtzfahuotzd_id(getValue(context,"atzfahuotzd.id"));
						
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