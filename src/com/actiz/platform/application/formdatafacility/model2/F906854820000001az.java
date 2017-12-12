/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:12:54.609
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F906854820000001az{

	
						private Object atzwuliaojcxx_wuliaobm;
			
				
										private Object atzwuliaojcxx_wuliaoms;
			
				
										private Object atzkucun_xiangmuid;
			
				
										private Object atzkucun_kuweiid;
			
				
										private Object atzkucun_kucunlx;
			
				
										private Object atzkucun_meidwsl;
			
				
							private Object atzkucun_meidwsl1;
								private Object atzwuliaojcxx_danwei;
			
				
										private Object atzkucun_cunfangwz;
			
				
										private Object atzkucun_id;
			
				
										private Object atzwuliaojcxx_id;
			
				
					
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
  		  		
  				  		
  						public void setAtzkucun_xiangmuid(Object atzkucun_xiangmuid){
				this.atzkucun_xiangmuid = atzkucun_xiangmuid;
			}
			
	  		public Object getAtzkucun_xiangmuid(){
	  			return atzkucun_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzkucun_kuweiid(Object atzkucun_kuweiid){
				this.atzkucun_kuweiid = atzkucun_kuweiid;
			}
			
	  		public Object getAtzkucun_kuweiid(){
	  			return atzkucun_kuweiid;
	  		}
  		  		
  				  		
  						public void setAtzkucun_kucunlx(Object atzkucun_kucunlx){
				this.atzkucun_kucunlx = atzkucun_kucunlx;
			}
			
	  		public Object getAtzkucun_kucunlx(){
	  			return atzkucun_kucunlx;
	  		}
  		  		
  				  		
  						public void setAtzkucun_meidwsl(Object atzkucun_meidwsl){
				this.atzkucun_meidwsl = atzkucun_meidwsl;
			}
			
	  		public Object getAtzkucun_meidwsl(){
	  			return atzkucun_meidwsl;
	  		}
  		  		
  							public void setAtzkucun_meidwsl1(Object atzkucun_meidwsl1){
				this.atzkucun_meidwsl1 = atzkucun_meidwsl1;
			}
			
	  		public Object getAtzkucun_meidwsl1(){
	  			return atzkucun_meidwsl1;
	  		}
		  		
  						public void setAtzwuliaojcxx_danwei(Object atzwuliaojcxx_danwei){
				this.atzwuliaojcxx_danwei = atzwuliaojcxx_danwei;
			}
			
	  		public Object getAtzwuliaojcxx_danwei(){
	  			return atzwuliaojcxx_danwei;
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
  		  		
  				  		
  	  	
  	public static F906854820000001az init(DataContextHelper context) {
  		F906854820000001az o = new F906854820000001az();
									o.setAtzwuliaojcxx_wuliaobm(getValue(context,"atzwuliaojcxx.wuliaobm"));
						
						  									o.setAtzwuliaojcxx_wuliaoms(getValue(context,"atzwuliaojcxx.wuliaoms"));
						
						  									o.setAtzkucun_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzkucun_kuweiid(getValue(context,"atzkuwei.id"));
						
						  									o.setAtzkucun_kucunlx(getValue(context,"atzkucun.kucunlx"));
						
						  									o.setAtzkucun_meidwsl(getValue(context,"atzkucun.meidwsl"));
						
										o.setAtzkucun_meidwsl1(getValue(context,"atzkucun.meidwsl1"));
			  									o.setAtzwuliaojcxx_danwei(getValue(context,"atzwuliaojcxx.danwei"));
						
						  									o.setAtzkucun_cunfangwz(getValue(context,"atzkucun.cunfangwz"));
						
						  									o.setAtzkucun_id(getValue(context,"atzkucun.id"));
						
						  									o.setAtzwuliaojcxx_id(getValue(context,"atzwuliaojcxx.id"));
						
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