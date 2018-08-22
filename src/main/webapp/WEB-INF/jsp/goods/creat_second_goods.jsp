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
    <title>创建二类商品页面</title>
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
                <legend>商品与赠品管理</legend>
            </fieldset>
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                  <a href="">商品与赠品管理</a>
                  <a href="">商品管理</a>
                  <a><cite>创建二类商品</cite></a>
                </span>
            </blockquote>

            <!-- 创建一二类商品表单 -->
            <div class="layui-col-md6">
                <div class="layui-card">
                    <form class="layui-form">

                        <div class="layui-form-item">
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品品牌</label>
                                <div class="layui-input-block">
                                    <select name="interest" lay-filter="aihao">
                                        <option value="0">apple</option>
                                        <option value="1">sumsang</option>
                                        <option value="2">OPPO</option>
                                        <option value="3">coolpad</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">商品型号</label>
                                <div class="layui-input-block">
                                    <input type="text" name="title" required lay-verify="required"
                                           placeholder="请填写" autocomplete="off" class="layui-input">
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">商品颜色</label>
                                <div class="layui-input-block">
                                    <select name="interest" lay-filter="aihao">
                                        <option value="0">白</option>
                                        <option value="1">黑</option>
                                        <option value="2">金</option>
                                        <option value="3">紫</option>
                                    </select>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">商品名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="title" required lay-verify="required"
                                           placeholder="请填写" autocomplete="off" class="layui-input">
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">类别</label>
                                <div class="layui-input-block">
                                    <select name="interest" lay-filter="aihao">
                                        <option value="0">手机配件</option>
                                        <option value="1">手机配饰</option>
                                    </select>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">市场价</label>
                                <div class="layui-input-block">
                                    <input type="text" name="title" required lay-verify="required"
                                           placeholder="请填写" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商城价</label>
                                <div class="layui-input-block">
                                    <input type="text" name="title" required lay-verify="required"
                                           placeholder="请填写" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">最低库存</label>
                                <div class="layui-input-block">
                                    <input type="text" name="title" required lay-verify="required"
                                           placeholder="请填写" autocomplete="off" class="layui-input">
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">是否可采购</label>
                                <div class="layui-input-block">
                                    <select name="interest" lay-filter="aihao">
                                        <option value="0">可采购</option>
                                        <option value="1">不可采购</option>
                                    </select>
                                </div>
                            </div>


                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="*">立即提交</button>
                            </div>
                       </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- 底部固定区域 -->
    <%@include file="../common/footer.jsp"%>

</div>
<script src="/layui/js/layui.js"></script>
<script>
    //把需要用到的模块先加载
    layui.use(['layer', 'form', 'element'], function(){
        var layer = layui.layer
            ,form = layui.form//只有执行了这一步，部分表单元素才会自动修饰成功
            ,element = layui.element;
        //JavaScript代码区域

        form.render();//动态生成的表单还需
    });

</script>
</body>
</html>