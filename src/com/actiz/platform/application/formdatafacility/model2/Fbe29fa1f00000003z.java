/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:10.51
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fbe29fa1f00000003z{

	
						private Object atztask_processname;
			
				
										private Object atztask_tasktype;
			
				
										private Object atztask_createtime;
			
				
							private Object atztask_createtime1;
								private Object atzyoujianfsjl_shoujianren;
			
				
										private Object atzyoujianfsjl_fasongzt;
			
				
										private Object atzyoujianfsjl_fasongsj;
			
				
							private Object atzyoujianfsjl_fasongsj1;
								private Object atzyoujianfsjl_zhuti;
			
				
										private Object atztask_id;
			
				
										private Object atzyoujianfsjl_id;
			
				
					
						public void setAtztask_processname(Object atztask_processname){
				this.atztask_processname = atztask_processname;
			}
			
	  		public Object getAtztask_processname(){
	  			return atztask_processname;
	  		}
  		  		
  				  		
  						public void setAtztask_tasktype(Object atztask_tasktype){
				this.atztask_tasktype = atztask_tasktype;
			}
			
	  		public Object getAtztask_tasktype(){
	  			return atztask_tasktype;
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
		  		
  						public void setAtzyoujianfsjl_shoujianren(Object atzyoujianfsjl_shoujianren){
				this.atzyoujianfsjl_shoujianren = atzyoujianfsjl_shoujianren;
			}
			
	  		public Object getAtzyoujianfsjl_shoujianren(){
	  			return atzyoujianfsjl_shoujianren;
	  		}
  		  		
  				  		
  						public void setAtzyoujianfsjl_fasongzt(Object atzyoujianfsjl_fasongzt){
				this.atzyoujianfsjl_fasongzt = atzyoujianfsjl_fasongzt;
			}
			
	  		public Object getAtzyoujianfsjl_fasongzt(){
	  			return atzyoujianfsjl_fasongzt;
	  		}
  		  		
  				  		
  						public void setAtzyoujianfsjl_fasongsj(Object atzyoujianfsjl_fasongsj){
				this.atzyoujianfsjl_fasongsj = atzyoujianfsjl_fasongsj;
			}
			
	  		public Object getAtzyoujianfsjl_fasongsj(){
	  			return atzyoujianfsjl_fasongsj;
	  		}
  		  		
  							public void setAtzyoujianfsjl_fasongsj1(Object atzyoujianfsjl_fasongsj1){
				this.atzyoujianfsjl_fasongsj1 = atzyoujianfsjl_fasongsj1;
			}
			
	  		public Object getAtzyoujianfsjl_fasongsj1(){
	  			return atzyoujianfsjl_fasongsj1;
	  		}
		  		
  						public void setAtzyoujianfsjl_zhuti(Object atzyoujianfsjl_zhuti){
				this.atzyoujianfsjl_zhuti = atzyoujianfsjl_zhuti;
			}
			
	  		public Object getAtzyoujianfsjl_zhuti(){
	  			return atzyoujianfsjl_zhuti;
	  		}
  		  		
  				  		
  						public void setAtztask_id(Object atztask_id){
				this.atztask_id = atztask_id;
			}
			
	  		public Object getAtztask_id(){
	  			return atztask_id;
	  		}
  		  		
  				  		
  						public void setAtzyoujianfsjl_id(Object atzyoujianfsjl_id){
				this.atzyoujianfsjl_id = atzyoujianfsjl_id;
			}
			
	  		public Object getAtzyoujianfsjl_id(){
	  			return atzyoujianfsjl_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fbe29fa1f00000003z init(DataContextHelper context) {
  		Fbe29fa1f00000003z o = new Fbe29fa1f00000003z();
									o.setAtztask_processname(getValue(context,"atztask.processname"));
						
						  									o.setAtztask_tasktype(getValue(context,"atztask.tasktype"));
						
						  									o.setAtztask_createtime(getValue(context,"atztask.createtime"));
						
										o.setAtztask_createtime1(getValue(context,"atztask.createtime1"));
			  									o.setAtzyoujianfsjl_shoujianren(getValue(context,"atzyoujianfsjl.shoujianren"));
						
						  									o.setAtzyoujianfsjl_fasongzt(getValue(context,"atzyoujianfsjl.fasongzt"));
						
						  									o.setAtzyoujianfsjl_fasongsj(getValue(context,"atzyoujianfsjl.fasongsj"));
						
										o.setAtzyoujianfsjl_fasongsj1(getValue(context,"atzyoujianfsjl.fasongsj1"));
			  									o.setAtzyoujianfsjl_zhuti(getValue(context,"atzyoujianfsjl.zhuti"));
						
						  									o.setAtztask_id(getValue(context,"atztask.id"));
						
						  									o.setAtzyoujianfsjl_id(getValue(context,"atzyoujianfsjl.id"));
						
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