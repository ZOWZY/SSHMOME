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
    
    <title>注册</title>
   
    <script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
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
            <form  action="${pageContext.request.contextPath}/register.action"  method="get">
            用户名：<br />
            <input id="username" type="text" name="username" maxlength="20" value="${Users.username}"/><br />
            <span class="errorinfo"><s:fielderror fieldName="username"/></span>
            <br />
            电话号码：<br />
            <input type="text"  name="phone" id="phone" maxlength="11" value="${Users.phone}" /><br />
            <span  class="errorinfo"><s:fielderror fieldName="phone"/></span>
            <br />
            邮箱：<br />
            <input  id="email" name="email" type="email" value="${Users.email}" /><br />
            <span  class="errorinfo"><s:fielderror fieldName="email"/></span>
            <br />
            登录密码：<br />
            <input id="password" name="password" type="password" maxlength="20" value="${Users.password}"/><br />
            <span  class="errorinfo"><s:fielderror fieldName="password"/></span>
            <br />
            确认登录密码：<br />
            <input id="password2" type="password" maxlength="20"  value="${Users.password}"/><br /><br />
            <span  class="errorinfo"><s:fielderror fieldName="password2"/></span>
            <br />
            <input type="submit" value="注册" class="button button-3d button-primary button-rounded" style="width:100%"/>
            </form>
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