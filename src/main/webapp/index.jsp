<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<form action="login" method="post">
		<input type="text" id="name" name="name" placeholder="请输入姓名">
		<input type="password" id="password" name="password" placeholder="请输入密码">
		<input type="time" id="age" name="age" placeholder="请输入年龄">
		<input type="submit" id="submit" value="登录">
	</form>
</body>
</html>