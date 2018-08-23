<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/8/19
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">

        <ul class="layui-nav layui-nav-tree" lay-filter="test">
            <li class="layui-nav-item layui-nav-itemed">
                <a class="" href="javascript:void (0);" onclick="loadAllProduct();">产品查询</a>

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