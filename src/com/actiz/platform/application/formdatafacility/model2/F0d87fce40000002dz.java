/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:52:44.939
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F0d87fce40000002dz{

	
						private Object atzxiangmupzqd_bianhao;
			
				
										private Object atzxiangmupzqd_qingdanmc;
			
				
										private Object atzxiangmupzqd_kehu;
			
				
										private Object atzxiangmupzqd_danjuzt;
			
				
										private Object atzxiangmupzqd_id;
			
				
					
						public void setAtzxiangmupzqd_bianhao(Object atzxiangmupzqd_bianhao){
				this.atzxiangmupzqd_bianhao = atzxiangmupzqd_bianhao;
			}
			
	  		public Object getAtzxiangmupzqd_bianhao(){
	  			return atzxiangmupzqd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupzqd_qingdanmc(Object atzxiangmupzqd_qingdanmc){
				this.atzxiangmupzqd_qingdanmc = atzxiangmupzqd_qingdanmc;
			}
			
	  		public Object getAtzxiangmupzqd_qingdanmc(){
	  			return atzxiangmupzqd_qingdanmc;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupzqd_kehu(Object atzxiangmupzqd_kehu){
				this.atzxiangmupzqd_kehu = atzxiangmupzqd_kehu;
			}
			
	  		public Object getAtzxiangmupzqd_kehu(){
	  			return atzxiangmupzqd_kehu;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupzqd_danjuzt(Object atzxiangmupzqd_danjuzt){
				this.atzxiangmupzqd_danjuzt = atzxiangmupzqd_danjuzt;
			}
			
	  		public Object getAtzxiangmupzqd_danjuzt(){
	  			return atzxiangmupzqd_danjuzt;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupzqd_id(Object atzxiangmupzqd_id){
				this.atzxiangmupzqd_id = atzxiangmupzqd_id;
			}
			
	  		public Object getAtzxiangmupzqd_id(){
	  			return atzxiangmupzqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F0d87fce40000002dz init(DataContextHelper context) {
  		F0d87fce40000002dz o = new F0d87fce40000002dz();
									o.setAtzxiangmupzqd_bianhao(getValue(context,"atzxiangmupzqd.bianhao"));
						
						  									o.setAtzxiangmupzqd_qingdanmc(getValue(context,"atzxiangmupzqd.qingdanmc"));
						
						  									o.setAtzxiangmupzqd_kehu(getValue(context,"atzkehu.id"));
						
						  									o.setAtzxiangmupzqd_danjuzt(getValue(context,"atzxiangmupzqd.danjuzt"));
						
						  									o.setAtzxiangmupzqd_id(getValue(context,"atzxiangmupzqd.id"));
						
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