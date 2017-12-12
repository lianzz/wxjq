/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:36.17
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F657ebabe00000002z{

	
						private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigoujhmx_wuliaoid;
			
				
										private Object atzcaigoujhmx_changshang;
			
				
										private Object atzcaigoujhmx_xiangmuid;
			
				
										private Object atzcaigoujh_id;
			
				
										private Object atzcaigoujhmx_id;
			
				
					
						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujhmx_wuliaoid(Object atzcaigoujhmx_wuliaoid){
				this.atzcaigoujhmx_wuliaoid = atzcaigoujhmx_wuliaoid;
			}
			
	  		public Object getAtzcaigoujhmx_wuliaoid(){
	  			return atzcaigoujhmx_wuliaoid;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujhmx_changshang(Object atzcaigoujhmx_changshang){
				this.atzcaigoujhmx_changshang = atzcaigoujhmx_changshang;
			}
			
	  		public Object getAtzcaigoujhmx_changshang(){
	  			return atzcaigoujhmx_changshang;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujhmx_xiangmuid(Object atzcaigoujhmx_xiangmuid){
				this.atzcaigoujhmx_xiangmuid = atzcaigoujhmx_xiangmuid;
			}
			
	  		public Object getAtzcaigoujhmx_xiangmuid(){
	  			return atzcaigoujhmx_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujhmx_id(Object atzcaigoujhmx_id){
				this.atzcaigoujhmx_id = atzcaigoujhmx_id;
			}
			
	  		public Object getAtzcaigoujhmx_id(){
	  			return atzcaigoujhmx_id;
	  		}
  		  		
  				  		
  	  	
  	public static F657ebabe00000002z init(DataContextHelper context) {
  		F657ebabe00000002z o = new F657ebabe00000002z();
									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigoujhmx_wuliaoid(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzcaigoujhmx_changshang(getValue(context,"atzshengchancj.id"));
						
						  									o.setAtzcaigoujhmx_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzcaigoujh_id(getValue(context,"atzcaigoujh.id"));
						
						  									o.setAtzcaigoujhmx_id(getValue(context,"atzcaigoujhmx.id"));
						
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