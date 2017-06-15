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
    
    <title>房源详情</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userDetail.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="房源详情页面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">


  </head>
  
<body>
<div class="rowdiv row">
         <div class="col-md-1 icondiv" align="center">
             <img class="img" src="picture/mainicon.png"/>
         </div>
         <div class="col-md-5"></div>
         <div class="col-md-6">
             <ul>
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
                 <li class="li">
                 	<a class="a" href="">
                 		<strong>帮助</strong>
                 	</a>
                 </li>
                 <li class="li">
                 	<a class="a" href="">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
</div>


<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
	<ol class="carousel-indicators">
    	<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    	<li data-target="#carousel-example-generic" data-slide-to="1"></li>
    	<li data-target="#carousel-example-generic" data-slide-to="2"></li>
	</ol>

	<div class="carousel-inner" role="listbox">
    	<div class="item active">
      		<img src="picture/houseresource/detail1/detail101.png" class="imgheight">
    	</div>
    	<div class="item">
      		<img src="picture/houseresource/detail1/detail101.png" class="imgheight">
    	</div> 
        <div class="item">
      		<img src="picture/houseresource/detail1/detail101.png" class="imgheight">
    	</div>
	</div>

  	<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    	<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    	<span class="sr-only">Previous</span>
  	</a>
  	
  	<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    	<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    	<span class="sr-only">Next</span>
  	</a>   
</div>  
    
