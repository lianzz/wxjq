/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:51:59.58
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F570fdd4e0000000fz{

	
						private Object atztuandui_bianhao;
			
				
										private Object atztuandui_mingcheng;
			
				
										private Object atzdepartment_yewulx;
			
				
										private Object atzdepartment_id;
			
				
										private Object atztuandui_id;
			
				
					
						public void setAtztuandui_bianhao(Object atztuandui_bianhao){
				this.atztuandui_bianhao = atztuandui_bianhao;
			}
			
	  		public Object getAtztuandui_bianhao(){
	  			return atztuandui_bianhao;
	  		}
  		  		
  				  		
  						public void setAtztuandui_mingcheng(Object atztuandui_mingcheng){
				this.atztuandui_mingcheng = atztuandui_mingcheng;
			}
			
	  		public Object getAtztuandui_mingcheng(){
	  			return atztuandui_mingcheng;
	  		}
  		  		
  				  		
  						public void setAtzdepartment_yewulx(Object atzdepartment_yewulx){
				this.atzdepartment_yewulx = atzdepartment_yewulx;
			}
			
	  		public Object getAtzdepartment_yewulx(){
	  			return atzdepartment_yewulx;
	  		}
  		  		
  				  		
  						public void setAtzdepartment_id(Object atzdepartment_id){
				this.atzdepartment_id = atzdepartment_id;
			}
			
	  		public Object getAtzdepartment_id(){
	  			return atzdepartment_id;
	  		}
  		  		
  				  		
  						public void setAtztuandui_id(Object atztuandui_id){
				this.atztuandui_id = atztuandui_id;
			}
			
	  		public Object getAtztuandui_id(){
	  			return atztuandui_id;
	  		}
  		  		
  				  		
  	  	
  	public static F570fdd4e0000000fz init(DataContextHelper context) {
  		F570fdd4e0000000fz o = new F570fdd4e0000000fz();
									o.setAtztuandui_bianhao(getValue(context,"atztuandui.bianhao"));
						
						  									o.setAtztuandui_mingcheng(getValue(context,"atztuandui.mingcheng"));
						
						  									o.setAtzdepartment_yewulx(getValue(context,"atzdepartment.yewulx"));
						
						  									o.setAtzdepartment_id(getValue(context,"atzdepartment.id"));
						
						  									o.setAtztuandui_id(getValue(context,"atztuandui.id"));
						
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