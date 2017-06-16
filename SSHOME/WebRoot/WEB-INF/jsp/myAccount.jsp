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
    
    <title>我的账户</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/account.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">   
	<meta http-equiv="description" content="我的账户页面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
<body>
<div class="rowdiv row">
  <div class="col-md-1 icondiv" align="center"> <img src="picture/mainicon.png" class="image"/> </div>
  <div class="col-md-5"></div>
  <div class="col-md-6">
    <ul>
      <li>
      	<a href="/SSHOME/loginPage.action" id="signin" class="lia">
      		<strong>登录</strong>
      	</a>
      </li>
      <li>
      	<a href="/SSHOME/registerPage.action" id="register" class="lia">
      		<strong>注册</strong>
      	</a>
      </li>
      <li>
      	<a href="/SSHOME/helpPageAction.action" class="lia">
      		<strong>帮助</strong>
      	</a>
      </li>
      <li>
      	<a href="/SSHOME/houseHolderPage.action" class="lia">
      		<strong>成为房东</strong>
      	</a>
      </li>
    </ul>
  </div>
</div>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
	<form action="${pageContext.request.contextPath}/rechargeAction.action" method="post">
        <div class="divstyle">
            <div class="SSHOMEdiv">
                <h3 class="fontstyle">我的账户</h3>
            </div>
            <div class="inputdiv">
                <p class="pstyle">账户余额:</p>
                <input type="text" name="" value="" class="inputsize" readonly="readonly" />
                <p class="pstyle">充值金额:</p>
                <input type="text" name="number" value="" class="inputsize"/>
                <span class="spanstyle">
					<s:fielderror fieldName="changePasswordCode"/>
				</span>
                <input type="submit" value="充值" class="addbutton"/>
                <a href="/SSHOME/changePayPasswordPage.action" class="alter">修改支付密码</a>
                <br /><br />
            </div>
        </div>
    </form>
	</div>
	<div class="col-md-4"></div>
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
