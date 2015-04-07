<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="page_login">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>我合品管理平台</title>
<meta name="description" content="">
<meta name="keywords" content="">
<link href="assets/style.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="assets/font-awesome/css/font-awesome.min.css">
<!--[if IE 7]>
<link rel="stylesheet" href="assets/font-awesome/css/font-awesome-ie7.css">
<![endif]-->
</head>
<body>
	<div class="loginWrap">
		<div class="hd">
			我合品管理平台
		</div>
		<div class="bd">
			<h3>登录</h3>
			<form class="loginForm" method="post" action="<%=path %>/login!login.do">
				<p class="msg"></p>
				<p><label class="form_lb clearfix"><span class="fa fa-user"></span><input type="text" name="userName" datatype="*" nullmsg="请输入账号！" placeholder="输入账号"/></label></p>
				<p><label class="form_lb clearfix"><span class="fa fa-lock"></span><input type="password" name="userPwd" datatype="*" nullmsg="请输入密码！" placeholder="入密码"></label></p>
				<p class="opt"><label><input class="ipt_check" type="checkbox" name="autoLogin">自动登录</label><a href="javascript:;" class="btn doLogin">登录<span class="fa fa-arrow-circle-o-right"></span></a></p>
			</form>
        

		</div>
	</div>

	<div id="footer">
		Copyright 2006-2014 版权所有 我合品
	</div>
	<script type="text/javascript" src="assets/lib/sea.js"></script>
	<script type="text/javascript" src="assets/lib/sea.config.js"></script>
	<script type="text/javascript">seajs.use('modules/login');</script>
</body>
</html>