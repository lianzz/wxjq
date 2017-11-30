/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 14:00:02.943
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F991a3f760000000bz{

	
						private Object bcs_workflow_task_create_time;
			
				
							private Object bcs_workflow_task_create_time1;
								private Object atztask_id;
			
				
										private Object bcs_workflow_task_id;
			
				
					
						public void setBcs_workflow_task_create_time(Object bcs_workflow_task_create_time){
				this.bcs_workflow_task_create_time = bcs_workflow_task_create_time;
			}
			
	  		public Object getBcs_workflow_task_create_time(){
	  			return bcs_workflow_task_create_time;
	  		}
  		  		
  							public void setBcs_workflow_task_create_time1(Object bcs_workflow_task_create_time1){
				this.bcs_workflow_task_create_time1 = bcs_workflow_task_create_time1;
			}
			
	  		public Object getBcs_workflow_task_create_time1(){
	  			return bcs_workflow_task_create_time1;
	  		}
		  		
  						public void setAtztask_id(Object atztask_id){
				this.atztask_id = atztask_id;
			}
			
	  		public Object getAtztask_id(){
	  			return atztask_id;
	  		}
  		  		
  				  		
  						public void setBcs_workflow_task_id(Object bcs_workflow_task_id){
				this.bcs_workflow_task_id = bcs_workflow_task_id;
			}
			
	  		public Object getBcs_workflow_task_id(){
	  			return bcs_workflow_task_id;
	  		}
  		  		
  				  		
  	  	
  	public static F991a3f760000000bz init(DataContextHelper context) {
  		F991a3f760000000bz o = new F991a3f760000000bz();
									o.setBcs_workflow_task_create_time(getValue(context,"bcs_workflow_task.create_time"));
						
										o.setBcs_workflow_task_create_time1(getValue(context,"bcs_workflow_task.create_time1"));
			  									o.setAtztask_id(getValue(context,"atztask.id"));
						
						  									o.setBcs_workflow_task_id(getValue(context,"bcs_workflow_task.id"));
						
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