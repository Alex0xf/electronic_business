<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css" >
<!--面包屑-->
<blockquote class="layui-elem-quote">
    <%-- <span class="layui-breadcrumb">--%>
    <a href="">商品与赠品管理</a>
    <a href="">商品管理</a>
    <a href="">一类商品列表</a>
    <a><cite>一类商品详情</cite></a>
</blockquote>
<div class="col-md-2"></div>
<div class="col-md-6">
    <!-- 创建一类商品表单 -->
    <div class="ibox-content">
        <div class="table-responsive">

            <form action='goods/first_goods?jumpPage=show_goods' method="post"  >
                <div class="form-group">
                    <label>档案编码</label>
                    <input type="text" class="form-control" name="product_id" readonly="readonly" value="${firstGoods.id}">
                </div>
                <div class="form-group">
                    <label>基础库-分类</label>
                    <input type="text" class="form-control" name="product_typeName" readonly="readonly" AUTOCOMPLETE="off" value="${firstGoods.firstProduct.typeName}">
                </div>
                <div class="form-group">
                    <label>基础库-品牌</label>
                    <input type="text" class="form-control" name="product_goodsBrand_brandName" readonly="readonly"  AUTOCOMPLETE="off" value="${firstGoods.firstProduct.goodsBrand.brandName}">
                </div>
                <div class="form-group">
                    <label>基础库-型号</label>
                    <input type="text" class="form-control" name="product_type" readonly="readonly"  value="${firstGoods.firstProduct.type}">
                </div>

                <div class="form-group">
                    <label>基础库-颜色</label>
                    <input type="text" class="form-control" name="product_color" readonly="readonly" value="${firstGoods.firstProduct.color}">
                </div>
                <div class="form-group">
                    <label>商品名称</label>
                    <input type="text" class="form-control" name="goods_name" readonly="readonly" value="${firstGoods.goodsName}">
                </div>


                <div class="form-group">
                    <label>采购价</label>
                    <input type="text" class="form-control" name="buy_price"  readonly="readonly" value="${firstGoods.buyPrice}">
                </div>
                <div class="form-group">
                    <label>市场价</label>
                    <input type="text" class="form-control" name="market_price" readonly="readonly" value="${firstGoods.marketPrice}">
                </div>
                <div class="form-group">
                    <label>商城价</label>
                    <input type="text" class="form-control" name="sales_price" readonly="readonly" value="${firstGoods.salesPrice}">
                </div>
                <div class="form-group">
                    <label>最低库存量</label>
                    <input type="text" class="form-control" name="num" readonly="readonly" value="${firstGoods.num}">
                </div>
                <div class="form-group">
                    <label>是否可采购</label>
                   <h1>
                       <input type="text" class="form-control" name="num" readonly="readonly" value="<c:if test="${firstGoods.isBuy==0}">可采购</c:if><c:if test="${firstGoods.isBuy!=0}">不可采购</c:if>
                    ">
                   </h1>
                </div>

                <button type="submit" class="btn btn-success "><i class="fa fa-check">返回</i></button>
            </form>

        </div>
    </div>
</div>

