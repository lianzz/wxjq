/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:01.627
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F051661ff00000006z{

	
						private Object atzchanpinda_xuhao;
			
				
										private Object atzchanpinda_chanpin;
			
				
										private Object atzchanpinda_danganlx;
			
				
										private Object atzchanpinda_danganmc;
			
				
										private Object atzchanpinda_youxiaox;
			
				
										private Object atzchanpinda_fazhengjg;
			
				
										private Object atzchanpinda_fazhengrq;
			
				
							private Object atzchanpinda_fazhengrq1;
								private Object atzchanpinda_danganyxq;
			
				
							private Object atzchanpinda_danganyxq1;
								private Object atzchanpinda_id;
			
				
					
						public void setAtzchanpinda_xuhao(Object atzchanpinda_xuhao){
				this.atzchanpinda_xuhao = atzchanpinda_xuhao;
			}
			
	  		public Object getAtzchanpinda_xuhao(){
	  			return atzchanpinda_xuhao;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_chanpin(Object atzchanpinda_chanpin){
				this.atzchanpinda_chanpin = atzchanpinda_chanpin;
			}
			
	  		public Object getAtzchanpinda_chanpin(){
	  			return atzchanpinda_chanpin;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_danganlx(Object atzchanpinda_danganlx){
				this.atzchanpinda_danganlx = atzchanpinda_danganlx;
			}
			
	  		public Object getAtzchanpinda_danganlx(){
	  			return atzchanpinda_danganlx;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_danganmc(Object atzchanpinda_danganmc){
				this.atzchanpinda_danganmc = atzchanpinda_danganmc;
			}
			
	  		public Object getAtzchanpinda_danganmc(){
	  			return atzchanpinda_danganmc;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_youxiaox(Object atzchanpinda_youxiaox){
				this.atzchanpinda_youxiaox = atzchanpinda_youxiaox;
			}
			
	  		public Object getAtzchanpinda_youxiaox(){
	  			return atzchanpinda_youxiaox;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_fazhengjg(Object atzchanpinda_fazhengjg){
				this.atzchanpinda_fazhengjg = atzchanpinda_fazhengjg;
			}
			
	  		public Object getAtzchanpinda_fazhengjg(){
	  			return atzchanpinda_fazhengjg;
	  		}
  		  		
  				  		
  						public void setAtzchanpinda_fazhengrq(Object atzchanpinda_fazhengrq){
				this.atzchanpinda_fazhengrq = atzchanpinda_fazhengrq;
			}
			
	  		public Object getAtzchanpinda_fazhengrq(){
	  			return atzchanpinda_fazhengrq;
	  		}
  		  		
  							public void setAtzchanpinda_fazhengrq1(Object atzchanpinda_fazhengrq1){
				this.atzchanpinda_fazhengrq1 = atzchanpinda_fazhengrq1;
			}
			
	  		public Object getAtzchanpinda_fazhengrq1(){
	  			return atzchanpinda_fazhengrq1;
	  		}
		  		
  						public void setAtzchanpinda_danganyxq(Object atzchanpinda_danganyxq){
				this.atzchanpinda_danganyxq = atzchanpinda_danganyxq;
			}
			
	  		public Object getAtzchanpinda_danganyxq(){
	  			return atzchanpinda_danganyxq;
	  		}
  		  		
  							public void setAtzchanpinda_danganyxq1(Object atzchanpinda_danganyxq1){
				this.atzchanpinda_danganyxq1 = atzchanpinda_danganyxq1;
			}
			
	  		public Object getAtzchanpinda_danganyxq1(){
	  			return atzchanpinda_danganyxq1;
	  		}
		  		
  						public void setAtzchanpinda_id(Object atzchanpinda_id){
				this.atzchanpinda_id = atzchanpinda_id;
			}
			
	  		public Object getAtzchanpinda_id(){
	  			return atzchanpinda_id;
	  		}
  		  		
  				  		
  	  	
  	public static F051661ff00000006z init(DataContextHelper context) {
  		F051661ff00000006z o = new F051661ff00000006z();
									o.setAtzchanpinda_xuhao(getValue(context,"atzchanpinda.xuhao"));
						
						  									o.setAtzchanpinda_chanpin(getValue(context,"atzchanpinn.id"));
						
						  									o.setAtzchanpinda_danganlx(getValue(context,"atzchanpinda.danganlx"));
						
						  									o.setAtzchanpinda_danganmc(getValue(context,"atzchanpinda.danganmc"));
						
						  									o.setAtzchanpinda_youxiaox(getValue(context,"atzchanpinda.youxiaox"));
						
						  									o.setAtzchanpinda_fazhengjg(getValue(context,"atzchanpinda.fazhengjg"));
						
						  									o.setAtzchanpinda_fazhengrq(getValue(context,"atzchanpinda.fazhengrq"));
						
										o.setAtzchanpinda_fazhengrq1(getValue(context,"atzchanpinda.fazhengrq1"));
			  									o.setAtzchanpinda_danganyxq(getValue(context,"atzchanpinda.danganyxq"));
						
										o.setAtzchanpinda_danganyxq1(getValue(context,"atzchanpinda.danganyxq1"));
			  									o.setAtzchanpinda_id(getValue(context,"atzchanpinda.id"));
						
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