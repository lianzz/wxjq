var hetong = form.getValue("atzyewuzc_hetongid");
var ruleId ="3942929";
//调用Rule后的回调方法
var callback = function(result){
    if(result!=null&&result!=""){
    	var s = result.split(",");
      //form.setValue("atzxiangmupzqd_kehu",s[2],s[3]);
      form.setValue("atzyewuzc_kehu",s[0],s[1]);
    }
     };
FormUtil.executeRule(ruleId,hetong,callback);


var rowNum = form.getRowNum(obj.id);    //返回R1
//var wpfl = form.getValue(rowNum+"_atzhetongtkmx_xiaoshoubmid");

var callback = function(result){
    alert(result);
    var callback1 = function(result1){
    alert(result1);   //得到{"mingcheng":"张三","nianling":"22","dianhua":"13813713666"}
    var fhqd = eval("("+result1+")");    //转为对象
    alert(fhqd.shuliang);    //得到"张三"
    //form.setValue(rowNum+"_atzhetongtkmx_xiaoshoubmid",fhqd.xiaoshoubmid,"iPad");
    form.setValue(rowNum+"_atzhetongtkmx_sn",fhqd.sn,fhqd.sn);
    form.setValue(rowNum+"_atzhetongtkmx_shuliang",fhqd.shuliang,fhqd.shuliang);
    form.setValue(rowNum+"_atzhetongtkmx_beizhu",fhqd.beizhu,fhqd.beizhu);
    var callback2 = function(result2){
    
    }
    FormUtil.getEntityInfo("atzfahuoqingdan",result,callback2);
	}
	FormUtil.getEntityInfo("atzfahuoqingdan",result,callback1);
}
FormUtil.getValueFromContext("atzfahuoqingdan.select.id",callback);