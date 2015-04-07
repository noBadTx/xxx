define(function(require,exports,moudles){
	return function(jquery){
		(function($) {


/**
 * popWin.js
 * @category   javascript
 * @package    jquery
 * @author     Kevin <chj@8cuo.net>
 * @version    0.0.1
 */$.popWin={create:function(e,t){this.defaults={showHd:!0,showBtns:!0,showClose:!0,modal:!0,autoClose:!1,width:"560",height:"auto",position:"center",winId:"",title:"",titleCls:"popwin_title",contentType:"normal",onOpen:"",onClose:"",onOK:"",onCancel:"",onlyModel:!0,cache:!1,btns:[{cls:"btn_ok",text:"确 定",fun:"",link:""},{cls:"btn_cancel",text:"取 消",fun:"",link:"javascript:;"}]};var n=$.extend({},this.defaults,t),r=n.showHd,i=n.showBtns,s=n.showClose,o=n.modal,u=n.autoClose,a=n.width,f=n.height,l=n.position,c=n.winId,h=n.title,p=n.titleCls,d=n.contentType,v=n.onOpen,m=n.onClose,g=n.onOK,y=n.onCancel,b=n.onlyModel,w=n.cache,E=n.btns;$("#"+c).length!=0&&(c=c+"-eq"+$(".popWinBox").length);var S,x,T='<div class="popWin_header"><p class="'+p+'">'+h+"</p></div>",N='<div class="popWin_section"></div>',C='<div class="popWin_btnBox"></div>',k='<span class="popWin_close">X</span>',L,A="";A+='<div class="popWinBox" id="'+c+'"><div class="popWinWrap">',r&&(A+=T),A+=N,i&&(A+=C),s&&(A+=k),A+="</div></div>",o&$(".popWin_mask").length==0&&(A+='<div class="popWin_mask"></div>'),b&&$(".popWinBox").remove(),$("body").append(A),$("body").find("input,select,form").blur();if(d=="ajax"){var O=e;L='<div class="popWin_loading"></div>',$.popWin.setContent(c,L),$.popWin.setPosition(c,u,l,"",a,f),w==0&&(O.indexOf("?")==-1?O+="?_t="+Math.random():O+="&_t="+Math.random()),$.get(O,function(e){L=e,$.popWin.setContent(c,L),$.popWin.setPosition(c,u,l,v,a,f)})}else d=="dom"?(L=$(e).html(),$.popWin.setContent(c,L),$.popWin.setPosition(c,u,l,v,a,f)):(L=e,$.popWin.setContent(c,L),$.popWin.setPosition(c,u,l,v,a,f));$(".popWin_close").click(function(){$.popWin.closeWin(c,b,m)}),$.popWin.addBtns(c,E),typeof g=="function"?$("#"+c).on("click",".btn_ok",function(){g()}):$("#"+c).on("click",".btn_ok",function(){$.popWin.closeWin(c,b,m)}),typeof y=="function"?$(".btn_cancel").on("click",function(){y()}):$(".btn_cancel").on("click",function(){$.popWin.closeWin(c,b,m)})},setPosition:function(e,t,n,r,i,s){n instanceof Array?(posTop=n[1],posLeft=n[0]):(posTop=parseInt($(window).height()/2+parseInt($(window).scrollTop())-$("#"+e).outerHeight()/2),posLeft=parseInt($(document).width()/2-i/2)),$("#"+e).css({top:posTop-30+"px",left:posLeft+"px",width:i+"px",height:s,"z-index":9999+$(".popWinBox").length*2}).animate({top:posTop-15},100,function(){if(t!=0){function n(){$.popWin.closeWin(e,onlyModel,onClose)}var i=setTimeout(n,t)}typeof r=="function"&&r()}),$(".popWin_mask").css({height:$(document).height()+"px","z-index":9998+$(".popWinBox").length*2}).show()},closeWin:function(e,t,n){var r=$(".popWinBox").length;$("#"+e).fadeOut(function(){$(this).remove()}),t==1||r==1?$(".popWin_mask").fadeOut(function(){$(this).remove()}):$(".popWin_mask").css({"z-index":9996+r*2}),typeof n=="function"&&n()},setContent:function(e,t){$("#"+e).find(".popWin_section").html(t)},addBtns:function(e,t){var n=new Array;for(var r=0;r<t.length;r++){var i='<a class="button '+t[r].cls+'"';t[r].link!=""&&(i+=' href="',i+=t[r].link,i+='"'),t[r].fun!=""&&(i+=' onclick="',i+=t[r].fun,i+='"'),i+=">",i+=t[r].text+"</a>",n.push(i)}n=n.join(""),$("#"+e).find(".popWin_btnBox").append(n)},alertWin:function(e,t,n){$.popWin.create(t,{title:e||"提示",winId:"popWin_alert",onlyModel:!1,width:400,btns:[{cls:"btn_ok",text:"确定",fun:"",link:""}],onOK:n})},confirmWin:function(e,t,n,r){$.popWin.create(t,{title:e||"确认",winId:"popWin_Confirm",onlyModel:!1,width:400,onOK:n,onCancel:r})}};



		})(jquery);
	}
});

