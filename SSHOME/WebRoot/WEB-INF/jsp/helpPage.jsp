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
    
    <title>帮助</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/help.css" type="text/css"/>
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">   
	<meta http-equiv="description" content="帮助页面">
	<meta http-equiv="content-type"  content="text/html;charset=utf-8">

  </head>
  
<body>
<div class="rowdiv row">
  <div class="col-md-1 icondiv" align="center"> <img src="picture/mainicon.png" class="image"/> </div>
  <div class="col-md-5"></div>
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
          <li><a href="/SSHOME/.action">我的信息</a></li>
          <li><a href="/SSHOME/myOrders.action">我的订单</a></li>
          <li><a href="/SSHOME/.action">我的收藏</a></li>
        </ul>
      </li>          
                 </c:if> 
      <li>
      	<a href="/SSHOME/helpPageAction.action">
      		<strong>帮助</strong>
      	</a>
      </li>
      <li>
      	<a href="/SSHOME/houseHolderPage.action">
      		<strong>成为房东</strong>
      	</a>
      </li>
    </ul>
  </div>
</div>
<div class="jumbotron jum"> <br />
  <br />
  <br />
  <h1>我们能帮上什么忙吗？</h1>
  <p>欢迎使用SSHOME，请阅读下面的帮助文档</p>
  <br />
  <br />
  <br />
</div>
<div class="row">
  <div class="col-md-2"> </div>
  <div class="col-md-2">
  <div class="daohang">
  <a href="#use"><strong>如何使用SSHOME</strong></a>
  <a href="#tour"><strong>如何旅行</strong></a>
  <a href="#pay"><strong>付款方式</strong></a>
  <a href="#remark"><strong>评价</strong></a>
  <a href="#retire"><strong>更改和取消</strong></a>
  <a href="#safe"><strong>安全</strong></a>
  <a href="#perfrom"><strong>提供反馈</strong></a>
  <a href="#contact"><strong>联系我们</strong></a>
  </div>
  
  </div>
  <div class="col-md-6">
  
  <div id="use">
  <h1>如何使用SSHOME</h1>
  <div class="fontstyle">
  <div class="page">
  <h3>建立在分享上的社区</h3>
  <p>当时，两位拥有闲置空间的设计师接待了三位正在寻找住处的旅行者。如今，数百万的房东和旅行者选择免费注册SSHOME帐号，以发布自己的空间及预订世界各地的独特房源。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>可信赖的服务</h3>
  <p>SSHOME让分享变得简单、愉快、安全。我们验证用户的个人资料和房源信息，为房东和房客提供一个智能消息系统，让他们可以放心沟通，同时我们还提供一个值得信赖的收款和转款平台。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>24小时全天候客服</h3>
  <p>无论您是旅行还是出租，我们都会自始至终常伴您左右。大部分关于SSHOME的常见问题都可以在我们的帮助中心找到答。</p>
  </div>
  </div>
  </div>
  
  <div class="blank">
  </div>
  
  <div id="tour">
  <h1>如何旅行</h1>
  <div class="fontstyle">
  <div class="page">
  <h3>搜索</h3>
  <p>SSHOME房东在全球190多个国家34,000个城市分享他们的空间，为您带来无限可能。您只要在搜索栏输入您的目的地和旅行日期，即可在世界任何角落发掘与众不同的房源，并通过心愿单来保存、分享您最喜爱的SSHome房源。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>预定</h3>
  <p>SSHOME是一种全新的经营模式，预订住宿的方式有好几种。有些房东喜欢在确认预订前先了解一下房客，有些则喜欢采用"闪订"的方法来节省管理预订的时间。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>旅行</h3>
  <p>一旦确定好要去哪里，住在何处，您要做的就是出发！</p>
  </div>
  </div>
  </div>
  
   <div class="blank">
  </div>
  
  <div id="pay">
  <h1>SSHOME接受的付款方式</h1>
  <div class="fontstyle">
  <div class="page">
  <h3>付款方式</h3>
  <p>我们支持多种付款方式，具体哪种取决于您的付款账号所在的国家。</p>

<p>提交预订申请之前，您会在结账页面看到有哪些可用的付款方式。所有的付款详情会在您选择国家之后显示。</p>

<p>在站外付款或者现金付款都有悖我们的服务条款，可能会导致您的帐号从SSHOME站上被移除。由于在SSHOME网站之外付款会加大我们保护您的信息的难度，同时也会让您面临更大的欺诈和其他安全问题风险，所以我们禁止在站外付款。</p>

