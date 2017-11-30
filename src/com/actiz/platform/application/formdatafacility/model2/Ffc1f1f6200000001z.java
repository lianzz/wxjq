/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:53:14.412
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Ffc1f1f6200000001z{

	
						private Object atzbom_mingcheng;
			
				
										private Object atzwuliaojcxx_guige1;
			
				
										private Object atzwuliaojcxx_guige2;
			
				
										private Object atzbom_shifouqy;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzbom_id;
			
				
					
						public void setAtzbom_mingcheng(Object atzbom_mingcheng){
				this.atzbom_mingcheng = atzbom_mingcheng;
			}
			
	  		public Object getAtzbom_mingcheng(){
	  			return atzbom_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_guige1(Object atzwuliaojcxx_guige1){
				this.atzwuliaojcxx_guige1 = atzwuliaojcxx_guige1;
			}
			
	  		public Object getAtzwuliaojcxx_guige1(){
	  			return atzwuliaojcxx_guige1;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_guige2(Object atzwuliaojcxx_guige2){
				this.atzwuliaojcxx_guige2 = atzwuliaojcxx_guige2;
			}
			
	  		public Object getAtzwuliaojcxx_guige2(){
	  			return atzwuliaojcxx_guige2;
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
  		  		
  				  		
  	  	
  	public static Ffc1f1f6200000001z init(DataContextHelper context) {
  		Ffc1f1f6200000001z o = new Ffc1f1f6200000001z();
									o.setAtzbom_mingcheng(getValue(context,"atzbom.mingcheng"));
						
						  									o.setAtzwuliaojcxx_guige1(getValue(context,"atzwuliaojcxx.guige1"));
						
						  									o.setAtzwuliaojcxx_guige2(getValue(context,"atzwuliaojcxx.guige2"));
						
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