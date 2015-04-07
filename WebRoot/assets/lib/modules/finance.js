define(function (require, exports, moudles) {
    var $ = require("jquery");
    require('popwin')($);
    require("wdate");
    $(function () {
    	$(document).on("click",".payBill",function(){
            $.popWin.confirmWin('',"是否确定打款？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });
    	});

    });
});    	