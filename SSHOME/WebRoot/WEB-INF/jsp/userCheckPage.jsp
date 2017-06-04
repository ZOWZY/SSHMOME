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
    
    <title>My JSP 'userCheckPage.jsp' starting page</title>
    
    <script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userCheckPage.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<div class="rowdiv row">
         <div class="col-md-1 icondiv" align="center">
             <img src="picture/mainicon.png"/>
         </div>
         
         <div class="col-md-5">
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

<div class="row background">
<div class="col-md-1"></div>
<div class="col-md-10">
    <div class="blank"></div>
    <div class="alldiv">
        
        <div class="firstdiv">
            <div class="blank"></div>
            <div class="row secondmargin">
                <div class="firstindiv col-md-10">
                <select class="selectdiv">
                    <option>杭州</option>
                    <option>苏州</option>
                    <option>上海</option>
                    <option>重庆</option>
                    <option>贵阳</option>
                    <option>广州</option>
                    <option>大连</option>
                    <option>成都</option>
                </select>
                
                <input type="date" class="datediv" placeholder="入住日期">
                <label>--</label>
                <input type="date" class="datediv" placeholder="退房日期">
                <input type="text" class="numberdiv" placeholder="入住人数">
                
                <select class="selectdiv">
                    <option>整套房源</option>
                    <option>独立房间</option>
                    <option>合住房间</option>
                </select>
                
                <input type="text" class="inputdiv" placeholder="民宿名称">
                </div>
                <div class="col-md-2">
                    <input type="button" class="button" value="搜索">
                </div>
            </div>
            <div>
            	<button class="buttonstyle"><strong>更多筛选条件>></strong></button>
                 <iframe frameborder="0" src="search.jsp" width="100%"
                    height="800px" scrolling="yes" class="frame">
            </iframe>
            </div>
            <div class="blank"></div>  
        </div>
        
        <div class="margin">
            <div class="subdiv">
            <label>位置</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>不限</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>商圈</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>地铁</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>景点</label>
            </div>
        </div>
        
        <div class="margin">
            <div class="subdiv">
            <label>价格</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>0-200</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>200-500</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>500-1000</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>1000-2000</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox"><label>2000-5000</label>
            </div>
        </div>
    </div>
    <div class="blank"></div>
    <div class="blank"></div>
</div>
<div class="col-md-1"></div>
</div>


<div class=" row background thirdmargin">
    <div class="col-md-1"></div>
    <div class="col-md-10 rowdiv">
        <input type="button" value="综合排序" class="searchbutton">
        <input type="button" value="价格" class="searchbutton">
        <input type="button" value="销量" class="searchbutton">
        <input type="button" value="好评" class="searchbutton">
    </div>
    <div class="col-md-1"></div>
</div>


<div class=" row background">
    <div class="col-md-1"></div>
    <div class="col-md-10">
        <div>
            <iframe frameborder="0" src="userHomeMainSource.jsp" width=100% height=100% scrolling="yes">
            </iframe>
        </div>
    </div>
    <div class="col-md-1"></div>
</div>


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

<script type="text/javascript"> 
$(document).ready(function(){
  $(".buttonstyle").click(function(){
    $(".frame").slideToggle("slow");
	});
});
</script>

</body>
</html>
