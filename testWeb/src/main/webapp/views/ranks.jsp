<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 	
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/002.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/ranks.js"></script>
<title>宅宅小说推荐-小说排行榜-小说大全</title>
<link rel="shortcut icon" href="https://img3.doubanio.com/favicon.ico" type="image/x-icon">
</head>
<body>
	<div id="db-global-nav" class="global-nav">
            <div class="bd">
                
                <div class="top-nav-info">                  
                    <a href="/" class="nav-login">登录</a>
                    <a href="/" class="nav-register">注册</a>
                </div>
                <div class="global-nav-items">
                    <ul>
                        <li><a href="/" class="nav-login">欢迎来到宅宅社区！</a></li>
                        <li><a href="/" class="nav-login">网络小说</a></li>
                        <li><a href="/" class="nav-login">电子教程</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="db-nav-book" class="nav">
            <div class="nav-wrap">
                <div class="nav-primary">
                    <div class="nav-logo">
                        <a href="/">宅宅小说</a>
                    </div>
                    <div class="user-wrap">
                        <a href="/">我的书架</a>
                    </div>
                    <div class="nav-search">
                        <form action="/" method="get">
                            <fieldset>
                              <label for="inp-query">
                              </label>
                              <input id="inp-query" class="input-txt" name="search_text" size="22" maxlength="60" placeholder="书名、作者" 、>
                              <input type="submit" class="input-btn" />
                            </fieldset>
                        </form>
                    </div>
                    
                </div>
            </div>
            <div class="nav-secondary">  
                <div class="nav-items">
                    <ul>
                        <li class="selected"><a href="views/index.jsp" >小说首页</a>
                        </li>
                        <li><a href="views/books.jsp">分类书库</a>
                        </li>
                        <li><a href="views/ranks.jsp">排行榜</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
</body>
</html>