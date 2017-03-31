<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    <script src="/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/buttonstyle.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">

  </head>
  
  <body>
  <div class="container-fuild">
  <div class="row">
			<div class="col-md-12">
            <br /><br /><br /><br /><br /><br />
            </div>
            </div>
		<div class="row">
			<div class="col-md-4">
            </div>
            <div class="col-md-4" id="register">
            用户名：<br />
            <input type="text" maxlength="20" /><br /><br />
            电话号码：<br />
            <input type="text" maxlength="11" /><br /><br />
            邮箱：<br />
            <input type="email" /><br /><br />
            登录密码：<br />
            <input type="password" maxlength="20"/><br /><br />
            确认登录密码：<br />
            <input type="password" maxlength="20" /><br /><br /><br />
            <button class="button button-3d button-primary button-rounded" style="width:100%">注册</button>
            </div>
            <div class="col-md-4">
            </div>
            </div>
            <div class="row">
			<div class="col-md-12">
            <br /><br /><br /><br /><br /><br />
            </div>
            </div>
            </div>
  </body>
</html>
