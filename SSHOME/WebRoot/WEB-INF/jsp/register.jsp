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
  
<body style="background-image:url(picture/homebg/tree.jpg); height:100%;">
<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        
        <div class="col-md-4" id="register">
            <br /><br /><br /><br />
            <s:form  action="%{pageContext.request.contextPath}/register.action"  method="get">
            
            <div class="thumbnail" >
                <h1 class="fontstyle">SSHOME</h1><br />
                
                <center>
                    <s:textfield id="username" name="username"  maxlength="20" class="inputsize input" placeholder="用户名">
                    </s:textfield>
                </center>
                <span class="spanstyle"><s:fielderror fieldName="username"/></span> <br />
                
                <center>
                    <s:textfield id="phone" name="phone"  maxlength="11" class="inputsize input" placeholder="电话号码">
                    </s:textfield>
                </center>
                <span class="spanstyle"><s:fielderror fieldName="phone"/></span> <br />
                
                <center>
                    <input type="email" id="email" name="email"  class="inputsize input" placeholder="邮箱"/>
                </center> 
                <span class="spanstyle"><s:fielderror fieldName="email"/></span> <br />
                
                <center>
                    <s:password id="password" name="password"  maxlength="20" class="inputsize input" placeholder="登录密码">
                    </s:password>
                </center>
                <span class="spanstyle"><s:fielderror fieldName="password"/></span> <br />
                
                <center>
                    <s:password id="password2" maxlength="20"  class="inputsize input" placeholder="确认登录密码">
                    </s:password>
                </center>
                <span class="spanstyle"><s:fielderror fieldName="password2"/></span><br />
                
                <center>
                    <s:submit value="注册" class="loginbutton input"></s:submit>
                </center> 
                <br />
            </div>
            </s:form>
        </div>
     
        <div class="col-md-4"></div>
    </div>
</div>
</body>
</html>
  