<p>可选付款方式可能包括以下各项：</p>

<p>主要的信用卡和预付费信用卡（维萨卡、万事达卡、美国运通卡、发现卡、JCB日财卡）</p>
<p>很多可以用作信用卡的借记卡</p>
<p>一些国家可以使用PayPal</p>
<p>支付宝（仅限中国）</p>
<p>Postepay（仅限意大利）</p>
  </div>
  </div>
  </div>
  
  <div class="blank">
  </div>
  
  <div id="remark">
  <h1>评价是如何运作的？</h1>
  <div class="page">
  <p>SSHOME上的所有评价均由爱彼迎房东和旅行者所撰写。因此，您看到的评价都是基于房客在房东房源内完成的某次住宿。</p>

<p>退房后您有14天的时间为旅程撰写评价。</p>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>撰写评价</h3>
  <p>要为您最近的一次旅程发表评价，请前往您的评价。评价字数不能超过500字，且必须遵守爱彼迎的评价准则。除非您的房东或房客已完成评价的撰写，否则您可以在48小时内对您写的评价进行编辑。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>评价记录</h3>
  <p>要查看您写的评价或者别人对您的评价，请前往您的评价。您还能在那里看到其他人给您留下的个人反馈。</p>

<p>我们的社区依赖于真诚透明的评价。如果发现有评价违反了我们的评价准则，我们将会删除或更改该评价。</p>
  </div>
  </div>
  </div>
  
  <div class="blank">
  </div>
  
  <div id="safe">
  <h1>安全</h1>
  <div class="fontstyle">
  <div class="page">
  <h3>房客</h3>
  <p>如果您在旅行时遇到紧急情况，或者您的人身安全受到威胁，请立即联系当地警方或紧急服务部门。</p>

<p>如果您需要爱彼迎帮助解决安全问题，请联系我们的信任与安全团队。</p>

<p>开始您的旅程之前，请务必阅读我们的安全建议，它们将能帮助您放心地旅行。</p>
  </div>
  </div>
  <div class="fontstyle">
  <div class="page">
  <h3>房东</h3>
  <p>如果发生受保障房源遭受房客破坏的罕有情况，且破坏超出了押金的金额，或者如果房东没有设置押金，SSHOME房东保障金计划将为房东提供高达一百万美元的保障。</p>

<p>房东保障金计划的保障范围不包括现金和证券、收藏品、珍稀艺术品、珠宝、宠物或个人负债。我们建议房东出租房子时将贵重物品锁好或移走。此计划也不保日久损耗对房源造成的损失或损坏。</p>

<p>房东保障金计划并非保险，且不能取代您的房主保险或租客保险。请务必仔细阅读并了解您的保险单条款及保障范围。并非所有保险都保障租住您房屋的房客对房屋造成的损坏或损失。如果SSHome裁定房客为过错方，提交房东保障金申请并不妨碍房客需要为房东申请赔付的破坏损失承担经济责任。</p>
  </div>
  </div>
  </div>
  
    <div class="blank">
  </div>
  
  <div id="perfrom">
  <h1>我们表现如何</h1>
  <div class="fontstyle">
  <div class="page">
  <p>我们想了解您喜欢哪些方面，以及您认为我们可以在哪些方面做得更好。我们将无法逐条回复反馈。</p>

<p>如果您有疑问或需要我们帮助您解决问题，请搜索帮助中心。</p>
  </div>
  </div> 
  </div>
  
  <div class="blank">
  </div>
  
  <div id="contact">
  <div class="fontstyle">
  <div class="page">
  <h3>立刻获取答案</h3>
  <p>如果您有问题，最快获得答案的途径就是使用我们的帮助中心。有关SSHOME帐号、预订或是取消预订等所有的信息都可在里面找到。</p>
  </div>
  </div> 
  </div>
  
  <div class="blank">
  </div>
  
  <div id="retire">
  <h1>SSHOME退订政策</h1>
  <div class="fontstyle">
  <div class="page">
  <p>SSHOME允许房东在三种标准的退订政策（灵活、中等和严格）之间进行选择。我们执行这些政策是为了保障房客和房东双方的利益。长期住宿退订政策会自动适用于28晚或更长时间的预订。</p>

<p>房东的退订政策可以在其房源页面的预订取消部分找到。房客预订房源时必须同意房东的退订政策。</p>


<p>要取消预订并查看相应处罚，您可以前往旅程，然后点击相应预订的”更改或取消”。</p>
  </div>
  </div> 
  </div>
  
  </div>
  <div class="col-md-2"></div>
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
