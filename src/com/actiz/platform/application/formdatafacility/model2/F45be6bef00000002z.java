/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:42.342
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F45be6bef00000002z{

	
						private Object atztask_tasktype;
			
				
										private Object atztask_theme;
			
				
										private Object atztask_createtime;
			
				
							private Object atztask_createtime1;
								private Object atztask_descript;
			
				
										private Object atztask_id;
			
				
					
						public void setAtztask_tasktype(Object atztask_tasktype){
				this.atztask_tasktype = atztask_tasktype;
			}
			
	  		public Object getAtztask_tasktype(){
	  			return atztask_tasktype;
	  		}
  		  		
  				  		
  						public void setAtztask_theme(Object atztask_theme){
				this.atztask_theme = atztask_theme;
			}
			
	  		public Object getAtztask_theme(){
	  			return atztask_theme;
	  		}
  		  		
  				  		
  						public void setAtztask_createtime(Object atztask_createtime){
				this.atztask_createtime = atztask_createtime;
			}
			
	  		public Object getAtztask_createtime(){
	  			return atztask_createtime;
	  		}
  		  		
  							public void setAtztask_createtime1(Object atztask_createtime1){
				this.atztask_createtime1 = atztask_createtime1;
			}
			
	  		public Object getAtztask_createtime1(){
	  			return atztask_createtime1;
	  		}
		  		
  						public void setAtztask_descript(Object atztask_descript){
				this.atztask_descript = atztask_descript;
			}
			
	  		public Object getAtztask_descript(){
	  			return atztask_descript;
	  		}
  		  		
  				  		
  						public void setAtztask_id(Object atztask_id){
				this.atztask_id = atztask_id;
			}
			
	  		public Object getAtztask_id(){
	  			return atztask_id;
	  		}
  		  		
  				  		
  	  	
  	public static F45be6bef00000002z init(DataContextHelper context) {
  		F45be6bef00000002z o = new F45be6bef00000002z();
									o.setAtztask_tasktype(getValue(context,"atztask.tasktype"));
						
						  									o.setAtztask_theme(getValue(context,"atztask.theme"));
						
						  									o.setAtztask_createtime(getValue(context,"atztask.createtime"));
						
										o.setAtztask_createtime1(getValue(context,"atztask.createtime1"));
			  									o.setAtztask_descript(getValue(context,"atztask.descript"));
						
						  									o.setAtztask_id(getValue(context,"atztask.id"));
						
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