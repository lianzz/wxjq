/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2015-09-18 14:52:52.246
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fdf32f1140000000az{

	
						private Object atzyuangong_yuangongid;
			
				
										private Object atzyuangong_yuangongmc;
			
				
										private Object atzyuangong_xingbie;
			
				
										private Object atzyuangong_yuangongrz;
			
				
							private Object atzyuangong_yuangongrz1;
								private Object atzyuangong_yuangongxl;
			
				
										private Object atzyuangong_lurusj;
			
				
							private Object atzyuangong_lurusj1;
								private Object atzyuangong_id;
			
				
					
						public void setAtzyuangong_yuangongid(Object atzyuangong_yuangongid){
				this.atzyuangong_yuangongid = atzyuangong_yuangongid;
			}
			
	  		public Object getAtzyuangong_yuangongid(){
	  			return atzyuangong_yuangongid;
	  		}
  		  		
  				  		
  						public void setAtzyuangong_yuangongmc(Object atzyuangong_yuangongmc){
				this.atzyuangong_yuangongmc = atzyuangong_yuangongmc;
			}
			
	  		public Object getAtzyuangong_yuangongmc(){
	  			return atzyuangong_yuangongmc;
	  		}
  		  		
  				  		
  						public void setAtzyuangong_xingbie(Object atzyuangong_xingbie){
				this.atzyuangong_xingbie = atzyuangong_xingbie;
			}
			
	  		public Object getAtzyuangong_xingbie(){
	  			return atzyuangong_xingbie;
	  		}
  		  		
  				  		
  						public void setAtzyuangong_yuangongrz(Object atzyuangong_yuangongrz){
				this.atzyuangong_yuangongrz = atzyuangong_yuangongrz;
			}
			
	  		public Object getAtzyuangong_yuangongrz(){
	  			return atzyuangong_yuangongrz;
	  		}
  		  		
  							public void setAtzyuangong_yuangongrz1(Object atzyuangong_yuangongrz1){
				this.atzyuangong_yuangongrz1 = atzyuangong_yuangongrz1;
			}
			
	  		public Object getAtzyuangong_yuangongrz1(){
	  			return atzyuangong_yuangongrz1;
	  		}
		  		
  						public void setAtzyuangong_yuangongxl(Object atzyuangong_yuangongxl){
				this.atzyuangong_yuangongxl = atzyuangong_yuangongxl;
			}
			
	  		public Object getAtzyuangong_yuangongxl(){
	  			return atzyuangong_yuangongxl;
	  		}
  		  		
  				  		
  						public void setAtzyuangong_lurusj(Object atzyuangong_lurusj){
				this.atzyuangong_lurusj = atzyuangong_lurusj;
			}
			
	  		public Object getAtzyuangong_lurusj(){
	  			return atzyuangong_lurusj;
	  		}
  		  		
  							public void setAtzyuangong_lurusj1(Object atzyuangong_lurusj1){
				this.atzyuangong_lurusj1 = atzyuangong_lurusj1;
			}
			
	  		public Object getAtzyuangong_lurusj1(){
	  			return atzyuangong_lurusj1;
	  		}
		  		
  						public void setAtzyuangong_id(Object atzyuangong_id){
				this.atzyuangong_id = atzyuangong_id;
			}
			
	  		public Object getAtzyuangong_id(){
	  			return atzyuangong_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fdf32f1140000000az init(DataContextHelper context) {
  		Fdf32f1140000000az o = new Fdf32f1140000000az();
									o.setAtzyuangong_yuangongid(getValue(context,"atzyuangong.yuangongid"));
						
						  									o.setAtzyuangong_yuangongmc(getValue(context,"atzyuangong.yuangongmc"));
						
						  									o.setAtzyuangong_xingbie(getValue(context,"atzyuangong.xingbie"));
						
						  									o.setAtzyuangong_yuangongrz(getValue(context,"atzyuangong.yuangongrz"));
						
										o.setAtzyuangong_yuangongrz1(getValue(context,"atzyuangong.yuangongrz1"));
			  									o.setAtzyuangong_yuangongxl(getValue(context,"atzyuangong.yuangongxl"));
						
						  									o.setAtzyuangong_lurusj(getValue(context,"atzyuangong.lurusj"));
						
										o.setAtzyuangong_lurusj1(getValue(context,"atzyuangong.lurusj1"));
			  									o.setAtzyuangong_id(getValue(context,"atzyuangong.id"));
						
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