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
    
    <title>My JSP 'houseStep2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/houseStep2.css" type="text/css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/houseMain.css" type="text/css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/userMain.css" type="text/css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>   
<link href="${pageContext.request.contextPath}/webuploader/webuploader.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.min.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/webuploader/webuploader.min.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>

  <style>
.demo{min-width:360px;margin:30px auto;padding:10px 20px}
.demo h3{line-height:40px; font-weight: bold;}
.file-item{float: left; position: relative; width: 110px;height: 110px; margin: 0 20px 20px 0; padding: 4px;}
.file-item .info{overflow: hidden;}
.uploader-list{width: 100%; overflow: hidden;}
</style>    
  </head>
  
  <body>
     <div class="rowdiv row">
	<div class="col-md-6">         
    	<span class="glyphicon glyphicon-search"></span>
        <input type="text" placeholder="搜索" maxlength="20" class="inputstyle">
    </div>
     <div class="col-md-6">
             <ul>
                 <li>
                 	<a class="a" href="/SSHOME/indexPage.action">
                 		<strong>回到主页</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="/SSHOME/BasicAction.action">
                 		<strong>房源信息中心</strong>
                 	</a>
                 </li>
                 <li>
                 	<a class="a" href="HouseMainAction.action">
                 		<strong>成为房东</strong>
                 	</a>
                 </li>
             </ul>
         </div>
</div>
<form action="${pageContext.request.contextPath}/BasicAction.action" method="post">
<div class="container">
	<div class="articleLv1">填写您发布的房源的基本信息</div>
    
	<div class="row">
    	<div class="col-md-3" ></div>
    	<div class="col-md-6" >
        	
            <div class="borderstyle">
            	<div class="selectnumber">
                	给你的房源取一个引人注目的标题：<input type="text" value="" style=" width:auto">
            	</div>
            </div>
            <div class="borderstyle">
            	<div class="selectnumber">
                	单日房价：<input type="text" value="">
                </div>
            	<div class="selectnumber">
                	卧室数：<input type="number">
                </div>
                <div class="selectnumber">
                	床铺数：<input type="number">
                </div>
                <div class="selectnumber">
                	卫生间数：<input type="number">
                </div>
                <div class="selectnumber">
                	有无厨房：有<input type="checkbox">无<input type="checkbox">
                </div>
                <div class="selectnumber">
                	有无WIFI：有<input type="checkbox">无<input type="checkbox">
                </div>
            </div>
            <div class="borderstyle">
            	<div class="selectnumber">
                	是否可以携带宠物：有<input type="checkbox">无<input type="checkbox">
                </div>
                <div class="selectnumber">
                	是否可以吸烟：有<input type="checkbox">无<input type="checkbox">
                </div>
                <div class="selectnumber">
                	是否允许举办派对和活动：有<input type="checkbox">无<input type="checkbox">
                </div>
                <div class="selectnumber">
                	入住的时间<input type="time">
                </div>
            </div>
            <div class="borderstyle">
            	<div class="row main">
					<div class="demo">
						<div id="uploader-demo">
    						<!--用来存放item-->
   			 				<div id="fileList" class="uploader-list"></div>
   			 				<div id="filePicker" class="btn buttonrad" >选择图片</div>
   			 				<div class="btn btn-primary" id="ctlBtn">开始上传</div>
						</div>
					</div>
				</div>
			</div>
            <script>
			$(function(){
				var $list = $('#fileList'),
			        $btn = $('#ctlBtn');
			 
			    var uploader = WebUploader.create({
			      resize: false, // 不压缩image     
			      swf: 'js/uploader.swf', // swf文件路径
			      server: '/SSHOME/photoUpload.action', // 文件接收服务端。
			      pick: '#filePicker', // 选择文件的按钮。可选
			      auto: false, //选择文件后是否自动上传
			      formData:{
			      	roomid:1001
			      },
			      //runtimeOrder: 'html5,flash',
			      accept: {
			         title: 'Images',
			         extensions: 'gif,jpg,jpeg,bmp,png',
			         mimeTypes: 'image/*'
			       }
			    });
			    // 当有文件被添加进队列的时候
			    uploader.on( 'fileQueued', function( file ) {
			     var $li = $(
			            '<div id="' + file.id + '" class="file-item thumbnail">' +
			                '<img>' +
			                '<div class="info">' + file.name + '</div>' +
			            '</div>'
			            ),
			        $img = $li.find('img');
			    // $list为容器jQuery实例
			    $list.append( $li );
			
			    // 创建缩略图
			    // 如果为非图片文件，可以不用调用此方法。
			    // thumbnailWidth x thumbnailHeight 为 100 x 100
			    uploader.makeThumb( file, function( error, src ) {
			        if ( error ) {
			            $img.replaceWith('<span>不能预览</span>');
			            return;
			        }
			        $img.attr( 'src', src );
			    }, 100, 100 );
			    });
			    // 文件上传过程中创建进度条实时显示。
			    uploader.on( 'uploadProgress', function( file, percentage ) {
			        var $li = $( '#'+file.id ),
			            $percent = $li.find('.progress .progress-bar');
			
			        // 避免重复创建
			        if ( !$percent.length ) {
			            $percent = $('<div class="progress progress-striped active">' +
			              '<div class="progress-bar" role="progressbar" style="width: 0%">' +
			              '</div>' +
			            '</div>').appendTo( $li ).find('.progress-bar');
			        }
			
			        $li.find('p.state').text('上传中');
			
			        $percent.css( 'width', percentage * 100 + '%' );
			    });
			    // 文件上传成功
			    uploader.on( 'uploadSuccess', function( file ) {
			        $( '#'+file.id ).find('p.state').text('已上传');
			    });
			
			    // 文件上传失败，显示上传出错
			    uploader.on( 'uploadError', function( file ) {
			        $( '#'+file.id ).find('p.state').text('上传出错');
			    });
			    // 完成上传完
			    uploader.on( 'uploadComplete', function( file ) {
			        $( '#'+file.id ).find('.progress').fadeOut();
			    });
			    $btn.on('click', function () {
			            if ($(this).hasClass('disabled')) {
			                return false;
			            }
			            uploader.upload();
			            // if (state === 'ready') {
			            //     uploader.upload();
			            // } else if (state === 'paused') {
			            //     uploader.upload();
			            // } else if (state === 'uploading') {
			            //     uploader.stop();
			            // }
			        });
			
			});
			</script>	
            <div class="borderstyle">
            	<input type="text" value="" class="selectnumber">省
                <input type="text" value="" class="selectnumber">市
                <input type="text" value="" class="selectnumber">街道
            </div>
            <div class="borderstyle text-center">
            	<input type="submit" value="保存" onclick="ale()">
            	<script language="javascript">
            	function ale()
				{ 
				   alert("保存成功！");
				}
				</script>
            </div>

            
        </div>
    	<div class="col-md-3"></div>
    </div>
</div>
</form>
</body>
</html>
