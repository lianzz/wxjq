/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:50:43.406
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F4f25419a00000002z{

	
						private Object atzfahuotzd_bianhao;
			
				
										private Object atzfahuotzd_fahuotzdid;
			
				
										private Object atzhetong_hetongbh;
			
				
										private Object atzhetong_hetongmc;
			
				
										private Object atzkehu_kehumc;
			
				
										private Object atzfahuotzd_fahuorq;
			
				
							private Object atzfahuotzd_fahuorq1;
								private Object atzfahuotzd_danjuzt;
			
				
										private Object atzkehu_id;
			
				
										private Object atzhetong_id;
			
				
										private Object atzfahuotzd_id;
			
				
					
						public void setAtzfahuotzd_bianhao(Object atzfahuotzd_bianhao){
				this.atzfahuotzd_bianhao = atzfahuotzd_bianhao;
			}
			
	  		public Object getAtzfahuotzd_bianhao(){
	  			return atzfahuotzd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_fahuotzdid(Object atzfahuotzd_fahuotzdid){
				this.atzfahuotzd_fahuotzdid = atzfahuotzd_fahuotzdid;
			}
			
	  		public Object getAtzfahuotzd_fahuotzdid(){
	  			return atzfahuotzd_fahuotzdid;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongbh(Object atzhetong_hetongbh){
				this.atzhetong_hetongbh = atzhetong_hetongbh;
			}
			
	  		public Object getAtzhetong_hetongbh(){
	  			return atzhetong_hetongbh;
	  		}
  		  		
  				  		
  						public void setAtzhetong_hetongmc(Object atzhetong_hetongmc){
				this.atzhetong_hetongmc = atzhetong_hetongmc;
			}
			
	  		public Object getAtzhetong_hetongmc(){
	  			return atzhetong_hetongmc;
	  		}
  		  		
  				  		
  						public void setAtzkehu_kehumc(Object atzkehu_kehumc){
				this.atzkehu_kehumc = atzkehu_kehumc;
			}
			
	  		public Object getAtzkehu_kehumc(){
	  			return atzkehu_kehumc;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_fahuorq(Object atzfahuotzd_fahuorq){
				this.atzfahuotzd_fahuorq = atzfahuotzd_fahuorq;
			}
			
	  		public Object getAtzfahuotzd_fahuorq(){
	  			return atzfahuotzd_fahuorq;
	  		}
  		  		
  							public void setAtzfahuotzd_fahuorq1(Object atzfahuotzd_fahuorq1){
				this.atzfahuotzd_fahuorq1 = atzfahuotzd_fahuorq1;
			}
			
	  		public Object getAtzfahuotzd_fahuorq1(){
	  			return atzfahuotzd_fahuorq1;
	  		}
		  		
  						public void setAtzfahuotzd_danjuzt(Object atzfahuotzd_danjuzt){
				this.atzfahuotzd_danjuzt = atzfahuotzd_danjuzt;
			}
			
	  		public Object getAtzfahuotzd_danjuzt(){
	  			return atzfahuotzd_danjuzt;
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
  		  		
  				  		
  	  	
  	public static F4f25419a00000002z init(DataContextHelper context) {
  		F4f25419a00000002z o = new F4f25419a00000002z();
									o.setAtzfahuotzd_bianhao(getValue(context,"atzfahuotzd.bianhao"));
						
						  									o.setAtzfahuotzd_fahuotzdid(getValue(context,"atzfahuotzd.id"));
						
						  									o.setAtzhetong_hetongbh(getValue(context,"atzhetong.hetongbh"));
						
						  									o.setAtzhetong_hetongmc(getValue(context,"atzhetong.hetongmc"));
						
						  									o.setAtzkehu_kehumc(getValue(context,"atzkehu.kehumc"));
						
						  									o.setAtzfahuotzd_fahuorq(getValue(context,"atzfahuotzd.fahuorq"));
						
										o.setAtzfahuotzd_fahuorq1(getValue(context,"atzfahuotzd.fahuorq1"));
			  									o.setAtzfahuotzd_danjuzt(getValue(context,"atzfahuotzd.danjuzt"));
						
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