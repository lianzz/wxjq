/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-06-15 13:47:35.643
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F33bacbf90000000dz{

	
						private Object atzzhuangxiangd_fahuotzdid;
			
				
										private Object atzfahuotzd_hetongid;
			
				
										private Object atzzhuangxiangd_xiangmuid;
			
				
										private Object atzzhuangxiangd_xianghao;
			
				
										private Object atzzhuangxiangd_shengchanrq;
			
				
							private Object atzzhuangxiangd_shengchanrq1;
								private Object atzzhuangxiangd_id;
			
				
										private Object atzfahuotzd_id;
			
				
					
						public void setAtzzhuangxiangd_fahuotzdid(Object atzzhuangxiangd_fahuotzdid){
				this.atzzhuangxiangd_fahuotzdid = atzzhuangxiangd_fahuotzdid;
			}
			
	  		public Object getAtzzhuangxiangd_fahuotzdid(){
	  			return atzzhuangxiangd_fahuotzdid;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_hetongid(Object atzfahuotzd_hetongid){
				this.atzfahuotzd_hetongid = atzfahuotzd_hetongid;
			}
			
	  		public Object getAtzfahuotzd_hetongid(){
	  			return atzfahuotzd_hetongid;
	  		}
  		  		
  				  		
  						public void setAtzzhuangxiangd_xiangmuid(Object atzzhuangxiangd_xiangmuid){
				this.atzzhuangxiangd_xiangmuid = atzzhuangxiangd_xiangmuid;
			}
			
	  		public Object getAtzzhuangxiangd_xiangmuid(){
	  			return atzzhuangxiangd_xiangmuid;
	  		}
  		  		
  				  		
  						public void setAtzzhuangxiangd_xianghao(Object atzzhuangxiangd_xianghao){
				this.atzzhuangxiangd_xianghao = atzzhuangxiangd_xianghao;
			}
			
	  		public Object getAtzzhuangxiangd_xianghao(){
	  			return atzzhuangxiangd_xianghao;
	  		}
  		  		
  				  		
  						public void setAtzzhuangxiangd_shengchanrq(Object atzzhuangxiangd_shengchanrq){
				this.atzzhuangxiangd_shengchanrq = atzzhuangxiangd_shengchanrq;
			}
			
	  		public Object getAtzzhuangxiangd_shengchanrq(){
	  			return atzzhuangxiangd_shengchanrq;
	  		}
  		  		
  							public void setAtzzhuangxiangd_shengchanrq1(Object atzzhuangxiangd_shengchanrq1){
				this.atzzhuangxiangd_shengchanrq1 = atzzhuangxiangd_shengchanrq1;
			}
			
	  		public Object getAtzzhuangxiangd_shengchanrq1(){
	  			return atzzhuangxiangd_shengchanrq1;
	  		}
		  		
  						public void setAtzzhuangxiangd_id(Object atzzhuangxiangd_id){
				this.atzzhuangxiangd_id = atzzhuangxiangd_id;
			}
			
	  		public Object getAtzzhuangxiangd_id(){
	  			return atzzhuangxiangd_id;
	  		}
  		  		
  				  		
  						public void setAtzfahuotzd_id(Object atzfahuotzd_id){
				this.atzfahuotzd_id = atzfahuotzd_id;
			}
			
	  		public Object getAtzfahuotzd_id(){
	  			return atzfahuotzd_id;
	  		}
  		  		
  				  		
  	  	
  	public static F33bacbf90000000dz init(DataContextHelper context) {
  		F33bacbf90000000dz o = new F33bacbf90000000dz();
									o.setAtzzhuangxiangd_fahuotzdid(getValue(context,"atzfahuotzd.id"));
						
						  									o.setAtzfahuotzd_hetongid(getValue(context,"atzhetong.id"));
						
						  									o.setAtzzhuangxiangd_xiangmuid(getValue(context,"atzxiangmu.id"));
						
						  									o.setAtzzhuangxiangd_xianghao(getValue(context,"atzzhuangxiangd.xianghao"));
						
						  									o.setAtzzhuangxiangd_shengchanrq(getValue(context,"atzzhuangxiangd.shengchanrq"));
						
										o.setAtzzhuangxiangd_shengchanrq1(getValue(context,"atzzhuangxiangd.shengchanrq1"));
			  									o.setAtzzhuangxiangd_id(getValue(context,"atzzhuangxiangd.id"));
						
						  									o.setAtzfahuotzd_id(getValue(context,"atzfahuotzd.id"));
						
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