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
    
    <title>详情子页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/userSubDetail.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="详情子页面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">


  </head>
  
<body> 
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
                  			<input type="submit" id="" name="" value="联系房东" class="telbutton"/>
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
        		<div class=" row secondwholediv">
         			<div class="blank"></div>
          			<div class="col-md-6">
          				<label>入住</label>
          				<input type="date" class="seconddiv">
          			</div>
          			<div class="col-md-6">
            			<label>退房</label>
            			<input type="date" class="seconddiv">
          			</div>
          			<div class="col-md-12">
            			<div class="blank"></div>
            			<label>房客</label>
            			<select class="seconddiv">
			            	<option>1位房客</option>
			              	<option>2位房客</option>
			              	<option>3位房客</option>
			              	<option>4位房客</option>
            			</select>
            			<div class="blank"></div>
            			<div class="blank"></div>
            			<input type="submit" value="预订" class="buttonstyle">
            			<div class="blank"></div>
          			</div>
        		</div>
      	</div>
    </div>
  </div>
  <div class="col-md-1"></div>
</div>
</body>
</html>
