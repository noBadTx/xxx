<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="com.xemoo.pojo.XAccount"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Object obj = request.getSession().getAttribute("userInfo");
	XAccount user = null;
	if (obj != null) {
		user = (XAccount) obj;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>我合品管理平台</title>
<meta name="description" content="">
<meta name="keywords" content="">
<link href="<%=path%>/assets/style.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/assets/font-awesome/css/font-awesome.min.css">
<!--[if IE 7]>
<link rel="stylesheet" href="assets/font-awesome/css/font-awesome-ie7.css">
<![endif]-->
<!--[if lt IE 9]>
<script src="assets/html5.js"></script>
<![endif]-->
</head>
<body class="page">
	<header class="g_hd clearfix">
	<div class="fl logo">我合品管理平台</div>
	<div class="fr">
		<span><%=user.getAccount_login_name()%></span><a
			href="<%=path%>/login!backout.do" class="sign-out">退出</a>
	</div>
	</header>

	<section class="clearfix g_bd"> <nav class="nav_side">
	<header> <img class="avatar" src="assets/images/avatar.jpg">
	<p><%=user.getAccount_login_name()%>
		|
		<%=user.getAccount_type()%></p>
	</header>
	<ul>
		<li><a href="profile.html"><span class="fa fa-user"></span>修改资料</a>
		</li>
		<li><a href="changePassword.html"><span class="fa fa-lock"></span>修改密码</a>
		</li>
	</ul>
	</nav>
	<div class="con_wrap">
		<div class="con_main">
			<nav class="nav_main"> <a href="index.html" class="cur">首页</a>
			<a href="brandManager.html">品牌管理</a> <a href="userManager.html">用户管理</a>
			<a href="financeManager.html">财务管理</a> <a href="system.html">系统管理</a></nav>
			<div class="box-main">
				<p class="welcome">
					欢迎进入我合品<br>管理平台
				</p>
			</div>


		</div>
	</div>
	</section>
	<footer class="g_ft">Copyright 2006-2014 版权所有 我合品</footer>




	<script type="text/javascript" src="<%=path%>/assets/lib/sea.js"></script>
	<script type="text/javascript" src="<%=path%>/assets/lib/sea.config.js"></script>
</body>
</html>
<%
	} else {
		response.sendRedirect(basePath + "login.jsp");
	}
%>

