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
    <div id="ajax_left_side">
    <%@include file="WEB-INF/jsp/common/left_side_goods.jsp"%>
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
                  <a><cite>首页</cite></a>
                </span>
            </blockquote>
        </div>
    </div>
    <!-- 底部固定区域 -->
    <%@include file="WEB-INF/jsp/common/footer.jsp"%>

</div>

<script src="/layui/js/layui.js"></script>
<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="js/jquery.form.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>

<script type="text/javascript">
    //JavaScript代码区域
    layui.use(['layer', 'form', 'element', 'table', 'laypage'], function () {
        var layer = layui.layer
            , form = layui.form
            , element = layui.element
            , table = layui.table
            , laypage = layui.laypage
            , $ = layui.$;            //使用jQuery;

        layer.msg('欢迎您');
    });
</script>
<script src="js/goods.js" type="text/javascript"></script>
</body>
</html>