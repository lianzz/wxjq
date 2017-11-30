/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:56:38.172
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F906c8ca10000001cz{

	
						private Object atzpandiand_bianhao;
			
				
										private Object atzpandiand_xiangmuid;
			
				
										private Object atzpandiand_pandianksrq;
			
				
							private Object atzpandiand_pandianksrq1;
								private Object atzpandiand_pandianjsrq;
			
				
							private Object atzpandiand_pandianjsrq1;
								private Object atzpandiand_pandianr;
			
				
										private Object atzpandiand_zhidanr;
			
				
										private Object atzpandiand_ispandian;
			
				
										private Object atzpandiand_id;
			
				
					
						public void setAtzpandiand_bianhao(Object atzpandiand_bianhao){
				this.atzpandiand_bianhao = atzpandiand_bianhao;
			}
			
	  		public Object getAtzpandiand_bianhao(){
	  			return atzpandiand_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzpandiand_xiangmuid(Object atzpandiand_xiangmuid){
				this.atzpandiand_xiangmuid = atzpandiand_xiangmuid;
			}
			
	  		public Object getAtzpandiand_xiangmuid(){
	  			return atzpandiand_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzpandiand_pandianksrq(Object atzpandiand_pandianksrq){
				this.atzpandiand_pandianksrq = atzpandiand_pandianksrq;
			}
			
	  		public Object getAtzpandiand_pandianksrq(){
	  			return atzpandiand_pandianksrq;
	  		}
  		  		
  							public void setAtzpandiand_pandianksrq1(Object atzpandiand_pandianksrq1){
				this.atzpandiand_pandianksrq1 = atzpandiand_pandianksrq1;
			}
			
	  		public Object getAtzpandiand_pandianksrq1(){
	  			return atzpandiand_pandianksrq1;
	  		}
		  		
  						public void setAtzpandiand_pandianjsrq(Object atzpandiand_pandianjsrq){
				this.atzpandiand_pandianjsrq = atzpandiand_pandianjsrq;
			}
			
	  		public Object getAtzpandiand_pandianjsrq(){
	  			return atzpandiand_pandianjsrq;
	  		}
  		  		
  							public void setAtzpandiand_pandianjsrq1(Object atzpandiand_pandianjsrq1){
				this.atzpandiand_pandianjsrq1 = atzpandiand_pandianjsrq1;
			}
			
	  		public Object getAtzpandiand_pandianjsrq1(){
	  			return atzpandiand_pandianjsrq1;
	  		}
		  		
  						public void setAtzpandiand_pandianr(Object atzpandiand_pandianr){
				this.atzpandiand_pandianr = atzpandiand_pandianr;
			}
			
	  		public Object getAtzpandiand_pandianr(){
	  			return atzpandiand_pandianr;
	  		}
  		  		
  				  		
  						public void setAtzpandiand_zhidanr(Object atzpandiand_zhidanr){
				this.atzpandiand_zhidanr = atzpandiand_zhidanr;
			}
			
	  		public Object getAtzpandiand_zhidanr(){
	  			return atzpandiand_zhidanr;
	  		}
  		  		
  				  		
  						public void setAtzpandiand_ispandian(Object atzpandiand_ispandian){
				this.atzpandiand_ispandian = atzpandiand_ispandian;
			}
			
	  		public Object getAtzpandiand_ispandian(){
	  			return atzpandiand_ispandian;
	  		}
  		  		
  				  		
  						public void setAtzpandiand_id(Object atzpandiand_id){
				this.atzpandiand_id = atzpandiand_id;
			}
			
	  		public Object getAtzpandiand_id(){
	  			return atzpandiand_id;
	  		}
  		  		
  				  		
  	  	
  	public static F906c8ca10000001cz init(DataContextHelper context) {
  		F906c8ca10000001cz o = new F906c8ca10000001cz();
									o.setAtzpandiand_bianhao(getValue(context,"atzpandiand.bianhao"));
						
						  									o.setAtzpandiand_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzpandiand_pandianksrq(getValue(context,"atzpandiand.pandianksrq"));
						
										o.setAtzpandiand_pandianksrq1(getValue(context,"atzpandiand.pandianksrq1"));
			  									o.setAtzpandiand_pandianjsrq(getValue(context,"atzpandiand.pandianjsrq"));
						
										o.setAtzpandiand_pandianjsrq1(getValue(context,"atzpandiand.pandianjsrq1"));
			  									o.setAtzpandiand_pandianr(getValue(context,"atzpandiand.pandianr"));
						
						  									o.setAtzpandiand_zhidanr(getValue(context,"atzpandiand.zhidanr"));
						
						  									o.setAtzpandiand_ispandian(getValue(context,"atzpandiand.ispandian"));
						
						  									o.setAtzpandiand_id(getValue(context,"atzpandiand.id"));
						
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