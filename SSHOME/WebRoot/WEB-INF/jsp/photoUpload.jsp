<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>上传文件</title>
    
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-3.2.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-3.2.0.min.js"></script>


<!--引入CSS-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/webuploader/webuploader.css">

<!--引入JS-->

<script type="text/javascript" src="${pageContext.request.contextPath }/webuploader/webuploader.js"></script>




  </head>
  
  <body>
  
 
  
  
   <div	id="uploader">
  			<!-- 用户显示文件列表 -->
  			<div id="fileList"></div>
  			<!-- 用于选择文件 -->
  			<div id="filePicker">点击选择文件</div>
  	</div>
  
  
  <script type="text/javascript">
  	//初始化webuploader
  	var webuploader=WebUploader.create({
  		//flash地址
  		swf:"${pageContext.request.contextPath}/webuploader/Uploader.swf",
  		//设置提交的服务器地址
  		server: "${pageContext.request.contextPath}/photoUpload.action",
  		//渲染文件上传元素
  		pick:"#filePicker",
  		//是否自动上传
  		auto:true,
  		//设置只能上传图片
  		accept: {
        	title: 'Images',
        	extensions: 'gif,jpg,jpeg,bmp,png',
        	mimeTypes: 'image/*'
    	},
    	fileSingleSizeLimit  :5*1024*1024,
    	//添加表单数据
    	formData: {"roomid":"1-3-11-7"},
    	// 图片质量，只有type为`image/jpeg`的时候才有效。
    	quality: 100,
    	thumb: {
    		width: 110,
    		height: 110,

    		// 图片质量，只有type为`image/jpeg`的时候才有效。
    		quality: 70,

    		// 是否允许放大，如果想要生成小图的时候不失真，此选项应该设置为false.
    		allowMagnify: true,

    		// 是否允许裁剪。
    		crop: true,  
    		} 	
    	
  	});
  	
 
  	
  	//选择文件后，文件信息加入消息队列
  	//file代表选到的文件
  	webuploader.on("fileQueued",function(file){
  		
  		//吧文件信息展示到id="fileList"的div中
  		$("#fileList").append("<div id="+file.id+"><img /><span>"+file.name+"</span>"+
  								"<div><span class='percentage'></span></div>"+
  								"<div><span class='error'><span></div>"+
  								"</div>");
  		
  		//制造图片的缩略图
  		//error若不是图片 则不能生成缩略图，则会有error
  		//src代表生成后的缩略图的地址
  		
  		webuploader.makeThumb(file,function(error,src){
  			//判断是否成功生成缩略图
  			if(error){
  				$("#"+file.id).find("img").replaceWith("无法预览");
  			}else{
  				$("#"+file.id).find("img").attr("src",src); 			
  			}
  		});
  		
  		
  		
  	});
  	
  	//在上传过程中实现文件上传的监控
  	//percentage用来显示百分比
  	//file和上面的file为同一个file
  	webuploader.on("uploadProgress",function(file,percentage){
  		$("#"+file.id).find("span.percentage").text(Math.round(percentage*100)+"%");
  		
  		
  	});
  	
  	// 文件上传成功，给item添加成功class, 用样式标记上传成功。
  	webuploader.on( 'uploadSuccess', function( file ) {
    	$( '#'+file.id ).addClass('upload-state-done');
	});
	
	
	// 文件上传失败，显示上传出错。
	webuploader.on( 'uploadError', function( file ) {
   	 	var $li = $( '#'+file.id ),
        	$error = $li.find('div.error');
    	// 避免重复创建
   		if ( !$error.length ) {
        		$error = $('<div class="error"></div>').appendTo( $li );
    	}
    	$error.text('上传失败');
	});
  	
  	
  	// 完成上传完了，成功或者失败，先删除进度条。
	webuploader.on( 'uploadComplete', function( file ) {
    	$( '#'+file.id ).find('.percentage').remove();
	});
	
  </script>
  
  
  
  	
  </body>
</html>
