/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:09:57.485
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class Fa88ead9900000005z{

	
						private Object atzxunjianbg_baogaozt;
			
				
										private Object atzxunjianbg_kehuid;
			
				
										private Object atzxunjianbg_xitongid;
			
				
										private Object atzxiangmupqd_bianhao;
			
				
										private Object atzxunjianbg_xunjiansj;
			
				
							private Object atzxunjianbg_xunjiansj1;
								private Object atzxunjianbg_id;
			
				
										private Object atzxiangmupqd_id;
			
				
					
						public void setAtzxunjianbg_baogaozt(Object atzxunjianbg_baogaozt){
				this.atzxunjianbg_baogaozt = atzxunjianbg_baogaozt;
			}
			
	  		public Object getAtzxunjianbg_baogaozt(){
	  			return atzxunjianbg_baogaozt;
	  		}
  		  		
  				  		
  						public void setAtzxunjianbg_kehuid(Object atzxunjianbg_kehuid){
				this.atzxunjianbg_kehuid = atzxunjianbg_kehuid;
			}
			
	  		public Object getAtzxunjianbg_kehuid(){
	  			return atzxunjianbg_kehuid;
	  		}
  		  		
  				  		
  						public void setAtzxunjianbg_xitongid(Object atzxunjianbg_xitongid){
				this.atzxunjianbg_xitongid = atzxunjianbg_xitongid;
			}
			
	  		public Object getAtzxunjianbg_xitongid(){
	  			return atzxunjianbg_xitongid;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupqd_bianhao(Object atzxiangmupqd_bianhao){
				this.atzxiangmupqd_bianhao = atzxiangmupqd_bianhao;
			}
			
	  		public Object getAtzxiangmupqd_bianhao(){
	  			return atzxiangmupqd_bianhao;
	  		}
  		  		
  				  		
  						public void setAtzxunjianbg_xunjiansj(Object atzxunjianbg_xunjiansj){
				this.atzxunjianbg_xunjiansj = atzxunjianbg_xunjiansj;
			}
			
	  		public Object getAtzxunjianbg_xunjiansj(){
	  			return atzxunjianbg_xunjiansj;
	  		}
  		  		
  							public void setAtzxunjianbg_xunjiansj1(Object atzxunjianbg_xunjiansj1){
				this.atzxunjianbg_xunjiansj1 = atzxunjianbg_xunjiansj1;
			}
			
	  		public Object getAtzxunjianbg_xunjiansj1(){
	  			return atzxunjianbg_xunjiansj1;
	  		}
		  		
  						public void setAtzxunjianbg_id(Object atzxunjianbg_id){
				this.atzxunjianbg_id = atzxunjianbg_id;
			}
			
	  		public Object getAtzxunjianbg_id(){
	  			return atzxunjianbg_id;
	  		}
  		  		
  				  		
  						public void setAtzxiangmupqd_id(Object atzxiangmupqd_id){
				this.atzxiangmupqd_id = atzxiangmupqd_id;
			}
			
	  		public Object getAtzxiangmupqd_id(){
	  			return atzxiangmupqd_id;
	  		}
  		  		
  				  		
  	  	
  	public static Fa88ead9900000005z init(DataContextHelper context) {
  		Fa88ead9900000005z o = new Fa88ead9900000005z();
									o.setAtzxunjianbg_baogaozt(getValue(context,"atzxunjianbg.baogaozt"));
						
						  									o.setAtzxunjianbg_kehuid(getValue(context,"atzkehu.id"));
						
						  									o.setAtzxunjianbg_xitongid(getValue(context,"atzkehuxtxx.id"));
						
						  									o.setAtzxiangmupqd_bianhao(getValue(context,"atzxiangmupqd.bianhao"));
						
						  									o.setAtzxunjianbg_xunjiansj(getValue(context,"atzxunjianbg.xunjiansj"));
						
										o.setAtzxunjianbg_xunjiansj1(getValue(context,"atzxunjianbg.xunjiansj1"));
			  									o.setAtzxunjianbg_id(getValue(context,"atzxunjianbg.id"));
						
						  									o.setAtzxiangmupqd_id(getValue(context,"atzxiangmupqd.id"));
						
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