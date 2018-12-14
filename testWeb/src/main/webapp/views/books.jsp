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
<script type="text/javascript" src="js/books.js"></script>
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
        <div id="wrapper" class="nav-secondary">
            <div class="fllist" style="display: block;">
                <div class="">
                    <h4 style="float: left;">按频道：</h4>
                    <ul class="fllist-span">
                        <li>全部</li>
                        <li>男频</li>
                        <li>女频</li>
                    </ul>
                </div>
                <div class="">
                    <h4 style="float: left;">按类型：</h4>
                    <ul class="fllist-span">
                        <li>全部</li>
                        <li>玄幻奇幻</li>
                        <li>仙侠武侠</li>
                        <li>历史军事</li>
                        <li>现代都市</li>
                        <li>游戏竞技</li>
                        <li>科幻末世</li>
                        <li>悬疑灵异</li>
                        <li>N次元</li>
                    </ul>
                </div>
                <div class="">
                    <h4 style="float: left;">按状态：</h4>
                    <ul class="fllist-span">
                        <li>全部</li>
                        <li>连载</li>
                        <li>完结</li>
                    </ul>
                </div>
                <div class="">
                    <h4 style="float: left;">按字数：</h4>
                    <ul class="fllist-span">
                        <li>全部</li>
                        <li>15万以下</li>
                        <li>15-50万</li>
                        <li>50-100万</li>
                        <li>100-200万</li>
                        <li>200万以上</li>
                    </ul>
                </div>
                <div class="">
                    <h4 style="float: left;">按时间：</h4>
                    <ul class="fllist-span">
                        <li>全部</li>
                        <li>2018年</li>
                        <li>2017年</li>
                        <li>2016年</li>
                        <li>2015年</li>
                        <li>2014年</li>
                        <li>很久以前</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="nav-secondary ad-books">
            <div id="ad_novels">
                <table>
                    <thead>
                        <tr>
                            <td>书名</td>
                            <td>类别</td>
                            <td>作者</td>
                            <td>字数</td>
                            <td>状态</td>
                            <td>更新时间</td>
                            <td>最新章节</td>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
</body>
</html>