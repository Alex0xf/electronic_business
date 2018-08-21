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
    <title>一类产品页面</title>
    <link rel="stylesheet" href="/layui/css/layui.css" >
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
              <%--  <%@include file="../common/table_first_product.jsp"%>--%>
                </table>
                <!--分页-->
                <div id="pageDemo">  </div>
            </div>
    <!-- 底部固定区域 -->
    <%@include file="../common/footer.jsp"%>
</div>
<script src="/layui/js/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use(['layer', 'form', 'element','table','laypage'], function(){
        var layer = layui.layer
            ,form = layui.form//只有执行了这一步，部分表单元素才会自动修饰成功
            ,element = layui.element
            ,table=layui.table
            ,laypage=layui.laypage
            , $ = layui.$;            //使用jQuery;

        //JavaScript代码区域

        form.render();//表单

        //分页
        laypage.render({
            elem: 'pageDemo' //分页容器的id
            ,count: 12 //总页数
            ,skin: '#1E9FFF' //自定义选中色值
            ,skip: true //开启跳页
            ,limit:5
            ,limits:[5, 10, 20, 30]
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
            ,jump: function(obj, first){
                console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                console.log(obj.limit); //得到每页显示的条数
                if(!first){
                    layer.msg('第'+ obj.curr +'页');
                }
                //$.get("goods/first_product_table",{page:"jumpPage",pageNum:obj.curr,pageSize:obj.limit},function(data){
                $.get("goods/first_product_table",{pageNum:obj.curr,pageSize:obj.limit},function(data){

                },"html");
            }
        });

        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 400
           // ,url: 'goods/first_product_list' //数据接口
            ,url: 'goods/first_product_table' //数据接口
            ,page:laypage //开启分页
            ,limit:5
            ,limits:[5, 10, 20, 30]
            ,cols: [[ //表头
                {field: 'id', title: '存货档案编码', width:150, sort: true, fixed: 'left'}
                ,{field: 'typeName', title: '基础库-分类', width:150}
                ,{field: 'type', title: '基础库-品牌', width:150, sort: true}
                ,{field: 'color', title: '基础库-颜色', width: 150}
               /* ,{field: 'brandId', title: '品牌id', width: 170}*/
            ]]
            ,request: {
                pageName: 'pageNum' //页码的参数名称，默认：page
                ,limitName: 'pageSize' //每页数据量的参数名，默认：limit
            }
        });




    });
    </script>
    </div>
</body>
</html>