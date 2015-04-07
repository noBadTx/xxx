define(function (require, exports, moudles) {
    var $ = require("jquery");
    require('popwin')($);
    require('validform')($);
    require('onlyAllowEnter')($);
    require("wdate");
    $(function () {
        $(".toolbox").on("click",".bulkDelActivity",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            datagrid.find(".selectItem:checked").each(function(){
                selectIds.push($(this).val());
            });
            console.log(selectIds);
            if(selectIds.length==0){
                $.popWin.alertWin("","请选择要删除的活动！")
            }else{
                $.popWin.confirmWin('',"确定要删除这些活动吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });
            }

        });
        $(".toolbox").on("click",".bulkSentGift",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            datagrid.find(".selectItem:checked").each(function(){
                selectIds.push($(this).val());
            });
            console.log(selectIds);
            if(selectIds.length==0){
                $.popWin.alertWin("","请选择要账户！")
            }else{
                $.popWin.confirmWin('',"确定给这些账户发礼吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });
            }

        });

        $(".toolbox").on("click",".bulkNotSentGift",function(){
            var datagrid = $(this).parents(".queryBox").siblings('.databox').find("tbody");
            var selectIds= [];
            datagrid.find(".selectItem:checked").each(function(){
                selectIds.push($(this).val());
            });
            console.log(selectIds);
            if(selectIds.length==0){
                $.popWin.alertWin("","请选择要账户！")
            }else{
                $.popWin.confirmWin('',"确定给这些账户不发礼吗？", function(){
                    $.popWin.closeWin("popWin_Confirm");
                    alert("Yes I Do");
                });
            }

        });

        $(".databox").on("click",".viewActivity",function(){
            var id = $(this).data("id");
            console.log(id);
           location.href = "viewActivity.html?id="+id;
        });

        $(".databox").on("click",".editActivity",function(){
            var id = $(this).data("id");
            console.log(id);
           location.href = "editActivity.html?id="+id;
        });


        $(".databox").on("click",".delActivity",function(){
            var id = $(this).data("id");
            console.log(id);
            $.popWin.confirmWin('',"确定要删除吗？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });
          
        });


        $(".databox").on("click",".sentGift",function(){
            var id = $(this).data("id");
            $.popWin.create("testData/sentdGift.html?id="+id,{
              title:'礼金发放',
              winId:'sentGiftWin',
              contentType:'ajax',
              width:400
            });
        });

        $(".databox").on("click",".notSentGift",function(){
            var id = $(this).data("id");
            $.popWin.confirmWin('',"确定不发礼吗？", function(){
                $.popWin.closeWin("popWin_Confirm");
                alert("Yes I Do");
            });

        });    

        $(".nav_side").on("click",".addBrand", function(event){
             $(this).find(".boxNewBrand").remove();
            var HTML = '<div class="boxNewBrand"><input type="text" class="text" name="brandName" value=""><input type="button" class="gbtn submitBrand" value="确定"></div>' ;
            $(this).parents(".nav_side").append(HTML);
        });

        $(".nav_side").on("click",".submitBrand",function(){
                var v  = $(this).siblings("input[name='brandName']").val();
                console.log(v);
                if(v){
    /*          $.ajax({
                    cache: false,
                    type: "POST",
                    url:"",
                    data:{"id":id,"v":v},
                    async: false,
                    success: function(data) {
                        var data = $.parseJSON(data);
                         
    */                  var newObj = ['<li><dl><dt><span class="fa fa-list"></span>',v,'<span class="fa fa-angle-down"></span></dt>',
                                                '<dd><a href="brand-activity.html">活动管理</a></dd>',
                                                '<dd><a href="brand-profile.html">账号管理</a></dd>',
                                            '</dl>',
                                        '</li>'].join('');
                        $(this).parents(".nav_side").find("ul").append(newObj);
                        
    /*              }
                });*/

                    
                }else{
                    $.popWin.alertWin("","请输入品牌名称！");
                    //alert("请输入分类名称");
                }
        });


       	$.Tipmsg.r="";
		$(".editActivityForm,.importQuestionnaireForm,.editProfile,.changePassword").Validform({
			tiptype:3,
			ajaxPost:false
		});

        if($(".numText").length>0){
            $(".numText").onlyAllowEnter({'type': 'fnum'});
        }
        


    });
});