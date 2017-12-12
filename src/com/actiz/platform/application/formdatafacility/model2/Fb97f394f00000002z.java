/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:08:35.615
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fb97f394f00000002z{

	
						private Object atzcaigoujh_bianhao;
			
				
										private Object atzcaigoujh_xiangmubh;
			
				
										private Object atzcaigoujh_tianzhir;
			
				
										private Object atzcaigoujh_tianzhirq;
			
				
							private Object atzcaigoujh_tianzhirq1;
								private Object atzcaigoujh_id;
			
				
					
						public void setAtzcaigoujh_bianhao(Object atzcaigoujh_bianhao){
				this.atzcaigoujh_bianhao = atzcaigoujh_bianhao;
			}
			
	  		public Object getAtzcaigoujh_bianhao(){
	  			return atzcaigoujh_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_xiangmubh(Object atzcaigoujh_xiangmubh){
				this.atzcaigoujh_xiangmubh = atzcaigoujh_xiangmubh;
			}
			
	  		public Object getAtzcaigoujh_xiangmubh(){
	  			return atzcaigoujh_xiangmubh;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhir(Object atzcaigoujh_tianzhir){
				this.atzcaigoujh_tianzhir = atzcaigoujh_tianzhir;
			}
			
	  		public Object getAtzcaigoujh_tianzhir(){
	  			return atzcaigoujh_tianzhir;
	  		}
  		  		
  				  		
  						public void setAtzcaigoujh_tianzhirq(Object atzcaigoujh_tianzhirq){
				this.atzcaigoujh_tianzhirq = atzcaigoujh_tianzhirq;
			}
			
	  		public Object getAtzcaigoujh_tianzhirq(){
	  			return atzcaigoujh_tianzhirq;
	  		}
  		  		
  							public void setAtzcaigoujh_tianzhirq1(Object atzcaigoujh_tianzhirq1){
				this.atzcaigoujh_tianzhirq1 = atzcaigoujh_tianzhirq1;
			}
			
	  		public Object getAtzcaigoujh_tianzhirq1(){
	  			return atzcaigoujh_tianzhirq1;
	  		}
		  		
  						public void setAtzcaigoujh_id(Object atzcaigoujh_id){
				this.atzcaigoujh_id = atzcaigoujh_id;
			}
			
	  		public Object getAtzcaigoujh_id(){
	  			return atzcaigoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fb97f394f00000002z init(DataContextHelper context) {
  		Fb97f394f00000002z o = new Fb97f394f00000002z();
									o.setAtzcaigoujh_bianhao(getValue(context,"atzcaigoujh.bianhao"));
						
						  									o.setAtzcaigoujh_xiangmubh(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzcaigoujh_tianzhir(getValue(context,"atzcaigoujh.tianzhir"));
						
						  									o.setAtzcaigoujh_tianzhirq(getValue(context,"atzcaigoujh.tianzhirq"));
						
										o.setAtzcaigoujh_tianzhirq1(getValue(context,"atzcaigoujh.tianzhirq1"));
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