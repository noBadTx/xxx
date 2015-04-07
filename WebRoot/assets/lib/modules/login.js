define(function (require, exports, moudles) {
    var $ = require("jquery");
    require('validform')($);
    $(function () {
		$(".loginForm").Validform({
			tiptype:function(msg,o,cssctl){
				var objtip=$(".msg");
				cssctl(objtip,o.type);
				if(o.type==2){
					objtip.hide();
				}else{
					objtip.show();
					objtip.text(msg);
				}
				
			},
			ajaxPost:false
		});

		$(document).on("click",".doLogin",function(){
			$(".loginForm").submit();
		});

    });
});