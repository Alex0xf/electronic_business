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
    <title>一类产品页面</title>
    <link rel="stylesheet" href="/layui/css/layui.css" >
    <link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <!--头部文件-->
    <%@include file="../common/header.jsp"%>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <%@include file="../common/left_side_goods.jsp"%>

    <!-- 内容主体区域 -->
    <div class="layui-body">
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>商品与赠品管理系统</legend>
            </fieldset>

            <!--ajax刷新的部分-->
          <div id="ajax_replace">
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                  <a href="">商品与赠品管理</a>
                  <a href="">商品管理</a>
                  <a><cite>产品查询&选择一类产品</cite></a>
                </span>
            </blockquote>

            <!--表格-->
           <%-- <table class="layui-hide" id="test" lay-filter="demo"></table>--%>
            <div id="my_first_product_table">
                <table class="layui-table" id="demo" lay-filter="test">
                    <colgroup>
                        <col width="150">
                        <col width="200">
                        <col>
                    </colgroup>
                    <thead>
                    <tr>
                        <th>存货档案编码</th>
                        <th>基础库-分类</th>
                        <th>基础库-品牌</th>
                        <th>基础库-型号</th>
                        <th>基础库-颜色</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody id="my_tbody"></tbody>
                </table>
                <!--分页-->
                <div id="page1">  </div>
            </div>
       </div>

    <!-- 底部固定区域 -->
    <%@include file="../common/footer.jsp"%>
</div>
    </div>
    <script src="/layui/js/layui.js"></script>
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
            layer.msg('欢迎您');
            form.render();//表单
        });

        $(function () {
            //页面一开始就加载表格
            loadAllProduct();
        });

        function loadAllProduct() {
            layui.use('laypage', function () {
                var laypage = layui.laypage;
                var url = "goods/first_product_list";
                var config = {page: 1, pageSize: 5};//配置初始值
                //分页
                $.getJSON(url, config, function (res) {
                    laypage.render({
                        elem: 'page1',
                        count: res.total, //总条数
                        limit: config.pageSize, //每页条数
                        limits: [5, 10, 20],
                        layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],
                        jump: function (obj, first) {//跳页触发
                            if (!first) { //首次则不进入
                                config.page = obj.curr;
                                config.pageSize = obj.limit;
                                layer.msg('第'+ obj.curr +'页');
                                getProductListByPage(url, config);
                            }
                        }
                    });
                    parseProductList(res, config.page);
                });
            });
        }

        //点击页数从后台获取数据
        function getProductListByPage(url, config) {
            $.getJSON(url, config, function (res) {
                parseProductList(res, config.page);
            });
        }

        //解析数据，currPage参数为预留参数，当删除一行刷新列表时，可以记住当前页而不至于显示到首页去
        function parseProductList(res, currPage) {
            var content = "";
            $.each(res.rows, function (i, o) {
                var obj=JSON.stringify(o);
                content += "<tr>";
                content += "<td>" + o.id + "</td>";
                content += "<td>"+ o.typeName +"</td>";
                content += "<td>" + o.goodsBrand.brandName + "</td>";
                content += "<td>" + o.type + "</td>";
                content += "<td>" + o.color + "</td>";
                content += "<td><button class='layui-btn' onclick='creatFirstGoodsByProduct("+obj+")'>创建一类产品</button>";
                content += "</tr>";
            });
            $('#my_tbody').html(content);
        }

        //点击创建一类商品时触发
        function creatFirstGoodsByProduct(obj){
           /* layer.msg(obj.id+"--"+obj.typeName);//获得含当前行所有信息的对象*/
            var product=JSON.stringify(obj);
            $.post('goods/creat_first_goods',{"product":product}, function(data) {
                $('#ajax_replace').html(data);
                },"html")

        }
        /*
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if(layEvent === 'createFirstGoods'){ //创建一类商品

            } /!*else if(layEvent === 'del'){ //删除
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){ //编辑
                //do something

                //同步更新缓存对应的值
                obj.update({
                    username: '123'
                    ,title: 'xxx'
                });
            }*!/
        });
    });*/
    </script>
</body>
</html>