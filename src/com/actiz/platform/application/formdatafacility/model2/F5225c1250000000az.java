/**
* Copyright   :Actiz
* Version     :ODE6.0
* Net Address :www.qyes.com
* Author      :Actiz
* Build Time  :2017-11-28 16:11:25.057
*/

package com.actiz.platform.application.formdatafacility.model2;

import java.util.Date;
import com.actiz.platform.application.formdatafacility.logic.DataContextHelper;
import java.sql.Timestamp;
import java.sql.Blob;


	public class F5225c1250000000az{

	
						private Object atzkuwei_kuweibh;
			
				
										private Object atzkuwei_kuweimc;
			
				
										private Object atzkuwei_cangkuid;
			
				
										private Object atzkuwei_kuweiwlzt;
			
				
										private Object atzkuwei_shifougz;
			
				
										private Object atzkuwei_id;
			
				
					
						public void setAtzkuwei_kuweibh(Object atzkuwei_kuweibh){
				this.atzkuwei_kuweibh = atzkuwei_kuweibh;
			}
			
	  		public Object getAtzkuwei_kuweibh(){
	  			return atzkuwei_kuweibh;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_kuweimc(Object atzkuwei_kuweimc){
				this.atzkuwei_kuweimc = atzkuwei_kuweimc;
			}
			
	  		public Object getAtzkuwei_kuweimc(){
	  			return atzkuwei_kuweimc;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_cangkuid(Object atzkuwei_cangkuid){
				this.atzkuwei_cangkuid = atzkuwei_cangkuid;
			}
			
	  		public Object getAtzkuwei_cangkuid(){
	  			return atzkuwei_cangkuid;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_kuweiwlzt(Object atzkuwei_kuweiwlzt){
				this.atzkuwei_kuweiwlzt = atzkuwei_kuweiwlzt;
			}
			
	  		public Object getAtzkuwei_kuweiwlzt(){
	  			return atzkuwei_kuweiwlzt;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_shifougz(Object atzkuwei_shifougz){
				this.atzkuwei_shifougz = atzkuwei_shifougz;
			}
			
	  		public Object getAtzkuwei_shifougz(){
	  			return atzkuwei_shifougz;
	  		}
  		  		
  				  		
  						public void setAtzkuwei_id(Object atzkuwei_id){
				this.atzkuwei_id = atzkuwei_id;
			}
			
	  		public Object getAtzkuwei_id(){
	  			return atzkuwei_id;
	  		}
  		  		
  				  		
  	  	
  	public static F5225c1250000000az init(DataContextHelper context) {
  		F5225c1250000000az o = new F5225c1250000000az();
									o.setAtzkuwei_kuweibh(getValue(context,"atzkuwei.kuweibh"));
						
						  									o.setAtzkuwei_kuweimc(getValue(context,"atzkuwei.kuweimc"));
						
						  									o.setAtzkuwei_cangkuid(getValue(context,"atzcangku.id"));
						
						  									o.setAtzkuwei_kuweiwlzt(getValue(context,"atzkuwei.kuweiwlzt"));
						
						  									o.setAtzkuwei_shifougz(getValue(context,"atzkuwei.shifougz"));
						
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