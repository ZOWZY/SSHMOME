<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>获取照片</title>
  	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

	<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-3.2.0.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-3.2.0.min.js"></script>

  </head>
  
  <body>
  	<div id="photoNames">
  		
  	</div>
    	<script type="text/javascript">
    		console.log("请求照片...");
    		$.getJSON("${pageContext.request.contextPath }/getPhotoNames.action?roomid=1-3-11-7",
			function(data){
				console.log(data);
  				$.each(data, function(i,item){
  					console.log(item);
  					var name=i+":"+item.filename+"<br/>";
    				$("#photoNames").append(name);	
  				});
			}); 
    	
    	</script>
  </body>
</html>
