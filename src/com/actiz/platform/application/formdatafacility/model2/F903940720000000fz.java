/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:57.236
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F903940720000000fz{

	
						private Object atzxiaoshoujh_jihuizt;
			
				
										private Object atzxiaoshoujh_kehuid;
			
				
										private Object atzxiaoshoujh_fuzer;
			
				
										private Object atzxiaoshoujh_laiyuan;
			
				
										private Object atzxiaoshoujh_jieduan;
			
				
										private Object atzxiaoshoujh_zhuangtai;
			
				
										private Object atzxiaoshoujh_chenggongl;
			
				
										private Object atzxiaoshoujh_shifougb;
			
				
										private Object atzxiaoshoujh_id;
			
				
					
						public void setAtzxiaoshoujh_jihuizt(Object atzxiaoshoujh_jihuizt){
				this.atzxiaoshoujh_jihuizt = atzxiaoshoujh_jihuizt;
			}
			
	  		public Object getAtzxiaoshoujh_jihuizt(){
	  			return atzxiaoshoujh_jihuizt;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_kehuid(Object atzxiaoshoujh_kehuid){
				this.atzxiaoshoujh_kehuid = atzxiaoshoujh_kehuid;
			}
			
	  		public Object getAtzxiaoshoujh_kehuid(){
	  			return atzxiaoshoujh_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_fuzer(Object atzxiaoshoujh_fuzer){
				this.atzxiaoshoujh_fuzer = atzxiaoshoujh_fuzer;
			}
			
	  		public Object getAtzxiaoshoujh_fuzer(){
	  			return atzxiaoshoujh_fuzer;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_laiyuan(Object atzxiaoshoujh_laiyuan){
				this.atzxiaoshoujh_laiyuan = atzxiaoshoujh_laiyuan;
			}
			
	  		public Object getAtzxiaoshoujh_laiyuan(){
	  			return atzxiaoshoujh_laiyuan;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_jieduan(Object atzxiaoshoujh_jieduan){
				this.atzxiaoshoujh_jieduan = atzxiaoshoujh_jieduan;
			}
			
	  		public Object getAtzxiaoshoujh_jieduan(){
	  			return atzxiaoshoujh_jieduan;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_zhuangtai(Object atzxiaoshoujh_zhuangtai){
				this.atzxiaoshoujh_zhuangtai = atzxiaoshoujh_zhuangtai;
			}
			
	  		public Object getAtzxiaoshoujh_zhuangtai(){
	  			return atzxiaoshoujh_zhuangtai;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_chenggongl(Object atzxiaoshoujh_chenggongl){
				this.atzxiaoshoujh_chenggongl = atzxiaoshoujh_chenggongl;
			}
			
	  		public Object getAtzxiaoshoujh_chenggongl(){
	  			return atzxiaoshoujh_chenggongl;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_shifougb(Object atzxiaoshoujh_shifougb){
				this.atzxiaoshoujh_shifougb = atzxiaoshoujh_shifougb;
			}
			
	  		public Object getAtzxiaoshoujh_shifougb(){
	  			return atzxiaoshoujh_shifougb;
	  		}
  		  		
  				  		
  						public void setAtzxiaoshoujh_id(Object atzxiaoshoujh_id){
				this.atzxiaoshoujh_id = atzxiaoshoujh_id;
			}
			
	  		public Object getAtzxiaoshoujh_id(){
	  			return atzxiaoshoujh_id;
	  		}
  		  		
  				  		
  	  	
  	public static F903940720000000fz init(DataContextHelper context) {
  		F903940720000000fz o = new F903940720000000fz();
									o.setAtzxiaoshoujh_jihuizt(getValue(context,"atzxiaoshoujh.jihuizt"));
						
						  									o.setAtzxiaoshoujh_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzxiaoshoujh_fuzer(getValue(context,"atztdyg.id"));
						
						  									o.setAtzxiaoshoujh_laiyuan(getValue(context,"atzxiaoshoujh.laiyuan"));
						
						  									o.setAtzxiaoshoujh_jieduan(getValue(context,"atzxiaoshoujh.jieduan"));
						
						  									o.setAtzxiaoshoujh_zhuangtai(getValue(context,"atzxiaoshoujh.zhuangtai"));
						
						  									o.setAtzxiaoshoujh_chenggongl(getValue(context,"atzxiaoshoujh.chenggongl"));
						
						  									o.setAtzxiaoshoujh_shifougb(getValue(context,"atzxiaoshoujh.shifougb"));
						
						  									o.setAtzxiaoshoujh_id(getValue(context,"atzxiaoshoujh.id"));
						
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