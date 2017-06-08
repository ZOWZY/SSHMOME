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
    
    <title>修改支付密码</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/alterPayPass.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="修改支付密码界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
  <body>
  	<div class="col-md-4"></div>
    <div class="col-md-4">
    <form action=""  method="post" id="">
        <div class="divstyle">
            <div class="SSHOMEdiv">
                <h3 class="fontstyle">修改支付密码</h3>
            </div>
            <div class="inputdiv">
                <input type="text" id="" name="" value="" placeholder="新密码" class="inputsize">
                <span class="spanstyle">
					<s:fielderror fieldName=""/>
				</span>
                <input type="text" id="" name="" value="" placeholder="确认密码" class="inputsize">
                <span class="spanstyle">
					<s:fielderror fieldName=""/>
				</span>
                <input type="button" value="重置密码" class="alterbutton">
            </div>
        </div>
    </form>
    </div>
    <div class="col-md-4"></div>
</body>
</html>
