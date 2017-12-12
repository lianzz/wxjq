/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 15:59:26.755
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa1fb5abd00000008z{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzxiangmu_xiangmubh;
			
				
										private Object atzkuwei_kuweibh;
			
				
										private Object atzkucun_kucunlx;
			
				
										private Object atzkucun_cunfangwz;
			
				
										private Object atzkucun_id;
			
				
										private Object atzwuliaojcxx_id;
			
				
										private Object atzkuwei_id;
			
				
										private Object atzxiangmu_id;
			
				
					
						public void setAtzwuliaojcxx_wuliaobm(Object atzwuliaojcxx_wuliaobm){
				this.atzwuliaojcxx_wuliaobm = atzwuliaojcxx_wuliaobm;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaobm(){
	  			return atzwuliaojcxx_wuliaobm;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_wuliaoms(Object atzwuliaojcxx_wuliaoms){
				this.atzwuliaojcxx_wuliaoms = atzwuliaojcxx_wuliaoms;
			}
			
	  		public Object getAtzwuliaojcxx_wuliaoms(){
	  			return atzwuliaojcxx_wuliaoms;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_xiangmubh(Object atzxiangmu_xiangmubh){
				this.atzxiangmu_xiangmubh = atzxiangmu_xiangmubh;
			}
			
	  		public Object getAtzxiangmu_xiangmubh(){
	  			return atzxiangmu_xiangmubh;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_kuweibh(Object atzkuwei_kuweibh){
				this.atzkuwei_kuweibh = atzkuwei_kuweibh;
			}
			
	  		public Object getAtzkuwei_kuweibh(){
	  			return atzkuwei_kuweibh;
	  		}
  		  		
  				  		
  						public void setAtzkucun_kucunlx(Object atzkucun_kucunlx){
				this.atzkucun_kucunlx = atzkucun_kucunlx;
			}
			
	  		public Object getAtzkucun_kucunlx(){
	  			return atzkucun_kucunlx;
	  		}
  		  		
  				  		
  						public void setAtzkucun_cunfangwz(Object atzkucun_cunfangwz){
				this.atzkucun_cunfangwz = atzkucun_cunfangwz;
			}
			
	  		public Object getAtzkucun_cunfangwz(){
	  			return atzkucun_cunfangwz;
	  		}
  		  		
  				  		
  						public void setAtzkucun_id(Object atzkucun_id){
				this.atzkucun_id = atzkucun_id;
			}
			
	  		public Object getAtzkucun_id(){
	  			return atzkucun_id;
	  		}
  		  		
  				  		
  						public void setAtzwuliaojcxx_id(Object atzwuliaojcxx_id){
				this.atzwuliaojcxx_id = atzwuliaojcxx_id;
			}
			
	  		public Object getAtzwuliaojcxx_id(){
	  			return atzwuliaojcxx_id;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_id(Object atzkuwei_id){
				this.atzkuwei_id = atzkuwei_id;
			}
			
	  		public Object getAtzkuwei_id(){
	  			return atzkuwei_id;
	  		}
  		  		
  				  		
  						public void setAtzxiangmu_id(Object atzxiangmu_id){
				this.atzxiangmu_id = atzxiangmu_id;
			}
			
	  		public Object getAtzxiangmu_id(){
	  			return atzxiangmu_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa1fb5abd00000008z init(DataContextHelper context) {
  		Fa1fb5abd00000008z o = new Fa1fb5abd00000008z();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzxiangmu_xiangmubh(getValue(context,"atzxiangmu.xiangmubh"));
						
						  									o.setAtzkuwei_kuweibh(getValue(context,"atzkuwei.kuweibh"));
						
						  									o.setAtzkucun_kucunlx(getValue(context,"atzkucun.kucunlx"));
						
						  									o.setAtzkucun_cunfangwz(getValue(context,"atzkucun.cunfangwz"));
						
						  									o.setAtzkucun_id(getValue(context,"atzkucun.id"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
						  									o.setAtzkuwei_id(getValue(context,"atzkuwei.id"));
						
						  									o.setAtzxiangmu_id(getValue(context,"atzxiangmu.id"));
						
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