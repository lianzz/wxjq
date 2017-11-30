//获取预测日期，截取年和月
var wForm = form.getDomHelper("2689908");
var yucerq = wForm.getValue("atzxiaoshouyc_yucerq");
//今年
var year = yucerq.substr(0,4);
//明年
var lastyear=parseInt(year)+1;
//预测月份
var month = yucerq.substr(5,2);
var monid = ["yiyue","eryue","sanyue","siyue","wuyue","liuyue","qiyue","bayue","jiuyue","shiyue","shiyiy","shiery"];
var mon = ["一","二","三","四","五","六","七","八","九","十","十一","十二"];
var m = parseInt(month,10);
//如果月份大于预测月份为今年，反之为明年
for(var i=0;i<monid.length;i++){
if(m>parseInt(i)+1){
form.get("actiz_zone1_K_2689949_P_atzyuefenycmx_"+monid[i]+"_labelspan").innerHTML=mon[i]+"月("+lastyear+")";
}else{
form.get("actiz_zone1_K_2689949_P_atzyuefenycmx_"+monid[i]+"_labelspan").innerHTML=mon[i]+"月("+year+")";
}}