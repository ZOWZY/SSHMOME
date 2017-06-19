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
    
    <title>My JSP 'basichomecenter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/basichomecenter.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/userMain.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>   
	<link href="${pageContext.request.contextPath}/webuploader/webuploader.css" type="text/css" rel="stylesheet"/>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.min.js"></script>  
	<script type="text/javascript" src="${pageContext.request.contextPath}/webuploader/webuploader.min.js"></script>  
	<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>

  </head>
  
  <body>
   <div class="rowdiv row">
	<div class="col-md-6">         
    	<span class="glyphicon glyphicon-search"></span>
        <input type="text" placeholder="搜索" maxlength="20" class="inputstyle">
    </div>
    <div class="col-md-6">
    <ul>
    	<li><a href=""><strong>房源信息中心</strong></a></li>
        <li><a href=""><strong>注册</strong></a></li>
        <li><a href=""><strong>帮助</strong></a></li>
        <li><a href=""><strong>成为房东</strong></a></li>
    </ul>
    </div>
</div>
<div class="container">
	<div class="row">
    	<div class="col-md-2" style=" border-right:rgba(0,0,0,1.00) dashed; height:600px;">
        	<div class=" text-center">
            	<img src="picture/hostpic.jpg" style="height:160px; width:160px;"/>
                <p>姓名：</p>
                <p>所在地：</p>
            </div>
        </div>
    	<div class="col-md-10">
        	
        	<c:forEach var="room"  items="${roomList }" >
	        	<div class="row checkborder">
	            	<div class="col-md-3 checkborder"></div>
	                <div class="col-md-9 checkborder text-center">
	                	<p>${room.title}</p>
	                    <p>审核状态:${room.roomState.description}</p>
	                    <button>删除</button>
	                </div>
	            </div>
            </c:forEach>
            
        </div>
    </div>
</div>
  </body>
</html>
