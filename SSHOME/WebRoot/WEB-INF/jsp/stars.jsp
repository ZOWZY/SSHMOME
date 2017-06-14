<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <html>
   <head>
     <base href="<%=basePath%>">
     
     <title>星星评分</title>
     <script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
     <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stars.css">
     <script src="${pageContext.request.contextPath}/js/stars.js"></script>
 	<meta http-equiv="pragma" content="no-cache">
 	<meta http-equiv="cache-control" content="no-cache">
 	<meta http-equiv="expires" content="0">    
 	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 	<meta http-equiv="description" content="星星评分">
 
   </head>
   
<body>
	<div id="star">
    	<span>评价</span>
  		<ul>
  			<li><a href="javascript:;">1</a></li>
  			<li><a href="javascript:;">2</a></li>
  			<li><a href="javascript:;">3</a></li>
  			<li><a href="javascript:;">4</a></li>
  			<li><a href="javascript:;">5</a></li>
  		</ul>
  		<span></span>
  		<p></p>
 	</div>
</body>
</html>