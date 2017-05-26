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
  
<body style="background-image:url(picture/homebg/tree.jpg);height:100%;">
    <div class="blank"></div>
    <div class="col-md-4"></div>
    
    <div class="col-md-4">
    	
    	<s:form action="%{pageContext.request.contextPath}/login.action"  method="post" id="loginform">
        	<div class="divstyle">
            	<h1 class="fontstyle">SSHOME</h1>
            
            
            	<div class="inputdiv">
                  	<s:textfield  id="username" name="username" placeholder="用户名" cssClass="inputsize">
                  	</s:textfield>
                  	<div class="spanstyle">
                  	  	<s:fielderror fieldName="username"></s:fielderror>
                  	</div>
                  
                  	
                  	<s:password id="password" name="password" placeholder="密码" cssClass="inputsize">
                 	</s:password>
                 	<div class="spanstyle">
                  	  	<s:fielderror fieldName="password"></s:fielderror>
                  	</div>
                
                  
                  	<s:submit cssClass="inputsize loginbutton" value="登录" ></s:submit>
                
                  	<div>
                    	<a id="newcount" class="sublabelfont" href="${pageContext.request.contextPath}/registerPage.action">还没有账号？去注册</a>
                    	<a id="forgetpassword" class="forgetpass" href="${pageContext.request.contextPath}/registerPage.action">forget password?</a>
                  	</div>
                
                  	<div class="subblank"></div>
                 </div>
             </s:form>
    	</div>
    </div>
    
    <div class="col-md-4"></div>
</body>
</html>

