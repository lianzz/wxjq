/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:03:02.438
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F04f6700700000001z{

	
						private Object atzxiangmu_xiangmubh;
			
				
										private Object atzxiangmu_xiangmumc;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzchurukls_riqi;
			
				
							private Object atzchurukls_riqi1;
								private Object atzwuliaojcxx_id;
			
				
										private Object atzchurukls_id;
			
				
										private Object atzxiangmu_id;
			
				
					
						public void setAtzxiangmu_xiangmubh(Object atzxiangmu_xiangmubh){
				this.atzxiangmu_xiangmubh = atzxiangmu_xiangmubh;
			}
			
	  		public Object getAtzxiangmu_xiangmubh(){
	  			return atzxiangmu_xiangmubh;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_xiangmumc(Object atzxiangmu_xiangmumc){
				this.atzxiangmu_xiangmumc = atzxiangmu_xiangmumc;
			}
			
	  		public Object getAtzxiangmu_xiangmumc(){
	  			return atzxiangmu_xiangmumc;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzchurukls_riqi(Object atzchurukls_riqi){
				this.atzchurukls_riqi = atzchurukls_riqi;
			}
			
	  		public Object getAtzchurukls_riqi(){
	  			return atzchurukls_riqi;
	  		}
  		  		
  							public void setAtzchurukls_riqi1(Object atzchurukls_riqi1){
				this.atzchurukls_riqi1 = atzchurukls_riqi1;
			}
			
	  		public Object getAtzchurukls_riqi1(){
	  			return atzchurukls_riqi1;
	  		}
		  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzchurukls_id(Object atzchurukls_id){
				this.atzchurukls_id = atzchurukls_id;
			}
			
	  		public Object getAtzchurukls_id(){
	  			return atzchurukls_id;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_id(Object atzxiangmu_id){
				this.atzxiangmu_id = atzxiangmu_id;
			}
			
	  		public Object getAtzxiangmu_id(){
	  			return atzxiangmu_id;
	  		}
  		  		
  				  		
  	  	
  	public static F04f6700700000001z init(DataContextHelper context) {
  		F04f6700700000001z o = new F04f6700700000001z();
									o.setAtzxiangmu_xiangmubh(getValue(context,"atzxiangmu.xiangmubh"));
						
						  									o.setAtzxiangmu_xiangmumc(getValue(context,"atzxiangmu.xiangmumc"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzchurukls_riqi(getValue(context,"atzchurukls.riqi"));
						
										o.setAtzchurukls_riqi1(getValue(context,"atzchurukls.riqi1"));
			  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzchurukls_id(getValue(context,"atzchurukls.id"));
						
						  									o.setAtzxiangmu_id(getValue(context,"atzxiangmu.id"));
						
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