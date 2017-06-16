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
    
    <title>支付</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userPay.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="支付界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
  <body>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
        <div class="divstyle">
        <form action="${pageContext.request.contextPath}/payAction.action" method="post">
            <div class="SSHOMEdiv">
                <h3 class="fontstyle">订单支付</h3>
            </div>
            <div class="inputdiv">
                <input type="text" name="number" value="" placeholder="价格" readonly class="inputsize">
                <input type="password" name="payPassword" placeholder="密码" class="inputsize">
                <span class="spanstyle">
					<s:fielderror fieldName="username"/>
				</span>
                <input type="submit" value="确认支付" class="paybutton">
                <button class="backbutton">
                	<a href="/SSHOME/newOrders.action" class="cancela">取消支付</a>
                </button>
                <a href="/SSHOME/rechargePageAction.action" class="alter">余额不足？去充值</a>
            </div>
        </form>
        </div>
	</div>
	<div class="col-md-4"></div>
</div>
</body>
</html>
