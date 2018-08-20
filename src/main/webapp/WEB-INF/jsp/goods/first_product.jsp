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
    <link rel="stylesheet" href="/layui/css/layui.css">
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
            <table class="layui-hide" id="test" lay-filter="demo"></table>

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
            ,laypage=layui.laypage;
        //JavaScript代码区域

       /* form.render();//动态生成的表单还需这个*/
        //执行一个 table 实例
        table.render({
            elem: '#test'
            ,height: 332
            //,url: '/demo/table/user/' //数据接口
           // ,url: 'http://localhost:8080/goods/first_product_list' //数据接口
            ,url: 'http://192.168.14.252:8080/goods/first_product_list' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: '存货档案编码', width:80, sort: true, fixed: 'left'}
                ,{field: 'typeName', title: '基础库-分类', width:80}
                ,{field: 'type', title: '基础库-品牌', width:80, sort: true}
                ,{field: 'color', title: '基础库-颜色', width: 170}
               /* ,{field: 'brandId', title: '品牌id', width: 170}*/

            ]]
        });
        //分页
        laypage.render({
            elem: 'pageDemo' //分页容器的id
            ,count: 12 //总页数
            ,skin: '#1E9FFF' //自定义选中色值
            //,skip: true //开启跳页
            ,jump: function(obj, first){
                if(!first){
                    layer.msg('第'+ obj.curr +'页');
                }
            }
        });

    });
</script>
</body>
</html>



<%--<div>
               <table class="layui-table">
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
                   <tbody>
                   <c:forEach items="${productsList}" var="product">
                       <tr>

                           <td>${product.id }</td>
                           <td>${product.typeName }</td>
                           <td>
                               <c:if test="${product.bid== 1}">apple</c:if>
                               <c:if test="${product.bid== 2}">sumsang</c:if>
                               <c:if test="${product.bid== 3}">coolpad</c:if>
                               <c:if test="${product.bid== 4}">LG</c:if>
                               <c:if test="${product.bid== 5}">nokia</c:if>
                               <c:if test="${product.bid== 6}">motorola</c:if>
                               <c:if test="${product.bid== 7}">huawei</c:if>
                               <c:if test="${product.bid== 8}">philips</c:if>
                               <c:if test="${product.bid== 9}">OPPO</c:if>
                           </td>

                           <td>${product.type }</td>
                           <td>${product.color }</td>
                           <td>
                               <button class="layui-btn">创建一类商品</button>
                           </td>
                       </tr>
                   </c:forEach>
                   </tbody>
               </table>--%>
<!--分页 待完成-->
<%-- <div id="demo7">
     <div class="layui-box layui-laypage layui-laypage-default" id="layui-laypage-10">
         <span class="layui-laypage-count">共 13 条</span>
         <a href="javascript:;" class="layui-laypage-prev layui-disabled" data-page="0">上一页</a>
         <span class="layui-laypage-curr"><em class="layui-laypage-em"></em><em>1</em></span>
         <a href="javascript:;" data-page="2">2</a>
         <a href="javascript:;" data-page="3">3</a>
         <a href="javascript:;" data-page="4">4</a>
         <a href="javascript:;" data-page="5">5</a>
         <span class="layui-laypage-spr">…</span>
         <a href="javascript:;" class="layui-laypage-last" title="尾页" data-page="10">10</a>
         <a href="javascript:;" class="layui-laypage-next" data-page="2">下一页</a>
         <span class="layui-laypage-limits"><select lay-ignore="">
         <option value="5" selected="">5 条/页</option><option value="10">10 条/页</option>
         <option value="20">20 条/页</option><option value="30">30 条/页
     </select></span><a href="javascript:;" data-page="1" class="layui-laypage-refresh">
         <i class="layui-icon layui-icon-refresh"></i>
     </a><span class="layui-laypage-skip">到第<input type="text" min="1" value="1" class="layui-input">页
     <button type="button" class="layui-laypage-btn">确定</button></span>
     </div>
 </div>
</div>
</div>--%>