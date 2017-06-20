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
    
    <title>My JSP 'houseStep1.jsp' starting page</title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/houseStep1.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/houseMain.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userMain.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
      
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">   
	<meta http-equiv="description" content="成为房东，第一步">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <div class="rowdiv row">
	<div class="col-md-6">         
    	<span class="glyphicon glyphicon-search"></span>
        <input type="text" placeholder="搜索" maxlength="20" class="inputstyle">
    </div>
     <div class="col-md-6">
             <ul>
                 <li>
                 	<a class="a" href="/SSHOME/indexPage.action">
                 		<strong>回到主页</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/BasicAction.action">
                 		<strong>房源信息中心</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="HouseMainAction.action">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
</div>
<form action="${pageContext.request.contextPath}/House2Action.action" method="post">
<div class="container">
    <div class="row">
        <div class="col-md-7 allposition">
        	<div class="row">
                <div class="rentalLv1"><span>${username}</span> ，您好！我们来为您做好当房东的准备吧。</div>
                <div class="rentalLv3">步骤1 </div>
                <div class="rentalLv2">您拥有什么样的空间？</div>
            </div>
            <div class="row">
            	<div class="col-md-4 nonmargin">
					<select id="roomtype" class="boxstyle" >  
                    	<option value="-1">请选择房源类型</option>  
                    	<c:forEach items="${roomtype}" var="roomtype">  
                   			<option  value="${roomtype.rtid}" >${roomtype.rtid}</option>  
                        </c:forEach>  
                    </select>  
					<%-- <select name="room_type" class="boxstyle">
						<option value="entirehome">整套房源</option>
						<option selected="" value="privateroom">独立房间</option>
						<option value="sharedroom">合住房间</option>
                    </select> --%>
				</div>
				<div class=" col-md-4 nonmargin" >
					<input class="boxstyle" type="text" placeholder="例如：青岛市李沧区">                    
				</div>
				<div class=" col-md-4"></div>
			</div>
            <div class="row">
            	<div class="col-md-8 nonmargin">
                	<input type="number" class="boxstyle" placeholder="可住人数">	
                </div>			
                <div class=" col-md-4 nonmargin"></div>
			</div>
            <div class="row">
            	<div class="nonmargin">
            		<a href=""><input type="submit" class="btn btn-info goonbutton" value="继续"></a>
                </div>
            </div>
        </div>
         <div class="col-md-5">
        	<div><img src="picture/housestep1.jpg" /></div>
       	 	<div class="blank"></div>
    	</div>
    </div>
</div>
</form>




<div class="blank"></div>

<div class="row iframediv">
	<div class="blank"></div>
	<div class="col-md-2"></div>
	<div class="col-md-2 textstyle">
		<p><strong>SSHOME</strong></p>
		<p>工作机会</p>
		<p>新闻</p>
		<p>政策</p>
		<p>礼品卡</p>
	</div>
	<div class="col-md-2 textstyle">
		<p><strong>发现</strong></p>
		<p>信任与安全</p>
		<p>旅行基金</p>
		<p>商务差旅</p>
		<p>旅游指南</p>
	</div>
	<div class="col-md-2 textstyle">
		<p><strong>出租</strong></p>
		<p>为什么出租</p>
		<p>待客之道</p>
		<p>房东义务</p>
		<p>房东权利</p>
	</div>
	<div class="col-md-2 textstyle">
		<p><strong>关于</strong></p>
		<p>团队介绍</p>
		<p>特色介绍</p>
		<p>查看地图</p>
		<p>帮助</p>
	</div>
</div>
</body>
</html>
