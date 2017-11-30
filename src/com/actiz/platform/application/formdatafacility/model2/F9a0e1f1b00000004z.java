/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:55:09.881
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F9a0e1f1b00000004z{

	
						private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigoujh_linshibh;
			
				
										private Object atzcaigoujh_xiangmubh;
			
				
										private Object atzcaigoujh_zhixingzt;
			
				
										private Object atzcaigoujh_tianzhibm;
			
				
										private Object atzcaigoujh_id;
			
				
					
						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_linshibh(Object atzcaigoujh_linshibh){
				this.atzcaigoujh_linshibh = atzcaigoujh_linshibh;
			}
			
	  		public Object getAtzcaigoujh_linshibh(){
	  			return atzcaigoujh_linshibh;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_xiangmubh(Object atzcaigoujh_xiangmubh){
				this.atzcaigoujh_xiangmubh = atzcaigoujh_xiangmubh;
			}
			
	  		public Object getAtzcaigoujh_xiangmubh(){
	  			return atzcaigoujh_xiangmubh;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_zhixingzt(Object atzcaigoujh_zhixingzt){
				this.atzcaigoujh_zhixingzt = atzcaigoujh_zhixingzt;
			}
			
	  		public Object getAtzcaigoujh_zhixingzt(){
	  			return atzcaigoujh_zhixingzt;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhibm(Object atzcaigoujh_tianzhibm){
				this.atzcaigoujh_tianzhibm = atzcaigoujh_tianzhibm;
			}
			
	  		public Object getAtzcaigoujh_tianzhibm(){
	  			return atzcaigoujh_tianzhibm;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F9a0e1f1b00000004z init(DataContextHelper context) {
  		F9a0e1f1b00000004z o = new F9a0e1f1b00000004z();
									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigoujh_linshibh(getValue(context,"atzcaigoujh.linshibh"));
						
						  									o.setAtzcaigoujh_xiangmubh(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzcaigoujh_zhixingzt(getValue(context,"atzcaigoujh.zhixingzt"));
						
						  									o.setAtzcaigoujh_tianzhibm(getValue(context,"atzdepartment.id"));
						
						  									o.setAtzcaigoujh_id(getValue(context,"atzcaigoujh.id"));
						
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