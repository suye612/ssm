<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<base href="<%=request.getContextPath()%>/">
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
<div class="div">
<h2 class="title">登录</h2>
	<form action="login" method="post" >
		<p ><input type="text" id="name" name="name" placeholder="请输入姓名" class="aa"></p>
		<p><input type="password" id="password" name="password" placeholder="请输入密码" class="aa"></p>
		<p style="text-align: right;font-size: 15px;color: white;"><a>立即注册</a></p>
		<p>  <input type="submit" id="submit" value="登录" class="login"></p>
	</form>
</div>
</body>
</html>