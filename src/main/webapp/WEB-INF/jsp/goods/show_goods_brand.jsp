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
    <title>商品品牌页面</title>
    <link rel="stylesheet" href="/layui/css/layui.css" >
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <!--头部文件-->
    <%@include file="../common/header.jsp"%>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <div id="ajax_left_side">
    <%@include file="../common/left_side_goods.jsp"%>
    </div>

    <!-- 内容主体区域 -->
    <div class="layui-body">
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>商品与赠品管理系统</legend>
            </fieldset>

            <!--ajax刷新的部分-->
            <div id="ajax_replace" >
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                  <a href="">商品与赠品管理</a>
                  <a href="">商品管理</a>
                  <a><cite>商品品牌列表</cite></a>
                </span>
            </blockquote>

            <!--表格-->
                <div id="my_goods_brand_table">
                    <table class="layui-table" id="goods_brand" lay-filter="test">
                        <colgroup>
                            <col width="150">
                            <col width="200">
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>品牌id</th>
                            <th>品牌名称</th>
                            <th>品牌官网</th>
                            <th>品牌描述</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody id="my_goods_brand_tbody"></tbody>
                    </table>
                <!--分页-->
                   <div id="page_goods_brand">  </div>
            </div>

            </div>
            <!-- 底部固定区域 -->
            <%@include file="../common/footer.jsp"%>
        </div>
    </div>
    <script src="/layui/layui.js"></script>
    <script src="/js/goods.js"></script>
    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.form.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>

    <script type="text/javascript">
        layui.use(['layer', 'form', 'element', 'table', 'laypage'], function () {
            var layer = layui.layer
                , form = layui.form
                , element = layui.element
                , table = layui.table
                , laypage = layui.laypage
                , $ = layui.$;            //使用jQuery;
            form.render();//表单
        });

        $(function () {
            //页面一开始就加载表格
            loadAllGoodsBrand();
        });

        function loadAllGoodsBrand() {
            layui.use('laypage', function () {
                var laypage = layui.laypage;
                var url = "goods/goods_brand_list";
                var config = {page: 1, pageSize: 3};//配置初始值
                //分页
                $.getJSON(url, config, function (res) {
                    laypage.render({
                        elem: 'page_goods_brand',
                        count: res.total, //总条数
                        limit: config.pageSize, //每页条数
                        limits: [3, 5, 10],
                        layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],
                        jump: function (obj, first) {//跳页触发
                            if (!first) { //首次则不进入
                                config.page = obj.curr;
                                config.pageSize = obj.limit;
                                layer.msg('第'+ obj.curr +'页');
                                getGoodsBrandListByPage(url, config);
                            }
                        }
                    });
                    parseGoodsBrandList(res, config.page);
                });
            });
        }

        //点击页数从后台获取数据
        function getGoodsBrandListByPage(url, config) {
            $.getJSON(url, config, function (res) {
                parseGoodsBrandList(res, config.page);
            });
        }

        //解析数据，currPage参数为预留参数，当删除一行刷新列表时，可以记住当前页而不至于显示到首页去
        function parseGoodsBrandList(res, currPage) {
            var content = "";
            $.each(res.rows, function (i, o) {
                var obj=JSON.stringify(o);
                content += "<tr>";
                content += "<td>" + o.id + "</td>";
                content += "<td>"+ o.brandName +"</td>";
                content += "<td>" + o.brandAddress + "</td>";
                content += "<td>" + o.brandDescribe + "</td>";
                content += "<td><button class='layui-btn'>修改</button>" +
                    "<button class='layui-btn'>删除</button>";
                content += "</tr>";
            });
            $('#my_goods_brand_tbody').html(content);
        }

    </script>
</body>
</html>