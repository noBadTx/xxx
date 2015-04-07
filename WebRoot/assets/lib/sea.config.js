seajs.config({
  alias: {
    "jquery": "jquery.js",
    "validform":"plugins/Validform_v5.3.2.js",
    "popwin":"plugins/popwin.js",
    "onlyAllowEnter":"plugins/onlyAllowEnter.js",
    "wdate":"plugins/datepicker/WdatePicker.js"
  }
});


seajs.use('jquery',function($){
	var winHeight = $(window).height(),
	    hdHeight = $('.g_hd').outerHeight(),
	    ftHeight = $(".g_ft").outerHeight();
	$(".con_wrap").css("min-height",(winHeight-hdHeight-ftHeight));
	$(".nav_side").height($(".g_bd").height());
    $(".nav_side").on("click","dt",function(){
        $(this).parents("li").addClass('active').siblings('li').removeClass('active');
        $(this).find(".fa-angle-down").addClass('fa-angle-up').removeClass('fa-angle-down');
        $(this).parents("li").siblings('li').find(".fa-angle-up").addClass('fa-angle-down').removeClass('fa-angle-up');


    });

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



});