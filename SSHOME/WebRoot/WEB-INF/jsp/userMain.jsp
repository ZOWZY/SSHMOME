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
    
    <title>主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userMain.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">   
	<meta http-equiv="description" content="日租，旅行，到家">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>

<body>

<div class="rowdiv row">
		 <form action="${pageContext.request.contextPath}/searchRoom.action" method="post">
         <div class="col-md-6">
             <span class="glyphicon glyphicon-search"></span>
             <input type="text" name=" " value="" placeholder="搜索" maxlength="20" class="inputstyle">
         </div>
         <div class="col-md-6">
             <ul>
                 <li>
                 	<a class="a" href="/SSHOME/loginPage.action">
                 		<strong>登录</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/registerPage.action">
                 		<strong>注册</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/helpPageAction.action">
                 		<strong>帮助</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/houseHolderPage.action">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
         </form>
</div>
    

<div style=" width:100%; height:590px;">
	<div id="container">
		<div>
			<iframe src="/SSHOME/imgCarouselPageAction.action" frameborder="0" style="width:100%; height:620px;"></iframe>
		</div>
		
		<form action="${pageContext.request.contextPath}/searchRoom.action" method="post">
   		<div id="search">
        	<input type="text" id="input" name=" " placeholder="请输入目的地"/>
    	</div>
    	<div>
    		<input type="submit" id="look" value="搜索"/>
    	</div>
    	</form>
    	
    </div>
</div>
 

<div class="blank"></div>
<div class="blank"></div>
<div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
        	
        	<div class="blank"></div>
            <h1 class="fontstyle"><strong>热门房源</strong></h1>
            <div class="blank"></div>
            
            <div class="row">
                    <div class="col-md-4">
                        <a href="/SSHOME/roomDetail.action">
                        	<img src="picture/houseresource/home1/home101.png" class="imglevel"/>
                        </a>
                        <h5 class="smallfont">
                            <strong>¥${room.price}</strong> &nbsp;&nbsp; ${room.localtion}
                        </h5>
                    </div>             
                    <div class="col-md-4">
                    	<a href="/SSHOME/roomDetail.action">
                        	<img src="picture/houseresource/home2/home201.png" class="imglevel"/>
                        </a>
                        <h5 class="smallfont">
                            <strong>¥${room.price}</strong> &nbsp;&nbsp; ${room.localtion}
                        </h5>
                    </div>
                    <div class="col-md-4">
                    	<a href="/SSHOME/roomDetail.action">
                        	<img src="picture/houseresource/home3/home301.png" class="imglevel"/>
                        </a>
                        <h5 class="smallfont">
                            <strong>¥${room.price}</strong> &nbsp;&nbsp; ${room.localtion}
                        </h5>
                    </div>            
            </div>
            
            <div class="blank"></div>
            <h1 class="fontstyle"><strong>目的地精选</strong></h1>
            <div class="blank"></div>
            
            <div class="row">
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel1.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>京都</strong> &nbsp;&nbsp;游古城，赏樱花
                        </h5>
                    </div>             
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel2.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>清迈</strong> &nbsp;&nbsp;泰国最文艺小城
                        </h5>
                    </div>
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel3.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>英伦</strong> &nbsp;&nbsp;感受英伦风情
                        </h5>
                    </div>
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel4.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>普吉岛</strong> &nbsp;&nbsp;在东南亚看海
                        </h5>
                    </div>
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel5.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>洛杉矶</strong> &nbsp;&nbsp;好莱坞式繁华
                        </h5>
                    </div>
                    <div class="col-md-2">
                        <img src="picture/travelcity/travel6.jpg" class="imglevel"/>
                        <h5 class="smallfont">
                            <strong>巴厘岛</strong> &nbsp;&nbsp;度蜜月的首选
                        </h5>
                    </div>           
            </div>
            
            <div class="blank"></div>
            <div class="blank"></div>
            <div class="blank"></div>            
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

</body>
</html>
