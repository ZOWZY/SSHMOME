<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="登录界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">


  </head>
  
<body>
    <div class="row blank"></div>
    <div class="row">
        <div class="col-md-4"></div> 
        <div class="col-md-4">
            <h1 class="fontstyle">SSHOME</h1>
            <input type="text" class="inputsize" maxlength="20" placeholder="用户名"/><br/>
            <div class="spanstyle"><span></span></div>
            <input type="password" class="inputsize" maxlength="20" placeholder="密码"><br/>
            <div class="spanstyle"><span></span></div>
            <input type="checkbox" class="checkbox_relative"/>
            <label class="labelfont">
                remember me
            </label>
            <br/>
            <input type="button" class="inputsize loginbutton" value="登录"><br>
            <a class="labelfont" href="">还没有账号？去注册</a>
            <a class="forgetpass" href="">forget password?</a>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="row"></div>
</body>
</html>
