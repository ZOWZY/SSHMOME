<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
    	<li><a href=""><strong>登录</strong></a></li>
        <li><a href=""><strong>注册</strong></a></li>
        <li><a href=""><strong>帮助</strong></a></li>
        <li><a href=""><strong>成为房东</strong></a></li>
    </ul>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-7 allposition">
        	<div class="row">
                <div class="rentalLv1"><span class="">姓名</span> ，您好！我们来为您做好当房东的准备吧。</div>
                <div class="rentalLv3">步骤1 </div>
                <div class="rentalLv2">您拥有什么样的空间？</div>
            </div>
            <div class="row">
            	<div class="col-md-4 nonmargin">
					<select name="room_type" class="boxstyle">
						<option value="entirehome">整套房源</option>
						<option selected="" value="privateroom">独立房间</option>
						<option value="sharedroom">合住房间</option>
                    </select>
				</div>
				<div class="col-md-4 nonmargin">
					<select name="person_capacity" class="boxstyle">
                    	<option selected="" value="1">1位房客</option>
						<option value="2">2位房客</option>
						<option value="3">3位房客</option>
						<option value="4">4位房客</option>
						<option value="5">5位房客</option>
						<option value="6">6位房客</option>
					</select>
				</div>
				<div class=" col-md-4"></div>
			</div>
            <div class="row">
				<div class=" col-md-8 nonmargin" >
					<input class="boxstyle" type="text" placeholder="例如：青岛市李沧区" name="fulladdress" value=" 重庆">                    
				</div>
                <div class=" col-md-4 nonmargin"></div>
			</div>
            <div class="row">
            	<div class="nonmargin">
                	<input class="btn btn-info goonbutton" type="button" value="继续" >
                </div>
            </div>
        </div>
        
        
         <div class="col-md-5">
        	<div><img src="picture/1.jpg" /></div>
       	 	<div class="blank"></div>
    	</div>
    </div>
    
   
</div>




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
