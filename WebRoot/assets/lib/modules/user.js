define(function (require, exports, moudles) {
    var $ = require("jquery");
    require('popwin')($);
    require('validform')($);
    $(function () {


    	$.Tipmsg.r="";
		$(".editProfile").Validform({
			tiptype:3,
			ajaxPost:false
		});

        $(".changePassword").Validform({
            tiptype:3,
            ajaxPost:false
        });


        $(".databox").on("click",".userOperate",function(){
            var id = $(this).data("id"),status=$(this).data("status");
            if(status=="enable"){
                $(this).removeClass('s2').text("启用").data("status","disable");

            }else{
                $(this).addClass('s2').text("禁用").data("status","enable");
            }

        });

        $(".toolbox").on("click",".bulkDelManager",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            if(datagrid.find(".selectItem:checked").length==0){
                $.popWin.alertWin('',"请选择要删除的账号！");
            }else{
                datagrid.find(".selectItem:checked").each(function(){
                    selectIds.push($(this).val());
                });
                console.log(selectIds);
                alert("选中的ID为"+selectIds);
                $.popWin.confirmWin('',"确定要删除这些账号吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });

            }
        });


        $(".toolbox").on("click",".addManager",function(){
            $.popWin.create("testData/addManager.html",{
              title:'新增管理员',
              winId:'addManagerWin',
              contentType:'ajax',
              width:600,
              onOK:function(){
                $.Tipmsg.r="";
                $("#addManagerWin").find("form").Validform({
                    tiptype:3,
                    ajaxPost:false
                });
                $("#addManagerWin").find("form").submit();

              }
            });
        });

        $(".databox").on("click",".editManager",function(){
            var id = $(this).data("id");
            $.popWin.create("testData/editManager.html?id="+id,{
              title:'修改管理员',
              winId:'editManagerWin',
              contentType:'ajax',
              width:600,
              onOK:function(){
                $.Tipmsg.r="";
                $("#editManagerWin").find("form").Validform({
                    tiptype:3,
                    ajaxPost:false
                });
                $("#editManagerWin").find("form").submit();

              }
            });
        });

        $(".databox").on("click",".delManager",function(){
            var id = $(this).data("id");
            $.popWin.confirmWin('',"确定要删除此账号吗？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });
        });

        $(".toolbox").on("click",".bulkDelRole",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            if(datagrid.find(".selectItem:checked").length==0){
                $.popWin.alertWin('',"请选择要删除的角色！");
            }else{
                datagrid.find(".selectItem:checked").each(function(){
                    selectIds.push($(this).val());
                });
                console.log(selectIds);
                alert("选中的ID为"+selectIds);
                $.popWin.confirmWin('',"确定要删除这些角色吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });

            }
        });


        $(".toolbox").on("click",".addRole",function(){
            $.popWin.create("testData/addRole.html",{
              title:'新增角色',
              winId:'addRoleWin',
              contentType:'ajax',
              width:600,
              onOK:function(){
                $.Tipmsg.r="";
                $("#addRoleWin").find("form").Validform({
                    tiptype:3,
                    ajaxPost:false
                });
                $("#addRoleWin").find("form").submit();

              }
            });
        });

        $(".databox").on("click",".editRole",function(){
            var id = $(this).data("id");
            $.popWin.create("testData/editRole.html?id="+id,{
              title:'修改角色',
              winId:'editRoleWin',
              contentType:'ajax',
              width:600,
              onOK:function(){
                $.Tipmsg.r="";
                $("#editRoleWin").find("form").Validform({
                    tiptype:3,
                    ajaxPost:false
                });
                $("#editRoleWin").find("form").submit();

              }
            });
        });

        $(".databox").on("click",".delRole",function(){
            var id = $(this).data("id");
            $.popWin.confirmWin('',"确定要删除此角色吗？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });
        });

        //Beauty Radio
/*        $(document).find("input[type='radio']").each( function() {
             if($(this).prop('checked')){
                $(this).parents(".f_radio").addClass('checked').siblings('.f_radio').removeClass('checked');
             }
        });*/

        $(document).on('change',".beautyRadio input[type='radio']",function(){
            if($(this).prop('checked')){
                $(this).parents(".f_radio").addClass('checked').siblings('.f_radio').removeClass('checked');
            };
        });

        $(document).on('change',".checkboxGroup input[type='checkbox']",function(){
            var len = $(this).parents('.checkboxGroup').find("input[type='checkbox']").length,checkedLen = $(this).parents('.checkboxGroup').find("input[type='checkbox']:checked").length;
            if(len>checkedLen){
                $(".beautyRadio").find("input[name='isSuper'][value='false']").trigger('click');
            }else{
                $(".beautyRadio").find("input[name='isSuper'][value='true']").trigger('click');
            };


            if($(this).prop('checked')){
                $(this).parents('.f_checkbox').addClass('checked');
            }else{
                $(this).parents('.f_checkbox').removeClass('checked');
            }
        });

        $(document).on("change",".beautyRadio input[name='isSuper']",function(){
            if($(this).val()=="true"){
                $(".checkboxGroup").find('.f_checkbox').addClass('checked').find('input').prop({'checked': true});
            }
        });


    });
});