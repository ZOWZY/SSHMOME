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
    
    <title>我的收藏</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userOrder.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userCheckPage.css" type="text/css"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="我的收藏界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
  <body>
  <div class="row">
  <div class="rowdiv row">
         <div class="col-md-1 icondiv" align="center">
             <img src="picture/mainicon.png"/>
         </div> 
         <div class="col-md-5"></div>
         <div class="col-md-6">
             <ul>
                  <li role="presentation" class="dropdown li">
                    <a class="dropdown-toggle a" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                   		<strong> ${username} 的个人中心</strong> 
                   		<span class="caret"></span> 
                    </a>
        <ul class="dropdown-menu">
          <li><a href="/SSHOME/.action">我的信息</a></li>
          <li><a href="/SSHOME/myOrders.action">我的订单</a></li>
          <li><a href="/SSHOME/.action">我的收藏</a></li>
        </ul>
      </li>          
                 <li>
                 	<a href="/SSHOME/helpPageAction.action">
                 		<strong>帮助</strong>
                 	</a>
                 </li>
                 <li>
                 	<a href="/SSHOME/houseHolderPage.action">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
</div>
</div>
<div class="row">
<div class="col-md-1"></div>
<div class="col-md-10">



<div  style="height:500px;">

  <input type="text" readonly value="房源信息" class="inputtable"/>
  <div class="imgborder">
    <div class="col-md-5 divcolor">
      <div class="blank"></div>
      <img src="picture/houseresource/home1/home103.png" class="imgheight"/>
      <div class="blank"></div>
    </div>
    <div class="col-md-7 divcolor">
      <div class="subblank">
        <div class="col-md-9">
          <h2> ${room.title}</h2>
        </div>
        <div class="col-md-3">
          <h2>¥${room.price}起</h2>
        </div>
      </div>
      <div class="divblank"></div>
      <div class="blank">
        <p>
        <h4> ${room.localtion}</h4>
        </p>
      </div>
      <div class="divblank"></div>
      <div class="blank">
      </div>
      <div class="blank"></div>
    </div>
  </div>
  <div class="col-md-1"></div>
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
  <div class="col-md-2 textstyle"></div>
</div>
</body>
</html>
