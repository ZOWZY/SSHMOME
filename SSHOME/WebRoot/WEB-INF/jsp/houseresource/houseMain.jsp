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
    
    <title>My JSP 'houseMain.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/userMain.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/houseMain.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
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
			<li>
				<a class="a" href="/SSHOME/indexPage.action">
					<strong>回到主页</strong>
				</a>
			</li>
			<li>
				<a class="a" href="/SSHOME/.">
					<strong>房源信息中心</strong>
				</a>
			</li>
			<li>
				<a class="a" href="">
					<strong>成为房东</strong>
				</a>
			</li>
		</ul>
    </div>
</div>

<div style=" width:100%; height:auto;">
	<img src="picture/homebg/housemain.jpg" width="100%" height="100%" class="photo"/>
<div class="buttonlocation">
    <button  class="buttonstyle" id="startrent"> 出租房源</button>
</div> 
</div>

<div class="blank"></div>

<div class="col-md-1"></div>
<div class="col-md-10">

<div >
	<div class="aircletopic">
    		<div>如何出租房源</div>
    </div>
    <div class="blank"></div>
    <div class="articlecontent">
    	<div class="articleLv1">注册帐号开始出租</div>
    	<div class="articleLv3">从创建房源页面开始吧。这将是您房源的个人主页。</div>
    	<div class="articleLv2">房源需要有什么信息</div>          
    	<div class="articleLv3">您将需要填写房源描述、拍摄及上传照片，并决定住宿价格。房源页面能够让房客对您的空间有一个大致的了解。</div>
    	<div class="articleLv2">谁可以预订</div>
    	<div class="articleLv3">您可以为房源设置可订状态和制定《房屋守则》。出租控制条件和日历设置可以帮助您更轻松地出租。</div>
    	<div class="articleLv2">我们将随时为您提供帮助</div>            
    	<div class="articleLv3">出租过程中爱彼迎会为您提供建议和帮助。从准备房源和选择价格、到理解根据当地法律您需要承担的责任，我们都有相应的工具和资源来帮助您。</div>
    	<div class="articleLv1">房客找到您的房源并预订</div>            
    	<div class="articleLv3">您将会收到来自房客的预订确认和消息。</div>
    	<div class="articleLv2">给房客发消息</div>
    	<div class="articleLv3">通过在网站上或者应用发消息来了解房客，并解答他们的问题。</div>
    	<div class="articleLv2">决定入住流程</div>
    	<div class="articleLv3">有的房东会当面把钥匙交给房客，有的房东则会提供开门的密码。您可以选择对您来说最方便的方式。</div>
         
    	<div class="articleLv1">欢迎房客</div>
    	<div class="articleLv3">有的房东会提供早餐，有的则不会。如何接待房客全由您来决定。</div>
    	<div class="articleLv2">从最基本的开始</div>
    	<div class="articleLv3">大多数房东会打扫所有房客将会使用的空间，并提供生活必需品，比如干净的床单、毛巾和卫生纸。</div>
    	<div class="articleLv2">房客如何付款</div>
    	<div class="articleLv3">房客在入住之前已经付款，爱彼迎将会处理所有款项事宜，您并不用直接处理钱款。</div>
    	<div class="articleLv2">您如何收到款项</div>
        <div class="articleLv3">您可以选择通过PayPal、直接存款或者国际电汇来接收款项。系统会在房客入住24小时之后自动将款项汇给您，非常便捷。</div>
        <div class="articleLv2">收入和费用</div>
        <div class="articleLv3">在爱彼迎上发布空间是免费的，爱彼迎对每次预订收取3%的房东服务费。</div>
        <div class="articleLv2">收取的费用</div>
        <div class="articleLv3">收取多少费用全由您来决定。系统內有根据旅游趋势和同类房源价格来设置价格的工具，您注册之后就可以使用。</div>
    </div>      
</div>
<div class="col-md-1"></div>



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
</div> 
    
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

<div style=" width:100%; height:auto;">
	<img src="picture/房东图片.jpg" width="100%" height="100%" class="photo"/>
<div class="buttonlocation">
    <button  class="buttonstyle" id="startrent"> 出租房源</button>
</div> 
</div>

<div class="blank"></div>

<div class="col-md-1"></div>
<div class="col-md-10">

<div >
	<div class="aircletopic">
    		<div>如何出租房源</div>
    </div>
    <div class="blank"></div>
    <div class="articlecontent">
    	<div class="articleLv1">注册帐号开始出租</div>
    	<div class="articleLv3">从创建房源页面开始吧。这将是您房源的个人主页。</div>
    	<div class="articleLv2">房源需要有什么信息</div>          
    	<div class="articleLv3">您将需要填写房源描述、拍摄及上传照片，并决定住宿价格。房源页面能够让房客对您的空间有一个大致的了解。</div>
    	<div class="articleLv2">谁可以预订</div>
    	<div class="articleLv3">您可以为房源设置可订状态和制定《房屋守则》。出租控制条件和日历设置可以帮助您更轻松地出租。</div>
    	<div class="articleLv2">我们将随时为您提供帮助</div>            
    	<div class="articleLv3">出租过程中爱彼迎会为您提供建议和帮助。从准备房源和选择价格、到理解根据当地法律您需要承担的责任，我们都有相应的工具和资源来帮助您。</div>
    	<div class="articleLv1">房客找到您的房源并预订</div>            
    	<div class="articleLv3">您将会收到来自房客的预订确认和消息。</div>
    	<div class="articleLv2">给房客发消息</div>
    	<div class="articleLv3">通过在网站上或者应用发消息来了解房客，并解答他们的问题。</div>
    	<div class="articleLv2">决定入住流程</div>
    	<div class="articleLv3">有的房东会当面把钥匙交给房客，有的房东则会提供开门的密码。您可以选择对您来说最方便的方式。</div>
         
    	<div class="articleLv1">欢迎房客</div>
    	<div class="articleLv3">有的房东会提供早餐，有的则不会。如何接待房客全由您来决定。</div>
    	<div class="articleLv2">从最基本的开始</div>
    	<div class="articleLv3">大多数房东会打扫所有房客将会使用的空间，并提供生活必需品，比如干净的床单、毛巾和卫生纸。</div>
    	<div class="articleLv2">房客如何付款</div>
    	<div class="articleLv3">房客在入住之前已经付款，爱彼迎将会处理所有款项事宜，您并不用直接处理钱款。</div>
    	<div class="articleLv2">您如何收到款项</div>
        <div class="articleLv3">您可以选择通过PayPal、直接存款或者国际电汇来接收款项。系统会在房客入住24小时之后自动将款项汇给您，非常便捷。</div>
        <div class="articleLv2">收入和费用</div>
        <div class="articleLv3">在爱彼迎上发布空间是免费的，爱彼迎对每次预订收取3%的房东服务费。</div>
        <div class="articleLv2">收取的费用</div>
        <div class="articleLv3">收取多少费用全由您来决定。系统內有根据旅游趋势和同类房源价格来设置价格的工具，您注册之后就可以使用。</div>
    </div>      
</div>
<div class="col-md-1"></div>



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
</div> 
    
  </body>
</html>
