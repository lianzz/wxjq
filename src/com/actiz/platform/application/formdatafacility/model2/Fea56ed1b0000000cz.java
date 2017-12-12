/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:04:47.44
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fea56ed1b0000000cz{

	
						private Object atzgudingzc_shebeibh;
			
				
										private Object atzgudingzc_shebeimc;
			
				
										private Object atzgudingzc_shijirksj;
			
				
							private Object atzgudingzc_shijirksj1;
								private Object atzgudingzc_lingyongr;
			
				
										private Object atzgudingzc_fangzhidd;
			
				
										private Object atzgudingzc_zichanzt;
			
				
										private Object atzgudingzc_id;
			
				
					
						public void setAtzgudingzc_shebeibh(Object atzgudingzc_shebeibh){
				this.atzgudingzc_shebeibh = atzgudingzc_shebeibh;
			}
			
	  		public Object getAtzgudingzc_shebeibh(){
	  			return atzgudingzc_shebeibh;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shebeimc(Object atzgudingzc_shebeimc){
				this.atzgudingzc_shebeimc = atzgudingzc_shebeimc;
			}
			
	  		public Object getAtzgudingzc_shebeimc(){
	  			return atzgudingzc_shebeimc;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_shijirksj(Object atzgudingzc_shijirksj){
				this.atzgudingzc_shijirksj = atzgudingzc_shijirksj;
			}
			
	  		public Object getAtzgudingzc_shijirksj(){
	  			return atzgudingzc_shijirksj;
	  		}
  		  		
  							public void setAtzgudingzc_shijirksj1(Object atzgudingzc_shijirksj1){
				this.atzgudingzc_shijirksj1 = atzgudingzc_shijirksj1;
			}
			
	  		public Object getAtzgudingzc_shijirksj1(){
	  			return atzgudingzc_shijirksj1;
	  		}
		  		
  						public void setAtzgudingzc_lingyongr(Object atzgudingzc_lingyongr){
				this.atzgudingzc_lingyongr = atzgudingzc_lingyongr;
			}
			
	  		public Object getAtzgudingzc_lingyongr(){
	  			return atzgudingzc_lingyongr;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_fangzhidd(Object atzgudingzc_fangzhidd){
				this.atzgudingzc_fangzhidd = atzgudingzc_fangzhidd;
			}
			
	  		public Object getAtzgudingzc_fangzhidd(){
	  			return atzgudingzc_fangzhidd;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_zichanzt(Object atzgudingzc_zichanzt){
				this.atzgudingzc_zichanzt = atzgudingzc_zichanzt;
			}
			
	  		public Object getAtzgudingzc_zichanzt(){
	  			return atzgudingzc_zichanzt;
	  		}
  		  		
  				  		
  						public void setAtzgudingzc_id(Object atzgudingzc_id){
				this.atzgudingzc_id = atzgudingzc_id;
			}
			
	  		public Object getAtzgudingzc_id(){
	  			return atzgudingzc_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fea56ed1b0000000cz init(DataContextHelper context) {
  		Fea56ed1b0000000cz o = new Fea56ed1b0000000cz();
									o.setAtzgudingzc_shebeibh(getValue(context,"atzgudingzc.shebeibh"));
						
						  									o.setAtzgudingzc_shebeimc(getValue(context,"atzgudingzc.shebeimc"));
						
						  									o.setAtzgudingzc_shijirksj(getValue(context,"atzgudingzc.shijirksj"));
						
										o.setAtzgudingzc_shijirksj1(getValue(context,"atzgudingzc.shijirksj1"));
			  									o.setAtzgudingzc_lingyongr(getValue(context,"atzemployee.id"));
						
						  									o.setAtzgudingzc_fangzhidd(getValue(context,"atzgudingzc.fangzhidd"));
						
						  									o.setAtzgudingzc_zichanzt(getValue(context,"atzgudingzc.zichanzt"));
						
						  									o.setAtzgudingzc_id(getValue(context,"atzgudingzc.id"));
						
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