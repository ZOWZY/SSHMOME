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
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="/css/buttonstyle.css">
    <link rel="stylesheet" href="/css/register.css">
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
            <input id="username" type="text" maxlength="20" value="${Users.username}"/><br />
            <span><s:fielderror fieldName="username"></s:fielderror></span>
            <br />
            电话号码：<br />
            <input type="text"  id="phone" maxlength="11" value="${Users.phone}" /><br />
            <span><s:fielderror fieldName="phone"></s:fielderror></span>
            <br />
            邮箱：<br />
            <input  id="email" type="email" value="${Users.email}" /><br />
            <span><s:fielderror fieldName="email"></s:fielderror></span>
            <br />
            登录密码：<br />
            <input id="password" type="password" maxlength="20" value="${Users.password}"/><br />
            <span><s:fielderror fieldName="password"></s:fielderror></span>
            <br />
            确认登录密码：<br />
            <input id="password" type="password" maxlength="20"  value="${Users.password}"/><br /><br />
            <span><s:fielderror fieldName="password"></s:fielderror></span>
            <br />
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
