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
    <title>商品显示页面</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <!--头部文件-->
    <%@include file="../common/header.jsp" %>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <%@include file="../common/left_side_goods.jsp" %>

    <!-- 内容主体区域 -->
    <div class="layui-body">
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>商品与赠品管理系统</legend>
            </fieldset>
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                  <a href="">商品与赠品管理</a>
                  <a href="">商品管理</a>
                  <a><cite>商品信息列表</cite></a>
                </span>
            </blockquote>

            <!--表格-->
            <div>
                <table class="layui-table">
                    <colgroup>
                        <col width="150">
                        <col width="200">
                        <col>
                    </colgroup>
                    <thead>
                    <tr>
                        <th>商品id</th>
                        <th>商品名称</th>
                        <th>商品分类</th>
                        <th>商品品牌</th>
                        <th>商品型号</th>
                        <th>颜色</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${firstGoodsList}" var="fGoods">
                        <tr>

                            <td>${fGoods.id }</td>
                            <td>${fGoods.goodsName }</td>
                            <td>${fGoods.firstProduct.typeName}</td>
                            <td>${fGoods.firstProduct.type }</td>
                            <td>${fGoods.firstProduct.goodsBrand.brandName}</td>
                            <td>${fGoods.firstProduct.color}</td>
                            <td>
                                <div class="layui-btn-group">
                                    <button class="layui-btn">查看</button>
                                    <button class="layui-btn ">修改</button>
                                    <button class="layui-btn">删除</button>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <!--分页 待完成-->
                <div id="test"> </div>
            </div>
        </div>
    </div>
    <!-- 底部固定区域 -->
    <%@include file="../common/footer.jsp" %>

  <script src="/layui/js/layui.js"></script>
    <script>
    //JavaScript代码区域
    layui.use(['layer', 'form', 'element', 'laypage'], function () {
        var layer = layui.layer
            , form = layui.form//只有执行了这一步，部分表单元素才会自动修饰成功
            , element = layui.element
            , laypage = layui.laypage;
        //JavaScript代码区域

        form.render();//动态生成的表单还需这个
        //分页
        laypage.render({
            elem: 'test'
            , count: 3
            , limit: 5
            , limits: [5, 10, 20, 30]
            , skip: true //开启跳页
            , layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
            , jump: function (obj) {
                console.log(obj)
            }
        });

    });
    </script>
</div>
</body>
</html>