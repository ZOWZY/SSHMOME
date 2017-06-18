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
       
    <title>提交订单</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userSearchSource.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userSource.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="提交订单界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
<body>
<div class="rowdiv row">
         <div class="col-md-1 icondiv" align="center">
             <img src="picture/mainicon.png"/>
         </div>
         
         <div class="col-md-11">
             <ul>
                <c:if test="${username==null }">
                 <li class="li">
                 	<a class="a" href="/SSHOME/loginPage.action">
                 		<strong>登录</strong>
                 	</a>
                 </li>
                 <li class="li">
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
			          <li><a href="/SSHOME/.action">我的信息</a></li>
			          <li><a href="/SSHOME/myOrders.action">我的订单</a></li>
			          <li><a href="/SSHOME/.action">我的收藏</a></li>
			        </ul>
		      	</li>                
                 </c:if> 
                 <li class="li">
                 	<a class="a" href="/SSHOME/helpPageAction.action">
                 		<strong>帮助</strong>
                 	</a>
                 </li>
                 <li class="li">
                 	<a class="a" href="/SSHOME/houseHolderPage.action">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
         
</div>

<div class="row background">
<div class="col-md-1"></div>
<div class="col-md-10">
    <div class="blank"></div>
    <div class="row alldiv">
        
        <div class="firstdiv">
        	<form action="${pageContext.request.contextPath}/searchRoom.action" method="post">
            <div class="blank"></div>
            <div class="row secondmargin">
                <div class="firstindiv col-md-10">
                	<select class="selectdiv" name="select">
                		<c:forEach var="i" step="1" begin="0"  end="9">
                    		<option value=${i }>选择目的地</option>
                    	</c:forEach>
                	</select>
                	<input type="date" name="datetime" class="datediv" placeholder="入住日期">
                	<label>-</label>
	                <input type="date" name="undatetime" class="datediv" placeholder="退房日期">
	                <input type="text" name=" " class="numberdiv" placeholder="入住人数">
                
	                <select class="selectdiv" name="select2">
	                	<c:forEach var="i" step="1" begin="0"  end="3">
	                    	<option value=${i }>选择房源类型</option>
	                    </c:forEach>
	                </select>
	                
	                <input type="text" name="title" class="inputdiv" placeholder="民宿名称">
                </div>
                <div class="col-md-2">
                    <input type="submit" class="button" value="搜索">
                </div>
            </div>
            </form>
            <div>
            	<button class="buttonstyle"><strong>更多筛选条件>></strong></button>
                <iframe frameborder="0" src="/SSHOME/searchAction.action" width="100%"
                        height="800px" scrolling="yes" class="frame">
            	</iframe>
            </div>
            <div class="blank"></div>  
        </div>
        
        
        <div class="margin">
            <div class="subdiv">
            <label>价格</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="radio" value=""/>0-200</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="radio" value=""/>200-500</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="radio" value=""/>500-1000</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="radio" value=""/>1000-2000</label>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="radio" value=""/>2000-5000</label>
            </div>
        </div>
    </div>
    <div class="blank"></div>
    <div class="blank"></div>
</div>
<div class="col-md-1"></div>
</div>


<div class="row background thirdmargin">
    <div class="col-md-1"></div>
    <div class="col-md-10 rowdiv">
        <input type="button" value="综合排序" class="searchbutton">
        <input type="button" value="价格" class="searchbutton">
        <input type="button" value="销量" class="searchbutton">
        <input type="button" value="好评" class="searchbutton">
    </div>
    <div class="col-md-1"></div>
</div>


<div class="row background">
    <div class="col-md-1"></div>
    <div class="col-md-10">

	<c:forEach var="i"  end="4" step="1" begin="0">
	<div class="blank"></div>
    <div class="blank"></div>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4 divcolor">
            <div class="blank"></div>
            <a href="/SSHOME/roomDetail.action">
            	<img src="picture/houseresource/home1/home103.png" class="imgheight"/>
            </a>
            <div class="blank"></div>
        </div>
        <div class="col-md-6 divcolor">
        	<div class="subblank">
            	<div class="col-md-9">
                	<h2>${room.title}</h2>
                </div>
                <div class="col-md-3">
                	<h2>¥${room.price}</h2>
                </div>
            </div>
            <div class="divblank"></div>
            <div class="blank">
            	<h4> ${room.localtion}</h4>
            </div>
            <div class="divblank"></div>
            <iframe src="/SSHOME/stars.action" width="100%" height="50px" 
            		scrolling="no" frameborder="0">
            </iframe>
        </div>
        <div class="col-md-1"></div>
    </div>
    
    
	<div class="blank"></div>
    <div class="blank"></div>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6 divcolor">
        	<div class="subblank">
            	<div class="col-md-9">
                	<h2> ${room.title}</h2>
                </div>
                <div class="col-md-3">
                	<h2>¥${room.price}</h2>
                </div>
            </div>
            <div class="divblank"></div>
            <div class="blank">
            	<h4>${room.localtion}</h4>
            </div>
            <div class="divblank"></div>
            <iframe src="/SSHOME/stars.action" width="100%" height="50px" 
            		scrolling="no" frameborder="0">
            </iframe>
        </div>
        <div class="col-md-4 divcolor">
            <div class="blank"></div>
            <a href="/SSHOME/roomDetail.action">
            	<img src="picture/houseresource/home1/home103.png" class="imgheight"/>
            </a>
            <div class="blank"></div>
        </div>
        <div class="col-md-1"></div>
    </div>
	</c:forEach>
    
    
    <div class="row">
    	<div class="col-md-12"><br></div>
    </div>
    <div class="row">
      <div class="col-md-1"></div>
   	  <div class="col-md-10">
    	<nav aria-label="...">
    	<ul class="pagination pagination-lg">
    		<li class="disabled">
				<span><span aria-hidden="true">&laquo;</span></span>
    		</li>
    		<li class="active">
      			<span>1 <span class="sr-only">(current)</span></span>
    		</li>
    		<li class="">
      			<span>2 <span class="sr-only">(current)</span></span>
    		</li>
    		<li class="">
      			<span>3 <span class="sr-only">(current)</span></span>
    		</li>
    		<li class="">
      			<span>4 <span class="sr-only">(current)</span></span>
    		</li>
        	<li class="">
      			<span>5 <span class="sr-only">(current)</span></span>
    		</li>
        	<li class="">
      			<span>6 <span class="sr-only">(current)</span></span>
    		</li>
        	<li class="">
      			<span>7 <span class="sr-only">(current)</span></span>
    		</li>
        	<li class="">
      			<span>....<span class="sr-only">(current)</span></span>
    		</li>
    		<li class="disabled">
      			<span><span aria-hidden="true">&raquo;</span></span>
    		</li>
  		</ul>
  		</nav>
  	  </div>
      <div class="col-md-1"></div>
    </div>
        
	<div class="row">
    	<div class="col-md-12"><br></div>
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
