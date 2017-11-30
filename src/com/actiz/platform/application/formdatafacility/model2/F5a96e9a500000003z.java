/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:59:00.194
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5a96e9a500000003z{

	
						private Object atzbom_mingcheng;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzbom_shifouqy;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzbom_id;
			
				
					
						public void setAtzbom_mingcheng(Object atzbom_mingcheng){
				this.atzbom_mingcheng = atzbom_mingcheng;
			}
			
	  		public Object getAtzbom_mingcheng(){
	  			return atzbom_mingcheng;
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
  		  		
  				  		
  						public void setAtzbom_shifouqy(Object atzbom_shifouqy){
				this.atzbom_shifouqy = atzbom_shifouqy;
			}
			
	  		public Object getAtzbom_shifouqy(){
	  			return atzbom_shifouqy;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzbom_id(Object atzbom_id){
				this.atzbom_id = atzbom_id;
			}
			
	  		public Object getAtzbom_id(){
	  			return atzbom_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5a96e9a500000003z init(DataContextHelper context) {
  		F5a96e9a500000003z o = new F5a96e9a500000003z();
									o.setAtzbom_mingcheng(getValue(context,"atzbom.mingcheng"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzbom_shifouqy(getValue(context,"atzbom.shifouqy"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzbom_id(getValue(context,"atzbom.id"));
						
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