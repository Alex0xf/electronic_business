<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 2018/8/16
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    int i = 0;
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>首页</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">电子商务进销存系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">商品与赠品管理</a>
                <dl class="layui-nav-child">
                    <dd><a href="">商品管理</a></dd>
                    <dd><a href="">赠品管理</a></dd>
                    <dd><a href="">活动商品管理</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">B2C销售管理</a></li>
            <li class="layui-nav-item"><a href="">售后管理</a></li>
            <li class="layui-nav-item"><a href="">系统管理</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    Alex
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">产品查询</a>

                <li class="layui-nav-item">
                    <a href="javascript:;">商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">查询商品</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">商品品牌管理</a></li>
                <li class="layui-nav-item"><a href="">商品类型管理</a></li>
                <li class="layui-nav-item"><a href="">价格调整管理</a></li>
                <li class="layui-nav-item"><a href="">价格调整审核</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <div style="padding: 15px;">

            <!-- 内容主体区域 -->
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>电子商务平台进销存系统</legend>
            </fieldset>
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                  <%-- <a href="">商品与赠品管理</a>
                   <a href="">商品管理</a>
                   <a><cite>产品查询</cite></a>--%>
                  <a><cite>首页</cite></a>
                </span>
            </blockquote>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © - 中国电信 天翼终端电子商务平台进销存系统 2011
    </div>
</div>
<script src="/layui/js/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });


</script>
</body>
</html>