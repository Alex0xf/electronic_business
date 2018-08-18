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
    <div class="layui-header">
        <div class="layui-logo">电子商务进销存系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">商品与赠品管理</a>
                <dl class="layui-nav-child">
                    <dd><a href="">商品管理</a></dd>
                    <dd><a href="">赠品管理</a></dd>
                    <dd><a href="">活动商品管理</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">B2C销售管理</a></li>
            <li class="layui-nav-item"><a href="">xx管理</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    Alex
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">产品查询</a>

                <li class="layui-nav-item">
                    <a href="javascript:;">商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">查询商品</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">商品品牌管理</a></li>
                <li class="layui-nav-item"><a href="">商品类型管理</a></li>
                <li class="layui-nav-item"><a href="">价格调整管理</a></li>
                <li class="layui-nav-item"><a href="">价格调整审核</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <div style="padding: 15px;">
            <!-- 内容主体区域 -->
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

    <div class="layui-footer">
    <!-- 底部固定区域 -->
    © - 中国电信 天翼终端电子商务平台进销存系统 2011
</div>
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