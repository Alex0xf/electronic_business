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
    <!--头部文件-->
    <%@include file="WEB-INF/jsp/common/header.jsp"%>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <%@include file="WEB-INF/jsp/common/left_side_goods.jsp"%>

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
    <!-- 底部固定区域 -->
    <%@include file="WEB-INF/jsp/common/footer.jsp"%>

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