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
    <title>出错页面</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <!--头部文件-->
    <%@include file="header.jsp"%>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <%@include file="left_side_goods.jsp"%>

    <!-- 内容主体区域 -->
    <div class="layui-body" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show"><div class="layui-fluid">
            <div class="layadmin-tips">
                <i class="layui-icon" face="" style="font-size: 300px; color: #009688;margin-left: 38%;"></i>

                <div class="layui-text" style="font-size: 20px;align-content: center"margin-left: 38%;>
                    好像出错了呢
                </div>

            </div>
        </div></div>
    </div>

    <!-- 底部固定区域 -->
    <%@include file="footer.jsp"%>

</div>
<script src="/layui/js/layui.js"></script>
<script src="/js/goods.js"></script>
<script>
    //把需要用到的模块先加载
    layui.use(['layer', 'form', 'element'], function(){
        var layer = layui.layer
            ,form = layui.form//只有执行了这一步，部分表单元素才会自动修饰成功
            ,element = layui.element;
        //JavaScript代码区域

    });

</script>
</body>
</html>

