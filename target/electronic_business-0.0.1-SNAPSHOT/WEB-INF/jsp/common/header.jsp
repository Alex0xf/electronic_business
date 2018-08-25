<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/8/19
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-header">
    <div class="layui-logo">电子商务进销存系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
        <li class="layui-nav-item"><a href="">商品与赠品管理</a>
            <dl class="layui-nav-child">
                <dd><a href="javascript:void (0);" onclick= "changeLeftSideToGoods();">商品管理</a></dd>
                <dd><a href="javascript:void (0);" onclick= "changeLeftSideToGifts();">赠品管理</a></dd>
                <dd><a href="javascript:void (0);" >活动商品管理</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">B2C销售管理</a></li>
        <li class="layui-nav-item"><a href="">售后管理</a></li>
        <li class="layui-nav-item">
            <a href="javascript:void (0);"onclick= "jumpToUserPage();">系统管理</a>
            <dl class="layui-nav-child">
                <dd><a href="javascript:void (0);">用户管理</a></dd>
                <dd><a href="javascript:void (0);">角色管理</a></dd>
                <dd><a href="javascript:void (0);">权限管理</a></dd>
                <dd><a href="javascript:void (0);">IP访问限制管理</a></dd>
                <dd><a href="javascript:void (0);">日志查询</a></dd>
            </dl>
        </li>
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
