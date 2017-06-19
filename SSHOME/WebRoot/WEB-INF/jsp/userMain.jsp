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
             <input type="text" name="location" value="${location}" placeholder="搜索" maxlength="20" class="inputstyle">
         </div>
         <div class="col-md-6">
             <ul>
             	<c:if test="${username==null }">
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
                 </c:if>
                 
                 <c:if test="${username!=null }">
                 <li role="presentation" class="dropdown li">
                    <a class="dropdown-toggle a" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                   		<strong> ${username} 的个人中心</strong> 
                   		<span class="caret"></span> 
                    </a>
			        <ul class="dropdown-menu">
			          <li><a href="/SSHOME/userInfor.action">我的信息</a></li>
			          <li><a href="/SSHOME/myOrders.action">我的订单</a></li>
			          <li><a href="/SSHOME/rechargePageAction.action">我的账户</a></li>
			        </ul>
      			 </li>          
                 </c:if>  
                 <li>
                 	<a class="a" href="/SSHOME/helpPageAction.action">
                 		<strong>帮助</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/HouseMainAction.action">
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
        	<input type="text" id="input" name="location" placeholder="请输入目的地"/>
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
             <c:forEach var="i" items="${roomlist}" begin="0" end="2" step="1">
                  	<div class="col-md-4">
                        <a href="/SSHOME/roomDetail.action">
                        	<img src="" class="imglevel" id="img"+i/>
                        </a>
                        <input type="hidden" value="${roomlist.roomid}" name="roomid"/>
                        <h5 class="smallfont">
                            <strong>¥${roomlist.price}</strong> &nbsp;&nbsp; ${roomlist.location}
                        </h5>
                    </div>
             </c:forEach>       
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

<script type="text/javascript">
var roomid=document.getElementsByName("roomid");
var i=roomid.length;
for(var j=0;j<i;j++){
$.ajax({
             type: "GET", //POST
             url: ".action",
             data: {
             	roomid:$("#roomid").val()
             }, //组装参数
             success: function(data){
                         alert('成功');
                      },
             error:function(){
                      alert('请求失败！！！');
                      }
         });
}
//从后台获取图片的src
for(var j=0;j<i;j++){
$.ajax({
             type: "GET", //POST
             url:"",//默认当前页面
             dataType:"json"
             data: {
             	roomid:$("#roomid").val()
             }, //组装参数
             success: function(data){
                         ${'"#img"+j'}.attr("src","json");
                      },
              error:function(){
              alert("请求失败！！！！");
              }
         });
}
</script>
</body>
</html>
