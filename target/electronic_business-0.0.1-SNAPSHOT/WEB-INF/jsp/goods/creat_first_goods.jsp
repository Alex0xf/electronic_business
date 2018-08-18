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
    <title>创建一类商品页面</title>
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
                  <a href="">选择一类产品</a>
                  <a><cite>创建一类商品</cite></a>
                </span>
            </blockquote>

            <!-- 创建一类商品表单 -->
            <div class="layui-col-md6">
                <div class="layui-card">
                    <form class="layui-form">

                        <div class="layui-form-item">
                            <label class="layui-form-label">档案编码</label>


                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-分类</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-品牌</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-型号</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-业务模式</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-颜色</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-采购模式</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-铺货</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-备机</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="00000等待获取" autocomplete="off" class="layui-input" readonly="readonly">
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
                            <label class="layui-form-label">商品类别</label>
                            <div class="layui-input-block">
                                <select name="interest" lay-filter="aihao">
                                    <option value="0">手机</option>
                                    <option value="1">配件</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">采购价</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
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
                            <label class="layui-form-label">最低库存量</label>
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
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });

</script>
</body>
</html>