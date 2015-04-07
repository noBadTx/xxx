define(function (require, exports, moudles) {
    var $ = require("jquery");
    require('popwin')($);
    require('validform')($);
    $(function () {
 
        $(".datagrid").on("change",".selectAll",function(){
            if($(this).prop("checked")){
                $(this).parents(".datagrid").find('.selectItem').prop("checked",true);
            }else{
                 $(this).parents(".datagrid").find('.selectItem').prop("checked",false);
            }
        });

        $(".datagrid").on("change",".selectItem",function(){
             if(!$(this).prop("checked")){
                 $(this).parents(".datagrid").find('.selectAll').prop("checked",false);
             }
        });

        $(".toolbox").on("click",".bulkDelFeedback",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            datagrid.find(".selectItem:checked").each(function(){
                selectIds.push($(this).val());
            });
            console.log(selectIds);
            if(selectIds.length==0){
                $.popWin.alertWin("","请选择要序号！")
            }else{
                $.popWin.confirmWin('',"确定要删除这些吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });
            }


        });


        $(".databox").on("click",".viewFeedback",function(){
            var id = $(this).data("id");
            $.popWin.create("testData/feedbackDetail.html?id="+id,{
              title:'意见反馈',
              winId:'viewFeedbackWin',
              contentType:'ajax',
              showBtns:false
            });
        });


        $(".databox").on("click",".delFeedback",function(){
            var id = $(this).data("id");
            console.log(id);
            $.popWin.confirmWin('',"真的要删除吗？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });
        });




        $.Tipmsg.r="";
        $(".editAppVersion").Validform({
            tiptype:3,
            ajaxPost:false
        });



 






    });
});