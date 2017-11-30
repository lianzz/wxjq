/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:42.498
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9a72a4e700000016z{

	
						private Object atzweixiujl_laiyuan;
			
				
										private Object atzweixiujl_sn;
			
				
										private Object atzweixiujl_wuliaoid;
			
				
										private Object atzweixiujl_guzhangxx;
			
				
										private Object atzweixiujl_fanghuidd;
			
				
										private Object atzweixiujl_weixiur;
			
				
										private Object atzweixiujl_weixiujl;
			
				
										private Object atzweixiujl_id;
			
				
					
						public void setAtzweixiujl_laiyuan(Object atzweixiujl_laiyuan){
				this.atzweixiujl_laiyuan = atzweixiujl_laiyuan;
			}
			
	  		public Object getAtzweixiujl_laiyuan(){
	  			return atzweixiujl_laiyuan;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_sn(Object atzweixiujl_sn){
				this.atzweixiujl_sn = atzweixiujl_sn;
			}
			
	  		public Object getAtzweixiujl_sn(){
	  			return atzweixiujl_sn;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_wuliaoid(Object atzweixiujl_wuliaoid){
				this.atzweixiujl_wuliaoid = atzweixiujl_wuliaoid;
			}
			
	  		public Object getAtzweixiujl_wuliaoid(){
	  			return atzweixiujl_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_guzhangxx(Object atzweixiujl_guzhangxx){
				this.atzweixiujl_guzhangxx = atzweixiujl_guzhangxx;
			}
			
	  		public Object getAtzweixiujl_guzhangxx(){
	  			return atzweixiujl_guzhangxx;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_fanghuidd(Object atzweixiujl_fanghuidd){
				this.atzweixiujl_fanghuidd = atzweixiujl_fanghuidd;
			}
			
	  		public Object getAtzweixiujl_fanghuidd(){
	  			return atzweixiujl_fanghuidd;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_weixiur(Object atzweixiujl_weixiur){
				this.atzweixiujl_weixiur = atzweixiujl_weixiur;
			}
			
	  		public Object getAtzweixiujl_weixiur(){
	  			return atzweixiujl_weixiur;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_weixiujl(Object atzweixiujl_weixiujl){
				this.atzweixiujl_weixiujl = atzweixiujl_weixiujl;
			}
			
	  		public Object getAtzweixiujl_weixiujl(){
	  			return atzweixiujl_weixiujl;
	  		}
  		  		
  				  		
  						public void setAtzweixiujl_id(Object atzweixiujl_id){
				this.atzweixiujl_id = atzweixiujl_id;
			}
			
	  		public Object getAtzweixiujl_id(){
	  			return atzweixiujl_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9a72a4e700000016z init(DataContextHelper context) {
  		F9a72a4e700000016z o = new F9a72a4e700000016z();
									o.setAtzweixiujl_laiyuan(getValue(context,"atzweixiujl.laiyuan"));
						
						  									o.setAtzweixiujl_sn(getValue(context,"atzweixiujl.sn"));
						
						  									o.setAtzweixiujl_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzweixiujl_guzhangxx(getValue(context,"atzweixiujl.guzhangxx"));
						
						  									o.setAtzweixiujl_fanghuidd(getValue(context,"atzweixiujl.fanghuidd"));
						
						  									o.setAtzweixiujl_weixiur(getValue(context,"atzweixiujl.weixiur"));
						
						  									o.setAtzweixiujl_weixiujl(getValue(context,"atzweixiujl.weixiujl"));
						
						  									o.setAtzweixiujl_id(getValue(context,"atzweixiujl.id"));
						
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