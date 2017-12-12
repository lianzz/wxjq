/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:04:29.467
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa4aa7a8b00000005z{

	
						private Object atzbom_mingcheng;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzbommx_id;
			
				
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
  		  		
  				  		
  						public void setAtzbommx_id(Object atzbommx_id){
				this.atzbommx_id = atzbommx_id;
			}
			
	  		public Object getAtzbommx_id(){
	  			return atzbommx_id;
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
  		  		
  				  		
  	  	
  	public static Fa4aa7a8b00000005z init(DataContextHelper context) {
  		Fa4aa7a8b00000005z o = new Fa4aa7a8b00000005z();
									o.setAtzbom_mingcheng(getValue(context,"atzbom.mingcheng"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzbommx_id(getValue(context,"atzbommx.id"));
						
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