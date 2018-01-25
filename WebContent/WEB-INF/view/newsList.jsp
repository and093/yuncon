<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page isELIgnored="false"%>
<%
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        
        String contextPath = request.getContextPath();
        pageContext.setAttribute("contextPath", contextPath);
%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<!--<![endif]-->
 
<head>
    <meta charset="utf-8">
    <title>广州云中科技 | 网络安全解决方案</title>
    <meta name="description" content="广州云中科技有限公司（简称：云中科技）是一家专注于网络安全以及互联网相关领域，致力于为中国企业提供全面网络安全解决方案，是国内互联网行业新秀领航企业之一">
    <meta name="keywords" content="广州云中科技有限公司，云中科技有限公司，广州云中，云中科技，云中，网络安全，虚拟化安全，邮件网关，解决方案" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="${contextPath}/icon.png" />
    
    <link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/css/animate.css">
    <link rel="stylesheet" href="${contextPath}/css/main.css">
    <link rel="stylesheet" href="${contextPath}/css/responsive.css">
    <script src="${contextPath}/js/vendor/modernizr-2.6.2.min.js"></script>
    <style type="text/css">
        html,body{margin:0;padding:0;}
        .iw_poi_title {color:#CC5522;font-size:14px;font-weight:bold;overflow:hidden;padding-right:13px;white-space:nowrap}
        .iw_poi_content {font:12px arial,sans-serif;overflow:visible;padding-top:4px;white-space:-moz-pre-wrap;word-wrap:break-word}
    </style>
    <script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>
    
</head>

<body id="top">
    <!--[if lt IE 7]>
        <p class="browsehappy">您正在使用 <strong>过时的</strong>浏览器。请更新你的浏览器以便获得更好的浏览体验。</p>
    <![endif]-->

    <header>
        <!-- NAVIGATION -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- LOGO -->
                    <a class="navbar-brand page-scroll" href="#">
                        <img src="${contextPath}/img/logo.png" alt="">
                    </a>
                    <!-- END LOGO -->
                </div>

                <!-- TOGGLE NAV -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li><a class="page-scroll" href="${contextPath}/index.html#top">首页</a>
                        </li>
                        <li><a class="page-scroll" href="${contextPath}/index.html#services">解决方案</a>
                        </li>
                        <li><a class="page-scroll" href="${contextPath}/index.html#portfolio">专家团队</a>
                        </li>
                        <li class="active"><a class="page-scroll" href="${contextPath}/news/page/1">业界瞭望</a>
                        </li>
                        <li><a class="page-scroll" href="${contextPath}/index.html#contact">关于我们</a>
                        </li>
                    </ul>
                </div>
                <!-- TOGGLE NAV -->

            </div>
            <!-- /.container -->
        </nav>
        <!-- END NAVIGATION -->
    </header>

    <section class="article"> 
        <div class="container" style="margin-bottom:20px;">
            <div class="row wow fadeInRight" style="min-height:500px;">
                <c:forEach var="aaa" items="${newsBean.page.content}">
				   <div class="col-md-6 col-sm-6">    
	                    <article class="media">
	                      <div class="media-body b-btm text-left">
	                        <a href="${contextPath}/news/info/${aaa.id}">${aaa.title}</a>
	                        <p style="color:#999999;margin-top:5px;">${aaa.vabstract}...</p>
	                      </div>
	                    </article>
	                </div>
				</c:forEach>
            </div>
            <div class="row text-center">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				    <c:choose>
	                    <c:when test="${newsBean.page.first != true}">
	                        <li>
		                      <a href="${contextPath}/news/page/1">首页</a>
		                    </li>
		                    <li>
		                      <a href="${contextPath}/news/page/${pagenum-1}">上一页</a>
		                    </li>
	                    </c:when>
	                    <c:otherwise>
	                        <li class="disabled">
                              <a href="javascript:void(0);">首页</a>
                            </li>
                            <li class="disabled">
                              <a href="javascript:void(0);">上一页</a>
                            </li>
	                    </c:otherwise>
	                </c:choose>
				    
				    <c:choose>
                        <c:when test="${newsBean.page.totalPages <= 7}">
                            <c:var="x" begin="1" end="${newsBean.page.totalPages}" step="1">
                                <li <c:if test="${x == pagenum}">class="active"</c:if>><a href="${contextPath}/news/page/${x}">${x}</a></li>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <c:choose>
		                        <c:when test="${pagenum <= 3}">
		                            <c:var="x" begin="1" end="6" step="1">
		                                <li <c:if test="${x == pagenum}">class="active"</c:if>><a href="${contextPath}/news/page/${x}">${x}</a></li>
		                            </c:forEach>
		                        </c:when>
		                        <c:when test="${pagenum >= newsBean.page.totalPages - 3}">
		                            <c:var="x" begin="${pagenum - 7}" end="${newsBean.page.totalPages}" step="1">
                                        <li <c:if test="${x == pagenum}">class="active"</c:if>><a href="${contextPath}/news/page/${x}">${x}</a></li>
                                    </c:forEach>
		                        </c:when>
		                        <c:otherwise>
		                            <c:var="x" begin="${newsBean.page.totalPages - 3}" end="${newsBean.page.totalPages + 3}" step="1">
                                        <li <c:if test="${x == pagenum}">class="active"</c:if>><a href="${contextPath}/news/page/${x}">${x}</a></li>
                                    </c:forEach>
		                        </c:otherwise>
		                    </c:choose>  
                        </c:otherwise>
                    </c:choose>   
				    
				    <c:choose>
                        <c:when test="${newsBean.page.first != true}">
                            <li>
		                      <a href="${contextPath}/news/page/${pagenum+1}">下一页</a>
		                    </li>
		                    <li>
		                      <a href="${contextPath}/news/page/${newsBean.page.totalPages}">末页</a>
		                    </li>
                        </c:when>
                        <c:otherwise>
                            <li class="disabled">
                              <a href="javascript:void(0);">下一页</a>
                            </li>
                            <li class="disabled">
                              <a href="javascript:void(0);">末页</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
				  </ul>
				</nav>
				
            </div>
        </div>
    </section>
    <!-- END SERVICES -->

    <!-- FOOTER -->
    <footer  style="background: #34495E">
        <div class="container">
            <div class="row">

                <!-- FOOTER MENU -->
                <div class="col-md-6">
                    <div class="footer-menu">
                        <ul class="list-inline">
                            <li><a href="${contextPath}/index.html#top">首页</a>
                            </li>
                            <li><a href="${contextPath}/index.html#services">解决方案</a>
                            </li>
                            <li><a href="${contextPath}/index.html#portfolio">专家团队</a>
                            </li>
                            <li><a href="${contextPath}/news/page/1">业界瞭望</a>
                            </li>
                            <li><a href="${contextPath}/index.html#contact">关于我们</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- END FOOTER MENU -->

                <!-- FOOTER CONTENT -->
                <div class="col-md-6">
                    <div class="footer-content text-right">
                        <p  style="color: #A8A8A8;">版权信息 © 2016-2018广州云中科技有限公司版权所有
                        </p>
                    </div>
                </div>
                <!-- END FOOTER CONTENT -->

            </div>
            <!-- /.row -->
        </div>
        <!-- ./container -->
    </footer>
    <!-- END FOOTER -->
    
    <!-- js files -->
    <script src="${contextPath}/js/vendor/jquery-1.10.2.min.js"></script>
    <script src="${contextPath}/js/plugins.js"></script>
    <script src="${contextPath}/js/bootstrap.min.js"></script>
    <script src="${contextPath}/js/wow.min.js"></script>
    <script src="${contextPath}/js/main.js"></script>
    
</body>
