/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:28.995
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fca419e5f00000006z{

	
						private Object atzbom_mingcheng;
			
				
										private Object atzbom1_mingcheng;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx1_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzwuliaojcxx1_wuliaoms;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzbom1_id;
			
				
										private Object atzbomjilu_id;
			
				
										private Object atzwuliaojcxx1_id;
			
				
										private Object atzbom_id;
			
				
					
						public void setAtzbom_mingcheng(Object atzbom_mingcheng){
				this.atzbom_mingcheng = atzbom_mingcheng;
			}
			
	  		public Object getAtzbom_mingcheng(){
	  			return atzbom_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzbom1_mingcheng(Object atzbom1_mingcheng){
				this.atzbom1_mingcheng = atzbom1_mingcheng;
			}
			
	  		public Object getAtzbom1_mingcheng(){
	  			return atzbom1_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_wuliaobm(Object atzwuliaojcxx1_wuliaobm){
				this.atzwuliaojcxx1_wuliaobm = atzwuliaojcxx1_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx1_wuliaobm(){
	  			return atzwuliaojcxx1_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_wuliaoms(Object atzwuliaojcxx1_wuliaoms){
				this.atzwuliaojcxx1_wuliaoms = atzwuliaojcxx1_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx1_wuliaoms(){
	  			return atzwuliaojcxx1_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzbom1_id(Object atzbom1_id){
				this.atzbom1_id = atzbom1_id;
			}
			
	  		public Object getAtzbom1_id(){
	  			return atzbom1_id;
	  		}
  		  		
  				  		
  						public void setAtzbomjilu_id(Object atzbomjilu_id){
				this.atzbomjilu_id = atzbomjilu_id;
			}
			
	  		public Object getAtzbomjilu_id(){
	  			return atzbomjilu_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx1_id(Object atzwuliaojcxx1_id){
				this.atzwuliaojcxx1_id = atzwuliaojcxx1_id;
			}
			
	  		public Object getAtzwuliaojcxx1_id(){
	  			return atzwuliaojcxx1_id;
	  		}
  		  		
  				  		
  						public void setAtzbom_id(Object atzbom_id){
				this.atzbom_id = atzbom_id;
			}
			
	  		public Object getAtzbom_id(){
	  			return atzbom_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fca419e5f00000006z init(DataContextHelper context) {
  		Fca419e5f00000006z o = new Fca419e5f00000006z();
									o.setAtzbom_mingcheng(getValue(context,"atzbom.mingcheng"));
						
						  									o.setAtzbom1_mingcheng(getValue(context,"atzbom1.mingcheng"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx1_wuliaobm(getValue(context,"atzwuliaojcxx1.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzwuliaojcxx1_wuliaoms(getValue(context,"atzwuliaojcxx1.wuliaoms"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzbom1_id(getValue(context,"atzbom1.id"));
						
						  									o.setAtzbomjilu_id(getValue(context,"atzbomjilu.id"));
						
						  									o.setAtzwuliaojcxx1_id(getValue(context,"atzwuliaojcxx1.id"));
						
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