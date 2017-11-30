/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:14.577
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9f68c05100000001z{

	
						private Object atzfaqbiao_bianhao;
			
				
										private Object atzfaqbiao_zhuti;
			
				
										private Object atzchanpinn_chanpinxh;
			
				
										private Object atzfaqbiao_guzhanglx;
			
				
										private Object atzfaqbiao_wentims;
			
				
										private Object atzfaqbiao_jiejueff;
			
				
										private Object atzfaqbiao_cqsyh;
			
				
										private Object atzchanpinn_id;
			
				
										private Object atzfaqbiao_id;
			
				
					
						public void setAtzfaqbiao_bianhao(Object atzfaqbiao_bianhao){
				this.atzfaqbiao_bianhao = atzfaqbiao_bianhao;
			}
			
	  		public Object getAtzfaqbiao_bianhao(){
	  			return atzfaqbiao_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_zhuti(Object atzfaqbiao_zhuti){
				this.atzfaqbiao_zhuti = atzfaqbiao_zhuti;
			}
			
	  		public Object getAtzfaqbiao_zhuti(){
	  			return atzfaqbiao_zhuti;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_chanpinxh(Object atzchanpinn_chanpinxh){
				this.atzchanpinn_chanpinxh = atzchanpinn_chanpinxh;
			}
			
	  		public Object getAtzchanpinn_chanpinxh(){
	  			return atzchanpinn_chanpinxh;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_guzhanglx(Object atzfaqbiao_guzhanglx){
				this.atzfaqbiao_guzhanglx = atzfaqbiao_guzhanglx;
			}
			
	  		public Object getAtzfaqbiao_guzhanglx(){
	  			return atzfaqbiao_guzhanglx;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_wentims(Object atzfaqbiao_wentims){
				this.atzfaqbiao_wentims = atzfaqbiao_wentims;
			}
			
	  		public Object getAtzfaqbiao_wentims(){
	  			return atzfaqbiao_wentims;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_jiejueff(Object atzfaqbiao_jiejueff){
				this.atzfaqbiao_jiejueff = atzfaqbiao_jiejueff;
			}
			
	  		public Object getAtzfaqbiao_jiejueff(){
	  			return atzfaqbiao_jiejueff;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_cqsyh(Object atzfaqbiao_cqsyh){
				this.atzfaqbiao_cqsyh = atzfaqbiao_cqsyh;
			}
			
	  		public Object getAtzfaqbiao_cqsyh(){
	  			return atzfaqbiao_cqsyh;
	  		}
  		  		
  				  		
  						public void setAtzchanpinn_id(Object atzchanpinn_id){
				this.atzchanpinn_id = atzchanpinn_id;
			}
			
	  		public Object getAtzchanpinn_id(){
	  			return atzchanpinn_id;
	  		}
  		  		
  				  		
  						public void setAtzfaqbiao_id(Object atzfaqbiao_id){
				this.atzfaqbiao_id = atzfaqbiao_id;
			}
			
	  		public Object getAtzfaqbiao_id(){
	  			return atzfaqbiao_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9f68c05100000001z init(DataContextHelper context) {
  		F9f68c05100000001z o = new F9f68c05100000001z();
									o.setAtzfaqbiao_bianhao(getValue(context,"atzfaqbiao.bianhao"));
						
						  									o.setAtzfaqbiao_zhuti(getValue(context,"atzfaqbiao.zhuti"));
						
						  									o.setAtzchanpinn_chanpinxh(getValue(context,"atzchanpinn.chanpinxh"));
						
						  									o.setAtzfaqbiao_guzhanglx(getValue(context,"atzfaqbiao.guzhanglx"));
						
						  									o.setAtzfaqbiao_wentims(getValue(context,"atzfaqbiao.wentims"));
						
						  									o.setAtzfaqbiao_jiejueff(getValue(context,"atzfaqbiao.jiejueff"));
						
						  									o.setAtzfaqbiao_cqsyh(getValue(context,"atzfaqbiao.cqsyh"));
						
						  									o.setAtzchanpinn_id(getValue(context,"atzchanpinn.id"));
						
						  									o.setAtzfaqbiao_id(getValue(context,"atzfaqbiao.id"));
						
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