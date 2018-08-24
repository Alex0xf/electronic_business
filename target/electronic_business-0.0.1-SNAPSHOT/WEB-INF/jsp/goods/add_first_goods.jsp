<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css" >
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <%-- <span class="layui-breadcrumb">--%>
                   <a href="">商品与赠品管理</a>
                   <a href="">商品管理</a>
                   <a href="">选择一类产品</a>
                   <a><cite>创建一类商品</cite></a>
            </blockquote>
<div class="col-md-2"></div>
<div class="col-md-6">
            <!-- 创建一类商品表单 -->
<div class="ibox-content">
    <div class="table-responsive">

        <form action='goods/add_first_goods?jumpPage=add_first_goods_check' method="post"  >
            <div class="form-group">
                <label>档案编码</label>
                <input type="text" class="form-control" name="product_id" readonly="readonly" value="${product.id}">
            </div>
            <div class="form-group">
                <label>基础库-分类</label>
                <input type="text" class="form-control" name="product_typeName" readonly="readonly" AUTOCOMPLETE="off" value="${product.typeName}">
            </div>
            <div class="form-group">
                <label>基础库-品牌</label>
                <input type="text" class="form-control" name="product_goodsBrand_brandName" readonly="readonly"  AUTOCOMPLETE="off" value="${product.goodsBrand.brandName}">
            </div>
            <div class="form-group">
                <label>基础库-型号</label>
                <input type="text" class="form-control" name="product_type" readonly="readonly"  value="${product.type}">
            </div>

            <div class="form-group">
                <label>基础库-颜色</label>
                <input type="text" class="form-control" name="product_color" readonly="readonly" value="${product.color}">
            </div>
            <div class="form-group">
                <label>商品名称</label>
                <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                       placeholder="请填写"  required>
            </div>

            <div class="form-group">
                <label>商品类型id</label>
                <select class="form-control" name="goods_tid">
                    <option value="1" selected>1.3G手机 直板</option>
                    <option value="2">2.3G手机 翻盖</option>
                    <option value="3">3.3G上网卡 3G上网卡</option>
                    <option value="4">4.双网双待手机 直板</option>
                    <option value="5">5.3G手机 滑盖</option>
                    <option value="6">6.手机耳机 蓝牙耳机</option>
                    <option value="7">7.手机套 原装透明套</option>
                    <option value="8">8.手机电池 原装</option>
                    <option value="9">9.手机电池 国产</option>
                    <option value="10">10.手机存储卡 存储卡</option>
                    <option value="11">11.手机存储卡 读卡器</option>
                </select>
            </div>
            <div class="form-group">
                <label>采购价</label>
                <input type="text" class="form-control" name="buy_price" AUTOCOMPLETE="off" required
                       placeholder="请填写">
            </div>
            <div class="form-group">
                <label>市场价</label>
                <input type="text" class="form-control" name="market_price" AUTOCOMPLETE="off" required
                       placeholder="请填写">
            </div>
            <div class="form-group">
                <label>商城价</label>
                <input type="text" class="form-control" name="sales_price" AUTOCOMPLETE="off" required
                       placeholder="请填写">
            </div>
            <div class="form-group">
                <label>最低库存量</label>
                <input type="text" class="form-control" name="num" AUTOCOMPLETE="off" required
                       placeholder="请填写">
            </div>
            <div class="form-group">
                <label>是否可采购</label>
                <select class="form-control" name="is_buy" required>
                    <option value="0" selected>可采购</option>
                    <option value="1">不可采购</option>
                </select>
            </div>

            <button type="submit" class="btn btn-success "><i class="fa fa-check"> 确认</i></button>
        </form>

    </div>
</div>
</div>

