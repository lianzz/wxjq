/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:58:25.325
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F87b1b3ac00000003z{

	
						private Object atzdiaobod_bianhao;
			
				
										private Object atzkuwei_kuweimc;
			
				
										private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzdiaobodmx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzdiaobod_diaoborq;
			
				
							private Object atzdiaobod_diaoborq1;
								private Object atzdiaobod_id;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzdiaobodmx_id;
			
				
										private Object atzkuwei_id;
			
				
					
						public void setAtzdiaobod_bianhao(Object atzdiaobod_bianhao){
				this.atzdiaobod_bianhao = atzdiaobod_bianhao;
			}
			
	  		public Object getAtzdiaobod_bianhao(){
	  			return atzdiaobod_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_kuweimc(Object atzkuwei_kuweimc){
				this.atzkuwei_kuweimc = atzkuwei_kuweimc;
			}
			
	  		public Object getAtzkuwei_kuweimc(){
	  			return atzkuwei_kuweimc;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzdiaobodmx_wuliaobm(Object atzdiaobodmx_wuliaobm){
				this.atzdiaobodmx_wuliaobm = atzdiaobodmx_wuliaobm;
			}
			
	  		public Object getAtzdiaobodmx_wuliaobm(){
	  			return atzdiaobodmx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzdiaobod_diaoborq(Object atzdiaobod_diaoborq){
				this.atzdiaobod_diaoborq = atzdiaobod_diaoborq;
			}
			
	  		public Object getAtzdiaobod_diaoborq(){
	  			return atzdiaobod_diaoborq;
	  		}
  		  		
  							public void setAtzdiaobod_diaoborq1(Object atzdiaobod_diaoborq1){
				this.atzdiaobod_diaoborq1 = atzdiaobod_diaoborq1;
			}
			
	  		public Object getAtzdiaobod_diaoborq1(){
	  			return atzdiaobod_diaoborq1;
	  		}
		  		
  						public void setAtzdiaobod_id(Object atzdiaobod_id){
				this.atzdiaobod_id = atzdiaobod_id;
			}
			
	  		public Object getAtzdiaobod_id(){
	  			return atzdiaobod_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzdiaobodmx_id(Object atzdiaobodmx_id){
				this.atzdiaobodmx_id = atzdiaobodmx_id;
			}
			
	  		public Object getAtzdiaobodmx_id(){
	  			return atzdiaobodmx_id;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_id(Object atzkuwei_id){
				this.atzkuwei_id = atzkuwei_id;
			}
			
	  		public Object getAtzkuwei_id(){
	  			return atzkuwei_id;
	  		}
  		  		
  				  		
  	  	
  	public static F87b1b3ac00000003z init(DataContextHelper context) {
  		F87b1b3ac00000003z o = new F87b1b3ac00000003z();
									o.setAtzdiaobod_bianhao(getValue(context,"atzdiaobod.bianhao"));
						
						  									o.setAtzkuwei_kuweimc(getValue(context,"atzkuwei.kuweimc"));
						
						  									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzdiaobodmx_wuliaobm(getValue(context,"atzdiaobodmx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzdiaobod_diaoborq(getValue(context,"atzdiaobod.diaoborq"));
						
										o.setAtzdiaobod_diaoborq1(getValue(context,"atzdiaobod.diaoborq1"));
			  									o.setAtzdiaobod_id(getValue(context,"atzdiaobod.id"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzdiaobodmx_id(getValue(context,"atzdiaobodmx.id"));
						
						  									o.setAtzkuwei_id(getValue(context,"atzkuwei.id"));
						
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