<div class="row">
	<div class="col-md-1"></div>
    <div class="col-md-10">
    	<div class="wholerow row">
        	<div class="col-md-3"> 
        		<a class="singlenav" href="#summarize"><strong>综述</strong></a> 
        	</div>
	        <div class="col-md-3"> 
	        	<a class="singlenav" href="#evaluate"><strong>评价</strong></a> 
	        </div>
	        <div class="col-md-3"> 
	        	<a class="singlenav" href="#houseowner"><strong>房东</strong></a> 
	        </div>
	        <div class="col-md-3"> 
	        	<a class="singlenav" href="#position"><strong>位置</strong></a> 
	        </div>
      	</div>
      	<div class="row">
      	<div class="col-md-8">
      		<div id="summarize">
            	<div class="sumfirst">
            		<br /><br />
              		<h1>1 AiNi【嗨,惬意成都】春熙路/太古里/iFS/香槟美食广场/成都味道复式套二洋楼</h1>
              		<h3>中国 四川 成都</h3>
            	</div>
            	
            	<div class="sumfirst">
              		<div class="blank"></div>
              		<h1>这里放图标</h1>
              		<div class="blank"></div>
            	</div>	
            	
            	<div class="sumfirst">
              		<div class="blank"></div>
              		<p>100%可退款</p>
              		<p>距离旅程开始五天之前取消预订可获全额退款（包括服务费）</p>
              		<div class="blank"></div>
            	</div>
            	
            	<div class="sumfirst">
              		<h2><strong>关于此房源</strong></h2>
              		<div class="row">
                		<div class="col-md-4">
                  			<div class="blank"></div>
                  			<h5>房源</h5>
                		</div>
                		<div class="col-md-8 sumright">
                  			<div class="blank"></div>
                  			<div class="col-md-6">
                    			<h5>可住:</h5><br>
                    			<h5>卫生间:</h5><br>
                    			<h5>卧室:</h5><br>
                    			<h5>床铺:</h5><br>
                  			</div>
                  			<div class="col-md-6">
                    			<h5>入住时间:</h5><br>
                    			<h5>退房时间:</h5><br>
                    			<h5>房源类型:</h5><br>
                    			<h5>房间类型:</h5><br>
                  			</div>
                  			<div class="blank"></div>
                		</div>
              		</div>
              		
              		
              		<div class="row">
                		<div class="col-md-4">
                  			<div class="blank"></div>
                  			<h5>便利设施</h5>
                		</div>
                		<div class="col-md-8 sumright">
                  			<div class="blank"></div>
                  			<div class="col-md-6">
                    			<h5>允许携带宠物</h5><br>
                    			<h5>免费停车位</h5><br>
                  			</div>
                  			<div class="col-md-6">
                    			<h5>厨房</h5><br>
                    			<h5>早餐</h5><br>
                  			</div>
                  			<div class="blank"></div>
                		</div>
              		</div>
              		
              		
              		<div class="row">
                		<div class="col-md-4">
                 			<div class="blank"></div>
                  			<h5>床位安排</h5>
                		</div>
                		<div class="col-md-8 sumright">
                  			<div class="blank"></div>
                  			<div class="col-md-6">
                    			<h5>卧室1</h5><br>
                    			<h5>1张大床</h5><br>
                  			</div>
                  			<div class="col-md-6">
                    			<h5>卧室2</h5><br>
                    			<h5>1张大床</h5><br>
                  			</div>
                  			<div class="blank"></div>
                		</div>
              		</div>
              		
              		
              		<div class="row">
                		<div class="col-md-4">
                  			<div class="blank"></div>
                  			<h5>收费相关</h5>
                		</div>
                		<div class="col-md-8 sumright">
                  			<div class="blank"></div>
                  			<div class="col-md-6">
                    			<h5>清洁费</h5><br>
                  			</div>
                  			<div class="col-md-6">
                    			<h5>周末价格</h5><br>
                  			</div>
                  			<div class="blank"></div>
                		</div>
              		</div>
              		
              		
              		<div class="row">
                		<div class="col-md-4">
                  			<div class="blank"></div>
                  			<h5>房屋守则</h5>
                  		</div>
                		<div class="col-md-8 sumright">
			                  <div class="blank"></div>
			                  <p>1.入住时间是15:00以后.退房时间是12:00之前</p>
			                  <p>2.不适合携带宠物</p>
			                  <p>3.不允许举办大型聚会和活动</p>
			                  <p>4.进出房子,请复核房门是否关闭</p>
			                  <p>5.出门请记得关闭未用电源和燃气</p>
			                  <p>6.退房前(如果使用厨房)需要打扫厨房卫生</p>
			                  <p>7.若房子家电或相关设施损坏,请及时联系我,以便及时整修</p>
			                  <div class="blank"></div>
                		</div>
              		</div>
              		
              		
              		<div class="row">
                		<div class="col-md-4">
                  			<div class="blank"></div>
                  			<h5>安全设施</h5>
                		</div>
                		<div class="col-md-8 sumright">
		                	<div class="blank"></div>
		                  	<div class="col-md-6">
		                    	<h5>烟雾报警器</h5><br>
		                    	<h5>安全卡</h5><br>
                  			</div>
                  			<div class="col-md-6">
			                    <h5>灭火器</h5><br>
			                    <h5>急救包</h5><br>
                  			</div>
                  			<div class="blank"></div>
                		</div>
              		</div>
            	</div>
          	</div>
          	
          	
          	
          	<div id="evaluate">
                <div class="sumfirst">
              		<div class="blank"></div>
              		<h1>42条评价</h1>
              		<div class="blank"></div>
            	</div>
            	<div class="sumfirst">
              		<div class="row">
                		<div class="blank"></div>
                		<div class="col-md-6">
                  			<h5>如实描述</h5><br>
                  			<h5>沟通交流</h5><br>
                  			<h5>干净指数</h5><br>
                		</div>
                		<div class="col-md-6">
			                <h5>位置便利指数</h5><br>
			                <h5>办理入住</h5><br>
			                <h5>性价比</h5><br>
                		</div>
                		<div class="blank"></div>
                	</div>
            	</div>
          	</div>
          	
          	
          	
          	<div id="houseowner">
            	<div class="sumfirst">
              		<div class="row">
                		<div class="col-md-9">
                  			<h2><strong>房东:</strong></h2>
                  			<h4>中国 注册时间 2017年4月</h4>
                  			<form action="http://www.zjhfyq.cn/CustomService/login" method="post">
				    			<input type="hidden" name="username" value="QQQ"/>
				    			<input type="hidden" name="password" value="******"/>
				    			<input type="hidden" name="type" value="user"/>
				    			<input type="submit" value="联系房东" class="telbutton"/>
    						</form>
                  			<div class="blank"></div>
                		</div>
                		<div class="col-md-3">
                  			<div class="blank"></div>
                  			<img src="picture/mainicon.png" class="imgsize"/>
                  			<div class="blank"></div>
                		</div>
              		</div>
           		 </div>
          	</div>
          	
          	
          	
          	<div id="position">
            	<div>
              		<h1>这里导入地图</h1>
            	</div>
            </div>
        </div>
     
     
     
     	<div class="col-md-4 coldiv">
     	<form action="${pageContext.request.contextPath}/newOrders.action" method="post">
        		<div class=" row secondwholediv">
         			<div class="blank"></div>
          			<div class="col-md-6">
          				<label>入住</label>
          				<input type="date" name="datetime" class="seconddiv">
          			</div>
          			<div class="col-md-6">
            			<label>退房</label>
            			<input type="date" name="undatetime" class="seconddiv">
          			</div>
          			<div class="col-md-12">
            			<div class="blank"></div>
            			<label>房客</label>
            			<select class="seconddiv" name="select">
			            	<option value="-1">选择房客位数</option>
            			</select>
            			<div class="blank"></div>
            			<div class="blank"></div>
            			<input type="submit" value="预订" class="buttonstyle">
            			<div class="blank"></div>
          			</div>
        		</div>
        </form>
      	</div>
  	</div>
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

