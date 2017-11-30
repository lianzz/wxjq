/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:49:16.691
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F963cd8a600000003z{

	
						private Object atzshebeipzxx_mokuaimc;
			
				
										private Object atzshebeipzxx_zuihouxgr;
			
				
										private Object atzshebeipzxx_ruanjianbb;
			
				
										private Object atzshebeipzxx_lurur;
			
				
										private Object atzshebeipzxx_wuliaosn;
			
				
										private Object atzcalllog_laidiansj;
			
				
							private Object atzcalllog_laidiansj1;
								private Object atzcalllog_id;
			
				
										private Object atzshebeipzxx_id;
			
				
					
						public void setAtzshebeipzxx_mokuaimc(Object atzshebeipzxx_mokuaimc){
				this.atzshebeipzxx_mokuaimc = atzshebeipzxx_mokuaimc;
			}
			
	  		public Object getAtzshebeipzxx_mokuaimc(){
	  			return atzshebeipzxx_mokuaimc;
	  		}
  		  		
  				  		
  						public void setAtzshebeipzxx_zuihouxgr(Object atzshebeipzxx_zuihouxgr){
				this.atzshebeipzxx_zuihouxgr = atzshebeipzxx_zuihouxgr;
			}
			
	  		public Object getAtzshebeipzxx_zuihouxgr(){
	  			return atzshebeipzxx_zuihouxgr;
	  		}
  		  		
  				  		
  						public void setAtzshebeipzxx_ruanjianbb(Object atzshebeipzxx_ruanjianbb){
				this.atzshebeipzxx_ruanjianbb = atzshebeipzxx_ruanjianbb;
			}
			
	  		public Object getAtzshebeipzxx_ruanjianbb(){
	  			return atzshebeipzxx_ruanjianbb;
	  		}
  		  		
  				  		
  						public void setAtzshebeipzxx_lurur(Object atzshebeipzxx_lurur){
				this.atzshebeipzxx_lurur = atzshebeipzxx_lurur;
			}
			
	  		public Object getAtzshebeipzxx_lurur(){
	  			return atzshebeipzxx_lurur;
	  		}
  		  		
  				  		
  						public void setAtzshebeipzxx_wuliaosn(Object atzshebeipzxx_wuliaosn){
				this.atzshebeipzxx_wuliaosn = atzshebeipzxx_wuliaosn;
			}
			
	  		public Object getAtzshebeipzxx_wuliaosn(){
	  			return atzshebeipzxx_wuliaosn;
	  		}
  		  		
  				  		
  						public void setAtzcalllog_laidiansj(Object atzcalllog_laidiansj){
				this.atzcalllog_laidiansj = atzcalllog_laidiansj;
			}
			
	  		public Object getAtzcalllog_laidiansj(){
	  			return atzcalllog_laidiansj;
	  		}
  		  		
  							public void setAtzcalllog_laidiansj1(Object atzcalllog_laidiansj1){
				this.atzcalllog_laidiansj1 = atzcalllog_laidiansj1;
			}
			
	  		public Object getAtzcalllog_laidiansj1(){
	  			return atzcalllog_laidiansj1;
	  		}
		  		
  						public void setAtzcalllog_id(Object atzcalllog_id){
				this.atzcalllog_id = atzcalllog_id;
			}
			
	  		public Object getAtzcalllog_id(){
	  			return atzcalllog_id;
	  		}
  		  		
  				  		
  						public void setAtzshebeipzxx_id(Object atzshebeipzxx_id){
				this.atzshebeipzxx_id = atzshebeipzxx_id;
			}
			
	  		public Object getAtzshebeipzxx_id(){
	  			return atzshebeipzxx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F963cd8a600000003z init(DataContextHelper context) {
  		F963cd8a600000003z o = new F963cd8a600000003z();
									o.setAtzshebeipzxx_mokuaimc(getValue(context,"atzshebeipzxx.mokuaimc"));
						
						  									o.setAtzshebeipzxx_zuihouxgr(getValue(context,"atzshebeipzxx.zuihouxgr"));
						
						  									o.setAtzshebeipzxx_ruanjianbb(getValue(context,"atzshebeipzxx.ruanjianbb"));
						
						  									o.setAtzshebeipzxx_lurur(getValue(context,"atzshebeipzxx.lurur"));
						
						  									o.setAtzshebeipzxx_wuliaosn(getValue(context,"atzshebeipzxx.wuliaosn"));
						
						  									o.setAtzcalllog_laidiansj(getValue(context,"atzcalllog.laidiansj"));
						
										o.setAtzcalllog_laidiansj1(getValue(context,"atzcalllog.laidiansj1"));
			  									o.setAtzcalllog_id(getValue(context,"atzcalllog.id"));
						
						  									o.setAtzshebeipzxx_id(getValue(context,"atzshebeipzxx.id"));
						
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