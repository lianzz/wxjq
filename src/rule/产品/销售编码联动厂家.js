var cprstr = form.getRowNum(obj.id);
var xiaoshoubm= form.get(cprstr+"_atzpeizhimx_bujianh");
alert(xiaoshoubm);
//调用Rule后的回调方法
var callback = function(result){
//处理Rule返回的结果字符串	
result = result.substring(1);
var resultStrs = new Array();
if(result == null || result == undefined || result== ''){
	resultStrs.length = 0;
}else{
	resultStrs = result.split(";");
}
var eflSelect = form.get(cprstr+"_atzpeizhimx_changjia");
var temp=eflSelect.value;
for(var i = eflSelect.length-1; i>=0; i--){
	eflSelect.remove(i);
}
for(var i= 0;i<resultStrs.length;i++){
	keyAndValues = resultStrs[i].split(",");
	if(keyAndValues[0] == undefined || keyAndValues[0] == ''
	|| keyAndValues[1] == undefined || keyAndValues[1] == ''){
		
	}else{
		var varItem = new Option(keyAndValues[0],keyAndValues[1]);
		eflSelect.options.add(varItem);
		if(temp==varItem.value)
			eflSelect.options[eflSelect.options.length-1].selected='selected';

	}
}
		
			};
FormUtil.executeRuleByName("A-销售编码联动厂家-12",xiaoshoubm,callback);