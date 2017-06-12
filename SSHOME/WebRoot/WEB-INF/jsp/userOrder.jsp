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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userOrder.css" type="text/css"/>
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
         <div class="col-md-5">
             <span class="glyphicon glyphicon-search"></span>
             <input type="text" placeholder="搜索" maxlength="20" class="inputstyle">
         </div>
         <div class="col-md-6">
             <ul>
                 <li class="li"><a class="a" href=""><strong>登录</strong></a></li>
                 <li class="li"><a class="a" href=""><strong>注册</strong></a></li>
                 <li class="li"><a class="a" href=""><strong>帮助</strong></a></li>
                 <li class="li"><a class="a" href=""><strong>成为房东</strong></a></li>
             </ul>
         </div>
</div>

<div class="row">
    <div class="col-md-1"></div>
    <div class="col-md-10">
    	<form action="${pageContext.request.contextPath}/addOrders.action" method="post">
    	<div>
      		<input type="text" readonly value="身份信息" class="inputtable"/>
        </div>
    	<div class="infor">
        	<div class="col-md-4">
            	<label>姓名：</label><h5>王梦迪</h5>
            </div>
            <div class="col-md-4">
            	<label>手机号：</label><h5>15002300023</h5>
            </div>
            <div class="col-md-4">
            	<label>身份证号：</label><h5>150404199610201145</h5>
            </div>
        </div>
        
        
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
                		<h2>瑶庄精品民宿</h2>
                	</div>
                	<div class="col-md-3">
                		<h2>265起</h2>
                	</div>
            	</div>
            	<div class="divblank"></div>
            	<div class="blank">
            		<p><h4>这是一个位置图标 春熙路 太古里</h4></p>
            	</div>
            	<div class="divblank"></div>
            	<div class="blank">
            		<p><h5>这里放星星评分</h5></p>
            	</div>
            	<div class="blank"></div>
        	</div>
        </div>
        
        
        <div class="divstyle">
            <div class="SSHOMEdiv">
                <h4 class="fontstyle"><strong>确认订单</strong></h4>
            </div>
            <div class="tablediv">
            	<table class="tablestyle">
	            	<tr>
	                	<th>预订者</th>
                        <th>入住日期</th>
                        <th>退房日期</th>
                        <th>入住人数</th>
                        <th>房间类型</th>
                        <th>价格</th>
	              	</tr>
	                <c:forEach var=" " items=" ">
                  	<tr>		
                    	<td></td>
                        <td></td>
                  		<td></td>
                        <td></td>
                  		<td></td>
                        <td></td>
                    </tr>
                    </c:forEach>
             	</table>
            </div>	
        </div>
        <input type="submit" value="提交订单" class="paybtn"/>
    	</form>
    	
    	<form action="http://www.zjhfyq.cn/CustomService/login" method="post">
    			<input type="hidden" name="username" value="QQQ"/>
    			<input type="hidden" name="password" value="******"/>
    			<input type="hidden" name="type" value="user"/>
    			<input type="submit" value="联系房东" class="cancelbtn"/>
    	</form>

    </div>
    <div class="col-md-1"></div>
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
