/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-17 16:59:57.062
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F77228ed700000005z{

	
						private Object atztoubiao_bianhao;
			
				
										private Object atztoubiao_xiangmuid;
			
				
										private Object atztoubiao_xsjlid;
			
				
										private Object atztoubiao_daquid;
			
				
										private Object atztoubiao_tblx;
			
				
										private Object atztoubiao_cplx;
			
				
										private Object atztoubiao_tbrq;
			
				
							private Object atztoubiao_tbrq1;
								private Object atztoubiao_kbrq;
			
				
							private Object atztoubiao_kbrq1;
								private Object atztoubiao_tbdjzt;
			
				
										private Object atztoubiao_id;
			
				
					
						public void setAtztoubiao_bianhao(Object atztoubiao_bianhao){
				this.atztoubiao_bianhao = atztoubiao_bianhao;
			}
			
	  		public Object getAtztoubiao_bianhao(){
	  			return atztoubiao_bianhao;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_xiangmuid(Object atztoubiao_xiangmuid){
				this.atztoubiao_xiangmuid = atztoubiao_xiangmuid;
			}
			
	  		public Object getAtztoubiao_xiangmuid(){
	  			return atztoubiao_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_xsjlid(Object atztoubiao_xsjlid){
				this.atztoubiao_xsjlid = atztoubiao_xsjlid;
			}
			
	  		public Object getAtztoubiao_xsjlid(){
	  			return atztoubiao_xsjlid;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_daquid(Object atztoubiao_daquid){
				this.atztoubiao_daquid = atztoubiao_daquid;
			}
			
	  		public Object getAtztoubiao_daquid(){
	  			return atztoubiao_daquid;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_tblx(Object atztoubiao_tblx){
				this.atztoubiao_tblx = atztoubiao_tblx;
			}
			
	  		public Object getAtztoubiao_tblx(){
	  			return atztoubiao_tblx;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_cplx(Object atztoubiao_cplx){
				this.atztoubiao_cplx = atztoubiao_cplx;
			}
			
	  		public Object getAtztoubiao_cplx(){
	  			return atztoubiao_cplx;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_tbrq(Object atztoubiao_tbrq){
				this.atztoubiao_tbrq = atztoubiao_tbrq;
			}
			
	  		public Object getAtztoubiao_tbrq(){
	  			return atztoubiao_tbrq;
	  		}
  		  		
  							public void setAtztoubiao_tbrq1(Object atztoubiao_tbrq1){
				this.atztoubiao_tbrq1 = atztoubiao_tbrq1;
			}
			
	  		public Object getAtztoubiao_tbrq1(){
	  			return atztoubiao_tbrq1;
	  		}
		  		
  						public void setAtztoubiao_kbrq(Object atztoubiao_kbrq){
				this.atztoubiao_kbrq = atztoubiao_kbrq;
			}
			
	  		public Object getAtztoubiao_kbrq(){
	  			return atztoubiao_kbrq;
	  		}
  		  		
  							public void setAtztoubiao_kbrq1(Object atztoubiao_kbrq1){
				this.atztoubiao_kbrq1 = atztoubiao_kbrq1;
			}
			
	  		public Object getAtztoubiao_kbrq1(){
	  			return atztoubiao_kbrq1;
	  		}
		  		
  						public void setAtztoubiao_tbdjzt(Object atztoubiao_tbdjzt){
				this.atztoubiao_tbdjzt = atztoubiao_tbdjzt;
			}
			
	  		public Object getAtztoubiao_tbdjzt(){
	  			return atztoubiao_tbdjzt;
	  		}
  		  		
  				  		
  						public void setAtztoubiao_id(Object atztoubiao_id){
				this.atztoubiao_id = atztoubiao_id;
			}
			
	  		public Object getAtztoubiao_id(){
	  			return atztoubiao_id;
	  		}
  		  		
  				  		
  	  	
  	public static F77228ed700000005z init(DataContextHelper context) {
  		F77228ed700000005z o = new F77228ed700000005z();
									o.setAtztoubiao_bianhao(getValue(context,"atztoubiao.bianhao"));
						
						  									o.setAtztoubiao_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtztoubiao_xsjlid(getValue(context,"atzemployee.id"));
						
						  									o.setAtztoubiao_daquid(getValue(context,"atzdepartment.id"));
						
						  									o.setAtztoubiao_tblx(getValue(context,"atztoubiao.tblx"));
						
						  									o.setAtztoubiao_cplx(getValue(context,"atztoubiao.cplx"));
						
						  									o.setAtztoubiao_tbrq(getValue(context,"atztoubiao.tbrq"));
						
										o.setAtztoubiao_tbrq1(getValue(context,"atztoubiao.tbrq1"));
			  									o.setAtztoubiao_kbrq(getValue(context,"atztoubiao.kbrq"));
						
										o.setAtztoubiao_kbrq1(getValue(context,"atztoubiao.kbrq1"));
			  									o.setAtztoubiao_tbdjzt(getValue(context,"atztoubiao.tbdjzt"));
						
						  									o.setAtztoubiao_id(getValue(context,"atztoubiao.id"));
						
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