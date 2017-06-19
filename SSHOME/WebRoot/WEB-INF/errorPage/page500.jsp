<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'page500.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    
     <script src="${pageContext.request.contextPath}/bootstrap/jquery/jquery-3.1.1.js"></script>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/buttonposition.css">

  </head>
  
  <body>
	<div id="Layer1" style="position:absolute; width:100%; height:auto; z-index:-1;">
		<img src="/picture/errorPage/page500.jpg" height="100%" width="100%"/>  
		<a href="/SSHOME/indexPage.action"><input type="button" value="Go Back" id="buttonposition"/></a> 
	</div>
  </body>
</html>
