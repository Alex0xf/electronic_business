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
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    int i=0;
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
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">产品查询</a>



                   <%-- <dl class="layui-nav-child">
                        <dd href="javascript:;">商品管理</dd>

                               &lt;%&ndash; <dd>产品查询</dd>
                                <dd>商品管理</dd>
                                <dd>商品品牌管理</dd>
                                <dd>商品类型管理</dd>
                                <dd>价格调整管理</dd>
                                <dd>价格调整审核</dd>&ndash;%&gt;

                        <dd><a href="javascript:;">赠品管理</a></dd>
                        <dd><a href="javascript:;">活动商品管理</a></dd>
                </dl>--%>
                <li class="layui-nav-item">
                    <a href="javascript:;">商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
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
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
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
                        <td>${product.classify }</td>
                        <td>${product.bid }</td>
                        <td>${product.type }</td>
                        <td>${product.color }</td>
                        <td><button class="layui-btn">创建一类商品</button></td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            <!--分页 待完成-->
            <div id="demo7">
                <div class="layui-box layui-laypage layui-laypage-default" id="layui-laypage-10">
                    <span class="layui-laypage-count">共 100 条</span>
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
                        <option value="10" selected="">10 条/页</option><option value="20">20 条/页</option>
                        <option value="30">30 条/页</option><option value="40">40 条/页</option><option value="50">50 条/页</option>
                    </select></span><a href="javascript:;" data-page="1" class="layui-laypage-refresh">
                    <i class="layui-icon layui-icon-refresh"></i>
                </a><span class="layui-laypage-skip">到第<input type="text" min="1" value="1" class="layui-input">页
                    <button type="button" class="layui-laypage-btn">确定</button></span>
                </div>
            </div>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        ©  - 底部固定区域
    </div>
</div>
<script src="/layui/js/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

    //分页
    laypage.render({
        elem: 'demo7'
        ,count: 100
        ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
        ,jump: function(obj){
            console.log(obj)
        }
    });

</script>
</body>
</html>