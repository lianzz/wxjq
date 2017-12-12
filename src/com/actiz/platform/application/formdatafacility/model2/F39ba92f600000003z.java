/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:03:12.881
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F39ba92f600000003z{

	
						private Object atzyanfasz_bianhao;
			
				
										private Object atzyanfasz_youxianj;
			
				
										private Object atzyanfasz_wuliaoid;
			
				
										private Object atzyanfasz_yewuzt;
			
				
										private Object atzyanfasz_beizhu;
			
				
										private Object atzyanfasz_tijiaosqrq;
			
				
							private Object atzyanfasz_tijiaosqrq1;
								private Object atzyanfasz_id;
			
				
					
						public void setAtzyanfasz_bianhao(Object atzyanfasz_bianhao){
				this.atzyanfasz_bianhao = atzyanfasz_bianhao;
			}
			
	  		public Object getAtzyanfasz_bianhao(){
	  			return atzyanfasz_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzyanfasz_youxianj(Object atzyanfasz_youxianj){
				this.atzyanfasz_youxianj = atzyanfasz_youxianj;
			}
			
	  		public Object getAtzyanfasz_youxianj(){
	  			return atzyanfasz_youxianj;
	  		}
  		  		
  				  		
  						public void setAtzyanfasz_wuliaoid(Object atzyanfasz_wuliaoid){
				this.atzyanfasz_wuliaoid = atzyanfasz_wuliaoid;
			}
			
	  		public Object getAtzyanfasz_wuliaoid(){
	  			return atzyanfasz_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzyanfasz_yewuzt(Object atzyanfasz_yewuzt){
				this.atzyanfasz_yewuzt = atzyanfasz_yewuzt;
			}
			
	  		public Object getAtzyanfasz_yewuzt(){
	  			return atzyanfasz_yewuzt;
	  		}
  		  		
  				  		
  						public void setAtzyanfasz_beizhu(Object atzyanfasz_beizhu){
				this.atzyanfasz_beizhu = atzyanfasz_beizhu;
			}
			
	  		public Object getAtzyanfasz_beizhu(){
	  			return atzyanfasz_beizhu;
	  		}
  		  		
  				  		
  						public void setAtzyanfasz_tijiaosqrq(Object atzyanfasz_tijiaosqrq){
				this.atzyanfasz_tijiaosqrq = atzyanfasz_tijiaosqrq;
			}
			
	  		public Object getAtzyanfasz_tijiaosqrq(){
	  			return atzyanfasz_tijiaosqrq;
	  		}
  		  		
  							public void setAtzyanfasz_tijiaosqrq1(Object atzyanfasz_tijiaosqrq1){
				this.atzyanfasz_tijiaosqrq1 = atzyanfasz_tijiaosqrq1;
			}
			
	  		public Object getAtzyanfasz_tijiaosqrq1(){
	  			return atzyanfasz_tijiaosqrq1;
	  		}
		  		
  						public void setAtzyanfasz_id(Object atzyanfasz_id){
				this.atzyanfasz_id = atzyanfasz_id;
			}
			
	  		public Object getAtzyanfasz_id(){
	  			return atzyanfasz_id;
	  		}
  		  		
  				  		
  	  	
  	public static F39ba92f600000003z init(DataContextHelper context) {
  		F39ba92f600000003z o = new F39ba92f600000003z();
									o.setAtzyanfasz_bianhao(getValue(context,"atzyanfasz.bianhao"));
						
						  									o.setAtzyanfasz_youxianj(getValue(context,"atzyanfasz.youxianj"));
						
						  									o.setAtzyanfasz_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzyanfasz_yewuzt(getValue(context,"atzyanfasz.yewuzt"));
						
						  									o.setAtzyanfasz_beizhu(getValue(context,"atzyanfasz.beizhu"));
						
						  									o.setAtzyanfasz_tijiaosqrq(getValue(context,"atzyanfasz.tijiaosqrq"));
						
										o.setAtzyanfasz_tijiaosqrq1(getValue(context,"atzyanfasz.tijiaosqrq1"));
			  									o.setAtzyanfasz_id(getValue(context,"atzyanfasz.id"));
						
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