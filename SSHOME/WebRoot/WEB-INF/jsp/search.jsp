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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/search.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="description" content="提交订单界面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
<body>
<form action="${pageContext.request.contextPath}/searchAction.action" method="post">
<div class="container-fuild">
<div class="row">
	<div class="col-md-12">
    
		<div class="row">
			<div class="col-md-12">
				<span class="content">卧室与床铺</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-1">
				<span class="content">卧室</span>
			</div>
            
			<div class="col-md-3">
				<button class="circlebutton" type="button" aria-label="减" 
						aria-controls="StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms" disabled="">
					<span class="icon_16b32nl-o_O-icon_1wy8x1d-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" 
								style="display:block;fill: currentcolor; height: 1em; width: 1em;">
							<rect width="12" height="2" x="6" y="11" rx="1"></rect>
						</svg>
					</span>
				</button>
                
				<label>0+</label>
                
				<button class="circlebutton" type="button" aria-label="加" 
						aria-controls="StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms">
					<span class="icon_16b32nl-o_O-icon_11jdm7g-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" 
								style="display:block; fill: currentcolor; height: 1em; width: 1em;">
							<rect width="12" height="2" x="6" y="11" rx="1"></rect>
							<rect width="2" height="12" x="11" y="6" rx="1"></rect>
						</svg>
					</span>
				</button>
			</div>

			<div class="col-md-1">
				<span class="content">床铺</span>
			</div>

			<div class="col-md-3">
				<button class="circlebutton" type="button" aria-label="减" aria-controls=                        "StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms" 		                        disabled="">
					<span class="icon_16b32nl-o_O-icon_1wy8x1d-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" style="display:                             block; fill: currentcolor; height: 1em; width: 1em;"><rect width="12"                             height="2" x="6" y="11" rx="1"></rect>
						</svg>
					</span>
				</button>

				<label>0+</label>

				<button class="circlebutton" type="button" aria-label="加" aria-controls=                        "StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms">
					<span class="icon_16b32nl-o_O-icon_11jdm7g-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" style="display:                             block; fill: currentcolor; height: 1em; width: 1em;">
							<rect width="12" height="2" x="6" y="11" rx="1"></rect>
							<rect width="2" height="12" x="11" y="6" rx="1"></rect>
						</svg>
					</span>
				</button>
			</div>

			<div class="col-md-1">
				<span class="content">卫生间</span>
			</div>

			<div class="col-md-3">
				<button class="circlebutton" type="button" aria-label="减" aria-controls=                        "StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms"                        disabled="">
					<span class="icon_16b32nl-o_O-icon_1wy8x1d-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" style="display:
					         block; fill: currentcolor; height: 1em; width: 1em;"><rect width="12" 
						     height="2" x="6" y="11" rx="1"></rect>
						</svg>
					</span>
				</button>

				<label>0+</label>
                
                <button class="circlebutton" type="button" aria-label="加" aria-controls=                        "StepIncrementerRow-value-SizeFilter-via-MoreFiltersPanel-min_bedrooms">
					<span class="icon_16b32nl-o_O-icon_11jdm7g-o_O-icon_small_abrv9k">
						<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" style="display:                             block; fill: currentcolor; height: 1em; width: 1em;">
							<rect width="12" height="2" x="6" y="11" rx="1"></rect>
							<rect width="2" height="12" x="11" y="6" rx="1"></rect>
						</svg>
					</span>
				</button>
			</div>
		</div>

		<div class="row">
			<br />
			<legend></legend>
		</div>

		<div class="row">
			<div class="col-md-12">
				<span class="content">其它选项</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<span class="content">超赞房东</span><br />
				<span>向获得认可的房东租住房源</span><br />
				<a><span>了解更多</span></a>
			</div>
		</div>

		<div class="row">
			<br />
			<legend></legend>
		</div>

		<div class="row">
			<div class="col-md-12">
				<span class="content">便利设施</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">厨房</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">无线网络</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">电视机</span>
			</div>
		</div>

		<div class="row" id="panel">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">书桌/工作区域</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">吹风机</span>
			</div>
		</div>

		<div class="row" id="panel2">
			<div class="col-md-6 rown">
				<input type="checkbox" class="check" 
                       name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">早餐</span>
			</div>

			<div class="col-md-6 ">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">洗衣机</span>
			</div>
		</div>

		<div class="row" id="panel3">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">洗发水</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">空调</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<a><span class="flip">查看全部便利设施</span></a>
			</div>
		</div>

		<div class="row">
			<br />
			<legend></legend>
		</div>

		<div class="row">
			<div class="col-md-12">
				<span class="content">设施</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
           		name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">免费停车位</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
            	name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">游泳池</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">电梯</span>
			</div>
		</div>

		<div class="row" id="panel4">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">健身房</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">按摩浴缸</span>
			</div>
		</div>

		<div class="row" id="panel5">
			<div class="col-md-12">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">无障碍设施</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<a><span class="flip2">查看全部设施</span></a>
			</div>
		</div>


		<div class="row">
			<br />
			<legend></legend>
		</div>

		<div class="row">
			<div class="col-md-12">
				<span class="content">房屋守则</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">允许携带宠物</span>
			</div>

			<div class="col-md-6">
				<input type="checkbox" class="check" 
                name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">允许吸烟</span>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<input type="checkbox" class="check" 
            	name="MoreFiltersPanel-amenities-CheckBoxFilterItem-8" value="on">
				<span class="content">适合举办活动</span>
			</div>
		</div>

		<div class="row">
			<br />
			<legend></legend>
		</div>

	</div>
</div>
</div>
<center><input type="submit" value="保存" class="button"/></center>
</form>

<script type="text/javascript"> 
$(document).ready(function(){
  $(".flip2").click(function(){
	  $("#panel4").slideToggle("slow");
	$("#panel5").slideToggle("slow");
	  });
});
</script>

<script type="text/javascript"> 
$(document).ready(function(){
  $(".flip").click(function(){
    $("#panel").slideToggle("slow");
	$("#panel2").slideToggle("slow");
	$("#panel3").slideToggle("slow");
	});
});
</script>

</body>
</html>
